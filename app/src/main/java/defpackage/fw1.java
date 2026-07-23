package defpackage;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fw1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ fw1(SelectionManager selectionManager, int i) {
        this.a = i;
        this.b = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SelectionManager selectionManager = this.b;
        switch (i) {
            case 0:
                return SelectionContainerKt.SelectionContainer$lambda$10$0(selectionManager, (DisposableEffectScope) obj);
            case 1:
                return SelectionManager._init_$lambda$5(selectionManager, ((Long) obj).longValue());
            case 2:
                return SelectionManager._init_$lambda$6(selectionManager, ((Long) obj).longValue());
            case 3:
                return SelectionManager._get_modifier_$lambda$1(selectionManager, (LayoutCoordinates) obj);
            case 4:
                return SelectionManager._get_modifier_$lambda$2(selectionManager, (FocusState) obj);
            case 5:
                return SelectionManager._get_modifier_$lambda$3(selectionManager, ((Boolean) obj).booleanValue());
            case 6:
                return SelectionManager._get_contextMenuAreaModifier_$lambda$0(selectionManager, (LayoutCoordinates) obj);
            case 7:
                return SelectionManager.onSelectionChange$lambda$0(selectionManager, (Selection) obj);
            default:
                return SelectionManager._init_$lambda$0(selectionManager, ((Long) obj).longValue());
        }
    }
}
