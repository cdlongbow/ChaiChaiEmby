package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Shape c;
    public final /* synthetic */ CardColors d;
    public final /* synthetic */ CardElevation e;
    public final /* synthetic */ BorderStroke g;
    public final /* synthetic */ Function3 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ go(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3 function3, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.c = shape;
        this.d = cardColors;
        this.e = cardElevation;
        this.g = borderStroke;
        this.h = function3;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CardKt.OutlinedCard$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CardKt.Card$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue2);
        }
    }
}
