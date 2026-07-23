package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j3 {
    public final ServerConfig a;
    public final List b;
    public final boolean c;
    public final String d;

    public j3(ServerConfig serverConfig, List list, boolean z, String str) {
        serverConfig.getClass();
        list.getClass();
        this.a = serverConfig;
        this.b = list;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return Intrinsics.areEqual(this.a, j3Var.a) && Intrinsics.areEqual(this.b, j3Var.b) && this.c == j3Var.c && Intrinsics.areEqual(this.d, j3Var.d);
    }

    public final int hashCode() {
        int iF = (qi0.f(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AggregateHubRecentSection(server=" + this.a + ", items=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ")";
    }
}
