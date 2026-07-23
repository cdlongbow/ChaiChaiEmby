package defpackage;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ux extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(vg1 vg1Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = 2;
        this.d = vg1Var;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new ux(this.c, (FocusRequester) this.d, continuation, 0);
            case 1:
                return new ux(this.c, (FocusRequester) this.d, continuation, 1);
            default:
                return new ux((vg1) this.d, this.c, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ux) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (z) {
                            this.b = 1;
                            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) obj2, 0, 1, null);
                    break;
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        this.b = 1;
                        if (DelayKt.delay(300L, this) == coroutine_suspended2) {
                            return coroutine_suspended2;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) obj2, 0, 1, null);
                return Unit.INSTANCE;
            default:
                vg1 vg1Var = (vg1) obj2;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                try {
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        long j = vg1Var.a.i;
                        this.b = 1;
                        if (DelayKt.delay(j, this) == coroutine_suspended3) {
                            return coroutine_suspended3;
                        }
                    } else {
                        if (i4 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    if (vg1Var.a.a() && ((z || !((Boolean) vg1Var.l.invoke()).booleanValue()) && !((Boolean) vg1Var.k.invoke()).booleanValue())) {
                        vg1.a(vg1Var);
                        break;
                    }
                    vg1Var.a.a.setValue(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    vg1Var.a.a.setValue(null);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux(boolean z, FocusRequester focusRequester, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = z;
        this.d = focusRequester;
    }
}
