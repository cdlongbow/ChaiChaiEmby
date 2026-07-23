package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l51 implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;

    public l51(Function0 function0, List list, Function1 function1, List list2, MutableState mutableState, MutableState mutableState2) {
        this.a = function0;
        this.b = list;
        this.c = function1;
        this.d = list2;
        this.e = mutableState;
        this.g = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean z = false;
        if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            String strM5922toStringimpl = Key.m5922toStringimpl(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl));
            MutableState mutableState = this.e;
            Log.d("MoreMenu", "菜单键盘事件: key=" + strM5922toStringimpl + ", selectedIndex=" + m51.b(mutableState));
            long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
            Key.Companion companion = Key.INSTANCE;
            if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5936getBackEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6010getEscapeEK5gGoQ())) {
                this.a.invoke();
            } else {
                boolean zM5920equalsimpl0 = Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5999getDirectionUpEK5gGoQ());
                List list = this.d;
                Function1 function1 = this.c;
                List list2 = this.b;
                if (zM5920equalsimpl0) {
                    if (!list2.isEmpty() && ((Number) mutableState.getValue()).intValue() > 0) {
                        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() - 1));
                        function1.invoke(Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                        FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(((Number) mutableState.getValue()).intValue()), 0, 1, null);
                    }
                } else if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5994getDirectionDownEK5gGoQ())) {
                    if (!list2.isEmpty() && ((Number) mutableState.getValue()).intValue() < list2.size() - 1) {
                        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
                        function1.invoke(Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                        FocusRequester.m4818requestFocus3ESFkO8$default((FocusRequester) list.get(((Number) mutableState.getValue()).intValue()), 0, 1, null);
                    }
                } else if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6007getEnterEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5993getDirectionCenterEK5gGoQ())) {
                    Log.d("MoreMenu", "菜单Enter键: 当前selectedIndex=" + ((Number) mutableState.getValue()).intValue());
                    this.g.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
