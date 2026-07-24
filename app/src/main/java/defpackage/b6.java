package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class b6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6(boolean z, Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = z;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                b6 b6Var = new b6(this.c, (MutableState) obj4, (State) obj3, (FocusRequester) obj2, continuation, 0);
                b6Var.d = obj;
                return b6Var;
            default:
                return new b6(this.c, (SystemTimeDisplayMode) obj4, (Context) obj3, (Function1) obj2, continuation, 1);
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
        return ((b6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DateFormat timeFormat;
        long jCoerceIn;
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        boolean z = this.c;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) this.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z) {
                        float f = f7.a;
                        if (((Boolean) mutableState.getValue()).booleanValue() && ((String) ((State) obj2).getValue()) != null) {
                            this.d = coroutineScope;
                            this.b = 1;
                            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                FocusRequester focusRequester = (FocusRequester) obj4;
                try {
                    
                    Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
                    break;
                } catch (Throwable th) {
                    
                    ResultKt.createFailure(th);
                }
                float f2 = f7.a;
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                Function1 function1 = (Function1) obj4;
                SystemTimeDisplayMode systemTimeDisplayMode = (SystemTimeDisplayMode) obj3;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if ((z && systemTimeDisplayMode.getShowsInMenu()) || systemTimeDisplayMode.getIsPinned()) {
                        timeFormat = android.text.format.DateFormat.getTimeFormat((Context) obj2);
                    } else {
                        function1.invoke("");
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                timeFormat = (DateFormat) this.d;
                ResultKt.throwOnFailure(obj);
                do {
                    if ((!z || !systemTimeDisplayMode.getShowsInMenu()) && !systemTimeDisplayMode.getIsPinned()) {
                        return Unit.INSTANCE;
                    }
                    String str = timeFormat.format(new Date());
                    str.getClass();
                    function1.invoke(str);
                    jCoerceIn = RangesKt.coerceIn(1000 - (System.currentTimeMillis() % 1000), 200L, 1000L);
                    this.d = timeFormat;
                    this.b = 1;
                } while (DelayKt.delay(jCoerceIn, this) != coroutine_suspended2);
                return coroutine_suspended2;
        }
    }
}
