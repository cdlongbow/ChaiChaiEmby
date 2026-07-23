package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u71 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float g;
    public final /* synthetic */ WindowInsets h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ u71(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Function3 function3, int i, int i2) {
        this.a = 3;
        this.b = modifier;
        this.d = j;
        this.e = j2;
        this.g = f;
        this.c = paddingValues;
        this.h = windowInsets;
        this.i = function3;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NavigationDrawerKt.DismissibleDrawerSheet_afqeVBk$lambda$45(this.b, (Shape) this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.ModalDrawerSheet_afqeVBk$lambda$43(this.b, (Shape) this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.PermanentDrawerSheet_afqeVBk$lambda$49(this.b, (Shape) this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AppBarKt.BottomAppBar_1oL4kX8$lambda$14(this.b, this.d, this.e, this.g, (PaddingValues) this.c, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ u71(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, Function3 function3, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.c = shape;
        this.d = j;
        this.e = j2;
        this.g = f;
        this.h = windowInsets;
        this.i = function3;
        this.j = i;
        this.k = i2;
    }
}
