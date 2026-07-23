package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.FloatingActionButtonElevation;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Shape d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long g;
    public final /* synthetic */ FloatingActionButtonElevation h;
    public final /* synthetic */ MutableInteractionSource i;
    public final /* synthetic */ Function j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ pk0(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function function, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = modifier;
        this.d = shape;
        this.e = j;
        this.g = j2;
        this.h = floatingActionButtonElevation;
        this.i = mutableInteractionSource;
        this.j = function;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return FloatingActionButtonKt.LargeFloatingActionButton_X_z6DiA$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Function2) this.j, this.k, this.l, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return FloatingActionButtonKt.SmallFloatingActionButton_X_z6DiA$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Function2) this.j, this.k, this.l, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return FloatingActionButtonKt.FloatingActionButton_X_z6DiA$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Function2) this.j, this.k, this.l, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return FloatingActionButtonKt.ExtendedFloatingActionButton_X_z6DiA$lambda$7(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Function3) this.j, this.k, this.l, (Composer) obj, iIntValue4);
        }
    }
}
