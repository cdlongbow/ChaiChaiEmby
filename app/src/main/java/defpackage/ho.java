package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DragHandleColors;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleShapes;
import androidx.compose.material3.DragHandleSizes;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ho implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ho(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CardKt.ElevatedCard$lambda$3(this.b, (Shape) this.e, (CardColors) this.g, (CardElevation) this.h, (Function3) this.i, this.c, this.d, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuPopup$lambda$2((PopupPositionProvider) this.e, (Function0) this.g, this.b, (ContextMenuColors) this.h, (Function1) this.i, this.c, this.d, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DragHandleKt.VerticalDragHandle$lambda$16(this.b, (DragHandleSizes) this.e, (DragHandleColors) this.g, (DragHandleShapes) this.h, (MutableInteractionSource) this.i, this.c, this.d, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$1((NavHostController) this.e, (String) this.g, this.b, (String) this.h, (Function1) this.i, this.c, this.d, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ ho(Object obj, Object obj2, Modifier modifier, Object obj3, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.g = obj2;
        this.b = modifier;
        this.h = obj3;
        this.i = function1;
        this.c = i;
        this.d = i2;
    }
}
