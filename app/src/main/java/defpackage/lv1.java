package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ lv1(Function2 function2, boolean z, Function1 function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Function3 function3, int i, int i2) {
        this.a = 0;
        this.d = function2;
        this.c = z;
        this.k = function1;
        this.b = modifier;
        this.l = shape;
        this.m = searchBarColors;
        this.g = f;
        this.h = f2;
        this.e = function3;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SearchBarKt.DockedSearchBar_EQC0FA8$lambda$25(this.d, this.c, (Function1) obj5, this.b, (Shape) obj4, (SearchBarColors) obj3, this.g, this.h, this.e, this.i, this.j, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderDefaults.Track_4EFweAY$lambda$37((SliderDefaults) obj5, (RangeSliderState) obj4, this.b, this.c, (SliderColors) obj3, this.d, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SliderDefaults.Track_4EFweAY$lambda$17((SliderDefaults) obj5, (SliderState) obj4, this.b, this.c, (SliderColors) obj3, this.d, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ lv1(SliderDefaults sliderDefaults, Object obj, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, int i, int i2, int i3) {
        this.a = i3;
        this.k = sliderDefaults;
        this.l = obj;
        this.b = modifier;
        this.c = z;
        this.m = sliderColors;
        this.d = function2;
        this.e = function3;
        this.g = f;
        this.h = f2;
        this.i = i;
        this.j = i2;
    }
}
