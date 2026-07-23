package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ba0 {
    public final MediaItem a;
    public final MediaItem b;

    public ba0(MediaItem mediaItem, MediaItem mediaItem2) {
        mediaItem.getClass();
        this.a = mediaItem;
        this.b = mediaItem2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj;
        return Intrinsics.areEqual(this.a, ba0Var.a) && Intrinsics.areEqual(this.b, ba0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        MediaItem mediaItem = this.b;
        return iHashCode + (mediaItem == null ? 0 : mediaItem.hashCode());
    }

    public final String toString() {
        return "DetailTraktWatchedTarget(mediaItem=" + this.a + ", parentSeries=" + this.b + ")";
    }
}
