package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e82 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimePickerState b;
    public final /* synthetic */ TimePickerColors c;
    public final /* synthetic */ int d;

    public /* synthetic */ e82(TimePickerState timePickerState, TimePickerColors timePickerColors, int i, int i2) {
        this.a = i2;
        this.b = timePickerState;
        this.c = timePickerColors;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return TimePickerKt.VerticalClockDisplay$lambda$34(this.b, this.c, this.d, composer, iIntValue);
            case 1:
                return TimePickerKt.HorizontalClockDisplay$lambda$31(this.b, this.c, this.d, composer, iIntValue);
            default:
                return TimePickerKt.ClockDisplayNumbers$lambda$35(this.b, this.c, this.d, composer, iIntValue);
        }
    }
}
