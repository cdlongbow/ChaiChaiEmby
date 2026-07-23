package defpackage;

import java.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends ez1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractMap b;

    public /* synthetic */ e0(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }

    public final boolean a(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mapB = b();
        mapB.getClass();
        try {
            obj2 = mapB.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (tl0.n(obj2, entry.getValue())) {
            return obj2 != null || b().containsKey(key);
        }
        return false;
    }

    public final Map b() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                return (g0) abstractMap;
            default:
                return (p31) abstractMap;
        }
    }

    public final boolean c(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return b().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        b().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                Set setEntrySet = ((g0) this.b).c.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return a(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                return new f0((g0) abstractMap);
            default:
                return ((p31) abstractMap).b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object objRemove;
        switch (this.a) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                p0 p0Var = ((g0) this.b).d;
                Object key = entry.getKey();
                Map map = p0Var.e;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    p0Var.g -= size;
                }
                return true;
            default:
                return c(obj);
        }
    }

    @Override // defpackage.ez1, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // defpackage.ez1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int iCeil;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                ig2.r(size, "expectedSize");
                iCeil = size + 1;
            } else {
                iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(iCeil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return b().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b().size();
    }
}
