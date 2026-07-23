package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ww0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ww0(MutableState mutableState, List list, List list2, boolean z, int i) {
        this.a = i;
        this.b = mutableState;
        this.c = list;
        this.d = list2;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$8(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
            default:
                return LazyListMeasureKt.measureLazyList_pIk1_oM$lambda$8(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
        }
    }
}
