package defpackage;

import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class w6 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;

    public /* synthetic */ w6(Function function, int i) {
        this.a = i;
        this.b = function;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((Function1) this.b).invoke(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ((Function0) this.b).invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
