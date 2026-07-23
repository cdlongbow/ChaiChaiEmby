package defpackage;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ CarouselState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ TargetedFlingBehavior g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ PaddingValues k;
    public final /* synthetic */ Function4 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ lo(CarouselState carouselState, float f, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2) {
        this.b = carouselState;
        this.d = f;
        this.c = modifier;
        this.e = f2;
        this.g = targetedFlingBehavior;
        this.h = z;
        this.i = f3;
        this.j = f4;
        this.k = paddingValues;
        this.l = function4;
        this.m = i;
        this.n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CarouselKt.HorizontalMultiBrowseCarousel_3tcCNu0$lambda$3(this.b, this.d, this.c, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                CarouselState carouselState = this.b;
                float f = this.d;
                return CarouselKt.HorizontalCenteredHeroCarousel_p2lB3Bg$lambda$13(carouselState, this.c, f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ lo(CarouselState carouselState, Modifier modifier, float f, float f2, TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, PaddingValues paddingValues, Function4 function4, int i, int i2) {
        this.b = carouselState;
        this.c = modifier;
        this.d = f;
        this.e = f2;
        this.g = targetedFlingBehavior;
        this.h = z;
        this.i = f3;
        this.j = f4;
        this.k = paddingValues;
        this.l = function4;
        this.m = i;
        this.n = i2;
    }
}
