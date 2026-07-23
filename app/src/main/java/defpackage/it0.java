package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class it0 extends ts0 {
    private static final long serialVersionUID = 0;
    public final lt0 b;

    public it0(lt0 lt0Var) {
        this.b = lt0Var;
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.b.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        lt0 lt0Var = this.b;
        lt0Var.getClass();
        return new gt0(lt0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.g;
    }

    @Override // defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
