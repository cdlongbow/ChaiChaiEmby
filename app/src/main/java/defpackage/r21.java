package defpackage;

import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r21 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserPreferences b;
    public final /* synthetic */ NavHostController c;

    public /* synthetic */ r21(UserPreferences userPreferences, NavHostController navHostController, int i) {
        this.a = i;
        this.b = userPreferences;
        this.c = navHostController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.saveLastUsedAggregateHub(true);
                this.c.navigate("aggregate_search", (Function1<? super NavOptionsBuilder, Unit>) new y21(0));
                break;
            default:
                this.b.saveLastUsedAggregateHub(true);
                this.c.navigate("aggregate_search", (Function1<? super NavOptionsBuilder, Unit>) new y21(0));
                break;
        }
        return Unit.INSTANCE;
    }
}
