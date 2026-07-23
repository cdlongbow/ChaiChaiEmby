package defpackage;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class dd2 implements xv0 {
    public static final dd2 a = new dd2();
    public static final xt0 b;

    static {
        ByteCompanionObject.INSTANCE.getClass();
        b = ku.b("kotlin.UByte", hn.a);
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return UByte.m8837boximpl(UByte.m8843constructorimpl(b20Var.decodeInline(b).decodeByte()));
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return b;
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        wf0Var.encodeInline(b).encodeByte(((UByte) obj).getData());
    }
}
