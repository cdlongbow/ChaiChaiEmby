package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class ft0 implements Map, Serializable {
    private static final long serialVersionUID = 912559;
    public transient dt1 a;
    public transient et1 b;
    public transient ft1 c;

    public static dt0 a() {
        return new dt0(4);
    }

    public static ft0 b(Map map) {
        if ((map instanceof ft0) && !(map instanceof SortedMap)) {
            return (ft0) map;
        }
        Set setEntrySet = map.entrySet();
        dt0 dt0Var = new dt0(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        dt0Var.c(setEntrySet);
        return dt0Var.a(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final st0 entrySet() {
        dt1 dt1Var = this.a;
        if (dt1Var != null) {
            return dt1Var;
        }
        gt1 gt1Var = (gt1) this;
        dt1 dt1Var2 = new dt1(gt1Var, gt1Var.e, gt1Var.g);
        this.a = dt1Var2;
        return dt1Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final st0 keySet() {
        et1 et1Var = this.b;
        if (et1Var != null) {
            return et1Var;
        }
        gt1 gt1Var = (gt1) this;
        et1 et1Var2 = new et1(gt1Var, new ft1(gt1Var.e, 0, gt1Var.g));
        this.b = et1Var2;
        return et1Var2;
    }

    @Override // java.util.Map
    public final ts0 values() {
        ft1 ft1Var = this.c;
        if (ft1Var != null) {
            return ft1Var;
        }
        gt1 gt1Var = (gt1) this;
        ft1 ft1Var2 = new ft1(gt1Var.e, 1, gt1Var.g);
        this.c = ft1Var2;
        return ft1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return ig2.C(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ku.C(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((gt1) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return ig2.N(this);
    }

    public Object writeReplace() {
        return new et0(this);
    }
}