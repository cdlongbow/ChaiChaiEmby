package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class sc0 implements Drawable.Callback {
    public final /* synthetic */ tc0 a;

    public sc0(tc0 tc0Var) {
        this.a = tc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        tc0 tc0Var = this.a;
        MutableState mutableState = tc0Var.b;
        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
        tc0Var.c.setValue(Size.m4969boximpl(uc0.a(tc0Var.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) uc0.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) uc0.a.getValue()).removeCallbacks(runnable);
    }
}
