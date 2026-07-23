package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Density b;

    public /* synthetic */ c9(Density density, int i) {
        this.a = i;
        this.b = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fAnchoredDraggableFlingBehavior$lambda$0;
        int i = this.a;
        Density density = this.b;
        switch (i) {
            case 0:
                fAnchoredDraggableFlingBehavior$lambda$0 = AnchoredDraggableKt.anchoredDraggableFlingBehavior$lambda$0(density);
                break;
            case 1:
                fAnchoredDraggableFlingBehavior$lambda$0 = ModalWideNavigationRailState.anchoredDraggableState$lambda$2(density);
                break;
            case 2:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState._init_$lambda$9(density);
                break;
            case 3:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState._init_$lambda$11(density);
                break;
            case 4:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState.Companion.Saver$lambda$3(density);
                break;
            case 5:
                fAnchoredDraggableFlingBehavior$lambda$0 = SheetState.Companion.Saver$lambda$5(density);
                break;
            default:
                fAnchoredDraggableFlingBehavior$lambda$0 = SwipeToDismissBoxState._init_$lambda$2(density);
                break;
        }
        return Float.valueOf(fAnchoredDraggableFlingBehavior$lambda$0);
    }
}
