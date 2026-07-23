package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gu {
    public final ExoPlayer a;
    public final md b;
    public final String c;

    public gu(ExoPlayer exoPlayer, md mdVar, String str) {
        exoPlayer.getClass();
        this.a = exoPlayer;
        this.b = mdVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        return Intrinsics.areEqual(this.a, guVar.a) && Intrinsics.areEqual(this.b, guVar.b) && Intrinsics.areEqual(this.c, guVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        md mdVar = this.b;
        int iHashCode2 = (iHashCode + (mdVar == null ? 0 : mdVar.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfiguredExoPlayerResult(player=");
        sb.append(this.a);
        sb.append(", assHandler=");
        sb.append(this.b);
        sb.append(", assEnhancementFallbackNotice=");
        return s01.w(sb, this.c, ")");
    }
}
