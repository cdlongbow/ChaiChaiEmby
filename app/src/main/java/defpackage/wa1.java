package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* JADX INFO: loaded from: classes4.dex */
public final class wa1 {
    public final Context a;
    public final n12 b;
    public final uu1 c;
    public final jp1 d;
    public final String e;
    public final FileSystem f;
    public final ln g;
    public final ln h;
    public final ln i;
    public final pi0 j;

    public wa1(Context context, n12 n12Var, uu1 uu1Var, jp1 jp1Var, String str, FileSystem fileSystem, ln lnVar, ln lnVar2, ln lnVar3, pi0 pi0Var) {
        this.a = context;
        this.b = n12Var;
        this.c = uu1Var;
        this.d = jp1Var;
        this.e = str;
        this.f = fileSystem;
        this.g = lnVar;
        this.h = lnVar2;
        this.i = lnVar3;
        this.j = pi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa1)) {
            return false;
        }
        wa1 wa1Var = (wa1) obj;
        return Intrinsics.areEqual(this.a, wa1Var.a) && Intrinsics.areEqual(this.b, wa1Var.b) && this.c == wa1Var.c && this.d == wa1Var.d && Intrinsics.areEqual(this.e, wa1Var.e) && Intrinsics.areEqual(this.f, wa1Var.f) && this.g == wa1Var.g && this.h == wa1Var.h && this.i == wa1Var.i && Intrinsics.areEqual(this.j, wa1Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}
