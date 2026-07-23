package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ii0 {
    public final ArrayList a;
    public final LinkedHashSet b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public ii0(ArrayList arrayList, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = arrayList;
        this.b = linkedHashSet;
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii0)) {
            return false;
        }
        ii0 ii0Var = (ii0) obj;
        return Intrinsics.areEqual(this.a, ii0Var.a) && Intrinsics.areEqual(this.b, ii0Var.b) && Intrinsics.areEqual(this.c, ii0Var.c) && Intrinsics.areEqual(this.d, ii0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExternalSubtitleConfigurationResult(configurations=" + this.a + ", labels=" + this.b + ", urlMap=" + this.c + ", formatMap=" + this.d + ")";
    }
}
