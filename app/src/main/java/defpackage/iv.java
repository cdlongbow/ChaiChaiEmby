package defpackage;

import androidx.compose.foundation.layout.ContextualFlowLayoutKt;
import androidx.compose.foundation.layout.FlowLineInfo;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iv implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function4 b;

    public /* synthetic */ iv(Function4 function4, int i) {
        this.a = i;
        this.b = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        int iIntValue = ((Integer) obj).intValue();
        FlowLineInfo flowLineInfo = (FlowLineInfo) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        Function4 function4 = this.b;
        switch (i) {
            case 0:
                return ContextualFlowLayoutKt.ContextualFlowRow$lambda$2(function4, iIntValue, flowLineInfo, composer, iIntValue2);
            default:
                return ContextualFlowLayoutKt.ContextualFlowColumn$lambda$2(function4, iIntValue, flowLineInfo, composer, iIntValue2);
        }
    }
}
