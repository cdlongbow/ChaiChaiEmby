package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zb2 {
    public final TreeMap a = new TreeMap();

    public final Map a() {
        return new p31(this, this.a.values());
    }

    public final Map.Entry b(Long l) {
        Map.Entry entryFloorEntry = this.a.floorEntry(new fw(l));
        if (entryFloorEntry == null) {
            return null;
        }
        cs1 cs1Var = ((yb2) entryFloorEntry.getValue()).a;
        cs1Var.getClass();
        if (!cs1Var.a.e(l) || cs1Var.b.e(l)) {
            return null;
        }
        return (Map.Entry) entryFloorEntry.getValue();
    }

    public final void c(cs1 cs1Var, Object obj) {
        gw gwVar = cs1Var.a;
        gw gwVar2 = cs1Var.b;
        boolean zEquals = gwVar.equals(gwVar2);
        gw gwVar3 = cs1Var.a;
        if (zEquals) {
            return;
        }
        obj.getClass();
        boolean zEquals2 = gwVar3.equals(gwVar2);
        TreeMap treeMap = this.a;
        if (!zEquals2) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(gwVar3);
            if (entryLowerEntry != null) {
                cs1 cs1Var2 = ((yb2) entryLowerEntry.getValue()).a;
                gw gwVar4 = cs1Var2.b;
                gw gwVar5 = cs1Var2.b;
                if (gwVar4.compareTo(gwVar3) > 0) {
                    if (gwVar5.compareTo(gwVar2) > 0) {
                        d(gwVar2, gwVar5, ((yb2) entryLowerEntry.getValue()).b);
                    }
                    d(cs1Var2.a, gwVar3, ((yb2) entryLowerEntry.getValue()).b);
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(gwVar2);
            if (entryLowerEntry2 != null) {
                yb2 yb2Var = (yb2) entryLowerEntry2.getValue();
                if (yb2Var.a.b.compareTo(gwVar2) > 0) {
                    d(gwVar2, yb2Var.a.b, ((yb2) entryLowerEntry2.getValue()).b);
                }
            }
            treeMap.subMap(gwVar3, gwVar2).clear();
        }
        treeMap.put(gwVar3, new yb2(cs1Var, obj));
    }

    public final void d(gw gwVar, gw gwVar2, Object obj) {
        this.a.put(gwVar, new yb2(new cs1(gwVar, gwVar2), obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zb2)) {
            return false;
        }
        return ((AbstractMap) a()).equals(((zb2) obj).a());
    }

    public final int hashCode() {
        return ((AbstractMap) a()).hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}
