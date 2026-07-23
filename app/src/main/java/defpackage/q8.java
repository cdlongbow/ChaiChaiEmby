package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;
    public final /* synthetic */ AggregateSearchHistoryPreferences c;
    public final /* synthetic */ UserPreferences d;
    public final /* synthetic */ List e;
    public final /* synthetic */ State g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ State j;

    public /* synthetic */ q8(AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, v8 v8Var, List list, State state, MutableState mutableState, MutableState mutableState2, State state2) {
        this.a = 2;
        this.c = aggregateSearchHistoryPreferences;
        this.d = userPreferences;
        this.b = v8Var;
        this.e = list;
        this.g = state;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                v8 v8Var = this.b;
                v8Var.c(str);
                s8.b(this.c, this.d, v8Var, this.e, this.h, this.i, this.j, str);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                v8 v8Var2 = this.b;
                v8Var2.c(str2);
                s8.b(this.c, this.d, v8Var2, this.e, this.h, this.i, this.j, str2);
                break;
            default:
                s8.b(this.c, this.d, this.b, this.e, this.h, this.i, this.j, (String) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q8(v8 v8Var, AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, List list, State state, MutableState mutableState, MutableState mutableState2, State state2, int i) {
        this.a = i;
        this.b = v8Var;
        this.c = aggregateSearchHistoryPreferences;
        this.d = userPreferences;
        this.e = list;
        this.g = state;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = state2;
    }
}
