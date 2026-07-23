package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l80 implements Function1 {
    public final /* synthetic */ MutableState a;

    public l80(MutableState mutableState) {
        this.a = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean z = false;
        if (((Boolean) this.a.getValue()).booleanValue()) {
            long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
            Key.Companion companion = Key.INSTANCE;
            if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5999getDirectionUpEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5994getDirectionDownEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5997getDirectionLeftEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5998getDirectionRightEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5993getDirectionCenterEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6007getEnterEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6104getNumPadEnterEK5gGoQ())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
