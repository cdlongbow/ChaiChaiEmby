package defpackage;

import android.graphics.Typeface;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uo1 {
    public final ExoPlayer a;
    public final boolean b;
    public final PlayerResizeMode c;
    public final int d;
    public final int e;
    public final Typeface f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final md k;
    public final md l;
    public final int m;
    public final int n;
    public final SubtitlePreferences.SubtitleColor o;
    public final int p;
    public final int q;
    public final int r;

    public uo1(ExoPlayer exoPlayer, boolean z, PlayerResizeMode playerResizeMode, int i, int i2, Typeface typeface, boolean z2, boolean z3, boolean z4, boolean z5, md mdVar, md mdVar2, int i3, int i4, SubtitlePreferences.SubtitleColor subtitleColor, int i5, int i6, int i7) {
        exoPlayer.getClass();
        playerResizeMode.getClass();
        subtitleColor.getClass();
        this.a = exoPlayer;
        this.b = z;
        this.c = playerResizeMode;
        this.d = i;
        this.e = i2;
        this.f = typeface;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = mdVar;
        this.l = mdVar2;
        this.m = i3;
        this.n = i4;
        this.o = subtitleColor;
        this.p = i5;
        this.q = i6;
        this.r = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo1)) {
            return false;
        }
        uo1 uo1Var = (uo1) obj;
        return Intrinsics.areEqual(this.a, uo1Var.a) && this.b == uo1Var.b && this.c == uo1Var.c && this.d == uo1Var.d && this.e == uo1Var.e && Intrinsics.areEqual(this.f, uo1Var.f) && this.g == uo1Var.g && this.h == uo1Var.h && this.i == uo1Var.i && this.j == uo1Var.j && Intrinsics.areEqual(this.k, uo1Var.k) && Intrinsics.areEqual(this.l, uo1Var.l) && this.m == uo1Var.m && this.n == uo1Var.n && this.o == uo1Var.o && this.p == uo1Var.p && this.q == uo1Var.q && this.r == uo1Var.r;
    }

    public final int hashCode() {
        int iHashCode = (((((this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + this.d) * 31) + this.e) * 31;
        Typeface typeface = this.f;
        int iHashCode2 = (((((((((iHashCode + (typeface == null ? 0 : typeface.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31;
        md mdVar = this.k;
        int iHashCode3 = (iHashCode2 + (mdVar == null ? 0 : mdVar.hashCode())) * 31;
        md mdVar2 = this.l;
        return ((((((this.o.hashCode() + ((((((iHashCode3 + (mdVar2 != null ? mdVar2.hashCode() : 0)) * 31) + this.m) * 31) + this.n) * 31)) * 31) + this.p) * 31) + this.q) * 31) + this.r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerViewSubtitleBindingState(player=");
        sb.append(this.a);
        sb.append(", useTextureView=");
        sb.append(this.b);
        sb.append(", resizeMode=");
        sb.append(this.c);
        sb.append(", videoFrameWidth=");
        sb.append(this.d);
        sb.append(", videoFrameHeight=");
        sb.append(this.e);
        sb.append(", subtitleTypeface=");
        sb.append(this.f);
        sb.append(", enableAssSubtitleEnhancement=");
        i9.r(sb, this.g, ", useNativeSubtitle=", this.h, ", isBitmapSubtitle=");
        i9.r(sb, this.i, ", isAssTextSubtitle=", this.j, ", currentAssHandler=");
        sb.append(this.k);
        sb.append(", currentAssHandlerForOverlay=");
        sb.append(this.l);
        sb.append(", subtitleScale=");
        c61.t(sb, this.m, ", subtitleVerticalOffset=", this.n, ", subtitleColor=");
        sb.append(this.o);
        sb.append(", subtitleBitmapBrightness=");
        sb.append(this.p);
        sb.append(", subtitleCanvasWidth=");
        sb.append(this.q);
        sb.append(", subtitleCanvasHeight=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
