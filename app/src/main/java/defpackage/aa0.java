package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aa0 {
    public final boolean a;
    public final jb2 b;
    public final String c;
    public final kb2 d;
    public final String e;

    public /* synthetic */ aa0(jb2 jb2Var, String str, kb2 kb2Var, String str2, int i) {
        this((i & 1) == 0, (i & 2) != 0 ? null : jb2Var, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : kb2Var, (i & 16) != 0 ? null : str2);
    }

    public static aa0 a(aa0 aa0Var, String str) {
        boolean z = aa0Var.a;
        jb2 jb2Var = aa0Var.b;
        kb2 kb2Var = aa0Var.d;
        String str2 = aa0Var.e;
        aa0Var.getClass();
        return new aa0(z, jb2Var, str, kb2Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        return this.a == aa0Var.a && this.b == aa0Var.b && Intrinsics.areEqual(this.c, aa0Var.c) && Intrinsics.areEqual(this.d, aa0Var.d) && Intrinsics.areEqual(this.e, aa0Var.e);
    }

    public final int hashCode() {
        int i = (this.a ? 1231 : 1237) * 31;
        jb2 jb2Var = this.b;
        int iHashCode = (i + (jb2Var == null ? 0 : jb2Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kb2 kb2Var = this.d;
        int iHashCode3 = (iHashCode2 + (kb2Var == null ? 0 : kb2Var.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailTraktWatchedSyncState(isRunning=");
        sb.append(this.a);
        sb.append(", direction=");
        sb.append(this.b);
        sb.append(", progressText=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append(this.d);
        sb.append(", errorMessage=");
        return s01.w(sb, this.e, ")");
    }

    public aa0(boolean z, jb2 jb2Var, String str, kb2 kb2Var, String str2) {
        this.a = z;
        this.b = jb2Var;
        this.c = str;
        this.d = kb2Var;
        this.e = str2;
    }
}
