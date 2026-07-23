package defpackage;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.api.ExternalHttpClient;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class oc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(String str, Context context, Function1 function1, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = context;
        this.d = function1;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        oc ocVar = new oc(this.b, this.c, this.d, this.e, continuation);
        ocVar.a = obj;
        return ocVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3, types: [okhttp3.Call] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Call call;
        Object objM8825constructorimpl;
        Object objM8825constructorimpl2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(this.b, '/', (String) null, 2, (Object) null);
        if (StringsKt.isBlank(strSubstringAfterLast$default)) {
            strSubstringAfterLast$default = "update-" + System.currentTimeMillis() + ".apk";
        }
        String strReplace = new Regex("[^A-Za-z0-9._-]").replace(strSubstringAfterLast$default, "_");
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = strReplace.toLowerCase(locale);
        lowerCase.getClass();
        if (!StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".apk", false, 2, null)) {
            strReplace = strReplace.concat(".apk");
        }
        File file = new File(this.c.getCacheDir(), "updates");
        file.mkdirs();
        File file2 = new File(file, strReplace);
        File file3 = new File(file, strReplace.concat(".part"));
        try {
            try {
                pc.c = false;
                if (file3.exists()) {
                    file3.delete();
                }
                if (file2.exists()) {
                    file2.delete();
                }
                OkHttpClient.Builder builderNewBuilder = ExternalHttpClient.createDownloadClient$default(ExternalHttpClient.INSTANCE, null, false, true, 3, null).newBuilder();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                call = null;
                try {
                    OkHttpClient okHttpClientBuild = builderNewBuilder.connectTimeout(15000L, timeUnit).readTimeout(15000L, timeUnit).build();
                    this.d.invoke(Boxing.boxInt(0));
                    String str = this.e;
                    Function1 function1 = this.d;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Log.i("AppUpdateRepository", "开始使用原始 GitHub 地址下载更新: route=app_proxy_auto, url=" + str);
                        pc.g(okHttpClientBuild, str, file3, function1, "original_github", Boxing.boxLong(8000L));
                        if (!file3.renameTo(file2)) {
                            throw new IOException("临时文件重命名失败");
                        }
                        objM8825constructorimpl2 = Result.m8825constructorimpl(Unit.INSTANCE);
                        if (Result.m8832isSuccessimpl(objM8825constructorimpl2)) {
                            Log.i("AppUpdateRepository", "原始 GitHub 地址下载完成: " + file2.getAbsolutePath());
                            Result resultM8824boximpl = Result.m8824boximpl(Result.m8825constructorimpl(new cc(file2, dc.a, false)));
                            pc.b = null;
                            return resultM8824boximpl;
                        }
                        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl2);
                        if (file3.exists()) {
                            file3.delete();
                        }
                        if (pc.c) {
                            throw new fc("用户已取消更新下载");
                        }
                        String str2 = this.e;
                        if (!StringsKt__StringsJVMKt.startsWith(str2, "https://gh-proxy.com/", true)) {
                            str2 = "https://gh-proxy.com/" + str2;
                        }
                        String str3 = str2;
                        if (thM8828exceptionOrNullimpl instanceof jc) {
                            Log.w("AppUpdateRepository", "原始 GitHub 地址下载过慢，已切换到 gh-proxy: progress=" + ((jc) thM8828exceptionOrNullimpl).b + "%, elapsed=" + ((jc) thM8828exceptionOrNullimpl).a + "ms, url=" + str3);
                        } else {
                            if (thM8828exceptionOrNullimpl instanceof ec) {
                                Log.w("AppUpdateRepository", "原始 GitHub 地址下载超时，但进度已超过自动切换阈值，不切换 gh-proxy: progress=" + ((ec) thM8828exceptionOrNullimpl).b + "%, elapsed=" + ((ec) thM8828exceptionOrNullimpl).a + "ms, timeout=15000ms, reason=" + ((ec) thM8828exceptionOrNullimpl).getMessage());
                                throw thM8828exceptionOrNullimpl;
                            }
                            Log.w("AppUpdateRepository", "原始 GitHub 地址下载失败，已切换到 gh-proxy: " + (thM8828exceptionOrNullimpl != null ? thM8828exceptionOrNullimpl.getMessage() : null) + ", url=" + str3);
                        }
                        this.d.invoke(Boxing.boxInt(0));
                        Log.i("AppUpdateRepository", "开始使用 gh-proxy 下载更新: route=force_direct, ignoreAppProxy=true, url=" + str3);
                        pc.g(ExternalHttpClient.createDownloadClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.FORCE_DIRECT, false, false, 6, null), str3, file3, this.d, "gh_proxy_direct", null);
                        if (!file3.renameTo(file2)) {
                            throw new IOException("临时文件重命名失败");
                        }
                        Log.i("AppUpdateRepository", "gh-proxy 下载完成: route=force_direct, file=" + file2.getAbsolutePath());
                        objM8825constructorimpl = Result.m8825constructorimpl(new cc(file2, dc.b, true));
                        pc.b = call;
                        return Result.m8824boximpl(objM8825constructorimpl);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8825constructorimpl2 = Result.m8825constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (Exception e) {
                    e = e;
                    if (file3.exists()) {
                        file3.delete();
                    }
                    if (e instanceof fc) {
                        Log.i("AppUpdateRepository", "更新下载已取消");
                    } else {
                        Log.e("AppUpdateRepository", "下载更新 APK 失败", e);
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(e));
                }
            } catch (Throwable th2) {
                th = th2;
                pc.b = obj;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            call = null;
        } catch (Throwable th3) {
            th = th3;
            obj = 0;
            pc.b = obj;
            throw th;
        }
    }
}
