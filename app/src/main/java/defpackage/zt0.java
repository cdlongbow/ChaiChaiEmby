package defpackage;

import androidx.compose.foundation.layout.InsetsConsumingModifierNode;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zt0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InsetsConsumingModifierNode b;

    public /* synthetic */ zt0(InsetsConsumingModifierNode insetsConsumingModifierNode, int i) {
        this.a = i;
        this.b = insetsConsumingModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        InsetsConsumingModifierNode insetsConsumingModifierNode = this.b;
        TraversableNode traversableNode = (TraversableNode) obj;
        switch (i) {
            case 0:
                return InsetsConsumingModifierNode.invalidateChildConsumedInsets$lambda$0(insetsConsumingModifierNode, traversableNode);
            default:
                return Boolean.valueOf(InsetsConsumingModifierNode.onAttach$lambda$0(insetsConsumingModifierNode, traversableNode));
        }
    }
}
