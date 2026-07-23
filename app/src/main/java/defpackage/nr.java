package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class nr extends pr {
    public static pr g(int i) {
        if (i < 0) {
            return pr.b;
        }
        return i > 0 ? pr.c : pr.a;
    }

    @Override // defpackage.pr
    public final pr a(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.pr
    public final pr b(long j, long j2) {
        return g(Long.compare(j, j2));
    }

    @Override // defpackage.pr
    public final pr c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.pr
    public final pr d(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.pr
    public final pr e(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }

    @Override // defpackage.pr
    public final int f() {
        return 0;
    }
}
