package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hn implements xv0 {
    public static final hn a = new hn();
    public static final zp1 b = new zp1("kotlin.Byte", yp1.f);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Byte.valueOf(b20Var.decodeByte());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeByte(((Number) obj).byteValue());
    }
}
