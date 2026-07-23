package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxe2;", "", "", "sortOption", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "sortDescending", "Z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Z", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class xe2 {

    @SerializedName("sortDescending")
    private final boolean sortDescending;

    @SerializedName("sortOption")
    private final String sortOption;

    public xe2(String str, boolean z) {
        this.sortOption = str;
        this.sortDescending = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */

    /* JADX INFO: renamed from: b, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe2)) {
            return false;
        }
        xe2 xe2Var = (xe2) obj;
        return Intrinsics.areEqual(this.sortOption, xe2Var.sortOption) && this.sortDescending == xe2Var.sortDescending;
    }

    public final int hashCode() {
        return (this.sortOption.hashCode() * 31) + (this.sortDescending ? 1231 : 1237);
    }

    public final String toString() {
        return "WebDavSortSyncState(sortOption=" + this.sortOption + ", sortDescending=" + this.sortDescending + ")";
    }
}
