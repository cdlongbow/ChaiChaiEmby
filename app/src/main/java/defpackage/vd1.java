package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vd1 {
    public final String a;
    public final String b;
    public final List c;

    public vd1(String str, String str2, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd1)) {
            return false;
        }
        vd1 vd1Var = (vd1) obj;
        return Intrinsics.areEqual(this.a, vd1Var.a) && Intrinsics.areEqual(this.b, vd1Var.b) && Intrinsics.areEqual(this.c, vd1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("PlaybackErrorDialogState(summary=", this.a, ", suggestion=", this.b, ", technicalDetails=");
        sbZ.append(this.c);
        sbZ.append(")");
        return sbZ.toString();
    }
}
