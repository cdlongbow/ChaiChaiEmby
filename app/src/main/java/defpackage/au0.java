package defpackage;

import androidx.compose.foundation.layout.InsetsPaddingModifierNode;
import androidx.compose.material3.MinimumInteractiveModifierNode;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Placeable c;
    public final /* synthetic */ int d;

    public /* synthetic */ au0(int i, int i2, Placeable placeable) {
        this.a = 1;
        this.b = i;
        this.c = placeable;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        Placeable placeable = this.c;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                return InsetsPaddingModifierNode.measure_3p2s80s$lambda$0(placeable, i3, i2, placementScope);
            case 1:
                return MinimumInteractiveModifierNode.measure_3p2s80s$lambda$0(i3, placeable, i2, placementScope);
            default:
                return ScrollNode.measure_3p2s80s$lambda$0$0(placeable, i3, i2, placementScope);
        }
    }

    public /* synthetic */ au0(Placeable placeable, int i, int i2, int i3) {
        this.a = i3;
        this.c = placeable;
        this.b = i;
        this.d = i2;
    }
}
