package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final class yq0 extends SuspendLambda implements Function2 {
    public String a;
    public Object b;
    public zq0 c;
    public Set d;
    public Iterator e;
    public Object g;
    public Object h;
    public long i;
    public int j;
    public int k;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ zq0 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ Set o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(ArrayList arrayList, zq0 zq0Var, long j, Set set, Continuation continuation) {
        super(2, continuation);
        this.l = arrayList;
        this.m = zq0Var;
        this.n = j;
        this.o = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new yq0(this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yq0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        zq0 zq0Var;
        Set set;
        int i;
        Iterable iterable;
        long j;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.k;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                String userId = RetrofitClient.INSTANCE.getUserId();
                List listChunked = CollectionsKt___CollectionsKt.chunked(this.l, 2);
                zq0 zq0Var2 = this.m;
                long j2 = this.n;
                Set set2 = this.o;
                Iterator it2 = listChunked.iterator();
                str = userId;
                zq0Var = zq0Var2;
                set = set2;
                i = 0;
                iterable = listChunked;
                j = j2;
                it = it2;
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.j;
                j = this.i;
                it = this.e;
                Set set3 = this.d;
                zq0 zq0Var3 = this.c;
                iterable = (Iterable) this.b;
                String str2 = this.a;
                ResultKt.throwOnFailure(obj);
                set = set3;
                zq0Var = zq0Var3;
                str = str2;
            }
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) next;
                if (zq0Var.H && zq0Var.C(j)) {
                    xq0 xq0Var = new xq0(list, zq0Var, str, j, set, null);
                    this.a = str;
                    this.b = null;
                    this.c = zq0Var;
                    this.d = set;
                    this.e = it;
                    this.g = null;
                    this.h = null;
                    this.i = j;
                    this.j = i;
                    this.k = 1;
                    if (CoroutineScopeKt.coroutineScope(xq0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Log.w("HomeViewModel", "后台预取首页媒体库失败: " + e2.getMessage(), e2);
        }
        return Unit.INSTANCE;
    }
}
