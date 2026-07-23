package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hp implements xv0 {
    public static final hp a = new hp();
    public static final zp1 b = new zp1("kotlin.Char", yp1.g);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Character.valueOf(b20Var.decodeChar());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeChar(((Character) obj).charValue());
    }
}
