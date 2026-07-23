package defpackage;

import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gh1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final MediaItem n;
    public final String o;
    public final String p;
    public final boolean q;
    public final Integer r;
    public final String s;
    public final String t;
    public final boolean u;
    public final AudioVersionPrioritySettings v;
    public final Integer w;

    static {
        AudioVersionPrioritySettings.Companion companion = AudioVersionPrioritySettings.INSTANCE;
    }

    public gh1(String str, boolean z, boolean z2, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, MediaItem mediaItem, String str4, String str5, boolean z11, Integer num, String str6, String str7, boolean z12, AudioVersionPrioritySettings audioVersionPrioritySettings, Integer num2) {
        str.getClass();
        mediaItem.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        audioVersionPrioritySettings.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = str3;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
        this.n = mediaItem;
        this.o = str4;
        this.p = str5;
        this.q = z11;
        this.r = num;
        this.s = str6;
        this.t = str7;
        this.u = z12;
        this.v = audioVersionPrioritySettings;
        this.w = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh1)) {
            return false;
        }
        gh1 gh1Var = (gh1) obj;
        return Intrinsics.areEqual(this.a, gh1Var.a) && this.b == gh1Var.b && this.c == gh1Var.c && Intrinsics.areEqual(this.d, gh1Var.d) && Intrinsics.areEqual(this.e, gh1Var.e) && this.f == gh1Var.f && this.g == gh1Var.g && this.h == gh1Var.h && this.i == gh1Var.i && this.j == gh1Var.j && this.k == gh1Var.k && this.l == gh1Var.l && this.m == gh1Var.m && Intrinsics.areEqual(this.n, gh1Var.n) && Intrinsics.areEqual(this.o, gh1Var.o) && Intrinsics.areEqual(this.p, gh1Var.p) && this.q == gh1Var.q && Intrinsics.areEqual(this.r, gh1Var.r) && Intrinsics.areEqual(this.s, gh1Var.s) && Intrinsics.areEqual(this.t, gh1Var.t) && this.u == gh1Var.u && Intrinsics.areEqual(this.v, gh1Var.v) && Intrinsics.areEqual(this.w, gh1Var.w);
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int i = i02.i((this.n.hashCode() + ((((((((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31)) * 31, 31, this.o);
        String str3 = this.p;
        int iHashCode3 = (((i + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.q ? 1231 : 1237)) * 31;
        Integer num = this.r;
        int iHashCode4 = (this.v.hashCode() + ((i02.i(i02.i((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.s), 31, this.t) + (this.u ? 1231 : 1237)) * 31)) * 31;
        Integer num2 = this.w;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerMediaListenerSessionState(currentPlayingItemId=");
        sb.append(this.a);
        sb.append(", isDirectMode=");
        sb.append(this.b);
        sb.append(", isAutoRefreshingPlayback=");
        sb.append(this.c);
        sb.append(", serverId=");
        sb.append(this.d);
        sb.append(", lastRecordedPlaybackAccessMediaId=");
        sb.append(this.e);
        sb.append(", suppressNextPauseProgressReport=");
        sb.append(this.f);
        sb.append(", hasStartedPlaybackInSession=");
        i9.r(sb, this.g, ", isAppInForeground=", this.h, ", isPlaybackPausedForBackground=");
        i9.r(sb, this.i, ", hasShownUnseekablePlaybackNotice=", this.j, ", isDanmakuVisible=");
        i9.r(sb, this.k, ", hasDanmaku=", this.l, ", hasAutoSelectedSubtitle=");
        sb.append(this.m);
        sb.append(", mediaItem=");
        sb.append(this.n);
        sb.append(", selectedMediaSourceId=");
        i02.v(sb, this.o, ", selectedMediaSourceIdOrNull=", this.p, ", isTranscoding=");
        sb.append(this.q);
        sb.append(", transcodeSubtitleStreamIndex=");
        sb.append(this.r);
        sb.append(", currentDecoderMode=");
        i02.v(sb, this.s, ", currentAudioDecoderMode=", this.t, ", hasAppliedAudioPriorityForSource=");
        sb.append(this.u);
        sb.append(", audioVersionPrioritySettings=");
        sb.append(this.v);
        sb.append(", pendingDetailAudioStreamIndex=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
}
