package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ds0 {
    public final CoroutineContext a;
    public final CoroutineContext b;
    public final CoroutineContext c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final o12 g;
    public final uu1 h;
    public final jp1 i;

    public ds0(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, Function1 function1, Function1 function2, Function1 function3, o12 o12Var, uu1 uu1Var, jp1 jp1Var) {
        this.a = coroutineContext;
        this.b = coroutineContext2;
        this.c = coroutineContext3;
        this.d = function1;
        this.e = function2;
        this.f = function3;
        this.g = o12Var;
        this.h = uu1Var;
        this.i = jp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds0)) {
            return false;
        }
        ds0 ds0Var = (ds0) obj;
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.a, ds0Var.a) && Intrinsics.areEqual(this.b, ds0Var.b) && Intrinsics.areEqual(this.c, ds0Var.c) && Intrinsics.areEqual(this.d, ds0Var.d) && Intrinsics.areEqual(this.e, ds0Var.e) && Intrinsics.areEqual(this.f, ds0Var.f) && Intrinsics.areEqual(this.g, ds0Var.g) && this.h == ds0Var.h && this.i == ds0Var.i;
    }

    public final int hashCode() {
        CoroutineContext coroutineContext = this.a;
        int iHashCode = (coroutineContext == null ? 0 : coroutineContext.hashCode()) * 31;
        CoroutineContext coroutineContext2 = this.b;
        int iHashCode2 = (iHashCode + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
        CoroutineContext coroutineContext3 = this.c;
        int iHashCode3 = (iHashCode2 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 923521;
        Function1 function1 = this.d;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function2 = this.e;
        int iHashCode5 = (iHashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function3 = this.f;
        int iHashCode6 = (iHashCode5 + (function3 == null ? 0 : function3.hashCode())) * 31;
        o12 o12Var = this.g;
        int iHashCode7 = (iHashCode6 + (o12Var == null ? 0 : o12Var.hashCode())) * 31;
        uu1 uu1Var = this.h;
        int iHashCode8 = (iHashCode7 + (uu1Var == null ? 0 : uu1Var.hashCode())) * 31;
        jp1 jp1Var = this.i;
        return iHashCode8 + (jp1Var != null ? jp1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + ")";
    }
}
