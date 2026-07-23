package defpackage;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u62 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionManager b;

    public /* synthetic */ u62(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.a = i;
        this.b = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TextFieldSelectionManager textFieldSelectionManager = this.b;
        switch (i) {
            case 0:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$0(textFieldSelectionManager);
            case 1:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$1(textFieldSelectionManager);
            case 2:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$2(textFieldSelectionManager);
            case 3:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$3(textFieldSelectionManager);
            case 4:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0$4(textFieldSelectionManager);
            case 5:
                return Boolean.valueOf(TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$0(textFieldSelectionManager));
            case 6:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$1(textFieldSelectionManager);
            default:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3$0$2(textFieldSelectionManager);
        }
    }
}
