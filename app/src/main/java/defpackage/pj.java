package defpackage;

import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;

    public /* synthetic */ pj(Modifier modifier, AnalogTimePickerState analogTimePickerState, int i, boolean z, int i2) {
        this.a = 4;
        this.g = modifier;
        this.b = analogTimePickerState;
        this.d = i;
        this.c = z;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler$lambda$3((PredictiveBackState) obj4, this.c, (Function0) obj3, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                b00.a((Function0) obj3, this.c, (c00) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.e);
                return Unit.INSTANCE;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ExposedDropdownMenuDefaults.TrailingIcon$lambda$0((ExposedDropdownMenuDefaults) obj4, this.c, (Modifier) obj3, this.d, this.e, (Composer) obj, iIntValue2);
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                boolean z = this.c;
                q32.b((String) obj4, z, (Function0) obj3, (Composer) obj, iUpdateChangedFlags, this.e);
                return Unit.INSTANCE;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TimePickerKt.ClockText$lambda$84((Modifier) obj4, (AnalogTimePickerState) obj3, this.d, this.c, this.e, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ pj(Object obj, boolean z, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.g = obj;
        this.c = z;
        this.b = obj2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ pj(Function0 function0, boolean z, c00 c00Var, int i, int i2) {
        this.a = 1;
        this.b = function0;
        this.c = z;
        this.g = c00Var;
        this.d = i;
        this.e = i2;
    }
}
