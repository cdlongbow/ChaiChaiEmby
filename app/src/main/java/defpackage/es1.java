package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderState;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class es1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ClosedFloatingPointRange c;

    public /* synthetic */ es1(Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.a = i;
        this.b = function0;
        this.c = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return RangeSliderState.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
            default:
                return SliderState.Companion.Saver$lambda$1(this.b, this.c, (List) obj);
        }
    }
}
