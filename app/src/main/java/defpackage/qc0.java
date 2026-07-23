package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qc0 implements pr0 {
    public final Drawable a;

    public qc0(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.pr0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.pr0
    public final void b(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc0) && Intrinsics.areEqual(this.a, ((qc0) obj).a);
    }

    @Override // defpackage.pr0
    public final int getHeight() {
        return ce2.a(this.a);
    }

    @Override // defpackage.pr0
    public final long getSize() {
        Drawable drawable = this.a;
        return RangesKt.coerceAtLeast(((long) ce2.b(drawable)) * 4 * ((long) ce2.a(drawable)), 0L);
    }

    @Override // defpackage.pr0
    public final int getWidth() {
        return ce2.b(this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
