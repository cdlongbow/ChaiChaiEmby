package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.Velocity;
import androidx.core.util.Predicate;
import java.util.Objects;
import java.util.List;
import kotlin.ULong;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c61 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static /* synthetic */ void E(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj == null) {
            paragraph.mo7098paintLG529CI(canvas, (i2 & 2) != 0 ? Color.INSTANCE.m5188getUnspecified0d7_KjU() : j, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration, (i2 & 16) == 0 ? drawStyle : null, (i2 & 32) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
        } else {
            lm.e("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
    }

    public static /* synthetic */ void F(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
            return;
        }
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        paragraph.mo7100painthn5TExg(canvas, brush, f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? DrawScope.INSTANCE.m5652getDefaultBlendMode0nO6VwU() : i);
    }

    public static kp1 a(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new kp1(predicate, predicate2, 1);
    }

    public static Velocity b() {
        return Velocity.m8038boximpl(Velocity.INSTANCE.m8058getZero9UxMQ8M());
    }

    public static Velocity c() {
        return Velocity.m8038boximpl(Velocity.INSTANCE.m8058getZero9UxMQ8M());
    }

    public static kp1 d(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new kp1(predicate, predicate2, 0);
    }

    public static int e(int i, int i2, Placeable placeable) {
        return (i - placeable.getHeight()) / i2;
    }

    public static long f(long j, long j2) {
        return ULong.m8999constructorimpl(ULong.m8999constructorimpl(j) * j2);
    }

    public static long g(Placeable.PlacementScope placementScope, Placeable placeable, Placeable placeable2, long j) {
        placementScope.handleMotionFrameOfReferencePlacement(placeable);
        return IntOffset.m7941plusqkQi6aY(j, placeable2.apparentToRealOffset);
    }

    public static PathBuilder h(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        return pathBuilder;
    }

    public static String i(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String j(String str, float f) {
        return str + f;
    }

    public static String k(String str, int i, int i2, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String l(String str, long j) {
        return str + j;
    }

    public static String m(String str, Object obj) {
        return (str + obj).toString();
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder o(String str, int i, int i2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static List p(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List q(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void r(Composer composer, int i, Function2 function2) {
        function2.invoke(composer, Integer.valueOf(i));
        composer.endNode();
        composer.endReplaceGroup();
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
    }

    public static void t(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static int u(int i, int i2, Placeable placeable) {
        return (i - placeable.getWidth()) / i2;
    }

    public static PathBuilder v(float f, float f2, float f3, float f4) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
        return pathBuilder;
    }

    public static List w(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static List y(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }
}
