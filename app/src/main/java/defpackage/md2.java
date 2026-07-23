package defpackage;

import kotlin.UShort;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class md2 implements xv0 {
    public static final md2 a = new md2();
    public static final xt0 b;

    static {
        ShortCompanionObject.INSTANCE.getClass();
        b = ku.b("kotlin.UShort", h02.a);
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return UShort.m9100boximpl(UShort.m9106constructorimpl(b20Var.decodeInline(b).decodeShort()));
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeInline(b).encodeShort(((UShort) obj).getData());
    }
}
