package defpackage;

import android.util.Log;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.dh.myembyapp.server.SearchInputServerManager;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r6 implements DisposableEffectResult {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((SearchInputServerManager) obj2).stopServer();
                p7 p7Var = (p7) obj;
                p7Var.p.incrementAndGet();
                p7Var.k.setValue(MapsKt.emptyMap());
                break;
            case 1:
                ((Player) obj2).removeListener((j00) obj);
                break;
            case 2:
                ((LifecycleOwner) obj2).getLifecycleRegistry().removeObserver((k70) obj);
                break;
            case 3:
                ((LifecycleOwner) obj2).getLifecycleRegistry().removeObserver((yg1) obj);
                break;
            default:
                ((ExoPlayer) obj2).removeListener((eh1) obj);
                Log.d("PlayerScreen", "移除播放器监听器");
                break;
        }
    }
}
