package defpackage;

import androidx.compose.material3.AppBarColumnKt;
import androidx.compose.material3.AppBarRowKt;
import androidx.compose.material3.TimePickerDialogDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ ib(TimePickerDialogDefaults timePickerDialogDefaults, Function0 function0, int i, Modifier modifier, int i2, int i3) {
        this.a = 2;
        this.b = timePickerDialogDefaults;
        this.e = function0;
        this.d = i;
        this.c = modifier;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.e;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarColumnKt.AppBarColumn$lambda$5((Function3) obj3, this.c, this.d, (Function1) function, this.g, this.h, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarRowKt.AppBarRow$lambda$5((Function3) obj3, this.c, this.d, (Function1) function, this.g, this.h, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TimePickerDialogDefaults.DisplayModeToggle_S7Bxtbk$lambda$0((TimePickerDialogDefaults) obj3, (Function0) function, this.d, this.c, this.g, this.h, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ ib(Function3 function3, Modifier modifier, int i, Function1 function1, int i2, int i3, int i4) {
        this.a = i4;
        this.b = function3;
        this.c = modifier;
        this.d = i;
        this.e = function1;
        this.g = i2;
        this.h = i3;
    }
}
