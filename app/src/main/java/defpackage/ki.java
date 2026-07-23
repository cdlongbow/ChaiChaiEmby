package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ki implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ State l;
    public final /* synthetic */ State m;
    public final /* synthetic */ State n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ki(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, SnapshotStateList snapshotStateList, Function1 function1) {
        this.h = snapshotStateList;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.i = mutableState5;
        this.j = mutableState6;
        this.k = mutableState7;
        this.l = mutableState8;
        this.m = mutableState9;
        this.n = mutableState10;
        this.o = mutableState11;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.o;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj6;
                List list = (List) obj;
                pi.n(snapshotStateList, this.c, this.d, this.e, this.g, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) this.l, (MutableState) this.m, (MutableState) this.n, list);
                ((MutableState) obj2).setValue("已通过手机扫码导入 " + list.size() + " 条备用线路");
                this.b.invoke(snapshotStateList.toList());
                break;
            default:
                State state = (State) obj6;
                hy1 hy1Var = (hy1) obj3;
                LazyGridScope lazyGridScope = (LazyGridScope) obj;
                lazyGridScope.getClass();
                List list2 = (List) state.getValue();
                lazyGridScope.items(list2.size(), new w5(27, new qu1(11), list2), null, new x5(list2, 27), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new ey1(list2, (FocusRequester) obj5, this.b, (Function1) obj4, hy1Var, this.l, this.m, this.n, this.c, this.d, this.e, state, this.g)));
                lazyGridScope.item(null, null, null, ComposableLambdaKt.composableLambdaInstance(811431420, true, new vx1(0, (Function0) obj2)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ki(State state, FocusRequester focusRequester, Function1 function1, Function1 function2, hy1 hy1Var, State state2, State state3, State state4, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Function0 function0) {
        this.h = state;
        this.i = focusRequester;
        this.b = function1;
        this.j = function2;
        this.k = hy1Var;
        this.l = state2;
        this.m = state3;
        this.n = state4;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.o = function0;
    }
}
