package defpackage;

import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode b;

    public /* synthetic */ vv(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.a = i;
        this.b = coreTextFieldSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zApplySemantics$lambda$8;
        int i = this.a;
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.b;
        switch (i) {
            case 0:
                return CoreTextFieldSemanticsModifierNode.updateNodeSemantics$lambda$0(coreTextFieldSemanticsModifierNode);
            case 1:
                zApplySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$8(coreTextFieldSemanticsModifierNode);
                break;
            case 2:
                zApplySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$9(coreTextFieldSemanticsModifierNode);
                break;
            case 3:
                zApplySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$10(coreTextFieldSemanticsModifierNode);
                break;
            case 4:
                return CoreTextFieldSemanticsModifierNode._init_$lambda$0(coreTextFieldSemanticsModifierNode);
            case 5:
                zApplySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$11(coreTextFieldSemanticsModifierNode);
                break;
            case 6:
                zApplySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$6(coreTextFieldSemanticsModifierNode);
                break;
            default:
                zApplySemantics$lambda$8 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$7(coreTextFieldSemanticsModifierNode);
                break;
        }
        return Boolean.valueOf(zApplySemantics$lambda$8);
    }
}
