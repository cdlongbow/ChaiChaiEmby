package defpackage;

import android.content.SharedPreferences;
import androidx.compose.animation.core.Animation;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UInt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i9 {
    public static List A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static List C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.lineToRelative(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static boolean a(Animation animation, long j) {
        return j >= animation.getDurationNanos();
    }

    public static void b(Applier applier) {
        Object current = applier.getCurrent();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = current instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) current : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.onReuse();
        }
    }

    public static int c(int i, IntRange intRange) {
        return intRange.getEndInclusive().intValue() + i;
    }

    public static int d(UInt uInt, int i) {
        return UInt.m8920constructorimpl(uInt.getData() + i);
    }

    public static PathBuilder e(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static String f(int i, String str) {
        return str + i;
    }

    public static String g(String str, int i, char c) {
        return str + i + c;
    }

    public static String h(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String i(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static ArrayList j(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList k(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static List l(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List m(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List n(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException o(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    public static void p(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void r(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static boolean s(Composer composer) {
        composer.endReplaceGroup();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static List t(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List u(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.lineTo(f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException w(String str) {
        ListUtilsKt.throwNoSuchElementException(str);
        return new KotlinNothingValueException();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
    }

    public static List y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineToRelative(f4);
    }
}
