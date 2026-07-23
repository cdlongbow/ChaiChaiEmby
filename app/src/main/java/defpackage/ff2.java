package defpackage;


import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.text.StringsKt;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ff2 {
    public final HttpUrl a;
    public final OkHttpClient b;
    public final String c;
    public final HttpUrl d;
    public final HttpUrl e;
    public final /* synthetic */ pf2 f;

    public ff2(pf2 pf2Var, ye2 ye2Var) {
        ye2Var.getClass();
        this.f = pf2Var;
        ye2 ye2VarA = ye2Var.a();
        String str = ye2VarA.b;
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String str2 = ye2VarA.a;
        HttpUrl httpUrl = companion.parse(str2);
        if (httpUrl == null) {
            ra.q("服务器地址格式不正确，请输入完整的 http:// 或 https:// 地址");
            throw null;
        }
        this.a = httpUrl;
        this.b = ExternalHttpClient.createDownloadClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.AUTO, false, false, 6, null);
        this.c = Credentials.basic$default(str, ye2VarA.c, null, 4, null);
        HttpUrl httpUrlResolve = httpUrl.resolve("./ChaiChaiEmby/");
        if (httpUrlResolve == null) {
            ra.q("无法基于当前地址生成同步目录");
            throw null;
        }
        this.d = httpUrlResolve;
        HttpUrl httpUrlResolve2 = httpUrlResolve.resolve("sync-config.json");
        if (httpUrlResolve2 == null) {
            ra.q("无法基于当前地址生成同步文件");
            throw null;
        }
        this.e = httpUrlResolve2;
        if (StringsKt.isBlank(str2)) {
            ra.q("请输入 WebDAV 服务器地址");
            throw null;
        }
        if (StringsKt.isBlank(str)) {
            ra.q("请输入 WebDAV 账号");
            throw null;
        }
    }

    public final void a() {
        Request.Builder builder = new Request.Builder();
        HttpUrl httpUrl = this.d;
        Request.Builder builderHeader = builder.url(httpUrl).header("Depth", "0");
        RequestBody.Companion companion = RequestBody.INSTANCE;
        Response responseB = b(builderHeader.method("PROPFIND", RequestBody.Companion.create$default(companion, new byte[0], MediaType.INSTANCE.get("application/xml"), 0, 0, 6, (Object) null)).build());
        try {
            if (responseB.getIsSuccessful()) {
                CloseableKt.closeFinally(responseB, null);
                return;
            }
            if (responseB.code() != 404) {
                throw new IllegalStateException("访问同步目录失败：HTTP " + responseB.code());
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(responseB, null);
            Response responseB2 = b(new Request.Builder().url(httpUrl).method("MKCOL", RequestBody.Companion.create$default(companion, new byte[0], (MediaType) null, 0, 0, 6, (Object) null)).build());
            try {
                if (!responseB2.getIsSuccessful() && responseB2.code() != 405) {
                    throw new IllegalStateException("创建同步目录失败：HTTP " + responseB2.code());
                }
                CloseableKt.closeFinally(responseB2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseB2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(responseB, th3);
                throw th4;
            }
        }
    }

    public final Response b(Request request) {
        return this.b.newCall(request.newBuilder().header(HttpRequestHeader.Authorization, this.c).header(HttpRequestHeader.UserAgent, RetrofitClient.INSTANCE.buildUserAgent("0.3.0")).build()).execute();
    }

    public final rf2 c() {
        Object objM8825constructorimpl;
        Response responseB = b(new Request.Builder().url(this.e).get().build());
        pf2 pf2Var = this.f;
        try {
            if (responseB.code() == 404) {
                CloseableKt.closeFinally(responseB, null);
                return null;
            }
            if (!responseB.getIsSuccessful()) {
                throw new IllegalStateException("读取远端文件失败：HTTP " + responseB.code());
            }
            String strString = responseB.body().string();
            if (StringsKt.isBlank(strString)) {
                CloseableKt.closeFinally(responseB, null);
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl((rf2) pf2Var.b.fromJson(strString, rf2.class));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
            if (thM8828exceptionOrNullimpl != null) {
                throw new IllegalStateException("远端同步文件格式无法识别", thM8828exceptionOrNullimpl);
            }
            rf2 rf2Var = (rf2) objM8825constructorimpl;
            CloseableKt.closeFinally(responseB, null);
            return rf2Var;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(responseB, th2);
                throw th3;
            }
        }
    }

    public final void d() {
        Response responseB = b(new Request.Builder().url(this.a).header("Depth", "0").method("PROPFIND", RequestBody.Companion.create$default(RequestBody.INSTANCE, new byte[0], MediaType.INSTANCE.get("application/xml"), 0, 0, 6, (Object) null)).build());
        try {
            if (responseB.getIsSuccessful()) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseB, null);
                a();
            } else {
                throw new IllegalStateException("连接失败：HTTP " + responseB.code());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(responseB, th);
                throw th2;
            }
        }
    }

    public final void e(rf2 rf2Var) {
        a();
        Request.Builder builderUrl = new Request.Builder().url(this.e);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String json = this.f.b.toJson(rf2Var);
        json.getClass();
        Response responseB = b(builderUrl.put(companion.create(json, MediaType.INSTANCE.get("application/json; charset=UTF-8"))).build());
        try {
            if (responseB.getIsSuccessful()) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseB, null);
            } else {
                throw new IllegalStateException("上传远端文件失败：HTTP " + responseB.code());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(responseB, th);
                throw th2;
            }
        }
    }
}
