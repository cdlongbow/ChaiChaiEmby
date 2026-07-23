package defpackage;

import android.util.Log;

import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.model.EpisodeLocator;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ProviderIds;
import com.dh.myembyapp.data.model.QueryResult;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.VideoResolutionKt;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class hb1 {
    public static final List a(hb1 hb1Var, MediaItem mediaItem, String str, String str2, String str3, List list) {
        hb1Var.getClass();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            return CollectionsKt.listOf(new OtherServerResourceMatch(mediaItem, str, str2, str3, null, 0, 0, Input.Keys.FORWARD_DEL, null));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (MediaSource mediaSource : list) {
            int iResolveVideoResolutionSortValue = VideoResolutionKt.resolveVideoResolutionSortValue(mediaSource);
            Integer bitrate = mediaSource.getBitrate();
            arrayList.add(new OtherServerResourceMatch(mediaItem, str, str2, str3, mediaSource, iResolveVideoResolutionSortValue, bitrate != null ? bitrate.intValue() : 0));
        }
        return CollectionsKt.sortedWith(arrayList, new t90(new t90(new t90(new k00(7), 6), 7), 5));
    }

    public static final EmbyApiService b(hb1 hb1Var, ServerConfig serverConfig) throws NoSuchAlgorithmException, KeyManagementException {
        Proxy proxy;
        Proxy.Type type;
        String strN = c61.n(serverConfig.getFullUrl(), "emby/");
        Proxy proxy2 = lr1.a;
        ProxyConfig proxyConfig = lr1.b;
        String str = "OtherServerResourceRepo";
        if (!proxyConfig.getEnabled() || StringsKt.isBlank(proxyConfig.getHost())) {
            proxy = null;
        } else {
            int i = bb1.$EnumSwitchMapping$0[proxyConfig.getProtocol().ordinal()];
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
                Log.e("OtherServerResourceRepo", "创建代理对象失败: " + proxyConfig.getHost() + ":" + proxyConfig.getPort(), e);
                proxy = null;
            }
        }
        Proxy proxy3 = lr1.a;
        boolean z = (serverConfig.getDirectOnly() || !proxyConfig.getEnabled() || proxy == null || (proxyConfig.getBypassLan() && lr1.b(serverConfig.getHost()))) ? false : true;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).addInterceptor(new cb1(serverConfig));
        if (serverConfig.getTrustAllCerts()) {
            p3 p3Var = new p3(2);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new p3[]{p3Var}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            builderAddInterceptor.sslSocketFactory(socketFactory, p3Var);
            builderAddInterceptor.hostnameVerifier(new k3(0));
        }
        if (z && proxy != null) {
            builderAddInterceptor.proxySelector(new n3(proxyConfig, proxy, serverConfig, 1));
            if (proxyConfig.getHasCredentials()) {
                String username = proxyConfig.getUsername();
                String password = proxyConfig.getPassword();
                username.getClass();
                password.getClass();
                builderAddInterceptor.proxyAuthenticator(new g40(str, username, password));
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                builderAddInterceptor.dns(new o3(proxyConfig, 1));
            }
        }
        Object objCreate = new Retrofit.Builder().baseUrl(strN).client(builderAddInterceptor.build()).addConverterFactory(GsonConverterFactory.create()).build().create(EmbyApiService.class);
        objCreate.getClass();
        return (EmbyApiService) objCreate;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    public static final List c(hb1 hb1Var, List list, String str, String str2, Integer num, String str3) {
        boolean zEquals;
        String str4 = Intrinsics.areEqual(str, "Series") ? "Series" : null;
        String lowerCase = StringsKt.trim((CharSequence) str2).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zAreEqual = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MediaItem mediaItem = (MediaItem) next;
            if (str4 != null) {
                zAreEqual = Intrinsics.areEqual(mediaItem.getType(), str4);
            } else if (!Intrinsics.areEqual(str, "Movie") || Intrinsics.areEqual(mediaItem.getType(), "Movie") || Intrinsics.areEqual(mediaItem.getType(), "Video")) {
                zAreEqual = true;
            }
            if (zAreEqual) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MediaItem mediaItem2 = (MediaItem) obj;
            if (str3 == null || StringsKt.isBlank(str3)) {
                zEquals = true;
            } else {
                String lowerCase2 = StringsKt__StringsKt.substringBefore(str3, '.', "").toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                String string = StringsKt.trim((CharSequence) StringsKt__StringsKt.substringAfter(str3, '.', "")).toString();
                if (lowerCase2.length() == 0 || string.length() == 0) {
                    zEquals = true;
                } else {
                    int iHashCode = lowerCase2.hashCode();
                    if (iHashCode != 3236002) {
                        if (iHashCode != 3563703) {
                            if (iHashCode == 3572352 && lowerCase2.equals("tvdb")) {
                                ProviderIds providerIds = mediaItem2.getProviderIds();
                                zEquals = StringsKt__StringsJVMKt.equals(providerIds != null ? providerIds.getTvdb() : null, string, true);
                            } else {
                                zEquals = false;
                            }
                        } else if (lowerCase2.equals("tmdb")) {
                            ProviderIds providerIds2 = mediaItem2.getProviderIds();
                            zEquals = StringsKt__StringsJVMKt.equals(providerIds2 != null ? providerIds2.getTmdb() : null, string, true);
                        } else {
                            zEquals = false;
                        }
                    } else if (lowerCase2.equals("imdb")) {
                        ProviderIds providerIds3 = mediaItem2.getProviderIds();
                        zEquals = StringsKt__StringsJVMKt.equals(providerIds3 != null ? providerIds3.getImdb() : null, string, true);
                    } else {
                        zEquals = false;
                    }
                }
            }
            if (zEquals) {
                arrayList2.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            if (hashSet.add(((MediaItem) obj2).getId())) {
                arrayList3.add(obj2);
            }
        }
        dl dlVar = new dl(lowerCase, 16);
        int i3 = 25;
        return CollectionsKt.take(CollectionsKt.sortedWith(arrayList3, ComparisonsKt.compareBy(dlVar, new mc0(num, i3), new d71(i3))), 8);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0165 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x016f A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0191 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0197 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a4 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01af A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01cf A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:14:0x0051, B:66:0x013f, B:68:0x0147, B:71:0x014f, B:73:0x0165, B:74:0x0169, B:76:0x016f, B:79:0x0185, B:83:0x018e, B:90:0x01a4, B:92:0x01af, B:94:0x01bd, B:96:0x01c3, B:98:0x01d3, B:97:0x01cf, B:84:0x0191, B:86:0x0197, B:21:0x006b), top: B:112:0x0033 }] */
    public static final Object d(hb1 hb1Var, EmbyApiService embyApiService, String str, String str2, EpisodeLocator episodeLocator, ContinuationImpl continuationImpl) {
        fb1 fb1Var;
        EmbyApiService embyApiService2;
        EpisodeLocator episodeLocator2;
        String str3;
        MediaItem mediaItem;
        Object next;
        Response response;
        List listG;
        MediaItem mediaItem2;
        Integer parentIndexNumber;
        String strF;
        Integer indexNumber;
        String name;
        Iterator it;
        Object next2;
        Integer indexNumber2;
        String str4 = str;
        String str5 = str2;
        hb1Var.getClass();
        if (continuationImpl instanceof fb1) {
            fb1Var = (fb1) continuationImpl;
            int i = fb1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb1Var.k = i - Integer.MIN_VALUE;
            } else {
                fb1Var = new fb1(hb1Var, continuationImpl);
            }
        } else {
            fb1Var = new fb1(hb1Var, continuationImpl);
        }
        fb1 fb1Var2 = fb1Var;
        Object objE = fb1Var2.i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fb1Var2.k;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        episodeLocator2 = fb1Var2.d;
                        String str6 = fb1Var2.c;
                        String str7 = (String) fb1Var2.b;
                        embyApiService2 = (EmbyApiService) fb1Var2.a;
                        ResultKt.throwOnFailure(objE);
                        str5 = str6;
                        str4 = str7;
                    } else {
                        if (i2 != 2) {
                            rd1.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        episodeLocator2 = fb1Var2.d;
                        str4 = fb1Var2.c;
                        ResultKt.throwOnFailure(objE);
                    }
                    response = (Response) objE;
                    if (response.isSuccessful() && response.body() != null) {
                        Object objBody = response.body();
                        objBody.getClass();
                        listG = g((QueryResult) objBody, "跨服剧集列表");
                        if (episodeLocator2.getEpisodeNumber() != null) {
                            it = listG.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                                indexNumber2 = ((MediaItem) next2).getIndexNumber();
                                int iIntValue = episodeLocator2.getEpisodeNumber().intValue();
                                if (indexNumber2 != null && indexNumber2.intValue() == iIntValue) {
                                    break;
                                }
                            }
                            mediaItem2 = (MediaItem) next2;
                        } else if (episodeLocator2.getFallbackToFirstEpisode()) {
                            mediaItem2 = (MediaItem) CollectionsKt.firstOrNull(listG);
                        } else {
                            mediaItem2 = null;
                        }
                        if (mediaItem2 == null) {
                            parentIndexNumber = mediaItem2.getParentIndexNumber();
                            if (parentIndexNumber != null) {
                                strF = x2.f(parentIndexNumber.intValue(), "第", "季");
                            } else {
                                strF = null;
                            }
                            indexNumber = mediaItem2.getIndexNumber();
                            if (indexNumber != null) {
                                name = x2.f(indexNumber.intValue(), "第", "集");
                            } else {
                                name = mediaItem2.getName();
                            }
                            return new ab1(mediaItem2, CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{strF, name}), " ", null, null, 0, null, null, 62, null));
                        }
                        kb0.G("定位其他服剧集失败: seriesId=", str4, "OtherServerResourceRepo", e);
                        return null;
                    }
                    return null;
                }
                ResultKt.throwOnFailure(objE);
                try {
                    fb1Var2.a = embyApiService;
                    fb1Var2.b = str4;
                    fb1Var2.c = str5;
                    fb1Var2.d = episodeLocator;
                    fb1Var2.k = 1;
                    Object seasonsForCrossServerMatch = embyApiService.getSeasonsForCrossServerMatch(str5, str4, "BasicSyncInfo,CommunityRating,ProductionYear,EndDate,Container,IndexNumber", fb1Var2);
                    if (seasonsForCrossServerMatch != coroutine_suspended) {
                        embyApiService2 = embyApiService;
                        episodeLocator2 = episodeLocator;
                        objE = seasonsForCrossServerMatch;
                    }
                    return coroutine_suspended;
                } catch (Exception e) {
                    e = e;
                    str4 = str5;
                }
                Response response2 = (Response) objE;
                if (response2.isSuccessful() && response2.body() != null) {
                    Object objBody2 = response2.body();
                    objBody2.getClass();
                    List listG2 = g((QueryResult) objBody2, "跨服季列表");
                    if (!listG2.isEmpty()) {
                        if (episodeLocator2.getSeasonNumber() != null) {
                            Iterator it2 = listG2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                Integer indexNumber3 = ((MediaItem) next).getIndexNumber();
                                int iIntValue2 = episodeLocator2.getSeasonNumber().intValue();
                                if (indexNumber3 != null && indexNumber3.intValue() == iIntValue2) {
                                    break;
                                }
                            }
                            mediaItem = (MediaItem) next;
                        } else {
                            mediaItem = listG2.size() == 1 ? (MediaItem) CollectionsKt.first(listG2) : null;
                        }
                        if (mediaItem != null) {
                            String id = mediaItem.getId();
                            fb1Var2.a = null;
                            fb1Var2.b = null;
                            fb1Var2.c = str5;
                            fb1Var2.d = episodeLocator2;
                            fb1Var2.e = null;
                            fb1Var2.g = null;
                            fb1Var2.h = null;
                            fb1Var2.k = 2;
                            str3 = str5;
                            try {
                                objE = kb0.e(embyApiService2, str3, str4, id, null, null, null, null, fb1Var2, 120, null);
                                if (objE != coroutine_suspended) {
                                    str4 = str3;
                                    response = (Response) objE;
                                    if (response.isSuccessful()) {
                                        Object objBody3 = response.body();
                                        objBody3.getClass();
                                        listG = g((QueryResult) objBody3, "跨服剧集列表");
                                        if (episodeLocator2.getEpisodeNumber() != null) {
                                            it = listG.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next2 = null;
                                                    break;
                                                }
                                                next2 = it.next();
                                                indexNumber2 = ((MediaItem) next2).getIndexNumber();
                                                int iIntValue3 = episodeLocator2.getEpisodeNumber().intValue();
                                                if (indexNumber2 != null) {
                                                    break;
                                                    break;
                                                }
                                            }
                                            mediaItem2 = (MediaItem) next2;
                                        } else if (episodeLocator2.getFallbackToFirstEpisode()) {
                                            mediaItem2 = (MediaItem) CollectionsKt.firstOrNull(listG);
                                        } else {
                                            mediaItem2 = null;
                                        }
                                        if (mediaItem2 == null) {
                                            parentIndexNumber = mediaItem2.getParentIndexNumber();
                                            if (parentIndexNumber != null) {
                                                strF = x2.f(parentIndexNumber.intValue(), "第", "季");
                                            } else {
                                                strF = null;
                                            }
                                            indexNumber = mediaItem2.getIndexNumber();
                                            if (indexNumber != null) {
                                                name = x2.f(indexNumber.intValue(), "第", "集");
                                            } else {
                                                name = mediaItem2.getName();
                                            }
                                            return new ab1(mediaItem2, CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{strF, name}), " ", null, null, 0, null, null, 62, null));
                                        }
                                        kb0.G("定位其他服剧集失败: seriesId=", str4, "OtherServerResourceRepo", e);
                                        return null;
                                    }
                                }
                                return coroutine_suspended;
                            } catch (Exception e2) {
                                e = e2;
                                str4 = str3;
                                kb0.G("定位其他服剧集失败: seriesId=", str4, "OtherServerResourceRepo", e);
                                return null;
                            }
                        }
                    }
                }
                return null;
            } catch (Exception e3) {
                e = e3;
                str3 = str5;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object e(hb1 hb1Var, EmbyApiService embyApiService, String str, MediaItem mediaItem, ContinuationImpl continuationImpl) {
        gb1 gb1Var;
        hb1Var.getClass();
        if (continuationImpl instanceof gb1) {
            gb1Var = (gb1) continuationImpl;
            int i = gb1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb1Var.g = i - Integer.MIN_VALUE;
            } else {
                gb1Var = new gb1(hb1Var, continuationImpl);
            }
        } else {
            gb1Var = new gb1(hb1Var, continuationImpl);
        }
        gb1 gb1Var2 = gb1Var;
        Object objG = gb1Var2.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = gb1Var2.g;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objG);
                String id = mediaItem.getId();
                gb1Var2.a = null;
                gb1Var2.b = null;
                gb1Var2.c = mediaItem;
                gb1Var2.g = 1;
                objG = kb0.g(embyApiService, str, id, null, gb1Var2, 4, null);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mediaItem = gb1Var2.c;
                ResultKt.throwOnFailure(objG);
            }
            Response response = (Response) objG;
            if (!response.isSuccessful() || response.body() == null) {
                return mediaItem;
            }
            Object objBody = response.body();
            objBody.getClass();
            return (MediaItem) objBody;
        } catch (Exception e) {
            kb0.G("获取其他服电影详情失败: itemId=", mediaItem.getId(), "OtherServerResourceRepo", e);
            return mediaItem;
        }
    }

    public static List g(QueryResult queryResult, String str) {
        try {
            return queryResult.getItems();
        } catch (NullPointerException e) {
            Log.e("OtherServerResourceRepo", str.concat(": 接口返回 Items=null，已按空列表处理"), e);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(ServerConfig serverConfig, String str, String str2, Integer num, ProviderIds providerIds, EpisodeLocator episodeLocator, ContinuationImpl continuationImpl) {
        db1 db1Var;
        if (continuationImpl instanceof db1) {
            db1Var = (db1) continuationImpl;
            int i = db1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                db1Var.j = i - Integer.MIN_VALUE;
            } else {
                db1Var = new db1(this, continuationImpl);
            }
        } else {
            db1Var = new db1(this, continuationImpl);
        }
        Object objWithContext = db1Var.h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = db1Var.j;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            eb1 eb1Var = new eb1(serverConfig, providerIds, this, str, str2, num, episodeLocator, null);
            db1Var.a = null;
            db1Var.b = null;
            db1Var.c = null;
            db1Var.d = null;
            db1Var.e = null;
            db1Var.g = null;
            db1Var.j = 1;
            objWithContext = BuildersKt.withContext(io2, eb1Var, db1Var);
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
