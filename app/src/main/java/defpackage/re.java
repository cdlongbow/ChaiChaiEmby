package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class re {
    public final qe a;
    public final ArrayList b;
    public final String c;

    public re(qe qeVar, ArrayList arrayList, String str) {
        qeVar.getClass();
        str.getClass();
        this.a = qeVar;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return Intrinsics.areEqual(this.a, reVar.a) && Intrinsics.areEqual(this.b, reVar.b) && Intrinsics.areEqual(this.c, reVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleDetail(item=");
        sb.append(this.a);
        sb.append(", fileOptions=");
        sb.append(this.b);
        sb.append(", fallbackDownloadUrl=");
        return s01.w(sb, this.c, ")");
    }
}
