package defpackage;

import androidx.datastore.preferences.core.Preferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lte2;", "", "", "memoryBufferMb", "I", "b", "()I", "bufferTimeSec", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class te2 {

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
