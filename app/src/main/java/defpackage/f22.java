package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f22 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ RangeSliderState c;
    public final /* synthetic */ ClosedFloatingPointRange d;

    public /* synthetic */ f22(boolean z, RangeSliderState rangeSliderState, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.a = i;
        this.b = z;
        this.c = rangeSliderState;
        this.d = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ClosedFloatingPointRange closedFloatingPointRange = this.d;
        RangeSliderState rangeSliderState = this.c;
        boolean z = this.b;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                return SliderKt.rangeSliderEndThumbSemantics$lambda$58(z, rangeSliderState, closedFloatingPointRange, semanticsPropertyReceiver);
            default:
                return SliderKt.rangeSliderStartThumbSemantics$lambda$55(z, rangeSliderState, closedFloatingPointRange, semanticsPropertyReceiver);
        }
    }
}
