package defpackage;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gf implements jf {
    public final Painter a;

    public gf(Painter painter) {
        this.a = painter;
    }

    @Override // defpackage.jf
    public final Painter a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf) && Intrinsics.areEqual(this.a, ((gf) obj).a);
    }

    public final int hashCode() {
        Painter painter = this.a;
        if (painter == null) {
            return 0;
        }
        return painter.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
