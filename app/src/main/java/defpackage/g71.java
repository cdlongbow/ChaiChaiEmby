package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g71 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Function i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Function l;

    public /* synthetic */ g71(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function3, int i, int i2) {
        this.b = modifier;
        this.e = wideNavigationRailState;
        this.g = shape;
        this.h = wideNavigationRailColors;
        this.i = function2;
        this.j = windowInsets;
        this.k = vertical;
        this.l = function3;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$31((NavHostController) this.e, (NavGraph) this.g, this.b, (Alignment) this.h, (Function1) this.i, (Function1) this.j, (Function1) this.k, (Function1) this.l, this.c, this.d, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return WideNavigationRailKt.WideNavigationRail$lambda$1(this.b, (WideNavigationRailState) this.e, (Shape) this.g, (WideNavigationRailColors) this.h, (Function2) this.i, (WindowInsets) this.j, (Arrangement.Vertical) this.k, (Function2) this.l, this.c, this.d, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ g71(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i, int i2) {
        this.e = navHostController;
        this.g = navGraph;
        this.b = modifier;
        this.h = alignment;
        this.i = function1;
        this.j = function2;
        this.k = function3;
        this.l = function4;
        this.c = i;
        this.d = i2;
    }
}
