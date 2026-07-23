package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ch {
    public final int a;
    public final List b;

    public ch(int i, List list) {
        list.getClass();
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return this.a == chVar.a && Intrinsics.areEqual(this.b, chVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "BackupRouteImportDialogState(totalCount=" + this.a + ", routesToImport=" + this.b + ")";
    }
}
