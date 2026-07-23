package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class kp0 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zq0 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ State d;

    public kp0(boolean z, zq0 zq0Var, MutableState mutableState, State state) {
        this.a = z;
        this.b = zq0Var;
        this.c = mutableState;
        this.d = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = Boolean.FALSE;
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        if (this.a) {
            long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
            Key.Companion companion = Key.INSTANCE;
            boolean z = Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5999getDirectionUpEK5gGoQ()) || Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5994getDirectionDownEK5gGoQ()) || Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5997getDirectionLeftEK5gGoQ()) || Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5998getDirectionRightEK5gGoQ());
            if (((rn0) this.c.getValue()) == rn0.a && ((Boolean) this.d.getValue()).booleanValue() && KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY()) && z) {
                this.b.k.setValue(bool);
            }
        }
        return bool;
    }
}
