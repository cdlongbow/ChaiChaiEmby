package defpackage;

import androidx.compose.foundation.text.modifiers.SelectionController;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gw1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionController b;

    public /* synthetic */ gw1(SelectionController selectionController, int i) {
        this.a = i;
        this.b = selectionController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SelectionController selectionController = this.b;
        switch (i) {
            case 0:
                return SelectionController.onRemembered$lambda$0(selectionController);
            case 1:
                return SelectionController.onRemembered$lambda$1(selectionController);
            default:
                return SelectionController.modifier$lambda$0(selectionController);
        }
    }
}
