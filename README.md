# 柴柴Emby (ChaiChaiEmby)

基于 [ChaiChaiEmbyTV v0.3.0](https://github.com/dh374374/ChaiChaiEmbyTV) 反编译代码二次开发的 Android TV Emby 客户端。

## 功能特色

- 🎬 **原生 TV 体验** - 专为遥控器操作优化，流畅的焦点导航
- 🎮 **播放器功能** - 倍速播放、多音轨/字幕切换、外挂字幕延迟调整
- 🕐 **OSD 屏显** - 常驻时钟（HH:mm:ss）、播放时长、实时网速（移植自 OK 影视）
- 📱 **扫码配置** - 手机扫码快速配置服务器
- 🔄 **播放进度同步** - 自动同步播放进度到 Emby 服务器
- 📺 **多服务器管理** - 支持添加多个 Emby 服务器
- 🔗 **代理支持** - HTTP/HTTPS/SOCKS5 代理配置

## 技术栈

| 技术 | 说明 |
|------|------|
| **语言** | Java（主要）+ Kotlin（构建配置） |
| **UI 框架** | Jetpack Compose + Material3 |
| **播放器** | AndroidX Media3 (ExoPlayer) |
| **网络** | Retrofit + OkHttp |
| **架构** | MVVM + Kotlin Coroutines + Flow |
| **二维码** | ZXing |
| **本地服务** | NanoHTTPD |
| **最低 SDK** | API 23 (Android 6.0) |
| **目标 SDK** | API 36 (Android 16) |

### 与原版的差异

- 移除快手 AkDanmaku 弹幕引擎及相关功能
- 移植 OK 影视屏显 OSD（时钟/时长/网速），白色文字 + 黑色阴影，无半透明遮罩
- 应用名改为"柴柴emby"，包名保持 `com.dh.myembyapp`

## 屏显规格

```
┌──────────────────────────────────────┐
│                         [14:23:05]   │  ← 右上：20sp + Shadow + tnum
│                                      │
│ [12:30/45:00]              [2.3MB/s]  │  ← 左下/右下：16sp + Shadow
└──────────────────────────────────────┘
```

- 时钟（右上）：20sp，`#B0000000` 阴影，偏移 1.5px，模糊半径 2px，等宽数字
- 时长（左下）：16sp，格式 `当前/总时长`
- 网速（右下）：16sp，格式 `2.3 MB/s`，无前缀
- 屏幕边距：16dp

## 构建

```bash
# 克隆并初始化 submodule
git clone https://github.com/cdlongbow/ChaiChaiEmby
cd ChaiChaiEmby
git submodule update --init --recursive --depth 1

# 构建
./gradlew assembleDebug
```

## 许可证

本项目仅供学习交流使用，基于 GPL-3.0 协议开源。

## 致谢

- [Emby](https://emby.media/) - 媒体服务器
- [AndroidX Media](https://github.com/androidx/media) - 播放器
- [OK 影视](https://github.com/FongMi/TV) - OSD 屏显样式参考
- [Jellyfin Media3](https://github.com/jellyfin/jellyfin-androidx-media) - FFmpeg 解码器扩展