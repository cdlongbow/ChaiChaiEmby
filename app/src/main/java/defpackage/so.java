package defpackage;

import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Density b;
    public final /* synthetic */ float c;
    public final /* synthetic */ CarouselState d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float g;

    public /* synthetic */ so(Density density, float f, CarouselState carouselState, float f2, float f3, int i) {
        this.a = i;
        this.b = density;
        this.c = f;
        this.d = carouselState;
        this.e = f2;
        this.g = f3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$12$lambda$11(this.b, this.c, this.d, this.e, this.g, fFloatValue, fFloatValue2);
            default:
                return CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$2$lambda$1(this.b, this.c, this.d, this.e, this.g, fFloatValue, fFloatValue2);
        }
    }
}
