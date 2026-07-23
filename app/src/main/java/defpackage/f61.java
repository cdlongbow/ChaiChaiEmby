package defpackage;

import java.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f61 extends a0 {
    private static final long serialVersionUID = 0;
    public transient j52 h;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.h = (j52) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        k((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.h);
        objectOutputStream.writeObject(this.e);
    }

    @Override // defpackage.p0, defpackage.s0
    public final Map d() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new i0(this, (NavigableMap) this.e);
        }
        return map instanceof SortedMap ? new l0(this, (SortedMap) this.e) : new g0(this, this.e);
    }

    @Override // defpackage.p0, defpackage.s0
    public final Set f() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new j0(this, (NavigableMap) this.e);
        }
        return map instanceof SortedMap ? new m0(this, (SortedMap) this.e) : new h0(this, this.e);
    }

    @Override // defpackage.p0
    public final Collection j() {
        return (List) this.h.get();
    }
}
