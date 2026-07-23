package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ float g;
    public final /* synthetic */ WindowInsets h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function3 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ mb(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, FloatProducer floatProducer, Function3 function3, int i, int i2) {
        this.m = drawerPredictiveBackState;
        this.h = windowInsets;
        this.b = modifier;
        this.e = shape;
        this.c = j;
        this.d = j2;
        this.g = f;
        this.i = floatProducer;
        this.j = function3;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.BottomAppBar_qhFBPw4$lambda$13(this.j, this.b, (Function2) this.m, this.c, this.d, this.g, (PaddingValues) this.e, this.h, (BottomAppBarScrollBehavior) this.i, this.k, this.l, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.FlexibleBottomAppBar_wBhsO_E$lambda$16(this.b, this.c, this.d, (PaddingValues) this.e, (Arrangement.Horizontal) this.m, this.g, this.h, (BottomAppBarScrollBehavior) this.i, this.j, this.k, this.l, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$53((DrawerPredictiveBackState) this.m, this.h, this.b, (Shape) this.e, this.c, this.d, this.g, (FloatProducer) this.i, this.j, this.k, this.l, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ mb(Modifier modifier, long j, long j2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Function3 function3, int i, int i2) {
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = paddingValues;
        this.m = horizontal;
        this.g = f;
        this.h = windowInsets;
        this.i = bottomAppBarScrollBehavior;
        this.j = function3;
        this.k = i;
        this.l = i2;
    }

    public /* synthetic */ mb(Function3 function3, Modifier modifier, Function2 function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, int i, int i2) {
        this.j = function3;
        this.b = modifier;
        this.m = function2;
        this.c = j;
        this.d = j2;
        this.g = f;
        this.e = paddingValues;
        this.h = windowInsets;
        this.i = bottomAppBarScrollBehavior;
        this.k = i;
        this.l = i2;
    }
}
