package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kz1 {
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, Function0 function0, FocusRequester focusRequester, Function0 function1, Composer composer, int i, int i2) {
        String str2;
        int i3;
        FocusRequester focusRequester2;
        boolean z;
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifierFocusRequester;
        boolean z2;
        Object objRememberedValue;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-126960110);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i5 != 0) {
                    focusRequester3 = null;
                } else {
                    focusRequester3 = focusRequester2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-126960110, i3, -1, "com.dh.myembyapp.ui.components.SettingsButton (SettingsDialog.kt:355)");
                }
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f));
                z2 = (i3 & 7168) == 2048;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new tb(10, function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue);
                if (focusRequester3 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
                }
                hc2.e(str2, function0, modifierOnFocusChanged.then(modifierFocusRequester), false, 0L, 0.0f, 0.0f, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new fv0(str, function0, focusRequester3, function1, i, i2, 1));
            }
        }
        i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        focusRequester2 = focusRequester;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i5 != 0) {
                focusRequester3 = null;
            } else {
                focusRequester3 = focusRequester2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-126960110, i3, -1, "com.dh.myembyapp.ui.components.SettingsButton (SettingsDialog.kt:355)");
            }
            modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f));
            if ((i3 & 7168) == 2048) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue = new tb(10, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new tb(10, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue);
            if (focusRequester3 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
            }
            hc2.e(str2, function0, modifierOnFocusChanged2.then(modifierFocusRequester), false, 0L, 0.0f, 0.0f, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fv0(str, function0, focusRequester3, function1, i, i2, 1));
        }
    }

    public static final void b(final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, final Function0 function6, final Function0 function7, boolean z, final Function0 function8, final Function0 function9, final Function0 function10, final Function0 function11, final Function0 function12, final Function0 function13, final Function0 function14, Composer composer, final int i, final int i2) {
        int i3;
        Function0 function15;
        Function0 function16;
        int i4;
        final boolean z2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function6.getClass();
        function7.getClass();
        function10.getClass();
        function11.getClass();
        function12.getClass();
        function14.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041250081);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function15 = function2;
            i3 |= composerStartRestartGroup.changedInstance(function15) ? 256 : 128;
        } else {
            function15 = function2;
        }
        if ((i & 3072) == 0) {
            function16 = function3;
            i3 |= composerStartRestartGroup.changedInstance(function16) ? 2048 : 1024;
        } else {
            function16 = function3;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function6) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function7) ? 8388608 : 4194304;
        }
        int i5 = i3 | 100663296;
        if ((i & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function8) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function9) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function10) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function11) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
        }
        int i6 = i4;
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (74899 & i6) == 74898) ? false : true, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041250081, i5, i6, "com.dh.myembyapp.ui.components.SettingsDialog (SettingsDialog.kt:55)");
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
            Long lValueOf = Long.valueOf(jLongValue);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new tc(focusRequester, jLongValue, null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1088304054, true, new rz(function13, function0, function16, focusRequester, function1, function6, function5, function7, function15, function4, function10, function11, function12, function14, function8, function9), composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = true;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jz1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    kz1.b(function0, function1, function2, function3, function4, function5, function6, function7, z2, function8, function9, function10, function11, function12, function13, function14, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void c(CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ac(bringIntoViewRequester, null), 3, null);
    }
}
