package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class fu0 implements xv0 {
    public static final fu0 a = new fu0();
    public static final zp1 b = new zp1("kotlin.Int", yp1.j);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Integer.valueOf(b20Var.decodeInt());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeInt(((Number) obj).intValue());
    }
}
