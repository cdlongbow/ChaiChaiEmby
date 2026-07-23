package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class lc0 implements xv0 {
    public static final lc0 a = new lc0();
    public static final zp1 b = new zp1("kotlin.Double", yp1.h);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Double.valueOf(b20Var.decodeDouble());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeDouble(((Number) obj).doubleValue());
    }
}
