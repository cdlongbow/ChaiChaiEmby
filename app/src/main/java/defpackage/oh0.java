package defpackage;

import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oh0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ HandlerWrapper b;

    public /* synthetic */ oh0(HandlerWrapper handlerWrapper, int i) {
        this.a = i;
        this.b = handlerWrapper;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        this.b.post(runnable);
    }
}
