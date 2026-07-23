package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fx implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ fx(int i, Function1 function1, MutableState mutableState, int i2) {
        this.a = i2;
        this.b = i;
        this.c = function1;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        Function1 function1 = this.c;
        int i2 = this.b;
        FocusState focusState = (FocusState) obj;
        switch (i) {
            case 0:
                focusState.getClass();
                if (focusState.isFocused()) {
                    mutableState.setValue(Integer.valueOf(i2));
                    function1.invoke(Integer.valueOf(i2));
                }
                break;
            default:
                focusState.getClass();
                if (focusState.isFocused()) {
                    mutableState.setValue(Integer.valueOf(i2));
                    function1.invoke(Integer.valueOf(i2));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
