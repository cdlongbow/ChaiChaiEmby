package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.key.Key;
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
public final class fz implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ State d;

    public fz(boolean z, CoroutineScope coroutineScope, MutableState mutableState, State state) {
        this.a = z;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Job job;
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        long jM6240getKeyZmokQxo = KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl);
        Key.Companion companion = Key.INSTANCE;
        if (!Key.m5920equalsimpl0(jM6240getKeyZmokQxo, companion.m6007getEnterEK5gGoQ()) && !Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m6104getNumPadEnterEK5gGoQ()) && !Key.m5920equalsimpl0(KeyEvent_androidKt.m6240getKeyZmokQxo(keyEventM6229unboximpl), companion.m5993getDirectionCenterEK5gGoQ())) {
            return Boolean.FALSE;
        }
        int iM6241getTypeZmokQxo = KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl);
        KeyEventType.Companion companion2 = KeyEventType.INSTANCE;
        boolean zM6233equalsimpl0 = KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion2.m6237getKeyDownCS__XNY());
        MutableState mutableState = this.c;
        boolean z = true;
        if (zM6233equalsimpl0) {
            if (keyEventM6229unboximpl.getRepeatCount() == 0 && this.a && ((job = (Job) mutableState.getValue()) == null || !job.isActive())) {
                State state = this.d;
                ((Function0) state.getValue()).invoke();
                mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new n2(state, (Continuation) null, 2), 3, null));
            }
        } else if (KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion2.m6238getKeyUpCS__XNY())) {
            Job job2 = (Job) mutableState.getValue();
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            mutableState.setValue(null);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
