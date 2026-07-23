package defpackage;

import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lrx0;", "", "Lcom/dh/myembyapp/data/model/Library;", "library", "Lcom/dh/myembyapp/data/model/Library;", "d", "()Lcom/dh/myembyapp/data/model/Library;", "", "Lcom/dh/myembyapp/data/model/MediaItem;", "items", "Ljava/util/List;", "c", "()Ljava/util/List;", "", "totalCount", "I", "e", "()I", "", "hasMore", "Z", "b", "()Z", "isLoadingMore", "f", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class rx0 {

    @SerializedName("hasMore")
    private final boolean hasMore;

    @SerializedName("isLoadingMore")
    private final boolean isLoadingMore;

    @SerializedName("items")
    private final List<MediaItem> items;

    @SerializedName("library")
    private final Library library;

    @SerializedName("totalCount")
    private final int totalCount;

    public rx0(Library library, List list, int i, boolean z, boolean z2) {
        library.getClass();
        list.getClass();
        this.library = library;
        this.items = list;
        this.totalCount = i;
        this.hasMore = z;
        this.isLoadingMore = z2;
    }

    public static rx0 a(rx0 rx0Var, Library library, List list, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            library = rx0Var.library;
        }
        Library library2 = library;
        if ((i2 & 2) != 0) {
            list = rx0Var.items;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            i = rx0Var.totalCount;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = rx0Var.hasMore;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = rx0Var.isLoadingMore;
        }
        rx0Var.getClass();
        library2.getClass();
        list2.getClass();
        return new rx0(library2, list2, i3, z3, z2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */

    /* JADX INFO: renamed from: c, reason: from getter */

    /* JADX INFO: renamed from: d, reason: from getter */

    /* JADX INFO: renamed from: e, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0)) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        return Intrinsics.areEqual(this.library, rx0Var.library) && Intrinsics.areEqual(this.items, rx0Var.items) && this.totalCount == rx0Var.totalCount && this.hasMore == rx0Var.hasMore && this.isLoadingMore == rx0Var.isLoadingMore;
    }

    /* JADX INFO: renamed from: f, reason: from getter */

    public final int hashCode() {
        return ((((qi0.f(this.items, this.library.hashCode() * 31, 31) + this.totalCount) * 31) + (this.hasMore ? 1231 : 1237)) * 31) + (this.isLoadingMore ? 1231 : 1237);
    }

    public final String toString() {
        Library library = this.library;
        List<MediaItem> list = this.items;
        int i = this.totalCount;
        boolean z = this.hasMore;
        boolean z2 = this.isLoadingMore;
        StringBuilder sb = new StringBuilder("LibraryContent(library=");
        sb.append(library);
        sb.append(", items=");
        sb.append(list);
        sb.append(", totalCount=");
        sb.append(i);
        sb.append(", hasMore=");
        sb.append(z);
        sb.append(", isLoadingMore=");
        return i9.i(sb, z2, ")");
    }
}
