package defpackage;

import android.util.Log;
import androidx.media3.common.C;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.Library;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oq0 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public Library c;
    public int d;
    public final /* synthetic */ zq0 e;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(zq0 zq0Var, long j, String str, long j2, Continuation continuation) {
        super(2, continuation);
        this.e = zq0Var;
        this.g = j;
        this.h = str;
        this.i = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new oq0(this.e, this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oq0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        zq0 zq0Var;
        Object next;
        Object objK;
        Library library;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        zq0 zq0Var2 = this.d;
        long j = this.g;
        long j2 = this.i;
        String str = this.h;
        zq0 zq0Var3 = this.e;
        try {
            try {
                if (zq0Var2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!zq0Var3.C(j)) {
                        Unit unit = Unit.INSTANCE;
                        zq0.a(zq0Var3, str, j2);
                        return unit;
                    }
                    hq0 hq0Var = (hq0) zq0Var3.c.getValue();
                    if (!(hq0Var instanceof gq0)) {
                        Unit unit2 = Unit.INSTANCE;
                        zq0.a(zq0Var3, str, j2);
                        return unit2;
                    }
                    List list = ((gq0) hq0Var).c;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((rx0) it.next()).getLibrary().getId(), str)) {
                                Unit unit3 = Unit.INSTANCE;
                                zq0.a(zq0Var3, str, j2);
                                return unit3;
                            }
                        }
                    }
                    rx0 rx0VarM = zq0Var3.m(str);
                    if (rx0VarM != null) {
                        zq0Var3.k(str);
                        zq0Var3.H(j, rx0VarM);
                        Unit unit4 = Unit.INSTANCE;
                        zq0.a(zq0Var3, str, j2);
                        return unit4;
                    }
                    String userId = RetrofitClient.INSTANCE.getUserId();
                    Iterator it2 = ((gq0) hq0Var).a.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.areEqual(((Library) next).getId(), str));
                    Library library2 = (Library) next;
                    if (library2 == null) {
                        Unit unit5 = Unit.INSTANCE;
                        zq0.a(zq0Var3, str, j2);
                        return unit5;
                    }
                    library2.getName();
                    library2.getCollectionType();
                    try {
                        nq0 nq0Var = new nq0(zq0Var3, userId, this.h, library2, null);
                        this.a = null;
                        this.b = null;
                        this.c = library2;
                        this.d = 1;
                        zq0Var = zq0Var3;
                        try {
                            objK = zq0Var.K(3, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, nq0Var, this);
                            if (objK == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            library = library2;
                        } catch (Exception e) {
                            e = e;
                            Boxing.boxInt(Log.e("HomeViewModel", "懒加载媒体库失败: " + e.getMessage(), e));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zq0Var = zq0Var3;
                    } catch (Throwable th) {
                        th = th;
                        zq0Var2 = zq0Var3;
                        zq0.a(zq0Var2, str, j2);
                        throw th;
                    }
                } else {
                    if (zq0Var2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Library library3 = this.c;
                    ResultKt.throwOnFailure(obj);
                    objK = ((Result) obj).getValue();
                    zq0Var = zq0Var3;
                    library = library3;
                }
                if (!zq0Var.C(j)) {
                    Unit unit6 = Unit.INSTANCE;
                    zq0.a(zq0Var, str, j2);
                    return unit6;
                }
                if (Result.m8832isSuccessimpl(objK)) {
                    if (false) {
                        objK = null;
                    }
                    od0 od0Var = (od0) objK;
                    List listEmptyList = od0Var != null ? od0Var.a : null;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List list2 = listEmptyList;
                    rx0 rx0Var = new rx0(library, list2, od0Var != null ? od0Var.b : list2.size(), (od0Var != null ? od0Var.b : list2.size()) > list2.size(), false);
                    zq0Var.e(rx0Var);
                    zq0Var.k(str);
                    zq0Var.H(j, rx0Var);
                    library.getName();
                    list2.size();
                } else {
                    rx0 rx0Var2 = new rx0(library, CollectionsKt.emptyList(), 0, false, false);
                    zq0Var.e(rx0Var2);
                    zq0Var.k(str);
                    zq0Var.H(j, rx0Var2);
                    String name = library.getName();
                    Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objK);
                    Boxing.boxInt(Log.e("HomeViewModel", "懒加载失败（已重试3次）: " + name + ", error=" + (thM8828exceptionOrNullimpl != null ? thM8828exceptionOrNullimpl.getMessage() : null)));
                }
                zq0.a(zq0Var, str, j2);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            zq0Var = zq0Var3;
        } catch (Throwable th3) {
            th = th3;
            zq0Var2 = zq0Var3;
        }
    }
}
