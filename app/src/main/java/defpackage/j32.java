package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class j32 implements xv0 {
    public static final j32 a = new j32();
    public static final zp1 b = new zp1("kotlin.String", yp1.m);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return b20Var.decodeString();
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        String str = (String) obj;
        str.getClass();
        wf0Var.encodeString(str);
    }
}
