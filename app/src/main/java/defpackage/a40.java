package defpackage;

import android.view.Choreographer;
import androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a40 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((BackgroundThreadStateHandler) obj).runInBackground(runnable);
                break;
            case 1:
                ((SimpleBasePlayer) obj).postOrRunOnApplicationHandler(runnable);
                break;
            default:
                TextInputServiceAndroid_androidKt.asExecutor$lambda$0((Choreographer) obj, runnable);
                break;
        }
    }
}
