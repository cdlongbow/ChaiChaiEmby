package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ PaddingValues l;
    public final /* synthetic */ int m;

    public /* synthetic */ mp(Function2 function2, TextStyle textStyle, long j, Function2 function3, Function2 function4, Function2 function5, long j2, long j3, float f, PaddingValues paddingValues, int i, int i2) {
        this.a = i2;
        this.b = function2;
        this.c = textStyle;
        this.d = j;
        this.e = function3;
        this.g = function4;
        this.h = function5;
        this.i = j2;
        this.j = j3;
        this.k = f;
        this.l = paddingValues;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.ChipContent_fe0OD_I$lambda$23(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ChipKt.AnimatingChipContent_fe0OD_I$lambda$24(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue2);
        }
    }
}
