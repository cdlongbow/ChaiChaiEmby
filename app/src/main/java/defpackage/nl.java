package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nl implements pr0 {
    public final Bitmap a;

    public nl(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.pr0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.pr0
    public final void b(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl) && Intrinsics.areEqual(this.a, ((nl) obj).a);
    }

    @Override // defpackage.pr0
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.pr0
    public final long getSize() {
        return rl.a(this.a);
    }

    @Override // defpackage.pr0
    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
