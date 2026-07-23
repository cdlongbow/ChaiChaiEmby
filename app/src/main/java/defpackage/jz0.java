package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class jz0 implements Flow {
    public final /* synthetic */ Flow a;
    public final /* synthetic */ lz0 b;
    public final /* synthetic */ String c;

    public jz0(Flow flow, lz0 lz0Var, String str) {
        this.a = flow;
        this.b = lz0Var;
        this.c = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.a.collect(new iz0(flowCollector, this.b, this.c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
