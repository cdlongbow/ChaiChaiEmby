package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ eq1(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3(function0));
            case 1:
                return Float.valueOf(ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21(function0));
            case 2:
                function0.invoke();
                return Unit.INSTANCE;
            case 3:
                function0.invoke();
                return Unit.INSTANCE;
            default:
                function0.invoke();
                return Unit.INSTANCE;
        }
    }
}
