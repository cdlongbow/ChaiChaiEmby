package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class oj0 implements Function1 {
    public final /* synthetic */ Function0 a;

    public oj0(Function0 function0) {
        this.a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        if (Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5998getDirectionRightEK5gGoQ())) {
            if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
                this.a.invoke();
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
