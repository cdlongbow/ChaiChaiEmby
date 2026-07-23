package defpackage;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class v8 extends ViewModel {
    public final b4 a = new b4();
    public final MutableStateFlow b;
    public final StateFlow c;
    public final MutableStateFlow d;
    public final StateFlow e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public final i52 n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final AtomicLong q;
    public final LinkedHashSet r;

    public v8() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.d = MutableStateFlow2;
        this.e = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f = MutableStateFlow3;
        this.g = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.h = MutableStateFlow4;
        this.i = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.j = MutableStateFlow5;
        this.k = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(bool);
        this.l = MutableStateFlow6;
        this.m = FlowKt.asStateFlow(MutableStateFlow6);
        this.n = new i52(ViewModelKt.getViewModelScope(this), new c0(this, 3), new a5(this, 5));
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.o = MutableStateFlow7;
        this.p = FlowKt.asStateFlow(MutableStateFlow7);
        this.q = new AtomicLong(0L);
        this.r = new LinkedHashSet();
    }

    public static final Object a(v8 v8Var, int i, py1 py1Var, long j, SuspendLambda suspendLambda) {
        v8Var.getClass();
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new o7(v8Var, j, i, py1Var, (Continuation) null), suspendLambda);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void b() {
        Job job = this.n.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.q.incrementAndGet();
        this.b.setValue("");
        Boolean bool = Boolean.FALSE;
        this.h.setValue(bool);
        this.d.setValue(bool);
        this.f.setValue(CollectionsKt.emptyList());
        this.j.setValue(CollectionsKt.emptyList());
        this.l.setValue(bool);
        this.o.setValue(null);
        this.r.clear();
    }

    public final void c(String str) {
        str.getClass();
        if (StringsKt.isBlank(str)) {
            b();
        } else {
            this.b.setValue(str);
            this.n.a(str);
        }
    }
}
