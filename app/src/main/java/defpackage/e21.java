package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final class e21 extends FutureTask {
    public f21 a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.a.f((d21) get());
            } catch (InterruptedException | ExecutionException e) {
                this.a.f(new d21(e));
            }
        } finally {
            this.a = null;
        }
    }
}
