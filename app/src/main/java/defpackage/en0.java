package defpackage;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class en0 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ Modifier a(LazyItemScope lazyItemScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f);
    }

    public static /* synthetic */ Rect b(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z);
    }

    public static /* synthetic */ long c(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
            return 0L;
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m4928getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return layoutCoordinates.mo6513localPositionOfS_NoaFU(layoutCoordinates2, j, z);
    }

    public static int d(Measurable measurable, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(measurable.mo6509measureBRTryo0(j));
        return i + i2;
    }

    public static PathBuilder e(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.horizontalLineToRelative(f5);
        return pathBuilder;
    }

    public static String f(Path path, String str) {
        return str + path;
    }

    public static List g(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List h(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List i(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException j(String str) {
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    public static void k(int i, String str) {
        ComposerKt.composeImmediateRuntimeError(str + i);
    }

    public static void l(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
    }

    public static void m(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static /* synthetic */ boolean n(Object obj) {
        return obj != null;
    }

    public static PathBuilder o(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static List p(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List q(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static PathBuilder t(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static List u(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.close();
        pathBuilder.moveTo(f2, f3);
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static PathBuilder x(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
    }
}
