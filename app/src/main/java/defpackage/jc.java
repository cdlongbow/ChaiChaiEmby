package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class jc extends IOException {
    public final long a;
    public final int b;

    public jc(long j, int i) {
        super("原始 GitHub 地址下载过慢：" + j + "ms 内进度仅 " + i + "%");
        this.a = j;
        this.b = i;
    }
}
