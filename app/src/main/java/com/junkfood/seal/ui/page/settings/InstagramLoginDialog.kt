package com.junkfood.seal.ui.page.settings

import android.annotation.SuppressLint
import android.net.Uri
import android.webkit.CookieManager
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.util.AtomicFile
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.junkfood.seal.util.GalleryDlConfig

@SuppressLint("SetJavaScriptEnabled")
@Composable
internal fun InstagramLoginDialog(onDismiss: () -> Unit, onSaved: () -> Unit) {
    val context = LocalContext.current
    val manager = remember { CookieManager.getInstance() }
    var browser by remember { mutableStateOf<WebView?>(null) }
    var error by remember { mutableStateOf(false) }
    DisposableEffect(Unit) {
        onDispose { browser?.stopLoading(); browser?.destroy() }
    }
    Dialog(onDismissRequest = onDismiss, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {
                Text("Sign in to Instagram", style = MaterialTheme.typography.titleLarge)
                Text("Sign in on Instagram, then save your session on this device.")
                AndroidView(
                    modifier = Modifier.weight(1f).fillMaxWidth(),
                    factory = { ctx ->
                        WebView(ctx).apply {
                            browser = this
                            manager.setAcceptCookie(true)
                            settings.javaScriptEnabled = true
                            settings.domStorageEnabled = true
                            settings.allowFileAccess = false
                            settings.allowContentAccess = false
                            settings.mixedContentMode = WebSettings.MIXED_CONTENT_NEVER_ALLOW
                            webViewClient = object : WebViewClient() {
                                override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                                    val uri = request.url
                                    return uri.scheme != "https" || uri.host !in setOf("instagram.com", "www.instagram.com")
                                }
                            }
                            loadUrl("https://www.instagram.com/accounts/login/")
                        }
                    },
                )
                if (error) Text("No usable session found or save failed. Finish signing in and try again.", color = MaterialTheme.colorScheme.error)
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedButton(onClick = onDismiss) { Text("Cancel") }
                    Button(onClick = {
                        val saved = runCatching {
                            manager.flush()
                            val cookies = manager.getCookie("https://www.instagram.com/").orEmpty()
                                .split(';').mapNotNull { part ->
                                    val name = part.substringBefore('=').trim()
                                    val value = part.substringAfter('=', "").trim()
                                    if (!name.matches(Regex("[A-Za-z0-9_-]+")) || value.any { it == '\t' || it == '\n' || it == '\r' }) null
                                    else name to value
                                }.toMap()
                            check(!cookies["sessionid"].isNullOrBlank())
                            val target = GalleryDlConfig.prepare(context).cookiesFile
                            val retained = if (target.isFile) target.readLines().filter { line ->
                                val domain = line.substringBefore('\t').removePrefix("#HttpOnly_").trimStart('.')
                                !line.startsWith("# Netscape") && domain.lowercase() !in setOf("instagram.com", "www.instagram.com")
                            } else emptyList()
                            val rows = cookies.map { (name, value) ->
                                ".instagram.com\tTRUE\t/\tTRUE\t\t$name\t$value"
                            }
                            val atomic = AtomicFile(target)
                            val stream = atomic.startWrite()
                            try {
                                stream.write((listOf("# Netscape HTTP Cookie File") + retained + rows).joinToString("\n", postfix = "\n").toByteArray())
                                atomic.finishWrite(stream)
                            } catch (e: Exception) {
                                atomic.failWrite(stream)
                                throw e
                            }
                        }.isSuccess
                        if (saved) onSaved() else error = true
                    }) { Text("Save session") }
                }
            }
        }
    }
}
