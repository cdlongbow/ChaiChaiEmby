package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AggregateSearchHistoryPreferences b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ i5(AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, MutableState mutableState, int i) {
        this.a = i;
        this.b = aggregateSearchHistoryPreferences;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.c;
        AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences = this.b;
        switch (i) {
            case 0:
                aggregateSearchHistoryPreferences.clearHistory();
                mutableState.setValue(CollectionsKt.emptyList());
                break;
            default:
                aggregateSearchHistoryPreferences.clearHistory();
                mutableState.setValue(CollectionsKt.emptyList());
                break;
        }
        return Unit.INSTANCE;
    }
}
