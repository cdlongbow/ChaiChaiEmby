package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.NavigationRailItemColors;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class al implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ al(PopupPositionProvider popupPositionProvider, Function2 function2, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function3, int i, int i2) {
        this.l = popupPositionProvider;
        this.d = function2;
        this.m = tooltipState;
        this.e = modifier;
        this.c = function0;
        this.b = z;
        this.g = z2;
        this.i = z3;
        this.h = function3;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.BasicTooltipBox$lambda$5((PopupPositionProvider) this.l, this.d, (TooltipState) this.m, this.e, this.c, this.b, this.g, this.i, (Function2) this.h, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationRailKt.NavigationRailItem$lambda$11(this.b, this.c, this.d, this.e, this.g, (Function2) this.h, this.i, (NavigationRailItemColors) this.l, (MutableInteractionSource) this.m, this.j, this.k, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TooltipKt.TooltipBox$lambda$5((PopupPositionProvider) this.l, (Function3) this.h, (TooltipState) this.m, this.e, this.c, this.b, this.g, this.i, this.d, this.j, this.k, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ al(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function2, int i, int i2) {
        this.l = popupPositionProvider;
        this.h = function3;
        this.m = tooltipState;
        this.e = modifier;
        this.c = function0;
        this.b = z;
        this.g = z2;
        this.i = z3;
        this.d = function2;
        this.j = i;
        this.k = i2;
    }

    public /* synthetic */ al(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function3, boolean z3, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.d = function2;
        this.e = modifier;
        this.g = z2;
        this.h = function3;
        this.i = z3;
        this.l = navigationRailItemColors;
        this.m = mutableInteractionSource;
        this.j = i;
        this.k = i2;
    }
}
