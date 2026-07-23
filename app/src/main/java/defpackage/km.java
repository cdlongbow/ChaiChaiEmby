package defpackage;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km implements Function2 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function h;

    public /* synthetic */ km(SegmentedButtonDefaults segmentedButtonDefaults, boolean z, Function2 function2, Function2 function3, int i, int i2) {
        this.c = segmentedButtonDefaults;
        this.b = z;
        this.g = function2;
        this.h = function3;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.h;
        Object obj3 = this.g;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BoxWithConstraintsKt.BoxWithConstraints$lambda$1((Modifier) obj4, (Alignment) obj3, this.b, (Function3) function, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DatePickerKt.YearPickerMenuButton$lambda$70((Function0) obj3, this.b, (Modifier) obj4, (Function2) function, this.d, this.e, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$23(this.b, (Function1) obj3, (Modifier) obj4, (Function3) function, this.d, this.e, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return SegmentedButtonDefaults.Icon$lambda$2((SegmentedButtonDefaults) obj4, this.b, (Function2) obj3, (Function2) function, this.d, this.e, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ km(Modifier modifier, Alignment alignment, boolean z, Function3 function3, int i, int i2) {
        this.c = modifier;
        this.g = alignment;
        this.b = z;
        this.h = function3;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ km(Function0 function0, boolean z, Modifier modifier, Function2 function2, int i, int i2) {
        this.g = function0;
        this.b = z;
        this.c = modifier;
        this.h = function2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ km(boolean z, Function1 function1, Modifier modifier, Function3 function3, int i, int i2) {
        this.b = z;
        this.g = function1;
        this.c = modifier;
        this.h = function3;
        this.d = i;
        this.e = i2;
    }
}
