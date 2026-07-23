package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public final class c32 implements a20 {
    public final Semaphore a;

    public c32(Semaphore semaphore) {
        this.a = semaphore;
    }

    @Override // defpackage.a20
    public final c20 a(o22 o22Var, wa1 wa1Var) {
        ImageDecoder.Source sourceA;
        Bitmap.Config configB = is0.b(wa1Var);
        if ((configB == Bitmap.Config.ARGB_8888 || configB == Bitmap.Config.HARDWARE) && (sourceA = g32.a(o22Var.a, wa1Var)) != null) {
            return new f32(sourceA, o22Var.a, wa1Var, this.a);
        }
        return null;
    }
}
