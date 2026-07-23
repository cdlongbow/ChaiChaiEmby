package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Function3 g;
    public final /* synthetic */ Alignment.Horizontal h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ WindowInsets k;
    public final /* synthetic */ TopAppBarColors l;
    public final /* synthetic */ TopAppBarScrollBehavior m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ kb(Function2 function2, Modifier modifier, Function2 function3, Function2 function4, Function3 function5, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = function2;
        this.c = modifier;
        this.d = function3;
        this.e = function4;
        this.g = function5;
        this.h = horizontal;
        this.i = f;
        this.j = f2;
        this.k = windowInsets;
        this.l = topAppBarColors;
        this.m = topAppBarScrollBehavior;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.LargeFlexibleTopAppBar_eXZ4JBQ$lambda$10(this.b, this.c, (Function2) this.d, (Function2) this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.MediumFlexibleTopAppBar_eXZ4JBQ$lambda$7(this.b, this.c, (Function2) this.d, (Function2) this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AppBarKt.TwoRowsTopAppBar_eXZ4JBQ$lambda$11(this.g, this.c, (Function3) this.d, this.b, (Function3) this.e, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ kb(Function3 function3, Modifier modifier, Function3 function4, Function2 function2, Function3 function5, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.a = 2;
        this.g = function3;
        this.c = modifier;
        this.d = function4;
        this.b = function2;
        this.e = function5;
        this.h = horizontal;
        this.i = f;
        this.j = f2;
        this.k = windowInsets;
        this.l = topAppBarColors;
        this.m = topAppBarScrollBehavior;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }
}
