package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kb2 {
    public final jb2 a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    public kb2(jb2 jb2Var, String str, int i, int i2, int i3, int i4, int i5, String str2, int i6) {
        i3 = (i6 & 16) != 0 ? 0 : i3;
        i4 = (i6 & 32) != 0 ? 0 : i4;
        i5 = (i6 & 64) != 0 ? 0 : i5;
        str.getClass();
        this.a = jb2Var;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb2)) {
            return false;
        }
        kb2 kb2Var = (kb2) obj;
        return this.a == kb2Var.a && Intrinsics.areEqual(this.b, kb2Var.b) && this.c == kb2Var.c && this.d == kb2Var.d && this.e == kb2Var.e && this.f == kb2Var.f && this.g == kb2Var.g && Intrinsics.areEqual(this.h, kb2Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((((((((((i02.i(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktWatchedSyncResult(direction=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", sourceCount=");
        c61.t(sb, this.c, ", syncedCount=", this.d, ", alreadySyncedCount=");
        c61.t(sb, this.e, ", notFoundCount=", this.f, ", failedCount=");
        sb.append(this.g);
        sb.append(", message=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
