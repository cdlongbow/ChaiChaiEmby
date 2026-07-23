package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class n92 {
    public final int a;
    public final int b;

    public n92(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n92)) {
            return false;
        }
        n92 n92Var = (n92) obj;
        return this.a == n92Var.a && this.b == n92Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return c61.k("TraktEpisodeKey(season=", this.a, this.b, ", episode=", ")");
    }
}
