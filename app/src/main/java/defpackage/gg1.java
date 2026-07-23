package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class gg1 implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public gg1(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4) {
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int keyCode;
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        int iM6241getTypeZmokQxo = KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl);
        KeyEventType.Companion companion = KeyEventType.INSTANCE;
        boolean zBooleanValue = false;
        if (KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion.m6237getKeyDownCS__XNY())) {
            int keyCode2 = keyEventM6229unboximpl.getKeyCode();
            if (keyCode2 != 66) {
                Function0 function0 = this.b;
                switch (keyCode2) {
                    case 21:
                        this.a.invoke();
                        function0.invoke();
                        zBooleanValue = true;
                        break;
                    case 22:
                        this.c.invoke();
                        function0.invoke();
                        zBooleanValue = true;
                        break;
                    case 23:
                        zBooleanValue = ((Boolean) this.d.invoke()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) this.d.invoke()).booleanValue();
            }
        } else if (KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion.m6238getKeyUpCS__XNY()) && ((keyCode = keyEventM6229unboximpl.getKeyCode()) == 23 || keyCode == 66)) {
            zBooleanValue = ((Boolean) this.e.invoke()).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
