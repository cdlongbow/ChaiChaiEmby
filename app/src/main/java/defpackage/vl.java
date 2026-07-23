package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class vl implements xv0 {
    public static final vl a = new vl();
    public static final zp1 b = new zp1("kotlin.Boolean", yp1.e);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Boolean.valueOf(b20Var.decodeBoolean());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeBoolean(((Boolean) obj).booleanValue());
    }
}
