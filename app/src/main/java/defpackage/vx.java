package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Shadow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vx implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ vx(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.isFocused()));
                break;
            case 1:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                boolean zIsFocused = focusState2.isFocused();
                Shadow shadow = u90.o;
                mutableState.setValue(Boolean.valueOf(zIsFocused));
                break;
            default:
                FocusState focusState3 = (FocusState) obj;
                focusState3.getClass();
                boolean zIsFocused2 = focusState3.isFocused();
                float f = jg1.k;
                mutableState.setValue(Boolean.valueOf(zIsFocused2));
                break;
        }
        return Unit.INSTANCE;
    }
}
