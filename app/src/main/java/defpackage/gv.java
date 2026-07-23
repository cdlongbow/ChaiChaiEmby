package defpackage;

import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowColumnOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowRowOverflow;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FlowLayoutOverflowState b;
    public final /* synthetic */ Function3 c;

    public /* synthetic */ gv(FlowLayoutOverflowState flowLayoutOverflowState, Function3 function3, int i) {
        this.a = i;
        this.b = flowLayoutOverflowState;
        this.c = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.b, this.c, composer, iIntValue);
            case 1:
                return ContextualFlowColumnOverflow.Companion.expandIndicator$lambda$0$0(this.b, this.c, composer, iIntValue);
            case 2:
                return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.b, this.c, composer, iIntValue);
            case 3:
                return ContextualFlowRowOverflow.Companion.expandIndicator$lambda$0$0(this.b, this.c, composer, iIntValue);
            case 4:
                return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.b, this.c, composer, iIntValue);
            case 5:
                return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.b, this.c, composer, iIntValue);
            case 6:
                return FlowColumnOverflow.Companion.expandIndicator$lambda$0$0(this.b, this.c, composer, iIntValue);
            case 7:
                return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.b, this.c, composer, iIntValue);
            case 8:
                return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.b, this.c, composer, iIntValue);
            case 9:
                return FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.b, this.c, composer, iIntValue);
            case 10:
                return FlowRowOverflow.Companion.expandIndicator$lambda$0$0(this.b, this.c, composer, iIntValue);
            default:
                return FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.b, this.c, composer, iIntValue);
        }
    }
}
