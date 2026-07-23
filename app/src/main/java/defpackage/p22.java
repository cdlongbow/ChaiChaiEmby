package defpackage;

import kotlin.Unit;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class p22 implements ks0 {
    public final FileSystem a;
    public final tl0 b;
    public final Object c = new Object();
    public boolean d;
    public final BufferedSource e;

    public p22(BufferedSource bufferedSource, FileSystem fileSystem, tl0 tl0Var) {
        this.a = fileSystem;
        this.b = tl0Var;
        this.e = bufferedSource;
    }

    @Override // defpackage.ks0
    public final Path a() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            BufferedSource bufferedSource = this.e;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.ks0

    @Override // defpackage.ks0

    @Override // defpackage.ks0
    public final BufferedSource source() {
        BufferedSource bufferedSource;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                bufferedSource = this.e;
                if (bufferedSource == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bufferedSource;
    }
}
