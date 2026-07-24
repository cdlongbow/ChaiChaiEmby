package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public final  class sf2 {

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("minimumProgressDifferenceSeconds")
    private final int minimumProgressDifferenceSeconds;

    @SerializedName("promptCloudProgress")
    private final boolean promptCloudProgress;

    @SerializedName("syncLocalProgressToTrakt")
    private final boolean syncLocalProgressToTrakt;

    public sf2(boolean z, boolean z2, boolean z3, int i) {
        this.enabled = z;
        this.promptCloudProgress = z2;
        this.syncLocalProgressToTrakt = z3;
        this.minimumProgressDifferenceSeconds = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */

    /* JADX INFO: renamed from: b, reason: from getter */

    /* JADX INFO: renamed from: c, reason: from getter */

    /* JADX INFO: renamed from: d, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf2)) {
            return false;
        }
        sf2 sf2Var = (sf2) obj;
        return this.enabled == sf2Var.enabled && this.promptCloudProgress == sf2Var.promptCloudProgress && this.syncLocalProgressToTrakt == sf2Var.syncLocalProgressToTrakt && this.minimumProgressDifferenceSeconds == sf2Var.minimumProgressDifferenceSeconds;
    }

    public final int hashCode() {
        return ((((((this.enabled ? 1231 : 1237) * 31) + (this.promptCloudProgress ? 1231 : 1237)) * 31) + (this.syncLocalProgressToTrakt ? 1231 : 1237)) * 31) + this.minimumProgressDifferenceSeconds;
    }

    public final String toString() {
        return "WebDavTraktSyncState(enabled=" + this.enabled + ", promptCloudProgress=" + this.promptCloudProgress + ", syncLocalProgressToTrakt=" + this.syncLocalProgressToTrakt + ", minimumProgressDifferenceSeconds=" + this.minimumProgressDifferenceSeconds + ")";
    }

    public sf2() {
        this(false, true, false, 60);
    }
}
