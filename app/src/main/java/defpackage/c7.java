package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c7 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ ScrollState c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 g;

    public c7(boolean z, CoroutineScope coroutineScope, ScrollState scrollState, Function1 function1, Function1 function2, Function0 function0) {
        this.a = z;
        this.b = coroutineScope;
        this.c = scrollState;
        this.d = function1;
        this.e = function2;
        this.g = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        if (!Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5999getDirectionUpEK5gGoQ()) || !this.a) {
            return Boolean.FALSE;
        }
        if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new q3(this.c, this.d, this.e, this.g, (Continuation) null, 1), 3, null);
        }
        return Boolean.TRUE;
    }
}
