package defpackage;

import androidx.media3.common.TrackGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qg {
    public final TrackGroup a;
    public final int b;

    public qg(TrackGroup trackGroup, int i) {
        trackGroup.getClass();
        this.a = trackGroup;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return Intrinsics.areEqual(this.a, qgVar.a) && this.b == qgVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "AudioTrackInfo(trackGroup=" + this.a + ", trackIndex=" + this.b + ")";
    }
}
