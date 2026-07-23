package com.dh.myembyapp.data.api;

import android.util.Log;
import com.google.gson.Gson;
import defpackage.bo0;
import defpackage.rd1;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/dh/myembyapp/data/api/IqiyiSuggestApi;", "", "<init>", "()V", "TAG", "", "SUGGEST_URL", "gson", "Lcom/google/gson/Gson;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "Lkotlin/Lazy;", "fetchSuggestions", "", "Lcom/dh/myembyapp/data/api/IqiyiSuggestItem;", "keyword", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IqiyiSuggestApi {
    private static final String SUGGEST_URL = "https://suggest.video.iqiyi.com/?if=mobile&key=";
    private static final String TAG = "IqiyiSuggestApi";
    public static final IqiyiSuggestApi INSTANCE = new IqiyiSuggestApi();
    private static final Gson gson = new Gson();

    /* JADX INFO: renamed from: client$delegate, reason: from kotlin metadata */
    private static final Lazy client = LazyKt.lazy(new bo0(20));
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.dh.myembyapp.data.api.IqiyiSuggestApi$fetchSuggestions$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/dh/myembyapp/data/api/IqiyiSuggestItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.dh.myembyapp.data.api.IqiyiSuggestApi$fetchSuggestions$2", f = "IqiyiSuggestApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends IqiyiSuggestItem>>, Object> {
        final /* synthetic */ String $keyword;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$keyword = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$keyword, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<IqiyiSuggestItem>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM8825constructorimpl;
            List listTake;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            String string = StringsKt.trim((CharSequence) this.$keyword).toString();
            if (string.length() == 0) {
                return CollectionsKt.emptyList();
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Response responseExecute = IqiyiSuggestApi.INSTANCE.getClient().newCall(new Request.Builder().url(IqiyiSuggestApi.SUGGEST_URL + URLEncoder.encode(string, "UTF-8")).header("Accept", "application/json").get().build()).execute();
                ResponseBody responseBodyBody = responseExecute.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                if (strString == null) {
                    strString = "";
                }
                if (responseExecute.getIsSuccessful()) {
                    listTake = CollectionsKt.take(((IqiyiSuggestResponse) IqiyiSuggestApi.gson.fromJson(strString, IqiyiSuggestResponse.class)).getData(), 10);
                } else {
                    Log.w(IqiyiSuggestApi.TAG, "请求失败: " + responseExecute.code());
                    listTake = CollectionsKt.emptyList();
                }
                objM8825constructorimpl = Result.m8825constructorimpl(listTake);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
            if (thM8828exceptionOrNullimpl == null) {
                return objM8825constructorimpl;
            }
            Log.e(IqiyiSuggestApi.TAG, "获取联想建议失败", thM8828exceptionOrNullimpl);
            return CollectionsKt.emptyList();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends IqiyiSuggestItem>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<IqiyiSuggestItem>>) continuation);
        }
    }

    private IqiyiSuggestApi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient client_delegate$lambda$0() {
        return ExternalHttpClient.INSTANCE.createApiClient(ExternalHttpClient.RouteMode.AUTO, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient getClient() {
        return (OkHttpClient) client.getValue();
    }

    public final Object fetchSuggestions(String str, Continuation<? super List<IqiyiSuggestItem>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
    }
}
