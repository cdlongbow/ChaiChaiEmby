package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zd {
    public final md a;

    public zd(md mdVar) {
        mdVar.getClass();
        this.a = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd) && Intrinsics.areEqual(this.a, ((zd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AssSubtitleOverlayTag(handler=" + this.a + ")";
    }
}
