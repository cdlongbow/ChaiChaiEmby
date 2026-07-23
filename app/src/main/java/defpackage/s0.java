package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 implements d61 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    @Override // defpackage.d61
    public Collection a() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.a = collectionE;
        return collectionE;
    }

    @Override // defpackage.d61
    public Map b() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.d = mapD;
        return mapD;
    }

    public boolean c(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    public abstract Collection e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d61) {
            return b().equals(((d61) obj).b());
        }
        return false;
    }

    public abstract Set f();

    public abstract Collection g();

    public abstract Iterator h();

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        get(str).addAll(arrayList);
    }

    @Override // defpackage.d61
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // defpackage.d61
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.b = setF;
        return setF;
    }

    @Override // defpackage.d61
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }

    @Override // defpackage.d61
    public Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection collectionG = g();
        this.c = collectionG;
        return collectionG;
    }
}
