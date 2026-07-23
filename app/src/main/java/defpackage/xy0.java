package defpackage;

import com.dh.myembyapp.data.model.Library;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xy0 extends yy0 {
    public final List a;
    public final Library b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public xy0(List list, Library library, boolean z, int i, boolean z2, boolean z3) {
        list.getClass();
        this.a = list;
        this.b = library;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy0)) {
            return false;
        }
        xy0 xy0Var = (xy0) obj;
        return Intrinsics.areEqual(this.a, xy0Var.a) && Intrinsics.areEqual(this.b, xy0Var.b) && this.c == xy0Var.c && this.d == xy0Var.d && this.e == xy0Var.e && this.f == xy0Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Library library = this.b;
        return ((((((((iHashCode + (library == null ? 0 : library.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "Success(items=" + this.a + ", libraryInfo=" + this.b + ", isDirectoryMode=" + this.c + ", totalCount=" + this.d + ", hasMore=" + this.e + ", isLoadingMore=" + this.f + ")";
    }
}
