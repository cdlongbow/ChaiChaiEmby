package defpackage;

import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ iw1(int i, Function0 function0, Function0 function1) {
        this.a = i;
        this.b = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$selectionContainerItem$0(this.b, this.c, (TextContextMenuSession) obj);
            default:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0(this.b, this.c, (TextContextMenuSession) obj);
        }
    }
}
