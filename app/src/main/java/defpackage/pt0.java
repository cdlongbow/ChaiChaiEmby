package defpackage;

import com.google.common.collect.a;
import java.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pt0 extends ts0 implements Collection, java.util.Collection {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 912559;
    public transient bt1 b;
    public transient st0 c;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ts0
    public final at0 a() {
        bt1 bt1Var = this.b;
        if (bt1Var != null) {
            return bt1Var;
        }
        at0 at0VarA = super.a();
        this.b = (bt1) at0VarA;
        return at0VarA;
    }

    @Override // defpackage.ts0
    public final int b(int i, Object[] objArr) {
        qd2 it = i().iterator();
        while (it.hasNext()) {
            g91 g91Var = (g91) it.next();
            Arrays.fill(objArr, i, g91Var.a() + i, g91Var.a);
            i += g91Var.a();
        }
        return i;
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return ((jt1) this).e.b(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pt0)) {
            return false;
        }
        pt0 pt0Var = (pt0) obj;
        jt1 jt1Var = (jt1) this;
        if (jt1Var.size() != pt0Var.size() || i().size() != pt0Var.i().size()) {
            return false;
        }
        for (g91 g91Var : pt0Var.i()) {
            if (jt1Var.e.b(g91Var.a) != g91Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        return new mt0(i().iterator());
    }

    public abstract st0 h();

    @Override // java.util.Collection
    public final int hashCode() {
        return ku.C(i());
    }

    public final st0 i() {
        st0 aVar = this.c;
        if (aVar == null) {
            aVar = isEmpty() ? kt1.k : new a(this);
            this.c = aVar;
        }
        return aVar;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return i().toString();
    }

    @Override // defpackage.ts0
    public abstract Object writeReplace();
}
