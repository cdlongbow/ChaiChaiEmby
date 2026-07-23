package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Shadow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d90 implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ rg0 b;
    public final /* synthetic */ MutableState c;

    public d90(Function1 function1, rg0 rg0Var, MutableState mutableState) {
        this.a = function1;
        this.b = rg0Var;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FocusState focusState = (FocusState) obj;
        focusState.getClass();
        boolean zIsFocused = focusState.isFocused();
        Shadow shadow = u90.o;
        this.c.setValue(Boolean.valueOf(zIsFocused));
        if (focusState.isFocused()) {
            this.a.invoke(this.b.a);
        }
        return Unit.INSTANCE;
    }
}
