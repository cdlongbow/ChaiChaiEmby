package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class df2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pf2 c;
    public final /* synthetic */ ye2 d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df2(pf2 pf2Var, ye2 ye2Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = pf2Var;
        this.d = ye2Var;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new df2(this.c, this.d, this.e, this.g, this.h, this.i, continuation, 0);
            default:
                return new df2(this.c, this.d, this.e, this.g, this.h, this.i, continuation, 1);
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
        return ((df2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Object objH;
        int i = this.a;
        MutableState mutableState = this.i;
        MutableState mutableState2 = this.e;
        pf2 pf2Var = this.c;
        ye2 ye2Var = this.d;
        MutableState mutableState3 = this.g;
        MutableState mutableState4 = this.h;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    objK = pf2Var.k(ye2Var, this);
                    if (objK == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objK = ((Result) obj).getValue();
                }
                if (Result.m8832isSuccessimpl(objK)) {
                    mutableState2.setValue(null);
                    mutableState3.setValue((String) objK);
                    mutableState4.setValue(ue2.a);
                }
                Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objK);
                if (thM8828exceptionOrNullimpl != null) {
                    mutableState2.setValue(null);
                    String message = thM8828exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "上传配置失败";
                    }
                    mutableState3.setValue(message);
                    mutableState4.setValue(ue2.b);
                }
                mutableState.setValue(null);
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    objH = pf2Var.h(ye2Var, this);
                    if (objH == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objH = ((Result) obj).getValue();
                }
                if (Result.m8832isSuccessimpl(objH)) {
                    mutableState2.setValue(new gd1(ye2Var, (ve2) objH));
                    mutableState3.setValue("已读取远端快照，请确认后再下载。");
                    mutableState4.setValue(ue2.c);
                }
                Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(objH);
                if (thM8828exceptionOrNullimpl2 != null) {
                    String message2 = thM8828exceptionOrNullimpl2.getMessage();
                    if (message2 == null) {
                        message2 = "读取下载预览失败";
                    }
                    mutableState3.setValue(message2);
                    mutableState4.setValue(ue2.b);
                }
                mutableState.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
