package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ea0 extends fa0 {
    public final MediaItem a;

    public ea0(MediaItem mediaItem) {
        this.a = mediaItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea0) && Intrinsics.areEqual(this.a, ((ea0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(mediaItem=" + this.a + ")";
    }
}
