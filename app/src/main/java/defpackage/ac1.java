package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ac1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List e;
    public final /* synthetic */ MutableState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac1(List list, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.e = list;
        this.g = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        MutableState mutableState = this.g;
        List list = this.e;
        switch (i) {
            case 0:
                ac1 ac1Var = new ac1(list, mutableState, continuation, 0);
                ac1Var.d = obj;
                return ac1Var;
            default:
                ac1 ac1Var2 = new ac1(list, mutableState, continuation, 1);
                ac1Var2.d = obj;
                return ac1Var2;
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
        return ((ac1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3 = this.a;
        MutableState mutableState = this.g;
        List list = this.e;
        switch (i3) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.c;
                try {
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Integer num = (Integer) mutableState.getValue();
                        if (num == null) {
                            return Unit.INSTANCE;
                        }
                        int iIntValue = num.intValue();
                        if (iIntValue >= 0 && iIntValue < list.size()) {
                            this.d = coroutineScope;
                            this.b = iIntValue;
                            this.c = 1;
                            if (DelayKt.delay(80L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = iIntValue;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.b;
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Result.m8825constructorimpl(Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(i), 0, 1, null)));
                    break;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                mutableState.setValue(null);
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.d;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.c;
                try {
                    if (i5 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Integer num2 = (Integer) mutableState.getValue();
                        if (num2 == null) {
                            return Unit.INSTANCE;
                        }
                        int iIntValue2 = num2.intValue();
                        if (iIntValue2 >= 0 && iIntValue2 < list.size()) {
                            this.d = coroutineScope2;
                            this.b = iIntValue2;
                            this.c = 1;
                            if (DelayKt.delay(80L, this) == coroutine_suspended2) {
                                return coroutine_suspended2;
                            }
                            i2 = iIntValue2;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.b;
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m8825constructorimpl(Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(i2), 0, 1, null)));
                    break;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m8825constructorimpl(ResultKt.createFailure(th2));
                }
                mutableState.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
