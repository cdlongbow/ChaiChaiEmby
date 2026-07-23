package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class bp0 implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ ScrollState d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ x82 g;

    public bp0(String str, CoroutineScope coroutineScope, MutableState mutableState, ScrollState scrollState, Function1 function1, x82 x82Var) {
        this.a = str;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = scrollState;
        this.e = function1;
        this.g = x82Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        if (Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), Key.INSTANCE.m5999getDirectionUpEK5gGoQ())) {
            MutableState mutableState = this.c;
            if (((String) mutableState.getValue()) != null && Intrinsics.areEqual((String) mutableState.getValue(), this.a)) {
                if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
                    BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new ac(this.d, this.e, this.g, (Continuation) null, 4), 3, null);
                }
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
