package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fy extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fy(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new fy(this.c, this.d, this.e, this.g, this.h, continuation, 0);
            case 1:
                return new fy(this.c, this.d, this.e, this.g, this.h, continuation, 1);
            default:
                return new fy(this.c, this.d, this.e, this.g, this.h, continuation, 2);
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
        return ((fy) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.h;
        MutableState mutableState2 = this.g;
        MutableState mutableState3 = this.e;
        MutableState mutableState4 = this.c;
        MutableState mutableState5 = this.d;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) mutableState4.getValue();
                    ey eyVar = new ey(0, mutableState5, mutableState3);
                    y1 y1Var = new y1(mutableState2, mutableState5, mutableState, 2);
                    ai aiVar = new ai(4, mutableState, mutableState5);
                    this.b = 1;
                    if (qy.q(str, eyVar, y1Var, aiVar, this) == coroutine_suspended) {
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
                    String str2 = (String) mutableState4.getValue();
                    ey eyVar2 = new ey(1, mutableState5, mutableState3);
                    y1 y1Var2 = new y1(mutableState2, mutableState5, mutableState, 3);
                    ai aiVar2 = new ai(5, mutableState, mutableState5);
                    this.b = 1;
                    if (qy.q(str2, eyVar2, y1Var2, aiVar2, this) == coroutine_suspended2) {
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
            default:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) mutableState4.getValue()).booleanValue() && !((Boolean) mutableState5.getValue()).booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    mutableState5.setValue(bool);
                    gy1.f(mutableState3, true);
                    mutableState2.setValue(bool);
                    gy1.e(mutableState, true);
                }
                return Unit.INSTANCE;
        }
    }
}
