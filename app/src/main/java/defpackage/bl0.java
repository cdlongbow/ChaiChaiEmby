package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bl0 extends z {
    public final /* synthetic */ int c = 1;
    public final Iterable d;

    public bl0(int i, at0 at0Var) {
        super(at0Var.size(), i);
        this.d = at0Var;
    }

    @Override // defpackage.z
    public final Object a(int i) {
        int i2 = this.c;
        Iterable iterable = this.d;
        switch (i2) {
            case 0:
                return ((cl0) iterable).a[i].iterator();
            default:
                return ((at0) iterable).get(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl0(cl0 cl0Var, int i) {
        super(i, 0);
        this.d = cl0Var;
    }
}
