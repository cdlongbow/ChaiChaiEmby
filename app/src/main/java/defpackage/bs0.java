package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import okio.FileSystem;

/* JADX INFO: loaded from: classes4.dex */
public final class bs0 {
    public final Context a;
    public cs0 b;
    public Object c;
    public d62 d;
    public es0 e;
    public boolean f;
    public Map g;
    public CoroutineContext h;
    public CoroutineContext i;
    public CoroutineContext j;
    public final Function1 k;
    public final Function1 l;
    public final Function1 m;
    public o12 n;
    public uu1 o;
    public jp1 p;
    public Object q;

    public bs0(fs0 fs0Var, Context context) {
        this.a = context;
        this.b = fs0Var.u;
        this.c = fs0Var.b;
        this.d = fs0Var.c;
        this.e = fs0Var.d;
        this.g = fs0Var.e;
        ds0 ds0Var = fs0Var.t;
        this.h = ds0Var.a;
        this.i = ds0Var.b;
        this.j = ds0Var.c;
        this.k = ds0Var.d;
        this.l = ds0Var.e;
        this.m = ds0Var.f;
        this.n = ds0Var.g;
        this.o = ds0Var.h;
        this.p = ds0Var.i;
        this.q = fs0Var.s;
    }

    public final fs0 a() {
        pi0 pi0Var;
        Object obj = this.c;
        if (obj == null) {
            obj = d91.a;
        }
        Object obj2 = obj;
        d62 d62Var = this.d;
        es0 es0Var = this.e;
        Map mapQ = this.g;
        if (Intrinsics.areEqual(mapQ, Boolean.valueOf(this.f))) {
            mapQ.getClass();
            mapQ = ku.Q(TypeIntrinsics.asMutableMap(mapQ));
        } else if (!en0.n(mapQ)) {
            throw new AssertionError();
        }
        Map map = mapQ;
        map.getClass();
        cs0 cs0Var = this.b;
        FileSystem fileSystem = cs0Var.a;
        ln lnVar = cs0Var.e;
        ln lnVar2 = cs0Var.f;
        ln lnVar3 = cs0Var.g;
        CoroutineContext coroutineContext = this.h;
        if (coroutineContext == null) {
            coroutineContext = cs0Var.b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext coroutineContext3 = this.i;
        if (coroutineContext3 == null) {
            coroutineContext3 = cs0Var.c;
        }
        CoroutineContext coroutineContext4 = coroutineContext3;
        CoroutineContext coroutineContext5 = this.j;
        if (coroutineContext5 == null) {
            coroutineContext5 = cs0Var.d;
        }
        CoroutineContext coroutineContext6 = coroutineContext5;
        Function1 function1 = this.k;
        if (function1 == null) {
            function1 = cs0Var.h;
        }
        Function1 function2 = function1;
        Function1 function3 = this.l;
        if (function3 == null) {
            function3 = cs0Var.i;
        }
        Function1 function4 = function3;
        Function1 function5 = this.m;
        if (function5 == null) {
            function5 = cs0Var.j;
        }
        Function1 function6 = function5;
        o12 o12Var = this.n;
        if (o12Var == null) {
            o12Var = cs0Var.k;
        }
        o12 o12Var2 = o12Var;
        uu1 uu1Var = this.o;
        if (uu1Var == null) {
            uu1Var = cs0Var.l;
        }
        uu1 uu1Var2 = uu1Var;
        jp1 jp1Var = this.p;
        if (jp1Var == null) {
            jp1Var = cs0Var.m;
        }
        jp1 jp1Var2 = jp1Var;
        Object obj3 = this.q;
        if (obj3 instanceof oi0) {
            pi0Var = new pi0(ku.Q(((oi0) obj3).a));
        } else {
            if (!(obj3 instanceof pi0)) {
                throw new AssertionError();
            }
            pi0Var = (pi0) obj3;
        }
        return new fs0(this.a, obj2, d62Var, es0Var, map, fileSystem, coroutineContext2, coroutineContext4, coroutineContext6, lnVar, lnVar2, lnVar3, function2, function4, function6, o12Var2, uu1Var2, jp1Var2, pi0Var, new ds0(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p), this.b);
    }

    public final oi0 b() {
        Object obj = this.q;
        if (obj instanceof oi0) {
            return (oi0) obj;
        }
        if (!(obj instanceof pi0)) {
            throw new AssertionError();
        }
        oi0 oi0Var = new oi0((pi0) obj);
        this.q = oi0Var;
        return oi0Var;
    }

    public final Map c() {
        Map mutableMap = this.g;
        if (!Intrinsics.areEqual(mutableMap, Boolean.valueOf(this.f))) {
            if (!en0.n(mutableMap)) {
                throw new AssertionError();
            }
            mutableMap = MapsKt.toMutableMap(mutableMap);
            this.g = mutableMap;
            this.f = true;
        }
        mutableMap.getClass();
        return TypeIntrinsics.asMutableMap(mutableMap);
    }

    public bs0(Context context) {
        this.a = context;
        this.b = cs0.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = MapsKt.emptyMap();
        this.h = null;
        this.i = null;
        this.j = null;
        y70 y70Var = y70.e;
        this.k = y70Var;
        this.l = y70Var;
        this.m = y70Var;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = pi0.b;
    }
}
