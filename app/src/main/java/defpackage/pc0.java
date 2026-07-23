package defpackage;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class pc0 {
    public static final /* synthetic */ int a = 0;

    static {
        DrawScope.Companion companion = DrawScope.INSTANCE;
    }

    public static long a(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Size.m4972constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static /* synthetic */ void b(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        } else {
            long jM4928getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.INSTANCE.m4928getZeroF1C5BW0() : j2;
            drawScope.mo5601drawArcyD3GUKo(j, f, f2, z, jM4928getZeroF1C5BW0, (i2 & 32) != 0 ? a(drawScope.mo5620getSizeNHjbRc(), jM4928getZeroF1C5BW0) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 256) != 0 ? null : colorFilter, (i2 & 512) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
        }
    }

    public static /* synthetic */ void c(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            return;
        }
        if ((i2 & 2) != 0) {
            f = Size.m4980getMinDimensionimpl(drawScope.mo5620getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo5603drawCircleVaOC9Bg(j, f, (i2 & 4) != 0 ? drawScope.mo5619getCenterF1C5BW0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void d(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        long jM7975constructorimpl;
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            return;
        }
        long jM7948getZeronOccac = (i3 & 2) != 0 ? IntOffset.INSTANCE.m7948getZeronOccac() : j;
        if ((i3 & 4) != 0) {
            jM7975constructorimpl = IntSize.m7975constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32));
        } else {
            jM7975constructorimpl = j2;
        }
        drawScope.mo5605drawImageAZ2fEMs(imageBitmap, jM7948getZeronOccac, jM7975constructorimpl, (i3 & 8) != 0 ? IntOffset.INSTANCE.m7948getZeronOccac() : j3, (i3 & 16) != 0 ? jM7975constructorimpl : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i, (i3 & 512) != 0 ? DrawScope.INSTANCE.m5653getDefaultFilterQualityfv9h1I() : i2);
    }

    public static /* synthetic */ void e(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            drawScope.mo5606drawImagegbVJVH8(imageBitmap, (i2 & 2) != 0 ? Offset.INSTANCE.m4928getZeroF1C5BW0() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
        } else {
            lm.e("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
    }

    public static /* synthetic */ void f(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.mo5607drawLine1RTmtNc(brush, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.m5716getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i2);
        } else {
            lm.e("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
    }

    public static /* synthetic */ void g(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.mo5608drawLineNGM6Ib0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.m5716getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i2);
        } else {
            lm.e("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
    }

    public static /* synthetic */ void h(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            return;
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo5611drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
    }

    public static /* synthetic */ void i(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            return;
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.mo5612drawPathLG529CI(path, j, f2, drawStyle2, colorFilter, (i2 & 32) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
    }

    public static /* synthetic */ void j(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj == null) {
            drawScope.mo5613drawPointsF8ZwMP8(list, i, j, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.INSTANCE.m5503getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i3);
        } else {
            lm.e("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
    }

    public static /* synthetic */ void k(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        } else {
            long jM4928getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m4928getZeroF1C5BW0() : j;
            drawScope.mo5615drawRectAsUm42w(brush, jM4928getZeroF1C5BW0, (i2 & 4) != 0 ? a(drawScope.mo5620getSizeNHjbRc(), jM4928getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
        }
    }

    public static /* synthetic */ void l(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        } else {
            long jM4928getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m4928getZeroF1C5BW0() : j2;
            drawScope.mo5616drawRectnJ9OG0(j, jM4928getZeroF1C5BW0, (i2 & 4) != 0 ? a(drawScope.mo5620getSizeNHjbRc(), jM4928getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
        }
    }

    public static /* synthetic */ void m(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        } else {
            long jM4928getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m4928getZeroF1C5BW0() : j;
            drawScope.mo5617drawRoundRectZuiqVtQ(brush, jM4928getZeroF1C5BW0, (i2 & 4) != 0 ? a(drawScope.mo5620getSizeNHjbRc(), jM4928getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? CornerRadius.INSTANCE.m4884getZerokKHJgLs() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
        }
    }

    public static /* synthetic */ void n(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        } else {
            long jM4928getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m4928getZeroF1C5BW0() : j2;
            drawScope.mo5618drawRoundRectuAw5IA(j, jM4928getZeroF1C5BW0, (i2 & 4) != 0 ? a(drawScope.mo5620getSizeNHjbRc(), jM4928getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? CornerRadius.INSTANCE.m4884getZerokKHJgLs() : j4, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
        }
    }

    public static /* synthetic */ void o(DrawScope drawScope, GraphicsLayer graphicsLayer, long j, Function1 function1, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
            return;
        }
        if ((i & 1) != 0) {
            j = IntSizeKt.m7991toIntSizeuvyYCjk(drawScope.mo5620getSizeNHjbRc());
        }
        drawScope.mo5621recordJVtK1S4(graphicsLayer, j, function1);
    }
}
