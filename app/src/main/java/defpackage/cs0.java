package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;

/* JADX INFO: loaded from: classes4.dex */
public final class cs0 {
    public static final cs0 o;
    public final FileSystem a;
    public final CoroutineContext b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public final ln e;
    public final ln f;
    public final ln g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final o12 k;
    public final uu1 l;
    public final jp1 m;
    public final pi0 n;

    static {
        y70 y70Var = y70.e;
        FileSystem fileSystem = FileSystem.SYSTEM;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        CoroutineDispatcher io3 = Dispatchers.getIO();
        ln lnVar = ln.ENABLED;
        o = new cs0(fileSystem, emptyCoroutineContext, io2, io3, lnVar, lnVar, lnVar, y70Var, y70Var, y70Var, o12.f, uu1.b, jp1.a, pi0.b);
    }

    public cs0(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, ln lnVar, ln lnVar2, ln lnVar3, Function1 function1, Function1 function2, Function1 function3, o12 o12Var, uu1 uu1Var, jp1 jp1Var, pi0 pi0Var) {
        this.a = fileSystem;
        this.b = coroutineContext;
        this.c = coroutineContext2;
        this.d = coroutineContext3;
        this.e = lnVar;
        this.f = lnVar2;
        this.g = lnVar3;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = o12Var;
        this.l = uu1Var;
        this.m = jp1Var;
        this.n = pi0Var;
    }

    public static cs0 a(cs0 cs0Var, n61 n61Var, pi0 pi0Var, int i) {
        ln lnVar = ln.ENABLED;
        FileSystem fileSystem = cs0Var.a;
        CoroutineContext coroutineContext = cs0Var.b;
        CoroutineContext coroutineContext2 = cs0Var.c;
        CoroutineContext coroutineContext3 = cs0Var.d;
        ln lnVar2 = (i & 16) != 0 ? cs0Var.e : lnVar;
        ln lnVar3 = (i & 32) != 0 ? cs0Var.f : lnVar;
        if ((i & 64) != 0) {
            lnVar = cs0Var.g;
        }
        ln lnVar4 = lnVar;
        Function1 function1 = cs0Var.h;
        Function1 function2 = (i & 256) != 0 ? cs0Var.i : n61Var;
        Function1 function3 = cs0Var.j;
        o12 o12Var = cs0Var.k;
        uu1 uu1Var = cs0Var.l;
        jp1 jp1Var = cs0Var.m;
        pi0 pi0Var2 = (i & 8192) != 0 ? cs0Var.n : pi0Var;
        cs0Var.getClass();
        return new cs0(fileSystem, coroutineContext, coroutineContext2, coroutineContext3, lnVar2, lnVar3, lnVar4, function1, function2, function3, o12Var, uu1Var, jp1Var, pi0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs0)) {
            return false;
        }
        cs0 cs0Var = (cs0) obj;
        return Intrinsics.areEqual(this.a, cs0Var.a) && Intrinsics.areEqual(this.b, cs0Var.b) && Intrinsics.areEqual(this.c, cs0Var.c) && Intrinsics.areEqual(this.d, cs0Var.d) && this.e == cs0Var.e && this.f == cs0Var.f && this.g == cs0Var.g && Intrinsics.areEqual(this.h, cs0Var.h) && Intrinsics.areEqual(this.i, cs0Var.i) && Intrinsics.areEqual(this.j, cs0Var.j) && Intrinsics.areEqual(this.k, cs0Var.k) && this.l == cs0Var.l && this.m == cs0Var.m && Intrinsics.areEqual(this.n, cs0Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + wn.d(wn.d(wn.d((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
