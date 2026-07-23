package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class w80 implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;

    public w80(Function1 function1, MediaItem mediaItem, Function0 function0, boolean z, Function0 function2, boolean z2, boolean z3, Function0 function3) {
        this.a = function1;
        this.b = mediaItem;
        this.c = function0;
        this.d = z;
        this.e = function2;
        this.g = z2;
        this.h = z3;
        this.i = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean zBooleanValue = false;
        if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            boolean z = keyEventM6229unboximpl.getRepeatCount() > 0;
            long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
            Key.Companion companion = Key.INSTANCE;
            if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5999getDirectionUpEK5gGoQ())) {
                if (z) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = ((Boolean) this.a.invoke(this.b.getId())).booleanValue();
                }
            } else if (!Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5994getDirectionDownEK5gGoQ())) {
                if (this.d && Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5997getDirectionLeftEK5gGoQ())) {
                    if (!z) {
                        ((Boolean) this.e.invoke()).getClass();
                    }
                } else if (!this.g || !Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5997getDirectionLeftEK5gGoQ())) {
                    if (this.h && Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5998getDirectionRightEK5gGoQ())) {
                        if (!z) {
                            zBooleanValue = ((Boolean) this.i.invoke()).booleanValue();
                        }
                    }
                }
                zBooleanValue = true;
            } else if (!z) {
                zBooleanValue = ((Boolean) this.c.invoke()).booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
