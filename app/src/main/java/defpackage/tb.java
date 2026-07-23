package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ tb(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$43$lambda$42(function0, (GraphicsLayerScope) obj);
            case 1:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$48$lambda$47(function0, (GraphicsLayerScope) obj);
            case 2:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$18$lambda$17(function0, (DrawScope) obj);
            case 3:
                return DragGestureDetectorKt.detectDragGestures$lambda$4(function0, (PointerInputChange) obj);
            case 4:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                if (focusState.isFocused()) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$11$lambda$10$lambda$9(function0, (Throwable) obj);
            case 6:
                return NavigationItemKt.Indicator_3J_VO9M$lambda$44$lambda$43(function0, (GraphicsLayerScope) obj);
            case 7:
                return ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$7$lambda$6(function0, (SemanticsPropertyReceiver) obj);
            case 8:
                return ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$26$lambda$25(function0, (SemanticsPropertyReceiver) obj);
            case 9:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0$0(function0, (Density) obj);
            case 10:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                if (focusState2.isFocused()) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 11:
                return Float.valueOf(SheetState.anchoredDraggableState$lambda$5(function0, ((Float) obj).floatValue()));
            case 12:
                return Boolean.valueOf(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$lambda$0(function0, (DragAndDropEvent) obj));
            case 13:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$0(function0, (Density) obj);
            case 14:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                return Unit.INSTANCE;
            case 15:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                return Unit.INSTANCE;
            case 16:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                return Unit.INSTANCE;
            case 17:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                return Unit.INSTANCE;
            case 18:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                return Unit.INSTANCE;
            default:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                return Unit.INSTANCE;
        }
    }
}
