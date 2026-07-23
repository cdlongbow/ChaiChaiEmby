package defpackage;

import kotlin.ULong;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jd2 implements xv0 {
    public static final jd2 a = new jd2();
    public static final xt0 b;

    static {
        LongCompanionObject.INSTANCE.getClass();
        b = ku.b("kotlin.ULong", y01.a);
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return ULong.m8993boximpl(ULong.m8999constructorimpl(b20Var.decodeInline(b).decodeLong()));
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeInline(b).encodeLong(((ULong) obj).getData());
    }
}
