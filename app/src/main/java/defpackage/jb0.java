package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jb0 {
    public final float a;

    public jb0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb0) && Float.compare(this.a, ((jb0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "DisplayModeMatchScore(total=" + this.a + ")";
    }
}
