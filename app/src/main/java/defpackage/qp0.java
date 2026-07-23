package defpackage;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
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

/* JADX INFO: loaded from: classes4.dex */
public final class qp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ LazyListState b;
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(boolean z, LazyListState lazyListState, List list, boolean z2, boolean z3, Function0 function0, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = lazyListState;
        this.c = list;
        this.d = z2;
        this.e = z3;
        this.g = function0;
        this.h = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qp0(this.a, this.b, this.c, this.d, this.e, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qp0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = (this.a && ((Boolean) this.h.getValue()).booleanValue()) ? 1 : 0;
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) this.b.getLayoutInfo().getVisibleItemsInfo());
        int index = (lazyListItemInfo != null ? lazyListItemInfo.getIndex() : 0) - i;
        int size = this.c.size();
        if (this.d && !this.e && index >= size - 2 && size > 0 && (function0 = this.g) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
