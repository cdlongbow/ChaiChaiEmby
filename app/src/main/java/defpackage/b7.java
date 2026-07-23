package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class b7 implements Flow {
    public final /* synthetic */ int a;
    public final /* synthetic */ Flow b;

    public /* synthetic */ b7(Flow flow, int i) {
        this.a = i;
        this.b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objCollect = this.b.collect(new a7(flowCollector, 0), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            case 1:
                Object objCollect2 = this.b.collect(new a7(flowCollector, 1), continuation);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
            case 2:
                Object objCollect3 = this.b.collect(new a7(flowCollector, 2), continuation);
                return objCollect3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect3 : Unit.INSTANCE;
            case 3:
                Object objCollect4 = this.b.collect(new a7(flowCollector, 3), continuation);
                return objCollect4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect4 : Unit.INSTANCE;
            case 4:
                Object objCollect5 = this.b.collect(new a7(flowCollector, 4), continuation);
                return objCollect5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect5 : Unit.INSTANCE;
            case 5:
                Object objCollect6 = this.b.collect(new a7(flowCollector, 5), continuation);
                return objCollect6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect6 : Unit.INSTANCE;
            case 6:
                Object objCollect7 = this.b.collect(new a7(flowCollector, 6), continuation);
                return objCollect7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect7 : Unit.INSTANCE;
            case 7:
                Object objCollect8 = this.b.collect(new a7(flowCollector, 7), continuation);
                return objCollect8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect8 : Unit.INSTANCE;
            case 8:
                Object objCollect9 = this.b.collect(new a7(flowCollector, 8), continuation);
                return objCollect9 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect9 : Unit.INSTANCE;
            default:
                Object objCollect10 = this.b.collect(new a7(flowCollector, 9), continuation);
                return objCollect10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect10 : Unit.INSTANCE;
        }
    }
}
