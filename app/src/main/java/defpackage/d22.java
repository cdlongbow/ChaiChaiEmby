package defpackage;

import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d22 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SliderState b;

    public /* synthetic */ d22(SliderState sliderState, int i) {
        this.a = i;
        this.b = sliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SliderState sliderState = this.b;
        switch (i) {
            case 0:
                return SliderKt.SliderImpl$lambda$29$lambda$26$lambda$25(sliderState, (IntSize) obj);
            default:
                return Boolean.valueOf(SliderKt.sliderSemantics$lambda$52$lambda$51(sliderState, ((Float) obj).floatValue()));
        }
    }
}
