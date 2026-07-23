package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.MimeTypes;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class ll implements c20 {
    public final ks0 a;
    public final wa1 b;
    public final Semaphore c;
    public final eh0 d;

    public ll(ks0 ks0Var, wa1 wa1Var, Semaphore semaphore, eh0 eh0Var) {
        this.a = ks0Var;
        this.b = wa1Var;
        this.c = semaphore;
        this.d = eh0Var;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.graphics.Rect, java.lang.Throwable] */
    public static y10 b(ll llVar) throws Exception {
        ch0 ch0Var;
        boolean z;
        int i;
        Bitmap bitmapCreateBitmap;
        int i2;
        int iMin;
        double dMax;
        BitmapFactory.Options options = new BitmapFactory.Options();
        wa1 wa1Var = llVar.b;
        il ilVar = new il(llVar.a.source());
        BufferedSource bufferedSourceBuffer = Okio.buffer(ilVar);
        options.inJustDecodeBounds = true;
        Object obj = null;
        BitmapFactory.decodeStream(bufferedSourceBuffer.peek().inputStream(), null, options);
        Exception exc = ilVar.a;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = fh0.a;
        String str = options.outMimeType;
        llVar.d.getClass();
        if (str != null && (Intrinsics.areEqual(str, MimeTypes.IMAGE_JPEG) || Intrinsics.areEqual(str, MimeTypes.IMAGE_WEBP) || Intrinsics.areEqual(str, MimeTypes.IMAGE_HEIC) || Intrinsics.areEqual(str, MimeTypes.IMAGE_HEIF))) {
            ExifInterface exifInterface = new ExifInterface(new dh0(bufferedSourceBuffer.peek().inputStream()));
            ch0Var = new ch0(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
        } else {
            ch0Var = ch0.c;
        }
        int i3 = ch0Var.b;
        boolean z2 = ch0Var.a;
        Exception exc2 = ilVar.a;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            ri riVar = is0.c;
            if (((ColorSpace) tl0.v(wa1Var, riVar)) != null) {
                options.inPreferredColorSpace = (ColorSpace) tl0.v(wa1Var, riVar);
            }
        }
        boolean zBooleanValue = ((Boolean) tl0.v(wa1Var, is0.d)).booleanValue();
        Context context = wa1Var.a;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) tl0.v(wa1Var, is0.b);
        if ((z2 || i3 > 0) && (config == null || rl.b(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) tl0.v(wa1Var, is0.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, MimeTypes.IMAGE_JPEG)) {
            config = Bitmap.Config.RGB_565;
        }
        if (i4 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i5 = options.outWidth;
        if (i5 <= 0 || (i2 = options.outHeight) <= 0) {
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i6 = (i3 == 90 || i3 == 270) ? i2 : i5;
            if (i3 != 90 && i3 != 270) {
                i5 = i2;
            }
            n12 n12Var = wa1Var.b;
            uu1 uu1Var = wa1Var.c;
            ri riVar2 = hs0.b;
            long jP = hg2.p(i6, i5, n12Var, uu1Var, (n12) tl0.v(wa1Var, riVar2));
            obj = null;
            i3 = i3;
            int i7 = (int) (jP >> 32);
            int i8 = (int) (jP & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i6 / i7);
            int iHighestOneBit2 = Integer.highestOneBit(i5 / i8);
            int i9 = z10.$EnumSwitchMapping$0[uu1Var.ordinal()];
            if (i9 == 1) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (i9 != 2) {
                    qu.f();
                    return null;
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast(iMin, 1);
            options.inSampleSize = iCoerceAtLeast;
            double d = iCoerceAtLeast;
            double d2 = ((double) i6) / d;
            double d3 = ((double) i5) / d;
            n12 n12Var2 = (n12) tl0.v(wa1Var, riVar2);
            double d4 = ((double) i7) / d2;
            double d5 = ((double) i8) / d3;
            int iOrdinal = uu1Var.ordinal();
            if (iOrdinal == 0) {
                dMax = Math.max(d4, d5);
            } else {
                if (iOrdinal != 1) {
                    qu.f();
                    return null;
                }
                dMax = Math.min(d4, d5);
            }
            ab0 ab0Var = n12Var2.a;
            if (ab0Var instanceof ya0) {
                dMax = RangesKt.coerceAtMost(dMax, ((double) ((ya0) ab0Var).a) / d2);
            }
            ab0 ab0Var2 = n12Var2.b;
            if (ab0Var2 instanceof ya0) {
                dMax = RangesKt.coerceAtMost(dMax, ((double) ((ya0) ab0Var2).a) / d3);
            }
            if (wa1Var.d == jp1.b) {
                dMax = RangesKt.coerceAtMost(dMax, 1.0d);
            }
            boolean z3 = dMax == 1.0d;
            options.inScaled = !z3;
            if (!z3) {
                if (dMax > 1.0d) {
                    options.inDensity = MathKt.roundToInt(2.147483647E9d / dMax);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = MathKt.roundToInt(2.147483647E9d * dMax);
                }
            }
            z = false;
        }
        try {
            Object r5 = obj;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), r5, options);
            CloseableKt.closeFinally(bufferedSourceBuffer, r5);
            Exception exc3 = ilVar.a;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                rd1.o("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z2 || i3 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z2) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i3 > 0) {
                    i = i3;
                    matrix.postRotate(i, width, height);
                } else {
                    i = i3;
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i == 90 || i == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, fh0.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new y10(ig2.f(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedSourceBuffer, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c20
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        kl klVar;
        Semaphore semaphore;
        Throwable th;
        Semaphore semaphore2;
        if (continuationImpl instanceof kl) {
            klVar = (kl) continuationImpl;
            int i = klVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                klVar.d = i - Integer.MIN_VALUE;
            } else {
                klVar = new kl(this, continuationImpl);
            }
        } else {
            klVar = new kl(this, continuationImpl);
        }
        Object obj = klVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = klVar.d;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                semaphore = this.c;
                klVar.a = semaphore;
                klVar.d = 1;
                if (semaphore.acquire(klVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                semaphore2 = klVar.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    y10 y10Var = (y10) obj;
                    semaphore2.release();
                    return y10Var;
                } catch (Throwable th2) {
                    th = th2;
                    semaphore2.release();
                    throw th;
                }
            }
            Semaphore semaphore3 = klVar.a;
            ResultKt.throwOnFailure(obj);
            semaphore = semaphore3;
            c0 c0Var = new c0(this, 8);
            klVar.a = semaphore;
            klVar.d = 2;
            Object objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, c0Var, klVar, 1, null);
            if (objRunInterruptible$default != coroutine_suspended) {
                Semaphore semaphore4 = semaphore;
                obj = objRunInterruptible$default;
                semaphore2 = semaphore4;
                y10 y10Var2 = (y10) obj;
                semaphore2.release();
                return y10Var2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Semaphore semaphore5 = semaphore;
            th = th3;
            semaphore2 = semaphore5;
            semaphore2.release();
            throw th;
        }
    }
}
