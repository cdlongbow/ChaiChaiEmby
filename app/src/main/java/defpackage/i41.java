package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i41 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Function g;
    public final /* synthetic */ Function h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ i41(Function1 function1, Function0 function0, Function1 function2, Function0 function3, Function0 function4, Function0 function5, boolean z, Function0 function6, hy1 hy1Var, int i) {
        this.e = function1;
        this.b = function0;
        this.g = function2;
        this.h = function3;
        this.i = function4;
        this.j = function5;
        this.c = z;
        this.k = function6;
        this.l = hy1Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return MenuKt.DropdownMenuItemContent$lambda$8((Function2) this.e, this.b, (Modifier) this.i, (Function2) this.g, (Function2) this.h, this.c, (MenuItemColors) this.j, (PaddingValues) this.k, (MutableInteractionSource) this.l, this.d, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                gy1.g((Function1) this.e, this.b, (Function1) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, this.c, (Function0) this.k, (hy1) this.l, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i41(Function2 function2, Function0 function0, Modifier modifier, Function2 function3, Function2 function4, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i) {
        this.e = function2;
        this.b = function0;
        this.i = modifier;
        this.g = function3;
        this.h = function4;
        this.c = z;
        this.j = menuItemColors;
        this.k = paddingValues;
        this.l = mutableInteractionSource;
        this.d = i;
    }
}
