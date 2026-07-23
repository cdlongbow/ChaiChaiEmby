package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class fy1 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;

    public fy1(boolean z, Function0 function0) {
        this.a = z;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        int keyCode = keyEventM6229unboximpl.getKeyCode();
        if ((keyCode != 23 && keyCode != 66 && keyCode != 160) || !this.a) {
            return Boolean.FALSE;
        }
        if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6238getKeyUpCS__XNY())) {
            this.b.invoke();
        }
        return Boolean.TRUE;
    }
}
