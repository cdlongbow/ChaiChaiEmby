package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class ns1 {
    public final fs0 a;
    public final List b;
    public final int c;
    public final fs0 d;
    public final n12 e;
    public final yg0 f;
    public final boolean g;

    public ns1(fs0 fs0Var, List list, int i, fs0 fs0Var2, n12 n12Var, yg0 yg0Var, boolean z) {
        this.a = fs0Var;
        this.b = list;
        this.c = i;
        this.d = fs0Var2;
        this.e = n12Var;
        this.f = yg0Var;
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        ms1 ms1Var;
        gg0 gg0Var;
        ju0 ju0Var;
        if (continuationImpl instanceof ms1) {
            ms1Var = (ms1) continuationImpl;
            int i = ms1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ms1Var.d = i - Integer.MIN_VALUE;
            } else {
                ms1Var = new ms1(this, continuationImpl);
            }
        } else {
            ms1Var = new ms1(this, continuationImpl);
        }
        Object objD = ms1Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ms1Var.d;
        fs0 fs0Var = this.a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objD);
            List list = this.b;
            int i3 = this.c;
            ju0 ju0Var2 = (ju0) list.get(i3);
            yg0 yg0Var = this.f;
            boolean z = this.g;
            ns1 ns1Var = new ns1(fs0Var, this.b, i3 + 1, this.d, this.e, yg0Var, z);
            ms1Var.a = ju0Var2;
            ms1Var.d = 1;
            gg0Var = (gg0) ju0Var2;
            objD = gg0Var.d(ns1Var, ms1Var);
            if (objD == coroutine_suspended) {
                ju0Var = gg0Var;
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ju0 ju0Var3 = ms1Var.a;
            ResultKt.throwOnFailure(objD);
            ju0Var = ju0Var3;
        }
        ju0Var = gg0Var;
        js0 js0Var = (js0) objD;
        fs0 fs0VarA = js0Var.a();
        if (fs0VarA.a != fs0Var.a) {
            qu.g(ju0Var, "Interceptor '", "' cannot modify the request's context.");
            return null;
        }
        if (fs0VarA.b == d91.a) {
            qu.g(ju0Var, "Interceptor '", "' cannot set the request's data to null.");
            return null;
        }
        if (fs0VarA.c != fs0Var.c) {
            qu.g(ju0Var, "Interceptor '", "' cannot modify the request's target.");
            return null;
        }
        if (fs0VarA.p == fs0Var.p) {
            return js0Var;
        }
        qu.g(ju0Var, "Interceptor '", "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        return null;
    }
}
