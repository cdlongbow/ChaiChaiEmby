package defpackage;

import android.graphics.Bitmap;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.server.WebDavSyncConfigServerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ef2 {
    public static final void a(int i, int i2, jc2 jc2Var, Composer composer, Modifier modifier, String str, Function0 function0, boolean z) {
        int i3;
        Composer composer2;
        jc2 jc2Var2;
        Composer composerStartRestartGroup = composer.startRestartGroup(576055326);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(jc2Var == null ? -1 : jc2Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i5 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            jc2 jc2Var3 = i4 != 0 ? jc2.c : jc2Var;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576055326, i3, -1, "com.dh.myembyapp.ui.components.WebDavActionButton (WebDavSyncDialog.kt:696)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b42(17, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            jc2 jc2Var4 = jc2Var3;
            ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue2), null, z, hc2.l(1.05f), el0.a(u61Var), null, hc2.i(jc2Var3, false, composerStartRestartGroup, (i3 >> 9) & 14, 2), 0.0f, hc2.h(composerStartRestartGroup), null, null, ComposableLambdaKt.rememberComposableLambda(1653655598, true, new p32(jc2Var3, str, mutableState, i5), composerStartRestartGroup, 54), composer2, ((i3 >> 12) & 14) | ((i3 << 3) & 7168), RendererCapabilities.DECODER_SUPPORT_MASK, 3396);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jc2Var2 = jc2Var4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            jc2Var2 = jc2Var;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new db2(modifier, str, z, jc2Var2, function0, i, i2));
        }
    }

    public static final void b(boolean z, Composer composer, int i) {
        int i2;
        long jD;
        Composer composerStartRestartGroup = composer.startRestartGroup(1231231371);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1231231371, i2, -1, "com.dh.myembyapp.ui.components.WebDavCompactToggle (WebDavSyncDialog.kt:1090)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f));
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierClip = ClipKt.clip(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(52.0f)), Dp.m7813constructorimpl(28.0f)), roundedCornerShapeM1312RoundedCornerShape0680j_4);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(593369268);
                jD = zc2.b(false, composerStartRestartGroup, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(593441746);
                jD = zc2.d(false, composerStartRestartGroup, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(BackgroundKt.m274backgroundbw27NRU(modifierClip, jD, roundedCornerShapeM1312RoundedCornerShape0680j_4), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(u61Var.b, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShapeM1312RoundedCornerShape0680j_4);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM286borderxT4_qwU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(4.0f), Dp.m7813constructorimpl(4.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(z ? companion2.getCenterEnd() : companion2.getCenterStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
            BoxKt.Box(BackgroundKt.m274backgroundbw27NRU(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(18.0f)), zc2.c(true), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ei(z, i, 2));
        }
    }

    public static final void c(ve2 ve2Var, boolean z, Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Function0 function2;
        Composer composer2;
        Object objM8825constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-395756517);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(ve2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-395756517, i2, -1, "com.dh.myembyapp.ui.components.WebDavDownloadConfirmDialog (WebDavSyncDialog.kt:727)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            rf2 rf2Var = ve2Var.a;
            boolean zChanged = composerStartRestartGroup.changed(rf2Var.getExportedAtMs());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                long exportedAtMs = rf2Var.getExportedAtMs();
                try {
                    
                    objM8825constructorimpl = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault().format(new Date(exportedAtMs)));
                } catch (Throwable th) {
                    
                    objM8825constructorimpl = ResultKt.createFailure(th);
                }
                if (false) {
                    objM8825constructorimpl = "未知时间";
                }
                objRememberedValue2 = (String) objM8825constructorimpl;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            String str = (String) objRememberedValue2;
            boolean z2 = ((i2 & Input.Keys.FORWARD_DEL) == 32) | ((i2 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new fv(z, function0, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue3, new DialogProperties(!z, false, false), ComposableLambdaKt.rememberComposableLambda(17856996, true, new ln0(u61Var, ve2Var, focusRequester, str, function0, function2, z), composerStartRestartGroup, 54), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            Long lValueOf = Long.valueOf(rf2Var.getExportedAtMs());
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new ji(focusRequester, null, 23);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7((Object) ve2Var, z, (Function) function0, (Object) function1, i, 15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:107:0x023a  */
    /* JADX WARN: Code duplicated, block: B:108:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0249  */
    /* JADX WARN: Code duplicated, block: B:116:0x028d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0292  */
    /* JADX WARN: Code duplicated, block: B:121:0x029c  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:85:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172  */
    /* JADX WARN: Code duplicated, block: B:89:0x0199  */
    /* JADX WARN: Code duplicated, block: B:90:0x019b  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01be  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, Function1 function1, Modifier modifier, String str2, VisualTransformation visualTransformation, boolean z, Function1 function2, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        VisualTransformation visualTransformation2;
        boolean z2;
        VisualTransformation visualTransformation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        VisualTransformation none;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Function0<ComposeUiNode> constructor;
        boolean z3;
        Object objRememberedValue2;
        boolean z4;
        Object objRememberedValue3;
        boolean z5;
        Object objRememberedValue4;
        int i4;
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1531469278);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                visualTransformation2 = visualTransformation;
                i3 |= composerStartRestartGroup.changed(visualTransformation2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i4 = 8388608;
                } else {
                    i4 = 4194304;
                }
                i3 |= i4;
            }
            if ((4793491 & i3) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i7 != 0) {
                    none = VisualTransformation.INSTANCE.getNone();
                } else {
                    none = visualTransformation2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1531469278, i3, -1, "com.dh.myembyapp.ui.components.WebDavInputField (WebDavSyncDialog.kt:633)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f));
                VisualTransformation visualTransformation4 = none;
                Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(BorderKt.border(BackgroundKt.m274backgroundbw27NRU(SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(46.0f)), yc2.l(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), roundedCornerShapeM1312RoundedCornerShape0680j_4), yc2.k(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), roundedCornerShapeM1312RoundedCornerShape0680j_4), Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(8.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                if ((458752 & i3) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new uo0(z, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierFocusProperties = FocusPropertiesKt.focusProperties(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
                if ((3670016 & i3) == 1048576) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new r7(function2, mutableState, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusProperties, (Function1) objRememberedValue3);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i9 = MaterialTheme.$stable;
                TextStyle textStyle = new TextStyle(materialTheme.getColorScheme(composerStartRestartGroup, i9).getOnSurface(), TextUnitKt.getSp(15), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
                SolidColor solidColor = new SolidColor(materialTheme.getColorScheme(composerStartRestartGroup, i9).getOnSurface(), null);
                if ((29360128 & i3) == 8388608) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new cf2(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                yc2.b(str, function1, modifierOnFocusChanged, false, textStyle, solidColor, null, null, visualTransformation4, null, (Function4) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-104257008, true, new kd1(str, str2, 1), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 100663296 | (i3 & Input.Keys.FORWARD_DEL) | ((i3 << 15) & 1879048192), RendererCapabilities.DECODER_SUPPORT_MASK, 1224);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                visualTransformation3 = visualTransformation4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                visualTransformation3 = visualTransformation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new g8(str, function1, modifier, str2, visualTransformation3, z, function2, function0, i, i2));
            }
        }
        i3 |= 24576;
        visualTransformation2 = visualTransformation;
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        if ((4793491 & i3) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            if (i7 != 0) {
                none = VisualTransformation.INSTANCE.getNone();
            } else {
                none = visualTransformation2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1531469278, i3, -1, "com.dh.myembyapp.ui.components.WebDavInputField (WebDavSyncDialog.kt:633)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f));
            VisualTransformation visualTransformation5 = none;
            Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(BorderKt.border(BackgroundKt.m274backgroundbw27NRU(SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(46.0f)), yc2.l(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), roundedCornerShapeM1312RoundedCornerShape0680j_5), yc2.k(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), roundedCornerShapeM1312RoundedCornerShape0680j_5), Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(8.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN5);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i10), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            if ((458752 & i3) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3) {
                objRememberedValue2 = new uo0(z, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new uo0(z, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierFocusProperties2 = FocusPropertiesKt.focusProperties(modifierFillMaxWidth$default2, (Function1) objRememberedValue2);
            if ((3670016 & i3) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4) {
                objRememberedValue3 = new r7(function2, mutableState, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new r7(function2, mutableState, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusProperties2, (Function1) objRememberedValue3);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            TextStyle textStyle2 = new TextStyle(materialTheme2.getColorScheme(composerStartRestartGroup, i11).getOnSurface(), TextUnitKt.getSp(15), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            SolidColor solidColor2 = new SolidColor(materialTheme2.getColorScheme(composerStartRestartGroup, i11).getOnSurface(), null);
            if ((29360128 & i3) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5) {
                objRememberedValue4 = new cf2(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new cf2(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            yc2.b(str, function1, modifierOnFocusChanged2, false, textStyle2, solidColor2, null, null, visualTransformation5, null, (Function4) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-104257008, true, new kd1(str, str2, 1), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 100663296 | (i3 & Input.Keys.FORWARD_DEL) | ((i3 << 15) & 1879048192), RendererCapabilities.DECODER_SUPPORT_MASK, 1224);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            visualTransformation3 = visualTransformation5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            visualTransformation3 = visualTransformation2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g8(str, function1, modifier, str2, visualTransformation3, z, function2, function0, i, i2));
        }
    }

    public static final void e(Modifier modifier, String str, List list, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(577919638);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & Input.Keys.NUMPAD_3) != 146, i3 & 1)) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(577919638, i3, -1, "com.dh.myembyapp.ui.components.WebDavPreviewInfoCard (WebDavSyncDialog.kt:1000)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            modifier2 = modifier3;
            CardKt.Card(modifier2, null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(u61Var.C, 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1087591288, true, new p8(19, str, list), composer2, 54), composer2, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        Modifier modifier4 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d1(modifier4, str, list, i, i2, 14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0378  */
    /* JADX WARN: Code duplicated, block: B:168:0x039b  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:177:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:178:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:190:0x0420  */
    /* JADX WARN: Code duplicated, block: B:192:0x0428  */
    /* JADX WARN: Code duplicated, block: B:196:0x043f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0459  */
    /* JADX WARN: Code duplicated, block: B:201:0x045b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0469  */
    /* JADX WARN: Code duplicated, block: B:209:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:210:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:212:0x0507  */
    /* JADX WARN: Code duplicated, block: B:213:0x050a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0516  */
    /* JADX WARN: Code duplicated, block: B:219:0x0535  */
    /* JADX WARN: Code duplicated, block: B:220:0x0537  */
    /* JADX WARN: Code duplicated, block: B:227:0x054e  */
    /* JADX WARN: Code duplicated, block: B:231:0x057c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0587  */
    /* JADX WARN: Code duplicated, block: B:234:0x0597  */
    /* JADX WARN: Code duplicated, block: B:235:0x059a  */
    /* JADX WARN: Code duplicated, block: B:238:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:242:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:247:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:253:0x0612  */
    /* JADX WARN: Code duplicated, block: B:256:0x0634  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ye2 ye2Var, final pf2 pf2Var, WebDavSyncConfigServerManager webDavSyncConfigServerManager, Function0 function0, final Function1 function1, Function1 function2, Composer composer, int i) {
        int i2;
        Function1 function3;
        Composer composer2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objM;
        Object objM2;
        int i3;
        int i4;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        Object oj1Var;
        FocusManager focusManager;
        CoroutineScope coroutineScope;
        int i5;
        boolean zChanged;
        Object objRememberedValue;
        Bitmap bitmap;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        Object fx1Var;
        FocusManager focusManager2;
        CoroutineScope coroutineScope2;
        SoftwareKeyboardController softwareKeyboardController;
        FocusRequester focusRequester;
        MutableState mutableState7;
        boolean zChanged2;
        Object objRememberedValue3;
        String str;
        Bitmap bitmapY;
        boolean z4;
        boolean z5;
        Object objRememberedValue4;
        boolean z6;
        final SoftwareKeyboardController softwareKeyboardController2;
        final FocusRequester focusRequester2;
        int i7;
        final CoroutineScope coroutineScope3;
        gd1 gd1Var;
        boolean z7;
        Object objRememberedValue5;
        boolean z8;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        pf2 pf2Var2;
        hd1 hd1Var;
        boolean z9;
        Object objRememberedValue7;
        boolean zChangedInstance3;
        Object objRememberedValue8;
        boolean zChanged3;
        Object objRememberedValue9;
        ye2Var.getClass();
        String str2 = ye2Var.a;
        pf2Var.getClass();
        webDavSyncConfigServerManager.getClass();
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(896535179);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ye2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(pf2Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(webDavSyncConfigServerManager) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function3 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(896535179, i2, -1, "com.dh.myembyapp.ui.components.WebDavSyncDialog (WebDavSyncDialog.kt:111)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            CoroutineScope coroutineScope4 = (CoroutineScope) objRememberedValue10;
            FocusManager focusManager3 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            SoftwareKeyboardController softwareKeyboardController3 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            boolean z10 = ye2Var.e;
            boolean z11 = ye2Var.d;
            String str3 = ye2Var.c;
            String str4 = ye2Var.b;
            boolean zChanged4 = composerStartRestartGroup.changed(str2);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue11 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue11 = mutableStateMutableStateOf$default;
            }
            final MutableState mutableState8 = (MutableState) objRememberedValue11;
            boolean zChanged5 = composerStartRestartGroup.changed(str4);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue12 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str4, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue12 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState9 = (MutableState) objRememberedValue12;
            boolean zChanged6 = composerStartRestartGroup.changed(str3);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue13 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str3, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue13 = mutableStateMutableStateOf$default3;
            }
            MutableState mutableState10 = (MutableState) objRememberedValue13;
            boolean zChanged7 = composerStartRestartGroup.changed(z11);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue14 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objM = mr.m(z11, null, 2, null, composerStartRestartGroup);
            } else {
                objM = objRememberedValue14;
                snapshotMutationPolicy = null;
            }
            final MutableState mutableState11 = (MutableState) objM;
            boolean zChanged8 = composerStartRestartGroup.changed(z10);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged8) {
                objM2 = mr.m(z10, snapshotMutationPolicy, 2, snapshotMutationPolicy, composerStartRestartGroup);
            } else if (objRememberedValue15 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objM2 = mr.m(z10, snapshotMutationPolicy, 2, snapshotMutationPolicy, composerStartRestartGroup);
            } else {
                objM2 = objRememberedValue15;
                snapshotMutationPolicy = null;
            }
            MutableState mutableState12 = (MutableState) objM2;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            final MutableState mutableState13 = (MutableState) objRememberedValue16;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion.getEmpty()) {
                i3 = 2;
                objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            } else {
                i3 = 2;
            }
            MutableState mutableState14 = (MutableState) objRememberedValue17;
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == companion.getEmpty()) {
                objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            MutableState mutableState15 = (MutableState) objRememberedValue18;
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == companion.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            final MutableState mutableState16 = (MutableState) objRememberedValue19;
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == companion.getEmpty()) {
                i4 = 2;
                objRememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ue2.c, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            } else {
                i4 = 2;
            }
            final MutableState mutableState17 = (MutableState) objRememberedValue20;
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == companion.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            final MutableState mutableState18 = (MutableState) objRememberedValue21;
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == companion.getEmpty()) {
                objRememberedValue22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            final MutableState mutableState19 = (MutableState) objRememberedValue22;
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == companion.getEmpty()) {
                objRememberedValue23 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            final MutableState mutableState20 = (MutableState) objRememberedValue23;
            Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == companion.getEmpty()) {
                objRememberedValue24 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue24;
            Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue25 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue25 = mutableStateMutableStateOf$default4;
            }
            MutableState mutableState21 = (MutableState) objRememberedValue25;
            Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue26 == companion.getEmpty()) {
                objRememberedValue26 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
            }
            final MutableState mutableState22 = (MutableState) objRememberedValue26;
            final boolean z12 = ((String) mutableState18.getValue()) == null && ((gd1) mutableState19.getValue()) == null && ((hd1) mutableState20.getValue()) == null;
            Unit unit = Unit.INSTANCE;
            int i8 = i2 & 57344;
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(webDavSyncConfigServerManager) | composerStartRestartGroup.changed(mutableState8) | composerStartRestartGroup.changed(mutableState9) | composerStartRestartGroup.changed(mutableState10) | composerStartRestartGroup.changed(mutableState11) | composerStartRestartGroup.changed(mutableState12) | (i8 == 16384);
            Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4) {
                mutableState = mutableState10;
            } else {
                mutableState = mutableState10;
                if (objRememberedValue27 != companion.getEmpty()) {
                    mutableState6 = mutableState9;
                    mutableState3 = mutableState14;
                    focusManager = focusManager3;
                    coroutineScope = coroutineScope4;
                    mutableState5 = mutableState;
                    mutableState2 = mutableState15;
                    mutableState4 = mutableState12;
                    oj1Var = objRememberedValue27;
                    i5 = 6;
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) oj1Var, composerStartRestartGroup, i5);
                Boolean bool = (Boolean) mutableState21.getValue();
                bool.getClass();
                zChanged = composerStartRestartGroup.changed(softwareKeyboardController3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == companion.getEmpty()) {
                    bitmap = null;
                    objRememberedValue = new n2(softwareKeyboardController3, mutableState21, null, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    bitmap = null;
                }
                EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                zChangedInstance = composerStartRestartGroup.changedInstance(webDavSyncConfigServerManager);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new m22(webDavSyncConfigServerManager, 10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, i5);
                if (((gd1) mutableState19.getValue()) == null || ((hd1) mutableState20.getValue()) != null) {
                    z = false;
                } else {
                    z = true;
                }
                boolean zChanged9 = composerStartRestartGroup.changed(softwareKeyboardController3) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changedInstance(coroutineScope);
                i6 = i2 & 7168;
                if (i6 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zChanged9 | z2;
                Object objRememberedValue28 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue28 == companion.getEmpty()) {
                    focusManager2 = focusManager;
                    coroutineScope2 = coroutineScope;
                    softwareKeyboardController = softwareKeyboardController3;
                    focusRequester = focusRequester3;
                    mutableState7 = mutableState21;
                    fx1Var = new fx1(softwareKeyboardController, focusManager2, function0, mutableState7, coroutineScope2, focusRequester, 2);
                    composerStartRestartGroup.updateRememberedValue(fx1Var);
                } else {
                    focusManager2 = focusManager;
                    softwareKeyboardController = softwareKeyboardController3;
                    fx1Var = objRememberedValue28;
                    focusRequester = focusRequester3;
                    coroutineScope2 = coroutineScope;
                    mutableState7 = mutableState21;
                }
                BackHandlerKt.BackHandler(z, (Function0) fx1Var, composerStartRestartGroup, 0, 0);
                zChanged2 = composerStartRestartGroup.changed((String) mutableState13.getValue());
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    str = (String) mutableState13.getValue();
                    if (str != null || StringsKt.isBlank(str)) {
                        bitmapY = bitmap;
                    } else {
                        String str5 = (String) mutableState13.getValue();
                        str5.getClass();
                        bitmapY = ku.y(280, 280, str5);
                    }
                    composerStartRestartGroup.updateRememberedValue(bitmapY);
                    objRememberedValue3 = bitmapY;
                }
                final Bitmap bitmap2 = (Bitmap) objRememberedValue3;
                boolean zChanged10 = composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager2) | composerStartRestartGroup.changedInstance(coroutineScope2);
                if (i6 == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | zChanged10;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue4 == companion.getEmpty()) {
                    fx1 fx1Var2 = new fx1(softwareKeyboardController, focusManager2, function0, mutableState7, coroutineScope2, focusRequester, 3);
                    composerStartRestartGroup.updateRememberedValue(fx1Var2);
                    objRememberedValue4 = fx1Var2;
                }
                composer2 = composerStartRestartGroup;
                z6 = true;
                softwareKeyboardController2 = softwareKeyboardController;
                focusRequester2 = focusRequester;
                final MutableState mutableState23 = mutableState6;
                i7 = i2;
                coroutineScope3 = coroutineScope2;
                final MutableState mutableState24 = mutableState4;
                final MutableState mutableState25 = mutableState3;
                final MutableState mutableState26 = mutableState2;
                final FocusManager focusManager4 = focusManager2;
                final MutableState mutableState27 = mutableState7;
                final MutableState mutableState28 = mutableState5;
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue4, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1649927778, true, new Function2() { // from class: bf2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1649927778, iIntValue, -1, "com.dh.myembyapp.ui.components.WebDavSyncDialog.<anonymous> (WebDavSyncDialog.kt:371)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            final u61 u61Var2 = u61Var;
                            Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, u61Var2.a, null, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                            int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM275backgroundbw27NRU$default);
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
                            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i9), composerM4318constructorimpl));
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(920.0f));
                            CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14);
                            final pf2 pf2Var3 = pf2Var;
                            final Bitmap bitmap3 = bitmap2;
                            final MutableState mutableState29 = mutableState13;
                            final MutableState mutableState30 = mutableState25;
                            final MutableState mutableState31 = mutableState8;
                            final MutableState mutableState32 = mutableState11;
                            final MutableState mutableState33 = mutableState24;
                            final MutableState mutableState34 = mutableState22;
                            final MutableState mutableState35 = mutableState27;
                            final MutableState mutableState36 = mutableState23;
                            final MutableState mutableState37 = mutableState28;
                            final MutableState mutableState38 = mutableState26;
                            final MutableState mutableState39 = mutableState16;
                            final MutableState mutableState40 = mutableState17;
                            final MutableState mutableState41 = mutableState18;
                            final MutableState mutableState42 = mutableState19;
                            final MutableState mutableState43 = mutableState20;
                            final FocusManager focusManager5 = focusManager4;
                            final FocusRequester focusRequester4 = focusRequester2;
                            final SoftwareKeyboardController softwareKeyboardController4 = softwareKeyboardController2;
                            final Function1 function4 = function1;
                            final CoroutineScope coroutineScope5 = coroutineScope3;
                            final boolean z13 = z12;
                            CardKt.Card(modifierM1069width3ABfNKs, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(1749443930, true, new Function3() { // from class: ze2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    MaterialTheme materialTheme;
                                    long jU;
                                    Composer composer4;
                                    int i10;
                                    final MutableState mutableState44;
                                    final FocusManager focusManager6;
                                    final CoroutineScope coroutineScope6;
                                    final SoftwareKeyboardController softwareKeyboardController5;
                                    MutableState mutableState45;
                                    final FocusManager focusManager7;
                                    final CoroutineScope coroutineScope7;
                                    final MutableState mutableState46;
                                    SoftwareKeyboardController softwareKeyboardController6;
                                    final CoroutineScope coroutineScope8;
                                    MutableState mutableState47;
                                    MutableState mutableState48;
                                    ze2 ze2Var;
                                    CoroutineScope coroutineScope9;
                                    FocusRequester focusRequester5;
                                    int i11;
                                    MaterialTheme materialTheme2;
                                    MutableState mutableState49;
                                    int i12;
                                    MutableState mutableState50;
                                    int i13;
                                    MutableState mutableState51;
                                    MutableState mutableState52;
                                    MutableState mutableState53;
                                    MutableState mutableState54;
                                    MutableState mutableState55;
                                    Object yq1Var;
                                    MutableState mutableState56;
                                    MutableState mutableState57;
                                    MutableState mutableState58;
                                    MutableState mutableState59;
                                    Function1 function5;
                                    MutableState mutableState60;
                                    MutableState mutableState61;
                                    MutableState mutableState62;
                                    MutableState mutableState63;
                                    MutableState mutableState64;
                                    int i14;
                                    long jColor;
                                    Composer composer5 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((ColumnScope) obj3).getClass();
                                    if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1749443930, iIntValue2, -1, "com.dh.myembyapp.ui.components.WebDavSyncDialog.<anonymous>.<anonymous>.<anonymous> (WebDavSyncDialog.kt:381)");
                                        }
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
                                        Alignment.Companion companion5 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion5.getTop(), composer5, 6);
                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                        int i15 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs);
                                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor2);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer5);
                                        mr.z(companion6, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i15), composerM4318constructorimpl2));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        Modifier modifierM1069width3ABfNKs2 = SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(320.0f));
                                        MeasurePolicy measurePolicyP = mr.p(10.0f, arrangement, companion5.getCenterHorizontally(), composer5, 54);
                                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                        int i16 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM1069width3ABfNKs2);
                                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor3);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer5);
                                        mr.z(companion6, composerM4318constructorimpl3, measurePolicyP, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i16), composerM4318constructorimpl3));
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                                        int i17 = MaterialTheme.$stable;
                                        TextKt.m3048TextNvy7gAk("手机扫码录入", null, materialTheme3.getColorScheme(composer5, i17).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer5, i17).getTitleMedium(), composer5, 6, 0, 131066);
                                        Bitmap bitmap4 = bitmap3;
                                        if (bitmap4 != null) {
                                            composer5.startReplaceGroup(-443593171);
                                            ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap4), "WebDAV 同步二维码", SizeKt.m1064size3ABfNKs(companion4, Dp.m7813constructorimpl(220.0f)), null, null, 0.0f, null, 0, composer5, 432, 248);
                                            String str6 = (String) mutableState29.getValue();
                                            if (str6 == null) {
                                                str6 = "";
                                            }
                                            composer4 = composer5;
                                            i10 = i17;
                                            materialTheme = materialTheme3;
                                            TextKt.m3048TextNvy7gAk(str6, null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composer5, i17).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer5, i17).getBodySmall(), composer4, 0, 0, 131066);
                                            TextKt.m3048TextNvy7gAk("手机浏览器打开后可录入 WebDAV 地址、账号、密码和同步范围。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i10).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i10).getBodySmall(), composer4, 6, 0, 131066);
                                            composer4.endReplaceGroup();
                                        } else {
                                            materialTheme = materialTheme3;
                                            composer5.startReplaceGroup(-442680624);
                                            MutableState mutableState65 = mutableState30;
                                            String str7 = ((Boolean) mutableState65.getValue()).booleanValue() ? "扫码服务启动失败" : "正在启动扫码配置服务...";
                                            TextStyle bodySmall = materialTheme.getTypography(composer5, i17).getBodySmall();
                                            if (((Boolean) mutableState65.getValue()).booleanValue()) {
                                                composer5.startReplaceGroup(-442462105);
                                                jU = materialTheme.getColorScheme(composer5, i17).getError();
                                                composer5.endReplaceGroup();
                                            } else {
                                                jU = kb0.u(composer5, -442353853, materialTheme, composer5, i17);
                                            }
                                            composer4 = composer5;
                                            i10 = i17;
                                            TextKt.m3048TextNvy7gAk(str7, null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer4, 0, 0, 131066);
                                            composer4.endReplaceGroup();
                                        }
                                        Composer composer6 = composer4;
                                        CardKt.Card(null, null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(u61Var2.C, 0L, 0L, 0L, composer4, CardDefaults.$stable << 12, 14), null, null, vt.a, composer6, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 27);
                                        composer6.endNode();
                                        Modifier modifierE = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getStart(), composer6, 6);
                                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                                        int i18 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer6, modifierE);
                                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor4);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer6);
                                        mr.z(companion6, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i18), composerM4318constructorimpl4));
                                        int i19 = i10;
                                        TextKt.m3048TextNvy7gAk("WebDAV 同步", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer6, i10).getTitleLarge(), composer6, 1572870, 0, 131006);
                                        TextKt.m3048TextNvy7gAk("把本地配置导出 JSON 快照，手动上传到你的 WebDAV 空间；需要时再下载回来覆盖本地。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer6, i19).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer6, i19).getBodySmall(), composer6, 6, 0, 131066);
                                        MutableState mutableState66 = mutableState31;
                                        String str8 = (String) mutableState66.getValue();
                                        boolean zChanged11 = composer6.changed(mutableState66);
                                        Object objRememberedValue29 = composer6.rememberedValue();
                                        if (zChanged11 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue29 = new b42(13, mutableState66);
                                            composer6.updateRememberedValue(objRememberedValue29);
                                        }
                                        Function1 function6 = (Function1) objRememberedValue29;
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                        MutableState mutableState67 = mutableState34;
                                        boolean zBooleanValue = ((Boolean) mutableState67.getValue()).booleanValue();
                                        Object objRememberedValue30 = composer6.rememberedValue();
                                        Composer.Companion companion7 = Composer.INSTANCE;
                                        Object empty = companion7.getEmpty();
                                        MutableState mutableState68 = mutableState35;
                                        if (objRememberedValue30 == empty) {
                                            objRememberedValue30 = new b42(14, mutableState68);
                                            composer6.updateRememberedValue(objRememberedValue30);
                                        }
                                        Function1 function7 = (Function1) objRememberedValue30;
                                        SoftwareKeyboardController softwareKeyboardController7 = softwareKeyboardController4;
                                        boolean zChanged12 = composer6.changed(softwareKeyboardController7);
                                        FocusManager focusManager8 = focusManager5;
                                        boolean zChangedInstance5 = zChanged12 | composer6.changedInstance(focusManager8);
                                        CoroutineScope coroutineScope10 = coroutineScope5;
                                        boolean zChangedInstance6 = zChangedInstance5 | composer6.changedInstance(coroutineScope10);
                                        Object objRememberedValue31 = composer6.rememberedValue();
                                        final FocusRequester focusRequester6 = focusRequester4;
                                        if (zChangedInstance6 || objRememberedValue31 == companion7.getEmpty()) {
                                            final int i20 = 0;
                                            mutableState44 = mutableState68;
                                            focusManager6 = focusManager8;
                                            coroutineScope6 = coroutineScope10;
                                            softwareKeyboardController5 = softwareKeyboardController7;
                                            objRememberedValue31 = new Function0() { // from class: af2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i21 = i20;
                                                    FocusRequester focusRequester7 = focusRequester6;
                                                    MutableState mutableState69 = mutableState44;
                                                    CoroutineScope coroutineScope11 = coroutineScope6;
                                                    FocusManager focusManager9 = focusManager6;
                                                    SoftwareKeyboardController softwareKeyboardController8 = softwareKeyboardController5;
                                                    switch (i21) {
                                                        case 0:
                                                            ef2.h(softwareKeyboardController8, focusManager9, coroutineScope11, mutableState69, focusRequester7);
                                                            break;
                                                        case 1:
                                                            ef2.h(softwareKeyboardController8, focusManager9, coroutineScope11, mutableState69, focusRequester7);
                                                            break;
                                                        default:
                                                            ef2.h(softwareKeyboardController8, focusManager9, coroutineScope11, mutableState69, focusRequester7);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue31);
                                        } else {
                                            mutableState44 = mutableState68;
                                            focusManager6 = focusManager8;
                                            coroutineScope6 = coroutineScope10;
                                            softwareKeyboardController5 = softwareKeyboardController7;
                                        }
                                        MaterialTheme materialTheme4 = materialTheme;
                                        final SoftwareKeyboardController softwareKeyboardController8 = softwareKeyboardController5;
                                        FocusManager focusManager9 = focusManager6;
                                        CoroutineScope coroutineScope11 = coroutineScope6;
                                        MutableState mutableState69 = mutableState44;
                                        ef2.d(str8, function6, modifierFillMaxWidth$default, "WebDAV 服务器地址", null, zBooleanValue, function7, (Function0) objRememberedValue31, composer6, 1576320, 16);
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getTop(), composer6, 6);
                                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                                        int i21 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default2);
                                        Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                        if (composer6.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor5);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer6);
                                        mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                                        Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(i21), composerM4318constructorimpl5));
                                        MutableState mutableState70 = mutableState36;
                                        String str9 = (String) mutableState70.getValue();
                                        boolean zChanged13 = composer6.changed(mutableState70);
                                        Object objRememberedValue32 = composer6.rememberedValue();
                                        if (zChanged13 || objRememberedValue32 == companion7.getEmpty()) {
                                            objRememberedValue32 = new b42(15, mutableState70);
                                            composer6.updateRememberedValue(objRememberedValue32);
                                        }
                                        Function1 function8 = (Function1) objRememberedValue32;
                                        Modifier modifierE2 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                        boolean zBooleanValue2 = ((Boolean) mutableState67.getValue()).booleanValue();
                                        Object objRememberedValue33 = composer6.rememberedValue();
                                        if (objRememberedValue33 == companion7.getEmpty()) {
                                            mutableState45 = mutableState69;
                                            objRememberedValue33 = new b42(16, mutableState45);
                                            composer6.updateRememberedValue(objRememberedValue33);
                                        } else {
                                            mutableState45 = mutableState69;
                                        }
                                        Function1 function9 = (Function1) objRememberedValue33;
                                        boolean zChanged14 = composer6.changed(softwareKeyboardController8) | composer6.changedInstance(focusManager9) | composer6.changedInstance(coroutineScope11);
                                        Object objRememberedValue34 = composer6.rememberedValue();
                                        if (zChanged14 || objRememberedValue34 == companion7.getEmpty()) {
                                            final int i22 = 1;
                                            focusManager7 = focusManager9;
                                            coroutineScope7 = coroutineScope11;
                                            mutableState46 = mutableState45;
                                            objRememberedValue34 = new Function0() { // from class: af2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i23 = i22;
                                                    FocusRequester focusRequester7 = focusRequester6;
                                                    MutableState mutableState610 = mutableState46;
                                                    CoroutineScope coroutineScope12 = coroutineScope7;
                                                    FocusManager focusManager10 = focusManager7;
                                                    SoftwareKeyboardController softwareKeyboardController9 = softwareKeyboardController8;
                                                    switch (i23) {
                                                        case 0:
                                                            ef2.h(softwareKeyboardController9, focusManager10, coroutineScope12, mutableState610, focusRequester7);
                                                            break;
                                                        case 1:
                                                            ef2.h(softwareKeyboardController9, focusManager10, coroutineScope12, mutableState610, focusRequester7);
                                                            break;
                                                        default:
                                                            ef2.h(softwareKeyboardController9, focusManager10, coroutineScope12, mutableState610, focusRequester7);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            softwareKeyboardController6 = softwareKeyboardController8;
                                            composer6.updateRememberedValue(objRememberedValue34);
                                        } else {
                                            focusManager7 = focusManager9;
                                            coroutineScope7 = coroutineScope11;
                                            mutableState46 = mutableState45;
                                            softwareKeyboardController6 = softwareKeyboardController8;
                                        }
                                        ef2.d(str9, function8, modifierE2, "账号", null, zBooleanValue2, function9, (Function0) objRememberedValue34, composer6, 1575936, 16);
                                        MutableState mutableState71 = mutableState37;
                                        String str10 = (String) mutableState71.getValue();
                                        boolean zChanged15 = composer6.changed(mutableState71);
                                        Object objRememberedValue35 = composer6.rememberedValue();
                                        if (zChanged15 || objRememberedValue35 == companion7.getEmpty()) {
                                            objRememberedValue35 = new b42(18, mutableState71);
                                            composer6.updateRememberedValue(objRememberedValue35);
                                        }
                                        Function1 function10 = (Function1) objRememberedValue35;
                                        final FocusManager focusManager10 = focusManager7;
                                        CoroutineScope coroutineScope12 = coroutineScope7;
                                        final MutableState mutableState72 = mutableState46;
                                        Modifier modifierE3 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                        PasswordVisualTransformation passwordVisualTransformation = new PasswordVisualTransformation((char) 0, 1, null);
                                        boolean zBooleanValue3 = ((Boolean) mutableState67.getValue()).booleanValue();
                                        Object objRememberedValue36 = composer6.rememberedValue();
                                        if (objRememberedValue36 == companion7.getEmpty()) {
                                            objRememberedValue36 = new b42(19, mutableState72);
                                            composer6.updateRememberedValue(objRememberedValue36);
                                        }
                                        Function1 function11 = (Function1) objRememberedValue36;
                                        boolean zChanged16 = composer6.changed(softwareKeyboardController6) | composer6.changedInstance(focusManager10) | composer6.changedInstance(coroutineScope12);
                                        final SoftwareKeyboardController softwareKeyboardController9 = softwareKeyboardController6;
                                        Object objRememberedValue37 = composer6.rememberedValue();
                                        if (zChanged16 || objRememberedValue37 == companion7.getEmpty()) {
                                            final int i23 = 2;
                                            coroutineScope8 = coroutineScope12;
                                            objRememberedValue37 = new Function0() { // from class: af2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i24 = i23;
                                                    FocusRequester focusRequester7 = focusRequester6;
                                                    MutableState mutableState610 = mutableState72;
                                                    CoroutineScope coroutineScope13 = coroutineScope8;
                                                    FocusManager focusManager11 = focusManager10;
                                                    SoftwareKeyboardController softwareKeyboardController10 = softwareKeyboardController9;
                                                    switch (i24) {
                                                        case 0:
                                                            ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                            break;
                                                        case 1:
                                                            ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                            break;
                                                        default:
                                                            ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue37);
                                        } else {
                                            coroutineScope8 = coroutineScope12;
                                        }
                                        ef2.d(str10, function10, modifierE3, "密码", passwordVisualTransformation, zBooleanValue3, function11, (Function0) objRememberedValue37, composer6, 1575936, 0);
                                        composer6.endNode();
                                        MutableState mutableState73 = mutableState32;
                                        boolean zBooleanValue4 = ((Boolean) mutableState73.getValue()).booleanValue();
                                        boolean zChanged17 = composer6.changed(mutableState73);
                                        Object objRememberedValue38 = composer6.rememberedValue();
                                        if (zChanged17 || objRememberedValue38 == companion7.getEmpty()) {
                                            objRememberedValue38 = new s72(7, mutableState73);
                                            composer6.updateRememberedValue(objRememberedValue38);
                                        }
                                        ef2.i("同步服务器配置", "包含服务器地址、用户名、密码、Token、备用线路和最后使用服务器。", zBooleanValue4, (Function0) objRememberedValue38, composer6, 54);
                                        MutableState mutableState74 = mutableState33;
                                        boolean zBooleanValue5 = ((Boolean) mutableState74.getValue()).booleanValue();
                                        boolean zChanged18 = composer6.changed(mutableState74);
                                        Object objRememberedValue39 = composer6.rememberedValue();
                                        if (zChanged18 || objRememberedValue39 == companion7.getEmpty()) {
                                            objRememberedValue39 = new s72(8, mutableState74);
                                            composer6.updateRememberedValue(objRememberedValue39);
                                        }
                                        ef2.i("同步应用设置", "包含弹幕源配置、代理、在线字幕、图标库 URL、主题、缓冲、DLNA、排序和 Trakt 基础配置；不包含字幕字体文件、播放器相关偏好和 Trakt 授权 Token。", zBooleanValue5, (Function0) objRememberedValue39, composer6, 54);
                                        Composer composer7 = composer6;
                                        MutableState mutableState75 = mutableState38;
                                        String str11 = (String) mutableState75.getValue();
                                        if (str11 == null || StringsKt.isBlank(str11)) {
                                            mutableState47 = mutableState73;
                                            mutableState48 = mutableState74;
                                            ze2Var = this;
                                            coroutineScope9 = coroutineScope8;
                                            focusRequester5 = focusRequester6;
                                            i11 = i19;
                                            materialTheme2 = materialTheme4;
                                            composer7.startReplaceGroup(-79603337);
                                            composer7.endReplaceGroup();
                                        } else {
                                            composer7.startReplaceGroup(-79852081);
                                            String str12 = (String) mutableState75.getValue();
                                            if (str12 == null) {
                                                str12 = "";
                                            }
                                            TextStyle bodySmall2 = materialTheme4.getTypography(composer7, i19).getBodySmall();
                                            i11 = i19;
                                            focusRequester5 = focusRequester6;
                                            mutableState47 = mutableState73;
                                            mutableState48 = mutableState74;
                                            coroutineScope9 = coroutineScope8;
                                            ze2Var = this;
                                            materialTheme2 = materialTheme4;
                                            TextKt.m3048TextNvy7gAk(str12, null, ColorKt.Color(4281236786L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall2, composer7, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                                            composer7 = composer7;
                                            composer7.endReplaceGroup();
                                        }
                                        MutableState mutableState76 = mutableState39;
                                        String str13 = (String) mutableState76.getValue();
                                        MutableState mutableState77 = mutableState40;
                                        if (str13 == null || StringsKt.isBlank(str13)) {
                                            mutableState49 = mutableState77;
                                            i12 = i11;
                                            composer7.startReplaceGroup(-78889097);
                                            composer7.endReplaceGroup();
                                        } else {
                                            composer7.startReplaceGroup(-79523357);
                                            int iOrdinal = ((ue2) mutableState77.getValue()).ordinal();
                                            if (iOrdinal == 0) {
                                                i14 = i11;
                                                composer7.startReplaceGroup(690175132);
                                                composer7.endReplaceGroup();
                                                jColor = ColorKt.Color(4281236786L);
                                            } else if (iOrdinal == 1) {
                                                i14 = i11;
                                                composer7.startReplaceGroup(690178608);
                                                jColor = materialTheme2.getColorScheme(composer7, i14).getError();
                                                composer7.endReplaceGroup();
                                            } else {
                                                if (iOrdinal != 2) {
                                                    composer7.startReplaceGroup(690172629);
                                                    composer7.endReplaceGroup();
                                                    qu.f();
                                                    return null;
                                                }
                                                composer7.startReplaceGroup(690181682);
                                                i14 = i11;
                                                jColor = materialTheme2.getColorScheme(composer7, i14).getPrimary();
                                                composer7.endReplaceGroup();
                                            }
                                            String str14 = (String) mutableState76.getValue();
                                            Composer composer8 = composer7;
                                            mutableState49 = mutableState77;
                                            i12 = i14;
                                            TextKt.m3048TextNvy7gAk(str14 != null ? str14 : "", null, jColor, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer7, i14).getBodySmall(), composer8, 0, 0, 131066);
                                            composer7 = composer8;
                                            composer7.endReplaceGroup();
                                        }
                                        MutableState mutableState78 = mutableState41;
                                        if (((String) mutableState78.getValue()) != null) {
                                            composer7.startReplaceGroup(-78796841);
                                            int i24 = i12;
                                            Composer composer9 = composer7;
                                            mutableState50 = mutableState78;
                                            i13 = i24;
                                            TextKt.m3048TextNvy7gAk(c61.n((String) mutableState78.getValue(), "进行中，请稍候..."), null, materialTheme2.getColorScheme(composer7, i24).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer7, i24).getBodySmall(), composer9, 0, 0, 131066);
                                            composer7 = composer9;
                                            composer7.endReplaceGroup();
                                        } else {
                                            mutableState50 = mutableState78;
                                            i13 = i12;
                                            composer7.startReplaceGroup(-78525033);
                                            composer7.endReplaceGroup();
                                        }
                                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getTop(), composer7, 6);
                                        long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                                        int i25 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default3);
                                        Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                        if (composer7.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            composer7.createNode(constructor6);
                                        } else {
                                            composer7.useNode();
                                        }
                                        Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer7);
                                        mr.z(companion6, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                                        Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl6, Integer.valueOf(i25), composerM4318constructorimpl6));
                                        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), focusRequester5);
                                        MutableState mutableState79 = mutableState71;
                                        MutableState mutableState80 = mutableState47;
                                        MutableState mutableState81 = mutableState48;
                                        boolean zChanged19 = composer7.changed(mutableState66) | composer7.changed(mutableState70) | composer7.changed(mutableState79) | composer7.changed(mutableState80) | composer7.changed(mutableState81);
                                        Function1 function12 = function4;
                                        CoroutineScope coroutineScope13 = coroutineScope9;
                                        boolean zChanged20 = zChanged19 | composer7.changed(function12) | composer7.changedInstance(coroutineScope13);
                                        pf2 pf2Var4 = pf2Var3;
                                        boolean zChangedInstance7 = zChanged20 | composer7.changedInstance(pf2Var4);
                                        Object objRememberedValue40 = composer7.rememberedValue();
                                        if (zChangedInstance7 || objRememberedValue40 == companion7.getEmpty()) {
                                            mutableState51 = mutableState49;
                                            objRememberedValue40 = new ha1(pf2Var4, function12, coroutineScope13, mutableState50, mutableState66, mutableState70, mutableState79, mutableState80, mutableState81, mutableState76, mutableState51);
                                            mutableState79 = mutableState79;
                                            mutableState52 = mutableState80;
                                            mutableState53 = mutableState70;
                                            mutableState54 = mutableState81;
                                            mutableState55 = mutableState66;
                                            composer7.updateRememberedValue(objRememberedValue40);
                                        } else {
                                            mutableState53 = mutableState70;
                                            mutableState52 = mutableState80;
                                            mutableState51 = mutableState49;
                                            mutableState55 = mutableState66;
                                            mutableState54 = mutableState81;
                                        }
                                        boolean z14 = z13;
                                        ef2.a(48, 8, null, composer7, modifierFocusRequester, "测试连接", (Function0) objRememberedValue40, z14);
                                        MutableState mutableState82 = mutableState52;
                                        MutableState mutableState83 = mutableState79;
                                        MutableState mutableState84 = mutableState54;
                                        MutableState mutableState85 = mutableState53;
                                        Modifier modifierE4 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                        boolean zChanged21 = composer7.changed(mutableState55) | composer7.changed(mutableState85) | composer7.changed(mutableState83) | composer7.changed(mutableState82) | composer7.changed(mutableState84) | composer7.changed(function12);
                                        Object objRememberedValue41 = composer7.rememberedValue();
                                        if (zChanged21 || objRememberedValue41 == companion7.getEmpty()) {
                                            MutableState mutableState86 = mutableState55;
                                            mutableState56 = mutableState84;
                                            yq1Var = new yq1(function12, mutableState86, mutableState85, mutableState83, mutableState82, mutableState56, mutableState76, mutableState51, 1);
                                            mutableState55 = mutableState86;
                                            mutableState57 = mutableState85;
                                            mutableState58 = mutableState83;
                                            mutableState59 = mutableState82;
                                            function5 = function12;
                                            composer7.updateRememberedValue(yq1Var);
                                        } else {
                                            mutableState59 = mutableState82;
                                            mutableState56 = mutableState84;
                                            mutableState57 = mutableState85;
                                            mutableState58 = mutableState83;
                                            yq1Var = objRememberedValue41;
                                            function5 = function12;
                                        }
                                        ef2.a(48, 8, null, composer7, modifierE4, "保存配置", (Function0) yq1Var, z14);
                                        MutableState mutableState87 = mutableState59;
                                        MutableState mutableState88 = mutableState58;
                                        MutableState mutableState89 = mutableState56;
                                        Function1 function13 = function5;
                                        MutableState mutableState90 = mutableState57;
                                        Modifier modifierE5 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                        boolean zChanged22 = composer7.changed(mutableState55) | composer7.changed(mutableState90) | composer7.changed(mutableState88) | composer7.changed(mutableState87) | composer7.changed(mutableState89);
                                        Object objRememberedValue42 = composer7.rememberedValue();
                                        MutableState mutableState91 = mutableState42;
                                        MutableState mutableState92 = mutableState43;
                                        if (zChanged22 || objRememberedValue42 == companion7.getEmpty()) {
                                            MutableState mutableState93 = mutableState55;
                                            mutableState60 = mutableState87;
                                            c4 c4Var = new c4(mutableState50, mutableState91, mutableState92, mutableState93, mutableState90, mutableState88, mutableState60, mutableState89);
                                            mutableState61 = mutableState88;
                                            mutableState62 = mutableState89;
                                            mutableState63 = mutableState92;
                                            mutableState55 = mutableState93;
                                            mutableState64 = mutableState90;
                                            composer7.updateRememberedValue(c4Var);
                                            objRememberedValue42 = c4Var;
                                        } else {
                                            mutableState63 = mutableState92;
                                            mutableState60 = mutableState87;
                                            mutableState62 = mutableState89;
                                            mutableState64 = mutableState90;
                                            mutableState61 = mutableState88;
                                        }
                                        ef2.a(48, 8, null, composer7, modifierE5, "上传配置", (Function0) objRememberedValue42, z14);
                                        MutableState mutableState94 = mutableState60;
                                        MutableState mutableState95 = mutableState61;
                                        MutableState mutableState96 = mutableState62;
                                        MutableState mutableState97 = mutableState64;
                                        Modifier modifierE6 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                        boolean zChanged23 = composer7.changed(mutableState55) | composer7.changed(mutableState97) | composer7.changed(mutableState95) | composer7.changed(mutableState94) | composer7.changed(mutableState96) | composer7.changed(r11) | composer7.changedInstance(coroutineScope13) | composer7.changedInstance(pf2Var4);
                                        Object objRememberedValue43 = composer7.rememberedValue();
                                        if (zChanged23 || objRememberedValue43 == companion7.getEmpty()) {
                                            fi fiVar = new fi(function13, coroutineScope13, mutableState50, mutableState91, mutableState63, mutableState55, mutableState97, mutableState95, mutableState94, mutableState96, mutableState76, pf2Var4, mutableState51);
                                            composer7.updateRememberedValue(fiVar);
                                            objRememberedValue43 = fiVar;
                                        }
                                        ef2.a(48, 8, null, composer7, modifierE6, "下载配置", (Function0) objRememberedValue43, z14);
                                        composer7.endNode();
                                        int i26 = i13;
                                        Composer composer10 = composer7;
                                        TextKt.m3048TextNvy7gAk("配置中会包含服务器密码与登录Token，请只使用你自己可控的 WebDAV", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer7, i26).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer7, i26).getBodySmall(), composer10, 6, 0, 131066);
                                        if (x2.m(composer10)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 196614, 26);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, 432, 0);
                gd1Var = (gd1) mutableState19.getValue();
                if (gd1Var == null) {
                    composer2.startReplaceGroup(-1701999430);
                    composer2.endReplaceGroup();
                    pf2Var2 = pf2Var;
                } else {
                    composer2.startReplaceGroup(-1701999429);
                    ve2 ve2Var = gd1Var.b;
                    if (((String) mutableState18.getValue()) != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new s72(9, mutableState19);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function4 = (Function0) objRememberedValue5;
                    boolean zChangedInstance5 = composer2.changedInstance(coroutineScope3) | composer2.changedInstance(pf2Var);
                    if ((i7 & 458752) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zChangedInstance2 = zChangedInstance5 | z8 | composer2.changedInstance(gd1Var);
                    objRememberedValue6 = composer2.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                        c4 c4Var = new c4(gd1Var, coroutineScope3, mutableState18, mutableState16, pf2Var, function2, mutableState19, mutableState17);
                        pf2Var2 = pf2Var;
                        composer2.updateRememberedValue(c4Var);
                        objRememberedValue6 = c4Var;
                    } else {
                        pf2Var2 = pf2Var;
                    }
                    c(ve2Var, z7, function4, (Function0) objRememberedValue6, composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                    composer2.endReplaceGroup();
                }
                hd1Var = (hd1) mutableState20.getValue();
                if (hd1Var == null) {
                    composer2.startReplaceGroup(-1701685214);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1701685213);
                    ye2 ye2Var2 = hd1Var.a;
                    if (((String) mutableState18.getValue()) != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new s72(10, mutableState20);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function5 = (Function0) objRememberedValue7;
                    if (i8 != 16384) {
                        z6 = false;
                    }
                    zChangedInstance3 = z6 | composer2.changedInstance(coroutineScope3) | composer2.changedInstance(pf2Var2) | composer2.changed(hd1Var);
                    objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue8 == companion.getEmpty()) {
                        c4 c4Var2 = new c4(hd1Var, function1, coroutineScope3, mutableState18, mutableState16, pf2Var, mutableState20, mutableState17);
                        composer2.updateRememberedValue(c4Var2);
                        objRememberedValue8 = c4Var2;
                    }
                    j(ye2Var2, z9, function5, (Function0) objRememberedValue8, composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                    composer2.endReplaceGroup();
                }
                zChanged3 = composer2.changed(mutableState8) | composer2.changed(softwareKeyboardController2);
                objRememberedValue9 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new r3(softwareKeyboardController2, mutableState8, focusRequester2, mutableState22, (Continuation) null, 9);
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            focusManager = focusManager3;
            coroutineScope = coroutineScope4;
            MutableState mutableState29 = mutableState;
            i5 = 6;
            oj1Var = new oj1(webDavSyncConfigServerManager, mutableState8, mutableState9, mutableState29, mutableState11, mutableState12, function3, mutableState15, mutableState13, r26, null);
            mutableState4 = mutableState12;
            mutableState2 = mutableState15;
            mutableState3 = r26;
            mutableState6 = mutableState9;
            mutableState5 = mutableState29;
            composerStartRestartGroup.updateRememberedValue(oj1Var);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) oj1Var, composerStartRestartGroup, i5);
            Boolean bool2 = (Boolean) mutableState21.getValue();
            bool2.getClass();
            zChanged = composerStartRestartGroup.changed(softwareKeyboardController3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                bitmap = null;
                objRememberedValue = new n2(softwareKeyboardController3, mutableState21, null, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                bitmap = null;
                objRememberedValue = new n2(softwareKeyboardController3, mutableState21, null, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(bool2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            zChangedInstance = composerStartRestartGroup.changedInstance(webDavSyncConfigServerManager);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue2 = new m22(webDavSyncConfigServerManager, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new m22(webDavSyncConfigServerManager, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, i5);
            if (((gd1) mutableState19.getValue()) == null) {
                z = false;
            } else {
                z = false;
            }
            boolean zChanged11 = composerStartRestartGroup.changed(softwareKeyboardController3) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changedInstance(coroutineScope);
            i6 = i2 & 7168;
            if (i6 == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zChanged11 | z2;
            Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
            if (z3) {
                focusManager2 = focusManager;
                coroutineScope2 = coroutineScope;
                softwareKeyboardController = softwareKeyboardController3;
                focusRequester = focusRequester3;
                mutableState7 = mutableState21;
                fx1Var = new fx1(softwareKeyboardController, focusManager2, function0, mutableState7, coroutineScope2, focusRequester, 2);
                composerStartRestartGroup.updateRememberedValue(fx1Var);
            } else {
                focusManager2 = focusManager;
                coroutineScope2 = coroutineScope;
                softwareKeyboardController = softwareKeyboardController3;
                focusRequester = focusRequester3;
                mutableState7 = mutableState21;
                fx1Var = new fx1(softwareKeyboardController, focusManager2, function0, mutableState7, coroutineScope2, focusRequester, 2);
                composerStartRestartGroup.updateRememberedValue(fx1Var);
            }
            BackHandlerKt.BackHandler(z, (Function0) fx1Var, composerStartRestartGroup, 0, 0);
            zChanged2 = composerStartRestartGroup.changed((String) mutableState13.getValue());
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                str = (String) mutableState13.getValue();
                if (str != null) {
                    bitmapY = bitmap;
                } else {
                    bitmapY = bitmap;
                }
                composerStartRestartGroup.updateRememberedValue(bitmapY);
                objRememberedValue3 = bitmapY;
            } else {
                str = (String) mutableState13.getValue();
                if (str != null) {
                    bitmapY = bitmap;
                } else {
                    bitmapY = bitmap;
                }
                composerStartRestartGroup.updateRememberedValue(bitmapY);
                objRememberedValue3 = bitmapY;
            }
            final Bitmap bitmap3 = (Bitmap) objRememberedValue3;
            boolean zChanged12 = composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager2) | composerStartRestartGroup.changedInstance(coroutineScope2);
            if (i6 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | zChanged12;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5) {
                fx1 fx1Var3 = new fx1(softwareKeyboardController, focusManager2, function0, mutableState7, coroutineScope2, focusRequester, 3);
                composerStartRestartGroup.updateRememberedValue(fx1Var3);
                objRememberedValue4 = fx1Var3;
            } else {
                fx1 fx1Var4 = new fx1(softwareKeyboardController, focusManager2, function0, mutableState7, coroutineScope2, focusRequester, 3);
                composerStartRestartGroup.updateRememberedValue(fx1Var4);
                objRememberedValue4 = fx1Var4;
            }
            composer2 = composerStartRestartGroup;
            z6 = true;
            softwareKeyboardController2 = softwareKeyboardController;
            focusRequester2 = focusRequester;
            final MutableState mutableState210 = mutableState6;
            i7 = i2;
            coroutineScope3 = coroutineScope2;
            final MutableState mutableState211 = mutableState4;
            final MutableState mutableState212 = mutableState3;
            final MutableState mutableState213 = mutableState2;
            final FocusManager focusManager5 = focusManager2;
            final MutableState mutableState214 = mutableState7;
            final MutableState mutableState215 = mutableState5;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue4, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1649927778, true, new Function2() { // from class: bf2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1649927778, iIntValue, -1, "com.dh.myembyapp.ui.components.WebDavSyncDialog.<anonymous> (WebDavSyncDialog.kt:371)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        final u61 u61Var2 = u61Var;
                        Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, u61Var2.a, null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM275backgroundbw27NRU$default);
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
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i9), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(920.0f));
                        CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14);
                        final pf2 pf2Var3 = pf2Var;
                        final Bitmap bitmap4 = bitmap3;
                        final MutableState mutableState216 = mutableState13;
                        final MutableState mutableState30 = mutableState212;
                        final MutableState mutableState31 = mutableState8;
                        final MutableState mutableState32 = mutableState11;
                        final MutableState mutableState33 = mutableState211;
                        final MutableState mutableState34 = mutableState22;
                        final MutableState mutableState35 = mutableState214;
                        final MutableState mutableState36 = mutableState210;
                        final MutableState mutableState37 = mutableState215;
                        final MutableState mutableState38 = mutableState213;
                        final MutableState mutableState39 = mutableState16;
                        final MutableState mutableState40 = mutableState17;
                        final MutableState mutableState41 = mutableState18;
                        final MutableState mutableState42 = mutableState19;
                        final MutableState mutableState43 = mutableState20;
                        final FocusManager focusManager6 = focusManager5;
                        final FocusRequester focusRequester4 = focusRequester2;
                        final SoftwareKeyboardController softwareKeyboardController4 = softwareKeyboardController2;
                        final Function1 function6 = function1;
                        final CoroutineScope coroutineScope5 = coroutineScope3;
                        final boolean z13 = z12;
                        CardKt.Card(modifierM1069width3ABfNKs, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(1749443930, true, new Function3() { // from class: ze2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                MaterialTheme materialTheme;
                                long jU;
                                Composer composer4;
                                int i10;
                                final MutableState mutableState44;
                                final FocusManager focusManager7;
                                final CoroutineScope coroutineScope6;
                                final SoftwareKeyboardController softwareKeyboardController5;
                                MutableState mutableState45;
                                final FocusManager focusManager8;
                                final CoroutineScope coroutineScope7;
                                final MutableState mutableState46;
                                SoftwareKeyboardController softwareKeyboardController6;
                                final CoroutineScope coroutineScope8;
                                MutableState mutableState47;
                                MutableState mutableState48;
                                ze2 ze2Var;
                                CoroutineScope coroutineScope9;
                                FocusRequester focusRequester5;
                                int i11;
                                MaterialTheme materialTheme2;
                                MutableState mutableState49;
                                int i12;
                                MutableState mutableState50;
                                int i13;
                                MutableState mutableState51;
                                MutableState mutableState52;
                                MutableState mutableState53;
                                MutableState mutableState54;
                                MutableState mutableState55;
                                Object yq1Var;
                                MutableState mutableState56;
                                MutableState mutableState57;
                                MutableState mutableState58;
                                MutableState mutableState59;
                                Function1 function7;
                                MutableState mutableState60;
                                MutableState mutableState61;
                                MutableState mutableState62;
                                MutableState mutableState63;
                                MutableState mutableState64;
                                int i14;
                                long jColor;
                                Composer composer5 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((ColumnScope) obj3).getClass();
                                if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1749443930, iIntValue2, -1, "com.dh.myembyapp.ui.components.WebDavSyncDialog.<anonymous>.<anonymous>.<anonymous> (WebDavSyncDialog.kt:381)");
                                    }
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
                                    Alignment.Companion companion5 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion5.getTop(), composer5, 6);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i15 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor2);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i15), composerM4318constructorimpl2));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier modifierM1069width3ABfNKs2 = SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(320.0f));
                                    MeasurePolicy measurePolicyP = mr.p(10.0f, arrangement, companion5.getCenterHorizontally(), composer5, 54);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i16 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM1069width3ABfNKs2);
                                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyP, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i16), composerM4318constructorimpl3));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                                    int i17 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk("手机扫码录入", null, materialTheme3.getColorScheme(composer5, i17).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer5, i17).getTitleMedium(), composer5, 6, 0, 131066);
                                    Bitmap bitmap5 = bitmap4;
                                    if (bitmap5 != null) {
                                        composer5.startReplaceGroup(-443593171);
                                        ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap5), "WebDAV 同步二维码", SizeKt.m1064size3ABfNKs(companion4, Dp.m7813constructorimpl(220.0f)), null, null, 0.0f, null, 0, composer5, 432, 248);
                                        String str6 = (String) mutableState216.getValue();
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        composer4 = composer5;
                                        i10 = i17;
                                        materialTheme = materialTheme3;
                                        TextKt.m3048TextNvy7gAk(str6, null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composer5, i17).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer5, i17).getBodySmall(), composer4, 0, 0, 131066);
                                        TextKt.m3048TextNvy7gAk("手机浏览器打开后可录入 WebDAV 地址、账号、密码和同步范围。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i10).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i10).getBodySmall(), composer4, 6, 0, 131066);
                                        composer4.endReplaceGroup();
                                    } else {
                                        materialTheme = materialTheme3;
                                        composer5.startReplaceGroup(-442680624);
                                        MutableState mutableState65 = mutableState30;
                                        String str7 = ((Boolean) mutableState65.getValue()).booleanValue() ? "扫码服务启动失败" : "正在启动扫码配置服务...";
                                        TextStyle bodySmall = materialTheme.getTypography(composer5, i17).getBodySmall();
                                        if (((Boolean) mutableState65.getValue()).booleanValue()) {
                                            composer5.startReplaceGroup(-442462105);
                                            jU = materialTheme.getColorScheme(composer5, i17).getError();
                                            composer5.endReplaceGroup();
                                        } else {
                                            jU = kb0.u(composer5, -442353853, materialTheme, composer5, i17);
                                        }
                                        composer4 = composer5;
                                        i10 = i17;
                                        TextKt.m3048TextNvy7gAk(str7, null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer4, 0, 0, 131066);
                                        composer4.endReplaceGroup();
                                    }
                                    Composer composer6 = composer4;
                                    CardKt.Card(null, null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(u61Var2.C, 0L, 0L, 0L, composer4, CardDefaults.$stable << 12, 14), null, null, vt.a, composer6, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 27);
                                    composer6.endNode();
                                    Modifier modifierE = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getStart(), composer6, 6);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                                    int i18 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer6, modifierE);
                                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer6.startReusableNode();
                                    if (composer6.getInserting()) {
                                        composer6.createNode(constructor4);
                                    } else {
                                        composer6.useNode();
                                    }
                                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer6);
                                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i18), composerM4318constructorimpl4));
                                    int i19 = i10;
                                    TextKt.m3048TextNvy7gAk("WebDAV 同步", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer6, i10).getTitleLarge(), composer6, 1572870, 0, 131006);
                                    TextKt.m3048TextNvy7gAk("把本地配置导出 JSON 快照，手动上传到你的 WebDAV 空间；需要时再下载回来覆盖本地。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer6, i19).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer6, i19).getBodySmall(), composer6, 6, 0, 131066);
                                    MutableState mutableState66 = mutableState31;
                                    String str8 = (String) mutableState66.getValue();
                                    boolean zChanged13 = composer6.changed(mutableState66);
                                    Object objRememberedValue210 = composer6.rememberedValue();
                                    if (zChanged13 || objRememberedValue210 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue210 = new b42(13, mutableState66);
                                        composer6.updateRememberedValue(objRememberedValue210);
                                    }
                                    Function1 function8 = (Function1) objRememberedValue210;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MutableState mutableState67 = mutableState34;
                                    boolean zBooleanValue = ((Boolean) mutableState67.getValue()).booleanValue();
                                    Object objRememberedValue30 = composer6.rememberedValue();
                                    Composer.Companion companion7 = Composer.INSTANCE;
                                    Object empty = companion7.getEmpty();
                                    MutableState mutableState68 = mutableState35;
                                    if (objRememberedValue30 == empty) {
                                        objRememberedValue30 = new b42(14, mutableState68);
                                        composer6.updateRememberedValue(objRememberedValue30);
                                    }
                                    Function1 function9 = (Function1) objRememberedValue30;
                                    SoftwareKeyboardController softwareKeyboardController7 = softwareKeyboardController4;
                                    boolean zChanged14 = composer6.changed(softwareKeyboardController7);
                                    FocusManager focusManager9 = focusManager6;
                                    boolean zChangedInstance6 = zChanged14 | composer6.changedInstance(focusManager9);
                                    CoroutineScope coroutineScope10 = coroutineScope5;
                                    boolean zChangedInstance7 = zChangedInstance6 | composer6.changedInstance(coroutineScope10);
                                    Object objRememberedValue31 = composer6.rememberedValue();
                                    final FocusRequester focusRequester6 = focusRequester4;
                                    if (zChangedInstance7 || objRememberedValue31 == companion7.getEmpty()) {
                                        final int i20 = 0;
                                        mutableState44 = mutableState68;
                                        focusManager7 = focusManager9;
                                        coroutineScope6 = coroutineScope10;
                                        softwareKeyboardController5 = softwareKeyboardController7;
                                        objRememberedValue31 = new Function0() { // from class: af2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i24 = i20;
                                                FocusRequester focusRequester7 = focusRequester6;
                                                MutableState mutableState610 = mutableState44;
                                                CoroutineScope coroutineScope13 = coroutineScope6;
                                                FocusManager focusManager11 = focusManager7;
                                                SoftwareKeyboardController softwareKeyboardController10 = softwareKeyboardController5;
                                                switch (i24) {
                                                    case 0:
                                                        ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                    case 1:
                                                        ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                    default:
                                                        ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue31);
                                    } else {
                                        mutableState44 = mutableState68;
                                        focusManager7 = focusManager9;
                                        coroutineScope6 = coroutineScope10;
                                        softwareKeyboardController5 = softwareKeyboardController7;
                                    }
                                    MaterialTheme materialTheme4 = materialTheme;
                                    final SoftwareKeyboardController softwareKeyboardController8 = softwareKeyboardController5;
                                    FocusManager focusManager10 = focusManager7;
                                    CoroutineScope coroutineScope11 = coroutineScope6;
                                    MutableState mutableState69 = mutableState44;
                                    ef2.d(str8, function8, modifierFillMaxWidth$default, "WebDAV 服务器地址", null, zBooleanValue, function9, (Function0) objRememberedValue31, composer6, 1576320, 16);
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getTop(), composer6, 6);
                                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                                    int i21 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default2);
                                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer6.startReusableNode();
                                    if (composer6.getInserting()) {
                                        composer6.createNode(constructor5);
                                    } else {
                                        composer6.useNode();
                                    }
                                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer6);
                                    mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(i21), composerM4318constructorimpl5));
                                    MutableState mutableState70 = mutableState36;
                                    String str9 = (String) mutableState70.getValue();
                                    boolean zChanged15 = composer6.changed(mutableState70);
                                    Object objRememberedValue32 = composer6.rememberedValue();
                                    if (zChanged15 || objRememberedValue32 == companion7.getEmpty()) {
                                        objRememberedValue32 = new b42(15, mutableState70);
                                        composer6.updateRememberedValue(objRememberedValue32);
                                    }
                                    Function1 function10 = (Function1) objRememberedValue32;
                                    Modifier modifierE2 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                    boolean zBooleanValue2 = ((Boolean) mutableState67.getValue()).booleanValue();
                                    Object objRememberedValue33 = composer6.rememberedValue();
                                    if (objRememberedValue33 == companion7.getEmpty()) {
                                        mutableState45 = mutableState69;
                                        objRememberedValue33 = new b42(16, mutableState45);
                                        composer6.updateRememberedValue(objRememberedValue33);
                                    } else {
                                        mutableState45 = mutableState69;
                                    }
                                    Function1 function11 = (Function1) objRememberedValue33;
                                    boolean zChanged16 = composer6.changed(softwareKeyboardController8) | composer6.changedInstance(focusManager10) | composer6.changedInstance(coroutineScope11);
                                    Object objRememberedValue34 = composer6.rememberedValue();
                                    if (zChanged16 || objRememberedValue34 == companion7.getEmpty()) {
                                        final int i22 = 1;
                                        focusManager8 = focusManager10;
                                        coroutineScope7 = coroutineScope11;
                                        mutableState46 = mutableState45;
                                        objRememberedValue34 = new Function0() { // from class: af2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i24 = i22;
                                                FocusRequester focusRequester7 = focusRequester6;
                                                MutableState mutableState610 = mutableState46;
                                                CoroutineScope coroutineScope13 = coroutineScope7;
                                                FocusManager focusManager11 = focusManager8;
                                                SoftwareKeyboardController softwareKeyboardController10 = softwareKeyboardController8;
                                                switch (i24) {
                                                    case 0:
                                                        ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                    case 1:
                                                        ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                    default:
                                                        ef2.h(softwareKeyboardController10, focusManager11, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        softwareKeyboardController6 = softwareKeyboardController8;
                                        composer6.updateRememberedValue(objRememberedValue34);
                                    } else {
                                        focusManager8 = focusManager10;
                                        coroutineScope7 = coroutineScope11;
                                        mutableState46 = mutableState45;
                                        softwareKeyboardController6 = softwareKeyboardController8;
                                    }
                                    ef2.d(str9, function10, modifierE2, "账号", null, zBooleanValue2, function11, (Function0) objRememberedValue34, composer6, 1575936, 16);
                                    MutableState mutableState71 = mutableState37;
                                    String str10 = (String) mutableState71.getValue();
                                    boolean zChanged17 = composer6.changed(mutableState71);
                                    Object objRememberedValue35 = composer6.rememberedValue();
                                    if (zChanged17 || objRememberedValue35 == companion7.getEmpty()) {
                                        objRememberedValue35 = new b42(18, mutableState71);
                                        composer6.updateRememberedValue(objRememberedValue35);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue35;
                                    final FocusManager focusManager11 = focusManager8;
                                    CoroutineScope coroutineScope12 = coroutineScope7;
                                    final MutableState mutableState72 = mutableState46;
                                    Modifier modifierE3 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                    PasswordVisualTransformation passwordVisualTransformation = new PasswordVisualTransformation((char) 0, 1, null);
                                    boolean zBooleanValue3 = ((Boolean) mutableState67.getValue()).booleanValue();
                                    Object objRememberedValue36 = composer6.rememberedValue();
                                    if (objRememberedValue36 == companion7.getEmpty()) {
                                        objRememberedValue36 = new b42(19, mutableState72);
                                        composer6.updateRememberedValue(objRememberedValue36);
                                    }
                                    Function1 function13 = (Function1) objRememberedValue36;
                                    boolean zChanged18 = composer6.changed(softwareKeyboardController6) | composer6.changedInstance(focusManager11) | composer6.changedInstance(coroutineScope12);
                                    final SoftwareKeyboardController softwareKeyboardController9 = softwareKeyboardController6;
                                    Object objRememberedValue37 = composer6.rememberedValue();
                                    if (zChanged18 || objRememberedValue37 == companion7.getEmpty()) {
                                        final int i23 = 2;
                                        coroutineScope8 = coroutineScope12;
                                        objRememberedValue37 = new Function0() { // from class: af2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i24 = i23;
                                                FocusRequester focusRequester7 = focusRequester6;
                                                MutableState mutableState610 = mutableState72;
                                                CoroutineScope coroutineScope13 = coroutineScope8;
                                                FocusManager focusManager12 = focusManager11;
                                                SoftwareKeyboardController softwareKeyboardController10 = softwareKeyboardController9;
                                                switch (i24) {
                                                    case 0:
                                                        ef2.h(softwareKeyboardController10, focusManager12, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                    case 1:
                                                        ef2.h(softwareKeyboardController10, focusManager12, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                    default:
                                                        ef2.h(softwareKeyboardController10, focusManager12, coroutineScope13, mutableState610, focusRequester7);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue37);
                                    } else {
                                        coroutineScope8 = coroutineScope12;
                                    }
                                    ef2.d(str10, function12, modifierE3, "密码", passwordVisualTransformation, zBooleanValue3, function13, (Function0) objRememberedValue37, composer6, 1575936, 0);
                                    composer6.endNode();
                                    MutableState mutableState73 = mutableState32;
                                    boolean zBooleanValue4 = ((Boolean) mutableState73.getValue()).booleanValue();
                                    boolean zChanged19 = composer6.changed(mutableState73);
                                    Object objRememberedValue38 = composer6.rememberedValue();
                                    if (zChanged19 || objRememberedValue38 == companion7.getEmpty()) {
                                        objRememberedValue38 = new s72(7, mutableState73);
                                        composer6.updateRememberedValue(objRememberedValue38);
                                    }
                                    ef2.i("同步服务器配置", "包含服务器地址、用户名、密码、Token、备用线路和最后使用服务器。", zBooleanValue4, (Function0) objRememberedValue38, composer6, 54);
                                    MutableState mutableState74 = mutableState33;
                                    boolean zBooleanValue5 = ((Boolean) mutableState74.getValue()).booleanValue();
                                    boolean zChanged110 = composer6.changed(mutableState74);
                                    Object objRememberedValue39 = composer6.rememberedValue();
                                    if (zChanged110 || objRememberedValue39 == companion7.getEmpty()) {
                                        objRememberedValue39 = new s72(8, mutableState74);
                                        composer6.updateRememberedValue(objRememberedValue39);
                                    }
                                    ef2.i("同步应用设置", "包含弹幕源配置、代理、在线字幕、图标库 URL、主题、缓冲、DLNA、排序和 Trakt 基础配置；不包含字幕字体文件、播放器相关偏好和 Trakt 授权 Token。", zBooleanValue5, (Function0) objRememberedValue39, composer6, 54);
                                    Composer composer7 = composer6;
                                    MutableState mutableState75 = mutableState38;
                                    String str11 = (String) mutableState75.getValue();
                                    if (str11 == null || StringsKt.isBlank(str11)) {
                                        mutableState47 = mutableState73;
                                        mutableState48 = mutableState74;
                                        ze2Var = this;
                                        coroutineScope9 = coroutineScope8;
                                        focusRequester5 = focusRequester6;
                                        i11 = i19;
                                        materialTheme2 = materialTheme4;
                                        composer7.startReplaceGroup(-79603337);
                                        composer7.endReplaceGroup();
                                    } else {
                                        composer7.startReplaceGroup(-79852081);
                                        String str12 = (String) mutableState75.getValue();
                                        if (str12 == null) {
                                            str12 = "";
                                        }
                                        TextStyle bodySmall2 = materialTheme4.getTypography(composer7, i19).getBodySmall();
                                        i11 = i19;
                                        focusRequester5 = focusRequester6;
                                        mutableState47 = mutableState73;
                                        mutableState48 = mutableState74;
                                        coroutineScope9 = coroutineScope8;
                                        ze2Var = this;
                                        materialTheme2 = materialTheme4;
                                        TextKt.m3048TextNvy7gAk(str12, null, ColorKt.Color(4281236786L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall2, composer7, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                                        composer7 = composer7;
                                        composer7.endReplaceGroup();
                                    }
                                    MutableState mutableState76 = mutableState39;
                                    String str13 = (String) mutableState76.getValue();
                                    MutableState mutableState77 = mutableState40;
                                    if (str13 == null || StringsKt.isBlank(str13)) {
                                        mutableState49 = mutableState77;
                                        i12 = i11;
                                        composer7.startReplaceGroup(-78889097);
                                        composer7.endReplaceGroup();
                                    } else {
                                        composer7.startReplaceGroup(-79523357);
                                        int iOrdinal = ((ue2) mutableState77.getValue()).ordinal();
                                        if (iOrdinal == 0) {
                                            i14 = i11;
                                            composer7.startReplaceGroup(690175132);
                                            composer7.endReplaceGroup();
                                            jColor = ColorKt.Color(4281236786L);
                                        } else if (iOrdinal == 1) {
                                            i14 = i11;
                                            composer7.startReplaceGroup(690178608);
                                            jColor = materialTheme2.getColorScheme(composer7, i14).getError();
                                            composer7.endReplaceGroup();
                                        } else {
                                            if (iOrdinal != 2) {
                                                composer7.startReplaceGroup(690172629);
                                                composer7.endReplaceGroup();
                                                qu.f();
                                                return null;
                                            }
                                            composer7.startReplaceGroup(690181682);
                                            i14 = i11;
                                            jColor = materialTheme2.getColorScheme(composer7, i14).getPrimary();
                                            composer7.endReplaceGroup();
                                        }
                                        String str14 = (String) mutableState76.getValue();
                                        Composer composer8 = composer7;
                                        mutableState49 = mutableState77;
                                        i12 = i14;
                                        TextKt.m3048TextNvy7gAk(str14 != null ? str14 : "", null, jColor, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer7, i14).getBodySmall(), composer8, 0, 0, 131066);
                                        composer7 = composer8;
                                        composer7.endReplaceGroup();
                                    }
                                    MutableState mutableState78 = mutableState41;
                                    if (((String) mutableState78.getValue()) != null) {
                                        composer7.startReplaceGroup(-78796841);
                                        int i24 = i12;
                                        Composer composer9 = composer7;
                                        mutableState50 = mutableState78;
                                        i13 = i24;
                                        TextKt.m3048TextNvy7gAk(c61.n((String) mutableState78.getValue(), "进行中，请稍候..."), null, materialTheme2.getColorScheme(composer7, i24).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer7, i24).getBodySmall(), composer9, 0, 0, 131066);
                                        composer7 = composer9;
                                        composer7.endReplaceGroup();
                                    } else {
                                        mutableState50 = mutableState78;
                                        i13 = i12;
                                        composer7.startReplaceGroup(-78525033);
                                        composer7.endReplaceGroup();
                                    }
                                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getTop(), composer7, 6);
                                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                                    int i25 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default3);
                                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                    if (composer7.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer7.startReusableNode();
                                    if (composer7.getInserting()) {
                                        composer7.createNode(constructor6);
                                    } else {
                                        composer7.useNode();
                                    }
                                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer7);
                                    mr.z(companion6, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl6, Integer.valueOf(i25), composerM4318constructorimpl6));
                                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), focusRequester5);
                                    MutableState mutableState79 = mutableState71;
                                    MutableState mutableState80 = mutableState47;
                                    MutableState mutableState81 = mutableState48;
                                    boolean zChanged111 = composer7.changed(mutableState66) | composer7.changed(mutableState70) | composer7.changed(mutableState79) | composer7.changed(mutableState80) | composer7.changed(mutableState81);
                                    Function1 function14 = function6;
                                    CoroutineScope coroutineScope13 = coroutineScope9;
                                    boolean zChanged20 = zChanged111 | composer7.changed(function14) | composer7.changedInstance(coroutineScope13);
                                    pf2 pf2Var4 = pf2Var3;
                                    boolean zChangedInstance8 = zChanged20 | composer7.changedInstance(pf2Var4);
                                    Object objRememberedValue40 = composer7.rememberedValue();
                                    if (zChangedInstance8 || objRememberedValue40 == companion7.getEmpty()) {
                                        mutableState51 = mutableState49;
                                        objRememberedValue40 = new ha1(pf2Var4, function14, coroutineScope13, mutableState50, mutableState66, mutableState70, mutableState79, mutableState80, mutableState81, mutableState76, mutableState51);
                                        mutableState79 = mutableState79;
                                        mutableState52 = mutableState80;
                                        mutableState53 = mutableState70;
                                        mutableState54 = mutableState81;
                                        mutableState55 = mutableState66;
                                        composer7.updateRememberedValue(objRememberedValue40);
                                    } else {
                                        mutableState53 = mutableState70;
                                        mutableState52 = mutableState80;
                                        mutableState51 = mutableState49;
                                        mutableState55 = mutableState66;
                                        mutableState54 = mutableState81;
                                    }
                                    boolean z14 = z13;
                                    ef2.a(48, 8, null, composer7, modifierFocusRequester, "测试连接", (Function0) objRememberedValue40, z14);
                                    MutableState mutableState82 = mutableState52;
                                    MutableState mutableState83 = mutableState79;
                                    MutableState mutableState84 = mutableState54;
                                    MutableState mutableState85 = mutableState53;
                                    Modifier modifierE4 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                    boolean zChanged21 = composer7.changed(mutableState55) | composer7.changed(mutableState85) | composer7.changed(mutableState83) | composer7.changed(mutableState82) | composer7.changed(mutableState84) | composer7.changed(function14);
                                    Object objRememberedValue41 = composer7.rememberedValue();
                                    if (zChanged21 || objRememberedValue41 == companion7.getEmpty()) {
                                        MutableState mutableState86 = mutableState55;
                                        mutableState56 = mutableState84;
                                        yq1Var = new yq1(function14, mutableState86, mutableState85, mutableState83, mutableState82, mutableState56, mutableState76, mutableState51, 1);
                                        mutableState55 = mutableState86;
                                        mutableState57 = mutableState85;
                                        mutableState58 = mutableState83;
                                        mutableState59 = mutableState82;
                                        function7 = function14;
                                        composer7.updateRememberedValue(yq1Var);
                                    } else {
                                        mutableState59 = mutableState82;
                                        mutableState56 = mutableState84;
                                        mutableState57 = mutableState85;
                                        mutableState58 = mutableState83;
                                        yq1Var = objRememberedValue41;
                                        function7 = function14;
                                    }
                                    ef2.a(48, 8, null, composer7, modifierE4, "保存配置", (Function0) yq1Var, z14);
                                    MutableState mutableState87 = mutableState59;
                                    MutableState mutableState88 = mutableState58;
                                    MutableState mutableState89 = mutableState56;
                                    Function1 function15 = function7;
                                    MutableState mutableState90 = mutableState57;
                                    Modifier modifierE5 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                    boolean zChanged22 = composer7.changed(mutableState55) | composer7.changed(mutableState90) | composer7.changed(mutableState88) | composer7.changed(mutableState87) | composer7.changed(mutableState89);
                                    Object objRememberedValue42 = composer7.rememberedValue();
                                    MutableState mutableState91 = mutableState42;
                                    MutableState mutableState92 = mutableState43;
                                    if (zChanged22 || objRememberedValue42 == companion7.getEmpty()) {
                                        MutableState mutableState93 = mutableState55;
                                        mutableState60 = mutableState87;
                                        c4 c4Var3 = new c4(mutableState50, mutableState91, mutableState92, mutableState93, mutableState90, mutableState88, mutableState60, mutableState89);
                                        mutableState61 = mutableState88;
                                        mutableState62 = mutableState89;
                                        mutableState63 = mutableState92;
                                        mutableState55 = mutableState93;
                                        mutableState64 = mutableState90;
                                        composer7.updateRememberedValue(c4Var3);
                                        objRememberedValue42 = c4Var3;
                                    } else {
                                        mutableState63 = mutableState92;
                                        mutableState60 = mutableState87;
                                        mutableState62 = mutableState89;
                                        mutableState64 = mutableState90;
                                        mutableState61 = mutableState88;
                                    }
                                    ef2.a(48, 8, null, composer7, modifierE5, "上传配置", (Function0) objRememberedValue42, z14);
                                    MutableState mutableState94 = mutableState60;
                                    MutableState mutableState95 = mutableState61;
                                    MutableState mutableState96 = mutableState62;
                                    MutableState mutableState97 = mutableState64;
                                    Modifier modifierE6 = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                    boolean zChanged23 = composer7.changed(mutableState55) | composer7.changed(mutableState97) | composer7.changed(mutableState95) | composer7.changed(mutableState94) | composer7.changed(mutableState96) | composer7.changed(r11) | composer7.changedInstance(coroutineScope13) | composer7.changedInstance(pf2Var4);
                                    Object objRememberedValue43 = composer7.rememberedValue();
                                    if (zChanged23 || objRememberedValue43 == companion7.getEmpty()) {
                                        fi fiVar = new fi(function15, coroutineScope13, mutableState50, mutableState91, mutableState63, mutableState55, mutableState97, mutableState95, mutableState94, mutableState96, mutableState76, pf2Var4, mutableState51);
                                        composer7.updateRememberedValue(fiVar);
                                        objRememberedValue43 = fiVar;
                                    }
                                    ef2.a(48, 8, null, composer7, modifierE6, "下载配置", (Function0) objRememberedValue43, z14);
                                    composer7.endNode();
                                    int i26 = i13;
                                    Composer composer10 = composer7;
                                    TextKt.m3048TextNvy7gAk("配置中会包含服务器密码与登录Token，请只使用你自己可控的 WebDAV", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer7, i26).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer7, i26).getBodySmall(), composer10, 6, 0, 131066);
                                    if (x2.m(composer10)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 196614, 26);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 432, 0);
            gd1Var = (gd1) mutableState19.getValue();
            if (gd1Var == null) {
                composer2.startReplaceGroup(-1701999430);
                composer2.endReplaceGroup();
                pf2Var2 = pf2Var;
            } else {
                composer2.startReplaceGroup(-1701999429);
                ve2 ve2Var2 = gd1Var.b;
                if (((String) mutableState18.getValue()) != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new s72(9, mutableState19);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                Function0 function6 = (Function0) objRememberedValue5;
                boolean zChangedInstance6 = composer2.changedInstance(coroutineScope3) | composer2.changedInstance(pf2Var);
                if ((i7 & 458752) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zChangedInstance2 = zChangedInstance6 | z8 | composer2.changedInstance(gd1Var);
                objRememberedValue6 = composer2.rememberedValue();
                if (zChangedInstance2) {
                    c4 c4Var3 = new c4(gd1Var, coroutineScope3, mutableState18, mutableState16, pf2Var, function2, mutableState19, mutableState17);
                    pf2Var2 = pf2Var;
                    composer2.updateRememberedValue(c4Var3);
                    objRememberedValue6 = c4Var3;
                } else {
                    c4 c4Var4 = new c4(gd1Var, coroutineScope3, mutableState18, mutableState16, pf2Var, function2, mutableState19, mutableState17);
                    pf2Var2 = pf2Var;
                    composer2.updateRememberedValue(c4Var4);
                    objRememberedValue6 = c4Var4;
                }
                c(ve2Var2, z7, function6, (Function0) objRememberedValue6, composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                composer2.endReplaceGroup();
            }
            hd1Var = (hd1) mutableState20.getValue();
            if (hd1Var == null) {
                composer2.startReplaceGroup(-1701685214);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1701685213);
                ye2 ye2Var3 = hd1Var.a;
                if (((String) mutableState18.getValue()) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objRememberedValue7 = composer2.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new s72(10, mutableState20);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                Function0 function7 = (Function0) objRememberedValue7;
                if (i8 != 16384) {
                    z6 = false;
                }
                zChangedInstance3 = z6 | composer2.changedInstance(coroutineScope3) | composer2.changedInstance(pf2Var2) | composer2.changed(hd1Var);
                objRememberedValue8 = composer2.rememberedValue();
                if (zChangedInstance3) {
                    c4 c4Var5 = new c4(hd1Var, function1, coroutineScope3, mutableState18, mutableState16, pf2Var, mutableState20, mutableState17);
                    composer2.updateRememberedValue(c4Var5);
                    objRememberedValue8 = c4Var5;
                } else {
                    c4 c4Var6 = new c4(hd1Var, function1, coroutineScope3, mutableState18, mutableState16, pf2Var, mutableState20, mutableState17);
                    composer2.updateRememberedValue(c4Var6);
                    objRememberedValue8 = c4Var6;
                }
                j(ye2Var3, z9, function7, (Function0) objRememberedValue8, composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                composer2.endReplaceGroup();
            }
            zChanged3 = composer2.changed(mutableState8) | composer2.changed(softwareKeyboardController2);
            objRememberedValue9 = composer2.rememberedValue();
            if (zChanged3) {
                objRememberedValue9 = new r3(softwareKeyboardController2, mutableState8, focusRequester2, mutableState22, (Continuation) null, 9);
                composer2.updateRememberedValue(objRememberedValue9);
            } else {
                objRememberedValue9 = new r3(softwareKeyboardController2, mutableState8, focusRequester2, mutableState22, (Continuation) null, 9);
                composer2.updateRememberedValue(objRememberedValue9);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh((Object) ye2Var, (Object) pf2Var, (Object) webDavSyncConfigServerManager, function0, function1, function2, i, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ye2 g(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        String string = StringsKt.trim((CharSequence) mutableState.getValue()).toString();
        String string2 = StringsKt.trim((CharSequence) mutableState2.getValue()).toString();
        String string3 = StringsKt.trim((CharSequence) mutableState3.getValue()).toString();
        boolean zBooleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) mutableState5.getValue()).booleanValue();
        string.getClass();
        string2.getClass();
        string3.getClass();
        String strE = hg2.E(string);
        String string4 = StringsKt.trim((CharSequence) string2).toString();
        String string5 = StringsKt.trim((CharSequence) string3).toString();
        strE.getClass();
        string4.getClass();
        string5.getClass();
        return new ye2(strE, string4, string5, zBooleanValue, zBooleanValue2);
    }

    public static final void h(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, CoroutineScope coroutineScope, MutableState mutableState, FocusRequester focusRequester) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        focusManager.clearFocus(true);
        mutableState.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ji(focusRequester, null, 24), 3, null);
    }

    public static final void i(String str, String str2, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1067916816);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1067916816, i2, -1, "com.dh.myembyapp.ui.components.WebDavToggleRow (WebDavSyncDialog.kt:1042)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f));
            int i3 = ClickableSurfaceDefaults.$stable;
            int i4 = i3 << 15;
            SurfaceKt.m8520Surface05tvjtU(function0, null, null, false, 0.0f, clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i4, 30), clickableSurfaceDefaults.m8292colorsoq7We08(u61Var.C, 0L, u61Var.D, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i3 << 24, 250), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(1843123023, true, new mu0(str, str2, 5, z), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 9) & 14, 48, 1054);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(str, str2, z, function0, i, 13));
        }
    }

    public static final void j(ye2 ye2Var, boolean z, Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Function0 function2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-207533627);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ye2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207533627, i2, -1, "com.dh.myembyapp.ui.components.WebDavUploadConfirmDialog (WebDavSyncDialog.kt:893)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            boolean z2 = ye2Var.d;
            boolean z3 = ye2Var.e;
            boolean zChanged = composerStartRestartGroup.changed(z2) | composerStartRestartGroup.changed(z3);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                if (z2) {
                    listCreateListBuilder.add("服务器配置");
                }
                if (z3) {
                    listCreateListBuilder.add("应用设置");
                }
                objRememberedValue2 = CollectionsKt.build(listCreateListBuilder);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            List list = (List) objRememberedValue2;
            boolean z4 = ((i2 & 896) == 256) | ((i2 & Input.Keys.FORWARD_DEL) == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new fv(z, function0, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue3, new DialogProperties(!z, false, false), ComposableLambdaKt.rememberComposableLambda(-1870525412, true, new bl(u61Var, z, list, focusRequester, function0, function2), composerStartRestartGroup, 54), composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            String str = ye2Var.a;
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ji(focusRequester, null, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(str, boolValueOf, boolValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7((Object) ye2Var, z, (Function) function0, (Object) function1, i, 14));
        }
    }
}
