package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
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
public final class mj0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yj0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xj0 e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj0(boolean z, yj0 yj0Var, boolean z2, xj0 xj0Var, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = yj0Var;
        this.d = z2;
        this.e = xj0Var;
        this.g = focusRequester;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
        this.k = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new mj0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mj0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        MutableState mutableState = this.k;
        MutableState mutableState2 = this.j;
        MutableState mutableState3 = this.h;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.b) {
                    return Unit.INSTANCE;
                }
                if (this.c != null) {
                    return Unit.INSTANCE;
                }
                if (((Boolean) mutableState3.getValue()).booleanValue() && !((Boolean) this.i.getValue()).booleanValue() && ((String) mutableState2.getValue()) != null) {
                    if (!this.d) {
                        xj0 xj0Var = this.e;
                        if (xj0Var != null) {
                            mutableState2.setValue(xj0Var.b);
                            mutableState.setValue(xj0Var.a);
                            mutableState3.setValue(Boolean.TRUE);
                            return Unit.INSTANCE;
                        }
                        mutableState2.setValue(null);
                        mutableState.setValue(null);
                        mutableState3.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    this.a = 1;
                    if (DelayKt.delay(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            FocusRequester.m4818requestFocus3ESFkO8$default(this.g, 0, 1, null);
        } catch (Exception e) {
            Log.e("FavoritePage", "焦点恢复失败", e);
        }
        vj0.c(mutableState3, false);
        return Unit.INSTANCE;
    }
}
