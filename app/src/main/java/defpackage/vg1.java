package defpackage;

import android.os.SystemClock;
import android.util.Log;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class vg1 {
    public final wg1 a;
    public final CoroutineScope b;
    public final zh1 c;
    public final Function0 d;
    public final ei1 e;
    public final Function1 f;
    public final wy g;
    public final Function0 h;
    public final Function1 i;
    public final Function0 j;
    public final hm1 k;
    public final wh1 l;
    public final th1 m;
    public final wh1 n;
    public final th1 o;
    public final th1 p;
    public final Function0 q;

    public vg1(wg1 wg1Var, CoroutineScope coroutineScope, zh1 zh1Var, Function0 function0, ei1 ei1Var, Function1 function1, wy wyVar, Function0 function2, Function1 function3, Function0 function4, hm1 hm1Var, wh1 wh1Var, th1 th1Var, wh1 wh1Var2, th1 th1Var2, th1 th1Var3, Function0 function5) {
        wg1Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        this.a = wg1Var;
        this.b = coroutineScope;
        this.c = zh1Var;
        this.d = function0;
        this.e = ei1Var;
        this.f = function1;
        this.g = wyVar;
        this.h = function2;
        this.i = function3;
        this.j = function4;
        this.k = hm1Var;
        this.l = wh1Var;
        this.m = th1Var;
        this.n = wh1Var2;
        this.o = th1Var2;
        this.p = th1Var3;
        this.q = function5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(vg1 vg1Var) {
        wg1 wg1Var = vg1Var.a;
        boolean zB = wg1Var.b();
        MutableState mutableState = wg1Var.e;
        MutableIntState mutableIntState = wg1Var.f;
        if (zB) {
            return;
        }
        mutableState.setValue((Float) vg1Var.c.invoke());
        int i = 1;
        mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        int intValue = mutableIntState.getIntValue();
        Float f = (Float) mutableState.getValue();
        float fFloatValue = f != null ? f.floatValue() : ((Number) vg1Var.d.invoke()).floatValue();
        wg1Var.d.setValue(Boolean.TRUE);
        vg1Var.b();
        wg1Var.b.setValue(BuildersKt__Builders_commonKt.launch$default(vg1Var.b, null, null, new dz(vg1Var, intValue, null, i), 3, null));
        vg1Var.g.invoke(Integer.valueOf(intValue), Float.valueOf(fFloatValue));
        Log.d("PlayerScreen", "确认键长按触发临时倍速: 3.0x, restore=" + ((Float) mutableState.getValue()) + "x");
    }

    public static boolean c(vg1 vg1Var, long j, int i, int i2) {
        Job job;
        boolean z = (i2 & 1) == 0;
        if ((i2 & 2) != 0) {
            j = SystemClock.uptimeMillis();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        wg1 wg1Var = vg1Var.a;
        if (((!z && ((Boolean) vg1Var.l.invoke()).booleanValue()) || ((Boolean) vg1Var.k.invoke()).booleanValue()) && !wg1Var.a() && !wg1Var.b()) {
            return false;
        }
        boolean zA = wg1Var.a();
        MutableState mutableState = wg1Var.a;
        MutableState mutableState2 = wg1Var.h;
        if (!zA) {
            mutableState2.setValue(Boolean.FALSE);
        }
        Long lValueOf = Long.valueOf(j);
        if (j <= 0) {
            lValueOf = null;
        }
        wg1Var.g.setValue(Long.valueOf(lValueOf != null ? lValueOf.longValue() : SystemClock.uptimeMillis()));
        if (i > 0 || zA) {
            mutableState2.setValue(Boolean.TRUE);
        }
        if (!wg1Var.a()) {
            wg1Var.c.setValue(Boolean.TRUE);
            vg1Var.q.invoke();
            if (!wg1Var.b() && ((job = (Job) mutableState.getValue()) == null || !job.isActive())) {
                mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(vg1Var.b, null, null, new ux(vg1Var, z, null), 3, null));
            }
        }
        return true;
    }

    public final void b() {
        wg1 wg1Var = this.a;
        Job job = (Job) wg1Var.b.getValue();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        wg1Var.b.setValue(null);
    }

    public final boolean d(boolean z) {
        wg1 wg1Var = this.a;
        boolean zA = wg1Var.a();
        boolean zF = f();
        Job job = (Job) wg1Var.a.getValue();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        wg1Var.a.setValue(null);
        b();
        MutableState mutableState = wg1Var.c;
        Boolean bool = Boolean.FALSE;
        mutableState.setValue(bool);
        wg1Var.h.setValue(bool);
        if (zF) {
            return true;
        }
        if (!zA) {
            return false;
        }
        if ((!z && ((Boolean) this.l.invoke()).booleanValue()) || ((Boolean) this.k.invoke()).booleanValue()) {
            return false;
        }
        this.h.invoke();
        this.q.invoke();
        return true;
    }

    public final boolean e(int i) {
        if ((i != 21 && i != 22) || ((Boolean) this.k.invoke()).booleanValue() || ((Boolean) this.n.invoke()).booleanValue()) {
            return false;
        }
        if (!((Boolean) this.l.invoke()).booleanValue()) {
            this.o.invoke(nv.a);
            this.m.invoke(Boolean.TRUE);
        }
        Function0 function0 = this.j;
        this.i.invoke(Long.valueOf(i == 21 ? -((Number) function0.invoke()).longValue() : ((Number) function0.invoke()).longValue()));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        wg1 wg1Var = this.a;
        boolean zB = wg1Var.b();
        MutableIntState mutableIntState = wg1Var.f;
        MutableState mutableState = wg1Var.e;
        if (!zB) {
            return false;
        }
        Float f = (Float) mutableState.getValue();
        float fFloatValue = f != null ? f.floatValue() : ((Number) this.d.invoke()).floatValue();
        mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        wg1Var.d.setValue(Boolean.FALSE);
        mutableState.setValue(null);
        this.e.invoke(Float.valueOf(fFloatValue));
        this.f.invoke(Float.valueOf(fFloatValue));
        this.q.invoke();
        Log.d("PlayerScreen", "确认键长按结束，恢复倍速: " + fFloatValue + "x");
        return true;
    }
}
