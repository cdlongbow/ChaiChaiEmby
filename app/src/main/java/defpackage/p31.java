package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p31 extends AbstractMap {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public p31(Map map, o31 o31Var) {
        map.getClass();
        this.b = map;
        this.c = o31Var;
    }

    public final void a() {
        hg2.n(b());
    }

    public final Iterator b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((Map) obj).entrySet().iterator();
                o31 o31Var = (o31) this.c;
                o31Var.getClass();
                return new lv0(it, new l31(o31Var, 1));
            default:
                return ((Iterable) obj).iterator();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        switch (this.a) {
            case 0:
                ((Map) this.b).clear();
                break;
            default:
                a();
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                return ((Map) this.b).containsKey(obj);
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new e0(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Map map = (Map) this.b;
                Object obj3 = map.get(obj);
                if (obj3 != null || map.containsKey(obj)) {
                    return ((o31) obj2).d(obj, obj3);
                }
                return null;
            default:
                if (!(obj instanceof cs1)) {
                    return null;
                }
                cs1 cs1Var = (cs1) obj;
                yb2 yb2Var = (yb2) ((zb2) obj2).a.get(cs1Var.a);
                if (yb2Var == null || !yb2Var.a.equals(cs1Var)) {
                    return null;
                }
                return yb2Var.b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        switch (this.a) {
            case 0:
                return ((Map) this.b).keySet();
            default:
                return super.keySet();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) this.b;
                if (map.containsKey(obj)) {
                    return ((o31) this.c).d(obj, map.remove(obj));
                }
                return null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
            case 0:
                return ((Map) this.b).size();
            default:
                return ((zb2) this.c).a.size();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        switch (this.a) {
            case 0:
                return new r0(this);
            default:
                return super.values();
        }
    }

    public p31(zb2 zb2Var, Collection collection) {
        this.c = zb2Var;
        this.b = collection;
    }
}
