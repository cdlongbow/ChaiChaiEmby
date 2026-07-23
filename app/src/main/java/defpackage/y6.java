package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class y6 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public y6(ScrollState scrollState, MutableState mutableState) {
        this.a = 1;
        this.b = scrollState;
        this.c = mutableState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((Function1) obj3).invoke(Boxing.boxInt(((ScrollState) obj2).getValue()));
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    ((MutableState) obj3).setValue(Integer.valueOf(((ScrollState) obj2).getValue()));
                }
                break;
            default:
                Triple triple = (Triple) obj;
                int iIntValue = ((Number) triple.component2()).intValue();
                int iIntValue2 = ((Number) triple.component3()).intValue();
                ((MutableState) obj3).setValue(Integer.valueOf(iIntValue));
                ((MutableState) obj2).setValue(Integer.valueOf(iIntValue2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y6(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
