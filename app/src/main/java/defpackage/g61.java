package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g61 extends s0 implements e01 {
    public final e01 e;
    public final ri g;

    public g61(e01 e01Var, ri riVar) {
        e01Var.getClass();
        this.e = e01Var;
        this.g = riVar;
    }

    @Override // defpackage.d61
    public final void clear() {
        this.e.clear();
    }

    @Override // defpackage.s0
    public final Map d() {
        return new p31(this.e.b(), new g1(this, 16));
    }

    @Override // defpackage.s0
    public final Collection e() {
        return new r0(this, 0);
    }

    @Override // defpackage.s0
    public final Set f() {
        return this.e.keySet();
    }

    @Override // defpackage.s0
    public final Collection g() {
        return new uq(this.e.a(), new l31(this.g, 0));
    }

    @Override // defpackage.d61
    public final List get(Object obj) {
        return ku.S((List) this.e.get(obj), new k31(this.g, obj));
    }

    @Override // defpackage.s0
    public final Iterator h() {
        return new lv0(this.e.a().iterator(), new l31(this.g, 1));
    }

    @Override // defpackage.s0, defpackage.d61
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // defpackage.d61
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s0, defpackage.d61
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override // defpackage.d61
    public final int size() {
        return this.e.size();
    }
}
