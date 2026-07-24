package com.dh.myembyapp.data.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.dl;
import defpackage.oy1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002J\b\u0010+\u001a\u00020\rH\u0002J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\u0006\u0010-\u001a\u00020\u0014H\u0002R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/dh/myembyapp/data/preferences/ServerPreferences;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "prefs", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "saveServer", "", "config", "Lcom/dh/myembyapp/data/model/ServerConfig;", "getAllServers", "", "saveServerOrder", "orderedServerIds", "", "getServerById", TtmlNode.ATTR_ID, "deleteServer", "updateServerLoginInfo", "serverId", "userId", "accessToken", "updateServerPlaybackAccess", "accessTime", "", "setLastUsedServerId", "getLastUsedServerId", "getLastUsedServer", "clearLastUsedServer", "clearAllServers", "generateServerId", "createDefaultServer", "readStoredServers", "readStoredServerOrder", "persistServerOrder", "buildStoredOrderWithAllServerIds", "allServerIds", "cleanupRemovedFeatureData", "parseStoredServers", "json", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerPreferences {
    private static final String KEY_LAST_USED_SERVER = "last_used_server";
    private static final String KEY_SERVERS = "servers";
    private static final String KEY_SERVER_ORDER = "server_order";
    private static final String LEGACY_REMOVED_FEATURE_PREFS_NAME = "strict_request_mode_logs";
    private static final String LEGACY_REMOVED_SERVER_FIELD = "\"strictRequestMode\"";
    private static final String PREFS_NAME = "server_configs";
    private final Context appContext;
    private final Gson gson;
    private final SharedPreferences prefs;
    

    public ServerPreferences(Context context) {
        context.getClass();
        this.appContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.prefs = sharedPreferences;
        this.gson = new Gson();
        cleanupRemovedFeatureData();
    }

    private final List<String> buildStoredOrderWithAllServerIds(List<String> orderedServerIds, List<String> allServerIds) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : orderedServerIds) {
            if (allServerIds.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        List listDistinct = CollectionsKt___CollectionsKt.distinct(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : allServerIds) {
            if (!listDistinct.contains((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.plus((Collection) listDistinct, (Iterable) arrayList2);
    }

    private final void cleanupRemovedFeatureData() {
        List<ServerConfig> storedServers;
        String string = this.prefs.getString(KEY_SERVERS, null);
        if (string != null && StringsKt__StringsKt.contains$default(string, (CharSequence) LEGACY_REMOVED_SERVER_FIELD, false, 2, (Object) null) && (storedServers = parseStoredServers(string)) != null) {
            this.prefs.edit().putString(KEY_SERVERS, this.gson.toJson(storedServers)).apply();
        }
        this.appContext.getSharedPreferences(LEGACY_REMOVED_FEATURE_PREFS_NAME, 0).edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteServer$lambda$0(String str, ServerConfig serverConfig) {
        serverConfig.getClass();
        return Intrinsics.areEqual(serverConfig.getId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteServer$lambda$1(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private final List<ServerConfig> parseStoredServers(String json) {
        String str;
        try {
            List<ServerConfig> listEmptyList = (List) this.gson.fromJson(json, new TypeToken<List<? extends ServerConfig>>() { // from class: com.dh.myembyapp.data.preferences.ServerPreferences$parseStoredServers$type$1
            }.getType());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listEmptyList, 10));
            for (ServerConfig serverConfig : listEmptyList) {
                List<BackupRouteConfig> backupRoutesSafe = serverConfig.getBackupRoutesSafe();
                String activeBackupRouteId = serverConfig.getActiveBackupRouteId();
                if (activeBackupRouteId != null) {
                    if (!(backupRoutesSafe != null) || !backupRoutesSafe.isEmpty()) {
                        Iterator<T> it = backupRoutesSafe.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual(((BackupRouteConfig) it.next()).getId(), activeBackupRouteId)) {
                                    str = activeBackupRouteId;
                                    break;
                                }
                            }
                        }
                    }
                    str = null;
                    break;
                    break;
                }
                str = null;
                break;
                arrayList.add(ServerConfig.copy$default(serverConfig, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, backupRoutesSafe, str, null, null, 0L, 3801087, null));
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private final void persistServerOrder(List<String> orderedServerIds) {
        this.prefs.edit().putString(KEY_SERVER_ORDER, this.gson.toJson(orderedServerIds)).apply();
    }

    private final List<String> readStoredServerOrder() {
        String string = this.prefs.getString(KEY_SERVER_ORDER, null);
        if (string != null) {
            try {
                List list = (List) this.gson.fromJson(string, new TypeToken<List<? extends String>>() { // from class: com.dh.myembyapp.data.preferences.ServerPreferences$readStoredServerOrder$type$1
                }.getType());
                if (list != null) {
                    return CollectionsKt___CollectionsKt.distinct(list);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final List<ServerConfig> readStoredServers() {
        String string = this.prefs.getString(KEY_SERVERS, null);
        if (string == null) {
            return CollectionsKt.emptyList();
        }
        List<ServerConfig> storedServers = parseStoredServers(string);
        return storedServers == null ? CollectionsKt.emptyList() : storedServers;
    }

    public static /* synthetic */ void updateServerPlaybackAccess$default(ServerPreferences serverPreferences, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        serverPreferences.updateServerPlaybackAccess(str, j);
    }

    public final void clearAllServers() {
        this.prefs.edit().remove(KEY_SERVERS).remove(KEY_LAST_USED_SERVER).remove(KEY_SERVER_ORDER).apply();
    }

    public final void clearLastUsedServer() {
        this.prefs.edit().remove(KEY_LAST_USED_SERVER).apply();
    }

    public final ServerConfig createDefaultServer() {
        return new ServerConfig(generateServerId(), "我的Emby服务器", "http", "192.168.2.100", 8096, null, "emby", "", null, null, null, 0L, false, false, false, false, false, null, null, null, null, 0L, 4194080, null);
    }

    public final void deleteServer(String id) {
        id.getClass();
        List mutableList = CollectionsKt.toMutableList((Collection) readStoredServers());
        ((java.util.Collection) mutableList).removeIf(new oy1(new dl(id, 18), 0));
        this.prefs.edit().putString(KEY_SERVERS, this.gson.toJson(mutableList)).apply();
        if (this.prefs.contains(KEY_SERVER_ORDER)) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                arrayList.add(((ServerConfig) it.next()).getId());
            }
            persistServerOrder(buildStoredOrderWithAllServerIds(arrayList));
        }
        if (Intrinsics.areEqual(getLastUsedServerId(), id)) {
            clearLastUsedServer();
        }
    }

    public final String generateServerId() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public final List<ServerConfig> getAllServers() {
        List<ServerConfig> storedServers = readStoredServers();
        if (storedServers.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<String> storedServerOrder = readStoredServerOrder();
        if (storedServerOrder == null || storedServerOrder.isEmpty()) {
            return CollectionsKt.sortedWith(storedServers, new Comparator() { // from class: com.dh.myembyapp.data.preferences.ServerPreferences$getAllServers$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((ServerConfig) t2).getLastLoginTime()), Long.valueOf(((ServerConfig) t).getLastLoginTime()));
                }
            });
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(storedServers, 10)), 16));
        for (Object obj : storedServers) {
            linkedHashMap.put(((ServerConfig) obj).getId(), obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = storedServerOrder.iterator();
        while (it.hasNext()) {
            ServerConfig serverConfig = (ServerConfig) linkedHashMap.get((String) it.next());
            if (serverConfig != null) {
                arrayList.add(serverConfig);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : storedServers) {
            if (!storedServerOrder.contains(((ServerConfig) obj2).getId())) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.dh.myembyapp.data.preferences.ServerPreferences$getAllServers$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((ServerConfig) t2).getLastLoginTime()), Long.valueOf(((ServerConfig) t).getLastLoginTime()));
            }
        }));
    }

    public final ServerConfig getLastUsedServer() {
        String lastUsedServerId = getLastUsedServerId();
        if (lastUsedServerId == null) {
            return null;
        }
        return getServerById(lastUsedServerId);
    }

    public final String getLastUsedServerId() {
        return this.prefs.getString(KEY_LAST_USED_SERVER, null);
    }

    public final ServerConfig getServerById(String id) {
        Object next;
        id.getClass();
        Iterator<T> it = getAllServers().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((ServerConfig) next).getId(), id)) {
                return (ServerConfig) next;
            }
        }
        next = null;
        return (ServerConfig) next;
    }

    public final void saveServer(ServerConfig config) {
        config.getClass();
        List mutableList = CollectionsKt.toMutableList((Collection) readStoredServers());
        Iterator it = mutableList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(((ServerConfig) it.next()).getId(), config.getId())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            mutableList.set(i, config);
        } else {
            mutableList.add(config);
        }
        this.prefs.edit().putString(KEY_SERVERS, this.gson.toJson(mutableList)).apply();
        if (this.prefs.contains(KEY_SERVER_ORDER)) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
            Iterator it2 = mutableList.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ServerConfig) it2.next()).getId());
            }
            persistServerOrder(buildStoredOrderWithAllServerIds(arrayList));
        }
    }

    public final void saveServerOrder(List<String> orderedServerIds) {
        orderedServerIds.getClass();
        List<ServerConfig> storedServers = readStoredServers();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(storedServers, 10));
        Iterator<T> it = storedServers.iterator();
        while (it.hasNext()) {
            arrayList.add(((ServerConfig) it.next()).getId());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        persistServerOrder(buildStoredOrderWithAllServerIds(orderedServerIds, arrayList));
    }

    public final void setLastUsedServerId(String serverId) {
        serverId.getClass();
        this.prefs.edit().putString(KEY_LAST_USED_SERVER, serverId).apply();
    }

    public final void updateServerLoginInfo(String serverId, String userId, String accessToken) {
        serverId.getClass();
        userId.getClass();
        accessToken.getClass();
        ServerConfig serverById = getServerById(serverId);
        if (serverById == null) {
            return;
        }
        serverById.setUserId(userId);
        serverById.setAccessToken(accessToken);
        serverById.setLastLoginTime(System.currentTimeMillis());
        serverById.setVerified(true);
        saveServer(serverById);
        setLastUsedServerId(serverId);
    }

    public final void updateServerPlaybackAccess(String serverId, long accessTime) {
        serverId.getClass();
        ServerConfig serverById = getServerById(serverId);
        if (serverById == null) {
            return;
        }
        saveServer(ServerConfig.copy$default(serverById, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, null, null, null, null, accessTime, 2097151, null));
    }

    private final List<String> buildStoredOrderWithAllServerIds(List<String> allServerIds) {
        List<String> storedServerOrder = readStoredServerOrder();
        if (storedServerOrder == null) {
            storedServerOrder = CollectionsKt.emptyList();
        }
        return buildStoredOrderWithAllServerIds(storedServerOrder, allServerIds);
    }
}
