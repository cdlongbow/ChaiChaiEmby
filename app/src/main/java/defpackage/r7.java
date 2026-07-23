package defpackage;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoPrioritySortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ r7(MutableState mutableState, Function1 function1) {
        this.a = 2;
        this.c = mutableState;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                mutableState.setValue(textFieldValue);
                function1.invoke(textFieldValue.getText());
                return Unit.INSTANCE;
            case 1:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.isFocused()));
                function1.invoke(Boolean.valueOf(focusState.isFocused()));
                return Unit.INSTANCE;
            case 2:
                return ClickableTextKt.ClickableText_4YKlhWE$lambda$3$0(mutableState, function1, (TextLayoutResult) obj);
            case 3:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                function1.invoke(str);
                return Unit.INSTANCE;
            case 4:
                MediaItem mediaItem = (MediaItem) obj;
                mediaItem.getClass();
                function1.invoke(mediaItem);
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue(Boolean.FALSE);
                function1.invoke((String) obj);
                return Unit.INSTANCE;
            case 6:
                FocusState focusState2 = (FocusState) obj;
                kb0.B(mutableState, focusState2);
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(focusState2.isFocused()));
                }
                return Unit.INSTANCE;
            case 7:
                FocusState focusState3 = (FocusState) obj;
                focusState3.getClass();
                boolean hasFocus = focusState3.getHasFocus();
                mutableState.setValue(Boolean.valueOf(hasFocus));
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(hasFocus));
                }
                return Unit.INSTANCE;
            case 8:
                FocusState focusState4 = (FocusState) obj;
                focusState4.getClass();
                mutableState.setValue(Boolean.valueOf(focusState4.getHasFocus()));
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(focusState4.getHasFocus()));
                }
                return Unit.INSTANCE;
            case 9:
                FocusState focusState5 = (FocusState) obj;
                focusState5.getClass();
                mutableState.setValue(Boolean.valueOf(focusState5.getHasFocus()));
                if (focusState5.getHasFocus() && function1 != null) {
                    function1.invoke("继续观看");
                }
                return Unit.INSTANCE;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mutableState.setValue(bool);
                function1.invoke(bool);
                return Unit.INSTANCE;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                function1.invoke(bool2);
                return Unit.INSTANCE;
            case 12:
                FocusState focusState6 = (FocusState) obj;
                focusState6.getClass();
                mutableState.setValue(Boolean.valueOf(focusState6.getHasFocus()));
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(focusState6.getHasFocus()));
                }
                return Unit.INSTANCE;
            case 13:
                VideoPrioritySortType videoPrioritySortType = (VideoPrioritySortType) obj;
                videoPrioritySortType.getClass();
                function1.invoke(new VideoPriorityRule(videoPrioritySortType, null, null, 6, null));
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                SubtitlePrioritySortType subtitlePrioritySortType = (SubtitlePrioritySortType) obj;
                subtitlePrioritySortType.getClass();
                function1.invoke(subtitlePrioritySortType);
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                AudioPrioritySortType audioPrioritySortType = (AudioPrioritySortType) obj;
                audioPrioritySortType.getClass();
                function1.invoke(audioPrioritySortType);
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                FocusState focusState7 = (FocusState) obj;
                focusState7.getClass();
                mutableState.setValue(Boolean.valueOf(focusState7.getHasFocus()));
                function1.invoke(Boolean.valueOf(focusState7.getHasFocus()));
                return Unit.INSTANCE;
            case 17:
                TextFieldValue textFieldValue2 = (TextFieldValue) obj;
                textFieldValue2.getClass();
                mutableState.setValue(textFieldValue2);
                function1.invoke(textFieldValue2.getText());
                return Unit.INSTANCE;
            case 18:
                TextFieldValue textFieldValue3 = (TextFieldValue) obj;
                textFieldValue3.getClass();
                mutableState.setValue(textFieldValue3);
                function1.invoke(textFieldValue3.getText());
                return Unit.INSTANCE;
            default:
                FocusState focusState8 = (FocusState) obj;
                focusState8.getClass();
                mutableState.setValue(Boolean.valueOf(focusState8.isFocused()));
                function1.invoke(Boolean.valueOf(focusState8.isFocused()));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r7(Function1 function1, MutableState mutableState, int i) {
        this.a = i;
        this.b = function1;
        this.c = mutableState;
    }
}
