package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vw {
    public final hq a;
    public final hq b;
    public final xw c;

    public vw(hq hqVar, hq hqVar2, xw xwVar) {
        this.a = hqVar;
        this.b = hqVar2;
        this.c = xwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw)) {
            return false;
        }
        vw vwVar = (vw) obj;
        return Intrinsics.areEqual(this.a, vwVar.a) && Intrinsics.areEqual(this.b, vwVar.b) && Intrinsics.areEqual(this.c, vwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DanmakuManualSearchLogger(debug=" + this.a + ", warn=" + this.b + ", error=" + this.c + ")";
    }
}
