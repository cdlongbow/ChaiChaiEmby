package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t71 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Shape d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ WindowInsets i;
    public final /* synthetic */ Function3 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ t71(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, int i3) {
        this.a = i3;
        this.b = drawerState;
        this.c = modifier;
        this.d = shape;
        this.e = j;
        this.g = j2;
        this.h = f;
        this.i = windowInsets;
        this.j = function3;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NavigationDrawerKt.ModalDrawerSheet_Snr_uVM$lambda$44(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.DismissibleDrawerSheet_Snr_uVM$lambda$46(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue2);
        }
    }
}
