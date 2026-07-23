package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ad implements Function1 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ ScrollState b;

    public ad(CoroutineScope coroutineScope, ScrollState scrollState) {
        this.a = coroutineScope;
        this.b = scrollState;
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
        boolean zM5920equalsimpl0 = Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5994getDirectionDownEK5gGoQ());
        boolean z = true;
        ScrollState scrollState = this.b;
        if (zM5920equalsimpl0 || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6119getPageDownEK5gGoQ())) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new zc(scrollState, null, 1), 3, null);
        } else if (Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m5999getDirectionUpEK5gGoQ()) || Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6120getPageUpEK5gGoQ())) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new zc(scrollState, null, 2), 3, null);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
