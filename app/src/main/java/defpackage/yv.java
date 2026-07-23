package defpackage;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;

/* JADX INFO: loaded from: classes4.dex */
public final class yv extends Painter {
    public final Painter a;
    public final ContentScale b;
    public final long c;
    public final TimeSource d;
    public final boolean e;
    public final MutableIntState g;
    public TimeMark h;
    public boolean i;
    public float j;
    public ColorFilter k;
    public Painter l;
    public final long m;

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    public yv(Painter painter, Painter painter2, ContentScale contentScale, long j, boolean z, boolean z2) {
        TimeSource.Monotonic monotonic = TimeSource.Monotonic.INSTANCE;
        this.a = painter2;
        this.b = contentScale;
        this.c = j;
        this.d = monotonic;
        this.e = z;
        this.g = SnapshotIntStateKt.mutableIntStateOf(0);
        this.j = 1.0f;
        this.l = painter;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m4990getZeroNHjbRc();
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.m4990getZeroNHjbRc();
        boolean z3 = intrinsicSize != InlineClassHelperKt.UnspecifiedPackedFloats;
        boolean z4 = intrinsicSize2 != InlineClassHelperKt.UnspecifiedPackedFloats;
        if (z2) {
            if (z4) {
                intrinsicSize = intrinsicSize2;
            } else if (!z3) {
                if (z3) {
                    intrinsicSize = Size.INSTANCE.m4989getUnspecifiedNHjbRc();
                } else {
                    intrinsicSize = Size.INSTANCE.m4989getUnspecifiedNHjbRc();
                }
            }
        } else if (z3 || !z4) {
            intrinsicSize = Size.INSTANCE.m4989getUnspecifiedNHjbRc();
        } else {
            float fMax = Math.max(Float.intBitsToFloat((int) (intrinsicSize >> 32)), Float.intBitsToFloat((int) (intrinsicSize2 >> 32)));
            intrinsicSize = Size.m4972constructorimpl((((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (intrinsicSize & 4294967295L)), Float.intBitsToFloat((int) (intrinsicSize2 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32));
        }
        this.m = intrinsicSize;
    }

    public final void a(DrawScope drawScope, Painter painter, float f) {
        if (painter == null || f <= 0.0f) {
            return;
        }
        long jMo5620getSizeNHjbRc = drawScope.mo5620getSizeNHjbRc();
        long intrinsicSize = painter.getIntrinsicSize();
        long jM6621timesUQTWf7w = (intrinsicSize == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m4983isEmptyimpl(intrinsicSize) || jMo5620getSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m4983isEmptyimpl(jMo5620getSizeNHjbRc)) ? jMo5620getSizeNHjbRc : ScaleFactorKt.m6621timesUQTWf7w(intrinsicSize, this.b.mo6502computeScaleFactorH7hwNQA(intrinsicSize, jMo5620getSizeNHjbRc));
        if (jMo5620getSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m4983isEmptyimpl(jMo5620getSizeNHjbRc)) {
            painter.m5771drawx_KDEd0(drawScope, jM6621timesUQTWf7w, f, this.k);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jMo5620getSizeNHjbRc >> 32)) - Float.intBitsToFloat((int) (jM6621timesUQTWf7w >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jMo5620getSizeNHjbRc & 4294967295L)) - Float.intBitsToFloat((int) (jM6621timesUQTWf7w & 4294967295L))) / 2.0f;
        drawScope.getDrawContext().getTransform().inset(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            painter.m5771drawx_KDEd0(drawScope, jM6621timesUQTWf7w, f, this.k);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.j = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.k = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        boolean z = this.i;
        Painter painter = this.a;
        if (z) {
            a(drawScope, painter, this.j);
            return;
        }
        TimeMark timeMarkMarkNow = this.h;
        if (timeMarkMarkNow == null) {
            timeMarkMarkNow = this.d.markNow();
            this.h = timeMarkMarkNow;
        }
        float fM10166getInWholeMillisecondsimpl = Duration.m10166getInWholeMillisecondsimpl(timeMarkMarkNow.mo10143elapsedNowUwyO8pc()) / Duration.m10166getInWholeMillisecondsimpl(this.c);
        float fCoerceIn = RangesKt.coerceIn(fM10166getInWholeMillisecondsimpl, 0.0f, 1.0f);
        float f = this.j;
        float f2 = fCoerceIn * f;
        if (this.e) {
            f -= f2;
        }
        this.i = fM10166getInWholeMillisecondsimpl >= 1.0f;
        a(drawScope, this.l, f);
        a(drawScope, painter, f2);
        if (this.i) {
            this.l = null;
        } else {
            MutableIntState mutableIntState = this.g;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
        }
    }
}
