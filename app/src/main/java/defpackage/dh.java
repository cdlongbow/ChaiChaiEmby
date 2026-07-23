package defpackage;

import com.dh.myembyapp.data.model.BackupRouteConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dh {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final BackupRouteConfig e;
    public final boolean f;
    public final boolean g;

    public dh(String str, String str2, String str3, boolean z, BackupRouteConfig backupRouteConfig, boolean z2, boolean z3) {
        s01.D(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = backupRouteConfig;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        return Intrinsics.areEqual(this.a, dhVar.a) && Intrinsics.areEqual(this.b, dhVar.b) && Intrinsics.areEqual(this.c, dhVar.c) && this.d == dhVar.d && Intrinsics.areEqual(this.e, dhVar.e) && this.f == dhVar.f && this.g == dhVar.g;
    }

    public final int hashCode() {
        int i = (i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31;
        BackupRouteConfig backupRouteConfig = this.e;
        return ((((i + (backupRouteConfig == null ? 0 : backupRouteConfig.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("BackupRouteListEntry(id=", this.a, ", title=", this.b, ", address=");
        sbZ.append(this.c);
        sbZ.append(", directOnly=");
        sbZ.append(this.d);
        sbZ.append(", route=");
        sbZ.append(this.e);
        sbZ.append(", isMainRoute=");
        sbZ.append(this.f);
        sbZ.append(", isActive=");
        return i9.i(sbZ, this.g, ")");
    }
}
