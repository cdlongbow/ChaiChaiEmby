package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class wp0 implements Function1 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;

    public wp0(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.a = coroutineScope;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        int keyCode = keyEventM6229unboximpl.getKeyCode();
        boolean zBooleanValue = true;
        boolean z = keyCode == 82 || keyCode == 165 || keyCode == 256 || keyCode == 226;
        boolean z2 = keyCode == 23 || keyCode == 66 || keyCode == 160;
        MutableState mutableState = this.b;
        if (z && KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY())) {
            mutableState.setValue(Boolean.valueOf(!bq0.T(mutableState)));
        } else if (z2) {
            int iM6241getTypeZmokQxo = KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl);
            KeyEventType.Companion companion = KeyEventType.INSTANCE;
            boolean zM6233equalsimpl0 = KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion.m6237getKeyDownCS__XNY());
            MutableState mutableState2 = this.e;
            MutableState mutableState3 = this.d;
            MutableState mutableState4 = this.c;
            if (zM6233equalsimpl0) {
                if (!((Boolean) mutableState4.getValue()).booleanValue()) {
                    mutableState4.setValue(Boolean.TRUE);
                    mutableState3.setValue(Boolean.FALSE);
                    Job job = (Job) mutableState2.getValue();
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    mutableState2.setValue(BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new ac(mutableState4, mutableState3, mutableState, (Continuation) null, 5), 3, null));
                }
            } else if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), companion.m6238getKeyUpCS__XNY())) {
                Boolean bool = Boolean.FALSE;
                mutableState4.setValue(bool);
                Job job2 = (Job) mutableState2.getValue();
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                mutableState2.setValue(null);
                zBooleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                mutableState3.setValue(bool);
            }
            zBooleanValue = false;
        } else if (keyCode == 4 && KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), KeyEventType.INSTANCE.m6237getKeyDownCS__XNY()) && bq0.T(mutableState)) {
            mutableState.setValue(Boolean.FALSE);
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
