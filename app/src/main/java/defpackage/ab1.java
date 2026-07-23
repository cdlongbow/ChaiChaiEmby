package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ab1 {
    public final MediaItem a;
    public final String b;

    public ab1(MediaItem mediaItem, String str) {
        str.getClass();
        this.a = mediaItem;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab1)) {
            return false;
        }
        ab1 ab1Var = (ab1) obj;
        return Intrinsics.areEqual(this.a, ab1Var.a) && Intrinsics.areEqual(this.b, ab1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EpisodeMatchResult(episode=" + this.a + ", label=" + this.b + ")";
    }
}
