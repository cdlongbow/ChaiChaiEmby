package com.dh.myembyapp;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import defpackage.cb0;
import defpackage.cs0;
import defpackage.ds;
import defpackage.g1;
import defpackage.hs0;
import defpackage.i12;
import defpackage.ig2;
import defpackage.is0;
import defpackage.iw;
import defpackage.j12;
import defpackage.k12;
import defpackage.k3;
import defpackage.ks1;
import defpackage.ku;
import defpackage.l12;
import defpackage.ln;
import defpackage.m81;
import defpackage.mc0;
import defpackage.n2;
import defpackage.n61;
import defpackage.n8;
import defpackage.o01;
import defpackage.o61;
import defpackage.os1;
import defpackage.p3;
import defpackage.p91;
import defpackage.pi0;
import defpackage.qu;
import defpackage.r61;
import defpackage.rd1;
import defpackage.rd2;
import defpackage.ri;
import defpackage.s61;
import defpackage.t61;
import defpackage.xr0;
import defpackage.y2;
import defpackage.y21;
import defpackage.z7;
import defpackage.zv;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class MyEmbyApp extends Application implements i12 {
    public static final /* synthetic */ int j = 0;
    public final Lazy a;
    public volatile long d;
    public final Lazy g;
    public final Lazy h;
    public final Object b = new Object();
    public volatile List c = CollectionsKt.emptyList();
    public final ThreadLocal e = new ThreadLocal();
    public final ri i = new ri(this, 8);

    public MyEmbyApp() {
        final int i = 0;
        this.a = LazyKt.lazy(new Function0(this) { // from class: m61
            public final /* synthetic */ MyEmbyApp b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int largeMemoryClass;
                int i2 = i;
                MyEmbyApp myEmbyApp = this.b;
                switch (i2) {
                    case 0:
                        int i3 = MyEmbyApp.j;
                        return new ServerPreferences(myEmbyApp);
                    case 1:
                        int i4 = MyEmbyApp.j;
                        FileSystem fileSystem = FileSystem.SYSTEM;
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        Path path = Path.Companion.get$default(Path.INSTANCE, new File(myEmbyApp.getCacheDir(), "image_cache"), false, 1, (Object) null);
                        if (path == null) {
                            rd1.o("directory == null");
                            return null;
                        }
                        long jCoerceIn = 10485760;
                        try {
                            File file = path.toFile();
                            file.mkdir();
                            StatFs statFs = new StatFs(file.getAbsolutePath());
                            jCoerceIn = RangesKt.coerceIn((long) (0.05d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                            break;
                        } catch (Exception unused) {
                        }
                        return new gs1(jCoerceIn, path, fileSystem, emptyCoroutineContext);
                    default:
                        int i5 = MyEmbyApp.j;
                        l91 l91Var = new l91(1);
                        try {
                            Object systemService = ContextCompat.getSystemService(myEmbyApp, ActivityManager.class);
                            systemService.getClass();
                            ActivityManager activityManager = (ActivityManager) systemService;
                            largeMemoryClass = (myEmbyApp.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            break;
                        } catch (Exception unused2) {
                            largeMemoryClass = 256;
                        }
                        return new os1(new ss1((long) (0.15d * ((long) largeMemoryClass) * 1048576), l91Var), l91Var);
                }
            }
        });
        final int i2 = 1;
        this.g = LazyKt.lazy(new Function0(this) { // from class: m61
            public final /* synthetic */ MyEmbyApp b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int largeMemoryClass;
                int i3 = i2;
                MyEmbyApp myEmbyApp = this.b;
                switch (i3) {
                    case 0:
                        int i4 = MyEmbyApp.j;
                        return new ServerPreferences(myEmbyApp);
                    case 1:
                        int i5 = MyEmbyApp.j;
                        FileSystem fileSystem = FileSystem.SYSTEM;
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        Path path = Path.Companion.get$default(Path.INSTANCE, new File(myEmbyApp.getCacheDir(), "image_cache"), false, 1, (Object) null);
                        if (path == null) {
                            rd1.o("directory == null");
                            return null;
                        }
                        long jCoerceIn = 10485760;
                        try {
                            File file = path.toFile();
                            file.mkdir();
                            StatFs statFs = new StatFs(file.getAbsolutePath());
                            jCoerceIn = RangesKt.coerceIn((long) (0.05d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                            break;
                        } catch (Exception unused) {
                        }
                        return new gs1(jCoerceIn, path, fileSystem, emptyCoroutineContext);
                    default:
                        int i6 = MyEmbyApp.j;
                        l91 l91Var = new l91(1);
                        try {
                            Object systemService = ContextCompat.getSystemService(myEmbyApp, ActivityManager.class);
                            systemService.getClass();
                            ActivityManager activityManager = (ActivityManager) systemService;
                            largeMemoryClass = (myEmbyApp.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            break;
                        } catch (Exception unused2) {
                            largeMemoryClass = 256;
                        }
                        return new os1(new ss1((long) (0.15d * ((long) largeMemoryClass) * 1048576), l91Var), l91Var);
                }
            }
        });
        final int i3 = 2;
        this.h = LazyKt.lazy(new Function0(this) { // from class: m61
            public final /* synthetic */ MyEmbyApp b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int largeMemoryClass;
                int i4 = i3;
                MyEmbyApp myEmbyApp = this.b;
                switch (i4) {
                    case 0:
                        int i5 = MyEmbyApp.j;
                        return new ServerPreferences(myEmbyApp);
                    case 1:
                        int i6 = MyEmbyApp.j;
                        FileSystem fileSystem = FileSystem.SYSTEM;
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        Path path = Path.Companion.get$default(Path.INSTANCE, new File(myEmbyApp.getCacheDir(), "image_cache"), false, 1, (Object) null);
                        if (path == null) {
                            rd1.o("directory == null");
                            return null;
                        }
                        long jCoerceIn = 10485760;
                        try {
                            File file = path.toFile();
                            file.mkdir();
                            StatFs statFs = new StatFs(file.getAbsolutePath());
                            jCoerceIn = RangesKt.coerceIn((long) (0.05d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                            break;
                        } catch (Exception unused) {
                        }
                        return new gs1(jCoerceIn, path, fileSystem, emptyCoroutineContext);
                    default:
                        int i7 = MyEmbyApp.j;
                        l91 l91Var = new l91(1);
                        try {
                            Object systemService = ContextCompat.getSystemService(myEmbyApp, ActivityManager.class);
                            systemService.getClass();
                            ActivityManager activityManager = (ActivityManager) systemService;
                            largeMemoryClass = (myEmbyApp.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            break;
                        } catch (Exception unused2) {
                            largeMemoryClass = 256;
                        }
                        return new os1(new ss1((long) (0.15d * ((long) largeMemoryClass) * 1048576), l91Var), l91Var);
                }
            }
        });
    }

    public static Proxy f(ProxyConfig proxyConfig) {
        Proxy.Type type;
        if (proxyConfig.getEnabled() && !StringsKt.isBlank(proxyConfig.getHost())) {
            int i = r61.$EnumSwitchMapping$0[proxyConfig.getProtocol().ordinal()];
            if (i == 1 || i == 2) {
                type = Proxy.Type.HTTP;
            } else {
                if (i != 3) {
                    qu.f();
                    return null;
                }
                type = Proxy.Type.SOCKS;
            }
            try {
                return new Proxy(type, new InetSocketAddress(proxyConfig.getHost(), proxyConfig.getPort()));
            } catch (Exception e) {
                Log.e("MyEmbyApp", "创建图片代理对象失败: host=" + proxyConfig.getHost() + ", port=" + proxyConfig.getPort(), e);
            }
        }
        return null;
    }

    @Override // defpackage.i12
    public final ks1 a(Context context) throws NoSuchAlgorithmException, KeyManagementException {
        context.getClass();
        n61 n61Var = new n61(context, 0);
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().cache(new Cache(new File(getCacheDir(), "http_image_cache"), 52428800L)).addNetworkInterceptor(new iw(1)).dns(this.i);
        o01 o01Var = new o01(11);
        builderDns.getClass();
        builderDns.proxyAuthenticator(new g1(o01Var, 19));
        if (RetrofitClient.INSTANCE.getTrustAllCerts()) {
            Log.d("MyEmbyApp", "⚠️ 图片加载器应用不安全的SSL配置（信任所有证书）");
            p3 p3Var = new p3(1);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new p3[]{p3Var}, new SecureRandom());
            Pair pair = new Pair(sSLContext.getSocketFactory(), p3Var);
            builderDns.sslSocketFactory((SSLSocketFactory) pair.component1(), (X509TrustManager) pair.component2());
            builderDns.hostnameVerifier(new k3(4));
        }
        OkHttpClient okHttpClientBuild = builderDns.proxySelector(new s61(this)).build().newBuilder().addInterceptor(new t61(this)).build();
        xr0 xr0Var = new xr0(context);
        xr0Var.c = LazyKt.lazyOf((os1) this.h.getValue());
        xr0Var.d = LazyKt.lazyOf((cb0) this.g.getValue());
        ln lnVar = ln.ENABLED;
        cs0 cs0VarA = cs0.a(xr0Var.b, null, null, 16367);
        xr0Var.b = cs0VarA;
        cs0 cs0VarA2 = cs0.a(cs0VarA, null, null, 16351);
        xr0Var.b = cs0VarA2;
        cs0 cs0VarA3 = cs0.a(cs0VarA2, null, null, 16319);
        xr0Var.b = cs0VarA3;
        xr0Var.b = cs0.a(cs0VarA3, n61Var, null, 16127);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        o61 o61Var = new o61(okHttpClientBuild, 0);
        int i = 10;
        arrayList4.add(new z7(i, new m81(new n8(23, o61Var), new o01(12), p91.a, new o01(13)), Reflection.getOrCreateKotlinClass(rd2.class)));
        xr0Var.e = new ds(ku.P(arrayList), ku.P(arrayList2), ku.P(arrayList3), ku.P(arrayList4), ku.P(arrayList5));
        ri riVar = hs0.a;
        ri riVar2 = is0.a;
        xr0Var.f.a.put(is0.a, new zv(200));
        return xr0Var.a();
    }

    public final void b(Function0 function0) {
        new Thread(new y2(25, this, function0)).start();
    }

    public final void c(String str, String str2) {
        File file = new File(getCacheDir(), str);
        if (file.exists()) {
            if (FilesKt.deleteRecursively(file)) {
                Log.d("MyEmbyApp", "✓ " + str2 + " 已清除");
                return;
            }
            Log.w("MyEmbyApp", str2 + " 清除不完整: " + file.getAbsolutePath());
        }
    }

    public final void d() {
        synchronized (this.b) {
            this.c = CollectionsKt.emptyList();
            this.d = 0L;
            Unit unit = Unit.INSTANCE;
        }
        this.e.remove();
        Log.d("MyEmbyApp", "✓ 图片服务器匹配缓存已清除");
    }

    public final void e() {
        File[] fileArrListFiles = getCacheDir().listFiles();
        int i = 0;
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i2 = 0;
            while (i < length) {
                File file = fileArrListFiles[i];
                if (file.isFile()) {
                    String name = file.getName();
                    name.getClass();
                    if (StringsKt__StringsJVMKt.startsWith$default(name, "subtitle_", false, 2, null)) {
                        Regex regex = new Regex("_modified\\.(srt|ass|ssa)$");
                        String name2 = file.getName();
                        name2.getClass();
                        if (regex.containsMatchIn(name2) && file.delete()) {
                            i2++;
                        }
                    }
                }
                i++;
            }
            i = i2;
        }
        if (i > 0) {
            Log.d("MyEmbyApp", "✓ 临时字幕文件已清除: " + i + " 个");
        }
    }

    public final ServerConfig g(HttpUrl httpUrl) {
        Object next;
        Iterator it = SequencesKt.mapNotNull(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(h()), new y21(12)), new y21(13)), new mc0(httpUrl, this)).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((Pair) next).getSecond()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((Pair) next2).getSecond()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair = (Pair) next;
        if (pair != null) {
            return (ServerConfig) pair.getFirst();
        }
        return null;
    }

    public final List h() {
        List<ServerConfig> allServers;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        List list = this.c;
        if (!list.isEmpty() && jElapsedRealtime - this.d < 1000) {
            return list;
        }
        synchronized (this.b) {
            try {
                allServers = this.c;
                if (allServers.isEmpty() || jElapsedRealtime - this.d >= 1000) {
                    allServers = ((ServerPreferences) this.a.getValue()).getAllServers();
                    this.c = allServers;
                    this.d = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return allServers;
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        AtomicReference atomicReference = j12.a;
        Object obj = atomicReference.get();
        if (obj instanceof ks1) {
            k12 k12Var = l12.a;
            pi0 pi0Var = ((ks1) obj).a.b.n;
            if (pi0Var.a.get(l12.b) != null) {
                rd1.o("The singleton image loader has already been created. This indicates that 'setSafe' is being called after the first 'get' call. Ensure that 'setSafe' is called before any Coil API usages (e.g. `load`, `AsyncImage`, `rememberAsyncImagePainter`, etc.).");
                return;
            }
        } else {
            while (!atomicReference.compareAndSet(obj, this) && atomicReference.get() == obj) {
            }
        }
        SharedPreferences sharedPreferences = getSharedPreferences("episode_sort_settings", 0);
        sharedPreferences.getClass();
        ig2.c = sharedPreferences;
        SharedPreferences sharedPreferences2 = getSharedPreferences("library_sort_settings", 0);
        sharedPreferences2.getClass();
        ig2.d = sharedPreferences2;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: l61
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                StackTraceElement stackTraceElement;
                SecurityException securityException;
                String message;
                String message2;
                SecurityException securityException2;
                String message3;
                MyEmbyApp myEmbyApp = this.a;
                int i = MyEmbyApp.j;
                boolean z = th instanceof SecurityException;
                if (z && (message3 = (securityException2 = (SecurityException) th).getMessage()) != null && StringsKt__StringsKt.contains$default(message3, (CharSequence) "com.lenovo.skin", false, 2, (Object) null)) {
                    Log.w("MyEmbyApp", "忽略联想设备皮肤设置异常（不影响功能）: " + securityException2.getMessage());
                } else {
                    if (!z || (message = (securityException = (SecurityException) th).getMessage()) == null || !StringsKt__StringsKt.contains$default(message, (CharSequence) "Settings key", false, 2, (Object) null) || (message2 = securityException.getMessage()) == null || !StringsKt__StringsKt.contains$default(message2, (CharSequence) "is not readable", false, 2, (Object) null)) {
                        Log.e("MyEmbyApp", "========== 应用崩溃 ==========");
                        Log.e("MyEmbyApp", "线程: " + thread.getName());
                        Log.e("MyEmbyApp", "异常: ".concat(th.getClass().getSimpleName()));
                        Log.e("MyEmbyApp", "消息: " + th.getMessage());
                        Log.e("MyEmbyApp", "堆栈跟踪:", th);
                        StringBuilder sb = new StringBuilder();
                        sb.append("崩溃: " + th.getClass().getSimpleName() + "\n");
                        String message4 = th.getMessage();
                        if (message4 == null) {
                            message4 = "未知";
                        }
                        sb.append("原因: " + message4 + "\n");
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        stackTrace.getClass();
                        int length = stackTrace.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                stackTraceElement = null;
                                break;
                            }
                            stackTraceElement = stackTrace[i2];
                            String className = stackTraceElement.getClassName();
                            className.getClass();
                            if (StringsKt__StringsJVMKt.startsWith$default(className, "com.dh.myembyapp", false, 2, null)) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (stackTraceElement != null) {
                            sb.append("位置: " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber());
                        }
                        String string = sb.toString();
                        try {
                            new Handler(Looper.getMainLooper()).post(new y2(24, myEmbyApp, th));
                        } catch (Exception unused) {
                        }
                        try {
                            myEmbyApp.getSharedPreferences("crash_log", 0).edit().putString("last_crash", string).putLong("crash_time", System.currentTimeMillis()).commit();
                            Log.d("MyEmbyApp", "崩溃信息已保存: " + string);
                        } catch (Exception e) {
                            Log.e("MyEmbyApp", "保存崩溃信息失败", e);
                        }
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(thread, th);
                            return;
                        }
                        return;
                    }
                    Log.w("MyEmbyApp", "忽略系统设置读取异常（不影响功能）: " + securityException.getMessage());
                }
                Log.d("MyEmbyApp", "已忽略非关键异常，应用继续运行");
            }
        });
        Log.d("MyEmbyApp", "========== 应用启动：开始加载代理配置 ==========");
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new n2(this, (Continuation) null, 5), 1, null);
        } catch (Exception e) {
            Log.e("MyEmbyApp", "❌ 加载代理配置失败", e);
            e.printStackTrace();
        }
        Log.d("MyEmbyApp", "========== 代理配置加载完成 ==========");
    }
}
