package defpackage;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;

/* JADX INFO: loaded from: classes4.dex */
public final class zr0 extends Painter {
    public final pr0 a;

    public zr0(pr0 pr0Var) {
        this.a = pr0Var;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        pr0 pr0Var = this.a;
        int width = pr0Var.getWidth();
        float f = width > 0 ? width : Float.NaN;
        int height = pr0Var.getHeight();
        return Size.m4972constructorimpl((((long) Float.floatToRawIntBits(height > 0 ? height : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        pr0 pr0Var = this.a;
        int width = pr0Var.getWidth();
        float fIntBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (drawScope.mo5620getSizeNHjbRc() >> 32)) / width : 1.0f;
        int height = pr0Var.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (drawScope.mo5620getSizeNHjbRc() & 4294967295L)) / height : 1.0f;
        long jM4928getZeroF1C5BW0 = Offset.INSTANCE.m4928getZeroF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo5627getSizeNHjbRc = drawContext.mo5627getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5634scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jM4928getZeroF1C5BW0);
            pr0Var.b(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()));
        } finally {
            s01.B(drawContext, jMo5627getSizeNHjbRc);
        }
    }
}
