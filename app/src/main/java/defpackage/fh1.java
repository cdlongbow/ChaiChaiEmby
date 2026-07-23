package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fh1 {
    public static final void a(Context context, ExoPlayer exoPlayer, String str, DefaultBandwidthMeter defaultBandwidthMeter, CoroutineScope coroutineScope, gh1 gh1Var, hh1 hh1Var, dh1 dh1Var, ch1 ch1Var, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object qzVar;
        ExoPlayer exoPlayer2 = exoPlayer;
        String str2 = str;
        exoPlayer2.getClass();
        defaultBandwidthMeter.getClass();
        coroutineScope.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1925625432);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(exoPlayer2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(defaultBandwidthMeter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(coroutineScope) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(gh1Var) : composerStartRestartGroup.changedInstance(gh1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(hh1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dh1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(ch1Var) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1925625432, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerMediaListenerEffect (PlayerMediaListenerEffect.kt:144)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(gh1Var, composerStartRestartGroup, MediaItem.$stable | AudioVersionPrioritySettings.$stable | ((i2 >> 15) & 14));
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(hh1Var, composerStartRestartGroup, (i2 >> 18) & 14);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(dh1Var, composerStartRestartGroup, (i2 >> 21) & 14);
            State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(ch1Var, composerStartRestartGroup, (i2 >> 24) & 14);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changed(stateRememberUpdatedState4) | composerStartRestartGroup.changedInstance(exoPlayer2) | ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(defaultBandwidthMeter) | composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changed(stateRememberUpdatedState3) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                exoPlayer2 = exoPlayer;
                qzVar = new qz(exoPlayer2, stateRememberUpdatedState4, stateRememberUpdatedState, str2, defaultBandwidthMeter, stateRememberUpdatedState2, stateRememberUpdatedState3, context, coroutineScope, 2);
                str2 = str2;
                composer2.updateRememberedValue(qzVar);
            } else {
                qzVar = objRememberedValue;
                composer2 = composerStartRestartGroup;
                exoPlayer2 = exoPlayer;
            }
            EffectsKt.DisposableEffect(exoPlayer2, str2, (Function1) qzVar, composer2, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ns(context, exoPlayer2, str2, defaultBandwidthMeter, coroutineScope, gh1Var, hh1Var, dh1Var, ch1Var, i, 3));
        }
    }
}
