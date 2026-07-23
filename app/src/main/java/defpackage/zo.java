package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zo extends gp {
    public final gp a;
    public final gp b;

    public zo(gp gpVar, gp gpVar2) {
        gpVar.getClass();
        this.a = gpVar;
        gpVar2.getClass();
        this.b = gpVar2;
    }

    @Override // defpackage.lp1
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override // defpackage.gp
    public final boolean c(char c) {
        return this.a.c(c) && this.b.c(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
