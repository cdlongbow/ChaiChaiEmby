package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 extends s0 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map e;
    public transient int g;

    @Override // defpackage.d61
    public final void clear() {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.e.clear();
        this.g = 0;
    }

    @Override // defpackage.s0
    public Map d() {
        return new g0(this, this.e);
    }

    @Override // defpackage.s0
    public final Collection e() {
        return new r0(this, 0);
    }

    @Override // defpackage.s0
    public Set f() {
        return new h0(this, this.e);
    }

    @Override // defpackage.s0
    public final Collection g() {
        return new r0(this, 1);
    }

    @Override // defpackage.s0
    public final Iterator h() {
        return new d0(this, 1);
    }

    public abstract Collection j();

    public final void k(Map map) {
        this.e = map;
        this.g = 0;
        for (Collection collection : map.values()) {
            ig2.l(!collection.isEmpty());
            this.g = collection.size() + this.g;
        }
    }

}
