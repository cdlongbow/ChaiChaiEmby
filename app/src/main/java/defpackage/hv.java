package defpackage;

import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowColumnOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowRowOverflow;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function3 b;

    public /* synthetic */ hv(Function3 function3, int i) {
        this.a = i;
        this.b = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function3 function3 = this.b;
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        switch (i) {
            case 0:
                return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(function3, flowLayoutOverflowState);
            case 1:
                return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(function3, flowLayoutOverflowState);
            case 2:
                return ContextualFlowColumnOverflow.Companion.expandIndicator$lambda$0(function3, flowLayoutOverflowState);
            case 3:
                return ContextualFlowRowOverflow.Companion.expandIndicator$lambda$0(function3, flowLayoutOverflowState);
            case 4:
                return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(function3, flowLayoutOverflowState);
            case 5:
                return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(function3, flowLayoutOverflowState);
            case 6:
                return FlowColumnOverflow.Companion.expandIndicator$lambda$0(function3, flowLayoutOverflowState);
            case 7:
                return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(function3, flowLayoutOverflowState);
            case 8:
                return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(function3, flowLayoutOverflowState);
            case 9:
                return FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(function3, flowLayoutOverflowState);
            case 10:
                return FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(function3, flowLayoutOverflowState);
            default:
                return FlowRowOverflow.Companion.expandIndicator$lambda$0(function3, flowLayoutOverflowState);
        }
    }
}
