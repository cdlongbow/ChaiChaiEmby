package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ya0 implements ab0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ya0) {
            return this.a == ((ya0) obj).a;
        }
        return false;
    }


    public final String toString() {
        return x2.f(this.a, "Pixels(px=", ")");
    }
}
