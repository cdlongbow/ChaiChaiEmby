package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tc0 extends Painter implements RememberObserver {
    public final Drawable a;
    public final MutableState b;
    public final MutableState c;
    public final Lazy d;

    public tc0(Drawable drawable) {
        drawable.getClass();
        this.a = drawable;
        this.b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4969boximpl(uc0.a(drawable)), null, 2, null);
        this.d = LazyKt.lazy(new c0(this, 18));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.a.setAlpha(RangesKt.coerceIn(MathKt.roundToInt(f * 255.0f), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        int i = rc0.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            qu.f();
            return false;
        }
        return this.a.setLayoutDirection(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo5765getIntrinsicSizeNHjbRc() {
        return ((Size) this.c.getValue()).m4986unboximpl();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        onForgotten();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        drawScope.getClass();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        ((Number) this.b.getValue()).intValue();
        try {
            canvas.save();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.a;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, MathKt.roundToInt(Size.m4981getWidthimpl(drawScope.mo5620getSizeNHjbRc())), MathKt.roundToInt(Size.m4978getHeightimpl(drawScope.mo5620getSizeNHjbRc())));
            } else {
                canvas.scale(Size.m4981getWidthimpl(drawScope.mo5620getSizeNHjbRc()) / Size.m4981getWidthimpl(mo5765getIntrinsicSizeNHjbRc()), Size.m4978getHeightimpl(drawScope.mo5620getSizeNHjbRc()) / Size.m4978getHeightimpl(mo5765getIntrinsicSizeNHjbRc()));
            }
            drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Drawable drawable = this.a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        Drawable.Callback callback = (Drawable.Callback) this.d.getValue();
        Drawable drawable = this.a;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
