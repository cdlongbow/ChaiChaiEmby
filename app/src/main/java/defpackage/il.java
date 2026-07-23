package defpackage;

import okio.Buffer;
import okio.ForwardingSource;

/* JADX INFO: loaded from: classes4.dex */
public final class il extends ForwardingSource {
    public Exception a;

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j) throws Exception {
        try {
            return super.read(buffer, j);
        } catch (Exception e) {
            this.a = e;
            throw e;
        }
    }
}
