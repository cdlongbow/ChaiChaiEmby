package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.dh.myembyapp.data.model.ServerPingState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tn0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final ImageVector f;
    public final boolean g;
    public final String h;
    public final Integer i;
    public final ServerPingState j;
    public final String k;

    public tn0(String str, String str2, String str3, boolean z, boolean z2, ImageVector imageVector, String str4, Integer num, ServerPingState serverPingState, String str5, int i) {
        z2 = (i & 16) != 0 ? false : z2;
        imageVector = (i & 32) != 0 ? null : imageVector;
        boolean z3 = (i & 64) == 0;
        str4 = (i & 128) != 0 ? null : str4;
        num = (i & 256) != 0 ? null : num;
        serverPingState = (i & 512) != 0 ? null : serverPingState;
        str5 = (i & 1024) != 0 ? null : str5;
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = imageVector;
        this.g = z3;
        this.h = str4;
        this.i = num;
        this.j = serverPingState;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn0)) {
            return false;
        }
        tn0 tn0Var = (tn0) obj;
        return Intrinsics.areEqual(this.a, tn0Var.a) && Intrinsics.areEqual(this.b, tn0Var.b) && Intrinsics.areEqual(this.c, tn0Var.c) && this.d == tn0Var.d && this.e == tn0Var.e && Intrinsics.areEqual(this.f, tn0Var.f) && this.g == tn0Var.g && Intrinsics.areEqual(this.h, tn0Var.h) && Intrinsics.areEqual(this.i, tn0Var.i) && Intrinsics.areEqual(this.j, tn0Var.j) && Intrinsics.areEqual(this.k, tn0Var.k);
    }

    public final int hashCode() {
        String str = this.a;
        int i = (((i02.i(i02.i((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
        ImageVector imageVector = this.f;
        int iHashCode = (((i + (imageVector == null ? 0 : imageVector.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31;
        String str2 = this.h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ServerPingState serverPingState = this.j;
        int iHashCode4 = (iHashCode3 + (serverPingState == null ? 0 : serverPingState.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("HomeRouteOption(id=", this.a, ", title=", this.b, ", subtitle=");
        sbZ.append(this.c);
        sbZ.append(", isActive=");
        sbZ.append(this.d);
        sbZ.append(", isMainRoute=");
        sbZ.append(this.e);
        sbZ.append(", leadingIcon=");
        sbZ.append(this.f);
        sbZ.append(", showServerIcon=");
        sbZ.append(this.g);
        sbZ.append(", serverIconPath=");
        sbZ.append(this.h);
        sbZ.append(", serverIconResId=");
        sbZ.append(this.i);
        sbZ.append(", pingState=");
        sbZ.append(this.j);
        sbZ.append(", recentAccessText=");
        return s01.w(sbZ, this.k, ")");
    }
}
