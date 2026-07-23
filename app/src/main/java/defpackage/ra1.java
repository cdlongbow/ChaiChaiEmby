package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.server.OnlineSubtitleSearchInputServerManager;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ra1 {
    public static final float a = Dp.m7813constructorimpl(80.0f);

    public static final void a(re reVar, boolean z, String str, Function0 function0, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z2;
        String str2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-552480248);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(reVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-552480248, i3, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleFilePickerDialog (OnlineSubtitleSearchDialog.kt:730)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(2113471199, true, new ea1(reVar, z2, function1, str2, focusRequester, function0, 0), composerStartRestartGroup, 54), composer2, ((i3 >> 9) & 14) | 432, 0);
            String str3 = reVar.a.a;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ji(focusRequester, null, 11);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(str3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el(reVar, z, str, function0, function1, i, 3));
        }
    }

    public static final void b(Bitmap bitmap, String str, String str2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1952070086);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1952070086, i2, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleQrHint (OnlineSubtitleSearchDialog.kt:679)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (bitmap != null) {
                composerStartRestartGroup.startReplaceGroup(-1042428907);
                ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "扫码输入", SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(180.0f)), null, null, 0.0f, null, 0, composerStartRestartGroup, 432, 248);
                id.i(12.0f, companion, composerStartRestartGroup, 6);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i4 = MaterialTheme.$stable;
                TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i4).getBodyMedium();
                Color.Companion companion3 = Color.INSTANCE;
                long jM5189getWhite0d7_KjU = companion3.m5189getWhite0d7_KjU();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                composer2 = composerStartRestartGroup;
                TextKt.m3048TextNvy7gAk(str2, null, jM5189getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(companion4.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, bodyMedium, composer2, ((i2 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 130042);
                id.i(6.0f, companion, composer2, 6);
                TextKt.m3048TextNvy7gAk("也可在上方手动输入后点击搜索", null, companion3.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(companion4.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodySmall(), composer2, 390, 0, 130042);
                id.i(8.0f, companion, composer2, 6);
                TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(companion3.m5182getGray0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(companion4.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodySmall(), composer2, ((i2 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 130042);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1041437031);
                composer2 = composerStartRestartGroup;
                TextKt.m3048TextNvy7gAk(str2, null, Color.INSTANCE.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer2, ((i2 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 261114);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 17, bitmap, str, str2));
        }
    }

    public static final void c(String str, ne neVar, String str2, final ij1 ij1Var, jj1 jj1Var, Composer composer, int i) {
        int i2;
        Composer composer2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i3;
        int i4;
        MutableIntState mutableIntState;
        View view;
        SoftwareKeyboardController softwareKeyboardController;
        FocusManager focusManager;
        CoroutineScope coroutineScope;
        MutableState mutableState;
        Object k2Var;
        int i5;
        MutableState mutableState2;
        final MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableIntState mutableIntState2;
        MutableState mutableState6;
        Object obj;
        final SoftwareKeyboardController softwareKeyboardController2;
        final MutableState mutableState7;
        final FocusRequester focusRequester;
        FocusManager focusManager2;
        Window window;
        str.getClass();
        neVar.getClass();
        str2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(149805105);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(neVar.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ij1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(jj1Var) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(149805105, i2, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog (OnlineSubtitleSearchDialog.kt:86)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1414421445, 0, -1, "com.dh.myembyapp.ui.components.rememberCoroutineScopeCompat (OnlineSubtitleSearchDialog.kt:970)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            FocusManager focusManager3 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            SoftwareKeyboardController softwareKeyboardController3 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                i3 = 0;
                snapshotMutationPolicy = null;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str2, TextRangeKt.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                snapshotMutationPolicy = null;
                i3 = 0;
            }
            MutableState mutableState9 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState11 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState12 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState13 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState14 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState15 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotIntStateKt.mutableIntStateOf(i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            MutableState mutableState16 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState17 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            MutableState mutableState18 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            MutableState mutableState19 = (MutableState) objRememberedValue14;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion.getEmpty()) {
                i4 = 2;
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            } else {
                i4 = 2;
            }
            MutableState mutableState20 = (MutableState) objRememberedValue15;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            MutableState mutableState21 = (MutableState) objRememberedValue16;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            MutableState mutableState22 = (MutableState) objRememberedValue17;
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == companion.getEmpty()) {
                objRememberedValue18 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue18;
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == companion.getEmpty()) {
                objRememberedValue19 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue19;
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == companion.getEmpty()) {
                objRememberedValue20 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester4 = (FocusRequester) objRememberedValue20;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == companion.getEmpty()) {
                objRememberedValue21 = new ji(focusRequester2, null, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue21, composerStartRestartGroup, 6);
            Integer numValueOf = Integer.valueOf(mutableIntState3.getIntValue());
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == companion.getEmpty()) {
                objRememberedValue22 = new q3(mutableIntState3, mutableState15, focusRequester3, (Continuation) null, 10);
                mutableIntState = mutableIntState3;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            } else {
                mutableIntState = mutableIntState3;
            }
            int i6 = i3;
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue22, composerStartRestartGroup, i6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(decorView) | composerStartRestartGroup.changed(softwareKeyboardController3) | composerStartRestartGroup.changedInstance(focusManager3) | composerStartRestartGroup.changedInstance(coroutineScope2);
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue23 == companion.getEmpty()) {
                View view2 = decorView;
                objRememberedValue23 = new cy(view2, softwareKeyboardController3, focusManager3, coroutineScope2, mutableState20, mutableState18, focusRequester2);
                view = view2;
                softwareKeyboardController = softwareKeyboardController3;
                focusManager = focusManager3;
                coroutineScope = coroutineScope2;
                mutableState = mutableState18;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            } else {
                focusManager = focusManager3;
                view = decorView;
                coroutineScope = coroutineScope2;
                mutableState = mutableState18;
                softwareKeyboardController = softwareKeyboardController3;
            }
            EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue23, composerStartRestartGroup, i6);
            Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == companion.getEmpty()) {
                objRememberedValue24 = new OnlineSubtitleSearchInputServerManager(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            OnlineSubtitleSearchInputServerManager onlineSubtitleSearchInputServerManager = (OnlineSubtitleSearchInputServerManager) objRememberedValue24;
            Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue25 == companion.getEmpty()) {
                objRememberedValue25 = onlineSubtitleSearchInputServerManager.getServerUrl();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
            }
            String str3 = (String) objRememberedValue25;
            Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue26 == companion.getEmpty()) {
                objRememberedValue26 = ku.y(220, 220, str3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
            }
            Bitmap bitmap = (Bitmap) objRememberedValue26;
            MutableIntState mutableIntState4 = mutableIntState;
            boolean zChangedInstance2 = ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(onlineSubtitleSearchInputServerManager) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(context) | ((i2 & Input.Keys.FORWARD_DEL) == 32);
            Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue27 == companion.getEmpty()) {
                i5 = 2048;
                CoroutineScope coroutineScope3 = coroutineScope;
                k2Var = new k2(onlineSubtitleSearchInputServerManager, str, coroutineScope3, mutableState8, mutableState9, mutableState14, context, neVar, mutableState11, mutableState10, mutableState17, mutableState21, mutableState15, mutableState16, mutableIntState4, null);
                coroutineScope = coroutineScope3;
                mutableState2 = mutableState10;
                mutableState3 = mutableState21;
                mutableState4 = mutableState8;
                mutableState5 = mutableState14;
                mutableIntState2 = mutableIntState4;
                mutableState6 = mutableState11;
                composerStartRestartGroup.updateRememberedValue(k2Var);
            } else {
                k2Var = objRememberedValue27;
                mutableIntState2 = mutableIntState4;
                mutableState4 = mutableState8;
                mutableState2 = mutableState10;
                mutableState3 = mutableState21;
                mutableState6 = mutableState11;
                mutableState5 = mutableState14;
                i5 = 2048;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) k2Var, composerStartRestartGroup, 6);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(onlineSubtitleSearchInputServerManager);
            Object objRememberedValue28 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue28 == companion.getEmpty()) {
                objRememberedValue28 = new mc0(onlineSubtitleSearchInputServerManager, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue28, composerStartRestartGroup, 6);
            int i7 = i2 & 7168;
            boolean zChanged = composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changedInstance(coroutineScope) | (i7 == i5);
            Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue29 == companion.getEmpty()) {
                final int i8 = 0;
                final FocusManager focusManager4 = focusManager;
                softwareKeyboardController2 = softwareKeyboardController;
                mutableState7 = mutableState;
                focusRequester = r26;
                final CoroutineScope coroutineScope4 = coroutineScope;
                obj = new Function0() { // from class: ia1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                ra1.d(softwareKeyboardController2, focusManager4, coroutineScope4, ij1Var, mutableState3, mutableState7, focusRequester);
                                break;
                            default:
                                ra1.d(softwareKeyboardController2, focusManager4, coroutineScope4, ij1Var, mutableState3, mutableState7, focusRequester);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                focusManager2 = focusManager4;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                softwareKeyboardController2 = softwareKeyboardController;
                mutableState7 = mutableState;
                focusRequester = focusRequester2;
                obj = objRememberedValue29;
                focusManager2 = focusManager;
            }
            BackHandlerKt.BackHandler(true, (Function0) obj, composerStartRestartGroup, 6, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(softwareKeyboardController2) | composerStartRestartGroup.changedInstance(focusManager2) | composerStartRestartGroup.changedInstance(coroutineScope) | (i7 == i5);
            Object objRememberedValue30 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue30 == companion.getEmpty()) {
                final int i9 = 1;
                final FocusManager focusManager5 = focusManager2;
                final CoroutineScope coroutineScope5 = coroutineScope;
                Function0 function0 = new Function0() { // from class: ia1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                ra1.d(softwareKeyboardController2, focusManager5, coroutineScope5, ij1Var, mutableState3, mutableState7, focusRequester);
                                break;
                            default:
                                ra1.d(softwareKeyboardController2, focusManager5, coroutineScope5, ij1Var, mutableState3, mutableState7, focusRequester);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function0);
                objRememberedValue30 = function0;
            }
            Function0 function1 = (Function0) objRememberedValue30;
            DialogProperties dialogProperties = new DialogProperties(true, false, false);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(587017914, true, new ka1(str, coroutineScope, context, neVar, focusRequester, mutableState19, focusRequester4, softwareKeyboardController2, focusManager2, ij1Var, mutableState9, mutableState7, mutableState4, mutableState5, mutableState6, mutableState2, mutableState17, mutableState3, mutableState15, mutableState16, mutableIntState2, bitmap, str3, jj1Var, focusRequester3, mutableState12, mutableState13, mutableState22, 0), composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function1, dialogProperties, composableLambdaRememberComposableLambda, composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh((Object) str, (Object) neVar, (Object) str2, (Object) ij1Var, (Object) jj1Var, i, 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, CoroutineScope coroutineScope, ij1 ij1Var, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester) {
        if (((re) mutableState.getValue()) != null) {
            mutableState.setValue(null);
            return;
        }
        if (!((Boolean) mutableState2.getValue()).booleanValue()) {
            ij1Var.invoke();
            return;
        }
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        focusManager.clearFocus(true);
        mutableState2.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ji(focusRequester, null, 14), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(String str, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Context context, ne neVar, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableIntState mutableIntState, String str2) {
        String string = StringsKt.trim((CharSequence) str2).toString();
        mutableState.setValue(string);
        mutableState2.setValue(TextFieldValue.m7520copy3r_uNRQ$default((TextFieldValue) mutableState2.getValue(), string, TextRangeKt.TextRange(string.length()), (TextRange) null, 4, (Object) null));
        if (StringsKt.isBlank(string)) {
            mutableState3.setValue("请输入搜索关键词");
        } else if (StringsKt.isBlank(str)) {
            mutableState3.setValue("ASSRT API Key 未配置");
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new qa1(context, str, string, neVar, mutableState4, mutableState5, mutableState6, mutableState3, mutableState7, mutableState8, mutableState9, mutableIntState, null), 3, null);
        }
    }

    public static final boolean f(String str, String str2, String... strArr) {
        boolean zContains$default;
        for (String str3 : strArr) {
            int i = 0;
            while (true) {
                if (i >= str3.length()) {
                    String lowerCase = str3.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    zContains$default = StringsKt__StringsKt.contains$default(str2, (CharSequence) lowerCase, false, 2, (Object) null);
                    break;
                }
                if (str3.charAt(i) > 127) {
                    zContains$default = StringsKt__StringsKt.contains(str, (CharSequence) str3, true);
                    break;
                }
                i++;
            }
            if (zContains$default) {
                return true;
            }
        }
        return false;
    }
}
