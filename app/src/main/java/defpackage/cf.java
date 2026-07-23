package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cf {
    public static final cf a = new cf();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof fs0) || !(obj2 instanceof fs0)) {
            return Intrinsics.areEqual(obj, obj2);
        }
        fs0 fs0Var = (fs0) obj;
        fs0 fs0Var2 = (fs0) obj2;
        return Intrinsics.areEqual(fs0Var.a, fs0Var2.a) && Intrinsics.areEqual(fs0Var.b, fs0Var2.b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(fs0Var.e, fs0Var2.e) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(fs0Var.p, fs0Var2.p) && fs0Var.q == fs0Var2.q && fs0Var.r == fs0Var2.r;
    }

    public final int b(Object obj) {
        if (!(obj instanceof fs0)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        fs0 fs0Var = (fs0) obj;
        return fs0Var.r.hashCode() + ((fs0Var.q.hashCode() + ((fs0Var.p.hashCode() + ((fs0Var.e.hashCode() + ((fs0Var.b.hashCode() + (fs0Var.a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
