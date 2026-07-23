package defpackage;

import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t82 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TooltipScope b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ t82(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = tooltipScope;
        this.c = modifier;
        this.d = j;
        this.e = f;
        this.g = shape;
        this.h = j2;
        this.i = j3;
        this.j = f2;
        this.k = f3;
        this.l = function2;
        this.m = i;
        this.n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TooltipKt.PlainTooltip_m9Er_Xc$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return Tooltip_androidKt.PlainTooltipAndroid_m9Er_Xc$lambda$1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
        }
    }
}
