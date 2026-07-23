package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 extends p0 implements e01 {
    private static final long serialVersionUID = 6588350623831699109L;

    public a0(Map map) {
        ig2.l(map.isEmpty());
        this.e = map;
    }

    @Override // defpackage.d61
    public final List get(Object obj) {
        Collection collectionJ = (Collection) this.e.get(obj);
        if (collectionJ == null) {
            collectionJ = j();
        }
        List list = (List) collectionJ;
        return list instanceof RandomAccess ? new k0(this, obj, list, null) : new o0(this, obj, list, null);
    }

    @Override // defpackage.d61
    public final boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.g++;
            return true;
        }
        Collection collectionJ = j();
        if (!collectionJ.add(obj2)) {
            lm.d("New Collection violated the Collection spec");
            return false;
        }
        this.g++;
        this.e.put(obj, collectionJ);
        return true;
    }
}
