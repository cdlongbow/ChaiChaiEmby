package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ic {
    public final String a;
    public final Long b;
    public final String c;

    public ic(String str, Long l, String str2) {
        this.a = str;
        this.b = l;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return Intrinsics.areEqual(this.a, icVar.a) && Intrinsics.areEqual(this.b, icVar.b) && Intrinsics.areEqual(this.c, icVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReleaseAssetResponse(name=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", browserDownloadUrl=");
        return s01.w(sb, this.c, ")");
    }
}
