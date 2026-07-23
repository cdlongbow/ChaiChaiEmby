package defpackage;

import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes5.dex */
public final class de2 implements xv0 {
    public static final de2 a = new de2();
    public static final zp1 b = new zp1("kotlin.uuid.Uuid", yp1.m);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Uuid.INSTANCE.parse(b20Var.decodeString());
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        Uuid uuid = (Uuid) obj;
        uuid.getClass();
        wf0Var.encodeString(uuid.toString());
    }
}
