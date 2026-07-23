package defpackage;

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
public final class ix extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix(List list, List list2, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.a = i2;
        this.d = list;
        this.e = list2;
        this.g = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ix ixVar = new ix(this.d, this.e, this.g, continuation, 0);
                ixVar.c = obj;
                return ixVar;
            default:
                ix ixVar2 = new ix(this.d, this.e, this.g, continuation, 1);
                ixVar2.c = obj;
                return ixVar2;
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
        return ((ix) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.g;
        List list = this.e;
        List list2 = this.d;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list2.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    this.c = coroutineScope;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m8825constructorimpl(Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(i2), 0, 1, null)));
                    break;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list2.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    this.c = coroutineScope2;
                    this.b = 1;
                    if (DelayKt.delay(120L, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m8825constructorimpl(Boxing.boxBoolean(FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(i2), 0, 1, null)));
                    break;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m8825constructorimpl(ResultKt.createFailure(th2));
                }
                return Unit.INSTANCE;
        }
    }
}
