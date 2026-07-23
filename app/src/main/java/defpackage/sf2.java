package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lsf2;", "", "", "enabled", "Z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Z", "promptCloudProgress", "c", "syncLocalProgressToTrakt", "d", "", "minimumProgressDifferenceSeconds", "I", "b", "()I", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class sf2 {

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
