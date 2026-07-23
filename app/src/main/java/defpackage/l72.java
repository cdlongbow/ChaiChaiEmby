package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l72 {
    public static final gb a = c(DarkThemeStyle.INSTANCE.getDEFAULT());

    public static final void a(final DarkThemeStyle darkThemeStyle, final DarkThemeGlowPosition darkThemeGlowPosition, final Modifier modifier, Composer composer, final int i) {
        int i2;
        final m00 m00Var;
        darkThemeStyle.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(451935557);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(darkThemeStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(darkThemeGlowPosition == null ? -1 : darkThemeGlowPosition.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(451935557, i2, -1, "com.dh.myembyapp.ui.theme.DarkThemeBackgroundLayer (ThemeBackground.kt:93)");
            }
            final n00 n00VarB = xq.b(darkThemeStyle);
            if (darkThemeStyle == DarkThemeStyle.PURE_BLACK) {
                composerStartRestartGroup.startReplaceGroup(-1110035087);
                BoxKt.Box(BackgroundKt.m275backgroundbw27NRU$default(modifier, n00VarB.a, null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i3 = 0;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i72
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    l72.a(darkThemeStyle, darkThemeGlowPosition, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    l72.a(darkThemeStyle, darkThemeGlowPosition, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(-1109931299);
            composerStartRestartGroup.endReplaceGroup();
            int i4 = k72.$EnumSwitchMapping$0[darkThemeGlowPosition.ordinal()];
            if (i4 == 1) {
                m00Var = new m00(0.3f, 0.25f);
            } else if (i4 == 2) {
                m00Var = new m00(0.52f, 0.24f);
            } else {
                if (i4 != 3) {
                    qu.f();
                    return;
                }
                m00Var = new m00(0.72f, 0.26f);
            }
            final long jM5203lerpjxsXWHM = ColorKt.m5203lerpjxsXWHM(n00VarB.b, n00VarB.h, 0.48f);
            boolean zChanged = composerStartRestartGroup.changed(jM5203lerpjxsXWHM) | composerStartRestartGroup.changed(m00Var) | composerStartRestartGroup.changed(n00VarB);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: j72
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                        cacheDrawScope.getClass();
                        float fMax = Math.max(Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() & 4294967295L)));
                        Brush.Companion companion = Brush.INSTANCE;
                        Float fValueOf = Float.valueOf(0.0f);
                        long j = jM5203lerpjxsXWHM;
                        Pair pair = TuplesKt.to(fValueOf, Color.m5142boximpl(Color.m5151copywmQWz5c$default(j, 0.4f, 0.0f, 0.0f, 0.0f, 14, null)));
                        Pair pair2 = TuplesKt.to(Float.valueOf(0.56f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(j, 0.22f, 0.0f, 0.0f, 0.0f, 14, null)));
                        Float fValueOf2 = Float.valueOf(1.0f);
                        Color.Companion companion2 = Color.INSTANCE;
                        Pair[] pairArr = {pair, pair2, TuplesKt.to(fValueOf2, Color.m5142boximpl(companion2.m5187getTransparent0d7_KjU()))};
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() >> 32));
                        m00 m00Var2 = m00Var;
                        float f = fIntBitsToFloat * m00Var2.a;
                        return cacheDrawScope.onDrawBehind(new if1(n00VarB, Brush.Companion.m5110radialGradientP_VxKs$default(companion, pairArr, Offset.m4904constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m4730getSizeNHjbRc() & 4294967295L)) * m00Var2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32)), fMax * 1.08f, 0, 8, (Object) null), Brush.Companion.m5114verticalGradient8A3gB4$default(companion, new Pair[]{TuplesKt.to(fValueOf, Color.m5142boximpl(companion2.m5187getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.58f), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null))), TuplesKt.to(fValueOf2, Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.52f, 0.0f, 0.0f, 0.0f, 14, null)))}, 0.0f, 0.0f, 0, 14, (Object) null), 17));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BoxKt.Box(DrawModifierKt.drawWithCache(modifier, (Function1) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i5 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: i72
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            l72.a(darkThemeStyle, darkThemeGlowPosition, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            l72.a(darkThemeStyle, darkThemeGlowPosition, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final Brush b(gb gbVar) {
        if (gbVar.e) {
            return Brush.Companion.m5108linearGradientmHitzGk$default(Brush.INSTANCE, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m5142boximpl(gbVar.b)), TuplesKt.to(Float.valueOf(gbVar.f), Color.m5142boximpl(gbVar.c)), TuplesKt.to(Float.valueOf(gbVar.g), Color.m5142boximpl(gbVar.d))}, 0L, 0L, 0, 14, (Object) null);
        }
        return null;
    }

    public static final gb c(DarkThemeStyle darkThemeStyle) {
        darkThemeStyle.getClass();
        n00 n00VarB = xq.b(darkThemeStyle);
        long j = n00VarB.h;
        DarkThemeStyle darkThemeStyle2 = DarkThemeStyle.PURE_BLACK;
        long jM5203lerpjxsXWHM = n00VarB.b;
        if (darkThemeStyle != darkThemeStyle2) {
            jM5203lerpjxsXWHM = ColorKt.m5203lerpjxsXWHM(jM5203lerpjxsXWHM, j, 0.16f);
        }
        long j2 = jM5203lerpjxsXWHM;
        long jM5203lerpjxsXWHM2 = n00VarB.c;
        if (darkThemeStyle != darkThemeStyle2) {
            jM5203lerpjxsXWHM2 = ColorKt.m5203lerpjxsXWHM(jM5203lerpjxsXWHM2, j, 0.1f);
        }
        long j3 = jM5203lerpjxsXWHM2;
        long jM5203lerpjxsXWHM3 = n00VarB.d;
        if (darkThemeStyle != darkThemeStyle2) {
            jM5203lerpjxsXWHM3 = ColorKt.m5203lerpjxsXWHM(jM5203lerpjxsXWHM3, j, 0.04f);
        }
        return new gb(n00VarB.a, j2, j3, jM5203lerpjxsXWHM3, darkThemeStyle != darkThemeStyle2, 0.68f);
    }

    public static final gb d(LightThemeBackgroundStyle lightThemeBackgroundStyle) {
        lightThemeBackgroundStyle.getClass();
        switch (k72.$EnumSwitchMapping$1[lightThemeBackgroundStyle.ordinal()]) {
            case 1:
                return new gb(ColorKt.Color(4294967295L), ColorKt.Color(4294967295L), ColorKt.Color(4294967295L), ColorKt.Color(4294967295L), false);
            case 2:
                return new gb(ColorKt.Color(4294047741L), ColorKt.Color(4292275451L), ColorKt.Color(4291684602L), ColorKt.Color(4292670699L), true);
            case 3:
                return new gb(ColorKt.Color(4294964729L), ColorKt.Color(4294565096L), ColorKt.Color(4294107889L), ColorKt.Color(4293521885L), true);
            case 4:
                return new gb(ColorKt.Color(4294374654L), ColorKt.Color(4293056763L), ColorKt.Color(4292666874L), ColorKt.Color(4292801002L), true);
            case 5:
                return new gb(ColorKt.Color(4294245622L), ColorKt.Color(4291947467L), ColorKt.Color(4292866266L), ColorKt.Color(4293981914L), true);
            case 6:
                return new gb(ColorKt.Color(4294965490L), ColorKt.Color(4294893509L), ColorKt.Color(4294895571L), ColorKt.Color(4294963684L), true);
            case 7:
                return new gb(ColorKt.Color(4294964463L), ColorKt.Color(4294825418L), ColorKt.Color(4294828240L), ColorKt.Color(4293912571L), true);
            default:
                qu.f();
                return null;
        }
    }
}
