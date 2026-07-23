package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldPointerModifier_commonKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LegacyTextFieldState b;

    public /* synthetic */ rv(LegacyTextFieldState legacyTextFieldState, int i) {
        this.a = i;
        this.b = legacyTextFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        LegacyTextFieldState legacyTextFieldState = this.b;
        switch (i) {
            case 0:
                return CoreTextFieldKt.CoreTextField$lambda$21(legacyTextFieldState, (LayoutCoordinates) obj);
            case 1:
                return LegacyTextFieldState.onValueChange$lambda$0(legacyTextFieldState, (TextFieldValue) obj);
            case 2:
                return LegacyTextFieldState.onImeActionPerformed$lambda$0(legacyTextFieldState, (ImeAction) obj);
            case 3:
                return Boolean.valueOf(LegacyTextFieldState.onImeActionPerformedWithResult$lambda$0(legacyTextFieldState, (ImeAction) obj));
            default:
                return TextFieldPointerModifier_commonKt.defaultTextFieldPointer$lambda$0(legacyTextFieldState, ((Boolean) obj).booleanValue());
        }
    }
}
