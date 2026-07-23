package defpackage;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ cd(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            case 1:
                ArchTaskExecutor.lambda$static$1(runnable);
                break;
            case 2:
                runnable.run();
                break;
            default:
                PlaybackVideoGraphWrapper.lambda$static$0(runnable);
                break;
        }
    }
}
