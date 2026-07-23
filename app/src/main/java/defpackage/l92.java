package defpackage;

import com.dh.myembyapp.data.model.TraktTokenResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l92 extends m92 {
    public final TraktTokenResponse a;

    public l92(TraktTokenResponse traktTokenResponse) {
        this.a = traktTokenResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l92) && Intrinsics.areEqual(this.a, ((l92) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(token=" + this.a + ")";
    }
}
