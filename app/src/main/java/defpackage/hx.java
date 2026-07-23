package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class hx implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MutableState e;

    public hx(Function0 function0, Function1 function1, List list, List list2, MutableState mutableState) {
        this.a = function0;
        this.b = function1;
        this.c = list;
        this.d = list2;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        if (!KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            return Boolean.FALSE;
        }
        long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
        Key.Companion companion = Key.INSTANCE;
        boolean z = true;
        if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5936getBackEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6010getEscapeEK5gGoQ())) {
            this.a.invoke();
        } else {
            boolean zM5920equalsimpl0 = Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5999getDirectionUpEK5gGoQ());
            List list = this.c;
            Function1 function1 = this.b;
            MutableState mutableState = this.e;
            if (zM5920equalsimpl0) {
                if (jx.b(mutableState) > 0) {
                    mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() - 1));
                    function1.invoke(Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                    FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(((Number) mutableState.getValue()).intValue()), 0, 1, null);
                }
            } else if (!Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5994getDirectionDownEK5gGoQ())) {
                z = false;
            } else if (jx.b(mutableState) < CollectionsKt.getLastIndex(this.d)) {
                mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
                function1.invoke(Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(((Number) mutableState.getValue()).intValue()), 0, 1, null);
            }
        }
        return Boolean.valueOf(z);
    }
}
