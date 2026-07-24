package defpackage;

import android.util.Log;
import androidx.media3.common.C;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class qq0 extends SuspendLambda implements Function2 {
    public Object a;
    public Ref.IntRef b;
    public Ref.ObjectRef c;
    public Object d;
    public Object e;
    public int g;
    public final /* synthetic */ zq0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(zq0 zq0Var, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.h = zq0Var;
        this.i = j;
        this.j = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qq0(this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qq0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0327 A[LOOP:6: B:179:0x0071->B:156:0x0327, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x034d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0363  */
    /* JADX WARN: Code duplicated, block: B:170:0x0378 A[LOOP:5: B:165:0x035d->B:170:0x0378, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x037e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0380  */
    /* JADX WARN: Code duplicated, block: B:205:0x037b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x037c A[EDGE_INSN: B:206:0x037c->B:172:0x037c BREAK  A[LOOP:5: B:165:0x035d->B:170:0x0378], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0140 A[EDGE_INSN: B:207:0x0140->B:56:0x0140 BREAK  A[LOOP:6: B:179:0x0071->B:156:0x0327], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v21, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        List list;
        Object value;
        Object objA;
        gq0 gq0Var;
        List list2;
        Iterator it;
        int i2;
        int i3;
        zq0 zq0Var;
        Object value2;
        Ref.ObjectRef objectRef;
        Ref.IntRef intRef;
        Object value3;
        Object objA2;
        Object value4;
        Object objA3;
        int i4;
        qq0 qq0Var = this;
        zq0 zq0Var2 = qq0Var.h;
        MutableStateFlow mutableStateFlow = zq0Var2.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = qq0Var.g;
        String str = "HomeViewModel";
        String str2 = qq0Var.j;
        long j2 = qq0Var.i;
        try {
            try {
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!zq0Var2.C(j2)) {
                        return Unit.INSTANCE;
                    }
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = "";
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    while (true) {
                        try {
                            Object value5 = mutableStateFlow.getValue();
                            Object objA4 = (hq0) value5;
                            try {
                                if (zq0Var2.C(j2) && (objA4 instanceof gq0)) {
                                    Iterator it2 = ((gq0) objA4).c.iterator();
                                    int i6 = 0;
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            i3 = -1;
                                            break;
                                        }
                                        if (Intrinsics.areEqual(((rx0) it2.next()).getLibrary().getId(), str2)) {
                                            i3 = i6;
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (i3 != -1) {
                                        rx0 rx0Var = (rx0) ((gq0) objA4).c.get(i3);
                                        if (rx0Var.getHasMore()) {
                                            try {
                                                if (!rx0Var.getIsLoadingMore()) {
                                                    booleanRef.element = true;
                                                    intRef2.element = rx0Var.getItems().size();
                                                    objectRef2.element = rx0Var.getLibrary().getName();
                                                    objectRef3.element = rx0Var.getLibrary().getCollectionType();
                                                    List mutableList = CollectionsKt.toMutableList((Collection) ((gq0) objA4).c);
                                                    zq0Var = zq0Var2;
                                                    try {
                                                        mutableList.set(i3, rx0.a(rx0Var, null, null, 0, false, true, 15));
                                                        list = null;
                                                        objA4 = gq0.a((gq0) objA4, null, null, mutableList, 3);
                                                    } catch (Exception e) {
                                                        e = e;
                                                        list = null;
                                                        long j3 = j2;
                                                        list = list;
                                                        j = j3;
                                                        zq0Var2 = zq0Var;
                                                        i = -1;
                                                        kb0.G("加载更多异常: ", e.getMessage(), str, e);
                                                        do {
                                                            value = mutableStateFlow.getValue();
                                                            objA = (hq0) value;
                                                            if (!zq0Var2.C(j)) {
                                                                gq0Var = (gq0) objA;
                                                                list2 = gq0Var.c;
                                                                it = list2.iterator();
                                                                i2 = 0;
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        i2 = i;
                                                                        break;
                                                                    }
                                                                    if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str2)) {
                                                                        break;
                                                                    }
                                                                    i2++;
                                                                }
                                                                if (i2 != i) {
                                                                    List mutableList2 = CollectionsKt.toMutableList((Collection) list2);
                                                                    mutableList2.set(i2, rx0.a((rx0) mutableList2.get(i2), null, null, 0, false, false, 15));
                                                                    objA = gq0.a(gq0Var, list, list, mutableList2, 3);
                                                                }
                                                            }
                                                        } while (!mutableStateFlow.compareAndSet(value, objA));
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                                if (mutableStateFlow.compareAndSet(value5, objA4)) {
                                                    break;
                                                }
                                                zq0Var2 = zq0Var;
                                                j2 = j2;
                                                qq0Var = this;
                                            } catch (Exception e2) {
                                                e = e2;
                                                long j4 = j2;
                                                list = null;
                                                j = j4;
                                                i = -1;
                                                kb0.G("加载更多异常: ", e.getMessage(), str, e);
                                                do {
                                                    value = mutableStateFlow.getValue();
                                                    objA = (hq0) value;
                                                    if (!zq0Var2.C(j) && (objA instanceof gq0)) {
                                                        gq0Var = (gq0) objA;
                                                        list2 = gq0Var.c;
                                                        it = list2.iterator();
                                                        i2 = 0;
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                i2 = i;
                                                                break;
                                                            }
                                                            if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str2)) {
                                                                break;
                                                                break;
                                                            }
                                                            i2++;
                                                        }
                                                        if (i2 != i) {
                                                            List mutableList3 = CollectionsKt.toMutableList((Collection) list2);
                                                            mutableList3.set(i2, rx0.a((rx0) mutableList3.get(i2), null, null, 0, false, false, 15));
                                                            objA = gq0.a(gq0Var, list, list, mutableList3, 3);
                                                        }
                                                    }
                                                } while (!mutableStateFlow.compareAndSet(value, objA));
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                if (mutableStateFlow.compareAndSet(value5, objA4)) {
                                    break;
                                    break;
                                }
                                zq0Var2 = zq0Var;
                                j2 = j2;
                                qq0Var = this;
                            } catch (Exception e3) {
                                e = e3;
                                long j5 = j2;
                                list = list;
                                j = j5;
                                zq0Var2 = zq0Var;
                                i = -1;
                                kb0.G("加载更多异常: ", e.getMessage(), str, e);
                                do {
                                    value = mutableStateFlow.getValue();
                                    objA = (hq0) value;
                                    if (!zq0Var2.C(j)) {
                                        gq0Var = (gq0) objA;
                                        list2 = gq0Var.c;
                                        it = list2.iterator();
                                        i2 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i2 = i;
                                                break;
                                            }
                                            if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str2)) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                        }
                                        if (i2 != i) {
                                            List mutableList4 = CollectionsKt.toMutableList((Collection) list2);
                                            mutableList4.set(i2, rx0.a((rx0) mutableList4.get(i2), null, null, 0, false, false, 15));
                                            objA = gq0.a(gq0Var, list, list, mutableList4, 3);
                                        }
                                    }
                                } while (!mutableStateFlow.compareAndSet(value, objA));
                                return Unit.INSTANCE;
                            }
                            zq0Var = zq0Var2;
                            list = null;
                        } catch (Exception e4) {
                            e = e4;
                            j = j2;
                            list = null;
                        }
                    }
                    if (!booleanRef.element) {
                        return Unit.INSTANCE;
                    }
                    String userId = RetrofitClient.INSTANCE.getUserId();
                    Objects.toString(objectRef2.element);
                    long j6 = j2;
                    try {
                        zq0 zq0Var3 = zq0Var;
                        try {
                            pq0 pq0Var = new pq0(zq0Var3, userId, str2, objectRef3, intRef2, null);
                            try {
                                qq0Var.a = null;
                                qq0Var.b = intRef2;
                                qq0Var.c = objectRef2;
                                qq0Var.d = null;
                                qq0Var.e = null;
                                qq0Var.g = 1;
                                list = list;
                                str = "HomeViewModel";
                                i = -1;
                                zq0Var2 = zq0Var;
                                try {
                                    Object objK = zq0Var2.K(3, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, pq0Var, qq0Var);
                                    if (objK == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    value2 = objK;
                                    objectRef = objectRef2;
                                    intRef = intRef2;
                                    j = j6;
                                } catch (Exception e5) {
                                    e = e5;
                                    j = j6;
                                    kb0.G("加载更多异常: ", e.getMessage(), str, e);
                                    do {
                                        value = mutableStateFlow.getValue();
                                        objA = (hq0) value;
                                        if (!zq0Var2.C(j)) {
                                            gq0Var = (gq0) objA;
                                            list2 = gq0Var.c;
                                            it = list2.iterator();
                                            i2 = 0;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    i2 = i;
                                                    break;
                                                }
                                                if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str2)) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                            }
                                            if (i2 != i) {
                                                List mutableList5 = CollectionsKt.toMutableList((Collection) list2);
                                                mutableList5.set(i2, rx0.a((rx0) mutableList5.get(i2), null, null, 0, false, false, 15));
                                                objA = gq0.a(gq0Var, list, list, mutableList5, 3);
                                            }
                                        }
                                    } while (!mutableStateFlow.compareAndSet(value, objA));
                                    return Unit.INSTANCE;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                zq0Var2 = zq0Var;
                                i = -1;
                                j = j6;
                                kb0.G("加载更多异常: ", e.getMessage(), str, e);
                                do {
                                    value = mutableStateFlow.getValue();
                                    objA = (hq0) value;
                                    if (!zq0Var2.C(j)) {
                                        gq0Var = (gq0) objA;
                                        list2 = gq0Var.c;
                                        it = list2.iterator();
                                        i2 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i2 = i;
                                                break;
                                            }
                                            if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str2)) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                        }
                                        if (i2 != i) {
                                            List mutableList6 = CollectionsKt.toMutableList((Collection) list2);
                                            mutableList6.set(i2, rx0.a((rx0) mutableList6.get(i2), null, null, 0, false, false, 15));
                                            objA = gq0.a(gq0Var, list, list, mutableList6, 3);
                                        }
                                    }
                                } while (!mutableStateFlow.compareAndSet(value, objA));
                                return Unit.INSTANCE;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            zq0Var2 = zq0Var3;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        list = list;
                        zq0Var2 = zq0Var;
                        j = j6;
                        i = -1;
                        kb0.G("加载更多异常: ", e.getMessage(), str, e);
                        do {
                            value = mutableStateFlow.getValue();
                            objA = (hq0) value;
                            if (!zq0Var2.C(j)) {
                                gq0Var = (gq0) objA;
                                list2 = gq0Var.c;
                                it = list2.iterator();
                                i2 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i2 = i;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str2)) {
                                        break;
                                        break;
                                    }
                                    i2++;
                                }
                                if (i2 != i) {
                                    List mutableList7 = CollectionsKt.toMutableList((Collection) list2);
                                    mutableList7.set(i2, rx0.a((rx0) mutableList7.get(i2), null, null, 0, false, false, 15));
                                    objA = gq0.a(gq0Var, list, list, mutableList7, 3);
                                }
                            }
                        } while (!mutableStateFlow.compareAndSet(value, objA));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    objectRef = qq0Var.c;
                    intRef = qq0Var.b;
                    ResultKt.throwOnFailure(obj);
                    list = null;
                    value2 = ((Result) obj).getValue();
                    j = j2;
                    str = "HomeViewModel";
                    i = -1;
                }
                if (!zq0Var2.C(j)) {
                    return Unit.INSTANCE;
                }
                if (Result.m8832isSuccessimpl(value2)) {
                    if (false) {
                        value2 = list;
                    }
                    od0 od0Var = (od0) value2;
                    List listEmptyList = od0Var != null ? od0Var.a : list;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    if (od0Var == null) {
                        int i7 = intRef.element;
                    }
                    boolean z = false;
                    do {
                        value4 = mutableStateFlow.getValue();
                        objA3 = (hq0) value4;
                        if (zq0Var2.C(j) && (objA3 instanceof gq0)) {
                            Iterator it3 = ((gq0) objA3).c.iterator();
                            int i8 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i4 = i;
                                    break;
                                }
                                if (Intrinsics.areEqual(((rx0) it3.next()).getLibrary().getId(), str2)) {
                                    i4 = i8;
                                    break;
                                }
                                i8++;
                            }
                            if (i4 != i) {
                                rx0 rx0Var2 = (rx0) ((gq0) objA3).c.get(i4);
                                listEmptyList.size();
                                int totalCount = od0Var != null ? od0Var.b : rx0Var2.getTotalCount();
                                rx0 rx0VarA = rx0.a(rx0Var2, null, CollectionsKt.plus((Collection) rx0Var2.getItems(), (Iterable) listEmptyList), totalCount, rx0Var2.getItems().size() + listEmptyList.size() < totalCount, false, 1);
                                List mutableList8 = CollectionsKt.toMutableList((Collection) ((gq0) objA3).c);
                                mutableList8.set(i4, rx0VarA);
                                objA3 = gq0.a((gq0) objA3, list, list, mutableList8, 3);
                                z = true;
                            }
                        }
                    } while (!mutableStateFlow.compareAndSet(value4, objA3));
                    if (z) {
                        Objects.toString(objectRef.element);
                    }
                } else {
                    Object obj2 = objectRef.element;
                    Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(value2);
                    Log.e(str, "加载更多失败（已重试3次）: " + obj2 + ", error=" + (thM8828exceptionOrNullimpl != null ? thM8828exceptionOrNullimpl.getMessage() : list));
                    do {
                        value3 = mutableStateFlow.getValue();
                        objA2 = (hq0) value3;
                        if (zq0Var2.C(j) && (objA2 instanceof gq0)) {
                            Iterator it4 = ((gq0) objA2).c.iterator();
                            int i9 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i9 = i;
                                    break;
                                }
                                if (Intrinsics.areEqual(((rx0) it4.next()).getLibrary().getId(), str2)) {
                                    break;
                                }
                                i9++;
                            }
                            if (i9 != i) {
                                List mutableList9 = CollectionsKt.toMutableList((Collection) ((gq0) objA2).c);
                                mutableList9.set(i9, rx0.a((rx0) mutableList9.get(i9), null, null, 0, false, false, 15));
                                objA2 = gq0.a((gq0) objA2, list, list, mutableList9, 3);
                            }
                        }
                    } while (!mutableStateFlow.compareAndSet(value3, objA2));
                }
                return Unit.INSTANCE;
            } catch (Exception e9) {
                e = e9;
                kb0.G("加载更多异常: ", e.getMessage(), str, e);
                do {
                    value = mutableStateFlow.getValue();
                    objA = (hq0) value;
                    if (!zq0Var2.C(j)) {
                        gq0Var = (gq0) objA;
                        list2 = gq0Var.c;
                        it = list2.iterator();
                        i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = i;
                                break;
                            }
                            if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str2)) {
                                break;
                                break;
                            }
                            i2++;
                        }
                        if (i2 != i) {
                            List mutableList10 = CollectionsKt.toMutableList((Collection) list2);
                            mutableList10.set(i2, rx0.a((rx0) mutableList10.get(i2), null, null, 0, false, false, 15));
                            objA = gq0.a(gq0Var, list, list, mutableList10, 3);
                        }
                    }
                } while (!mutableStateFlow.compareAndSet(value, objA));
            }
        } catch (Exception e10) {
            e = e10;
            str = "HomeViewModel";
            j = j2;
            i = -1;
            list = null;
        }
    }
}
