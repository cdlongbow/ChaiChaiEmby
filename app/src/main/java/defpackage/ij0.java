package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class ij0 implements Flow {
    public final /* synthetic */ int a;
    public final /* synthetic */ Flow b;
    public final /* synthetic */ Set c;

    public /* synthetic */ ij0(Flow flow, Set set, int i) {
        this.a = i;
        this.b = flow;
        this.c = set;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objCollect = this.b.collect(new hj0(flowCollector, this.c, 0), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            default:
                Object objCollect2 = this.b.collect(new hj0(flowCollector, this.c, 1), continuation);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
        }
    }
}
