package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f91 implements xv0 {
    public final xv0 a;
    public final mw1 b;

    public f91(xv0 xv0Var) {
        this.a = xv0Var;
        this.b = new mw1(xv0Var.getDescriptor());
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return b20Var.decodeNotNullMark() ? b20Var.decodeSerializableValue(this.a) : b20Var.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f91.class == obj.getClass() && Intrinsics.areEqual(this.a, ((f91) obj).a);
    }

    @Override // defpackage.vw1, defpackage.l40

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        if (obj == null) {
            wf0Var.encodeNull();
        } else {
            wf0Var.encodeNotNullMark();
            wf0Var.encodeSerializableValue(this.a, obj);
        }
    }
}
