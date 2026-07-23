package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ag1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh1 b;
    public final /* synthetic */ MutableState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag1(int i, wh1 wh1Var, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.a = i;
        this.b = wh1Var;
        this.c = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ag1(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ag1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a <= 0) {
            return Unit.INSTANCE;
        }
        float f = jg1.k;
        this.c.setValue(Boolean.TRUE);
        this.b.invoke();
        return Unit.INSTANCE;
    }
}
