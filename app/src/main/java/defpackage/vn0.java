package defpackage;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ vn0(int i, String str, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                if (focusState.getHasFocus() && function1 != null) {
                    function1.invoke(str);
                }
                return Unit.INSTANCE;
            default:
                return SearchBarDefaults.InputField$lambda$42$lambda$41(function1, str, (KeyboardActionScope) obj);
        }
    }
}
