package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.DanmakuSettings;
import com.dh.myembyapp.data.model.SystemDurationDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class oh1 {
    public final ExoPlayer a;
    public final float b;
    public final String c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final int g;
    public final float h;
    public final boolean i;
    public final int j;
    public final DanmakuSettings k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final String o;
    public final SystemNetworkSpeedDisplayMode p;
    public final SystemNetworkSpeedPosition q;
    public final SystemTimeDisplayMode r;
    public final String s;
    public final SystemDurationDisplayMode t;
    public final String u;

    public oh1(ExoPlayer exoPlayer, float f, String str, boolean z, List list, boolean z2, int i, float f2, boolean z3, int i2, DanmakuSettings danmakuSettings, boolean z4, String str2, boolean z5, String str3, SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode, SystemNetworkSpeedPosition systemNetworkSpeedPosition, SystemTimeDisplayMode systemTimeDisplayMode, String str4, SystemDurationDisplayMode systemDurationDisplayMode, String str5) {
        exoPlayer.getClass();
        str.getClass();
        list.getClass();
        danmakuSettings.getClass();
        systemNetworkSpeedDisplayMode.getClass();
        systemNetworkSpeedPosition.getClass();
        systemTimeDisplayMode.getClass();
        str4.getClass();
        systemDurationDisplayMode.getClass();
        str5.getClass();
        this.a = exoPlayer;
        this.b = f;
        this.c = str;
        this.d = z;
        this.e = list;
        this.f = z2;
        this.g = i;
        this.h = f2;
        this.i = z3;
        this.j = i2;
        this.k = danmakuSettings;
        this.l = z4;
        this.m = str2;
        this.n = z5;
        this.o = str3;
        this.p = systemNetworkSpeedDisplayMode;
        this.q = systemNetworkSpeedPosition;
        this.r = systemTimeDisplayMode;
        this.s = str4;
        this.t = systemDurationDisplayMode;
        this.u = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh1)) {
            return false;
        }
        oh1 oh1Var = (oh1) obj;
        return Intrinsics.areEqual(this.a, oh1Var.a) && Float.compare(this.b, oh1Var.b) == 0 && Intrinsics.areEqual(this.c, oh1Var.c) && this.d == oh1Var.d && Intrinsics.areEqual(this.e, oh1Var.e) && this.f == oh1Var.f && this.g == oh1Var.g && Float.compare(this.h, oh1Var.h) == 0 && this.i == oh1Var.i && this.j == oh1Var.j && Intrinsics.areEqual(this.k, oh1Var.k) && this.l == oh1Var.l && Intrinsics.areEqual(this.m, oh1Var.m) && this.n == oh1Var.n && Intrinsics.areEqual(this.o, oh1Var.o) && this.p == oh1Var.p && this.q == oh1Var.q && this.r == oh1Var.r && Intrinsics.areEqual(this.s, oh1Var.s) && this.t == oh1Var.t && Intrinsics.areEqual(this.u, oh1Var.u);
    }

    public final int hashCode() {
        int iHashCode = (((this.k.hashCode() + ((((qi0.e(this.h, (((qi0.f(this.e, (i02.i(qi0.e(this.b, this.a.hashCode() * 31, 31), 31, this.c) + (this.d ? 1231 : 1237)) * 31, 31) + (this.f ? 1231 : 1237)) * 31) + this.g) * 31, 31) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31)) * 31) + (this.l ? 1231 : 1237)) * 31;
        String str = this.m;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.n ? 1231 : 1237)) * 31;
        String str2 = this.o;
        int iHashCode3 = this.t.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
        String str3 = this.u;
        return (iHashCode3 * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerPlaybackOverlayState(player=");
        sb.append(this.a);
        sb.append(", startupArtworkOverlayAlpha=");
        sb.append(this.b);
        sb.append(", startupArtworkUrl=");
        sb.append(this.c);
        sb.append(", isDanmakuVisible=");
        sb.append(this.d);
        sb.append(", danmakuList=");
        sb.append(this.e);
        sb.append(", isPlaying=");
        sb.append(this.f);
        sb.append(", playerState=");
        sb.append(this.g);
        sb.append(", playbackSpeed=");
        sb.append(this.h);
        sb.append(", isTemporaryFastForwardActive=");
        sb.append(this.i);
        sb.append(", previewDanmakuOffsetSec=");
        sb.append(this.j);
        sb.append(", danmakuSettings=");
        sb.append(this.k);
        sb.append(", isBuffering=");
        sb.append(this.l);
        sb.append(", networkSpeedText=");
        sb.append(this.m);
        sb.append(", showControlMenu=");
        sb.append(this.n);
        sb.append(", menuNetworkSpeedText=");
        sb.append(this.o);
        sb.append(", systemNetworkSpeedDisplayMode=");
        sb.append(this.p);
        sb.append(", systemNetworkSpeedPosition=");
        sb.append(this.q);
        sb.append(", systemTimeDisplayMode=");
        sb.append(this.r);
        sb.append(", menuSystemTimeText=");
        sb.append(this.s);
        sb.append(", systemDurationDisplayMode=");
        sb.append(this.t);
        sb.append(", menuDurationText=");
        sb.append(this.u);
        sb.append(")");
        return sb.toString();
    }
}