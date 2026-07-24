package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.dlna.DlnaConfig;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lse2;", "", "Ltf2;", "userPreferences", "Ltf2;", "j", "()Ltf2;", "Lbc;", "themeConfig", "Lbc;", CmcdData.STREAMING_FORMAT_HLS, "()Lbc;", "Lcom/dh/myembyapp/data/ProxyConfig;", "proxyConfig", "Lcom/dh/myembyapp/data/ProxyConfig;", "g", "()Lcom/dh/myembyapp/data/ProxyConfig;", "Lcom/dh/myembyapp/data/model/DanmakuConfig;", "danmakuConfig", "Lcom/dh/myembyapp/data/model/DanmakuConfig;", "b", "()Lcom/dh/myembyapp/data/model/DanmakuConfig;", "Lt91;", "onlineSubtitleConfig", "Lt91;", "f", "()Lt91;", "Lte2;", "bufferConfig", "Lte2;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Lte2;", "Lcom/dh/myembyapp/dlna/DlnaConfig;", "dlnaConfig", "Lcom/dh/myembyapp/dlna/DlnaConfig;", "c", "()Lcom/dh/myembyapp/dlna/DlnaConfig;", "Lxe2;", "episodeSort", "Lxe2;", "d", "()Lxe2;", "librarySort", "e", "Lsf2;", "traktConfig", "Lsf2;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "()Lsf2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final  class se2 {

    @SerializedName("bufferConfig")
    private final te2 bufferConfig;

    @SerializedName("danmakuConfig")
    private final DanmakuConfig danmakuConfig;

    @SerializedName("dlnaConfig")
    private final DlnaConfig dlnaConfig;

    @SerializedName("episodeSort")
    private final xe2 episodeSort;

    @SerializedName("librarySort")
    private final xe2 librarySort;

    @SerializedName("onlineSubtitleConfig")
    private final t91 onlineSubtitleConfig;

    @SerializedName("proxyConfig")
    private final ProxyConfig proxyConfig;

    @SerializedName("themeConfig")
    private final bc themeConfig;

    @SerializedName("traktConfig")
    private final sf2 traktConfig;

    @SerializedName("userPreferences")
    private final tf2 userPreferences;

    static {
        DanmakuConfig.Companion companion = DanmakuConfig.INSTANCE;
    }

    public se2(tf2 tf2Var, bc bcVar, ProxyConfig proxyConfig, DanmakuConfig danmakuConfig, t91 t91Var, te2 te2Var, DlnaConfig dlnaConfig, xe2 xe2Var, xe2 xe2Var2, sf2 sf2Var) {
        tf2Var.getClass();
        bcVar.getClass();
        proxyConfig.getClass();
        danmakuConfig.getClass();
        t91Var.getClass();
        te2Var.getClass();
        dlnaConfig.getClass();
        this.userPreferences = tf2Var;
        this.themeConfig = bcVar;
        this.proxyConfig = proxyConfig;
        this.danmakuConfig = danmakuConfig;
        this.onlineSubtitleConfig = t91Var;
        this.bufferConfig = te2Var;
        this.dlnaConfig = dlnaConfig;
        this.episodeSort = xe2Var;
        this.librarySort = xe2Var2;
        this.traktConfig = sf2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */

    /* JADX INFO: renamed from: b, reason: from getter */

    /* JADX INFO: renamed from: c, reason: from getter */

    /* JADX INFO: renamed from: d, reason: from getter */

    /* JADX INFO: renamed from: e, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se2)) {
            return false;
        }
        se2 se2Var = (se2) obj;
        return Intrinsics.areEqual(this.userPreferences, se2Var.userPreferences) && Intrinsics.areEqual(this.themeConfig, se2Var.themeConfig) && Intrinsics.areEqual(this.proxyConfig, se2Var.proxyConfig) && Intrinsics.areEqual(this.danmakuConfig, se2Var.danmakuConfig) && Intrinsics.areEqual(this.onlineSubtitleConfig, se2Var.onlineSubtitleConfig) && Intrinsics.areEqual(this.bufferConfig, se2Var.bufferConfig) && Intrinsics.areEqual(this.dlnaConfig, se2Var.dlnaConfig) && Intrinsics.areEqual(this.episodeSort, se2Var.episodeSort) && Intrinsics.areEqual(this.librarySort, se2Var.librarySort) && Intrinsics.areEqual(this.traktConfig, se2Var.traktConfig);
    }

    /* JADX INFO: renamed from: f, reason: from getter */

    /* JADX INFO: renamed from: g, reason: from getter */

    /* JADX INFO: renamed from: h, reason: from getter */

    public final int hashCode() {
        int iHashCode = (this.librarySort.hashCode() + ((this.episodeSort.hashCode() + ((this.dlnaConfig.hashCode() + ((this.bufferConfig.hashCode() + ((this.onlineSubtitleConfig.hashCode() + ((this.danmakuConfig.hashCode() + ((this.proxyConfig.hashCode() + ((this.themeConfig.hashCode() + (this.userPreferences.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        sf2 sf2Var = this.traktConfig;
        return iHashCode + (sf2Var == null ? 0 : sf2Var.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */

    /* JADX INFO: renamed from: j, reason: from getter */

    public final String toString() {
        return "WebDavAppSettingsSyncState(userPreferences=" + this.userPreferences + ", themeConfig=" + this.themeConfig + ", proxyConfig=" + this.proxyConfig + ", danmakuConfig=" + this.danmakuConfig + ", onlineSubtitleConfig=" + this.onlineSubtitleConfig + ", bufferConfig=" + this.bufferConfig + ", dlnaConfig=" + this.dlnaConfig + ", episodeSort=" + this.episodeSort + ", librarySort=" + this.librarySort + ", traktConfig=" + this.traktConfig + ")";
    }
}
