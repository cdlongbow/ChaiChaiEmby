package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kc2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ SoftwareKeyboardController c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ kc2(Function1 function1, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState, int i) {
        this.a = i;
        this.b = function1;
        this.c = softwareKeyboardController;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        SoftwareKeyboardController softwareKeyboardController = this.c;
        Function1 function1 = this.b;
        FocusState focusState = (FocusState) obj;
        switch (i) {
            case 0:
                focusState.getClass();
                function1.invoke(focusState);
                if (!focusState.isFocused()) {
                    yc2.c(softwareKeyboardController, mutableState);
                }
                break;
            default:
                focusState.getClass();
                function1.invoke(focusState);
                if (!focusState.isFocused()) {
                    yc2.e(softwareKeyboardController, mutableState);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
