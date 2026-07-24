package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;

import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ye {
    public static final ye a = new ye();
    public static final List b = CollectionsKt.listOf((Object[]) new String[]{"ass", "ssa", "srt", "vtt", "sub"});

    public static final File a(byte[] bArr, File file, String str, String str2) {
        List list;
        Object next;
        String strSubstringAfterLast$default;
        File file2;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (true) {
                list = b;
                next = null;
                if (nextEntry == null) {
                    break;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    name.getClass();
                    String strSubstringAfterLast$default2 = StringsKt__StringsKt.substringAfterLast$default(name, '/', (String) null, 2, (Object) null);
                    String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(strSubstringAfterLast$default2, '.', "");
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = strSubstringAfterLast.toLowerCase(locale);
                    lowerCase.getClass();
                    if (list.contains(lowerCase)) {
                        File file3 = new File(file, str + "_" + System.currentTimeMillis() + "_" + arrayList.size() + "." + lowerCase);
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        try {
                            ByteStreamsKt.copyTo$default(zipInputStream, fileOutputStream, 0, 2, null);
                            CloseableKt.closeFinally(fileOutputStream, null);
                            arrayList.add(file3);
                            linkedHashMap.put(strSubstringAfterLast$default2, file3);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipInputStream, null);
            if (arrayList.isEmpty()) {
                return null;
            }
            if (str2 != null && (strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(str2, '/', (String) null, 2, (Object) null)) != null) {
                if (StringsKt.isBlank(strSubstringAfterLast$default)) {
                    strSubstringAfterLast$default = null;
                }
                if (strSubstringAfterLast$default != null && (file2 = (File) linkedHashMap.get(strSubstringAfterLast$default)) != null) {
                    return file2;
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    String extension = FilesKt.getExtension((File) next);
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    String lowerCase2 = extension.toLowerCase(locale2);
                    lowerCase2.getClass();
                    int iIndexOf = list.indexOf(lowerCase2);
                    if (iIndexOf < 0) {
                        iIndexOf = Integer.MAX_VALUE;
                    }
                    do {
                        Object next2 = it.next();
                        String extension2 = FilesKt.getExtension((File) next2);
                        Locale locale3 = Locale.ROOT;
                        locale3.getClass();
                        String lowerCase3 = extension2.toLowerCase(locale3);
                        lowerCase3.getClass();
                        int iIndexOf2 = list.indexOf(lowerCase3);
                        if (iIndexOf2 < 0) {
                            iIndexOf2 = Integer.MAX_VALUE;
                        }
                        if (iIndexOf > iIndexOf2) {
                            next = next2;
                            iIndexOf = iIndexOf2;
                        }
                    } while (it.hasNext());
                }
            }
            return (File) next;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(zipInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    public static final re b(String str, qe qeVar, ne neVar) throws IOException {
        String str2;
        String str3 = neVar.b;
        String strEncode = URLEncoder.encode(str, "UTF-8");
        strEncode.getClass();
        String str4 = qeVar.a;
        String strEncode2 = URLEncoder.encode(str4, "UTF-8");
        strEncode2.getClass();
        Response responseExecute = ExternalHttpClient.createApiClient$default(ExternalHttpClient.INSTANCE, ExternalHttpClient.RouteMode.FORCE_DIRECT, false, false, 6, null).newCall(new Request.Builder().url(str3 + "/v1/sub/detail?token=" + strEncode + "&id=" + strEncode2).header(HttpRequestHeader.UserAgent, RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null)).build()).execute();
        try {
            if (!responseExecute.getIsSuccessful()) {
                throw new IllegalStateException("获取字幕详情失败：HTTP " + responseExecute.code());
            }
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            String str5 = "";
            if (strString == null) {
                strString = "";
            }
            if (StringsKt.isBlank(strString)) {
                throw new IllegalStateException("获取字幕详情失败：响应为空");
            }
            JSONObject jSONObject = new JSONObject(strString);
            CloseableKt.closeFinally(responseExecute, null);
            g(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sub");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = i(jSONObject, str4);
                if (jSONObjectOptJSONObject == null) {
                    if (n(jSONObject)) {
                        jSONObjectOptJSONObject = jSONObject;
                    } else {
                        jSONObjectOptJSONObject = null;
                    }
                }
            } else {
                JSONObject jSONObjectI = i(jSONObjectOptJSONObject, str4);
                if (jSONObjectI != null) {
                    jSONObjectOptJSONObject = jSONObjectI;
                } else if (!n(jSONObjectOptJSONObject)) {
                    jSONObjectOptJSONObject = i(jSONObject, str4);
                    if (jSONObjectOptJSONObject == null) {
                        if (n(jSONObject)) {
                            jSONObjectOptJSONObject = jSONObject;
                        } else {
                            jSONObjectOptJSONObject = null;
                        }
                    }
                }
            }
            if (jSONObjectOptJSONObject == null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                Log.e("AssrtSubtitleRepo", "字幕详情缺少可用对象（sub/subs），id=" + str4 + "，root keys=" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
                String string = jSONObject.toString();
                string.getClass();
                Log.e("AssrtSubtitleRepo", "字幕详情 root 内容（截断）: " + StringsKt.take(string, 1800));
                rd1.o("字幕详情缺少 sub 字段");
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("filelist");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                int i = 0;
                while (i < length) {
                    Object objOpt = jSONArrayOptJSONArray.opt(i);
                    if (objOpt instanceof String) {
                        arrayList2.add(new oe(StringsKt.trim((CharSequence) objOpt).toString(), str5));
                    } else {
                        if (objOpt instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) objOpt;
                            str2 = str5;
                            String strP = p(jSONObject2, "f", HintConstants.AUTOFILL_HINT_NAME, "filename", "file_name");
                            String strP2 = p(jSONObject2, "url", "download_url", "downloadUrl", "link");
                            if (!StringsKt.isBlank(strP) || !StringsKt.isBlank(strP2)) {
                                arrayList2.add(new oe(strP, strP2));
                            }
                        }
                        i++;
                        str5 = str2;
                    }
                    str2 = str5;
                    i++;
                    str5 = str2;
                }
            }
            String str6 = str5;
            if (arrayList2.isEmpty()) {
                String strP3 = p(jSONObjectOptJSONObject, "filename", "file_name");
                String strP4 = p(jSONObjectOptJSONObject, "url", "download_url", "downloadUrl");
                if (!StringsKt.isBlank(strP3) || !StringsKt.isBlank(strP4)) {
                    arrayList2.add(new oe(strP3, strP4));
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                oe oeVar = (oe) obj;
                String strO = o(oeVar.b, neVar);
                String str7 = oeVar.a;
                str7.getClass();
                strO.getClass();
                arrayList3.add(new oe(str7, strO));
            }
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                oe oeVar2 = (oe) obj2;
                if (!k(oeVar2.a)) {
                    String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringBefore$default(oeVar2.b, '?', (String) null, 2, (Object) null), '#', (String) null, 2, (Object) null), '.', "");
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = strSubstringAfterLast.toLowerCase(locale);
                    lowerCase.getClass();
                    if (b.contains(lowerCase)) {
                    }
                }
                arrayList4.add(obj2);
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            int size3 = arrayList4.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList4.get(i4);
                i4++;
                oe oeVar3 = (oe) obj3;
                String str8 = oeVar3.a;
                if (StringsKt.isBlank(str8)) {
                    str8 = "未命名字幕";
                }
                String str9 = oeVar3.b;
                String strL = l(oeVar3.a, str9);
                Locale locale2 = Locale.ROOT;
                locale2.getClass();
                String upperCase = strL.toUpperCase(locale2);
                upperCase.getClass();
                if (StringsKt.isBlank(upperCase)) {
                    upperCase = "SRT";
                }
                arrayList5.add(new se(str8, str9, upperCase));
            }
            String strP5 = p(jSONObjectOptJSONObject, "url", "download_url", "downloadUrl", "file_url", "link");
            if (!m(strP5)) {
                Iterator it = CollectionsKt.listOf((Object[]) new String[]{"url", "download", "downloads", "links", "filelist", "files", "data", "subs"}).iterator();
                while (it.hasNext()) {
                    String strH = h(jSONObjectOptJSONObject.opt((String) it.next()));
                    if (m(strH)) {
                        strP5 = strH;
                    }
                }
                strP5 = str6;
            }
            return new re(qeVar, arrayList5, o(strP5, neVar));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(responseExecute, th);
                throw th2;
            }
        }
    }

    public static final boolean c(String str, String str2, byte[] bArr) {
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return StringsKt__lowerCase.contains(".rar") || Intrinsics.areEqual(str2, "rar") || (bArr.length >= 7 && bArr[0] == 82 && bArr[1] == 97 && bArr[2] == 114 && bArr[3] == 33 && bArr[4] == 26 && bArr[5] == 7);
    }

    public static final String d(String str) {
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String str2 = "zh";
        if (!StringsKt__lowerCase.contains("简") && !StringsKt__lowerCase.contains("zh") && !StringsKt__lowerCase.contains("中") && !StringsKt__lowerCase.contains("繁")) {
            str2 = "en";
            if (!StringsKt__lowerCase.contains("英") && !StringsKt__lowerCase.contains("en")) {
                str2 = "ja";
                if (!StringsKt__lowerCase.contains("日") && !StringsKt__lowerCase.contains("ja")) {
                    str2 = "ko";
                    if (!StringsKt__lowerCase.contains("韩") && !StringsKt__lowerCase.contains("ko")) {
                        return C.LANGUAGE_UNDETERMINED;
                    }
                }
            }
        }
        return str2;
    }

    public static final String e(String str) {
        String str2;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 96897:
                return !lowerCase.equals("ass") ? MimeTypes.APPLICATION_SUBRIP : MimeTypes.TEXT_SSA;
            case 114165:
                str2 = "srt";
                break;
            case 114177:
                return !lowerCase.equals("ssa") ? MimeTypes.APPLICATION_SUBRIP : MimeTypes.TEXT_SSA;
            case 114240:
                str2 = "sub";
                break;
            case 117110:
                return !lowerCase.equals("vtt") ? MimeTypes.APPLICATION_SUBRIP : MimeTypes.TEXT_VTT;
            default:
                return MimeTypes.APPLICATION_SUBRIP;
        }
        lowerCase.equals(str2);
        return MimeTypes.APPLICATION_SUBRIP;
    }

    public static void g(JSONObject jSONObject) {
        Object objM8825constructorimpl;
        Object objM8825constructorimpl2;
        Integer num = null;
        if (jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
            try {
                
                objM8825constructorimpl = Integer.valueOf(jSONObject.getInt(NotificationCompat.CATEGORY_STATUS));
            } catch (Throwable th) {
                
                objM8825constructorimpl = ResultKt.createFailure(th);
            }
            num = (Integer) (false ? null : objM8825constructorimpl);
        } else if (jSONObject.has("code")) {
            try {
                
                objM8825constructorimpl2 = Integer.valueOf(jSONObject.getInt("code"));
            } catch (Throwable th2) {
                
                objM8825constructorimpl2 = ResultKt.createFailure(th2);
            }
            num = (Integer) (false ? null : objM8825constructorimpl2);
        }
        if (num == null || num.intValue() == 0) {
            return;
        }
        String strP = p(jSONObject, "errmsg", NotificationCompat.CATEGORY_MESSAGE, "message");
        if (StringsKt.isBlank(strP)) {
            strP = "ASSRT 返回错误(" + num + ")";
        }
        rd1.o(strP);
    }

    public static String h(Object obj) {
        Object objM8825constructorimpl;
        String strH;
        Object objM8825constructorimpl2;
        if (obj != null && !Intrinsics.areEqual(obj, JSONObject.NULL)) {
            if (obj instanceof String) {
                String string = StringsKt.trim((CharSequence) obj).toString();
                if (m(string)) {
                    return string;
                }
                if (StringsKt__StringsJVMKt.startsWith$default(string, "{", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(string, "}", false, 2, null)) {
                    try {
                        
                        objM8825constructorimpl2 = new JSONObject(string);
                    } catch (Throwable th) {
                        
                        objM8825constructorimpl2 = ResultKt.createFailure(th);
                    }
                    if (false) {
                        objM8825constructorimpl2 = null;
                    }
                    JSONObject jSONObject = (JSONObject) objM8825constructorimpl2;
                    strH = jSONObject != null ? h(jSONObject) : null;
                    if (strH == null) {
                        return "";
                    }
                } else if (StringsKt__StringsJVMKt.startsWith$default(string, "[", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(string, "]", false, 2, null)) {
                    try {
                        
                        objM8825constructorimpl = new JSONArray(string);
                    } catch (Throwable th2) {
                        
                        objM8825constructorimpl = ResultKt.createFailure(th2);
                    }
                    if (false) {
                        objM8825constructorimpl = null;
                    }
                    JSONArray jSONArray = (JSONArray) objM8825constructorimpl;
                    strH = jSONArray != null ? h(jSONArray) : null;
                    if (strH == null) {
                        return "";
                    }
                }
                return strH;
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                String strP = p(jSONObject2, "url", "download_url", "downloadUrl", "link", "https", "http");
                if (m(strP)) {
                    return strP;
                }
                Iterator it = CollectionsKt.listOf((Object[]) new String[]{"file", "files", "urls", "list", "download", "data"}).iterator();
                while (it.hasNext()) {
                    String strH2 = h(jSONObject2.opt((String) it.next()));
                    if (m(strH2)) {
                        return strH2;
                    }
                }
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                int length = jSONArray2.length();
                for (int i = 0; i < length; i++) {
                    String strH3 = h(jSONArray2.opt(i));
                    if (m(strH3)) {
                        return strH3;
                    }
                }
            }
        }
        return "";
    }

    public static JSONObject i(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subs");
        JSONObject jSONObject2 = null;
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject2 == null) {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
                if (Intrinsics.areEqual(p(jSONObjectOptJSONObject, TtmlNode.ATTR_ID), str)) {
                    return jSONObjectOptJSONObject;
                }
            }
        }
        return jSONObject2;
    }

    public static boolean k(String str) {
        String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(str, '.', "");
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = strSubstringAfterLast.toLowerCase(locale);
        lowerCase.getClass();
        return b.contains(lowerCase);
    }

    public static String l(String str, String str2) {
        String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(str, '.', "");
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = strSubstringAfterLast.toLowerCase(locale);
        lowerCase.getClass();
        if (!StringsKt.isBlank(lowerCase)) {
            return lowerCase;
        }
        String lowerCase2 = StringsKt__StringsKt.substringAfterLast(str2, '.', "").toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2;
    }

    public static boolean m(String str) {
        String string = StringsKt.trim((CharSequence) str).toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        return StringsKt__StringsJVMKt.startsWith$default(lowerCase, "http://", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(lowerCase, "https://", false, 2, null);
    }

    public static boolean n(JSONObject jSONObject) {
        return jSONObject.has("url") || jSONObject.has("filelist") || jSONObject.has("filename") || jSONObject.has("file_name");
    }

    public static String o(String str, ne neVar) {
        Object objM8825constructorimpl;
        String lowerCase;
        String string = StringsKt.trim((CharSequence) str).toString();
        if (!m(string)) {
            return string;
        }
        try {
            
            String host = new URI(string).getHost();
            if (host != null) {
                Locale locale = Locale.ROOT;
                locale.getClass();
                lowerCase = host.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            objM8825constructorimpl = lowerCase;
        } catch (Throwable th) {
            
            objM8825constructorimpl = ResultKt.createFailure(th);
        }
        String str2 = (String) (false ? null : objM8825constructorimpl);
        if (str2 == null) {
            str2 = "";
        }
        if (StringsKt.isBlank(str2)) {
            return string;
        }
        return (str2.equals("assrt.net") || StringsKt__StringsJVMKt.endsWith$default(str2, ".assrt.net", false, 2, null)) ? new Regex("^https?://", RegexOption.IGNORE_CASE).replaceFirst(string, neVar.a.concat("://")) : string;
    }

    public static String p(JSONObject jSONObject, String... strArr) {
        Object objOpt;
        for (String str : strArr) {
            if (jSONObject.has(str) && (objOpt = jSONObject.opt(str)) != null && !Intrinsics.areEqual(objOpt, JSONObject.NULL)) {
                String string = StringsKt.trim((CharSequence) objOpt.toString()).toString();
                if (!StringsKt.isBlank(string)) {
                    return string;
                }
            }
        }
        return "";
    }

    public static String q(Object obj) {
        Object objM8825constructorimpl;
        Object objM8825constructorimpl2;
        if (obj != null && !Intrinsics.areEqual(obj, JSONObject.NULL)) {
            if (obj instanceof JSONObject) {
                return p((JSONObject) obj, "desc", HintConstants.AUTOFILL_HINT_NAME, "text", "lang", "language");
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strQ = q(jSONArray.opt(i));
                    if (!StringsKt.isBlank(strQ)) {
                        return strQ;
                    }
                }
            } else {
                if (!(obj instanceof String)) {
                    return StringsKt.trim((CharSequence) obj.toString()).toString();
                }
                String string = StringsKt.trim((CharSequence) obj).toString();
                if (!StringsKt.isBlank(string) && !StringsKt__StringsJVMKt.equals(string, "null", true)) {
                    if (StringsKt__StringsJVMKt.startsWith$default(string, "{", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(string, "}", false, 2, null)) {
                        try {
                            
                            objM8825constructorimpl2 = new JSONObject(string);
                        } catch (Throwable th) {
                            
                            objM8825constructorimpl2 = ResultKt.createFailure(th);
                        }
                        if (false) {
                            objM8825constructorimpl2 = null;
                        }
                        JSONObject jSONObject = (JSONObject) objM8825constructorimpl2;
                        String strQ2 = jSONObject != null ? q(jSONObject) : null;
                        if (strQ2 == null) {
                            strQ2 = "";
                        }
                        if (!StringsKt.isBlank(strQ2)) {
                            return strQ2;
                        }
                    }
                    if (!StringsKt__StringsJVMKt.startsWith$default(string, "[", false, 2, null) || !StringsKt__StringsJVMKt.endsWith$default(string, "]", false, 2, null)) {
                        return string;
                    }
                    try {
                        
                        objM8825constructorimpl = new JSONArray(string);
                    } catch (Throwable th2) {
                        
                        objM8825constructorimpl = ResultKt.createFailure(th2);
                    }
                    if (false) {
                        objM8825constructorimpl = null;
                    }
                    JSONArray jSONArray2 = (JSONArray) objM8825constructorimpl;
                    String strQ3 = jSONArray2 != null ? q(jSONArray2) : null;
                    String str = strQ3 != null ? strQ3 : "";
                    return !StringsKt.isBlank(str) ? str : string;
                }
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(Context context, String str, qe qeVar, String str2, String str3, ne neVar, ContinuationImpl continuationImpl) {
        te teVar;
        if (continuationImpl instanceof te) {
            teVar = (te) continuationImpl;
            int i = teVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                teVar.j = i - Integer.MIN_VALUE;
            } else {
                teVar = new te(this, continuationImpl);
            }
        } else {
            teVar = new te(this, continuationImpl);
        }
        Object objWithContext = teVar.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = teVar.j;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ue ueVar = new ue(str, qeVar, neVar, str3, str2, context, null);
            teVar.a = null;
            teVar.b = null;
            teVar.c = null;
            teVar.d = null;
            teVar.e = null;
            teVar.g = null;
            teVar.j = 1;
            objWithContext = BuildersKt.withContext(io2, ueVar, teVar);
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
    public final Object j(String str, qe qeVar, ne neVar, ContinuationImpl continuationImpl) {
        ve veVar;
        if (continuationImpl instanceof ve) {
            veVar = (ve) continuationImpl;
            int i = veVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                veVar.g = i - Integer.MIN_VALUE;
            } else {
                veVar = new ve(this, continuationImpl);
            }
        } else {
            veVar = new ve(this, continuationImpl);
        }
        Object objWithContext = veVar.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = veVar.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            m2 m2Var = new m2(str, qeVar, neVar, null);
            veVar.a = null;
            veVar.b = null;
            veVar.c = null;
            veVar.g = 1;
            objWithContext = BuildersKt.withContext(io2, m2Var, veVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r(Context context, String str, String str2, int i, int i2, ne neVar, ContinuationImpl continuationImpl) {
        we weVar;
        if (continuationImpl instanceof we) {
            weVar = (we) continuationImpl;
            int i3 = weVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                weVar.h = i3 - Integer.MIN_VALUE;
            } else {
                weVar = new we(this, continuationImpl);
            }
        } else {
            weVar = new we(this, continuationImpl);
        }
        Object objWithContext = weVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = weVar.h;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            xe xeVar = new xe(str, str2, neVar, i, i2, null);
            weVar.a = null;
            weVar.b = null;
            weVar.c = null;
            weVar.d = null;
            weVar.h = 1;
            objWithContext = BuildersKt.withContext(io2, xeVar, weVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }
}
