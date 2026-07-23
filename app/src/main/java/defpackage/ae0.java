package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.QueryResult;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ae0 extends SuspendLambda implements Function2 {
    public String a;
    public Object b;
    public int c;
    public final /* synthetic */ uf0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae0(uf0 uf0Var, String str, boolean z, String str2, String str3, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.d = uf0Var;
        this.e = str;
        this.g = z;
        this.h = str2;
        this.i = str3;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ae0(this.d, this.e, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ae0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objM8825constructorimpl;
        String strC;
        int i;
        String str2;
        uf0 uf0Var;
        Object items;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.c;
        String str3 = "EmbyRepository";
        int i3 = this.k;
        boolean z = this.g;
        String str4 = this.e;
        uf0 uf0Var2 = this.d;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                strC = uf0.c(uf0Var2, str4);
                String str5 = z ? "IsUnplayed" : null;
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                String str6 = this.h;
                str = "EmbyRepository";
                try {
                    str3 = this.i;
                    Integer numBoxInt = Boxing.boxInt(this.j);
                    i = i3;
                    Integer numBoxInt2 = Boxing.boxInt(i);
                    this.a = strC;
                    this.b = null;
                    this.c = 1;
                    str2 = str;
                    uf0Var = uf0Var2;
                    try {
                        items = apiService.getItems(str6, str3, "DateLastContentAdded,DateCreated,SortName", "Descending", "BasicSyncInfo,CollectionType,PrimaryImageAspectRatio,UserData,CommunityRating,ProviderIds,ProductionYear,ChildCount,Container,CanDelete", true, strC, "Primary,Backdrop,Thumb", str5, numBoxInt, numBoxInt2, this);
                        if (items == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        str = str2;
                        Log.e(str, "获取首页媒体栏目失败", e);
                        Result.Companion companion = Result.INSTANCE;
                        objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e(str, "获取首页媒体栏目失败", e);
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
                }
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str7 = this.a;
                ResultKt.throwOnFailure(obj);
                str2 = "EmbyRepository";
                i = i3;
                uf0Var = uf0Var2;
                strC = str7;
                items = obj;
            }
            Response response = (Response) items;
            if (!response.isSuccessful() || response.body() == null) {
                Result.Companion companion3 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception("获取首页媒体栏目失败: " + response.message())));
            } else {
                Object objBody = response.body();
                objBody.getClass();
                QueryResult queryResult = (QueryResult) objBody;
                List listB = uf0.b(uf0Var, queryResult, "首页媒体栏目");
                Log.d(str2, "首页媒体栏目加载成功: parentId=" + this.i + ", collectionType=" + str4 + ", includeItemTypes=" + strC + ", hidePlayed=" + z + ", startIndex=" + i + ", 返回" + listB.size() + "项, 总数" + queryResult.getTotalRecordCount());
                Result.Companion companion4 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(new od0(listB, queryResult.getTotalRecordCount()));
            }
        } catch (Exception e3) {
            e = e3;
            str = str3;
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
