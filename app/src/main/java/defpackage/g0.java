package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class g0 extends AbstractMap {
    public transient e0 a;
    public transient r0 b;
    public final transient Map c;
    public final /* synthetic */ p0 d;

    public g0(p0 p0Var, Map map) {
        this.d = p0Var;
        this.c = map;
    }

    public final us0 a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        a0 a0Var = (a0) this.d;
        List list = (List) collection;
        return new us0(key, list instanceof RandomAccess ? new k0(a0Var, key, list, null) : new o0(a0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p0 p0Var = this.d;
        if (this.c == p0Var.e) {
            p0Var.clear();
        } else {
            hg2.n(new f0(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e0 e0Var = this.a;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this, 0);
        this.a = e0Var2;
        return e0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        a0 a0Var = (a0) this.d;
        List list = (List) collection;
        return list instanceof RandomAccess ? new k0(a0Var, obj, list, null) : new o0(a0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.d.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        p0 p0Var = this.d;
        Collection collectionJ = p0Var.j();
        collectionJ.addAll(collection);
        p0Var.g -= collection.size();
        collection.clear();
        return collectionJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        r0 r0Var = this.b;
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this);
        this.b = r0Var2;
        return r0Var2;
    }
}
