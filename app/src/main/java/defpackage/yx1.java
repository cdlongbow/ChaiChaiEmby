package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class yx1 implements Function1 {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    public yx1(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        this.a = coroutineScope;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
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
        int iM6241getTypeZmokQxo = KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl);
        KeyEventType.Companion companion = KeyEventType.INSTANCE;
        if (KeyEventType.m6233equalsimpl0(iM6241getTypeZmokQxo, companion.m6238getKeyUpCS__XNY()) && z) {
            gy1.f(this.b, true);
            gy1.e(this.c, false);
        } else if (z2) {
            boolean zM6233equalsimpl0 = KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), companion.m6237getKeyDownCS__XNY());
            MutableState mutableState = this.e;
            MutableState mutableState2 = this.d;
            MutableState mutableState3 = this.g;
            if (zM6233equalsimpl0) {
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState2.setValue(Boolean.TRUE);
                    mutableState.setValue(Boolean.FALSE);
                    Job job = (Job) mutableState3.getValue();
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    mutableState3.setValue(BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new fy(this.d, this.e, this.b, this.h, this.c, null, 2), 3, null));
                }
            } else if (KeyEventType.m6233equalsimpl0(KeyEvent_androidKt.m6241getTypeZmokQxo(keyEventM6229unboximpl), companion.m6238getKeyUpCS__XNY())) {
                Boolean bool = Boolean.FALSE;
                mutableState2.setValue(bool);
                Job job2 = (Job) mutableState3.getValue();
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                mutableState3.setValue(null);
                zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                mutableState.setValue(bool);
            }
            zBooleanValue = false;
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
