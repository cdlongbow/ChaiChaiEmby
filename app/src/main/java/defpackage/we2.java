package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.ServerConfig;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class we2 {

    @SerializedName("lastUsedServerId")
    private final String lastUsedServerId;

    @SerializedName("serverOrder")
    private final List<String> serverOrder;

    @SerializedName("servers")
    private final List<ServerConfig> servers;

    public we2(String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.servers = list;
        this.serverOrder = list2;
        this.lastUsedServerId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */

    /* JADX INFO: renamed from: b, reason: from getter */

    /* JADX INFO: renamed from: c, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2)) {
            return false;
        }
        we2 we2Var = (we2) obj;
        return Intrinsics.areEqual(this.servers, we2Var.servers) && Intrinsics.areEqual(this.serverOrder, we2Var.serverOrder) && Intrinsics.areEqual(this.lastUsedServerId, we2Var.lastUsedServerId);
    }

    public final int hashCode() {
        int iF = qi0.f(this.serverOrder, this.servers.hashCode() * 31, 31);
        String str = this.lastUsedServerId;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        List<ServerConfig> list = this.servers;
        List<String> list2 = this.serverOrder;
        String str = this.lastUsedServerId;
        StringBuilder sb = new StringBuilder("WebDavServerSyncState(servers=");
        sb.append(list);
        sb.append(", serverOrder=");
        sb.append(list2);
        sb.append(", lastUsedServerId=");
        return s01.w(sb, str, ")");
    }

    public we2() {
        this(null, CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
