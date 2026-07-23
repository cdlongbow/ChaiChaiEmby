package defpackage;

import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j62 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;

    public /* synthetic */ j62(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.a = i;
        this.b = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zApplySemantics$lambda$9;
        int i = this.a;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b;
        switch (i) {
            case 0:
                return TextFieldDecoratorModifierNode.observeUntransformedTextChanges$lambda$0(textFieldDecoratorModifierNode);
            case 1:
                zApplySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$9(textFieldDecoratorModifierNode);
                break;
            case 2:
                zApplySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$10(textFieldDecoratorModifierNode);
                break;
            case 3:
                return TextFieldDecoratorModifierNode.updateWindowFocus$lambda$0(textFieldDecoratorModifierNode);
            case 4:
                return TextFieldDecoratorModifierNode.updateNode$lambda$0(textFieldDecoratorModifierNode);
            case 5:
                return TextFieldDecoratorModifierNode._init_$lambda$0(textFieldDecoratorModifierNode);
            case 6:
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
            case 7:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$0(textFieldDecoratorModifierNode);
            case 8:
                zApplySemantics$lambda$9 = TextFieldDecoratorModifierNode.onKeyEvent_ZmokQxo$lambda$0(textFieldDecoratorModifierNode);
                break;
            case 9:
                zApplySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$11(textFieldDecoratorModifierNode);
                break;
            case 10:
                zApplySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$7(textFieldDecoratorModifierNode);
                break;
            default:
                zApplySemantics$lambda$9 = TextFieldDecoratorModifierNode.applySemantics$lambda$8(textFieldDecoratorModifierNode);
                break;
        }
        return Boolean.valueOf(zApplySemantics$lambda$9);
    }
}
