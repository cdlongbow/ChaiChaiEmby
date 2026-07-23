package defpackage;

import android.util.Log;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionAdjustmentKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.carousel.CarouselStateKt;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vo(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        Object obj = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                return CarouselStateKt.rememberCarouselState$lambda$1$lambda$0(i2, (Function0) obj);
            case 1:
                List<LazyListItemInfo> visibleItemsInfo = ((LazyListState) obj).getLayoutInfo().getVisibleItemsInfo();
                if (visibleItemsInfo == null || !visibleItemsInfo.isEmpty()) {
                    Iterator<T> it = visibleItemsInfo.iterator();
                    while (it.hasNext()) {
                        if (((LazyListItemInfo) it.next()).getIndex() == i2) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                return LoremIpsum.generateLoremIpsum$lambda$0((Ref.IntRef) obj, i2);
            case 3:
                j51 j51Var = (j51) obj;
                Log.d("MoreMenu", "菜单项点击: index=" + i2 + ", label=" + j51Var.a);
                j51Var.b.invoke();
                return Unit.INSTANCE;
            case 4:
                wg1 wg1Var = (wg1) obj;
                if (wg1Var.b() && wg1Var.f.getIntValue() == i2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return Integer.valueOf(SelectionAdjustmentKt.updateSelectionBoundary$lambda$0((SelectableInfo) obj, i2));
            default:
                return TimePickerKt.TimeSelector_SAnMeKU$lambda$58$lambda$57(i2, (TimePickerState) obj);
        }
    }

    public /* synthetic */ vo(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
