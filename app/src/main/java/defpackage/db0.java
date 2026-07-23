package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class db0 {
    public final eb0 a;
    public boolean b;
    public final boolean[] c = new boolean[2];
    public final /* synthetic */ ib0 d;

    public db0(ib0 ib0Var, eb0 eb0Var) {
        this.d = ib0Var;
        this.a = eb0Var;
    }

    public final void a(boolean z) {
        ib0 ib0Var = this.d;
        synchronized (ib0Var.i) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (Intrinsics.areEqual(this.a.g, this)) {
                    ib0.b(ib0Var, this, z);
                }
                this.b = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Path b(int i) {
        Path path;
        ib0 ib0Var = this.d;
        synchronized (ib0Var.i) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            this.c[i] = true;
            Object obj = this.a.d.get(i);
            gk0.a(ib0Var.r, (Path) obj);
            path = (Path) obj;
        }
        return path;
    }
}
