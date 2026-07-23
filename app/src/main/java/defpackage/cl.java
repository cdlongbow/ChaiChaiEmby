package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function j;
    public final /* synthetic */ Function k;
    public final /* synthetic */ Object l;

    public /* synthetic */ cl(SwipeToDismissBoxState swipeToDismissBoxState, Function3 function3, Modifier modifier, boolean z, boolean z2, boolean z3, Function1 function1, Function3 function4, int i, int i2) {
        this.i = swipeToDismissBoxState;
        this.j = function3;
        this.b = modifier;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.k = function1;
        this.l = function4;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.BasicTooltipBox$lambda$2((PopupPositionProvider) this.i, (Function2) this.j, (BasicTooltipState) this.l, this.b, this.c, this.d, this.e, (Function2) this.k, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$13((SwipeToDismissBoxState) this.i, (Function3) this.j, this.b, this.c, this.d, this.e, (Function1) this.k, (Function3) this.l, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ cl(PopupPositionProvider popupPositionProvider, Function2 function2, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, boolean z3, Function2 function3, int i, int i2) {
        this.i = popupPositionProvider;
        this.j = function2;
        this.l = basicTooltipState;
        this.b = modifier;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.k = function3;
        this.g = i;
        this.h = i2;
    }
}
