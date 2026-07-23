package defpackage;

import com.dh.myembyapp.data.model.TraktSyncHistoryRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o92 {
    public final TraktSyncHistoryRequest a;
    public final int b;

    public o92(TraktSyncHistoryRequest traktSyncHistoryRequest, int i) {
        this.a = traktSyncHistoryRequest;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o92)) {
            return false;
        }
        o92 o92Var = (o92) obj;
        return Intrinsics.areEqual(this.a, o92Var.a) && this.b == o92Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "TraktHistoryRequestBuildResult(request=" + this.a + ", itemCount=" + this.b + ")";
    }
}
