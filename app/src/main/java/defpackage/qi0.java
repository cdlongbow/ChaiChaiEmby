package defpackage;

import androidx.compose.foundation.layout.FlowLineMeasurePolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qi0 {
    public static void A(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.lineToRelative(f3, f4);
    }

    public static void B(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void C(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static /* synthetic */ State E(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = FontStyle.INSTANCE.m7395getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = FontSynthesis.INSTANCE.m7405getAllGVVA2EU();
        }
        return resolver.mo7361resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
    }

    public static MeasureResult a(final FlowLineMeasurePolicy flowLineMeasurePolicy, final Placeable[] placeableArr, MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        if (flowLineMeasurePolicy.isHorizontal()) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
        }
        final LayoutDirection layoutDirection = flowLineMeasurePolicy.isHorizontal() ? LayoutDirection.Ltr : measureScope.getLayoutDirection();
        return s01.m(measureScope, i8, i7, null, new Function1() { // from class: yk0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int[] iArr3 = iArr2;
                int i9 = iArr3 != null ? iArr3[i4] : 0;
                int i10 = i5;
                for (int i11 = i10; i11 < i6; i11++) {
                    Placeable placeable = placeableArr[i11];
                    placeable.getClass();
                    FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                    int crossAxisPosition = flowLineMeasurePolicy2.getCrossAxisPosition(placeable, i3, layoutDirection, i) + i9;
                    boolean zIsHorizontal = flowLineMeasurePolicy2.isHorizontal();
                    int[] iArr4 = iArr;
                    if (zIsHorizontal) {
                        Placeable.PlacementScope.place$default(placementScope, placeable, iArr4[i11 - i10], crossAxisPosition, 0.0f, 4, null);
                    } else {
                        Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, iArr4[i11 - i10], 0.0f, 4, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }, 4, null);
    }

    public static float b(FontScaling fontScaling, long j) {
        if (!TextUnitType.m8031equalsimpl0(TextUnit.m8002getTypeUIouoOA(j), TextUnitType.INSTANCE.m8036getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(fontScaling.getFontScale())) {
            return Dp.m7813constructorimpl(fontScaling.getFontScale() * TextUnit.m8003getValueimpl(j));
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(fontScaling.getFontScale());
        if (fontScaleConverterForScale != null) {
            return Dp.m7813constructorimpl(fontScaleConverterForScale.convertSpToDp(TextUnit.m8003getValueimpl(j)));
        }
        return Dp.m7813constructorimpl(fontScaling.getFontScale() * TextUnit.m8003getValueimpl(j));
    }

    public static long c(FontScaling fontScaling, float f) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(fontScaling.getFontScale())) {
            return TextUnitKt.getSp(f / fontScaling.getFontScale());
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(fontScaling.getFontScale());
        return TextUnitKt.getSp(fontScaleConverterForScale != null ? fontScaleConverterForScale.convertDpToSp(f) : f / fontScaling.getFontScale());
    }

    public static /* synthetic */ void d(FocusManager focusManager, boolean z, int i, Object obj) {
        if (obj != null) {
            lm.e("Super calls with default arguments not supported in this target, function: clearFocus");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        focusManager.clearFocus(z);
    }

    public static int e(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static int f(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static PathBuilder g(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static Object h(MutableVector mutableVector, int i) {
        return mutableVector.removeAt(mutableVector.getSize() - i);
    }

    public static StringBuilder i(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function2 function2) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        function2.getClass();
        return new StringBuilder();
    }

    public static StringBuilder j(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function2 function2, CharSequence charSequence4) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence4);
        return sb;
    }

    public static List k(PathBuilder pathBuilder, float f, float f2) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException l() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    public static void m(int i, int i2, Function1 function1) {
        function1.invoke(Integer.valueOf(i + i2));
    }

    public static void n(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.verticalLineTo(f3);
    }

    public static void o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static PathBuilder p(float f, float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.horizontalLineTo(f5);
        return pathBuilder;
    }

    public static void q(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.close();
    }

    public static void r(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineToRelative(f4);
    }

    public static void s(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineTo(f2);
        pathBuilder.verticalLineToRelative(f3);
        pathBuilder.horizontalLineToRelative(f4);
    }

    public static void t(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineToRelative(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.horizontalLineTo(f4);
    }

    public static void u(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.lineTo(f3, f4);
    }

    public static void v(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void w(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineToRelative(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
    }

    public static void y(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineTo(f2);
        pathBuilder.close();
        pathBuilder.moveTo(f3, f4);
    }

    public static void z(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
    }
}
