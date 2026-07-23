package defpackage;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.runtime.Composer;
import androidx.navigation.compose.internal.NavComposeUtils_androidKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ yg(boolean z, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.c = function2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BackHandler_androidKt.PredictiveBackHandler$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavComposeUtils_androidKt.PredictiveBackHandler$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$7(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue3);
        }
    }
}
