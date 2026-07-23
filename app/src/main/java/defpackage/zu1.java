package defpackage;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zu1 implements KeyboardActionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ TextFieldState c;

    public /* synthetic */ zu1(Function1 function1, TextFieldState textFieldState, int i) {
        this.a = i;
        this.b = function1;
        this.c = textFieldState;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(Function0 function0) {
        switch (this.a) {
            case 0:
                SearchBarDefaults.InputField$lambda$13$lambda$12(this.b, this.c, function0);
                break;
            default:
                SearchBarDefaults.InputField$lambda$29$lambda$28(this.b, this.c, function0);
                break;
        }
    }
}
