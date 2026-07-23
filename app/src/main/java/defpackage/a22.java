package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a22 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClosedFloatingPointRange b;
    public final /* synthetic */ RangeSliderState c;

    public /* synthetic */ a22(ClosedFloatingPointRange closedFloatingPointRange, RangeSliderState rangeSliderState, int i) {
        this.a = i;
        this.b = closedFloatingPointRange;
        this.c = rangeSliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zRangeSliderEndThumbSemantics$lambda$58$lambda$57;
        int i = this.a;
        RangeSliderState rangeSliderState = this.c;
        ClosedFloatingPointRange closedFloatingPointRange = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                zRangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderEndThumbSemantics$lambda$58$lambda$57(closedFloatingPointRange, rangeSliderState, fFloatValue);
                break;
            default:
                zRangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderStartThumbSemantics$lambda$55$lambda$54(closedFloatingPointRange, rangeSliderState, fFloatValue);
                break;
        }
        return Boolean.valueOf(zRangeSliderEndThumbSemantics$lambda$58$lambda$57);
    }
}
