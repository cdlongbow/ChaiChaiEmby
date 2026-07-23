package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class d92 implements Function1 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Function0 g;

    public d92(Function0 function0, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Function0 function1) {
        this.a = function0;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        Function0 function0 = this.a;
        if (function0 == null) {
            return Boolean.FALSE;
        }
        int keyCode = keyEventM6229unboximpl.getKeyCode();
        boolean zBooleanValue = true;
        boolean z = keyCode == 82 || keyCode == 165 || keyCode == 256 || keyCode == 226;
        boolean z2 = keyCode == 23 || keyCode == 66 || keyCode == 160;
        if (z && KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            function0.invoke();
        } else if (z2) {
            int iM6241getTypeZmokQxo = KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl);
            KeyEventType.Companion companion = KeyEventType.INSTANCE;
            boolean zM6233equalsimpl0 = KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion.m6237getKeyDownCS__XNY());
            MutableState mutableState = this.e;
            MutableState mutableState2 = this.d;
            MutableState mutableState3 = this.c;
            if (zM6233equalsimpl0) {
                if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                    mutableState3.setValue(Boolean.TRUE);
                    mutableState2.setValue(Boolean.FALSE);
                    Job job = (Job) mutableState.getValue();
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new ac(this.g, mutableState3, mutableState2, (Continuation) null, 15), 3, null));
                }
            } else if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), companion.m6238getKeyUpCS__XNY())) {
                Boolean bool = Boolean.FALSE;
                mutableState3.setValue(bool);
                Job job2 = (Job) mutableState.getValue();
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                mutableState.setValue(null);
                zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                mutableState2.setValue(bool);
            }
            zBooleanValue = false;
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
