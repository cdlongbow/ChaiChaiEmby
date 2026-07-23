package defpackage;

import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function3 b;

    public /* synthetic */ tk0(Function3 function3, int i) {
        this.a = i;
        this.b = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        Function3 function3 = this.b;
        switch (i) {
            case 0:
                return FlowLayoutKt.FlowColumn$lambda$1$0(function3, composer, iIntValue);
            default:
                return FlowLayoutKt.FlowRow$lambda$1$0(function3, composer, iIntValue);
        }
    }
}
