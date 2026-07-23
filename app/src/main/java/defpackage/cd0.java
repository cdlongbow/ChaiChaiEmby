package defpackage;

import kotlin.time.Duration;

/* JADX INFO: loaded from: classes5.dex */
public final class cd0 implements xv0 {
    public static final cd0 a = new cd0();
    public static final zp1 b = new zp1("kotlin.time.Duration", yp1.m);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return Duration.m10153boximpl(Duration.INSTANCE.m10252parseIsoStringUwyO8pc(b20Var.decodeString()));
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeString(Duration.m10193toIsoStringimpl(((Duration) obj).getRawValue()));
    }
}
