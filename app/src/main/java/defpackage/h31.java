package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class h31 implements Map.Entry, KMappedMarker {
    public final Object a;
    public final Object b;

    public h31(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h31)) {
            return false;
        }
        h31 h31Var = (h31) obj;
        return Intrinsics.areEqual(this.a, h31Var.a) && Intrinsics.areEqual(this.b, h31Var.b);
    }

    @Override // java.util.Map.Entry

    @Override // java.util.Map.Entry

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.a + ", value=" + this.b + ')';
    }
}
