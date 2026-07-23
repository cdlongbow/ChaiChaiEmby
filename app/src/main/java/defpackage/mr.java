package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.dh.myembyapp.data.api.DanmakuApiService;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class mr {
    public static void A(Number number, int i, MutableState mutableState) {
        mutableState.setValue(Integer.valueOf(number.intValue() + i));
    }

    public static /* synthetic */ boolean B(List list) {
        return list != null;
    }

    public static String C(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void D(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void E(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void F(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.horizontalLineTo(f3);
    }

    public static void G(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void H(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void I(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static void J(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.close();
    }

    public static void K(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static /* synthetic */ Object L(DanmakuApiService danmakuApiService, String str, String str2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: searchAnime");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return danmakuApiService.searchAnime(str, str2, continuation);
    }

    public static int a(Density density, long j) {
        return Math.round(density.mo419toPxR2X_6o(j));
    }

    public static int b(Density density, float f) {
        float fMo420toPx0680j_4 = density.mo420toPx0680j_4(f);
        if (Float.isInfinite(fMo420toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo420toPx0680j_4);
    }

    public static float c(Density density, float f) {
        return Dp.m7813constructorimpl(f / density.getDensity());
    }

    public static float d(Density density, int i) {
        return Dp.m7813constructorimpl(i / density.getDensity());
    }

    public static long e(Density density, long j) {
        return j != InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m7835DpSizeYgX7TsA(density.mo416toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), density.mo416toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L)))) : DpSize.INSTANCE.m7920getUnspecifiedMYxV2XQ();
    }

    public static float f(Density density, long j) {
        if (!TextUnitType.m8031equalsimpl0(TextUnit.m8002getTypeUIouoOA(j), TextUnitType.INSTANCE.m8036getSpUIouoOA())) {
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return density.mo420toPx0680j_4(density.mo415toDpGaN1DYA(j));
    }

    public static Rect g(Density density, DpRect dpRect) {
        return new Rect(density.mo420toPx0680j_4(dpRect.m7896getLeftD9Ej5fM()), density.mo420toPx0680j_4(dpRect.m7898getTopD9Ej5fM()), density.mo420toPx0680j_4(dpRect.m7897getRightD9Ej5fM()), density.mo420toPx0680j_4(dpRect.m7895getBottomD9Ej5fM()));
    }

    public static long h(Density density, long j) {
        if (j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return Size.INSTANCE.m4989getUnspecifiedNHjbRc();
        }
        float fMo420toPx0680j_4 = density.mo420toPx0680j_4(DpSize.m7911getWidthD9Ej5fM(j));
        float fMo420toPx0680j_5 = density.mo420toPx0680j_4(DpSize.m7909getHeightD9Ej5fM(j));
        return Size.m4972constructorimpl((((long) Float.floatToRawIntBits(fMo420toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo420toPx0680j_5)) & 4294967295L));
    }

    public static long i(Density density, float f) {
        return density.mo422toSp0xMU5do(density.mo416toDpu2uoSUM(f));
    }

    public static long j(Density density, int i) {
        return density.mo422toSp0xMU5do(density.mo417toDpu2uoSUM(i));
    }

    public static float k(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static MutableState l(int i, SnapshotMutationPolicy snapshotMutationPolicy, int i2, Object obj, Composer composer) {
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), snapshotMutationPolicy, i2, obj);
        composer.updateRememberedValue(mutableStateMutableStateOf$default);
        return mutableStateMutableStateOf$default;
    }

    public static MutableState m(boolean z, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj, Composer composer) {
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), snapshotMutationPolicy, i, obj);
        composer.updateRememberedValue(mutableStateMutableStateOf$default);
        return mutableStateMutableStateOf$default;
    }

    public static FocusRequester n(Composer composer) {
        FocusRequester focusRequester = new FocusRequester();
        composer.updateRememberedValue(focusRequester);
        return focusRequester;
    }

    public static PathBuilder o(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static MeasurePolicy p(float f, Arrangement arrangement, Alignment.Horizontal horizontal, Composer composer, int i) {
        return ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(f)), horizontal, composer, i);
    }

    public static MeasurePolicy q(float f, Arrangement arrangement, Alignment.Vertical vertical, Composer composer, int i) {
        return RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(f)), vertical, composer, i);
    }

    public static String r(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String s(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static List u(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.reflectiveCurveToRelative(f, f2, f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException w(String str) {
        ComposerKt.composeRuntimeError(str);
        return new KotlinNothingValueException();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.lineToRelative(f, f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void z(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m4326setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m4326setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
    }
}
