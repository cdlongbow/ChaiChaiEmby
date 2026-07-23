package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cc {
    public final File a;
    public final dc b;
    public final boolean c;

    public cc(File file, dc dcVar, boolean z) {
        this.a = file;
        this.b = dcVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return Intrinsics.areEqual(this.a, ccVar.a) && this.b == ccVar.b && this.c == ccVar.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkDownloadResult(file=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", switchedToFrontProxy=");
        return i9.i(sb, this.c, ")");
    }
}
