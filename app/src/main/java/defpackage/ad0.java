package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ad0 extends i21 {
    public final /* synthetic */ i21 c;

    public ad0(i21 i21Var) {
        this.c = i21Var;
    }

    @Override // defpackage.i21
    public final Object a(z11 z11Var) {
        Float f = (Float) this.c.b;
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
