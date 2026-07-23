package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class k20 implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;

    public k20(Function0 function0, List list, MutableState mutableState) {
        this.a = function0;
        this.b = list;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean z = false;
        if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            boolean zM5920equalsimpl0 = Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m6010getEscapeEK5gGoQ());
            Function0 function0 = this.a;
            if (zM5920equalsimpl0) {
                function0.invoke();
            } else {
                int keyCode = keyEventM6229unboximpl.getKeyCode();
                MutableState mutableState = this.c;
                if (keyCode == 19) {
                    mutableState.setValue(Integer.valueOf(RangesKt.coerceAtLeast(m20.b(mutableState) - 1, 0)));
                } else if (keyEventM6229unboximpl.getKeyCode() == 20) {
                    mutableState.setValue(Integer.valueOf(RangesKt.coerceAtMost(m20.b(mutableState) + 1, CollectionsKt.getLastIndex(this.b))));
                } else if (keyEventM6229unboximpl.getKeyCode() == 4) {
                    function0.invoke();
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
