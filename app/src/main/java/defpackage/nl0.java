package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nl0 extends ol0 implements Map {
    @Override // java.util.Map
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // defpackage.ol0
    public abstract Map delegate();

    public Set entrySet() {
        return delegate().entrySet();
    }

    public Object get(Object obj) {
        return delegate().get(obj);
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set keySet() {
        return delegate().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        delegate().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        hg2.n(entrySet().iterator());
    }

    public boolean standardContainsKey(Object obj) {
        return hg2.s(new n31(entrySet().iterator(), 0), obj);
    }

    public boolean standardContainsValue(Object obj) {
        return hg2.s(new n31(entrySet().iterator(), 1), obj);
    }

    public boolean standardEquals(Object obj) {
        return ig2.C(this, obj);
    }

    public int standardHashCode() {
        return ku.C(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Object standardRemove(Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (tl0.n(entry.getKey(), obj)) {
                Object value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return ig2.N(this);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return delegate().values();
    }
}
