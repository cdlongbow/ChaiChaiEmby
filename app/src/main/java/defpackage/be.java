package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.QueryResult;
import java.io.File;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class be extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be(String str, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new be(this.c, continuation, 0);
            case 1:
                return new be(this.c, continuation, 1);
            case 2:
                return new be(this.c, continuation, 2);
            case 3:
                return new be(this.c, continuation, 3);
            case 4:
                return new be(this.c, continuation, 4);
            case 5:
                return new be(this.c, continuation, 5);
            default:
                return new be(this.c, continuation, 6);
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
            case 4:
                break;
            case 5:
                break;
        }
        return ((be) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objF;
        Object objEmptyList;
        String str2;
        Object objF2;
        Object objEmptyList2;
        String str3;
        Object objF3;
        Object objEmptyList3;
        String str4;
        Object objF4;
        Object objEmptyList4;
        Object objWithContext;
        int i = this.a;
        String str5 = this.c;
        String str6 = "FavoritePage";
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!StringsKt__StringsJVMKt.startsWith(str5, "http://", true) && !StringsKt__StringsJVMKt.startsWith(str5, "https://", true)) {
                            File file = new File(str5);
                            if (file.exists() && file.isFile()) {
                                List list = d52.a;
                                String strA = d52.a(FilesKt.readBytes(file), new vb(2));
                                if (strA != null) {
                                    return strA;
                                }
                                Log.e("AssSubtitleParser", "无法识别本地 ASS/SSA 字幕编码: " + str5);
                                return strA;
                            }
                            Log.e("AssSubtitleParser", "本地 ASS/SSA 字幕文件不存在: " + str5);
                        }
                        Regex regex = de.a;
                        this.b = 1;
                        Object objWithContext2 = BuildersKt.withContext(Dispatchers.getIO(), new ae(str5, null), this);
                        return objWithContext2 == coroutine_suspended ? coroutine_suspended : objWithContext2;
                    }
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                } catch (Exception e) {
                    kb0.G("读取 ASS/SSA 字幕失败: ", e.getMessage(), "AssSubtitleParser", e);
                }
                return null;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                        String str7 = this.c;
                        this.b = 1;
                        str = "FavoritePage";
                        try {
                            objF = kb0.f(apiService, str7, null, false, null, null, null, "BoxSet", false, null, null, this, 958, null);
                            if (objF == coroutine_suspended2) {
                                objEmptyList = coroutine_suspended2;
                            }
                            return objEmptyList;
                        } catch (Exception e2) {
                            e = e2;
                            str6 = str;
                            Log.e(str6, "获取收藏合集异常: " + e.getMessage());
                            return CollectionsKt.emptyList();
                        }
                    }
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objF = obj;
                    str = "FavoritePage";
                    Response response = (Response) objF;
                    if (!response.isSuccessful()) {
                        str6 = str;
                        Log.e(str6, "获取收藏合集失败: " + response.code());
                        objEmptyList = CollectionsKt.emptyList();
                        break;
                    } else {
                        QueryResult queryResult = (QueryResult) response.body();
                        if (queryResult == null || (objEmptyList = queryResult.getItems()) == null) {
                            objEmptyList = CollectionsKt.emptyList();
                        }
                    }
                    return objEmptyList;
                } catch (Exception e3) {
                    e = e3;
                }
                break;
            case 2:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                try {
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        EmbyApiService apiService2 = RetrofitClient.INSTANCE.getApiService();
                        String str8 = this.c;
                        this.b = 1;
                        str2 = "FavoritePage";
                        try {
                            objF2 = kb0.f(apiService2, str8, null, false, null, null, null, "Episode", false, null, null, this, 958, null);
                            if (objF2 == coroutine_suspended3) {
                                objEmptyList2 = coroutine_suspended3;
                            }
                            return objEmptyList2;
                        } catch (Exception e4) {
                            e = e4;
                            str6 = str2;
                            Log.e(str6, "获取收藏单集异常: " + e.getMessage());
                            return CollectionsKt.emptyList();
                        }
                    }
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objF2 = obj;
                    str2 = "FavoritePage";
                    Response response2 = (Response) objF2;
                    if (!response2.isSuccessful()) {
                        str6 = str2;
                        Log.e(str6, "获取收藏单集失败: " + response2.code());
                        objEmptyList2 = CollectionsKt.emptyList();
                        break;
                    } else {
                        QueryResult queryResult2 = (QueryResult) response2.body();
                        if (queryResult2 == null || (objEmptyList2 = queryResult2.getItems()) == null) {
                            objEmptyList2 = CollectionsKt.emptyList();
                        }
                    }
                    return objEmptyList2;
                } catch (Exception e5) {
                    e = e5;
                }
                break;
            case 3:
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                try {
                    if (i5 == 0) {
                        ResultKt.throwOnFailure(obj);
                        EmbyApiService apiService3 = RetrofitClient.INSTANCE.getApiService();
                        String str9 = this.c;
                        this.b = 1;
                        str3 = "FavoritePage";
                        try {
                            objF3 = kb0.f(apiService3, str9, null, false, null, null, null, "Movie", false, null, null, this, 958, null);
                            if (objF3 == coroutine_suspended4) {
                                objEmptyList3 = coroutine_suspended4;
                            }
                            return objEmptyList3;
                        } catch (Exception e6) {
                            e = e6;
                            str6 = str3;
                            Log.e(str6, "获取收藏电影异常: " + e.getMessage());
                            return CollectionsKt.emptyList();
                        }
                    }
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objF3 = obj;
                    str3 = "FavoritePage";
                    Response response3 = (Response) objF3;
                    if (!response3.isSuccessful()) {
                        str6 = str3;
                        Log.e(str6, "获取收藏电影失败: " + response3.code());
                        objEmptyList3 = CollectionsKt.emptyList();
                        break;
                    } else {
                        QueryResult queryResult3 = (QueryResult) response3.body();
                        if (queryResult3 == null || (objEmptyList3 = queryResult3.getItems()) == null) {
                            objEmptyList3 = CollectionsKt.emptyList();
                        }
                    }
                    return objEmptyList3;
                } catch (Exception e7) {
                    e = e7;
                }
                break;
            case 4:
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.b;
                try {
                    if (i6 == 0) {
                        ResultKt.throwOnFailure(obj);
                        EmbyApiService apiService4 = RetrofitClient.INSTANCE.getApiService();
                        String str10 = this.c;
                        this.b = 1;
                        str4 = "FavoritePage";
                        try {
                            objF4 = kb0.f(apiService4, str10, null, false, null, null, null, "Series", false, null, null, this, 958, null);
                            if (objF4 == coroutine_suspended5) {
                                objEmptyList4 = coroutine_suspended5;
                            }
                            return objEmptyList4;
                        } catch (Exception e8) {
                            e = e8;
                            str6 = str4;
                            Log.e(str6, "获取收藏剧集异常: " + e.getMessage());
                            return CollectionsKt.emptyList();
                        }
                    }
                    if (i6 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objF4 = obj;
                    str4 = "FavoritePage";
                    Response response4 = (Response) objF4;
                    if (!response4.isSuccessful()) {
                        str6 = str4;
                        Log.e(str6, "获取收藏剧集失败: " + response4.code());
                        objEmptyList4 = CollectionsKt.emptyList();
                        break;
                    } else {
                        QueryResult queryResult4 = (QueryResult) response4.body();
                        if (queryResult4 == null || (objEmptyList4 = queryResult4.getItems()) == null) {
                            objEmptyList4 = CollectionsKt.emptyList();
                        }
                    }
                    return objEmptyList4;
                } catch (Exception e9) {
                    e = e9;
                }
                break;
            case 5:
                Object coroutine_suspended6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                EmbyApiService apiService5 = RetrofitClient.INSTANCE.getApiService();
                this.b = 1;
                Object objL = kb0.l(apiService5, this.c, 24, null, null, this, 12, null);
                return objL == coroutine_suspended6 ? coroutine_suspended6 : objL;
            default:
                Object coroutine_suspended7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.b;
                try {
                    if (i8 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (StringsKt__StringsJVMKt.startsWith(str5, "http://", true) || StringsKt__StringsJVMKt.startsWith(str5, "https://", true)) {
                            this.b = 1;
                            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new a32(str5, null), this);
                            if (objWithContext == coroutine_suspended7) {
                                objWithContext = coroutine_suspended7;
                            }
                        } else {
                            File file2 = new File(str5);
                            if (file2.exists() && file2.isFile()) {
                                List list2 = d52.a;
                                String strA2 = d52.a(FilesKt.readBytes(file2), new qu1(16));
                                if (strA2 == null) {
                                    Log.e("SrtParser", "无法识别本地 SRT 字幕编码: " + str5);
                                    objWithContext = CollectionsKt.emptyList();
                                } else {
                                    objWithContext = tl0.K(strA2);
                                }
                            } else {
                                Log.e("SrtParser", "本地字幕文件不存在: " + str5);
                                objWithContext = CollectionsKt.emptyList();
                            }
                        }
                    } else {
                        if (i8 != 1) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.throwOnFailure(obj);
                        objWithContext = obj;
                    }
                    return objWithContext;
                } catch (Exception e10) {
                    Log.e("SrtParser", "读取或解析本地 SRT 失败: " + e10.getMessage(), e10);
                    return CollectionsKt.emptyList();
                }
        }
    }
}
