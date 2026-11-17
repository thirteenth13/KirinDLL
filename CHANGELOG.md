# Changelog

All notable changes (starting from v1.7.3) to stable releases will be documented in this file.

<!-- KIRIN-AUTO-CHANGELOG:START -->
## 2026-11-17

### ✦ Recent changes

- ci: require shared signing key for distributed debug APKs (`7746006e`)
- ui: report neutral Instagram profile extractor name (`7eb7dfb3`)
- ui: keep Instagram engine implementation invisible to users (`730a0326`)

## 2026-11-15

### ✦ Recent changes

- ci(build): request v3.2.2 stable test APK (`baeb1136`)
- ci(test): run download regressions before stable APK build (`077e90dc`)
- docs(release): place update date below prepared date (`7aa74b6c`)
- docs(release): add v3.2.2 release notes update date (`1db6cd75`)
- docs(release): complete v3.2.2 Bilibili release notes (`f55b3bdf`)
- docs: update v3.2.2 release notes for Bilibili completion fix (`3e32aaa8`)
- docs(release): document Bilibili download reliability fix (`91224e58`)
- ci(android): run generic debug unit tests on pull requests (`4e16f2da`)
- fix(download): let local Bilibili merge finish during network loss (`fe04810e`)
- fix(download): identify local post-processing stages (`f68917f5`)
- test(download): cover local post-processing network pause guard (`f54d04c3`)

## 2026-11-14

### ✦ Recent changes

- ci: sign prerelease consistently and increase Android versionCode on each run (`32553ed5`)
- build: sign debug with shared key when available and increment prerelease versionCode (`58672694`)
- ui: show Instaloader profile preview status and gallery fallback explicitly (`c5768ca9`)
- ci: stage and verify arm64-v8a APK instead of universal APK (`16b4a328`)
- ci: stage and verify arm64-v8a APK instead of universal APK (`a7f24756`)
- build: restrict native Android packages to arm64-v8a only (`7ccbe36d`)
- feat(instagram): use Instaloader for profile preflight with gallery-dl fallback (`21c5b3cd`)
- feat(instagram): add bounded Instaloader profile preview bridge (`1267fddd`)
- build: bundle Instaloader as optional Instagram engine via Chaquopy (`e959e13b`)
- test(instagram): verify profile routing excludes posts and unsafe URLs (`7c11a066`)
- feat(instagram): classify profile URLs for gallery routing (`aa050c71`)
- feat(instagram): route profile URLs from Home to gallery-dl instead of broken yt-dlp (`a17f9b5b`)
- feat(instagram): map gallery media previews to selectable post permalinks (`a8e1d883`)
- ci: validate prerelease APK suffix against tag without stale base version (`d4bdfc89`)
- ci: use configured ANDROID signing secrets for release workflows (`5f40cbd8`)
- ci: use configured ANDROID signing secrets for release workflows (`23c85813`)
- ci: build and test main pushes; upload debug APK artifact (`be6aa25e`)
- fix(instagram): clear post selection when source URL changes (`4f3a1339`)
- feat(gallery): expand bounded profile preview to 60 entries (`96915be5`)
- feat(instagram): show selectable preview post grid and queue selected URLs (`41dcdd2e`)
- test(instagram): cover URL normalization and post selection (`9d82d4a6`)
- feat(instagram): add safe post URL selection model (`26792697`)

## 2026-11-12

### ✦ Recent changes

- docs(changelog): record startup update popup for next release (`b1da1009`)
- feat(update): wire standalone popup into app startup (`b8bf8bb1`)
- feat(update): add standalone startup update popup (`c8104eae`)
- Add custom title for KirinDL workflow runs (`dda49c23`)

## 2026-11-11

### ✦ Recent changes

- ci: default manual releases to published pre-release (`33a29d8a`)
- ci: make workflow notes input informational only (`312adc7e`)
- fix(ci): normalize manual release note line breaks (`eee83a2d`)
- fix(ci): add release heading to custom notes (`9efc5fa3`)
- fix(ci): write manual release notes with real newlines (`7e613ce6`)
- ci: allow optional manual release notes (`b0ead245`)
- fix(profiles): preserve legacy custom slot audio state (`422f607b`)
- docs(profiles): clarify custom profile payload compatibility (`6a86bd4b`)
- docs(release): document expanded audio profiles in v3.2.1 (`e3a112cf`)
- ui(profiles): group video and audio download profiles (`117e70af`)
- fix(audio): apply bitrate and conversion presets (`940e3ea8`)
- feat(profiles): expand and balance audio presets (`2d54636e`)
- docs(release): remove superseded v3.2.0.13 release notes (`33e32514`)
- docs(release): add KirinDL v3.2.1 release notes (`7a0f0387`)
- chore(version): sync Android version code for v3.2.1 (`da64aa3b`)
- chore(version): set KirinDL release to v3.2.1 (`52561c63`)
- chore(version): sync Android version code for v3.2.0.13 (`97b7cad6`)
- chore(version): bump KirinDL to v3.2.0.13 (`a4d46471`)
- docs(release): add KirinDL v3.2.0.13 release notes (`b8dd103f`)
- Organize More Tools into Video and Gallery dropdowns (`e19ab94c`)
- Use outlined box style for Kirin Search Play button (`bf842d03`)
- Format Kirin Search result action layout (`41d1d8ad`)
- Fix Kirin Search Play button layout (`540dedf1`)

## 2026-10-26

### ✦ Recent changes

- docs: organize KirinDL README sections into dropdowns (`6ae14c10`)

## 2026-10-18

### ✦ Recent changes

- docs(i18n): refresh KirinDL translated READMEs and add Malay/index (`cbb14b6b`)

## 2026-10-14

### ✦ Recent changes

- fix(custom): pair video with audio and preserve container preferences (`7448b2fc`)
- docs(release): align v3.2.0.11 notes with Latest and verified tests (`4a4e0116`)

## 2026-10-13

### ✦ Recent changes

- fix(ci): install FFmpeg for Bilibili transfer regression tests (`59732610`)
- fix(bilibili): recover interrupted streams through API-provided mirrors (`793e21e0`)

## 2026-10-08

### ✦ Recent changes

- fix(about): restore v3.2.0.4 release notes cards for v3.2.0.10 (`06c3eca1`)
- fix: use canonical media container types and retain custom title directories (`006925fc`)
- fix: normalize media MIME aliases and isolate Android file-provider tests (`e9de5825`)
- fix: open completed media locally with explicit type and read access (`3f3c67f7`)
- fix: restore original About and reconnect YouTube session settings (`8d6b703c`)
- fix(ci): enable release unit-test tasks under AGP 9 (`270144f8`)
- fix(release): skip missing tags before syncing descriptions [skip ci] (`a833407e`)
- fix(youtube): add bounded playback recovery and preserve HttpOnly login cookies (`dfa22ff9`)
- fix(youtube): handle stale cookies safely and explain account verification errors [skip ci] (`087d80ef`)
- docs(release): keep v3.2.0.6 notes focused on Android app changes (`6420eed7`)
- fix(release): use app-only notes and sync edited release descriptions [skip ci] (`8bccb1a6`)
- Release KirinDL v3.2.0.6 Pre-release: startup crash diagnostics and About cleanup (`d49b493d`)
- fix(startup): preserve interrupted-launch breadcrumbs for native crashes [skip ci] (`7ca2e661`)
- fix(startup): guard early initialization and retain copyable crash diagnostics [skip ci] (`70987423`)
- Restore app source v3.2.0.3 and limit About to Tools, Stable, Pre-release [skip ci] (`18d87f11`)
- fix(format): keep Audio and Video preferences editable [skip ci] (`6409e30c`)
- feat(pages): add KirinDL browser favicon on all pages [skip ci] (`dd545350`)
- fix(pages): constrain counter SVGs and bypass stale CSS/JS caches [skip ci] (`b6ea1af3`)
- feat(pages): show live download, fork and star counters [skip ci] (`0c8f0d1a`)
- Create KirinDL Pages and archive SealPlus site data [skip ci] (`6462aa0c`)
- Set KirinDL v3.2.0.5 version code [skip ci] (`cdeb4990`)
- Bump KirinDL source to v3.2.0.5 [skip ci] (`7a2ce61f`)
- Make first-launch updater migration non-fatal [skip ci] (`07451b7e`)
- Harden pre-engine startup crash path [skip ci] (`d272e5a0`)

## 2026-10-07

### ✦ Recent changes

- Set KirinDL v3.2.0.4 version code (`4a04b3da`)
- Bump KirinDL source to v3.2.0.4 (`550e184a`)
- Remove unused runtime version BuildConfig labels (`22222141`)
- Fix Engine Update Center cleanup syntax (`e865e28e`)
- Keep only yt-dlp and gallery-dl in Engine Update Center (`99dcd267`)
- Set KirinDL v3.2.0.3 version code (`3d8526d6`)
- Bump KirinDL source to v3.2.0.3 (`a90100b9`)
- Support moving a Stable release back to Pre-release (`f1d29592`)
- Remove duplicate app update cache implementation (`ed893b14`)
- Restore cached update alert before cooldown checks (`60fc50b5`)
- Persist available app updates across launches (`bff9e988`)
- Restore persistent update alert before cooldown (`85b920a7`)
- Persist available app update across launches (`6bdcc3b9`)
- Harden first launch engine initialization (`256de36b`)
- Clarify remote and local clip tool labels (`bd6b4413`)
- Add app update notification toggle (`8ca93774`)
- Replace About update checker with release note popups (`2f316c69`)
- Add persistent Morphe-style app update alert (`b1ca48aa`)
- Move automatic app updates to persistent home alerts (`fba5b611`)
- Add dedicated app update notifications (`1b9d0831`)
- Expose persistent app update state and release notes (`3feef2a0`)
- Add app update notification preference (`737c810a`)
- Resolve release channel from trigger commit reliably (`c2e43054`)
- Fix automatic update timestamp preference import (`fe54e9ec`)
- Fix Compose scoped weight usage (`f12af5eb`)
- Polish More Tools release notes (`9790dcf2`)
- Add split all chapters control (`d9f2b9fb`)
- Add cover artwork controls to metadata editor (`39f29e52`)
- Add playlist export serializers (`c082e99c`)
- Add playlist TXT JSON and M3U export (`5990a7db`)
- Add efficient split-all-chapters engine (`4c41cd58`)
- Add artwork editing and named chapter clips (`ef862594`)
- Document new More Tools utilities (`003832f9`)
- Harden playlist selection state handling (`5501f106`)
- Initialize bundled FFmpeg for utility tools (`fc92ea21`)
- Fix Compose weight import in utility tools (`18a58610`)
- Expose five new utilities in More Tools (`9a34e5c8`)
- Add labels for new More Tools utilities (`e3d96d1e`)
- Add five functional More Tools pages (`ce528603`)
- Add shared engine for new More Tools utilities (`f28bd565`)
- Chain Pre-release notes from the previous published release (`422ae697`)
- Base release notes on latest Stable commits (`8d8fcb99`)
- Generate notes for every Stable and Pre-release publish (`d843430a`)
- Support safe Stable and Pre-release channel transitions (`64e5bff0`)
- Collapse legacy SealPlus changelog without removing history (`7e4279b5`)
- Document subtitle source and language controls (`a3aaa89a`)
- Prevent conflicting subtitle source settings (`9506d731`)
- Add Original Selected and All subtitle language modes (`56ca3167`)
- Clarify subtitle sources and language mode UI (`57d9f48c`)
- Separate original and automatic subtitle download logic (`23e7b0f0`)
- Add subtitle source and language mode preferences (`365a6b24`)
- Document collapsible runtime engine slots (`4392af70`)
- Add collapsible bundled runtime engine slots (`579681bc`)
- Expose bundled runtime versions to Engine Update Center (`3f728e6e`)
- Document custom Gallery DL appearance color (`8ed4a5ea`)
- Apply custom Gallery DL accent color (`a9d55a1e`)
- Add custom color editor to Gallery DL appearance (`d6677be9`)
- Add custom Gallery DL accent preference (`7cd368ac`)
- Keep v3.2.0.2 notes focused on updater and progress (`dcdcde60`)
- Prepare KirinDL v3.2.0.2 prerelease notes (`d0dc2ba9`)
- Add dedicated Stable and Pre-release release channels (`66496bcc`)
- Set KirinDL v3.2.0.2 version code (`2cbf426b`)
- Bump KirinDL source to v3.2.0.2 (`cee6d69d`)
- Use version-aware automatic update cooldown (`901fe04e`)
- Make app update checks version and channel aware (`2ed79da7`)

## 2026-10-05

### ✦ Recent changes

- Remove stale Bilibili smart profile references (`121f7589`)
- Document Media progress stability fix (`1b164ab3`)
- Show guarded Media transfer phases correctly (`599b2d3f`)
- Stabilize and speed up Media progress updates (`52fdb9f0`)
- Document Bilibili profile rollback in v3.2.0.1 (`365bdc7e`)
- Remove legacy Bilibili speed preferences (`ce3ddbdc`)
- Remove unused Bilibili speed settings (`71e6358a`)
- Remove Bilibili short-link special routing (`d43a4001`)
- Remove dedicated Bilibili download profile (`bd2718e4`)
- Prepare KirinDL v3.2.0.1 hotfix notes (`5918fe29`)
- Add install-ready fallback for app updates (`071fd13d`)
- Polish app update release notes popup (`97a30c70`)
- Use Download Manager from manual app update checks (`3a413a78`)
- Refresh auto update checks after app upgrades (`4b89f27c`)
- Resume app update installer after permission (`7d0097c3`)
- Sync updater state after app version changes (`96b4a16b`)
- Enable package installer handoff for app updates (`0520b719`)
- Add app update download completion receiver (`520d66fd`)
- Fix app update versioning and install handoff (`6d98c02e`)
- Expand v3.2.0 upgrade and fallback notes (`41f156f9`)
- Remove superseded v3.1.9.2 release notes (`3e880cac`)
- Prepare KirinDL v3.2.0 release notes (`069ab355`)
- Support v3.2.0 Stable version jumps (`61f80ad0`)
- Set KirinDL v3.2.0 version code (`3ac7ca7d`)
- Bump KirinDL to v3.2.0 (`ef9cc15e`)
- Update v3.1.9.2 notes for Expert Config and Audio (`4b1fcc9f`)
- Polish Expert Config runner wiring (`672a6daa`)
- Apply Gallery Expert Config only when enabled (`616a38cb`)
- Add Expert Config enable toggle (`6f42011f`)
- Unlock yt-dlp audio format settings (`5a524cb0`)
- Keep Gallery export filters media-only (`c0241464`)
- Add Expert Config toggle and audio export filter (`1660c125`)
- Update v3.1.9.2 notes for export filter popup (`b381cf7d`)
- Move Gallery media export filter into popup (`69bd60d2`)
- Add KirinDL v3.1.9.2 release notes (`185ff7f5`)
- Restore Bilibili short-link routing (`03ebdc0f`)
- Restore dedicated Bilibili download profile (`eb65541c`)
- Harden Download All preflight count handling (`3bfc0440`)
- Run collection downloads in Download All mode (`c3105dde`)
- Add Download All mode for Gallery collections (`d33eff86`)
- Track collection mode in Gallery DL preflight (`bc9df686`)
- Expose Gallery DL collection mode in preflight (`a33dfb11`)
- Handle hentai source kinds in URL normalization (`a31d2a98`)
- Use Gallery DL for hentai manga feed sources (`30d6f9eb`)
- Route hentai manga collection links through Gallery DL (`2fa0b77e`)
- Expand hentai manga collection metadata (`d110705b`)
- Classify hentai manga artist and publisher sources (`8edf9820`)
- Add hentai manga collection source kinds (`18347eb9`)
- Use compact popup grid for Gallery DL themes (`62bc6d2d`)
- Use integer phase progress in Media cards (`67bc6229`)
- Simplify Gallery DL Codeberg source label (`afbd80d4`)

## 2026-10-02

### ✦ Recent changes

- Add KirinDL v3.1.9.1 release notes (`1e268e96`)
- Prepare Stable revision releases such as v3.1.9.1 (`b35421d2`)
- Support four-part Stable version names (`2d8000d3`)
- Limit Media temp path to active tasks (`57a286a6`)
- Show temp path below Media cards (`dbc65053`)
- Move Media progress into download status badge (`9bb7bcfc`)
- Shorten KirinDL README (`056496e5`)
- Publish Stable releases with all APK architectures (`7349fb03`)
- Rename v3.1.8.1 release notes to v3.1.9 (`298271b7`)
- Add KirinDL v3.1.9 release notes (`f3f22e91`)
- Restore Stable release output after artifact testing (`813b0e54`)
- Trigger KirinDL Stable Test artifact (`a430b2f0`)
- Remove duplicate Stable Test workflow (`94c67ab5`)
- Trigger pending stable test cancellation (`a61af59c`)
- Add one-shot pending stable test canceller (`fd51aac7`)
- Trigger duplicate run cancellation (`bc7b61ae`)
- Add one-shot duplicate run canceller (`8d11dca8`)
- Trigger stable artifact test (`868db8e4`)
- Add one-shot stable artifact dispatcher (`145075f5`)
- Wire Media card progress to live download state (`87ab73f6`)
- Add phase-aware progress to every Media queue card (`bd78b429`)
- Refresh legacy Global Feed thumbnail caches (`1092db1b`)
- Render thumbnails for all Global Feed queue previews (`6b4af20b`)
- Trigger Stable artifact build (`900f505f`)
- Add one-shot stable artifact dispatcher (`18f85eb8`)
- Keep Stable artifact to Universal APK for one day (`8a93a41f`)

## 2026-10-01

### ✦ Recent changes

- Run KirinDL Stable Test (`3a81e4f1`)
- Add dedicated Stable Test workflow (`d9e0642b`)
- Restore Pre-Release as notes-only release with artifact APK (`cee1f476`)
- Restore normal Stable and Pre-Release build types (`a15cfabb`)
- Remove Stable Test trigger marker (`f66ee687`)
- Remove one-shot Stable Test dispatcher (`99d5ed44`)
- Trigger Stable Test build (`26b0372f`)
- Add one-shot Stable Test dispatcher (`8510442a`)
- Keep Stable Test staging compatible with current Gradle version logic (`29887d74`)
- Restore transfer progress display (`e6e74f98`)
- Remove obsolete pre-release asset publisher (`2135e95f`)
- Add isolated Stable Test artifact workflow (`0ea6f992`)
- Keep pre-release APK in Actions artifact and publish notes only (`6ff2f6fe`)
- Publish Pre-Release as direct APK without Actions artifact ZIP (`01d6a780`)
- Restore Stable release workflow unchanged (`da1a9ae3`)
- Publish test builds as direct APK release assets (`3eb227a4`)
- Add one-shot devpatch23 publish dispatcher (`f77e5c82`)
- Update publish-only defaults for devpatch23 isolation build (`97ccc5c8`)
- Add one-shot devpatch23 dispatcher (`1498364c`)
- Temporarily remove transfer progress to isolate download failure (`8ccb1475`)
- Restore publish-only workflow to manual dispatch (`0fb948e2`)
- Prepare publish-only devpatch22 recovery (`e5acbbc4`)
- Test pre-release with exact stable package identity (`d2d500cd`)
- Use stable package identity for release-signed pre-release builds (`cbbf0c41`)
- Revert disproven pre-release storage permission test (`7824bdd1`)
- Restore publish-only workflow to manual dispatch (`02227903`)
- Prepare publish-only devpatch21 recovery (`c67ef5a8`)
- Prepare devpatch21 storage-permission test (`867a2a12`)
- Request legacy storage permission before first download (`16211a6d`)
- Restore publish-only workflow to manual dispatch (`d6938c6d`)
- Prepare publish-only devpatch20 recovery (`e209760f`)
- Temporarily re-enable devpatch20 trigger (`6c5d8490`)
- Accept current apksigner certificate output format (`690d9be3`)
- Temporarily enable devpatch20 pre-release trigger (`27e8956a`)
- Fix pre-release to use stable release build mechanics (`c0dc287a`)
- Build pre-release through the stable Release variant (`a25ed946`)
- Restore yt-dlp transfer progress display (`444e8c29`)
- Remove stable test trigger marker (`3090b08e`)
- Remove one-shot stable test dispatcher (`daf04377`)
- Trigger stable comparison build (`425a33d3`)
- Add one-shot stable test dispatcher (`a170e880`)
- Remove experimental transfer progress display (`3582300c`)
- Restore publish-only workflow to manual dispatch (`d96bf95f`)
- Note publish-only reuse of verified devpatch19 artifact (`a02f1392`)
- Use release note update as one-shot publish trigger (`3398459b`)
- Temporarily enable publish-only trigger for devpatch19 (`ad1fc45f`)
- Add publish-only flow for verified pre-release artifact (`cfd66f0d`)
- Prepare artifact-backed devpatch19 pre-release test (`70c1681c`)

## 2026-09-30

### ✦ Recent changes

- Restore pre-release APK artifact backup (`c357deac`)
- Remove one-shot Kirin pre-release dispatch marker (`0a66ec6d`)
- Remove one-shot Kirin pre-release dispatcher (`db24691a`)
- Dispatch v3.1.8-devpatch19 (`8cd2c8fb`)
- Add one-shot dispatcher for Kirin pre-release test (`c161edb6`)
- Temporarily enable devpatch19 trigger (`958fc804`)
- Use proven release action for manual pre-release publishing (`09933c8e`)
- Temporarily enable pre-release trigger for devpatch19 test (`e7499246`)
- Stop duplicating pre-release APK in Actions artifacts (`03687525`)

## 2026-09-29

### ✦ Recent changes

- Document restored transfer progress display (`51f847d1`)
- Restore yt-dlp transfer progress display (`b59cd03a`)
- Align v3.1.8.1 release notes with restored pre-release flow (`2e426963`)
- Restore pre-20-Sep Kirin pre-release build flow (`a931fd9a`)
- Finalize v3.1.8.1 notes for UI and history fixes only (`30636379`)
- Prepare final hotfix pre-release without downloader overrides (`6d8dc92d`)
- Keep hotfix pre-releases on stable v3.1.8 base (`32dea543`)
- Document stable v3.1.8 download task pin (`19db3a84`)
- Pin pre-release download task source to stable v3.1.8 (`2c630ad7`)
- Document removal of failing progress experiment (`cdcaed4f`)
- Revert experimental yt-dlp progress UI (`186f36c7`)
- Document Global Feed search paging and yt-dlp progress experiment (`a2066729`)
- Add UI-only yt-dlp transfer phase experiment (`d9471bb0`)
- Add Gallery URL image preview under check controls (`492abca2`)
- Add Kirin Search paging and play actions (`21fea2a5`)
- Polish Global Feed navigation and media actions (`b8bf7f21`)
- Add v3.1.8.1 hotfix release notes (`be74d247`)
- Clear completed Gallery records from Download Center (`0a32f1b4`)
- Fix clearing completed Gallery DL activity (`425a9729`)

## 2026-09-27

### ✦ Recent changes

- Label auto changelog with latest stable version (`0498af7e`)
- Fix README pre-release badge version filtering (`232212b9`)
- Remove workflow status badge from README (`62192fbd`)
- Add KirinDL pre-release version badge (`c69c5fb5`)
- Remove unintended in-app pre-release badge (`4b0b8ebb`)
- Add pre-release version badge beside KirinDL branding (`17960f0f`)
- Allow manual and connector stable release runs (`df217f69`)
- Update v3.1.8 release notes with final fixes (`f1587716`)
- Fix installed yt-dlp version detection (`c50d4a93`)
- Restore devpatch11 downloader source exactly (`dadf3041`)

## 2026-09-26

### ✦ Recent changes

- Allow manual and connector pre-release runs (`4732c1b6`)
- Use proven release action for Kirin pre-release publishing (`20c342f6`)
- Restore Kirin pre-release workflow after APK export (`91a903c0`)
- Restore devpatch12 download state handling (`2f7651cb`)
- Delete README-RELEASE-NOTES-PATCH.txt (`52b39227`)
- Fix Again (`b23a3cdb`)
- Fix (`bff80052`)
- Test App Version 3.1.8 (`c5bb2aa9`)
- Update and rename v3.1.9.md to v3.1.8.md (`1cd030b5`)
- Refactor ActionSheet.kt for improved readability (`fd10c226`)

## 2026-09-25

### ✦ Recent changes

- Delete (`c239d574`)
- Fix (`d8643a53`)
- Refactor imports and update download state handling (`f4873e12`)
- Refactor ActionSheet.kt for improved readability (`75a30796`)
- Refactor ActionSheet.kt for better readability (`ba2b0bb8`)
- Update ActionSheet.kt (`a8d79b74`)
- Update codec summary text formatting (`a67cd00d`)
- Change preferredCodec and preferredContainer to null (`77804ea4`)
- Change preferredCodec initialization to null (`62b0543f`)
- Disable speed and ETA parsing in NewHomePage.kt (`fc5985c2`)
- Comment out codec and URL handling logic (`260011ab`)

## 2026-09-22

### ✦ Recent changes

- Reset (`b3204ec5`)
- Reset (`3f702e24`)
- Refactor build.gradle.kts: clean up comments and update versionCode (`dcf5dc86`)
- New Version (`653c69c6`)

## 2026-09-21

### ✦ Recent changes

- Hotfix again (`f964e208`)
- Hotfix (`812b1f63`)
- Hotfix (`45c6aa17`)
- Hotfix (`bdf99953`)
- Hotfix (`c1b46737`)
- Hotfix (`240b5249`)
- fix (`f6b6535b`)
- Fix Problem Download and Bring back old version (`0df57e49`)
- New Patch (`166b4278`)
- Remove PoToken (`605d9186`)
- Hotfix (`652fb816`)
- Hotfix Download Error (`46a1195f`)
- KirinDL: Download Center & Paste/Autofill Fix (`3d57c630`)

## 2026-09-20

### ✦ Recent changes

- Update release notes for version 3.1.7 (`642a0de4`)
- KirinDL Patch (`3fe61066`)
- New Version (`5be74733`)
- KirinDL Update (`77bea9d8`)
- Update release notes for KirinDL v3.1.6 (`ae9c3509`)
- New Version (`ddcca532`)
- New Patch (`0d3e66e4`)
- New Feature - Manga & Media Converter (`365be1cd`)
- KirinDL Patch (`7036f156`)

## 2026-09-19

### ✦ Recent changes

- SealPlus + YouTube PO Token (`d5266288`)

## 2026-09-18

### ✦ Recent changes

- KirinDL Patch (`4d29ea4e`)
- KirinDL (`19a27bac`)

## 2026-09-17

### ✦ Recent changes

- KirinDL Patch (`ea0e4852`)
- KirinDL Patch (`05249259`)
- KirinDL Patch (`9d97dcbc`)
- KirinDL Patch (`3fd3fa0b`)

## 2026-09-15

### ✦ Recent changes

- Rename project from KirinDownloader to KirinDL (`4d0dd979`)
- Modify contact page title and content (`1a0a8926`)
- Rename title and update HTML structure (`eb64fb7a`)
- Rename privacy page to KirinDL and update content (`20065834`)
- Update project name and include additional module (`5dd55012`)
- Revise support page for KirinDL branding (`c54015c2`)
- Hotfix (`c846a725`)
- KirinDL (`77d6c64e`)
- KirinDL Update (`403201f2`)

## 2026-09-13

### ✦ Recent changes

- KirinDL Update (`24c81f0a`)

## 2026-09-10

### ✦ Recent changes

- KirinDL Patch (`67c18296`)

## 2026-09-07

### ✦ Recent changes

- KirinDL Patch (`330cfddb`)
- Rename workflow for Kirin Pre-Release process (`e1b21daf`)

## 2026-09-06

### ✦ Recent changes

- Hotfix (`d7411bcf`)
- KirinDL Patch (`14bf400c`)
- KirinDL Update (`8aa76a51`)
- Add files via upload (`5dc3b873`)
- Add files via upload (`d7b12100`)

## 2026-09-05

### ✦ Recent changes

- Hotfix (`f2c9a370`)
- Add files via upload (`c0bc9ede`)
- Add files via upload (`9d858c35`)
- Hotfix (`b478803a`)
- KirinDL Patch (`36170710`)
- Add files via upload (`a8df62e4`)
- Add files via upload (`6e8e4b13`)
- KirinDL Patch (`8e1e9d47`)
- Enhance workflow with dev tag input and artifact handling (`c001ce69`)
- KirinDL Patch (`3ec1b666`)

## 2026-09-04

### ✦ Recent changes

- KirinDL Patch (`6d204323`)
- KirinDL Patch (`29b0c00f`)
- Add files via upload (`298b7754`)
- Add files via upload (`8b75df4a`)
- KirinDL Patch (`0ed0960a`)
- Add files via upload (`611079e7`)
- Add files via upload (`6d8eda7e`)
- KirinDL Patch (`fc58b438`)
- Add files via upload (`82a0dc4a`)

## 2026-09-03

### ✦ Recent changes

- Release Patch (`49ac47fb`)
- Release Patch (`4ace7b6b`)
- Release Patch (`ab65edc1`)
- Add files via upload (`9fa5e758`)
- Update (`6ebd7e52`)
- Hotfix (`d8f1fc38`)
- Update (`2269c87c`)
- KirinDL Patch (`1e0385e9`)
- Add files via upload (`d3de49d7`)
- Add files via upload (`292341b8`)
- KirinDL Patch (`c24bd570`)
- KirinDL Updates (`5dba718f`)
- KirinDL Update (`ff175d37`)
- Update GalleryDlPage.kt (`17a22ac6`)
- Kirin DL (`8fe8b6e7`)
- KirinDL Patch (`dbbb73ab`)

## 2026-09-02

### ✦ Recent changes

- KirinDL Patches (`cc8f0dfe`)

## 2026-09-01

### ✦ Recent changes

- Add downloads badge to README (`e9b9ed56`)
- KirinDL Patch Update (`e065dedc`)
- KirinDL Patch Update (`e777e8d7`)
- Generate SHA-256 checksum and update artifact upload (`7107d3da`)
- KirinDL Update Patch (`b3e0eee0`)
- Update CHANGELOG with KirinDL rebrand and new features (`0c67ce64`)
- Delete KIRIN-PATCH-NOTES.md (`60025628`)
- Add files via upload (`b1aefaa8`)
- KirinDL (`11de3c3f`)
- Rename KirinDownloader to KirinDL in workflow (`1eeb06bd`)
- Add files via upload (`243c16a8`)
- Update (`21e32316`)
- Add signing and verification steps for release APK (`c40ad903`)
- Add files via upload (`d968030b`)
- Add files via upload (`2b218e57`)
- Add files via upload (`be870a5e`)
- Add files via upload (`c3f2e14f`)
- Add files via upload (`c9d8ea73`)

## 2026-08-31

### ✦ Recent changes

- Add files via upload (`00f6da11`)
- Add files via upload (`99e024dd`)
- Add files via upload (`7755c35e`)
- Add files via upload (`6a9068a7`)
- Add files via upload (`47d575aa`)
- Add files via upload (`b9ee32c1`)
- Update installation source from PyPI to Codeberg (`e40124dc`)
- Switch gallery-dl installation source to Codeberg (`05a5f50d`)
- Update GitHub Actions to build debug ARM64 APK (`76735cc4`)
- Fix escape character in gallery_dl_engine_note (`5a3a5176`)
- Update build command to disable configuration cache (`92b61c70`)
- KirinDownloader rebrand and Gallery DL (`e966d8b5`)
- Add files via upload (`d352157d`)
- Add files via upload (`c9bc0451`)

## 2026-08-30

### ✦ Recent changes

- Revise README for KirinDownloader v3.0.0 release (`9f8cbc59`)
- Update GitHub release links in README.md (`7485ab3b`)
- Rename project from Seal Plus to KirinDownloader (`d9ede0a6`)
- Change app label to use string resource (`f3af5d4f`)

## 2026-08-29

### ✦ Recent changes

- Update URLs and adjust community card visibility (`6304b7a0`)
- Update repository owner and name in UpdateUtil (`d9fbe1c3`)
- Change APK output file name to KirinDownloader (`89c814e8`)
- Change applicationId from 'com.maheshtechnicals.sealplus' to 'com.kirin.downloader' (`e53ce45b`)
- Rename app from 'Seal Plus' to 'KirinDownloader' (`3cae885d`)
- Refactor build.gradle.kts with updated plugins and settings (`895211d6`)
- Add GitHub Actions workflow for Kirin build test (`ae33a009`)
- Clean up AndroidManifest and update app label (`574e28c2`)
- Refactor build.gradle.kts for Android project (`6064d5af`)

## 2026-08-22

### ✦ Recent changes

- feat: add Pablo Bonilla Paulino and Andrew Sidney Crump to sponsors list (`af187028`)

## 2026-08-08

### ✦ Recent changes

- fix(download): improve progress notification throttling to prevent UI unresponsiveness during custom command execution (`9c8d893a`)
- docs: fix star history chart embed with encrypted GitHub token (`851eb7e0`)
- fix(download): throttle progress callbacks to fix drawer unresponsiveness on OEM ROMs (`22fd7788`)

## 2026-08-03

### ✦ Recent changes

- chore: restrict apk artifacts access to maintainers in GitLab CI pipeline (`3008f333`)
- chore: set artifact access to private in gitlab-ci configuration (`54428ead`)

## 2026-08-02

### ✦ Recent changes

- refactor: improve update asset resolution, trigger file size refresh, and simplify download task cancellation (`1a2b93c4`)
- refactor: update Locale construction, optimize range check, and add Android Tiramisu support for intent resolution (`5f5d9373`)
- refactor: change likeCount type to Long and optimize SponsorUtil client and thumbnail validation logic (`5629b83d`)
- fix: improve app background authentication, sanitize cookie domain parsing, and resolve potential crash and lifecycle leaks (`a3dd6048`)
- fix: improve file creation, network validation, task state handling, URI navigation, and biometric authentication compatibility (`614dba61`)
- feat: add Trust Wallet deep link and QR code for crypto donations and update sponsor list URL to jsDelivr (`6938c7b0`)
- feat: add Kim Hyeung-Jin to sponsors list (`db379467`)

## 2026-07-30

### ✦ Recent changes

- feat: bump version to 3.0.0 (`21cfbc33`)
- feat: add Shahab Naei and ahmetyasinakturk to sponsors list (`880d80ee`)

## 2026-07-22

### ✦ Recent changes

- feat(format): Add layout toggle and selection summary to format page (`7f792728`)
- feat(ui): Enhance format preview and chip components with animations and customization (`4e4ba89c`)
- feat(download): Enhance download dialog UI with improved styling and animations (`2315964f`)

## 2026-07-20

### ✦ Recent changes

- feat(home): Fix battery optimization detection race and resize quick-access icons (`b9b49631`)
- feat(home): Add quick-access toolbar for more tools (`fc107497`)
- fix(home): Ensure battery optimization dialog re-prompts on every app resume (`28e25446`)
- feat(home): Remove battery dialog dismissal and cooldown logic (`55ffa075`)
- feat(home): Replace battery dialog dismissal with cooldown re-prompt (`689529ea`)
- fix(download): Handle foreground service start restriction on Android 12+ (`09c58632`)
- feat(home): Detect battery optimization setting regressions and re-arm dialog (`b576cefe`)
- feat(tools): Reorder tool list and improve file size formatting (`a4e08cd5`)
- feat(tools): Consolidate thumbnail and docs download to dedicated tool pages (`16b87085`)

## 2026-07-19

### ✦ Recent changes

- fix(ui): Apply horizontal padding to dialog body text and fix export button layout (`07a8d9f2`)
- feat(comments): Add video comment download and management tool (`cfaf81d0`)
- feat(tools): Add thumbnail download tool page (`10307ac9`)
- fix(download): Prevent downloads from stalling in Doze mode with wake lock (`ab71d419`)
- fix(download): Align domain dot prefix with includeSubdomains flag in cookies (`7584c845`)
- feat(ui): Fix pager height flicker and refactor tools grid layout (`08415a36`)
- feat(home): Add pruning of completed tasks from in-memory state map (`c947bf6a`)
- feat(home): Add Spotify-style swipeable download details sheet (`7fa503b0`)
- feat(tools): Add info dialogs and long-press interaction to tool cards (`815b0136`)
- feat(video-info): Add saved video metadata management and export functionality (`d737ef84`)

## 2026-07-18

### ✦ Recent changes

- Enhance tool descriptions for clarity and detail in More Tools section (`437ef5f1`)

## 2026-07-17

### ✦ Recent changes

- Remove badges, fix CI: add LaunchedEffect import (`27472c31`)
- Fix: counter bottom-right, Enter inserts newlines, remove unused imports (`1ecab69b`)
- Smooth animated color transitions via animateColorAsState (`a58fd53d`)
- Paste success animation, borderless selected cards, LaunchedEffect auto-reset (`0e80a72b`)
- Fix CI: mark segmentedColors helper as @Composable (`8f3a4964`)
- Replace custom segmented chips with M3 SegmentedButton, compact format card, lighter edit icon (`7a2f56c7`)
- Final refinements: dynamic counter color, haptic feedback, 44dp edit icon, softer borders, horizontal scroll chips, smaller badges (`64ba5a44`)
- Fix CI: remove contentPadding param not supported in this M3 version (`d9b9edab`)
- Final UI polish: 220dp URL input, 12 lines, line spacing, softer paste button, circular edit icon, ripple on chips, summary subtitle, elevated download CTA, animateContentSize on format card (`ff511970`)
- Polish UI: consistent 20dp radii, equal-width chips, filled paste button, trailing counter, softer selected state, removed divider (`840eeff1`)
- Fix CI: resolve background() type ambiguity with clip+then pattern (`79919827`)
- refactor: improve UI layout and spacing in Batch URL Import page (`a770ab41`)
- refactor: remove unused IconButton import in BatchUrlImportPage (`2ddbf741`)
- refactor: complete Batch URL Import page UX/UI redesign (`73446ee6`)
- fix: swap preferences before selectedType to avoid forward reference, add explicit Modifier cast (`d9375a34`)
- fix: resolve getBoolean and background overload compilation errors in BatchUrlImportPage (`ef732b39`)
- feat: enhance Batch URL Import page with improved UI components and quality selection options (`d34b12f3`)
- feat: enhance Batch URL Import page with video and audio quality selection options (`cca75569`)
- feat: add Batch URL Import feature and update More Tools page (`ff5e1915`)
- refactor: simplify background modifier logic in SectionHeader (`20b553e9`)
- feat: add More Tools page with additional utilities for downloads (`08ebad3b`)

## 2026-07-14

### ✦ Recent changes

- Refactor: Remove proxy-related features and settings (`1c6c978d`)
- refactor: remove multi-audio language selection and related options (`38f5945f`)
- feat: add new sponsors . (`c796a8ed`)

## 2026-07-13

### ✦ Recent changes

- feat: implement multi-audio language selection and improve format handling (`1aadb44c`)
- feat: add crypto donation support with dedicated page and update UPI details (`4e04cb14`)
- fix: update audio download options to handle selected audio type and format conversion (`2778410f`)

## 2026-07-10

### ✦ Recent changes

- feat: add multi-audio support with language selection and download options (`645e3560`)

## 2026-07-09

### ✦ Recent changes

- chore: update version to 2.9.0. (`0f6e5b74`)
- chore: update version to 2.9.0. (`ed054961`)
- refactor: simplify import cookies from file string in ManualCookieInputDialog (`3c19188b`)
- refactor: enhance ManualCookieInputDialog with format options and warning message (`a5d51c64`)
- refactor: add warning message for using personal cookies in ManualCookieInputDialog (`fe0f0f15`)

## 2026-07-08

### ✦ Recent changes

- refactor: update ManualCookieInputDialog layout to eliminate gaps and improve sizing behavior (`a29db4ff`)
- refactor: add wrapContentHeight import to improve layout handling in CookieProfilesPage (`dd8f8017`)
- refactor: enhance ManualCookieInputDialog for better layout and usability; update battery settings instructions for Xiaomi devices (`0a026465`)

## 2026-07-07

### ✦ Recent changes

- refactor: improve manual cookie input dialog and enhance cookie management logic (`92ce3ac2`)
- refactor: simplify comments and improve clarity in ManualCookieInputDialog (`9e9a9bd3`)
- refactor: add manual cookie input functionality and related UI components (`42a5018e`)
- refactor: implement anti-detection measures for Meta login pages in WebView (`1c93595a`)
- refactor: add anti-bot-detection script for WebView to improve compatibility with Meta's login pages (`7a8c9a65`)
- refactor: enhance cookie management and WebView handling for improved stability and performance (`86559dd9`)

## 2026-07-05

### ✦ Recent changes

- refactor: remove unused Cancel icon from ActionButtons and limit Text to one line (`c78c7eb3`)
- refactor: update battery optimization check to use a string constant for background operation (`c80da552`)
- refactor: enhance WebViewPage with improved loading state management and error handling (`2b7610e6`)
- refactor: enhance WebView settings for improved content access and user experience (`aa293916`)
- refactor: implement battery optimization handling and dialog dismissal logic (`adbba2d2`)
- refactor: streamline user agent string update in WebViewPage (`ce2f861f`)
- refactor: improve cookie management and lifecycle handling in CookieProfilePage and WebViewPage (`6683e5f8`)
- refactor: update sponsors list with new entries for Denis Cavic and Gonzalez German (`b518dab5`)

## 2026-06-15

### ✦ Recent changes

- refactor: add OutlinedButton and TextButton imports in DownloadDialogV2 (`a00d8a51`)
- refactor: enhance layout and styling in DownloadDialogV2 for improved user experience (`cec07356`)
- refactor: disable downloadDocs state initialization and remove related updates (`f2e8ab4b`)
- refactor: reset suggested format selection when download documents is toggled (`2481427f`)
- refactor: add network availability check to download conditions in FormatPage (`e95e2abd`)
- refactor: implement download documentation feature to save video metadata as text files (`d5e44463`)

## 2026-06-14

### ✦ Recent changes

- refactor: add DismissButton component import to NetworkSettingDialogs (`0aec296f`)
- refactor: update cookie handling to support HttpOnly and expiry checks (`29107464`)
- refactor: enhance multi-window support in WebView for improved login handling (`766b982c`)
- refactor: integrate OkHttp network fetcher for Coil 3 to enhance image loading (`e7bdcb7c`)
- refactor: implement multi-window support for WebView to handle login popups (`2b6b2caf`)
- refactor: add MP4-only filter option for format selection (`c4ec002b`)
- refactor: improve download resilience with enhanced retry and timeout settings (`36d22dff`)
- refactor: enhance download options with retry mechanisms and aria2c configuration (`c1abdb09`)

## 2026-06-11

### ✦ Recent changes

- chore: update version to 2.8.0. (`d0f04984`)
- refactor: redesign Settings and About screens with full-width LazyColumn layout (`8f65a988`)
- refactor: replace SettingItem with SettingsGridItem and SettingsGridSwitchItem in settings pages for improved layout (`37bd7a69`)

## 2026-06-09

### ✦ Recent changes

- chore: remove update.md (plan file no longer needed) (`ae4dba64`)
- chore: bulk dependency update (Gradle, AGP, AndroidX, Compose, Coil, Koin, ktfmt, MMKV) (`8c68aef4`)
- refactor: replace FlowRow with Row in multiple dialog components for layout consistency (`3b350953`)
- chore: upgrade to Gradle 9.4.1, Kotlin 2.3.21, Room 2.8.4 (`5416065d`)

## 2026-06-08

### ✦ Recent changes

- chore: update Android SDK and Gradle plugin versions across workflows and build files (`763c1068`)
- refactor: improve resource cleanup, fix LockScreen crash, and modernize utilities (`e9834d10`)

## 2026-06-03

### ✦ Recent changes

- Create CNAME (`cc7bcde9`)
- Delete CNAME (`a2e8d488`)

## 2026-06-02

### ✦ Recent changes

- chore(sponsors): add @devildog2621 to sponsors list (`a36a4ba4`)

## 2026-05-27

### ✦ Recent changes

- feat: update advertisement sections across multiple pages for consistency and improved monetization (`a0b77951`)
- feat: add advertisement sections and styles to multiple pages for enhanced monetization (`08e8b0e2`)
- feat: add installation steps, comparison table, and FAQ accordion styles for improved user guidance (`d6fe8494`)
- feat: enhance installation and comparison sections with new layout and checklist; update FAQ structure for better user guidance (`462fdfa8`)
- Update support page title and meta descriptions for clarity and SEO optimization; add download and FAQ links for user convenience. (`93bfdf02`)
- feat: enhance contact page with new highlights section and improved layout (`aede90e7`)

## 2026-05-26

### ✦ Recent changes

- feat: add advertisement sections and styles across multiple pages (`8a7b5b2d`)
- feat: add contact page and update navigation links across the site (`576c8dd7`)
- feat: add support page with donation options and update navigation links (`54f91a58`)
- feat: enhance sponsor modal layout and increase visible sponsor limit (`2b0b5e57`)

## 2026-05-22

### ✦ Recent changes

- release: bump version to 2.7.0 (`00de2946`)
- feat: update gradient colors for GitHub Sponsors button in SupportDeveloperPage (`6f62091c`)
- feat: add GitHub Sponsors donation option to SupportDeveloperPage (`18e7ccc0`)
- refactor: remove Buy Me a Coffee donation option from SupportDeveloperPage and update related constants (`6abc3efe`)

## 2026-05-21

### ✦ Recent changes

- feat: update database schema to version 8 and add videoId to DownloadedVideoInfo; enhance temp file deletion logic (`aa5b3684`)
- feat: add confirmation dialog for task deletion and update file deletion logic (`ad075ff0`)

## 2026-05-20

### ✦ Recent changes

- docs: add note about BrowserStack testing in README (`bbc0ff9b`)
- feat: add functionality to delete temporary files by base name (`460d92bc`)
- fix: improve network error handling in DownloaderV2 (`a3666e32`)
- fix: manage tasks waiting for network availability in DownloaderV2 (`99dc1d4b`)
- fix: add missing Job import in DownloaderV2.kt (`88208f86`)
- feat: implement network pause functionality and user-configurable delay (`969f8428`)
- fix: add new sponsor entry (`b9149e59`)
- fix: add new sponsor entry. (`adff1d39`)

## 2026-05-17

### ✦ Recent changes

- fix: improve APK version check and handle download progress edge cases (`b6387e78`)
- fix: add primary storage URI check and toast notification for unsupported directories (`138611d4`)
- fix: update sponsor method icon display and adjust icon tint in donation options (`74b28d67`)
- fix: add GitHub payment method icon and remove unused splash logos (`9e6cc264`)
- fix: update DonationOptionCard background color for improved visibility (`c496b06e`)
- fix: add payment method to sponsors and update UI to display icons (`e2826ae8`)
- fix: update donation options with new icons and images (`a997ff77`)
- fix: add new sponsor entry (`f3af2f32`)

## 2026-05-15

### ✦ Recent changes

- fix: remove unused audio conversion options from FormatPage (`6dcc7e13`)
- fix: update audio conversion format retrieval method (`f88e7d1f`)
- fix: add audio conversion options and update related UI components (`60a90079`)
- fix: add delete confirmation dialog for recent downloads (`d47ddeea`)
- fix: add new sponsor entry for Raxus (`262b71fd`)

## 2026-05-09

### ✦ Recent changes

- fix: add new sponsor entry. (`eee00a41`)

## 2026-04-29

### ✦ Recent changes

- fix: remove monochrome drawable reference from adaptive icons (`a4c776bf`)
- fix: update notification icon assets across multiple drawable densities (`fc2b7f4b`)
- fix: replace vector drawable with bitmap for notification icon and add new launcher icons (`d51d1156`)
- fix: replace vector drawables with PNG assets for launcher icons (`7875eb90`)

## 2026-04-28

### ✦ Recent changes

- fix: update drawable references in adaptive icons to use color and drawable resources (`ae0822d3`)

## 2026-04-27

### ✦ Recent changes

- release: bump version to 2.6.0 (`ec104c24`)

## 2026-04-20

### ✦ Recent changes

- fix: add missing imports for lifecycleScope and launch (`36b5ea8a`)
- fix: resolve 20 stability, security and correctness issues (`633ed792`)
- fix: use rememberPlainTooltipPositionProvider() for M3 1.3.1 stable (`4eacc05d`)
- fix: migrate compose UI to Material3 1.3.1 stable API (`00766e59`)
- fix: security hardening and quality improvements (`20cc78bf`)
- fix(manifest): set NotificationActionReceiver exported attribute to false (`3c4f4773`)
- feat(security): implement PBKDF2 for PIN hashing and add backup rules for sensitive data (`050c602f`)
- feat(sponsor): add data classes for social accounts and sponsorship details (`076289b9`)

## 2026-04-19

### ✦ Recent changes

- feat(sponsor): refactor sponsor data handling and update fetching logic (`f91dddd2`)

## 2026-04-14

### ✦ Recent changes

- feat(meta): update title, description, and keywords for Sealplus branding (`70145919`)
- fix(meta): update canonical and sitemap links to reflect new domain (`9d68fff2`)
- Create CNAME (`b2a736f5`)

## 2026-04-11

### ✦ Recent changes

- feat(robots): add robots.txt to manage web crawler access and include sitemap link (`fbf63637`)
- feat(sitemap): add sitemap.xml and link it in index and privacy pages (`27aeca87`)
- fix(meta): add Google site verification meta tag to index.html (`77015a4f`)

## 2026-04-07

### ✦ Recent changes

- fix(home): instantly sync Recent Downloads with DB deletions and file state (`744af089`)
- Change GitHub funding username to MaheshTechnicals (`256f8cb2`)

## 2026-04-06

### ✦ Recent changes

- chore: bump version to 2.5.0 and update all release files (`1cc16c65`)
- feat: update Turkish translation (mikropsoft:patch-1) (`33f10b06`)
- feat: add option to bypass SSL certificate checks in download settings (`a36858fa`)
- perf/feat: improve download engine reliability and UX (`0e999d8a`)
- fix: handle negative progress values in download state for better UI feedback (`c81ff573`)
- fix: correct escape characters in video and audio merge hints for localization (`236d06cf`)
- feat: enhance download progress handling with merging state detection (`92883984`)
- Add video and audio merge hints and download options in multiple languages (`f0a9488f`)
- feat: add support for merging audio and video formats with updated UI hints (`8300b6e3`)

## 2026-04-04

### ✦ Recent changes

- feat: enhance FormatItem layout with new sections for file size and bitrate details (`016f5fab`)

## 2026-04-03

### ✦ Recent changes

- feat: replace AsyncImage with Image for logo display in DownloadDialog (`9ec15634`)
- feat: replace Image with AsyncImage for improved image loading in DownloadDialog (`6d19ccb8`)
- feat: enhance loading state UI with image and progress indicator (`a464fe7b`)
- feat: enhance format selection UI and preferences (`a2f37833`)
- refactor: remove unused blur import from GradientDarkTheme (`c7e75e24`)
- refactor: remove unused imports across codebase (`3260b7d3`)
- refactor: clarify sponsor components and restore API models (`2f9b5735`)
- refactor: extract sponsors into dedicated page component (`3c91e141`)
- ux: optimize hidden content auth flow and add optimistic UI updates (`b3aa59db`)
- refactor: improve hidden content privacy with file relocation (`8ea1c052`)
- feat: implement hidden content management system (`87b074c4`)

## 2026-04-01

### ✦ Recent changes

- refactor: streamline DrawerHeader layout and enhance UI polish (`ce81ebfb`)

## 2026-03-28

### ✦ Recent changes

- refactor: clean up unused imports and improve download state handling logic (`f93c01d6`)
- feat: add new sponsor to sponsors list (`ce5276e1`)

## 2026-03-27

### ✦ Recent changes

- feat: add new sponsor and normalize sponsor names (`bdfc0ef6`)
- Complete Hebrew (עברית) translation - add 185 missing strings (#4) (`970551a0`)
- Add option to ignore SSL certificates for filtered networks (e.g. Netfree) (#3) (`6365abcb`)

## 2026-03-10

### ✦ Recent changes

- Release v2.4.0 - Premium Animations, Icon Theming & Share Intent (`ecfe4b36`)

## 2026-03-09

### ✦ Recent changes

- feat: add GradientCircularProgressIndicator and integrate into DownloadDialogV2 (`02845c18`)
- feat: update dark theme preference to always on (`3f3e4934`)
- feat: add typewriter and gradient animations to URL input placeholder (`f87b55ea`)
- feat: update NavigationDrawer to disable item selection state (`fe89b0b1`)
- feat: update splash logo for improved branding (`6dfa78c1`)
- feat: update splash logo for enhanced branding (`c3e1fe08`)
- feat: update app logo in DrawerHeader and adjust spacing for improved layout (`df8d229c`)
- feat: update logo in DrawerHeader and adjust glow effect in AnimatedGlowingPlus for improved aesthetics (`d0d24d48`)
- feat: add MaterialTheme import to UpdatePage, WebViewPage, and RemoveItemDialog for consistent theming (`624429b7`)
- feat: enhance DrawerHeader with logo, improved layout, and updated text styles for better branding (`1278642c`)
- feat: add animated glowing "+" to Seal+ branding for enhanced visual appeal (`70179afe`)
- Refactor icon tinting across various screens to use MaterialTheme color scheme (`08d5d332`)
- feat: update ExpandableTitle click behavior and icon toggle for better UX (`3a865869`)
- feat: update navigation routes by replacing SponsorsPage with SupportDeveloperPage in the donate route (`2e803de2`)
- feat: implement themed toast manager and replace standard toasts with themed toasts in relevant activities (`c11d6a13`)
- feat: reorganize navigation drawer items into groups for better clarity (`d34758c6`)
- feat: implement shared URL handling in MainActivity and DownloadDialogViewModel (`5e1f2ccb`)

## 2026-03-06

### ✦ Recent changes

- feat: enhance sponsor section with dynamic loading and improved layout (`e2415fd8`)
- feat: add new sponsor Jeremy Badillo to the sponsors list (`71da28d8`)

## 2026-03-04

### ✦ Recent changes

- Refactor code structure for improved readability and maintainability (`b1033824`)
- Remove unused CSS file `style.css` to streamline project assets and reduce load times. (`0e4e59a8`)

## 2026-03-03

### ✦ Recent changes

- fix: set release flag to true to enable publishing of releases (`ec6cff8c`)
- fix: set release flag to false to prevent publishing releases (`4318677e`)
- Fix website UI bugs (`1f03aa11`)
- Add SEAL PLUS dark gradient theme styles in style.css (`a3a62478`)
- Release v2.3.0 (`456cdd66`)
- fix: show clean resolution label on format cards instead of raw format string (`0ec13d2d`)
- feat: smart stream-merge routing based on platform (`ec226899`)

## 2026-03-02

### ✦ Recent changes

- feat(sponsor-dialog): open SupportDeveloperPage on Support Us tap (`84a5f314`)
- fix(sponsor-dialog): apply alpha animation via graphicsLayer, clean imports (`dbe8b3aa`)
- feat: periodic sponsor support dialog with schedule control (`0ce7244d`)
- fix(videolist): skip half-expanded state so drawer opens fully (`d09cef48`)
- feat(videolist): redesign VideoDetailDrawer with modern card-based layout (`130f09d3`)
- feat(home): show Download Time and Average Speed in Download Details dialog (`119cc70f`)
- feat(download-history): add Download Time and Average Speed to details dialog (`f723f944`)

## 2026-03-01

### ✦ Recent changes

- feat(settings): add Aria2c connections configuration and UI slider (`4a66186c`)
- fix(contact): update email address for developer contact information (`39241517`)
- added privacy.html (`473065b3`)

## 2026-02-27

### ✦ Recent changes

- fix(release): enable release publishing in configuration (`4ec9e89f`)
- fix(notification): update Telegram notification message formatting and emojis for improved clarity (`7951947b`)
- fix(notification): improve Telegram notification messages with emojis for better clarity (`c03b4fb7`)
- fix(notification): enhance Telegram message formatting for new release (`82e4191a`)
- fix(release): disable release publishing in configuration (`d1cfb6d7`)
- fix(release): enable release publishing in configuration (`bada866f`)
- fix(ci): clarify testing phase in build job comments (`98171d38`)
- Release v2.2.0: Major downloader performance boost, accurate resolution selection, enhanced notifications, and core fixes. Updated README, changelog, workflow, and versioning for professional release. (`35db945a`)
- fix(aria2c): fix downloader args quoting, progress bar and notification text (`1c357cc2`)
- fix(format): resolve wrong resolution downloaded on format selection (`6a9c50f6`)

## 2026-02-22

### ✦ Recent changes

- CI: Simplify Android build & signing, native keystore decode, improved artifact upload, and enhanced release/notification messages (`8f32a89f`)
- CI: Java 21 support, Gradle/Java caching, optimized build, artifact search, and key decoding improvements (`f9b20581`)

## 2026-02-21

### ✦ Recent changes

- Update CI: Use Java 21 image, improve key decoding (`e1764dae`)
- Set release to false to prevent publishing and upload APKs as artifacts only (`4d4f52ec`)

## 2026-02-16

### ✦ Recent changes

- Release v2.1.0: Enhanced Download Management & Performance (`882605a2`)
- Add Our Sponsors feature with real-time API integration (`5d282e68`)

## 2026-02-15

### ✦ Recent changes

- Added valuable sponsors (`7c11bae1`)
- Remove player_skip to show all format sections (Video, Video-only, Audio) (`5e8cb1dc`)
- Fix format mismatch with player_skip for deterministic client selection (`335f4348`)
- Revert to default client behavior + keep aria2c speed boost (`26505b31`)
- Fix format mismatch and boost download speed (`834d9bc6`)
- Remove explicit player_client to avoid PO Token requirements (`70cc924f`)
- Use iOS player client for speed optimization and format consistency (`08e80e55`)
- Fix download resolution mismatch: Remove android client from download functions (`22f8ce39`)
- Fix format selection: Remove android client from format fetching to show all quality options (`b9adb2b2`)
- Fix format selection issue: Apply android player client consistently across all download paths (`0a871837`)
- feat: Add yt-dlp speed optimizations with android player client (`a417387a`)
- feat: Enable skipPartiallyExpanded for modal bottom sheet in download dialogs (`5e300ebf`)
- feat: Extract video resolution in RecentDownloadDetailsDialog (`fecc667d`)
- feat: Add Retry functionality for download actions (`2c8f5b73`)

## 2026-02-13

### ✦ Recent changes

- Enhance Quality Of Logo (`b917c7e2`)

## 2026-02-08

### ✦ Recent changes

- feat: Update phone screenshots for Android metadata (`81cb0a97`)
- fix: Add missing comma in release.json for JSON syntax correctness (`7cf59d58`)

## 2026-02-07

### ✦ Recent changes

- fix: Update release flag to false for artifact uploads only (`440f8ec8`)

## 2026-02-06

### ✦ Recent changes

- Refactor Telegram notification step in workflow (`669b45ba`)

## 2026-02-05

### ✦ Recent changes

- feat: Add Telegram channel support for release notifications (`54f185df`)
- Restore v2.0 files and fix Telegram HTML notification with URL encoding (`4457cf9c`)
- feat: Add Telegram notification for new releases with detailed changelog (`14592d85`)
- Simplify UPI payment intent - remove activity check and let Android handle app selection (`8f4afa6f`)
- Fix UPI payment intent - remove MATCH_DEFAULT_ONLY flag to properly detect UPI apps (`1e7b3ae4`)
- Revert namespace change - keep original namespace for R class compatibility (`0605f87a`)
- Fix missing import statements for UPI payment functionality (`7f21f1a8`)
- feat: Update applicationId and namespace to reflect new branding (`ac24d1a5`)
- feat: Implement UPI payment functionality with fallback to clipboard copy (`d2b439bf`)
- feat: Add permission state monitoring to show battery optimization dialog after notification permission is granted (`1e636003`)
- feat: Enhance SponsorsPage with new UI components and sections for better user engagement (`d88ad414`)
- feat: Add Support Developer page and navigation (`4c7347c6`)
- feat: Enhance proxy settings UI with beta features indicator and improved layout (`21ef9089`)
- fix: Directly open notification settings instead of requesting permission (`fd627408`)
- fix: Add notification settings launcher to properly handle permission requests (`e63a2102`)
- fix: Correct Column composable syntax in battery optimization dialog (`fba4de3e`)
- feat: Add notification permission handling and related UI dialogs (`5939c87b`)
- feat: Enhance proxy settings description and add beta features indicator (`daadbbbb`)
- fix: Update proxy settings description to include beta features (`edc51fed`)
- fix: Update default interval to daily and change YT-DLP update channel to stable (`9924bbc0`)
- fix: Update max concurrent downloads settings to improve performance (`f0a128f4`)

## 2026-02-04

### ✦ Recent changes

- fix: Remove duplicate unlimited string resource (`cce34d7c`)
- feat: Implement max concurrent downloads feature with UI controls (`604269f6`)
- feat: Add interactive features to Download Details screen (`324012d0`)
- Fix: Use file lastModified for download date instead of non-existent timeCreated property (`51b25420`)
- Refactor RecentDownloadDetailsDialog to display file format, size, creator, and download date (`b33a2201`)
- Add file path label to download details and update UI layout (`17eb1202`)
- Enhance download details UI with gradient headers and structured layout (`8f241a33`)
- Fix file size display using toFileSizeText extension (`1db1f2a2`)
- Add Details option to Recent downloads with RecentDownloadDetailsDialog (`f386dc7d`)
- Fix spacing between pause/resume and three-dot menu, remove debug logging (`5a0cc1d3`)
- Fix download phase detection using state tracking for video/audio progress (`43e1d415`)
- Add automatic file logging to save progressText debug logs (`c1eeae28`)
- Add debug logging for progressText detection and remove excessive spacing (`7e030e2f`)
- Add missing offset import for layout modifier (`8972f16b`)
- Fix download status detection and UI spacing (`85aefc1f`)
- Add ShowDetails case to when expression in DownloadPageV2 (`74bfc5c5`)
- Remove duplicate 'video' and 'audio' string resources (`0351ea00`)
- Fix duplicate 'title' string resource in strings.xml (`c2fbaa5a`)
- feat: Add download details dialog and related UI actions (`b012c61b`)
- feat: Enhance download status messages with merging phase indication (`636864d4`)
- feat: Add Pause and Resume functionality to ActiveDownloadCard (`882cc889`)
- Remove Proxy Settings Documentation and Implementation Guides (`e56cdf75`)

## 2026-02-03

### ✦ Recent changes

- fix: Correct error messages - use download_error_msg for download failures instead of fetch_info_error_msg (`0ee4c4c9`)
- fix: Use literal value instead of private constant (`2f4d1ad3`)
- fix: Preserve download progress when resuming from paused state (`4c343073`)
- fix: Add Paused state import to DownloadPageV2 and VideoCardV2 (`a4a02af2`)
- fix: Add missing Paused state branches in when expressions (`2a4f378b`)
- feat(download): Implement pause and resume functionality for downloads (`3ff8cf5c`)

## 2026-02-02

### ✦ Recent changes

- Implement auto-fetch and auto-test proxy functionality (`facbba7d`)
- Fix ProxyManager compilation errors - use InetSocketAddress.createUnresolved for proper type handling (`6a4e31bb`)
- feat(proxy): Implement comprehensive proxy settings and validation (`b4eba802`)
- Set release flag to false to prevent publishing releases (`3f19c97b`)
- Update version display in DrawerHeader to use dynamic package version (`3ea6405f`)
- Update version to 1.2.8 with format selection improvements and bug fixes (`59aa40e3`)
- Add lifecycle event observer to refresh recent downloads on screen resume (`dd867926`)
- Remove swipe-to-delete onboarding dialog and related preference constants (`ffdbca17`)
- Refactor swipe-to-delete onboarding dialog to use updateBoolean method for preference handling (`096bffe1`)
- Reorganize swipe-to-delete onboarding dialog state initialization in NewHomePage (`6d17f7f7`)
- Remove SwipeLeft icon references and replace with Swipe icon in NewHomePage (`05352a93`)
- Add swipe-to-delete onboarding dialog and preference flag (`f8f2dea2`)
- Implement swipe-to-dismiss functionality for recent downloads with haptic feedback (`8f2cb7db`)
- Refactor format selection logic in FormatPage to improve clarity and handling of selections (`a3cfb788`)
- Clear invalid selections in FormatPage when validated lists change (`9d761682`)
- Add format validation and improve format handling in FormatPage (`825daaeb`)
- automatically find any APK file that was built and save it. (`df2fbf24`)
- write org.gradle.java.home=... into the file (`3a1d3dde`)
- I moved assembleRelease to the end of the command. (`ccbc95c9`)
- update file (`1b6fca29`)
- curl suport (`b09d850e`)
- add jdk 21 suport (`b14970de`)
- update build script (`d6cd8e55`)
- update build config (`59a05a64`)

## 2026-02-01

### ✦ Recent changes

- Add new file (`0a8eadb4`)

## 2026-01-26

### ✦ Recent changes

- remove usless files (`7130e8ab`)

## 2026-01-25

### ✦ Recent changes

- fix: resolve Kotlin compilation errors in NewHomePage (`0ece3bea`)
- feat: introduce new home page UI with download management and adjust release configuration. (`46d4f4b4`)

## 2026-01-24

### ✦ Recent changes

- feat: enable release publishing by setting the release flag to true (`cc18ea79`)
- fix: update versionCode and hardcoded version string for v1.2.7 (`c0116617`)
- chore: bump version to 1.2.7 and update documentation (`25078690`)
- Fix home page delete issue (`519096ab`)
- feat: implement navigation drawer UI with adaptive layouts for different window sizes. (`01061ce6`)
- feat: implement a new home page featuring URL input, recent downloads, and active download displays. (`41faa228`)
- feat: Add new home page with download management UI, including URL input, recent downloads, and active task display. (`c08a8489`)
- feat: add FormatPage for configuring download formats, subtitles, and video clips. (`d3c63ef2`)
- feat: Implement new home page with recent and active download display and database utilities. (`ddd6d432`)
- Fix compilation error with SnapshotStateMap collector (`3e664f56`)

## 2026-01-20

### ✦ Recent changes

- feat: Implement bug fixes for real-time progress updates, duplicate downloads, and format selection prioritization (`38e5f22d`)

## 2026-01-15

### ✦ Recent changes

- feat: Update highest resolution format selection to prioritize merged formats for improved user experience (`1398be2f`)
- feat: Enhance video and audio merging logic for high-quality downloads (`e896c4c6`)
- fix: Update highest resolution format selection logic to prioritize video-only formats (`79c5d6f5`)
- feat: Add image assets for download states and implement delete confirmation dialog in NewHomePage (`96e7acbf`)
- Fix: Change R.string.removed to R.string.delete_info (`65a04ea7`)
- Add dropdown menu options for download cards (`b449d9e1`)
- Fix: Remove duplicate downloads in recent section and add padding to download button (`5a2c2ae1`)
- Fix matchUrlFromClipboard context reference in NewHomePage (`809e157a`)
- feat: Implement New Home Page with download functionality and navigation updates (`512951bf`)
- chore: Remove beta subproject reference (`3e2f9703`)

## 2026-01-14

### ✦ Recent changes

- feat: Release v1.2.6 - Enhanced video quality and performance with highest resolution MP4 selection and advanced aria2c support (`a535518c`)
- Update youtubedl-android library to 0.18.1 (includes yt-dlp 2025.12.08) (`387648eb`)
- Remove extra closing brace in FormatPage.kt (`122cc029`)
- Fix syntax error in FormatPage.kt - remove extra closing brace (`35a878c5`)
- feat: Add external downloader arguments for aria2c in video download options (`09930f2a`)
- feat: Implement highest resolution MP4 format selection for video downloads (`25e42016`)

## 2026-01-09

### ✦ Recent changes

- fix: Remove specific APK file reference from upload step (`980b11ea`)
- feat: Enable release publishing in release.json (`e5feb7de`)
- docs: Update README for v1.2.5 (`6fa52f69`)
- chore: Bump version to 1.2.5 (`e0a9737a`)
- feat: Add professional onboarding screens with smooth animations (`7ca7c740`)
- refactor: Update splash screen branding (`917479a4`)
- feat: Add modern professional splash screen with smooth animations (`91fe6a31`)
- Enhance APK cleanup and debugging in CI workflow (`3cedff63`)
- Implement controlled release system with configuration file and workflow updates (`4cafe0c1`)
- Allow any network type for downloads in PreferenceUtil (`12fb4180`)

## 2026-01-08

### ✦ Recent changes

- Update README and create RELEASE_1.2.4.md with App Lock and Exit Confirmation features (`607c4638`)
- Update CHANGELOG and release description for v1.2.4 with exit confirmation feature (`08fd1491`)
- Add stylish exit confirmation dialog to Download Queue page (`52ab8106`)
- Update CHANGELOG for v1.2.4 with complete AppLock features (`4651d71c`)
- Add 'Immediately' option to authentication timeout (`75fd8e8c`)
- Fix AppLock: Remove duplicate constant declaration (`df23d937`)
- fix: Remove unused string resource for reset action in strings.xml (`bc9acaff`)
- feat: Add AppLock reset functionality and confirmation dialog (`a035750c`)
- feat: Update PIN functionality to enforce 4-digit limit and add verification dialog (`dcb1fa5c`)

## 2026-01-07

### ✦ Recent changes

- Fix compilation errors in SetPinDialog: Add coroutine imports and fix scope usage (`ec2041f3`)
- Fix duplicate string resource: Remove duplicate 'disable' entry (`d2df7882`)
- Fix XML syntax error: Add missing closing tag in strings.xml (`df422850`)
- 🔒 Release v1.2.4: Password Protection Feature (`81555053`)
- fix: Update repository links to point to Sealplus (`7ae8c59f`)
- fix: Correct version code for v1.2.3 (102_030_400) (`7185e6b3`)
- Remove Gradient Dark Theme Documentation and Update Release Notes for v1.2.3 (`cafb448f`)
- feat: Enhance smart notification settings with progress handling and improved sound/vibration controls (`66a41438`)

## 2026-01-06

### ✦ Recent changes

- fix: Improve Smart Notifications implementation (`e9d10876`)
- feat: Add Smart Notifications feature to Sealplus Extras (`d11919c2`)
- fix: Network restriction selection now reflects immediately in UI (`4b1cedda`)
- feat: Improve network restriction feature with immediate checks and better error messages (`c27b45c4`)
- fix: Add missing string resources for network restrictions (`39c13cb7`)
- fix: Update versionCode to 102_020_400 for v1.2.2 (`130777ee`)
- feat: Add Network Type Restrictions in Sealplus Extras (v1.2.2) (`3ecbeed3`)
- feat: Update README with enhanced branding and features; update app icon and screenshots (`05f9e1e7`)
- feat: Enhance build process with Gradle Build Scans and update app branding details (`894dbb6a`)
- fix: Update versionCode to match version 1.2.1 (`22e53c70`)
- chore: Bump version to 1.2.1 (`a668c76b`)
- feat: Update app logo with new Seal Plus branding (`801950db`)
- Revert "fix: resolve app icon display issue on Android 8.0+ devices" (`57163453`)

## 2026-01-05

### ✦ Recent changes

- Revert "fix: improve app icon display with proper adaptive icon sizing" (`49d84489`)
- fix: improve app icon display with proper adaptive icon sizing (`32c9eb1f`)
- fix: resolve app icon display issue on Android 8.0+ devices (`9ed34bd1`)
- Fix version code for 1.2.0 release (`6a6ab9bf`)
- Bump version to 1.2.0 (`10c9943a`)
- Update About page with Seal Plus branding: new repo links, Telegram/YouTube channels, remove Matrix (`e416938f`)
- Fix auto-update integration: migrate to MaheshTechnicals/Seal repo, enable by default, fix release publication (`7d142c45`)
- Update CHANGELOG.md with navigation drawer and theming improvements (`d7c05cd3`)
- Improve navigation drawer and theming consistency (`030a94b6`)
- Update CHANGELOG.md with UI/UX improvements and bug fixes (`b47292c2`)
- refactor: Enhance UI styling and layout in FormatItem and FormatPage components (`e01bdfb6`)
- Fix AndroidManifest.xml warning: remove extractNativeLibs attribute (`6f268920`)
- refactor: Update UI components for improved styling and layout consistency (`8092e2f1`)

## 2026-01-04

### ✦ Recent changes

- Add kotlinx.coroutines imports for launch and coroutineScope (`e586bd86`)
- Fix coroutine scope with coroutineScope wrapper (`c2143a86`)
- Fix coroutine scope issues in GradientDarkTheme.kt (`0ab6e8bc`)
- fix: Update versionCode to 101_000_400 for new release (`148a9e8d`)
- Release v1.1.0: Add Gradient Dark Theme (`5c656320`)
- feat: Add Gradient Dark theme integration and premium components (`e690eec0`)
- Update app icons to new logo (converted to PNG) (`3ca671ee`)
- Update launcher icons across all mipmap densities (`cd1c4cf9`)
- Upload only signed APKs to release, exclude temp and unsigned files (`445c7687`)
- Keep only Generic variant and fix deprecated set-output warnings (`34b09837`)
- Fix version extraction in workflow (`8c20df3c`)
- Update workflow to automatically create and publish releases with APKs (`47759f4a`)
- Update versionCode to 100_000_400 for v1.0.0 (`be7cbd86`)
- Rebrand to Seal Plus v1.0.0 (`65808c7c`)
- Update localization strings to reflect the rebranding of Seal to Seal Plus across multiple languages. Adjusted messages related to automatic updates, custom command usage, and service titles to ensure consistency and clarity in user experience. (`d998f30d`)
- Update strings for Seal Plus branding across multiple languages in the app's resources. Changed references from "Seal" to "Seal Plus" in various strings, including service titles and auto-update messages, to reflect the new branding and ensure consistency in user experience. (`5b310559`)
- Rename app and update strings to reflect "Seal Plus" branding across multiple languages and resources, including UI elements, metadata, and documentation. (`6ecb1c38`)
- Update workflow to use correct secret names with ANDROID_ prefix (`9e7f6bc3`)
- Add ANDROID_SIGNING_KEY environment variable for signing action (`f4bf8629`)
- Fix APK artifact paths with correct variant folder structure (`d86a21c0`)
- Fix APK artifact paths for all build variants (`4c11f84a`)
- Increase Gradle JVM heap size to 4GB for CI builds (`13371184`)
- Fix workflow: use continue-on-error for signing step (`44a6b266`)
- Make APK signing optional in workflow when secrets not configured (`fddbfdad`)
- Fix remaining context reference in DownloadPageImpl (`7c2adcb4`)
- chore: import makeToast utility in multiple components for consistent toast messaging (`14445a93`)
- chore: add makeToast utility to various components for consistent toast messaging (`ba16c37d`)
- chore: update URL matching functions to use context extension for improved readability (`7ffccd62`)
- chore: downgrade room version to 2.6.1 for compatibility (`98d7b6b2`)
- chore: downgrade serialization version to 1.7.3 for compatibility (`e8484ec1`)
- chore: update compileSdk version to 36 for improved compatibility (`59ea2997`)
- chore: replace ToastUtil with context extension for toast messages and update theme references (`984c67aa`)
- chore: update compileSdk and targetSdk to 36 for compatibility with latest AndroidX libraries (`dea74592`)
- chore: downgrade Kotlin and KSP versions for stability and compatibility (`2dbfbe79`)
- chore: update dependencies and Gradle configurations for compatibility and stability (`f5f5fc24`)
- chore: update Gradle to 9.2.1 and adjust build configurations for improved compatibility (`964a6803`)
- chore: update dependencies and workflows for improved stability and performance (`7a0a4237`)

## 2025-12-25

### ✦ Recent changes

- docs(readme): update sponsor info (`56cc5a96`)

## 2025-11-25

### ✦ Recent changes

- docs(readme): update sponsor info (`58b900e7`)

## 2025-10-25

### ✦ Recent changes

- docs(readme): update sponsor info (`2b5565bc`)

## 2025-09-25

### ✦ Recent changes

- docs(readme): update sponsor info (`a61b11ef`)

## 2025-07-25

### ✦ Recent changes

- docs(readme): update sponsor info (`e5a8a51f`)

## 2025-06-25

### ✦ Recent changes

- docs(readme): update sponsor info (`76d4ae06`)

## 2025-05-25

### ✦ Recent changes

- docs(readme): update sponsor info (`6c2553cd`)

## 2025-04-25

### ✦ Recent changes

- docs(readme): update sponsor info (`5d857e59`)

## 2025-04-06

### ✦ Recent changes

- feat: action sheet style tweak (`96129e19`)
- fix: remove hardcoded user shared directory (`a944faa1`)
- fix(ui): sponsor page (`b33cc7d0`)
- fix(ui): dialog single choice item (`2fc6c27a`)
- build: update dependencies (`65968a49`)

## 2025-03-25

### ✦ Recent changes

- docs(readme): update sponsor info (`758b2d45`)

## 2025-02-25

### ✦ Recent changes

- docs(readme): update sponsor info (`82e9fd7b`)

## 2025-01-25

### ✦ Recent changes

- docs(readme): update sponsor info (`b6da5768`)

## 2024-12-25

### ✦ Recent changes

- docs(readme): update sponsor info (`11c3f7ca`)

## 2024-11-29

### ✦ Recent changes

- translate(strings): translated using Weblate (Spanish) (#1893) (`b7a629e1`)
- chore: pre-release v2.0.0-alpha.5 (`f57604f5`)

## 2024-11-26

### ✦ Recent changes

- Revert "feat(ui): use selection group in download history" (`2fc36263`)
- feat(download): saved links for download (`ce73a363`)

## 2024-11-25

### ✦ Recent changes

- docs(readme): update sponsor info (`f670e651`)

## 2024-11-17

### ✦ Recent changes

- feat(ui): internal changes (`7dab2605`)
- feat(ui): internal changes (`b2503c0f`)

## 2024-11-16

### ✦ Recent changes

- fix: internal changes (`c9762f63`)
- build: bump up deps (`5941bfe4`)
- fix(download): downloader selects lower res videos with quality preset (`0e5f7176`)

## 2024-10-26

### ✦ Recent changes

- docs: screenshot path (`b08dfbb6`)

## 2024-10-25

### ✦ Recent changes

- Moved translated README files to a 'translations' subfolder and updated hyperlinks (#1804) (`41d30e30`)
- docs(readme): update sponsor info (`b2751eba`)

## 2024-10-23

### ✦ Recent changes

- feat(download): execute custom command (`8da3f956`)

## 2024-10-22

### ✦ Recent changes

- feat(ui): custom command (wip) (`8b6a2499`)
- feat(download): custom command implementation for downloader v2 (`a063fdab`)
- build: bump up dependencies (`43901947`)
- Fix incorrect tag name in QuickDownloadActivity (#1809) (`f78bd19c`)
- fix: download playlist as audio (`a6599e26`)

## 2024-10-16

### ✦ Recent changes

- build: set generic to default (`a62c4f49`)
- Create close-stale-issues.yml (`d264ca4e`)

## 2024-10-14

### ✦ Recent changes

- style: force the whole app module to use ktfmt (`b4e5570f`)
- feat(ui): add troubleshooting page (`b83c368f`)
- fix: internal changes (`a7a89fb7`)
- feat(ui): add troubleshooting page (wip) (`8ffb1f9d`)
- refactor: change version scheme (`65f05652`)

## 2024-10-09

### ✦ Recent changes

- fix(ui): filter unknown format info (`b5372cbc`)
- feat(ui): use selection group in download history (`6b711f67`)
- feat(ui): internal changes (`0f1b1962`)
- feat(ui): internal changes (`090addfc`)
- feat(ui): navigation rail item variant (`cad666a8`)
- feat(ui): use navigation rail in large screens (`e3e0a26a`)

## 2024-10-08

### ✦ Recent changes

- fix(ui): internal changes (`18aface7`)
- ci: use jdk 21 (`4ed626c4`)
- chore: pre-release v2.0.0-alpha.4 (20000) (`3ea0908b`)
- fix(ui): remove the notch because why not (`d79ccef9`)
- fix(ui): internal changes (`bdeb91db`)
- translate(strings): translated using Weblate (Japanese) (#1786) (`bba24a7b`)
- docs: update changelogs (`4f02b490`)
- fix(ui): image size (`49c860e6`)
- feat(ui): video count (`b36ab2d5`)
- updated bengali-bn translation (#1724) (`14908829`)
- feat(ui): download task list item (`622fcc9a`)
- fix(ui): internal changes (`5ec18045`)

## 2024-10-07

### ✦ Recent changes

- Update README-ua.md (#1725) (`4a037ddb`)
- translate(strings): translated using Weblate (Turkish) (#1782) (`74492bbf`)
- fix(ui): spacer animation (`ce21aff1`)
- fix(ui): task list (`91434626`)
- fix(ui): top bar nested scroll (`3c088656`)
- build: move version to buildSrc (`cb9aabd6`)
- feat(download): backup & restore task list (`1adbb784`)
- fix(ui): internal changes (`0abbfe05`)
- fix(download): cancel task with notification (`da2c2de0`)
- feat(download): make data class serializable (`edbf0fc3`)
- fix: fdroid version name (`d5e5c2bc`)
- fix(notitication): cancel task callback (`b9ab43aa`)
- feat(ui): refactor uiactions (`b94dca7f`)

## 2024-10-06

### ✦ Recent changes

- fix(ui): internal changes (`58c2a98e`)
- feat(ui): format info (`8bef73a0`)
- feat(ui): video info (`c7be161a`)
- misc: bump up dependencies (`a38c46f9`)

## 2024-10-05

### ✦ Recent changes

- feat(ui): action sheet buttons (`339df3e0`)
- feat(ui): action sheet draft design (`2ef62e8e`)
- feat(ui): internal changes (`466c14d2`)
- feat(ui): experimental large screen support (`a290269e`)
- fix(ui): internal changes (`2ab10b37`)
- fix(ui): internal changes (`49c1a83d`)
- misc: bump up youtubedl-android (`fadbe5a7`)
- feat(ui): internal changes (`6fdd5eae`)

## 2024-10-04

### ✦ Recent changes

- misc: bump up compose (`9f68a720`)
- fix(ui): internal changes (`160ae54c`)
- fix(ui): internal changes (`2c6fa3ea`)
- feat(ui): experimental large screen support (`121f5d2a`)

## 2024-09-29

### ✦ Recent changes

- fix: start foreground service (`5ffc3096`)
- build: internal changes (`d5300c8f`)

## 2024-09-26

### ✦ Recent changes

- fix(ui): internal changes (`96f869aa`)
- fix(ui): internal changes (`39e426d3`)
- fix(ui): cookies viewmodel state (`63ce46d0`)
- fix(ui): cookies viewmodel (`bf0a3f0d`)
- feat(ui): internal changes (`1b36dd47`)
- fix(ui): use url for title (`e57c4f10`)
- fix(ui): maxlines for urls (`dd94a991`)
- feat(download): select multiple links from clipboard (`ce8d4f06`)
- misc: remove compose viewmodel (`77f7e114`)
- build: create fdroid product flavor (`3226f3bd`)
- misc: internal changes (`e3dc4846`)

## 2024-09-25

### ✦ Recent changes

- build: bump up targetSdk & release v2.0.0-alpha03 (`b16c7082`)
- misc: add i18n support (`85ca501a`)
- docs(readme): update sponsor info (`d45840ab`)
- fixed: latter cases (#1705) (`000b73de`)
- feat(download): playlist download (`f5ab95f1`)
- fix(activity): share url (`4ba7994c`)

## 2024-09-24

### ✦ Recent changes

- translate(strings): translated using Weblate (Serbian) (#1722) (`24de2dd5`)
- fix(downloader): start foreground service (`b4fc0b32`)
- fix(ui): edge to edge (`01af43a8`)
- fix(ui): internal changes (`c37e7252`)
- feat(ui): add destinations to navigation drawer (`e0678c46`)
- fix(downloader): cancel notification (`04d8298d`)
- refactor(ui): new design for home page (`01eabe42`)

## 2024-09-23

### ✦ Recent changes

- refactor(ui): new design for download queue (`816f49b9`)
- feat(ui): selection group (`73e660e8`)
- feat(ui): internal changes (`7dc62614`)

## 2024-09-22

### ✦ Recent changes

- feat(ui): internal changes (`fcb44ece`)
- fix(ui): internal changes (`b9669d63`)
- fix(ui): edge to edge (`8395aae3`)
- refactor(downloader): task state (`56d0b910`)

## 2024-09-21

### ✦ Recent changes

- fix(ui): internal changes (`c7c75e0d`)
- feat(ui): video card status indicator (`67719afc`)
- feat(ui): video card v2 (`20c40d8c`)
- feat(ui): video card v2 (`d6e8b5d8`)

## 2024-09-20

### ✦ Recent changes

- feat(ui): input url (`3da56d64`)
- refactor: decouple appupdater (`ee90d30b`)

## 2024-09-19

### ✦ Recent changes

- Better portuguese README.md (#1686) (`7e403f7b`)
- added README-bn.md and updated README.md (#1673) (`f4dbc86f`)
- feat(ui): predictive back (`f21c912f`)
- refactor: use koin for dependencies injection (`6972b6ce`)

## 2024-09-18

### ✦ Recent changes

- build: bump up kotlin to 2.0.20 (`5ac6a92e`)

## 2024-08-27

### ✦ Recent changes

- feat(download): task code cleanup (`cd81dd1f`)
- feat(download): playlist entry (wip) (`0b4d723b`)

## 2024-08-25

### ✦ Recent changes

- fix(network): cookies not working in multi-user (`b62154ed`)
- feat(download): internal changes (`2c4f22cf`)
- docs(readme): update sponsor info (`72dc2187`)

## 2024-08-22

### ✦ Recent changes

- feat(download): map flow (wip) (`499ed523`)

## 2024-08-21

### ✦ Recent changes

- feat(download): snapshotflow magic idk (`7ceff558`)
- feat(download): notifications (wip) (`15492cea`)

## 2024-08-20

### ✦ Recent changes

- feat(download): TaskFactory sounds weird (`9b5ff643`)
- feat(download): createTaskWithConfigurations (`70148a10`)
- feat(ui): url input field (`ac76fc8b`)

## 2024-08-19

### ✦ Recent changes

- ci: misc (`eae35118`)
- feat(download): downloader task wip (`9af42c54`)
- build: clean up (`35eacfe0`)

## 2024-08-18

### ✦ Recent changes

- ci: build release only (`847b3236`)

## 2024-08-17

### ✦ Recent changes

- feat(download): download task & state management (WIP) (`e62553b2`)
- feat(ui): yes little animations why not (`b329f204`)

## 2024-08-14

### ✦ Recent changes

- ci(github): update issue bot (`10692fe6`)
- feat(download): internal changes (`9ba85a70`)

## 2024-08-12

### ✦ Recent changes

- build: migrate to room gradle plugin (#1627) (`8fbb8d61`)
- docs(readme): update sponsor info (`773ced45`)

## 2024-08-11

### ✦ Recent changes

- chore: release v2.0.0-alpha.2 (`0e6dc1a7`)
- feat(download): re-run info fetching when hit error (`734924da`)
- feat(download): simple download queue implementation (`d52dc96f`)
- feat(ui): quick download (`326a4c21`)
- fix(ui): color contrast (`6ce31c2d`)
- feat(ui): cute animations (`1b6ebcd7`)
- fix(ui): hide dialog (`9c7ba145`)
- feat(ui): cancel info fetching (`d8d27b63`)
- fix(ui): audio dialog (`03734ca9`)

## 2024-08-10

### ✦ Recent changes

- feat(ui): use m3 bottom sheet (`98d495ab`)
- feat(ui): quick download (wip) (`8043f081`)
- Added Hindi translation of README.md and update language links (#1619) (`bc891260`)
- translate(strings): translated using Weblate (Thai) (#1626) (`580e374c`)
- style: apply ktfmt (`3a6764eb`)
- build: update compose (`9bbbccd8`)
- refactor(ui): refactor bottom sheet (`3fcc0819`)

## 2024-08-09

### ✦ Recent changes

- feat(download): format selection (wip) (`b6d96098`)

## 2024-08-08

### ✦ Recent changes

- feat(ui): audio quick settings dialog (`b17b4913`)
- refactor(preference): refactor download preferences (`ffd8421b`)
- feat(ui): internal changes (`a6a526c9`)

## 2024-08-06

### ✦ Recent changes

- feat(ui): internal changes (`591806b9`)

## 2024-08-03

### ✦ Recent changes

- feat(ui): internal changes (`536b6c73`)

## 2024-07-30

### ✦ Recent changes

- Compose buildFeature flag could be removed after AGP 8.5.1 (#1603) (`0b80936f`)

## 2024-07-27

### ✦ Recent changes

- feat(ui): internal changes (`5085f8a6`)

## 2024-07-20

### ✦ Recent changes

- feat(ui): internal changes (`2b1e9c9e`)
- feat(ui): internal changes (`3f60ed0e`)

## 2024-07-06

### ✦ Recent changes

- feat(ui): download type (wip) (`7867eb9e`)

## 2024-07-05

### ✦ Recent changes

- feat(ui): download configuration dialog (WIP) (`6e09ecdd`)

## 2024-06-30

### ✦ Recent changes

- feat: format selection item (wip) (`2f58190a`)
- feat: format selection page (wip) (`8024c5c9`)

## 2024-06-29

### ✦ Recent changes

- feat: loading state (WIP) (`e5fbe6e7`)

## 2024-06-20

### ✦ Recent changes

- build: update ytdl-android (`44c391b7`)
- feat: internal changes (`6c1ff2e9`)

## 2024-06-11

### ✦ Recent changes

- feat(ui): download dialog refactor (wip) (`3fea076f`)

## 2024-06-08

### ✦ Recent changes

- feat(ui): move playlist to download type (`6b477788`)

## 2024-06-06

### ✦ Recent changes

- build: workaround jitpack issue by using local artifact (`43906f24`)
- build(deps): bump up kotlin to 2.0 (`78644b6a`)

## 2024-05-04

### ✦ Recent changes

- fixup! fix(download): dump single json (`b40ad226`)

## 2024-05-02

### ✦ Recent changes

- chore: pre-release v2.0.0-alpha.1 (`944da8fc`)
- refactor(ui): internal changes (`8420d930`)
- fix(aria2c): remove redundant argument (`426a3ac2`)
- fix(download): dump single json (`a373bd78`)
- build: bump up compose (`78ce6ffc`)
- fix(ui): use md2 bottom sheet in command page (`cf7418b9`)
- build: bump up minSdk to 24 (`2750b5ec`)
- refactor(ui): migrate to edge to edge (`29b99743`)
- refactor(ui): internal changes (`78efba72`)
- feat(ui): add pkgname (`2689256c`)

## 2024-05-01

### ✦ Recent changes

- translate(strings): translated using Weblate (Serbian) (#1484) (`9d8aefa3`)
- ci: Update android.yml (#1477) (`52feb7d6`)
- feat(update): add alpha version variant (`102e5042`)
- refactor(ui): disable auto-update & onboarding (`8e123015`)
- build: create githubPreview flavor (`316507fe`)

## 2024-04-29

### ✦ Recent changes

- docs(readme): update sponsor info (`6a3941a3`)

## 2024-04-27

### ✦ Recent changes

- feat(ui): internal changes (`7dc0866c`)
- docs: update credit (`16c12c30`)
- build: bump up dependencies & clean up (`c6ed9789`)
- feat(ui): internal changes (`7f27f92d`)
- feat(ui): suggest locales according to system preference (`acf08cc4`)
- feat(ui): internal ui changes (`b30fd63d`)
- feat(ui): ui changes to settings (`6d9ac59a`)

## 2024-04-20

### ✦ Recent changes

- fix(ui): flush cookies when dropping db (`bc07fa59`)

## 2024-04-18

### ✦ Recent changes

- fix: typo (`09c670df`)

## 2024-04-17

### ✦ Recent changes

- fix: typo (`f0ff2684`)
- chore: release v1.12.1 (11210) (`0b8f25a5`)
- feat(locale): add Greek locale (`989b77b7`)
- translate(strings): translated using Weblate (Serbian) (#1461) (`200f7901`)
- fix(ui): revert list animation (`08b8e042`)
- docs: update changelog (`778d08d6`)
- refactor(ui): internal changes (`e3d96506`)
- feat(ui): add/removal animation for download history (`306c36ce`)
- refactor(ui): internal changes (`8edf1b69`)
- feat(yt-dlp): configure update interval (`39da3fa4`)

## 2024-04-15

### ✦ Recent changes

- docs(readme): update sponsor info (`2e188d7b`)

## 2024-04-14

### ✦ Recent changes

- feat(yt-dlp): add update interval for yt-dlp auto updating (`fb33065d`)
- fix(ui): use md2 ModalBottomSheetLayout in devices on API < 30 (`974ca563`)
- feat(cookies): export cookies to file (`106fca98`)
- feat(cookies): show the current count of cookies stored in db (`7c85ff10`)
- fix(yt-dlp): block download when updating yt-dlp (`c6c39a3f`)
- fix(cookies): data path (`1005f6d2`)

## 2024-04-09

### ✦ Recent changes

- fix(cookies): intercept the loading of non-HTTP(s) URLs (`35859c23`)

## 2024-04-07

### ✦ Recent changes

- fix(format): videos are remuxed to mkv when download subtitle is disabled (`dfb824a1`)

## 2024-04-05

### ✦ Recent changes

- fix(gradle): fix version code for fdroid builds (`e016faab`)
- chore: release v1.12.0 (11200) (`e9c326bb`)
- feat(update): revert disable yt-dlp auto update (`90db75f4`)
- feat(ui): internal changes (`c2011627`)
- build(deps): update compose to 2024.04.00-alpha01 (`e729f15a`)
- feat(ui): internal changes (`f90ae02d`)
- fix(ui): fix splash screen below API 31 (`22c382d7`)
- feat(update): disable yt-dlp auto update (`b3ebcd13`)
- translate(strings): translated using Weblate (Chinese (Simplified)) (#1431) (`ab8add66`)

## 2024-04-04

### ✦ Recent changes

- fix(update): fix misc issues with auto update (`62d0b86b`)
- Revert "build(deps): update compose to 2024.04.00-alpha01" (`30331296`)
- build(debug): separate debug variant with release variant (`d06fe483`)
- feat(ui): internal changes (`16087116`)
- build(deps): update compose to 2024.04.00-alpha01 (`bd3affd7`)
- feat(format): remux videos into mkv container (`ada5e81c`)

## 2024-04-03

### ✦ Recent changes

- chore: release v1.12.0-rc.2 (11200) (`674ec0c8`)
- feat(ui): add Khmer and Kannada locale (`9345b7b1`)
- docs: update changelog (`97930625`)
- translate(strings): translated using Weblate (Khmer (Central)) (#1428) (`56c313fb`)
- fix(ui): ModalBottomSheet insets workaround for SDK_INT < 30 (`e335229b`)
- fix(command): don't insert blank url (`f6c552f4`)
- fix(download): use original url of playlists (`f635f69e`)
- fix(ui): log cannot be scrolled vertically when expanded (`53fb4662`)

## 2024-04-02

### ✦ Recent changes

- feat(ui): internal changes (`bf25fa40`)
- Revert "fix(ui): fix crash when expanding format list" (`34a3abe4`)
- ci: update github actions (`b121d793`)
- docs: add disclaimer (`186afd08`)

## 2024-04-01

### ✦ Recent changes

- feat(ui): add splash screen (#1424) (`aaec0a67`)
- feat(translate): add Thai and Bengali locale (`f9a5b76b`)
- chore(deps): update agp (`114dc3a4`)
- chore(deps): update compose compiler & kotlin (`fbcd8527`)
- fix(a11y): toggleable state not read aloud by talkback service (`90af75d8`)

## 2024-03-31

### ✦ Recent changes

- chore: release v1.12.0-rc.1 (11200) (`a751cd3e`)
- docs: update changelog (`d9c3a76b`)
- Update translation files (#1423) (`c6a293a3`)
- feat(download): use nightly builds for default (`5ddb95a7`)

## 2024-03-30

### ✦ Recent changes

- fix(playlist): app crashes when downloading playlist (`b9c05a33`)

## 2024-03-28

### ✦ Recent changes

- fix(ui): update colors of switches to align with rest of the ui (`6035e380`)

## 2024-03-27

### ✦ Recent changes

- fix(ui): fix SuspiciousModifierThen (`8efdc35f`)
- fix(ui): fix crash when expanding format list (`8eebd113`)
- chore: release v1.12.0-beta.2 (11130) (`0739229e`)
- translate(strings): translated using Weblate (Spanish) (#1416) (`43b04381`)

## 2024-03-26

### ✦ Recent changes

- fix(ui): fix crash when expanding format list (`54b8a269`)
- refactor(navigation): decouple navController (`b2e735f8`)

## 2024-03-25

### ✦ Recent changes

- feat(ui): add interaction preference (`055789b6`)
- fix(ui): fix crash when expanding format list (`aa48b1d0`)

## 2024-03-24

### ✦ Recent changes

- fix(backup): reversed backup list (`2eab899c`)
- feat(ui): internal changes (`2e4982af`)
- refactor(ui): ux improvements to format page (WIP) (`6a1eb839`)
- refactor(download): ux improvements for error handling (`3d48fb95`)

## 2024-03-23

### ✦ Recent changes

- feat(ui): update slider in -N dialog (`464030d4`)
- feat(ui): use alpha release, update md3 slider & progress indicators (`eea7d2ed`)

## 2024-03-19

### ✦ Recent changes

- translate(strings): translated using Weblate (Hebrew) (#1394) (`4a03bc78`)

## 2024-03-18

### ✦ Recent changes

- docs(readme): update sponsor info (`9c351f7f`)

## 2024-03-17

### ✦ Recent changes

- fix(subtitle): match entire string with regex (`ea0a611a`)
- feat(download): add url as title to notifications (`9e2c4029`)

## 2024-03-16

### ✦ Recent changes

- ci: fix issue action (`a0deadcc`)

## 2024-03-14

### ✦ Recent changes

- ci(github): only trigger bot on issues that needs triage (`3306e3d4`)

## 2024-03-13

### ✦ Recent changes

- feat(download): display video title in notification when error occurs (`4a50a3ec`)
- fix(ui): throw error when downloading duplicated videos in download archive (`3e78d20b`)

## 2024-03-10

### ✦ Recent changes

- fix: app crashes when the selected template is not available (`62d190ce`)
- fix: app crashes when the selected template is not available (`54144351`)

## 2024-03-09

### ✦ Recent changes

- refactor(locale): use system default display name (`8dddb81d`)
- translate(strings): translated using Weblate (Indonesian) (#1361) (`cca5aa59`)

## 2024-03-08

### ✦ Recent changes

- chore: release v1.12.0-beta.1 (`f2362893`)
- fix(ui): fixup cookies message (`a7475164`)
- fix(ui): reset subtitle language (`59789f08`)
- docs: update changelog (`3d418927`)
- feat(ui): embed metadata to video (`57bb6e92`)
- feat(ui): redownload unavailable videos (`c06295d9`)
- feat(ui): internal changes (`5037956b`)
- fix(backup): import backup (`834f0dfb`)
- fix(ui): bulk delete download history doesn't work sometimes (`a8b33f7e`)
- feat, refactor: backup download history (`bbd4de95`)

## 2024-03-07

### ✦ Recent changes

- feat(ui): configure initial selected download type (`b1781c65`)
- fix(ui): context menu (`f7e1e72b`)
- feat(ui): internal changes (`54f04131`)
- build(deps): update dependencies (`486f357c`)
- feat(ui): monospace text style for commands (`5aef3268`)
- feat(ui): add haptic feedbacks (`28fffa02`)
- feat(ui): long press to multi-select (`9873fe0c`)
- feat(ui): modify entries (`aea348fa`)
- fix(ui): don't select subtitles when disabled (`71ce413b`)

## 2024-03-06

### ✦ Recent changes

- fix(ui): typo (`23d13ce8`)
- feat(vm): import/export download history (WIP) (`2da00a8c`)
- feat(ui): import/export download history (WIP) (`85061fe2`)
- feat(backup): import download history (`a9e64835`)
- feat(ui): download history to json/url list (`1f058384`)

## 2024-02-24

### ✦ Recent changes

- feat(ui): remember subtitle language dialog (`c6f271ee`)
- feat(ui): remember subtitle language dialog (WIP) (`d0e3c686`)

## 2024-02-23

### ✦ Recent changes

- feat(ui): search in subtitles (`09590c31`)
- feat(ui): internal changes (`d8bdb0c8`)
- feat(subtitles): reset language codes (`0e7e3c9b`)
- feat(ui): add strings for new options (`cc172a5d`)
- feat(subtitle): download auto-translated subs (`2375613b`)

## 2024-02-19

### ✦ Recent changes

- docs(readme): update sponsor info (`48fa9b35`)

## 2024-02-14

### ✦ Recent changes

- feat(ui): search interaction tweaks (`24343a57`)
- feat(ui): searchbar tweaks (`971f0817`)
- feat(ui): select all items from search result (`dcf8dc57`)
- feat(ui): search for items in download history (`512afe5a`)

## 2024-02-13

### ✦ Recent changes

- fix(ui): rollback modal bottom sheet to m2 (`ab37fd0a`)
- fix: r8 error (`ba810686`)

## 2024-02-05

### ✦ Recent changes

- docs(readme): update sponsor info (`960b2dcf`)

## 2024-01-30

### ✦ Recent changes

- fix(download): hardcoded storage prefix breaks download in multiple user profiles (`9f7f5175`)

## 2024-01-29

### ✦ Recent changes

- docs(readme): update sponsor info (`38323ca8`)

## 2024-01-22

### ✦ Recent changes

- docs(readme): update sponsor info (`862985be`)
- feat(ui): add interaction source to components (`ca5b0216`)
- chore: release v1.11.3 (11130) (`64a11d39`)
- translate(strings): translated using Weblate (Chinese (Simplified)) (#1277) (`14699aa7`)
- feat(download): merge multiple audio streams (`b51ef581`)
- feat(ui): add allow always option to metered network download request (`e4126cae`)

## 2024-01-21

### ✦ Recent changes

- feat: allow downloading with cellular network temporarily (`cb096e34`)
- feat: show notification permission dialog in settings (`98c66f2c`)
- fix: reset default output template (`d922e60e`)
- chore: remove redundant components (`ea2b342d`)

## 2024-01-20

### ✦ Recent changes

- fix: bring back m2 modal bottom sheet (`8d2bb737`)
- fix: app creates duplicated command templates on initialization (`7185efc5`)

## 2024-01-15

### ✦ Recent changes

- docs(readme): update sponsor info (`7020420e`)

## 2024-01-08

### ✦ Recent changes

- docs(readme): update sponsor info (`c236bd92`)
- fix: video clip dialog (`a5ff2efb`)

## 2024-01-06

### ✦ Recent changes

- chore: remove redundant dependencies & bump up java to 21 (`d9890920`)
- chore: release v1.11.2 (11120) (`8a4cf097`)
- feat: keep subtitles files after embedding into videos (`76ad3e85`)
- feat: implement Shared Axis Transitions (`a3a5b10e`)
- chore: update dependencies (`9f847929`)
- fix: user agent gets enabled when refreshing cookies (`e4a1cad7`)

## 2024-01-05

### ✦ Recent changes

- translate(strings): translated using Weblate (Punjabi) (#1258) (`d67ee72c`)

## 2024-01-01

### ✦ Recent changes

- docs(readme): update sponsor info (`29b1336c`)

## 2023-12-24

### ✦ Recent changes

- feat: force ipv4 (`0b069ca8`)

## 2023-12-23

### ✦ Recent changes

- docs: Update README-ru.md (#1227) (`0da62454`)

## 2023-12-22

### ✦ Recent changes

- fix: ui bug with format sorting dialog (`f261d1fe`)
- feat: prefer vp9.2 if user's device doesn't support av1 hardware decoding (`72c21134`)
- feat: add system locale settings for Android 13+ (`1cc50f9a`)
- fix: restrict filenames not working in custom commands (`c33c37e7`)

## 2023-12-18

### ✦ Recent changes

- docs(readme): update sponsor info (`44d6b321`)

## 2023-12-17

### ✦ Recent changes

- ci: ignore lint (`550a3a16`)
- docs(readme): update README-ja.md (#1209) (`828f0fbd`)

## 2023-12-16

### ✦ Recent changes

- chore: release v1.11.1 (11110) (`081f058a`)
- docs: update readme (`7af5171c`)
- docs: update README.md (#1199) (`5efe42fa`)
- Create README-id.md (#1205) (`508d9b3a`)
- ci: update Issue-Handler.yaml (#1198) (`ffbade5e`)
- translate(strings): translated using Weblate (Punjabi) (#1226) (`34c8c25e`)
- feat: add playlist title to subdirectory options (`d8475c2f`)

## 2023-12-14

### ✦ Recent changes

- feat: show social links for sponsors (`4fa91ee1`)

## 2023-12-11

### ✦ Recent changes

- docs(readme): update sponsor info (`979d30cb`)

## 2023-12-10

### ✦ Recent changes

- feat: requested formats (`fd80187a`)

## 2023-12-07

### ✦ Recent changes

- fix: download page bottom sheet animation (`d0c83452`)
- fix: json parse error (`3e9aa0fe`)
- feat: download directory dialog (WIP) (`cabbbfd5`)

## 2023-12-04

### ✦ Recent changes

- docs(readme): update sponsor info (`69e0c9a1`)

## 2023-11-22

### ✦ Recent changes

- refactor: migrate from accompanist-systemuicontroller to androidx implementation (`9c49d206`)
- chore: update dependencies (`ad7ce10f`)
- feat: restrict filenames (`726794e3`)

## 2023-11-19

### ✦ Recent changes

- refactor: `DynamicColorImageVectors` & clean up dependencies (`98ff387f`)
- fix(ui): modal bottom sheet with 3-button navigation (`7f7cd381`)
- chore: remove compose md2 dependencies (`31960d63`)
- docs(readme): add zh_Hant and rename zh to zh_Hans (#1194) (`8cee9861`)

## 2023-11-18

### ✦ Recent changes

- feat: migrate to `ImageVector` (WIP) (`f367db04`)
- chore: release v1.11.0 (11100) (`04598a1b`)
- Translated using Weblate (German) (#1192) (`fce5af6f`)
- chore: make version codes ABI-aware (`26b39653`)
- feat: remove video id from filename by default (`f1fffabb`)

## 2023-11-14

### ✦ Recent changes

- fix: textfield (`9bc5af01`)
- fix: add min/max lines for textfields (`0626aa30`)
- chore: release v1.11.0-rc.3 (11100) (`31d71e46`)
- fix: edit empty file (`07c48359`)
- feat: show selected audio conversion format (`27cbefc3`)
- feat: add format sorting to download settings dialog (`3875a3f9`)
- feat: move archive file to internal storage (`818b0845`)

## 2023-11-09

### ✦ Recent changes

- fix(ui): quick download not working (`633718ad`)
- feat(ui): add supporter to sponsor page (`d0d53b8d`)
- fix(a11y): add content descriptions (`3bb26369`)
- chore: release v1.11.0-rc.2 (11100) (`30401c95`)
- fix(ui): bottom sheet cannot be dismissed (`3ca92016`)
- refactor(ui): migrate to M3 `ModalBottomSheet` (`44506a5f`)

## 2023-11-08

### ✦ Recent changes

- Translated using Weblate (Belarusian) (#1178) (`fcd646e9`)
- feat(ui): animated visibiltiy for show more actions (`efc6f71f`)

## 2023-11-06

### ✦ Recent changes

- docs(readme): update sponsor info (`96d77ea7`)

## 2023-11-05

### ✦ Recent changes

- feat(ui): text changes (`ee9be84e`)
- feat(ui): limit the number of items to display in format page (`a849dbaf`)
- fix: ui fix (`57157dd3`)
- feat: subtitle selection dialog (`ae44927d`)
- fix: multiple clicks causing duplicate navigating behaviors (google/accompanist #1320) (`e8ac5b2b`)
- feat: subtitle selection dialog (wip) (`b67b7547`)

## 2023-11-01

### ✦ Recent changes

- chore: release v1.11.0-rc.1 (11100) (`b4675ab8`)
- docs: update changelogs (`d9c1e3b4`)
- feat: display the path to download archive & tmp files (`60d105b5`)
- feat: ui changes (`e8c530bc`)
- fix: empty backstack (`f30bc765`)

## 2023-10-31

### ✦ Recent changes

- Translated using Weblate (Chinese (Simplified)) (#1168) (`f6e4505d`)

## 2023-10-30

### ✦ Recent changes

- docs(readme): update sponsor info (`0c587ff8`)

## 2023-10-29

### ✦ Recent changes

- fix: video uploader fallback (`58a11c41`)

## 2023-10-27

### ✦ Recent changes

- fix: move archive file to external directory (`e4f1cc67`)

## 2023-10-25

### ✦ Recent changes

- fix: disable embed subtitles when downloading audio (`42b35ec9`)
- fix: tmp directory not created (`01a048ea`)
- feat: prefer https proto for legacy formats (`f10793d1`)

## 2023-10-24

### ✦ Recent changes

- fix: ui bugs (`91be7a73`)
- docs: update README-ru.md (#1155) (`df7db85b`)
- fix: ui bugs (`ff3bcfa4`)

## 2023-10-23

### ✦ Recent changes

- docs: update changelogs (`e0b13d2b`)
- feat: cancel button without video card (`642ff01c`)
- chore: release v1.11.0-beta.2 (11000) (`339fef96`)
- chore: update dependencies (`a988ac02`)
- Translated using Weblate (Chinese (Simplified)) (#1153) (`8cbd0f3b`)
- feat: sponsorblock categories input chips (`a94e8a27`)
- feat: cancel button (`c83ee62e`)

## 2023-10-19

### ✦ Recent changes

- fix: ui bugs (`7e28f636`)
- feat(ui): move actions in format page to dropdown menu (`b8e866d6`)
- feat(subtitle): allow saving subtitles when downloading audio (`31f92c90`)

## 2023-10-17

### ✦ Recent changes

- fix(videoinfo): make uploader_id as fallback to uploader (`11082f3e`)

## 2023-10-16

### ✦ Recent changes

- feat: make embed metadata in audio files optional (`d07b8777`)

## 2023-10-12

### ✦ Recent changes

- feat(cookies): ui improvements (`c8ac77c8`)
- feat(download): download archive (`c1a061aa`)

## 2023-10-11

### ✦ Recent changes

- feat(settings): add supporting text to textfield (`b0327ea8`)

## 2023-10-10

### ✦ Recent changes

- fix(playlist): add list saver (`cc1a3ba7`)
- ci: sponsor updater (`725675ab`)
- fix(playlist): make selected items saveable (`a714ef1e`)
- feat: use auto-mirrored icons (`ee54fdcf`)

## 2023-10-09

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@cab9f3d8615f9d6a90b854777c73d2a0ae1992b9 🚀 (`542b713c`)

## 2023-10-07

### ✦ Recent changes

- fix: rename video when using custom output template (`cab9f3d8`)

## 2023-10-05

### ✦ Recent changes

- docs: update changelogs (`e7c1ec54`)
- chore: release v1.11.0-beta.1 (`ea90f303`)
- feat: default output template (`95ad3988`)

## 2023-10-04

### ✦ Recent changes

- feat: custom output template (`a75e39b3`)
- fix: ui tweaks (`2a7b6a16`)
- docs: update README-sr (#1125) (`89a20b01`)
- fix: tooltip (`a8ee9fc2`)

## 2023-10-03

### ✦ Recent changes

- fix: clear tmp files (`c68d5508`)
- fix: playlist info json (`07d1855b`)
- fix: walkaround for incomplete youtube playlist info (`3d751166`)

## 2023-10-02

### ✦ Recent changes

- chore: bump up a lot of dependencies (`1641e90c`)
- fix: ui bugs (`b491c7de`)
- feat: remove id in output template (WIP) (`5ffe3a47`)
- feat: add help dialog for custom commands (`3f335d92`)
- feat: use external tmp directory (`dc284f6b`)

## 2023-10-01

### ✦ Recent changes

- Translated using Weblate (Hindi) (`e1ebf67a`)

## 2023-09-30

### ✦ Recent changes

- Translated using Weblate (Russian) (`1f69a031`)
- Created README-sr (#1089) (`761f863b`)

## 2023-09-29

### ✦ Recent changes

- Create README-ja.md (#1117) (`08e452a8`)

## 2023-09-18

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@8ab8c8c15f9e9b71af673db2eba2143b4cb2baef 🚀 (`854caf66`)

## 2023-09-12

### ✦ Recent changes

- Rewrite of Issue-Handler.yaml (#1021) (`8ab8c8c1`)
- Russian README (#1011) (`b5e5c070`)

## 2023-09-11

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@7d48d61fe47ca5381b2250bd6fdae101eeda90c9 🚀 (`26eb1b09`)

## 2023-09-03

### ✦ Recent changes

- fix: share action not working (`7d48d61f`)
- feat: export cookies to text file (`f153b763`)

## 2023-09-01

### ✦ Recent changes

- fix: add toolchain resolver plugin (`bba0a60b`)

## 2023-08-30

### ✦ Recent changes

- chore: release v1.10.0 (11000) (`8e0157d4`)
- Translated using Weblate (Chinese (Simplified)) (#1029) (`e7271225`)

## 2023-08-29

### ✦ Recent changes

- feat: misc ui changes (`4e507571`)

## 2023-08-27

### ✦ Recent changes

- fix: ui bug & accessibility issue (`8f89abcc`)
- fix: make user agent header optional (`c993686d`)
- ci: update issue handler (`6b6d3fc7`)
- fix: app creates default custom commands at launches by accident (`3cc524fd`)

## 2023-08-26

### ✦ Recent changes

- docs: update changelogs (`57a11593`)
- chore: release v1.10.0-rc.1 (`fc667bf8`)
- fix: segmented button ui bug in specific display languages (`25b9976d`)
- fix: app crashes when trying to clear the command templates (`6815d70c`)
- feat: ui changes to custom commands task list page (`126f3cf0`)
- feat: add prefix to cookies url (`6558d073`)
- feat: ui changes to yt-dlp update preference (`b8788f2c`)

## 2023-08-25

### ✦ Recent changes

- fix: connectWithDelimiter (`d4901c99`)
- feat: multi-selection for command templates (`55d2c567`)
- fix: settings ui bugs (`b0d5ba94`)
- fix: ui bugs (`14e4bfbb`)

## 2023-08-24

### ✦ Recent changes

- fix: write back refreshed cookies into the temp file (`39f05392`)
- feat: add audio conversion dialog to configuration menu (`91ea744e`)

## 2023-08-23

### ✦ Recent changes

- fix: ui internal changes (`167fe68b`)
- fix: ui internal changes (`8236552a`)
- fix: missing option in audio quality dialog (`b0312ac8`)
- fix: ui internal changes (`718cd2ae`)
- feat: CookiesQuickSettingsDialog for refresh & toggle cookies in configuration dialog (`4a142a75`)
- fix: check if ua is initialized (`177b74b9`)
- feat: add user agent header when downloading with cookies enabled (`082109d3`)
- fix: show subtitle language code when name & protocol are unavailable (`ecad6ae4`)
- fix: ui bugs in configuration dialog (`24030e7a`)

## 2023-08-22

### ✦ Recent changes

- chore: release v1.10.0-beta.5 (10920) (`d3c19603`)
- feat: update translations (`c4b48340`)
- Translated using Weblate (Punjabi) (#1002) (`a4e7a881`)
- docs: update changelogs (`c6ef9ae2`)
- chore: update github issue template (`6939d237`)
- chore: update github issue template (`9d90e3da`)
- feat: show icon for formats with unknown codec (`e28a899c`)
- feat: add icons to format items (`d5a92aca`)
- fix: hide video only formats when save as audio enabled (`bd092375`)
- fix: scan custom commands directory when download finishes (`f465ea80`)
- feat: add auto-captions support to subtitle language selection (`b018318d`)

## 2023-08-21

### ✦ Recent changes

- feat: subtitle language selection (`a808b33b`)
- Add project icon (#966) (`eccdc125`)
- Deploying to main from @ JunkFood02/Seal@a09cc168c86148ecee844329bac59c4091901bab 🚀 (`d7b1841c`)

## 2023-08-18

### ✦ Recent changes

- feat: ui changes (wip) (`5eaae27b`)

## 2023-08-14

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@1b67abd6b595915ca3e5b37d37baa8cb5852dfe8 🚀 (`a09cc168`)

## 2023-08-13

### ✦ Recent changes

- chore: update dependencies & fix range slider (`e0ac1250`)

## 2023-08-10

### ✦ Recent changes

- chore: release v1.10.0-beta.03 (`1b67abd6`)
- fix: custom command directory folder picker (`7e76d8d2`)
- feat: internal changes (`4d24d56e`)

## 2023-08-08

### ✦ Recent changes

- fix: parsing error with decimal value in width/height (`9a21509b`)

## 2023-08-07

### ✦ Recent changes

- feat: ui changes to video format dialogs (`eef148ef`)

## 2023-08-04

### ✦ Recent changes

- feat: ui internal changes (`3d9ae071`)
- refactor: ui internal changes (`918390cb`)

## 2023-07-26

### ✦ Recent changes

- feat: directory configuration for custom command (`5b77ae39`)

## 2023-07-21

### ✦ Recent changes

- feat: custom command directory (WIP) (`6a76072b`)

## 2023-07-17

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@1e4f8f20e1b9f81027465cffcf552112baf07f15 🚀 (`a715d02c`)

## 2023-07-14

### ✦ Recent changes

- feat: add help text (`9389946f`)

## 2023-07-12

### ✦ Recent changes

- fix: could not video info when originalUrl is null (`1b81bc5e`)

## 2023-07-10

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@3a1bab3be4d93e5c97a457e35bd1d698283952d8 🚀 (`1e4f8f20`)

## 2023-07-07

### ✦ Recent changes

- feat: enable notifications by default (`e79360d2`)

## 2023-07-06

### ✦ Recent changes

- feat: mark embed subtitle as experimental (`24ec0361`)
- fix: audio codec (`a60b5a05`)
- fix: ci (`297a3194`)
- feat: add description label for video formats (`3cac9d29`)

## 2023-07-05

### ✦ Recent changes

- Update strings.xml • Fix grammatical error (#922) (`3a1bab3b`)

## 2023-07-03

### ✦ Recent changes

- fix: remove redundant permission (`b41f8fa7`)

## 2023-06-29

### ✦ Recent changes

- feat: add proxy configuration (`68506c79`)

## 2023-06-24

### ✦ Recent changes

- feat: ui internal changes (`5a3bb407`)
- feat: update surface container roles to m3 color scheme (`e5d0a913`)
- fix: specify foreground service type (`aa5d7a87`)
- chore: update changelog (`3e424650`)
- feat: update target api to 34 (Android 14) (`eb21e5e1`)
- feat: add swedish language support (`436df81f`)
- chore: bump up dependencies (`9a9f9b8f`)
- chore: upgrade Gradle & AGP (`354eef56`)
- fix: display unavailable videos in playlists (`5da662b5`)

## 2023-06-23

### ✦ Recent changes

- Translated using Weblate (Chinese (Simplified)) (#887) (`44255cb7`)
- fix: add `if` conditional in `sponsor.yml` (#854) (`50b9f379`)

## 2023-06-12

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@882fcb37d64cac1771b9e257f60a7b98dd4f09f3 🚀 (`d67278da`)

## 2023-05-31

### ✦ Recent changes

- feat: modify default seed color (`f2298538`)
- fix: ci (`882fcb37`)
- docs: update readme (`cd709395`)
- docs: update contributing guide (`e56959d5`)

## 2023-05-30

### ✦ Recent changes

- chore: bump up version & dependencies (`b3be6128`)
- feat: show `PlainToolTip` when long-press on `PlaylistItem` (`b00fe8dd`)
- feat: create custom command task in task list (`22c3ebdc`)
- fix: `HorizontalPager` (`79e23a81`)
- feat: `animateItemPlacement` for task list (`7431eb0a`)
- feat: `TaskCreatorDialog` (WIP) (`ec356858`)
- Create README-az.md (#794) (`b6638eb8`)
- chore: bump up dependencies & deprecate `accompanist-navigation-animation` (`d15bd88c`)

## 2023-05-29

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@62137184e9804e42b41b955ec0e21ab8a8654560 🚀 (`d76ed529`)
- fix: cookies cannot be disabled after clearing all cookies (`62137184`)

## 2023-05-28

### ✦ Recent changes

- refactor(color): migrate to kotlin (`33b6922e`)
- fix: `SponsorData` parsing error (`258b43c5`)
- Update sponsor.yml (`6d2fa0bf`)
- Update MetaIssueHandler.yaml (`f439e226`)

## 2023-05-27

### ✦ Recent changes

- Update sponsor.yml (`6c35eb0e`)

## 2023-05-26

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@c0f3c9e97039898525e412d42be00f432dbd3cc6 🚀 (`38daf6c9`)
- Action to handle Meta issues (#778) (`c0f3c9e9`)

## 2023-05-23

### ✦ Recent changes

- UI internal changes (`d24b033e`)
- Added bundles to libs.versions.toml and updated build.gradle.kts file (#780) (`de11d8ff`)

## 2023-05-22

### ✦ Recent changes

- Update README (`f873aef7`)
- Update README (`5b11183d`)
- Update README (`02c6dfc7`)
- Added Italian version of README.md (#738) (`c0327a1c`)

## 2023-05-21

### ✦ Recent changes

- Setup Android SDK for CI (`f02dd6d0`)
- Fix CI (`0053de10`)
- Bump up AGP version (`b7ab9f75`)

## 2023-05-19

### ✦ Recent changes

- Fix: Add keep rules (`c2711661`)
- Fix: App crash due to R8 optimiztion (`ee52a5e9`)

## 2023-05-15

### ✦ Recent changes

- Add monochrome theme (`5c07f7b7`)
- Add `ToolTip`s to `IconButton`s (`41ced92d`)

## 2023-05-09

### ✦ Recent changes

- UI internal changes (`136326d5`)
- Update screenshots (`5e65d98a`)

## 2023-05-08

### ✦ Recent changes

- Update JDK version of Actions (`9e7f3e0f`)
- Convert to Kotlin & Add colors to palette (`4f469693`)
- Update `Hct` with the `material-color-utilities` implementation (`debd0ef7`)
- Turn off obfuscate of R8 (`e75138d4`)
- Add `CrashReportActivity` (`1dedc078`)
- Enable automatic per-app language support (`2df72b6f`)
- Translated using Weblate (Azerbaijani) (#746) (`e3ab33a8`)

## 2023-05-07

### ✦ Recent changes

- Add UncaughtExceptionHandler (`af701f2d`)
- Update gradle version of Actions (`ca9c6b31`)
- Pre-release v1.10.0-beta.2 (`468f6be8`)
- Bump up dependencies & gradle (`9bcfe5f1`)
- Room: Migrate to KSP (`ebc64484`)
- Fix：Transparent `statusBarColor` at launches (`e523569e`)
- Update colors of components (`d21feb2e`)
- Remove deprecated `HorizontalPager` (`08484791`)
- Update colors of components (`2c286458`)
- Update `ColorScheme` to reflect the new `Fixed` roles (`e0e44646`)

## 2023-05-04

### ✦ Recent changes

- UI internal changes (`f297f8ca`)
- UI: Move Videos to the bottom of the `FormatPage` (`c9081f17`)

## 2023-05-03

### ✦ Recent changes

- Feature: Split video by chapters (WIP) (`3c2a0e4d`)

## 2023-05-02

### ✦ Recent changes

- Feature: Convert subtitles (`03cc593a`)

## 2023-05-01

### ✦ Recent changes

- UI internal changes (`9d521dcd`)

## 2023-04-30

### ✦ Recent changes

- Pre-release v1.10.0-beta.1 (10920) (`4efc0eed`)
- UI internal changes (WIP) (`46180ba3`)

## 2023-04-29

### ✦ Recent changes

- Update youtubedl-android (`081ebb4f`)

## 2023-04-28

### ✦ Recent changes

- Add Tone-based `Surface`s (`1c8a6291`)

## 2023-04-27

### ✦ Recent changes

- UI fixes (`e38272d5`)
- Update `ColorScheme`s to reflect the new `Surface` tones (`8ef2a248`)
- Update youtubedl-android (`23e12aa2`)
- Deploying to main from @ JunkFood02/Seal@03546b6777f84cd377348b8bea1870e8da145fc5 🚀 (`f16fbea5`)
- Update changlog (`03546b67`)
- Release v1.9.2 (10920) (`6c042d3c`)
- Fix: Incognito mode not working in v1.9.1 (`ce704270`)
- Fix: Misplaced quality tags in `AudioQuickSettingsDialog` (`dacecea2`)
- Fix: Mismatched formats when using Save as audio & Download playlist (`d987d68a`)
- Translated using Weblate (Czech) (#726) (`9792a220`)

## 2023-04-14

### ✦ Recent changes

- Bump up dependencies (`b3cf2d4a`)

## 2023-04-11

### ✦ Recent changes

- Fix: Error when parsing sponsor data (`9064ce09`)
- Deploying to main from @ JunkFood02/Seal@ae72ea320f3d04e4dcd98adb6b9141bcbff4580d 🚀 (`3ee49de6`)
- Release v1.9.1 (10910) (`ae72ea32`)
- Update Changelogs (`c94cab35`)
- Modify `AndroidManifest.xml` (`5b0a3d3a`)

## 2023-04-10

### ✦ Recent changes

- Translated using Weblate (Chinese (Traditional)) (#688) (`4e086c36`)
- Fix: OutputStream for custom commands (`7383e6be`)
- Fix: Battery Hint (`fa133846`)
- UI changes (`f87bc0cf`)
- Use GraphQL to query Sponsors (`cec8dc3e`)

## 2023-04-09

### ✦ Recent changes

- Redesign download dialog (WIP) (`4ca09f8c`)
- Redesign SponsorPage (WIP) (`f7f12da6`)

## 2023-03-28

### ✦ Recent changes

- Modify parameters (`5987a343`)

## 2023-03-25

### ✦ Recent changes

- Add `SponsorItem` (`47c642d2`)
- Deploying to main from @ JunkFood02/Seal@8721fad36b9f4b1e184836f80787bcda1b560cc2 🚀 (`2acd4c3a`)
- Update README.md (`8721fad3`)
- Create sponsor.yml (`9811cef2`)
- Update README.md (`525d935b`)

## 2023-03-24

### ✦ Recent changes

- Deploying to main from @ JunkFood02/Seal@9811cef2151b671fcb11bd87a939e576e7524243 🚀 (`2ec497a0`)
- Add link to GitHub sponsor (`70ef2e1a`)
- Fix: Videos not scanned into media library when private mode enabled (`65a9a173`)

## 2023-03-21

### ✦ Recent changes

- Create .github/FUNDING.yml (`f7494697`)

## 2023-03-16

### ✦ Recent changes

- Move temp directory to `cacheDir` (`c441409c`)
- Remove redundant haptic feedback (`b6cd3b96`)

## 2023-03-14

### ✦ Recent changes

- Update CHANGELOG.md (`35c583de`)

## 2023-03-13

### ✦ Recent changes

- Add `-v` flag when using detailed output (`7422cfad`)

## 2023-03-12

### ✦ Recent changes

- Release v1.9.0 (10900) (`13c715c6`)
- Translated using Weblate (Azerbaijani) (#669) (`5bbcbb0e`)
- Update changlog (`e0cdb5cb`)
- Fix typo (`2b62edf2`)

## 2023-03-11

### ✦ Recent changes

- Fix: Set `TextDirection` of `TextStyle` to content-aware (`303e6f55`)

## 2023-03-09

### ✦ Recent changes

- Fix: UI Bug with SVGs in large screens (`890baf6a`)
- Add legacy icons for API 28- (`9924941e`)
- Release v1.9.0-rc.2 (10900) (`92e7127e`)
- Update changelogs (`2e8ed5d4`)
- Translated using Weblate (Chinese (Simplified)) (#663) (`81dda383`)
- Fix: App crashes when toasting in Android 5.0 (`51077985`)

## 2023-03-08

### ✦ Recent changes

- Fix: App crash when fetching updates without network connections (`4138bdf1`)
- Fix: Video clip not disabled (`06ed5a8a`)
- Corrected the Arabic language name. (#657) (`2945907c`)

## 2023-03-07

### ✦ Recent changes

- Fix: Disable format settings when using custom format sorter (`88015f15`)
- UI: Add dialog for F-Droid builds in Auto-update settings (`288f10e0`)
- Feature: Delete outdated apk at launches (`e890118a`)
- Fix: Video clip not enabled (`681eada7`)
- Release v1.9.0-rc.1 (10900) (`549b1027`)
- Feature: Share the url of thumbnail in `FormatSelectionPage` (`e24809f3`)
- Update changelogs (`d0308d1f`)
- Feature: Embed thumbnail into videos (`e30861c5`)

## 2023-03-06

### ✦ Recent changes

- Translated using Weblate (Spanish) (#655) (`680061bc`)
- UI: `AudioQuickSettingsDialog` & `VideoQuickSettingsDialog` (`c08771e2`)
- UI: yt-dlp update settings (`4535c191`)
- Fix: Disable video quality when saving files as audio (`9702f80a`)
- Change yt-dlp nightly channel to the official one (`eb30dd51`)

## 2023-03-05

### ✦ Recent changes

- Mark clip video as experimental feature (`f125013d`)
- Add strings (`ac41a5d3`)
- Add audio format preference in configuration dialog (`5ab0d6f6`)
- Fix: UI bug in `FormatPage` (`640d1720`)

## 2023-03-04

### ✦ Recent changes

- New Changes to README & README - AR (#651) (`a4a6efbc`)

## 2023-03-02

### ✦ Recent changes

- Release v1.9.0-beta.3 (10820) (`16c96374`)
- Update changelog (`690100be`)
- Fix: temporary directory not available with custom commands (`facc1d93`)
- Translation updates (`21f5f4f9`)
- Translated using Weblate (Serbian) (#647) (`0566bcd6`)
- Update strings (`c8927c48`)
- UI changes (`1ec658d5`)

## 2023-03-01

### ✦ Recent changes

- Fix: Private mode conflicts with SD card download (`d96bc8fe`)
- Illustration change (`9f85d026`)
- Fix: App icon (`56085cf3`)
- UI Bug Fix: progress text (`f32aa57e`)
- Add illustrations for empty pages (`1e0d2ed1`)
- Speficy gradle version for actions (`103028d0`)
- Fix CI error (`e720c2e1`)
- Add illustration in `CreditPage` (`790159e7`)
- Throw the `Throwable` to the upper caller when moving files (`a622fcdc`)

## 2023-02-28

### ✦ Recent changes

- Modify container color (`c6f0afc4`)

## 2023-02-27

### ✦ Recent changes

- Color mapping of `SVGString` (`3fa3b117`)
- Update strings (`a179047d`)
- Update bug_report.yml (`03ac9278`)

## 2023-02-26

### ✦ Recent changes

- Bump up dependencies (`9905cdc5`)

## 2023-02-25

### ✦ Recent changes

- SVGString (`61c361c6`)
- Bump up yt-dlp version to `2023.02.17` (`beda7ee0`)

## 2023-02-24

### ✦ Recent changes

- Add SVG & Dynamic color implementation (`d93d72ff`)

## 2023-02-23

### ✦ Recent changes

- Add strings (`5c4240d1`)

## 2023-02-22

### ✦ Recent changes

- UI: `SingleChoiceItem` (`c7868547`)
- Remove: File size preference (`72c3766f`)

## 2023-02-21

### ✦ Recent changes

- Fix: Remove invalid UA (`9c122f75`)
- Add option for temporary directory (`6547c7bc`)

## 2023-02-20

### ✦ Recent changes

- Main README & README-ar Update.md (#613) (`0b07a412`)
- Update Changelogs (`bc6c1e08`)
- Change the thread number range of multi-threaded download to 1-24 (`746a3de4`)
- Add: Auto update switch for yt-dlp (`cad4453a`)
- Fix: Audio Conversion (`cdac68c0`)
- Translated using Weblate (Portuguese (Brazil)) (#628) (`e65c926e`)
- Rewrite of the ISSUE_TEMPLATE (#623) (`62117b1d`)

## 2023-02-19

### ✦ Recent changes

- Fix: UI bug in `ShortcutChip` with long template & Change spaces to newlines (`be7024fd`)
- UI: Add `Badge` on the icon to indicate the count of running process (`614c3d65`)
- UI: Move operations to `DropdownMenu` (`3e3f4a26`)
- Fix: Empty subtitle language breaks downloads (`f740d03c`)
- Bug Fix: Cannot parse file sizes in `Float` type (`0568b606`)

## 2023-02-18

### ✦ Recent changes

- Bug Fixes (`8e978a31`)

## 2023-02-16

### ✦ Recent changes

- Fix: Audio conversion (`69ca93b7`)
- Bump up MD3 version (`f1b462ac`)

## 2023-02-14

### ✦ Recent changes

- Added Persian language to README (#596) (`f7af5c15`)
- Bump up version (`6aec4804`)

## 2023-02-13

### ✦ Recent changes

- Code cleanup & Add legacy app icon (`c2762ce0`)

## 2023-02-12

### ✦ Recent changes

- Translated using Weblate (Persian) (`2cc62a80`)
- Fix: flush cookies when generate new cookies (`06136a24`)
- Fix: Languages not visible in system settings (`37442b30`)
- Fix: Download section error when using Arabic numerals (`3bc8aa41`)
- Remove the error toast caused by the initialization of cookies (`0933c4d7`)
- Change status bar icon to filled icon (`df10efe0`)
- Delete README-th.MD (`f5c89ef5`)
- Fix md file extenstion (`f6baaa71`)
- Add README-th.md  (#589) (`897a7ea1`)

## 2023-02-11

### ✦ Recent changes

- Add "display over other apps" permission & Set overlay type for window (`812f3742`)
- Translated using Weblate (Basque) (#588) (`9e22ed9e`)
- Update changelogs (`d49bbf9d`)

## 2023-02-10

### ✦ Recent changes

- Fix toast causing app crashes (`c47631a4`)
- Update changelog (`66135091`)

## 2023-02-09

### ✦ Recent changes

- Fix: ID conflicts when importing custom templates (`81289cce`)

## 2023-02-08

### ✦ Recent changes

- Use originalUrl instead of webpageUrl for downloading (`d9c07fb6`)
- Initialize cookies at launches (`3b847221`)
- Fix: Limit the max width of log text (`97eb2538`)

## 2023-02-07

### ✦ Recent changes

- Delete cookies & UI changes (`484e22c4`)
- Read cookies directly from the SQliteDatabase of WebView (`bb82eccd`)
- Revert the URL intent filters (`f0072968`)

## 2023-02-06

### ✦ Recent changes

- Update changelogs (`c752f1d2`)
- ClipDialog TextField UI Improvements (`33f0c26a`)
- Add `mm:ss` text fields to clip dialog & accessbility support (`9ad62bd7`)
- Feature: Rename video before downloading in `FormatSelectionPage` (`9175d3da`)
- Modify strings & paddings (`fbbe4d35`)
- Feature: Sorting formats with `-S` option of yt-dlp (`3db82724`)
- Fix: Unexpected ordering of `acodec` & `abr` (`f3f83dff`)
- Feature: Audio quality preference (WIP) (`466c5e5c`)
- Fix: Notifications not dismissed after download canceled (`6ec28484`)
- Add `horizontalScroll` to `LogPage` (`c129e8b3`)

## 2023-02-05

### ✦ Recent changes

- Feature: Audio format & quality preferences (WIP) (`7a419782`)
- Fix: Disable floating windows to avoid UI bug in `QuickDownloadActivity` (`c26b32db`)

## 2023-02-04

### ✦ Recent changes

- Translated using Weblate (Ukrainian) (#567) (`0a9a7dc4`)
- Fix duplicated filename with multiple clips (`a79347e8`)
- Add translations (`61ef9aa4`)
- Add `VideoClipDialog` (`1f98ff74`)
- Custom dialogs (`8a8f4436`)
- Release v1.8.2 (`b6f2d6ff`)
- Fix: Trimmed ASCII characters filename (`7b78a793`)

## 2023-02-03

### ✦ Recent changes

- `CustomRangeSlider` & Apply clipping to audio downloads (`8b24fa8a`)
- Feature: Make video clip in `FormatSelectionPage` (WIP) (`17f3423e`)
- Fix crop command (`2bfe93de`)

## 2023-02-02

### ✦ Recent changes

- Feature: Select update channel (Stable, Nightly) for updating yt-dlp (`b3ba2c6e`)

## 2023-02-01

### ✦ Recent changes

- Feature: Auto update (`19ea2ff7`)
- Refactor `UpdateUtil` (WIP) (`1c270fe5`)
- Add share operation in `VideoDetailDrawer` (`650a7260`)
- Update changelog & release v1.8.1 (10810) (`4c23f2de`)
- Refactor `TextUtil` (`443a63b4`)
- Fix: Error when croping verticle thumbnails as artwork (`3a0212d8`)
- Fix: Unexpected error when downloading multiple video to SD card with quick download (`48354b58`)
- Update changelog & release v1.8.1 (10810) (`9c2de777`)
- Disable SD card download when the directory is not set (`c2d114b4`)
- Fix: App crashes when downloading in private mode (`04e178f0`)

## 2023-01-31

### ✦ Recent changes

- Translated using Weblate (Chinese (Simplified)) (#553) (`fd5a5c2e`)
- Fix: `null` Error report notification in quick download (`18fe706a`)
- Add `toFileSizeText()` (`5d4b3a18`)

## 2023-01-30

### ✦ Recent changes

- Modify `imeAction` & `SingleChoiceItem` (`c4b4bd0d`)
- Update changelog (`d789fafc`)

## 2023-01-29

### ✦ Recent changes

- Bump up dependencies (`7d7a0130`)
- Release v1.8.0 (10800) (`ecb95347`)
- Translated using Weblate (Japanese) (#545) (`9727d459`)
- Bump up version (`ce801b0c`)
- Bump up version (`b4506a50`)
- Change LongClick operation of `FormatItem` to share stream url (`c390d14a`)
- Add `ImeActions` & `KeyBoardActions` to `TextField` (`65a3b5cb`)

## 2023-01-28

### ✦ Recent changes

- Fix: Notification not canceled after opening videos (`96196c56`)
- UI internal changes (`cf4608a8`)

## 2023-01-25

### ✦ Recent changes

- Add msg on MKV remuxing with subtitle embedding (`dbd23859`)
- Fix: `QuickDownloadActivity` does not follow app language (`94dd3461`)

## 2023-01-22

### ✦ Recent changes

- Release v1.8.0-rc.2 (10800) (`7f6ea67c`)
- Add CHANGELOG.md (`b3e8c192`)

## 2023-01-21

### ✦ Recent changes

- Translated using Weblate (Chinese (Simplified)) (#522) (`31894e5d`)
- Bump up AGP version (`00fc900f`)
- Bump up version (`a5383c73`)
- Accessibility improvements (`524ee88f`)

## 2023-01-20

### ✦ Recent changes

- Display message when using sponsorblock with subtitles (`394a7692`)

## 2023-01-19

### ✦ Recent changes

- Revert playlist items limit (`125b9a01`)

## 2023-01-18

### ✦ Recent changes

- UI: Remove share toasts (`a999e9ce`)

## 2023-01-17

### ✦ Recent changes

- Fix: Custom subdirectory not parsing playlist info (`a10e4fec`)

## 2023-01-16

### ✦ Recent changes

- Fix: notification settings (`ed87d7ad`)
- Fix: Display response when task finishes (`1c575c07`)

## 2023-01-15

### ✦ Recent changes

- Update README.md (`9b9f3fe6`)
- Add translations (`df4afe83`)
- Feature: TaskLogPage (`b47fa39c`)
- Add callback to chips (`affb85b4`)
- Modify color scheme of components (`a818c60c`)

## 2023-01-14

### ✦ Recent changes

- TaskListPage (WIP) (`16d4a792`)
- Bump up version (`790854f4`)
- Backup shortcuts to clipboard (`af3f8c0f`)
- Update templates (`3401413e`)

## 2023-01-13

### ✦ Recent changes

- Feature: Custom shortcuts for building command templates (WIP) (`1c91c94d`)
- Add clear button (`845aa043`)
- Modify language settings (`9efd0196`)
- Feature: copy the response of custom command requests (`eabe2615`)
- Change default values (`53c318e5`)
- Feature: Subtitle preferences (`5c50f9f0`)

## 2023-01-12

### ✦ Recent changes

- Refactor `PreferenceUtil` (`1dcbf08d`)
- Translated using Weblate (Azerbaijani) (`dea02748`)
- UI Improvements (`04fe4ae5`)
- Add license for credit (`7ac58537`)
- Bug Fix: File unavailable (`b44c225f`)
- Credit (`5c18b378`)
- Play with `Palette` (`738026ed`)

## 2023-01-11

### ✦ Recent changes

- UI Changes (`b1454949`)
- Scan the download directory after executing commands (`42d1780f`)
- Implement `Downloader.quickDownload()` (`8b01dc3a`)
- Modify motions (`6c9a4cdf`)
- Process Id exist error when preference dialog unabled (`2627b064`)

## 2023-01-10

### ✦ Recent changes

- Fix: Notification stuck with private mode enabled (`275601e5`)
- Check if `Downloader` is available (`27c5ee4b`)
- Add translations (`d5cf3566`)
- Add `"--embed-chapters"` & Set new template as selected by default (`13065ba8`)
- Apply `ColorScheme` & `WindowSize` to `QuickDownloadActivity` & Improve motions (`8f9234b8`)
- Release v1.7.3 (10730) (`c31a50d3`)
- Translated using Weblate (Chinese (Simplified)) (#499) (`227aaf8a`)
- Translated using Weblate (Chinese (Simplified)) (#499) (`4a555b6b`)
- Release v1.8.0-beta.2 (10730) (`d10d0459`)
- UI: Modify paddings of components (`738b7773`)
- UI: Change horizontal paddings of top bars (`0a60987e`)
- Change easing for motions (`20c2976c`)
- `QuickDownloadActivity` (WIP) (`16fc76bf`)
- Fix: WebView captures cookies with wrong domains (`3e2bdb75`)
- Fix: WebView captures cookies with wrong domains (`49f0689a`)
- Fix: App crash with SD card download enabled (`964f0966`)

## 2023-01-09

### ✦ Recent changes

- Add msg on `FormatSelectionPage` & Bug Fix (`b6015b87`)
- Add msg on `FormatSelectionPage` & Bug Fix (`17387eb5`)
- Change minSdkVersion to 21 (`0f706689`)
- Fix: App crash when parsing channels (`a614b23c`)
- Fix: App crash when parsing channels (`2c08ba45`)
- Quick download (WIP) (`3ba2768f`)

## 2023-01-08

### ✦ Recent changes

- Fix: App crash when no formats available (`e04c0ec2`)
- Fix: App crash when no formats available (`61b0520b`)
- ShareActivity (WIP) (`5a863676`)
- UI: Bug Fix & Improvements (`14e002de`)
- UI: Bug Fix & Improvements (`4d1f31db`)
- Bug Fix: Custom commands & Error State (`2dd1bedf`)
- UI: Modify animation for navigations (`eb52cf93`)
- Feature: Embed auto-subtitles into video (`de34d16f`)

## 2023-01-07

### ✦ Recent changes

- Clear error state before starting download (`e536cd13`)

## 2023-01-06

### ✦ Recent changes

- Bug Fix: Notification not canceled after custom command finishes running (`60ea7165`)

## 2023-01-05

### ✦ Recent changes

- Open & Delete & File size query for `DocumentFile` (`aa6263c6`)
- SAF support (WIP) (`6f4b296c`)
- Bump up version (`d63ce18a`)
- Release v1.7.2 (10720) (`995e2af9`)
- Add environment variable (`51fc8449`)

## 2023-01-04

### ✦ Recent changes

- Modify color scheme of component (`fc79c9c5`)
- Release v1.7.1 (10710) (`3d9acea3`)
- Translated using Weblate (Japanese) (#480) (`8301c91b`)
- Add matrix icon (`35a4cc44`)
- Cancel playlist download & Display error report by default (`b99eb17c`)
- UI Improvements (`98651544`)
- Downloader refactoring & Bunch of Bug Fixes (`0d23a770`)
- Refactor with Kotlin codestyle (WIP) (`53be9425`)

## 2023-01-03

### ✦ Recent changes

- Refactor `Downloader` (WIP) (`a0dff84a`)

## 2023-01-02

### ✦ Recent changes

- Add TODOs (`ecd51435`)
- Rate limit for notifications (`586b711d`)
- Bug Fix: Custom command notification (`7c6bc035`)

## 2023-01-01

### ✦ Recent changes

- Refactor DownloadViewModel (WIP) (`7d55ec36`)

## 2022-12-31

### ✦ Recent changes

- Fix negative index (`e697e870`)
- Bug Fix: Edit command dialog crash (`474432c8`)

## 2022-12-30

### ✦ Recent changes

- Bug Fix: App crash after removing command templates (`17fd96bd`)
- Bump up version (`2120d5a0`)
- Fix Auto-update for Pixel 7 (arm64-v8a only) (`6a745a7b`)
- Release v1.7.0 (10700) (`ed3a14cd`)
- Add file size in total to `RemoveItemDialog` (`2c26e94c`)

## 2022-12-29

### ✦ Recent changes

- Translated using Weblate (Arabic) (#460) (`6ab1f075`)

## 2022-12-28

### ✦ Recent changes

- Update README.md (`0fbc583c`)
- Update README.md (`264356cd`)
- Update Screenshots (`78010013`)
- Marking methods as `@Transaction` (`b944b804`)

## 2022-12-27

### ✦ Recent changes

- Add `TriStateCheckBox` (`8d89be9d`)

## 2022-12-26

### ✦ Recent changes

- Set SponsorBlockCategories as default (`9776bd94`)
- Release v1.7.0-rc.1 (10700) (`fc648e13`)
- Limit length of file name & Add tg link (`1a7b8a5f`)
- Make aria2c available in custom command (`b3e0af97`)
- Add HelpDialog & InfoItems (`28c5cdc3`)
- Bug Fix: Custom command notifications (`2dae4ab4`)
- Update strings (`df07e232`)
- Bump up version (`5c59330a`)
- UI Improvements (`06c6bb98`)
- Update dependency (`873a4061`)
- Cookies & UI Components code cleanup (`7d8ff076`)

## 2022-12-25

### ✦ Recent changes

- Translated using Weblate (Ukrainian) (#451) (`cc3bfdb0`)
- Updated and enhanced Ukrainian README.md (`43289fcf`)
- Convert embedded image to jpeg (`9eae6137`)
- Treat info as VideoInfo when parsing playlist failed (`e3102305`)
- CookieProfile selection (`9a588f76`)
- Update README.md (`2603d8bd`)

## 2022-12-21

### ✦ Recent changes

- Multiple cookie profile (WIP) (`2ce35c50`)
- Grant permission for external storage (`2df59b42`)

## 2022-12-20

### ✦ Recent changes

- Bug Fix & Permission changes (`03e7ce20`)

## 2022-12-19

### ✦ Recent changes

- Language support: Punjabi (`efc41fc3`)
- Replace webview with Accompanist (`c494ab54`)
- Create config.yml (#432) (`33be306c`)
- Translated using Weblate (Punjabi) (#435) (`68106a92`)

## 2022-12-18

### ✦ Recent changes

- Add built-in WebView to generate cookies.txt for downloads (`237528ee`)

## 2022-12-15

### ✦ Recent changes

- Update README.md (`5c1faa30`)
- Update README (`aa47be4b`)

## 2022-12-13

### ✦ Recent changes

- Enable auto-update by default (`a7b9671b`)
- PreferenceUtil code cleanup (`ad038d3a`)

## 2022-12-12

### ✦ Recent changes

- Scale the embedded artwork to 300x300 (`5f17f76e`)

## 2022-12-11

### ✦ Recent changes

- Copy the url of every format (`9491f4b5`)

## 2022-12-10

### ✦ Recent changes

- Language support: Azerbaijani (`3eb3c18d`)
- Translated using Weblate (Azerbaijani) (#404) (`bbffa5af`)
- Release v1.7.0-beta.3 (10610) (`811d380e`)
- FormatPage (`a25d96fb`)
- Disable button when no format selected (`810de734`)
- Format merging & selection (WIP) (`0e49ec0c`)
- ViewModel refactor (`48df8632`)

## 2022-12-09

### ✦ Recent changes

- Register to open URLs (`a3312dd5`)

## 2022-12-08

### ✦ Recent changes

- VideoInfo parsing (WIP) (`f3b708a1`)

## 2022-12-07

### ✦ Recent changes

- Notification & FormatPage (`72184879`)
- FormatItem (WIP) (`ac1fc1f6`)

## 2022-12-06

### ✦ Recent changes

- Notification Bug Fix (`f3926a76`)

## 2022-12-04

### ✦ Recent changes

- FormatItem WIP (`d2c599fd`)
- Bug Fix (`71911c42`)

## 2022-12-03

### ✦ Recent changes

- Split view state (`20e6a03f`)
- DownloadViewModel refactor(WIP) (`d88a3c03`)
- Check for yt-dlp updates at startup (`d56e76fe`)

## 2022-12-02

### ✦ Recent changes

- Update README-ar.md (#381) (`a9082afd`)
- Release v1.7.0-beta.2 (10610) (`04a419c6`)
- Fix VideoInfo parsing error & Release v1.6.1 (10610) (`2a374a68`)

## 2022-12-01

### ✦ Recent changes

- Release v1.7.0-beta.1 (`d9167680`)
- UI Bug Fix (`deefa980`)

## 2022-11-30

### ✦ Recent changes

- Update string (`62c7fb72`)
- Simultaneous executing tasks with custom commands (WIP) (`7e331ef0`)

## 2022-11-28

### ✦ Recent changes

- Bump up version (`d476d2cb`)
- Release v1.6.0 (10600) (`5d2a0fd7`)
- Language support: Serbian & Update screenshot (`c3a21ad9`)
- Translated using Weblate (Malay) (#367) (`886f66a2`)
- Handle sponsorblock API error (`0ea20f26`)
- UI Improvements (`a5f27a35`)

## 2022-11-27

### ✦ Recent changes

- VideoInfo Bug Fix (`24a12d75`)

## 2022-11-26

### ✦ Recent changes

- UI Bug Fix (`ec626b67`)

## 2022-11-25

### ✦ Recent changes

- Replace AsyncImage (`1b2f7a1c`)
- Release v1.6.0-beta.2 (`b828126f`)
- Show approximate filesize & duration on video card (`23abd2c6`)
- Use kotlinx.serialization to parse response (`48b081bb`)

## 2022-11-17

### ✦ Recent changes

- Release v1.6.0-beta.1 (`0ecf6ea0`)
- Playlist selection refactor (`924bb894`)

## 2022-11-16

### ✦ Recent changes

- Translated using Weblate (Romanian) (#349) (`bc22a31f`)

## 2022-11-15

### ✦ Recent changes

- Bug Fix (`acef1e0a`)
- Playlist selection & Bug Fix (`492080f7`)
- Playlist & VideoInfo fetching (`1ec9522d`)
- Playlist selection(WIP) (`62a0995a`)

## 2022-11-10

### ✦ Recent changes

- Playlist preview (WIP) (`2ace2e62`)

## 2022-11-09

### ✦ Recent changes

- Playlist download refactor (WIP) (`36ce298a`)

## 2022-11-08

### ✦ Recent changes

- Bug Fix: Auto update (`1d752440`)
- Bump up version (`3f358f99`)
- Release v1.5.0 (10500) (`5265e189`)
- Translated using Weblate (Ukrainian) (#292) (`5aa35bf5`)
- Translated using Weblate (Spanish) (#335) (`735b8a8d`)
- Fix VideoCard (`8e984fda`)
- Change gradle dependencies to version catalog (#333) (`8a7f32e8`)

## 2022-11-07

### ✦ Recent changes

- Fix paddings (`88c46459`)

## 2022-11-06

### ✦ Recent changes

- Update strings (`043bd63c`)
- Release v1.5.0-beta.1 (`ce52f639`)
- Private directory (`6dc155f3`)
- Disable preview (`486aa7e7`)

## 2022-11-05

### ✦ Recent changes

- Settings refactor (WIP) (`0c49290c`)
- Display file size in videolist (`ff816ec7`)

## 2022-11-04

### ✦ Recent changes

- DownloadPage refactor (`7f86af4c`)
- Previews (`0d2f43fe`)

## 2022-11-01

### ✦ Recent changes

- Translated README in Ukrainian (#321) (`b46d6f4b`)

## 2022-10-28

### ✦ Recent changes

- Add suffix to config files (`ffc25fec`)
- Create CODE_OF_CONDUCT.md (`7dde64d3`)
- Update README.md & CONTRIBUTING.md (`b16289c5`)

## 2022-10-27

### ✦ Recent changes

- portuguese readme (#315) (`0434582f`)
- Bump up version (`d0f1a821`)
- Release v1.4.0 (10400) (`89598698`)
- Playlist Bug Fix & UI Improvement for large screens (`a486fa7a`)
- DownloadUtil refactor (`260102eb`)

## 2022-10-26

### ✦ Recent changes

- Update dependencies (`eb549991`)

## 2022-10-25

### ✦ Recent changes

- Language support: Basque, Hindi & Malayalam (`199c0dfb`)

## 2022-10-24

### ✦ Recent changes

- Translated using Weblate (Malayalam) (#296) (`000c2cc5`)

## 2022-10-23

### ✦ Recent changes

- Update CONTRIBUTING.md (`15f5a57c`)
- Bug Fix: Blank screen on MIUI devices (`380ea359`)

## 2022-10-22

### ✦ Recent changes

- Fixed MIUI devices bug showing the app in blank (finally) (#295) (`a9c0ded9`)
- Minor UI changes (`60a09cde`)

## 2022-10-21

### ✦ Recent changes

- Update sample pics (`5bbca467`)
- Translated using Weblate (Chinese (Traditional)) (#293) (`04a313ca`)
- Fix bug of download finish sign (#291) (`e90a6e22`)
- Feature Update: AV1 codec & lowest quality (`a8975202`)

## 2022-10-20

### ✦ Recent changes

- Update strings (`d9887f1b`)
- Update readme (#289) (`d87a0210`)

## 2022-10-18

### ✦ Recent changes

- Release v1.4.0-beta.2 (`928dc95c`)
- Translated using Weblate (Thai) (#286) (`f086b8d0`)
- Translated using Weblate (German) (#285) (`e0dae3dc`)
- Feature Update: High contrast dark theme (`b6b35f79`)

## 2022-10-16

### ✦ Recent changes

- Bug Fix: Invalid input in numeric textfields (`1b868a19`)

## 2022-10-15

### ✦ Recent changes

- Release v1.4.0-beta01 (`9ce3fe82`)
- Feature Update: Limit download rate (`7ad97ec2`)

## 2022-10-11

### ✦ Recent changes

- File unavailable toast (`74b8ac73`)

## 2022-10-10

### ✦ Recent changes

- Create changelog for 10350 (`8bface2a`)
- Translated using Weblate (Belarusian) (#271) (`e10ea79c`)
- Translated using Weblate (Croatian) (#270) (`42d19ff0`)
- Release v1.3.5 (10350) (`f67f597f`)
- Feature Update: Prevent downloading with cellular networks (`f99fd3d8`)

## 2022-10-07

### ✦ Recent changes

- Feature Update: Show download dialog instantly after url are shared (`6909a369`)
- Bug Fix: Check null URIs (`232c115d`)
- Release v1.3.4 (10340) (`d9ffe75a`)

## 2022-10-06

### ✦ Recent changes

- Translated using Weblate (Croatian) (#265) (`4458b32a`)
- Translated using Weblate (Croatian) (#266) (`7d22bd99`)
- Update README (`ad2b0c05`)
- README in arabic (#263) (`2c267e89`)

## 2022-10-04

### ✦ Recent changes

- Feature Update: Dynamic Color (`2b32be53`)
- Add Dynamic Color Switch (#262) (`207a999e`)

## 2022-10-03

### ✦ Recent changes

- Bug Fix: ExposedDropdownMenu (`93bb1307`)
- Auto-update for x86 builds (`241dcd6c`)

## 2022-10-02

### ✦ Recent changes

- Language support: Belarusian (`4db98b3a`)
- Release v1.3.3 (10330) (`f1e44c26`)
- Feature Update: Private Mode (`6ef40d8e`)
- Translated using Weblate (Belarusian) (#259) (`abc49a62`)
- Translated using Weblate (German) (#260) (`df3aa460`)

## 2022-09-30

### ✦ Recent changes

- Update README.md (`870ee068`)

## 2022-09-29

### ✦ Recent changes

- Update README.md (`61dd0309`)
- Create CONTRIBUTING.md (`d91ed31d`)

## 2022-09-26

### ✦ Recent changes

- Update Gradle KTS & modularization (`773a7eda`)

## 2022-09-21

### ✦ Recent changes

- Scan thumbnails into media library (`6510c5e6`)

## 2022-09-19

### ✦ Recent changes

- Create changelogs for v1.3.2 (`b82075b3`)
- Translated using Weblate (Chinese (Traditional)) (#241) (`b132d72e`)
- Release v1.3.2 (10320) (`ab1f52ec`)
- Set video format to MP4+M4A (`c9ecad79`)
- Accessibility Improvements (`588f6154`)

## 2022-09-18

### ✦ Recent changes

- Accessibility Improvement: Switches (`b4b7ee24`)

## 2022-09-17

### ✦ Recent changes

- Create StatusBarIcons (`55dd0a6c`)

## 2022-09-15

### ✦ Recent changes

- Code cleanup (`957c6e8b`)
- Release v1.3.1 (10310) (`460efcbc`)
- Translated using Weblate (Portuguese (Brazil)) (#225) (`dcd83830`)
- Translated using Weblate (Vietnamese) (#224) (`ffa59c82`)
- Feature Update: Auto Update (`38ddd8d9`)
- Bug Fix: Service not registered (`ced21142`)

## 2022-09-13

### ✦ Recent changes

- Update dependencies (`16003a8a`)
- Release v1.3.0 (10300) (`2479b6f2`)
- Translated using Weblate (Indonesian) (#217) (`34bf99d3`)
- Translated using Weblate (Russian) (#216) (`c3ffa70c`)
- Create android_ci.yml (`3db11e72`)
- Cancel all notifications when toggled off (`314adc9f`)

## 2022-09-12

### ✦ Recent changes

- Temporary file directory (`3e0177a4`)

## 2022-09-10

### ✦ Recent changes

- Pre-release v1.3.0-beta.2 (`96621a53`)

## 2022-09-09

### ✦ Recent changes

- Bug Fix & Update dependencies (`67500465`)
- Language support: Vietnamese (`cf09c27b`)
- Translated using Weblate (Vietnamese) (#208) (`28fa7f4a`)
- Translated using Weblate (Italian) (#207) (`32f094ef`)

## 2022-09-08

### ✦ Recent changes

- Pre-release v1.3.0-beta.1 (`5b969030`)
- Release v1.2.1 (10210) (`c9024ff8`)
- Translated using Weblate (Chinese (Traditional)) (#202) (`29d5fb4a`)
- Translated using Weblate (Chinese (Traditional)) (#203) (`fbd52954`)
- Bug Fix & UI Improvements for custom command (`d53e70bc`)

## 2022-09-07

### ✦ Recent changes

- Release v1.2.1 (`0e0fee97`)

## 2022-09-06

### ✦ Recent changes

- Translated using Weblate (Japanese) (#198) (`9bc84259`)
- Translated using Weblate (Japanese) (#197) (`c12579dc`)

## 2022-09-05

### ✦ Recent changes

- Modify suffix for F-Droid (#195) (`c1f80b99`)
- Update credits (`e1b3042c`)

## 2022-09-04

### ✦ Recent changes

- Translated using Weblate (German) (#189) (`48b29064`)
- Update fastlane metadata (`92e48b61`)
- Pre-release v1.2.0 (`59ed4d6b`)

## 2022-09-03

### ✦ Recent changes

- Pre-release v1.2.0-beta.6 (`8e040c66`)
- Feature Update: Cookies settings & Bug Fix (`a36018c4`)

## 2022-09-02

### ✦ Recent changes

- Feature Update: Add aria2c support & Pre-release v1.2.0-beta.5 (`4213f2a3`)

## 2022-09-01

### ✦ Recent changes

- Implement in-app updating (`33b4d127`)

## 2022-08-31

### ✦ Recent changes

- Add in-app updating (#172) (`d8d4664c`)

## 2022-08-29

### ✦ Recent changes

- Add monochrome icon for Android 13 (`f1cc9630`)

## 2022-08-28

### ✦ Recent changes

- Pre-release v1.2.0-beta.4 (`4211b978`)
- Feature Update: SponsorBlock (`50c8e5bb`)
- Print detailed device information (`b323e22a`)
- Update android.yml (`66f5d211`)

## 2022-08-26

### ✦ Recent changes

- Translated using Weblate (Chinese (Traditional)) (`15d8e597`)
- Translated using Weblate (Chinese (Traditional)) (`d6e89b3e`)
- Apply proper padding for 3-Button Navigation in Downloads (`43a6b15c`)
- Apply proper padding for 3-Button Navigation in Downloads (`a8df82c9`)
- Bug Fix: App crashes when parsing invalid strings (`12039ad0`)
- Pre-release v1.2.0-beta.3 (`1b0d05ff`)
- Update android.yml (`76aa66ac`)
- Update android.yml (`6b9f44cb`)
- Update android.yml (`8528b18a`)
- Fix wrong path (`c8f18b4b`)
- Fix wrong path (`ae9a943a`)
- Multi-select in Downloads page (`503d010d`)

## 2022-08-25

### ✦ Recent changes

- Pre-release v1.2.0-beta.2 (`2336fd8a`)
- Feature Update: Export/import command templates (`47e5b434`)
- Translated using Weblate (Chinese (Traditional)) (`54ff8335`)
- Fix typo (`7bf8573f`)

## 2022-08-24

### ✦ Recent changes

- Release v1.1.0 (10100) (`9a2a8508`)
- Language support: Malay & Chinese (Traditional) (`4437e233`)

## 2022-08-23

### ✦ Recent changes

- Translated using Weblate (Chinese (Traditional)) (`155c922b`)

## 2022-08-22

### ✦ Recent changes

- Bump up version (`4fa64e1c`)
- Feature Update: Limit video file size (`9ba7f080`)
- Add new strings (`cf7f2f6c`)
- Update credits, bump up version (`22f6533e`)

## 2022-08-21

### ✦ Recent changes

- Translated using Weblate (Italian) (`8183f0be`)
- Refactor VideoListPage (`085b4fe7`)

## 2022-08-19

### ✦ Recent changes

- Add new strings (`826d1606`)
- DownloadTaskItem (Nearly finish) (`069dfcc0`)
- TaskCard (WIP) (`6c97df9c`)
- Bug Fix: Update download notifications (`306e10fd`)

## 2022-08-18

### ✦ Recent changes

- DownloadTaskItem(WIP) (`787759d2`)
- Bug Fix: Service unregister error after recreating Activity (`1ee29925`)
- Release v1.0.5(10050) (`e7033c74`)

## 2022-08-17

### ✦ Recent changes

- Update dependency (`35fbef2c`)
- Update issue template (`8f64c687`)

## 2022-08-16

### ✦ Recent changes

- Translated using Weblate (German) (`1d98b795`)
- Easier bug reporting and feature requesting (#123) (`9fee3b40`)
- Print ABIs (`d88399da`)
- Update About page (`a907a22c`)
- Update issue templates (`f10dad34`)
- Update README.md (`a5139428`)
- Update issue templates (`f77c4118`)
- Update issue templates (`daa155df`)

## 2022-08-14

### ✦ Recent changes

- UI Improvement for 3-Buttons Navigation (`fd1e5063`)
- Release v1.0.4 (10040) (`ea3a6ddd`)
- Bug Fix: Use webpage as id (`e5c6685e`)
- Update android.yml (`5e3334b5`)
- Create android.yml (`932a81e4`)

## 2022-08-13

### ✦ Recent changes

- Configure GitHub Actions Android CI (`e6651468`)
- Create android.yml (`fb4cc927`)
- Release v1.0.4 (`fcd12ecf`)
- UI Improvement: Add icons everywhere (`a27120a2`)
- Translated using Weblate (Italian) (`92e510bc`)
- Implement operation of cancelling download tasks (`6f37d8bb`)
- Bug Fix: Thumbnails mistakenly scanned to Downloads (`47895348`)

## 2022-08-12

### ✦ Recent changes

- Update README.md (`9769ce12`)
- Bug Fix: App crashes under API 26 & Dependency update (`57d067b0`)

## 2022-08-11

### ✦ Recent changes

- Bug Fix: Crash with clipboard operations (`60b6487a`)
- Hotfix: custom template broken (`0bd6c1e8`)
- Release v1.0.3 (`de5a6b22`)
- Translated using Weblate (Arabic) (`05aad1e1`)
- Template addition & removal (`4063e007`)
- Template selection (`50276d75`)
- Remove template (`48f9f4aa`)
- TemplateList (WIP) (`86e46b26`)

## 2022-08-10

### ✦ Recent changes

- Update dependency & Bug Fix (`3adc0251`)

## 2022-08-09

### ✦ Recent changes

- Hotfix: subtitle in configuration dialog (`e99569b6`)
- Update README-zh.md (`5581d7c5`)
- Language support: Hungarian (`983f8678`)
- Fix typo & Update README (`931ce3c3`)
- Fix typo & Update README (`f3b04623`)
- Release v1.0.2 (`360e4efe`)
- Embed subtitles & Bug Fix (`940ebcb5`)

## 2022-08-08

### ✦ Recent changes

- Translated using Weblate (Hungarian) (`c991546a`)

## 2022-08-07

### ✦ Recent changes

- Sync README-zh.md & fix small issues (`d48e1042`)

## 2022-08-06

### ✦ Recent changes

- Release v1.0.1 (`95fd76c3`)
- Dependencies update (`68dd642c`)
- Language support: Polish (`f702e118`)

## 2022-08-05

### ✦ Recent changes

- Translated using Weblate (Indonesian) (`8e0bb461`)
- Use playlist url to parse infomation (`9bc52618`)
- Custom path & Tagging audio with playlist title (`6361a439`)

## 2022-08-04

### ✦ Recent changes

- Updated arabic Language strings (`7501b20a`)
- Translated using Weblate (Polish) (`b3e8199d`)

## 2022-08-03

### ✦ Recent changes

- Language support: Portuguese (Brazil) (`cb0abc83`)

## 2022-08-02

### ✦ Recent changes

- Language support: Italian, Dutch (`4ff318ba`)
- Translations update from Hosted Weblate (#92) (`d2d1227b`)

## 2022-08-01

### ✦ Recent changes

- Updated Arabic language (#84) (`e2e3dd6d`)

## 2022-07-31

### ✦ Recent changes

- Language support: Filipino (`a5f9a4c0`)
- Translations update from Hosted Weblate (#82) (`dcb06a0d`)
- Update README.md (`89e5e276`)
- Release v1.0.0 (`3b6899b0`)
- Language support: Indonesian, Persian and Ukrainian & LanguagesPage (`987859da`)

## 2022-07-30

### ✦ Recent changes

- Translations update from Hosted Weblate (#73) (`9a22b8da`)

## 2022-07-29

### ✦ Recent changes

- Hi. Added ukrainian locale. (#71) (`9c3813f9`)
- Language support: Arabic, Turkish and Russian & UI bug fix (`1fbc503c`)
- Translations update from Hosted Weblate (#68) (`8c2d9a6c`)

## 2022-07-27

### ✦ Recent changes

- Update README.md (#64) (`92e9b167`)
- Split apks for F-Droid (`f28c6ab7`)

## 2022-07-23

### ✦ Recent changes

- Translated using Weblate (Czech) (`0c0ab282`)

## 2022-07-22

### ✦ Recent changes

- Bug Fix: App crashes when download error occurs (`a2763801`)
- Release v0.0.9-alpha08 (`91569c25`)
- Translations update from Hosted Weblate (#57) (`ec4cd0ae`)

## 2022-07-20

### ✦ Recent changes

- Release v0.0.9-alpha07 (`8509ec70`)
- Translated using Weblate (Norwegian Bokmål) (`b728d3b3`)
- Translated using Weblate (Chinese (Simplified)) (`cfea4d33`)
- Language support: Bokmål (`886a8760`)
- App strings reworked (`334437d3`)
- Fastlane refactor, CreditsPage (`d09681c7`)

## 2022-07-19

### ✦ Recent changes

- Translated using Weblate (German) (`da95b354`)
- Translated using Weblate (French) (`3d3284e6`)
- Translated using Weblate (Norwegian Bokmål) (`5a2fccf5`)
- Translated using Weblate (German) (`25e141ba`)
- Language support: French & German (`63d70cd2`)
- Added translation using Weblate (German) (`e567127f`)
- App icon (#53) (`857a4f04`)

## 2022-07-18

### ✦ Recent changes

- Translated using Weblate (German) (`39d1b723`)
- Translated using Weblate (Czech) (`f6cde1df`)
- Translated using Weblate (French) (`5410f9dd`)
- Initial fastlane structure (#52) (`496a522b`)
- Language support: Czech (`198878b1`)
- Implement language settings for Android 13 (`020c2234`)

## 2022-07-17

### ✦ Recent changes

- Translated using Weblate (French) (`7e512017`)
- Translated using Weblate (Czech) (`e645ed56`)
- Translated using Weblate (French) (`87cfa696`)
- Translated using Weblate (Chinese (Simplified)) (`645921db`)
- Added translation using Weblate (Czech) (`f9ab62ad`)
- Added translation using Weblate (French) (`cfb5a615`)
- Bug Fix: Permission denied in API 29 (Android 10) (`aef12ced`)
- Update README.md (`840d4868`)

## 2022-07-16

### ✦ Recent changes

- Bump up version to 0.0.9-alpha05 (`12865df1`)

## 2022-07-15

### ✦ Recent changes

- Added translation using Weblate (Norwegian Bokmål) (`9b682175`)
- UI Improvement & Bug Fix (`b61aae5c`)
- (Limited) Large screen devices support (#46) (`bd8e09aa`)

## 2022-07-14

### ✦ Recent changes

- Remove redundant resources (`cf5ad05c`)
- Foreground Service Test (`5196638f`)

## 2022-06-30

### ✦ Recent changes

- Request ignore battery optimization (`4d07655f`)
- Fix crash when fetching video info fails (`b07d4984`)

## 2022-06-29

### ✦ Recent changes

- Download bug hotfix & Download directory caution (`29f57e01`)
- Modify strings (`7b428032`)
- Custom download directory for audio & video (`8c99e3d2`)
- Playlist progress, stop download operation (`900de77c`)
- Playlist download interaction (WIP) (`ad8ad265`)

## 2022-06-28

### ✦ Recent changes

- Playlist download UI enhancement (WIP) (`8f52f789`)
- Download range selection dialog(WIP) (`8f49c5fe`)
- Remove DataStore (`bfa69f8d`)

## 2022-06-26

### ✦ Recent changes

- Better upload detection when video is part of a playlist (`3ae35322`)
- Avoid Compilation Warnings (`8e83df9b`)
- progressText is no more in VideoCard (`9ceda628`)
- Syntax error fix (`71b33561`)
- Select correct url from videoinfo and avoid returning when a single video in playlist fails downloading (`7d33d933`)
- Reverting manifest changes (made for compiling locally) (`0bcf37eb`)
- Continuing after error downloading single video (`2c26f6fc`)
- Better playlist management. Now playlist download is stoppable and shows current video thumbnail (`00cdc4f7`)
- Print detailed messages when downloading (`a5f2f33f`)

## 2022-06-25

### ✦ Recent changes

- Adapt GUI changes to new GUI settings (`aefd10de`)
- Branch with playlist modifications and some GUI change. Build file to use an hacked youtubedl-android version (`210e6d7d`)
- Reverting gui commits (`ecf24c89`)
- Some playlist related optimizations and a little bit more information showing on gui (`78434533`)

## 2022-06-24

### ✦ Recent changes

- Downgrade minAPI to 23, with several enhancements (`bd160c15`)

## 2022-06-21

### ✦ Recent changes

- Update README.md (`b69e2da8`)

## 2022-06-19

### ✦ Recent changes

- Implement MD3 color theming (`a50cf9cf`)
- Play with colors (`8e60bcac`)

## 2022-06-18

### ✦ Recent changes

- Migrate to Material Color Scheme (`722ae74d`)
- Add material-color-utilities (`7fc1a4e2`)
- Update README.md (`2ea6435e`)

## 2022-06-16

### ✦ Recent changes

- Targets API 33, runtime notification permission (`3be40ccb`)

## 2022-06-13

### ✦ Recent changes

- Load thumbnails from local videofiles (`4565748f`)
- Bug Fix (`30bffd0f`)

## 2022-06-12

### ✦ Recent changes

- Read url from share content (`cc356360`)

## 2022-06-11

### ✦ Recent changes

- Add custom command in DownloadSettingDialog (`cc8109e6`)
- Migrate gradle script to KTS (`63f46e80`)

## 2022-06-10

### ✦ Recent changes

- UI Improvement & Bug Fix (`578bef4f`)
- Thumbnail bug fix, remove id from filename (`dde560fb`)
- Use forked library, stable extractor filter (`498f7cfc`)

## 2022-06-09

### ✦ Recent changes

- Extractor bug fix (`5c66e019`)

## 2022-06-08

### ✦ Recent changes

- Notification optimize (`bdc724a6`)
- Adaptive video filters (`42c2bf35`)

## 2022-06-07

### ✦ Recent changes

- BugFix: Trim long filename, code cleanup (`57d7926c`)

## 2022-06-06

### ✦ Recent changes

- Download notification (`4ab6ef03`)

## 2022-06-05

### ✦ Recent changes

- Update README.md (`6537f6c7`)

## 2022-06-03

### ✦ Recent changes

- UI Improvements & BugFix (`6287123a`)

## 2022-06-02

### ✦ Recent changes

- UI Improvements (`f83b1675`)
- In-app Language Configuration (`03679cb8`)

## 2022-06-01

### ✦ Recent changes

- Download playlist & Language wip (`9170406f`)

## 2022-05-30

### ✦ Recent changes

- Create README-zh.md (`e2b3a62c`)
- Update README.md (`a99cd1b8`)

## 2022-05-29

### ✦ Recent changes

- Update README.md (`cf539f65`)

## 2022-05-28

### ✦ Recent changes

- bugFix (`246db325`)
- Bump version to v0.0.7 (`8cfcdc6b`)

## 2022-05-26

### ✦ Recent changes

- Welcome Dialog (`af922215`)

## 2022-05-25

### ✦ Recent changes

- UI Improvements (`fd2ca99e`)

## 2022-05-23

### ✦ Recent changes

- UI Improvements, configure before download (`cf7fc520`)
- Video & Audio formating (`17b09351`)

## 2022-05-22

### ✦ Recent changes

- Optimise audio downloading (`22131f26`)

## 2022-05-21

### ✦ Recent changes

- Custom command hint and references (`dbf65f1d`)

## 2022-05-20

### ✦ Recent changes

- UI Improvement & Bug Fix (`5294b82f`)

## 2022-05-15

### ✦ Recent changes

- UI Improvement, preference settings (`93a904f9`)
- Custom command (`015ad255`)
- Credits (`609a39a0`)
- FilterChip but Ugly codes (`e1d21425`)
- App Icon (`4390dada`)

## 2022-05-14

### ✦ Recent changes

- UI bugFix (`61f8c099`)
- Update README.md (`f153f845`)
- Bumpup Compose MD3 Version (`0715a1b1`)
- Add AboutPage, UI Improvement, bugFix (`2741364a`)

## 2022-05-13

### ✦ Recent changes

- Create README.md (`62353739`)
- Create LICENSE (`5cfc9f3b`)
- bugFix (`42b2976d`)
- Make text selectable (`eb2861b4`)
- Dialog modified, bugFix (`e9afe9a1`)

## 2022-05-12

### ✦ Recent changes

- RemoveItemDialog (`2c777239`)
- BottomDrawer UI modified (`d35fb814`)
- BottomDrawer (`8bb7b9b9`)
- HiltViewModel (`8dfbd829`)
- Migrate to Flow (`55caffb8`)
- Specify file type in download list (`dc15bb10`)

## 2022-05-11

### ✦ Recent changes

- Show download error message (`dec18ded`)
- Download History (`ddb25441`)
- TopAppBar but WIP for insets (`bd9d0103`)
- TopAppBar (`561259a5`)
- VideoListPage(WIP) (`c6ac219b`)

## 2022-05-10

### ✦ Recent changes

- Fix permission (`af46652e`)

## 2022-05-08

### ✦ Recent changes

- UI improvement, bugFix (`9da02c9e`)
- Fix thumbnail loading error with http urls (`29cf0e88`)
- VideoCard refactor (`c3dc1f4f`)
- Video Card (`1f851dfb`)

## 2022-05-07

### ✦ Recent changes

- Embedding thumbnails into audio by default (`327c2ac3`)
- LocalClipboardManager (`39408d4c`)

## 2022-05-06

### ✦ Recent changes

- Update yt-dlp when initialize app (`e453225e`)
- Display video title while downloading (`905d33aa`)

## 2022-05-05

### ✦ Recent changes

- UI improvement (`3d7b097d`)
- Add expand animation for progressBar (`c699e3d1`)
- Add animation for progressBar, Code cleanup (`46da13c9`)
- Preference: selectable download directory (`aa663e5a`)
- Completely migrated to Compose (`09e799dc`)
- Remove unneeded codes (`89da1093`)
- bugFix: Auto load ComposeView (`74f9d715`)
- Compose refactor (`e7485c60`)

## 2022-05-04

### ✦ Recent changes

- bugFix (`9afc8005`)
- Remove initialization blocking UI (`1c6419a9`)

## 2022-05-03

### ✦ Recent changes

- Exception handle (`d293ec02`)
- Migrate to Compose, structure refactor (`c51b7d14`)
- Switch bug? (`5507e6da`)
- SettingPage in Compose & MD3(WIP) (`df81097b`)
- Migrate to Compose with coroutine (WIP) (`1791119e`)

## 2022-05-02

### ✦ Recent changes

- FAB (`0c453ddd`)
- TextField, ProgressBar and DynamicColor (`715f5eb2`)
- Start migrating to Jetpack Compose (`7acf582c`)

## 2022-04-22

### ✦ Recent changes

- Implement paste url operation (`7c5b1662`)

## 2022-04-21

### ✦ Recent changes

- bugFix:metadata (`727f31d1`)
- Preference default value (`cf1172d2`)
- bugFix, save error log (`5cc139c6`)
- Added language settings (`1d8dd392`)
- Bump version to 0.0.3 (`d917b64f`)
- SettingsFragment Finish, Chinese translatation (`05e2191b`)
- SettingsFragment (WIP) (`336630b5`)

## 2022-04-20

### ✦ Recent changes

- setImmersiveStatusBar (`b8a73298`)
- Settings Fragment (`aa93ba55`)

## 2022-04-19

### ✦ Recent changes

- MediaScanner modified (`6fd573a7`)
- bump version (`a21db3a7`)
- Bump version (`deab3ccd`)
- Code refactor, Toast error msgs (`a26d096d`)
- requestLegacyExternalStorage (`d272a864`)
- Legacy storage permission, tested on 24 (`38d1ec6b`)

## 2022-04-18

### ✦ Recent changes

- MediaScanner (`6e3e4e96`)
- bugFix (`9acc9341`)
- Bump build version for dogfood (`b3f70949`)
- show directory (`db4f69fe`)

## 2022-04-17

### ✦ Recent changes

- bugFix: Storage Permission Issue (`760cd432`)
- Set build version (`1d8fc3d8`)
- bugFix (`7ba10b3d`)
- bugFix, added proxy switch (`e6a54ede`)
- Add proxy setting (`d5fa6a2d`)
- Implement playlist download (`6cbbfae9`)
- Update Binary files while launching (`a2f8e83d`)
- Embeded thumbnails for mp3 files (`b4ac4bc7`)
- bugFix (`a7fb66b3`)
- Added two switch for download config (`f1ebeb3d`)

## 2022-04-16

### ✦ Recent changes

- Download (WIP) (`093eb4b1`)
- ytb-dl Android (`f5bb4e63`)
- Notes: Elevation in MD3 (`dce01795`)

## 2022-04-15

### ✦ Recent changes

- Geting started with MD3 (`5fffdd25`)
- Initial commit (`c5e9d165`)

<!-- KIRIN-AUTO-CHANGELOG:END -->

## [3.2.2] - Unreleased

### ✦ App Update Popup

- Added a standalone startup update popup, separate from **About → App Update**.
- Checks for a new KirinDL release at app startup when automatic app-update checks are enabled.
- Remembers the dismissed release so the same update does not repeatedly interrupt app launches.
- Keeps **About → App Update** as an independent manual update entry point.

### ✦ Bilibili Download Reliability

- Fixed Bilibili downloads getting stuck or restarting after the video and audio streams had already reached 100%.
- Prevented network-triggered auto-pause from terminating local FFmpeg merge and other post-processing stages.
- Kept thumbnail conversion, remuxing, and final file movement running when a temporary network-status interruption occurs.
- Preserved automatic network pausing during active transfers, along with manual Pause and Cancel controls.
- Added regression tests covering merge/post-processing detection and confirming that active transfers and retries remain eligible for network pausing.

### ✦ Download CI & Regression Coverage

- Added Generic Debug unit tests to the Android CI workflow before the compile step.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [3.1.0] - 2026-09-01

### ✦ Engine Update Center

- Added a unified **Engine Updates** entry in Settings
- yt-dlp and gallery-dl can now be checked and updated from one page
- Shows the installed yt-dlp version and active Stable/Nightly channel
- Adds a remote yt-dlp version check without changing the selected channel
- Shows the installed gallery-dl version and Codeberg source commit
- Adds a Codeberg `master` commit check
- Added **Update All** for sequential yt-dlp + gallery-dl updates
- Existing yt-dlp channel / auto-update controls remain available
- Gallery compatibility, cookies, cache and expert config remain on the same page

### ✦ Legacy App Updater Cleanup

- Removed the unused `latest.apk` cache path
- Removed dead APK download progress code
- Removed `downloadApk()`
- Removed `installLatestApk()`
- Replaced legacy `deleteOutdatedApk()` startup cleanup with a harmless no-op compatibility shim
- The existing startup hook now performs no APK file operation
- Simplified the app update dialog to open the official KirinDL GitHub Release page only
- Kept yt-dlp Stable/Nightly engine updates fully intact
- Kept gallery-dl Codeberg engine updates fully intact

### ✦ 3.1.0 Release Preparation

- Bumped app version from `3.0.0` to `3.1.0`
- Updated Android version code to `301000400`
- Preserved package ID `com.kirin.downloader`
- Preserved the existing KirinDL release signing identity
- Preserved Universal APK ABI coverage


### ✦ KirinDL Rebrand & Visual Identity

- Standardized the visible application branding as **KirinDL**
- Preserved Android package ID `com.kirin.downloader` for release-update compatibility
- Preserved debug package ID `com.kirin.downloader.debug`
- Added Kirin-focused launcher, adaptive, themed, splash, and notification icon branding
- Updated splash branding to **KirinDL • Media • Gallery • Batch**
- Updated APK and GitHub Actions artifact names to use `KirinDL`
- Updated Fastlane/store display titles to `KirinDL`
- Kept upstream/legal attribution and internal implementation identifiers where required for compatibility

### ✦ Gallery DL Hub

- Added a dedicated **Gallery DL** workflow separate from the normal media downloader
- Added Gallery tabs:
  - Download
  - Queue
  - History
- Added single Gallery URL downloads
- Added multi-URL batch input
- Added sequential queue processing
- Added persistent Gallery queue
- Added persistent Gallery history
- Added extractor preflight / compatibility checks
- Added Gallery runtime diagnostics
- Added persistent Gallery cache
- Added cache status and clear action
- Added optional `cookies.txt` import and clear controls
- Added Gallery configuration import/export
- Added raw expert `gallery-dl` JSON configuration editor
- Added safe output-path handling and sanitized export filenames
- Added organized Gallery output layout under `Download/GalleryDL/`

### ✦ Gallery DL Engine Updates

- Moved Gallery DL engine updates to the active **Codeberg** source
- Gallery DL updater now resolves the latest Codeberg `master` commit
- Added exact commit-ID validation before installation
- Added immutable commit archive download
- Added staged engine install with backup/restore protection
- Added installed version and source-commit tracking
- Kept Gallery engine updates independent from KirinDL APK updates
- Confirmed compatibility with current gallery-dl development builds

### ✦ Gallery Theme & Contrast Fixes

- Gallery DL now follows KirinDL's active `MaterialTheme`
- Removed direct dependency on Android system dark-mode detection for Gallery page colors
- Fixed white Gallery panels with unreadable URL input text
- Fixed Gallery URL placeholder contrast
- Fixed Batch URL editor contrast
- Added Gallery appearance variants:
  - Follow app
  - Kirin Cyan
  - Ocean Blue
  - Emerald
  - Violet
- Theme variants only change Gallery accents while preserving app background, surface, and text colors

### ✦ yt-dlp Updates

- Kept built-in yt-dlp update support
- Kept both **Stable** and **Nightly** update channels
- Preserved official yt-dlp Android update mechanism
- Verified the updater remains independent from KirinDL APK releases
- Updated project documentation to reflect current yt-dlp update behavior

### ✦ App Update & Play Protect Cleanup

- Removed `REQUEST_INSTALL_PACKAGES`
- Removed the in-app `Install unknown apps` permission flow
- Removed direct APK self-install behavior from normal app update flow
- KirinDL now checks GitHub releases and opens the official release page in the browser
- Kept app updates separate from yt-dlp and Gallery DL engine updates
- Updated release fallback URLs to the current `Lanzkila/KirinDL` repository
- Removed stale legacy fork references from About and updater links

### ✦ Stable Debug Signing

- Added a dedicated stable debug certificate for KirinDL development builds
- Prevents a new GitHub Actions runner from producing an incompatible debug certificate on each build
- Future debug APKs can update/overwrite earlier KirinDL debug builds that use the same stable debug key
- Debug signing remains separate from production release signing

### ✦ Private Release Signing

- Added fork-specific private release signing support
- GitHub Actions uses:
  - `KIRIN_KEYSTORE_BASE64`
  - `KIRIN_KEYSTORE_PASSWORD`
  - `KIRIN_KEY_ALIAS`
  - `KIRIN_KEY_PASSWORD`
- Release JKS is reconstructed only on the temporary GitHub Actions runner
- Added keystore alias validation
- Added APK signature verification using Android `apksigner`
- Temporary signing files are removed after the workflow completes
- Release signing identity remains stable for future Android app updates

### ✦ Universal APK Builds

- Added Universal Debug APK output
- Added signed Universal Release APK output
- Universal builds include supported native ABIs:
  - `arm64-v8a`
  - `armeabi-v7a`
  - `x86`
  - `x86_64`
- Recommended normal-use artifact:
  - `KirinDL-Universal-Release.apk`
- Verified **Kirin Build Test #24** successfully produced both Universal Debug and signed Universal Release artifacts

### ✦ GitHub Actions Workflow Cleanup

- Reworked `kirin-build-test.yml` around the proven KirinDL Universal build flow
- Reworked `android.yml` into the official KirinDL release workflow
- Official release workflow now uses the same `KIRIN_*` signing secrets as the tested build workflow
- Added explicit `publish_release` option
- Release publishing defaults to disabled for safer testing
- Signed release artifact is always generated before optional GitHub Release publishing
- Removed old `ANDROID_SIGNING_KEY`, `ANDROID_ALIAS`, and related SealPlus signing configuration
- Removed hardcoded legacy v3.0 release body
- Removed old Telegram release-notification dependency
- Reworked `android_ci.yml` to use `assembleGenericDebug`
- Removed obsolete `buildGenericRelease` CI task
- Added workflow concurrency controls and timeouts

### ✦ Repository Workflow Maintenance

- Reworked old Issue Handler behavior
- Removed keyword-based automatic issue closing inherited from upstream
- Removed hardcoded upstream issue reference
- New issues now receive a safe `needs-triage` label
- Updated stale issue/PR workflow for KirinDL
- Added manual stale-workflow trigger
- Added exemptions for `pinned`, `security`, and `keep-open`
- Neutralized the old upstream sponsor workflow
- Removed old PAT-based README rewriting and GitHub Pages deployment from sponsor automation

### ✦ About Page Improvements

- Rearranged About cards into a balanced two-column grid
- Current layout:
  - README | Latest release
  - Sponsor | Credits
- Future optional cards now start on the next row
- Added consistent minimum card height for cleaner alignment
- Updated About links to the current `Lanzkila/KirinDL` repository

### ✦ README & Repository Documentation

- Reworked README around the KirinDL identity
- Added live GitHub badges for:
  - Build status
  - Stars
  - Forks
  - Latest release
  - License
- Added yt-dlp Stable / Nightly status badges
- Added gallery-dl upstream status badge
- Added Media / Gallery / Batch project overview
- Added Gallery DL architecture and output documentation
- Added Universal APK and release-signing documentation
- Added current engine-update documentation
- Added `UPSTREAM-STATUS.md` for yt-dlp, gallery-dl, and YTDLnis tracking
- Preserved Seal, SealPlus, yt-dlp, youtubedl-android, gallery-dl, aria2, and FFmpeg credits

### ✦ Upstream Status Review

Checked on **2026-09-01**:

- yt-dlp Stable: `2026.08.19`
- yt-dlp Nightly: `2026.08.30.232658`
- gallery-dl Stable: `1.32.10`
- Gallery DL development source: Codeberg `master`

KirinDL already receives most extractor-level fixes through its independent engine updaters, so normal yt-dlp/gallery-dl extractor updates do not require rebuilding the KirinDL APK.

### ✦ YTDLnis Review

- Reviewed current YTDLnis development for useful architecture ideas
- Noted BGUtils PO-token service work
- Noted Node integration for BGUtils
- Noted terminal rework
- Noted modular runtime/package architecture
- These larger runtime additions are intentionally **not bundled yet** to avoid expanding KirinDL's runtime surface without a specific compatibility need

### ✦ Compatibility & Safety

- Preserved `applicationId = "com.kirin.downloader"`
- Preserved internal namespace `com.junkfood.seal`
- Preserved working Gallery DL engine/runner/config behavior
- Preserved yt-dlp core download behavior
- Preserved ABI configuration
- Preserved release-key continuity
- Preserved open-source attribution and GPL licensing requirements

---

<details>
<summary><strong>Legacy SealPlus changelog (v3.0.0 and older) — Show / Hide</strong></summary>

## [3.0.0] - 2026-07-30

### 🧰 Dedicated "More Tools" Section & Tool Suite

* **Dedicated "More Tools" Page** — Brand new centralized tools hub accessible from the navigation drawer and quick-access toolbar on the home screen
* **Home Screen Quick-Access Toolbar** — Added instant 1-tap shortcut icons on the main home screen to jump directly to dedicated utilities
* **Batch URL Import (Custom Playlist)** — Download multiple YouTube videos & audios simultaneously as a custom playlist with quality selection, animated color transitions, live URL line counter, paste success animations, and haptic feedback
* **Thumbnail Download Tool** — Dedicated tool to extract and download high-resolution video thumbnails with image format conversion options (PNG / WebP / JPG)
* **Video Info Download Tool** — Download full video metadata (title, description, tags, view count, upload date) as structured `.txt` or `.json` files with saved metadata management
* **Comment Download Tool** — Extract, download, and manage YouTube video comments as readable text or JSON files
* **Interactive Tool Cards** — Added long-press action sheets, info dialogs, and reordered grid layouts for easier navigation

### 👆 Swipeable Download Details Sheet

* **Spotify-Style Swipeable Sheet** — Switch between downloaded item details seamlessly by swiping left or right on the details bottom sheet
* **Smooth Pager Transitions** — Redesigned pager container to eliminate height flickering and improve item navigation responsiveness

### 🧹 Streamlined Configure & Download Flow

* **Removed Docs & Thumbnail Options from Dialogs** — Consolidated documentation and thumbnail downloads into their dedicated "More Tools" pages, cleaning up `DownloadDialogV2` and `FormatPage`
* **Format Page Enhancements** — Added grid/list layout toggle, selection summary subtitle, M3 `SegmentedButton` controls, compact format cards, soft borders, and animated chip transitions

### 🔋 Battery Optimization & Background Execution

* **Battery Optimization Re-Arming** — Centralized OEM detection (MIUI/HyperOS, ColorOS, iQOO, Samsung, etc.) that automatically re-prompts for battery optimization exclusions on app resume to prevent killed background downloads
* **Doze Mode Wake Lock Protection** — Prevents downloads from stalling in Deep Doze mode by maintaining CPU wake locks during active downloads
* **Android 12+ Foreground Service Fix** — Resolved `ForegroundServiceStartNotAllowedException` during background execution on Android 12 and higher

### 🍪 Cookie & Network Enhancements

* **Cookie Domain Matching Fix** — Properly aligns dot-prefixed domains (`.youtube.com`) with `includeSubdomains` flag, fixing cookie parsing issues on subdomains
* **Removed Legacy Proxy Feature** — Completely removed outdated Proxy settings and `ProxyManager` from Sealplus Extras, simplifying network handling

### 💖 Crypto Donation Support & Sponsors

* **Crypto Donations Page** — Added dedicated Crypto Donation page with Bitcoin (BTC) wallet support, QR codes, and updated UPI payment details
* **Updated Sponsors List** — Added latest community supporters to `sponsors.json`

### ⚡ Memory & Performance Optimization

* **In-Memory State Pruning** — Added automatic pruning of completed and cancelled download tasks from the in-memory state map, preventing memory leaks during long download sessions

## [2.9.0] - 2026-07-09

### 🍪 Manual Cookie Paste Dialog

* **Full Cookie Paste Interface** — Brand new `ManualCookieInputDialog` that lets you paste cookies directly into any profile without using the in-app browser
* **Three Format Support** — Automatically detects and parses Netscape (.txt), JSON (Cookie-Editor / EditThisCookie), and standard Cookie Header (name=value) formats
* **Import Options** — Paste from clipboard with one tap, or import from a .txt / .json file on your device using the system file picker
* **Live Cookie Count** — Character counter on the input field shows exactly how much data you've pasted
* **Format Chips** — Visual assist chips (Netscape / JSON / name=value) show supported formats at a glance
* **Clear Action** — Trash icon button clears the field instantly, only shown when content exists
* **Smart Validation** — Confirm button stays disabled until a valid URL and non-empty cookie text are entered
* **Icon Badge** — Modern circular badge with primary container color replaces the plain icon for a polished look
* **Priority Over Browser Cookies** — Profiles with manually pasted cookies are used first, skipping CookieManager entirely

### ⚠️ Facebook/Instagram Account Ban Warning

* **Safety Notice** — A prominent red warning callout (errorContainer background with WarningAmber icon) is displayed inside the paste dialog
* **Clear Message** — Warns that using your personal Facebook or Instagram account cookies may get the account banned
* **Recommendation** — Strongly advises using a throwaway or secondary account for downloading

### 🛡️ Anti-Bot Detection for Meta Login Pages

* **Two-Layer Bypass** — Implements a sophisticated two-layer approach to bypass Meta's (Facebook/Instagram) bot detection:
  + **Layer 1 (Sec-CH-UA Header)**: Uses `UserAgentMetadata` API (WebView 112+) to rewrite the User-Agent client hints — replaces "Android WebView" brand with "Google Chrome" while preserving version numbers, preventing server-side detection via `Sec-CH-UA` headers
  + **Layer 2 (JavaScript Runtime)**: Injects an `ANTI_DETECTION_SCRIPT` via `DocumentStartScript` API that shims `window.chrome` with full mock objects (`app`, `runtime`, `loadTimes`, `csi`), sets `navigator.webdriver = false`, patches `navigator.languages`, and overrides `navigator.userAgentData.brands` as a JS fallback
* **Fallback Support** — On older WebView versions without `DocumentStartScript`, the script is injected via `onPageStarted` callback
* **Transparent Background** — WebView background changed to transparent to prevent white flashes on dark-themed sites

### 🔄 Multi-Window Popup Support for Login Flows

* **Popup Window Handling** — WebView now supports `window.open()` and `target="_blank"` popups via `setSupportMultipleWindows(true)` and `WebChromeClient.onCreateWindow`
* **Popup Overlay** — Popups render inside the app as a closeable overlay with its own `WebView`, keeping you in the login flow
* **Back Button Priority** — Back press closes popup first, then navigates the main WebView back, then dismisses the page
* **Cookie Sync** — Cookies are flushed on every `onPageFinished` and before navigation, ensuring login state is preserved

### 🔐 Cookie Management & Database Rewrite

* **Cookie Storage Rewrite** — Cookie reading completely rewritten from direct SQLite database access to `CookieManager.getCookie()` API, eliminating database path issues across Android versions
* **HttpOnly & Expiry Support** — `Cookie` data class now tracks `isHttpOnly` flag and expiry timestamps; expired cookies are automatically skipped
* **Chromium Timestamp Conversion** — Added `chromiumTimeToUnixTimestamp()` for accurate expiry comparison
* **Lifecycle Auto-Refresh** — Cookies now refresh automatically every time the screen resumes (ON_RESUME lifecycle event), using `LaunchedEffect(cookieRefreshKey)` instead of the old `DisposableEffect(shouldUpdateCookies)` pattern
* **Cross-Profile Deduplication** — Cookie list deduplicates by `domain|name` via HashSet when reading from multiple profiles
* **Crash-Proof Startup** — Cookie file write at startup wrapped in `runCatching` to prevent disk-full crashes
* **Manifest Update** — Added `<queries>` block with OEM package declarations for Android 11+ package visibility compliance

### 📄 Download Documentation Feature

* **Save Video Metadata as Text** — New "Download Docs" option that saves video title, uploader, upload date, duration, source URL, tags, and full description as a `.txt` file alongside your download
* **Automatic Workflow** — After download completes, `DownloadUtils.writeDocsTextFile()` creates the file in a `SealPlus/docs/` subdirectory and shows a success toast
* **Smart Toggle** — Toggle available in both DownloadDialogV2 and FormatPage; when enabled without selecting a format, tapping download directly saves docs without a video file
* **Format Reset** — Suggested format selection resets automatically when docs mode is switched on/off
* **Format Page Integration** — FormatConfig.downloadDocs flag, FilterChip toggle, overridePreferences passed to TaskFactory
* **Persistence Removed** — Download docs toggle is session-only (defaults to false each time), keeping the dialog clean

### 🔧 Download Resilience & Retry

* **Enhanced Retry Settings** — New `enableRetryOptions()` extension on `YoutubeDLRequest` adds comprehensive retry configuration:
  + `--retries=10`, `--fragment-retries=10`, `--extractor-retries=3`, `--file-access-retries=3`
* **Exponential Backoff** — `--retry-sleep` uses HTTP exponential backoff `exp=1:120` and fragment-level backoff `exp=1:60` to prevent HTTP-429 rate-limit escalation
* **Extended Timeouts** — Info-probe socket timeout increased from 5s to 15s; retry limit increased from 1 to 3
* **Aria2c Protocol Scoping** — `--downloader` scoped to `http,https,ftp,ftps:libaria2c.so` instead of all protocols, improving compatibility
* **External Downloader Args** — Added `--file-allocation=none`, `--max-tries=5`, `--retry-wait=2`, `--console-log-level=warn` for more reliable aria2c operation
* **Concurrent Fragments** — `--concurrent-fragments` now works alongside aria2c when `concurrentFragments > 1`
* **Network Availability Check** — FormatPage verifies network connectivity before allowing download to proceed

### 🎬 Format Selection Improvements

* **MP4-Only Filter** — New toggle that filters the format list to show only MP4-compatible formats (video: `mp4`, audio: `m4a`); enabled by default, gracefully falls back to unfiltered list if filtering would leave nothing
* **Coil 3 OkHttp Network Fetcher** — Integrated `OkHttpNetworkFetcherFactory` for Coil 3 with a desktop Chrome 124 User-Agent interceptor, improving thumbnail and artwork loading reliability
* **Implausible Size Filtering** — New `FormatValidator.filterImplausibleVideoSizes()` removes formats with unrealistically low bitrates for their resolution (e.g., 4K < 1500 kbps), with per-format debug logging

### 🎨 UI Polish

* **Download Dialog V2 Redesign**
  + `ConfigurePage` now uses `verticalScroll` with `windowInsetsPadding` for proper keyboard handling
  + Section titles upgraded to `Text` with `labelLarge`/`primary` styling replacing `DrawerSheetSubtitle`
  + `FilterChip` components redesigned with `RoundedCornerShape(50dp)` and 36dp height for modern pill shape
  + `FlowRow` used for additional settings, max 3 items per row with 8dp spacing
  + `ExpandableTitle` converted to animated `Surface` card with `surfaceContainerLow`, 12dp rounded corners, and animated rotation arrow
  + `SingleChoiceItem` redesigned with `primaryContainer` selection, circular check icon, semi-bold title font
  + `DownloadTypeSelectionGroup` uses `SingleChoiceSegmentedButtonRow` for 3-type selection
  + `ActionButtons` converted to `Row` with weighted cancel (1f) and action (2f) buttons, both pill-shaped 50dp
  + Removed unused Cancel icon from action buttons; cancel text constrained to single line

* **Battery Optimization Dialog**
  + Centralized in new `BatteryUtil` object with OEM-specific detection for 8 manufacturers (OPPO, Realme, Xiaomi, Vivo, Huawei, Samsung, Motorola, Nothing)
  + OEM-specific intent builders for battery settings (MIUI/HyperOS power keeper, OPPO/ColorOS, Vivo/iQOO, Huawei/Honor, Samsung)
  + `isIgnoringViaAppOps()` checks both PowerManager and AppOps for accurate detection
  + Xiaomi-specific: early return `false` because MIUI/HyperOS reports false positives; added HyperOS/MIUI 16+ and MIUI 12-15 intent targets
  + Dialog dismissal now persisted via `BATTERY_DIALOG_DISMISSED` preference — once dismissed, dialog won't show again
  + Dynamic OEM-specific description text loaded via `BatteryUtil.getBatterySettingsDescResId()`
  + Updated Xiaomi battery settings instructions in strings with MIUI/HyperOS-specific steps

---

### 🎨 Settings & About Page Redesign

* **Full-Width Settings LazyColumn Layout**
  + Settings page now uses a full-width `LazyColumn` with consistent `PreferenceItem` + trailing chevron icons for every navigation row
  + Added visual grouping with 16dp `Spacer` dividers between logical sections: Download → Customization → Extras
  + Sponsor card now uses `primaryContainer` / `onPrimaryContainer` color pairing for a prominent, themed appearance

* **Card-Based About Page Redesign**
  + About page completely rebuilt with a 2-column grid of `CommunityCard` components — each card shows an icon, title, and description in a clean `surfaceVariant` container with 12dp rounded corners
  + New **Website** card linking to `sealplus.in`
  + Auto-Update toggle now rendered as a standalone `Card` with a `Switch` control, separate from the community links grid
  + "View Onboarding" moved to a dedicated card with chevron icon
  + Version & package name displayed as a centered footer caption
  + Removed old `PreferenceItem`, `PreferenceSwitchWithDivider`, and clipboard-based package copy

* **New SettingsGridItem / SettingsGridSwitchItem Composables**
  + Added `SettingsGridItem` and `SettingsGridSwitchItem` — card-based composables with icon, bold title, description, and optional switch
  + Designed for use in future settings sections that benefit from a grid/card layout

### 🔌 Accompanist → Platform API Migration

* **Permissions Replaced with ActivityResultContracts**
  + Removed `accompanist-permissions` dependency; all `rememberPermissionState()` usages migrated to `rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission())`
  + Affected pages: `DownloadPage`, `DownloadDirectoryPreferences`, `GeneralDownloadPreferences`
  + Permission checks now use `ContextCompat.checkSelfPermission()` for consistency

* **WebView Replaced with Platform AndroidView**
  + Removed `accompanist-webview` dependency; Cookie profile WebView page migrated to raw `WebView` via `AndroidView` factory
  + Page title tracked via `WebChromeClient.onReceivedTitle` callback with `mutableStateOf`

* **Pager Indicators Replaced with Custom Row**
  + Removed `accompanist-pager-indicators` dependency; `HorizontalPagerIndicator` replaced with manual `Row` + `Box` dots with `CircleShape` clip and proper coloring

* **Accompanist Dependency Fully Removed**
  + Deleted `bundles.accompanist` from version catalog and all three accompanist library entries

### 📦 Bulk Dependency Update

* **Gradle 9.5.1 & AGP 9.2.1**
  + Upgraded from Gradle 8.13 / AGP 8.13.2 to Gradle 9.5.1 / AGP 9.2.1
  + Removed `com.android.build.api.variant.FilterConfiguration` direct import (now fully qualified)

* **Kotlin 2.3.21 with K2 Compiler**
  + Upgraded from Kotlin 2.0.21 → 2.3.21
  + KSP updated to `2.3.9`; Kotlin Compose compiler plugin aligned
  + `kotlin-android` plugin removed from all modules (now implicit via AGP)

* **Compose BOM 2026.05.01**
  + Upgraded from 2025.01.00 → 2026.05.01
  + Added `androidx.compose.material` to the compose bundle
  + Fixed breaking API changes: `SheetState` constructor → `rememberModalBottomSheetState()`, `ExposedDropdownMenuDefaults.outlinedTextFieldColors()` → `textFieldColors()`, `LocalOverscrollFactory` removed

* **Coil 3 Migration (io.coil-kt.coil3)**
  + Upgraded Coil 2.7.0 → 3.4.0 with group ID changed from `io.coil-kt` to `io.coil-kt.coil3`
  + Imports updated from `coil.compose` → `coil3.compose`
  + `ImageRequest.Builder` simplified for Coil 3 API

* **Android SDK 37 (Android 17)**
  + compileSdk / targetSdk upgraded from 36 → 37
  + All GitHub workflow actions updated (`android-actions/setup-android@v4`)
  + GitLab CI image updated to `mobiledevops/android-sdk-image:34.0.1`

* **Other Version Bumps**
  + Room 2.6.1 → 2.8.4 | Koin 4.0.0 → 4.2.1 | MMKV 1.3.12 → 1.3.16
  + Coroutines 1.10.1 → 1.11.0 | Serialization 1.7.3 → 1.11.0 | ktfmt 0.20.1 → 0.26.0
  + AndroidX Core 1.17.0 → 1.19.0 | Activity 1.12.2 → 1.13.0 | Navigation 2.9.6 → 2.9.8
  + Material 1.12.0 → 1.14.0 | Graphics 1.0.4 → 1.1.0 | ConstraintLayout 1.1.0 → 1.1.1
  + datetime 0.6.1 → 0.8.0 | Espresso 3.6.1 → 3.7.0 | TestExt 1.2.1 → 1.3.0
  + Added `androidx.documentfile:documentfile:1.1.0`
  + Removed unused `kotlin-android` plugin alias

### 🐛 Bug Fixes & Stability

* **LockScreen Biometric Prompt Fix**
  + Added `biometricShown` flag to prevent repeated biometric prompts on recomposition
  + Added `context.isFinishing` guard before calling biometric prompt callback
  + `biometricShown` properly reset after authentication completes, errors, or fails — preventing stale state

* **MainActivity LockScreen Deferred Until Onboarding**
  + Lock screen evaluation moved from `remember` initializer to `LaunchedEffect(showOnboarding)` to prevent lock screen from flashing during onboarding flow

* **QuickDownloadActivity Crash Fix**
  + Added early `return` after `finish()` when `sharedUrlCached` is empty, preventing continued execution on a finishing activity

* **DownloaderV2 NetworkCallback Memory Leak Fix**
  + Network callback extracted from `init` block to a named field `networkCallback` for proper unregistration
  + Added `cleanup()` method that unregisters the callback via `App.connectivityManager.unregisterNetworkCallback()`
  + `cleanup()` called on crash (`GlobalContext.getOrNull()?.get<DownloaderV2>()?.cleanup()`) and `onLowMemory()`

* **App.onLowMemory Handling**
  + Added `onLowMemory()` override that calls `DownloaderV2.cleanup()` for early resource release under memory pressure

* **SponsorUtil OkHttpClient Leak Fix**
  + Removed singleton `httpClient` field (was holding proxy reference forever)
  + `getClient()` now creates a fresh `OkHttpClient` per call, preventing leaked connections

* **NotificationUtil Redundant Cancel Removed**
  + Removed redundant `notificationManager.cancel(notificationId)` before `notify()` in error notification builder

* **CrashReportActivity Cleanup**
  + Removed `onDestroy()` with `finishAffinity()` to prevent potential IllegalStateException during activity teardown

* **DatabaseUtil Destructive Migration Fallback**
  + Added `fallbackToDestructiveMigration()` as a safety net for unexpected schema states

* **UpdateUtil checkForUpdate Made Safe**
  + Changed to `suspend fun` running on `Dispatchers.IO` with `withContext` + `runCatching` to prevent ANR from network calls on main thread

### 🌐 APK Output Naming Refinement

* **Consistent Output File Names**
  + Moved APK naming logic from deprecated `applicationVariants.all` block to the `androidComponents.onVariants` callback
  + Output file format: `SealPlus-{version}-{abi}.apk` (e.g. `SealPlus-2.8.0-arm64-v8a.apk`)
  + Removed redundant `FilterConfiguration` import (fully qualified inline)

### 🏗️ Build Configuration Cleanup

* **Debug Build Cleanup**
  + Removed `resValue("string", "app_name", "Seal Plus Debug")` from debug build type
  + Removed root `build.gradle.kts` superfluous `kotlin.android` plugin declaration
  + Added `android.disallowKotlinSourceSets=false` in `gradle.properties`

### 🌍 Website Redesign & SEO Overhaul

* **Complete sealplus.in Redesign**
  + New hero section with refined positioning and SEO-optimized structured data (SoftwareApplication + AggregateRating schema)
  + Support CTA section with statistics cards and donation call-to-action
  + Step-by-step **How to Install** guide with `HowTo` schema markup
  + **Seal Plus vs Seal app** comparison table with responsive mobile layout
  + **FAQ accordion** using native `<details>` elements with custom styling
  + Navigation now links to Support, Contact, and Privacy pages
  + Updated OG tags, meta descriptions, and keywords for better search visibility

* **New Support Page**
  + Dedicated `/support.html` with donation options: UPI, PayPal, GitHub Sponsors
  + Section explaining why support is needed, how contributions help
  + Live sponsors grid populated from `sponsors.json`

* **New Contact Page**
  + `/contact.html` with contact form (Formspree integration), support details sidebar, and highlights section
  + Average response time indicator

* **Complete CSS Rewrite**
  + New glassmorphism design system with CSS custom properties, dark theme, responsive breakpoints
  + Loading skeletons, toast notifications, modal overlays, sponsor cards
  + Accessibility improvements (reduced motion, aria labels, keyboard support)

* **Updated Sitemap & Privacy**
  + `sitemap.xml` updated with all new pages and correct lastmod dates
  + `privacy.html` updated with new cross-links

---

## [2.7.0] - 2026-05-22

### 🎁 Monetization & Support

* **GitHub Sponsors Integration**
  + Added **GitHub Sponsors** as a new donation option in the Support Developer page
  + Links directly to https://github.com/sponsors/MaheshTechnicals for supporting development
  + Updated gradient colors for the GitHub Sponsors button (bright blue to dark gray)
  + Removed outdated "Buy Me a Coffee" donation option and cleaned up related constants

### 📦 Database & File Management

* **Database Schema Upgrade (v7 → v8)**
  + Added `videoId` field to `DownloadedVideoInfo` entity for better video tracking
  + Enhanced download history with unique video identifiers
  + Automatic migration from schema v7 to v8 with proper default values

* **Enhanced Temp File Deletion**
  + Improved `FileUtil.deleteTempFilesForTask()` to use both `baseName` and `videoId` for more accurate cleanup
  + Temp files associated with downloads are now more reliably identified and removed
  + Better handling of edge cases where files were renamed or moved

### 🗑️ User Experience

* **Task Deletion Confirmation Dialog**
  + New confirmation dialog shown before deleting active download tasks
  + Displays task title/URL and requires explicit user confirmation before removal
  + Prevents accidental deletion of ongoing downloads
  + Properly cleans up associated temp files before removing the task

* **Improved Download State Management**
  + Network pause state now correctly determines appropriate action (Download or FetchInfo) based on current download state
  + Better handling of tasks waiting for network availability
  + Fixed `waitingForNetwork` logic to prevent stale states

---

## [2.6.0] - 2026-04-27

### 🔒 Security Hardening

* **PBKDF2 PIN Hashing**
  + PIN-based App Lock now hashes passwords using **PBKDF2WithHmacSHA256** with a unique 16-byte random salt and 200,000 iterations — replacing the weak single-pass SHA-256 approach
  + Existing PIN users are automatically migrated to the new secure hash on next unlock
  + Industry-standard protection against brute-force and rainbow-table attacks

* **Removed Overly Broad Storage Permission**
  + `MANAGE_EXTERNAL_STORAGE` has been removed from the manifest
  + All download paths now work without requiring the "All Files Access" permission

* **ADB Backup Protection**
  + MMKV preferences (which store your PIN hash, security settings, and download preferences) are now excluded from ADB backups via `backup_rules.xml`
  + Prevents sensitive configuration from leaking through device backups

* **NotificationActionReceiver Secured**
  + `NotificationActionReceiver` is now explicitly set to `exported=false` in the manifest, preventing third-party apps from sending fake notification action intents

* **MITM Prevention on Proxy**
  + `--no-check-certificate` is now automatically disabled when a proxy is active, preventing man-in-the-middle attacks when routing traffic through a proxy server

* **Replaced Embedded GitHub Token**
  + Sponsor data is now fetched from a public, unauthenticated JSON URL — no API token embedded in the APK

* **Proxy Security Warning Dialog**
  + A security warning `AlertDialog` is now shown before enabling the free proxy mode, informing users of the risks of routing traffic through unknown third-party servers

### 🛡️ Brute-Force Protection

* **30-Second Lockout on App Lock**
  + After 5 failed PIN attempts, the App Lock screen now shows a **30-second countdown timer** before allowing further attempts
  + Countdown is fully animated and stored in state surviving recomposition

### 🐛 Stability & Correctness (20 Fixes)

* **Context Leak Fixed**
  + `MainActivity` no longer overwrites `App.context` with the Activity context — prevents memory leaks and crashes on activity recreation

* **Replaced runBlocking Calls**
  + All `runBlocking` usages in `MainActivity` and `QuickDownloadActivity` replaced with `lifecycleScope.launch(Dispatchers.IO)`, preventing ANRs on slow devices
  + `PreferenceUtil.getTemplate()` retry loop migrated from `runBlocking` to proper coroutine

* **OkHttp Client Improvements**
  + Added explicit connect/read/write timeouts to the `UpdateUtil` HTTP client
  + `OkHttpClient` singletons now shared across `ProxyManager`, `ProxyValidator`, `SponsorUtil`, and `FormatValidator` — eliminates per-call thread pool churn and reduces memory pressure

* **Resource Leak Fixes**
  + `SQLiteDatabase` and `Cursor` now properly closed with `.use{}` blocks even on exception
  + `DownloadUtil` archive file now streamed line-by-line instead of fully read into memory

* **Coroutine & State Fixes**
  + 5-minute deadline added to `addToDownloadQueue` to prevent coroutine leaks
  + `ConcurrentHashMap` used for `resumedProgressMap` and `retryCountMap` in `DownloaderV2` to prevent race conditions
  + `updateJob` in the updater page now held in `remember { mutableStateOf }` to survive recomposition
  + `distinctUntilChanged` added and `flowOn` position corrected in `VideoListViewModel`
  + Koin `get<DownloaderV2>()` moved from field initializer to `onReceive()` body in `NotificationActionReceiver`

* **Error & Notification Fixes**
  + Error notifications now use `throwable.message` instead of `stackTraceToString()` to avoid truncated/ugly system notifications
  + `isServiceRunning` flag in `App` now `@Volatile` and correctly reset in `onServiceDisconnected`
  + `COMMAND_DIRECTORY` path now correctly persisted when calling `updateDownloadDir`
  + Null-safe response body handling in `UpdateUtil.getLatestRelease` and `downloadApk`
  + OkHttp response socket properly closed in `ProxyValidator.testConnection`

* **Download & Format Fixes**
  + `av01` codec removed from the unsupported video codecs blacklist — AV1 downloads now work correctly
  + `FormatValidator.filterValidFormats` parallelized with `async/awaitAll` for faster format page loading
  + `makeKey()` now uses a null-char (`\0`) delimiter to prevent hash collisions between URL+template combos
  + Fixed literal `"null"` string being stored in download records when URL was null
  + `HomePageViewModel.updateState(Idle)` now only called inside `onSuccess`, not on every state change
  + DB write moved before `StateFlow.update{}` in `CookiesViewModel` to prevent stale UI state

* **Backup & File Fixes**
  + Backup filename now uses `SimpleDateFormat("yyyy-MM-dd_HH-mm-ss")` for consistent cross-platform filenames
  + `importBackup` correctly handles template import logic
  + `hideItem`/`unhideItem` now uses atomic `renameTo()` with copy+delete fallback for reliability
  + `FileUtil.getRealPath` improved with `Log.w` for non-primary storage paths

### 🎨 Material3 1.3.1 Stable Migration

* **Upgraded from Alpha to Stable Compose BOM**
  + Switched from `compose-bom-alpha` to the stable `compose-bom` (Material3 1.3.1)
  + Resolved all breaking API changes introduced in the stable release

* **Fixed API Breaking Changes**
  + `SheetState`: replaced deprecated `velocityThreshold` / `positionalThreshold` parameters with `density` in `ModalBottomSheetM3`, `ActionSheet`, `DownloadDialogV2`, and `SponsorPage`
  + `TooltipDefaults`: replaced removed `rememberTooltipPositionProvider()` with `plainTooltipPositionProvider()` in `DownloadPage` and `PlaylistSelectionPage`
  + `ExposedDropdownMenu`: replaced alpha-only `ExposedDropdownMenuAnchorType` with stable `MenuAnchorType` in `YtdlpUpdateDialog`

* **Dependency Downgrades to Stable**
  + `OkHttp` downgraded from `5.0.0-alpha.14` → `4.12.0` (stable)
  + `androidx.biometric` upgraded to `1.2.0-alpha05` for better OEM compatibility

### 🏠 Home Page Sync Fix

* **Instant Recent Downloads Sync**
  + Replaced lifecycle-gated `collectAsStateWithLifecycle` with a composition-lifetime `LaunchedEffect` collector for the download history flow
  + Deletions made on the VideoList page are now reflected in **Recent Downloads instantly** without needing a process restart
  + Added `LaunchedEffect(recentDownloads)` to prune stale `localHiddenIds` entries when DB records are removed

* **Real-Time Missing File Detection**
  + File existence for each Recent Download card is now re-checked on every `ON_RESUME` event using `produceState` with a `lifecycleRefreshTrigger`
  + Files deleted from the OS file manager now **gray out immediately** the next time you return to the home screen — no process kill required

### 🌐 Sponsor Data Refactor

* **New Social Account & Sponsorship Data Classes**
  + `SocialAccount`, `SocialAccounts`, `SponsorEntity`, `Tier`, and `SponsorShip` data classes added for structured sponsor data
  + Sponsor page now renders richer profile information from the new model

* **Thread-Safe Sponsor Cache**
  + Sponsor data cache in `SponsorUtil` is now protected with `@Volatile` + synchronized double-checked locking
  + Compose state mutations dispatched to the Main thread in `SponsorPage` to prevent `IllegalStateException`

### 🌍 Website & SEO Improvements

* **Official Sealplus Website**
  + CNAME configured for the official Sealplus domain
  + `sitemap.xml` added and linked in `index.html` and `privacy.html`
  + `robots.txt` added to manage web crawler access
  + Google site verification meta tag added
  + Canonical and sitemap links updated to reflect the new domain
  + Title, description, and keywords updated for Sealplus branding

---

### 📦 Installation

Download the appropriate APK for your device:

* **Universal APK**: Works on all devices (recommended)
* **arm64-v8a**: For 64-bit ARM devices (most modern phones)
* **armeabi-v7a**: For 32-bit ARM devices
* **x86_64**: For 64-bit x86 devices
* **x86**: For 32-bit x86 devices

### ✨ Key Features (v2.6)

* 🔒 **PBKDF2 PIN Hashing** - Industry-standard 200K-iteration secure PIN protection with salt
* 🛡️ **30-Second Brute-Force Lockout** - Countdown timer after 5 failed PIN attempts
* 🔐 **Removed Overly Broad Storage Permission** - No more MANAGE_EXTERNAL_STORAGE required
* 💾 **ADB Backup Protection** - MMKV sensitive data excluded from device backups
* 🚫 **MITM Prevention** - SSL checking re-enabled when proxy is active
* 🧹 **20 Stability & Correctness Fixes** - Context leak, runBlocking, timeouts, resource leaks, race conditions
* 🎨 **Material3 1.3.1 Stable** - Migrated from alpha BOM, OkHttp stable 4.12.0
* 🏠 **Instant Home Page Sync** - Recent Downloads instantly updated on deletion or file removal
* 🌐 **Sponsor Data Refactor** - Thread-safe cache, richer profile data
* ⏯️ **Pause/Resume downloads** with queue support
* 🌐 Download from 1000+ sites via yt-dlp

---

## [2.5.0] - 2026-04-06

### 🔒 Hidden Content & Privacy

* **Hidden Content Management System**
  + New **Hidden Content** page accessible directly from the navigation drawer
  + Mark any downloaded video as hidden — it disappears from the home page and download list instantly
  + Hidden files are physically relocated to a **private isolated directory** inaccessible from the system file manager
  + Access requires **PIN or biometric authentication** via the existing App Lock system
  + If App Lock is not set up, the app shows a clear error message guiding you to Settings → SealPlus Extras → App Lock
  + Optimistic UI: the card vanishes immediately on hide action before the database write completes

### 🎨 Format Selection UI Overhaul

* **Redesigned Format Cards**
  + File size and bitrate are now shown in dedicated sections on every format card
  + Improved visual hierarchy for codec, resolution, and quality information at a glance

* **List View for Format Cards**
  + New list-style layout option for format cards in the format selection page
  + Toggle it on or off from Settings → SealPlus Extras

* **Merge Audio Stream Option**
  + New toggle on the Format Page to merge a separate audio stream into the selected video format
  + Hint text is displayed when the merge option is active so you always know what will happen

* **Removed Suggested Section**
  + The "Suggested" section has been removed from the format selection page for a cleaner layout

* **Download Dialog Loading State**
  + Loading screen in the download dialog now shows a thumbnail image alongside the progress indicator instead of a plain spinner

* **SealPlus Extras Expanded**
  + New format-related preference options added to the SealPlus Extras settings page

### ⬇️ Download Engine Reliability

* **Auto-Retry on Network Error**
  + Downloads that fail due to a network drop are automatically retried up to **3 times** with a 5-second delay between each attempt
  + Progress text shows `Retrying (1/3)...` during backoff so you always know what's happening

* **Resume Partial Downloads**
  + `--continue` is now always passed to yt-dlp so interrupted downloads pick up from the partial file instead of restarting from scratch

* **WiFi-Only Mode Fully Enforced**
  + The network restriction setting now enforces inside the download engine itself, not just at the enqueue step
  + Queued tasks **automatically resume** the moment a suitable network becomes available again

* **Fixed Task ID Collision**
  + Downloading the same URL twice with identical settings would previously overwrite the first task in the queue
  + Each task now receives a guaranteed-unique ID based on timestamp

### 📊 Download Progress UI

* **Active Download List Sorting**
  + Downloads are now sorted in a strict, stable order: Running → ReadyWithInfo → Idle → Paused → Canceled/Error → Completed
  + Within each group, newer tasks appear first
  + Completed tasks are shown in the active list only until they appear in the recent-downloads section — no duplicates

* **Speed & ETA on Home Cards**
  + Active download cards now show live speed and estimated time, e.g. `2.50 MiB/s  •  ETA 00:03`

* **Merging Phase Detection**
  + Download cards now correctly show **"Merging..."** while yt-dlp is post-processing instead of staying frozen at 100%

* **Fixed -1% / 0% Progress Bug**
  + During the initial phase before yt-dlp reports real progress, the percentage is now hidden instead of showing `-1%` or `Paused 0%`
  + Progress bar shows a smooth **indeterminate/pulsing animation** when no progress data is available yet

### 🗂️ Completed Downloads

* **Missing File Detection**
  + If a downloaded file has been deleted or moved, its home page card now renders **grayed out** with a broken-image icon and "File no longer available" label

### ⚡ Performance Improvements

* **Reduced CPU Usage During Downloads**
  + The internal task scheduler now only fires when a task actually changes state (starts, finishes, errors, pauses) — not on every progress update

* **Reduced Battery & Storage Writes**
  + Full task list serialization to MMKV storage now only happens on meaningful structural state changes, cutting storage I/O to near zero during normal download progress

### 🌍 Translations

* **61 Languages Updated**
  + New `video_audio_merge_hint` and `download_and_merge` strings added across all 61 supported languages

* **Build-Breaking Escape Fix**
  + Corrected unescaped apostrophes in Belarusian (`be`), Punjabi (`pa`), and Ukrainian (`uk`) string files

* **Complete Hebrew Translation** — thanks to [@613avi](https://github.com/613avi)
  + 185 previously missing Hebrew strings have been filled in

* **Improved Turkish Translation** — thanks to [@mikropsoft](https://github.com/mikropsoft)
  + Revised and improved accuracy across dozens of Turkish strings

### 🔧 Other Fixes & Improvements

* Added option to **ignore SSL certificates** for filtered networks (e.g. Netfree) — thanks to [@613avi](https://github.com/613avi)
  + `--no-check-certificate` applied across all 5 request paths: playlist info fetch, video info fetch, video download, and both custom command execution paths
* Navigation drawer header layout polished — improved text hierarchy, spacing, and logo alignment
* Sponsors page and component architecture refactored for cleaner separation of concerns
* Removed & cleaned up unused imports across 24 source files (89 lines removed)

---

## [2.4.0] - 2026-03-10

### ✨ Animated Branding & Visual Polish

* **Animated Glowing "+" Logo**
  + The "+" in "Seal+" on the home page now features a flowing gradient animation (primary → tertiary → secondary)
  + Continuous pulsing glow shadow effect for a premium, eye-catching look
  + Hardware-accelerated infinite transition for smooth 60fps rendering

* **Gradient Circular Progress Indicator**
  + Replaced the plain loading spinner in the download dialog with a premium sweep-gradient spinner
  + Rotating arc with breathing animation and smooth color shifting (primary → tertiary → secondary)
  + 48dp canvas-based implementation with `StrokeCap.Round` for modern aesthetics

### 🎨 UI & Theme Enhancements

* **Typewriter URL Placeholder Animation**
  + The "Enter URL to download" placeholder text now reveals character-by-character with a typewriter effect
  + Flowing gradient brush on the placeholder text matching the Seal+ brand colors
  + One-time animation on page load (50ms per character) for a clean, premium feel

* **Redesigned Navigation Drawer Header**
  + Center-aligned modern header layout with app logo (512×512 splash logo), "Seal Plus" title, "Download Manager" subtitle, and version badge
  + Removed active/selected state highlighting from all drawer items for a cleaner look
  + Reorganized drawer menu items into logical groups for better navigation clarity

* **Dark Theme On by Default**
  + New installations now default to dark theme instead of following the system setting
  + Existing users keep their saved preference; everyone can still switch in Settings → Look & Feel

### 🎯 Consistent Icon Theming

* **Material Theme Color Refactor**
  + Refactored icon tinting across 30+ screens to use `MaterialTheme.colorScheme` instead of hardcoded colors
  + Icons now use `primary`, `secondary`, and `tertiary` colors from the active theme
  + Ensures consistent look across Light, Dark, and Gradient Dark themes

### 🍞 Themed Toast System

* **Custom Themed Toast Manager**
  + Replaced standard Android toasts with a branded themed toast system
  + Toasts now match the app's Material 3 color scheme with rounded corners and proper styling
  + Integrated across all activities for a unified notification experience

### 🔗 Share Intent & Navigation

* **Share Intent URL Handling**
  + URLs shared from other apps (browsers, social media) now automatically pre-fill in the download input field
  + Seamless integration — tap "Share" in any app, select Seal Plus, and the URL is ready to download

* **Navigation Route Updates**
  + Sponsor page navigation now redirects to the Support Developer page for streamlined user flow
  + Settings toggle click behavior and icon animations improved for better UX

---

### 📦 Installation

Download the appropriate APK for your device:

* **Universal APK**: Works on all devices (recommended)
* **arm64-v8a**: For 64-bit ARM devices (most modern phones)
* **armeabi-v7a**: For 32-bit ARM devices
* **x86_64**: For 64-bit x86 devices
* **x86**: For 32-bit x86 devices

### ✨ Key Features (v2.4)

* ✨ **Animated Glowing "+"** - Flowing gradient animation on Seal+ branding
* 🎨 **Typewriter URL Placeholder** - Character-by-character animated input hint
* 🔄 **Gradient Spinner** - Premium sweep-gradient loading indicator
* 🧭 **Redesigned Navigation Drawer** - Center-aligned header with logo and version badge
* 🎯 **30+ Icon Theme Refactor** - Consistent MaterialTheme colors across all screens
* 🍞 **Themed Toast System** - Branded toast notifications matching app theme
* 🔗 **Share Intent Support** - Pre-fill URLs from external app shares
* 🌙 **Dark Theme Default** - Dark mode enabled by default for new users
* ⏯️ **Pause/Resume downloads** with queue support
* 🌐 Download from 1000+ sites via yt-dlp

---

## [2.3.0] - 2026-03-03

### ⚙️ Seal Plus Extras Enhancements

* **Aria2c Connection Control**
  + Added a connection count selector in Settings → Seal Plus Extras
  + Choose between 2, 4, 8, 16, 32 or more simultaneous aria2c connections to maximize download speed
  + Setting takes effect immediately on the next download

* **Sponsor Support Dialog Controls**
  + Added a dedicated *Support & Sponsorship* section in Seal Plus Extras
  + Users can configure how often the sponsor support dialog is shown: Off, Weekly, or Monthly
  + Dialog opens the Support Developer page when tapped, respects the chosen schedule, and persists timing across restarts

### 📊 Download Details Improvements

* **Average Speed Display**
  + Download Details dialog now shows the computed average download speed (e.g. `3.2 MB/s`)
  + Derived from total file size ÷ elapsed download time for accurate reporting
  + Hidden automatically for older history entries that predate this feature

* **Download Time Display**
  + Download Details dialog now shows total time taken (e.g. `2m 34s`)
  + Captured as precise start-to-end duration around the actual yt-dlp execution
  + Available in both the active-download details panel and the history drawer
  + Stored in the database (Room migration v5 → v6, existing rows default to `-1`)

### 🎨 UI & Format Card Improvements

* **Clean Resolution Labels on Format Cards**
  + Format selection cards now show concise human-readable titles (`1080×1920`) instead of raw yt-dlp format strings
  + Priority order: explicit width/height metadata → `Format.resolution` field → regex-extracted `WxH` → audio-only label → format ID fallback
  + Applied to both suggested-format items and individual format list items

* **Redesigned Video Detail Drawer**
  + Overhauled download-history detail sheet with a modern card-based layout
  + 16:9 thumbnail card with rounded corners, source-URL card with copy/open actions
  + Stats grid showing Download Time and Average Speed side-by-side
  + Full-width Delete (outlined, error color) and Share/Re-download action buttons

### 🚀 Smart Stream-Merge Routing

* **Platform-Aware Format Selection**
  + Only YouTube and Reddit natively separate video-only and audio-only streams, so they continue to use the merge path (`videoId` + `audioId`)
  + All other platforms serve fully-muxed video+audio streams; the default download now picks the best combined format directly via `videoAudioFormats`, skipping the redundant merge step entirely
  + Falls back to the merge path automatically when no combined format is available

---

### 📦 Installation

Download the appropriate APK for your device:

* **Universal APK**: Works on all devices (recommended)
* **arm64-v8a**: For 64-bit ARM devices (most modern phones)
* **armeabi-v7a**: For 32-bit ARM devices
* **x86_64**: For 64-bit x86 devices
* **x86**: For 32-bit x86 devices

### ✨ Key Features (v2.3)

* ⚙️ **Aria2c Connection Control** - Tune parallel connections (2–32+) for maximum download speed
* 📊 **Average Speed & Download Time** - See real download metrics in the details dialog
* 🚀 **Smart Stream-Merge Routing** - Automatic best-format selection per platform, no redundant merges
* 🎨 **Clean Format Cards** - Human-readable resolution labels instead of raw format strings
* 💎 **Sponsor Dialog Controls** - Flexible Off/Weekly/Monthly schedule in Seal Plus Extras
* 🏎️ **Aria2c Speed Boost** - Up to 32x parallel connections for ultra-fast downloads
* 🔄 **Retry failed downloads** - One-click recovery for canceled/failed downloads
* ⏯️ **Pause/Resume downloads** with queue support
* 🌐 Download from 1000+ sites via yt-dlp

---

## [2.2.0] - 2026-02-27

### 🚀 Performance Optimization

* **Aria2c Speed Boost & Fixes**
  + Fixed an argument quoting issue that previously forced aria2c into a slow, single-connection fallback mode
  + Doubled parallel connection limits (from 8 to 16 streams) for a massive real-world download speed improvement
  + Cleaned up redundant summary interval arguments for better libaria2c.so compatibility

### 🛠️ Core Downloader Fixes

* **Accurate Resolution Selection**
  + Resolved a major bug where the app would ignore the user's chosen video resolution and fall back to default quality
  + Corrected internal format validation to prevent stale state captures during format list generation
  + Fixed audio codec checks to ensure the exact selected resolution is properly merged and passed to yt-dlp

### 🎨 UI & Notification Improvements

* **Cleaner Progress Tracking**
  + Stripped the unnecessary `[download]` prefix from yt-dlp progress text for a cleaner display in cards and active notifications
  + Fixed progress bar threshold logic so early download progress (0.1–0.9%) shows a real bar instead of an indeterminate spinner

---

### 📦 Installation

Download the appropriate APK for your device:

* **Universal APK**: Works on all devices (recommended)
* **arm64-v8a**: For 64-bit ARM devices (most modern phones)
* **armeabi-v7a**: For 32-bit ARM devices
* **x86_64**: For 64-bit x86 devices
* **x86**: For 32-bit x86 devices

### ✨ Key Features (v2.2)

* 🏎️ **Aria2c Speed Boost** - 16x parallel connections for ultra-fast downloads
* 🎯 **Precise Quality Selection** - Reliable resolution and format merging
* 🎨 **Enhanced Notifications** - Cleaner, accurate progress tracking right from the start
* 🔄 **Retry failed downloads** - One-click recovery for canceled/failed downloads
* 💎 **Sponsors feature** - API integration with dynamic display
* ⏯️ **Pause/Resume downloads** with queue support
* 🌐 Download from 1000+ sites via yt-dlp

---

## [2.1.0] - 2026-02-16

### 🔄 Download Management Enhancements

* **Retry Option for Failed/Canceled Downloads**
  * **Retry button** - Added retry functionality in canceled or failed state download cards
  * **One-click recovery** - Quickly restart failed downloads without re-entering URL
  * **Smart state management** - Maintains download preferences and settings
  * **Error recovery** - Automatically handles temporary failures

### 📊 Download Details & UI Improvements

* **Enhanced Details Dialog**
  * **Resolution section** - Added comprehensive resolution information in details dialog
  * **Direct full-length display** - Details dialog now opens directly at full length for better visibility
  * **Improved information layout** - Better organized video/audio resolution details
  * **Format specifications** - Clear display of codec, bitrate, and quality information

### ⚡ Performance Optimization

* **Download Speed Optimization**
  * **Higher download speeds** - Implemented advanced speed optimization algorithms
  * **Enhanced aria2c configuration** - Optimized multi-connection download parameters
  * **Network efficiency** - Better bandwidth utilization and connection management
  * **Reduced latency** - Faster initial connection and data transfer start

### 💎 Sponsors Feature

* **API Integration & Display**
  * **Sponsors API** - Integrated sponsor data fetching from API endpoint
  * **Dynamic sponsor dialog** - Beautiful sponsor display with profile information
  * **Real-time updates** - Sponsor list updates automatically from server
  * **Enhanced UI** - Premium gradient design for sponsor acknowledgment
  * **Support recognition** - Proper attribution and thanks to project supporters

### 🐛 Bug Fixes & Improvements

* Improved download state management for retry functionality
* Enhanced dialog opening animations for details view
* Better error handling in failed download scenarios
* Optimized memory usage during high-speed downloads
* Fixed UI responsiveness in details dialog
* Improved sponsor data caching and loading

---

## [2.0.0] - 2026-02-05

### 🚀 Major Release - Revolutionary Download Management

**Package Name Changed:** `com.maheshtechnicals.sealplus`

⚠️ **Important Note:** App package name has changed. Please uninstall the old app and install this new version. If using auto-update feature, download the new version from the app, install it, then remove the old app.

### ⏯️ Download Control & Management

* **Pause and Resume Functionality**
  * **Pause/Resume in three-dot menu** - Control downloads from the overflow menu
  * **Icon controls on download cards** - Quick pause/resume buttons directly on cards
  * **Queue support** - Manage multiple downloads with proper queuing
  * **Progress preservation** - Download progress saved when paused
  * **Resume from exact position** - Continue downloads from where you left off

* **Concurrent Downloads Control (1-5 simultaneous downloads)**
  * **Configurable download limits** - Control how many files download at a time
  * **Queue management** - Automatic queuing of additional downloads
  * **Settings location** - Available in Settings → Seal Plus Extras
  * **Performance optimization** - Better resource management with queue system

### 🌐 Advanced Proxy Settings (BETA)

* **Comprehensive Proxy System**
  * **Auto-fetch proxies** - Automatically fetch proxies by country selection
  * **Auto-test functionality** - Test proxies sequentially until finding a working one
  * **Free proxy support** - Access free proxies from multiple countries
  * **Custom proxy configuration** - Add your own HTTP/HTTPS/SOCKS proxies
  * **Beta features** - Advanced proxy management marked as experimental

### 📊 Download Details & Information

* **Comprehensive Details Dialog**
  * **File information** - Name, thumbnail, size, format
  * **Download metadata** - Path, download date, source URL
  * **Interactive elements** - Click to copy URLs, view full paths
  * **Visual improvements** - Better layout with gradient headers

* **Enhanced Download Status Messages**
  * **Clear status indicators** - "Fetching data", "Downloading video", "Downloading audio", "Merging"
  * **Real-time progress** - Live updates on download phases
  * **Better error messages** - More descriptive error information

### 💰 Developer Support Features

* **Payment Integration**
  * **UPI payment support** - Support developers through UPI donations
  * **Multiple payment options** - Various ways to contribute
  * **Support Developer page** - Dedicated page for developer support options

* **Enhanced Sponsors Page**
  * **Fully redesigned UI** - Modern, engaging layout
  * **Better organization** - Clear sections for different support methods
  * **Improved user engagement** - More interactive and informative

### 🔔 Notifications & Permissions

* **Smart Permission Management**
  * **Notification permissions** - Proper Android 13+ notification permission handling
  * **Battery optimization** - Smart prompts for battery optimization settings
  * **Permission dialogs** - Material Design 3 permission request dialogs
  * **Settings integration** - Direct access to system settings when needed

* **Release Notifications**
  * **Telegram integration** - Automatic notifications to Telegram for new releases
  * **Publishing workflow** - Streamlined release publishing to Telegram groups

### ⚙️ Configuration Updates

* **yt-dlp Settings**
  * **Stable build default** - Changed from nightly to stable build for better reliability
  * **Settings location** - Settings → General → yt-dlp settings
  * **Improved stability** - More reliable downloads with stable releases

### 🐛 Bug Fixes & Improvements

* Fixed download progress preservation when pausing/resuming
* Improved error message handling and display
* Enhanced download phase detection and status updates
* Better UI spacing and layout across download cards
* Fixed permission handling flows
* Improved proxy connection handling
* Better resource management with concurrent downloads

---

## [1.2.8] - 2026-02-02

### 🎥 Format Selection Screen Improvements

* **Enhanced Format Filtering**
  * **Valid URLs Only** - Now filters and shows only valid video and audio URLs
  * **Cleaner Interface** - Invalid or unavailable formats are automatically hidden
  * **Improved Reliability** - Better format validation before display

* **Maximum Quality Support**
  * **Highest Resolution Downloads** - Support for maximum resolution available
  * **No Quality Limits** - Download content at the best quality offered by the source
  * **Smart Quality Detection** - Automatically identifies highest available quality

* **Video & Audio (High) Merged**
  * **Best Quality Option** - New "video & audio (high)" merged format in video section
  * **Optimal Output** - Combines highest quality video with highest quality audio
  * **Seamless Merging** - Automatic stream combination for best results

* **Bug Fixes**
  * Fixed video info couldn't fetch error
  * Improved format extraction reliability
  * Better error handling for unavailable formats

### 📥 Recent Downloads Section Updates

* **UI/UX Improvements**
  * **Removed Delete Option** - Delete functionality moved to Downloads page for better organization
  * **Fixed UI Issues** - Resolved layout problems and visual inconsistencies
  * **Cleaner Design** - Streamlined interface for better user experience

* **Additional Improvements**
  * Enhanced performance and stability
  * Better download state management
  * Improved visual feedback

---

## [1.2.7] - 2026-01-24

### ✨ UI Redesign & UX Improvements

* **Fully Redesigned Home Page**
  * **Modern, clutter-free interface** with cleaner layout and improved visual hierarchy
  * **Enhanced navigation** for smoother access to core features
  * **Optimized performance** for faster loading and smoother scrolling
  * **Refined aesthetics** matching the premium Gradient Dark theme

* **Redesigned Navigation Drawer**
  * **Modern Gradient Header** with theme-aware colors (Purple/Blue for Dark, Soft for Light)
  * **App Branding** with prominent "Seal Plus" typography and version badge
  * **Improved Organization** with clear section dividers and better spacing
  * **Visual Enhancements** including new icon containers and hover effects

### 🚀 Video Quality & Formats

* **Enhanced Video/Audio Merging**
  * **Automatic merging** of best video and best audio streams in "Suggested" format
  * **Highest quality guarantee** - Now gets the absolute best resolution available by combining streams
  * **Seamless processing** - Merging happens automatically in the background

* **High Quality Download Options**
  * **"Suggested" section upgrade** - Now explicitly prioritized for highest resolution/bitrate
  * **Smart quality selection** - Automatically picks the top-tier quality available
  * **Better format detection** for complex media sources

### 🎯 Improvements

* **Homepage Delete Fixed**: Resolved issue where delete button in three-dot menu was unresponsive
* **Duplicate Cards Fixed**: Solved issue where downloads appeared twice in active/recent lists
* **Crash Fix**: Fixed NPE crash when deleting items from active list
* **Performance optimization** for list rendering and database operations

---

## [1.2.6] - 2026-01-14

### ✨ New Features

* **Enhanced Video Download Quality**
  * **Highest Resolution MP4 Selection** - Automatically select the best available MP4 format for video downloads
  * Smart format selection prioritizes quality while maintaining compatibility
  * Optimized for maximum video quality with MP4 container support

* **Advanced Download Configuration**
  * **External Downloader Arguments** - Added aria2c external downloader arguments support
  * Enables advanced aria2c configurations for multi-threaded downloads
  * Better control over download behavior and performance tuning

### 📦 Dependencies

* **Updated yt-dlp Engine**
  * Updated youtubedl-android library to 0.18.1
  * Includes yt-dlp 2025.12.08 with latest site support and bug fixes
  * Improved download reliability and compatibility across platforms
  * Enhanced format detection and extraction capabilities

### 🎯 Improvements

* Better video format selection algorithm for optimal quality
* Enhanced aria2c integration for faster multi-segment downloads
* Improved download stability with latest yt-dlp improvements

---

## [1.2.5] - 2026-01-09

### ✨ New Features

* **Professional Onboarding Screens**
  * **4 beautifully designed pages** - Welcome, Downloads, Customizable, and Security
  * **Smooth animations** - Spring bounce, fade transitions, and morphing page indicators
  * **Swipe navigation** - HorizontalPager with intuitive swipe gestures
  * **Skip/Back/Next controls** - Flexible navigation through onboarding flow
  * **Theme integration** - Matches Gradient Dark theme with floating gradient blobs
  * **Glow effects** - Beautiful icon animations with blur effects
  * **First-time detection** - Automatically shows on first launch, then skips
  * **Settings access** - "View Onboarding" option in About page for easy review
  * **Material Design 3** - Professional UI following latest design guidelines

* **Elegant Splash Screen**
  * **Animated logo** - Spring bounce animation with smooth scaling
  * **Gradient branding** - Pulsing glow effect with app theme colors
  * **Theme-aware** - Adapts to Gradient Dark mode and light themes
  * **Professional timing** - 2.4s optimal display duration
  * **Powered by Mahesh Technicals** - Custom branding with copyright notice

### 🐛 Bug Fixes

* **Network Download Fix**
  * Fixed "Any Network" option not allowing mobile data downloads
  * Downloads now work correctly on both WiFi and mobile data when "Any Network" is selected
  * Improved network availability detection in PreferenceUtil

### 🎨 UI/UX Improvements

* Enhanced first-time user experience with guided onboarding
* Smooth app launch with professional splash screen
* Better app branding and identity
* Improved visual feedback during app initialization

## [1.2.4] - 2026-01-08

### 🔒 New Feature: App Lock (Security & Privacy)

* **Complete App Lock System with Multi-Factor Authentication**
  * **4-digit PIN protection** - Fast and secure PIN authentication
  * **Biometric authentication** - Unlock with fingerprint or face recognition on supported devices
  * **Lock screen on access** - Automatically authenticate before accessing security settings when AppLock is enabled
  * **Old PIN verification** - Secure PIN change requires verification of current PIN
  * **Complete reset option** - Reset all AppLock settings and start fresh if needed
  
* **Smart Timeout Management**
  * **Immediately** - Always require authentication every time app is opened (NEW)
  * **Flexible timeouts** - Choose from 1, 2, 5, 10, 15, 30, or 60 minutes of inactivity
  * **Persistent timeout** - Timeout settings survive app restarts using MMKV storage
  * **Require auth on launch** - Option to always authenticate when opening app
  * **Background protection** - Auto-lock when app goes to background
  
* **Secure Implementation**
  * **SHA-256 PIN hashing** - Your PIN is never stored in plain text
  * **MMKV encrypted storage** - All authentication data securely stored locally
  * **Brute force protection** - Maximum 5 attempts with auto-dismiss
  * **No cloud sync** - All data stays on your device for maximum privacy
  
* **Beautiful Material Design 3 UI**
  * **Animated lock screen** - Smooth transitions with number pad
  * **PIN dots indicator** - Clear visual feedback (4 dots for 4-digit PIN)
  * **Error animations** - Shake animation on incorrect PIN
  * **Theme support** - Works with all themes including Gradient Dark
  * **Haptic feedback** - Touch feedback for better user experience
  
* **Comprehensive Settings**
  * Enable/disable App Lock easily
  * Toggle biometric authentication on/off
  * Change PIN anytime (with old PIN verification)
  * Configure authentication timeout (Immediately to 60 minutes)
  * Reset all AppLock settings and data
  * Access via: Settings → Seal Plus Extras → Security & Privacy → App Lock

### 🎨 UI/UX Improvements

* **Enhanced security settings page** with intuitive controls
* **Animated lock screen** with smooth number pad interactions
* **Clear visual feedback** for all authentication states
* **Confirmation dialogs** for critical security actions
* **Accessibility compliant** - Proper content descriptions and contrast ratios
* **Exit Confirmation Dialog** - Stylish and professional confirmation dialog when exiting from Download Queue page
  * Prevents accidental app closure
  * Material Design 3 styled dialog
  * Theme-aware colors matching Gradient Dark and other themes
  * Clear messaging about ongoing downloads continuing in background
  * Smooth animations and haptic feedback

## [1.2.3] - 2026-01-07

### 🌐 Network Type Restrictions

* **Smart Network Control**
  * **Download only on WiFi, Mobile Data, or Any network** - Full control over network usage
  * Network type selector in download settings
  * Automatic pause when network type changes
  * Resume downloads when preferred network becomes available
  * Battery-friendly and data-conscious downloading
  * Prevents unwanted mobile data usage for large files
  * Configure per-download or globally in settings

### 🔔 Smart Notifications

* **Customizable Notification System**
  * **Customizable notifications** with sound, vibration, and LED settings per task status
  * Different notification profiles for:
    - Download started
    - Download in progress
    - Download completed (success)
    - Download failed (error)
    - Download paused/queued
  * **Per-task status customization**: Choose notification sound, enable/disable vibration, set LED color
  * Rich notification controls: Priority levels, channel management
  * Battery-efficient notification updates
  * Persistent notifications for active downloads
  * Actionable notifications (Pause, Cancel, Retry)
  * Grouped notifications for multiple downloads
  * Silent mode support with visual-only indicators

### 🧹 Codebase Cleanup

* **Documentation Improvements**
  * Removed redundant GRADIENT_DARK documentation files (7 files)
  * Streamlined project structure for better maintainability
  * Consolidated theme documentation in main README

## [1.2.1] - 2026-01-06

### 🎨 Branding Updates

* **New App Logo**
  * **Updated app launcher icon** with new Seal Plus branding
  * New adaptive icons with foreground, background, and monochrome layers
  * Updated all density folders (mdpi, hdpi, xhdpi, xxhdpi, xxxhdpi)
  * Modern Material You themed icon support for Android 13+
  * Properly configured round launcher icons for all devices
  * Enhanced visual identity across all Android launchers

## [1.2.0] - 2026-01-05

### 🔄 Auto-Update System Overhaul

* **Repository Migration**
  * **Updated auto-update system** to point to new repository: `https://github.com/MaheshTechnicals/Sealplus`
  * Changed release URL from `JunkFood02/Seal Plus` to `MaheshTechnicals/Sealplus`
  * All version checks now fetch from `https://github.com/MaheshTechnicals/Sealplus/releases`
  * In-app update notifications correctly display new repository releases
  * APK download URLs properly match new release structure

* **Auto-Update Enabled by Default**
  * **Auto-update is now ON by default** for all new installations
  * Users can still manually disable in Settings → About → Auto update
  * Seamless in-app updates without manual APK downloads
  * Automatic version checking and changelog display

* **GitHub Actions Release Workflow Improvements**
  * **Fixed release publication status** - releases now properly marked as "published"
  * Added `make_latest: true` to ensure releases appear as latest on GitHub
  * Improved release notes with Gradient Dark theme mention
  * Auto-update feature now highlighted in release descriptions
  * Proper release tagging and asset upload synchronization

* **About Page Updates - Seal Plus Branding**
  * **Updated README link** to open `https://github.com/MaheshTechnicals/Sealplus/blob/main/README.md`
  * **Updated Latest release** to fetch from `https://github.com/MaheshTechnicals/Sealplus/releases`
  * **Changed Telegram channel** to `https://t.me/maheshtechnicals`
  * **Removed Matrix space** option from About screen
  * **Added YouTube channel** at `https://youtube.com/@maheshtechnicals` with custom icon
  * All community links now point to Mahesh Technicals channels
  * Maintained consistent spacing, icons, and text alignment

### 🎨 UI/UX Improvements

* **Navigation Drawer & Theming Consistency**
  * **Removed distracting footer** from navigation drawer (app name, version, route display)
  * **Enabled Gradient Dark mode by default** for all users (Settings → Look & Feel)
  * **Fixed Download Queue tab colors** to use gradient primary accent matching FAB
  * Tabs now use `primary` color for selected state (bold gradient accent) instead of subtle `primaryContainer`
  * Selected tab text uses `onPrimary` (high contrast white) for excellent readability
  * Unselected tabs use `surfaceContainerHigh` for better elevation and visual hierarchy
  * Achieved unified premium dark-gradient experience across all surfaces with proper contrast
  * Smooth color transitions with clear selected/unselected states

* **Comprehensive UI/UX Overhaul**
  * Fixed Download Queue page gradient dark theme integration
  * Improved tab visibility with better color contrast (primaryContainer vs fixed color roles)
  * Standardized card elevations using surfaceContainerHigh across all components
  * Normalized button styles: 48dp height, consistent padding (24dp horizontal, 12dp vertical)
  * Enhanced text hierarchy: upgraded to titleMedium for headings, bodyMedium for content
  * Standardized spacing: 16-20dp card padding, 24dp button padding
  * Improved corner radius consistency: 24dp (shapes.large) across all cards
  * Increased format selection card padding for better readability
  * Enhanced action sheet button styling with better spacing and typography

* **Format Selection Page - Major Improvements**
  * **Fixed critical text contrast bug**: Selected cards now use proper onPrimaryContainer/onSecondaryContainer colors instead of low-contrast accent colors
  * **Reordered sections** for better UX: Video → Audio → Video (no audio) instead of Audio → Video only → Video
  * **Enhanced section headers**: Upgraded to titleMedium (16sp), added subtle dividers (30% opacity) for clear visual grouping
  * **Improved card layout**: 18dp padding (up from 16dp), 2dp borders when selected (up from 1.5dp), 12dp grid spacing (up from 8dp)
  * **Better icon visibility**: All icons standardized to 18dp with 4dp spacing, animated colors for selected/unselected states
  * **Smooth animations**: 150ms color transitions (up from 100ms) for polished feel
  * **Applied gradient dark theme**: surfaceContainerHigh backgrounds, proper containerColor on Scaffold
  * **Reduced visual clutter**: 50% opacity borders when unselected, softer shadows, balanced accent usage

### 🐛 Bug Fixes

* **Build Configuration**
  * Fixed AndroidManifest.xml warning about extractNativeLibs attribute placement
  * Removed android:extractNativeLibs from manifest (now managed automatically by AGP via useLegacyPackaging)
  * Resolved AGP warning: "android:extractNativeLibs should not be specified in this source AndroidManifest.xml file"

### 🎨 Component Updates

* **AppEntry.kt**: Removed footer from NavigationDrawer (cleaner UI)
* **NavigationDrawer.kt**: Removed footer parameter and implementation
* **SelectionGroup.kt**: Updated to use primary/onPrimary colors for gradient accent tabs, removed LocalFixedColorRoles import
* **PreferenceUtil.kt**: Changed GRADIENT_DARK_MODE default from false to true
* **DownloadPageV2.kt**: Applied background color to Scaffold, improved tab padding
* **DownloadQueueItem.kt**: surfaceContainerHigh surface, titleMedium typography, 20dp padding, shapes.large
* **Buttons.kt**: 48dp defaultMinSize, standardized padding (24dp horizontal, 12dp vertical)
* **ModalBottomSheetM3.kt**: Added surfaceContainerHigh containerColor
* **VideoCardV2.kt**: surfaceContainerHigh in dark mode, titleMedium typography, shapes.large
* **FormatItem.kt**: Complete visual overhaul - proper selected/unselected colors, improved spacing, animated states
* **FormatPage.kt**: Reordered sections, improved headers with dividers, better grid spacing (12dp), gradient dark theme
* **ActionSheetItems.kt**: Improved button styling with shapes.large, 12dp text spacing, labelLarge typography

## [v1.1.0][1.1.0] - 2026-01-04

### ✨ New Features

* **Gradient Dark Theme - Premium UI Mode**
  * Added new "Gradient Dark" toggle in Look & Feel settings
  * Deep charcoal/obsidian backgrounds (#0A0A0F, #14141F) for perfect OLED viewing
  * Vibrant linear gradients (deep blues #5B47E5 → purples #8B5CF6)
  * Sophisticated glassmorphism effects with subtle borders and translucent surfaces
  * Premium card-based layouts with 20-24dp rounded corners
  * Smooth micro-animations (300ms fade-in, 150ms button press)
  * 5 new premium UI components:
    - PremiumGlassCard - Glassmorphism cards with animations
    - PremiumGradientButton - Gradient buttons with press effects
    - PremiumSectionHeader - Headers with gradient accents
    - PremiumInfoCard - Info cards with gradient borders
    - AnimatedCardContainer - Smooth entrance animations
  * Hardware-accelerated animations for smooth 60fps performance
  * WCAG AA compliant contrast ratios (4.5:1+)
  * Graceful fallback to Material 3 when disabled

### 📚 Documentation

* Added comprehensive Gradient Dark theme documentation:
  * Complete implementation guide (800+ lines)
  * Visual design reference with color swatches and gradients
  * Quick reference card with code snippets
  * 5 complete integration examples
  * API documentation for all components
  * 2,200+ lines of documentation across 6 files

### 🎨 Design System

* 21 new resource files (10 XML, 6 Kotlin, 5 documentation)
* 15+ carefully selected colors for dark aesthetic
* 4 gradient brushes (Primary, Secondary, Accent, Vibrant)
* Consistent spacing scale (4dp to 56dp)
* Professional animation timings

### Changed

* **Rebranded from "Seal" to "Seal Plus"**
  * Updated application name to "Seal Plus"
  * Changed application ID from `com.junkfood.seal` to `com.junkfood.sealplus`
  * Updated all README files and documentation
  * Debug variant now shows "Seal Plus Debug"
  * Preview variant now shows "Seal Plus Preview"

## [v2.1.1][2.1.1] - 2026-01-04

### 2026 Platform Updates

#### Updated

* **Platform & Build Tools**
  * Updated Android Gradle Plugin to 8.13.2 (latest stable, Dec 2025)
  * Updated Gradle to 8.13 (officially required for AGP 8.13)
  * Updated Kotlin to 2.0.21 (stable) with K2 compiler
  * Migrated from deprecated kotlinOptions to modern compilerOptions
  * Updated KSP to 2.0.21-1.0.28 for stable annotation processing
  * Updated to compileSdk/targetSdk 36 (required by latest AndroidX libraries)

* **Core Dependencies**
  * Updated Jetpack Compose BOM to 2025.01.00 (January 2025 stable release)
  * Updated AndroidX Core to 1.17.0 (Dec 2025)
  * Updated AndroidX AppCompat to 1.7.1 (Jun 2025)
  * Updated AndroidX Activity to 1.12.2 (Dec 2025)
  * Updated Lifecycle to 2.10.0 (Nov 2025)
  * Updated Navigation to 2.9.6 (Nov 2025)
  * Updated Room to 2.8.4 (Nov 2025)
  * Updated Graphics Shapes to 1.0.4 (Dec 2025)
  * Updated Kotlinx Coroutines to 1.10.1
  * Updated Kotlinx Serialization to 1.8.0
  * Updated Accompanist libraries to 0.36.0
  * Updated Coil to 2.7.0 with improved image loading
  * Updated OkHttp to 5.0.0-alpha.14

* **Testing & Quality**
  * Updated Espresso to 3.6.1
  * Updated AndroidX Test Ext to 1.2.1

* **CI/CD Infrastructure**
  * Updated GitHub Actions workflows to latest versions
  * Updated setup-java action to v4
  * Updated gradle/actions to v4
  * Updated android-actions/setup-android to v3.2.1
  * Updated actions/stale to v10 for issue management
  * Updated actions/checkout to v4 across all workflows

### Fixed

* Improved compatibility with Android 16 APIs
* Enhanced stability with latest Kotlin compiler
* Better memory management with updated coroutines

### Performance

* Faster build times with Gradle 8.12
* Improved runtime performance with Compose BOM 2026.01.00
* Optimized database operations with Room 2.7.0
* Enhanced network efficiency with OkHttp 5.0.0 stable

### Developer Experience

* Updated all development tools for 2026
* Improved CI/CD pipeline reliability
* Better code formatting with latest ktfmt
* Enhanced type safety with Kotlin 2.1.0

## [v2.0.0][2.0.0] - unreleased

### Notable changes from v1.13

- Concurrent downloading
- Download queue
- User interface overhaul
- Large screen support
- Resume failed/canceled download
- Backup & restore unfinished tasks in the download queue
- Select from formats/playlists in Quick Download
- Predictive back animation support for Android 14+
- Bump up minimum API level to 24 (Android 7.0)

## [v1.13.0][1.13.0] - 2024-08-18

### Fixed

- Fix the issue where exported command templates could not be imported in v1.12.x
- Fix an unexpected behavior where multiple formats would be selected

### Change

- Update `youtubedl-android` to v0.16.1
- Update translations

## [v1.12.1][1.12.1] - 2024-04-17

### Added

* Add auto update interval for yt-dlp
* Cookies page now shows the current count of cookies stored in the database

### Fixed

* Intercept non-HTTP(s) URLs opened in WebView
* Videos are remuxed to mkv even when download subtitle is disabled
* Use MD2 ModalBottomSheetLayout in devices on API < 30
* Block downloads when updating yt-dlp

### Known issues

* TextFields(IME) fallback to plain character mode when showing a ModalBottomSheet
* yt-dlp might be broken if you tried to download something while it was
  updating (`bad local file header`). To fix it, you just need to update yt-dlp again

## [v1.12.0][1.12.0] - 2024-04-05

### Added

* Search from download history
* Search from subtitles in format selection page
* Export download history to file/clipboard
* Import download history from file/clipboard
* Re-download unavailable videos
* Download auto-translated subtitles
* Remember subtitle selection for next downloads
* Remux videos into mkv container for better compatibility
* Configuration for not using the download type in the last download
* Improve UI/UX for download error handling
* Add splash screen
* Haptic feedback BZZZTT!!1!

### Changed

* Long pressing on an item in download history now selects it
* Use nightly builds for yt-dlp by default
* Migrate `Slider` & `ProgressIndicator` to the new visual styles in MD3
* Use default display name from system for locales
* Metadata of videos is also embedded in the files now
* A few UI changes that I forgot

### Fixed

* Fix a permission issue when using Seal in a different user profile or private space
* Fix an issue where the text cannot be copied in the menu of the download history
* Display approximate file size for formats when there's no exact value available
* Fix an issue causes app to crash when the selected template is not available
* Custom command now ignore empty URLs, which means you can insert URLs along with arguments in
  command templates
* Fix an issue where some formats may be unavailable when downloading playlists

### Known issues

* TextFields(IME) fallback to plain character mode when showing a ModalBottomSheet
* ModalBottomSheet handles insets incorrectly on devices below API 30

## [v1.11.3][1.11.3] - 2024-01-22

### Added

* Merge multiple audio streams into a single file
* Allow downloading with cellular network temporarily

### Fixed

* App creates duplicated command templates on initialization
* Cannot make video clip in FormatPage

## [v1.11.2][1.11.2] - 2024-01-06

### Added

* Keep subtitles files after embedding into videos
* Force all connections via ipv4
* Prefer vp9.2 if av1 hardware decoding unavailable
* Add system locale settings for Android 13+

### Fixed

* User agent gets enabled when refreshing cookies
* Restrict filenames not working in custom commands

### Changed

* Transition animation should look more smooth now

## [v1.11.1][1.11.1] - 2023-12-16

### Added

* Add `--restrict-filenames` option in yt-dlp
* Add playlist title as an option for subdirectory
* Add more thanks to sponsors

### Fixed

* Fix some minor UI bugs
* Fix an issue causing error when parsing video info

## [v1.11.0][1.11.0] - 2023-11-18

### Added

* Custom output template (`-o` option in yt-dlp)
* Export cookies to a text file
* Make embed metadata in audio files optional
* Add the ability to record download archive, and skip duplicate downloads
* Add cancel button to the download page
* Add input chips for sponsorblock categories
* Add subtitle selection dialog in format page, make auto-translated subtitles available in subtitle
  selection
* Add more thanks to sponsors

### Changed

* Move the directory for storing temporary files to external storage (`Seal/tmp`)
* Change the default output template to `%(title)s.%(ext)s`
* Temporary directory now are enabled by default for downloads in general mode
* Move actions in format page to dropdown menu
* Download subtitles are now available when downloading audio files
* `android:enableOnBackInvokedCallback` is changed to `false` due to compatibility issues

### Fixed

* Fix an issue causes sharing videos to fail on certain devices
* Fix an issue causes uploader marked as null, make uploader_id as a fallback to uploader
* Fix an issue when a user performs multiple clicks causing duplicate navigating behaviors

### Removed

* Custom prefix for output template has been removed, please migrate to custom output template

## [v1.10.0][1.10.0] - 2023-08-30

### Added

**Subtitles**

* Convert subtitles to another format
* Select subtitle language in format selection

**Format selection**

* Display icons(video/audio) on `FormatItem`s
* Split video by chapters
* Select subtitle to download by language names/codes

**Custom commands**

* Create custom command tasks in the Running Tasks page
* Configure download directory separately for custom command tasks
* Select multiple command templates to export & remove

**Cookies**

* Add `CookiesQuickSettingsDialog` for refreshing & configuring cookies in configuration menu
* Add user agent header when downloading with cookies enabled

**Other New Features & UI Improvements**

* Show `PlainToolTip` when long-press on `PlaylistItem`
* Add monochrome theme
* Add proxy configuration for network connections
* Add translations in Swedish and Portuguese

### Fixed

* App crashes when being opened in the system share sheet
* Video not shown in YouTube playlist results
* Cookies cannot be disabled after clearing cookies
* Hide video only formats when save as audio enabled
* Parsing error with decimal value in width/height
* Audio codec preference not works as expected
* Could not fetch video info when `originalUrl` is null

### Changed

**Notable Changes**

* Upgrade target API level to 34 (Android 14)
* Preferred video format changed to two options: Legacy and Quality
* UI improvements to the configuration dialog

**Other Changes**

* Update `ColorScheme`s and components to reflect the new MD3 color roles
* Update youtubedl-android version, added pycryptodomex to the library
* Move Video formats to the bottom of the `FormatPage`
* Notifications now are enabled by default
* Minor UI improvements & changes

## [v1.9.2][1.9.2] - 2023-04-27

### Fixed

* Fix a bug causing Incognito mode not working in v1.9.1
* Fix misplaced quality tags in `AudioQuickSettingsDialog`
* Fix mismatched formats when using Save as audio & Download playlist

## [v1.9.1][1.9.1] - 2023-04-11

### Added

* Add Sponsor page: You can now support this app by sponsoring on GitHub!

### Fixed

* Fix a bug causing warnings not shown in logs of completed custom command tasks
* Fix a bug causing videos not scanned into media library when private mode is enabled

### Changed

* Move the directory for temporary files to `cacheDir`

## [v1.9.0][1.9.0] - 2023-03-12

### Added

* Add Preview channel for auto-updating
* Add an option to update to Nightly builds of yt-dlp
* Add a dialog for F-Droid builds in auto-update settings
* Add a switch for auto-updating yt-dlp
* Add the ability to share files in `VideoDetailDrawer`
* Add a badge to the icon to indicate the count of running processes
* Add a switch for disabling the temporary directory
* Add format & quality preference for audio
* Add custom format sorter
* Add the ability to clip video and audio in `FormatSelectionPage` (experimental)
* Add the ability to edit video titles in `FormatSelectionPage` before downloading
* Add the ability to share the thumbnail url in `FormatSelectionPage`
* Implement a new method to extract cookies from the `WebView` database

### Changed

- Change the operation of open link to long pressing the link button in `VideoDetailDrawer`
- Change the thread number range of multi-threaded download to 1-24
- Change the status bar icon to filled icon
- Change the quick settings for media format in the configuration dialog

### Fixed

- Fix a bug causing high-quality audio not downloaded with YT Premium cookies & YT Music URLs
- UI bug in `ShortcutChip` with long template
- Fix a bug causing empty subtitle language breaks downloads
- Fix an issue causing specific languages not visible in system settings on Android 13+
- Fix a UI bug in the format selection page
- Fix a bug causing app to crash when toasting in Android 5.0
- Fix a UI bug causing LTR texts to display incorrectly in RTL locale environment
- Add legacy app icon for API 21~25

### Known issues

- Cookies may not work as expected in some devices, please try to re-generate cookies after this
  occurs. File an issue on GitHub with your device info when experience errors.

## [v1.8.2][1.8.2] - 2023-02-10

### Fixed

- Trimmed ASCII characters filename
- Unexpected error when downloading multiple video to SD card with quick download
- Error when cropping vertical thumbnails as artwork
- ID conflicts when importing custom templates

### Changed

- Add `horizontalScroll` to `LogPage`
- Revert the URL intent filters

## [v1.8.1][1.8.1] - 2023-02-01

### Fixed

- App crashes when downloading in private mode
- Unexpected ImeActions in TextFields
- Disable SD card download when the directory is not set
- Localized strings for file size texts

## [v1.8.0][1.8.0] - 2023-01-29

### Added

- Download to SD card
- Quick download in parallel
- Task dashboard & log page for custom commands
- Custom shortcuts for command templates
- Subtitle preferences
- Apply `--embed-chapters` for video downloads by default
- New color schemes for UI theming

### Changed

- New transition animation between destinations
- Change `minSdkVersion` to 21 (Android 5.0)
- Accessibility improvements to components
- Revert playlist items limit in v1.7.3
- Scan the download directory to the system media library after running commands
- Change the LongClick operations of `FormatItem` to share the stream URLs

## [v1.7.3][1.7.3] - 2023-01-10

### Fixed

- `Webview` captures Cookies from wrong domains
- Notifications of custom commands remain unfinished status
- App crashes when fails to parse video info for format selection
- App crashes when parsing channel info for playlist download

### Added

- Tips about streams merging in `FormatSelectionPage`

### Changed

- Playlist results are limited to 200 videos

[1.7.3]: https://github.com/JunkFood02/Seal/releases/tag/v1.7.3

[1.8.0]: https://github.com/JunkFood02/Seal/releases/tag/v1.8.0

[1.8.1]: https://github.com/JunkFood02/Seal/releases/tag/v1.8.1

[1.8.2]: https://github.com/JunkFood02/Seal/releases/tag/v1.8.2

[1.9.0]: https://github.com/JunkFood02/Seal/releases/tag/v1.9.0

[1.9.1]: https://github.com/JunkFood02/Seal/releases/tag/v1.9.1

[1.9.2]: https://github.com/JunkFood02/Seal/releases/tag/v1.9.2

[1.10.0]: https://github.com/JunkFood02/Seal/releases/tag/v1.10.0

[1.11.0]: https://github.com/JunkFood02/Seal/releases/tag/v1.11.0

[1.11.1]: https://github.com/JunkFood02/Seal/releases/tag/v1.11.1

[1.11.2]: https://github.com/JunkFood02/Seal/releases/tag/v1.11.2

[1.11.3]: https://github.com/JunkFood02/Seal/releases/tag/v1.11.3

[1.12.0]: https://github.com/JunkFood02/Seal/releases/tag/v1.12.0

[1.12.1]: https://github.com/JunkFood02/Seal/releases/tag/v1.12.1

[1.13.0]: https://github.com/JunkFood02/Seal/releases/tag/v1.13.0

</details>
