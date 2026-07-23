package defpackage;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.FavoriteKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material.icons.filled.VideoLibraryKt;
import androidx.compose.material.icons.filled.VpnKeyKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.badlogic.gdx.graphics.GL30;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CharCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e92 {
    public static final float a = Dp.m7813constructorimpl(85.0f);
    public static final float b = Dp.m7813constructorimpl(250.0f);
    public static final long c = ColorKt.Color(4282622023L);
    public static final long d = ColorKt.Color(4288323750L);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final ImageVector imageVector, final boolean z, final rn0 rn0Var, final rn0 rn0Var2, final Function1 function1, Function0 function0, final boolean z2, final boolean z3, final FocusRequester focusRequester, final boolean z4, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function1 function2;
        Function0 function3;
        int i5;
        Composer composer2;
        final Function0 function4;
        final Modifier modifier2;
        Object z5Var;
        MutableState mutableState;
        long jM5187getTransparent0d7_KjU;
        long jM5189getWhite0d7_KjU;
        long jU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-176590822);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(rn0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(rn0Var2.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function2 = function1;
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 |= 1572864;
            function3 = function0;
        } else {
            function3 = function0;
            if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
            }
        }
        if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(focusRequester) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changed(z4) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i5 | 432;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & Input.Keys.NUMPAD_3) == 146) ? false : true, i4 & 1)) {
            Function0 function5 = i6 != 0 ? null : function3;
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-176590822, i4, i7, "com.dh.myembyapp.ui.screens.home.NavButton (TopNavigation.kt:310)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z5 = !zBooleanValue;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue = mutableStateMutableStateOf$default;
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Boolean bool = (Boolean) mutableState2.getValue();
            bool.getClass();
            Boolean boolValueOf = Boolean.valueOf(z4);
            Function0 function6 = function5;
            int i8 = 57344 & i4;
            int i9 = i4 & 7168;
            int i10 = i4;
            boolean z6 = ((i7 & 14) == 4) | ((29360128 & i4) == 8388608) | (i8 == 16384) | (i9 == 2048);
            int i11 = i10 & 458752;
            boolean z7 = z6 | (i11 == 131072);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue3 == companion2.getEmpty()) {
                z5Var = new z5(z4, z2, rn0Var2, rn0Var, function2, mutableState2, mutableState3, null, 1);
                mutableState = mutableState2;
                composerStartRestartGroup.updateRememberedValue(z5Var);
            } else {
                z5Var = objRememberedValue3;
                mutableState = mutableState2;
            }
            EffectsKt.LaunchedEffect(bool, boolValueOf, (Function2) z5Var, composerStartRestartGroup, (i7 << 3) & Input.Keys.FORWARD_DEL);
            boolean z8 = rn0Var == rn0Var2 || z4;
            if (z3) {
                jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
            } else {
                jM5187getTransparent0d7_KjU = z ? u61Var.I : u61Var.G;
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(40.0f)), Dp.m7813constructorimpl(85.0f)), focusRequester);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new b42(7, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue4);
            boolean z9 = (i7 & Input.Keys.FORWARD_DEL) == 32;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new c92();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue5);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            if (!z8) {
                jM5189getWhite0d7_KjU = jM5187getTransparent0d7_KjU;
            } else if (zBooleanValue) {
                jM5189getWhite0d7_KjU = z ? u61Var.J : u61Var.H;
            } else {
                jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface();
            if (zBooleanValue) {
                jU = kb0.u(composerStartRestartGroup, 2095016803, materialTheme, composerStartRestartGroup, i12);
            } else {
                composerStartRestartGroup.startReplaceGroup(2095015243);
                composerStartRestartGroup.endReplaceGroup();
                jU = ColorKt.Color(4279308561L);
            }
            int i13 = ButtonDefaults.$stable;
            MutableState mutableState4 = mutableState;
            ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(jM5187getTransparent0d7_KjU, onSurface, jM5189getWhite0d7_KjU, jU, 0L, 0L, 0L, 0L, composerStartRestartGroup, i13 << 24, PsExtractor.VIDEO_STREAM_MASK);
            ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, z8 ? 1.05f : 1.0f, 0.0f, 0.0f, 0.0f, 29, null);
            ButtonGlow buttonGlowA = z8 ? el0.a(u61Var) : ButtonDefaults.glow$default(buttonDefaults, null, null, null, 7, null);
            ButtonBorder buttonBorderBorder = buttonDefaults.border(null, z8 ? new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null) : new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i13 << 15, 29);
            PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f));
            boolean z10 = (i8 == 16384) | (i9 == 2048) | ((i10 & 3670016) == 1048576) | (i11 == 131072);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new gh(17, rn0Var2, rn0Var, function6, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue6, modifierOnPreviewKeyEvent, null, false, buttonScaleScale$default, buttonGlowA, null, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-2055275478, true, new x4(imageVector, z8, z5, z, str, mutableState4, 1), composerStartRestartGroup, 54), composer2, 0, 390, 2380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
            function4 = function6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function4 = function3;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: b92
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    e92.a(str, imageVector, z, rn0Var, rn0Var2, function1, function4, z2, z3, focusRequester, z4, modifier2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:125:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:144:0x0206  */
    /* JADX WARN: Code duplicated, block: B:147:0x0218  */
    /* JADX WARN: Code duplicated, block: B:148:0x0223  */
    /* JADX WARN: Code duplicated, block: B:151:0x0230  */
    /* JADX WARN: Code duplicated, block: B:152:0x023c  */
    /* JADX WARN: Code duplicated, block: B:155:0x024a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0256  */
    /* JADX WARN: Code duplicated, block: B:159:0x0261  */
    /* JADX WARN: Code duplicated, block: B:162:0x0273  */
    /* JADX WARN: Code duplicated, block: B:165:0x0297  */
    /* JADX WARN: Code duplicated, block: B:166:0x029e  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:184:0x0304  */
    /* JADX WARN: Code duplicated, block: B:186:0x030a  */
    /* JADX WARN: Code duplicated, block: B:192:0x031b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0326  */
    /* JADX WARN: Code duplicated, block: B:199:0x0342 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x0344  */
    /* JADX WARN: Code duplicated, block: B:202:0x034d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0350  */
    /* JADX WARN: Code duplicated, block: B:206:0x0360  */
    /* JADX WARN: Code duplicated, block: B:208:0x0375  */
    /* JADX WARN: Code duplicated, block: B:211:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:213:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:216:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:218:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:220:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:221:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:224:0x0477  */
    /* JADX WARN: Code duplicated, block: B:226:0x0482  */
    /* JADX WARN: Code duplicated, block: B:229:0x0495  */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    public static final void b(String str, String str2, Integer num, Function0 function0, Function0 function1, Function0 function2, boolean z, boolean z2, FocusRequester focusRequester, Function1 function3, Modifier modifier, Composer composer, int i, int i2, int i3) {
        int i4;
        Integer num2;
        int i5;
        Function0 function4;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        Composer composer2;
        Function0 function5;
        Modifier modifier2;
        Integer num3;
        Function0 function6;
        Function1 function7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function0 function8;
        Function1 function9;
        Function1 function10;
        Function0 function11;
        Modifier modifier3;
        Object objRememberedValue;
        u61 u61Var;
        boolean zBooleanValue;
        int i10;
        Object objRememberedValue2;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        MutableState mutableState;
        Object objRememberedValue4;
        MutableState mutableState2;
        Object objRememberedValue5;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        MutableState mutableState3;
        Object objRememberedValue6;
        MutableState mutableState4;
        long jM5187getTransparent0d7_KjU;
        Object objRememberedValue7;
        long j;
        Modifier modifierFocusRequester;
        boolean z4;
        Object objRememberedValue8;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        boolean z5;
        boolean zChangedInstance;
        Object objRememberedValue9;
        Function0 function12;
        ButtonDefaults buttonDefaults;
        long j2;
        MaterialTheme materialTheme;
        int i11;
        long onSecondary;
        float f;
        ButtonGlow buttonGlowGlow$default;
        Border border;
        long jM5189getWhite0d7_KjU;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        str.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(374056362);
        if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 == 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                num2 = num;
                i4 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i4 |= i16;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32) == 0 || !composerStartRestartGroup.changedInstance(function2)) {
                        i15 = 65536;
                    } else {
                        i15 = 131072;
                    }
                    i4 |= i15;
                }
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i4 |= i14;
                }
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(focusRequester)) {
                        i12 = 67108864;
                    } else {
                        i12 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i4 |= i12;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i4 |= i8;
                }
                i9 = i2 | 6;
                if ((i4 & 306783379) == 306783378 || (i9 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i17 != 0) {
                            num2 = null;
                        }
                        if (i5 != 0) {
                            function4 = null;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            function8 = function4;
                        } else {
                            function8 = function2;
                        }
                        if (i7 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new y82(0);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function9 = (Function1) objRememberedValue;
                        } else {
                            function9 = function3;
                        }
                        function10 = function9;
                        function11 = function4;
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        function8 = function2;
                        function10 = function3;
                        modifier3 = modifier;
                        function11 = function4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(374056362, i4, i9, "com.dh.myembyapp.ui.screens.home.ServerButton (TopNavigation.kt:453)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                    }
                    u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                    }
                    zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i10 = i4;
                    boolean z6 = !zBooleanValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue2;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        snapshotMutationPolicy = null;
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        snapshotMutationPolicy = null;
                    }
                    mutableState = (MutableState) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    mutableState2 = (MutableState) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        snapshotMutationPolicy2 = null;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        snapshotMutationPolicy2 = null;
                    }
                    mutableState3 = (MutableState) objRememberedValue5;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState4 = (MutableState) objRememberedValue6;
                    if (z2) {
                        jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
                    } else {
                        jM5187getTransparent0d7_KjU = u61Var.G;
                    }
                    Unit unit = Unit.INSTANCE;
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    j = jM5187getTransparent0d7_KjU;
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new y1(mutableState2, mutableState3, mutableState4, 7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 54);
                    Modifier modifierM1070widthInVpY3zN4 = SizeKt.m1070widthInVpY3zN4(SizeKt.m1050height3ABfNKs(modifier3, Dp.m7813constructorimpl(42.0f)), a, b);
                    if (focusRequester != null) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
                    } else {
                        modifierFocusRequester = Modifier.INSTANCE;
                    }
                    Modifier modifierThen = modifierM1070widthInVpY3zN4.then(modifierFocusRequester);
                    if ((i10 & 1879048192) == 536870912) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new j1(function10, mutableState, mutableState2, mutableState3, mutableState4, 12);
                        mutableState5 = mutableState2;
                        mutableState6 = mutableState3;
                        mutableState7 = mutableState4;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        mutableState7 = mutableState4;
                        mutableState5 = mutableState2;
                        mutableState6 = mutableState3;
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen, (Function1) objRememberedValue8);
                    if ((i10 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zChangedInstance = z5 | composerStartRestartGroup.changedInstance(coroutineScope) | ((((i10 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composerStartRestartGroup.changed(function8)) || (i10 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue9 == companion.getEmpty()) {
                        Function0 function13 = function8;
                        objRememberedValue9 = new d92(function11, coroutineScope, mutableState5, mutableState6, mutableState7, function13);
                        function12 = function13;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function12 = function8;
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue9);
                    buttonDefaults = ButtonDefaults.INSTANCE;
                    if (z) {
                        if (zBooleanValue) {
                            jM5189getWhite0d7_KjU = u61Var.K;
                        } else {
                            jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                        }
                        j2 = jM5189getWhite0d7_KjU;
                    } else {
                        j2 = j;
                    }
                    materialTheme = MaterialTheme.INSTANCE;
                    i11 = MaterialTheme.$stable;
                    long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSurface();
                    if (zBooleanValue) {
                        composerStartRestartGroup.startReplaceGroup(-1922379309);
                        onSecondary = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSecondary();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1922434489);
                        composerStartRestartGroup.endReplaceGroup();
                        onSecondary = ColorKt.Color(4279308561L);
                    }
                    long j3 = onSecondary;
                    int i18 = ButtonDefaults.$stable;
                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(j, onSurface, j2, j3, 0L, 0L, 0L, 0L, composerStartRestartGroup, i18 << 24, PsExtractor.VIDEO_STREAM_MASK);
                    composer2 = composerStartRestartGroup;
                    if (z) {
                        f = 1.05f;
                    } else {
                        f = 1.0f;
                    }
                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, f, 0.0f, 0.0f, 0.0f, 29, null);
                    if (z) {
                        buttonGlowGlow$default = el0.a(u61Var);
                    } else {
                        buttonGlowGlow$default = ButtonDefaults.glow$default(buttonDefaults, null, null, null, 7, null);
                    }
                    ButtonGlow buttonGlow = buttonGlowGlow$default;
                    if (z) {
                        border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null);
                    } else {
                        border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), 0.0f, null, 6, null);
                    }
                    Integer num4 = num2;
                    Modifier modifier4 = modifier3;
                    Function1 function14 = function10;
                    ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnPreviewKeyEvent, null, false, buttonScaleScale$default, buttonGlow, null, buttonColorsM8228colorsoq7We08, 0.0f, buttonDefaults.border(null, border, null, null, null, composer2, i18 << 15, 29), PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(3.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1144869446, true, new a42(num4, str, str2, z, z6, mutableState), composer2, 54), composer2, (i10 >> 9) & 14, 390, 2380);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function7 = function14;
                    num3 = num4;
                    function5 = function12;
                    function6 = function11;
                    modifier2 = modifier4;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function5 = function2;
                    modifier2 = modifier;
                    num3 = num2;
                    function6 = function4;
                    function7 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new aw1(str, str2, num3, function0, function6, function5, z, z2, focusRequester, function7, modifier2, i, i2, i3));
                }
            }
            i4 |= 24576;
            function4 = function1;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i3 & 32) == 0) {
                    i15 = 65536;
                } else {
                    i15 = 65536;
                }
                i4 |= i15;
            }
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(focusRequester)) {
                    i12 = 67108864;
                } else {
                    i12 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i4 |= i12;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i4 |= i8;
            }
            i9 = i2 | 6;
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function8 = function4;
                    } else {
                        function8 = function2;
                    }
                    if (i7 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new y82(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function9 = (Function1) objRememberedValue;
                    } else {
                        function9 = function3;
                    }
                    function10 = function9;
                    function11 = function4;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function8 = function4;
                    } else {
                        function8 = function2;
                    }
                    if (i7 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new y82(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function9 = (Function1) objRememberedValue;
                    } else {
                        function9 = function3;
                    }
                    function10 = function9;
                    function11 = function4;
                    modifier3 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(374056362, i4, i9, "com.dh.myembyapp.ui.screens.home.ServerButton (TopNavigation.kt:453)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i10 = i4;
                boolean z7 = !zBooleanValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                coroutineScope = (CoroutineScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    snapshotMutationPolicy = null;
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotMutationPolicy = null;
                }
                mutableState = (MutableState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState2 = (MutableState) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    snapshotMutationPolicy2 = null;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    snapshotMutationPolicy2 = null;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                if (z2) {
                    jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
                } else {
                    jM5187getTransparent0d7_KjU = u61Var.G;
                }
                Unit unit2 = Unit.INSTANCE;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                j = jM5187getTransparent0d7_KjU;
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new y1(mutableState2, mutableState3, mutableState4, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 54);
                Modifier modifierM1070widthInVpY3zN5 = SizeKt.m1070widthInVpY3zN4(SizeKt.m1050height3ABfNKs(modifier3, Dp.m7813constructorimpl(42.0f)), a, b);
                if (focusRequester != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
                } else {
                    modifierFocusRequester = Modifier.INSTANCE;
                }
                Modifier modifierThen2 = modifierM1070widthInVpY3zN5.then(modifierFocusRequester);
                if ((i10 & 1879048192) == 536870912) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z4) {
                    objRememberedValue8 = new j1(function10, mutableState, mutableState2, mutableState3, mutableState4, 12);
                    mutableState5 = mutableState2;
                    mutableState6 = mutableState3;
                    mutableState7 = mutableState4;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new j1(function10, mutableState, mutableState2, mutableState3, mutableState4, 12);
                    mutableState5 = mutableState2;
                    mutableState6 = mutableState3;
                    mutableState7 = mutableState4;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierThen2, (Function1) objRememberedValue8);
                if ((i10 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zChangedInstance = z5 | composerStartRestartGroup.changedInstance(coroutineScope) | ((((i10 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composerStartRestartGroup.changed(function8)) || (i10 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    Function0 function15 = function8;
                    objRememberedValue9 = new d92(function11, coroutineScope, mutableState5, mutableState6, mutableState7, function15);
                    function12 = function15;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    Function0 function16 = function8;
                    objRememberedValue9 = new d92(function11, coroutineScope, mutableState5, mutableState6, mutableState7, function16);
                    function12 = function16;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Modifier modifierOnPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged2, (Function1) objRememberedValue9);
                buttonDefaults = ButtonDefaults.INSTANCE;
                if (z) {
                    if (zBooleanValue) {
                        jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                    } else {
                        jM5189getWhite0d7_KjU = u61Var.K;
                    }
                    j2 = jM5189getWhite0d7_KjU;
                } else {
                    j2 = j;
                }
                materialTheme = MaterialTheme.INSTANCE;
                i11 = MaterialTheme.$stable;
                long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSurface();
                if (zBooleanValue) {
                    composerStartRestartGroup.startReplaceGroup(-1922434489);
                    composerStartRestartGroup.endReplaceGroup();
                    onSecondary = ColorKt.Color(4279308561L);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1922379309);
                    onSecondary = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSecondary();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j4 = onSecondary;
                int i19 = ButtonDefaults.$stable;
                ButtonColors buttonColorsM8228colorsoq7We09 = buttonDefaults.m8228colorsoq7We08(j, onSurface2, j2, j4, 0L, 0L, 0L, 0L, composerStartRestartGroup, i19 << 24, PsExtractor.VIDEO_STREAM_MASK);
                composer2 = composerStartRestartGroup;
                if (z) {
                    f = 1.05f;
                } else {
                    f = 1.0f;
                }
                ButtonScale buttonScaleScale$default2 = ButtonDefaults.scale$default(buttonDefaults, 0.0f, f, 0.0f, 0.0f, 0.0f, 29, null);
                if (z) {
                    buttonGlowGlow$default = el0.a(u61Var);
                } else {
                    buttonGlowGlow$default = ButtonDefaults.glow$default(buttonDefaults, null, null, null, 7, null);
                }
                ButtonGlow buttonGlow2 = buttonGlowGlow$default;
                if (z) {
                    border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null);
                } else {
                    border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), 0.0f, null, 6, null);
                }
                Integer num5 = num2;
                Modifier modifier5 = modifier3;
                Function1 function17 = function10;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnPreviewKeyEvent2, null, false, buttonScaleScale$default2, buttonGlow2, null, buttonColorsM8228colorsoq7We09, 0.0f, buttonDefaults.border(null, border, null, null, null, composer2, i19 << 15, 29), PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(3.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1144869446, true, new a42(num5, str, str2, z, z7, mutableState), composer2, 54), composer2, (i10 >> 9) & 14, 390, 2380);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function17;
                num3 = num5;
                function5 = function12;
                function6 = function11;
                modifier2 = modifier5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function5 = function2;
                modifier2 = modifier;
                num3 = num2;
                function6 = function4;
                function7 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new aw1(str, str2, num3, function0, function6, function5, z, z2, focusRequester, function7, modifier2, i, i2, i3));
            }
        }
        i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        num2 = num;
        if ((i & 3072) != 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i4 |= i16;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                function4 = function1;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i3 & 32) == 0) {
                    i15 = 65536;
                } else {
                    i15 = 65536;
                }
                i4 |= i15;
            }
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i4 |= i14;
            }
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(focusRequester)) {
                    i12 = 67108864;
                } else {
                    i12 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i4 |= i12;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i4 |= i8;
            }
            i9 = i2 | 6;
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function8 = function4;
                    } else {
                        function8 = function2;
                    }
                    if (i7 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new y82(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function9 = (Function1) objRememberedValue;
                    } else {
                        function9 = function3;
                    }
                    function10 = function9;
                    function11 = function4;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    if (i17 != 0) {
                        num2 = null;
                    }
                    if (i5 != 0) {
                        function4 = null;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        function8 = function4;
                    } else {
                        function8 = function2;
                    }
                    if (i7 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new y82(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function9 = (Function1) objRememberedValue;
                    } else {
                        function9 = function3;
                    }
                    function10 = function9;
                    function11 = function4;
                    modifier3 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(374056362, i4, i9, "com.dh.myembyapp.ui.screens.home.ServerButton (TopNavigation.kt:453)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                }
                zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i10 = i4;
                boolean z8 = !zBooleanValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                coroutineScope = (CoroutineScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    snapshotMutationPolicy = null;
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    snapshotMutationPolicy = null;
                }
                mutableState = (MutableState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState2 = (MutableState) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    snapshotMutationPolicy2 = null;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    snapshotMutationPolicy2 = null;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                if (z2) {
                    jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
                } else {
                    jM5187getTransparent0d7_KjU = u61Var.G;
                }
                Unit unit3 = Unit.INSTANCE;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                j = jM5187getTransparent0d7_KjU;
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new y1(mutableState2, mutableState3, mutableState4, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.DisposableEffect(unit3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 54);
                Modifier modifierM1070widthInVpY3zN6 = SizeKt.m1070widthInVpY3zN4(SizeKt.m1050height3ABfNKs(modifier3, Dp.m7813constructorimpl(42.0f)), a, b);
                if (focusRequester != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
                } else {
                    modifierFocusRequester = Modifier.INSTANCE;
                }
                Modifier modifierThen3 = modifierM1070widthInVpY3zN6.then(modifierFocusRequester);
                if ((i10 & 1879048192) == 536870912) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z4) {
                    objRememberedValue8 = new j1(function10, mutableState, mutableState2, mutableState3, mutableState4, 12);
                    mutableState5 = mutableState2;
                    mutableState6 = mutableState3;
                    mutableState7 = mutableState4;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new j1(function10, mutableState, mutableState2, mutableState3, mutableState4, 12);
                    mutableState5 = mutableState2;
                    mutableState6 = mutableState3;
                    mutableState7 = mutableState4;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifierThen3, (Function1) objRememberedValue8);
                if ((i10 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zChangedInstance = z5 | composerStartRestartGroup.changedInstance(coroutineScope) | ((((i10 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composerStartRestartGroup.changed(function8)) || (i10 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    Function0 function18 = function8;
                    objRememberedValue9 = new d92(function11, coroutineScope, mutableState5, mutableState6, mutableState7, function18);
                    function12 = function18;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    Function0 function19 = function8;
                    objRememberedValue9 = new d92(function11, coroutineScope, mutableState5, mutableState6, mutableState7, function19);
                    function12 = function19;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Modifier modifierOnPreviewKeyEvent3 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged3, (Function1) objRememberedValue9);
                buttonDefaults = ButtonDefaults.INSTANCE;
                if (z) {
                    if (zBooleanValue) {
                        jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                    } else {
                        jM5189getWhite0d7_KjU = u61Var.K;
                    }
                    j2 = jM5189getWhite0d7_KjU;
                } else {
                    j2 = j;
                }
                materialTheme = MaterialTheme.INSTANCE;
                i11 = MaterialTheme.$stable;
                long onSurface3 = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSurface();
                if (zBooleanValue) {
                    composerStartRestartGroup.startReplaceGroup(-1922434489);
                    composerStartRestartGroup.endReplaceGroup();
                    onSecondary = ColorKt.Color(4279308561L);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1922379309);
                    onSecondary = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSecondary();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j5 = onSecondary;
                int i110 = ButtonDefaults.$stable;
                ButtonColors buttonColorsM8228colorsoq7We010 = buttonDefaults.m8228colorsoq7We08(j, onSurface3, j2, j5, 0L, 0L, 0L, 0L, composerStartRestartGroup, i110 << 24, PsExtractor.VIDEO_STREAM_MASK);
                composer2 = composerStartRestartGroup;
                if (z) {
                    f = 1.05f;
                } else {
                    f = 1.0f;
                }
                ButtonScale buttonScaleScale$default3 = ButtonDefaults.scale$default(buttonDefaults, 0.0f, f, 0.0f, 0.0f, 0.0f, 29, null);
                if (z) {
                    buttonGlowGlow$default = el0.a(u61Var);
                } else {
                    buttonGlowGlow$default = ButtonDefaults.glow$default(buttonDefaults, null, null, null, 7, null);
                }
                ButtonGlow buttonGlow3 = buttonGlowGlow$default;
                if (z) {
                    border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null);
                } else {
                    border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), 0.0f, null, 6, null);
                }
                Integer num6 = num2;
                Modifier modifier6 = modifier3;
                Function1 function110 = function10;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnPreviewKeyEvent3, null, false, buttonScaleScale$default3, buttonGlow3, null, buttonColorsM8228colorsoq7We010, 0.0f, buttonDefaults.border(null, border, null, null, null, composer2, i110 << 15, 29), PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(3.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1144869446, true, new a42(num6, str, str2, z, z8, mutableState), composer2, 54), composer2, (i10 >> 9) & 14, 390, 2380);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function7 = function110;
                num3 = num6;
                function5 = function12;
                function6 = function11;
                modifier2 = modifier6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function5 = function2;
                modifier2 = modifier;
                num3 = num2;
                function6 = function4;
                function7 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new aw1(str, str2, num3, function0, function6, function5, z, z2, focusRequester, function7, modifier2, i, i2, i3));
            }
        }
        i4 |= 24576;
        function4 = function1;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            if ((i3 & 32) == 0) {
                i15 = 65536;
            } else {
                i15 = 65536;
            }
            i4 |= i15;
        }
        if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i4 |= i14;
        }
        if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i4 |= i13;
        }
        if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changed(focusRequester)) {
                i12 = 67108864;
            } else {
                i12 = GroupFlagsKt.HasAuxSlotFlag;
            }
            i4 |= i12;
        }
        i7 = i3 & 512;
        if (i7 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        i9 = i2 | 6;
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    num2 = null;
                }
                if (i5 != 0) {
                    function4 = null;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    function8 = function4;
                } else {
                    function8 = function2;
                }
                if (i7 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new y82(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function9 = (Function1) objRememberedValue;
                } else {
                    function9 = function3;
                }
                function10 = function9;
                function11 = function4;
                modifier3 = Modifier.INSTANCE;
            } else {
                if (i17 != 0) {
                    num2 = null;
                }
                if (i5 != 0) {
                    function4 = null;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    function8 = function4;
                } else {
                    function8 = function2;
                }
                if (i7 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new y82(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function9 = (Function1) objRememberedValue;
                } else {
                    function9 = function3;
                }
                function10 = function9;
                function11 = function4;
                modifier3 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(374056362, i4, i9, "com.dh.myembyapp.ui.screens.home.ServerButton (TopNavigation.kt:453)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
            }
            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i10 = i4;
            boolean z9 = !zBooleanValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            coroutineScope = (CoroutineScope) objRememberedValue2;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                snapshotMutationPolicy = null;
            }
            mutableState = (MutableState) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mutableState2 = (MutableState) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                snapshotMutationPolicy2 = null;
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                snapshotMutationPolicy2 = null;
            }
            mutableState3 = (MutableState) objRememberedValue5;
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState4 = (MutableState) objRememberedValue6;
            if (z2) {
                jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
            } else {
                jM5187getTransparent0d7_KjU = u61Var.G;
            }
            Unit unit4 = Unit.INSTANCE;
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            j = jM5187getTransparent0d7_KjU;
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new y1(mutableState2, mutableState3, mutableState4, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.DisposableEffect(unit4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 54);
            Modifier modifierM1070widthInVpY3zN7 = SizeKt.m1070widthInVpY3zN4(SizeKt.m1050height3ABfNKs(modifier3, Dp.m7813constructorimpl(42.0f)), a, b);
            if (focusRequester != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
            } else {
                modifierFocusRequester = Modifier.INSTANCE;
            }
            Modifier modifierThen4 = modifierM1070widthInVpY3zN7.then(modifierFocusRequester);
            if ((i10 & 1879048192) == 536870912) {
                z4 = true;
            } else {
                z4 = false;
            }
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z4) {
                objRememberedValue8 = new j1(function10, mutableState, mutableState2, mutableState3, mutableState4, 12);
                mutableState5 = mutableState2;
                mutableState6 = mutableState3;
                mutableState7 = mutableState4;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new j1(function10, mutableState, mutableState2, mutableState3, mutableState4, 12);
                mutableState5 = mutableState2;
                mutableState6 = mutableState3;
                mutableState7 = mutableState4;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Modifier modifierOnFocusChanged4 = FocusChangedModifierKt.onFocusChanged(modifierThen4, (Function1) objRememberedValue8);
            if ((i10 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            zChangedInstance = z5 | composerStartRestartGroup.changedInstance(coroutineScope) | ((((i10 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composerStartRestartGroup.changed(function8)) || (i10 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072);
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                Function0 function111 = function8;
                objRememberedValue9 = new d92(function11, coroutineScope, mutableState5, mutableState6, mutableState7, function111);
                function12 = function111;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                Function0 function112 = function8;
                objRememberedValue9 = new d92(function11, coroutineScope, mutableState5, mutableState6, mutableState7, function112);
                function12 = function112;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Modifier modifierOnPreviewKeyEvent4 = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged4, (Function1) objRememberedValue9);
            buttonDefaults = ButtonDefaults.INSTANCE;
            if (z) {
                if (zBooleanValue) {
                    jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                } else {
                    jM5189getWhite0d7_KjU = u61Var.K;
                }
                j2 = jM5189getWhite0d7_KjU;
            } else {
                j2 = j;
            }
            materialTheme = MaterialTheme.INSTANCE;
            i11 = MaterialTheme.$stable;
            long onSurface4 = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSurface();
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceGroup(-1922434489);
                composerStartRestartGroup.endReplaceGroup();
                onSecondary = ColorKt.Color(4279308561L);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1922379309);
                onSecondary = materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnSecondary();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j6 = onSecondary;
            int i111 = ButtonDefaults.$stable;
            ButtonColors buttonColorsM8228colorsoq7We011 = buttonDefaults.m8228colorsoq7We08(j, onSurface4, j2, j6, 0L, 0L, 0L, 0L, composerStartRestartGroup, i111 << 24, PsExtractor.VIDEO_STREAM_MASK);
            composer2 = composerStartRestartGroup;
            if (z) {
                f = 1.05f;
            } else {
                f = 1.0f;
            }
            ButtonScale buttonScaleScale$default4 = ButtonDefaults.scale$default(buttonDefaults, 0.0f, f, 0.0f, 0.0f, 0.0f, 29, null);
            if (z) {
                buttonGlowGlow$default = el0.a(u61Var);
            } else {
                buttonGlowGlow$default = ButtonDefaults.glow$default(buttonDefaults, null, null, null, 7, null);
            }
            ButtonGlow buttonGlow4 = buttonGlowGlow$default;
            if (z) {
                border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null);
            } else {
                border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), 0.0f, null, 6, null);
            }
            Integer num7 = num2;
            Modifier modifier7 = modifier3;
            Function1 function113 = function10;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnPreviewKeyEvent4, null, false, buttonScaleScale$default4, buttonGlow4, null, buttonColorsM8228colorsoq7We011, 0.0f, buttonDefaults.border(null, border, null, null, null, composer2, i111 << 15, 29), PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(3.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1144869446, true, new a42(num7, str, str2, z, z9, mutableState), composer2, 54), composer2, (i10 >> 9) & 14, 390, 2380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function113;
            num3 = num7;
            function5 = function12;
            function6 = function11;
            modifier2 = modifier7;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function5 = function2;
            modifier2 = modifier;
            num3 = num2;
            function6 = function4;
            function7 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new aw1(str, str2, num3, function0, function6, function5, z, z2, focusRequester, function7, modifier2, i, i2, i3));
        }
    }

    public static final void c(ImageVector imageVector, Function0 function0, boolean z, boolean z2, boolean z3, FocusRequester focusRequester, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        long jM5189getWhite0d7_KjU;
        long jU;
        imageVector.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1939969201);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed("设置") ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1939969201, i3, -1, "com.dh.myembyapp.ui.screens.home.TopNavIconButton (TopNavigation.kt:634)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z4 = !zBooleanValue;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            long jM5187getTransparent0d7_KjU = z2 ? Color.INSTANCE.m5187getTransparent0d7_KjU() : u61Var.G;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(40.0f));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new b42(8, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierThen = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue2).then(focusRequester != null ? FocusRequesterModifierKt.focusRequester(companion, focusRequester) : companion);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            ButtonShape buttonShapeShape$default = ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null);
            if (z) {
                jM5189getWhite0d7_KjU = !zBooleanValue ? Color.INSTANCE.m5189getWhite0d7_KjU() : u61Var.H;
            } else {
                jM5189getWhite0d7_KjU = jM5187getTransparent0d7_KjU;
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            if (zBooleanValue) {
                jU = kb0.u(composerStartRestartGroup, 294648186, materialTheme, composerStartRestartGroup, i4);
            } else {
                composerStartRestartGroup.startReplaceGroup(294646626);
                composerStartRestartGroup.endReplaceGroup();
                jU = ColorKt.Color(4279308561L);
            }
            int i5 = ButtonDefaults.$stable;
            modifier2 = companion;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen, null, false, ButtonDefaults.scale$default(buttonDefaults, 0.0f, z ? 1.05f : 1.0f, 0.0f, 0.0f, 0.0f, 29, null), z ? el0.a(u61Var) : ButtonDefaults.glow$default(buttonDefaults, null, null, null, 7, null), buttonShapeShape$default, buttonDefaults.m8228colorsoq7We08(jM5187getTransparent0d7_KjU, onSurface, jM5189getWhite0d7_KjU, jU, 0L, 0L, 0L, 0L, composerStartRestartGroup, i5 << 24, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults.border(null, z ? new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null) : new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 29), PaddingKt.m992PaddingValues0680j_4(Dp.m7813constructorimpl(0.0f)), null, ComposableLambdaKt.rememberComposableLambda(-760534367, true, new q42(imageVector, z, z4, z3, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 6) & 14, 390, 2316);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o8(imageVector, function0, z, z2, z3, focusRequester, modifier2, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v36 */
    public static final void d(final rn0 rn0Var, final Function1 function1, final boolean z, final boolean z2, final String str, final String str2, final Function0 function0, final Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final FocusRequester focusRequester, final int i, final int i2, final int i3, final Function0 function6, final Function0 function7, final Function1 function8, final Modifier modifier, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        Composer composer2;
        char c2;
        Continuation continuation;
        Composer composer3;
        MutableState mutableState;
        MutableState mutableState2;
        FocusRequester focusRequester2;
        FocusRequester focusRequester3;
        MutableState mutableState3;
        rn0 rn0Var2;
        FocusRequester focusRequester4;
        FocusRequester focusRequester5;
        Object r2;
        rn0Var.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(457920389);
        if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(rn0Var.ordinal()) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i10 = i4 & 100663296;
        int i11 = GroupFlagsKt.HasAuxSlotFlag;
        if (i10 == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function4) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i8 = i5 | (composerStartRestartGroup.changedInstance(function5) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= composerStartRestartGroup.changed(z7) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i8 |= composerStartRestartGroup.changed(focusRequester) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i8 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            if (composerStartRestartGroup.changed(i2)) {
                i11 = 67108864;
            }
            i8 |= i11;
        }
        if ((i5 & 805306368) == 0) {
            i8 |= composerStartRestartGroup.changed(i3) ? 536870912 : 268435456;
        }
        int i12 = i8;
        if ((i6 & 6) == 0) {
            i9 = i6 | (composerStartRestartGroup.changedInstance(function6) ? 4 : 2);
        } else {
            i9 = i6;
        }
        if ((i6 & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function7) ? 32 : 16;
        }
        if ((i6 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function8) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i13 = i9;
        if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i13 & 1171) == 1170) ? false : true, i7 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i4 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(457920389, i7, i12, "com.dh.myembyapp.ui.screens.home.TopNavigation (TopNavigation.kt:91)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester6 = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester7 = (FocusRequester) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester8 = (FocusRequester) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester9 = (FocusRequester) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester10 = (FocusRequester) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue8;
            Boolean bool = (Boolean) mutableState4.getValue();
            bool.getClass();
            boolean z8 = (i7 & 14) == 4;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue9 == companion.getEmpty()) {
                c2 = CharCompanionObject.MIN_VALUE;
                continuation = null;
                composer3 = composerStartRestartGroup;
                mutableState = mutableState6;
                mutableState2 = mutableState4;
                s6 s6Var = new s6(rn0Var, focusRequester7, focusRequester8, focusRequester9, mutableState2, mutableState5, mutableState, (Continuation) null);
                focusRequester2 = focusRequester8;
                focusRequester3 = focusRequester9;
                mutableState3 = mutableState5;
                rn0Var2 = rn0Var;
                composer3.updateRememberedValue(s6Var);
                objRememberedValue9 = s6Var;
            } else {
                focusRequester2 = focusRequester8;
                focusRequester3 = focusRequester9;
                composer3 = composerStartRestartGroup;
                mutableState3 = mutableState5;
                mutableState = mutableState6;
                c2 = CharCompanionObject.MIN_VALUE;
                continuation = null;
                rn0Var2 = rn0Var;
                mutableState2 = mutableState4;
            }
            int i14 = i7 << 3;
            EffectsKt.LaunchedEffect(bool, rn0Var2, (Function2) objRememberedValue9, composer3, i14 & Input.Keys.FORWARD_DEL);
            Integer numValueOf = Integer.valueOf(i2);
            boolean z9 = ((i13 & Input.Keys.FORWARD_DEL) == 32) | ((i12 & 234881024) == c2);
            Object objRememberedValue10 = composer3.rememberedValue();
            if (z9 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new ac(i2, function7, focusRequester7, continuation, 17);
                composer3.updateRememberedValue(objRememberedValue10);
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composer3, (i12 >> 24) & 14);
            Integer numValueOf2 = Integer.valueOf(i);
            boolean z10 = ((i13 & 14) == 4) | ((i12 & 29360128) == 8388608);
            Object objRememberedValue11 = composer3.rememberedValue();
            if (z10 || objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new q3(i, function6, mutableState, focusRequester6, (Continuation) null);
                focusRequester4 = focusRequester6;
                composer3.updateRememberedValue(objRememberedValue11);
            } else {
                focusRequester4 = focusRequester6;
            }
            EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer3, (i12 >> 21) & 14);
            Integer numValueOf3 = Integer.valueOf(i3);
            boolean z11 = (i12 & 1879048192) == 536870912;
            Object objRememberedValue12 = composer3.rememberedValue();
            if (z11 || objRememberedValue12 == companion.getEmpty()) {
                focusRequester5 = focusRequester10;
                objRememberedValue12 = new ac(i3, mutableState, focusRequester5, continuation, 16);
                composer3.updateRememberedValue(objRememberedValue12);
            } else {
                focusRequester5 = focusRequester10;
            }
            EffectsKt.LaunchedEffect(numValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composer3, (i12 >> 27) & 14);
            Unit unit = Unit.INSTANCE;
            boolean z12 = (i13 & 896) == 256;
            Object objRememberedValue13 = composer3.rememberedValue();
            if (z12 || objRememberedValue13 == companion.getEmpty()) {
                r2 = 0;
                objRememberedValue13 = new a92(function8, 0);
                composer3.updateRememberedValue(objRememberedValue13);
            } else {
                r2 = 0;
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue13, composer3, 6);
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z3 ? 0.0f : -200.0f, AnimationSpecKt.tween$default(Input.Keys.NUMPAD_6, r2, continuation, 6, continuation), 0.0f, "navOffsetY", null, composer3, 3120, 20);
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, continuation), Dp.m7813constructorimpl(72.0f)), 10.0f);
            boolean zChanged = composer3.changed(stateAnimateFloatAsState);
            Object objRememberedValue14 = composer3.rememberedValue();
            if (zChanged || objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = new p4(stateAnimateFloatAsState, 8);
                composer3.updateRememberedValue(objRememberedValue14);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierZIndex, (Function1) objRememberedValue14);
            int i15 = ((i12 & 3670016) == 1048576 ? 1 : r2) | ((i12 & Input.Keys.FORWARD_DEL) == 32 ? 1 : r2);
            Object objRememberedValue15 = composer3.rememberedValue();
            if (i15 != 0 || objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new r4(z3, focusRequester, 1);
                composer3.updateRememberedValue(objRememberedValue15);
            }
            Modifier modifierFocusProperties = FocusPropertiesKt.focusProperties(modifierGraphicsLayer, (Function1) objRememberedValue15);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r2);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, r2);
            int i16 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFocusProperties);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
            mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i16), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(12.0f));
            Object objRememberedValue16 = composer3.rememberedValue();
            if (objRememberedValue16 == companion.getEmpty()) {
                objRememberedValue16 = new b42(6, mutableState2);
                composer3.updateRememberedValue(objRememberedValue16);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1000paddingVpY3zN4, (Function1) objRememberedValue16);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getCenterVertically(), composer3, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            Composer composer4 = composer3;
            int i17 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierOnFocusChanged);
            FocusRequester focusRequester11 = focusRequester4;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor2);
            } else {
                composer4.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i17), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i18 = i7 >> 12;
            int i19 = i7 << 12;
            b(str, str2, null, function0, function3, function4, e(mutableState3), z2, focusRequester11, function8, null, composer4, (i18 & 458752) | (i18 & 14) | 100663296 | (i18 & Input.Keys.FORWARD_DEL) | ((i7 >> 9) & 7168) | (i18 & 57344) | (i19 & 29360128) | ((i13 << 21) & 1879048192), 0, 1028);
            if (z4) {
                composer4.startReplaceGroup(1964352223);
                IconKt.m2496Iconww6aTOc(VpnKeyKt.getVpnKey(Icons.INSTANCE.getDefault()), "代理已启用", SizeKt.m1064size3ABfNKs(companion4, Dp.m7813constructorimpl(24.0f)), c, composer4, 3504, 0);
                composer4.endReplaceGroup();
            } else if (z5) {
                composer4.startReplaceGroup(1964647064);
                IconKt.m2496Iconww6aTOc(VpnKeyKt.getVpnKey(Icons.INSTANCE.getDefault()), "代理已禁用（仅直连）", SizeKt.m1064size3ABfNKs(companion4, Dp.m7813constructorimpl(24.0f)), d, composer4, 3504, 0);
                composer4.endReplaceGroup();
            } else if (z6) {
                composer4.startReplaceGroup(1964945749);
                IconKt.m2496Iconww6aTOc(VpnKeyKt.getVpnKey(Icons.INSTANCE.getDefault()), "代理已禁用（局域网不代理）", SizeKt.m1064size3ABfNKs(companion4, Dp.m7813constructorimpl(24.0f)), d, composer4, 3504, 0);
                composer4.endReplaceGroup();
            } else {
                composer4.startReplaceGroup(1965192199);
                composer4.endReplaceGroup();
            }
            SpacerKt.Spacer(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), composer4, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getCenterVertically(), composer4, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
            int i20 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, companion4);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor3);
            } else {
                composer4.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer4);
            mr.z(companion3, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i20), composerM4318constructorimpl3));
            Icons icons = Icons.INSTANCE;
            ImageVector videoLibrary = VideoLibraryKt.getVideoLibrary(icons.getDefault());
            rn0 rn0Var3 = rn0.a;
            int i21 = 805309446 | (i19 & 57344) | (i19 & 458752);
            int i22 = i7 << 15;
            int i23 = i22 & 29360128;
            int i24 = i22 & 234881024;
            a("媒体", videoLibrary, rn0Var2 == rn0Var3, rn0Var3, rn0Var2, function1, function5, z, z2, focusRequester7, ((Boolean) mutableState3.getValue()).booleanValue(), null, composer4, i21 | ((i12 << 18) & 3670016) | i23 | i24, 0, GL30.GL_COLOR);
            ImageVector favorite = FavoriteKt.getFavorite(icons.getDefault());
            rn0 rn0Var4 = rn0.b;
            int i25 = i21 | i23 | i24;
            a("收藏", favorite, rn0Var2 == rn0Var4, rn0Var4, rn0Var2, function1, null, z, z2, focusRequester2, ((Boolean) mutableState3.getValue()).booleanValue(), null, composer4, i25, 0, 6208);
            ImageVector search = SearchKt.getSearch(icons.getDefault());
            rn0 rn0Var5 = rn0.c;
            a("搜索", search, rn0Var2 == rn0Var5, rn0Var5, rn0Var2, function1, null, z, z2, focusRequester3, ((Boolean) mutableState3.getValue()).booleanValue(), null, composer4, i25, 0, 6208);
            composer2 = composer4;
            c(SettingsKt.getSettings(icons.getDefault()), function2, ((Boolean) mutableState3.getValue()).booleanValue(), z2, z7, focusRequester5, null, composer2, ((i7 >> 15) & 896) | 1572912 | (i14 & 57344) | (i12 & 458752));
            if (i02.w(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z82
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i4 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i5);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i6);
                    e92.d(rn0Var, function1, z, z2, str, str2, function0, function2, function3, function4, function5, z3, z4, z5, z6, z7, focusRequester, i, i2, i3, function6, function7, function8, modifier, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
