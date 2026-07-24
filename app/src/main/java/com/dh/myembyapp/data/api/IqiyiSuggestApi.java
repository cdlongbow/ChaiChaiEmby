package com.dh.myembyapp.data.api;

import android.util.Log;
import com.google.gson.Gson;
import defpackage.bo0;
import defpackage.rd1;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
public final class IqiyiSuggestApi {
    private static final String SUGGEST_URL = "https://suggest.video.iqiyi.com/?if=mobile&key=";
    private static final String TAG = "IqiyiSuggestApi";
    public static final IqiyiSuggestApi INSTANCE = new IqiyiSuggestApi();
    private static final Gson gson = new Gson();

    /* JADX INFO: renamed from: client$delegate, reason: from kotlin metadata */
    private static final Lazy client = LazyKt.lazy(new bo0(20));
    

    /* JADX INFO: renamed from: com.dh.myembyapp.data.api.IqiyiSuggestApi$fetchSuggestions$2, reason: invalid class name */
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
                objM8825constructorimpl = listTake;
            } catch (Throwable th) {
                
                objM8825constructorimpl = ResultKt.createFailure(th);
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
