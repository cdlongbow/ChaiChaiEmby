package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ xg(boolean z, Function0 function0, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.c = function0;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BackHandlerKt.BackHandler$lambda$7(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BackHandler_androidKt.BackHandler$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
