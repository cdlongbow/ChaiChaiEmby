package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e20 implements Function2 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Function l;

    public /* synthetic */ e20(Modifier modifier, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function3, int i) {
        this.g = modifier;
        this.b = z;
        this.d = z2;
        this.h = wideNavigationRailColors;
        this.c = shape;
        this.i = function2;
        this.j = windowInsets;
        this.k = vertical;
        this.l = function3;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Function function = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.c;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                m20.a((String) obj8, (String) obj7, this.b, this.d, (Function1) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Function0) function, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.SurfaceIconToggleButton$lambda$27(this.b, (Function1) obj6, (Modifier) obj8, this.d, (Shape) obj7, (IconToggleButtonColors) obj5, (BorderStroke) obj4, (MutableInteractionSource) obj3, (Function2) function, this.e, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                gy1.C(this.b, (Function0) function, (Function0) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, this.d, (Function0) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return WideNavigationRailKt.WideNavigationRailLayout$lambda$12((Modifier) obj8, this.b, this.d, (WideNavigationRailColors) obj7, (Shape) obj6, (Function2) obj5, (WindowInsets) obj4, (Arrangement.Vertical) obj3, (Function2) function, this.e, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ e20(String str, String str2, boolean z, boolean z2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function0 function0, int i) {
        this.g = str;
        this.h = str2;
        this.b = z;
        this.d = z2;
        this.c = function1;
        this.i = function2;
        this.j = function3;
        this.k = function4;
        this.l = function0;
        this.e = i;
    }

    public /* synthetic */ e20(boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, boolean z2, Function0 function5, Function0 function6, int i) {
        this.b = z;
        this.l = function0;
        this.g = function1;
        this.h = function2;
        this.c = function3;
        this.i = function4;
        this.d = z2;
        this.j = function5;
        this.k = function6;
        this.e = i;
    }

    public /* synthetic */ e20(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i) {
        this.b = z;
        this.c = function1;
        this.g = modifier;
        this.d = z2;
        this.h = shape;
        this.i = iconToggleButtonColors;
        this.j = borderStroke;
        this.k = mutableInteractionSource;
        this.l = function2;
        this.e = i;
    }
}
