package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jb1 {
    public final String a;
    public final List b;
    public final String c;

    public /* synthetic */ jb1(String str, ArrayList arrayList, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 2) != 0 ? CollectionsKt.emptyList() : arrayList);
    }


    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb1)) {
            return false;
        }
        jb1 jb1Var = (jb1) obj;
        return Intrinsics.areEqual(this.a, jb1Var.a) && Intrinsics.areEqual(this.b, jb1Var.b) && Intrinsics.areEqual(this.c, jb1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = qi0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherServerResourcesUiState(sourceItemId=");
        sb.append(this.a);
        sb.append(", sections=");
        sb.append(this.b);
        sb.append(", message=");
        return s01.w(sb, this.c, ")");
    }

    public jb1(String str, String str2, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
    }
}
