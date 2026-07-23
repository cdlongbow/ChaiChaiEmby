package defpackage;

import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n5 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ List c;

    public /* synthetic */ n5(MutableState mutableState, List list) {
        this.b = mutableState;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                ((ff) obj).getClass();
                if (((Number) mutableState.getValue()).intValue() < CollectionsKt.getLastIndex(list)) {
                    mr.A((Number) mutableState.getValue(), 1, mutableState);
                }
                return Unit.INSTANCE;
            default:
                return PagerMeasureKt.measurePager_7L1iB3k$lambda$18(mutableState, list, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ n5(List list, MutableState mutableState) {
        this.c = list;
        this.b = mutableState;
    }
}
