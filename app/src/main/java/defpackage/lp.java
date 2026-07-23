package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Shape j;
    public final /* synthetic */ SelectableChipColors k;
    public final /* synthetic */ SelectableChipElevation l;
    public final /* synthetic */ BorderStroke m;
    public final /* synthetic */ MutableInteractionSource n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public /* synthetic */ lp(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function3, Function2 function4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = z;
        this.c = function0;
        this.d = function2;
        this.e = modifier;
        this.g = z2;
        this.h = function3;
        this.i = function4;
        this.j = shape;
        this.k = selectableChipColors;
        this.l = selectableChipElevation;
        this.m = borderStroke;
        this.n = mutableInteractionSource;
        this.o = i;
        this.p = i2;
        this.q = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.FilterChip$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ChipKt.ElevatedFilterChip$lambda$7(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iIntValue2);
        }
    }
}
