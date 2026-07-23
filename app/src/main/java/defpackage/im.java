package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.HorizontalCenterOpticallyKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class im implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ im(float f, float f2, float f3, Placeable placeable) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        switch (i) {
            case 0:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$13$lambda$12$lambda$11((SheetState) obj2, f3, f2, f, (DraggableAnchorsConfig) obj);
            default:
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$1$lambda$0(f3, f2, f, (Placeable) obj2, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ im(SheetState sheetState, float f, float f2, float f3) {
        this.e = sheetState;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }
}
