package defpackage;

import androidx.lifecycle.ViewModel;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class n7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewModel c;
    public final /* synthetic */ long d;
    public final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7(List list, ViewModel viewModel, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.e = list;
        this.c = viewModel;
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        List list = this.e;
        ViewModel viewModel = this.c;
        switch (i) {
            case 0:
                n7 n7Var = new n7(this.e, (p7) viewModel, this.d, continuation, 0);
                n7Var.b = obj;
                return n7Var;
            case 1:
                n7 n7Var2 = new n7((ArrayList) list, (p7) viewModel, this.d, continuation, 1);
                n7Var2.b = obj;
                return n7Var2;
            case 2:
                n7 n7Var3 = new n7(this.e, (zq0) viewModel, this.d, continuation, 2);
                n7Var3.b = obj;
                return n7Var3;
            case 3:
                n7 n7Var4 = new n7((ArrayList) list, (zq0) viewModel, this.d, continuation, 3);
                n7Var4.b = obj;
                return n7Var4;
            default:
                n7 n7Var5 = new n7((ArrayList) list, (hy1) viewModel, this.d, continuation, 4);
                n7Var5.b = obj;
                return n7Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((n7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = 0;
        ViewModel viewModel = this.c;
        List<Pair> list = this.e;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                p7 p7Var = (p7) viewModel;
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new m7(p7Var, (ServerConfig) obj2, i3, this.d, null, 0), 2, null);
                    i3 = i4;
                    p7Var = p7Var;
                }
                p7 p7Var2 = p7Var;
                int i5 = 0;
                for (Object obj3 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    p7 p7Var3 = p7Var2;
                    p7Var2 = p7Var3;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new m7(p7Var3, (ServerConfig) obj3, i5, this.d, null, 1), 2, null);
                    i5 = i6;
                }
                Iterator it = list.iterator();
                while (true) {
                    int i7 = i2;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i2 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        p7 p7Var4 = p7Var2;
                        p7Var2 = p7Var4;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new m7(p7Var4, (ServerConfig) next, i7, this.d, null, 2), 2, null);
                    }
                    break;
                }
                break;
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = (ArrayList) list;
                p7 p7Var5 = (p7) viewModel;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new o7(p7Var5, (ServerConfig) obj4, this.d, (Continuation) null, 0), 3, null);
                    p7Var5 = p7Var5;
                }
                break;
            case 2:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                zq0 zq0Var = (zq0) viewModel;
                for (Pair pair : list) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new uc(zq0Var, (ServerConfig) pair.component2(), this.d, (String) pair.component1(), null), 3, null);
                    zq0Var = zq0Var;
                }
                break;
            case 3:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList2 = (ArrayList) list;
                zq0 zq0Var2 = (zq0) viewModel;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj5 = arrayList2.get(i2);
                    i2++;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new o7(zq0Var2, (ServerConfig) obj5, this.d, (Continuation) null, 2), 3, null);
                    zq0Var2 = zq0Var2;
                }
                break;
            default:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList3 = (ArrayList) list;
                hy1 hy1Var = (hy1) viewModel;
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    Object obj6 = arrayList3.get(i2);
                    i2++;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new o7(hy1Var, (ServerConfig) obj6, this.d, (Continuation) null, 3), 3, null);
                    hy1Var = hy1Var;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
