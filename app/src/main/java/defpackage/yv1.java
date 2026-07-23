package defpackage;

import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yv1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;

    public /* synthetic */ yv1(Modifier modifier, float f, Function function, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.c = f;
        this.d = function;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SingleChoiceSegmentedButtonRow_uFdPcIQ$lambda$10(this.b, this.c, (Function3) this.d, this.e, this.g, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SegmentedButtonKt.MultiChoiceSegmentedButtonRow_uFdPcIQ$lambda$13(this.b, this.c, (Function3) this.d, this.e, this.g, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TimePickerKt.CircularLayout$lambda$96(this.b, this.c, (Function2) this.d, this.e, this.g, (Composer) obj, iIntValue3);
        }
    }
}
