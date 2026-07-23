package defpackage;

import io.github.peerless2012.ass.AssFrame;
import io.github.peerless2012.ass.AssRender;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class kd {
    public final AssRender a;
    public final AssFrame b;
    public final ExecutorService c;
    public final ge d;

    public kd(AssRender assRender) {
        assRender.getClass();
        this.a = assRender;
        this.b = new AssFrame(null, 0);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.c = executorServiceNewSingleThreadExecutor;
        new ExecutorCompletionService(executorServiceNewSingleThreadExecutor);
        this.d = new ge(assRender);
    }
}
