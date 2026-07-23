package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipBorder;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Shape i;
    public final /* synthetic */ ChipColors j;
    public final /* synthetic */ ChipElevation k;
    public final /* synthetic */ ChipBorder l;
    public final /* synthetic */ MutableInteractionSource m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ tp(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function3, Function2 function4, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = function0;
        this.c = function2;
        this.d = modifier;
        this.e = z;
        this.g = function3;
        this.h = function4;
        this.i = shape;
        this.j = chipColors;
        this.k = chipElevation;
        this.l = chipBorder;
        this.m = mutableInteractionSource;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.ElevatedAssistChip$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ChipKt.AssistChip$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue2);
        }
    }
}
