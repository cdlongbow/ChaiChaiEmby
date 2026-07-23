package defpackage;

import java.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ir extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ ir(kr krVar, int i) {
        this.a = i;
        this.b = krVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        kr krVar = this.b;
        switch (i) {
            case 0:
                krVar.clear();
                break;
            default:
                krVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        kr krVar = this.b;
        switch (i) {
            case 0:
                Map mapC = krVar.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = krVar.e(entry.getKey());
                    if (iE != -1 && tl0.n(krVar.l()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return krVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        kr krVar = this.b;
        switch (i) {
            case 0:
                Map mapC = krVar.c();
                return mapC != null ? mapC.entrySet().iterator() : new hr(krVar, 1);
            default:
                Map mapC2 = krVar.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new hr(krVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        kr krVar = this.b;
        switch (i) {
            case 0:
                Map mapC = krVar.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (krVar.h()) {
                    return false;
                }
                int iD = krVar.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = krVar.a;
                Objects.requireNonNull(obj2);
                int iU = tl0.U(key, value, iD, obj2, krVar.j(), krVar.k(), krVar.l());
                if (iU == -1) {
                    return false;
                }
                krVar.g(iU, iD);
                krVar.g--;
                krVar.e += 32;
                return true;
            default:
                Map mapC2 = krVar.c();
                if (mapC2 != null) {
                    return mapC2.keySet().remove(obj);
                }
                return krVar.i(obj) != kr.k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        kr krVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return krVar.size();
    }
}
