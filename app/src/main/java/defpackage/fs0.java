package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* JADX INFO: loaded from: classes4.dex */
public final class fs0 {
    public final Context a;
    public final Object b;
    public final d62 c;
    public final es0 d;
    public final Map e;
    public final FileSystem f;
    public final CoroutineContext g;
    public final CoroutineContext h;
    public final CoroutineContext i;
    public final ln j;
    public final ln k;
    public final ln l;
    public final Function1 m;
    public final Function1 n;
    public final Function1 o;
    public final o12 p;
    public final uu1 q;
    public final jp1 r;
    public final pi0 s;
    public final ds0 t;
    public final cs0 u;

    public fs0(Context context, Object obj, d62 d62Var, es0 es0Var, Map map, FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, ln lnVar, ln lnVar2, ln lnVar3, Function1 function1, Function1 function2, Function1 function3, o12 o12Var, uu1 uu1Var, jp1 jp1Var, pi0 pi0Var, ds0 ds0Var, cs0 cs0Var) {
        this.a = context;
        this.b = obj;
        this.c = d62Var;
        this.d = es0Var;
        this.e = map;
        this.f = fileSystem;
        this.g = coroutineContext;
        this.h = coroutineContext2;
        this.i = coroutineContext3;
        this.j = lnVar;
        this.k = lnVar2;
        this.l = lnVar3;
        this.m = function1;
        this.n = function2;
        this.o = function3;
        this.p = o12Var;
        this.q = uu1Var;
        this.r = jp1Var;
        this.s = pi0Var;
        this.t = ds0Var;
        this.u = cs0Var;
    }

    public static bs0 a(fs0 fs0Var) {
        Context context = fs0Var.a;
        fs0Var.getClass();
        return new bs0(fs0Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs0)) {
            return false;
        }
        fs0 fs0Var = (fs0) obj;
        return Intrinsics.areEqual(this.a, fs0Var.a) && Intrinsics.areEqual(this.b, fs0Var.b) && Intrinsics.areEqual(this.c, fs0Var.c) && Intrinsics.areEqual(this.d, fs0Var.d) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.e, fs0Var.e) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f, fs0Var.f) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.g, fs0Var.g) && Intrinsics.areEqual(this.h, fs0Var.h) && Intrinsics.areEqual(this.i, fs0Var.i) && this.j == fs0Var.j && this.k == fs0Var.k && this.l == fs0Var.l && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.m, fs0Var.m) && Intrinsics.areEqual(this.n, fs0Var.n) && Intrinsics.areEqual(this.o, fs0Var.o) && Intrinsics.areEqual(this.p, fs0Var.p) && this.q == fs0Var.q && this.r == fs0Var.r && Intrinsics.areEqual(this.s, fs0Var.s) && Intrinsics.areEqual(this.t, fs0Var.t) && Intrinsics.areEqual(this.u, fs0Var.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        d62 d62Var = this.c;
        int iHashCode2 = (iHashCode + (d62Var == null ? 0 : d62Var.hashCode())) * 31;
        es0 es0Var = this.d;
        return this.u.hashCode() + ((this.t.hashCode() + ((this.s.a.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + wn.d(wn.d(wn.d((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (es0Var != null ? es0Var.hashCode() : 0)) * 961)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31, this.m), 31, this.n), 31, this.o)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.m + ", errorFactory=" + this.n + ", fallbackFactory=" + this.o + ", sizeResolver=" + this.p + ", scale=" + this.q + ", precision=" + this.r + ", extras=" + this.s + ", defined=" + this.t + ", defaults=" + this.u + ")";
    }
}
