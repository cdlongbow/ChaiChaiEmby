package defpackage;

import androidx.compose.material3.RichTooltipColors;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p82 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TooltipScope b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Shape i;
    public final /* synthetic */ RichTooltipColors j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ p82(TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function3, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, Function2 function4, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = tooltipScope;
        this.c = modifier;
        this.d = function2;
        this.e = function3;
        this.g = j;
        this.h = f;
        this.i = shape;
        this.j = richTooltipColors;
        this.k = f2;
        this.l = f3;
        this.m = function4;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TooltipKt.RichTooltip_ZuUcA3Q$lambda$12(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return Tooltip_androidKt.RichTooltipAndroid_ZuUcA3Q$lambda$3(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue2);
        }
    }
}
