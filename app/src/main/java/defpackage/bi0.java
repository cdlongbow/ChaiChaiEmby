package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bi0 {
    public final String a;
    public final String b;
    public final String c;
    public final Drawable d;
    public final di0 e;

    public bi0(String str, String str2, String str3, Drawable drawable, di0 di0Var) {
        drawable.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = drawable;
        this.e = di0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi0)) {
            return false;
        }
        bi0 bi0Var = (bi0) obj;
        return Intrinsics.areEqual(this.a, bi0Var.a) && Intrinsics.areEqual(this.b, bi0Var.b) && Intrinsics.areEqual(this.c, bi0Var.c) && Intrinsics.areEqual(this.d, bi0Var.d) && this.e == bi0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("ExternalPlayerApp(label=", this.a, ", packageName=", this.b, ", activityName=");
        sbZ.append(this.c);
        sbZ.append(", icon=");
        sbZ.append(this.d);
        sbZ.append(", launchMode=");
        sbZ.append(this.e);
        sbZ.append(")");
        return sbZ.toString();
    }
}
