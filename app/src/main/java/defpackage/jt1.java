package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jt1 extends pt0 {
    public static final jt1 i;
    public final transient h91 e;
    public final transient int g;
    public transient ht1 h;

    static {
        h91 h91Var = new h91();
        h91Var.d(3);
        i = new jt1(h91Var);
    }

    public jt1(h91 h91Var) {
        this.e = h91Var;
        long j = 0;
        int i2 = 0;
        while (true) {
            int i3 = h91Var.c;
            if (i2 >= i3) {
                this.g = ku.L(j);
                return;
            } else {
                ig2.p(i2, i3);
                j += (long) h91Var.b[i2];
                i2++;
            }
        }
    }

    @Override // defpackage.ts0
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.pt0
    public final st0 h() {
        ht1 ht1Var = this.h;
        if (ht1Var != null) {
            return ht1Var;
        }
        ht1 ht1Var2 = new ht1(this);
        this.h = ht1Var2;
        return ht1Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection

    @Override // defpackage.pt0, defpackage.ts0
    public Object writeReplace() {
        return new it1(this);
    }
}
