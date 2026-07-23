package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class on0 implements Function1 {
    public final /* synthetic */ MutableState a;

    public on0(MutableState mutableState) {
        this.a = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        MutableState mutableState = this.a;
        if (!((Boolean) mutableState.getValue()).booleanValue()) {
            return Boolean.FALSE;
        }
        int keyCode = keyEventM6229unboximpl.getKeyCode();
        if (keyCode == 23 || keyCode == 66 || keyCode == 160) {
            if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6238getKeyUpCS__XNY())) {
                mutableState.setValue(Boolean.FALSE);
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
