package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lr0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ IconToggleButtonColors h;
    public final /* synthetic */ MutableInteractionSource i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ lr0(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.c = function1;
        this.d = modifier;
        this.e = z2;
        this.h = iconToggleButtonColors;
        this.i = mutableInteractionSource;
        this.g = shape;
        this.j = function2;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.IconToggleButton$lambda$6(this.b, this.c, this.d, this.e, this.h, this.i, this.g, this.j, this.k, this.l, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean z = this.b;
                Function1 function1 = this.c;
                Modifier modifier = this.d;
                boolean z2 = this.e;
                IconToggleButtonColors iconToggleButtonColors = this.h;
                MutableInteractionSource mutableInteractionSource = this.i;
                return IconButtonKt.FilledIconToggleButton$lambda$13(z, function1, modifier, z2, this.g, iconToggleButtonColors, mutableInteractionSource, this.j, this.k, this.l, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean z3 = this.b;
                Function1 function2 = this.c;
                Modifier modifier2 = this.d;
                boolean z4 = this.e;
                IconToggleButtonColors iconToggleButtonColors2 = this.h;
                MutableInteractionSource mutableInteractionSource2 = this.i;
                return IconButtonKt.FilledTonalIconToggleButton$lambda$17(z3, function2, modifier2, z4, this.g, iconToggleButtonColors2, mutableInteractionSource2, this.j, this.k, this.l, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return IconButtonKt.IconToggleButtonImpl$lambda$9(this.b, this.c, this.d, this.e, this.h, this.i, this.g, this.j, this.k, this.l, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ lr0(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.c = function1;
        this.d = modifier;
        this.e = z2;
        this.g = shape;
        this.h = iconToggleButtonColors;
        this.i = mutableInteractionSource;
        this.j = function2;
        this.k = i;
        this.l = i2;
    }
}
