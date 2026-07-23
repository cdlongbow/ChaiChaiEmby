package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class pw1 implements Iterable, KMappedMarker {
    public final /* synthetic */ pg0 a;

    public pw1(pg0 pg0Var) {
        this.a = pg0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ow1(this.a);
    }
}
