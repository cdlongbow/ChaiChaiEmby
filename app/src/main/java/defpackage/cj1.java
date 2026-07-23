package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class cj1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ zu0 A;
    public final /* synthetic */ zu0 B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ zu0 D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ zu0 F;
    public final /* synthetic */ ln1 G;
    public final /* synthetic */ MutableState H;
    public final /* synthetic */ MutableState I;
    public final /* synthetic */ MutableState J;
    public final /* synthetic */ AtomicLong K;
    public final /* synthetic */ on1 L;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public long p;
    public long q;
    public int r;
    public final /* synthetic */ eo1 s;
    public final /* synthetic */ to1 t;
    public final /* synthetic */ String u;
    public final /* synthetic */ State v;
    public final /* synthetic */ zu0 w;
    public final /* synthetic */ zu0 x;
    public final /* synthetic */ zu0 y;
    public final /* synthetic */ zu0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj1(eo1 eo1Var, to1 to1Var, String str, State state, zu0 zu0Var, zu0 zu0Var2, zu0 zu0Var3, zu0 zu0Var4, zu0 zu0Var5, zu0 zu0Var6, MutableState mutableState, zu0 zu0Var7, Context context, zu0 zu0Var8, ln1 ln1Var, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, AtomicLong atomicLong, on1 on1Var, Continuation continuation) {
        super(2, continuation);
        this.s = eo1Var;
        this.t = to1Var;
        this.u = str;
        this.v = state;
        this.w = zu0Var;
        this.x = zu0Var2;
        this.y = zu0Var3;
        this.z = zu0Var4;
        this.A = zu0Var5;
        this.B = zu0Var6;
        this.C = mutableState;
        this.D = zu0Var7;
        this.E = context;
        this.F = zu0Var8;
        this.G = ln1Var;
        this.H = mutableState2;
        this.I = mutableState3;
        this.J = mutableState4;
        this.K = atomicLong;
        this.L = on1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new cj1(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cj1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x025a A[PHI: r1 r2 r4 r8 r9 r10 r11 r12 r13 r15 r17 r18 r23
      0x025a: PHI (r1v29 androidx.compose.runtime.MutableState) = (r1v1 androidx.compose.runtime.MutableState), (r1v30 androidx.compose.runtime.MutableState) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r2v29 androidx.compose.runtime.MutableState) = (r2v1 androidx.compose.runtime.MutableState), (r2v38 androidx.compose.runtime.MutableState) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r4v7 java.lang.Object) = (r4v0 java.lang.Object), (r4v31 java.lang.Object) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r8v13 to1) = (r8v0 to1), (r8v24 to1) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r9v26 java.lang.String) = (r9v0 java.lang.String), (r9v27 java.lang.String) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r10v8 androidx.compose.runtime.MutableState) = (r10v0 androidx.compose.runtime.MutableState), (r10v11 androidx.compose.runtime.MutableState) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r11v3 androidx.compose.runtime.MutableState) = (r11v0 androidx.compose.runtime.MutableState), (r11v5 androidx.compose.runtime.MutableState) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r12v32 java.lang.String) = (r12v0 java.lang.String), (r12v39 java.lang.String) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r13v17 android.content.Context) = (r13v0 android.content.Context), (r13v18 android.content.Context) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r15v17 java.lang.String) = (r15v0 java.lang.String), (r15v18 java.lang.String) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r17v14 java.lang.String) = (r17v0 java.lang.String), (r17v15 java.lang.String) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r18v11 long) = (r18v0 long), (r18v15 long) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r23v11 com.dh.myembyapp.data.model.MediaItem) = (r23v1 com.dh.myembyapp.data.model.MediaItem), (r23v12 com.dh.myembyapp.data.model.MediaItem) binds: [B:11:0x0200, B:14:0x0256] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0264  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x06b2 -> B:143:0x07c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x07c0 -> B:143:0x07c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 2066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
