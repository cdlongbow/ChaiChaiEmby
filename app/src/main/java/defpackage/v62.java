package defpackage;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v62 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ v62(CoroutineScope coroutineScope, Function1 function1, int i) {
        this.a = i;
        this.b = coroutineScope;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(this.b, this.c);
            default:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(this.b, this.c);
        }
    }
}
