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
public final class ip0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ State c;
    public final /* synthetic */ State d;
    public final /* synthetic */ State e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(boolean z, MutableState mutableState, State state, State state2, State state3, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = mutableState;
        this.c = state;
        this.d = state2;
        this.e = state3;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = mutableState4;
        this.j = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ip0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ip0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue = false;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a && ((rn0) this.b.getValue()) == rn0.a && ((Boolean) this.c.getValue()).booleanValue() && ((String) this.d.getValue()) != null) {
            State state = this.e;
            if (((sn0) state.getValue()) != sn0.a) {
                this.g.setValue(Boolean.TRUE);
                int iOrdinal = ((sn0) state.getValue()).ordinal();
                MutableState mutableState = this.h;
                if (iOrdinal == 0) {
                    zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                } else if (iOrdinal == 1) {
                    zBooleanValue = true;
                } else if (iOrdinal != 2) {
                    qu.f();
                    return null;
                }
                bq0.o(mutableState, zBooleanValue);
                this.i.setValue(0);
                this.j.setValue(0);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
