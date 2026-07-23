package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ge0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ uf0 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge0(String str, int i, int i2, boolean z, String str2, String str3, String str4, String str5, uf0 uf0Var, String str6, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = uf0Var;
        this.l = str6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ge0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ge0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        int i;
        String str9;
        String str10;
        String str11;
        String str12;
        int i2;
        Object objH;
        uf0 uf0Var = this.k;
        String str13 = "分页加载请求: parentId=";
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.a;
        String str14 = this.j;
        String str15 = this.i;
        String str16 = this.h;
        String str17 = this.g;
        boolean z2 = this.e;
        String str18 = this.b;
        int i4 = this.d;
        int i5 = this.c;
        String str19 = "EmbyRepository";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Log.d(str19, "分页加载请求: parentId=" + str18 + ", startIndex=" + i5 + ", limit=" + i4 + ", recursive=" + z2 + ", includeItemTypes=" + str17 + ", sortBy=" + str16 + ", sortOrder=" + str15 + ", fields=" + str14);
                    EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                    str19 = str19;
                    String str20 = this.l;
                    String str21 = this.b;
                    str13 = this.h;
                    String str22 = this.i;
                    String str23 = this.j;
                    boolean z3 = this.e;
                    String str24 = this.g;
                    Integer numBoxInt = Boxing.boxInt(i4);
                    Integer numBoxInt2 = Boxing.boxInt(i5);
                    this.a = 1;
                    str = ", sortBy=";
                    str2 = str14;
                    str3 = str17;
                    str4 = ", includeItemTypes=";
                    str5 = str16;
                    str6 = str19;
                    z = z2;
                    str7 = ", fields=";
                    str8 = str18;
                    i = i5;
                    str9 = ", sortOrder=";
                    str10 = ", recursive=";
                    str11 = ", limit=";
                    str12 = ", startIndex=";
                    i2 = i4;
                    try {
                        objH = kb0.h(apiService, str20, str21, str13, str22, str23, z3, str24, null, null, numBoxInt, numBoxInt2, this, RendererCapabilities.DECODER_SUPPORT_MASK, null);
                        if (objH == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        str13 = str6;
                        Log.e(str13, "分页加载失败", e);
                        Result.Companion companion = Result.INSTANCE;
                        objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
                        return Result.m8824boximpl(objM8825constructorimpl);
                    }
                } catch (Exception e2) {
                    e = e2;
                    str13 = str19;
                    Log.e(str13, "分页加载失败", e);
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
                    return Result.m8824boximpl(objM8825constructorimpl);
                }
            } else {
                if (i3 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                str5 = str16;
                str3 = str17;
                z = z2;
                str8 = str18;
                i = i5;
                str9 = ", sortOrder=";
                str = ", sortBy=";
                str4 = ", includeItemTypes=";
                str10 = ", recursive=";
                str11 = ", limit=";
                str12 = ", startIndex=";
                i2 = i4;
                str2 = str14;
                str7 = ", fields=";
                str6 = str19;
                objH = obj;
            }
            Response response = (Response) objH;
            try {
                if (!response.isSuccessful() || response.body() == null) {
                    String str25 = str6;
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    Log.w(str25, "分页加载失败: code=" + response.code() + ", message=" + response.message() + ", parentId=" + str8 + str12 + i + str11 + i2 + str10 + z + str4 + str3 + str + str5 + str9 + str15 + str7 + str2 + ", errorBody=" + (strString != null ? StringsKt.take(strString, 1000) : null));
                    Result.Companion companion3 = Result.INSTANCE;
                    int iCode = response.code();
                    String strMessage = response.message();
                    StringBuilder sb = new StringBuilder("获取媒体项失败: ");
                    sb.append(strMessage);
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new nd0(iCode, sb.toString())));
                } else {
                    Object objBody = response.body();
                    objBody.getClass();
                    QueryResult queryResult = (QueryResult) objBody;
                    List listB = uf0.b(uf0Var, queryResult, "分页加载");
                    Log.d(str6, "分页加载成功: 返回" + listB.size() + "项, 总数" + queryResult.getTotalRecordCount());
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(new od0(listB, queryResult.getTotalRecordCount()));
                }
            } catch (Exception e3) {
                e = e3;
                Log.e(str13, "分页加载失败", e);
                Result.Companion companion5 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
            }
        } catch (Exception e4) {
            e = e4;
            str13 = str19;
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
