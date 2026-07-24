package defpackage;

import androidx.datastore.preferences.core.Preferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public final  class te2 {

    @SerializedName("bufferTimeSec")
    private final int bufferTimeSec;

    @SerializedName("memoryBufferMb")
    private final int memoryBufferMb;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public te2() {
        this(tl0.z(), 120);
        Preferences.Key key = rm.d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */

    /* JADX INFO: renamed from: b, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te2)) {
            return false;
        }
        te2 te2Var = (te2) obj;
        return this.memoryBufferMb == te2Var.memoryBufferMb && this.bufferTimeSec == te2Var.bufferTimeSec;
    }

    public final int hashCode() {
        return (this.memoryBufferMb * 31) + this.bufferTimeSec;
    }

    public final String toString() {
        return c61.k("WebDavBufferSyncState(memoryBufferMb=", this.memoryBufferMb, this.bufferTimeSec, ", bufferTimeSec=", ")");
    }

    public te2(int i, int i2) {
        this.memoryBufferMb = i;
        this.bufferTimeSec = i2;
    }
}
