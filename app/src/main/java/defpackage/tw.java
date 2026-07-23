package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class tw {
    public final int a;
    public final long b;

    public tw(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw)) {
            return false;
        }
        tw twVar = (tw) obj;
        return this.a == twVar.a && this.b == twVar.b;
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DanmakuLoadPlan(batchSize=" + this.a + ", batchDelayMs=" + this.b + ")";
    }
}
