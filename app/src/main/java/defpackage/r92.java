package defpackage;

import com.dh.myembyapp.data.model.TraktPlaybackProgressItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r92 {
    public final TraktPlaybackProgressItem a;
    public final String b;

    public r92(TraktPlaybackProgressItem traktPlaybackProgressItem, String str) {
        this.a = traktPlaybackProgressItem;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r92)) {
            return false;
        }
        r92 r92Var = (r92) obj;
        return Intrinsics.areEqual(this.a, r92Var.a) && Intrinsics.areEqual(this.b, r92Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TraktPlaybackMatch(item=" + this.a + ", source=" + this.b + ")";
    }
}
