package defpackage;

import android.content.Context;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ hw1(SelectionManager selectionManager, int i) {
        this.a = i;
        this.b = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        SelectionManager selectionManager = this.b;
        switch (i) {
            case 0:
                return SelectionManager._init_$lambda$2(selectionManager, ((Boolean) obj).booleanValue(), ((Long) obj2).longValue());
            default:
                return SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0(selectionManager, (TextContextMenuBuilderScope) obj, (Context) obj2);
        }
    }
}
