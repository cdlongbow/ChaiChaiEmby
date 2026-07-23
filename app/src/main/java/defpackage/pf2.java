package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxySettings;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.DanmakuPreferences;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.dlna.DlnaConfig;
import com.dh.myembyapp.dlna.DlnaSettings;
import com.google.gson.Gson;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class pf2 {
    public final Context a;
    public final Gson b;
    public final ServerPreferences c;
    public final UserPreferences d;
    public final ProxySettings e;
    public final DanmakuPreferences f;
    public final sa1 g;
    public final rm h;
    public final q72 i;
    public final DlnaSettings j;
    public final ab2 k;

    public pf2(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Gson();
        applicationContext.getClass();
        this.c = new ServerPreferences(applicationContext);
        applicationContext.getClass();
        this.d = new UserPreferences(applicationContext);
        applicationContext.getClass();
        this.e = new ProxySettings(applicationContext);
        applicationContext.getClass();
        this.f = new DanmakuPreferences(applicationContext);
        applicationContext.getClass();
        this.g = new sa1(applicationContext);
        applicationContext.getClass();
        this.h = new rm(applicationContext);
        applicationContext.getClass();
        this.i = new q72(applicationContext);
        applicationContext.getClass();
        this.j = new DlnaSettings(applicationContext);
        applicationContext.getClass();
        this.k = new ab2(applicationContext);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(pf2 pf2Var, rf2 rf2Var, ye2 ye2Var, ContinuationImpl continuationImpl) {
        hf2 hf2Var;
        rf2 rf2Var2;
        List list;
        List servers;
        List list2;
        if (continuationImpl instanceof hf2) {
            hf2Var = (hf2) continuationImpl;
            int i = hf2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf2Var.g = i - Integer.MIN_VALUE;
            } else {
                hf2Var = new hf2(pf2Var, continuationImpl);
            }
        } else {
            hf2Var = new hf2(pf2Var, continuationImpl);
        }
        Object obj = hf2Var.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = hf2Var.g;
        if (i2 != 0) {
            if (i2 == 1) {
                list = hf2Var.c;
                ye2Var = (ye2) hf2Var.b;
                rf2Var2 = (rf2) hf2Var.a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = hf2Var.c;
                ResultKt.throwOnFailure(obj);
            }
            list2.add("应用设置");
            return list2;
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        if (!ye2Var.d || rf2Var.getServerState() == null) {
            rf2Var2 = rf2Var;
            list = arrayList;
            if (ye2Var.e || rf2Var2.getAppSettingsState() == null) {
                return list;
            }
            se2 appSettingsState = rf2Var2.getAppSettingsState();
            hf2Var.a = null;
            hf2Var.b = null;
            hf2Var.c = list;
            hf2Var.g = 2;
            if (pf2Var.e(appSettingsState, hf2Var) != coroutine_suspended) {
                list2 = list;
                list2.add("应用设置");
                return list2;
            }
        } else {
            we2 serverState = rf2Var.getServerState();
            hf2Var.a = rf2Var;
            hf2Var.b = ye2Var;
            hf2Var.c = arrayList;
            hf2Var.g = 1;
            ServerPreferences serverPreferences = pf2Var.c;
            serverPreferences.clearAllServers();
            List servers2 = serverState.getServers();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(servers2, 10));
            Iterator it = servers2.iterator();
            while (it.hasNext()) {
                arrayList2.add(i((ServerConfig) it.next()));
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                serverPreferences.saveServer((ServerConfig) obj2);
            }
            if (!serverState.getServerOrder().isEmpty()) {
                serverPreferences.saveServerOrder(serverState.getServerOrder());
            }
            String lastUsedServerId = serverState.getLastUsedServerId();
            if (lastUsedServerId != null && !StringsKt.isBlank(lastUsedServerId) && ((servers = serverState.getServers()) == null || !servers.isEmpty())) {
                Iterator it2 = servers.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        serverPreferences.clearLastUsedServer();
                        break;
                    }
                    if (Intrinsics.areEqual(((ServerConfig) it2.next()).getId(), lastUsedServerId)) {
                        serverPreferences.setLastUsedServerId(lastUsedServerId);
                        break;
                    }
                }
            } else {
                serverPreferences.clearLastUsedServer();
                break;
            }
            if (Unit.INSTANCE != coroutine_suspended) {
                rf2Var2 = rf2Var;
                list = arrayList;
            }
        }
        return coroutine_suspended;
        list.add("服务器配置");
        if (ye2Var.e) {
        }
        return list;
    }

    public static final String b(pf2 pf2Var, List list) {
        pf2Var.getClass();
        String str = list.contains("服务器配置") ? " 如同步了服务器列表，建议重启软件。" : "";
        return StringsKt.trim((CharSequence) ("下载成功：已应用" + CollectionsKt___CollectionsKt.joinToString$default(list, "、", null, null, 0, null, null, 62, null) + "。" + str)).toString();
    }

    public static final ve2 c(rf2 rf2Var, ye2 ye2Var) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        boolean z = ye2Var.d;
        boolean z2 = ye2Var.e;
        if (z) {
            listCreateListBuilder.add("服务器配置");
        }
        if (z2) {
            listCreateListBuilder.add("应用设置");
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        List listCreateListBuilder2 = CollectionsKt.createListBuilder();
        if (rf2Var.getServerState() != null) {
            listCreateListBuilder2.add("服务器配置");
        }
        if (rf2Var.getAppSettingsState() != null) {
            listCreateListBuilder2.add("应用设置");
        }
        List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
        List listCreateListBuilder3 = CollectionsKt.createListBuilder();
        if (ye2Var.d && rf2Var.getServerState() != null) {
            listCreateListBuilder3.add("服务器配置");
        }
        if (z2 && rf2Var.getAppSettingsState() != null) {
            listCreateListBuilder3.add("应用设置");
        }
        List listBuild3 = CollectionsKt.build(listCreateListBuilder3);
        if (listBuild3.isEmpty()) {
            ra.q("远端配置里没有已勾选的同步内容");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listBuild) {
            if (!listBuild3.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new ve2(rf2Var, listBuild2, listBuild, listBuild3, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(pf2 pf2Var, ye2 ye2Var, ContinuationImpl continuationImpl) {
        jf2 jf2Var;
        int i;
        long j;
        we2 we2Var;
        ye2 ye2Var2;
        int i2;
        long j2;
        Object objF;
        we2 we2Var2;
        if (continuationImpl instanceof jf2) {
            jf2Var = (jf2) continuationImpl;
            int i3 = jf2Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jf2Var.h = i3 - Integer.MIN_VALUE;
            } else {
                jf2Var = new jf2(pf2Var, continuationImpl);
            }
        } else {
            jf2Var = new jf2(pf2Var, continuationImpl);
        }
        Object obj = jf2Var.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = jf2Var.h;
        se2 se2Var = null;
        if (i4 != 0) {
            if (i4 == 1) {
                j2 = jf2Var.d;
                i2 = jf2Var.c;
                ye2Var2 = (ye2) jf2Var.a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i4 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                we2Var2 = jf2Var.b;
                ResultKt.throwOnFailure(obj);
            }
            se2Var = (se2) obj;
            we2Var = we2Var2;
            return new rf2(we2Var, se2Var, 15);
        }
        ResultKt.throwOnFailure(obj);
        i = 0;
        j = 0;
        if (!ye2Var.d) {
            we2Var = null;
            if (ye2Var.e) {
                jf2Var.a = null;
                jf2Var.b = we2Var;
                jf2Var.c = i;
                jf2Var.d = j;
                jf2Var.h = 2;
                objF = pf2Var.f(jf2Var);
                if (objF != coroutine_suspended) {
                    we2 we2Var3 = we2Var;
                    obj = objF;
                    we2Var2 = we2Var3;
                    se2Var = (se2) obj;
                    we2Var = we2Var2;
                }
            }
            return new rf2(we2Var, se2Var, 15);
        }
        jf2Var.a = ye2Var;
        jf2Var.c = 0;
        jf2Var.d = 0L;
        jf2Var.h = 1;
        ServerPreferences serverPreferences = pf2Var.c;
        List<ServerConfig> allServers = serverPreferences.getAllServers();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allServers, 10));
        Iterator<T> it = allServers.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ServerConfig) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            arrayList2.add(((ServerConfig) obj2).getId());
        }
        Object we2Var4 = new we2(serverPreferences.getLastUsedServerId(), arrayList, arrayList2);
        if (we2Var4 != coroutine_suspended) {
            ye2Var2 = ye2Var;
            i2 = 0;
            j2 = 0;
            obj = we2Var4;
        }
        return coroutine_suspended;
        we2Var = (we2) obj;
        ye2 ye2Var3 = ye2Var2;
        i = i2;
        ye2Var = ye2Var3;
        j = j2;
        if (ye2Var.e) {
            jf2Var.a = null;
            jf2Var.b = we2Var;
            jf2Var.c = i;
            jf2Var.d = j;
            jf2Var.h = 2;
            objF = pf2Var.f(jf2Var);
            if (objF != coroutine_suspended) {
                we2 we2Var5 = we2Var;
                obj = objF;
                we2Var2 = we2Var5;
                se2Var = (se2) obj;
                we2Var = we2Var2;
            }
            return coroutine_suspended;
        }
        return new rf2(we2Var, se2Var, 15);
    }

    public static ServerConfig i(ServerConfig serverConfig) {
        return ServerConfig.copy$default(serverConfig, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, null, null, null, null, 0L, 3668991, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0164  */
    /* JADX WARN: Code duplicated, block: B:37:0x018e A[PHI: r4
      0x018e: PHI (r4v12 se2) = (r4v11 se2), (r4v19 se2) binds: [B:35:0x018b, B:19:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x01a3 A[PHI: r4
      0x01a3: PHI (r4v13 se2) = (r4v12 se2), (r4v20 se2) binds: [B:38:0x01a0, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0204  */
    /* JADX WARN: Code duplicated, block: B:57:0x021c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0225  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(se2 se2Var, ContinuationImpl continuationImpl) {
        gf2 gf2Var;
        se2 se2Var2;
        rm rmVar;
        int memoryBufferMb;
        rm rmVar2;
        int bufferTimeSec;
        DlnaSettings dlnaSettings;
        DlnaConfig dlnaConfig;
        se2 se2Var3;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        String sortOption;
        SharedPreferences sharedPreferences3;
        boolean sortDescending;
        SharedPreferences sharedPreferences4;
        sf2 traktConfig;
        if (continuationImpl instanceof gf2) {
            gf2Var = (gf2) continuationImpl;
            int i = gf2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gf2Var.d = i - Integer.MIN_VALUE;
            } else {
                gf2Var = new gf2(this, continuationImpl);
            }
        } else {
            gf2Var = new gf2(this, continuationImpl);
        }
        Object obj = gf2Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = gf2Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            tf2 userPreferences = se2Var.getUserPreferences();
            UserPreferences userPreferences2 = this.d;
            userPreferences2.saveEnableAggregateSearch(userPreferences.getEnableAggregateSearch());
            userPreferences2.saveEnableAggregateSearchInServerSearch(userPreferences.getEnableAggregateSearchInServerSearch());
            userPreferences2.saveSystemTimeDisplayMode(userPreferences.getSystemTimeDisplayMode());
            userPreferences2.saveSystemNetworkSpeedDisplayMode(userPreferences.getSystemNetworkSpeedDisplayMode());
            userPreferences2.saveSystemNetworkSpeedPosition(userPreferences.getSystemNetworkSpeedPosition());
            userPreferences2.saveDisableTopNavFocusRefresh(userPreferences.getDisableTopNavFocusRefresh());
            userPreferences2.saveEnableTransparentTopNavButtons(userPreferences.getEnableTransparentTopNavButtons());
            userPreferences2.saveQrNetworkInterfaceName(userPreferences.getQrNetworkInterfaceName());
            userPreferences2.saveServerIconLibraryUrl(userPreferences.getServerIconLibraryUrl());
            userPreferences2.saveEnableClickableLibrarySectionTitle(userPreferences.getEnableClickableLibrarySectionTitle());
            userPreferences2.saveEnableLibraryRowMoreButton(userPreferences.getEnableLibraryRowMoreButton());
            userPreferences2.saveEnableHomeUnplayedOnly(userPreferences.getEnableHomeUnplayedOnly());
            userPreferences2.saveEnablePlaybackStartupPoster(userPreferences.getEnablePlaybackStartupPoster());
            userPreferences2.saveEnableAggregateSearchVersionTags(userPreferences.getEnableAggregateSearchVersionTags());
            userPreferences2.saveEnableDetailAggregateVersionRail(userPreferences.getEnableDetailAggregateVersionRail());
            userPreferences2.saveEnableHomeBackFocusServerButton(userPreferences.getEnableHomeBackFocusServerButton());
            userPreferences2.saveEnableAppUpdateCheckOnStartup(userPreferences.getEnableAppUpdateCheckOnStartup());
            q72 q72Var = this.i;
            AppThemePreset preset = se2Var.getThemeConfig().getPreset();
            LightThemeBackgroundStyle lightBackgroundStyle = se2Var.getThemeConfig().getLightBackgroundStyle();
            DarkThemeStyle darkThemeStyle = se2Var.getThemeConfig().getDarkThemeStyle();
            DarkThemeGlowPosition darkThemeGlowPosition = se2Var.getThemeConfig().getDarkThemeGlowPosition();
            boolean accentFollowsTheme = se2Var.getThemeConfig().getAccentFollowsTheme();
            boolean detachedFocusBorderEnabled = se2Var.getThemeConfig().getDetachedFocusBorderEnabled();
            int cardSizeLevel = se2Var.getThemeConfig().getCardSizeLevel();
            se2Var2 = se2Var;
            gf2Var.a = se2Var2;
            gf2Var.d = 1;
            Object objEdit = PreferencesKt.edit((DataStore) w72.b.getValue(q72Var.a, w72.a[0]), new o72(preset, lightBackgroundStyle, darkThemeStyle, darkThemeGlowPosition, accentFollowsTheme, detachedFocusBorderEnabled, cardSizeLevel, null), gf2Var);
            if (objEdit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEdit = Unit.INSTANCE;
            }
            if (objEdit != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            se2Var2 = gf2Var.a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 == 2) {
                se2Var2 = gf2Var.a;
                ResultKt.throwOnFailure(obj);
                Proxy proxy = lr1.a;
                lr1.a(se2Var2.getProxyConfig());
                if (lr1.e) {
                    lr1.c(true);
                }
                this.f.saveDanmakuConfig(se2Var2.getDanmakuConfig());
                this.g.a(se2Var2.getOnlineSubtitleConfig());
                rmVar = this.h;
                memoryBufferMb = se2Var2.getBufferConfig().getMemoryBufferMb();
                gf2Var.a = se2Var2;
                gf2Var.d = 3;
                if (rmVar.f(memoryBufferMb, gf2Var) != coroutine_suspended) {
                    rmVar2 = this.h;
                    bufferTimeSec = se2Var2.getBufferConfig().getBufferTimeSec();
                    gf2Var.a = se2Var2;
                    gf2Var.d = 4;
                    if (rmVar2.e(bufferTimeSec, gf2Var) != coroutine_suspended) {
                        dlnaSettings = this.j;
                        dlnaConfig = se2Var2.getDlnaConfig();
                        gf2Var.a = se2Var2;
                        gf2Var.d = 5;
                        if (dlnaSettings.saveConfig(dlnaConfig, gf2Var) != coroutine_suspended) {
                            se2Var3 = se2Var2;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 3) {
                se2Var2 = gf2Var.a;
                ResultKt.throwOnFailure(obj);
                rmVar2 = this.h;
                bufferTimeSec = se2Var2.getBufferConfig().getBufferTimeSec();
                gf2Var.a = se2Var2;
                gf2Var.d = 4;
                if (rmVar2.e(bufferTimeSec, gf2Var) != coroutine_suspended) {
                    dlnaSettings = this.j;
                    dlnaConfig = se2Var2.getDlnaConfig();
                    gf2Var.a = se2Var2;
                    gf2Var.d = 5;
                    if (dlnaSettings.saveConfig(dlnaConfig, gf2Var) != coroutine_suspended) {
                        se2Var3 = se2Var2;
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 4) {
                se2Var2 = gf2Var.a;
                ResultKt.throwOnFailure(obj);
                dlnaSettings = this.j;
                dlnaConfig = se2Var2.getDlnaConfig();
                gf2Var.a = se2Var2;
                gf2Var.d = 5;
                if (dlnaSettings.saveConfig(dlnaConfig, gf2Var) != coroutine_suspended) {
                    se2Var3 = se2Var2;
                }
                return coroutine_suspended;
            }
            if (i2 != 5) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            se2Var3 = gf2Var.a;
            ResultKt.throwOnFailure(obj);
        }
        String sortOption2 = se2Var3.getEpisodeSort().getSortOption();
        sortOption2.getClass();
        sharedPreferences = ig2.c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putString("sort_option", sortOption2).apply();
        boolean sortDescending2 = se2Var3.getEpisodeSort().getSortDescending();
        sharedPreferences2 = ig2.c;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences2 = null;
        }
        sharedPreferences2.edit().putBoolean("sort_descending", sortDescending2).apply();
        sortOption = se2Var3.getLibrarySort().getSortOption();
        sortOption.getClass();
        sharedPreferences3 = ig2.d;
        if (sharedPreferences3 != null) {
            sharedPreferences3.edit().putString("sort_option", sortOption).apply();
        }
        sortDescending = se2Var3.getLibrarySort().getSortDescending();
        sharedPreferences4 = ig2.d;
        if (sharedPreferences4 != null) {
            i9.p(sharedPreferences4, "sort_descending", sortDescending);
        }
        traktConfig = se2Var3.getTraktConfig();
        if (traktConfig != null) {
            ab2 ab2Var = this.k;
            ab2Var.d(i92.a(ab2Var.a(), traktConfig.getEnabled(), null, null, 0L, traktConfig.getPromptCloudProgress(), traktConfig.getSyncLocalProgressToTrakt(), traktConfig.getMinimumProgressDifferenceSeconds(), 14));
        }
        return Unit.INSTANCE;
        ProxySettings proxySettings = this.e;
        ProxyConfig proxyConfig = se2Var2.getProxyConfig();
        gf2Var.a = se2Var2;
        gf2Var.d = 2;
        if (proxySettings.saveProxyConfig(proxyConfig, gf2Var) != coroutine_suspended) {
            Proxy proxy2 = lr1.a;
            lr1.a(se2Var2.getProxyConfig());
            if (lr1.e) {
                lr1.c(true);
            }
            this.f.saveDanmakuConfig(se2Var2.getDanmakuConfig());
            this.g.a(se2Var2.getOnlineSubtitleConfig());
            rmVar = this.h;
            memoryBufferMb = se2Var2.getBufferConfig().getMemoryBufferMb();
            gf2Var.a = se2Var2;
            gf2Var.d = 3;
            if (rmVar.f(memoryBufferMb, gf2Var) != coroutine_suspended) {
                rmVar2 = this.h;
                bufferTimeSec = se2Var2.getBufferConfig().getBufferTimeSec();
                gf2Var.a = se2Var2;
                gf2Var.d = 4;
                if (rmVar2.e(bufferTimeSec, gf2Var) != coroutine_suspended) {
                    dlnaSettings = this.j;
                    dlnaConfig = se2Var2.getDlnaConfig();
                    gf2Var.a = se2Var2;
                    gf2Var.d = 5;
                    if (dlnaSettings.saveConfig(dlnaConfig, gf2Var) != coroutine_suspended) {
                        se2Var3 = se2Var2;
                        String sortOption3 = se2Var3.getEpisodeSort().getSortOption();
                        sortOption3.getClass();
                        sharedPreferences = ig2.c;
                        if (sharedPreferences == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("prefs");
                            sharedPreferences = null;
                        }
                        sharedPreferences.edit().putString("sort_option", sortOption3).apply();
                        boolean sortDescending3 = se2Var3.getEpisodeSort().getSortDescending();
                        sharedPreferences2 = ig2.c;
                        if (sharedPreferences2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("prefs");
                            sharedPreferences2 = null;
                        }
                        sharedPreferences2.edit().putBoolean("sort_descending", sortDescending3).apply();
                        sortOption = se2Var3.getLibrarySort().getSortOption();
                        sortOption.getClass();
                        sharedPreferences3 = ig2.d;
                        if (sharedPreferences3 != null) {
                            sharedPreferences3.edit().putString("sort_option", sortOption).apply();
                        }
                        sortDescending = se2Var3.getLibrarySort().getSortDescending();
                        sharedPreferences4 = ig2.d;
                        if (sharedPreferences4 != null) {
                            i9.p(sharedPreferences4, "sort_descending", sortDescending);
                        }
                        traktConfig = se2Var3.getTraktConfig();
                        if (traktConfig != null) {
                            ab2 ab2Var2 = this.k;
                            ab2Var2.d(i92.a(ab2Var2.a(), traktConfig.getEnabled(), null, null, 0L, traktConfig.getPromptCloudProgress(), traktConfig.getSyncLocalProgressToTrakt(), traktConfig.getMinimumProgressDifferenceSeconds(), 14));
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x012e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0150  */
    /* JADX WARN: Code duplicated, block: B:42:0x017d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0192  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(ContinuationImpl continuationImpl) {
        if2 if2Var;
        tf2 tf2Var;
        bc bcVar;
        tf2 tf2Var2;
        ProxyConfig proxyConfig;
        DanmakuConfig danmakuConfig;
        t91 t91Var;
        Object objFirst;
        DanmakuConfig danmakuConfig2;
        int iIntValue;
        Object objFirst2;
        int i;
        DanmakuConfig danmakuConfig3;
        ProxyConfig proxyConfig2;
        bc bcVar2;
        tf2 tf2Var3;
        te2 te2Var;
        DanmakuConfig danmakuConfig4;
        ProxyConfig proxyConfig3;
        bc bcVar3;
        te2 te2Var2;
        tf2 tf2Var4;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        String str;
        String string;
        if (continuationImpl instanceof if2) {
            if2Var = (if2) continuationImpl;
            int i2 = if2Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                if2Var.k = i2 - Integer.MIN_VALUE;
            } else {
                if2Var = new if2(this, continuationImpl);
            }
        } else {
            if2Var = new if2(this, continuationImpl);
        }
        Object objFirst3 = if2Var.i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = if2Var.k;
        SharedPreferences sharedPreferences4 = null;
        rm rmVar = this.h;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirst3);
            UserPreferences userPreferences = this.d;
            tf2 tf2Var5 = new tf2(userPreferences.getEnableAggregateSearch(), userPreferences.getEnableAggregateSearchInServerSearch(), userPreferences.getSystemTimeDisplayMode(), userPreferences.getSystemNetworkSpeedDisplayMode(), userPreferences.getSystemNetworkSpeedPosition(), userPreferences.getDisableTopNavFocusRefresh(), userPreferences.getEnableTransparentTopNavButtons(), userPreferences.getQrNetworkInterfaceName(), userPreferences.getServerIconLibraryUrl(), userPreferences.getEnableClickableLibrarySectionTitle(), userPreferences.getEnableLibraryRowMoreButton(), userPreferences.getEnableHomeUnplayedOnly(), userPreferences.getEnablePlaybackStartupPoster(), userPreferences.getEnableAggregateSearchVersionTags(), userPreferences.getEnableDetailAggregateVersionRail(), userPreferences.getEnableHomeBackFocusServerButton(), userPreferences.getEnableAppUpdateCheckOnStartup());
            b7 b7Var = this.i.b;
            if2Var.a = tf2Var5;
            if2Var.k = 1;
            objFirst3 = FlowKt.first(b7Var, if2Var);
            if (objFirst3 != coroutine_suspended) {
                tf2Var = tf2Var5;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            tf2Var = if2Var.a;
            ResultKt.throwOnFailure(objFirst3);
        } else {
            if (i3 == 2) {
                bc bcVar4 = if2Var.b;
                tf2 tf2Var6 = if2Var.a;
                ResultKt.throwOnFailure(objFirst3);
                bcVar = bcVar4;
                tf2Var2 = tf2Var6;
                proxyConfig = (ProxyConfig) objFirst3;
                danmakuConfig = this.f.getDanmakuConfig();
                t91Var = (t91) this.g.b.getValue();
                b7 b7Var2 = rmVar.b;
                if2Var.a = tf2Var2;
                if2Var.b = bcVar;
                if2Var.c = proxyConfig;
                if2Var.d = danmakuConfig;
                if2Var.e = t91Var;
                if2Var.k = 3;
                objFirst = FlowKt.first(b7Var2, if2Var);
                if (objFirst != coroutine_suspended) {
                    danmakuConfig2 = danmakuConfig;
                    objFirst3 = objFirst;
                    iIntValue = ((Number) objFirst3).intValue();
                    b7 b7Var3 = rmVar.c;
                    if2Var.a = tf2Var2;
                    if2Var.b = bcVar;
                    if2Var.c = proxyConfig;
                    if2Var.d = danmakuConfig2;
                    if2Var.e = t91Var;
                    if2Var.h = iIntValue;
                    if2Var.k = 4;
                    objFirst2 = FlowKt.first(b7Var3, if2Var);
                    if (objFirst2 != coroutine_suspended) {
                        i = iIntValue;
                        objFirst3 = objFirst2;
                        danmakuConfig3 = danmakuConfig2;
                        proxyConfig2 = proxyConfig;
                        bcVar2 = bcVar;
                        tf2Var3 = tf2Var2;
                        te2Var = new te2(i, ((Number) objFirst3).intValue());
                        Flow<DlnaConfig> configFlow = this.j.getConfigFlow();
                        if2Var.a = tf2Var3;
                        if2Var.b = bcVar2;
                        if2Var.c = proxyConfig2;
                        if2Var.d = danmakuConfig3;
                        if2Var.e = t91Var;
                        if2Var.g = te2Var;
                        if2Var.k = 5;
                        objFirst3 = FlowKt.first(configFlow, if2Var);
                        if (objFirst3 != coroutine_suspended) {
                            danmakuConfig4 = danmakuConfig3;
                            proxyConfig3 = proxyConfig2;
                            bcVar3 = bcVar2;
                            te2Var2 = te2Var;
                            tf2Var4 = tf2Var3;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i3 == 3) {
                t91Var = if2Var.e;
                danmakuConfig2 = if2Var.d;
                proxyConfig = if2Var.c;
                bcVar = if2Var.b;
                tf2Var2 = if2Var.a;
                ResultKt.throwOnFailure(objFirst3);
                iIntValue = ((Number) objFirst3).intValue();
                b7 b7Var4 = rmVar.c;
                if2Var.a = tf2Var2;
                if2Var.b = bcVar;
                if2Var.c = proxyConfig;
                if2Var.d = danmakuConfig2;
                if2Var.e = t91Var;
                if2Var.h = iIntValue;
                if2Var.k = 4;
                objFirst2 = FlowKt.first(b7Var4, if2Var);
                if (objFirst2 != coroutine_suspended) {
                    i = iIntValue;
                    objFirst3 = objFirst2;
                    danmakuConfig3 = danmakuConfig2;
                    proxyConfig2 = proxyConfig;
                    bcVar2 = bcVar;
                    tf2Var3 = tf2Var2;
                    te2Var = new te2(i, ((Number) objFirst3).intValue());
                    Flow<DlnaConfig> configFlow2 = this.j.getConfigFlow();
                    if2Var.a = tf2Var3;
                    if2Var.b = bcVar2;
                    if2Var.c = proxyConfig2;
                    if2Var.d = danmakuConfig3;
                    if2Var.e = t91Var;
                    if2Var.g = te2Var;
                    if2Var.k = 5;
                    objFirst3 = FlowKt.first(configFlow2, if2Var);
                    if (objFirst3 != coroutine_suspended) {
                        danmakuConfig4 = danmakuConfig3;
                        proxyConfig3 = proxyConfig2;
                        bcVar3 = bcVar2;
                        te2Var2 = te2Var;
                        tf2Var4 = tf2Var3;
                    }
                }
                return coroutine_suspended;
            }
            if (i3 == 4) {
                int i4 = if2Var.h;
                t91 t91Var2 = if2Var.e;
                danmakuConfig3 = if2Var.d;
                proxyConfig2 = if2Var.c;
                bcVar2 = if2Var.b;
                tf2Var3 = if2Var.a;
                ResultKt.throwOnFailure(objFirst3);
                i = i4;
                t91Var = t91Var2;
                te2Var = new te2(i, ((Number) objFirst3).intValue());
                Flow<DlnaConfig> configFlow3 = this.j.getConfigFlow();
                if2Var.a = tf2Var3;
                if2Var.b = bcVar2;
                if2Var.c = proxyConfig2;
                if2Var.d = danmakuConfig3;
                if2Var.e = t91Var;
                if2Var.g = te2Var;
                if2Var.k = 5;
                objFirst3 = FlowKt.first(configFlow3, if2Var);
                if (objFirst3 != coroutine_suspended) {
                    danmakuConfig4 = danmakuConfig3;
                    proxyConfig3 = proxyConfig2;
                    bcVar3 = bcVar2;
                    te2Var2 = te2Var;
                    tf2Var4 = tf2Var3;
                }
                return coroutine_suspended;
            }
            if (i3 != 5) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            te2 te2Var3 = if2Var.g;
            t91Var = if2Var.e;
            DanmakuConfig danmakuConfig5 = if2Var.d;
            ProxyConfig proxyConfig4 = if2Var.c;
            bc bcVar5 = if2Var.b;
            tf2 tf2Var7 = if2Var.a;
            ResultKt.throwOnFailure(objFirst3);
            tf2Var4 = tf2Var7;
            te2Var2 = te2Var3;
            danmakuConfig4 = danmakuConfig5;
            proxyConfig3 = proxyConfig4;
            bcVar3 = bcVar5;
        }
        t91 t91Var3 = t91Var;
        DlnaConfig dlnaConfig = (DlnaConfig) objFirst3;
        sharedPreferences = ig2.c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
            sharedPreferences = null;
        }
        String string2 = sharedPreferences.getString("sort_option", "TITLE");
        String str2 = string2 != null ? string2 : "TITLE";
        sharedPreferences2 = ig2.c;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prefs");
        } else {
            sharedPreferences4 = sharedPreferences2;
        }
        xe2 xe2Var = new xe2(str2, sharedPreferences4.getBoolean("sort_descending", true));
        sharedPreferences3 = ig2.d;
        str = "LAST_CONTENT_ADDED";
        if (sharedPreferences3 != null && (string = sharedPreferences3.getString("sort_option", "LAST_CONTENT_ADDED")) != null) {
            str = string;
        }
        SharedPreferences sharedPreferences5 = ig2.d;
        xe2 xe2Var2 = new xe2(str, sharedPreferences5 != null ? sharedPreferences5.getBoolean("sort_descending", true) : true);
        i92 i92VarA = this.k.a();
        return new se2(tf2Var4, bcVar3, proxyConfig3, danmakuConfig4, t91Var3, te2Var2, dlnaConfig, xe2Var, xe2Var2, new sf2(i92VarA.a, i92VarA.e, i92VarA.f, i92VarA.g));
        bc bcVar6 = (bc) objFirst3;
        Flow<ProxyConfig> proxyConfigFlow = this.e.getProxyConfigFlow();
        if2Var.a = tf2Var;
        if2Var.b = bcVar6;
        if2Var.k = 2;
        Object objFirst4 = FlowKt.first(proxyConfigFlow, if2Var);
        if (objFirst4 != coroutine_suspended) {
            bcVar = bcVar6;
            tf2Var2 = tf2Var;
            objFirst3 = objFirst4;
            proxyConfig = (ProxyConfig) objFirst3;
            danmakuConfig = this.f.getDanmakuConfig();
            t91Var = (t91) this.g.b.getValue();
            b7 b7Var5 = rmVar.b;
            if2Var.a = tf2Var2;
            if2Var.b = bcVar;
            if2Var.c = proxyConfig;
            if2Var.d = danmakuConfig;
            if2Var.e = t91Var;
            if2Var.k = 3;
            objFirst = FlowKt.first(b7Var5, if2Var);
            if (objFirst != coroutine_suspended) {
                danmakuConfig2 = danmakuConfig;
                objFirst3 = objFirst;
                iIntValue = ((Number) objFirst3).intValue();
                b7 b7Var6 = rmVar.c;
                if2Var.a = tf2Var2;
                if2Var.b = bcVar;
                if2Var.c = proxyConfig;
                if2Var.d = danmakuConfig2;
                if2Var.e = t91Var;
                if2Var.h = iIntValue;
                if2Var.k = 4;
                objFirst2 = FlowKt.first(b7Var6, if2Var);
                if (objFirst2 != coroutine_suspended) {
                    i = iIntValue;
                    objFirst3 = objFirst2;
                    danmakuConfig3 = danmakuConfig2;
                    proxyConfig2 = proxyConfig;
                    bcVar2 = bcVar;
                    tf2Var3 = tf2Var2;
                    te2Var = new te2(i, ((Number) objFirst3).intValue());
                    Flow<DlnaConfig> configFlow4 = this.j.getConfigFlow();
                    if2Var.a = tf2Var3;
                    if2Var.b = bcVar2;
                    if2Var.c = proxyConfig2;
                    if2Var.d = danmakuConfig3;
                    if2Var.e = t91Var;
                    if2Var.g = te2Var;
                    if2Var.k = 5;
                    objFirst3 = FlowKt.first(configFlow4, if2Var);
                    if (objFirst3 != coroutine_suspended) {
                        danmakuConfig4 = danmakuConfig3;
                        proxyConfig3 = proxyConfig2;
                        bcVar3 = bcVar2;
                        te2Var2 = te2Var;
                        tf2Var4 = tf2Var3;
                        t91 t91Var4 = t91Var;
                        DlnaConfig dlnaConfig2 = (DlnaConfig) objFirst3;
                        sharedPreferences = ig2.c;
                        if (sharedPreferences == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("prefs");
                            sharedPreferences = null;
                        }
                        String string3 = sharedPreferences.getString("sort_option", "TITLE");
                        if (string3 != null) {
                        }
                        sharedPreferences2 = ig2.c;
                        if (sharedPreferences2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("prefs");
                        } else {
                            sharedPreferences4 = sharedPreferences2;
                        }
                        xe2 xe2Var3 = new xe2(str2, sharedPreferences4.getBoolean("sort_descending", true));
                        sharedPreferences3 = ig2.d;
                        str = "LAST_CONTENT_ADDED";
                        if (sharedPreferences3 != null) {
                            str = string;
                        }
                        SharedPreferences sharedPreferences6 = ig2.d;
                        xe2 xe2Var4 = new xe2(str, sharedPreferences6 != null ? sharedPreferences6.getBoolean("sort_descending", true) : true);
                        i92 i92VarA2 = this.k.a();
                        return new se2(tf2Var4, bcVar3, proxyConfig3, danmakuConfig4, t91Var4, te2Var2, dlnaConfig2, xe2Var3, xe2Var4, new sf2(i92VarA2.a, i92VarA2.e, i92VarA2.f, i92VarA2.g));
                    }
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ye2 ye2Var, rf2 rf2Var, ContinuationImpl continuationImpl) {
        kf2 kf2Var;
        if (continuationImpl instanceof kf2) {
            kf2Var = (kf2) continuationImpl;
            int i = kf2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kf2Var.e = i - Integer.MIN_VALUE;
            } else {
                kf2Var = new kf2(this, continuationImpl);
            }
        } else {
            kf2Var = new kf2(this, continuationImpl);
        }
        Object objWithContext = kf2Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = kf2Var.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            mi miVar = new mi(ye2Var, rf2Var, this, null);
            kf2Var.a = null;
            kf2Var.b = null;
            kf2Var.e = 1;
            objWithContext = BuildersKt.withContext(io2, miVar, kf2Var);
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
    public final Object h(ye2 ye2Var, ContinuationImpl continuationImpl) {
        lf2 lf2Var;
        if (continuationImpl instanceof lf2) {
            lf2Var = (lf2) continuationImpl;
            int i = lf2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lf2Var.d = i - Integer.MIN_VALUE;
            } else {
                lf2Var = new lf2(this, continuationImpl);
            }
        } else {
            lf2Var = new lf2(this, continuationImpl);
        }
        Object objWithContext = lf2Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = lf2Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            mf2 mf2Var = new mf2(ye2Var, this, (Continuation) null);
            lf2Var.a = null;
            lf2Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, mf2Var, lf2Var);
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
    public final Object j(ye2 ye2Var, ContinuationImpl continuationImpl) {
        nf2 nf2Var;
        if (continuationImpl instanceof nf2) {
            nf2Var = (nf2) continuationImpl;
            int i = nf2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nf2Var.d = i - Integer.MIN_VALUE;
            } else {
                nf2Var = new nf2(this, continuationImpl);
            }
        } else {
            nf2Var = new nf2(this, continuationImpl);
        }
        Object objWithContext = nf2Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nf2Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            mf2 mf2Var = new mf2(this, ye2Var, (Continuation) null);
            nf2Var.a = null;
            nf2Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, mf2Var, nf2Var);
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
    public final Object k(ye2 ye2Var, ContinuationImpl continuationImpl) {
        of2 of2Var;
        if (continuationImpl instanceof of2) {
            of2Var = (of2) continuationImpl;
            int i = of2Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                of2Var.d = i - Integer.MIN_VALUE;
            } else {
                of2Var = new of2(this, continuationImpl);
            }
        } else {
            of2Var = new of2(this, continuationImpl);
        }
        Object objWithContext = of2Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = of2Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            mi miVar = new mi(ye2Var, this, null);
            of2Var.a = null;
            of2Var.d = 1;
            objWithContext = BuildersKt.withContext(io2, miVar, of2Var);
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
