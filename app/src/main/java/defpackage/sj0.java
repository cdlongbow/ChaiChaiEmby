package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class sj0 implements Function1 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ FocusRequester c;

    public sj0(CoroutineScope coroutineScope, MutableState mutableState, FocusRequester focusRequester) {
        this.a = coroutineScope;
        this.b = mutableState;
        this.c = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        if (Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5997getDirectionLeftEK5gGoQ())) {
            z = true;
            if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
                vj0.g(this.b, true);
                BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new ji(this.c, null, 4), 3, null);
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
