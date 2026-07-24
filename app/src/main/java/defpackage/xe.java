package defpackage;


import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.net.URLEncoder;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class xe extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ne d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(String str, String str2, ne neVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = neVar;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        xe xeVar = new xe(this.b, this.c, this.d, this.e, this.g, continuation);
        xeVar.a = obj;
        return xeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xe) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        JSONArray jSONArrayOptJSONArray;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.b;
        String str2 = this.c;
        ne neVar = this.d;
        int i = this.e;
        int i2 = this.g;
        try {
            
            String string = StringsKt.trim((CharSequence) str).toString();
            if (StringsKt.isBlank(string)) {
                throw new IllegalArgumentException("ASSRT API Key 为空");
            }
            String string2 = StringsKt.trim((CharSequence) str2).toString();
            if (StringsKt.isBlank(string2)) {
                throw new IllegalArgumentException("请输入搜索关键词");
            }
            String str3 = neVar.b;
            ye yeVar = ye.a;
            String strEncode = URLEncoder.encode(string, "UTF-8");
            strEncode.getClass();
            String strEncode2 = URLEncoder.encode(string2, "UTF-8");
            strEncode2.getClass();
            Throwable th = null;
            Response responseExecute = ExternalHttpClient.createApiClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.FORCE_DIRECT, false, false, 6, null).newCall(new Request.Builder().url(str3 + "/v1/sub/search?token=" + strEncode + "&q=" + strEncode2 + "&pos=" + i + "&cnt=" + i2 + "&is_file=1").header(HttpRequestHeader.UserAgent, RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null)).build()).execute();
            try {
                if (!responseExecute.getIsSuccessful()) {
                    throw new IllegalStateException("搜索失败：HTTP " + responseExecute.code());
                }
                ResponseBody responseBodyBody = responseExecute.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                if (strString == null) {
                    strString = "";
                }
                if (StringsKt.isBlank(strString)) {
                    throw new IllegalStateException("搜索失败：响应为空");
                }
                JSONObject jSONObject = new JSONObject(strString);
                ye.g(jSONObject);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sub");
                if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("subs")) {
                    jSONArrayOptJSONArray = jSONObject.has("subs") ? jSONObject.optJSONArray("subs") : null;
                } else {
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("subs");
                }
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject2 != null) {
                        ye yeVar2 = ye.a;
                        String strP = ye.p(jSONObjectOptJSONObject2, TtmlNode.ATTR_ID);
                        if (!StringsKt.isBlank(strP)) {
                            String strP2 = ye.p(jSONObjectOptJSONObject2, "videoname", "video_name", "videoName");
                            String strP3 = ye.p(jSONObjectOptJSONObject2, "native_name", "nativeName");
                            String strQ = ye.q(jSONObjectOptJSONObject2.opt("lang"));
                            if (StringsKt.isBlank(strQ)) {
                                strQ = ye.q(jSONObjectOptJSONObject2.opt("language"));
                            }
                            String strP4 = ye.p(jSONObjectOptJSONObject2, "release_site", "releaseSite", "from");
                            String strP5 = ye.p(jSONObjectOptJSONObject2, "filename", "file_name");
                            String strP6 = ye.p(jSONObjectOptJSONObject2, "upload_time", "update_time", "created_at");
                            String strP7 = ye.p(jSONObjectOptJSONObject2, "score", "rating", "rate", "star", "stars", "point");
                            String strReplace = StringsKt.isBlank(strP7) ? "" : new Regex("\\.0+$").replace(strP7, "");
                            String strP8 = ye.p(jSONObjectOptJSONObject2, "vote", "votes", "vote_count", "rating_count", "rater_count", "comment_count");
                            if (StringsKt.isBlank(strP2)) {
                                strP2 = strP3;
                            }
                            if (StringsKt.isBlank(strP2)) {
                                strP2 = "字幕 #" + strP;
                            }
                            if (StringsKt.isBlank(strQ)) {
                                strQ = "未知";
                            }
                            String str4 = strQ;
                            if (StringsKt.isBlank(strP4)) {
                                strP4 = "ASSRT";
                            }
                            arrayList.add(new qe(strP, strP2, strP3, str4, strP4, strP5, strP6, strReplace, strP8));
                        }
                    }
                    i3++;
                    th = null;
                }
                CloseableKt.closeFinally(responseExecute, th);
                objM8825constructorimpl = arrayList;
                return Result.m8824boximpl(objM8825constructorimpl);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(responseExecute, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            
            objM8825constructorimpl = ResultKt.createFailure(th4);
        }
    }
}
