package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class nk0 implements xv0 {
    public static final nk0 a = new nk0();
    public static final zp1 b = new zp1("kotlin.Float", yp1.i);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Float.valueOf(b20Var.decodeFloat());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeFloat(((Number) obj).floatValue());
    }
}
