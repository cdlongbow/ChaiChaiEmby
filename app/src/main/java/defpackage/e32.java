package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class e32 implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ f32 a;
    public final /* synthetic */ Ref.BooleanRef b;

    public e32(f32 f32Var, Ref.BooleanRef booleanRef) {
        this.a = f32Var;
        this.b = booleanRef;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        f32 f32Var = this.a;
        wa1 wa1Var = f32Var.c;
        n12 n12Var = wa1Var.b;
        uu1 uu1Var = wa1Var.c;
        ri riVar = hs0.b;
        long jP = hg2.p(width, height, n12Var, uu1Var, (n12) tl0.v(wa1Var, riVar));
        int i = (int) (jP >> 32);
        int i2 = (int) (jP & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            wa1 wa1Var2 = f32Var.c;
            double dQ = hg2.q(width, height, i, i2, wa1Var2.c, (n12) tl0.v(wa1Var2, riVar));
            boolean z = dQ < 1.0d;
            this.b.element = z;
            if (z || f32Var.c.d == jp1.a) {
                imageDecoder.setTargetSize(MathKt.roundToInt(((double) width) * dQ), MathKt.roundToInt(dQ * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new b32());
        wa1 wa1Var3 = f32Var.c;
        imageDecoder.setAllocator(rl.b(is0.b(wa1Var3)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) tl0.v(wa1Var3, is0.g)).booleanValue() ? 1 : 0);
        ri riVar2 = is0.c;
        if (zq.b(tl0.v(wa1Var3, riVar2)) != null) {
            imageDecoder.setTargetColorSpace(zq.b(tl0.v(wa1Var3, riVar2)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) tl0.v(wa1Var3, is0.d)).booleanValue());
    }
}
