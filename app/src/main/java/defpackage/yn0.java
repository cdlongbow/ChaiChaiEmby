package defpackage;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yn0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zq0 b;

    public /* synthetic */ yn0(zq0 zq0Var, int i) {
        this.a = i;
        this.b = zq0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object objA;
        int i = this.a;
        zq0 zq0Var = this.b;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                return new o2(zq0Var, 7);
            case 1:
                String str = (String) obj;
                str.getClass();
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var), null, null, new ac(zq0Var, str, (Continuation) null, 6), 3, null);
                return Unit.INSTANCE;
            default:
                List list = (List) obj;
                list.getClass();
                Set set = CollectionsKt.toSet(list);
                MutableStateFlow mutableStateFlow = zq0Var.c;
                do {
                    value = mutableStateFlow.getValue();
                    objA = (hq0) value;
                    if (objA instanceof gq0) {
                        gq0 gq0Var = (gq0) objA;
                        objA = gq0.a(gq0Var, zq0.d(list, set, gq0Var.a, new iq0(0)), null, zq0.d(list, set, gq0Var.c, new iq0(1)), 2);
                    }
                } while (!mutableStateFlow.compareAndSet(value, objA));
                return Unit.INSTANCE;
        }
    }
}
