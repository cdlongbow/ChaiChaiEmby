package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lt0 extends zi implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient gt1 e;
    public final transient int g;

    public lt0(gt1 gt1Var, int i) {
        this.e = gt1Var;
        this.g = i;
    }

    @Override // defpackage.s0, defpackage.d61
    public final Collection a() {
        return (ts0) super.a();
    }

    @Override // defpackage.s0
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // defpackage.d61
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s0
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.s0
    public final Collection e() {
        return new it0(this);
    }

    @Override // defpackage.s0
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.s0
    public final Collection g() {
        return new kt0(this);
    }

    @Override // defpackage.s0
    public final Iterator h() {
        return new gt0(this);
    }

    @Override // defpackage.s0, defpackage.d61
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ft0 b() {
        return this.e;
    }

    @Override // defpackage.s0, defpackage.d61
    public final Set keySet() {
        return this.e.keySet();
    }

    @Override // defpackage.d61
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s0, defpackage.d61
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.d61

    @Override // defpackage.s0, defpackage.d61
    public final Collection values() {
        return (ts0) super.values();
    }
}
