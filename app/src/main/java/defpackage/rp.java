package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ ChipColors i;
    public final /* synthetic */ ChipElevation j;
    public final /* synthetic */ BorderStroke k;
    public final /* synthetic */ MutableInteractionSource l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ rp(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = function2;
        this.d = modifier;
        this.e = z;
        this.g = function3;
        this.h = shape;
        this.i = chipColors;
        this.j = chipElevation;
        this.k = borderStroke;
        this.l = mutableInteractionSource;
        this.m = i;
        this.n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.SuggestionChip$lambda$9(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ChipKt.ElevatedSuggestionChip$lambda$12(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
        }
    }
}
