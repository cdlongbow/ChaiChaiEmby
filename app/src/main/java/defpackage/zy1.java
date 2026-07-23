package defpackage;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;

import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zy1 {
    public static final List a(List list, String str, boolean z, boolean z2, Map map, String str2) {
        list.getClass();
        map.getClass();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new tn0("__server_list__", "返回服务器列表页", str2, false, false, ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), null, null, null, null, 2000));
        if (z) {
            listCreateListBuilder.add(new tn0("aggregate_search", "聚合视界", "", z2, false, null, null, Integer.valueOf(zr1.chaichai), null, null, 1712));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ServerConfig serverConfig = (ServerConfig) it.next();
            ServerConfig effectiveServerConfig = serverConfig.getEffectiveServerConfig();
            String strX = serverConfig.getActiveBackupRouteId() != null ? kb0.x(" · ", serverConfig.getCurrentRouteDisplayName()) : null;
            if (strX == null) {
                strX = "";
            }
            listCreateListBuilder.add(new tn0(serverConfig.getId(), serverConfig.getAlias(), mr.C(effectiveServerConfig.getDisplayAddress(), strX, serverConfig.isLoggedIn() ? "" : " · 需重新登录"), !z2 && Intrinsics.areEqual(serverConfig.getId(), str), false, null, serverConfig.getCustomIconPath(), null, (ServerPingState) map.get(serverConfig.getId()), ig2.E(serverConfig.getLastPlaybackAccessTime()), HttpStatus.SC_NOT_MODIFIED));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
