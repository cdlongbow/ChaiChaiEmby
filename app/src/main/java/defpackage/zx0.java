package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class zx0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LazyGridState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx0(LazyGridState lazyGridState, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = lazyGridState;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new zx0(this.b, this.c, this.d, continuation, 0);
            default:
                return new zx0(this.b, this.c, this.d, continuation, 1);
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
        return ((zx0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        LazyGridState lazyGridState = this.b;
        MutableState mutableState2 = this.c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                mutableState2.setValue(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()));
                mutableState.setValue(Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
                break;
            default:
                ResultKt.throwOnFailure(obj);
                mutableState2.setValue(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()));
                mutableState.setValue(Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
                break;
        }
        return Unit.INSTANCE;
    }
}
