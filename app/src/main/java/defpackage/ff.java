package defpackage;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ff implements jf {
    public final Painter a;
    public final xg0 b;

    public ff(Painter painter, xg0 xg0Var) {
        this.a = painter;
        this.b = xg0Var;
    }

    @Override // defpackage.jf
    public final Painter a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return Intrinsics.areEqual(this.a, ffVar.a) && Intrinsics.areEqual(this.b, ffVar.b);
    }

    public final int hashCode() {
        Painter painter = this.a;
        return this.b.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
