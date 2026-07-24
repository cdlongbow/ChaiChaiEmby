package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.model.QueryResult;
import com.dh.myembyapp.data.model.ServerConfig;
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
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class y3 extends SuspendLambda implements Function2 {
    public b4 a;
    public ServerConfig b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b4 m;
    public final /* synthetic */ ServerConfig n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(b4 b4Var, ServerConfig serverConfig, int i, Continuation continuation) {
        super(2, continuation);
        this.m = b4Var;
        this.n = serverConfig;
        this.o = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y3 y3Var = new y3(this.m, this.n, this.o, continuation);
        y3Var.l = obj;
        return y3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01c6 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:43:0x0195, B:45:0x019d, B:47:0x01a3, B:50:0x01cd, B:52:0x01d3, B:54:0x01d9, B:55:0x01e6, B:56:0x0205, B:48:0x01c6, B:25:0x00d0, B:27:0x00d8, B:29:0x00de, B:33:0x010c, B:35:0x0112, B:39:0x011e, B:32:0x0106, B:21:0x00bd), top: B:65:0x00bd }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ServerConfig serverConfig;
        String str;
        Object objM8825constructorimpl;
        CoroutineScope coroutineScope;
        Object objQ;
        EmbyApiService embyApiService;
        String str2;
        int i;
        CoroutineScope coroutineScope2;
        b4 b4Var;
        ServerConfig serverConfig2;
        int i2;
        List listEmptyList;
        int i3;
        ServerConfig serverConfig3;
        Object objO;
        b4 b4Var2;
        List listEmptyList2;
        Response response;
        Response response2;
        CoroutineScope coroutineScope3 = (CoroutineScope) this.l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.k;
        ServerConfig serverConfig4 = this.n;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = this.j;
                    int i5 = this.i;
                    str2 = (String) this.e;
                    embyApiService = (EmbyApiService) this.d;
                    coroutineScope2 = (CoroutineScope) this.c;
                    ServerConfig serverConfig5 = this.b;
                    b4 b4Var3 = this.a;
                    ResultKt.throwOnFailure(obj);
                    serverConfig = serverConfig4;
                    serverConfig2 = serverConfig5;
                    b4Var = b4Var3;
                    coroutineScope = coroutineScope3;
                    str = "[";
                    i = i5;
                    objQ = obj;
                } else {
                    if (i4 != 2) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = this.i;
                    ServerConfig serverConfig6 = this.b;
                    b4Var2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    serverConfig = serverConfig4;
                    serverConfig3 = serverConfig6;
                    str = "[";
                    i3 = i6;
                    objO = obj;
                }
                response2 = (Response) objO;
                if (response2.isSuccessful() || response2.body() == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                } else {
                    Object objBody = response2.body();
                    objBody.getClass();
                    listEmptyList2 = b4.d(b4Var2, (QueryResult) objBody, serverConfig3.getAlias() + " 继续观看兜底");
                }
                i = i3;
                b4Var = b4Var2;
                response = response2;
                if (response.isSuccessful() || response.body() == null) {
                    throw new Exception("获取继续观看失败: " + response.code() + " " + response.message());
                }
                objM8825constructorimpl = CollectionsKt.take(b4.b(b4Var, listEmptyList2, i));
                Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                if (thM8828exceptionOrNullimpl != null) {
                    Log.e("AggregateHubRepo", str + serverConfig.getAlias() + "] 获取继续观看失败", thM8828exceptionOrNullimpl);
                }
                return Result.m8824boximpl(objM8825constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            b4 b4Var4 = this.m;
            int i7 = this.o;
            
            EmbyApiService embyApiServiceA = b4.a(b4Var4, serverConfig4);
            String strE = b4.e(b4Var4, serverConfig4);
            try {
                this.l = null;
                this.a = b4Var4;
                this.b = serverConfig4;
                this.c = null;
                this.d = embyApiServiceA;
                this.e = strE;
                this.i = i7;
                this.j = 0;
                this.k = 1;
                serverConfig = serverConfig4;
                coroutineScope = coroutineScope3;
                str = "[";
                try {
                    objQ = kb0.q(embyApiServiceA, strE, i7, false, "BasicSyncInfo,CanDelete,PrimaryImageAspectRatio,ProductionYear,PremiereDate,CommunityRating,ChildCount,UserData,SeriesName,ParentIndexNumber,IndexNumber,SeriesId,RunTimeTicks", 0, null, null, this, 116, null);
                    if (objQ != coroutine_suspended) {
                        embyApiService = embyApiServiceA;
                        str2 = strE;
                        i = i7;
                        coroutineScope2 = coroutineScope;
                        b4Var = b4Var4;
                        serverConfig2 = serverConfig;
                        i2 = 0;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    
                    objM8825constructorimpl = ResultKt.createFailure(th);
                }
            } catch (Throwable th2) {
                th = th2;
                serverConfig = serverConfig4;
                str = "[";
            }
            Response response3 = (Response) objQ;
            if (!response3.isSuccessful() || response3.body() == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                Object objBody2 = response3.body();
                objBody2.getClass();
                listEmptyList = b4.d(b4Var, (QueryResult) objBody2, serverConfig2.getAlias() + " 继续观看");
            }
            if (!response3.isSuccessful() || listEmptyList.isEmpty()) {
                List list = listEmptyList;
                String str3 = str2;
                Log.d("AggregateHubRepo", str + serverConfig2.getAlias() + "] Resume API失败或返回空，尝试备用方法: " + response3.code() + " " + response3.message());
                this.l = null;
                this.a = b4Var;
                this.b = serverConfig2;
                this.c = null;
                this.d = null;
                this.e = null;
                this.g = null;
                this.h = null;
                this.i = i;
                this.j = i2;
                this.k = 2;
                b4 b4Var5 = b4Var;
                i3 = i;
                serverConfig3 = serverConfig2;
                objO = kb0.o(embyApiService, str3, i3, null, false, null, null, "BasicSyncInfo,CanDelete,PrimaryImageAspectRatio,ProductionYear,PremiereDate,CommunityRating,ChildCount,UserData,SeriesName,ParentIndexNumber,IndexNumber,SeriesId,RunTimeTicks", this, 60, null);
                if (objO != coroutine_suspended) {
                    b4Var2 = b4Var5;
                    response2 = (Response) objO;
                    if (response2.isSuccessful()) {
                        listEmptyList2 = CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = CollectionsKt.emptyList();
                    }
                    i = i3;
                    b4Var = b4Var2;
                    response = response2;
                }
                return coroutine_suspended;
            }
            listEmptyList2 = listEmptyList;
            response = response3;
            if (response.isSuccessful()) {
            }
            throw new Exception("获取继续观看失败: " + response.code() + " " + response.message());
        } catch (Throwable th3) {
            th = th3;
            serverConfig = serverConfig4;
            str = "[";
        }
    }
}
