package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vj1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sh1 c;
    public final /* synthetic */ og1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj1(sh1 sh1Var, og1 og1Var, Continuation continuation, int i) {
        super(1, continuation);
        this.a = i;
        this.c = sh1Var;
        this.d = og1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.a;
        og1 og1Var = this.d;
        sh1 sh1Var = this.c;
        switch (i) {
            case 0:
                return new vj1(sh1Var, og1Var, continuation, 0);
            case 1:
                return new vj1(sh1Var, og1Var, continuation, 1);
            case 2:
                return new vj1(sh1Var, og1Var, continuation, 2);
            default:
                return new vj1(sh1Var, og1Var, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((vj1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        og1 og1Var = this.d;
        sh1 sh1Var = this.c;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (dn1.j0(sh1Var, og1Var, null, this, 204) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (dn1.j0(sh1Var, og1Var, null, this, 248) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (dn1.j0(sh1Var, og1Var, null, this, 252) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (dn1.j0(sh1Var, og1Var, null, this, 252) == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
