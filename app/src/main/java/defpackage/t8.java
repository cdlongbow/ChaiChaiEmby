package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t8 {
    public final ServerConfig a;
    public final List b;
    public final boolean c;
    public final String d;

    public t8(ServerConfig serverConfig, List list, boolean z, String str) {
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
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return Intrinsics.areEqual(this.a, t8Var.a) && Intrinsics.areEqual(this.b, t8Var.b) && this.c == t8Var.c && Intrinsics.areEqual(this.d, t8Var.d);
    }

    public final int hashCode() {
        int iF = (qi0.f(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AggregateSearchUiResult(server=" + this.a + ", items=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ")";
    }
}
