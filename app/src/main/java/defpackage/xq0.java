package defpackage;

import com.dh.myembyapp.data.model.Library;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes4.dex */
public final class xq0 extends SuspendLambda implements Function2 {
    public Object a;
    public Iterator b;
    public Object c;
    public Object d;
    public int e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ List i;
    public final /* synthetic */ zq0 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Set m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(List list, zq0 zq0Var, String str, long j, Set set, Continuation continuation) {
        super(2, continuation);
        this.i = list;
        this.j = zq0Var;
        this.k = str;
        this.l = j;
        this.m = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        xq0 xq0Var = new xq0(this.i, this.j, this.k, this.l, this.m, continuation);
        xq0Var.h = obj;
        return xq0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xq0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        Iterable iterable;
        CoroutineScope coroutineScope = (CoroutineScope) this.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List list = this.i;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new wq0(this.j, this.k, (Library) it2.next(), this.l, this.m, null), 3, null));
            }
            it = arrayList.iterator();
            i = 0;
            iterable = arrayList;
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.e;
            it = this.b;
            iterable = (Iterable) this.a;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            Deferred deferred = (Deferred) next;
            this.h = null;
            this.a = null;
            this.b = it;
            this.c = null;
            this.d = null;
            this.e = i;
            this.g = 1;
            if (deferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
