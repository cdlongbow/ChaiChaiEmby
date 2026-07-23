package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7 b;
    public final /* synthetic */ AggregateSearchHistoryPreferences c;
    public final /* synthetic */ UserPreferences d;
    public final /* synthetic */ List e;
    public final /* synthetic */ State g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ State j;

    public /* synthetic */ w4(p7 p7Var, AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, List list, State state, MutableState mutableState, MutableState mutableState2, State state2, int i) {
        this.a = i;
        this.b = p7Var;
        this.c = aggregateSearchHistoryPreferences;
        this.d = userPreferences;
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
                p7 p7Var = this.b;
                p7Var.j(str);
                p7Var.i.setValue(i3.a);
                f7.G(this.c, this.d, p7Var, this.e, this.h, this.i, this.j, str);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                p7 p7Var2 = this.b;
                p7Var2.j(str2);
                p7Var2.i.setValue(i3.a);
                f7.G(this.c, this.d, p7Var2, this.e, this.h, this.i, this.j, str2);
                break;
            default:
                String str3 = (String) obj;
                i3 i3Var = i3.a;
                p7 p7Var3 = this.b;
                p7Var3.i.setValue(i3Var);
                f7.G(this.c, this.d, p7Var3, this.e, this.h, this.i, this.j, str3);
                break;
        }
        return Unit.INSTANCE;
    }
}
