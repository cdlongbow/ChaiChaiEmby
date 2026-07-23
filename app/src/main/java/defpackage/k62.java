package defpackage;

import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;

    public /* synthetic */ k62(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.a = i;
        this.b = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b;
        switch (i) {
            case 0:
                return TextFieldDecoratorModifierNode.focusableNode$lambda$0(textFieldDecoratorModifierNode, ((Boolean) obj).booleanValue());
            case 1:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$2(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
            case 2:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$3(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
            case 3:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$4(textFieldDecoratorModifierNode, (Offset) obj);
            case 4:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$5(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
            case 5:
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$6(textFieldDecoratorModifierNode, (DragAndDropEvent) obj);
            case 6:
                return TextFieldDecoratorModifierNode.clipboardKeyCommandsHandler$lambda$0(textFieldDecoratorModifierNode, (KeyCommand) obj);
            default:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$2(textFieldDecoratorModifierNode, (List) obj));
        }
    }
}
