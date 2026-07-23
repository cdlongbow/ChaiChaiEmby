package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Shape e;
    public final /* synthetic */ CardColors g;
    public final /* synthetic */ CardElevation h;
    public final /* synthetic */ BorderStroke i;
    public final /* synthetic */ MutableInteractionSource j;
    public final /* synthetic */ Function3 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ fo(Function0 function0, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = modifier;
        this.d = z;
        this.e = shape;
        this.g = cardColors;
        this.h = cardElevation;
        this.i = borderStroke;
        this.j = mutableInteractionSource;
        this.k = function3;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CardKt.Card$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CardKt.OutlinedCard$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue2);
        }
    }
}
