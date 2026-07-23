package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p40 {
    public final String a;
    public final String b;
    public final ImageVector c;
    public final String d;
    public final ArrayList e;

    public p40(String str, String str2, ImageVector imageVector, String str3, ArrayList arrayList) {
        imageVector.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = imageVector;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return Intrinsics.areEqual(this.a, p40Var.a) && Intrinsics.areEqual(this.b, p40Var.b) && Intrinsics.areEqual(this.c, p40Var.c) && Intrinsics.areEqual(this.d, p40Var.d) && Intrinsics.areEqual(this.e, p40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + i02.i((this.c.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("DetailMetadataCardSpec(key=", this.a, ", title=", this.b, ", icon=");
        sbZ.append(this.c);
        sbZ.append(", headline=");
        sbZ.append(this.d);
        sbZ.append(", rows=");
        sbZ.append(this.e);
        sbZ.append(")");
        return sbZ.toString();
    }
}
