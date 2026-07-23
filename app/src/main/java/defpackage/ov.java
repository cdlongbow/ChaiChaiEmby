package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ov implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionManager b;

    public /* synthetic */ ov(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.a = i;
        this.b = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TextFieldSelectionManager textFieldSelectionManager = this.b;
        switch (i) {
            case 0:
                return CoreTextFieldKt.CoreTextField$lambda$17$0(textFieldSelectionManager, (DisposableEffectScope) obj);
            default:
                return TextFieldSelectionManager._get_contextMenuAreaModifier_$lambda$0(textFieldSelectionManager, (LayoutCoordinates) obj);
        }
    }
}
