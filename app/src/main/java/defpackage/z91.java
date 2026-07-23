package defpackage;

import android.os.Handler;
import android.util.Log;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z91 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Ref.BooleanRef b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Ref.ObjectRef e;
    public final /* synthetic */ Handler g;
    public final /* synthetic */ Ref.ObjectRef h;
    public final /* synthetic */ Ref.ObjectRef i;

    public /* synthetic */ z91(Ref.BooleanRef booleanRef, ExoPlayer exoPlayer, String str, Ref.ObjectRef objectRef, Handler handler, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.b = booleanRef;
        this.c = exoPlayer;
        this.d = str;
        this.e = objectRef;
        this.g = handler;
        this.h = objectRef2;
        this.i = objectRef3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        switch (i) {
            case 0:
                Ref.BooleanRef booleanRef = this.b;
                if (!booleanRef.element) {
                    Log.w("SubtitleTrack", "在线字幕自动选择超时: ".concat(str));
                    ba1.a(booleanRef, this.e, this.g, this.h, this.c, this.i);
                    break;
                }
                break;
            default:
                Ref.BooleanRef booleanRef2 = this.b;
                if (!booleanRef2.element) {
                    ExoPlayer exoPlayer = this.c;
                    Tracks currentTracks = exoPlayer.getCurrentTracks();
                    currentTracks.getClass();
                    if (!e52.a(exoPlayer, currentTracks, str)) {
                        Log.w("SubtitleTrack", "在线字幕轨道尚未匹配到，跳过自动选择: ".concat(str));
                    }
                    ba1.a(booleanRef2, this.e, this.g, this.h, exoPlayer, this.i);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z91(Ref.BooleanRef booleanRef, String str, Ref.ObjectRef objectRef, Handler handler, Ref.ObjectRef objectRef2, ExoPlayer exoPlayer, Ref.ObjectRef objectRef3) {
        this.b = booleanRef;
        this.d = str;
        this.e = objectRef;
        this.g = handler;
        this.h = objectRef2;
        this.c = exoPlayer;
        this.i = objectRef3;
    }
}
