package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ov0 implements Iterator {
    public static final ov0 a;
    public static final /* synthetic */ ov0[] b;

    static {
        ov0 ov0Var = new ov0("INSTANCE", 0);
        a = ov0Var;
        b = new ov0[]{ov0Var};
    }

    public static ov0 valueOf(String str) {
        return (ov0) Enum.valueOf(ov0.class, str);
    }

    public static ov0[] values() {
        return (ov0[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ig2.x(false, "no calls to next() since the last call to remove()");
    }
}
