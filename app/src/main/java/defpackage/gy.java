package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes4.dex */
public final class gy implements Function4 {
    public final /* synthetic */ SoftwareKeyboardController a;
    public final /* synthetic */ FocusRequester b;

    public gy(SoftwareKeyboardController softwareKeyboardController, FocusRequester focusRequester) {
        this.a = softwareKeyboardController;
        this.b = focusRequester;
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
        boolean zM5920equalsimpl0 = Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5936getBackEK5gGoQ());
        FocusRequester focusRequester = this.b;
        SoftwareKeyboardController softwareKeyboardController = this.a;
        boolean z = false;
        if (!zM5920equalsimpl0 && !Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6010getEscapeEK5gGoQ())) {
            if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5998getDirectionRightEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5994getDirectionDownEK5gGoQ())) {
                if (zBooleanValue) {
                    function0.invoke();
                }
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
            }
            return Boolean.valueOf(z);
        }
        if (zBooleanValue) {
            function0.invoke();
        } else {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            FocusRequester.m4818requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
