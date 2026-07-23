package defpackage;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class an1 implements DisposableEffectResult {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ Object d;

    public an1(ln1 ln1Var, MutableState mutableState, MutableState mutableState2) {
        this.d = ln1Var;
        this.b = mutableState;
        this.c = mutableState2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.a;
        Object obj = this.d;
        MutableState mutableState = this.c;
        MutableState mutableState2 = this.b;
        switch (i) {
            case 0:
                nn1 nn1Var = ((ln1) obj).a;
                Job job = (Job) nn1Var.h.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                nn1Var.h.setValue(null);
                nn1Var.g.setValue(null);
                mutableState2.setValue(null);
                mutableState.setValue(null);
                break;
            default:
                MutableState mutableState3 = (MutableState) obj;
                Boolean bool = Boolean.FALSE;
                mutableState2.setValue(bool);
                mutableState.setValue(bool);
                Job job2 = (Job) mutableState3.getValue();
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                mutableState3.setValue(null);
                break;
        }
    }

    public an1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
    }
}
