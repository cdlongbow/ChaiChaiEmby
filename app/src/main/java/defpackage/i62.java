package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldCoreModifierNode b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Placeable d;
    public final /* synthetic */ MeasureScope e;

    public /* synthetic */ i62(TextFieldCoreModifierNode textFieldCoreModifierNode, int i, Placeable placeable, MeasureScope measureScope, int i2) {
        this.a = i2;
        this.b = textFieldCoreModifierNode;
        this.c = i;
        this.d = placeable;
        this.e = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MeasureScope measureScope = this.e;
        Placeable placeable = this.d;
        int i2 = this.c;
        TextFieldCoreModifierNode textFieldCoreModifierNode = this.b;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                return TextFieldCoreModifierNode.measureHorizontalScroll_3p2s80s$lambda$0(textFieldCoreModifierNode, i2, placeable, measureScope, placementScope);
            default:
                return TextFieldCoreModifierNode.measureVerticalScroll_3p2s80s$lambda$0(textFieldCoreModifierNode, i2, placeable, measureScope, placementScope);
        }
    }
}
