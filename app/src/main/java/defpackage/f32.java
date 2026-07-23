package defpackage;

import android.graphics.ImageDecoder;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public final class f32 implements c20 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final wa1 c;
    public final Semaphore d;

    public f32(ImageDecoder.Source source, AutoCloseable autoCloseable, wa1 wa1Var, Semaphore semaphore) {
        this.a = source;
        this.b = autoCloseable;
        this.c = wa1Var;
        this.d = semaphore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c20
    public final Object a(ContinuationImpl continuationImpl) {
        d32 d32Var;
        Semaphore semaphore;
        if (continuationImpl instanceof d32) {
            d32Var = (d32) continuationImpl;
            int i = d32Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d32Var.d = i - Integer.MIN_VALUE;
            } else {
                d32Var = new d32(this, continuationImpl);
            }
        } else {
            d32Var = new d32(this, continuationImpl);
        }
        Object obj = d32Var.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = d32Var.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Semaphore semaphore2 = this.d;
            d32Var.a = semaphore2;
            d32Var.d = 1;
            if (semaphore2.acquire(d32Var) == coroutine_suspended) {
                return coroutine_suspended;
            }
            semaphore = semaphore2;
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            semaphore = d32Var.a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            AutoCloseable autoCloseable = this.b;
            try {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                y10 y10Var = new y10(new nl(ImageDecoder.decodeBitmap(this.a, new e32(this, booleanRef))), booleanRef.element);
                AutoCloseableKt.closeFinally(autoCloseable, null);
                semaphore.release();
                return y10Var;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            semaphore.release();
            throw th3;
        }
    }
}
