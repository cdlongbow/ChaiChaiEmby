package defpackage;

import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ int c;

    public /* synthetic */ e1(int i, int i2, Placeable placeable) {
        this.a = i2;
        this.b = placeable;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Placeable placeable = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4$lambda$3(placeable, i2, (Placeable.PlacementScope) obj);
            case 1:
                return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0(placeable, i2, (Placeable.PlacementScope) obj);
            default:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                Placeable.PlacementScope.placeRelative$default(placementScope, this.b, -i2, 0, 0.0f, 4, null);
                return Unit.INSTANCE;
        }
    }
}
