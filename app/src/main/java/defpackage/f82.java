package defpackage;

import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f82 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalogTimePickerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ TimePickerColors d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ f82(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.b = analogTimePickerState;
        this.c = modifier;
        this.d = timePickerColors;
        this.e = z;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TimePickerKt.VerticalTimePicker$lambda$11(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TimePickerKt.HorizontalTimePicker$lambda$15(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }
}
