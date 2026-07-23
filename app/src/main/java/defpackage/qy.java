package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.DanmakuMemory;
import com.dh.myembyapp.data.model.DanmakuAnime;
import com.dh.myembyapp.data.model.DanmakuEpisode;
import com.dh.myembyapp.server.DanmakuSearchInputServerManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qy {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(DanmakuAnime danmakuAnime, String str, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-62164794);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(danmakuAnime) ? 4 : 2) | i;
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
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-62164794, i2, -1, "com.dh.myembyapp.ui.components.AnimeResultItem (DanmakuSearchDialog.kt:988)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Continuation continuation = null;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (i2 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ux(z, focusRequester, continuation, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i2 >> 6) & 14);
            Modifier modifierM286borderxT4_qwU = Modifier.INSTANCE;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(modifierM286borderxT4_qwU, 0.0f, 1, null), focusRequester);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            int i4 = 9;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new zh(i4, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue4);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierM286borderxT4_qwU, Dp.m7813constructorimpl(3.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f)));
            }
            Modifier modifierThen = modifierOnFocusChanged.then(modifierM286borderxT4_qwU);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f));
            int i5 = ClickableSurfaceDefaults.$stable;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierThen, null, false, 0.0f, clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i5 << 15, 30), clickableSurfaceDefaults.m8292colorsoq7We08(ColorKt.Color(4280953386L), 0L, ColorKt.Color(4282532418L), 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, (i5 << 24) | 390, 250), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, null, ComposableLambdaKt.rememberComposableLambda(734566983, true, new p8(5, danmakuAnime, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 9) & 14, 48, 1820);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(danmakuAnime, str, z, function0, i, 2));
        }
    }

    public static final void b(int i, Composer composer, String str, List list, Function1 function1) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1155958818);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1155958818, i2, -1, "com.dh.myembyapp.ui.components.DanmakuEpisodeRangeSelector (DanmakuSearchDialog.kt:1115)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(2.0f), Dp.m7813constructorimpl(2.0f));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i2 & Input.Keys.FORWARD_DEL) == 32) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c1((Object) list, (Object) str, (Function) function1, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyRow(null, null, paddingValuesM993PaddingValuesYgX7TsA, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 24960, 491);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new px(list, str, function1, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x039c  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:186:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:187:0x0401  */
    /* JADX WARN: Code duplicated, block: B:194:0x0413  */
    /* JADX WARN: Code duplicated, block: B:199:0x043c  */
    /* JADX WARN: Code duplicated, block: B:202:0x049a  */
    /* JADX WARN: Code duplicated, block: B:206:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, String str2, String str3, String str4, Integer num, Integer num2, Function0 function0, Function4 function4, Composer composer, int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Context context;
        int i3;
        MutableState mutableState;
        FocusRequester focusRequester;
        String str5;
        boolean zChangedInstance;
        Object objRememberedValue;
        DanmakuSearchInputServerManager danmakuSearchInputServerManager;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer.Companion companion;
        boolean z;
        boolean z2;
        Object objRememberedValue4;
        FocusRequester focusRequester2;
        Function0 function1;
        boolean zChanged;
        Object objRememberedValue5;
        Window window;
        str.getClass();
        str2.getClass();
        str3.getClass();
        function0.getClass();
        function4.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-34965617);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34965617, i2, -1, "com.dh.myembyapp.ui.components.DanmakuSearchDialog (DanmakuSearchDialog.kt:82)");
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new DanmakuMemory(context2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            DanmakuMemory danmakuMemory = (DanmakuMemory) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion2.getEmpty()) {
                context = context2;
                i3 = -1;
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                context = context2;
                i3 = -1;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion2.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion2.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion2.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion2.getEmpty()) {
                objRememberedValue12 = mr.l(i3, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion2.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue14;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion2.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue15;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == companion2.getEmpty()) {
                objRememberedValue16 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue16;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion2.getEmpty()) {
                objRememberedValue17 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue17;
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == companion2.getEmpty()) {
                objRememberedValue18 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester4 = (FocusRequester) objRememberedValue18;
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == companion2.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            MutableState mutableState11 = (MutableState) objRememberedValue19;
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == companion2.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            MutableState mutableState12 = (MutableState) objRememberedValue20;
            Context context3 = context;
            Activity activity = context3 instanceof Activity ? (Activity) context3 : null;
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(decorView) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue21 == companion2.getEmpty()) {
                objRememberedValue21 = new zx(decorView, coroutineScope, mutableState12, mutableState11, focusRequester3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            EffectsKt.LaunchedEffect(decorView, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue21, composerStartRestartGroup, 0);
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(decorView) | composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue22 == companion2.getEmpty()) {
                objRememberedValue22 = new g9(5, coroutineScope, decorView, softwareKeyboardController, mutableState11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue22, composerStartRestartGroup, 6);
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue23 == companion2.getEmpty()) {
                objRememberedValue23 = new DanmakuSearchInputServerManager(context3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            DanmakuSearchInputServerManager danmakuSearchInputServerManager2 = (DanmakuSearchInputServerManager) objRememberedValue23;
            Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue24 == companion2.getEmpty()) {
                objRememberedValue24 = danmakuSearchInputServerManager2.getServerUrl();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            String str6 = (String) objRememberedValue24;
            Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue25 == companion2.getEmpty()) {
                try {
                    BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str6, BarcodeFormat.QR_CODE, Input.Keys.NUMPAD_ENTER, Input.Keys.NUMPAD_ENTER, MapsKt.mapOf(TuplesKt.to(EncodeHintType.MARGIN, 1)));
                    str5 = str6;
                    int i4 = 160;
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Input.Keys.NUMPAD_ENTER, Input.Keys.NUMPAD_ENTER, Bitmap.Config.RGB_565);
                        bitmapCreateBitmap.getClass();
                        mutableState = mutableState5;
                        int i5 = 0;
                        while (i5 < i4) {
                            focusRequester = focusRequester4;
                            int i6 = 0;
                            while (i6 < i4) {
                                try {
                                    bitmapCreateBitmap.setPixel(i5, i6, bitMatrixEncode.get(i5, i6) ? -16777216 : -1);
                                    i6++;
                                    i4 = Input.Keys.NUMPAD_ENTER;
                                } catch (Exception e) {
                                    e = e;
                                    Log.e("DanmakuSearchDialog", "生成二维码失败", e);
                                    objRememberedValue25 = null;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
                                    Bitmap bitmap = (Bitmap) objRememberedValue25;
                                    Unit unit2 = Unit.INSTANCE;
                                    zChangedInstance = composerStartRestartGroup.changedInstance(danmakuSearchInputServerManager2) | composerStartRestartGroup.changedInstance(coroutineScope);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                        objRememberedValue = new dy(danmakuSearchInputServerManager2, coroutineScope, mutableState2, mutableState3, mutableState8, mutableState10, mutableState4, mutableState9, (Continuation) null);
                                        danmakuSearchInputServerManager = danmakuSearchInputServerManager2;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    } else {
                                        objRememberedValue = new dy(danmakuSearchInputServerManager2, coroutineScope, mutableState2, mutableState3, mutableState8, mutableState10, mutableState4, mutableState9, (Continuation) null);
                                        danmakuSearchInputServerManager = danmakuSearchInputServerManager2;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(danmakuSearchInputServerManager);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                        objRememberedValue2 = new c(danmakuSearchInputServerManager, 23);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    } else {
                                        objRememberedValue2 = new c(danmakuSearchInputServerManager, 23);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new vm(focusRequester3, null, 2);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                                    boolean zChanged2 = composerStartRestartGroup.changed(softwareKeyboardController);
                                    if ((i2 & 3670016) == 1048576) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    z2 = zChanged2 | z;
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (z2) {
                                        objRememberedValue4 = new v1((Object) softwareKeyboardController, (Object) focusRequester3, function0, mutableState11, mutableState, 5);
                                        focusRequester2 = focusRequester3;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    } else {
                                        objRememberedValue4 = new v1((Object) softwareKeyboardController, (Object) focusRequester3, function0, mutableState11, mutableState, 5);
                                        focusRequester2 = focusRequester3;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    function1 = (Function0) objRememberedValue4;
                                    zChanged = composerStartRestartGroup.changed(function1);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                        objRememberedValue5 = new n8(3, function1);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    } else {
                                        objRememberedValue5 = new n8(3, function1);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    BackHandlerKt.BackHandler(true, (Function0) objRememberedValue5, composerStartRestartGroup, 6, 0);
                                    composer2 = composerStartRestartGroup;
                                    AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-97848602, true, new tx(mutableState, mutableState2, mutableState11, focusRequester, coroutineScope, softwareKeyboardController, mutableState3, mutableState8, mutableState10, mutableState4, mutableState9, focusRequester2, str3, bitmap, str5, mutableState7, mutableState6, num, num2, danmakuMemory, str2, str4, function4, function0, 0), composerStartRestartGroup, 54), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new f8(str, str2, str3, str4, num, num2, function0, function4, i));
                                    }
                                }
                            }
                            i5++;
                            focusRequester4 = focusRequester;
                            i4 = Input.Keys.NUMPAD_ENTER;
                        }
                        focusRequester = focusRequester4;
                        objRememberedValue25 = bitmapCreateBitmap;
                    } catch (Exception e2) {
                        e = e2;
                        mutableState = mutableState5;
                        focusRequester = focusRequester4;
                    }
                } catch (Exception e3) {
                    e = e3;
                    mutableState = mutableState5;
                    focusRequester = focusRequester4;
                    str5 = str6;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
            } else {
                mutableState = mutableState5;
                focusRequester = focusRequester4;
                str5 = str6;
            }
            Bitmap bitmap2 = (Bitmap) objRememberedValue25;
            Unit unit3 = Unit.INSTANCE;
            zChangedInstance = composerStartRestartGroup.changedInstance(danmakuSearchInputServerManager2) | composerStartRestartGroup.changedInstance(coroutineScope);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dy(danmakuSearchInputServerManager2, coroutineScope, mutableState2, mutableState3, mutableState8, mutableState10, mutableState4, mutableState9, (Continuation) null);
                danmakuSearchInputServerManager = danmakuSearchInputServerManager2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                danmakuSearchInputServerManager = danmakuSearchInputServerManager2;
            }
            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(danmakuSearchInputServerManager);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(danmakuSearchInputServerManager, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(unit3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new vm(focusRequester3, null, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            boolean zChanged3 = composerStartRestartGroup.changed(softwareKeyboardController);
            if ((i2 & 3670016) == 1048576) {
                z = true;
            } else {
                z = false;
            }
            z2 = zChanged3 | z;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new v1((Object) softwareKeyboardController, (Object) focusRequester3, function0, mutableState11, mutableState, 5);
                focusRequester2 = focusRequester3;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                focusRequester2 = focusRequester3;
            }
            function1 = (Function0) objRememberedValue4;
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new n8(3, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue5, composerStartRestartGroup, 6, 0);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-97848602, true, new tx(mutableState, mutableState2, mutableState11, focusRequester, coroutineScope, softwareKeyboardController, mutableState3, mutableState8, mutableState10, mutableState4, mutableState9, focusRequester2, str3, bitmap2, str5, mutableState7, mutableState6, num, num2, danmakuMemory, str2, str4, function4, function0, 0), composerStartRestartGroup, 54), composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f8(str, str2, str3, str4, num, num2, function0, function4, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DanmakuAnime d(MutableState mutableState) {
        return (DanmakuAnime) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String e(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean g(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean h(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:307:0x1061  */
    /* JADX WARN: Code duplicated, block: B:308:0x106a  */
    /* JADX WARN: Code duplicated, block: B:313:0x109d  */
    /* JADX WARN: Code duplicated, block: B:320:0x10ef  */
    /* JADX WARN: Code duplicated, block: B:323:0x115d  */
    /* JADX WARN: Code duplicated, block: B:326:0x1169  */
    /* JADX WARN: Code duplicated, block: B:327:0x116d  */
    /* JADX WARN: Code duplicated, block: B:330:0x118a  */
    /* JADX WARN: Code duplicated, block: B:334:0x11bf  */
    /* JADX WARN: Code duplicated, block: B:337:0x11e4  */
    /* JADX WARN: Code duplicated, block: B:344:0x1274  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r109v3, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v32 */
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
    public static final Unit i(final MutableState mutableState, final MutableState mutableState2, MutableState mutableState3, FocusRequester focusRequester, final CoroutineScope coroutineScope, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, FocusRequester focusRequester2, final String str, Bitmap bitmap, String str2, MutableState mutableState9, final MutableState mutableState10, Integer num, Integer num2, DanmakuMemory danmakuMemory, final String str3, final String str4, final Function4 function4, final Function0 function0, Composer composer, int i) {
        String strE;
        String typeDescription;
        Modifier.Companion companion;
        List<DanmakuEpisode> listEmptyList;
        final DanmakuMemory danmakuMemory2;
        Integer numValueOf;
        int i2;
        int i3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i4;
        int i5;
        final List<DanmakuEpisode> list;
        LazyListState lazyListState;
        Object r6;
        DanmakuAnime danmakuAnimeD;
        Object ValueOf;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        LazyListState lazyListState2;
        Object obj;
        Composer composer2;
        Function0<ComposeUiNode> constructor;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        Composer composer3;
        boolean zChangedInstance3;
        Object objRememberedValue4;
        List<DanmakuEpisode> episodes;
        char c;
        float f;
        ComposeUiNode.Companion companion2;
        FocusRequester focusRequester3;
        FocusRequester focusRequester4;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(132317575, i, -1, "com.dh.myembyapp.ui.components.DanmakuSearchDialog.<anonymous>.<anonymous>.<anonymous> (DanmakuSearchDialog.kt:258)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer, 0);
            int iB = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
            mr.z(companion5, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(iB), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DanmakuAnime danmakuAnimeD2 = d(mutableState);
            if (danmakuAnimeD2 == null || (strE = danmakuAnimeD2.getAnimeTitle()) == null) {
                strE = e(mutableState2);
            }
            String str5 = strE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle headlineSmall = materialTheme.getTypography(composer, i6).getHeadlineSmall();
            Color.Companion companion6 = Color.INSTANCE;
            float f2 = 16.0f;
            TextKt.m3048TextNvy7gAk(str5, PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(16.0f), 7, null), companion6.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, headlineSmall, composer, 432, 0, 131064);
            if (d(mutableState) == null) {
                composer.startReplaceGroup(-498366911);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion4.getCenterVertically(), composer, 54);
                int iB2 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (!id.n(composer.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
                mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(iB2), composerM4318constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifierBorder = BorderKt.border(kb0.v(4.0f, zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), ColorKt.Color(4279900698L)), yc2.j(h(mutableState3), composer), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f)));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int iB3 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierBorder);
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                if (!id.n(composer.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer);
                mr.z(companion5, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(iB3), composerM4318constructorimpl3));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(14.0f));
                MeasurePolicy measurePolicyQ = mr.q(8.0f, arrangement, companion4.getCenterVertically(), composer, 54);
                int iB4 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
                Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                if (!id.n(composer.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer);
                mr.z(companion5, composerM4318constructorimpl4, measurePolicyQ, composerM4318constructorimpl4, currentCompositionLocalMap4);
                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(iB4), composerM4318constructorimpl4));
                IconKt.m2496Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "搜索", SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(20.0f)), h(mutableState3) ? companion6.m5189getWhite0d7_KjU() : companion6.m5182getGray0d7_KjU(), composer, 432, 0);
                TextFieldValue textFieldValueM = m(mutableState4);
                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), focusRequester);
                Object objRememberedValue5 = composer.rememberedValue();
                Composer.Companion companion7 = Composer.INSTANCE;
                if (objRememberedValue5 == companion7.getEmpty()) {
                    c = 1;
                    objRememberedValue5 = new ai(c, mutableState3, mutableState4);
                    composer.updateRememberedValue(objRememberedValue5);
                } else {
                    c = 1;
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue5);
                TextStyle textStyle = new TextStyle(companion6.m5189getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7461getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                SolidColor solidColor = new SolidColor(companion6.m5189getWhite0d7_KjU(), null);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == companion7.getEmpty()) {
                    objRememberedValue6 = new ai(2, mutableState4, mutableState2);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                Function1 function1 = (Function1) objRememberedValue6;
                boolean zChangedInstance4 = composer.changedInstance(coroutineScope);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue7 == companion7.getEmpty()) {
                    final int i7 = 0;
                    f = 8.0f;
                    companion2 = companion5;
                    Function0 function2 = new Function0() { // from class: ox
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    MutableState mutableState11 = mutableState2;
                                    if (((String) mutableState11.getValue()).length() > 0) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new fy(mutableState11, mutableState5, mutableState6, mutableState7, mutableState8, null, 0), 3, null);
                                    }
                                    break;
                                default:
                                    MutableState mutableState12 = mutableState2;
                                    if (((String) mutableState12.getValue()).length() > 0) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new fy(mutableState12, mutableState5, mutableState6, mutableState7, mutableState8, null, 1), 3, null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(function2);
                    objRememberedValue7 = function2;
                } else {
                    f = 8.0f;
                    companion2 = companion5;
                }
                Function0 function3 = (Function0) objRememberedValue7;
                boolean zChanged2 = composer.changed(softwareKeyboardController);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue8 == companion7.getEmpty()) {
                    focusRequester3 = focusRequester2;
                    objRememberedValue8 = new gy(softwareKeyboardController, focusRequester3);
                    composer.updateRememberedValue(objRememberedValue8);
                } else {
                    focusRequester3 = focusRequester2;
                }
                int i8 = 10;
                ComposeUiNode.Companion companion8 = companion2;
                yc2.a(textFieldValueM, function1, modifierOnFocusChanged, false, textStyle, solidColor, keyboardOptions, function3, null, null, (Function4) objRememberedValue8, ComposableLambdaKt.rememberComposableLambda(1510484064, c, new p1(i8, mutableState2), composer, 54), composer, 102457392, RendererCapabilities.DECODER_SUPPORT_MASK, 1544);
                composer.endNode();
                composer.endNode();
                Object objRememberedValue9 = composer.rememberedValue();
                if (objRememberedValue9 == companion7.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue9);
                }
                MutableState mutableState11 = (MutableState) objRememberedValue9;
                Modifier modifierThen = companion3.then(((Boolean) mutableState11.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion3, Dp.m7813constructorimpl(2.0f), companion6.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion3);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int iB5 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierThen);
                Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                if (!id.n(composer.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer);
                mr.z(companion8, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(iB5), composerM4318constructorimpl5));
                boolean zChangedInstance5 = composer.changedInstance(coroutineScope);
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue10 == companion7.getEmpty()) {
                    final int i9 = 1;
                    focusRequester4 = focusRequester2;
                    Function0 function5 = new Function0() { // from class: ox
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    MutableState mutableState12 = mutableState2;
                                    if (((String) mutableState12.getValue()).length() > 0) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new fy(mutableState12, mutableState5, mutableState6, mutableState7, mutableState8, null, 0), 3, null);
                                    }
                                    break;
                                default:
                                    MutableState mutableState13 = mutableState2;
                                    if (((String) mutableState13.getValue()).length() > 0) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new fy(mutableState13, mutableState5, mutableState6, mutableState7, mutableState8, null, 1), 3, null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(function5);
                    objRememberedValue10 = function5;
                } else {
                    focusRequester4 = focusRequester3;
                }
                Function0 function6 = (Function0) objRememberedValue10;
                Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(r3, focusRequester4);
                Object objRememberedValue11 = composer.rememberedValue();
                if (objRememberedValue11 == companion7.getEmpty()) {
                    objRememberedValue11 = new zh(i8, mutableState11);
                    composer.updateRememberedValue(objRememberedValue11);
                }
                ButtonKt.m8231ButtonTCVpFMg(function6, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue11), null, false, ButtonDefaults.scale$default(ButtonDefaults.INSTANCE, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.m(false, composer, c), 0.0f, hc2.h(composer), null, null, ComposableLambdaKt.rememberComposableLambda(-2038284571, c, new p1(8, mutableState11), composer, 54), composer, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3436);
                composer.endNode();
                composer.endNode();
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(16.0f)), composer, 6);
                TextKt.m3048TextNvy7gAk("搜索时仅保留副标题名或电影名称即可", PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(f), 7, null), companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i6).getBodySmall(), composer, 438, 0, 131064);
                composer3 = composer;
                float f3 = f;
                Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(kb0.v(f3, wn.F(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, c, null), 1.0f, false, 2, null), ColorKt.Color(4279900698L)), Dp.m7813constructorimpl(f3));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int iB6 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs2);
                Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                if (!id.n(composer3.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor7);
                } else {
                    composer3.useNode();
                }
                Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
                mr.z(companion8, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl6, Integer.valueOf(iB6), composerM4318constructorimpl6));
                if (f(mutableState5)) {
                    composer3.startReplaceGroup(1530477054);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, c, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    int iB7 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default);
                    Function0<ComposeUiNode> constructor8 = companion8.getConstructor();
                    if (!id.n(composer3.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion8, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl7, Integer.valueOf(iB7), composerM4318constructorimpl7));
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, materialTheme.getColorScheme(composer3, i6).getPrimary(), 0.0f, 0L, 0, 0.0f, composer3, 0, 61);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else {
                    if (((String) mutableState8.getValue()) != null) {
                        composer3.startReplaceGroup(1531156574);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, c, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion4.getCenterHorizontally(), composer3, 54);
                        int iB8 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default2);
                        Function0<ComposeUiNode> constructor9 = companion8.getConstructor();
                        if (!id.n(composer3.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor9);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion8, composerM4318constructorimpl8, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl8, currentCompositionLocalMap8);
                        Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl8, Integer.valueOf(iB8), composerM4318constructorimpl8));
                        String str6 = (String) mutableState8.getValue();
                        if (str6 == null) {
                            str6 = "搜索出错";
                        }
                        TextKt.m3048TextNvy7gAk(str6, null, companion6.m5186getRed0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 261114);
                        composer3 = composer;
                        id.i(16.0f, companion3, composer3, 6);
                        if (bitmap == null) {
                            composer3.startReplaceGroup(204542502);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(204542503);
                            ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "扫码搜索", SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(140.0f)), null, null, 0.0f, null, 0, composer3, 432, 248);
                            id.i(8.0f, companion3, composer3, 6);
                            TextKt.m3048TextNvy7gAk("扫码重新输入搜索内容", null, companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i6).getBodySmall(), composer, 390, 0, 131066);
                            composer3 = composer;
                            Unit unit = Unit.INSTANCE;
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else if (!g(mutableState6)) {
                        composer3.startReplaceGroup(1532956899);
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(r27.getCenter(), companion4.getCenterHorizontally(), composer3, 54);
                        int iB9 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default3);
                        Function0<ComposeUiNode> constructor10 = companion8.getConstructor();
                        if (!id.n(composer3.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor10);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion8, composerM4318constructorimpl9, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl9, currentCompositionLocalMap9);
                        Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl9, Integer.valueOf(iB9), composerM4318constructorimpl9));
                        if (bitmap != null) {
                            composer3.startReplaceGroup(516259877);
                            ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "扫码搜索", SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(160.0f)), null, null, 0.0f, null, 0, composer3, 432, 248);
                            id.i(12.0f, companion3, composer3, 6);
                            TextKt.m3048TextNvy7gAk("📱 手机扫码输入搜索内容", null, companion6.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i6).getBodyMedium(), composer, 390, 0, 131066);
                            id.i(4.0f, companion3, composer, 6);
                            TextKt.m3048TextNvy7gAk("或在上方输入框直接输入", null, companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i6).getBodySmall(), composer, 390, 0, 131066);
                            id.i(8.0f, companion3, composer, 6);
                            TextKt.m3048TextNvy7gAk(str2, null, Color.m5151copywmQWz5c$default(companion6.m5182getGray0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i6).getBodySmall(), composer, 390, 0, 131066);
                            composer3 = composer;
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(517845682);
                            TextKt.m3048TextNvy7gAk("请在上方输入框输入搜索内容", null, companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 262138);
                            composer3 = composer;
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else if (n(mutableState7).isEmpty()) {
                        composer3.startReplaceGroup(1535417958);
                        Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(r27.getCenter(), companion4.getCenterHorizontally(), composer3, 54);
                        int iB10 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default4);
                        Function0<ComposeUiNode> constructor11 = companion8.getConstructor();
                        if (!id.n(composer3.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor11);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion8, composerM4318constructorimpl10, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl10, currentCompositionLocalMap10);
                        Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl10, Integer.valueOf(iB10), composerM4318constructorimpl10));
                        TextKt.m3048TextNvy7gAk("暂无搜索结果", null, companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 262138);
                        composer3 = composer;
                        f2 = 16.0f;
                        id.i(16.0f, companion3, composer3, 6);
                        if (bitmap == null) {
                            composer3.startReplaceGroup(828620004);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(828620005);
                            ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "扫码搜索", SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(140.0f)), null, null, 0.0f, null, 0, composer3, 432, 248);
                            id.i(8.0f, companion3, composer3, 6);
                            TextKt.m3048TextNvy7gAk("扫码重新输入搜索内容", null, companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i6).getBodySmall(), composer, 390, 0, 131066);
                            composer3 = composer;
                            Unit unit2 = Unit.INSTANCE;
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        Continuation continuation = null;
                        f2 = 16.0f;
                        composer3.startReplaceGroup(1537013838);
                        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer3, 0, 3);
                        DanmakuAnime danmakuAnimeD3 = d(mutableState);
                        Integer numValueOf2 = Integer.valueOf(((Number) mutableState9.getValue()).intValue());
                        boolean zChanged3 = composer3.changed(lazyListStateRememberLazyListState);
                        Object objRememberedValue12 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue12 == companion7.getEmpty()) {
                            objRememberedValue12 = new hy(lazyListStateRememberLazyListState, mutableState, mutableState9, continuation, 0);
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        EffectsKt.LaunchedEffect(danmakuAnimeD3, numValueOf2, (Function2) objRememberedValue12, composer3, 0);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = r27.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                        boolean zChanged4 = composer3.changed(str);
                        Object objRememberedValue13 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue13 == companion7.getEmpty()) {
                            objRememberedValue13 = new j1((Object) mutableState7, str, (Object) mutableState9, (Object) mutableState, (Object) mutableState10, 3);
                            composer3.updateRememberedValue(objRememberedValue13);
                        }
                        LazyDslKt.LazyColumn(null, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue13, composer3, 24576, 493);
                        composer3.endReplaceGroup();
                    }
                    f2 = 16.0f;
                }
                composer3.endNode();
                composer3.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-477383724);
                DanmakuAnime danmakuAnimeD4 = d(mutableState);
                Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(16.0f), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer, 0);
                int iB11 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor12 = companion5.getConstructor();
                if (!id.n(composer.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor12);
                } else {
                    composer.useNode();
                }
                Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer);
                mr.z(companion5, composerM4318constructorimpl11, measurePolicyColumnMeasurePolicy5, composerM4318constructorimpl11, currentCompositionLocalMap11);
                Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl11, Integer.valueOf(iB11), composerM4318constructorimpl11));
                if (danmakuAnimeD4 == null || (typeDescription = danmakuAnimeD4.getTypeDescription()) == null) {
                    typeDescription = "";
                }
                TextKt.m3048TextNvy7gAk(typeDescription + " 共" + ((danmakuAnimeD4 == null || (episodes = danmakuAnimeD4.getEpisodes()) == null) ? 0 : episodes.size()) + "集", null, companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i6).getBodyMedium(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                Composer composer4 = composer;
                if (num != null) {
                    composer4.startReplaceGroup(1509595953);
                    companion = companion3;
                    TextKt.m3048TextNvy7gAk("当前播放: S" + (num2 != null ? num2.intValue() : 1) + " E" + num, PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 13, null), materialTheme.getColorScheme(composer4, i6).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i6).getBodySmall(), composer, 48, 0, 131064);
                    composer4 = composer;
                    composer4.endReplaceGroup();
                } else {
                    companion = companion3;
                    composer4.startReplaceGroup(1509988971);
                    composer4.endReplaceGroup();
                }
                composer4.endNode();
                Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(kb0.v(8.0f, wn.F(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ColorKt.Color(4279900698L)), Dp.m7813constructorimpl(8.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int iB12 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                CompositionLocalMap currentCompositionLocalMap12 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs3);
                Function0<ComposeUiNode> constructor13 = companion5.getConstructor();
                if (!id.n(composer4.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor13);
                } else {
                    composer4.useNode();
                }
                Composer composerM4318constructorimpl12 = Updater.m4318constructorimpl(composer4);
                mr.z(companion5, composerM4318constructorimpl12, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl12, currentCompositionLocalMap12);
                Updater.m4326setimpl(composerM4318constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl12, Integer.valueOf(iB12), composerM4318constructorimpl12));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                DanmakuAnime danmakuAnimeD5 = d(mutableState);
                if (danmakuAnimeD5 == null || (listEmptyList = danmakuAnimeD5.getEpisodes()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (listEmptyList.isEmpty()) {
                    composer4.startReplaceGroup(-7710053);
                    Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    int iB13 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                    CompositionLocalMap currentCompositionLocalMap13 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxSize$default5);
                    Function0<ComposeUiNode> constructor14 = companion5.getConstructor();
                    if (!id.n(composer4.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor14);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl13 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion5, composerM4318constructorimpl13, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM4318constructorimpl13, currentCompositionLocalMap13);
                    Updater.m4326setimpl(composerM4318constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl13, Integer.valueOf(iB13), composerM4318constructorimpl13));
                    TextKt.m3048TextNvy7gAk("该番剧暂无剧集信息", null, companion6.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 262138);
                    composer3 = composer;
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else {
                    composer4.startReplaceGroup(-6769265);
                    boolean zChanged5 = composer4.changed(listEmptyList) | composer4.changed(num);
                    Object objRememberedValue14 = composer4.rememberedValue();
                    if (zChanged5 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        if (num != null) {
                            Iterator<DanmakuEpisode> it = listEmptyList.iterator();
                            int i10 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    danmakuMemory2 = danmakuMemory;
                                    i2 = -1;
                                    break;
                                }
                                danmakuMemory2 = danmakuMemory;
                                Integer numExtractEpisodeNumber = danmakuMemory2.extractEpisodeNumber(it.next().getEpisodeTitle());
                                int iIntValue = num.intValue();
                                if (numExtractEpisodeNumber != null && numExtractEpisodeNumber.intValue() == iIntValue) {
                                    i2 = i10;
                                    break;
                                }
                                i10++;
                            }
                            numValueOf = Integer.valueOf(i2);
                            if (i2 < 0) {
                            }
                            composer4.updateRememberedValue(numValueOf);
                            objRememberedValue14 = numValueOf;
                        } else {
                            danmakuMemory2 = danmakuMemory;
                        }
                        numValueOf = null;
                        composer4.updateRememberedValue(numValueOf);
                        objRememberedValue14 = numValueOf;
                    } else {
                        danmakuMemory2 = danmakuMemory;
                    }
                    final Integer num3 = (Integer) objRememberedValue14;
                    boolean zChanged6 = composer4.changed(listEmptyList);
                    Object objRememberedValue15 = composer4.rememberedValue();
                    if (zChanged6 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = r(listEmptyList, new d6(danmakuMemory2));
                        composer4.updateRememberedValue(objRememberedValue15);
                    }
                    final List<sw> list2 = (List) objRememberedValue15;
                    boolean zChanged7 = composer4.changed(list2);
                    Object objRememberedValue16 = composer4.rememberedValue();
                    if (zChanged7 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                        for (sw swVar : list2) {
                            Iterator it2 = swVar.a().iterator();
                            while (it2.hasNext()) {
                                mapCreateMapBuilder.put(Long.valueOf(((DanmakuEpisode) it2.next()).getEpisodeId()), swVar.b());
                            }
                        }
                        objRememberedValue16 = MapsKt.build(mapCreateMapBuilder);
                        composer4.updateRememberedValue(objRememberedValue16);
                    }
                    final Map map = (Map) objRememberedValue16;
                    DanmakuAnime danmakuAnimeD6 = d(mutableState);
                    boolean zChanged8 = composer4.changed(danmakuAnimeD6 != null ? Integer.valueOf(danmakuAnimeD6.getAnimeId()) : null);
                    Object objRememberedValue17 = composer4.rememberedValue();
                    if (zChanged8 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                        i3 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composer4.updateRememberedValue(objRememberedValue17);
                    } else {
                        i3 = 2;
                        snapshotMutationPolicy = null;
                    }
                    final MutableState mutableState12 = (MutableState) objRememberedValue17;
                    DanmakuAnime danmakuAnimeD7 = d(mutableState);
                    boolean zChanged9 = composer4.changed(danmakuAnimeD7 != null ? Integer.valueOf(danmakuAnimeD7.getAnimeId()) : snapshotMutationPolicy);
                    Object objRememberedValue18 = composer4.rememberedValue();
                    if (zChanged9 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i3, snapshotMutationPolicy);
                        composer4.updateRememberedValue(objRememberedValue18);
                    }
                    final MutableState mutableState13 = (MutableState) objRememberedValue18;
                    DanmakuAnime danmakuAnimeD8 = d(mutableState);
                    boolean zChanged10 = composer4.changed(danmakuAnimeD8 != null ? Integer.valueOf(danmakuAnimeD8.getAnimeId()) : snapshotMutationPolicy);
                    Object objRememberedValue19 = composer4.rememberedValue();
                    if (zChanged10 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                        i4 = 0;
                        objRememberedValue19 = mr.l(0, snapshotMutationPolicy, i3, snapshotMutationPolicy, composer4);
                    } else {
                        i4 = 0;
                    }
                    final MutableState mutableState14 = (MutableState) objRememberedValue19;
                    LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(i4, i4, composer4, i4, 3);
                    DanmakuAnime danmakuAnimeD9 = d(mutableState);
                    Object objValueOf = danmakuAnimeD9 != null ? Integer.valueOf(danmakuAnimeD9.getAnimeId()) : snapshotMutationPolicy;
                    boolean zChangedInstance6 = composer4.changedInstance(listEmptyList) | composer4.changed(lazyListStateRememberLazyListState2) | composer4.changed(num3);
                    Object objRememberedValue20 = composer4.rememberedValue();
                    if (zChangedInstance6) {
                        i5 = i3;
                    } else {
                        i5 = i3;
                        if (objRememberedValue20 != Composer.INSTANCE.getEmpty()) {
                            list = listEmptyList;
                            r6 = snapshotMutationPolicy;
                            lazyListState = lazyListStateRememberLazyListState2;
                        }
                        EffectsKt.LaunchedEffect(objValueOf, num3, list, (Function2) objRememberedValue20, composer4, 0);
                        danmakuAnimeD = d(mutableState);
                        if (danmakuAnimeD != null) {
                            ValueOf = Integer.valueOf(danmakuAnimeD.getAnimeId());
                        } else {
                            ValueOf = r6;
                        }
                        Object r0 = new Object[4];
                        r0[i4] = list2;
                        r0[1] = num3;
                        r0[i5] = num;
                        r0[3] = ValueOf;
                        zChangedInstance = composer4.changedInstance(list2) | composer4.changed(mutableState12) | composer4.changed(num3) | composer4.changed(num) | composer4.changedInstance(danmakuMemory2);
                        objRememberedValue = composer4.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new jy(list2, mutableState12, num3, num, danmakuMemory2, null, 0);
                            composer4.updateRememberedValue(objRememberedValue);
                        }
                        EffectsKt.LaunchedEffect((Object[]) r0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer4, 0);
                        Integer numL = l(mutableState13);
                        Integer numValueOf3 = Integer.valueOf(j(mutableState14));
                        zChanged = composer4.changed(mutableState13) | composer4.changedInstance(list) | composer4.changed(lazyListState);
                        objRememberedValue2 = composer4.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            LazyListState lazyListState3 = lazyListState;
                            objRememberedValue2 = new r3(list, mutableState13, lazyListState3, null, 3);
                            lazyListState2 = lazyListState3;
                            obj = null;
                            composer4.updateRememberedValue(objRememberedValue2);
                        } else {
                            lazyListState2 = lazyListState;
                            obj = null;
                        }
                        composer2 = composer4;
                        EffectsKt.LaunchedEffect(numL, numValueOf3, list, (Function2) objRememberedValue2, composer2, 0);
                        Modifier.Companion companion9 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(companion9, 0.0f, 1, obj);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                        int iB14 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default6);
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        constructor = companion10.getConstructor();
                        if (!id.n(composer2.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl14 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion10, composerM4318constructorimpl14, measurePolicyColumnMeasurePolicy6, composerM4318constructorimpl14, currentCompositionLocalMap14);
                        Updater.m4326setimpl(composerM4318constructorimpl14, modifierMaterializeModifier14, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl14, Integer.valueOf(iB14), composerM4318constructorimpl14));
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        if (list2.isEmpty()) {
                            composer2.startReplaceGroup(-528002667);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-529351911);
                            String strK = k(mutableState12);
                            zChangedInstance3 = composer2.changedInstance(list2) | composer2.changed(num) | composer2.changedInstance(danmakuMemory2) | composer2.changed(mutableState12) | composer2.changed(mutableState13) | composer2.changed(mutableState14);
                            objRememberedValue4 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new f4(list2, num, danmakuMemory2, mutableState12, mutableState13, mutableState14);
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            b(0, composer2, strK, list2, (Function1) objRememberedValue4);
                            composer2.endReplaceGroup();
                        }
                        Modifier modifierF = wn.F(columnScopeInstance2, SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), 1.0f, false, 2, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                        zChangedInstance2 = composer2.changedInstance(list) | composer2.changed(num3) | composer2.changed(mutableState13) | composer2.changed(mutableState14) | composer2.changedInstance(map) | composer2.changed(mutableState12) | composer2.changedInstance(list2) | composer2.changed(str) | composer2.changed(str3) | composer2.changedInstance(danmakuMemory2) | composer2.changed(str4) | composer2.changed(function4) | composer2.changed(function0);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            Function1 function7 = new Function1() { // from class: nx
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    LazyListScope lazyListScope = (LazyListScope) obj2;
                                    lazyListScope.getClass();
                                    xw xwVar = new xw(1);
                                    List list3 = list;
                                    lazyListScope.items(list3.size(), new w5(9, xwVar, list3), new x5(list3, 8), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new ny(list3, num3, map, mutableState12, mutableState13, list2, mutableState14, str, str3, danmakuMemory2, str4, function4, function0, mutableState10, mutableState)));
                                    return Unit.INSTANCE;
                                }
                            };
                            composer3 = composer;
                            composer3.updateRememberedValue(function7);
                            objRememberedValue3 = function7;
                        } else {
                            composer3 = composer2;
                        }
                        LazyDslKt.LazyColumn(modifierF, lazyListState2, null, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue3, composer3, 24576, 492);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    }
                    List<DanmakuEpisode> list3 = listEmptyList;
                    Object r109 = snapshotMutationPolicy;
                    objRememberedValue20 = new r3(list3, lazyListStateRememberLazyListState2, num3, r109, 2);
                    list = list3;
                    lazyListState = lazyListStateRememberLazyListState2;
                    r6 = r109;
                    composer4.updateRememberedValue(objRememberedValue20);
                    EffectsKt.LaunchedEffect(objValueOf, num3, list, (Function2) objRememberedValue20, composer4, 0);
                    danmakuAnimeD = d(mutableState);
                    if (danmakuAnimeD != null) {
                        ValueOf = Integer.valueOf(danmakuAnimeD.getAnimeId());
                    } else {
                        ValueOf = r6;
                    }
                    Object r1 = new Object[4];
                    r1[i4] = list2;
                    r1[1] = num3;
                    r1[i5] = num;
                    r1[3] = ValueOf;
                    zChangedInstance = composer4.changedInstance(list2) | composer4.changed(mutableState12) | composer4.changed(num3) | composer4.changed(num) | composer4.changedInstance(danmakuMemory2);
                    objRememberedValue = composer4.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new jy(list2, mutableState12, num3, num, danmakuMemory2, null, 0);
                        composer4.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new jy(list2, mutableState12, num3, num, danmakuMemory2, null, 0);
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    EffectsKt.LaunchedEffect((Object[]) r1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer4, 0);
                    Integer numL2 = l(mutableState13);
                    Integer numValueOf4 = Integer.valueOf(j(mutableState14));
                    zChanged = composer4.changed(mutableState13) | composer4.changedInstance(list) | composer4.changed(lazyListState);
                    objRememberedValue2 = composer4.rememberedValue();
                    if (zChanged) {
                        LazyListState lazyListState4 = lazyListState;
                        objRememberedValue2 = new r3(list, mutableState13, lazyListState4, null, 3);
                        lazyListState2 = lazyListState4;
                        obj = null;
                        composer4.updateRememberedValue(objRememberedValue2);
                    } else {
                        LazyListState lazyListState5 = lazyListState;
                        objRememberedValue2 = new r3(list, mutableState13, lazyListState5, null, 3);
                        lazyListState2 = lazyListState5;
                        obj = null;
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    composer2 = composer4;
                    EffectsKt.LaunchedEffect(numL2, numValueOf4, list, (Function2) objRememberedValue2, composer2, 0);
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(companion11, 0.0f, 1, obj);
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement3.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                    int iB15 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default7);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    if (!id.n(composer2.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl15 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion12, composerM4318constructorimpl15, measurePolicyColumnMeasurePolicy7, composerM4318constructorimpl15, currentCompositionLocalMap15);
                    Updater.m4326setimpl(composerM4318constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) id.h(companion12, composerM4318constructorimpl15, Integer.valueOf(iB15), composerM4318constructorimpl15));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    if (list2.isEmpty()) {
                        composer2.startReplaceGroup(-529351911);
                        String strK2 = k(mutableState12);
                        zChangedInstance3 = composer2.changedInstance(list2) | composer2.changed(num) | composer2.changedInstance(danmakuMemory2) | composer2.changed(mutableState12) | composer2.changed(mutableState13) | composer2.changed(mutableState14);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance3) {
                            objRememberedValue4 = new f4(list2, num, danmakuMemory2, mutableState12, mutableState13, mutableState14);
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new f4(list2, num, danmakuMemory2, mutableState12, mutableState13, mutableState14);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        b(0, composer2, strK2, list2, (Function1) objRememberedValue4);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-528002667);
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierF2 = wn.F(columnScopeInstance3, SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), 1.0f, false, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = arrangement3.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                    zChangedInstance2 = composer2.changedInstance(list) | composer2.changed(num3) | composer2.changed(mutableState13) | composer2.changed(mutableState14) | composer2.changedInstance(map) | composer2.changed(mutableState12) | composer2.changedInstance(list2) | composer2.changed(str) | composer2.changed(str3) | composer2.changedInstance(danmakuMemory2) | composer2.changed(str4) | composer2.changed(function4) | composer2.changed(function0);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance2) {
                        Function1 function8 = new Function1() { // from class: nx
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                LazyListScope lazyListScope = (LazyListScope) obj2;
                                lazyListScope.getClass();
                                xw xwVar = new xw(1);
                                List list4 = list;
                                lazyListScope.items(list4.size(), new w5(9, xwVar, list4), new x5(list4, 8), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new ny(list4, num3, map, mutableState12, mutableState13, list2, mutableState14, str, str3, danmakuMemory2, str4, function4, function0, mutableState10, mutableState)));
                                return Unit.INSTANCE;
                            }
                        };
                        composer3 = composer;
                        composer3.updateRememberedValue(function8);
                        objRememberedValue3 = function8;
                    } else {
                        Function1 function9 = new Function1() { // from class: nx
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                LazyListScope lazyListScope = (LazyListScope) obj2;
                                lazyListScope.getClass();
                                xw xwVar = new xw(1);
                                List list4 = list;
                                lazyListScope.items(list4.size(), new w5(9, xwVar, list4), new x5(list4, 8), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new ny(list4, num3, map, mutableState12, mutableState13, list2, mutableState14, str, str3, danmakuMemory2, str4, function4, function0, mutableState10, mutableState)));
                                return Unit.INSTANCE;
                            }
                        };
                        composer3 = composer;
                        composer3.updateRememberedValue(function9);
                        objRememberedValue3 = function9;
                    }
                    LazyDslKt.LazyColumn(modifierF2, lazyListState2, null, false, horizontalOrVerticalM712spacedBy0680j_6, null, null, false, null, (Function1) objRememberedValue3, composer3, 24576, 492);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                }
                composer3.endNode();
                composer3.endReplaceGroup();
            }
            Modifier.Companion companion13 = Modifier.INSTANCE;
            id.i(f2, companion13, composer3, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Companion companion14 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, companion14.getCenterVertically(), composer3, 54);
            int iB16 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap16 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor15 = companion15.getConstructor();
            if (!id.n(composer3.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor15);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl16 = Updater.m4318constructorimpl(composer3);
            mr.z(companion15, composerM4318constructorimpl16, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl16, currentCompositionLocalMap16);
            Updater.m4326setimpl(composerM4318constructorimpl16, modifierMaterializeModifier16, (Function2<? super T, ? super Modifier, Unit>) id.h(companion15, composerM4318constructorimpl16, Integer.valueOf(iB16), composerM4318constructorimpl16));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Object objRememberedValue21 = composer3.rememberedValue();
            Composer.Companion companion16 = Composer.INSTANCE;
            if (objRememberedValue21 == companion16.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue21);
            }
            MutableState mutableState15 = (MutableState) objRememberedValue21;
            Modifier modifierThen2 = companion13.then(((Boolean) mutableState15.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion13, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion13);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion14.getTopStart(), false);
            int iB17 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap17 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer3, modifierThen2);
            Function0<ComposeUiNode> constructor16 = companion15.getConstructor();
            if (!id.n(composer3.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor16);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl17 = Updater.m4318constructorimpl(composer3);
            mr.z(companion15, composerM4318constructorimpl17, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM4318constructorimpl17, currentCompositionLocalMap17);
            Updater.m4326setimpl(composerM4318constructorimpl17, modifierMaterializeModifier17, (Function2<? super T, ? super Modifier, Unit>) id.h(companion15, composerM4318constructorimpl17, Integer.valueOf(iB17), composerM4318constructorimpl17));
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            Object objRememberedValue22 = composer3.rememberedValue();
            if (objRememberedValue22 == companion16.getEmpty()) {
                objRememberedValue22 = new zh(8, mutableState15);
                composer3.updateRememberedValue(objRememberedValue22);
            }
            ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(companion13, (Function1) objRememberedValue22), null, false, ButtonDefaults.scale$default(ButtonDefaults.INSTANCE, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.p(false, composer3, 0, 1), 0.0f, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1200176585, true, new p1(9, mutableState15), composer3, 54), composer3, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3948);
            if (i02.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int j(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String k(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer l(MutableState mutableState) {
        return (Integer) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextFieldValue m(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    public static final List n(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(DanmakuEpisode danmakuEpisode, boolean z, boolean z2, int i, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Composer composer, int i2) {
        int i3;
        int i4;
        Composer composer2;
        Continuation continuation;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2031809158);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(danmakuEpisode) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2031809158, i3, -1, "com.dh.myembyapp.ui.components.EpisodeResultItem (DanmakuSearchDialog.kt:1167)");
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
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            Boolean boolValueOf = Boolean.valueOf(z2);
            Integer numValueOf = Integer.valueOf(i4);
            boolean z3 = (i3 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion.getEmpty()) {
                continuation = null;
                objRememberedValue3 = new ux(z2, focusRequester, continuation, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                continuation = null;
            }
            EffectsKt.LaunchedEffect(boolValueOf, numValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, (i3 >> 6) & WebSocketProtocol.PAYLOAD_SHORT);
            Modifier modifierM286borderxT4_qwU = Modifier.INSTANCE;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(modifierM286borderxT4_qwU, 0.0f, 1, continuation), focusRequester);
            boolean z4 = ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new oy(function1, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFocusRequester, (Function1) objRememberedValue4);
            boolean z5 = (i3 & 57344) == 16384;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new qx(function0, mutableState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierOnPreviewKeyEvent, (Function1) objRememberedValue5);
            if (((Boolean) mutableState.getValue()).booleanValue() || z) {
                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierM286borderxT4_qwU, Dp.m7813constructorimpl(3.0f), (!z || ((Boolean) mutableState.getValue()).booleanValue()) ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5190getYellow0d7_KjU(), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f)));
            }
            Modifier modifierThen = modifierOnFocusChanged.then(modifierM286borderxT4_qwU);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f));
            int i5 = ClickableSurfaceDefaults.$stable;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8520Surface05tvjtU(function3, modifierThen, null, false, 0.0f, clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i5 << 15, 30), clickableSurfaceDefaults.m8292colorsoq7We08(ColorKt.Color(z ? 4282006058L : 4280953386L), 0L, ColorKt.Color(4282532418L), 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, (i5 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, null, ComposableLambdaKt.rememberComposableLambda(-965597991, true, new rx(0, danmakuEpisode, z), composerStartRestartGroup, 54), composer2, (i3 >> 21) & 14, 48, 1820);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sx(danmakuEpisode, z, z2, i, function0, function1, function2, function3, i2));
        }
    }

    public static final void p(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6 A[Catch: Exception -> 0x0205, TRY_LEAVE, TryCatch #8 {Exception -> 0x0205, blocks: (B:31:0x00b0, B:33:0x00b6, B:87:0x020a, B:92:0x0216, B:93:0x021a), top: B:113:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122 A[Catch: Exception -> 0x01b0, TryCatch #0 {Exception -> 0x01b0, blocks: (B:40:0x011a, B:42:0x0122, B:44:0x012a), top: B:98:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x012a A[Catch: Exception -> 0x01b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b0, blocks: (B:40:0x011a, B:42:0x0122, B:44:0x012a), top: B:98:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0139 A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ae, blocks: (B:47:0x0133, B:49:0x0139, B:74:0x01bf), top: B:100:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0113 -> B:98:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01e0 -> B:72:0x01ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object q(java.lang.String r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function1 r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.q(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final List r(List list, d6 d6Var) {
        sw swVar;
        int iIntValue;
        if (list.size() <= 30) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DanmakuEpisode danmakuEpisode = (DanmakuEpisode) obj;
            arrayList.add(new Triple(Integer.valueOf(i2), danmakuEpisode, d6Var.invoke(danmakuEpisode.getEpisodeTitle())));
            i2 = i3;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                Integer num = (Integer) ((Triple) obj2).component3();
                if (num == null || num.intValue() <= 0) {
                    List listChunked = CollectionsKt___CollectionsKt.chunked(list, 30);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked, 10));
                    for (Object obj3 : listChunked) {
                        int i5 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        List list2 = (List) obj3;
                        int i6 = i * 30;
                        int i7 = i6 + 1;
                        arrayList2.add(new sw(i7 + " - " + ((list2.size() + i7) - 1), list2, i6));
                        i = i5;
                    }
                    return arrayList2;
                }
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            r02.p();
            return null;
        }
        Integer num2 = (Integer) ((Triple) it.next()).component3();
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        while (it.hasNext()) {
            Integer num3 = (Integer) ((Triple) it.next()).component3();
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            if (iIntValue2 < iIntValue3) {
                iIntValue2 = iIntValue3;
            }
        }
        IntProgression intProgressionStep = RangesKt___RangesKt.step(new IntRange(1, iIntValue2), 30);
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it2 = intProgressionStep.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((IntIterator) it2).nextInt();
            int iMin = Math.min(iNextInt + 29, iIntValue2);
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj4 = arrayList.get(i8);
                i8++;
                Integer num4 = (Integer) ((Triple) obj4).component3();
                if (num4 != null && iNextInt <= (iIntValue = num4.intValue()) && iIntValue <= iMin) {
                    arrayList4.add(obj4);
                }
            }
            Triple triple = (Triple) CollectionsKt.firstOrNull((List) arrayList4);
            if (triple != null) {
                String str = iNextInt + " - " + iMin;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                int size3 = arrayList4.size();
                int i9 = 0;
                while (i9 < size3) {
                    Object obj5 = arrayList4.get(i9);
                    i9++;
                    arrayList5.add((DanmakuEpisode) ((Triple) obj5).component2());
                }
                swVar = new sw(str, arrayList5, ((Number) triple.getFirst()).intValue());
            } else {
                swVar = null;
            }
            if (swVar != null) {
                arrayList3.add(swVar);
            }
        }
        return arrayList3;
    }
}
