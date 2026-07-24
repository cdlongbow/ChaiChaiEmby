package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class xe2 {

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
