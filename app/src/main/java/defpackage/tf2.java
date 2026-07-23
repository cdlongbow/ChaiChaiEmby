package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u001a\u0010/\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u001a\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006¨\u00063"}, d2 = {"Ltf2;", "", "", "enableAggregateSearch", "Z", "b", "()Z", "enableAggregateSearchInServerSearch", "c", "Lcom/dh/myembyapp/data/model/SystemTimeDisplayMode;", "systemTimeDisplayMode", "Lcom/dh/myembyapp/data/model/SystemTimeDisplayMode;", "q", "()Lcom/dh/myembyapp/data/model/SystemTimeDisplayMode;", "Lcom/dh/myembyapp/data/model/SystemNetworkSpeedDisplayMode;", "systemNetworkSpeedDisplayMode", "Lcom/dh/myembyapp/data/model/SystemNetworkSpeedDisplayMode;", "o", "()Lcom/dh/myembyapp/data/model/SystemNetworkSpeedDisplayMode;", "Lcom/dh/myembyapp/data/model/SystemNetworkSpeedPosition;", "systemNetworkSpeedPosition", "Lcom/dh/myembyapp/data/model/SystemNetworkSpeedPosition;", TtmlNode.TAG_P, "()Lcom/dh/myembyapp/data/model/SystemNetworkSpeedPosition;", "disableTopNavFocusRefresh", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "enableTransparentTopNavButtons", CmcdData.STREAM_TYPE_LIVE, "", "qrNetworkInterfaceName", "Ljava/lang/String;", CmcdData.OBJECT_TYPE_MANIFEST, "()Ljava/lang/String;", "serverIconLibraryUrl", "n", "enableClickableLibrarySectionTitle", "f", "enableLibraryRowMoreButton", "j", "enableHomeUnplayedOnly", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "enablePlaybackStartupPoster", "k", "enableAggregateSearchVersionTags", "d", "enableDetailAggregateVersionRail", "g", "enableHomeBackFocusServerButton", CmcdData.STREAMING_FORMAT_HLS, "enableAppUpdateCheckOnStartup", "e", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class tf2 {

    @SerializedName("disableTopNavFocusRefresh")
    private final boolean disableTopNavFocusRefresh;

    @SerializedName("enableAggregateSearch")
    private final boolean enableAggregateSearch;

    @SerializedName("enableAggregateSearchInServerSearch")
    private final boolean enableAggregateSearchInServerSearch;

    @SerializedName("enableAggregateSearchVersionTags")
    private final boolean enableAggregateSearchVersionTags;

    @SerializedName("enableAppUpdateCheckOnStartup")
    private final boolean enableAppUpdateCheckOnStartup;

    @SerializedName("enableClickableLibrarySectionTitle")
    private final boolean enableClickableLibrarySectionTitle;

    @SerializedName("enableDetailAggregateVersionRail")
    private final boolean enableDetailAggregateVersionRail;

    @SerializedName("enableHomeBackFocusServerButton")
    private final boolean enableHomeBackFocusServerButton;

    @SerializedName("enableHomeUnplayedOnly")
    private final boolean enableHomeUnplayedOnly;

    @SerializedName("enableLibraryRowMoreButton")
    private final boolean enableLibraryRowMoreButton;

    @SerializedName("enablePlaybackStartupPoster")
    private final boolean enablePlaybackStartupPoster;

    @SerializedName("enableTransparentTopNavButtons")
    private final boolean enableTransparentTopNavButtons;

    @SerializedName("qrNetworkInterfaceName")
    private final String qrNetworkInterfaceName;

    @SerializedName("serverIconLibraryUrl")
    private final String serverIconLibraryUrl;

    @SerializedName("systemNetworkSpeedDisplayMode")
    private final SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode;

    @SerializedName("systemNetworkSpeedPosition")
    private final SystemNetworkSpeedPosition systemNetworkSpeedPosition;

    @SerializedName("systemTimeDisplayMode")
    private final SystemTimeDisplayMode systemTimeDisplayMode;

    public tf2(boolean z, boolean z2, SystemTimeDisplayMode systemTimeDisplayMode, SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode, SystemNetworkSpeedPosition systemNetworkSpeedPosition, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        systemTimeDisplayMode.getClass();
        systemNetworkSpeedDisplayMode.getClass();
        systemNetworkSpeedPosition.getClass();
        this.enableAggregateSearch = z;
        this.enableAggregateSearchInServerSearch = z2;
        this.systemTimeDisplayMode = systemTimeDisplayMode;
        this.systemNetworkSpeedDisplayMode = systemNetworkSpeedDisplayMode;
        this.systemNetworkSpeedPosition = systemNetworkSpeedPosition;
        this.disableTopNavFocusRefresh = z3;
        this.enableTransparentTopNavButtons = z4;
        this.qrNetworkInterfaceName = str;
        this.serverIconLibraryUrl = str2;
        this.enableClickableLibrarySectionTitle = z5;
        this.enableLibraryRowMoreButton = z6;
        this.enableHomeUnplayedOnly = z7;
        this.enablePlaybackStartupPoster = z8;
        this.enableAggregateSearchVersionTags = z9;
        this.enableDetailAggregateVersionRail = z10;
        this.enableHomeBackFocusServerButton = z11;
        this.enableAppUpdateCheckOnStartup = z12;
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
        if (!(obj instanceof tf2)) {
            return false;
        }
        tf2 tf2Var = (tf2) obj;
        return this.enableAggregateSearch == tf2Var.enableAggregateSearch && this.enableAggregateSearchInServerSearch == tf2Var.enableAggregateSearchInServerSearch && this.systemTimeDisplayMode == tf2Var.systemTimeDisplayMode && this.systemNetworkSpeedDisplayMode == tf2Var.systemNetworkSpeedDisplayMode && this.systemNetworkSpeedPosition == tf2Var.systemNetworkSpeedPosition && this.disableTopNavFocusRefresh == tf2Var.disableTopNavFocusRefresh && this.enableTransparentTopNavButtons == tf2Var.enableTransparentTopNavButtons && Intrinsics.areEqual(this.qrNetworkInterfaceName, tf2Var.qrNetworkInterfaceName) && Intrinsics.areEqual(this.serverIconLibraryUrl, tf2Var.serverIconLibraryUrl) && this.enableClickableLibrarySectionTitle == tf2Var.enableClickableLibrarySectionTitle && this.enableLibraryRowMoreButton == tf2Var.enableLibraryRowMoreButton && this.enableHomeUnplayedOnly == tf2Var.enableHomeUnplayedOnly && this.enablePlaybackStartupPoster == tf2Var.enablePlaybackStartupPoster && this.enableAggregateSearchVersionTags == tf2Var.enableAggregateSearchVersionTags && this.enableDetailAggregateVersionRail == tf2Var.enableDetailAggregateVersionRail && this.enableHomeBackFocusServerButton == tf2Var.enableHomeBackFocusServerButton && this.enableAppUpdateCheckOnStartup == tf2Var.enableAppUpdateCheckOnStartup;
    }

    /* JADX INFO: renamed from: f, reason: from getter */

    /* JADX INFO: renamed from: g, reason: from getter */

    /* JADX INFO: renamed from: h, reason: from getter */

    public final int hashCode() {
        int iHashCode = (((((this.systemNetworkSpeedPosition.hashCode() + ((this.systemNetworkSpeedDisplayMode.hashCode() + ((this.systemTimeDisplayMode.hashCode() + ((((this.enableAggregateSearch ? 1231 : 1237) * 31) + (this.enableAggregateSearchInServerSearch ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31) + (this.disableTopNavFocusRefresh ? 1231 : 1237)) * 31) + (this.enableTransparentTopNavButtons ? 1231 : 1237)) * 31;
        String str = this.qrNetworkInterfaceName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.serverIconLibraryUrl;
        return ((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.enableClickableLibrarySectionTitle ? 1231 : 1237)) * 31) + (this.enableLibraryRowMoreButton ? 1231 : 1237)) * 31) + (this.enableHomeUnplayedOnly ? 1231 : 1237)) * 31) + (this.enablePlaybackStartupPoster ? 1231 : 1237)) * 31) + (this.enableAggregateSearchVersionTags ? 1231 : 1237)) * 31) + (this.enableDetailAggregateVersionRail ? 1231 : 1237)) * 31) + (this.enableHomeBackFocusServerButton ? 1231 : 1237)) * 31) + (this.enableAppUpdateCheckOnStartup ? 1231 : 1237);
    }

    /* JADX INFO: renamed from: i, reason: from getter */

    /* JADX INFO: renamed from: j, reason: from getter */

    /* JADX INFO: renamed from: k, reason: from getter */

    /* JADX INFO: renamed from: l, reason: from getter */

    /* JADX INFO: renamed from: m, reason: from getter */

    /* JADX INFO: renamed from: n, reason: from getter */

    /* JADX INFO: renamed from: o, reason: from getter */

    /* JADX INFO: renamed from: p, reason: from getter */

    /* JADX INFO: renamed from: q, reason: from getter */

    public final String toString() {
        boolean z = this.enableAggregateSearch;
        boolean z2 = this.enableAggregateSearchInServerSearch;
        SystemTimeDisplayMode systemTimeDisplayMode = this.systemTimeDisplayMode;
        SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode = this.systemNetworkSpeedDisplayMode;
        SystemNetworkSpeedPosition systemNetworkSpeedPosition = this.systemNetworkSpeedPosition;
        boolean z3 = this.disableTopNavFocusRefresh;
        boolean z4 = this.enableTransparentTopNavButtons;
        String str = this.qrNetworkInterfaceName;
        String str2 = this.serverIconLibraryUrl;
        boolean z5 = this.enableClickableLibrarySectionTitle;
        boolean z6 = this.enableLibraryRowMoreButton;
        boolean z7 = this.enableHomeUnplayedOnly;
        boolean z8 = this.enablePlaybackStartupPoster;
        boolean z9 = this.enableAggregateSearchVersionTags;
        boolean z10 = this.enableDetailAggregateVersionRail;
        boolean z11 = this.enableHomeBackFocusServerButton;
        boolean z12 = this.enableAppUpdateCheckOnStartup;
        StringBuilder sb = new StringBuilder("WebDavUserPreferenceSyncState(enableAggregateSearch=");
        sb.append(z);
        sb.append(", enableAggregateSearchInServerSearch=");
        sb.append(z2);
        sb.append(", systemTimeDisplayMode=");
        sb.append(systemTimeDisplayMode);
        sb.append(", systemNetworkSpeedDisplayMode=");
        sb.append(systemNetworkSpeedDisplayMode);
        sb.append(", systemNetworkSpeedPosition=");
        sb.append(systemNetworkSpeedPosition);
        sb.append(", disableTopNavFocusRefresh=");
        sb.append(z3);
        sb.append(", enableTransparentTopNavButtons=");
        sb.append(z4);
        sb.append(", qrNetworkInterfaceName=");
        sb.append(str);
        sb.append(", serverIconLibraryUrl=");
        sb.append(str2);
        sb.append(", enableClickableLibrarySectionTitle=");
        sb.append(z5);
        sb.append(", enableLibraryRowMoreButton=");
        i9.r(sb, z6, ", enableHomeUnplayedOnly=", z7, ", enablePlaybackStartupPoster=");
        i9.r(sb, z8, ", enableAggregateSearchVersionTags=", z9, ", enableDetailAggregateVersionRail=");
        i9.r(sb, z10, ", enableHomeBackFocusServerButton=", z11, ", enableAppUpdateCheckOnStartup=");
        return i9.i(sb, z12, ")");
    }

    public tf2() {
        this(false, false, SystemTimeDisplayMode.MENU_ONLY, SystemNetworkSpeedDisplayMode.MENU_ONLY, SystemNetworkSpeedPosition.TOP_RIGHT, true, true, null, null, false, false, false, true, false, false, false, false);
    }
}
