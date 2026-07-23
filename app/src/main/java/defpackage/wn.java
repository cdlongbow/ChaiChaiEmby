package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.media3.common.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wn {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static void E(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
        pathBuilder.close();
    }

    public static /* synthetic */ Modifier F(ColumnScope columnScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: weight");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return columnScope.weight(modifier, f, z);
    }

    public static /* synthetic */ void a(Canvas canvas, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m5141getIntersectrtfAjoo();
        }
        canvas.mo5006clipPathmtrdDE(path, i);
    }

    public static /* synthetic */ void b(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 16) != 0) {
            i = ClipOp.INSTANCE.m5141getIntersectrtfAjoo();
        }
        canvas.mo5007clipRectN_I0leg(f, f2, f3, f4, i);
    }

    public static /* synthetic */ void c(Canvas canvas, Rect rect, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = ClipOp.INSTANCE.m5141getIntersectrtfAjoo();
        }
        canvas.mo5008clipRectmtrdDE(rect, i);
    }

    public static int d(int i, int i2, Function1 function1) {
        return (function1.hashCode() + i) * i2;
    }

    public static PathBuilder e(float f, float f2) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        return pathBuilder;
    }

    public static PathBuilder f(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static ValueElementSequence g(boolean z, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z));
        return inspectorInfo.getProperties();
    }

    public static Object h(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String i(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static Iterator j(Iterable iterable, Function1 function1) {
        iterable.getClass();
        function1.getClass();
        return iterable.iterator();
    }

    public static List k(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List l(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List m(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List n(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void o(int i, android.graphics.Canvas canvas, int i2, int i3) {
        InlineMarker.finallyStart(i);
        canvas.restoreToCount(i2);
        InlineMarker.finallyEnd(i3);
    }

    public static void p(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void q(Composer composer, Function3 function3, Composer composer2, Integer num, int i) {
        function3.invoke(SkippableUpdater.m4292boximpl(SkippableUpdater.m4293constructorimpl(composer)), composer2, num);
        composer.startReplaceableGroup(i);
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void t(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static PathBuilder u(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.close();
        return pathBuilder;
    }

    public static List v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }
}
