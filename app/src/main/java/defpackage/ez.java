package defpackage;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class ez implements DisposableEffectResult {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ ez(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                Job job = (Job) mutableState.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                break;
            default:
                Job job2 = (Job) mutableState.getValue();
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                mutableState.setValue(null);
                break;
        }
    }
}
