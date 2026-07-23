package defpackage;

import kotlin.Unit;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class fk0 implements ks0 {
    public final Path a;
    public final FileSystem b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean g;
    public BufferedSource h;

    public fk0(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable) {
        this.a = path;
        this.b = fileSystem;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // defpackage.ks0
    public final Path a() {
        Path path;
        synchronized (this.e) {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
            path = this.a;
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.e) {
            this.g = true;
            BufferedSource bufferedSource = this.h;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    try {
                        kb0.E(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
                Unit unit = Unit.INSTANCE;
            } else {
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    kb0.E(autoCloseable);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            throw th;
        }
    }

    @Override // defpackage.ks0

    @Override // defpackage.ks0
    public final tl0 getMetadata() {
        return null;
    }

    @Override // defpackage.ks0
    public final BufferedSource source() {
        synchronized (this.e) {
            if (this.g) {
                throw new IllegalStateException("closed");
            }
            BufferedSource bufferedSource = this.h;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(this.b.source(this.a));
            this.h = bufferedSourceBuffer;
            return bufferedSourceBuffer;
        }
    }
}
