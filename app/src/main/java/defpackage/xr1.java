package defpackage;

import android.content.Context;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xr1 {
    public static final void a(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        int i2;
        ClickableSurfaceBorder clickableSurfaceBorderBorder;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1399277400);
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
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1399277400, i2, -1, "com.dh.myembyapp.ui.components.QrNetworkOptionRow (QrNetworkSettingsDialog.kt:246)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = z ? u61Var.E : u61Var.C;
            long j2 = z ? u61Var.F : u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = i2;
            int i4 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            int i5 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i5 << 24, PsExtractor.VIDEO_STREAM_MASK);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1080429622);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(1.0f), materialTheme.getColorScheme(composerStartRestartGroup, i4).getPrimary()), 0.0f, null, 6, null), new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1080691665);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 29);
                composerStartRestartGroup.endReplaceGroup();
            }
            SurfaceKt.m8520Surface05tvjtU(function0, modifier, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i5 << 15, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceBorderBorder, el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(196392169, true, new mu0(str2, z, str), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | ((i3 >> 6) & Input.Keys.FORWARD_DEL), 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nu0(str, str2, z, modifier, function0, i, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, Function0 function0, Function1 function1, Composer composer, int i) {
        Function1 function2;
        String str2;
        Object next;
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(583204583);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583204583, i2, -1, "com.dh.myembyapp.ui.components.QrNetworkSettingsDialog (QrNetworkSettingsDialog.kt:60)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = null;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                context.getClass();
                List listT = tl0.t(context);
                Iterator it = listT.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((wr1) next).d);
                wr1 wr1Var = (wr1) next;
                objRememberedValue = wr1Var == null ? (wr1) CollectionsKt.firstOrNull(listT) : wr1Var;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wr1 wr1Var2 = (wr1) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = tl0.t(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            List list = (List) objRememberedValue2;
            boolean zChanged = ((i2 & 14) == 4) | composerStartRestartGroup.changed(list);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                if (str == null || (list != null && list.isEmpty())) {
                    str2 = null;
                    break;
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.areEqual(((wr1) it2.next()).a, str)) {
                            str2 = str;
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue4;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new ji(focusRequester, null, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 6);
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((wr1) obj2).a, (String) mutableState.getValue())) {
                    obj = obj2;
                    break;
                }
            }
            wr1 wr1Var3 = (wr1) obj;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1069693744, true, new sd1(u61Var, wr1Var2, wr1Var3 == null ? wr1Var2 : wr1Var3, mutableState, focusRequester, list, function0, function2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(str, function0, function1, i, 24));
        }
    }
}
