package defpackage;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class p7 extends ViewModel {
    public final b4 a = new b4();
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
    public final i52 m;
    public final AtomicLong n;
    public final AtomicLong o;
    public final AtomicLong p;
    public final LinkedHashSet q;

    public p7() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new i7());
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new h7(null, null, 63));
        this.e = MutableStateFlow2;
        this.f = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.g = MutableStateFlow3;
        this.h = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(i3.a);
        this.i = MutableStateFlow4;
        this.j = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this.k = MutableStateFlow5;
        this.l = FlowKt.asStateFlow(MutableStateFlow5);
        this.m = new i52(ViewModelKt.getViewModelScope(this), new c0(this, 2), new a5(this, 3));
        this.n = new AtomicLong(0L);
        this.o = new AtomicLong(0L);
        this.p = new AtomicLong(0L);
        this.q = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a A[LOOP:0: B:28:0x0094->B:30:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce A[LOOP:1: B:36:0x00c8->B:38:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(p7 p7Var, ServerConfig serverConfig, ContinuationImpl continuationImpl) {
        j7 j7Var;
        Object objF;
        Object obj;
        Object value;
        ServerConfig serverConfig2;
        Object objEmptyList;
        ArrayList arrayList;
        Object objEmptyList2;
        ArrayList arrayList2;
        Throwable thM8828exceptionOrNullimpl;
        String message;
        Throwable thM8828exceptionOrNullimpl2;
        String message2;
        List listDistinct;
        List list;
        ServerConfig serverConfig3 = serverConfig;
        b4 b4Var = p7Var.a;
        if (continuationImpl instanceof j7) {
            j7Var = (j7) continuationImpl;
            int i = j7Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7Var.e = i - Integer.MIN_VALUE;
            } else {
                j7Var = new j7(p7Var, continuationImpl);
            }
        } else {
            j7Var = new j7(p7Var, continuationImpl);
        }
        Object obj2 = j7Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = j7Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            j7Var.a = serverConfig3;
            j7Var.e = 1;
            objF = b4Var.f(serverConfig3, "Series", 24, j7Var);
            if (objF != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            serverConfig3 = j7Var.a;
            ResultKt.throwOnFailure(obj2);
            objF = ((Result) obj2).getValue();
        } else {
            if (i2 != 2) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = j7Var.b;
            ServerConfig serverConfig4 = j7Var.a;
            ResultKt.throwOnFailure(obj2);
            value = ((Result) obj2).getValue();
            serverConfig2 = serverConfig4;
        }
        if (Result.m8828exceptionOrNullimpl(obj) == null) {
            objEmptyList = obj;
        } else {
            objEmptyList = CollectionsKt.emptyList();
        }
        Iterable<MediaItem> iterable = (Iterable) objEmptyList;
        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (MediaItem mediaItem : iterable) {
            arrayList.add(new h3(serverConfig2, mediaItem, mediaItem.getId(), null));
        }
        if (Result.m8828exceptionOrNullimpl(value) == null) {
            objEmptyList2 = value;
        } else {
            objEmptyList2 = CollectionsKt.emptyList();
        }
        Iterable<MediaItem> iterable2 = (Iterable) objEmptyList2;
        arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        for (MediaItem mediaItem2 : iterable2) {
            arrayList2.add(new h3(serverConfig2, mediaItem2, mediaItem2.getId(), null));
        }
        thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(obj);
        if (thM8828exceptionOrNullimpl != null) {
            message = thM8828exceptionOrNullimpl.getMessage();
        } else {
            message = null;
        }
        thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(value);
        if (thM8828exceptionOrNullimpl2 != null) {
            message2 = thM8828exceptionOrNullimpl2.getMessage();
        } else {
            message2 = null;
        }
        listDistinct = CollectionsKt___CollectionsKt.distinct(CollectionsKt.listOfNotNull((Object[]) new String[]{message, message2}));
        if (listDistinct.isEmpty()) {
            list = null;
        } else {
            list = listDistinct;
        }
        return new f3(serverConfig2, arrayList, arrayList2, false, list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, " | ", null, null, 0, null, null, 62, null) : null);
        j7Var.a = serverConfig3;
        j7Var.b = objF;
        j7Var.e = 2;
        Object objF2 = b4Var.f(serverConfig3, "Movie", 24, j7Var);
        if (objF2 != coroutine_suspended) {
            ServerConfig serverConfig5 = serverConfig3;
            obj = objF;
            value = objF2;
            serverConfig2 = serverConfig5;
            if (Result.m8828exceptionOrNullimpl(obj) == null) {
                objEmptyList = obj;
            } else {
                objEmptyList = CollectionsKt.emptyList();
            }
            Iterable<MediaItem> iterable3 = (Iterable) objEmptyList;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable3, 10));
            while (r2.hasNext()) {
                arrayList.add(new h3(serverConfig2, mediaItem, mediaItem.getId(), null));
            }
            if (Result.m8828exceptionOrNullimpl(value) == null) {
                objEmptyList2 = value;
            } else {
                objEmptyList2 = CollectionsKt.emptyList();
            }
            Iterable<MediaItem> iterable4 = (Iterable) objEmptyList2;
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable4, 10));
            while (r2.hasNext()) {
                arrayList2.add(new h3(serverConfig2, mediaItem2, mediaItem2.getId(), null));
            }
            thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(obj);
            if (thM8828exceptionOrNullimpl != null) {
                message = thM8828exceptionOrNullimpl.getMessage();
            } else {
                message = null;
            }
            thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(value);
            if (thM8828exceptionOrNullimpl2 != null) {
                message2 = thM8828exceptionOrNullimpl2.getMessage();
            } else {
                message2 = null;
            }
            listDistinct = CollectionsKt___CollectionsKt.distinct(CollectionsKt.listOfNotNull((Object[]) new String[]{message, message2}));
            if (listDistinct.isEmpty()) {
                list = listDistinct;
            } else {
                list = null;
            }
            return new f3(serverConfig2, arrayList, arrayList2, false, list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, " | ", null, null, 0, null, null, 62, null) : null);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(p7 p7Var, ServerConfig serverConfig, ContinuationImpl continuationImpl) {
        k7 k7Var;
        Object objH;
        String id;
        if (continuationImpl instanceof k7) {
            k7Var = (k7) continuationImpl;
            int i = k7Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7Var.d = i - Integer.MIN_VALUE;
            } else {
                k7Var = new k7(p7Var, continuationImpl);
            }
        } else {
            k7Var = new k7(p7Var, continuationImpl);
        }
        Object obj = k7Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = k7Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            b4 b4Var = p7Var.a;
            k7Var.a = serverConfig;
            k7Var.d = 1;
            objH = b4Var.h(serverConfig, 20, k7Var);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            serverConfig = k7Var.a;
            ResultKt.throwOnFailure(obj);
            objH = ((Result) obj).getValue();
        }
        Iterable<MediaItem> iterable = (Iterable) (Result.m8828exceptionOrNullimpl(objH) == null ? objH : CollectionsKt.emptyList());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (MediaItem mediaItem : iterable) {
            if (!Intrinsics.areEqual(mediaItem.getType(), "Episode") || (id = mediaItem.getSeriesId()) == null) {
                id = mediaItem.getId();
            }
            arrayList.add(new h3(serverConfig, mediaItem, id, Intrinsics.areEqual(mediaItem.getType(), "Episode") ? mediaItem.getId() : null));
        }
        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objH);
        return new j3(serverConfig, arrayList, false, thM8828exceptionOrNullimpl != null ? thM8828exceptionOrNullimpl.getMessage() : null);
    }

    public final void c() {
        Job job = this.m.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.o.incrementAndGet();
        this.q.clear();
        this.g.setValue(null);
        this.e.setValue(new h7(null, null, 63));
    }

    public final StateFlow d() {
        return this.j;
    }

    public final StateFlow e() {
        return this.h;
    }

    public final StateFlow f() {
        return this.f;
    }

    public final StateFlow g() {
        return this.l;
    }

    public final StateFlow h() {
        return this.d;
    }

    public final boolean i(long j) {
        return this.n.get() == j;
    }

    public final void j(String str) {
        str.getClass();
        if (StringsKt.isBlank(str)) {
            c();
            return;
        }
        while (true) {
            MutableStateFlow mutableStateFlow = this.e;
            Object value = mutableStateFlow.getValue();
            String str2 = str;
            if (mutableStateFlow.compareAndSet(value, h7.a((h7) value, str2, false, null, null, false, 62))) {
                this.m.a(str2);
                return;
            }
            str = str2;
        }
    }
}
