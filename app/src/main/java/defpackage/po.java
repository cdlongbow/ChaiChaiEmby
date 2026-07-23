package defpackage;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ po(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, int i, int i2) {
        this.h = searchBarState;
        this.i = function2;
        this.b = modifier;
        this.j = shape;
        this.k = searchBarColors;
        this.c = f;
        this.d = f2;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CarouselKt.HorizontalUncontainedCarousel_9QcgTRs$lambda$9((CarouselState) this.h, this.c, this.b, this.d, (TargetedFlingBehavior) this.i, (PaddingValues) this.j, (Function4) this.k, this.e, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SearchBarKt.SearchBar_nbWgWpA$lambda$2((SearchBarState) this.h, (Function2) this.i, this.b, (Shape) this.j, (SearchBarColors) this.k, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ po(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, PaddingValues paddingValues, Function4 function4, int i, int i2) {
        this.h = carouselState;
        this.c = f;
        this.b = modifier;
        this.d = f2;
        this.i = targetedFlingBehavior;
        this.j = paddingValues;
        this.k = function4;
        this.e = i;
        this.g = i2;
    }
}
