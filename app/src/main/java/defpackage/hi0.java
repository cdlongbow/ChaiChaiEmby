package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaSourcePriorityKt;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.dlna.DlnaConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hi0 {
    public static final List a(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        String str2;
        String str3;
        PackageManager packageManager = context.getPackageManager();
        Intent intentD = d(str, "");
        di0 di0Var = di0.a;
        ci0 ci0Var = new ci0(intentD, di0Var);
        Intent intentAddCategory = new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.DEFAULT");
        intentAddCategory.getClass();
        List<ci0> listListOf = CollectionsKt.listOf((Object[]) new ci0[]{ci0Var, new ci0(intentAddCategory, di0Var), new ci0(f(str, ""), di0.b)});
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ci0 ci0Var2 : listListOf) {
            packageManager.getClass();
            Intent intent = ci0Var2.a;
            if (Build.VERSION.SDK_INT >= 33) {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
                listQueryIntentActivities.getClass();
            } else {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                listQueryIntentActivities.getClass();
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (str2 = activityInfo.packageName) != null && (str3 = activityInfo.name) != null && !Intrinsics.areEqual(str2, context.getPackageName()) && !Intrinsics.areEqual(str2, "com.android.tv.frameworkpackagestubs")) {
                    String strC = mr.C(str2, "/", str3);
                    if (!linkedHashMap.containsKey(strC)) {
                        String string = resolveInfo.loadLabel(packageManager).toString();
                        if (StringsKt.isBlank(string)) {
                            string = null;
                        }
                        String str4 = string == null ? str2 : string;
                        Drawable drawableLoadIcon = resolveInfo.loadIcon(packageManager);
                        drawableLoadIcon.getClass();
                        linkedHashMap.put(strC, new bi0(str4, str2, str3, drawableLoadIcon, ci0Var2.b));
                    }
                }
            }
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        return CollectionsKt.sortedWith(collectionValues, new k00(5));
    }

    public static final MediaSource b(String str, List list, List list2, VideoVersionPrioritySettings videoVersionPrioritySettings) {
        Object obj;
        Object next;
        if (str != null) {
            Iterator it = list.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((MediaSource) next).getId(), str));
            MediaSource mediaSource = (MediaSource) next;
            if (mediaSource != null) {
                return mediaSource;
            }
            for (Object obj2 : list2) {
                if (Intrinsics.areEqual(((MediaSource) obj2).getId(), str)) {
                    obj = obj2;
                    break;
                }
            }
            MediaSource mediaSource2 = (MediaSource) obj;
            if (mediaSource2 != null) {
                return mediaSource2;
            }
        }
        MediaSource mediaSource3 = (MediaSource) CollectionsKt.firstOrNull((List) MediaSourcePriorityKt.sortMediaSourcesByPriority(list, videoVersionPrioritySettings));
        return mediaSource3 == null ? (MediaSource) CollectionsKt.firstOrNull((List) MediaSourcePriorityKt.sortMediaSourcesByPriority(list2, videoVersionPrioritySettings)) : mediaSource3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0215  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object c(uf0 uf0Var, Context context, String str, String str2, String str3, MediaSource mediaSource, long j, ContinuationImpl continuationImpl) {
        gi0 gi0Var;
        String container;
        String lowerCase;
        String lowerCase2;
        HttpUrl httpUrl;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        String lowerCase3;
        String str8;
        String strRemapAbsoluteMediaUrlToBaseUrl;
        String str9;
        ServerConfig lastUsedServer;
        ServerConfig effectiveServerConfig;
        Object objV;
        if (continuationImpl instanceof gi0) {
            gi0Var = (gi0) continuationImpl;
            int i = gi0Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi0Var.r = i - Integer.MIN_VALUE;
            } else {
                gi0Var = new gi0(continuationImpl);
            }
        } else {
            gi0Var = new gi0(continuationImpl);
        }
        Object obj = gi0Var.q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = gi0Var.r;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (mediaSource == null || (container = mediaSource.getContainer()) == null) {
                container = "mkv";
            }
            String directStreamUrl = mediaSource != null ? mediaSource.getDirectStreamUrl() : null;
            String path = mediaSource != null ? mediaSource.getPath() : null;
            if (directStreamUrl != null) {
                lowerCase = directStreamUrl.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            if (path != null) {
                lowerCase2 = path.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
            } else {
                lowerCase2 = null;
            }
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
            boolean zContains$default = StringsKt__lowerCase.contains(".m3u8");
            boolean zContains$default2 = StringsKt__lowerCase2.contains(".m3u8");
            boolean zH = h(path);
            boolean enableStrmDirectPlay = false;
            if (h(directStreamUrl)) {
                RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
                if (!retrofitClient.hasCustomRoutingPath() || directStreamUrl == null || (httpUrl = HttpUrl.INSTANCE.parse(directStreamUrl)) == null) {
                    str4 = path;
                    str5 = lowerCase;
                    str6 = "";
                    str7 = lowerCase2;
                    z = zContains$default2;
                } else {
                    String strEncodedPath = httpUrl.encodedPath();
                    str4 = path;
                    Locale locale = Locale.ROOT;
                    String lowerCase4 = strEncodedPath.toLowerCase(locale);
                    lowerCase4.getClass();
                    str5 = lowerCase;
                    str6 = "";
                    String strTrimEnd = StringsKt.trimEnd(lowerCase4, '/');
                    String lowerCase5 = str.toLowerCase(locale);
                    lowerCase5.getClass();
                    str7 = lowerCase2;
                    StringBuilder sb = new StringBuilder("/videos/");
                    sb.append(lowerCase5);
                    z = zContains$default2;
                    sb.append("/");
                    if (!StringsKt__StringsKt.contains$default(strTrimEnd, (CharSequence) sb.toString(), false, 2, (Object) null) && !StringsKt__StringsJVMKt.endsWith$default(strTrimEnd, "/videos/".concat(lowerCase5), false, 2, null)) {
                        if (StringsKt__StringsKt.contains$default(strTrimEnd, (CharSequence) ("/emby/videos/" + lowerCase5 + "/"), false, 2, (Object) null) || StringsKt__StringsJVMKt.endsWith$default(strTrimEnd, "/emby/videos/".concat(lowerCase5), false, 2, null)) {
                        }
                    }
                    String accessToken = retrofitClient.getAccessToken();
                    String deviceId = retrofitClient.getDeviceId();
                    String str10 = (String) CollectionsKt.lastOrNull((List) httpUrl.pathSegments());
                    if (str10 != null) {
                        lowerCase3 = str10.toLowerCase(locale);
                        lowerCase3.getClass();
                    } else {
                        lowerCase3 = null;
                    }
                    if (lowerCase3 == null) {
                        lowerCase3 = str6;
                    }
                    str8 = str3;
                    strRemapAbsoluteMediaUrlToBaseUrl = (g(j(httpUrl, "MediaSourceId"), str8) || (StringsKt__StringsJVMKt.startsWith$default(lowerCase3, "stream.", false, 2, null) || Intrinsics.areEqual(lowerCase3, "master.m3u8")) || g(j(httpUrl, "Static"), "true") || (!StringsKt.isBlank(accessToken) && g(j(httpUrl, "api_key"), accessToken)) || (!StringsKt.isBlank(deviceId) && g(j(httpUrl, "DeviceId"), deviceId))) ? retrofitClient.remapAbsoluteMediaUrlToBaseUrl(directStreamUrl) : directStreamUrl;
                }
                str8 = str3;
            } else {
                str4 = path;
                str5 = lowerCase;
                str6 = "";
                str7 = lowerCase2;
                z = zContains$default2;
                str8 = str3;
            }
            if (strRemapAbsoluteMediaUrlToBaseUrl == null) {
                str9 = directStreamUrl == null ? str6 : directStreamUrl;
            } else {
                str9 = strRemapAbsoluteMediaUrlToBaseUrl;
            }
            boolean zEquals = StringsKt__StringsJVMKt.equals(container, "strm", true);
            ServerPreferences serverPreferences = new ServerPreferences(context);
            if (str2 == null) {
                lastUsedServer = serverPreferences.getLastUsedServer();
                if (lastUsedServer != null && (effectiveServerConfig = lastUsedServer.getEffectiveServerConfig()) != null) {
                    enableStrmDirectPlay = effectiveServerConfig.getEnableStrmDirectPlay();
                }
            } else {
                ServerConfig serverById = serverPreferences.getServerById(str2);
                ServerConfig effectiveServerConfig2 = serverById != null ? serverById.getEffectiveServerConfig() : null;
                if (effectiveServerConfig2 != null) {
                    enableStrmDirectPlay = effectiveServerConfig2.getEnableStrmDirectPlay();
                } else {
                    lastUsedServer = serverPreferences.getLastUsedServer();
                    if (lastUsedServer != null) {
                        enableStrmDirectPlay = effectiveServerConfig.getEnableStrmDirectPlay();
                    }
                }
            }
            if (enableStrmDirectPlay && zH) {
                str4.getClass();
                return str4;
            }
            if (zContains$default) {
                return e(directStreamUrl, str9);
            }
            if (z && zH) {
                str4.getClass();
                return str4;
            }
            if (directStreamUrl != null && !StringsKt.isBlank(directStreamUrl)) {
                return e(directStreamUrl, str9);
            }
            if (!zEquals || !enableStrmDirectPlay) {
                return RetrofitClient.INSTANCE.getVideoUrl(str, str8, container, j);
            }
            String path2 = mediaSource != null ? mediaSource.getPath() : null;
            if (h(path2)) {
                path2.getClass();
                return path2;
            }
            gi0Var.a = null;
            gi0Var.b = null;
            gi0Var.c = null;
            gi0Var.d = null;
            gi0Var.e = null;
            gi0Var.g = null;
            gi0Var.h = null;
            gi0Var.i = null;
            gi0Var.j = null;
            gi0Var.k = null;
            gi0Var.l = null;
            gi0Var.m = null;
            gi0Var.n = null;
            gi0Var.o = null;
            gi0Var.p = null;
            gi0Var.r = 1;
            objV = uf0Var.v(str, gi0Var);
            if (objV == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            objV = ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(objV);
        return (String) objV;
    }

    public static final Intent d(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "video/*");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("android.intent.extra.TITLE", str2);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra(DlnaConstants.EXTRA_TITLE, str2);
        intent.addFlags(1);
        return intent;
    }

    public static final String e(String str, String str2) {
        return h(str) ? str2 : mr.C(StringsKt.trimEnd(RetrofitClient.INSTANCE.getBaseUrl(), '/'), "/emby", str);
    }

    public static final Intent f(String str, String str2) {
        Intent intent = new Intent("tv.intent.action.external.SCHEME_PLAY");
        intent.setData(Uri.parse(str));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("android.intent.extra.TITLE", str2);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra(DlnaConstants.EXTRA_TITLE, str2);
        intent.addFlags(1);
        return intent;
    }

    public static final boolean g(String str, String str2) {
        return (str == null || str2 == null || !StringsKt__StringsJVMKt.equals(str, str2, true)) ? false : true;
    }

    public static final boolean h(String str) {
        return (str != null && StringsKt__StringsJVMKt.startsWith(str, "http://", true)) || (str != null && StringsKt__StringsJVMKt.startsWith(str, "https://", true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(Context context, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ei0 ei0Var;
        if (continuationImpl instanceof ei0) {
            ei0Var = (ei0) continuationImpl;
            int i = ei0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ei0Var.g = i - Integer.MIN_VALUE;
            } else {
                ei0Var = new ei0(continuationImpl);
            }
        } else {
            ei0Var = new ei0(continuationImpl);
        }
        Object objWithContext = ei0Var.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ei0Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            fi0 fi0Var = new fi0(str, context, str3, str2, null);
            ei0Var.a = null;
            ei0Var.b = null;
            ei0Var.c = null;
            ei0Var.d = null;
            ei0Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, fi0Var, ei0Var);
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

    public static final String j(HttpUrl httpUrl, String str) {
        Object next;
        Iterator<T> it = httpUrl.queryParameterNames().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt__StringsJVMKt.equals((String) next, str, true));
        String str2 = (String) next;
        if (str2 == null) {
            return null;
        }
        return httpUrl.queryParameter(str2);
    }
}
