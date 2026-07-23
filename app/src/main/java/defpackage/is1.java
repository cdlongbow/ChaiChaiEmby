package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class is1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ks1 c;
    public final /* synthetic */ fs0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is1(ks1 ks1Var, fs0 fs0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = ks1Var;
        this.d = fs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        fs0 fs0Var = this.d;
        ks1 ks1Var = this.c;
        switch (i) {
            case 0:
                return new is1(ks1Var, fs0Var, continuation, 0);
            default:
                return new is1(ks1Var, fs0Var, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((is1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        fs0 fs0Var = this.d;
        ks1 ks1Var = this.c;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                int i3 = ks1.f;
                Object objB = ks1Var.b(fs0Var, 0, this);
                return objB == coroutine_suspended ? coroutine_suspended : objB;
            default:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                int i5 = ks1.f;
                Object objB2 = ks1Var.b(fs0Var, 1, this);
                return objB2 == coroutine_suspended2 ? coroutine_suspended2 : objB2;
        }
    }
}
