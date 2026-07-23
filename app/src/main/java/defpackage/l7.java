package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.model.ServerConfig;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class l7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ p7 b;
    public final /* synthetic */ ServerConfig c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(p7 p7Var, ServerConfig serverConfig, String str, boolean z, int i, long j, Continuation continuation) {
        super(2, continuation);
        this.b = p7Var;
        this.c = serverConfig;
        this.d = str;
        this.e = z;
        this.g = i;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l7(this.b, this.c, this.d, this.e, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI;
        Object value;
        h7 h7VarA;
        g7 g7Var;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        p7 p7Var = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            b4 b4Var = p7Var.a;
            this.a = 1;
            objI = b4Var.i(this.c, this.d, this.e, 20, null, this);
            if (objI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            objI = ((Result) obj).getValue();
        }
        long j = p7Var.o.get();
        long j2 = this.h;
        if (j == j2) {
            MutableStateFlow mutableStateFlow = p7Var.e;
            do {
                value = mutableStateFlow.getValue();
                h7VarA = (h7) value;
                if (p7Var.o.get() == j2) {
                    List mutableList = CollectionsKt.toMutableList((Collection) h7VarA.d);
                    int size = mutableList.size();
                    int i2 = this.g;
                    if (i2 < size) {
                        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objI);
                        ServerConfig serverConfig = this.c;
                        if (thM8828exceptionOrNullimpl == null) {
                            g7Var = new g7(serverConfig, (List) objI, false, 8);
                        } else {
                            Log.e("AggregateHubVM", "[" + serverConfig.getAlias() + "] 搜索失败", thM8828exceptionOrNullimpl);
                            List listEmptyList = CollectionsKt.emptyList();
                            String message = thM8828exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "搜索失败";
                            }
                            g7Var = new g7(serverConfig, listEmptyList, false, message);
                        }
                        mutableList.set(i2, g7Var);
                        if (!mutableList.isEmpty()) {
                            Iterator it = mutableList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (((g7) it.next()).c) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        h7VarA = h7.a(h7VarA, null, z, mutableList, null, false, 53);
                    }
                }
            } while (!mutableStateFlow.compareAndSet(value, h7VarA));
        }
        return Unit.INSTANCE;
    }
}
