package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.carousel.CarouselStateKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.FloatRef b;
    public final /* synthetic */ LazyLayoutScrollScope c;

    public /* synthetic */ wo(Ref.FloatRef floatRef, LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        this.a = i;
        this.b = floatRef;
        this.c = lazyLayoutScrollScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        LazyLayoutScrollScope lazyLayoutScrollScope = this.c;
        Ref.FloatRef floatRef = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                return CarouselStateKt.animateScrollToPage$lambda$3(floatRef, lazyLayoutScrollScope, fFloatValue, fFloatValue2);
            default:
                return PagerStateKt.animateScrollToPage$lambda$2(floatRef, lazyLayoutScrollScope, fFloatValue, fFloatValue2);
        }
    }
}
