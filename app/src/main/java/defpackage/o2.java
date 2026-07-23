package defpackage;

import android.util.Log;
import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.core.view.ViewCompat;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import com.dh.myembyapp.server.ConfigServerManager;
import com.dh.myembyapp.server.DanmakuConfigServerManager;
import com.dh.myembyapp.server.DanmakuSearchInputServerManager;
import com.dh.myembyapp.server.OnlineSubtitleConfigServerManager;
import com.dh.myembyapp.server.OnlineSubtitleSearchInputServerManager;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import com.dh.myembyapp.server.SearchInputServerManager;
import com.dh.myembyapp.server.ServerIconLibraryInputServerManager;
import com.dh.myembyapp.server.WebDavSyncConfigServerManager;

import java.util.concurrent.CancellationException;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 implements DisposableEffectResult {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() throws InterruptedException {
        Float f;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ConfigServerManager) obj).stopServer();
                break;
            case 1:
                ((SearchInputServerManager) obj).stopServer();
                break;
            case 2:
                ((BackupRouteConfigServerManager) obj).stopServer();
                break;
            case 3:
                Log.d("DanmakuSearch", "【持续监控】弹窗关闭，停止键盘监控");
                Job.DefaultImpls.cancel$default((Job) obj, (CancellationException) null, 1, (Object) null);
                break;
            case 4:
                ((DanmakuSearchInputServerManager) obj).stopServer();
                break;
            case 5:
                ((DanmakuConfigServerManager) obj).stopServer();
                break;
            case 6:
                Log.d("DanmakuView", "释放AkDanmaku Player");
                ((DanmakuPlayer) obj).release();
                break;
            case 7:
                zq0 zq0Var = (zq0) obj;
                zq0Var.D++;
                Job job = zq0Var.B;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                zq0Var.B = null;
                zq0Var.u.setValue(MapsKt.emptyMap());
                zq0Var.E++;
                Job job2 = zq0Var.C;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                zq0Var.C = null;
                zq0Var.w.setValue(MapsKt.emptyMap());
                break;
            case 8:
                ((OnlineSubtitleConfigServerManager) obj).stopServer();
                break;
            case 9:
                ViewCompat.setOnApplyWindowInsetsListener((View) obj, null);
                break;
            case 10:
                ((OnlineSubtitleSearchInputServerManager) obj).stopServer();
                break;
            case 11:
                ((th1) obj).invoke(Boolean.FALSE);
                break;
            case 12:
                vg1 vg1Var = (vg1) ((State) obj).getValue();
                wg1 wg1Var = vg1Var.a;
                Job job3 = (Job) wg1Var.a.getValue();
                if (job3 != null) {
                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                }
                wg1Var.a.setValue(null);
                vg1Var.b();
                wg1 wg1Var2 = vg1Var.a;
                boolean zB = wg1Var2.b();
                MutableIntState mutableIntState = wg1Var2.f;
                MutableState mutableState = wg1Var2.e;
                if (zB && (f = (Float) mutableState.getValue()) != null) {
                    vg1Var.f.invoke(Float.valueOf(f.floatValue()));
                }
                MutableState mutableState2 = wg1Var2.c;
                Boolean bool = Boolean.FALSE;
                mutableState2.setValue(bool);
                wg1Var2.d.setValue(bool);
                mutableState.setValue(null);
                mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                wg1Var2.h.setValue(bool);
                break;
            case 13:
                ((ProxyConfigServerManager) obj).stopServer();
                break;
            case 14:
                ((ServerIconLibraryInputServerManager) obj).stopServer();
                break;
            case 15:
                hy1 hy1Var = (hy1) obj;
                hy1Var.e++;
                Job job4 = hy1Var.d;
                if (job4 != null) {
                    Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
                }
                hy1Var.d = null;
                hy1Var.j.setValue(MapsKt.emptyMap());
                break;
            default:
                ((WebDavSyncConfigServerManager) obj).stopServer();
                break;
        }
    }
}
