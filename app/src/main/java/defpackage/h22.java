package defpackage;

import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h22 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ TextStyle e;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;

    public /* synthetic */ h22(Function2 function2, Function2 function3, Function2 function4, TextStyle textStyle, long j, long j2, int i, int i2) {
        this.a = i2;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = textStyle;
        this.g = j;
        this.h = j2;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SnackbarKt.OneRowSnackbar_kKq0p4A$lambda$12(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SnackbarKt.NewLineButtonSnackbar_kKq0p4A$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }
}
