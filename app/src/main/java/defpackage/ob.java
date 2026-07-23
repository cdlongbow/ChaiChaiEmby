package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ WindowInsets i;
    public final /* synthetic */ TopAppBarColors j;
    public final /* synthetic */ TopAppBarScrollBehavior k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ ob(Function2 function2, Modifier modifier, Function2 function3, Function3 function4, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.a = i3;
        this.b = function2;
        this.c = modifier;
        this.d = function3;
        this.e = function4;
        this.g = f;
        this.h = f2;
        this.i = windowInsets;
        this.j = topAppBarColors;
        this.k = topAppBarScrollBehavior;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.MediumTopAppBar_oKE7A98$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.LargeTopAppBar_oKE7A98$lambda$9(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue2);
        }
    }
}
