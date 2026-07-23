package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.runtime.State;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import com.dh.myembyapp.data.DecoderSettings;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class eh1 implements Player.Listener {
    public final /* synthetic */ State a;
    public final /* synthetic */ State b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ String d;
    public final /* synthetic */ DefaultBandwidthMeter e;
    public final /* synthetic */ State g;
    public final /* synthetic */ State h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ CoroutineScope j;

    public eh1(State state, State state2, ExoPlayer exoPlayer, String str, DefaultBandwidthMeter defaultBandwidthMeter, State state3, State state4, Context context, CoroutineScope coroutineScope) {
        this.a = state;
        this.b = state2;
        this.c = exoPlayer;
        this.d = str;
        this.e = defaultBandwidthMeter;
        this.g = state3;
        this.h = state4;
        this.i = context;
        this.j = coroutineScope;
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(CueGroup cueGroup) {
        SubtitleView subtitleView;
        cueGroup.getClass();
        hh1 hh1Var = (hh1) this.g.getValue();
        ch1 ch1Var = (ch1) this.b.getValue();
        PlayerView playerView = (PlayerView) hh1Var.c.invoke();
        pl plVar = hh1Var.d;
        boolean z = hh1Var.e;
        boolean z2 = hh1Var.f;
        int i = hh1Var.g;
        boolean z3 = hh1Var.h;
        Typeface typeface = hh1Var.i;
        boolean z4 = hh1Var.j;
        boolean z5 = hh1Var.k;
        boolean z6 = hh1Var.l;
        md mdVar = hh1Var.m;
        Function1 function1 = ch1Var.p;
        Function1 function2 = ch1Var.q;
        function1.getClass();
        function2.getClass();
        if (!z) {
            Typeface typefaceO = in1.o(typeface, z4, z5, z, z6, mdVar);
            if (typefaceO == null || playerView == null || (subtitleView = playerView.getSubtitleView()) == null) {
                return;
            }
            at0 at0Var = cueGroup.cues;
            at0Var.getClass();
            subtitleView.post(new tp1(5, subtitleView, in1.b(at0Var, typefaceO)));
            return;
        }
        if (cueGroup.cues.isEmpty()) {
            function1.invoke(null);
            return;
        }
        function1.invoke(cueGroup);
        if (!z2) {
            function2.invoke(Boolean.FALSE);
            return;
        }
        if (!plVar.a(playerView, cueGroup, i) || z3) {
            return;
        }
        Log.d("SubtitleDebug", "图形字幕亮度校正已应用: brightness=" + i + ", cues=" + cueGroup.cues.size());
        function2.invoke(Boolean.TRUE);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onEvents(Player player, Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
        String strF;
        long bitrateEstimate = this.e.getBitrateEstimate();
        ExoPlayer exoPlayer = this.c;
        exoPlayer.getClass();
        long bufferedPosition = exoPlayer.getBufferedPosition() - exoPlayer.getCurrentPosition();
        int playbackState = exoPlayer.getPlaybackState();
        if (playbackState == 1) {
            strF = "IDLE";
        } else if (playbackState == 2) {
            strF = "BUFFERING";
        } else if (playbackState != 3) {
            strF = playbackState != 4 ? x2.f(exoPlayer.getPlaybackState(), "UNKNOWN(", ")") : "ENDED";
        } else {
            strF = "READY";
        }
        Log.d("BufferMonitor", "⏳ isLoading=" + z + " state=" + strF + " buffered=" + bufferedPosition + "ms playWhenReady=" + exoPlayer.getPlayWhenReady() + " netBitrate=" + bitrateEstimate + "bps");
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z) {
        gh1 gh1Var = (gh1) this.a.getValue();
        ch1 ch1Var = (ch1) this.b.getValue();
        boolean z2 = gh1Var.b;
        boolean z3 = gh1Var.c;
        String str = gh1Var.d;
        String str2 = gh1Var.e;
        boolean z4 = gh1Var.f;
        Function1 function1 = ch1Var.a;
        Function3 function3 = ch1Var.b;
        Function2 function2 = ch1Var.c;
        Function2 function4 = ch1Var.d;
        Function0 function0 = ch1Var.e;
        Function1 function5 = ch1Var.f;
        Function1 function6 = ch1Var.g;
        ExoPlayer exoPlayer = this.c;
        exoPlayer.getClass();
        function1.getClass();
        function3.getClass();
        function2.getClass();
        function4.getClass();
        function0.getClass();
        function5.getClass();
        function6.getClass();
        long jCoerceAtLeast = RangesKt.coerceAtLeast(exoPlayer.getCurrentPosition(), 0L);
        if (z) {
            function1.invoke(Boolean.FALSE);
        }
        boolean z5 = (exoPlayer.getPlayWhenReady() || exoPlayer.getPlaybackState() == 4) ? false : true;
        boolean z6 = !z && z5 && z4;
        if (z6) {
            function1.invoke(Boolean.FALSE);
        }
        String str3 = this.d;
        if (!z2 && ((z || z5) && !z6)) {
            function3.invoke(str3, Long.valueOf(jCoerceAtLeast), Boolean.valueOf(z5));
        }
        if (!z2 && !z3) {
            if (z) {
                function2.invoke(str3, Long.valueOf(jCoerceAtLeast));
            } else if (!exoPlayer.getPlayWhenReady() && exoPlayer.getPlaybackState() != 4 && !z6) {
                function4.invoke(str3, Long.valueOf(jCoerceAtLeast));
            }
        }
        if (!z || z2 || str == null || StringsKt.isBlank(str) || Intrinsics.areEqual(str2, str3)) {
            return;
        }
        function0.invoke();
        function5.invoke(str3);
        function6.invoke(str);
        s01.E("记录服务器最近播放时间: serverId=", str, ", mediaId=", str3, "PlayerScreen");
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        String strF;
        Function0 function0;
        boolean z;
        Function2 function2;
        boolean z2;
        boolean z3;
        ExoPlayer exoPlayer;
        Object EmptyList;
        Object obj;
        List<MediaStream> mediaStreams;
        String str;
        boolean z4;
        gh1 gh1Var = (gh1) this.a.getValue();
        hh1 hh1Var = (hh1) this.g.getValue();
        dh1 dh1Var = (dh1) this.h.getValue();
        ch1 ch1Var = (ch1) this.b.getValue();
        String str2 = gh1Var.a;
        boolean z5 = gh1Var.b;
        boolean z6 = gh1Var.g;
        String str3 = gh1Var.d;
        boolean z7 = gh1Var.h;
        boolean z8 = gh1Var.i;
        boolean z9 = gh1Var.j;
        boolean z10 = gh1Var.k;
        boolean z11 = gh1Var.l;
        boolean z12 = gh1Var.m;
        com.dh.myembyapp.data.model.MediaItem mediaItem = gh1Var.n;
        Function0 function1 = dh1Var.c;
        String id = gh1Var.p;
        boolean z13 = gh1Var.q;
        Integer num = gh1Var.r;
        boolean z14 = hh1Var.a;
        SubtitlePreferences subtitlePreferences = dh1Var.a;
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = hh1Var.b;
        Function0 function3 = dh1Var.f;
        Function0 function4 = dh1Var.g;
        Function1 function5 = ch1Var.h;
        Function0 function6 = ch1Var.i;
        Context context = this.i;
        n61 n61Var = new n61(context, 1);
        Function1 function7 = ch1Var.j;
        Function2 function8 = ch1Var.k;
        Function1 function9 = dh1Var.i;
        Function1 function10 = ch1Var.l;
        Function1 function11 = ch1Var.m;
        Function1 function12 = ch1Var.g;
        Function1 function13 = ch1Var.n;
        ExoPlayer exoPlayer2 = this.c;
        exoPlayer2.getClass();
        CoroutineScope coroutineScope = this.j;
        coroutineScope.getClass();
        str2.getClass();
        mediaItem.getClass();
        function1.getClass();
        subtitlePreferences.getClass();
        subtitleVersionPrioritySettings.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        function10.getClass();
        function11.getClass();
        function12.getClass();
        function13.getClass();
        function5.invoke(Integer.valueOf(i));
        if (i == 1) {
            strF = "IDLE(空闲)";
        } else if (i == 2) {
            strF = "BUFFERING(缓冲中)";
        } else if (i != 3) {
            strF = i != 4 ? x2.f(i, "UNKNOWN(", ")") : "ENDED(结束)";
        } else {
            strF = "READY(准备好)";
        }
        Log.d("PlayerScreen", "📺 播放状态变化: ".concat(strF));
        if (i != 3 || z9 || exoPlayer2.getDuration() <= 0) {
            function0 = function3;
            z = z6;
            function2 = function8;
            z2 = z10;
            z3 = false;
        } else {
            Timeline currentTimeline = exoPlayer2.getCurrentTimeline();
            currentTimeline.getClass();
            if (currentTimeline.isEmpty() || currentTimeline.getWindowCount() <= 0) {
                function0 = function3;
                z = z6;
            } else {
                function0 = function3;
                try {
                    Timeline.Window window = new Timeline.Window();
                    z = z6;
                    try {
                        function2 = function8;
                        z2 = z10;
                        z3 = false;
                        try {
                            currentTimeline.getWindow(RangesKt.coerceIn(exoPlayer2.getCurrentMediaItemIndex(), 0, currentTimeline.getWindowCount() - 1), window);
                            z4 = window.isSeekable;
                        } catch (Exception unused) {
                            z4 = z3;
                        }
                    } catch (Exception unused2) {
                        function2 = function8;
                        z2 = z10;
                        z3 = false;
                    }
                } catch (Exception unused3) {
                    z = z6;
                }
                if (!z4) {
                    function6.invoke();
                    n61Var.invoke("当前视频不支持拖动进度");
                }
            }
            function2 = function8;
            z2 = z10;
            z3 = false;
            z4 = z3;
            if (!z4) {
                function6.invoke();
                n61Var.invoke("当前视频不支持拖动进度");
            }
        }
        if (z2 && z11) {
            boolean z15 = (exoPlayer2.getPlayWhenReady() && i == 3) ? true : z3;
            if (!exoPlayer2.getPlayWhenReady()) {
                str = "用户暂停";
            } else if (i == 2) {
                str = "视频缓冲中";
            } else if (i == 1) {
                str = "播放器空闲";
            } else if (i == 4) {
                str = "播放结束";
            } else {
                str = z15 ? "正常播放" : "其他原因";
            }
            s01.E("🎬 弹幕应该", z15 ? "播放" : "暂停", " - 原因: ", str, "DanmakuPlayer");
        }
        if (i != 3 || z12) {
            exoPlayer = exoPlayer2;
        } else {
            function7.invoke(Boolean.TRUE);
            MediaSource mediaSource = (MediaSource) function1.invoke();
            if (id == null) {
                id = mediaSource != null ? mediaSource.getId() : null;
            }
            if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
                EmptyList = CollectionsKt.emptyList();
            } else {
                EmptyList = new ArrayList();
                for (Object obj2 : mediaStreams) {
                    if (Intrinsics.areEqual(((MediaStream) obj2).getType(), "Subtitle")) {
                        EmptyList.add(obj2);
                    }
                }
            }
            if (z13 && num != null) {
                int iIntValue = num.intValue();
                if (iIntValue < 0 || !z14) {
                    n42.c(exoPlayer2, new h42(), context);
                } else {
                    ArrayList arrayListF = n42.f(exoPlayer2, EmptyList);
                    int size = arrayListF.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            obj = null;
                            break;
                        }
                        Object obj3 = arrayListF.get(i2);
                        i2++;
                        ArrayList arrayList = arrayListF;
                        Integer num2 = ((h42) obj3).e;
                        if (num2 != null && num2.intValue() == iIntValue) {
                            obj = obj3;
                            break;
                        }
                        arrayListF = arrayList;
                    }
                    h42 h42Var = (h42) obj;
                    if (h42Var != null) {
                        n42.c(exoPlayer2, h42Var, context);
                        Log.d("SubtitleTrack", "已选择转码外部化字幕: streamIndex=" + iIntValue + ", title=" + h42Var.b);
                    } else {
                        Log.w("SubtitleTrack", "转码字幕未匹配到本地字幕轨道: streamIndex=" + iIntValue);
                    }
                }
            } else if (!((Boolean) function4.invoke()).booleanValue()) {
                exoPlayer = exoPlayer2;
                n42.d(exoPlayer, EmptyList, subtitlePreferences, mediaItem, id, subtitleVersionPrioritySettings);
            }
            exoPlayer = exoPlayer2;
        }
        if (i == 4) {
            t4 t4Var = new t4(function7, 9);
            if (!((Boolean) function0.invoke()).booleanValue()) {
                Log.d("PlayerScreen", "播放结束事件发生在后台暂停状态，跳过自动下一集/返回: foreground=" + z7 + ", pausedForBackground=" + z8);
                return;
            }
            long duration = exoPlayer.getDuration();
            long currentPosition = exoPlayer.getCurrentPosition();
            if (duration <= 60000 || currentPosition <= duration * 0.9d) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new mn1(function0, exoPlayer, function2, this.d, function9, n61Var, t4Var, function10, function11, z5, z, str3, function12, str2, function13, null), 3, null);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        Tracks tracks;
        boolean z;
        String strC;
        String str;
        Throwable cause;
        String string;
        Throwable cause2;
        String string2;
        at0 at0Var;
        int i;
        int i2;
        Tracks.Group group;
        int i3;
        playbackException.getClass();
        gh1 gh1Var = (gh1) this.a.getValue();
        hh1 hh1Var = (hh1) this.g.getValue();
        dh1 dh1Var = (dh1) this.h.getValue();
        ch1 ch1Var = (ch1) this.b.getValue();
        String str2 = gh1Var.s;
        String str3 = gh1Var.t;
        boolean z2 = gh1Var.q;
        String str4 = (String) dh1Var.e.invoke();
        Tracks currentTracks = this.c.getCurrentTracks();
        currentTracks.getClass();
        boolean z3 = hh1Var.j;
        boolean z4 = hh1Var.k;
        boolean z5 = hh1Var.e;
        boolean z6 = hh1Var.l;
        boolean z7 = hh1Var.m != null;
        String str5 = hh1Var.n;
        Function3 function3 = ch1Var.r;
        yi1 yi1Var = ch1Var.s;
        Function1 function1 = ch1Var.t;
        th1 th1Var = ch1Var.u;
        th1 th1Var2 = ch1Var.v;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        function3.getClass();
        function1.getClass();
        if (z3 && z4 && !z5 && z6 && z7) {
            StringBuilder sb = new StringBuilder();
            String message = playbackException.getMessage();
            if (message == null) {
                message = "";
            }
            sb.append(message);
            sb.append(' ');
            Throwable cause3 = playbackException.getCause();
            String string3 = cause3 != null ? cause3.toString() : null;
            if (string3 == null) {
                string3 = "";
            }
            sb.append(string3);
            String lowerCase = sb.toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "libass", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "asssubtitle", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "peerless2012", false, 2, (Object) null)) {
                tracks = currentTracks;
            } else {
                Throwable cause4 = playbackException;
                while (true) {
                    if (cause4 == null) {
                        tracks = currentTracks;
                        z = false;
                    } else if (StringsKt__StringsJVMKt.startsWith$default(cause4.getClass().getName(), "io.github.peerless2012.ass", false, 2, null)) {
                        tracks = currentTracks;
                    } else {
                        StackTraceElement[] stackTrace = cause4.getStackTrace();
                        stackTrace.getClass();
                        int length = stackTrace.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                StackTraceElement stackTraceElement = stackTrace[i4];
                                tracks = currentTracks;
                                String className = stackTraceElement.getClassName();
                                className.getClass();
                                if (!StringsKt__StringsJVMKt.startsWith$default(className, "io.github.peerless2012.ass", false, 2, null)) {
                                    String className2 = stackTraceElement.getClassName();
                                    className2.getClass();
                                    Throwable th = cause4;
                                    if (!StringsKt__StringsKt.contains(className2, (CharSequence) "AssSubtitle", true)) {
                                        String className3 = stackTraceElement.getClassName();
                                        className3.getClass();
                                        if (!StringsKt__StringsKt.contains(className3, (CharSequence) "AssRender", true)) {
                                            i4++;
                                            currentTracks = tracks;
                                            cause4 = th;
                                        }
                                    }
                                }
                            } else {
                                cause4 = cause4.getCause();
                            }
                        }
                    }
                }
            }
            z = true;
        } else {
            tracks = currentTracks;
            z = false;
        }
        Log.e("PlayerScreen", "==========  ExoPlayer错误详情 ==========");
        Log.e("PlayerScreen", "错误类型: " + playbackException.errorCode);
        Log.e("PlayerScreen", "错误消息: " + playbackException.getMessage());
        Log.e("PlayerScreen", "错误堆栈: " + playbackException.getCause());
        Log.e("PlayerScreen", "当前解码模式: ".concat(str2));
        Throwable cause5 = playbackException.getCause();
        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = cause5 instanceof HttpDataSource.InvalidResponseCodeException ? (HttpDataSource.InvalidResponseCodeException) cause5 : null;
        if (invalidResponseCodeException != null) {
            Log.e("PlayerScreen", "HTTP状态码: " + invalidResponseCodeException.responseCode);
            Log.e("PlayerScreen", "请求URL: " + invalidResponseCodeException.dataSpec.uri);
            Log.e("PlayerScreen", "响应消息: " + invalidResponseCodeException.responseMessage);
        }
        if (z) {
            function3.invoke("检测到 ASS 增强渲染播放错误，准备自动回退。subtitle=" + str5, playbackException, "ASS 增强渲染出错，已自动回退为默认渲染");
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (((Boolean) yi1Var.invoke(playbackException)).booleanValue()) {
            return;
        }
        int i5 = ud1.d;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Throwable cause6 = playbackException; cause6 != null && arrayList.size() < 8 && linkedHashSet.add(cause6); cause6 = cause6.getCause()) {
            arrayList.add(cause6);
        }
        Throwable th2 = (Throwable) CollectionsKt.lastOrNull((List) arrayList);
        if (th2 == null) {
            th2 = playbackException;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            if (obj instanceof HttpDataSource.InvalidResponseCodeException) {
                arrayList2.add(obj);
            }
        }
        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException2 = (HttpDataSource.InvalidResponseCodeException) CollectionsKt.firstOrNull((List) arrayList2);
        String message2 = th2.getMessage();
        if (message2 == null || StringsKt.isBlank(message2)) {
            message2 = null;
        }
        String message3 = playbackException.getMessage();
        if (message3 == null || StringsKt.isBlank(message3)) {
            message3 = null;
        }
        if (message2 == null) {
            message2 = message3 == null ? "播放器没有返回更具体的错误信息" : message3;
        }
        if (invalidResponseCodeException2 != null) {
            strC = i9.f(invalidResponseCodeException2.responseCode, "视频请求失败：服务器返回 HTTP ");
        } else if (Intrinsics.areEqual(ud1.e(th2), "UnrecognizedInputFormatException")) {
            strC = "播放器无法识别当前视频流，可能是封装格式不受支持，或服务器返回的内容不是可播放视频。";
        } else {
            int i7 = playbackException.errorCode;
            if (i7 == 4001 || i7 == 4003 || i7 == 4005 || i7 == 4004) {
                strC = "解码失败：当前设备可能不支持这个视频或音频格式。";
            } else if (i7 == 2001 || i7 == 2002 || i7 == 1003) {
                strC = "网络读取失败：播放器无法持续获取视频数据。";
            } else {
                strC = (i7 == 3001 || i7 == 3003) ? "播放流解析失败：当前封装或内容格式无法读取。" : ud1.c(180, message2);
            }
        }
        if (invalidResponseCodeException2 != null) {
            str = "可以先重试播放；如果仍然失败，请检查服务器、代理或该媒体的访问权限。";
        } else if (Intrinsics.areEqual(ud1.e(th2), "UnrecognizedInputFormatException")) {
            str = "建议尝试切换到转码模式、换一个媒体版本，或检查服务端是否正确返回了原始视频流。";
        } else {
            int i8 = playbackException.errorCode;
            str = (i8 == 4001 || i8 == 4003 || i8 == 4005 || i8 == 4004) ? "建议尝试切换软解/硬解、启用转码，或换一个更兼容的音视频版本。" : (i8 == 2001 || i8 == 2002 || i8 == 1003) ? "建议重试播放，并检查电视到 Emby 服务器之间的网络、代理和读取超时设置。" : "可以先重试播放；如果持续失败，建议切换播放版本、转码模式或查看服务端日志。";
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add("错误码: " + playbackException.getErrorCodeName() + " (" + playbackException.errorCode + ")");
        String strE = ud1.e(th2);
        StringBuilder sb2 = new StringBuilder("错误类型: ");
        sb2.append(strE);
        listCreateListBuilder.add(sb2.toString());
        listCreateListBuilder.add("错误信息: ".concat(ud1.c(520, message2)));
        if (invalidResponseCodeException2 != null) {
            int i9 = invalidResponseCodeException2.responseCode;
            String str6 = invalidResponseCodeException2.responseMessage;
            listCreateListBuilder.add("HTTP 状态: " + i9 + (str6 != null ? " ".concat(str6) : ""));
            String string4 = invalidResponseCodeException2.dataSpec.uri.toString();
            string4.getClass();
            listCreateListBuilder.add("请求地址: ".concat(ud1.d(string4)));
        } else {
            listCreateListBuilder.add("播放地址: ".concat(ud1.d(str4)));
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != 3005871) {
            if (iHashCode != 116909544) {
                if (iHashCode == 1319330215 && str2.equals(DecoderSettings.DECODER_MODE_SOFTWARE)) {
                    str2 = "软解码";
                }
            } else if (str2.equals(DecoderSettings.DECODER_MODE_HARDWARE)) {
                str2 = "硬解码";
            }
        } else if (str2.equals("auto")) {
            str2 = "自动";
        }
        listCreateListBuilder.add("视频解码: ".concat(str2));
        if (Intrinsics.areEqual(str3, "auto")) {
            str3 = "自动";
        } else if (Intrinsics.areEqual(str3, DecoderSettings.AUDIO_DECODER_FORCE_FFMPEG)) {
            str3 = "强制 FFmpeg";
        }
        listCreateListBuilder.add("音频解码: ".concat(str3));
        listCreateListBuilder.add("播放模式: ".concat(z2 ? "转码" : "直连/直流"));
        ArrayList arrayList3 = new ArrayList();
        at0 groups = tracks.getGroups();
        groups.getClass();
        int size2 = groups.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = groups.get(i10);
            i10++;
            Tracks.Group group2 = (Tracks.Group) obj2;
            int i11 = group2.length;
            int i12 = 0;
            while (i12 < i11) {
                if (group2.isTrackSelected(i12)) {
                    Format trackFormat = group2.getTrackFormat(i12);
                    trackFormat.getClass();
                    at0Var = groups;
                    int type = group2.getType();
                    i = size2;
                    i2 = i10;
                    group = group2;
                    if (type == 1) {
                        StringBuilder sb3 = new StringBuilder("音频轨道: ");
                        String str7 = trackFormat.sampleMimeType;
                        if (str7 == null) {
                            str7 = "-";
                        }
                        sb3.append(str7);
                        String str8 = trackFormat.codecs;
                        if (str8 == null) {
                            str8 = "-";
                        }
                        sb3.append(", codecs=".concat(str8));
                        int i13 = trackFormat.channelCount;
                        if (i13 > 0) {
                            sb3.append(", " + i13 + "ch");
                        }
                        int i14 = trackFormat.sampleRate;
                        if (i14 > 0) {
                            sb3.append(", " + i14 + "Hz");
                        }
                        arrayList3.add(sb3.toString());
                    } else if (type == 2) {
                        StringBuilder sb4 = new StringBuilder("视频轨道: ");
                        String str9 = trackFormat.sampleMimeType;
                        if (str9 == null) {
                            str9 = "-";
                        }
                        sb4.append(str9);
                        String str10 = trackFormat.codecs;
                        if (str10 == null) {
                            str10 = "-";
                        }
                        sb4.append(", codecs=".concat(str10));
                        int i15 = trackFormat.width;
                        if (i15 > 0 && (i3 = trackFormat.height) > 0) {
                            sb4.append(", " + i15 + "x" + i3);
                        }
                        arrayList3.add(sb4.toString());
                    }
                } else {
                    at0Var = groups;
                    i = size2;
                    i2 = i10;
                    group = group2;
                }
                i12++;
                groups = at0Var;
                size2 = i;
                i10 = i2;
                group2 = group;
            }
        }
        Iterator it = CollectionsKt.take(arrayList3, 4).iterator();
        while (it.hasNext()) {
            listCreateListBuilder.add((String) it.next());
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.drop(arrayList, 1), " -> ", null, null, 0, null, new uc1(1), 30, null);
        if (StringsKt.isBlank(strJoinToString$default)) {
            strJoinToString$default = null;
        }
        if (strJoinToString$default != null) {
            listCreateListBuilder.add("调用链: ".concat(strJoinToString$default));
        }
        function1.invoke(new vd1(strC, str, CollectionsKt.build(listCreateListBuilder)));
        th1Var.invoke(Boolean.FALSE);
        th1Var2.invoke(0L);
        int i16 = playbackException.errorCode;
        if (i16 != 4001 && i16 != 4003) {
            Log.e("PlayerScreen", "========================================");
            return;
        }
        String message4 = playbackException.getMessage();
        if (message4 == null) {
            message4 = "";
        }
        boolean z8 = StringsKt__StringsKt.contains$default(message4, (CharSequence) "VideoRenderer", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(message4, (CharSequence) "video/", false, 2, (Object) null) || !((cause2 = playbackException.getCause()) == null || (string2 = cause2.toString()) == null || !StringsKt__StringsKt.contains$default(string2, (CharSequence) "Video", false, 2, (Object) null));
        boolean z9 = StringsKt__StringsKt.contains$default(message4, (CharSequence) "AudioRenderer", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(message4, (CharSequence) "audio/", false, 2, (Object) null) || !((cause = playbackException.getCause()) == null || (string = cause.toString()) == null || !StringsKt__StringsKt.contains$default(string, (CharSequence) "Audio", false, 2, (Object) null));
        Context context = this.i;
        if (z8) {
            Log.e("PlayerScreen", "---------- 视频解码器错误 ----------");
            at0 groups2 = tracks.getGroups();
            groups2.getClass();
            int size3 = groups2.size();
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = groups2.get(i17);
                i17++;
                Tracks.Group group3 = (Tracks.Group) obj3;
                if (group3.getType() == 2) {
                    int i18 = group3.length;
                    int i19 = 0;
                    while (i19 < i18) {
                        if (group3.isTrackSelected(i19)) {
                            Format trackFormat2 = group3.getTrackFormat(i19);
                            trackFormat2.getClass();
                            Log.e("PlayerScreen", "失败的视频轨道:");
                            Log.e("PlayerScreen", "  编码格式: " + trackFormat2.sampleMimeType);
                            Log.e("PlayerScreen", "  编解码器: " + trackFormat2.codecs);
                            Log.e("PlayerScreen", "  分辨率: " + trackFormat2.width + "x" + trackFormat2.height);
                            ColorInfo colorInfo = trackFormat2.colorInfo;
                            StringBuilder sb5 = new StringBuilder("  HDR: ");
                            sb5.append(colorInfo);
                            Log.e("PlayerScreen", sb5.toString());
                        }
                        i19++;
                        groups2 = groups2;
                        size3 = size3;
                    }
                }
                groups2 = groups2;
                size3 = size3;
            }
            Log.e("PlayerScreen", "--------------------------------------");
            Log.e("PlayerScreen", "⚠️ 视频解码器错误，设备可能不支持此视频格式");
            Log.e("PlayerScreen", "常见原因: 4K/HDR视频超出设备硬件解码能力");
            Log.e("PlayerScreen", "建议: 1) 切换到转码模式 2) 尝试软件解码");
            Toast.makeText(context, "视频格式不支持，请尝试切换到转码模式", 1).show();
        } else if (z9) {
            Log.e("PlayerScreen", "---------- 音频解码器错误 ----------");
            at0 groups3 = tracks.getGroups();
            groups3.getClass();
            int size4 = groups3.size();
            int i20 = 0;
            while (i20 < size4) {
                Object obj4 = groups3.get(i20);
                i20++;
                Tracks.Group group4 = (Tracks.Group) obj4;
                if (group4.getType() == 1) {
                    int i21 = group4.length;
                    for (int i22 = 0; i22 < i21; i22++) {
                        if (group4.isTrackSelected(i22)) {
                            Format trackFormat3 = group4.getTrackFormat(i22);
                            trackFormat3.getClass();
                            Log.e("PlayerScreen", "失败的音频轨道:");
                            Log.e("PlayerScreen", "  编码格式: " + trackFormat3.sampleMimeType);
                            Log.e("PlayerScreen", "  编解码器: " + trackFormat3.codecs);
                            Log.e("PlayerScreen", "  声道数: " + trackFormat3.channelCount);
                            Log.e("PlayerScreen", "  采样率: " + trackFormat3.sampleRate + " Hz");
                            Log.e("PlayerScreen", "  比特率: " + trackFormat3.bitrate + " bps");
                        }
                    }
                }
            }
            Log.e("PlayerScreen", "--------------------------------------");
            Log.e("PlayerScreen", "⚠️ 音频解码器错误，可能是不支持的音频格式");
            Log.e("PlayerScreen", "常见不支持格式: TrueHD, DTS-HD MA, DTS:X, Dolby Atmos (TrueHD)");
            Log.e("PlayerScreen", "建议: 1) 切换到转码模式 2) 检查FFmpeg扩展是否正常加载");
            Toast.makeText(context, "音频格式不支持，请尝试切换到转码模式", 1).show();
        } else {
            Log.e("PlayerScreen", "⚠️ 解码器错误，无法确定具体类型");
            Toast.makeText(context, "解码失败，请尝试切换到转码模式", 1).show();
        }
        Log.e("PlayerScreen", "========================================");
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:115:0x03df  */
    /* JADX WARN: Code duplicated, block: B:289:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:318:0x0837  */
    /* JADX WARN: Code duplicated, block: B:320:0x083a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:323:0x083f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x0846  */
    /* JADX WARN: Code duplicated, block: B:329:0x0849  */
    /* JADX WARN: Code duplicated, block: B:330:0x0884  */
    /* JADX WARN: Code duplicated, block: B:333:0x08af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:337:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:340:0x08bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:341:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:421:0x0c13  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.util.ArrayList] */
    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        Map map;
        Map map2;
        ExoPlayer exoPlayer;
        Map map3;
        com.dh.myembyapp.data.model.MediaItem mediaItem;
        Map map4;
        String str;
        Object EmptyList;
        String str2;
        Object obj;
        boolean z;
        boolean z2;
        Object obj2;
        String str3;
        String str4;
        String str5;
        SubtitlePreferences.SubtitleDisplaySettings subtitleDisplaySettings;
        SubtitlePreferences.SubtitleDisplaySettings movieDisplaySettings;
        f52 f52Var;
        boolean z3;
        at0 at0Var;
        int i;
        String str6;
        String str7;
        f52 f52Var2;
        boolean z4;
        ArrayList arrayList;
        Map map5;
        int i2;
        int i3;
        MediaStream mediaStream;
        ArrayList arrayList2;
        String lowerCase;
        String title;
        Tracks.Group group;
        String str8;
        int i4;
        Map map6;
        String str9;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str10;
        String str11;
        Map map7;
        String strJoinToString$default;
        Object obj3;
        Object obj4;
        boolean z9;
        String codec;
        List<MediaStream> mediaStreams;
        Object EmptyList2;
        String str12;
        boolean z10;
        String label;
        Object next;
        boolean z11;
        List<MediaStream> mediaStreams2;
        int i5;
        tracks.getClass();
        gh1 gh1Var = (gh1) this.a.getValue();
        hh1 hh1Var = (hh1) this.g.getValue();
        dh1 dh1Var = (dh1) this.h.getValue();
        ch1 ch1Var = (ch1) this.b.getValue();
        MediaSource mediaSource = (MediaSource) dh1Var.c.invoke();
        String str13 = gh1Var.s;
        boolean z12 = gh1Var.q;
        boolean z13 = gh1Var.u;
        com.dh.myembyapp.data.model.MediaItem mediaItem2 = gh1Var.n;
        String str14 = gh1Var.o;
        String str15 = (String) dh1Var.d.invoke();
        AudioVersionPrioritySettings audioVersionPrioritySettings = gh1Var.v;
        ce1 ce1Var = dh1Var.b;
        Integer num = gh1Var.w;
        SubtitlePreferences subtitlePreferences = dh1Var.a;
        Set set = hh1Var.o;
        Map map8 = hh1Var.p;
        Map map9 = hh1Var.q;
        Map map10 = hh1Var.r;
        String id = str14;
        Map map11 = hh1Var.s;
        String str16 = hh1Var.t;
        String str17 = hh1Var.u;
        boolean zBooleanValue = ((Boolean) hh1Var.v.invoke()).booleanValue();
        gh ghVar = dh1Var.h;
        Function0 function0 = ch1Var.w;
        vw0 vw0Var = new vw0(14, this.i, ch1Var);
        ExoPlayer exoPlayer2 = this.c;
        exoPlayer2.getClass();
        str13.getClass();
        mediaItem2.getClass();
        id.getClass();
        audioVersionPrioritySettings.getClass();
        ce1Var.getClass();
        subtitlePreferences.getClass();
        set.getClass();
        map8.getClass();
        map9.getClass();
        map10.getClass();
        map11.getClass();
        function0.getClass();
        Log.d("AudioTrack", "========== 音频轨道信息 ==========");
        Log.d("AudioTrack", "当前解码模式: ".concat(str13));
        Log.d("AudioTrack", "是否转码: " + z12);
        at0 groups = tracks.getGroups();
        groups.getClass();
        int size = groups.size();
        int i6 = 0;
        while (true) {
            String str18 = "-";
            map = map9;
            String str19 = "";
            map2 = map8;
            if (i6 >= size) {
                break;
            }
            Object obj5 = groups.get(i6);
            int i7 = i6 + 1;
            at0 at0Var2 = groups;
            Tracks.Group group2 = (Tracks.Group) obj5;
            int i8 = size;
            if (group2.getType() == 1) {
                Log.d("AudioTrack", "音频轨道组: " + group2.length + "个轨道");
                int i9 = group2.length;
                int i10 = 0;
                while (i10 < i9) {
                    Format trackFormat = group2.getTrackFormat(i10);
                    trackFormat.getClass();
                    boolean zIsTrackSelected = group2.isTrackSelected(i10);
                    Tracks.Group group3 = group2;
                    Set set2 = set;
                    Log.d("AudioTrack", "  轨道[" + i10 + "] " + (zIsTrackSelected ? "[已选中]" : str19));
                    ll0.l("    编码格式: ", trackFormat.sampleMimeType, "AudioTrack");
                    ll0.l("    编解码器: ", trackFormat.codecs, "AudioTrack");
                    Log.d("AudioTrack", "    声道数: " + trackFormat.channelCount);
                    Log.d("AudioTrack", "    采样率: " + trackFormat.sampleRate + " Hz");
                    Log.d("AudioTrack", "    比特率: " + trackFormat.bitrate + " bps");
                    String str20 = trackFormat.language;
                    if (str20 == null) {
                        str20 = "未知";
                    }
                    Log.d("AudioTrack", "    语言: ".concat(str20));
                    String str21 = trackFormat.label;
                    if (str21 == null) {
                        str21 = "无";
                    }
                    Log.d("AudioTrack", "    标签: ".concat(str21));
                    String str22 = trackFormat.sampleMimeType;
                    if (str22 == null) {
                        str22 = str19;
                    }
                    String lowerCase2 = str22.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(lowerCase2, str18, str19, false, 4, (Object) null), "_", str19, false, 4, (Object) null), " ", str19, false, 4, (Object) null);
                    int i11 = trackFormat.channelCount;
                    int i12 = trackFormat.sampleRate;
                    String str23 = str18;
                    String str24 = str19;
                    if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "truehd", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "mlp", false, 2, (Object) null)) {
                        i5 = i10;
                        Log.w("AudioTrack", c61.k("    ⚠️ TrueHD格式 (", i11, i12, "声道, ", "Hz)"));
                        Log.w("AudioTrack", "    需要: Jellyfin FFmpeg扩展 + 足够的解码能力");
                        if (zIsTrackSelected) {
                            Log.w("AudioTrack", "    状态: 当前已选中，正在尝试解码...");
                        }
                    } else if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "dts", false, 2, (Object) null)) {
                        Log.w("AudioTrack", c61.k("    ⚠️ DTS格式 (", i11, i12, "声道, ", "Hz)"));
                        Log.w("AudioTrack", "    需要: Jellyfin FFmpeg扩展");
                        i5 = i10;
                    } else {
                        i5 = i10;
                        if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "eac3", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ec3", false, 2, (Object) null)) {
                            Log.w("AudioTrack", c61.k("    ⚠️ E-AC3格式 (", i11, i12, "声道, ", "Hz)"));
                            Log.w("AudioTrack", "    需要: FFmpeg扩展或硬件支持");
                        } else if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ac3", false, 2, (Object) null)) {
                            Log.w("AudioTrack", c61.k("    ⚠️ AC3格式 (", i11, i12, "声道, ", "Hz)"));
                            Log.w("AudioTrack", "    需要: FFmpeg扩展或硬件支持");
                        } else if (zIsTrackSelected) {
                            Log.d("AudioTrack", "    ✅ 标准格式，应该能正常播放");
                        }
                    }
                    i10 = i5 + 1;
                    i9 = i9;
                    group2 = group3;
                    set = set2;
                    str18 = str23;
                    str19 = str24;
                }
            }
            map9 = map;
            map8 = map2;
            size = i8;
            groups = at0Var2;
            i6 = i7;
            set = set;
        }
        Set set3 = set;
        Log.d("AudioTrack", "===================================");
        String str25 = ", label=";
        if (z13) {
            exoPlayer = exoPlayer2;
            map3 = map10;
            mediaItem = mediaItem2;
            map4 = map11;
            str = str17;
        } else {
            Log.d("AudioTrack", "准备处理音轨选择: pendingDetailAudioStreamIndex=" + (num == null ? "none" : num));
            if (((Boolean) ghVar.invoke()).booleanValue()) {
                exoPlayer = exoPlayer2;
                map3 = map10;
                mediaItem = mediaItem2;
                map4 = map11;
                str = str17;
            } else {
                if (mediaSource == null || (mediaStreams2 = mediaSource.getMediaStreams()) == null) {
                    EmptyList2 = CollectionsKt.emptyList();
                } else {
                    EmptyList2 = new ArrayList();
                    for (Object obj6 : mediaStreams2) {
                        if (Intrinsics.areEqual(((MediaStream) obj6).getType(), "Audio")) {
                            EmptyList2.add(obj6);
                        }
                    }
                }
                List listE = pg.e(exoPlayer2, audioVersionPrioritySettings, EmptyList2);
                String strH = pg.h(exoPlayer2, listE);
                AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = audioVersionPrioritySettings.normalized();
                if (StringsKt.isBlank(id)) {
                    id = null;
                }
                if (id != null) {
                    str12 = id;
                } else if (mediaSource != null) {
                    id = mediaSource.getId();
                    str12 = id;
                } else {
                    str12 = null;
                }
                yf yfVarN = pg.n(listE, ce1Var.c(mediaItem2, str12), audioVersionPrioritySettingsNormalized);
                if (yfVarN != null) {
                    String str26 = yfVarN.b;
                    String str27 = yfVarN.a;
                    Log.d("AudioTrack", "音频记忆目标: current=" + ((Object) (StringsKt.isBlank(strH) ? "-" : strH)) + ", remembered=" + str27 + ", label=" + str26);
                    if (!Intrinsics.areEqual(str27, strH)) {
                        pg.c(exoPlayer2, yfVarN);
                        Log.d("AudioTrack", "已按音轨记忆自动切换到: ".concat(str26));
                    }
                    exoPlayer = exoPlayer2;
                    map3 = map10;
                    mediaItem = mediaItem2;
                    map4 = map11;
                    str = str17;
                } else {
                    yf yfVar = (yf) CollectionsKt.firstOrNull(listE);
                    AudioLanguagePreference preferredLanguage = audioVersionPrioritySettingsNormalized.getPreferredLanguage();
                    AudioLanguagePreference audioLanguagePreference = AudioLanguagePreference.DEFAULT;
                    boolean z14 = preferredLanguage != audioLanguagePreference;
                    boolean zI = pg.i(listE, audioVersionPrioritySettingsNormalized);
                    AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized2 = audioVersionPrioritySettingsNormalized.normalized();
                    boolean z15 = audioVersionPrioritySettingsNormalized2.getPreferredLanguage() != audioLanguagePreference;
                    boolean zI2 = pg.i(listE, audioVersionPrioritySettingsNormalized2);
                    boolean zHasDistinctFormatPriorities = AudioVersionPrioritySettings.INSTANCE.hasDistinctFormatPriorities(audioVersionPrioritySettingsNormalized2);
                    if (z15 && !zI2) {
                        Iterator it = audioVersionPrioritySettingsNormalized2.getSortTypes().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            int i13 = og.$EnumSwitchMapping$0[((AudioPrioritySortType) next).ordinal()];
                            Iterator it2 = it;
                            if (i13 == 1) {
                                z11 = true;
                            } else {
                                if (i13 != 2) {
                                    qu.f();
                                    return;
                                }
                                z11 = zHasDistinctFormatPriorities;
                            }
                            if (z11) {
                                break;
                            } else {
                                it = it2;
                            }
                        }
                        if (((AudioPrioritySortType) next) == AudioPrioritySortType.FORMAT) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (zI2 || zHasDistinctFormatPriorities) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized3 = audioVersionPrioritySettings.normalized();
                    String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(audioVersionPrioritySettingsNormalized3.getSortTypes(), " -> ", null, null, 0, null, new vb(4), 30, null);
                    String label2 = audioVersionPrioritySettingsNormalized3.getPreferredLanguage().getLabel();
                    boolean z16 = z10;
                    int aacPriority = audioVersionPrioritySettingsNormalized3.getAacPriority();
                    int ac3Priority = audioVersionPrioritySettingsNormalized3.getAc3Priority();
                    mediaItem = mediaItem2;
                    int eac3Priority = audioVersionPrioritySettingsNormalized3.getEac3Priority();
                    int dtsPriority = audioVersionPrioritySettingsNormalized3.getDtsPriority();
                    boolean z17 = z14;
                    int truehdPriority = audioVersionPrioritySettingsNormalized3.getTruehdPriority();
                    map4 = map11;
                    int flacPriority = audioVersionPrioritySettingsNormalized3.getFlacPriority();
                    map3 = map10;
                    str = str17;
                    StringBuilder sbZ = kb0.z("顺序=", strJoinToString$default2, ", 语言=", label2, ", AAC=");
                    c61.t(sbZ, aacPriority, ", AC3=", ac3Priority, ", EAC3=");
                    c61.t(sbZ, eac3Priority, ", DTS=", dtsPriority, ", TrueHD=");
                    sbZ.append(truehdPriority);
                    sbZ.append(", FLAC=");
                    sbZ.append(flacPriority);
                    Log.d("AudioTrack", "音频优先级规则: ".concat(sbZ.toString()));
                    ArrayList arrayList3 = (ArrayList) listE;
                    if (arrayList3.isEmpty()) {
                        Log.d("AudioTrack", "音频优先级候选: 无可用音轨");
                    } else {
                        int size2 = arrayList3.size();
                        int i14 = 0;
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj7 = arrayList3.get(i15);
                            int i16 = i15 + 1;
                            int i17 = i14 + 1;
                            if (i14 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            yf yfVar2 = (yf) obj7;
                            yfVar2.getClass();
                            int iM = pg.m(yfVar2, audioVersionPrioritySettings.normalized());
                            AudioLanguagePreference audioLanguagePreference2 = yfVar2.d;
                            if (audioLanguagePreference2 == null || (label = audioLanguagePreference2.getLabel()) == null) {
                                label = "未知";
                            }
                            String str28 = yfVar2.a;
                            String str29 = yfVar2.b;
                            String strName = yfVar2.e.name();
                            int i18 = size2;
                            boolean z18 = yfVar2.f;
                            ArrayList arrayList4 = arrayList3;
                            int i19 = yfVar2.g;
                            int i20 = yfVar2.h;
                            Object obj8 = yfVar2.i;
                            if (obj8 == null) {
                                obj8 = "-";
                            }
                            ExoPlayer exoPlayer3 = exoPlayer2;
                            StringBuilder sbZ2 = kb0.z("id=", str28, ", label=", str29, ", codec=");
                            i02.v(sbZ2, strName, ", language=", label, ", priority=");
                            sbZ2.append(iM);
                            sbZ2.append(", default=");
                            sbZ2.append(z18);
                            sbZ2.append(", channels=");
                            c61.t(sbZ2, i19, ", bitrate=", i20, ", apiStreamIndex=");
                            sbZ2.append(obj8);
                            Log.d("AudioTrack", "音频优先级候选[" + i14 + "]: " + sbZ2.toString());
                            size2 = i18;
                            arrayList3 = arrayList4;
                            i15 = i16;
                            i14 = i17;
                            exoPlayer2 = exoPlayer3;
                        }
                    }
                    ExoPlayer exoPlayer4 = exoPlayer2;
                    if (z16) {
                        if (yfVar != null) {
                            String str30 = yfVar.b;
                            String str31 = yfVar.a;
                            Log.d("AudioTrack", "音频优先级目标: current=" + ((Object) (StringsKt.isBlank(strH) ? "-" : strH)) + ", preferred=" + str31 + ", label=" + str30);
                            if (!Intrinsics.areEqual(str31, strH)) {
                                exoPlayer = exoPlayer4;
                                pg.c(exoPlayer, yfVar);
                                Log.d("AudioTrack", "已按音频优先级自动切换到: ".concat(str30));
                            }
                        }
                    } else if (!z17 || zI) {
                        Log.d("AudioTrack", "音频优先级全部相等，保持原始顺序，不自动切换音轨");
                    } else {
                        Log.d("AudioTrack", "未找到匹配的" + audioVersionPrioritySettingsNormalized.getPreferredLanguage().getLabel() + "音轨，保持当前默认音轨");
                    }
                    exoPlayer = exoPlayer4;
                }
            }
            function0.invoke();
        }
        if (mediaSource == null || (mediaStreams = mediaSource.getMediaStreams()) == null) {
            EmptyList = CollectionsKt.emptyList();
        } else {
            EmptyList = new ArrayList();
            for (Object obj9 : mediaStreams) {
                if (Intrinsics.areEqual(((MediaStream) obj9).getType(), "Subtitle")) {
                    EmptyList.add(obj9);
                }
            }
        }
        if (zBooleanValue || !e52.a(exoPlayer, tracks, str)) {
            EmptyList.getClass();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj10 : EmptyList) {
                if (!((MediaStream) obj10).isExternal()) {
                    arrayList5.add(obj10);
                }
            }
            at0 groups2 = tracks.getGroups();
            groups2.getClass();
            int size3 = groups2.size();
            int i21 = 0;
            Object obj11 = null;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            Format format = null;
            String str32 = null;
            Object obj12 = null;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                String str33 = "ass";
                str2 = str25;
                String str34 = "x";
                obj = obj11;
                String str35 = "SubtitleDebug";
                z = z19;
                z2 = z23;
                if (i21 >= size3) {
                    break;
                }
                Object obj13 = groups2.get(i21);
                int i24 = i21 + 1;
                int i25 = i22 + 1;
                if (i22 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Tracks.Group group4 = (Tracks.Group) obj13;
                at0 at0Var3 = groups2;
                int i26 = size3;
                if (group4.getType() != 3) {
                    arrayList = arrayList5;
                    obj11 = obj;
                    z19 = z;
                    z23 = z2;
                    map5 = map3;
                } else {
                    int i27 = group4.length;
                    int i28 = i23;
                    boolean z24 = z20;
                    int i29 = 0;
                    while (i29 < i27) {
                        int i30 = i27;
                        Format trackFormat2 = group4.getTrackFormat(i29);
                        trackFormat2.getClass();
                        if (group4.isTrackSupported(i29)) {
                            boolean z25 = z21;
                            String str36 = trackFormat2.sampleMimeType;
                            if (str36 == null) {
                                str36 = "";
                            }
                            boolean z26 = z22;
                            String str37 = trackFormat2.label;
                            if (str37 == null) {
                                str37 = "";
                            }
                            Format format2 = format;
                            String str38 = trackFormat2.codecs;
                            if (str38 == null) {
                                str38 = "";
                            }
                            String str39 = str32;
                            String str40 = trackFormat2.id;
                            if (str40 == null) {
                                str40 = "";
                            }
                            Object obj14 = obj12;
                            Locale locale = Locale.ROOT;
                            i2 = i22;
                            String lowerCase3 = str37.toLowerCase(locale);
                            lowerCase3.getClass();
                            String str41 = str37;
                            String lowerCase4 = str38.toLowerCase(locale);
                            lowerCase4.getClass();
                            String str42 = str38;
                            String str43 = str35;
                            boolean z27 = StringsKt__StringsKt.contains(str40, (CharSequence) "external", true) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "外挂", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "external", false, 2, (Object) null);
                            if (z27 || i28 >= arrayList5.size()) {
                                i3 = i28;
                                mediaStream = null;
                            } else {
                                i3 = i28 + 1;
                                mediaStream = (MediaStream) arrayList5.get(i28);
                            }
                            arrayList2 = arrayList5;
                            if (mediaStream == null || (codec = mediaStream.getCodec()) == null) {
                                lowerCase = null;
                            } else {
                                lowerCase = codec.toLowerCase(locale);
                                lowerCase.getClass();
                            }
                            if (lowerCase == null) {
                                lowerCase = "";
                            }
                            if (mediaStream == null || (title = mediaStream.getDisplayTitle()) == null) {
                                title = mediaStream != null ? mediaStream.getTitle() : null;
                            }
                            String lowerCase5 = (title == null ? "" : title).toLowerCase(locale);
                            lowerCase5.getClass();
                            if (group4.isTrackSelected(i29)) {
                                if (StringsKt__StringsKt.contains(str40, (CharSequence) "pgs", true)) {
                                    group = group4;
                                } else {
                                    group = group4;
                                    if (!StringsKt__StringsKt.contains(str40, (CharSequence) "dvb", true)) {
                                        i4 = i29;
                                        z5 = Intrinsics.areEqual(str36, MimeTypes.APPLICATION_PGS) || Intrinsics.areEqual(str36, MimeTypes.APPLICATION_DVBSUBS) || StringsKt__StringsKt.contains$default(str36, (CharSequence) "pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str36, (CharSequence) "dvbsub", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str36, (CharSequence) "dvb_subtitle", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "hdmv_pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "dvb", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase5, (CharSequence) "pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase5, (CharSequence) "dvb", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase4, (CharSequence) "pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase4, (CharSequence) "hdmv_pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase4, (CharSequence) "dvb", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "-pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "(pgs)", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "-dvb", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "(dvb)", false, 2, (Object) null);
                                        if (!StringsKt__StringsKt.contains$default(str36, (CharSequence) str33, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str36, (CharSequence) "ssa", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) str33, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase, (CharSequence) "ssa", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase5, (CharSequence) str33, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase5, (CharSequence) "ssa", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase4, (CharSequence) str33, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase4, (CharSequence) "ssa", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "-ass", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "(ass)", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "-ssa", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(lowerCase3, (CharSequence) "(ssa)", false, 2, (Object) null)) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (!z6 || z5) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z6 || z5) {
                                            z8 = false;
                                        } else {
                                            z8 = true;
                                        }
                                        if (z5) {
                                            String str44 = str36;
                                            String str45 = str40;
                                            str11 = str45;
                                            str10 = str44;
                                            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{this.d, String.valueOf(i2), String.valueOf(i4), str45, str41, str44, str42}), "|", null, null, 0, null, null, 62, null);
                                            map7 = map3;
                                        } else {
                                            String str46 = str40;
                                            str10 = str36;
                                            str11 = str46;
                                            map7 = map3;
                                            strJoinToString$default = str39;
                                        }
                                        obj3 = (String) map7.get(str41);
                                        map6 = map7;
                                        obj4 = (String) map4.get(str41);
                                        set3 = set3;
                                        if (set3.contains(str41) && !z27 && obj3 == null) {
                                            z9 = false;
                                        } else {
                                            z9 = true;
                                        }
                                        if (!set3.contains(str41) || z27) {
                                            Map map12 = map2;
                                            obj3 = map12.get(str41);
                                            map2 = map12;
                                            obj4 = map.get(str41);
                                        } else if (obj3 == null) {
                                            obj3 = null;
                                            obj4 = null;
                                        }
                                        int i31 = trackFormat2.width;
                                        int i32 = trackFormat2.height;
                                        String str47 = str34;
                                        float f = trackFormat2.pixelWidthHeightRatio;
                                        StringBuilder sbZ3 = kb0.z("选中字幕轨道: label=", str41, ", mime=", str10, ", codecs=");
                                        i02.v(sbZ3, str42, ", id=", str11, ", apiCodec=");
                                        i02.v(sbZ3, lowerCase, ", apiTitle=", lowerCase5, ", isExternalTrack=");
                                        i9.r(sbZ3, z27, ", isExternal=", z9, ", isBitmap=");
                                        i9.r(sbZ3, z5, ", needsNative=", z7, ", formatSize=");
                                        str8 = str47;
                                        c61.t(sbZ3, i31, str8, i32, ", pixelRatio=");
                                        sbZ3.append(f);
                                        String string = sbZ3.toString();
                                        str9 = str43;
                                        Log.d(str9, string);
                                        z21 = z9;
                                        str32 = strJoinToString$default;
                                        obj = obj3;
                                        obj12 = obj4;
                                        i28 = i3;
                                        format = trackFormat2;
                                        z = true;
                                        z2 = z8;
                                        z24 = z7;
                                        z22 = z5;
                                    }
                                    if (StringsKt__StringsKt.contains$default(str36, (CharSequence) str33, false, 2, (Object) null)) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    if (z6) {
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    if (z6) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z5) {
                                        String str48 = str36;
                                        String str49 = str40;
                                        str11 = str49;
                                        str10 = str48;
                                        strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{this.d, String.valueOf(i2), String.valueOf(i4), str49, str41, str48, str42}), "|", null, null, 0, null, null, 62, null);
                                        map7 = map3;
                                    } else {
                                        String str410 = str40;
                                        str10 = str36;
                                        str11 = str410;
                                        map7 = map3;
                                        strJoinToString$default = str39;
                                    }
                                    obj3 = (String) map7.get(str41);
                                    map6 = map7;
                                    obj4 = (String) map4.get(str41);
                                    set3 = set3;
                                    if (set3.contains(str41)) {
                                        z9 = true;
                                    } else {
                                        z9 = true;
                                    }
                                    if (set3.contains(str41)) {
                                        Map map13 = map2;
                                        obj3 = map13.get(str41);
                                        map2 = map13;
                                        obj4 = map.get(str41);
                                    } else {
                                        Map map14 = map2;
                                        obj3 = map14.get(str41);
                                        map2 = map14;
                                        obj4 = map.get(str41);
                                    }
                                    int i33 = trackFormat2.width;
                                    int i34 = trackFormat2.height;
                                    String str411 = str34;
                                    float f2 = trackFormat2.pixelWidthHeightRatio;
                                    StringBuilder sbZ4 = kb0.z("选中字幕轨道: label=", str41, ", mime=", str10, ", codecs=");
                                    i02.v(sbZ4, str42, ", id=", str11, ", apiCodec=");
                                    i02.v(sbZ4, lowerCase, ", apiTitle=", lowerCase5, ", isExternalTrack=");
                                    i9.r(sbZ4, z27, ", isExternal=", z9, ", isBitmap=");
                                    i9.r(sbZ4, z5, ", needsNative=", z7, ", formatSize=");
                                    str8 = str411;
                                    c61.t(sbZ4, i33, str8, i34, ", pixelRatio=");
                                    sbZ4.append(f2);
                                    String string2 = sbZ4.toString();
                                    str9 = str43;
                                    Log.d(str9, string2);
                                    z21 = z9;
                                    str32 = strJoinToString$default;
                                    obj = obj3;
                                    obj12 = obj4;
                                    i28 = i3;
                                    format = trackFormat2;
                                    z = true;
                                    z2 = z8;
                                    z24 = z7;
                                    z22 = z5;
                                }
                                i4 = i29;
                                if (StringsKt__StringsKt.contains$default(str36, (CharSequence) str33, false, 2, (Object) null)) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                if (z6) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                if (z6) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z5) {
                                    String str412 = str36;
                                    String str413 = str40;
                                    str11 = str413;
                                    str10 = str412;
                                    strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{this.d, String.valueOf(i2), String.valueOf(i4), str413, str41, str412, str42}), "|", null, null, 0, null, null, 62, null);
                                    map7 = map3;
                                } else {
                                    String str414 = str40;
                                    str10 = str36;
                                    str11 = str414;
                                    map7 = map3;
                                    strJoinToString$default = str39;
                                }
                                obj3 = (String) map7.get(str41);
                                map6 = map7;
                                obj4 = (String) map4.get(str41);
                                set3 = set3;
                                if (set3.contains(str41)) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (set3.contains(str41)) {
                                    Map map15 = map2;
                                    obj3 = map15.get(str41);
                                    map2 = map15;
                                    obj4 = map.get(str41);
                                } else {
                                    Map map16 = map2;
                                    obj3 = map16.get(str41);
                                    map2 = map16;
                                    obj4 = map.get(str41);
                                }
                                int i35 = trackFormat2.width;
                                int i36 = trackFormat2.height;
                                String str415 = str34;
                                float f3 = trackFormat2.pixelWidthHeightRatio;
                                StringBuilder sbZ5 = kb0.z("选中字幕轨道: label=", str41, ", mime=", str10, ", codecs=");
                                i02.v(sbZ5, str42, ", id=", str11, ", apiCodec=");
                                i02.v(sbZ5, lowerCase, ", apiTitle=", lowerCase5, ", isExternalTrack=");
                                i9.r(sbZ5, z27, ", isExternal=", z9, ", isBitmap=");
                                i9.r(sbZ5, z5, ", needsNative=", z7, ", formatSize=");
                                str8 = str415;
                                c61.t(sbZ5, i35, str8, i36, ", pixelRatio=");
                                sbZ5.append(f3);
                                String string3 = sbZ5.toString();
                                str9 = str43;
                                Log.d(str9, string3);
                                z21 = z9;
                                str32 = strJoinToString$default;
                                obj = obj3;
                                obj12 = obj4;
                                i28 = i3;
                                format = trackFormat2;
                                z = true;
                                z2 = z8;
                                z24 = z7;
                                z22 = z5;
                            } else {
                                group = group4;
                                str8 = str34;
                                i4 = i29;
                                map6 = map3;
                                str9 = str43;
                                i28 = i3;
                                z21 = z25;
                                z22 = z26;
                                format = format2;
                                str32 = str39;
                                obj12 = obj14;
                            }
                        } else {
                            String str50 = str35;
                            str8 = str34;
                            str9 = str50;
                            group = group4;
                            arrayList2 = arrayList5;
                            i4 = i29;
                            i2 = i22;
                            map6 = map3;
                        }
                        i29 = i4 + 1;
                        String str51 = str8;
                        str35 = str9;
                        str34 = str51;
                        i27 = i30;
                        map3 = map6;
                        str33 = str33;
                        i22 = i2;
                        arrayList5 = arrayList2;
                        group4 = group;
                    }
                    z20 = z24;
                    i23 = i28;
                    arrayList = arrayList5;
                    map5 = map3;
                    obj11 = obj;
                    z19 = z;
                    z23 = z2;
                }
                str25 = str2;
                groups2 = at0Var3;
                i22 = i25;
                i21 = i24;
                size3 = i26;
                map3 = map5;
                arrayList5 = arrayList;
            }
            int i37 = 3;
            Log.d("SubtitleTrack", "onTracksChanged: needsNativeRender=" + z20 + ", isExternal=" + z21 + ", isBitmap=" + z22);
            String str52 = (String) obj12;
            bw1 bw1Var = new bw1(z, z20, z21, z22, z2, format, str32, (String) obj, str52);
            int i38 = (!z22 || format == null) ? 0 : format.width;
            int i39 = (!z22 || format == null) ? 0 : format.height;
            if (z22) {
                if (i38 <= 0 || i39 <= 0) {
                    Log.d("SubtitleDebug", "PGS 字幕画布尺寸未知，将使用回退宽高比估算");
                } else {
                    Log.d("SubtitleDebug", "PGS 字幕画布尺寸: " + i38 + "x" + i39);
                }
            }
            if (zBooleanValue) {
                Log.d("SubtitleTrack", "正在应用延迟，跳过重置。isExternal=" + z21 + ", needsNativeRender=" + z20);
                if (z21) {
                    String strN = in1.n(str52);
                    if (Intrinsics.areEqual(strN, "srt") || Intrinsics.areEqual(strN, "ass")) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                f52Var = new f52(bw1Var, z4, !Intrinsics.areEqual(str32, str16), i38, i39, false, null, false, false);
            } else {
                int i40 = i38;
                int i41 = i39;
                at0 groups3 = tracks.getGroups();
                groups3.getClass();
                int size4 = groups3.size();
                int i42 = -1;
                String str53 = "";
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                while (i45 < size4) {
                    Object obj15 = groups3.get(i45);
                    i45++;
                    int i46 = i43 + 1;
                    if (i43 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Tracks.Group group5 = (Tracks.Group) obj15;
                    if (group5.getType() == i37) {
                        int i47 = group5.length;
                        int i48 = 0;
                        while (i48 < i47) {
                            if (group5.isTrackSelected(i48)) {
                                Format trackFormat3 = group5.getTrackFormat(i48);
                                trackFormat3.getClass();
                                String str54 = trackFormat3.label;
                                if (str54 == null) {
                                    str54 = "";
                                }
                                int i49 = i44 + i48;
                                StringBuilder sbO = c61.o("选中轨道: groupIndex=", i43, i48, ", trackIndex=", ", globalIndex=");
                                sbO.append(i49);
                                str7 = str2;
                                sbO.append(str7);
                                sbO.append((Object) str54);
                                Log.d("SubtitleTrack", sbO.toString());
                                str53 = str54;
                                i42 = i49;
                            } else {
                                str7 = str2;
                            }
                            i48++;
                            groups3 = groups3;
                            str2 = str7;
                            i44 = i44;
                            size4 = size4;
                        }
                        at0Var = groups3;
                        i = size4;
                        str6 = str2;
                        i44 += group5.length;
                    } else {
                        at0Var = groups3;
                        i = size4;
                        str6 = str2;
                    }
                    groups3 = at0Var;
                    str2 = str6;
                    i43 = i46;
                    i37 = 3;
                    size4 = i;
                }
                String strH2 = n42.h(str53);
                String str55 = !StringsKt.isBlank(str53) ? str53 : null;
                String seriesId = mediaItem.getSeriesId();
                if (!Intrinsics.areEqual(mediaItem.getType(), "Episode") || seriesId == null) {
                    obj2 = "ass";
                    str3 = strH2;
                    str4 = str55;
                    str5 = str16;
                    if (str15 == null || i42 < 0) {
                        Log.d("SubtitleTrack", "字幕已关闭或无mediaSourceId，使用默认设置");
                        subtitleDisplaySettings = new SubtitlePreferences.SubtitleDisplaySettings(0.0f, 0.0f, 0L, 0, 15, null);
                        movieDisplaySettings = subtitleDisplaySettings;
                    } else {
                        movieDisplaySettings = subtitlePreferences.getMovieDisplaySettings(mediaItem.getId(), str15, i42);
                        Log.d("SubtitleTrack", "读取电影字幕[轨道" + i42 + "]设置: offset=" + movieDisplaySettings.getVerticalOffset() + ", scale=" + movieDisplaySettings.getScale() + ", delay=" + movieDisplaySettings.getTimeOffsetMs() + "ms, color=" + movieDisplaySettings.getColor());
                    }
                } else if (i42 >= 0) {
                    SubtitlePreferences.SubtitleDisplaySettings seriesDisplaySettings = subtitlePreferences.getSeriesDisplaySettings(seriesId, strH2, str55);
                    str3 = strH2;
                    str4 = str55;
                    str5 = str16;
                    obj2 = "ass";
                    Log.d("SubtitleTrack", "读取剧集字幕[" + str53 + "]设置: offset=" + seriesDisplaySettings.getVerticalOffset() + ", scale=" + seriesDisplaySettings.getScale() + ", delay=" + seriesDisplaySettings.getTimeOffsetMs() + "ms, color=" + seriesDisplaySettings.getColor());
                    movieDisplaySettings = seriesDisplaySettings;
                } else {
                    obj2 = "ass";
                    str3 = strH2;
                    str4 = str55;
                    str5 = str16;
                    Log.d("SubtitleTrack", "字幕已关闭，使用默认设置");
                    subtitleDisplaySettings = new SubtitlePreferences.SubtitleDisplaySettings(0.0f, 0.0f, 0L, 0, 15, null);
                    movieDisplaySettings = subtitleDisplaySettings;
                }
                if (bw1Var.c) {
                    String strN2 = in1.n(bw1Var.i);
                    if (Intrinsics.areEqual(strN2, "srt") || Intrinsics.areEqual(strN2, obj2)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                f52Var = new f52(bw1Var, z3, !Intrinsics.areEqual(bw1Var.g, str5), i40, i41, false, new n32(i42, str3, str4, (int) movieDisplaySettings.getVerticalOffset(), (int) (movieDisplaySettings.getScale() * 100.0f), movieDisplaySettings.getTimeOffsetMs() / 1000.0f, movieDisplaySettings.getColor()), true, false);
            }
            f52Var2 = f52Var;
        } else {
            f52Var2 = new f52(new bw1(false, false, false, false, false, null, null, null, null), false, false, 0, 0, true, null, false, true);
        }
        vw0Var.invoke(f52Var2);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        int i;
        videoSize.getClass();
        Function2 function2 = ((ch1) this.b.getValue()).o;
        videoSize.getClass();
        function2.getClass();
        function2.invoke(Integer.valueOf(videoSize.width), Integer.valueOf(videoSize.height));
        int i2 = videoSize.width;
        if (i2 <= 0 || (i = videoSize.height) <= 0) {
            return;
        }
        Log.d("SubtitleDebug", "视频分辨率: " + i2 + "x" + i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(List list) {
    }
}
