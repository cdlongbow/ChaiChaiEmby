package defpackage;

import android.os.Trace;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class kf extends Painter implements RememberObserver {
    public static final vb s = new vb(3);
    public ColorFilter c;
    public boolean d;
    public Job e;
    public CoroutineScope h;
    public Function1 j;
    public of m;
    public df n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableState a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    public float b = 1.0f;
    public long g = Size.INSTANCE.m4989getUnspecifiedNHjbRc();
    public Function1 i = s;
    public ContentScale k = ContentScale.INSTANCE.getFit();
    public int l = DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I();

    public kf(df dfVar) {
        this.n = dfVar;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(dfVar);
        this.o = MutableStateFlow;
        this.p = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(ef.a);
        this.q = MutableStateFlow2;
        this.r = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final fs0 a(kf kfVar, fs0 fs0Var, boolean z) {
        o12 o12Var = fs0Var.p;
        bs0 bs0VarA = fs0.a(fs0Var);
        bs0VarA.d = new aa(fs0Var, kfVar);
        ds0 ds0Var = fs0Var.t;
        if (ds0Var.g == null) {
            bs0VarA.n = o12.f;
        }
        if (ds0Var.h == null) {
            ContentScale contentScale = kfVar.k;
            int i = be2.b;
            ContentScale.Companion companion = ContentScale.INSTANCE;
            bs0VarA.o = (Intrinsics.areEqual(contentScale, companion.getFit()) || Intrinsics.areEqual(contentScale, companion.getInside())) ? uu1.b : uu1.a;
        }
        if (ds0Var.i == null) {
            bs0VarA.p = jp1.b;
        }
        if (z) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            bs0VarA.h = emptyCoroutineContext;
            bs0VarA.i = emptyCoroutineContext;
            bs0VarA.j = emptyCoroutineContext;
        }
        return bs0VarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void b(kf kfVar, jf jfVar) {
        js0 js0Var;
        Painter painterA;
        Function1 function1;
        Object objA;
        RememberObserver rememberObserver;
        RememberObserver rememberObserver2;
        MutableStateFlow mutableStateFlow = kfVar.q;
        jf jfVar2 = (jf) mutableStateFlow.getValue();
        jf jfVar3 = (jf) kfVar.i.invoke(jfVar);
        mutableStateFlow.setValue(jfVar3);
        ContentScale contentScale = kfVar.k;
        if (!(jfVar3 instanceof hf)) {
            if (jfVar3 instanceof ff) {
                js0Var = ((ff) jfVar3).b;
            } else {
                painterA = null;
            }
            if (painterA == null) {
                painterA = jfVar3.a();
            }
            kfVar.a.setValue(painterA);
            if (jfVar2.a() != jfVar3.a()) {
                objA = jfVar2.a();
                if (objA instanceof RememberObserver) {
                    rememberObserver = (RememberObserver) objA;
                } else {
                    rememberObserver = null;
                }
                if (rememberObserver != null) {
                    rememberObserver.onForgotten();
                }
                Object objA2 = jfVar3.a();
                rememberObserver2 = objA2 instanceof RememberObserver ? (RememberObserver) objA2 : null;
                if (rememberObserver2 != null) {
                    rememberObserver2.onRemembered();
                }
            }
            function1 = kfVar.j;
            if (function1 != null) {
                function1.invoke(jfVar3);
            }
        }
        js0Var = ((hf) jfVar3).b;
        wb2 wb2VarA = ((vb2) tl0.u(js0Var.a(), is0.a)).a(mf.a, js0Var);
        if (wb2VarA instanceof aw) {
            Painter painterA2 = jfVar2.a();
            if (!(jfVar2 instanceof gf)) {
                painterA2 = null;
            }
            Painter painterA3 = jfVar3.a();
            Duration.Companion companion = Duration.INSTANCE;
            painterA = new yv(painterA2, painterA3, contentScale, DurationKt.toDuration(((aw) wb2VarA).c, DurationUnit.MILLISECONDS), ((js0Var instanceof h52) && ((h52) js0Var).g) ? false : true, ((Boolean) tl0.u(js0Var.a(), tl0.b)).booleanValue());
        } else {
            painterA = null;
        }
        if (painterA == null) {
            painterA = jfVar3.a();
        }
        kfVar.a.setValue(painterA);
        if (jfVar2.a() != jfVar3.a()) {
            objA = jfVar2.a();
            if (objA instanceof RememberObserver) {
                rememberObserver = (RememberObserver) objA;
            } else {
                rememberObserver = null;
            }
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object objA3 = jfVar3.a();
            if (objA3 instanceof RememberObserver) {
            }
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        function1 = kfVar.j;
        if (function1 != null) {
            function1.invoke(jfVar3);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.b = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.c = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Painter c() {
        return (Painter) this.a.getValue();
    }

    public final void d() {
        df dfVar = this.n;
        if (dfVar == null) {
            return;
        }
        CoroutineScope coroutineScope = this.h;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scope");
            coroutineScope = null;
        }
        ac acVar = new ac(this, dfVar, (Continuation) null, 1);
        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
        int i = be2.b;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
        Job jobLaunch = (coroutineDispatcher == null || Intrinsics.areEqual(coroutineDispatcher, Dispatchers.getUnconfined())) ? BuildersKt.launch(coroutineScope, Dispatchers.getUnconfined(), CoroutineStart.UNDISPATCHED, acVar) : BuildersKt.launch(CoroutineScopeKt.CoroutineScope(new j40(coroutineScope.getCoroutineContext())), new k40(coroutineDispatcher), CoroutineStart.UNDISPATCHED, acVar);
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.e = jobLaunch;
    }

    public final void e(df dfVar) {
        if (Intrinsics.areEqual(this.n, dfVar)) {
            return;
        }
        this.n = dfVar;
        if (dfVar == null) {
            Job job = this.e;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.e = null;
        } else if (this.d) {
            d();
        }
        if (dfVar != null) {
            this.o.setValue(dfVar);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        Painter painterC = c();
        return painterC != null ? painterC.getIntrinsicSize() : Size.INSTANCE.m4989getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.e = null;
        Object objC = c();
        RememberObserver rememberObserver = objC instanceof RememberObserver ? (RememberObserver) objC : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
        this.d = false;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        long jMo5620getSizeNHjbRc = drawScope.mo5620getSizeNHjbRc();
        if (!Size.m4977equalsimpl0(this.g, jMo5620getSizeNHjbRc)) {
            this.g = jMo5620getSizeNHjbRc;
        }
        Painter painterC = c();
        if (painterC != null) {
            painterC.m5771drawx_KDEd0(drawScope, drawScope.mo5620getSizeNHjbRc(), this.b, this.c);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.e = null;
        Object objC = c();
        RememberObserver rememberObserver = objC instanceof RememberObserver ? (RememberObserver) objC : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
        this.d = false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objC = c();
            RememberObserver rememberObserver = objC instanceof RememberObserver ? (RememberObserver) objC : null;
            if (rememberObserver != null) {
                rememberObserver.onRemembered();
            }
            d();
            this.d = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }
}
