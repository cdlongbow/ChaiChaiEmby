package defpackage;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hf implements jf {
    public final Painter a;
    public final h52 b;

    public hf(Painter painter, h52 h52Var) {
        this.a = painter;
        this.b = h52Var;
    }

    @Override // defpackage.jf
    public final Painter a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj;
        return Intrinsics.areEqual(this.a, hfVar.a) && Intrinsics.areEqual(this.b, hfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
