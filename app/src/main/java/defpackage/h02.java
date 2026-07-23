package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class h02 implements xv0 {
    public static final h02 a = new h02();
    public static final zp1 b = new zp1("kotlin.Short", yp1.l);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Short.valueOf(b20Var.decodeShort());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeShort(((Number) obj).shortValue());
    }
}
