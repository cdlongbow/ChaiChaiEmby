package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class vp0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(boolean z, boolean z2, int i, String str, FocusRequester focusRequester, Function0 function0, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = str;
        this.g = focusRequester;
        this.h = function0;
        this.i = mutableState;
        this.j = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vp0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vp0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        MutableState mutableState = this.j;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.b && this.c) {
                    MutableState mutableState2 = this.i;
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        if (this.d >= 0 && Intrinsics.areEqual(this.e, "我的媒体")) {
                            Boolean bool = Boolean.TRUE;
                            mutableState2.setValue(bool);
                            mutableState.setValue(bool);
                            this.a = 1;
                            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
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
            Function0 function0 = this.h;
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Exception e) {
            Log.e("MediaSection", "Error restoring focus in 我的媒体", e);
        }
        mutableState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
