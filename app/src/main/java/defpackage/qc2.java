package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qc2 implements Function1 {
    public final /* synthetic */ Function4 a;
    public final /* synthetic */ FocusManager b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ SoftwareKeyboardController d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ TextFieldValue h;
    public final /* synthetic */ CoroutineScope i;

    public qc2(Function4 function4, FocusManager focusManager, MutableState mutableState, SoftwareKeyboardController softwareKeyboardController, boolean z, Function1 function1, TextFieldValue textFieldValue, CoroutineScope coroutineScope) {
        this.a = function4;
        this.b = focusManager;
        this.c = mutableState;
        this.d = softwareKeyboardController;
        this.e = z;
        this.g = function1;
        this.h = textFieldValue;
        this.i = coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean zM6233equalsimpl0 = KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY());
        SoftwareKeyboardController softwareKeyboardController = this.d;
        MutableState mutableState = this.c;
        if (zM6233equalsimpl0) {
            androidx.compose.ui.input.key.KeyEvent keyEventM6223boximpl = androidx.compose.ui.input.key.KeyEvent.m6223boximpl(keyEventM6229unboximpl);
            Boolean bool = (Boolean) mutableState.getValue();
            bool.getClass();
            if (((Boolean) this.a.invoke(keyEventM6223boximpl, bool, new mc2(softwareKeyboardController, mutableState), new nc2(this.e, this.c, this.g, this.h, this.i, this.d))).booleanValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.valueOf(yc2.g(keyEventM6229unboximpl, ((Boolean) mutableState.getValue()).booleanValue(), new oc2(this.e, this.c, this.g, this.h, this.i, this.d), new pc2(softwareKeyboardController, mutableState), new dy1(this.b, 1)));
    }
}
