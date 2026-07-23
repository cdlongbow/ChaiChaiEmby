package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ew extends gw {
    public static final ew b = new ew("");
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // defpackage.gw
    /* JADX INFO: renamed from: a */
    public final int compareTo(gw gwVar) {
        return gwVar == this ? 0 : -1;
    }

    @Override // defpackage.gw
    public final void b(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.gw
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.gw, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((gw) obj) == this ? 0 : -1;
    }

    @Override // defpackage.gw
    public final Comparable d() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.gw
    public final boolean e(Comparable comparable) {
        return true;
    }

    @Override // defpackage.gw
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
