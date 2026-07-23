package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ep extends cp {
    public final char a;
    public final char b;

    public ep(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.gp
    public final boolean c(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + gp.a(this.a) + gp.a(this.b) + "\")";
    }
}
