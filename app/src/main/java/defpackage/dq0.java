package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Ldq0;", "", "", "schemaVersion", "I", "f", "()I", "", "serverId", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "userId", CmcdData.STREAMING_FORMAT_HLS, "", "hidePlayed", "Z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Z", "", "savedAtMillis", "J", "e", "()J", "", "Lcom/dh/myembyapp/data/model/Library;", "libraries", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/dh/myembyapp/data/model/MediaItem;", "resumeItems", "d", "Lrx0;", "libraryContents", "c", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class dq0 {

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
