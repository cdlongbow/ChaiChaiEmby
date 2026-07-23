package defpackage;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class o7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public int c;
    public final /* synthetic */ ViewModel d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(v8 v8Var, long j, int i, py1 py1Var, Continuation continuation) {
        super(2, continuation);
        this.a = 1;
        this.d = v8Var;
        this.b = j;
        this.c = i;
        this.e = py1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.e;
        ViewModel viewModel = this.d;
        switch (i) {
            case 0:
                return new o7((p7) viewModel, (ServerConfig) obj2, this.b, continuation, 0);
            case 1:
                return new o7((v8) viewModel, this.b, this.c, (py1) obj2, continuation);
            case 2:
                return new o7((zq0) viewModel, (ServerConfig) obj2, this.b, continuation, 2);
            default:
                return new o7((hy1) viewModel, (ServerConfig) obj2, this.b, continuation, 3);
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
        }
        return ((o7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Map mapPlus;
        Object value2;
        Map mapPlus2;
        Object value3;
        Map mapPlus3;
        int i = this.a;
        long j = this.b;
        ViewModel viewModel = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ServerConfig serverConfig = (ServerConfig) obj2;
                p7 p7Var = (p7) viewModel;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.c;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ky1 ky1Var = p7Var.b;
                    this.c = 1;
                    obj = ky1Var.a(serverConfig, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ServerPingState serverPingState = (ServerPingState) obj;
                MutableStateFlow mutableStateFlow = p7Var.k;
                do {
                    value = mutableStateFlow.getValue();
                    mapPlus = (Map) value;
                    if (j == p7Var.p.get() && mapPlus.containsKey(serverConfig.getId())) {
                        mapPlus = MapsKt.plus(mapPlus, TuplesKt.to(serverConfig.getId(), serverPingState));
                    }
                } while (!mutableStateFlow.compareAndSet(value, mapPlus));
                return Unit.INSTANCE;
            case 1:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                v8 v8Var = (v8) viewModel;
                AtomicLong atomicLong = v8Var.q;
                MutableStateFlow mutableStateFlow2 = v8Var.f;
                if (atomicLong.get() != j) {
                    return Unit.INSTANCE;
                }
                List mutableList = CollectionsKt.toMutableList((Collection) mutableStateFlow2.getValue());
                mutableList.set(this.c, (py1) obj2);
                mutableStateFlow2.setValue(mutableList);
                Iterable iterable = (Iterable) mutableStateFlow2.getValue();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    v8Var.d.setValue(Boxing.boxBoolean(false));
                    Log.d("AggregateSearch", "聚合搜索完成");
                } else {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((py1) it.next()).c) {
                        }
                    }
                    v8Var.d.setValue(Boxing.boxBoolean(false));
                    Log.d("AggregateSearch", "聚合搜索完成");
                }
                return Unit.INSTANCE;
            case 2:
                ServerConfig serverConfig2 = (ServerConfig) obj2;
                zq0 zq0Var = (zq0) viewModel;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.c;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ky1 ky1Var2 = zq0Var.b;
                    this.c = 1;
                    obj = ky1Var2.a(serverConfig2, this);
                    if (obj == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ServerPingState serverPingState2 = (ServerPingState) obj;
                MutableStateFlow mutableStateFlow3 = zq0Var.u;
                do {
                    value2 = mutableStateFlow3.getValue();
                    mapPlus2 = (Map) value2;
                    if (j == zq0Var.D && mapPlus2.containsKey(serverConfig2.getId())) {
                        mapPlus2 = MapsKt.plus(mapPlus2, TuplesKt.to(serverConfig2.getId(), serverPingState2));
                    }
                } while (!mutableStateFlow3.compareAndSet(value2, mapPlus2));
                return Unit.INSTANCE;
            default:
                ServerConfig serverConfig3 = (ServerConfig) obj2;
                hy1 hy1Var = (hy1) viewModel;
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.c;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ky1 ky1Var3 = hy1Var.c;
                    this.c = 1;
                    obj = ky1Var3.a(serverConfig3, this);
                    if (obj == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ServerPingState serverPingState3 = (ServerPingState) obj;
                MutableStateFlow mutableStateFlow4 = hy1Var.j;
                do {
                    value3 = mutableStateFlow4.getValue();
                    mapPlus3 = (Map) value3;
                    if (j == hy1Var.e && mapPlus3.containsKey(serverConfig3.getId())) {
                        mapPlus3 = MapsKt.plus(mapPlus3, TuplesKt.to(serverConfig3.getId(), serverPingState3));
                    }
                } while (!mutableStateFlow4.compareAndSet(value3, mapPlus3));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(ViewModel viewModel, ServerConfig serverConfig, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = viewModel;
        this.e = serverConfig;
        this.b = j;
    }
}
