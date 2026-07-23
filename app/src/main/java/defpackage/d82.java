package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d82 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimePickerState b;

    public /* synthetic */ d82(int i, TimePickerState timePickerState) {
        this.a = i;
        this.b = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TimePickerState timePickerState = this.b;
        switch (i) {
            case 0:
                return TimePickerKt.TimeInputImpl$lambda$17$lambda$16(timePickerState);
            case 1:
                return TimePickerKt.PeriodToggleImpl$lambda$46$lambda$43$lambda$42(timePickerState);
            case 2:
                return TimePickerKt.TimeInputImpl$lambda$21$lambda$20(timePickerState);
            default:
                return TimePickerKt.PeriodToggleImpl$lambda$46$lambda$45$lambda$44(timePickerState);
        }
    }
}
