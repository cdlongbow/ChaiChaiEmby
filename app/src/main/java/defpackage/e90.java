package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class e90 implements Function1 {
    public final /* synthetic */ Function0 a;

    public e90(Function0 function0) {
        this.a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        return Boolean.valueOf(KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY()) && Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5999getDirectionUpEK5gGoQ()) && ((Boolean) this.a.invoke()).booleanValue());
    }
}
