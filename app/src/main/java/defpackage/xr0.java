package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class xr0 {
    public final Context a;
    public cs0 b = cs0.o;
    public Lazy c = null;
    public Lazy d = null;
    public ds e = null;
    public final oi0 f = new oi0();

    public xr0(Context context) {
        this.a = context.getApplicationContext();
    }

    public final ks1 a() {
        cs0 cs0Var = this.b;
        oi0 oi0Var = this.f;
        oi0Var.getClass();
        cs0 cs0VarA = cs0.a(cs0Var, null, new pi0(ku.Q(oi0Var.a)), 8191);
        Lazy lazy = LazyKt.lazy(new bo0(13));
        Lazy lazy2 = this.c;
        if (lazy2 == null) {
            lazy2 = LazyKt.lazy(new c0(this, 22));
        }
        Lazy lazy3 = lazy2;
        Lazy lazy4 = this.d;
        if (lazy4 == null) {
            lazy4 = LazyKt.lazy(new bo0(14));
        }
        Lazy lazy5 = lazy4;
        ds dsVar = this.e;
        return new ks1(new hs1(this.a, cs0VarA, lazy, lazy3, lazy5, dsVar == null ? new ds(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList()) : dsVar));
    }
}
