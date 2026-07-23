package defpackage;

import android.util.Log;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tc extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc(Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = obj;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new tc((vc) this.d, this.c, continuation, 0);
            default:
                return new tc((FocusRequester) this.d, this.c, continuation, 1);
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
        return ((tc) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objE;
        int i = this.a;
        long j = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        qc.a.setValue(Boolean.TRUE);
                        pc pcVar = pc.a;
                        this.b = 1;
                        objE = pcVar.e("0.3.0", this);
                        if (objE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objE = ((Result) obj).getValue();
                    }
                    vc vcVar = (vc) obj2;
                    if (Result.m8832isSuccessimpl(objE)) {
                        vcVar.k(j, ((kc) objE).a);
                        break;
                    }
                    qc.a.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    qc.a.setValue(Boolean.FALSE);
                    throw th;
                }
            default:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) obj2, 0, 1, null);
                    Log.d("SettingsDialog", "焦点已请求到第一个按钮 (key=" + j + ")");
                    break;
                } catch (Exception e) {
                    Log.e("SettingsDialog", "焦点请求失败", e);
                }
                return Unit.INSTANCE;
        }
    }
}
