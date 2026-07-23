package defpackage;
import com.badlogic.gdx.utils.Array;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class qs0 implements Iterable {
    public final Array a;
    public Array.ArrayIterable b;

    public qs0(Array array) {
        this.a = array;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.b == null) {
            this.b = new Array.ArrayIterable(this.a, false);
        }
        return this.b.iterator();
    }

    public final String toString() {
        return this.a.toString();
    }
}
