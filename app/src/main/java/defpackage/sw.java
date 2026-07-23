package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sw {
    public final String a;
    public final List b;
    public final int c;

    public sw(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }



    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw)) {
            return false;
        }
        sw swVar = (sw) obj;
        return Intrinsics.areEqual(this.a, swVar.a) && Intrinsics.areEqual(this.b, swVar.b) && this.c == swVar.c;
    }

    public final int hashCode() {
        return qi0.f(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DanmakuEpisodeRangeBucket(label=");
        sb.append(this.a);
        sb.append(", episodes=");
        sb.append(this.b);
        sb.append(", firstIndex=");
        return ll0.f(sb, this.c, ")");
    }
}
