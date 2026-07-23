package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class b91 implements xv0 {
    public static final b91 a = new b91();
    public static final a91 b = a91.a;

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        throw new uw1("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        ((Void) obj).getClass();
        throw new uw1("'kotlin.Nothing' cannot be serialized");
    }
}
