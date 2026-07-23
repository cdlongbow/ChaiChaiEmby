package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.concurrent.CancellationException;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.Call;

/* JADX INFO: loaded from: classes4.dex */
public final class vc {
    public final Context a;
    public final CoroutineScope b;
    public c c;
    public final UserPreferences d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public final MutableState l;
    public final MutableState m;
    public final MutableIntState n;
    public Job o;
    public boolean p;
    public long q;

    public vc(Context context, CoroutineScope coroutineScope) {
        context.getClass();
        coroutineScope.getClass();
        this.a = context;
        this.b = coroutineScope;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        UserPreferences userPreferences = new UserPreferences(applicationContext);
        this.d = userPreferences;
        Boolean bool = Boolean.FALSE;
        this.e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.i = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.j = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.k = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.l = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.m = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.n = SnapshotIntStateKt.mutableIntStateOf(0);
        MutableState mutableState = qc.a;
        qc.b.setValue(Boolean.valueOf(userPreferences.getAppUpdateStartupLastHasUpdate("0.3.0")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (e()) {
            this.q++;
            this.p = true;
            pc.c = true;
            Log.i("AppUpdateRepository", "收到取消更新下载请求，准备中断当前下载");
            Call call = pc.b;
            if (call != null) {
                call.cancel();
            }
            Job job = this.o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.o = null;
            g(false);
            this.n.setIntValue(0);
            String strConcat = (String) this.h.getValue();
            if (strConcat == null) {
                strConcat = "";
            }
            if (!StringsKt__StringsKt.contains$default(strConcat, (CharSequence) "下载已取消，可再次点击“下载更新”重试", false, 2, (Object) null)) {
                strConcat = StringsKt.isBlank(strConcat) ? "下载已取消，可再次点击“下载更新”重试" : strConcat.concat("\n\n下载已取消，可再次点击“下载更新”重试");
            }
            i(strConcat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (((Boolean) this.e.getValue()).booleanValue() || e() || ((Boolean) qc.a.getValue()).booleanValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new sc(this, null, 0), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (((Boolean) this.e.getValue()).booleanValue() || e() || ((Boolean) qc.a.getValue()).booleanValue()) {
            return;
        }
        UserPreferences userPreferences = this.d;
        boolean appUpdateStartupLastHasUpdate = userPreferences.getAppUpdateStartupLastHasUpdate("0.3.0");
        MutableState mutableState = qc.b;
        mutableState.setValue(Boolean.valueOf(appUpdateStartupLastHasUpdate));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - userPreferences.getAppUpdateStartupLastCheckTimeMs("0.3.0") < 1200000) {
            return;
        }
        k(jCurrentTimeMillis, ((Boolean) mutableState.getValue()).booleanValue());
        BuildersKt__Builders_commonKt.launch$default(qc.c, null, null, new tc(this, jCurrentTimeMillis, null, 0), 3, null);
    }

    public final void d() {
        this.p = false;
        this.o = null;
        j(null);
        i(null);
        this.i.setValue(Boolean.FALSE);
        this.j.setValue(null);
        this.k.setValue(null);
        f(null);
        h(null);
        this.n.setIntValue(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final void f(String str) {
        this.l.setValue(str);
    }

    public final void g(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void h(String str) {
        this.m.setValue(str);
    }

    public final void i(String str) {
        this.h.setValue(str);
    }

    public final void j(String str) {
        this.g.setValue(str);
    }

    public final void k(long j, boolean z) {
        this.d.saveAppUpdateStartupCheckCache(j, z, "0.3.0");
        qc.b.setValue(Boolean.valueOf(z));
    }
}
