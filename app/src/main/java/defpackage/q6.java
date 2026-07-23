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
public final class q6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ State c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6(boolean z, State state, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = z;
        this.c = state;
        this.d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new q6(this.b, this.c, this.d, continuation, 0);
            default:
                return new q6(this.b, this.c, this.d, continuation, 1);
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
        return ((q6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        State state = this.c;
        boolean z = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (!z) {
                    float f = f7.a;
                    if (((String) state.getValue()) != null) {
                        mutableState.setValue(Boolean.TRUE);
                    }
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (!z && ((String) state.getValue()) != null) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
