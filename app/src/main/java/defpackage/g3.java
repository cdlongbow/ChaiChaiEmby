package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g3 {
    public final ServerConfig a;
    public final List b;
    public final boolean c;
    public final String d;

    public g3(ServerConfig serverConfig, List list, boolean z, String str) {
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
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return Intrinsics.areEqual(this.a, g3Var.a) && Intrinsics.areEqual(this.b, g3Var.b) && this.c == g3Var.c && Intrinsics.areEqual(this.d, g3Var.d);
    }

    public final int hashCode() {
        int iF = (qi0.f(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AggregateHubLibrarySection(server=" + this.a + ", libraries=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ")";
    }

    public /* synthetic */ g3(ServerConfig serverConfig, List list, boolean z, int i) {
        this(serverConfig, (i & 2) != 0 ? CollectionsKt.emptyList() : list, z, (String) null);
    }
}
