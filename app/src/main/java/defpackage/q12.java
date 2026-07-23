package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q12 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SliderDefaults b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ SliderColors g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ q12(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, float f3, int i, int i2) {
        this.a = 1;
        this.b = sliderDefaults;
        this.c = sliderState;
        this.d = modifier;
        this.e = z;
        this.g = sliderColors;
        this.h = function2;
        this.i = function3;
        this.j = f;
        this.k = f2;
        this.l = f3;
        this.m = i;
        this.n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SliderDefaults.Track_mnvyFg4$lambda$21(this.b, (SliderState) obj3, this.j, this.d, this.e, this.g, this.h, this.i, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                SliderDefaults sliderDefaults = this.b;
                float f = this.j;
                return SliderDefaults.CenteredTrack_7LSsfP0$lambda$25(sliderDefaults, (SliderState) obj3, this.d, this.e, this.g, this.h, this.i, f, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SliderDefaults.Track_mnvyFg4$lambda$41(this.b, (RangeSliderState) obj3, this.j, this.d, this.e, this.g, this.h, this.i, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ q12(SliderDefaults sliderDefaults, Object obj, float f, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i, int i2, int i3) {
        this.a = i3;
        this.b = sliderDefaults;
        this.c = obj;
        this.j = f;
        this.d = modifier;
        this.e = z;
        this.g = sliderColors;
        this.h = function2;
        this.i = function3;
        this.k = f2;
        this.l = f3;
        this.m = i;
        this.n = i2;
    }
}
