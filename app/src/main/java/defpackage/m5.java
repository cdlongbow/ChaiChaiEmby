package defpackage;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m5(Object obj, boolean z, boolean z2, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                FocusRequester focusRequester = (FocusRequester) obj2;
                FocusProperties focusProperties = (FocusProperties) obj;
                focusProperties.getClass();
                if (focusRequester != null) {
                    focusProperties.setUp(focusRequester);
                }
                if (z2) {
                    focusProperties.setLeft(FocusRequester.INSTANCE.getCancel());
                }
                if (z) {
                    focusProperties.setRight(FocusRequester.INSTANCE.getCancel());
                }
                return Unit.INSTANCE;
            case 1:
                return AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$0$0((OffsetProvider) obj2, z2, z, (SemanticsPropertyReceiver) obj);
            default:
                return SwipeToDismissBoxKt.SwipeToDismissBox$lambda$11$lambda$10$lambda$9$lambda$8((IntSize) obj2, z2, z, (DraggableAnchorsConfig) obj);
        }
    }
}
