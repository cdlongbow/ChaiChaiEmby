package defpackage;

import android.app.Notification;
import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vg {
    public static /* synthetic */ int a() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL;
    }

    public static /* synthetic */ Notification.ProgressStyle b() {
        return new Notification.ProgressStyle();
    }

    public static /* synthetic */ BackEvent c(float f, float f2, float f3, int i, long j) {
        return new BackEvent(f, f2, f3, i, j);
    }
}
