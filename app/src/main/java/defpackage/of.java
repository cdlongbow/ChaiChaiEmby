package defpackage;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class of {
    public static final of a = new of();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ks1 ks1Var, fs0 fs0Var, ContinuationImpl continuationImpl) {
        nf nfVar;
        if (continuationImpl instanceof nf) {
            nfVar = (nf) continuationImpl;
            int i = nfVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfVar.d = i - Integer.MIN_VALUE;
            } else {
                nfVar = new nf(this, continuationImpl);
            }
        } else {
            nfVar = new nf(this, continuationImpl);
        }
        Object objC = nfVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nfVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            nfVar.a = fs0Var;
            nfVar.d = 1;
            objC = ks1Var.c(fs0Var, nfVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fs0Var = nfVar.a;
            ResultKt.throwOnFailure(objC);
        }
        js0 js0Var = (js0) objC;
        if (js0Var instanceof h52) {
            h52 h52Var = (h52) js0Var;
            return new hf(as0.a(h52Var.a, fs0Var.a, DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I()), h52Var);
        }
        if (!(js0Var instanceof xg0)) {
            qu.f();
            return null;
        }
        xg0 xg0Var = (xg0) js0Var;
        pr0 pr0Var = xg0Var.a;
        return new ff(pr0Var != null ? as0.a(pr0Var, fs0Var.a, DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I()) : null, xg0Var);
    }
}
