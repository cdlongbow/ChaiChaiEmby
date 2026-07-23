package defpackage;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes4.dex */
public final class ui0 implements Sink {
    public final Sink a;
    public final c b;
    public boolean c;

    public ui0(Sink sink, c cVar) {
        this.a = sink;
        this.b = cVar;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public final Timeout getTimeout() {
        return this.a.getTimeout();
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) throws EOFException {
        if (this.c) {
            buffer.skip(j);
            return;
        }
        try {
            this.a.write(buffer, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
