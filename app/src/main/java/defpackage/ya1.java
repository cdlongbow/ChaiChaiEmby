package defpackage;

import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ya1 {
    public final ServerConfig a;
    public final OtherServerResourceMatch b;

    public ya1(ServerConfig serverConfig, OtherServerResourceMatch otherServerResourceMatch) {
        serverConfig.getClass();
        otherServerResourceMatch.getClass();
        this.a = serverConfig;
        this.b = otherServerResourceMatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya1)) {
            return false;
        }
        ya1 ya1Var = (ya1) obj;
        return Intrinsics.areEqual(this.a, ya1Var.a) && Intrinsics.areEqual(this.b, ya1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OtherServerResourceEntry(server=" + this.a + ", match=" + this.b + ")";
    }
}
