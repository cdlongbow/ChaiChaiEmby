package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class dq0 {

    @SerializedName("hidePlayed")
    private final boolean hidePlayed;

    @SerializedName("libraries")
    private final List<Library> libraries;

    @SerializedName("libraryContents")
    private final List<rx0> libraryContents;

    @SerializedName("resumeItems")
    private final List<MediaItem> resumeItems;

    @SerializedName("savedAtMillis")
    private final long savedAtMillis;

    @SerializedName("schemaVersion")
    private final int schemaVersion;

    @SerializedName("serverId")
    private final String serverId;

    @SerializedName("userId")
    private final String userId;

    public dq0(String str, String str2, boolean z, long j, List list, List list2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.schemaVersion = 1;
        this.serverId = str;
        this.userId = str2;
        this.hidePlayed = z;
        this.savedAtMillis = j;
        this.libraries = list;
        this.resumeItems = list2;
        this.libraryContents = arrayList;
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
        if (!(obj instanceof dq0)) {
            return false;
        }
        dq0 dq0Var = (dq0) obj;
        return this.schemaVersion == dq0Var.schemaVersion && Intrinsics.areEqual(this.serverId, dq0Var.serverId) && Intrinsics.areEqual(this.userId, dq0Var.userId) && this.hidePlayed == dq0Var.hidePlayed && this.savedAtMillis == dq0Var.savedAtMillis && Intrinsics.areEqual(this.libraries, dq0Var.libraries) && Intrinsics.areEqual(this.resumeItems, dq0Var.resumeItems) && Intrinsics.areEqual(this.libraryContents, dq0Var.libraryContents);
    }

    /* JADX INFO: renamed from: f, reason: from getter */

    /* JADX INFO: renamed from: g, reason: from getter */

    /* JADX INFO: renamed from: h, reason: from getter */

    public final int hashCode() {
        int i = (i02.i(i02.i(this.schemaVersion * 31, 31, this.serverId), 31, this.userId) + (this.hidePlayed ? 1231 : 1237)) * 31;
        long j = this.savedAtMillis;
        return this.libraryContents.hashCode() + qi0.f(this.resumeItems, qi0.f(this.libraries, (i + ((int) (j ^ (j >>> 32)))) * 31, 31), 31);
    }

    public final String toString() {
        return "HomeSnapshot(schemaVersion=" + this.schemaVersion + ", serverId=" + this.serverId + ", userId=" + this.userId + ", hidePlayed=" + this.hidePlayed + ", savedAtMillis=" + this.savedAtMillis + ", libraries=" + this.libraries + ", resumeItems=" + this.resumeItems + ", libraryContents=" + this.libraryContents + ")";
    }
}
