package defpackage;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vr1(long j, Function2 function2, int i) {
        this.b = j;
        this.d = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$14((FloatProducer) this.d, this.b, this.c, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldImplKt.Decoration_Iv8Zu3U$lambda$21(this.b, (Function2) this.d, this.c, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ vr1(FloatProducer floatProducer, long j, int i) {
        this.d = floatProducer;
        this.b = j;
        this.c = i;
    }
}
