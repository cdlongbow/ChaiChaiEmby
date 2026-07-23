package defpackage;

import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class gs1 implements cb0 {
    public final FileSystem a;
    public final ib0 b;

    public gs1(long j, Path path, FileSystem fileSystem, EmptyCoroutineContext emptyCoroutineContext) {
        this.a = fileSystem;
        this.b = new ib0(fileSystem, path, emptyCoroutineContext, j);
    }

    public final void a() {
        ib0 ib0Var = this.b;
        synchronized (ib0Var.i) {
            try {
                ib0Var.e();
                for (eb0 eb0Var : (eb0[]) ib0Var.g.values().toArray(new eb0[0])) {
                    ib0Var.j(eb0Var);
                }
                ib0Var.p = false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
