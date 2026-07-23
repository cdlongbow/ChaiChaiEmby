package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class ow1 implements Iterator, KMappedMarker {
    public int a;
    public final /* synthetic */ pg0 b;

    public ow1(pg0 pg0Var) {
        this.b = pg0Var;
        this.a = pg0Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        pg0 pg0Var = this.b;
        int i = pg0Var.c;
        int i2 = this.a;
        this.a = i2 - 1;
        return pg0Var.e[i - i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
