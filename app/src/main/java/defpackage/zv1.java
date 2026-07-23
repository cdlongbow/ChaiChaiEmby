package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Shape c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ SegmentedButtonColors g;
    public final /* synthetic */ BorderStroke h;
    public final /* synthetic */ PaddingValues i;
    public final /* synthetic */ MutableInteractionSource j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ RowScope p;
    public final /* synthetic */ Function q;

    public /* synthetic */ zv1(RowScope rowScope, boolean z, Function function, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function3, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.p = rowScope;
        this.b = z;
        this.q = function;
        this.c = shape;
        this.d = modifier;
        this.e = z2;
        this.g = segmentedButtonColors;
        this.h = borderStroke;
        this.i = paddingValues;
        this.j = mutableInteractionSource;
        this.k = function2;
        this.l = function3;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SegmentedButton$lambda$1((MultiChoiceSegmentedButtonRowScope) this.p, this.b, (Function1) this.q, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SegmentedButton$lambda$5((SingleChoiceSegmentedButtonRowScope) this.p, this.b, (Function0) this.q, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iIntValue2);
        }
    }
}
