package defpackage;

public enum ln {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    public final boolean a;
    public final boolean b;

    ln(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}