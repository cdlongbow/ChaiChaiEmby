package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fm(float f, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float f = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$13$lambda$12((SheetState) obj3, f, (IntSize) obj, (Constraints) obj2);
            default:
                return CarouselKt.HorizontalUncontainedCarousel_VUP9l70$lambda$7$lambda$6((Density) obj3, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
        }
    }
}
