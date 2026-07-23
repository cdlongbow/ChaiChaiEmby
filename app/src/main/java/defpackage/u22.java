package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class u22 implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ MutableState d;

    public u22(List list, Function1 function1, Function0 function0, MutableState mutableState) {
        this.a = list;
        this.b = function1;
        this.c = function0;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        boolean z = false;
        if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            int keyCode = keyEventM6229unboximpl.getKeyCode();
            if (keyCode != 4) {
                List list = this.a;
                MutableState mutableState = this.d;
                if (keyCode == 23 || keyCode == 66) {
                    this.b.invoke(list.get(v22.b(mutableState)));
                } else if (keyCode == 19) {
                    mutableState.setValue(Integer.valueOf(RangesKt.coerceAtLeast(v22.b(mutableState) - 1, 0)));
                } else if (keyCode == 20) {
                    mutableState.setValue(Integer.valueOf(RangesKt.coerceAtMost(v22.b(mutableState) + 1, CollectionsKt.getLastIndex(list))));
                }
            } else {
                this.c.invoke();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
