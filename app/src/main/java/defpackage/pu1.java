package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.style.StyleState;
import androidx.compose.foundation.style.StyleStateKey;
import androidx.compose.foundation.style.StyleStateKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlinx.coroutines.ThreadContextElement;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pu1 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ pu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Savers_androidKt.emojiSupportMatchSaver$lambda$0((SaverScope) obj, (EmojiSupportMatch) obj2);
            case 1:
                return Savers_androidKt.LineBreakSaver$lambda$0((SaverScope) obj, (LineBreak) obj2);
            case 2:
                return Savers_androidKt.TextMotionSaver$lambda$0((SaverScope) obj, (TextMotion) obj2);
            case 3:
                return Savers_androidKt.TextMotionLinearitySaver$lambda$0((SaverScope) obj, (TextMotion.Linearity) obj2);
            case 4:
                return ScrollState.Saver$lambda$0((SaverScope) obj, (ScrollState) obj2);
            case 5:
                return SearchBarState.Companion.Saver$lambda$0((SaverScope) obj, (SearchBarState) obj2);
            case 6:
                ((Integer) obj).intValue();
                MediaItem mediaItem = (MediaItem) obj2;
                mediaItem.getClass();
                return mediaItem.getId();
            case 7:
                return SelectionRegistrarImpl.Saver$lambda$0((SaverScope) obj, (SelectionRegistrarImpl) obj2);
            case 8:
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                kClass.getClass();
                list.getClass();
                ArrayList arrayListA0 = tl0.a0(bx1.a, list, true);
                arrayListA0.getClass();
                return tl0.E(kClass, arrayListA0, new uo(list, 5));
            case 9:
                KClass kClass2 = (KClass) obj;
                List list2 = (List) obj2;
                kClass2.getClass();
                list2.getClass();
                ArrayList arrayListA1 = tl0.a0(bx1.a, list2, true);
                arrayListA1.getClass();
                xv0 xv0VarE = tl0.E(kClass2, arrayListA1, new uo(list2, 6));
                if (xv0VarE != null) {
                    return ym.b(xv0VarE);
                }
                return null;
            case 10:
                return SheetState.Companion.Saver$lambda$0((SaverScope) obj, (SheetState) obj2);
            case 11:
                return SliderState.Companion.Saver$lambda$0((SaverScope) obj, (SliderState) obj2);
            case 12:
                return Boolean.valueOf(StyleStateKt.triStateToggleOn$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 13:
                return Boolean.valueOf(StyleStateKt.focused$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 14:
                return Boolean.valueOf(StyleStateKt.pressed$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 15:
                return Boolean.valueOf(StyleStateKt.triStateToggleOff$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 16:
                return Boolean.valueOf(StyleStateKt.disabled$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 17:
                return Boolean.valueOf(StyleStateKt.selected$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 18:
                return Boolean.valueOf(StyleStateKt.hovered$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 19:
                return Boolean.valueOf(StyleStateKt.triStateToggleIndeterminate$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 20:
                return Boolean.valueOf(StyleStateKt.checked$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            case 21:
                return SwipeToDismissBoxState.Companion.Saver$lambda$2((SaverScope) obj, (SwipeToDismissBoxState) obj2);
            case 22:
                return SwipeToDismissBoxState.Companion.Saver$lambda$0((SaverScope) obj, (SwipeToDismissBoxState) obj2);
            case 23:
                return TextFieldScrollerPosition.Saver$lambda$0((SaverScope) obj, (TextFieldScrollerPosition) obj2);
            case 24:
                return TextFieldValue.Saver$lambda$0((SaverScope) obj, (TextFieldValue) obj2);
            case 25:
                return ThreadContextKt.countAll$lambda$0(obj, (CoroutineContext.Element) obj2);
            case 26:
                return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (CoroutineContext.Element) obj2);
            case 27:
                return TopAppBarState.Saver$lambda$0((SaverScope) obj, (TopAppBarState) obj2);
            default:
                return WideNavigationRailStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (WideNavigationRailState) obj2);
        }
    }
}
