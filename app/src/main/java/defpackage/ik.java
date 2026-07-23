package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionState b;

    public /* synthetic */ ik(TextFieldSelectionState textFieldSelectionState, int i) {
        this.a = i;
        this.b = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zTextFieldCursorHandle$lambda$0$0;
        int i = this.a;
        TextFieldSelectionState textFieldSelectionState = this.b;
        switch (i) {
            case 0:
                zTextFieldCursorHandle$lambda$0$0 = BasicTextFieldKt.TextFieldCursorHandle$lambda$0$0(textFieldSelectionState);
                break;
            case 1:
                return BasicTextFieldKt.TextFieldSelectionHandles$lambda$0$0(textFieldSelectionState);
            case 2:
                return BasicTextFieldKt.TextFieldSelectionHandles$lambda$4$0(textFieldSelectionState);
            case 3:
                return textFieldSelectionState.getDerivedVisibleContentBounds$foundation();
            case 4:
                return TextFieldSelectionState.derivedVisibleContentBounds_delegate$lambda$0(textFieldSelectionState);
            case 5:
                return TextFieldSelectionState.observeTextChanges$lambda$0(textFieldSelectionState);
            case 6:
                zTextFieldCursorHandle$lambda$0$0 = TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0(textFieldSelectionState);
                break;
            case 7:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1(textFieldSelectionState);
            default:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2(textFieldSelectionState);
        }
        return Boolean.valueOf(zTextFieldCursorHandle$lambda$0$0);
    }
}
