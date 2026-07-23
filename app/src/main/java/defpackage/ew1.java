package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ SelectionRegistrarImpl b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ SelectionManager d;

    public /* synthetic */ ew1(SelectionManager selectionManager, SelectionRegistrarImpl selectionRegistrarImpl, Function2 function2) {
        this.d = selectionManager;
        this.b = selectionRegistrarImpl;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        SelectionManager selectionManager = this.d;
        Function2 function2 = this.c;
        SelectionRegistrarImpl selectionRegistrarImpl = this.b;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return SelectionContainerKt.SelectionContainer$lambda$9(selectionManager, selectionRegistrarImpl, function2, composer, iIntValue);
            default:
                return SelectionContainerKt.SelectionContainer$lambda$9$0(selectionRegistrarImpl, function2, selectionManager, composer, iIntValue);
        }
    }

    public /* synthetic */ ew1(SelectionRegistrarImpl selectionRegistrarImpl, Function2 function2, SelectionManager selectionManager) {
        this.b = selectionRegistrarImpl;
        this.c = function2;
        this.d = selectionManager;
    }
}
