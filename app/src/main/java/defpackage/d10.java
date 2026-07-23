package defpackage;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt;
import androidx.compose.material3.DatePickerKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ d10(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iSwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16;
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                iSwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16(i2, ((Integer) obj).intValue());
                break;
            case 1:
                iSwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16 = DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$17(i2, ((Integer) obj).intValue());
                break;
            default:
                iSwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16 = LazyStaggeredGridMeasureResultKt.findVisibleItem$lambda$0(i2, (LazyStaggeredGridItemInfo) obj);
                break;
        }
        return Integer.valueOf(iSwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$16);
    }
}
