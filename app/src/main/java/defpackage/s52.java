package defpackage;

import androidx.compose.foundation.gestures.TargetedFlingBehaviorKt;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.TextFieldKeyInputKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler;
import androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.TabIndicatorOffsetNode;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerStateImpl;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s52 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ s52(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return TabIndicatorOffsetNode.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
            case 1:
                return TargetedFlingBehaviorKt.NoOnReport$lambda$0(((Float) obj).floatValue());
            case 2:
                return TextFieldKeyEventHandler.processKeyDownEvent_q0GpTC0$lambda$0$0((SelectionMovementDeletionContext) obj);
            case 3:
                return TextFieldKeyEventHandler.processKeyDownEvent_q0GpTC0$lambda$0$1((SelectionMovementDeletionContext) obj);
            case 4:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$0((TextFieldPreparedSelection) obj);
            case 5:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$1((TextFieldPreparedSelection) obj);
            case 6:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$2((TextFieldPreparedSelection) obj);
            case 7:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$3((TextFieldPreparedSelection) obj);
            case 8:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$4((TextFieldPreparedSelection) obj);
            case 9:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$5((TextFieldPreparedSelection) obj);
            case 10:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$6((TextFieldPreparedSelection) obj);
            case 11:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1$7((TextFieldPreparedSelection) obj);
            case 12:
                return TextFieldKeyInput._init_$lambda$0((TextFieldValue) obj);
            case 13:
                return TextFieldKeyInputKt.textFieldKeyInput_2WJ9YEU$lambda$0((TextFieldValue) obj);
            case 14:
                return TextFieldScrollerPosition.Saver$lambda$1((List) obj);
            case 15:
                return TextFieldSelectionManager.onValueChange$lambda$0((TextFieldValue) obj);
            case 16:
                return Boolean.valueOf(TextFieldSelectionState.observeTextToolbarVisibility$lambda$1$0((Rect) obj));
            case 17:
                return TextFieldValue.Saver$lambda$1(obj);
            case 18:
                return TextKt.Text_Z58ophY$lambda$4$lambda$3((TextLayoutResult) obj);
            case 19:
                return TextKt.Text_fLXpl1I$lambda$14$lambda$13((TextLayoutResult) obj);
            case 20:
                return TextKt.Text_IbK3jfQ$lambda$11$lambda$10((TextLayoutResult) obj);
            case 21:
                return TextKt.Text__4IGK_g$lambda$17$lambda$16((TextLayoutResult) obj);
            case 22:
                return TextLinkScope._init_$lambda$0((AnnotatedString.Range) obj);
            case 23:
                return TextLinkScope.LinksComposables$lambda$0$1$0((SemanticsPropertyReceiver) obj);
            case 24:
                return TimePickerKt.DisplaySeparator$lambda$52$lambda$51((SemanticsPropertyReceiver) obj);
            case 25:
                return TimePickerKt.VerticalTimePicker$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
            case 26:
                return TimePickerKt.HorizontalTimePicker$lambda$13$lambda$12((SemanticsPropertyReceiver) obj);
            case 27:
                return TimePickerKt.TimePickerTextField_1vLObsk$lambda$92$lambda$91$lambda$90((SemanticsPropertyReceiver) obj);
            case 28:
                return TimePickerStateImpl.Companion.Saver$lambda$1((List) obj);
            default:
                return TopAppBarState.Saver$lambda$1((List) obj);
        }
    }
}
