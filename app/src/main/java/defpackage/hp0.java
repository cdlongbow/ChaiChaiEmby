package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class hp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ State d;
    public final /* synthetic */ State e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(boolean z, MutableState mutableState, MutableState mutableState2, State state, State state2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = state;
        this.e = state2;
        this.g = mutableState3;
        this.h = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new hp0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hp0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (!this.a || ((rn0) this.b.getValue()) != rn0.a) {
            return Unit.INSTANCE;
        }
        MutableState mutableState = this.c;
        if (!((Boolean) mutableState.getValue()).booleanValue() && ((String) this.d.getValue()) == null && !((Boolean) this.e.getValue()).booleanValue()) {
            mutableState.setValue(Boolean.TRUE);
            bq0.o(this.g, true);
            MutableState mutableState2 = this.h;
            mr.A((Number) mutableState2.getValue(), 1, mutableState2);
        }
        return Unit.INSTANCE;
    }
}
