package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class m00 {
    public final float a;
    public final float b;

    public m00(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return Float.compare(this.a, m00Var.a) == 0 && Float.compare(this.b, m00Var.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "DarkThemeGlowLayout(ambientCenterX=" + this.a + ", ambientCenterY=" + this.b + ")";
    }
}
