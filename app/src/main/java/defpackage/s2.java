package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s2 extends u2 {
    public final ServerConfig a;

    public s2(ServerConfig serverConfig) {
        this.a = serverConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && Intrinsics.areEqual(this.a, ((s2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(config=" + this.a + ")";
    }
}
