package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m62 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldDecoratorModifierNode b;
    public final /* synthetic */ int c;

    public /* synthetic */ m62(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i, int i2) {
        this.a = i2;
        this.b = textFieldDecoratorModifierNode;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b;
        switch (i) {
            case 0:
                return TextFieldDecoratorModifierNode.onImeActionPerformed_KlQnJC8$lambda$0(textFieldDecoratorModifierNode, i2);
            default:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$6(textFieldDecoratorModifierNode, i2));
        }
    }
}
