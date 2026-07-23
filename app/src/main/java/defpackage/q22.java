package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class q22 implements AutoCloseable {
    public final BufferedSource a;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q22) {
            return Intrinsics.areEqual(this.a, ((q22) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + ")";
    }
}
