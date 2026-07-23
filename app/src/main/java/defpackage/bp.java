package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class bp extends gp {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public bp(String str) {
        char[] charArray = str.toString().toCharArray();
        this.b = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.lp1
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                break;
        }
        return c(((Character) obj).charValue());
    }

    @Override // defpackage.gp
    public final boolean c(char c) {
        switch (this.a) {
            case 0:
                return Arrays.binarySearch((char[]) this.b, c) >= 0;
            default:
                return !((gp) this.b).c(c);
        }
    }

    @Override // defpackage.gp
    public gp d() {
        switch (this.a) {
            case 1:
                return (gp) this.b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(gp.a(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((gp) obj) + ".negate()";
        }
    }

    public bp(gp gpVar) {
        gpVar.getClass();
        this.b = gpVar;
    }
}
