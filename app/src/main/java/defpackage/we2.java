package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.ServerConfig;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwe2;", "", "", "Lcom/dh/myembyapp/data/model/ServerConfig;", "servers", "Ljava/util/List;", "c", "()Ljava/util/List;", "", "serverOrder", "b", "lastUsedServerId", "Ljava/lang/String;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class we2 {

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
