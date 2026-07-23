package defpackage;

import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class gd2 implements xv0 {
    public static final gd2 a = new gd2();
    public static final xt0 b;

    static {
        IntCompanionObject.INSTANCE.getClass();
        b = ku.b("kotlin.UInt", fu0.a);
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return UInt.m8914boximpl(UInt.m8920constructorimpl(b20Var.decodeInline(b).decodeInt()));
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeInline(b).encodeInt(((UInt) obj).getData());
    }
}
