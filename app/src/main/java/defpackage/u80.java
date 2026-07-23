package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class u80 implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    public u80(Function0 function0, MutableState mutableState, MutableState mutableState2) {
        this.a = function0;
        this.b = mutableState;
        this.c = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        return Boolean.valueOf(KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY()) && Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5994getDirectionDownEK5gGoQ()) && !((Boolean) this.b.getValue()).booleanValue() && !((Boolean) this.c.getValue()).booleanValue() && ((Boolean) this.a.invoke()).booleanValue());
    }
}
