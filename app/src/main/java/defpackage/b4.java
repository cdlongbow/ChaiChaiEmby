package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.QueryResult;
import com.dh.myembyapp.data.model.ServerConfig;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class b4 {
    public static final EmbyApiService a(b4 b4Var, ServerConfig serverConfig) throws NoSuchAlgorithmException, KeyManagementException {
        Proxy proxy;
        Proxy.Type type;
        String strN = c61.n(serverConfig.getFullUrl(), "emby/");
        Proxy proxy2 = lr1.a;
        ProxyConfig proxyConfig = lr1.b;
        String str = "AggregateHubRepo";
        if (!proxyConfig.getEnabled() || StringsKt.isBlank(proxyConfig.getHost())) {
            proxy = null;
        } else {
            int i = l3.$EnumSwitchMapping$0[proxyConfig.getProtocol().ordinal()];
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
                proxy = new Proxy(type, new InetSocketAddress(proxyConfig.getHost(), proxyConfig.getPort()));
            } catch (Exception e) {
                Log.e("AggregateHubRepo", "创建聚合视界代理对象失败: host=" + proxyConfig.getHost() + ", port=" + proxyConfig.getPort(), e);
                proxy = null;
            }
        }
        Proxy proxy3 = lr1.a;
        boolean z = (serverConfig.getDirectOnly() || !proxyConfig.getEnabled() || proxy == null || (proxyConfig.getBypassLan() && lr1.b(serverConfig.getHost()))) ? false : true;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).addInterceptor(new m3(serverConfig));
        if (serverConfig.getTrustAllCerts()) {
            p3 p3Var = new p3(0);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new p3[]{p3Var}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            builderAddInterceptor.sslSocketFactory(socketFactory, p3Var);
            builderAddInterceptor.hostnameVerifier(new k3(0));
        }
        if (z && proxy != null) {
            builderAddInterceptor.proxySelector(new n3(proxyConfig, proxy, serverConfig, 0));
            if (proxyConfig.getHasCredentials()) {
                String username = proxyConfig.getUsername();
                String password = proxyConfig.getPassword();
                username.getClass();
                password.getClass();
                builderAddInterceptor.proxyAuthenticator(new g40(str, username, password));
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                builderAddInterceptor.dns(new o3(proxyConfig, 0));
            }
        }
        Object objCreate = new Retrofit.Builder().baseUrl(strN).client(builderAddInterceptor.build()).addConverterFactory(GsonConverterFactory.create()).build().create(EmbyApiService.class);
        objCreate.getClass();
        return (EmbyApiService) objCreate;
    }

    public static final ArrayList b(b4 b4Var, List list) {
        boolean zAdd;
        b4Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (Intrinsics.areEqual(mediaItem.getType(), "Episode")) {
                String seriesId = mediaItem.getSeriesId();
                if (seriesId == null) {
                    seriesId = mediaItem.getId();
                }
                zAdd = linkedHashSet.add(seriesId);
            } else {
                zAdd = true;
            }
            if (zAdd) {
                arrayList.add(mediaItem);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object c(b4 b4Var, EmbyApiService embyApiService, String str, MediaItem mediaItem, ContinuationImpl continuationImpl) {
        s3 s3Var;
        MediaItem mediaItem2;
        MediaItem mediaItem3;
        if (continuationImpl instanceof s3) {
            s3Var = (s3) continuationImpl;
            int i = s3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3Var.g = i - Integer.MIN_VALUE;
            } else {
                s3Var = new s3(b4Var, continuationImpl);
            }
        } else {
            s3Var = new s3(b4Var, continuationImpl);
        }
        Object itemDetails = s3Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = s3Var.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(itemDetails);
            try {
                String id = mediaItem.getId();
                s3Var.a = null;
                s3Var.b = null;
                try {
                    s3Var.c = mediaItem;
                    s3Var.g = 1;
                    itemDetails = embyApiService.getItemDetails(str, id, "MediaSources,MediaStreams,Path,Size,Bitrate,Container", s3Var);
                    if (itemDetails == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mediaItem2 = mediaItem;
                } catch (Exception unused) {
                    return mediaItem;
                }
            } catch (Exception unused2) {
                return mediaItem;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MediaItem mediaItem4 = s3Var.c;
            try {
                ResultKt.throwOnFailure(itemDetails);
                mediaItem2 = mediaItem4;
            } catch (Exception unused3) {
                return mediaItem4;
            }
        }
        try {
            Response response = (Response) itemDetails;
            if (response.isSuccessful() && (mediaItem3 = (MediaItem) response.body()) != null) {
                List<MediaSource> mediaSources = mediaItem3.getMediaSources();
                if (mediaSources == null) {
                    mediaSources = mediaItem2.getMediaSources();
                }
                MediaItem mediaItemCopy$default = MediaItem.copy$default(mediaItem2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, mediaSources, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147450879, null);
                if (mediaItemCopy$default != null) {
                    return mediaItemCopy$default;
                }
            }
            return mediaItem2;
        } catch (Exception unused4) {
            return mediaItem2;
        }
    }

    public static final List d(b4 b4Var, QueryResult queryResult, String str) {
        b4Var.getClass();
        try {
            return queryResult.getItems();
        } catch (NullPointerException e) {
            Log.e("AggregateHubRepo", str.concat(": 接口返回 Items=null，已按空列表处理"), e);
            return CollectionsKt.emptyList();
        }
    }

    public static final String e(b4 b4Var, ServerConfig serverConfig) {
        String userId = serverConfig.getUserId();
        if (userId != null) {
            if (StringsKt.isBlank(userId)) {
                userId = null;
            }
            if (userId != null) {
                return userId;
            }
        }
        rd1.o("服务器未登录");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ServerConfig serverConfig, String str, int i, ContinuationImpl continuationImpl) {
        t3 t3Var;
        if (continuationImpl instanceof t3) {
            t3Var = (t3) continuationImpl;
            int i2 = t3Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t3Var.e = i2 - Integer.MIN_VALUE;
            } else {
                t3Var = new t3(this, continuationImpl);
            }
        } else {
            t3Var = new t3(this, continuationImpl);
        }
        Object objWithContext = t3Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = t3Var.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            u3 u3Var = new u3(this, serverConfig, str, i, null);
            t3Var.a = null;
            t3Var.b = null;
            t3Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, u3Var, t3Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ServerConfig serverConfig, ContinuationImpl continuationImpl) {
        v3 v3Var;
        if (continuationImpl instanceof v3) {
            v3Var = (v3) continuationImpl;
            int i = v3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3Var.d = i - Integer.MIN_VALUE;
            } else {
                v3Var = new v3(this, continuationImpl);
            }
        } else {
            v3Var = new v3(this, continuationImpl);
        }
        Object objWithContext = v3Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = v3Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            w3 w3Var = new w3(this, serverConfig, null);
            v3Var.a = null;
            v3Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, w3Var, v3Var);
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
    public final Object h(ServerConfig serverConfig, int i, ContinuationImpl continuationImpl) {
        x3 x3Var;
        if (continuationImpl instanceof x3) {
            x3Var = (x3) continuationImpl;
            int i2 = x3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x3Var.d = i2 - Integer.MIN_VALUE;
            } else {
                x3Var = new x3(this, continuationImpl);
            }
        } else {
            x3Var = new x3(this, continuationImpl);
        }
        Object objWithContext = x3Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = x3Var.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            y3 y3Var = new y3(this, serverConfig, i, null);
            x3Var.a = null;
            x3Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, y3Var, x3Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object i(ServerConfig serverConfig, String str, boolean z, int i, Function2 function2, ContinuationImpl continuationImpl) {
        z3 z3Var;
        if (continuationImpl instanceof z3) {
            z3Var = (z3) continuationImpl;
            int i2 = z3Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z3Var.g = i2 - Integer.MIN_VALUE;
            } else {
                z3Var = new z3(this, continuationImpl);
            }
        } else {
            z3Var = new z3(this, continuationImpl);
        }
        Object objWithContext = z3Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = z3Var.g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a4 a4Var = new a4(this, serverConfig, str, z, i, function2, null);
            z3Var.a = null;
            z3Var.b = null;
            z3Var.c = null;
            z3Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, a4Var, z3Var);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }
}
