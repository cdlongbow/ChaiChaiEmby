package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ap extends cp {
    public static final ap c = new ap("CharMatcher.any()", 0);
    public static final ap d = new ap("CharMatcher.ascii()", 1);
    public static final ap e = new ap("CharMatcher.javaIsoControl()", 2);
    public static final ap g = new ap("CharMatcher.none()", 3);
    public final String a;
    public final /* synthetic */ int b;

    public ap(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.gp
    public final boolean c(char c2) {
        switch (this.b) {
            case 0:
                return true;
            case 1:
                return c2 <= 127;
            case 2:
                return c2 <= 31 || (c2 >= 127 && c2 <= 159);
            default:
                return false;
        }
    }

    @Override // defpackage.cp, defpackage.gp
    public gp d() {
        switch (this.b) {
            case 0:
                return g;
            case 3:
                return c;
            default:
                return super.d();
        }
    }

}
