package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class by0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ LazyGridState b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(LazyGridState lazyGridState, boolean z, boolean z2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.b = lazyGridState;
        this.c = z;
        this.d = z2;
        this.e = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new by0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((by0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyGridState lazyGridState = this.b;
            final boolean z = this.c;
            final boolean z2 = this.d;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: ay0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    LazyGridLayoutInfo layoutInfo = lazyGridState.getLayoutInfo();
                    int totalItemsCount = layoutInfo.getTotalItemsCount();
                    LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull((List) layoutInfo.getVisibleItemsInfo());
                    boolean z3 = false;
                    if ((lazyGridItemInfo != null ? lazyGridItemInfo.getIndex() : 0) >= totalItemsCount - 10 && z && !z2 && totalItemsCount > 0) {
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
            });
            w6 w6Var = new w6(this.e, 1);
            this.a = 1;
            if (flowSnapshotFlow.collect(w6Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
