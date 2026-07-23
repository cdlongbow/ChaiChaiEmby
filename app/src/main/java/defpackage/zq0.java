package defpackage;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zq0 extends ViewModel {
    public Job A;
    public Job B;
    public Job C;
    public long D;
    public long E;
    public boolean F;
    public long G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final LinkedHashMap L;
    public long M;
    public final LinkedHashMap N;
    public final LinkedHashSet O;
    public final LinkedHashSet P;
    public aa Q;
    public String R;
    public jn0 S;
    public final MutableStateFlow T;
    public final StateFlow U;
    public final MutableStateFlow V;
    public final StateFlow W;
    public final uf0 a = new uf0();
    public final ky1 b = new ky1();
    public final MutableStateFlow c;
    public final StateFlow d;
    public final MutableStateFlow e;
    public final StateFlow f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public final MutableStateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;
    public Job y;
    public Job z;

    public zq0() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(fq0.a);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.e = MutableStateFlow2;
        this.f = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.g = MutableStateFlow3;
        this.h = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.i = MutableStateFlow4;
        this.j = FlowKt.asStateFlow(MutableStateFlow4);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.k = MutableStateFlow5;
        this.l = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(sn0.a);
        this.m = MutableStateFlow6;
        this.n = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(bool);
        this.o = MutableStateFlow7;
        this.p = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.q = MutableStateFlow8;
        this.r = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(null);
        this.s = MutableStateFlow9;
        this.t = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.u = MutableStateFlow10;
        this.v = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.w = MutableStateFlow11;
        this.x = FlowKt.asStateFlow(MutableStateFlow11);
        this.H = true;
        this.L = new LinkedHashMap();
        this.N = new LinkedHashMap();
        this.O = new LinkedHashSet();
        this.P = new LinkedHashSet();
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(rn0.a);
        this.T = MutableStateFlow12;
        this.U = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this.V = MutableStateFlow13;
        this.W = FlowKt.asStateFlow(MutableStateFlow13);
    }

    public static ArrayList L(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            MediaItem mediaItem2 = null;
            try {
                if (StringsKt.isBlank(mediaItem.getId()) || StringsKt.isBlank(mediaItem.getName()) || StringsKt.isBlank(mediaItem.getType())) {
                    mediaItem = null;
                }
                mediaItem2 = mediaItem;
            } catch (Exception unused) {
            }
            if (mediaItem2 != null) {
                arrayList.add(mediaItem2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void O(zq0 zq0Var, String str, String str2, sn0 sn0Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            sn0Var = sn0.a;
        }
        zq0Var.N(str, str3, null, null, sn0Var);
    }

    public static final void a(zq0 zq0Var, String str, long j) {
        synchronized (zq0Var.L) {
            try {
                Long l = (Long) zq0Var.L.get(str);
                if (l != null && l.longValue() == j) {
                    zq0Var.L.remove(str);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0112 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0120 A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012c A[Catch: all -> 0x00cc, TryCatch #3 {all -> 0x00cc, blocks: (B:38:0x00ab, B:40:0x00af, B:43:0x00b7, B:45:0x00be, B:48:0x00c5, B:50:0x00c9, B:54:0x00d1, B:55:0x00d5, B:57:0x00d9, B:60:0x00e2, B:62:0x00e9, B:68:0x0100, B:70:0x0105, B:71:0x0108, B:73:0x0112, B:74:0x0115, B:61:0x00e5, B:58:0x00dc, B:77:0x0120, B:79:0x012c, B:80:0x0130, B:93:0x0170, B:35:0x008b), top: B:110:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final Object b(zq0 zq0Var, String str, Library library, long j, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        rq0 rq0Var;
        boolean z2;
        Object objK;
        od0 od0Var;
        List listEmptyList;
        rx0 rx0Var;
        int size;
        int size2;
        Library library2;
        Library library3 = library;
        long j2 = j;
        if (continuationImpl instanceof rq0) {
            rq0Var = (rq0) continuationImpl;
            int i = rq0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rq0Var.h = i - Integer.MIN_VALUE;
            } else {
                rq0Var = new rq0(zq0Var, continuationImpl);
            }
        } else {
            rq0Var = new rq0(zq0Var, continuationImpl);
        }
        rq0 rq0Var2 = rq0Var;
        Object obj = rq0Var2.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rq0Var2.h;
        boolean z3 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (zq0Var.H && zq0Var.C(j2) && !zq0Var.z(library3.getId()) && !zq0Var.D(library3.getId())) {
                String id = library3.getId();
                synchronized (zq0Var.O) {
                    if (!zq0Var.O.contains(id)) {
                        zq0Var.O.add(id);
                        try {
                            Function1 sq0Var = new sq0(zq0Var, str, library3, null);
                            rq0Var2.a = null;
                            rq0Var2.b = library3;
                            rq0Var2.c = j2;
                            z2 = z;
                            rq0Var2.d = z2;
                            rq0Var2.h = 1;
                            objK = zq0Var.K(2, 1500L, sq0Var, rq0Var2);
                            if (objK == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (zq0Var.H) {
                                if (Result.m8832isSuccessimpl(objK)) {
                                    String name = library3.getName();
                                    Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objK);
                                    if (thM8828exceptionOrNullimpl != null) {
                                    }
                                    Log.w("HomeViewModel", "后台预取失败: " + name + ", error=" + (thM8828exceptionOrNullimpl != null ? thM8828exceptionOrNullimpl.getMessage() : null));
                                    if (!zq0Var.k(library3.getId())) {
                                    }
                                    zq0Var.l(library3.getId());
                                    if (z3) {
                                        zq0Var.F(library3.getId());
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (Result.m8831isFailureimpl(objK)) {
                                    objK = null;
                                }
                                od0Var = (od0) objK;
                                if (od0Var != null) {
                                }
                                if (listEmptyList == null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                if (od0Var != null) {
                                    size = od0Var.b;
                                } else {
                                    size = listEmptyList.size();
                                }
                                if (od0Var != null) {
                                    size2 = od0Var.b;
                                } else {
                                    size2 = listEmptyList.size();
                                }
                                library2 = library3;
                                rx0Var = new rx0(library2, listEmptyList, size, size2 > listEmptyList.size(), false);
                                zq0Var.e(rx0Var);
                                if (z2) {
                                    zq0Var.J(j2, rx0Var);
                                }
                                if (zq0Var.k(library3.getId())) {
                                    zq0Var.H(j2, rx0Var);
                                }
                                library3.getName();
                                listEmptyList.size();
                                z3 = false;
                                zq0Var.l(library3.getId());
                                if (z3) {
                                    zq0Var.F(library3.getId());
                                }
                                return Unit.INSTANCE;
                            }
                            Unit unit = Unit.INSTANCE;
                            zq0Var.l(library3.getId());
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z4 = rq0Var2.d;
        j2 = rq0Var2.c;
        Library library4 = rq0Var2.b;
        try {
            ResultKt.throwOnFailure(obj);
            objK = ((Result) obj).getValue();
            z2 = z4;
            library3 = library4;
            if (zq0Var.H && zq0Var.C(j2)) {
                if (Result.m8832isSuccessimpl(objK)) {
                    String name2 = library3.getName();
                    Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(objK);
                    Log.w("HomeViewModel", "后台预取失败: " + name2 + ", error=" + (thM8828exceptionOrNullimpl2 != null ? thM8828exceptionOrNullimpl2.getMessage() : null));
                    if (!zq0Var.k(library3.getId())) {
                    }
                    zq0Var.l(library3.getId());
                    if (z3 && zq0Var.H && zq0Var.C(j2)) {
                        zq0Var.F(library3.getId());
                    }
                    return Unit.INSTANCE;
                }
                if (Result.m8831isFailureimpl(objK)) {
                    objK = null;
                }
                od0Var = (od0) objK;
                listEmptyList = od0Var != null ? od0Var.a : null;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (od0Var != null) {
                    size = od0Var.b;
                } else {
                    size = listEmptyList.size();
                }
                if (od0Var != null) {
                    size2 = od0Var.b;
                } else {
                    size2 = listEmptyList.size();
                }
                library2 = library3;
                try {
                    rx0Var = new rx0(library2, listEmptyList, size, size2 > listEmptyList.size(), false);
                    zq0Var.e(rx0Var);
                    if (z2) {
                        zq0Var.J(j2, rx0Var);
                    }
                    if (zq0Var.k(library3.getId())) {
                        zq0Var.H(j2, rx0Var);
                    }
                    library3.getName();
                    listEmptyList.size();
                } catch (Throwable th2) {
                    th = th2;
                    library3 = library2;
                }
                z3 = false;
                zq0Var.l(library3.getId());
                if (z3) {
                    zq0Var.F(library3.getId());
                }
                return Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
            zq0Var.l(library3.getId());
            return unit2;
        } catch (Throwable th3) {
            th = th3;
            library3 = library4;
        }
        zq0Var.l(library3.getId());
        throw th;
    }

    public static final boolean c(zq0 zq0Var, String str, String str2, boolean z, long j, jn0 jn0Var) {
        dq0 dq0VarD;
        rx0 rx0VarA;
        try {
            aa aaVar = zq0Var.Q;
            if (aaVar != null && (dq0VarD = aaVar.d(str2, str, z)) != null && zq0Var.C(j)) {
                List libraries = dq0VarD.getLibraries();
                ArrayList arrayList = new ArrayList();
                Iterator it = libraries.iterator();
                while (true) {
                    Library library = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Library library2 = (Library) it.next();
                    try {
                        if (!StringsKt.isBlank(library2.getId()) && !StringsKt.isBlank(library2.getName())) {
                            library = library2;
                        }
                    } catch (Exception unused) {
                    }
                    if (library != null) {
                        arrayList.add(library);
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    linkedHashMap.put(((Library) obj).getId(), obj);
                }
                List<rx0> libraryContents = dq0VarD.getLibraryContents();
                ArrayList arrayList2 = new ArrayList();
                for (rx0 rx0Var : libraryContents) {
                    try {
                        Library library3 = (Library) linkedHashMap.get(rx0Var.getLibrary().getId());
                        rx0VarA = library3 == null ? null : rx0.a(rx0Var, library3, L(rx0Var.getItems()), 0, false, false, 12);
                    } catch (Exception unused2) {
                    }
                    if (rx0VarA != null) {
                        arrayList2.add(rx0VarA);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return false;
                }
                zq0Var.f(arrayList2);
                zq0Var.S = jn0Var;
                zq0Var.c.setValue(new gq0(arrayList, L(dq0VarD.getResumeItems()), arrayList2));
                arrayList2.size();
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.w("HomeViewModel", "首页快照无效，跳过缓存并继续请求接口", e);
            return false;
        }
    }

    public static final List d(List list, Set set, List list2, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(function1.invoke(obj), obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj2 = linkedHashMap.get((String) it.next());
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (!set.contains(function1.invoke(obj3))) {
                arrayList2.add(obj3);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    public final boolean A() {
        return (this.c.getValue() instanceof gq0) && Intrinsics.areEqual(this.S, new jn0(this.R, RetrofitClient.INSTANCE.getUserId(), this.K));
    }

    public final boolean B(String str) {
        boolean zContains;
        synchronized (this.O) {
            zContains = this.O.contains(str);
        }
        return zContains;
    }

    public final boolean C(long j) {
        return j == this.G;
    }

    public final boolean D(String str) {
        boolean zContainsKey;
        synchronized (this.L) {
            zContainsKey = this.L.containsKey(str);
        }
        return zContainsKey;
    }

    public final void E(boolean z, boolean z2) {
        this.H = true;
        this.I = false;
        this.J = false;
        Job job = this.z;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.A;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.A = null;
        long j = this.G + 1;
        this.G = j;
        String str = this.R;
        boolean z3 = this.K;
        jn0 jn0Var = new jn0(str, RetrofitClient.INSTANCE.getUserId(), z3);
        Object value = this.c.getValue();
        gq0 gq0Var = value instanceof gq0 ? (gq0) value : null;
        if (gq0Var == null || !z2 || !Intrinsics.areEqual(this.S, jn0Var)) {
            gq0Var = null;
        }
        boolean z4 = gq0Var != null;
        if (!z4) {
            this.c.setValue(fq0.a);
            this.S = null;
            this.s.setValue(null);
            this.F = false;
            Job job3 = this.y;
            if (job3 != null) {
                Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
            }
            g();
        }
        i();
        j();
        synchronized (this.L) {
            this.L.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.z = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new lq0(jn0Var, z, this, str, z3, j, z4, gq0Var, null), 2, null);
    }

    public final void F(String str) {
        str.getClass();
        if (this.H) {
            long j = this.G;
            rx0 rx0VarM = m(str);
            if (rx0VarM != null) {
                k(str);
                H(j, rx0VarM);
            } else if (B(str)) {
                synchronized (this.P) {
                    this.P.add(str);
                }
            } else {
                Long lR = R(str);
                if (lR != null) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new oq0(this, j, str, lR.longValue(), null), 2, null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(ContinuationImpl continuationImpl) {
        tq0 tq0Var;
        if (continuationImpl instanceof tq0) {
            tq0Var = (tq0) continuationImpl;
            int i = tq0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq0Var.e = i - Integer.MIN_VALUE;
            } else {
                tq0Var = new tq0(this, continuationImpl);
            }
        } else {
            tq0Var = new tq0(this, continuationImpl);
        }
        Object obj = tq0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = tq0Var.e;
        if (i2 != 0) {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        String userId = RetrofitClient.INSTANCE.getUserId();
        if (StringsKt.isBlank(userId)) {
            Result.Companion companion = Result.INSTANCE;
            return i02.n("当前用户信息无效");
        }
        Object value = this.c.getValue();
        gq0 gq0Var = value instanceof gq0 ? (gq0) value : null;
        if (gq0Var == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return i02.n("媒体库数据未加载完成");
        }
        List list = gq0Var.a;
        tq0Var.a = null;
        tq0Var.b = null;
        tq0Var.e = 1;
        Object objB = this.a.B(userId, list, tq0Var);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    public final void H(long j, rx0 rx0Var) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Object objA;
        do {
            mutableStateFlow = this.c;
            value = mutableStateFlow.getValue();
            objA = (hq0) value;
            if (C(j) && (objA instanceof gq0)) {
                gq0 gq0Var = (gq0) objA;
                List list = gq0Var.c;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            objA = gq0.a(gq0Var, null, null, CollectionsKt.plus((Collection<? extends rx0>) list, rx0Var), 3);
                            break;
                        }
                    } while (!Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), rx0Var.getLibrary().getId()));
                } else {
                    objA = gq0.a(gq0Var, null, null, CollectionsKt.plus((Collection<? extends rx0>) list, rx0Var), 3);
                    break;
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, objA));
    }

    public final void I(List list) {
        list.getClass();
        long j = 1 + this.D;
        this.D = j;
        Job job = this.B;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.B = null;
        boolean zIsEmpty = list.isEmpty();
        MutableStateFlow mutableStateFlow = this.u;
        if (zIsEmpty) {
            mutableStateFlow.setValue(MapsKt.emptyMap());
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((ServerConfig) obj).getId())) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Pair pair = TuplesKt.to(((ServerConfig) obj2).getId(), ServerPingState.INSTANCE.getMeasuring());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        mutableStateFlow.setValue(linkedHashMap);
        this.B = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new n7(arrayList, this, j, null, 3), 3, null);
    }

    public final void J(long j, rx0 rx0Var) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Object objA;
        do {
            mutableStateFlow = this.c;
            value = mutableStateFlow.getValue();
            objA = (hq0) value;
            if (C(j) && (objA instanceof gq0)) {
                gq0 gq0Var = (gq0) objA;
                List list = gq0Var.c;
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), rx0Var.getLibrary().getId())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    List mutableList = CollectionsKt.toMutableList((Collection) list);
                    mutableList.set(i, rx0Var);
                    objA = gq0.a(gq0Var, null, null, mutableList, 3);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, objA));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[Catch: Exception -> 0x0055, TryCatch #1 {Exception -> 0x0055, blocks: (B:26:0x0089, B:29:0x0096, B:31:0x009e, B:33:0x00a2, B:16:0x0051), top: B:54:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[Catch: Exception -> 0x0055, TryCatch #1 {Exception -> 0x0055, blocks: (B:26:0x0089, B:29:0x0096, B:31:0x009e, B:33:0x00a2, B:16:0x0051), top: B:54:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Exception] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f3 -> B:44:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00fc -> B:46:0x0100). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object K(int r19, long r20, kotlin.jvm.functions.Function1 r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq0.K(int, long, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(List list, Continuation continuation) {
        vq0 vq0Var;
        if (continuation instanceof vq0) {
            vq0Var = (vq0) continuation;
            int i = vq0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq0Var.e = i - Integer.MIN_VALUE;
            } else {
                vq0Var = new vq0(this, continuation);
            }
        } else {
            vq0Var = new vq0(this, continuation);
        }
        Object obj = vq0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = vq0Var.e;
        if (i2 != 0) {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        String userId = RetrofitClient.INSTANCE.getUserId();
        if (StringsKt.isBlank(userId)) {
            Result.Companion companion = Result.INSTANCE;
            return i02.n("当前用户信息无效");
        }
        if (list.isEmpty()) {
            Result.Companion companion2 = Result.INSTANCE;
            return i02.n("媒体库排序数据异常，请刷新后重试");
        }
        vq0Var.a = null;
        vq0Var.b = null;
        vq0Var.e = 1;
        Object objH = this.a.H(userId, list, vq0Var);
        return objH == coroutine_suspended ? coroutine_suspended : objH;
    }

    public final void N(String str, String str2, Integer num, String str3, sn0 sn0Var) {
        sn0Var.getClass();
        Objects.toString(sn0Var);
        this.e.setValue(str);
        this.g.setValue(num);
        MutableStateFlow mutableStateFlow = this.q;
        this.V.setValue(str2 == null ? (String) mutableStateFlow.getValue() : str2);
        if (str2 == null) {
            str2 = (String) mutableStateFlow.getValue();
        }
        if (!Intrinsics.areEqual(str2, "继续观看")) {
            str3 = null;
        }
        this.i.setValue(str3);
        this.m.setValue(sn0Var);
    }

    public final void P(rn0 rn0Var) {
        rn0Var.getClass();
        Objects.toString(rn0Var);
        this.T.setValue(rn0Var);
    }

    public final void Q(List list, long j, Set set) {
        if (this.H && C(j)) {
            Job job = this.A;
            if (job == null || !job.isActive()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Library library = (Library) obj;
                    if (!z(library.getId()) && !B(library.getId()) && !D(library.getId())) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Job job2 = this.A;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.A = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new yq0(arrayList, this, j, set, null), 2, null);
            }
        }
    }

    public final Long R(String str) {
        synchronized (this.L) {
            if (this.L.containsKey(str)) {
                return null;
            }
            long j = this.M + 1;
            this.M = j;
            this.L.put(str, Long.valueOf(j));
            return Long.valueOf(j);
        }
    }

    public final void e(rx0 rx0Var) {
        synchronized (this.N) {
            this.N.put(rx0Var.getLibrary().getId(), rx0Var);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void f(List list) {
        synchronized (this.N) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    rx0 rx0Var = (rx0) it.next();
                    this.N.put(rx0Var.getLibrary().getId(), rx0Var);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.N) {
            this.N.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void h() {
        this.e.setValue(null);
        this.g.setValue(null);
        this.V.setValue(null);
        this.i.setValue(null);
        this.m.setValue(sn0.a);
    }

    public final void i() {
        synchronized (this.O) {
            this.O.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void j() {
        synchronized (this.P) {
            this.P.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean k(String str) {
        boolean zRemove;
        synchronized (this.P) {
            zRemove = this.P.remove(str);
        }
        return zRemove;
    }

    public final void l(String str) {
        synchronized (this.O) {
            this.O.remove(str);
        }
    }

    public final rx0 m(String str) {
        rx0 rx0Var;
        synchronized (this.N) {
            rx0Var = (rx0) this.N.get(str);
        }
        return rx0Var;
    }

    public final StateFlow n() {
        return this.t;
    }

    public final StateFlow o() {
        return this.f;
    }

    public final StateFlow p() {
        return this.h;
    }

    public final StateFlow q() {
        return this.j;
    }

    public final StateFlow r() {
        return this.U;
    }

    public final StateFlow s() {
        return this.n;
    }

    public final StateFlow t() {
        return this.x;
    }

    public final StateFlow u() {
        return this.W;
    }

    public final StateFlow v() {
        return this.v;
    }

    public final StateFlow w() {
        return this.l;
    }

    public final StateFlow x() {
        return this.p;
    }

    public final StateFlow y() {
        return this.d;
    }

    public final boolean z(String str) {
        boolean zContainsKey;
        synchronized (this.N) {
            zContainsKey = this.N.containsKey(str);
        }
        return zContainsKey;
    }
}
