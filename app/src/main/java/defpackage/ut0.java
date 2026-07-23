package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ut0 extends st0 {
    @Override // defpackage.ts0
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        return a().listIterator(0);
    }

    public abstract Object get(int i);

    @Override // defpackage.st0
    public final at0 k() {
        return new tt0(this);
    }

    @Override // defpackage.st0, defpackage.ts0
    public Object writeReplace() {
        return super.writeReplace();
    }
}
