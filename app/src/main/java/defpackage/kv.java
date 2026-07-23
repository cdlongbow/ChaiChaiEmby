package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kv extends mv {
    public final xv0 a;

    public kv(xv0 xv0Var) {
        xv0Var.getClass();
        this.a = xv0Var;
    }

    @Override // defpackage.mv
    public final xv0 a(List list) {
        list.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kv) && Intrinsics.areEqual(((kv) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
