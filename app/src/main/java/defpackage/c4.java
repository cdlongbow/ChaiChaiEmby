package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.dlna.DlnaSettings;
import com.dh.myembyapp.dlna.a;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ State e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ State i;
    public final /* synthetic */ Object j;

    public /* synthetic */ c4(p7 p7Var, AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, List list, State state, MutableState mutableState, MutableState mutableState2, State state2) {
        this.a = 0;
        this.j = p7Var;
        this.b = aggregateSearchHistoryPreferences;
        this.c = userPreferences;
        this.d = list;
        this.e = state;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = state2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        State state = this.i;
        State state2 = this.e;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                p7 p7Var = (p7) obj4;
                p7Var.i.setValue(i3.a);
                f7.G((AggregateSearchHistoryPreferences) obj3, (UserPreferences) obj2, p7Var, (List) obj, this.g, this.h, this.i, ((h7) state2.getValue()).a);
                return Unit.INSTANCE;
            case 1:
                s8.b((AggregateSearchHistoryPreferences) obj3, (UserPreferences) obj2, (v8) obj4, (List) obj, this.g, this.h, this.i, (String) state2.getValue());
                return Unit.INSTANCE;
            case 2:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj4, null, null, new a((DlnaSettings) obj3, (Context) obj2, (Function0) obj, this.g, this.h, (MutableState) state2, (MutableState) state, null), 3, null);
                return Unit.INSTANCE;
            case 3:
                Map mapEmptyMap = MapsKt.emptyMap();
                return dn1.a0((Function0) obj4, (Function1) obj3, (Context) obj2, (eo1) obj, this.g, this.h, (MutableState) state2, (MutableState) state, mapEmptyMap);
            case 4:
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = (MutableState) obj2;
                MutableState mutableState4 = (MutableState) obj;
                MutableState mutableState5 = (MutableState) state2;
                MutableState mutableState6 = (MutableState) state;
                if (((String) this.g.getValue()) == null && ((gd1) this.h.getValue()) == null && ((hd1) mutableState.getValue()) == null) {
                    ye2 ye2VarG = ef2.g(mutableState2, mutableState3, mutableState4, mutableState5, mutableState6);
                    mutableState2.setValue(ye2VarG.a);
                    mutableState3.setValue(ye2VarG.b);
                    mutableState4.setValue(ye2VarG.c);
                    mutableState.setValue(new hd1(ye2VarG));
                }
                return Unit.INSTANCE;
            case 5:
                gd1 gd1Var = (gd1) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                pf2 pf2Var = (pf2) obj2;
                Function1 function1 = (Function1) obj;
                MutableState mutableState7 = (MutableState) state2;
                MutableState mutableState8 = (MutableState) state;
                MutableState mutableState9 = this.g;
                if (((String) mutableState9.getValue()) == null) {
                    mutableState9.setValue("下载配置");
                    MutableState mutableState10 = this.h;
                    mutableState10.setValue(null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new s6(pf2Var, gd1Var, function1, mutableState7, mutableState10, mutableState8, mutableState9, (Continuation) null), 3, null);
                }
                return Unit.INSTANCE;
            default:
                hd1 hd1Var = (hd1) obj4;
                Function1 function2 = (Function1) obj3;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                pf2 pf2Var2 = (pf2) obj;
                MutableState mutableState11 = (MutableState) state2;
                MutableState mutableState12 = (MutableState) state;
                MutableState mutableState13 = this.g;
                if (((String) mutableState13.getValue()) == null) {
                    ye2 ye2Var = hd1Var.a;
                    function2.invoke(ye2Var);
                    mutableState13.setValue("上传配置");
                    MutableState mutableState14 = this.h;
                    mutableState14.setValue(null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new df2(pf2Var2, ye2Var, mutableState11, mutableState14, mutableState12, mutableState13, null, 0), 3, null);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c4(gd1 gd1Var, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, pf2 pf2Var, Function1 function1, MutableState mutableState3, MutableState mutableState4) {
        this.a = 5;
        this.j = gd1Var;
        this.b = coroutineScope;
        this.g = mutableState;
        this.h = mutableState2;
        this.c = pf2Var;
        this.d = function1;
        this.e = mutableState3;
        this.i = mutableState4;
    }

    public /* synthetic */ c4(hd1 hd1Var, Function1 function1, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, pf2 pf2Var, MutableState mutableState3, MutableState mutableState4) {
        this.a = 6;
        this.j = hd1Var;
        this.b = function1;
        this.c = coroutineScope;
        this.g = mutableState;
        this.h = mutableState2;
        this.d = pf2Var;
        this.e = mutableState3;
        this.i = mutableState4;
    }

    public /* synthetic */ c4(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        this.a = 4;
        this.g = mutableState;
        this.h = mutableState2;
        this.j = mutableState3;
        this.b = mutableState4;
        this.c = mutableState5;
        this.d = mutableState6;
        this.e = mutableState7;
        this.i = mutableState8;
    }

    public /* synthetic */ c4(AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, v8 v8Var, List list, State state, MutableState mutableState, MutableState mutableState2, State state2) {
        this.a = 1;
        this.b = aggregateSearchHistoryPreferences;
        this.c = userPreferences;
        this.j = v8Var;
        this.d = list;
        this.e = state;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = state2;
    }

    public /* synthetic */ c4(Object obj, Object obj2, Context context, Object obj3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        this.a = i;
        this.j = obj;
        this.b = obj2;
        this.c = context;
        this.d = obj3;
        this.g = mutableState;
        this.h = mutableState2;
        this.e = mutableState3;
        this.i = mutableState4;
    }
}
