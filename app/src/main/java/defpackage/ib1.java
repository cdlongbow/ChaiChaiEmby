package defpackage;

import com.dh.myembyapp.data.model.EpisodeLocator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ib1 {
    public final String a;
    public final EpisodeLocator b;

    public ib1(String str, EpisodeLocator episodeLocator) {
        str.getClass();
        this.a = str;
        this.b = episodeLocator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib1)) {
            return false;
        }
        ib1 ib1Var = (ib1) obj;
        return Intrinsics.areEqual(this.a, ib1Var.a) && Intrinsics.areEqual(this.b, ib1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        EpisodeLocator episodeLocator = this.b;
        return iHashCode + (episodeLocator == null ? 0 : episodeLocator.hashCode());
    }

    public final String toString() {
        return "OtherServerResourceRequestKey(itemId=" + this.a + ", episodeLocator=" + this.b + ")";
    }
}
