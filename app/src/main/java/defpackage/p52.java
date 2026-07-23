package defpackage;

import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p52 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p52(SwipeToDismissBoxState swipeToDismissBoxState, boolean z, boolean z2) {
        this.d = swipeToDismissBoxState;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$11$lambda$10$lambda$9((SwipeToDismissBoxState) obj3, z2, z, (IntSize) obj, (Constraints) obj2);
            default:
                return WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22(z2, z, (ModalWideNavigationRailState) obj3, (IntSize) obj, (Constraints) obj2);
        }
    }

    public /* synthetic */ p52(boolean z, boolean z2, ModalWideNavigationRailState modalWideNavigationRailState) {
        this.b = z;
        this.c = z2;
        this.d = modalWideNavigationRailState;
    }
}
