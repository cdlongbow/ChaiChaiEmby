package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class py1 {
    public final ServerConfig a;
    public final List b;
    public final boolean c;
    public final String d;

    public py1(ServerConfig serverConfig, List list, boolean z, String str, int i) {
        z = (i & 4) != 0 ? false : z;
        str = (i & 8) != 0 ? null : str;
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
        if (!(obj instanceof py1)) {
            return false;
        }
        py1 py1Var = (py1) obj;
        return Intrinsics.areEqual(this.a, py1Var.a) && Intrinsics.areEqual(this.b, py1Var.b) && this.c == py1Var.c && Intrinsics.areEqual(this.d, py1Var.d);
    }

    public final int hashCode() {
        int iF = (qi0.f(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ServerSearchResult(server=" + this.a + ", items=" + this.b + ", isLoading=" + this.c + ", error=" + this.d + ")";
    }
}
