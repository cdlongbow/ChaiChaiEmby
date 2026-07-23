package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class l01 {
    public final long a;
    public final long b;

    public l01(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l01)) {
            return false;
        }
        l01 l01Var = (l01) obj;
        return this.a == l01Var.a && this.b == l01Var.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return c61.i(this.b, ")", i02.r(this.a, "LoadedDanmakuWindow(startMs=", ", endMs="));
    }
}
