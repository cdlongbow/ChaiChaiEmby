package defpackage;

import android.graphics.Typeface;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hh1 {
    public final boolean a;
    public final SubtitleVersionPrioritySettings b;
    public final Function0 c;
    public final pl d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final Typeface i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final md m;
    public final String n;
    public final Set o;
    public final Map p;
    public final Map q;
    public final Map r;
    public final Map s;
    public final String t;
    public final String u;
    public final Function0 v;

    public hh1(boolean z, SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, Function0 function0, pl plVar, boolean z2, boolean z3, int i, boolean z4, Typeface typeface, boolean z5, boolean z6, boolean z7, md mdVar, String str, Set set, Map map, Map map2, Map map3, Map map4, String str2, String str3, Function0 function1) {
        subtitleVersionPrioritySettings.getClass();
        function0.getClass();
        set.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        function1.getClass();
        this.a = z;
        this.b = subtitleVersionPrioritySettings;
        this.c = function0;
        this.d = plVar;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.h = z4;
        this.i = typeface;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = mdVar;
        this.n = str;
        this.o = set;
        this.p = map;
        this.q = map2;
        this.r = map3;
        this.s = map4;
        this.t = str2;
        this.u = str3;
        this.v = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh1)) {
            return false;
        }
        hh1 hh1Var = (hh1) obj;
        return this.a == hh1Var.a && Intrinsics.areEqual(this.b, hh1Var.b) && Intrinsics.areEqual(this.c, hh1Var.c) && Intrinsics.areEqual(this.d, hh1Var.d) && this.e == hh1Var.e && this.f == hh1Var.f && this.g == hh1Var.g && this.h == hh1Var.h && Intrinsics.areEqual(this.i, hh1Var.i) && this.j == hh1Var.j && this.k == hh1Var.k && this.l == hh1Var.l && Intrinsics.areEqual(this.m, hh1Var.m) && Intrinsics.areEqual(this.n, hh1Var.n) && Intrinsics.areEqual(this.o, hh1Var.o) && Intrinsics.areEqual(this.p, hh1Var.p) && Intrinsics.areEqual(this.q, hh1Var.q) && Intrinsics.areEqual(this.r, hh1Var.r) && Intrinsics.areEqual(this.s, hh1Var.s) && Intrinsics.areEqual(this.t, hh1Var.t) && Intrinsics.areEqual(this.u, hh1Var.u) && Intrinsics.areEqual(this.v, hh1Var.v);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a ? 1231 : 1237) * 31)) * 31)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + this.g) * 31) + (this.h ? 1231 : 1237)) * 31;
        Typeface typeface = this.i;
        int iHashCode2 = (((((((iHashCode + (typeface == null ? 0 : typeface.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31;
        md mdVar = this.m;
        int iHashCode3 = (iHashCode2 + (mdVar == null ? 0 : mdVar.hashCode())) * 31;
        String str = this.n;
        int iHashCode4 = (this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str2 = this.t;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.u;
        return this.v.hashCode() + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerMediaListenerSubtitleState(isSubtitlesEnabled=");
        sb.append(this.a);
        sb.append(", subtitleVersionPrioritySettings=");
        sb.append(this.b);
        sb.append(", playerViewProvider=");
        sb.append(this.c);
        sb.append(", bitmapSubtitleCueBinder=");
        sb.append(this.d);
        sb.append(", isBitmapSubtitle=");
        i9.r(sb, this.e, ", isBitmapSubtitleBrightnessEnabled=", this.f, ", subtitleBitmapBrightness=");
        sb.append(this.g);
        sb.append(", hasLoggedBitmapCues=");
        sb.append(this.h);
        sb.append(", subtitleTypeface=");
        sb.append(this.i);
        sb.append(", enableAssSubtitleEnhancement=");
        sb.append(this.j);
        sb.append(", useNativeSubtitle=");
        i9.r(sb, this.k, ", isAssTextSubtitle=", this.l, ", currentAssHandler=");
        sb.append(this.m);
        sb.append(", currentSubtitleTitle=");
        sb.append(this.n);
        sb.append(", externalSubtitleLabels=");
        sb.append(this.o);
        sb.append(", externalSubtitleUrlMap=");
        sb.append(this.p);
        sb.append(", externalSubtitleFormatMap=");
        sb.append(this.q);
        sb.append(", onlineSubtitlePathMap=");
        sb.append(this.r);
        sb.append(", onlineSubtitleFormatMap=");
        sb.append(this.s);
        sb.append(", lastBitmapCueTrackKey=");
        sb.append(this.t);
        sb.append(", pendingSubtitleLabelSelection=");
        sb.append(this.u);
        sb.append(", isApplyingDelayProvider=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }
}
