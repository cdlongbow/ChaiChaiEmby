package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ dw1(SelectionManager selectionManager, int i) {
        this.a = i;
        this.b = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SelectionManager selectionManager = this.b;
        switch (i) {
            case 0:
                return SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$1(selectionManager);
            case 1:
                return SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$0(selectionManager);
            case 2:
                return SelectionManager._get_modifier_$lambda$0(selectionManager);
            case 3:
                return SelectionManager._init_$lambda$4(selectionManager);
            case 4:
                return selectionManager.getContentRect();
            case 5:
                return SelectionManagerKt.contextMenuBuilder$lambda$0$0(selectionManager);
            case 6:
                return SelectionManagerKt.contextMenuBuilder$lambda$0$1(selectionManager);
            case 7:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0(selectionManager);
            case 8:
                return Boolean.valueOf(SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1(selectionManager));
            default:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2(selectionManager);
        }
    }
}
