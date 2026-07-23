package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f3 {
    public final ServerConfig a;
    public final List b;
    public final List c;
    public final boolean d;
    public final String e;

    public f3(ServerConfig serverConfig, List list, List list2, boolean z, String str) {
        serverConfig.getClass();
        list.getClass();
        list2.getClass();
        this.a = serverConfig;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return Intrinsics.areEqual(this.a, f3Var.a) && Intrinsics.areEqual(this.b, f3Var.b) && Intrinsics.areEqual(this.c, f3Var.c) && this.d == f3Var.d && Intrinsics.areEqual(this.e, f3Var.e);
    }

    public final int hashCode() {
        int iF = (qi0.f(this.c, qi0.f(this.b, this.a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237)) * 31;
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregateHubFavoriteSection(server=");
        sb.append(this.a);
        sb.append(", seriesItems=");
        sb.append(this.b);
        sb.append(", movieItems=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", error=");
        return s01.w(sb, this.e, ")");
    }
}
