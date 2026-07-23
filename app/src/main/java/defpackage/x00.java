package defpackage;

import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DateRangePickerDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x00 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ x00(Object obj, int i, Modifier modifier, long j, int i2, int i3, int i4) {
        this.a = i4;
        this.h = obj;
        this.b = i;
        this.c = modifier;
        this.d = j;
        this.e = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerDefaults.DatePickerTitle_FNtVw6o$lambda$1((DatePickerDefaults) obj3, this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DateRangePickerDefaults.DateRangePickerTitle_FNtVw6o$lambda$0((DateRangePickerDefaults) obj3, this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue2);
        }
    }
}
