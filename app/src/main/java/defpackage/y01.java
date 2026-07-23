package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class y01 implements xv0 {
    public static final y01 a = new y01();
    public static final zp1 b = new zp1("kotlin.Long", yp1.k);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Long.valueOf(b20Var.decodeLong());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeLong(((Number) obj).longValue());
    }
}
