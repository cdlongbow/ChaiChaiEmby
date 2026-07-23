package defpackage;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n72 {
    public static final ColorScheme a;
    public static final ProvidableCompositionLocal b;
    public static final ProvidableCompositionLocal c;
    public static final ProvidableCompositionLocal d;
    public static final ProvidableCompositionLocal e;
    public static final ProvidableCompositionLocal f;
    public static final ProvidableCompositionLocal g;
    public static final ProvidableCompositionLocal h;

    static {
        long jColor = ColorKt.Color(4278217872L);
        Color.Companion companion = Color.INSTANCE;
        a = ColorSchemeKt.m2250lightColorScheme_VG5OTI$default(jColor, companion.m5189getWhite0d7_KjU(), ColorKt.Color(4291949055L), ColorKt.Color(4278197804L), 0L, ColorKt.Color(4281297709L), companion.m5189getWhite0d7_KjU(), ColorKt.Color(4292276688L), ColorKt.Color(4279050508L), ColorKt.Color(4287514974L), companion.m5189getWhite0d7_KjU(), 0L, 0L, xq.b, ColorKt.Color(4279374871L), xq.c, ColorKt.Color(4279374871L), ColorKt.Color(4293389811L), ColorKt.Color(4283128165L), 0L, 0L, 0L, ColorKt.Color(4289930782L), companion.m5189getWhite0d7_KjU(), ColorKt.Color(4294565596L), ColorKt.Color(4282453515L), ColorKt.Color(4285563022L), ColorKt.Color(4290759896L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -264759280, 65535, null);
        b = CompositionLocalKt.staticCompositionLocalOf(new mu1(24));
        c = CompositionLocalKt.staticCompositionLocalOf(new mu1(25));
        d = CompositionLocalKt.staticCompositionLocalOf(new mu1(26));
        e = CompositionLocalKt.staticCompositionLocalOf(new mu1(27));
        f = CompositionLocalKt.staticCompositionLocalOf(new mu1(28));
        g = CompositionLocalKt.staticCompositionLocalOf(new mu1(29));
        h = CompositionLocalKt.staticCompositionLocalOf(new mu1(29));
    }

    public static final void a(AppThemePreset appThemePreset, LightThemeBackgroundStyle lightThemeBackgroundStyle, DarkThemeStyle darkThemeStyle, DarkThemeGlowPosition darkThemeGlowPosition, boolean z, boolean z2, Function2 function2, Composer composer, int i) {
        int i2;
        gb gbVarC;
        char c2;
        ColorScheme colorSchemeM2184copy_VG5OTI$default;
        u61 u61VarA;
        ColorScheme colorSchemeM2184copy_VG5OTI$default2;
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1802090981);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(appThemePreset == null ? -1 : appThemePreset.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(lightThemeBackgroundStyle == null ? -1 : lightThemeBackgroundStyle.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(darkThemeStyle == null ? -1 : darkThemeStyle.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(darkThemeGlowPosition == null ? -1 : darkThemeGlowPosition.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1802090981, i2, -1, "com.dh.myembyapp.ui.theme.MyEmbyAppTheme (Theme.kt:168)");
            }
            int[] iArr = m72.$EnumSwitchMapping$0;
            int i3 = iArr[appThemePreset.ordinal()];
            if (i3 == 1) {
                gbVarC = l72.c(darkThemeStyle);
            } else {
                if (i3 != 2) {
                    qu.f();
                    return;
                }
                gbVarC = l72.d(lightThemeBackgroundStyle);
            }
            int i4 = iArr[appThemePreset.ordinal()];
            long j = 4279374871L;
            if (i4 == 1) {
                j = 4279374871L;
                c2 = 4;
                n00 n00VarB = xq.b(darkThemeStyle);
                long j2 = !z ? xq.d : n00VarB.h;
                Color.Companion companion = Color.INSTANCE;
                colorSchemeM2184copy_VG5OTI$default = ColorScheme.m2184copy_VG5OTI$default(ColorSchemeKt.m2244darkColorScheme_VG5OTI$default(j2, companion.m5189getWhite0d7_KjU(), !z ? xq.f : n00VarB.i, !z ? ColorKt.Color(4294047225L) : n00VarB.j, 0L, !z ? xq.d : n00VarB.k, companion.m5189getWhite0d7_KjU(), !z ? xq.f : n00VarB.l, !z ? ColorKt.Color(4294047225L) : n00VarB.m, !z ? xq.d : n00VarB.n, !z ? companion.m5189getWhite0d7_KjU() : n00VarB.o, 0L, 0L, n00VarB.a, ColorKt.Color(4294375674L), n00VarB.e, ColorKt.Color(4294375674L), n00VarB.f, ColorKt.Color(4291350745L), 0L, 0L, 0L, ColorKt.Color(4293227379L), companion.m5189getWhite0d7_KjU(), ColorKt.Color(4284486672L), ColorKt.Color(4294957782L), !z ? xq.h : n00VarB.p, !z ? xq.i : n00VarB.q, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -264759280, 65535, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, gbVarC.a, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8193, 65535, null);
            } else {
                if (i4 != 2) {
                    qu.f();
                    return;
                }
                if (z) {
                    xz0 xz0VarC = xq.c(lightThemeBackgroundStyle);
                    long j3 = xz0VarC.a;
                    c2 = 4;
                    long j4 = xz0VarC.b;
                    long j5 = xz0VarC.c;
                    long j6 = xz0VarC.d;
                    long j7 = xz0VarC.e;
                    long j8 = xz0VarC.f;
                    long j9 = xz0VarC.g;
                    ColorScheme colorScheme = a;
                    colorSchemeM2184copy_VG5OTI$default2 = ColorScheme.m2184copy_VG5OTI$default(colorScheme, j3, 0L, j4, j5, 0L, j6, 0L, j7, j8, j9, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, colorScheme.getOutline(), colorScheme.getOutlineVariant(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -201327534, 65535, null);
                } else {
                    long j10 = xq.j;
                    Color.Companion companion2 = Color.INSTANCE;
                    long jM5189getWhite0d7_KjU = companion2.m5189getWhite0d7_KjU();
                    long j11 = xq.l;
                    colorSchemeM2184copy_VG5OTI$default2 = ColorScheme.m2184copy_VG5OTI$default(a, j10, jM5189getWhite0d7_KjU, j11, ColorKt.Color(4279374871L), 0L, j10, companion2.m5189getWhite0d7_KjU(), j11, ColorKt.Color(4279374871L), j10, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, xq.n, xq.o, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -201327600, 65535, null);
                    c2 = 4;
                }
                colorSchemeM2184copy_VG5OTI$default = ColorScheme.m2184copy_VG5OTI$default(colorSchemeM2184copy_VG5OTI$default2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, gbVarC.a, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8193, 65535, null);
            }
            int i5 = iArr[appThemePreset.ordinal()];
            if (i5 == 1) {
                u61VarA = xq.a(darkThemeStyle, z);
            } else {
                if (i5 != 2) {
                    qu.f();
                    return;
                }
                lightThemeBackgroundStyle.getClass();
                if (z) {
                    xz0 xz0VarC2 = xq.c(lightThemeBackgroundStyle);
                    u61 u61Var = xq.q;
                    long j12 = u61Var.b;
                    long j13 = u61Var.c;
                    long j14 = xz0VarC2.b;
                    long j15 = xz0VarC2.i;
                    long j16 = xz0VarC2.c;
                    long j17 = xz0VarC2.h;
                    u61VarA = u61.a(u61Var, j12, j13, j14, j15, j16, j14, j15, j16, 0L, 0L, 0L, j14, j15, j16, j17, j15, j17, j15, xz0VarC2.j, xz0VarC2.k, 0L, 0L, 0L, 0L, 0L, 1022950409, 4083);
                } else {
                    u61 u61Var2 = xq.q;
                    long j18 = u61Var2.b;
                    long j19 = u61Var2.c;
                    long j20 = xq.l;
                    long j21 = xq.m;
                    long jColor = ColorKt.Color(j);
                    long jColor2 = ColorKt.Color(j);
                    long jColor3 = ColorKt.Color(j);
                    long jColor4 = ColorKt.Color(j);
                    long j22 = xq.k;
                    long j23 = xq.j;
                    u61VarA = u61.a(u61Var2, j18, j19, j20, j21, jColor, j20, j21, jColor2, j20, j21, jColor3, j20, j21, jColor4, j20, j21, j20, j21, j20, j21, j22, u61Var2.L, j23, j23, j22, 1022893065, 451);
                }
            }
            ProvidedValue providedValueProvides = b.provides(u61VarA);
            ProvidedValue providedValueProvides2 = c.provides(gbVarC);
            ProvidedValue providedValueProvides3 = d.provides(appThemePreset);
            ProvidedValue providedValueProvides4 = e.provides(darkThemeStyle);
            ProvidedValue providedValueProvides5 = f.provides(lightThemeBackgroundStyle);
            ProvidedValue providedValueProvides6 = g.provides(Boolean.valueOf(z));
            ProvidedValue providedValueProvides7 = h.provides(Boolean.valueOf(z2));
            ProvidedValue[] providedValueArr = new ProvidedValue[7];
            providedValueArr[0] = providedValueProvides;
            providedValueArr[1] = providedValueProvides2;
            providedValueArr[2] = providedValueProvides3;
            providedValueArr[3] = providedValueProvides4;
            providedValueArr[c2] = providedValueProvides5;
            providedValueArr[5] = providedValueProvides6;
            providedValueArr[6] = providedValueProvides7;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(365760165, true, new f2(colorSchemeM2184copy_VG5OTI$default, appThemePreset, darkThemeStyle, darkThemeGlowPosition, gbVarC, function2, 4), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mh(appThemePreset, lightThemeBackgroundStyle, darkThemeStyle, darkThemeGlowPosition, z, z2, function2, i));
        }
    }
}
