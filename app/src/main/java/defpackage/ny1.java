package defpackage;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.ServerPingState;
import com.dh.myembyapp.data.model.ServerPingStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ny1 {
    public static final void a(final ServerPingState serverPingState, Modifier modifier, final long j, FontWeight fontWeight, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Modifier modifier2;
        final FontWeight fontWeight2;
        String strF;
        long error;
        Composer composerStartRestartGroup = composer.startRestartGroup(-161055648);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(serverPingState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-161055648, i4, -1, "com.dh.myembyapp.ui.components.ServerPingText (ServerPingText.kt:19)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ServerPingState idle = serverPingState == null ? ServerPingState.INSTANCE.getIdle() : serverPingState;
            ServerPingStatus status = idle.getStatus();
            int[] iArr = my1.$EnumSwitchMapping$0;
            switch (iArr[status.ordinal()]) {
                case 1:
                case 2:
                    strF = "...";
                    break;
                case 3:
                    strF = "不通";
                    break;
                case 4:
                    Integer httpStatusCode = idle.getHttpStatusCode();
                    strF = i9.f(httpStatusCode != null ? httpStatusCode.intValue() : 0, "ERR");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    Long latencyMs = idle.getLatencyMs();
                    strF = (latencyMs != null ? latencyMs.longValue() : 0L) + "ms";
                    break;
                default:
                    qu.f();
                    return;
            }
            String str = strF;
            switch (iArr[idle.getStatus().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    composerStartRestartGroup.startReplaceGroup(-155610602);
                    composerStartRestartGroup.endReplaceGroup();
                    error = u61Var.B;
                    break;
                case 4:
                    composerStartRestartGroup.startReplaceGroup(-529256949);
                    Integer httpStatusCode2 = idle.getHttpStatusCode();
                    int iIntValue = (httpStatusCode2 != null ? httpStatusCode2.intValue() : 0) / 100;
                    if (iIntValue == 4) {
                        composerStartRestartGroup.startReplaceGroup(-155617753);
                        composerStartRestartGroup.endReplaceGroup();
                        error = u61Var.N;
                    } else if (iIntValue != 5) {
                        composerStartRestartGroup.startReplaceGroup(-155614908);
                        composerStartRestartGroup.endReplaceGroup();
                        error = u61Var.M;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-155616123);
                        error = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getError();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 5:
                    composerStartRestartGroup.startReplaceGroup(-155629080);
                    composerStartRestartGroup.endReplaceGroup();
                    error = u61Var.P;
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(-155627292);
                    composerStartRestartGroup.endReplaceGroup();
                    error = u61Var.M;
                    break;
                case 7:
                    composerStartRestartGroup.startReplaceGroup(-155625593);
                    composerStartRestartGroup.endReplaceGroup();
                    error = u61Var.N;
                    break;
                case 8:
                    composerStartRestartGroup.startReplaceGroup(-155623896);
                    composerStartRestartGroup.endReplaceGroup();
                    error = u61Var.O;
                    break;
                case 9:
                    composerStartRestartGroup.startReplaceGroup(-155621755);
                    error = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getError();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    composerStartRestartGroup.startReplaceGroup(-155630808);
                    composerStartRestartGroup.endReplaceGroup();
                    qu.f();
                    return;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m3048TextNvy7gAk(str, companion, error, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall(), 0L, j, semiBold, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), composer2, i4 & Input.Keys.FORWARD_DEL, 24576, 114680);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fontWeight2 = semiBold;
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            fontWeight2 = fontWeight;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ly1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ny1.a(serverPingState, modifier2, j, fontWeight2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
