package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class dt1 extends st0 {
    public final transient ft0 d;
    public final transient Object[] e;
    public final transient int g;

    public dt1(ft0 ft0Var, Object[] objArr, int i) {
        this.d = ft0Var;
        this.e = objArr;
        this.g = i;
    }

    @Override // defpackage.ts0
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ts0
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.st0
    public final at0 k() {
        return new ct1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set

    @Override // defpackage.st0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
