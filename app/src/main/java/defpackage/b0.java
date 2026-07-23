package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b0 {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern a() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ LocaleList b(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan c(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ CompletableFuture d() {
        return new CompletableFuture();
    }

    public static /* synthetic */ void e() {
    }

    public static void f(f51 f51Var) {
        boolean zIsTerminated;
        ExecutorService executorService = f51Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || f51Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            f51Var.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        f51Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void g(i51 i51Var) {
        boolean zIsTerminated;
        ExecutorService executorService = i51Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || i51Var != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            i51Var.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        i51Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void i() {
        if (Build.VERSION.SDK_INT <= 23 || ForkJoinPool.commonPool() != null) {
            throw null;
        }
    }

    public static /* synthetic */ void j(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
