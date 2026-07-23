package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ s7(Function1 function1, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = function1;
        this.c = mutableState;
        this.d = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState2.setValue(Boolean.valueOf(focusState.isFocused()));
                function1.invoke(Boolean.valueOf(focusState.isFocused()));
                if (focusState.isFocused()) {
                    mutableState.setValue(TextFieldValue.m7519copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), (AnnotatedString) null, TextRangeKt.TextRange(((TextFieldValue) mutableState.getValue()).getText().length()), (TextRange) null, 5, (Object) null));
                }
                return Unit.INSTANCE;
            default:
                return BasicTextFieldKt.BasicTextField$lambda$24$0(function1, mutableState2, mutableState, (TextFieldValue) obj);
        }
    }
}
