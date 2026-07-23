package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hs1 {
    public final Context a;
    public final cs0 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final ds f;

    public hs1(Context context, cs0 cs0Var, Lazy lazy, Lazy lazy2, Lazy lazy3, ds dsVar) {
        this.a = context;
        this.b = cs0Var;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = dsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs1)) {
            return false;
        }
        hs1 hs1Var = (hs1) obj;
        if (!Intrinsics.areEqual(this.a, hs1Var.a) || !Intrinsics.areEqual(this.b, hs1Var.b) || !Intrinsics.areEqual(this.c, hs1Var.c) || !Intrinsics.areEqual(this.d, hs1Var.d) || !Intrinsics.areEqual(this.e, hs1Var.e)) {
            return false;
        }
        zg0 zg0Var = zg0.b;
        return Intrinsics.areEqual(zg0Var, zg0Var) && Intrinsics.areEqual(this.f, hs1Var.f) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((zg0.b.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + zg0.b + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
