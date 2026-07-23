package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ps1 implements o12 {
    @Override // defpackage.o12
    public final Object a(Continuation continuation) {
        return n12.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps1)) {
            return false;
        }
        n12 n12Var = n12.c;
        return Intrinsics.areEqual(n12Var, n12Var);
    }

    public final int hashCode() {
        return n12.c.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + n12.c + ")";
    }
}
