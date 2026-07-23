package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class ec extends IOException {
    public final long a;
    public final int b;

    public ec(long j, int i, SocketTimeoutException socketTimeoutException) {
        super("原始 GitHub 地址下载超时：" + j + "ms 时进度为 " + i + "%", socketTimeoutException);
        this.a = j;
        this.b = i;
    }
}
