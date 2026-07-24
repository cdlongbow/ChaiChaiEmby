package defpackage;

import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class rf2 {

    @SerializedName("appSettingsState")
    private final se2 appSettingsState;

    @SerializedName("appVersionName")
    private final String appVersionName;

    @SerializedName("deviceModel")
    private final String deviceModel;

    @SerializedName("exportedAtMs")
    private final long exportedAtMs;

    @SerializedName("schemaVersion")
    private final int schemaVersion;

    @SerializedName("serverState")
    private final we2 serverState;

    public rf2(we2 we2Var, se2 se2Var, int i) {
        String string = StringsKt.trim((CharSequence) (Build.MANUFACTURER + " " + Build.MODEL)).toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        we2Var = (i & 16) != 0 ? null : we2Var;
        se2Var = (i & 32) != 0 ? null : se2Var;
        string.getClass();
        this.schemaVersion = 1;
        this.appVersionName = "0.3.0";
        this.deviceModel = string;
        this.exportedAtMs = jCurrentTimeMillis;
        this.serverState = we2Var;
        this.appSettingsState = se2Var;
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
        if (!(obj instanceof rf2)) {
            return false;
        }
        rf2 rf2Var = (rf2) obj;
        return this.schemaVersion == rf2Var.schemaVersion && Intrinsics.areEqual(this.appVersionName, rf2Var.appVersionName) && Intrinsics.areEqual(this.deviceModel, rf2Var.deviceModel) && this.exportedAtMs == rf2Var.exportedAtMs && Intrinsics.areEqual(this.serverState, rf2Var.serverState) && Intrinsics.areEqual(this.appSettingsState, rf2Var.appSettingsState);
    }

    public final int hashCode() {
        int i = i02.i(i02.i(this.schemaVersion * 31, 31, this.appVersionName), 31, this.deviceModel);
        long j = this.exportedAtMs;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        we2 we2Var = this.serverState;
        int iHashCode = (i2 + (we2Var == null ? 0 : we2Var.hashCode())) * 31;
        se2 se2Var = this.appSettingsState;
        return iHashCode + (se2Var != null ? se2Var.hashCode() : 0);
    }

    public final String toString() {
        return "WebDavSyncSnapshot(schemaVersion=" + this.schemaVersion + ", appVersionName=" + this.appVersionName + ", deviceModel=" + this.deviceModel + ", exportedAtMs=" + this.exportedAtMs + ", serverState=" + this.serverState + ", appSettingsState=" + this.appSettingsState + ")";
    }

    public rf2() {
        this(null, null, 63);
    }
}
