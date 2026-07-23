package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.nio.ByteBuffer;
import okio.Buffer;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class dn implements ck0 {
    public final /* synthetic */ int a;
    public final wa1 b;
    public final Object c;

    public /* synthetic */ dn(Object obj, wa1 wa1Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = wa1Var;
    }

    @Override // defpackage.ck0
    public final Object a(eg0 eg0Var) {
        int i = this.a;
        Object obj = this.c;
        wa1 wa1Var = this.b;
        switch (i) {
            case 0:
                Buffer buffer = new Buffer();
                buffer.write((byte[]) obj);
                return new o22(new p22(buffer, wa1Var.f, null), null, o00.b);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new o22(new p22(Okio.buffer(new fn(byteBuffer)), wa1Var.f, new gn(byteBuffer)), null, o00.b);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = ce2.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof VectorDrawableCompat);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(wa1Var.a.getResources(), tl0.i(bitmapDrawable, is0.b(wa1Var), wa1Var.b, wa1Var.c, (n12) tl0.v(wa1Var, hs0.b), wa1Var.d == jp1.b));
                }
                return new ur0(ig2.f(bitmapDrawable), z, o00.b);
        }
    }
}
