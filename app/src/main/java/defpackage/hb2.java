package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.TraktDeviceCodeResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hb2 {
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(int i, int i2, jc2 jc2Var, Composer composer, Modifier modifier, String str, Function0 function0, boolean z) {
        int i3;
        Function0 function1;
        boolean z2;
        boolean z3;
        Composer composer2;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1930623526);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(jc2Var.ordinal()) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i4 != 0) {
                    z2 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1930623526, i3, -1, "com.dh.myembyapp.ui.components.TraktActionButton (TraktSyncDialog.kt:627)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                ButtonColors buttonColorsI = hc2.i(jc2Var, z2, composerStartRestartGroup, (i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                ButtonScale buttonScaleL = hc2.l(1.05f);
                ButtonGlow buttonGlowA = el0.a(u61Var);
                ButtonBorder buttonBorderH = hc2.h(composerStartRestartGroup);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new b42(11, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composer2 = composerStartRestartGroup;
                ButtonKt.m8231ButtonTCVpFMg(function1, FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue2), null, z2, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(595634666, true, new cq(jc2Var, z2, str, mutableState), composerStartRestartGroup, 54), composer2, (i3 >> 3) & 7182, RendererCapabilities.DECODER_SUPPORT_MASK, 3396);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
            }
            z4 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new db2(str, function0, modifier, jc2Var, z4, i, i2));
            }
        }
        i3 |= 24576;
        z2 = z;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i4 != 0) {
                z2 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1930623526, i3, -1, "com.dh.myembyapp.ui.components.TraktActionButton (TraktSyncDialog.kt:627)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var2 = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            ButtonColors buttonColorsI2 = hc2.i(jc2Var, z2, composerStartRestartGroup, (i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT, 0);
            ButtonScale buttonScaleL2 = hc2.l(1.05f);
            ButtonGlow buttonGlowA2 = el0.a(u61Var2);
            ButtonBorder buttonBorderH2 = hc2.h(composerStartRestartGroup);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b42(11, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            ButtonKt.m8231ButtonTCVpFMg(function1, FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue2), null, z2, buttonScaleL2, buttonGlowA2, null, buttonColorsI2, 0.0f, buttonBorderH2, null, null, ComposableLambdaKt.rememberComposableLambda(595634666, true, new cq(jc2Var, z2, str, mutableState), composerStartRestartGroup, 54), composer2, (i3 >> 3) & 7182, RendererCapabilities.DECODER_SUPPORT_MASK, 3396);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        z4 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new db2(str, function0, modifier, jc2Var, z4, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0349  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i92 i92Var, final xa2 xa2Var, final Function0 function0, final Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objM;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        Object objM2;
        SnapshotMutationPolicy snapshotMutationPolicy3;
        int i3;
        Object objL;
        int i4;
        String str;
        MutableState mutableState;
        MutableState mutableState2;
        Object eb2Var;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        String str2;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        final MutableState mutableState9;
        Object objY;
        String activationUrl;
        i92Var.getClass();
        boolean z = i92Var.a;
        xa2Var.getClass();
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1726939054);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(i92Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(xa2Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1726939054, i2, -1, "com.dh.myembyapp.ui.components.TraktSyncDialog (TraktSyncDialog.kt:95)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue3;
            int i5 = i92Var.g;
            boolean z2 = i92Var.f;
            boolean z3 = i92Var.e;
            long j = i92Var.d;
            String str3 = i92Var.c;
            String str4 = i92Var.b;
            boolean zChanged = composerStartRestartGroup.changed(z);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objM = mr.m(z, null, 2, null, composerStartRestartGroup);
            } else {
                objM = objRememberedValue4;
                snapshotMutationPolicy = null;
            }
            MutableState mutableState10 = (MutableState) objM;
            boolean zChanged2 = composerStartRestartGroup.changed(str4);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str4, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue5 = mutableStateMutableStateOf$default;
            } else if (objRememberedValue5 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str4, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue5 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState11 = (MutableState) objRememberedValue5;
            boolean zChanged3 = composerStartRestartGroup.changed(str3);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str3, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue6 = mutableStateMutableStateOf$default3;
            }
            MutableState mutableState12 = (MutableState) objRememberedValue6;
            boolean zChanged4 = composerStartRestartGroup.changed(j);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue7 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue7 = mutableStateMutableStateOf$default4;
            }
            MutableState mutableState13 = (MutableState) objRememberedValue7;
            boolean zChanged5 = composerStartRestartGroup.changed(z3);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue8 == companion.getEmpty()) {
                snapshotMutationPolicy2 = null;
                objM2 = mr.m(z3, null, 2, null, composerStartRestartGroup);
            } else {
                objM2 = objRememberedValue8;
                snapshotMutationPolicy2 = null;
            }
            MutableState mutableState14 = (MutableState) objM2;
            boolean zChanged6 = composerStartRestartGroup.changed(z2);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = mr.m(z2, snapshotMutationPolicy2, 2, snapshotMutationPolicy2, composerStartRestartGroup);
            }
            final MutableState mutableState15 = (MutableState) objRememberedValue9;
            boolean zChanged7 = composerStartRestartGroup.changed(i5);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue10 == companion.getEmpty()) {
                int iCoerceIn = RangesKt.coerceIn(i5, 10, 300);
                snapshotMutationPolicy3 = null;
                i3 = 2;
                objL = mr.l(iCoerceIn, null, 2, null, composerStartRestartGroup);
            } else {
                objL = objRememberedValue10;
                snapshotMutationPolicy3 = null;
                i3 = 2;
            }
            final MutableState mutableState16 = (MutableState) objL;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy3, snapshotMutationPolicy3, i3, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            MutableState mutableState17 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            final MutableState mutableState18 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                i4 = 2;
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            } else {
                i4 = 2;
            }
            MutableState mutableState19 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            MutableState mutableState20 = (MutableState) objRememberedValue14;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(q92.c, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            MutableState mutableState21 = (MutableState) objRememberedValue15;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == companion.getEmpty()) {
                str = null;
                objRememberedValue16 = new ji(focusRequester, null, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            } else {
                str = null;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue16, composerStartRestartGroup, 6);
            TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) mutableState17.getValue();
            String deviceCode = traktDeviceCodeResponse != null ? traktDeviceCodeResponse.getDeviceCode() : str;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) mutableState19.getValue()).booleanValue());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(xa2Var) | composerStartRestartGroup.changed(mutableState10) | composerStartRestartGroup.changed(mutableState11) | composerStartRestartGroup.changed(mutableState12) | composerStartRestartGroup.changed(mutableState13) | composerStartRestartGroup.changed(mutableState14) | composerStartRestartGroup.changed(mutableState15) | composerStartRestartGroup.changed(mutableState16) | ((i2 & 7168) == 2048);
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue17 == companion.getEmpty()) {
                mutableState = mutableState13;
                mutableState2 = mutableState10;
                mutableState3 = mutableState11;
                composer2 = composerStartRestartGroup;
                mutableState4 = mutableState17;
                mutableState5 = mutableState20;
                str2 = null;
                mutableState6 = mutableState14;
                mutableState7 = mutableState12;
                mutableState8 = mutableState21;
                eb2Var = new eb2(xa2Var, function1, mutableState4, mutableState19, mutableState5, mutableState8, mutableState2, mutableState3, mutableState7, mutableState, mutableState6, mutableState15, mutableState16, focusRequester2, null);
                mutableState9 = mutableState19;
                composer2.updateRememberedValue(eb2Var);
            } else {
                composer2 = composerStartRestartGroup;
                mutableState = mutableState13;
                mutableState9 = mutableState19;
                mutableState4 = mutableState17;
                str2 = null;
                mutableState2 = mutableState10;
                mutableState3 = mutableState11;
                eb2Var = objRememberedValue17;
                mutableState6 = mutableState14;
                mutableState5 = mutableState20;
                mutableState7 = mutableState12;
                mutableState8 = mutableState21;
            }
            EffectsKt.LaunchedEffect(deviceCode, boolValueOf, (Function2) eb2Var, composer2, 0);
            TraktDeviceCodeResponse traktDeviceCodeResponse2 = (TraktDeviceCodeResponse) mutableState4.getValue();
            boolean zChanged8 = composer2.changed(traktDeviceCodeResponse2 != null ? traktDeviceCodeResponse2.getActivationUrl() : str2);
            Object objRememberedValue18 = composer2.rememberedValue();
            if (zChanged8 || objRememberedValue18 == companion.getEmpty()) {
                TraktDeviceCodeResponse traktDeviceCodeResponse3 = (TraktDeviceCodeResponse) mutableState4.getValue();
                if (traktDeviceCodeResponse3 == null || (activationUrl = traktDeviceCodeResponse3.getActivationUrl()) == null) {
                    objY = str2;
                } else {
                    if (StringsKt.isBlank(activationUrl)) {
                        activationUrl = str2;
                    }
                    if (activationUrl != null) {
                        objY = ku.y(280, 280, activationUrl);
                    } else {
                        objY = str2;
                    }
                }
                composer2.updateRememberedValue(objY);
                objRememberedValue18 = objY;
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue18;
            final boolean z4 = (StringsKt.isBlank((String) mutableState3.getValue()) || StringsKt.isBlank((String) mutableState7.getValue())) ? false : true;
            final boolean z5 = z4;
            final MutableState mutableState22 = mutableState5;
            final MutableState mutableState23 = mutableState3;
            final MutableState mutableState24 = mutableState7;
            final MutableState mutableState25 = mutableState4;
            final MutableState mutableState26 = mutableState2;
            final MutableState mutableState27 = mutableState6;
            final MutableState mutableState28 = mutableState8;
            final MutableState mutableState29 = mutableState;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-1563883095, true, new Function2() { // from class: cb2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1563883095, iIntValue, -1, "com.dh.myembyapp.ui.components.TraktSyncDialog.<anonymous> (TraktSyncDialog.kt:284)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), u61Var.a, null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(860.0f)), 0.0f, Dp.m7813constructorimpl(620.0f), 1, null);
                        RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f));
                        CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14);
                        final Bitmap bitmap2 = bitmap;
                        final MutableState mutableState30 = mutableState26;
                        final MutableState mutableState31 = mutableState23;
                        final MutableState mutableState32 = mutableState24;
                        final MutableState mutableState33 = mutableState29;
                        final MutableState mutableState34 = mutableState27;
                        final MutableState mutableState35 = mutableState15;
                        final MutableState mutableState36 = mutableState16;
                        final Function1 function2 = function1;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final xa2 xa2Var2 = xa2Var;
                        final MutableState mutableState37 = mutableState25;
                        final boolean z6 = z4;
                        final MutableState mutableState38 = mutableState9;
                        final MutableState mutableState39 = mutableState18;
                        final MutableState mutableState40 = mutableState22;
                        final MutableState mutableState41 = mutableState28;
                        final FocusRequester focusRequester3 = focusRequester;
                        final boolean z7 = z5;
                        final Function0 function3 = function0;
                        final FocusRequester focusRequester4 = focusRequester2;
                        CardKt.Card(modifierM1052heightInVpY3zN4$default, roundedCornerShapeM1312RoundedCornerShape0680j_4, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-810773343, true, new Function3() { // from class: bb2
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                boolean z8;
                                long jM5151copywmQWz5c$default;
                                boolean z9;
                                int i7;
                                Modifier.Companion companion4;
                                ComposeUiNode.Companion companion5;
                                Composer composer4;
                                MutableState mutableState42;
                                MutableState mutableState43;
                                MutableState mutableState44;
                                MutableState mutableState45;
                                MutableState mutableState46;
                                MutableState mutableState47;
                                Modifier.Companion companion6;
                                float f;
                                MutableState mutableState48;
                                MutableState mutableState49;
                                MutableState mutableState50;
                                MutableState mutableState51;
                                MutableState mutableState52;
                                Function1 function4;
                                MutableState mutableState53;
                                MutableState mutableState54;
                                MutableState mutableState55;
                                MutableState mutableState56;
                                Function1 function5;
                                MutableState mutableState57;
                                MutableState mutableState58;
                                long jColor;
                                Composer composer5 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((ColumnScope) obj3).getClass();
                                if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-810773343, iIntValue2, -1, "com.dh.myembyapp.ui.components.TraktSyncDialog.<anonymous>.<anonymous>.<anonymous> (TraktSyncDialog.kt:299)");
                                    }
                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f));
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
                                    Alignment.Companion companion8 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion8.getTop(), composer5, 6);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs);
                                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion9.getConstructor();
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
                                    mr.z(companion9, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion7, Dp.m7813constructorimpl(300.0f));
                                    MeasurePolicy measurePolicyP = mr.p(8.0f, arrangement, companion8.getCenterHorizontally(), composer5, 54);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM1069width3ABfNKs);
                                    Function0<ComposeUiNode> constructor3 = companion9.getConstructor();
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
                                    mr.z(companion9, composerM4318constructorimpl3, measurePolicyP, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    Bitmap bitmap3 = bitmap2;
                                    MutableState mutableState59 = mutableState37;
                                    boolean z10 = (bitmap3 == null || ((TraktDeviceCodeResponse) mutableState59.getValue()) == null) ? false : true;
                                    String str5 = z10 ? "Trakt 授权" : "Trakt 配置";
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i10 = MaterialTheme.$stable;
                                    TextStyle titleMedium = materialTheme.getTypography(composer5, i10).getTitleMedium();
                                    long primary = materialTheme.getColorScheme(composer5, i10).getPrimary();
                                    FontWeight.Companion companion10 = FontWeight.INSTANCE;
                                    boolean z11 = z10;
                                    TextKt.m3048TextNvy7gAk(str5, null, primary, null, 0L, null, companion10.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, titleMedium, composer5, 1572864, 0, 131002);
                                    boolean z12 = z6;
                                    if (z11) {
                                        composer5.startReplaceGroup(-329746148);
                                        ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap3), "Trakt 授权二维码", SizeKt.m1064size3ABfNKs(companion7, Dp.m7813constructorimpl(176.0f)), null, null, 0.0f, null, 0, composer5, 432, 248);
                                        TraktDeviceCodeResponse traktDeviceCodeResponse4 = (TraktDeviceCodeResponse) mutableState59.getValue();
                                        String userCode = traktDeviceCodeResponse4 != null ? traktDeviceCodeResponse4.getUserCode() : null;
                                        String str6 = userCode == null ? "" : userCode;
                                        TextStyle titleMedium2 = materialTheme.getTypography(composer5, i10).getTitleMedium();
                                        long onSurface = materialTheme.getColorScheme(composer5, i10).getOnSurface();
                                        FontWeight bold = companion10.getBold();
                                        TextAlign.Companion companion11 = TextAlign.INSTANCE;
                                        z8 = z12;
                                        TextKt.m3048TextNvy7gAk(str6, null, onSurface, null, 0L, null, bold, null, 0L, null, TextAlign.m7696boximpl(companion11.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, titleMedium2, composer5, 1572864, 0, 129978);
                                        TraktDeviceCodeResponse traktDeviceCodeResponse5 = (TraktDeviceCodeResponse) mutableState59.getValue();
                                        String activationUrl2 = traktDeviceCodeResponse5 != null ? traktDeviceCodeResponse5.getActivationUrl() : null;
                                        TextKt.m3048TextNvy7gAk(activationUrl2 == null ? "" : activationUrl2, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i10).getOnSurface(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(companion11.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i10).getBodySmall(), composer5, 0, 0, 130042);
                                        composer4 = composer5;
                                        composer4.endReplaceGroup();
                                        companion5 = companion9;
                                        i7 = i10;
                                        companion4 = companion7;
                                        z9 = false;
                                    } else {
                                        z8 = z12;
                                        composer5.startReplaceGroup(-328641897);
                                        Modifier modifierBorder = BorderKt.border(SizeKt.m1064size3ABfNKs(companion7, Dp.m7813constructorimpl(176.0f)), BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i10).getOutline(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)));
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getCenter(), false);
                                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                        int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierBorder);
                                        Function0<ComposeUiNode> constructor4 = companion9.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor4);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer5);
                                        mr.z(companion9, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl4, Integer.valueOf(i11), composerM4318constructorimpl4));
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        String str7 = z8 ? "已授权" : "未授权";
                                        if (z8) {
                                            composer5.startReplaceGroup(831990108);
                                            composer5.endReplaceGroup();
                                            jM5151copywmQWz5c$default = ColorKt.Color(4284922730L);
                                        } else {
                                            composer5.startReplaceGroup(832093462);
                                            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i10).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
                                            composer5.endReplaceGroup();
                                        }
                                        z9 = false;
                                        i7 = i10;
                                        companion4 = companion7;
                                        companion5 = companion9;
                                        TextKt.m3048TextNvy7gAk(str7, null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer5, 0, 0, 261114);
                                        composer4 = composer5;
                                        composer4.endNode();
                                        composer4.endReplaceGroup();
                                    }
                                    MutableState mutableState60 = mutableState38;
                                    String str8 = ((Boolean) mutableState60.getValue()).booleanValue() ? "等待授权中" : "生成授权二维码";
                                    MutableState mutableState61 = mutableState39;
                                    boolean z13 = (((Boolean) mutableState61.getValue()).booleanValue() || ((Boolean) mutableState60.getValue()).booleanValue()) ? z9 : true;
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(176.0f)), Dp.m7813constructorimpl(48.0f));
                                    jc2 jc2Var = jc2.b;
                                    MutableState mutableState62 = mutableState30;
                                    boolean zChanged9 = composer4.changed(mutableState62);
                                    MutableState mutableState63 = mutableState31;
                                    boolean zChanged10 = zChanged9 | composer4.changed(mutableState63);
                                    MutableState mutableState64 = mutableState32;
                                    boolean zChanged11 = zChanged10 | composer4.changed(mutableState64);
                                    MutableState mutableState65 = mutableState33;
                                    boolean zChanged12 = zChanged11 | composer4.changed(mutableState65);
                                    MutableState mutableState66 = mutableState34;
                                    boolean zChanged13 = zChanged12 | composer4.changed(mutableState66);
                                    MutableState mutableState67 = mutableState35;
                                    boolean zChanged14 = zChanged13 | composer4.changed(mutableState67);
                                    MutableState mutableState68 = mutableState36;
                                    boolean zChanged15 = zChanged14 | composer4.changed(mutableState68);
                                    Function1 function6 = function2;
                                    boolean zChanged16 = zChanged15 | composer4.changed(function6);
                                    CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean zChangedInstance2 = zChanged16 | composer4.changedInstance(coroutineScope3);
                                    xa2 xa2Var3 = xa2Var2;
                                    boolean zChangedInstance3 = zChangedInstance2 | composer4.changedInstance(xa2Var3);
                                    Object objRememberedValue19 = composer4.rememberedValue();
                                    MutableState mutableState69 = mutableState40;
                                    MutableState mutableState70 = mutableState41;
                                    if (zChangedInstance3 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                        mutableState42 = mutableState70;
                                        mutableState43 = mutableState62;
                                        objRememberedValue19 = new fb2(coroutineScope3, mutableState61, mutableState60, function6, mutableState43, mutableState63, mutableState64, mutableState65, mutableState66, mutableState67, mutableState68, mutableState69, mutableState42, xa2Var3, mutableState59);
                                        mutableState44 = mutableState63;
                                        mutableState45 = mutableState64;
                                        mutableState46 = mutableState66;
                                        composer4.updateRememberedValue(objRememberedValue19);
                                    } else {
                                        mutableState42 = mutableState70;
                                        mutableState45 = mutableState64;
                                        mutableState46 = mutableState66;
                                        mutableState43 = mutableState62;
                                        mutableState44 = mutableState63;
                                    }
                                    hb2.a(3456, 0, jc2Var, composer4, modifierM1050height3ABfNKs, str8, (Function0) ((KFunction) objRememberedValue19), z13);
                                    hb2.h(z11, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), composer4, 48);
                                    composer4.endNode();
                                    Modifier.Companion companion12 = companion4;
                                    MutableState mutableState71 = mutableState46;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(zs1.E(rowScopeInstance, companion12, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion8.getStart(), composer4, 6);
                                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i12 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, modifierVerticalScroll$default);
                                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor5);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer4);
                                    ComposeUiNode.Companion companion13 = companion5;
                                    mr.z(companion13, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl5, currentCompositionLocalMap5);
                                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl5, Integer.valueOf(i12), composerM4318constructorimpl5));
                                    MeasurePolicy measurePolicyQ = mr.q(10.0f, arrangement, companion8.getCenterVertically(), composer4, 54);
                                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i13 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, companion12);
                                    Function0<ComposeUiNode> constructor6 = companion13.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor6);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer4);
                                    mr.z(companion13, composerM4318constructorimpl6, measurePolicyQ, composerM4318constructorimpl6, currentCompositionLocalMap6);
                                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl6, Integer.valueOf(i13), composerM4318constructorimpl6));
                                    int i14 = i7;
                                    Composer composer6 = composer4;
                                    MutableState mutableState72 = mutableState44;
                                    MutableState mutableState73 = mutableState45;
                                    TextKt.m3048TextNvy7gAk("Trakt 同步", null, 0L, null, 0L, null, companion10.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i14).getTitleLarge(), composer6, 1572870, 0, 131006);
                                    Composer composer7 = composer6;
                                    if (z8) {
                                        composer7.startReplaceGroup(-1409964894);
                                        TextKt.m3048TextNvy7gAk("已授权", null, ColorKt.Color(4284922730L), null, 0L, null, companion10.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i14).getBodyMedium(), composer7, 1573254, 0, 131002);
                                        composer7 = composer7;
                                        composer7.endReplaceGroup();
                                    } else {
                                        composer7.startReplaceGroup(-1409648756);
                                        composer7.endReplaceGroup();
                                    }
                                    composer7.endNode();
                                    boolean zBooleanValue = ((Boolean) mutableState43.getValue()).booleanValue();
                                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null), focusRequester3);
                                    MutableState mutableState74 = mutableState43;
                                    boolean zChanged17 = composer7.changed(mutableState74);
                                    Object objRememberedValue20 = composer7.rememberedValue();
                                    if (zChanged17 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue20 = new s72(4, mutableState74);
                                        composer7.updateRememberedValue(objRememberedValue20);
                                    }
                                    Composer composer8 = composer7;
                                    hb2.g(54, composer8, modifierFocusRequester, "启用 Trakt 同步", "控制 Trakt 云端进度读取和本地进度上传。", (Function0) objRememberedValue20, zBooleanValue);
                                    boolean zBooleanValue2 = ((Boolean) mutableState71.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
                                    boolean zChanged18 = composer8.changed(mutableState71);
                                    Object objRememberedValue21 = composer8.rememberedValue();
                                    if (zChanged18 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue21 = new s72(5, mutableState71);
                                        composer8.updateRememberedValue(objRememberedValue21);
                                    }
                                    hb2.g(3126, composer8, modifierFillMaxWidth$default, "播放前询问云端进度", "关闭后只保留授权信息，不在起播前检查 Trakt。", (Function0) objRememberedValue21, zBooleanValue2);
                                    boolean zBooleanValue3 = ((Boolean) mutableState67.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
                                    boolean zChanged19 = composer8.changed(mutableState67);
                                    Object objRememberedValue22 = composer8.rememberedValue();
                                    if (zChanged19 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue22 = new s72(6, mutableState67);
                                        composer8.updateRememberedValue(objRememberedValue22);
                                    }
                                    hb2.g(3126, composer8, modifierFillMaxWidth$default2, "上传本地进度到 Trakt", "开始、暂停、退出、播放完成或标记已看时同步到 Trakt。", (Function0) objRememberedValue22, zBooleanValue3);
                                    Composer composer9 = composer8;
                                    int iIntValue3 = ((Number) mutableState68.getValue()).intValue();
                                    boolean zChanged20 = composer9.changed(mutableState68);
                                    Object objRememberedValue23 = composer9.rememberedValue();
                                    if (zChanged20 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue23 = new b42(10, mutableState68);
                                        composer9.updateRememberedValue(objRememberedValue23);
                                    }
                                    hb2.f(SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null), (Function1) objRememberedValue23, iIntValue3, composer9, RendererCapabilities.DECODER_SUPPORT_MASK);
                                    String str9 = (String) mutableState69.getValue();
                                    if (str9 == null || StringsKt.isBlank(str9)) {
                                        mutableState47 = mutableState68;
                                        companion6 = companion12;
                                        f = 0.0f;
                                        mutableState48 = mutableState74;
                                        mutableState49 = mutableState71;
                                        composer9.startReplaceGroup(1861740240);
                                        composer9.endReplaceGroup();
                                    } else {
                                        composer9.startReplaceGroup(1861175327);
                                        String str10 = (String) mutableState69.getValue();
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        TextStyle bodySmall = materialTheme.getTypography(composer9, i14).getBodySmall();
                                        int iOrdinal = ((q92) mutableState42.getValue()).ordinal();
                                        if (iOrdinal == 0) {
                                            composer9.startReplaceGroup(1445519299);
                                            composer9.endReplaceGroup();
                                            jColor = ColorKt.Color(4281236786L);
                                        } else if (iOrdinal == 1) {
                                            composer9.startReplaceGroup(1445522679);
                                            jColor = materialTheme.getColorScheme(composer9, i14).getError();
                                            composer9.endReplaceGroup();
                                        } else {
                                            if (iOrdinal != 2) {
                                                composer9.startReplaceGroup(1445516909);
                                                composer9.endReplaceGroup();
                                                qu.f();
                                                return null;
                                            }
                                            composer9.startReplaceGroup(1445525989);
                                            jColor = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer9, i14).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
                                            composer9.endReplaceGroup();
                                        }
                                        mutableState48 = mutableState74;
                                        mutableState49 = mutableState71;
                                        mutableState47 = mutableState68;
                                        long j2 = jColor;
                                        companion6 = companion12;
                                        f = 0.0f;
                                        TextKt.m3048TextNvy7gAk(str10, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer9, 0, 0, 131066);
                                        composer9 = composer9;
                                        composer9.endReplaceGroup();
                                    }
                                    id.i(4.0f, companion6, composer9, 6);
                                    Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, f, 1, null), 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, Dp.m7813constructorimpl(12.0f), 5, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(10.0f), companion8.getEnd()), companion8.getTop(), composer9, 6);
                                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer9, 0);
                                    int i15 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap7 = composer9.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer9, modifierM1003paddingqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor7 = companion13.getConstructor();
                                    if (composer9.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer9.startReusableNode();
                                    if (composer9.getInserting()) {
                                        composer9.createNode(constructor7);
                                    } else {
                                        composer9.useNode();
                                    }
                                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer9);
                                    mr.z(companion13, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl7, currentCompositionLocalMap7);
                                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl7, Integer.valueOf(i15), composerM4318constructorimpl7));
                                    if (z7) {
                                        composer9.startReplaceGroup(1478416);
                                        mutableState50 = mutableState72;
                                        mutableState54 = mutableState48;
                                        MutableState mutableState75 = mutableState49;
                                        MutableState mutableState76 = mutableState47;
                                        boolean zChanged21 = composer9.changed(mutableState50) | composer9.changed(mutableState73) | composer9.changed(mutableState52) | composer9.changed(function6) | composer9.changed(mutableState54) | composer9.changed(mutableState75) | composer9.changed(mutableState67) | composer9.changed(mutableState76);
                                        Object objRememberedValue24 = composer9.rememberedValue();
                                        if (zChanged21 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                            mutableState52 = mutableState65;
                                            mutableState52 = mutableState65;
                                            gb2 gb2Var = new gb2(function6, mutableState50, mutableState73, mutableState52, mutableState59, mutableState60, mutableState54, mutableState75, mutableState67, mutableState76, mutableState69, mutableState42);
                                            function5 = function6;
                                            mutableState51 = mutableState73;
                                            mutableState52 = mutableState52;
                                            mutableState55 = mutableState75;
                                            mutableState57 = mutableState67;
                                            mutableState58 = mutableState76;
                                            composer9.updateRememberedValue(gb2Var);
                                            objRememberedValue24 = gb2Var;
                                        } else {
                                            mutableState52 = mutableState65;
                                            mutableState57 = mutableState67;
                                            mutableState58 = mutableState76;
                                            function5 = function6;
                                            mutableState51 = mutableState73;
                                            mutableState55 = mutableState75;
                                        }
                                        function4 = function5;
                                        mutableState53 = mutableState57;
                                        mutableState56 = mutableState58;
                                        hb2.a(3462, 16, jc2.e, composer9, SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(120.0f)), Dp.m7813constructorimpl(48.0f)), "退出授权", (Function0) ((KFunction) objRememberedValue24), false);
                                        composer9.endReplaceGroup();
                                    } else {
                                        mutableState50 = mutableState72;
                                        mutableState51 = mutableState73;
                                        mutableState52 = mutableState65;
                                        function4 = function6;
                                        mutableState53 = mutableState67;
                                        mutableState54 = mutableState48;
                                        mutableState55 = mutableState49;
                                        mutableState56 = mutableState47;
                                        composer9.startReplaceGroup(1913749);
                                        composer9.endReplaceGroup();
                                    }
                                    hb2.a(3462, 16, jc2.c, composer9, SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f)), "取消", function3, false);
                                    MutableState mutableState77 = mutableState56;
                                    Function1 function7 = function4;
                                    boolean zChanged22 = composer9.changed(mutableState54) | composer9.changed(mutableState50) | composer9.changed(mutableState51) | composer9.changed(mutableState52) | composer9.changed(mutableState55) | composer9.changed(mutableState53) | composer9.changed(mutableState77) | composer9.changed(function7);
                                    Object objRememberedValue25 = composer9.rememberedValue();
                                    if (zChanged22 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                        ih ihVar = new ih(function7, mutableState54, mutableState50, mutableState51, mutableState52, mutableState55, mutableState53, mutableState77, mutableState69, mutableState42);
                                        composer9.updateRememberedValue(ihVar);
                                        objRememberedValue25 = ihVar;
                                    }
                                    hb2.a(3078, 16, jc2Var, composer9, FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f)), focusRequester4), "保存", (Function0) objRememberedValue25, false);
                                    if (i02.w(composer9)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 196614, 24);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composer2, 54), composer2, ((i2 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5((Object) i92Var, (Object) xa2Var, function0, (Object) function1, i, 22));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i92 c(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        return new i92(((Boolean) mutableState.getValue()).booleanValue(), (String) mutableState2.getValue(), (String) mutableState3.getValue(), ((Number) mutableState4.getValue()).longValue(), ((Boolean) mutableState5.getValue()).booleanValue(), ((Boolean) mutableState6.getValue()).booleanValue(), ((Number) mutableState7.getValue()).intValue()).e();
    }

    public static final i92 d(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, boolean z) {
        i92 i92VarC = c(mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7);
        mutableState2.setValue(i92VarC.b);
        mutableState3.setValue(i92VarC.c);
        mutableState4.setValue(Long.valueOf(i92VarC.d));
        mutableState7.setValue(Integer.valueOf(i92VarC.g));
        function1.invoke(i92VarC);
        if (z) {
            mutableState8.setValue("已保存 Trakt 配置。");
            mutableState9.setValue(q92.a);
        }
        return i92VarC;
    }

    public static final void e(ImageVector imageVector, String str, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1663263969);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1663263969, i2, -1, "com.dh.myembyapp.ui.components.TraktThresholdIconButton (TraktSyncDialog.kt:761)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            long surfaceVariant = materialTheme.getColorScheme(composerStartRestartGroup, i4).getSurfaceVariant();
            long j = u61Var.D;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i4).getSurfaceVariant(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            int i5 = IconButtonDefaults.$stable;
            composer2 = composerStartRestartGroup;
            IconButtonKt.IconButton(function0, SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(40.0f)), null, z, IconButtonDefaults.scale$default(iconButtonDefaults, 0.0f, 1.15f, 0.0f, 0.0f, 0.0f, 29, null), el0.b(u61Var), null, iconButtonDefaults.m8385colorsoq7We08(surfaceVariant, onSurface, j, onSurface2, 0L, 0L, jM5151copywmQWz5c$default, jM5151copywmQWz5c$default2, composer2, i5 << 24, 48), iconButtonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composer2, i5 << 15, 29), null, ComposableLambdaKt.rememberComposableLambda(-1312230249, true, new jy0(imageVector, str, i3), composer2, 54), composer2, ((i2 >> 9) & 14) | 48 | ((i2 << 3) & 7168), 6, 580);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(imageVector, str, z, function0, i, 12));
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r16v4 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 Object, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v21 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v21 Object, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v21 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v21 Object, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v22 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v22 Object, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v21 Object, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void f(androidx.compose.ui.Modifier r44, kotlin.jvm.functions.Function1 r45, int r46, androidx.compose.runtime.Composer r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb2.f(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, int, androidx.compose.runtime.Composer, int):void");
    }

    public static final void g(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1088486831);
        int i3 = 4;
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
                ComposerKt.traceEventStart(1088486831, i2, -1, "com.dh.myembyapp.ui.components.TraktToggleRow (TraktSyncDialog.kt:548)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = u61Var.C;
            long j2 = u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            int i5 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i5 << 24, PsExtractor.VIDEO_STREAM_MASK);
            int i6 = i5 << 15;
            SurfaceKt.m8520Surface05tvjtU(function0, modifier, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f)), null, null, null, null, composerStartRestartGroup, i6, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i6, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(1156354928, true, new mu0(str, str2, i3, z), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 12) & 14) | ((i2 >> 6) & Input.Keys.FORWARD_DEL), 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nu0(str, str2, z, modifier, function0, i, 4));
        }
    }

    public static final void h(boolean z, Modifier modifier, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(291732914);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(291732914, i2, -1, "com.dh.myembyapp.ui.components.TraktUsageGuide (TraktSyncDialog.kt:502)");
            }
            List<String> listListOf = z ? CollectionsKt.listOf((Object[]) new String[]{"1. 用已登录 Trakt 的手机扫描上方二维码。", "2. 按页面提示确认授权；扫码不便时，可打开上方地址并输入授权码。", "3. 电视显示“已授权”后保存即可。"}) : CollectionsKt.listOf((Object[]) new String[]{"1. 点击“生成授权二维码”。", "2. 用已登录 Trakt 的手机扫描二维码并确认授权。", "3. 电视显示“已授权”后保存即可。"});
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk("使用说明", null, materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface(), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getBodySmall(), composerStartRestartGroup, 1572870, 0, 131002);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(902757605);
            for (String str : listListOf) {
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i5 = MaterialTheme.$stable;
                Composer composer4 = composer3;
                TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer3, i5).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme2.getTypography(composer3, i5).getBodySmall(), 0L, TextUnitKt.getSp(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(15), null, null, null, 0, 0, null, 16646141, null), composer4, 0, 0, 131066);
                composer3 = composer4;
            }
            composer2 = composer3;
            if (i9.s(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pv(z, modifier, i, 3));
        }
    }
}
