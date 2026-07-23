package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class p41 implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ MutableIntState c;

    public p41(List list, Function0 function0, MutableIntState mutableIntState) {
        this.a = list;
        this.b = function0;
        this.c = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        if (!KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            return Boolean.FALSE;
        }
        long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
        Key.Companion companion = Key.INSTANCE;
        boolean zM5920equalsimpl0 = Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6007getEnterEK5gGoQ());
        int intValue = 0;
        List list = this.a;
        MutableIntState mutableIntState = this.c;
        if (zM5920equalsimpl0 || Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m6104getNumPadEnterEK5gGoQ()) || Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5993getDirectionCenterEK5gGoQ())) {
            boolean z = mutableIntState.getIntValue() == list.size();
            mutableIntState.setIntValue(0);
            if (z) {
                this.b.invoke();
            }
            return Boolean.TRUE;
        }
        if (!list.contains(Key.m5917boximpl(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl)))) {
            return Boolean.FALSE;
        }
        if (Key.m5919equalsimpl(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), (Key) CollectionsKt.getOrNull(list, mutableIntState.getIntValue()))) {
            intValue = mutableIntState.getIntValue() + 1;
        } else if (Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), ((Key) CollectionsKt.first(list)).m5923unboximpl())) {
            intValue = 1;
        }
        mutableIntState.setIntValue(intValue);
        return Boolean.TRUE;
    }
}
