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
public final class rp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp0(int i, MutableState mutableState, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new rp0(0, this.d, continuation, this.b, this.c);
            default:
                return new rp0(1, this.d, continuation, this.b, this.c);
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
        return ((rp0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (z2 && z) {
                    mutableState.setValue(Boolean.FALSE);
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (z2 && z) {
                    mutableState.setValue(Boolean.FALSE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
