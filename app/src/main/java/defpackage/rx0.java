package defpackage;

import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final  class rx0 {

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
