package defpackage;

import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FloatProducer b;

    public /* synthetic */ jc1(FloatProducer floatProducer, int i) {
        this.a = i;
        this.b = floatProducer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FloatProducer floatProducer = this.b;
        switch (i) {
            case 0:
                return OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15(floatProducer);
            case 1:
                return Float.valueOf(PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$7$lambda$6(floatProducer));
            default:
                return TextFieldKt.TextFieldLayout$lambda$19$lambda$15$lambda$14(floatProducer);
        }
    }
}
