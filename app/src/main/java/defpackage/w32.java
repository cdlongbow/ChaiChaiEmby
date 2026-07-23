package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class w32 implements Flow {
    public final /* synthetic */ int a;
    public final /* synthetic */ Flow b;
    public final /* synthetic */ y32 c;

    public /* synthetic */ w32(Flow flow, y32 y32Var, int i) {
        this.a = i;
        this.b = flow;
        this.c = y32Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.a;
        y32 y32Var = this.c;
        Flow flow = this.b;
        switch (i) {
            case 0:
                Object objCollect = flow.collect(new v32(flowCollector, y32Var, 0), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            default:
                Object objCollect2 = flow.collect(new v32(flowCollector, y32Var, 1), continuation);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
        }
    }
}
