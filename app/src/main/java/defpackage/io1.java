package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class io1 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;

    public io1(String str, String str2, long j, String str3, String str4, Long l) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io1)) {
            return false;
        }
        io1 io1Var = (io1) obj;
        return Intrinsics.areEqual(this.a, io1Var.a) && this.b == io1Var.b && Intrinsics.areEqual(this.c, io1Var.c) && Intrinsics.areEqual(this.d, io1Var.d) && Intrinsics.areEqual(this.e, io1Var.e) && Intrinsics.areEqual(this.f, io1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = i02.i(i02.i((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        return this.f.hashCode() + ((i + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmbyPlaybackSessionSnapshot(itemId=");
        sb.append(this.a);
        sb.append(", positionTicks=");
        sb.append(this.b);
        i02.v(sb, ", playSessionId=", this.c, ", mediaSourceId=", this.d);
        sb.append(", runTimeTicks=");
        sb.append(this.e);
        sb.append(", playMethod=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
