package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bh1 {
    public static final void a(LifecycleOwner lifecycleOwner, Function0 function0, boolean z, Function0 function1, Function0 function2, Function0 function3, boolean z2, Function1 function4, Function1 function5, Function1 function6, Function3 function7, Function2 function8, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        lifecycleOwner2.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1137780370);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lifecycleOwner2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function5) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function6) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function8) ? 32 : 16;
        }
        int i5 = i4;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1137780370, i3, i5, "com.dh.myembyapp.ui.screens.player.PlayerBackgroundLifecycleEffect (PlayerLifecycleEffect.kt:29)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i3 >> 3) & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composerStartRestartGroup, (i3 >> 6) & 14);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i3 >> 9) & 14);
            int i6 = i3;
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i3 >> 12) & 14);
            State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(function3, composerStartRestartGroup, (i6 >> 15) & 14);
            State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z2), composerStartRestartGroup, (i6 >> 18) & 14);
            State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i6 >> 21) & 14);
            State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i6 >> 24) & 14);
            State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i6 >> 27) & 14);
            State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, i5 & 14);
            State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(function8, composerStartRestartGroup, (i5 >> 3) & 14);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState6) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changed(stateRememberUpdatedState7) | composerStartRestartGroup.changed(stateRememberUpdatedState8) | composerStartRestartGroup.changed(stateRememberUpdatedState3) | composerStartRestartGroup.changed(stateRememberUpdatedState4) | composerStartRestartGroup.changed(stateRememberUpdatedState9) | composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changed(stateRememberUpdatedState5) | composerStartRestartGroup.changed(stateRememberUpdatedState10) | composerStartRestartGroup.changed(stateRememberUpdatedState11) | composerStartRestartGroup.changedInstance(lifecycleOwner2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                objRememberedValue = new d60(stateRememberUpdatedState6, lifecycleOwner, stateRememberUpdatedState7, stateRememberUpdatedState, stateRememberUpdatedState8, stateRememberUpdatedState3, stateRememberUpdatedState4, stateRememberUpdatedState9, stateRememberUpdatedState2, stateRememberUpdatedState5, stateRememberUpdatedState10, stateRememberUpdatedState11);
                lifecycleOwner2 = lifecycleOwner;
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                lifecycleOwner2 = lifecycleOwner;
                composer2 = composerStartRestartGroup;
            }
            EffectsKt.DisposableEffect(lifecycleOwner2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, i6 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xg1(lifecycleOwner2, function0, z, function1, function2, function3, z2, function4, function5, function6, function7, function8, i, i2));
        }
    }

    public static final void b(Context context, Function0 function0, Function0 function1, Function0 function2, Composer composer, int i) {
        int i2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-655214781);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-655214781, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerReleaseEffect (PlayerLifecycleEffect.kt:111)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(context, composerStartRestartGroup, i2 & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i2 >> 3) & 14);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i2 >> 6) & 14);
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i2 >> 9) & 14);
            Unit unit = Unit.INSTANCE;
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changed(stateRememberUpdatedState3) | composerStartRestartGroup.changed(stateRememberUpdatedState4) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g9(17, stateRememberUpdatedState2, stateRememberUpdatedState3, stateRememberUpdatedState4, stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5((Object) context, (Object) function0, (Object) function1, (Object) function2, i, 18));
        }
    }
}
