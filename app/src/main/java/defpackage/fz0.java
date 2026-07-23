package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fz0 {
    public static final void a(List list, Set set, Function2 function2, Function0 function0, Composer composer, int i) {
        int i2;
        list.getClass();
        set.getClass();
        function2.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(405724113);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(set) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(405724113, i2, -1, "com.dh.myembyapp.ui.components.LibraryVisibilityDialog (LibraryVisibilityDialog.kt:47)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Long.valueOf(System.currentTimeMillis());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            long jLongValue = ((Number) objRememberedValue2).longValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Long lValueOf = Long.valueOf(jLongValue);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new vm(focusRequester, null, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-229627430, true, new oh(u61Var, list, set, function2, focusRequester, 1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5(list, (Object) set, (Function) function2, function0, i, 15));
        }
    }

    public static final void b(String str, ImageVector imageVector, boolean z, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(903417965);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(903417965, i2, -1, "com.dh.myembyapp.ui.components.LibraryVisibilityRow (LibraryVisibilityDialog.kt:136)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m7813constructorimpl(46.0f));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new h70(29, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue2);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = z ? u61Var.y : u61Var.w;
            long j2 = z ? u61Var.z : u61Var.x;
            long j3 = u61Var.A;
            int i3 = ClickableSurfaceDefaults.$stable;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged, null, false, 0.0f, null, clickableSurfaceDefaults.m8292colorsoq7We08(j, j3, j2, j3, 0L, 0L, 0L, 0L, composer2, i3 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composer2, i3 << 15, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-1162479348, true, new dz0(z, u61Var, imageVector, str, mutableState, 0), composer2, 54), composer2, (i2 >> 9) & 14, 48, 1084);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el(str, imageVector, z, function0, modifier, i, 2));
        }
    }
}
