package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class na1 implements Function4 {
    public final /* synthetic */ SoftwareKeyboardController a;
    public final /* synthetic */ RowScope b;
    public final /* synthetic */ FocusManager c;
    public final /* synthetic */ CoroutineScope d;
    public final /* synthetic */ ij1 e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ FocusRequester i;

    public na1(SoftwareKeyboardController softwareKeyboardController, RowScopeInstance rowScopeInstance, FocusManager focusManager, CoroutineScope coroutineScope, ij1 ij1Var, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester) {
        this.a = softwareKeyboardController;
        this.b = rowScopeInstance;
        this.c = focusManager;
        this.d = coroutineScope;
        this.e = ij1Var;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Function0 function0 = (Function0) obj3;
        keyEventM6229unboximpl.getClass();
        function0.getClass();
        ((Function0) obj4).getClass();
        long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
        Key.Companion companion = Key.INSTANCE;
        boolean z = true;
        if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5936getBackEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6010getEscapeEK5gGoQ())) {
            if (zBooleanValue) {
                function0.invoke();
            } else {
                ra1.d(this.a, this.c, this.d, this.e, this.g, this.h, this.i);
            }
        } else if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5998getDirectionRightEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5994getDirectionDownEK5gGoQ())) {
            if (zBooleanValue) {
                function0.invoke();
            }
            SoftwareKeyboardController softwareKeyboardController = this.a;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            FocusRequester focusRequester = this.i;
            try {
                
                Boolean.valueOf(FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null));
            } catch (Throwable th) {
                
                ResultKt.createFailure(th);
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
