package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;

import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class pc {
    public static final pc a = new pc();
    public static volatile Call b;
    public static volatile boolean c;

    public static final boolean a(String str, String str2) {
        int iCompareTo;
        String strI = i(str);
        String strI2 = i(str2);
        if (!StringsKt__StringsJVMKt.equals(strI, strI2, true)) {
            hc hcVarK = k(strI);
            hc hcVarK2 = k(strI2);
            if (hcVarK != null && hcVarK2 != null) {
                int i = hcVarK2.a;
                int i2 = hcVarK.a;
                if (i != i2) {
                    iCompareTo = Intrinsics.compare(i, i2);
                } else {
                    int i3 = hcVarK2.b;
                    int i4 = hcVarK.b;
                    if (i3 != i4) {
                        iCompareTo = Intrinsics.compare(i3, i4);
                    } else {
                        int i5 = hcVarK2.c;
                        int i6 = hcVarK.c;
                        if (i5 != i6) {
                            iCompareTo = Intrinsics.compare(i5, i6);
                        } else {
                            String str3 = hcVarK2.d;
                            String str4 = hcVarK.d;
                            if (str3 == null && str4 == null) {
                                iCompareTo = 0;
                            } else if (str3 == null) {
                                iCompareTo = 1;
                            } else if (str4 == null) {
                                iCompareTo = -1;
                            } else {
                                int iL = l(str3);
                                int iL2 = l(str4);
                                if (iL != iL2) {
                                    iCompareTo = Intrinsics.compare(iL, iL2);
                                } else {
                                    iCompareTo = !Intrinsics.areEqual(str3, str4) ? str3.compareTo(str4) : Intrinsics.compare(hcVarK2.e, hcVarK.e);
                                }
                            }
                        }
                    }
                }
                if (iCompareTo > 0) {
                }
            }
            return true;
        }
        return false;
    }

    public static final gc b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("assets");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ic(j(jSONObjectOptJSONObject, HintConstants.AUTOFILL_HINT_NAME), (!jSONObjectOptJSONObject.has("size") || jSONObjectOptJSONObject.isNull("size")) ? null : Long.valueOf(jSONObjectOptJSONObject.optLong("size")), j(jSONObjectOptJSONObject, "browser_download_url")));
                }
            }
        }
        return new gc(j(jSONObject, "tag_name"), j(jSONObject, HintConstants.AUTOFILL_HINT_NAME), j(jSONObject, TtmlNode.TAG_BODY), j(jSONObject, "html_url"), arrayList);
    }

    public static final String c(Request request) throws Exception {
        Throwable thM8828exceptionOrNullimpl;
        Proxy proxy = lr1.a;
        ProxyConfig proxyConfig = lr1.b;
        if (proxyConfig.getEnabled() && !StringsKt.isBlank(proxyConfig.getHost())) {
            try {
                Result.Companion companion = Result.INSTANCE;
                return h(ExternalHttpClient.createApiClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.FORCE_PROXY, false, true, 2, null), request);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(Result.m8825constructorimpl(ResultKt.createFailure(th)));
                if (thM8828exceptionOrNullimpl != null) {
                    Log.e("AppUpdateRepository", "代理检查更新失败，准备回退直连: " + thM8828exceptionOrNullimpl.getMessage(), thM8828exceptionOrNullimpl);
                }
            }
        } else {
            thM8828exceptionOrNullimpl = null;
        }
        Throwable th2 = thM8828exceptionOrNullimpl;
        try {
            return h(ExternalHttpClient.createApiClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.FORCE_DIRECT, false, false, 6, null), request);
        } catch (Exception e) {
            if (th2 != null) {
                throw new IOException(ll0.e("代理与直连都失败：proxy=", th2.getMessage(), ", direct=", e.getMessage()), e);
            }
            throw e;
        }
    }

    public static final ic d(List list) {
        Object obj;
        Object obj2;
        ic icVar;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ic icVar2 = (ic) next;
            String str2 = icVar2.a;
            String string = str2 != null ? StringsKt.trim((CharSequence) str2).toString() : null;
            if (string == null) {
                string = "";
            }
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".apk", false, 2, null) && (str = icVar2.c) != null && !StringsKt.isBlank(str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        List list2 = strArr != null ? ArraysKt.toList(strArr) : null;
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        Iterator it2 = list2.iterator();
        do {
            int i = 0;
            if (!it2.hasNext()) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    String str3 = ((ic) obj3).a;
                    if (str3 != null && StringsKt__StringsKt.contains(str3, (CharSequence) "universal", true)) {
                        obj = obj3;
                        break;
                    }
                }
                ic icVar3 = (ic) obj;
                return icVar3 != null ? icVar3 : (ic) CollectionsKt.first((List) arrayList);
            }
            String str4 = (String) it2.next();
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i);
                i++;
                String str5 = ((ic) obj2).a;
                if (str5 != null) {
                    str4.getClass();
                    if (StringsKt__StringsKt.contains(str5, (CharSequence) str4, true)) {
                        break;
                    }
                }
            }
            icVar = (ic) obj2;
        } while (icVar == null);
        return icVar;
    }

    public static void g(OkHttpClient okHttpClient, String str, File file, Function1 function1, String str2, Long l) throws IOException {
        Throwable th;
        Throwable th2;
        Call callNewCall = okHttpClient.newCall(new Request.Builder().url(str).header(HttpRequestHeader.Accept, "application/octet-stream").header(HttpRequestHeader.UserAgent, RetrofitClient.INSTANCE.buildUserAgent("0.3.0")).build());
        b = callNewCall;
        Response responseExecute = callNewCall.execute();
        try {
            Log.i("AppUpdateRepository", "更新下载连接已建立: route=" + str2 + ", requestUrl=" + str + ", finalUrl=" + responseExecute.request().url());
            if (!responseExecute.getIsSuccessful()) {
                throw new IOException("下载失败: HTTP " + responseExecute.code());
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody == null) {
                throw new IOException("下载失败：响应体为空");
            }
            long contentLength = responseBodyBody.getContentLength();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i = -1;
            try {
                InputStream inputStreamByteStream = responseBodyBody.byteStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        int i2 = -1;
                        long j = 0;
                        while (true) {
                            try {
                                int i3 = inputStreamByteStream.read(bArr);
                                long j2 = contentLength;
                                if (i3 == -1) {
                                    fileOutputStream.flush();
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        CloseableKt.closeFinally(fileOutputStream, null);
                                        try {
                                            CloseableKt.closeFinally(inputStreamByteStream, null);
                                            if (j <= 0) {
                                                throw new IOException("下载失败：文件大小为 0");
                                            }
                                            if (c) {
                                                throw new fc("用户已取消更新下载");
                                            }
                                            function1.invoke(100);
                                            CloseableKt.closeFinally(responseExecute, null);
                                            return;
                                        } catch (SocketTimeoutException e) {
                                            e = e;
                                            i = i2;
                                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            int iCoerceAtLeast = RangesKt.coerceAtLeast(i, 0);
                                            if (l != null && iCoerceAtLeast <= 2 && jElapsedRealtime2 >= l.longValue()) {
                                                throw new jc(jElapsedRealtime2, iCoerceAtLeast);
                                            }
                                            throw new ec(jElapsedRealtime2, iCoerceAtLeast, e);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i = i2;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            CloseableKt.closeFinally(inputStreamByteStream, th);
                                            throw th4;
                                        }
                                    }
                                }
                                fileOutputStream.write(bArr, 0, i3);
                                j += (long) i3;
                                if (j2 > 0) {
                                    int iCoerceIn = RangesKt.coerceIn((int) ((100 * j) / j2), 0, 100);
                                    if (iCoerceIn != i2) {
                                        function1.invoke(Integer.valueOf(iCoerceIn));
                                        i2 = iCoerceIn;
                                    }
                                    if (c) {
                                        throw new fc("用户已取消更新下载");
                                    }
                                    if (l != null && iCoerceIn <= 2 && SystemClock.elapsedRealtime() - jElapsedRealtime >= l.longValue()) {
                                        throw new jc(SystemClock.elapsedRealtime() - jElapsedRealtime, iCoerceIn);
                                    }
                                }
                                contentLength = j2;
                            } catch (Throwable th5) {
                                th2 = th5;
                                i = i2;
                                try {
                                    throw th2;
                                } catch (Throwable th6) {
                                    CloseableKt.closeFinally(fileOutputStream, th2);
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    throw th;
                }
            } catch (SocketTimeoutException e2) {
                e = e2;
            }
        } catch (Throwable th9) {
            try {
                throw th9;
            } catch (Throwable th10) {
                CloseableKt.closeFinally(responseExecute, th9);
                throw th10;
            }
        }
    }

    public static String h(OkHttpClient okHttpClient, Request request) throws IOException {
        Response responseExecute = okHttpClient.newCall(request).execute();
        try {
            if (responseExecute.getIsSuccessful()) {
                ResponseBody responseBodyBody = responseExecute.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                if (strString == null) {
                    strString = "";
                }
                CloseableKt.closeFinally(responseExecute, null);
                return strString;
            }
            throw new IOException("GitHub API 请求失败: HTTP " + responseExecute.code() + ", limit=" + Response.header$default(responseExecute, "X-RateLimit-Limit", null, 2, null) + ", remaining=" + Response.header$default(responseExecute, "X-RateLimit-Remaining", null, 2, null) + ", reset=" + Response.header$default(responseExecute, "X-RateLimit-Reset", null, 2, null));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(responseExecute, th);
                throw th2;
            }
        }
    }

    public static String i(String str) {
        return StringsKt.removePrefix(StringsKt.removePrefix(StringsKt.trim((CharSequence) str).toString(), (CharSequence) "v"), (CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
    }

    public static String j(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        strOptString.getClass();
        if (StringsKt.isBlank(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public static hc k(String str) {
        Integer intOrNull;
        MatchResult matchResultMatchEntire = new Regex("^(\\d+)(?:\\.(\\d+))?(?:\\.(\\d+))?(?:[-.]?([A-Za-z]+)(\\d*)?)?$").matchEntire(str);
        String lowerCase = null;
        if (matchResultMatchEntire == null || (intOrNull = StringsKt.toIntOrNull(matchResultMatchEntire.getGroupValues().get(1))) == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull(matchResultMatchEntire.getGroupValues().get(2));
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        Integer intOrNull3 = StringsKt.toIntOrNull(matchResultMatchEntire.getGroupValues().get(3));
        int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
        String str2 = matchResultMatchEntire.getGroupValues().get(4);
        if (StringsKt.isBlank(str2)) {
            str2 = null;
        }
        String str3 = str2;
        if (str3 != null) {
            Locale locale = Locale.ROOT;
            locale.getClass();
            lowerCase = str3.toLowerCase(locale);
            lowerCase.getClass();
        }
        String str4 = lowerCase;
        Integer intOrNull4 = StringsKt.toIntOrNull(matchResultMatchEntire.getGroupValues().get(5));
        return new hc(str4, iIntValue, iIntValue2, iIntValue3, intOrNull4 != null ? intOrNull4.intValue() : 0);
    }

    public static int l(String str) {
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == 3633) {
            return !lowerCase.equals("rc") ? 3 : 2;
        }
        if (iHashCode != 3020272) {
            return (iHashCode == 92909918 && lowerCase.equals("alpha")) ? 0 : 3;
        }
        return !lowerCase.equals("beta") ? 3 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        lc lcVar;
        if (continuationImpl instanceof lc) {
            lcVar = (lc) continuationImpl;
            int i = lcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcVar.d = i - Integer.MIN_VALUE;
            } else {
                lcVar = new lc(this, continuationImpl);
            }
        } else {
            lcVar = new lc(this, continuationImpl);
        }
        Object objWithContext = lcVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = lcVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            mc mcVar = new mc(str, null);
            lcVar.a = null;
            lcVar.d = 1;
            objWithContext = BuildersKt.withContext(io2, mcVar, lcVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Context context, String str, String str2, rc rcVar, ContinuationImpl continuationImpl) {
        nc ncVar;
        if (continuationImpl instanceof nc) {
            ncVar = (nc) continuationImpl;
            int i = ncVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncVar.h = i - Integer.MIN_VALUE;
            } else {
                ncVar = new nc(this, continuationImpl);
            }
        } else {
            ncVar = new nc(this, continuationImpl);
        }
        Object objWithContext = ncVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ncVar.h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            oc ocVar = new oc(str2, context, rcVar, str, null);
            ncVar.a = null;
            ncVar.b = null;
            ncVar.c = null;
            ncVar.d = null;
            ncVar.h = 1;
            objWithContext = BuildersKt.withContext(io2, ocVar, ncVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }
}
