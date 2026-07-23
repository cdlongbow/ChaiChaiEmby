package defpackage;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class ks1 {
    public static final /* synthetic */ int f = 0;
    public final hs1 a;
    public final CoroutineScope b = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new ls1(CoroutineExceptionHandler.INSTANCE)));
    public final aa c;
    public final ds d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(ks1.class, "e");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0118  */
    /* JADX WARN: Code duplicated, block: B:26:0x012f  */
    /* JADX WARN: Code duplicated, block: B:28:0x013b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0145  */
    /* JADX WARN: Code duplicated, block: B:33:0x0151  */
    /* JADX WARN: Code duplicated, block: B:36:0x015a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0177  */
    public ks1(hs1 hs1Var) {
        Object vs0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        cs0 cs0Var;
        Object obj;
        Semaphore semaphoreSemaphore$default;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        this.a = hs1Var;
        ma maVar = new ma(this);
        aa aaVar = new aa();
        aaVar.a = this;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 9;
        int i4 = 0;
        if (i2 >= 26) {
            if (!an0.a) {
                vs0Var = (i2 == 26 || i2 == 27) ? new yq(i3) : new vs0(true);
            }
            aaVar.b = vs0Var;
            this.c = aaVar;
            ab abVar = new ab(hs1Var.f);
            List list = (List) abVar.a;
            arrayList = (ArrayList) abVar.d;
            List list2 = (List) abVar.c;
            arrayList2 = (ArrayList) abVar.e;
            List list3 = (List) abVar.b;
            cs0Var = hs1Var.b;
            obj = cs0Var.n.a.get(ku.a);
            if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
                arrayList.add(new o91(i3));
                arrayList2.add(new o91(10));
            }
            list3.add(TuplesKt.to(new sa(i4), Reflection.getOrCreateKotlinClass(Uri.class)));
            list3.add(TuplesKt.to(new sa(3), Reflection.getOrCreateKotlinClass(Integer.class)));
            list2.add(TuplesKt.to(new ba(i4), Reflection.getOrCreateKotlinClass(rd2.class)));
            abVar.a(new le(i4), Reflection.getOrCreateKotlinClass(rd2.class));
            int i5 = 4;
            abVar.a(new le(i5), Reflection.getOrCreateKotlinClass(rd2.class));
            abVar.a(new le(i3), Reflection.getOrCreateKotlinClass(rd2.class));
            abVar.a(new le(6), Reflection.getOrCreateKotlinClass(Drawable.class));
            ri riVar = yr0.a;
            Object obj5 = cs0Var.n.a.get(yr0.a);
            semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(((Number) (obj5 == null ? 4 : obj5)).intValue(), 0, 2, null);
            i = Build.VERSION.SDK_INT;
            obj2 = eh0.a;
            if (i >= 29) {
                obj3 = cs0Var.n.a.get(yr0.c);
                if (((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue()) {
                    obj4 = cs0Var.n.a.get(yr0.b);
                    if (Intrinsics.areEqual((eh0) (obj4 == null ? obj2 : obj4), obj2)) {
                        arrayList2.add(new cs(new c32(semaphoreSemaphore$default), 1));
                    }
                }
            }
            Object obj6 = cs0Var.n.a.get(yr0.b);
            int i6 = 1;
            arrayList2.add(new cs(new jl(semaphoreSemaphore$default, (eh0) (obj6 != null ? obj6 : obj2)), i6));
            list3.add(TuplesKt.to(new sa(i6), Reflection.getOrCreateKotlinClass(File.class)));
            abVar.a(new le(8), Reflection.getOrCreateKotlinClass(rd2.class));
            abVar.a(new le(3), Reflection.getOrCreateKotlinClass(ByteBuffer.class));
            list3.add(TuplesKt.to(new sa(i5), Reflection.getOrCreateKotlinClass(String.class)));
            list3.add(TuplesKt.to(new sa(2), Reflection.getOrCreateKotlinClass(Path.class)));
            list2.add(TuplesKt.to(new ik0(), Reflection.getOrCreateKotlinClass(rd2.class)));
            list2.add(TuplesKt.to(new ba(1), Reflection.getOrCreateKotlinClass(rd2.class)));
            abVar.a(new le(7), Reflection.getOrCreateKotlinClass(rd2.class));
            abVar.a(new le(2), Reflection.getOrCreateKotlinClass(byte[].class));
            abVar.a(new le(5), Reflection.getOrCreateKotlinClass(rd2.class));
            abVar.a(new le(1), Reflection.getOrCreateKotlinClass(Bitmap.class));
            list.add(new gg0(this, maVar, aaVar));
            this.d = new ds(ku.P(list), ku.P(list3), ku.P(list2), ku.P(arrayList), ku.P(arrayList2));
        }
        boolean z = an0.a;
        vs0Var = new vs0(false);
        aaVar.b = vs0Var;
        this.c = aaVar;
        ab abVar2 = new ab(hs1Var.f);
        List list4 = (List) abVar2.a;
        arrayList = (ArrayList) abVar2.d;
        List list5 = (List) abVar2.c;
        arrayList2 = (ArrayList) abVar2.e;
        List list6 = (List) abVar2.b;
        cs0Var = hs1Var.b;
        obj = cs0Var.n.a.get(ku.a);
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList.add(new o91(i3));
            arrayList2.add(new o91(10));
        }
        list6.add(TuplesKt.to(new sa(i4), Reflection.getOrCreateKotlinClass(Uri.class)));
        list6.add(TuplesKt.to(new sa(3), Reflection.getOrCreateKotlinClass(Integer.class)));
        list5.add(TuplesKt.to(new ba(i4), Reflection.getOrCreateKotlinClass(rd2.class)));
        abVar2.a(new le(i4), Reflection.getOrCreateKotlinClass(rd2.class));
        int i7 = 4;
        abVar2.a(new le(i7), Reflection.getOrCreateKotlinClass(rd2.class));
        abVar2.a(new le(i3), Reflection.getOrCreateKotlinClass(rd2.class));
        abVar2.a(new le(6), Reflection.getOrCreateKotlinClass(Drawable.class));
        ri riVar2 = yr0.a;
        Object obj7 = cs0Var.n.a.get(yr0.a);
        semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(((Number) (obj7 == null ? 4 : obj7)).intValue(), 0, 2, null);
        i = Build.VERSION.SDK_INT;
        obj2 = eh0.a;
        if (i >= 29) {
            obj3 = cs0Var.n.a.get(yr0.c);
            if (((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue()) {
                obj4 = cs0Var.n.a.get(yr0.b);
                if (Intrinsics.areEqual((eh0) (obj4 == null ? obj2 : obj4), obj2)) {
                    arrayList2.add(new cs(new c32(semaphoreSemaphore$default), 1));
                }
            }
        }
        Object obj8 = cs0Var.n.a.get(yr0.b);
        int i8 = 1;
        arrayList2.add(new cs(new jl(semaphoreSemaphore$default, (eh0) (obj8 != null ? obj8 : obj2)), i8));
        list6.add(TuplesKt.to(new sa(i8), Reflection.getOrCreateKotlinClass(File.class)));
        abVar2.a(new le(8), Reflection.getOrCreateKotlinClass(rd2.class));
        abVar2.a(new le(3), Reflection.getOrCreateKotlinClass(ByteBuffer.class));
        list6.add(TuplesKt.to(new sa(i7), Reflection.getOrCreateKotlinClass(String.class)));
        list6.add(TuplesKt.to(new sa(2), Reflection.getOrCreateKotlinClass(Path.class)));
        list5.add(TuplesKt.to(new ik0(), Reflection.getOrCreateKotlinClass(rd2.class)));
        list5.add(TuplesKt.to(new ba(1), Reflection.getOrCreateKotlinClass(rd2.class)));
        abVar2.a(new le(7), Reflection.getOrCreateKotlinClass(rd2.class));
        abVar2.a(new le(2), Reflection.getOrCreateKotlinClass(byte[].class));
        abVar2.a(new le(5), Reflection.getOrCreateKotlinClass(rd2.class));
        abVar2.a(new le(1), Reflection.getOrCreateKotlinClass(Bitmap.class));
        list4.add(new gg0(this, maVar, aaVar));
        this.d = new ds(ku.P(list4), ku.P(list6), ku.P(list5), ku.P(arrayList), ku.P(arrayList2));
    }

    public final void a(fs0 fs0Var) {
        BuildersKt__Builders_commonKt.async$default(this.b, (CoroutineContext) this.a.c.getValue(), null, new is1(this, fs0Var, null, 0), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01aa A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:15:0x0037, B:94:0x0185, B:96:0x018b, B:103:0x01b0, B:105:0x01b7, B:99:0x0197, B:102:0x01aa, B:106:0x01bb, B:108:0x01bf, B:111:0x01cb, B:112:0x01d0, B:22:0x004d), top: B:138:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01b7 A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:15:0x0037, B:94:0x0185, B:96:0x018b, B:103:0x01b0, B:105:0x01b7, B:99:0x0197, B:102:0x01aa, B:106:0x01bb, B:108:0x01bf, B:111:0x01cb, B:112:0x01d0, B:22:0x004d), top: B:138:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:15:0x0037, B:94:0x0185, B:96:0x018b, B:103:0x01b0, B:105:0x01b7, B:99:0x0197, B:102:0x01aa, B:106:0x01bb, B:108:0x01bf, B:111:0x01cb, B:112:0x01d0, B:22:0x004d), top: B:138:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01bf A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:15:0x0037, B:94:0x0185, B:96:0x018b, B:103:0x01b0, B:105:0x01b7, B:99:0x0197, B:102:0x01aa, B:106:0x01bb, B:108:0x01bf, B:111:0x01cb, B:112:0x01d0, B:22:0x004d), top: B:138:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01cb A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #5 {all -> 0x003c, blocks: (B:15:0x0037, B:94:0x0185, B:96:0x018b, B:103:0x01b0, B:105:0x01b7, B:99:0x0197, B:102:0x01aa, B:106:0x01bb, B:108:0x01bf, B:111:0x01cb, B:112:0x01d0, B:22:0x004d), top: B:138:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e5 A[Catch: all -> 0x01f2, TRY_LEAVE, TryCatch #2 {all -> 0x01f2, blocks: (B:119:0x01e1, B:121:0x01e5, B:126:0x01f4, B:127:0x01f9), top: B:134:0x01e1 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01f4 A[Catch: all -> 0x01f2, TRY_ENTER, TryCatch #2 {all -> 0x01f2, blocks: (B:119:0x01e1, B:121:0x01e5, B:126:0x01f4, B:127:0x01f9), top: B:134:0x01e1 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:96:0x018b A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:15:0x0037, B:94:0x0185, B:96:0x018b, B:103:0x01b0, B:105:0x01b7, B:99:0x0197, B:102:0x01aa, B:106:0x01bb, B:108:0x01bf, B:111:0x01cb, B:112:0x01d0, B:22:0x004d), top: B:138:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX WARN: Code duplicated, block: B:99:0x0197 A[Catch: all -> 0x003c, TryCatch #5 {all -> 0x003c, blocks: (B:15:0x0037, B:94:0x0185, B:96:0x018b, B:103:0x01b0, B:105:0x01b7, B:99:0x0197, B:102:0x01aa, B:106:0x01bb, B:108:0x01bf, B:111:0x01cb, B:112:0x01d0, B:22:0x004d), top: B:138:0x0029 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [rt1] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, ks1] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, yg0] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, yg0] */
    /* JADX WARN: Type inference failed for: r3v29, types: [yg0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, yg0] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [fs0] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, yg0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [rt1] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [rt1] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rt1] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object b(fs0 fs0Var, int i, ContinuationImpl continuationImpl) {
        js1 js1Var;
        o12 o12Var;
        fs0 fs0VarA;
        rt1 rt1Var;
        Object r3;
        fs0 fs0Var2;
        Object r4;
        Object r12;
        pr0 pr0Var;
        fs0 fs0Var3;
        Object objWithContext;
        Object r5;
        Object r6;
        fs0 fs0Var4;
        js0 js0Var;
        h52 h52Var;
        d62 d62Var;
        fs0 fs0Var5;
        wb2 wb2VarA;
        es0 es0Var;
        if (continuationImpl instanceof js1) {
            js1Var = (js1) continuationImpl;
            int i2 = js1Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                js1Var.h = i2 - Integer.MIN_VALUE;
            } else {
                js1Var = new js1(this, continuationImpl);
            }
        } else {
            js1Var = new js1(this, continuationImpl);
        }
        js1 js1Var2 = js1Var;
        Object obj = js1Var2.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object r7 = js1Var2.h;
        Object r8 = 2;
        Object r9 = 1;
        try {
            try {
                if (r7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = JobKt.getJob(js1Var2.getContext());
                    boolean z = i == 0;
                    aa aaVar = this.c;
                    aaVar.getClass();
                    d62 d62Var2 = fs0Var.c;
                    Lifecycle lifecycle = (Lifecycle) tl0.u(fs0Var, is0.e);
                    if (lifecycle == null) {
                        if (!z) {
                            lifecycle = null;
                            break;
                        }
                        Object baseContext = fs0Var.a;
                        while (true) {
                            if (baseContext instanceof LifecycleOwner) {
                                lifecycle = ((LifecycleOwner) baseContext).getLifecycleRegistry();
                                break;
                            }
                            if (!(baseContext instanceof ContextWrapper)) {
                                lifecycle = null;
                                break;
                            }
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    rt1 tz0Var = lifecycle != null ? new tz0(lifecycle, job) : new mj(job);
                    tz0Var.b();
                    bs0 bs0VarA = fs0.a(fs0Var);
                    bs0VarA.b = ((ks1) aaVar.a).a.b;
                    ds0 ds0Var = fs0Var.t;
                    o12 o12Var2 = ds0Var.g;
                    if (o12Var2 == null) {
                        o12Var = o12.f;
                        bs0VarA.n = o12Var;
                    } else {
                        o12Var = o12Var2;
                    }
                    if (ds0Var.h == null) {
                        bs0VarA.o = fs0Var.q;
                    }
                    if (ds0Var.i == null) {
                        bs0VarA.p = (o12Var2 == null && Intrinsics.areEqual(o12Var, o12.f)) ? jp1.b : jp1.a;
                    }
                    fs0VarA = bs0VarA.a();
                    yg0 yg0Var = yg0.a;
                    try {
                        if (Intrinsics.areEqual(fs0VarA.b, d91.a)) {
                            throw new e91("The request's data is null.");
                        }
                        tz0Var.start();
                        if (i == 0) {
                            js1Var2.a = tz0Var;
                            js1Var2.b = fs0VarA;
                            js1Var2.c = yg0Var;
                            js1Var2.h = 1;
                            if (tz0Var.a(js1Var2) != coroutine_suspended) {
                                rt1Var = tz0Var;
                                r3 = yg0Var;
                                fs0Var2 = fs0VarA;
                                fs0VarA = fs0Var2;
                                r9 = rt1Var;
                                r7 = r3;
                            }
                        } else {
                            r9 = tz0Var;
                            r7 = yg0Var;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        r8 = fs0VarA;
                        r9 = tz0Var;
                        r7 = yg0Var;
                        if (!(th instanceof CancellationException)) {
                            r7.getClass();
                            es0 es0Var2 = r8.d;
                            throw th;
                        }
                        xg0 xg0VarA = ae2.a(r8, th);
                        e(xg0VarA, r8.c, r7);
                        r9.complete();
                        return xg0VarA;
                    }
                }
                if (r7 == 1) {
                    r7 = js1Var2.c;
                    fs0Var2 = js1Var2.b;
                    rt1Var = js1Var2.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r3 = r7;
                        fs0VarA = fs0Var2;
                        r9 = rt1Var;
                        r7 = r3;
                    } catch (Throwable th2) {
                        th = th2;
                        r8 = fs0Var2;
                        r9 = rt1Var;
                        if (!(th instanceof CancellationException)) {
                            r7.getClass();
                            es0 es0Var3 = r8.d;
                            throw th;
                        }
                        xg0 xg0VarA2 = ae2.a(r8, th);
                        e(xg0VarA2, r8.c, r7);
                        r9.complete();
                        return xg0VarA2;
                    }
                } else if (r7 == 2) {
                    pr0 pr0Var2 = js1Var2.d;
                    yg0 yg0Var2 = js1Var2.c;
                    fs0 fs0Var6 = js1Var2.b;
                    rt1 rt1Var2 = js1Var2.a;
                    ResultKt.throwOnFailure(obj);
                    r4 = yg0Var2;
                    fs0Var3 = fs0Var6;
                    r12 = rt1Var2;
                    pr0Var = pr0Var2;
                    try {
                        n12 n12Var = (n12) obj;
                        r4.getClass();
                        CoroutineContext coroutineContext = fs0Var3.g;
                        fs0VarA = fs0Var3;
                        try {
                            r3 r3Var = new r3(fs0VarA, this, n12Var, r4, pr0Var, null, 7);
                            js1Var2.a = r12;
                            js1Var2.b = fs0VarA;
                            js1Var2.c = r4;
                            js1Var2.d = null;
                            js1Var2.h = 3;
                            objWithContext = BuildersKt.withContext(coroutineContext, r3Var, js1Var2);
                            if (objWithContext != coroutine_suspended) {
                                r5 = r4;
                                r6 = r12;
                                fs0Var4 = fs0VarA;
                                obj = objWithContext;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th3) {
                            th = th3;
                            r7 = r4;
                            r9 = r12;
                            r8 = fs0VarA;
                            try {
                                if (!(th instanceof CancellationException)) {
                                    r7.getClass();
                                    es0 es0Var4 = r8.d;
                                    throw th;
                                }
                                xg0 xg0VarA3 = ae2.a(r8, th);
                                e(xg0VarA3, r8.c, r7);
                                r9.complete();
                                return xg0VarA3;
                            } catch (Throwable th4) {
                                r9.complete();
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        fs0VarA = fs0Var3;
                    }
                } else {
                    if (r7 != 3) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yg0 yg0Var3 = js1Var2.c;
                    fs0Var4 = js1Var2.b;
                    rt1 rt1Var3 = js1Var2.a;
                    ResultKt.throwOnFailure(obj);
                    r5 = yg0Var3;
                    r6 = rt1Var3;
                }
                js0Var = (js0) obj;
                if (js0Var instanceof h52) {
                    h52Var = (h52) js0Var;
                    d62Var = fs0Var4.c;
                    fs0Var5 = h52Var.b;
                    if (!(d62Var instanceof lf)) {
                        wb2VarA = ((vb2) tl0.u(fs0Var5, is0.a)).a((lf) d62Var, h52Var);
                        if (wb2VarA instanceof z81) {
                            r5.getClass();
                            wb2VarA.a();
                        }
                    }
                    r5.getClass();
                    es0Var = fs0Var5.d;
                    if (es0Var != null) {
                        es0Var.b(h52Var);
                    }
                } else {
                    if (js0Var instanceof xg0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e((xg0) js0Var, fs0Var4.c, r5);
                }
                r6.complete();
                return js0Var;
                fs0VarA.getClass();
                d62 d62Var3 = fs0VarA.c;
                if (d62Var3 != null) {
                    pr0 pr0Var3 = (pr0) fs0VarA.m.invoke(fs0VarA);
                    if (pr0Var3 == null) {
                        pr0Var3 = (pr0) fs0VarA.u.h.invoke(fs0VarA);
                    }
                    d62Var3.b(pr0Var3);
                }
                r7.getClass();
                o12 o12Var3 = fs0VarA.p;
                js1Var2.a = r9;
                js1Var2.b = fs0VarA;
                js1Var2.c = r7;
                js1Var2.d = null;
                js1Var2.h = 2;
                Object objA = o12Var3.a(js1Var2);
                if (objA != coroutine_suspended) {
                    r4 = r7;
                    r12 = r9;
                    pr0Var = null;
                    fs0Var3 = fs0VarA;
                    obj = objA;
                    n12 n12Var2 = (n12) obj;
                    r4.getClass();
                    CoroutineContext coroutineContext2 = fs0Var3.g;
                    fs0VarA = fs0Var3;
                    r3 r3Var2 = new r3(fs0VarA, this, n12Var2, r4, pr0Var, null, 7);
                    js1Var2.a = r12;
                    js1Var2.b = fs0VarA;
                    js1Var2.c = r4;
                    js1Var2.d = null;
                    js1Var2.h = 3;
                    objWithContext = BuildersKt.withContext(coroutineContext2, r3Var2, js1Var2);
                    if (objWithContext != coroutine_suspended) {
                        r5 = r4;
                        r6 = r12;
                        fs0Var4 = fs0VarA;
                        obj = objWithContext;
                        js0Var = (js0) obj;
                        if (js0Var instanceof h52) {
                            h52Var = (h52) js0Var;
                            d62Var = fs0Var4.c;
                            fs0Var5 = h52Var.b;
                            if (!(d62Var instanceof lf)) {
                                wb2VarA = ((vb2) tl0.u(fs0Var5, is0.a)).a((lf) d62Var, h52Var);
                                if (wb2VarA instanceof z81) {
                                    r5.getClass();
                                    wb2VarA.a();
                                }
                            }
                            r5.getClass();
                            es0Var = fs0Var5.d;
                            if (es0Var != null) {
                                es0Var.b(h52Var);
                            }
                        } else {
                            if (js0Var instanceof xg0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            e((xg0) js0Var, fs0Var4.c, r5);
                        }
                        r6.complete();
                        return js0Var;
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th6) {
                th = th6;
                r8 = fs0VarA;
                if (!(th instanceof CancellationException)) {
                    r7.getClass();
                    es0 es0Var5 = r8.d;
                    throw th;
                }
                xg0 xg0VarA4 = ae2.a(r8, th);
                e(xg0VarA4, r8.c, r7);
                r9.complete();
                return xg0VarA4;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final Object c(fs0 fs0Var, ContinuationImpl continuationImpl) {
        d62 d62Var = fs0Var.c;
        return ((fs0Var.p instanceof ts1) || ((Lifecycle) tl0.u(fs0Var, is0.e)) != null) ? CoroutineScopeKt.coroutineScope(new ac(this, fs0Var, (Continuation) null, 12), continuationImpl) : b(fs0Var, 1, continuationImpl);
    }

    public final os1 d() {
        return (os1) this.a.d.getValue();
    }

    public final void e(xg0 xg0Var, d62 d62Var, yg0 yg0Var) {
        fs0 fs0Var = xg0Var.b;
        if (d62Var instanceof lf) {
            wb2 wb2VarA = ((vb2) tl0.u(fs0Var, is0.a)).a((lf) d62Var, xg0Var);
            if (!(wb2VarA instanceof z81)) {
                yg0Var.getClass();
                wb2VarA.a();
            }
        }
        yg0Var.getClass();
        es0 es0Var = fs0Var.d;
        if (es0Var != null) {
            es0Var.g(xg0Var);
        }
    }
}
