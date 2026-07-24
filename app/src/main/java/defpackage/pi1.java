package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class pi1 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ih1 d;
    public final /* synthetic */ ih1 e;
    public final /* synthetic */ ih1 g;
    public final /* synthetic */ ih1 h;
    public final /* synthetic */ FocusRequester i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi1(Context context, ih1 ih1Var, ih1 ih1Var2, ih1 ih1Var3, ih1 ih1Var4, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.c = context;
        this.d = ih1Var;
        this.e = ih1Var2;
        this.g = ih1Var3;
        this.h = ih1Var4;
        this.i = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        pi1 pi1Var = new pi1(this.c, this.d, this.e, this.g, this.h, this.i, continuation);
        pi1Var.b = obj;
        return pi1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pi1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FocusRequester focusRequester;
        Window window;
        View decorView;
        MutableState mutableState = this.e.d;
        CoroutineScope coroutineScope = (CoroutineScope) this.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!dn1.z0(this.d)) {
                    MutableState mutableState2 = this.g.b;
                    Boolean bool = Boolean.FALSE;
                    mutableState2.setValue(bool);
                    this.h.c.setValue(bool);
                    mutableState.setValue(null);
                    uc1 uc1Var = new uc1(6);
                    this.b = coroutineScope;
                    this.a = 1;
                    if (MonotonicFrameClockKt.withFrameNanos(uc1Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (((nv) mutableState.getValue()) == null) {
                    mutableState.setValue(nv.a);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            
            Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
        } catch (Throwable th) {
            
            ResultKt.createFailure(th);
        }
        focusRequester = this.i;
        Context context = this.c;
        Activity activityI = in1.i(context);
        if (activityI != null && (window = activityI.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
            boolean zIsVisible = rootWindowInsets != null ? rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime()) : false;
            Log.d("PlayerScreen", "【保底检查】菜单隐藏，检查键盘状态: imeVisible=" + zIsVisible);
            if (zIsVisible) {
                Log.d("PlayerScreen", "【保底检查】检测到键盘开启，强制关闭");
                Object systemService = context.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    Boxing.boxBoolean(inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
