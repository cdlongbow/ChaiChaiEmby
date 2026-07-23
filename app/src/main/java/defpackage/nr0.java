package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nr0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Shape e;
    public final /* synthetic */ IconButtonColors g;
    public final /* synthetic */ MutableInteractionSource h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ nr0(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2) {
        this.a = 0;
        this.b = function0;
        this.c = modifier;
        this.d = z;
        this.g = iconButtonColors;
        this.h = mutableInteractionSource;
        this.e = shape;
        this.i = function2;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.IconButton$lambda$1(this.b, this.c, this.d, this.g, this.h, this.e, this.i, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Function0 function0 = this.b;
                Modifier modifier = this.c;
                boolean z = this.d;
                IconButtonColors iconButtonColors = this.g;
                MutableInteractionSource mutableInteractionSource = this.h;
                return IconButtonKt.FilledIconButton$lambda$10(function0, modifier, z, this.e, iconButtonColors, mutableInteractionSource, this.i, this.j, this.k, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                Function0 function1 = this.b;
                Modifier modifier2 = this.c;
                boolean z2 = this.d;
                IconButtonColors iconButtonColors2 = this.g;
                MutableInteractionSource mutableInteractionSource2 = this.h;
                return IconButtonKt.FilledTonalIconButton$lambda$14(function1, modifier2, z2, this.e, iconButtonColors2, mutableInteractionSource2, this.i, this.j, this.k, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ nr0(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = modifier;
        this.d = z;
        this.e = shape;
        this.g = iconButtonColors;
        this.h = mutableInteractionSource;
        this.i = function2;
        this.j = i;
        this.k = i2;
    }
}
