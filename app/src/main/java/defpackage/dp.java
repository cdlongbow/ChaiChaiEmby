package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dp extends cp {
    public final /* synthetic */ int a;
    public final char b;

    public /* synthetic */ dp(char c, int i) {
        this.a = i;
        this.b = c;
    }

    @Override // defpackage.gp
    public final boolean c(char c) {
        switch (this.a) {
            case 0:
                return c == this.b;
            default:
                return c != this.b;
        }
    }

    @Override // defpackage.cp, defpackage.gp
    public final gp d() {
        switch (this.a) {
            case 0:
                return new dp(this.b, 1);
            default:
                return new dp(this.b, 0);
        }
    }

    public final String toString() {
        int i = this.a;
        char c = this.b;
        switch (i) {
            case 0:
                return "CharMatcher.is('" + gp.a(c) + "')";
            default:
                return "CharMatcher.isNot('" + gp.a(c) + "')";
        }
    }
}
