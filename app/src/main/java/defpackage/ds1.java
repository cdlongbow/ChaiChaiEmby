package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RangeSliderState b;

    public /* synthetic */ ds1(RangeSliderState rangeSliderState, int i) {
        this.a = i;
        this.b = rangeSliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        RangeSliderState rangeSliderState = this.b;
        switch (i) {
            case 0:
                return RangeSliderState.gestureEndAction$lambda$0(rangeSliderState, ((Boolean) obj).booleanValue());
            case 1:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$34$lambda$33(rangeSliderState, (IntSize) obj);
            default:
                return SliderKt.RangeSliderImpl$lambda$44$lambda$39$lambda$38(rangeSliderState, (IntSize) obj);
        }
    }
}
