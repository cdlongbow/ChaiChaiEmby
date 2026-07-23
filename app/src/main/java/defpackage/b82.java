package defpackage;

import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b82 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TimePickerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ TimePickerColors d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ b82(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i, int i2, int i3) {
        this.b = timePickerState;
        this.c = modifier;
        this.d = timePickerColors;
        this.e = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                TimePickerState timePickerState = this.b;
                Modifier modifier = this.c;
                TimePickerColors timePickerColors = this.d;
                return TimePickerKt.TimeSelector_SAnMeKU$lambda$59(modifier, this.e, timePickerState, this.g, timePickerColors, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TimePickerKt.TimePicker_mT9BvqQ$lambda$4(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ b82(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, int i3) {
        this.c = modifier;
        this.e = i;
        this.b = timePickerState;
        this.g = i2;
        this.d = timePickerColors;
        this.h = i3;
    }
}
