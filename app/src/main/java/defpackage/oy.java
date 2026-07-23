package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class oy implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;

    public oy(Function0 function0, Function0 function1) {
        this.a = function0;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean zBooleanValue = false;
        if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
            Key.Companion companion = Key.INSTANCE;
            if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5997getDirectionLeftEK5gGoQ())) {
                zBooleanValue = ((Boolean) this.a.invoke()).booleanValue();
            } else if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5998getDirectionRightEK5gGoQ())) {
                zBooleanValue = ((Boolean) this.b.invoke()).booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
