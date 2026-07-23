package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SheetState b;

    public /* synthetic */ dm(SheetState sheetState, int i) {
        this.a = i;
        this.b = sheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SheetState sheetState = this.b;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                return BottomSheetScaffoldKt.verticalScaleDown$lambda$18(sheetState, graphicsLayerScope);
            default:
                return BottomSheetScaffoldKt.verticalScaleUp$lambda$17(sheetState, graphicsLayerScope);
        }
    }
}
