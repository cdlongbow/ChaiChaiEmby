package defpackage;

import com.dh.myembyapp.data.model.Library;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vy0 extends yy0 {
    public final String a;
    public final Library b;
    public final boolean c;

    public vy0(String str, Library library, boolean z) {
        this.a = str;
        this.b = library;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy0)) {
            return false;
        }
        vy0 vy0Var = (vy0) obj;
        return Intrinsics.areEqual(this.a, vy0Var.a) && Intrinsics.areEqual(this.b, vy0Var.b) && this.c == vy0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Library library = this.b;
        return ((iHashCode + (library == null ? 0 : library.hashCode())) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(message=");
        sb.append(this.a);
        sb.append(", libraryInfo=");
        sb.append(this.b);
        sb.append(", isDirectoryMode=");
        return i9.i(sb, this.c, ")");
    }
}
