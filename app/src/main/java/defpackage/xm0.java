package defpackage;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xm0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                HandlerDispatcherKt.postFrameCallback$lambda$5((CancellableContinuation) obj, j);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
