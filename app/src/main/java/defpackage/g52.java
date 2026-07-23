package defpackage;

import androidx.media3.common.TrackGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g52 {
    public final TrackGroup a;
    public final int b;

    public g52(TrackGroup trackGroup, int i) {
        trackGroup.getClass();
        this.a = trackGroup;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g52)) {
            return false;
        }
        g52 g52Var = (g52) obj;
        return Intrinsics.areEqual(this.a, g52Var.a) && this.b == g52Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SubtitleTrackInfo(trackGroup=" + this.a + ", trackIndex=" + this.b + ")";
    }
}
