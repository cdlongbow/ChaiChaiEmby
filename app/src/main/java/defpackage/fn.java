package defpackage;

import java.nio.ByteBuffer;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes4.dex */
public final class fn implements Source {
    public final ByteBuffer a;
    public final int b;

    public fn(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.a = byteBufferSlice;
        this.b = byteBufferSlice.capacity();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        ByteBuffer byteBuffer = this.a;
        int iPosition = byteBuffer.position();
        int i = this.b;
        if (iPosition == i) {
            return -1L;
        }
        byteBuffer.limit(RangesKt.coerceAtMost((int) (((long) byteBuffer.position()) + j), i));
        return buffer.write(byteBuffer);
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getTimeout() {
        return Timeout.NONE;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
