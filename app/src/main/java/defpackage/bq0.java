package defpackage;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.DeviceIdManager;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxySettings;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.ItemCounts;
import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import com.dh.myembyapp.data.model.UserData;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.OnlineSubtitleConfigServerManager;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import com.dh.myembyapp.server.SubtitleFontUploadServerManager;
import com.dh.myembyapp.server.WebDavSyncConfigServerManager;
import java.util.Objects;
import java.net.Proxy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bq0 {
    public static final String A(State state) {
        return (String) state.getValue();
    }

    public static final String B(State state) {
        return (String) state.getValue();
    }

    public static final boolean C(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final sn0 D(State state) {
        return (sn0) state.getValue();
    }

    public static final boolean E(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final Map F(State state) {
        return (Map) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final rn0 G(MutableState mutableState) {
        return (rn0) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean H(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean I(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean J(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String K(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cq0 L(MutableState mutableState) {
        return (cq0) mutableState.getValue();
    }

    public static final ProxyConfig M(State state) {
        return (ProxyConfig) state.getValue();
    }

    public static final void N(final float f, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-743980130);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743980130, i2, -1, "com.dh.myembyapp.ui.screens.home.LibraryBatchLoadingSection (HomeScreen.kt:2191)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(10.0f), 0.0f, Dp.m7813constructorimpl(4.0f), 5, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
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
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(22.0f)), u61Var.b, Dp.m7813constructorimpl(2.5f), 0L, 0, 0.0f, composerStartRestartGroup, 390, 56);
            SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(12.0f)), composerStartRestartGroup, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            composer2 = composerStartRestartGroup;
            TextKt.m3048TextNvy7gAk("正在加载", null, materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i5).getTitleMedium(), composer2, 6, 0, 131066);
            if (x2.m(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jo0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    bq0.N(f, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void O(Modifier modifier, FocusRequester focusRequester, Function0 function0, Function0 function1, Composer composer, int i) {
        Function0 function2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1913961023);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function2 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1913961023, i2, -1, "com.dh.myembyapp.ui.screens.home.LibraryRowMoreButton (HomeScreen.kt:2724)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f));
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, ioVar.b(Dp.m7813constructorimpl(36.0f))), ioVar.d), focusRequester);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new h70(17, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue2);
            boolean z = (i2 & 7168) == 2048;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new pp0(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue3);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
            long j = u61Var.D;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            int i4 = ClickableSurfaceDefaults.$stable;
            int i5 = i4 << 15;
            Function0 function3 = function2;
            SurfaceKt.m8520Surface05tvjtU(function3, modifierOnPreviewKeyEvent, null, false, 0.0f, clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i5, 30), clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, onSurface, j, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-470860992, true, new p1(24, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 6) & 14, 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yi0(modifier2, focusRequester, function0, function1, i, 1));
        }
    }

    public static final void P(final String str, float f, final boolean z, final Function1 function1, Function0 function0, Composer composer, final int i) {
        int i2;
        boolean z2;
        float f2;
        Function0 function2;
        Composer composer2;
        MutableState mutableState;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-772483875);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-772483875, i2, -1, "com.dh.myembyapp.ui.screens.home.LibrarySkeletonSection (HomeScreen.kt:2797)");
            }
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i4 = 57344 & i2;
            boolean zChanged = ((i2 & 896) == 256) | composerStartRestartGroup.changed(mutableState2) | (i4 == 16384);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState2;
                f6 f6Var = new f6(z2, function0, mutableState, null, 3);
                obj = null;
                composerStartRestartGroup.updateRememberedValue(f6Var);
                objRememberedValue2 = f6Var;
            } else {
                mutableState = mutableState2;
                obj = null;
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i2 >> 6) & 14);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj);
            boolean z4 = (i3 == 4) | ((i2 & 7168) == 2048);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new vn0(0, str, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierFocusGroup = FocusableKt.focusGroup(FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue3));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(12.0f))), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusGroup);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strN = c61.n(str, " (加载中...)");
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            MutableState mutableState3 = mutableState;
            TextKt.m3048TextNvy7gAk(strN, PaddingKt.m1001paddingVpY3zN4$default(companion, f, 0.0f, 2, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i6).getOnBackground(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i6).getTitleLarge(), composerStartRestartGroup, 0, 0, 131064);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            f2 = f;
            PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(f2, 0.0f, 2, null);
            boolean zChanged2 = composerStartRestartGroup.changed(ioVar) | composerStartRestartGroup.changed(mutableState3) | (i4 == 16384);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                function2 = function0;
                objRememberedValue4 = new c1((Object) ioVar, (Object) mutableState3, (Object) function2, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                function2 = function0;
            }
            LazyDslKt.LazyRow(modifierFillMaxWidth$default2, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 24582, 490);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            f2 = f;
            function2 = function0;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function3 = function2;
            final float f3 = f2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: wn0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    bq0.P(str, f3, z, function1, function3, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v17 Object, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void Q(java.lang.String r68, java.lang.String r69, boolean r70, java.util.List r71, boolean r72, boolean r73, java.lang.String r74, java.lang.String r75, boolean r76, kotlin.jvm.functions.Function2 r77, kotlin.jvm.functions.Function3 r78, kotlin.jvm.functions.Function2 r79, float r80, int r81, kotlin.jvm.functions.Function1 r82, kotlin.jvm.functions.Function0 r83, boolean r84, boolean r85, kotlin.jvm.functions.Function0 r86, androidx.compose.runtime.Composer r87, int r88, int r89) {
        /*
            Method dump skipped, instruction units count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq0.Q(java.lang.String, java.lang.String, boolean, java.util.List, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, float, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Failed to calculate best type for var: r10v4 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 Object, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r2v10 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 Object, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r2v11 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 Object, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v11 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r2v19 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v19 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r38v0 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 Object, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r38v0 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r38v1 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v1 Object, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r38v1 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v1 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r38v3 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v3 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r38v4 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v4 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r3v1 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 Object, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v1 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r3v5 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v5 Object, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r4v30 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 Object, new type: androidx.compose.material3.MaterialTheme
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
    /* JADX WARN: Failed to calculate best type for var: r56v0 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r56v0 Object, new type: androidx.compose.runtime.Composer
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
    /* JADX WARN: Failed to calculate best type for var: r6v27 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v27 Object, new type: boolean
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
    /* JADX WARN: Failed to set immutable type for var: r56v0 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r56v0 Object, new type: androidx.compose.runtime.Composer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v8 Object, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void R(boolean r47, java.util.List r48, java.lang.String r49, java.lang.String r50, boolean r51, kotlin.jvm.functions.Function1 r52, kotlin.jvm.functions.Function2 r53, float r54, kotlin.jvm.functions.Function0 r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq0.R(boolean, java.util.List, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, float, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void S(boolean z, final MediaItem mediaItem, int i, FocusRequester focusRequester, Function0 function0, Function0 function1, Function1 function2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i5;
        String str;
        Object obj;
        Double playedPercentage;
        float fCoerceIn;
        float fM7813constructorimpl;
        final MutableState mutableState;
        MutableState mutableState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-574648603);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(mediaItem) : composerStartRestartGroup.changedInstance(mediaItem) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
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
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-574648603, i3, -1, "com.dh.myembyapp.ui.screens.home.ResumeEpisodeCard (HomeScreen.kt:3199)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
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
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                i4 = 2;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                i4 = 2;
            }
            MutableState mutableState4 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i4, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue4 = mutableStateMutableStateOf$default;
                snapshotMutationPolicy = null;
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState5 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue6;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i3 & 14;
            boolean z2 = i6 == 4;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue7 == companion.getEmpty()) {
                i5 = 1;
                objRememberedValue7 = new jp0(z, mutableState3, null, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                i5 = 1;
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, i6);
            boolean z3 = (z && T(mutableState3)) ? i5 : 0;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new a50(20, mutableState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            BackHandlerKt.BackHandler(z3, (Function0) objRememberedValue8, composerStartRestartGroup, 48, 0);
            int i7 = (composerStartRestartGroup.changed(mediaItem.getId()) ? 1 : 0) | (composerStartRestartGroup.changed(mediaItem.getImageTags()) ? 1 : 0) | (composerStartRestartGroup.changed(mediaItem.getBackdropImageTags()) ? 1 : 0) | (composerStartRestartGroup.changed(mediaItem.getSeriesId()) ? 1 : 0) | ((i3 & 896) == 256 ? i5 : 0);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (i7 != 0 || objRememberedValue9 == companion.getEmpty()) {
                if (mediaItem.getSeriesName() == null) {
                    mediaItem.getName();
                }
                ImageTags imageTags = mediaItem.getImageTags();
                String primary = imageTags != null ? imageTags.getPrimary() : null;
                ImageTags imageTags2 = mediaItem.getImageTags();
                String thumb = imageTags2 != null ? imageTags2.getThumb() : null;
                List<String> backdropImageTags = mediaItem.getBackdropImageTags();
                String str2 = backdropImageTags != null ? (String) CollectionsKt.firstOrNull((List) backdropImageTags) : null;
                String seriesId = mediaItem.getSeriesId();
                ArrayList arrayList = new ArrayList();
                if (seriesId != null) {
                    str = null;
                    arrayList.add(RetrofitClient.INSTANCE.getImageUrl(seriesId, "Thumb", null, Integer.valueOf(i)));
                } else {
                    str = null;
                }
                if (seriesId != null) {
                    arrayList.add(RetrofitClient.INSTANCE.getImageUrl(seriesId, "Backdrop", str, Integer.valueOf(i)));
                }
                if (seriesId != null) {
                    arrayList.add(RetrofitClient.INSTANCE.getImageUrl(seriesId, "Primary", str, Integer.valueOf(i)));
                }
                if (thumb != null) {
                    arrayList.add(RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Thumb", thumb, Integer.valueOf(i)));
                }
                if (str2 != null) {
                    arrayList.add(RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Backdrop", str2, Integer.valueOf(i)));
                }
                if (primary != null) {
                    arrayList.add(RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, Integer.valueOf(i)));
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList2);
                obj = arrayList2;
            } else {
                mutableState7 = mutableState7;
                coroutineScope = coroutineScope;
                obj = objRememberedValue9;
            }
            final List list = (List) obj;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue10 == companion2.getEmpty()) {
                playedPercentage = null;
                objRememberedValue10 = mr.l(0, null, 2, null, composerStartRestartGroup);
            } else {
                playedPercentage = null;
            }
            MutableState mutableState8 = (MutableState) objRememberedValue10;
            String str3 = (list.isEmpty() || U(mutableState8) >= list.size()) ? "" : (String) list.get(((Number) mutableState8.getValue()).intValue());
            UserData userData = mediaItem.getUserData();
            Object objValueOf = userData != null ? Long.valueOf(userData.getPlaybackPositionTicks()) : playedPercentage;
            UserData userData2 = mediaItem.getUserData();
            boolean zChanged = composerStartRestartGroup.changed(objValueOf) | composerStartRestartGroup.changed(userData2 != null ? userData2.getPlayedPercentage() : playedPercentage) | composerStartRestartGroup.changed(mediaItem.getRunTimeTicks());
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue11 == companion2.getEmpty()) {
                UserData userData3 = mediaItem.getUserData();
                if (userData3 != null) {
                    playedPercentage = userData3.getPlayedPercentage();
                }
                if (playedPercentage == null || playedPercentage.doubleValue() <= 0.0d) {
                    UserData userData4 = mediaItem.getUserData();
                    long playbackPositionTicks = userData4 != null ? userData4.getPlaybackPositionTicks() : 0L;
                    Long runTimeTicks = mediaItem.getRunTimeTicks();
                    long jLongValue = runTimeTicks != null ? runTimeTicks.longValue() : 0L;
                    fCoerceIn = (playbackPositionTicks <= 0 || jLongValue <= 0) ? 0.0f : RangesKt.coerceIn(playbackPositionTicks / jLongValue, 0.0f, 1.0f);
                } else {
                    fCoerceIn = RangesKt.coerceIn((float) (playedPercentage.doubleValue() / 100.0d), 0.0f, 1.0f);
                    mutableState3 = mutableState3;
                }
                objRememberedValue11 = Float.valueOf(fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                mutableState3 = mutableState3;
            }
            final float fFloatValue = ((Number) objRememberedValue11).floatValue();
            boolean zChanged2 = composerStartRestartGroup.changed(mediaItem.getParentIndexNumber()) | composerStartRestartGroup.changed(mediaItem.getIndexNumber()) | composerStartRestartGroup.changed(mediaItem.getName());
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue12 == companion2.getEmpty()) {
                StringBuilder sb = new StringBuilder();
                if (mediaItem.getParentIndexNumber() != null) {
                    sb.append(ExifInterface.LATITUDE_SOUTH + StringsKt__StringsKt.padStart(String.valueOf(mediaItem.getParentIndexNumber().intValue()), 2, '0'));
                }
                if (mediaItem.getIndexNumber() != null) {
                    if (sb.length() > 0) {
                        sb.append(" - ");
                    }
                    sb.append(ExifInterface.LONGITUDE_EAST + StringsKt__StringsKt.padStart(String.valueOf(mediaItem.getIndexNumber().intValue()), 2, '0'));
                }
                if (mediaItem.getName().length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(" - ");
                    }
                    sb.append(mediaItem.getName());
                }
                objRememberedValue12 = sb.toString();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            final String str4 = (String) objRememberedValue12;
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float f = ioVar.z;
            float f2 = ioVar.B;
            final float f3 = ioVar.A;
            float fM7813constructorimpl2 = Dp.m7813constructorimpl(14.0f);
            final RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(fM7813constructorimpl2);
            composerStartRestartGroup.startReplaceGroup(1813636216);
            if (((Boolean) mutableState7.getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2025277826, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-detachedFocusBorderEnabled> (Theme.kt:152)");
                }
                boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.h)).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fM7813constructorimpl = zBooleanValue ? Dp.m7813constructorimpl(5.0f) : Dp.m7813constructorimpl(0.0f);
            } else {
                fM7813constructorimpl = Dp.m7813constructorimpl(0.0f);
                mutableState8 = mutableState8;
                companion2 = companion2;
                str3 = str3;
            }
            final float f4 = fM7813constructorimpl;
            composerStartRestartGroup.endReplaceGroup();
            final RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(fM7813constructorimpl2 + f4));
            Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface(), 0.66f, 0.0f, 0.0f, 0.0f, 14, null);
            float f5 = ((Boolean) mutableState7.getValue()).booleanValue() ? 1.03f : 1.0f;
            boolean zChanged3 = ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(f) | composerStartRestartGroup.changed(f2);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue13 == companion2.getEmpty()) {
                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, f), f2);
                if (focusRequester != null) {
                    modifierM1050height3ABfNKs = FocusRequesterModifierKt.focusRequester(modifierM1050height3ABfNKs, focusRequester);
                }
                objRememberedValue13 = modifierM1050height3ABfNKs;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            Modifier modifier = (Modifier) objRememberedValue13;
            boolean z4 = ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = new ug(function1, function0, mutableState3, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            Function0 function3 = (Function0) objRememberedValue14;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue15 == companion2.getEmpty()) {
                mutableState = mutableState7;
                objRememberedValue15 = new r7(function2, mutableState, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            } else {
                mutableState = mutableState7;
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue15);
            CoroutineScope coroutineScope2 = coroutineScope;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope2);
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue16 == companion2.getEmpty()) {
                MutableState mutableState9 = mutableState3;
                objRememberedValue16 = new wp0(coroutineScope2, mutableState9, mutableState4, mutableState5, mutableState6);
                mutableState2 = mutableState9;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            } else {
                mutableState2 = mutableState3;
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue16);
            boolean zChanged4 = composerStartRestartGroup.changed(f5);
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue17 == companion2.getEmpty()) {
                objRememberedValue17 = new j5(f5, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierOnPreviewKeyEvent, (Function1) objRememberedValue17);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            Color.Companion companion3 = Color.INSTANCE;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(companion3.m5187getTransparent0d7_KjU(), 0L, companion3.m5187getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, (ClickableSurfaceDefaults.$stable << 24) | 390, 250);
            final MutableState mutableState10 = mutableState8;
            final String str5 = str3;
            final MutableState mutableState11 = mutableState2;
            SurfaceKt.m8520Surface05tvjtU(function3, modifierGraphicsLayer, null, false, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We08, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-18315930, true, new Function3() { // from class: ro0
                /* JADX WARN: Failed to calculate best type for var: r1v38 Object
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v38 Object, new type: int
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
                /* JADX WARN: Failed to calculate best type for var: r1v8 Object
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v8 Object, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r1v8 Object
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v8 Object, new type: int
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
                /* JADX WARN: Failed to calculate best type for var: r1v9 Object
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v9 Object, new type: int
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
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v8 Object, new type: char
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                    */
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) {
                    /*
                        Method dump skipped, instruction units count: 2099
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ro0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 0, 48, 1980);
            Composer composer3 = composerStartRestartGroup;
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            Composer composer4 = composerStartRestartGroup;
            composer4.skipToGroupEnd();
            composer2 = composer4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o4(z, mediaItem, i, focusRequester, function0, function1, function2, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean T(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int U(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void V(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:168:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:171:0x0329  */
    /* JADX WARN: Code duplicated, block: B:172:0x032c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0334  */
    /* JADX WARN: Code duplicated, block: B:176:0x0337  */
    /* JADX WARN: Code duplicated, block: B:179:0x0340  */
    /* JADX WARN: Code duplicated, block: B:180:0x0343  */
    /* JADX WARN: Code duplicated, block: B:183:0x034d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x035a  */
    /* JADX WARN: Code duplicated, block: B:188:0x035d  */
    /* JADX WARN: Code duplicated, block: B:193:0x036b  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:201:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:202:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:205:0x03de  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:210:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:213:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:214:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:217:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:218:0x0400  */
    /* JADX WARN: Code duplicated, block: B:221:0x040b  */
    /* JADX WARN: Code duplicated, block: B:222:0x040e  */
    /* JADX WARN: Code duplicated, block: B:225:0x041f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0422  */
    /* JADX WARN: Code duplicated, block: B:229:0x042f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0432  */
    /* JADX WARN: Code duplicated, block: B:237:0x045b  */
    /* JADX WARN: Code duplicated, block: B:242:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:248:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:253:0x0527  */
    /* JADX WARN: Code duplicated, block: B:255:0x052c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0530  */
    /* JADX WARN: Code duplicated, block: B:258:0x0532  */
    /* JADX WARN: Code duplicated, block: B:265:0x0546  */
    /* JADX WARN: Code duplicated, block: B:269:0x0598  */
    /* JADX WARN: Code duplicated, block: B:272:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:273:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:276:0x0654  */
    /* JADX WARN: Code duplicated, block: B:277:0x0656  */
    /* JADX WARN: Code duplicated, block: B:280:0x0661  */
    /* JADX WARN: Code duplicated, block: B:281:0x0663  */
    /* JADX WARN: Code duplicated, block: B:284:0x066b  */
    /* JADX WARN: Code duplicated, block: B:285:0x066d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0674  */
    /* JADX WARN: Code duplicated, block: B:289:0x0676  */
    /* JADX WARN: Code duplicated, block: B:292:0x068d  */
    /* JADX WARN: Code duplicated, block: B:293:0x068f  */
    /* JADX WARN: Code duplicated, block: B:300:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:303:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:311:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:248:0x04f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void W(final boolean z, final List list, final String str, final Integer num, final String str2, final String str3, final Function1 function1, final boolean z2, final boolean z3, final Function3 function3, final Function1 function2, final float f, final int i, final Function0 function0, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        int i6;
        MutableState mutableState;
        State state;
        State state2;
        MutableState mutableState2;
        char c;
        int i7;
        List list2;
        Object objJoinToString$default;
        boolean zChangedInstance;
        Object objRememberedValue;
        LazyListState lazyListState;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object xp0Var;
        int i21;
        int i22;
        MutableState mutableState3;
        int i23;
        MutableState mutableState4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        LazyListState lazyListState2;
        int i32;
        int i33;
        int i34;
        Object objRememberedValue2;
        List list3;
        LazyListState lazyListState3;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        Composer composer3;
        boolean zChanged;
        Object objRememberedValue3;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        String id;
        int iIntValue;
        Object obj;
        final List list4;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objRememberedValue4;
        Function0<ComposeUiNode> constructor;
        final LazyListState lazyListState4;
        Composer composer4;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objRememberedValue5;
        Composer composer5;
        Composer composerStartRestartGroup = composer.startRestartGroup(875611050);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed("继续观看") ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(num) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(str3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i35 = i5;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i35 & 9363) == 9362) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(875611050, i4, i35, "com.dh.myembyapp.ui.screens.home.ResumeItemSection (HomeScreen.kt:2917)");
            }
            LazyListState lazyListStateZ = Z(composerStartRestartGroup, "resume_section_继续观看");
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            int i36 = i4;
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                i6 = 2;
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                i6 = 2;
            }
            MutableState mutableState10 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState11 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            MutableState mutableState12 = (MutableState) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            MutableState mutableState13 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState14 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            MutableState mutableState15 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            MutableState mutableState16 = (MutableState) objRememberedValue14;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            MutableState mutableState17 = (MutableState) objRememberedValue15;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z2), composerStartRestartGroup, (i36 >> 24) & 14);
            Boolean bool = (Boolean) mutableState17.getValue();
            bool.getClass();
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(bool, composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(list);
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                mutableState = mutableState17;
            } else {
                mutableState = mutableState17;
                if (objRememberedValue16 != companion.getEmpty()) {
                    list2 = list;
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    objJoinToString$default = objRememberedValue16;
                    mutableState2 = mutableState;
                    c = 2;
                    i7 = 4;
                }
                String str4 = (String) objJoinToString$default;
                zChangedInstance = composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(r29);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == companion.getEmpty()) {
                    lazyListState = r29;
                    State state3 = state;
                    i8 = 0;
                    i9 = 1;
                    q3 q3Var = new q3(list, lazyListState, state2, state3, (Continuation) null, 8);
                    composerStartRestartGroup.updateRememberedValue(q3Var);
                    objRememberedValue = q3Var;
                } else {
                    lazyListState = lazyListStateZ;
                    i8 = 0;
                    i9 = 1;
                }
                EffectsKt.LaunchedEffect(str4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i8);
                Boolean boolValueOf = Boolean.valueOf(z);
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                Object[] objArr = new Object[6];
                objArr[i8] = boolValueOf;
                objArr[i9] = str;
                objArr[c] = num;
                objArr[3] = str2;
                objArr[i7] = str3;
                objArr[5] = boolValueOf2;
                i10 = i36 & Input.Keys.FORWARD_DEL;
                if (i10 == 32) {
                    i11 = i9;
                } else {
                    i11 = i8;
                }
                i12 = 234881024 & i36;
                if (i12 == 67108864) {
                    i13 = i9;
                } else {
                    i13 = i8;
                }
                int i37 = i13 | i11;
                i14 = 3670016 & i36;
                if (i14 == 1048576) {
                    i15 = i9;
                } else {
                    i15 = i8;
                }
                int i38 = i37 | i15;
                i16 = i36 & 14;
                if (i16 == i7) {
                    i17 = i9;
                } else {
                    i17 = 0;
                }
                int i39 = i17 | i38;
                i18 = i36 & 7168;
                if (i18 == 2048) {
                    i19 = i9;
                } else {
                    i19 = 0;
                }
                i20 = i39 | i19;
                Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (i20 == 0 || objRememberedValue17 == companion.getEmpty()) {
                    i21 = i10;
                    i22 = i36;
                    mutableState3 = mutableState15;
                    i23 = 1048576;
                    mutableState4 = mutableState14;
                    xp0Var = new xp0(z, z2, str3, str, mutableState4, mutableState3, null);
                    composerStartRestartGroup.updateRememberedValue(xp0Var);
                } else {
                    i21 = i10;
                    i22 = i36;
                    xp0Var = objRememberedValue17;
                    mutableState3 = mutableState15;
                    i23 = 1048576;
                    mutableState4 = mutableState14;
                }
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) xp0Var, composerStartRestartGroup, 0);
                Boolean boolValueOf3 = Boolean.valueOf(z);
                Boolean boolValueOf4 = Boolean.valueOf(z2);
                Boolean boolValueOf5 = Boolean.valueOf(z3);
                Object[] objArr2 = new Object[8];
                objArr2[0] = boolValueOf3;
                objArr2[i9] = boolValueOf4;
                objArr2[c] = boolValueOf5;
                objArr2[3] = list;
                objArr2[4] = str;
                objArr2[5] = num;
                objArr2[6] = str2;
                objArr2[7] = str3;
                if (i21 == 32) {
                    i24 = i9;
                } else {
                    i24 = 0;
                }
                if (i14 == i23) {
                    i25 = i9;
                } else {
                    i25 = 0;
                }
                int i40 = i24 | i25;
                if (i16 == 4) {
                    i26 = i9;
                } else {
                    i26 = 0;
                }
                int i41 = i40 | i26;
                if (i18 == 2048) {
                    i27 = i9;
                } else {
                    i27 = 0;
                }
                int i42 = i41 | i27;
                if (i12 == 67108864) {
                    i28 = i9;
                } else {
                    i28 = 0;
                }
                int i43 = i42 | i28;
                if ((i22 & 1879048192) == 536870912) {
                    i29 = i9;
                } else {
                    i29 = 0;
                }
                int i44 = i43 | i29;
                if ((i22 & 57344) == 16384) {
                    i30 = i9;
                } else {
                    i30 = 0;
                }
                int i45 = i44 | i30 | (composerStartRestartGroup.changedInstance(list) ? 1 : 0);
                if ((i22 & 458752) == 131072) {
                    i31 = i9;
                } else {
                    i31 = 0;
                }
                int i46 = i45 | i31;
                lazyListState2 = lazyListState;
                int i47 = i46 | (composerStartRestartGroup.changed(lazyListState2) ? 1 : 0);
                i32 = i35 & 57344;
                if (i32 == 16384) {
                    i33 = i9;
                } else {
                    i33 = 0;
                }
                i34 = i47 | i33;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i34 == 0 || objRememberedValue2 == companion.getEmpty()) {
                    zp0 zp0Var = new zp0(z, str3, str, z2, z3, num, list, str2, lazyListState2, function0, mutableState4, mutableState3, mutableState12, mutableState13, mutableState16, mutableState10, mutableState11, null);
                    list3 = list;
                    lazyListState3 = lazyListState2;
                    mutableState5 = mutableState12;
                    mutableState6 = mutableState13;
                    mutableState7 = mutableState16;
                    mutableState8 = mutableState10;
                    mutableState9 = mutableState11;
                    Composer composer6 = composerStartRestartGroup;
                    composer6.updateRememberedValue(zp0Var);
                    objRememberedValue2 = zp0Var;
                    composer3 = composer6;
                } else {
                    list3 = list;
                    lazyListState3 = lazyListState2;
                    composer3 = composerStartRestartGroup;
                    mutableState8 = mutableState10;
                    mutableState9 = mutableState11;
                    mutableState5 = mutableState12;
                    mutableState6 = mutableState13;
                    mutableState7 = mutableState16;
                }
                EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
                zChanged = composer3.changed(list3);
                objRememberedValue3 = composer3.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    obj = objRememberedValue3;
                    linkedHashMap = new LinkedHashMap();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        id = ((MediaItem) it.next()).getId();
iIntValue = ((Number) ((java.util.Map) linkedHashMap).getOrDefault(id, 0)).intValue();
                        linkedHashMap.put(id, Integer.valueOf(iIntValue + 1));
                        if (iIntValue != 0) {
                            id = id + "_dup" + iIntValue;
                        }
                        arrayList.add(id);
                    }
                    composer3.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue3;
                list4 = (List) obj;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFocusGroup = FocusableKt.focusGroup(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null));
                if ((i22 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i16 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objRememberedValue4 = composer3.rememberedValue();
                if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new r7(function1, mutableState2, 9);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusGroup, (Function1) objRememberedValue4);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(11.0f))), Alignment.INSTANCE.getStart(), composer3, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                int i48 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierOnFocusChanged);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
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
                mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i48), composerM4318constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i49 = MaterialTheme.$stable;
                lazyListState4 = lazyListState3;
                composer4 = composer3;
                TextKt.m3048TextNvy7gAk("继续观看", PaddingKt.m1001paddingVpY3zN4$default(companion2, f, 0.0f, 2, null), materialTheme.getColorScheme(composer3, i49).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i49).getTitleLarge(), composer4, i16, 0, 131064);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
                PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(f, 0.0f, 2, null);
                boolean zChangedInstance2 = composer4.changedInstance(list) | composer4.changedInstance(list4);
                if (i21 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z13 = zChangedInstance2 | z7;
                if ((i35 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z14 = z13 | z8;
                if ((i35 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z15 = z14 | z9;
                if ((i35 & Input.Keys.FORWARD_DEL) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean zChangedInstance3 = z15 | z10 | composer4.changedInstance(coroutineScope) | composer4.changed(lazyListState4);
                if (i32 == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zChangedInstance3 | z11;
                objRememberedValue5 = composer4.rememberedValue();
                if (!z12 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState18 = mutableState8;
                    final MutableState mutableState19 = mutableState9;
                    final MutableState mutableState20 = mutableState5;
                    final MutableState mutableState21 = mutableState6;
                    final MutableState mutableState22 = mutableState7;
                    Function1 function4 = new Function1() { // from class: yo0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            LazyListScope lazyListScope = (LazyListScope) obj2;
                            lazyListScope.getClass();
                            final List list5 = list;
                            int size = list5.size();
                            jg jgVar = new jg(list4, 2);
                            final boolean z16 = z;
                            final int i50 = i;
                            final FocusRequester focusRequester2 = focusRequester;
                            final Function3 function5 = function3;
                            final Function1 function6 = function2;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final LazyListState lazyListState5 = lazyListState4;
                            final Function0 function7 = function0;
                            final MutableState mutableState23 = mutableState18;
                            final MutableState mutableState24 = mutableState19;
                            final MutableState mutableState25 = mutableState20;
                            final MutableState mutableState26 = mutableState21;
                            final MutableState mutableState27 = mutableState22;
                            d.b(lazyListScope, size, jgVar, null, ComposableLambdaKt.composableLambdaInstance(-1573539424, true, new Function4() { // from class: ko0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                    Object obj7;
                                    final MediaItem mediaItem;
                                    Integer num2;
                                    final int iIntValue2 = ((Integer) obj4).intValue();
                                    Composer composer7 = (Composer) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    ((LazyItemScope) obj3).getClass();
                                    if ((iIntValue3 & 48) == 0) {
                                        iIntValue3 |= composer7.changed(iIntValue2) ? 32 : 16;
                                    }
                                    if (composer7.shouldExecute((iIntValue3 & Input.Keys.NUMPAD_1) != 144, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1573539424, iIntValue3, -1, "com.dh.myembyapp.ui.screens.home.ResumeItemSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:3131)");
                                        }
                                        MediaItem mediaItem2 = (MediaItem) list5.get(iIntValue2);
                                        final MutableState mutableState28 = mutableState23;
                                        final boolean z17 = ((Boolean) mutableState28.getValue()).booleanValue() && (num2 = (Integer) mutableState24.getValue()) != null && num2.intValue() == iIntValue2;
                                        Boolean boolValueOf6 = Boolean.valueOf(z17);
                                        Boolean bool2 = (Boolean) mutableState28.getValue();
                                        bool2.getClass();
                                        boolean zChanged3 = composer7.changed(z17);
                                        Object objRememberedValue18 = composer7.rememberedValue();
                                        FocusRequester focusRequester3 = focusRequester2;
                                        if (zChanged3 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue18 = new v2(z17, focusRequester3, mutableState28, null);
                                            composer7.updateRememberedValue(objRememberedValue18);
                                        }
                                        EffectsKt.LaunchedEffect(boolValueOf6, bool2, (Function2) objRememberedValue18, composer7, 0);
                                        if (!z17) {
                                            focusRequester3 = null;
                                        }
                                        boolean zChangedInstance4 = composer7.changedInstance(mediaItem2);
                                        Function3 function8 = function5;
                                        boolean zChanged4 = zChangedInstance4 | composer7.changed(function8);
                                        int i51 = iIntValue3 & Input.Keys.FORWARD_DEL;
                                        boolean z18 = zChanged4 | (i51 == 32);
                                        Object objRememberedValue19 = composer7.rememberedValue();
                                        if (z18 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue19 = new og0(mediaItem2, function8, iIntValue2, 1);
                                            composer7.updateRememberedValue(objRememberedValue19);
                                        }
                                        Function0 function9 = (Function0) objRememberedValue19;
                                        Function1 function10 = function6;
                                        boolean zChanged5 = composer7.changed(function10) | composer7.changedInstance(mediaItem2);
                                        Object objRememberedValue20 = composer7.rememberedValue();
                                        if (zChanged5 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue20 = new q60(function10, mediaItem2, 4);
                                            composer7.updateRememberedValue(objRememberedValue20);
                                        }
                                        Function0 function11 = (Function0) objRememberedValue20;
                                        boolean zChangedInstance5 = composer7.changedInstance(mediaItem2);
                                        boolean z19 = i51 == 32;
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        boolean zChangedInstance6 = zChangedInstance5 | z19 | composer7.changedInstance(coroutineScope3);
                                        final LazyListState lazyListState6 = lazyListState5;
                                        boolean zChanged6 = zChangedInstance6 | composer7.changed(lazyListState6) | composer7.changed(z17);
                                        final Function0 function12 = function7;
                                        boolean zChanged7 = zChanged6 | composer7.changed(function12);
                                        Object objRememberedValue21 = composer7.rememberedValue();
                                        if (zChanged7 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                            final MutableState mutableState29 = mutableState25;
                                            final MutableState mutableState30 = mutableState26;
                                            final MutableState mutableState31 = mutableState27;
                                            mediaItem = mediaItem2;
                                            obj7 = new Function1() { // from class: oo0
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj8) {
                                                    Function0 function13;
                                                    boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                                    MediaItem mediaItem3 = mediaItem;
                                                    MutableState mutableState32 = mutableState29;
                                                    MutableState mutableState33 = mutableState30;
                                                    if (zBooleanValue) {
                                                        mutableState32.setValue(mediaItem3.getId());
                                                        String seriesId = mediaItem3.getSeriesId();
                                                        if (seriesId == null) {
                                                            seriesId = mediaItem3.getId();
                                                        }
                                                        mutableState33.setValue(seriesId);
                                                        if (iIntValue2 == 0) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new e7(lazyListState6, 3, null), 3, null);
                                                        }
                                                    } else if (Intrinsics.areEqual((String) mutableState32.getValue(), mediaItem3.getId())) {
                                                        mutableState32.setValue(null);
                                                        mutableState33.setValue(null);
                                                    }
                                                    if (zBooleanValue && z17) {
                                                        MutableState mutableState34 = mutableState28;
                                                        if (((Boolean) mutableState34.getValue()).booleanValue()) {
                                                            mutableState34.setValue(Boolean.FALSE);
                                                            if (((Boolean) mutableState31.getValue()).booleanValue() && (function13 = function12) != null) {
                                                                function13.invoke();
                                                            }
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            composer7.updateRememberedValue(obj7);
                                        } else {
                                            obj7 = objRememberedValue21;
                                            mediaItem = mediaItem2;
                                        }
                                        bq0.S(z16, mediaItem, i50, focusRequester3, function9, function11, (Function1) obj7, composer7, MediaItem.$stable << 3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer7.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 4, null);
                            return Unit.INSTANCE;
                        }
                    };
                    Composer composer7 = composer4;
                    composer7.updateRememberedValue(function4);
                    objRememberedValue5 = function4;
                    composer5 = composer7;
                } else {
                    composer5 = composer4;
                }
                LazyDslKt.LazyRow(modifierFillMaxWidth$default, lazyListState4, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue5, composer5, 24582, 488);
                composer5.endNode();
                composer2 = composer5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    composer2 = composer5;
                }
            }
            state = stateRememberUpdatedState2;
            state2 = stateRememberUpdatedState;
            mutableState2 = mutableState;
            c = 2;
            i7 = 4;
            list2 = list;
            objJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list2, "|", null, null, 0, null, new vi0(18), 30, null);
            composerStartRestartGroup.updateRememberedValue(objJoinToString$default);
            String str5 = (String) objJoinToString$default;
            zChangedInstance = composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(r29);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                lazyListState = r29;
                State state4 = state;
                i8 = 0;
                i9 = 1;
                q3 q3Var2 = new q3(list, lazyListState, state2, state4, (Continuation) null, 8);
                composerStartRestartGroup.updateRememberedValue(q3Var2);
                objRememberedValue = q3Var2;
            } else {
                lazyListState = r29;
                State state5 = state;
                i8 = 0;
                i9 = 1;
                q3 q3Var3 = new q3(list, lazyListState, state2, state5, (Continuation) null, 8);
                composerStartRestartGroup.updateRememberedValue(q3Var3);
                objRememberedValue = q3Var3;
            }
            EffectsKt.LaunchedEffect(str5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i8);
            Boolean boolValueOf6 = Boolean.valueOf(z);
            Boolean boolValueOf7 = Boolean.valueOf(z2);
            Object[] objArr3 = new Object[6];
            objArr3[i8] = boolValueOf6;
            objArr3[i9] = str;
            objArr3[c] = num;
            objArr3[3] = str2;
            objArr3[i7] = str3;
            objArr3[5] = boolValueOf7;
            i10 = i36 & Input.Keys.FORWARD_DEL;
            if (i10 == 32) {
                i11 = i9;
            } else {
                i11 = i8;
            }
            i12 = 234881024 & i36;
            if (i12 == 67108864) {
                i13 = i9;
            } else {
                i13 = i8;
            }
            int i310 = i13 | i11;
            i14 = 3670016 & i36;
            if (i14 == 1048576) {
                i15 = i9;
            } else {
                i15 = i8;
            }
            int i311 = i310 | i15;
            i16 = i36 & 14;
            if (i16 == i7) {
                i17 = i9;
            } else {
                i17 = 0;
            }
            int i312 = i17 | i311;
            i18 = i36 & 7168;
            if (i18 == 2048) {
                i19 = i9;
            } else {
                i19 = 0;
            }
            i20 = i312 | i19;
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (i20 == 0) {
                i21 = i10;
                i22 = i36;
                mutableState3 = mutableState15;
                i23 = 1048576;
                mutableState4 = mutableState14;
                xp0Var = new xp0(z, z2, str3, str, mutableState4, mutableState3, null);
                composerStartRestartGroup.updateRememberedValue(xp0Var);
            } else {
                i21 = i10;
                i22 = i36;
                mutableState3 = mutableState15;
                i23 = 1048576;
                mutableState4 = mutableState14;
                xp0Var = new xp0(z, z2, str3, str, mutableState4, mutableState3, null);
                composerStartRestartGroup.updateRememberedValue(xp0Var);
            }
            EffectsKt.LaunchedEffect(objArr3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) xp0Var, composerStartRestartGroup, 0);
            Boolean boolValueOf8 = Boolean.valueOf(z);
            Boolean boolValueOf9 = Boolean.valueOf(z2);
            Boolean boolValueOf10 = Boolean.valueOf(z3);
            Object[] objArr4 = new Object[8];
            objArr4[0] = boolValueOf8;
            objArr4[i9] = boolValueOf9;
            objArr4[c] = boolValueOf10;
            objArr4[3] = list;
            objArr4[4] = str;
            objArr4[5] = num;
            objArr4[6] = str2;
            objArr4[7] = str3;
            if (i21 == 32) {
                i24 = i9;
            } else {
                i24 = 0;
            }
            if (i14 == i23) {
                i25 = i9;
            } else {
                i25 = 0;
            }
            int i410 = i24 | i25;
            if (i16 == 4) {
                i26 = i9;
            } else {
                i26 = 0;
            }
            int i411 = i410 | i26;
            if (i18 == 2048) {
                i27 = i9;
            } else {
                i27 = 0;
            }
            int i412 = i411 | i27;
            if (i12 == 67108864) {
                i28 = i9;
            } else {
                i28 = 0;
            }
            int i413 = i412 | i28;
            if ((i22 & 1879048192) == 536870912) {
                i29 = i9;
            } else {
                i29 = 0;
            }
            int i414 = i413 | i29;
            if ((i22 & 57344) == 16384) {
                i30 = i9;
            } else {
                i30 = 0;
            }
            int i415 = i414 | i30 | (composerStartRestartGroup.changedInstance(list) ? 1 : 0);
            if ((i22 & 458752) == 131072) {
                i31 = i9;
            } else {
                i31 = 0;
            }
            int i416 = i415 | i31;
            lazyListState2 = lazyListState;
            int i417 = i416 | (composerStartRestartGroup.changed(lazyListState2) ? 1 : 0);
            i32 = i35 & 57344;
            if (i32 == 16384) {
                i33 = i9;
            } else {
                i33 = 0;
            }
            i34 = i417 | i33;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i34 == 0) {
                zp0 zp0Var2 = new zp0(z, str3, str, z2, z3, num, list, str2, lazyListState2, function0, mutableState4, mutableState3, mutableState12, mutableState13, mutableState16, mutableState10, mutableState11, null);
                list3 = list;
                lazyListState3 = lazyListState2;
                mutableState5 = mutableState12;
                mutableState6 = mutableState13;
                mutableState7 = mutableState16;
                mutableState8 = mutableState10;
                mutableState9 = mutableState11;
                Composer composer8 = composerStartRestartGroup;
                composer8.updateRememberedValue(zp0Var2);
                objRememberedValue2 = zp0Var2;
                composer3 = composer8;
            } else {
                zp0 zp0Var3 = new zp0(z, str3, str, z2, z3, num, list, str2, lazyListState2, function0, mutableState4, mutableState3, mutableState12, mutableState13, mutableState16, mutableState10, mutableState11, null);
                list3 = list;
                lazyListState3 = lazyListState2;
                mutableState5 = mutableState12;
                mutableState6 = mutableState13;
                mutableState7 = mutableState16;
                mutableState8 = mutableState10;
                mutableState9 = mutableState11;
                Composer composer9 = composerStartRestartGroup;
                composer9.updateRememberedValue(zp0Var3);
                objRememberedValue2 = zp0Var3;
                composer3 = composer9;
            }
            EffectsKt.LaunchedEffect(objArr4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer3, 0);
            zChanged = composer3.changed(list3);
            objRememberedValue3 = composer3.rememberedValue();
            if (zChanged) {
                obj = objRememberedValue3;
                linkedHashMap = new LinkedHashMap();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    id = ((MediaItem) it.next()).getId();
                    iIntValue = ((Number) ((java.util.Map) linkedHashMap).getOrDefault(id, 0)).intValue();
                    linkedHashMap.put(id, Integer.valueOf(iIntValue + 1));
                    if (iIntValue != 0) {
                        id = id + "_dup" + iIntValue;
                    }
                    arrayList.add(id);
                }
                composer3.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                obj = objRememberedValue3;
                linkedHashMap = new LinkedHashMap();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    id = ((MediaItem) it.next()).getId();
                    iIntValue = ((Number) ((java.util.Map) linkedHashMap).getOrDefault(id, 0)).intValue();
                    linkedHashMap.put(id, Integer.valueOf(iIntValue + 1));
                    if (iIntValue != 0) {
                        id = id + "_dup" + iIntValue;
                    }
                    arrayList.add(id);
                }
                composer3.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue3;
            list4 = (List) obj;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFocusGroup2 = FocusableKt.focusGroup(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null));
            if ((i22 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i16 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4 | z5;
            objRememberedValue4 = composer3.rememberedValue();
            if (z6) {
                objRememberedValue4 = new r7(function1, mutableState2, 9);
                composer3.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new r7(function1, mutableState2, 9);
                composer3.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusGroup2, (Function1) objRememberedValue4);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(11.0f))), Alignment.INSTANCE.getStart(), composer3, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i418 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierOnFocusChanged2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer3);
            mr.z(companion5, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i418), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i419 = MaterialTheme.$stable;
            lazyListState4 = lazyListState3;
            composer4 = composer3;
            TextKt.m3048TextNvy7gAk("继续观看", PaddingKt.m1001paddingVpY3zN4$default(companion4, f, 0.0f, 2, null), materialTheme2.getColorScheme(composer3, i419).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i419).getTitleLarge(), composer4, i16, 0, 131064);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default2 = PaddingKt.m994PaddingValuesYgX7TsA$default(f, 0.0f, 2, null);
            boolean zChangedInstance4 = composer4.changedInstance(list) | composer4.changedInstance(list4);
            if (i21 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z16 = zChangedInstance4 | z7;
            if ((i35 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z17 = z16 | z8;
            if ((i35 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z18 = z17 | z9;
            if ((i35 & Input.Keys.FORWARD_DEL) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zChangedInstance5 = z18 | z10 | composer4.changedInstance(coroutineScope) | composer4.changed(lazyListState4);
            if (i32 == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zChangedInstance5 | z11;
            objRememberedValue5 = composer4.rememberedValue();
            if (z12) {
                final MutableState mutableState110 = mutableState8;
                final MutableState mutableState111 = mutableState9;
                final MutableState mutableState23 = mutableState5;
                final MutableState mutableState24 = mutableState6;
                final MutableState mutableState25 = mutableState7;
                Function1 function5 = new Function1() { // from class: yo0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LazyListScope lazyListScope = (LazyListScope) obj2;
                        lazyListScope.getClass();
                        final List list5 = list;
                        int size = list5.size();
                        jg jgVar = new jg(list4, 2);
                        final boolean z19 = z;
                        final int i50 = i;
                        final FocusRequester focusRequester2 = focusRequester;
                        final Function3 function6 = function3;
                        final Function1 function7 = function2;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final LazyListState lazyListState5 = lazyListState4;
                        final Function0 function8 = function0;
                        final MutableState mutableState26 = mutableState110;
                        final MutableState mutableState27 = mutableState111;
                        final MutableState mutableState28 = mutableState23;
                        final MutableState mutableState29 = mutableState24;
                        final MutableState mutableState210 = mutableState25;
                        d.b(lazyListScope, size, jgVar, null, ComposableLambdaKt.composableLambdaInstance(-1573539424, true, new Function4() { // from class: ko0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                Object obj7;
                                final MediaItem mediaItem;
                                Integer num2;
                                final int iIntValue2 = ((Integer) obj4).intValue();
                                Composer composer10 = (Composer) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                ((LazyItemScope) obj3).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= composer10.changed(iIntValue2) ? 32 : 16;
                                }
                                if (composer10.shouldExecute((iIntValue3 & Input.Keys.NUMPAD_1) != 144, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1573539424, iIntValue3, -1, "com.dh.myembyapp.ui.screens.home.ResumeItemSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:3131)");
                                    }
                                    MediaItem mediaItem2 = (MediaItem) list5.get(iIntValue2);
                                    final MutableState mutableState211 = mutableState26;
                                    final boolean z110 = ((Boolean) mutableState211.getValue()).booleanValue() && (num2 = (Integer) mutableState27.getValue()) != null && num2.intValue() == iIntValue2;
                                    Boolean boolValueOf11 = Boolean.valueOf(z110);
                                    Boolean bool2 = (Boolean) mutableState211.getValue();
                                    bool2.getClass();
                                    boolean zChanged3 = composer10.changed(z110);
                                    Object objRememberedValue19 = composer10.rememberedValue();
                                    FocusRequester focusRequester3 = focusRequester2;
                                    if (zChanged3 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue19 = new v2(z110, focusRequester3, mutableState211, null);
                                        composer10.updateRememberedValue(objRememberedValue19);
                                    }
                                    EffectsKt.LaunchedEffect(boolValueOf11, bool2, (Function2) objRememberedValue19, composer10, 0);
                                    if (!z110) {
                                        focusRequester3 = null;
                                    }
                                    boolean zChangedInstance6 = composer10.changedInstance(mediaItem2);
                                    Function3 function9 = function6;
                                    boolean zChanged4 = zChangedInstance6 | composer10.changed(function9);
                                    int i51 = iIntValue3 & Input.Keys.FORWARD_DEL;
                                    boolean z111 = zChanged4 | (i51 == 32);
                                    Object objRememberedValue110 = composer10.rememberedValue();
                                    if (z111 || objRememberedValue110 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue110 = new og0(mediaItem2, function9, iIntValue2, 1);
                                        composer10.updateRememberedValue(objRememberedValue110);
                                    }
                                    Function0 function10 = (Function0) objRememberedValue110;
                                    Function1 function11 = function7;
                                    boolean zChanged5 = composer10.changed(function11) | composer10.changedInstance(mediaItem2);
                                    Object objRememberedValue20 = composer10.rememberedValue();
                                    if (zChanged5 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue20 = new q60(function11, mediaItem2, 4);
                                        composer10.updateRememberedValue(objRememberedValue20);
                                    }
                                    Function0 function12 = (Function0) objRememberedValue20;
                                    boolean zChangedInstance7 = composer10.changedInstance(mediaItem2);
                                    boolean z112 = i51 == 32;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean zChangedInstance8 = zChangedInstance7 | z112 | composer10.changedInstance(coroutineScope3);
                                    final LazyListState lazyListState6 = lazyListState5;
                                    boolean zChanged6 = zChangedInstance8 | composer10.changed(lazyListState6) | composer10.changed(z110);
                                    final Function0 function13 = function8;
                                    boolean zChanged7 = zChanged6 | composer10.changed(function13);
                                    Object objRememberedValue21 = composer10.rememberedValue();
                                    if (zChanged7 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                        final MutableState mutableState212 = mutableState28;
                                        final MutableState mutableState30 = mutableState29;
                                        final MutableState mutableState31 = mutableState210;
                                        mediaItem = mediaItem2;
                                        obj7 = new Function1() { // from class: oo0
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj8) {
                                                Function0 function14;
                                                boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                                MediaItem mediaItem3 = mediaItem;
                                                MutableState mutableState32 = mutableState212;
                                                MutableState mutableState33 = mutableState30;
                                                if (zBooleanValue) {
                                                    mutableState32.setValue(mediaItem3.getId());
                                                    String seriesId = mediaItem3.getSeriesId();
                                                    if (seriesId == null) {
                                                        seriesId = mediaItem3.getId();
                                                    }
                                                    mutableState33.setValue(seriesId);
                                                    if (iIntValue2 == 0) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new e7(lazyListState6, 3, null), 3, null);
                                                    }
                                                } else if (Intrinsics.areEqual((String) mutableState32.getValue(), mediaItem3.getId())) {
                                                    mutableState32.setValue(null);
                                                    mutableState33.setValue(null);
                                                }
                                                if (zBooleanValue && z110) {
                                                    MutableState mutableState34 = mutableState211;
                                                    if (((Boolean) mutableState34.getValue()).booleanValue()) {
                                                        mutableState34.setValue(Boolean.FALSE);
                                                        if (((Boolean) mutableState31.getValue()).booleanValue() && (function14 = function13) != null) {
                                                            function14.invoke();
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer10.updateRememberedValue(obj7);
                                    } else {
                                        obj7 = objRememberedValue21;
                                        mediaItem = mediaItem2;
                                    }
                                    bq0.S(z19, mediaItem, i50, focusRequester3, function10, function12, (Function1) obj7, composer10, MediaItem.$stable << 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer10.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }), 4, null);
                        return Unit.INSTANCE;
                    }
                };
                Composer composer10 = composer4;
                composer10.updateRememberedValue(function5);
                objRememberedValue5 = function5;
                composer5 = composer10;
            } else {
                final MutableState mutableState112 = mutableState8;
                final MutableState mutableState113 = mutableState9;
                final MutableState mutableState26 = mutableState5;
                final MutableState mutableState27 = mutableState6;
                final MutableState mutableState28 = mutableState7;
                Function1 function6 = new Function1() { // from class: yo0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        LazyListScope lazyListScope = (LazyListScope) obj2;
                        lazyListScope.getClass();
                        final List list5 = list;
                        int size = list5.size();
                        jg jgVar = new jg(list4, 2);
                        final boolean z19 = z;
                        final int i50 = i;
                        final FocusRequester focusRequester2 = focusRequester;
                        final Function3 function7 = function3;
                        final Function1 function8 = function2;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final LazyListState lazyListState5 = lazyListState4;
                        final Function0 function9 = function0;
                        final MutableState mutableState29 = mutableState112;
                        final MutableState mutableState210 = mutableState113;
                        final MutableState mutableState211 = mutableState26;
                        final MutableState mutableState212 = mutableState27;
                        final MutableState mutableState213 = mutableState28;
                        d.b(lazyListScope, size, jgVar, null, ComposableLambdaKt.composableLambdaInstance(-1573539424, true, new Function4() { // from class: ko0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                Object obj7;
                                final MediaItem mediaItem;
                                Integer num2;
                                final int iIntValue2 = ((Integer) obj4).intValue();
                                Composer composer11 = (Composer) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                ((LazyItemScope) obj3).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= composer11.changed(iIntValue2) ? 32 : 16;
                                }
                                if (composer11.shouldExecute((iIntValue3 & Input.Keys.NUMPAD_1) != 144, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1573539424, iIntValue3, -1, "com.dh.myembyapp.ui.screens.home.ResumeItemSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:3131)");
                                    }
                                    MediaItem mediaItem2 = (MediaItem) list5.get(iIntValue2);
                                    final MutableState mutableState214 = mutableState29;
                                    final boolean z110 = ((Boolean) mutableState214.getValue()).booleanValue() && (num2 = (Integer) mutableState210.getValue()) != null && num2.intValue() == iIntValue2;
                                    Boolean boolValueOf11 = Boolean.valueOf(z110);
                                    Boolean bool2 = (Boolean) mutableState214.getValue();
                                    bool2.getClass();
                                    boolean zChanged3 = composer11.changed(z110);
                                    Object objRememberedValue19 = composer11.rememberedValue();
                                    FocusRequester focusRequester3 = focusRequester2;
                                    if (zChanged3 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue19 = new v2(z110, focusRequester3, mutableState214, null);
                                        composer11.updateRememberedValue(objRememberedValue19);
                                    }
                                    EffectsKt.LaunchedEffect(boolValueOf11, bool2, (Function2) objRememberedValue19, composer11, 0);
                                    if (!z110) {
                                        focusRequester3 = null;
                                    }
                                    boolean zChangedInstance6 = composer11.changedInstance(mediaItem2);
                                    Function3 function10 = function7;
                                    boolean zChanged4 = zChangedInstance6 | composer11.changed(function10);
                                    int i51 = iIntValue3 & Input.Keys.FORWARD_DEL;
                                    boolean z111 = zChanged4 | (i51 == 32);
                                    Object objRememberedValue110 = composer11.rememberedValue();
                                    if (z111 || objRememberedValue110 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue110 = new og0(mediaItem2, function10, iIntValue2, 1);
                                        composer11.updateRememberedValue(objRememberedValue110);
                                    }
                                    Function0 function11 = (Function0) objRememberedValue110;
                                    Function1 function12 = function8;
                                    boolean zChanged5 = composer11.changed(function12) | composer11.changedInstance(mediaItem2);
                                    Object objRememberedValue20 = composer11.rememberedValue();
                                    if (zChanged5 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue20 = new q60(function12, mediaItem2, 4);
                                        composer11.updateRememberedValue(objRememberedValue20);
                                    }
                                    Function0 function13 = (Function0) objRememberedValue20;
                                    boolean zChangedInstance7 = composer11.changedInstance(mediaItem2);
                                    boolean z112 = i51 == 32;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean zChangedInstance8 = zChangedInstance7 | z112 | composer11.changedInstance(coroutineScope3);
                                    final LazyListState lazyListState6 = lazyListState5;
                                    boolean zChanged6 = zChangedInstance8 | composer11.changed(lazyListState6) | composer11.changed(z110);
                                    final Function0 function14 = function9;
                                    boolean zChanged7 = zChanged6 | composer11.changed(function14);
                                    Object objRememberedValue21 = composer11.rememberedValue();
                                    if (zChanged7 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                        final MutableState mutableState215 = mutableState211;
                                        final MutableState mutableState30 = mutableState212;
                                        final MutableState mutableState31 = mutableState213;
                                        mediaItem = mediaItem2;
                                        obj7 = new Function1() { // from class: oo0
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj8) {
                                                Function0 function15;
                                                boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                                                MediaItem mediaItem3 = mediaItem;
                                                MutableState mutableState32 = mutableState215;
                                                MutableState mutableState33 = mutableState30;
                                                if (zBooleanValue) {
                                                    mutableState32.setValue(mediaItem3.getId());
                                                    String seriesId = mediaItem3.getSeriesId();
                                                    if (seriesId == null) {
                                                        seriesId = mediaItem3.getId();
                                                    }
                                                    mutableState33.setValue(seriesId);
                                                    if (iIntValue2 == 0) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new e7(lazyListState6, 3, null), 3, null);
                                                    }
                                                } else if (Intrinsics.areEqual((String) mutableState32.getValue(), mediaItem3.getId())) {
                                                    mutableState32.setValue(null);
                                                    mutableState33.setValue(null);
                                                }
                                                if (zBooleanValue && z110) {
                                                    MutableState mutableState34 = mutableState214;
                                                    if (((Boolean) mutableState34.getValue()).booleanValue()) {
                                                        mutableState34.setValue(Boolean.FALSE);
                                                        if (((Boolean) mutableState31.getValue()).booleanValue() && (function15 = function14) != null) {
                                                            function15.invoke();
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer11.updateRememberedValue(obj7);
                                    } else {
                                        obj7 = objRememberedValue21;
                                        mediaItem = mediaItem2;
                                    }
                                    bq0.S(z19, mediaItem, i50, focusRequester3, function11, function13, (Function1) obj7, composer11, MediaItem.$stable << 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer11.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }), 4, null);
                        return Unit.INSTANCE;
                    }
                };
                Composer composer11 = composer4;
                composer11.updateRememberedValue(function6);
                objRememberedValue5 = function6;
                composer5 = composer11;
            }
            LazyDslKt.LazyRow(modifierFillMaxWidth$default2, lazyListState4, paddingValuesM994PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue5, composer5, 24582, 488);
            composer5.endNode();
            composer2 = composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer5;
            }
        } else {
            Composer composer12 = composerStartRestartGroup;
            composer12.skipToGroupEnd();
            composer2 = composer12;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: zo0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    bq0.W(z, list, str, num, str2, str3, function1, z2, z3, function3, function2, f, i, function0, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void X(final ItemCounts itemCounts, final float f, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(192650726);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(itemCounts) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        final int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(192650726, i2, -1, "com.dh.myembyapp.ui.screens.home.ServerItemCountsSection (HomeScreen.kt:2225)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (itemCounts.getMovieCount() == 0 && itemCounts.getSeriesCount() == 0 && itemCounts.getEpisodeCount() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: qo0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    bq0.X(itemCounts, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    bq0.X(itemCounts, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = NumberFormat.getIntegerInstance(Locale.US);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            NumberFormat numberFormat = (NumberFormat) objRememberedValue;
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = CollectionsKt.listOf((Object[]) new Triple[]{new Triple(numberFormat.format(Integer.valueOf(itemCounts.getMovieCount())), "电影", Color.m5142boximpl(ColorKt.Color(4293417819L))), new Triple(numberFormat.format(Integer.valueOf(itemCounts.getSeriesCount())), "剧集", Color.m5142boximpl(ColorKt.Color(4287397113L))), new Triple(numberFormat.format(Integer.valueOf(itemCounts.getEpisodeCount())), "集数", Color.m5142boximpl(ColorKt.Color(4284385023L)))});
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            List<Triple> list = (List) objRememberedValue2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f, Dp.m7813constructorimpl(12.0f));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            int i4 = 54;
            MeasurePolicy measurePolicyP = mr.p(12.0f, arrangement, centerHorizontally, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            float f2 = 12.0f;
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyP, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-357110516);
            for (Triple triple : list) {
                String str = (String) triple.component1();
                String str2 = (String) triple.component2();
                long jM5162unboximpl = ((Color) triple.component3()).m5162unboximpl();
                Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(118.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(18.0f))), u61Var.C, null, 2, null);
                float fM7813constructorimpl = Dp.m7813constructorimpl(1.0f);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i7 = MaterialTheme.$stable;
                Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(BorderKt.m286borderxT4_qwU(modifierM275backgroundbw27NRU$default, fM7813constructorimpl, materialTheme.getColorScheme(composerStartRestartGroup, i7).getOutlineVariant(), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(18.0f))), Dp.m7813constructorimpl(f2), Dp.m7813constructorimpl(10.0f));
                MeasurePolicy measurePolicyP2 = mr.p(4.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, i4);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN5);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion5, composerM4318constructorimpl3, measurePolicyP2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i8), composerM4318constructorimpl3));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                str.getClass();
                Composer composer2 = composerStartRestartGroup;
                TextKt.m3048TextNvy7gAk(str, null, jM5162unboximpl, null, TextUnitKt.getSp(19), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 1597440, 0, 262058);
                TextKt.m3048TextNvy7gAk(str2, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i7).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262122);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                i4 = i4;
                f2 = f2;
                u61Var = u61Var;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(10.0f)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i9 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: qo0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i10 = i9;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i10) {
                        case 0:
                            bq0.X(itemCounts, f, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            bq0.X(itemCounts, f, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Y(List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Map map, zq0 zq0Var) {
        if (((Boolean) mutableState.getValue()).booleanValue() || ((Number) mutableState2.getValue()).intValue() >= list.size()) {
            return;
        }
        int iIntValue = ((Number) mutableState2.getValue()).intValue();
        int iCoerceAtMost = RangesKt.coerceAtMost(((Number) mutableState2.getValue()).intValue() + 5, list.size());
        List<Library> listSubList = list.subList(iIntValue, iCoerceAtMost);
        if (listSubList.isEmpty()) {
            return;
        }
        mutableState3.setValue(Integer.valueOf(iIntValue));
        mutableState4.setValue(Integer.valueOf(iCoerceAtMost));
        mutableState.setValue(Boolean.TRUE);
        for (Library library : listSubList) {
            if (map.get(library.getId()) == null) {
                zq0Var.F(library.getId());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LazyListState Z(Composer composer, String str) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(298680679, 0, -1, "com.dh.myembyapp.ui.screens.home.rememberSavedLazyRowState (HomeScreen.kt:2285)");
        }
        Object[] objArr = {str};
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new bo0(8);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue, composer, 48);
        Object[] objArr2 = {str};
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new bo0(9);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue2, composer, 48);
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(((Number) mutableState.getValue()).intValue(), ((Number) mutableState2.getValue()).intValue(), composer, 0, 0);
        boolean zChanged = composer.changed(lazyListStateRememberLazyListState) | composer.changed(mutableState) | composer.changed(mutableState2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            Object hyVar = new hy(lazyListStateRememberLazyListState, mutableState, mutableState2, null, 1);
            composer.updateRememberedValue(hyVar);
            objRememberedValue3 = hyVar;
        }
        EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyListStateRememberLazyListState;
    }

    /* JADX WARN: Code duplicated, block: B:335:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:338:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:340:0x0709  */
    /* JADX WARN: Code duplicated, block: B:346:0x0766  */
    /* JADX WARN: Code duplicated, block: B:347:0x0769  */
    /* JADX WARN: Code duplicated, block: B:350:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:353:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:354:0x07da  */
    /* JADX WARN: Code duplicated, block: B:358:0x0843  */
    /* JADX WARN: Code duplicated, block: B:359:0x0846  */
    /* JADX WARN: Code duplicated, block: B:362:0x0885  */
    /* JADX WARN: Code duplicated, block: B:366:0x089c  */
    /* JADX WARN: Code duplicated, block: B:369:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:373:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:376:0x0901  */
    /* JADX WARN: Code duplicated, block: B:378:0x0908  */
    /* JADX WARN: Code duplicated, block: B:380:0x090c  */
    /* JADX WARN: Code duplicated, block: B:381:0x090f  */
    /* JADX WARN: Code duplicated, block: B:384:0x0923  */
    /* JADX WARN: Code duplicated, block: B:388:0x0931  */
    /* JADX WARN: Code duplicated, block: B:391:0x096a  */
    /* JADX WARN: Code duplicated, block: B:392:0x097a  */
    /* JADX WARN: Code duplicated, block: B:395:0x0994  */
    /* JADX WARN: Code duplicated, block: B:396:0x0997  */
    /* JADX WARN: Code duplicated, block: B:399:0x099f  */
    /* JADX WARN: Code duplicated, block: B:403:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:406:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:407:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:410:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:411:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:414:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:415:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:418:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:419:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:422:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:429:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:431:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:434:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:437:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:444:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:451:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:452:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:456:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:458:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:460:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0ade  */
    /* JADX WARN: Code duplicated, block: B:463:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:467:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:469:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:471:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:473:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:477:0x0b20  */
    /* JADX WARN: Code duplicated, block: B:480:0x0b60  */
    /* JADX WARN: Code duplicated, block: B:482:0x0b65  */
    /* JADX WARN: Code duplicated, block: B:485:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:487:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:492:0x0c30  */
    /* JADX WARN: Code duplicated, block: B:496:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:499:0x0c69  */
    /* JADX WARN: Code duplicated, block: B:503:0x0c72  */
    /* JADX WARN: Code duplicated, block: B:506:0x0cb4  */
    /* JADX WARN: Code duplicated, block: B:509:0x0cc0  */
    /* JADX WARN: Code duplicated, block: B:510:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:513:0x0cf9  */
    /* JADX WARN: Code duplicated, block: B:516:0x0d17  */
    /* JADX WARN: Code duplicated, block: B:519:0x0d51  */
    /* JADX WARN: Code duplicated, block: B:520:0x0d53  */
    /* JADX WARN: Code duplicated, block: B:523:0x0d64  */
    /* JADX WARN: Code duplicated, block: B:525:0x0d6a  */
    /* JADX WARN: Code duplicated, block: B:530:0x0dfe  */
    /* JADX WARN: Code duplicated, block: B:533:0x0e0a  */
    /* JADX WARN: Code duplicated, block: B:534:0x0e0e  */
    /* JADX WARN: Code duplicated, block: B:537:0x0e2f  */
    /* JADX WARN: Code duplicated, block: B:539:0x0e46  */
    /* JADX WARN: Code duplicated, block: B:541:0x0e4c  */
    /* JADX WARN: Code duplicated, block: B:544:0x0e5d  */
    /* JADX WARN: Code duplicated, block: B:545:0x0e5f  */
    /* JADX WARN: Code duplicated, block: B:548:0x0e66  */
    /* JADX WARN: Code duplicated, block: B:552:0x0e70  */
    /* JADX WARN: Code duplicated, block: B:555:0x0e82  */
    /* JADX WARN: Code duplicated, block: B:556:0x0e84  */
    /* JADX WARN: Code duplicated, block: B:559:0x0e90  */
    /* JADX WARN: Code duplicated, block: B:560:0x0e92  */
    /* JADX WARN: Code duplicated, block: B:563:0x0e9a  */
    /* JADX WARN: Code duplicated, block: B:567:0x0ea5  */
    /* JADX WARN: Code duplicated, block: B:569:0x0ee6  */
    /* JADX WARN: Code duplicated, block: B:572:0x0f07  */
    /* JADX WARN: Code duplicated, block: B:574:0x0f1c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0f22  */
    /* JADX WARN: Code duplicated, block: B:579:0x0f2f  */
    /* JADX WARN: Code duplicated, block: B:581:0x0f3b  */
    /* JADX WARN: Code duplicated, block: B:582:0x0f3d  */
    /* JADX WARN: Code duplicated, block: B:585:0x0f45  */
    /* JADX WARN: Code duplicated, block: B:589:0x0f4f  */
    /* JADX WARN: Code duplicated, block: B:591:0x0f63  */
    /* JADX WARN: Code duplicated, block: B:594:0x0f7a  */
    /* JADX WARN: Code duplicated, block: B:596:0x0f80  */
    /* JADX WARN: Code duplicated, block: B:599:0x0f92  */
    /* JADX WARN: Code duplicated, block: B:600:0x0f94  */
    /* JADX WARN: Code duplicated, block: B:603:0x0fa1  */
    /* JADX WARN: Code duplicated, block: B:604:0x0fa3  */
    /* JADX WARN: Code duplicated, block: B:607:0x0fac  */
    /* JADX WARN: Code duplicated, block: B:611:0x0fb9  */
    /* JADX WARN: Code duplicated, block: B:613:0x1012  */
    /* JADX WARN: Code duplicated, block: B:617:0x1034  */
    /* JADX WARN: Code duplicated, block: B:619:0x103c  */
    /* JADX WARN: Code duplicated, block: B:623:0x104b  */
    /* JADX WARN: Code duplicated, block: B:629:0x106b  */
    /* JADX WARN: Code duplicated, block: B:631:0x107b  */
    /* JADX WARN: Code duplicated, block: B:633:0x10af  */
    /* JADX WARN: Code duplicated, block: B:637:0x10ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x10cc  */
    /* JADX WARN: Code duplicated, block: B:642:0x10d0  */
    /* JADX WARN: Code duplicated, block: B:645:0x10dd  */
    /* JADX WARN: Code duplicated, block: B:646:0x10df  */
    /* JADX WARN: Code duplicated, block: B:649:0x10e7  */
    /* JADX WARN: Code duplicated, block: B:653:0x10fa  */
    /* JADX WARN: Code duplicated, block: B:656:0x1127  */
    /* JADX WARN: Code duplicated, block: B:660:0x1132  */
    /* JADX WARN: Code duplicated, block: B:662:0x119d  */
    /* JADX WARN: Code duplicated, block: B:664:0x11c3  */
    /* JADX WARN: Code duplicated, block: B:666:0x11f4  */
    /* JADX WARN: Code duplicated, block: B:670:0x11ff  */
    /* JADX WARN: Code duplicated, block: B:673:0x121c  */
    /* JADX WARN: Code duplicated, block: B:675:0x1224  */
    /* JADX WARN: Code duplicated, block: B:680:0x1251  */
    /* JADX WARN: Code duplicated, block: B:684:0x126b  */
    /* JADX WARN: Code duplicated, block: B:686:0x1278  */
    /* JADX WARN: Code duplicated, block: B:689:0x129a  */
    /* JADX WARN: Code duplicated, block: B:692:0x12be  */
    /* JADX WARN: Code duplicated, block: B:702:0x1065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0aa4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x0aa5 A[EDGE_INSN: B:705:0x0aa5->B:449:0x0aa5 BREAK  A[LOOP:2: B:432:0x0a5d->B:447:0x0aa1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0a91 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:710:0x0713 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final List list, final List list2, final List list3, final String str, final Integer num, final String str2, final String str3, final boolean z2, final boolean z3, final Function1 function1, final Function2 function2, final Function3 function3, final Function2 function4, final Function2 function5, final Function3 function6, final Function0 function0, final zq0 zq0Var, final boolean z4, final boolean z5, ItemCounts itemCounts, final Function1 function7, final Function1 function8, final int i, final Function0 function9, Composer composer, final int i2, final int i3, final int i4) {
        ItemCounts itemCounts2;
        zq0 zq0Var2;
        Composer composer2;
        char c;
        int i5;
        MutableState mutableState;
        Composer composer3;
        String imageUrl;
        Object obj;
        List list4;
        int i6;
        Map map;
        boolean zChanged;
        Object objRememberedValue;
        ListIterator listIterator;
        rx0 rx0Var;
        int iIntValue;
        boolean z6;
        boolean zChanged2;
        Object objRememberedValue2;
        MutableState mutableState2;
        Map map2;
        MutableState mutableState3;
        MutableState mutableState4;
        ScrollState scrollState;
        List list5;
        MutableState mutableState5;
        int i7;
        Composer composer4;
        int i8;
        boolean z7;
        boolean zChanged3;
        Object objRememberedValue3;
        zq0 zq0Var3;
        MutableState mutableState6;
        int i9;
        MutableState mutableState7;
        Map map3;
        boolean zChanged4;
        Object objRememberedValue4;
        int i10;
        Continuation continuation;
        boolean z8;
        int i11;
        boolean z9;
        boolean zChanged5;
        Object objRememberedValue5;
        MutableState mutableState8;
        Composer composer5;
        Object objRememberedValue6;
        Composer.Companion companion;
        ScrollState scrollState2;
        State state;
        int i12;
        int i13;
        Map map4;
        boolean z10;
        Object objRememberedValue7;
        boolean z11;
        boolean z12;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objRememberedValue8;
        char c2;
        Composer composer6;
        boolean zChanged6;
        Object objRememberedValue9;
        Iterator it;
        Object next;
        Library library;
        String name;
        Library library2;
        Iterator it2;
        Object next2;
        rx0 rx0Var2;
        String str4;
        boolean zChanged7;
        Object objRememberedValue10;
        String str5;
        boolean zChanged8;
        Object objRememberedValue11;
        x82 x82Var;
        x82 x82Var2;
        Object objRememberedValue12;
        Composer.Companion companion2;
        Set set;
        boolean z16;
        MutableState mutableState9;
        boolean zChanged9;
        Object c6Var;
        List list6;
        String str6;
        int i15;
        int i16;
        MutableState mutableState10;
        boolean zChanged10;
        Object objRememberedValue13;
        MutableState mutableState11;
        ScrollState scrollState3;
        boolean zChanged11;
        Object objRememberedValue14;
        Continuation continuation2;
        Function0<ComposeUiNode> constructor;
        Object objRememberedValue15;
        Object objRememberedValue16;
        Composer composer7;
        String str7;
        boolean z17;
        boolean zChanged12;
        Object bp0Var;
        MutableState mutableState12;
        char c3;
        Function0<ComposeUiNode> constructor2;
        float f;
        int i17;
        MutableState mutableState13;
        int i18;
        Composer composer8;
        int i19;
        Composer composer9;
        final int i20;
        Composer composer10;
        int i21;
        final Library library3;
        Iterator it3;
        Object next3;
        rx0 rx0Var3;
        int i22;
        final MutableState mutableState14;
        final MutableState mutableState15;
        boolean zChanged13;
        Object objRememberedValue17;
        final int i23;
        boolean zChangedInstance;
        Object objRememberedValue18;
        MutableState mutableState16;
        MutableState mutableState17;
        final MutableState mutableState18;
        final MutableState mutableState19;
        boolean zChanged14;
        Object objRememberedValue19;
        final int i24;
        int i25;
        int i26;
        char c4;
        int i27;
        Object objRememberedValue20;
        boolean zChangedInstance2;
        Object objRememberedValue21;
        boolean zChanged15;
        Object objRememberedValue22;
        Function3 function10;
        boolean zChangedInstance3;
        Object objRememberedValue23;
        int i28;
        int i29;
        int i30;
        Object objRememberedValue24;
        int i31;
        Object objRememberedValue25;
        boolean zChanged16;
        Object objRememberedValue26;
        boolean z18;
        Object objRememberedValue27;
        boolean z19;
        boolean z20;
        boolean z21;
        Object objRememberedValue28;
        final int i32;
        Composer composerStartRestartGroup = composer.startRestartGroup(-833889540);
        int i33 = (i2 & 6) == 0 ? i2 | (composerStartRestartGroup.changed(z) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i33 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i33 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i33 |= composerStartRestartGroup.changedInstance(list3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i33 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i33 |= composerStartRestartGroup.changed(num) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i33 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i33 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
        }
        int i34 = i2 & 100663296;
        int i35 = GroupFlagsKt.HasAuxSlotFlag;
        if (i34 == 0) {
            i33 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i33 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
        }
        int i36 = i33;
        int i37 = (i3 & 6) == 0 ? i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) : i3;
        if ((i3 & 48) == 0) {
            i37 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i37 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i37 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i37 |= composerStartRestartGroup.changedInstance(function5) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i37 |= composerStartRestartGroup.changedInstance(function6) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i37 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i37 |= composerStartRestartGroup.changedInstance(zq0Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            if (composerStartRestartGroup.changed(z4)) {
                i35 = 67108864;
            }
            i37 |= i35;
        }
        if ((i3 & 805306368) == 0) {
            i37 |= composerStartRestartGroup.changed(z5) ? 536870912 : 268435456;
        }
        int i38 = i37;
        int i39 = (i4 & 6) == 0 ? i4 | (composerStartRestartGroup.changed(itemCounts) ? 4 : 2) : i4;
        if ((i4 & 48) == 0) {
            i39 |= composerStartRestartGroup.changedInstance(function7) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i39 |= composerStartRestartGroup.changedInstance(function8) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i39 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i39 |= composerStartRestartGroup.changedInstance(function9) ? 16384 : 8192;
        }
        int i40 = i39;
        if (composerStartRestartGroup.shouldExecute(((i36 & 306783379) == 306783378 && (i38 & 306783379) == 306783378 && (i40 & 9363) == 9362) ? false : true, i36 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833889540, i36, i38, "com.dh.myembyapp.ui.screens.home.HomeContent (HomeScreen.kt:1641)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            boolean zChanged17 = composerStartRestartGroup.changed(ioVar.c) | composerStartRestartGroup.changed(density);
            Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
            if (zChanged17 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue29 = Integer.valueOf(RangesKt.coerceIn(MathKt.roundToInt(density.mo420toPx0680j_4(ioVar.c) * 1.5f), WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 720));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
            }
            int iIntValue2 = ((Number) objRememberedValue29).intValue();
            boolean zChanged18 = composerStartRestartGroup.changed(ioVar.z) | composerStartRestartGroup.changed(density);
            Object objRememberedValue30 = composerStartRestartGroup.rememberedValue();
            if (zChanged18 || objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue30 = Integer.valueOf(RangesKt.coerceIn(MathKt.roundToInt(density.mo420toPx0680j_4(ioVar.z) * 1.5f), WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 720));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue30);
            }
            int iIntValue3 = ((Number) objRememberedValue30).intValue();
            Object objRememberedValue31 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue31 == companion3.getEmpty()) {
                objRememberedValue31 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue31);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue31;
            list.size();
            list2.size();
            float fM7813constructorimpl = Dp.m7813constructorimpl(48.0f);
            Object[] objArr = new Object[0];
            Object objRememberedValue32 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue32 == companion3.getEmpty()) {
                objRememberedValue32 = new bo0(1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue32);
            }
            MutableState mutableState20 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue32, composerStartRestartGroup, 48);
            Object[] objArr2 = new Object[0];
            Object objRememberedValue33 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue33 == companion3.getEmpty()) {
                objRememberedValue33 = new bo0(2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue33);
            }
            MutableState mutableState21 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue33, composerStartRestartGroup, 48);
            Object[] objArr3 = new Object[0];
            Object objRememberedValue34 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue34 == companion3.getEmpty()) {
                objRememberedValue34 = new bo0(3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue34);
            }
            MutableState mutableState22 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (Function0) objRememberedValue34, composerStartRestartGroup, 48);
            Boolean boolValueOf = Boolean.valueOf(z);
            Integer numValueOf = Integer.valueOf(list.size());
            Integer numValueOf2 = Integer.valueOf(list2.size());
            int i41 = i36 & 14;
            boolean zChanged19 = (i41 == 4) | composerStartRestartGroup.changed(mutableState22) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changed(mutableState21);
            Object objRememberedValue35 = composerStartRestartGroup.rememberedValue();
            if (zChanged19 || objRememberedValue35 == companion3.getEmpty()) {
                c = 2;
                i5 = i41;
                Composer composer11 = composerStartRestartGroup;
                cp0 cp0Var = new cp0(z, list, list2, mutableState22, mutableState21, null);
                mutableState = mutableState21;
                composer11.updateRememberedValue(cp0Var);
                objRememberedValue35 = cp0Var;
                composer3 = composer11;
            } else {
                mutableState = mutableState21;
                composer3 = composerStartRestartGroup;
                i5 = i41;
                c = 2;
            }
            EffectsKt.LaunchedEffect(boolValueOf, numValueOf, numValueOf2, (Function2) objRememberedValue35, composer3, i5);
            boolean zChanged20 = composer3.changed(r2);
            Object objRememberedValue36 = composer3.rememberedValue();
            if (zChanged20 || objRememberedValue36 == companion3.getEmpty()) {
                obj = objRememberedValue36;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10));
                Iterator it4 = r2.iterator();
                while (it4.hasNext()) {
                    Library library4 = (Library) it4.next();
                    ImageTags imageTags = library4.getImageTags();
                    String thumb = imageTags != null ? imageTags.getThumb() : null;
                    String primaryImageTag = library4.getPrimaryImageTag();
                    if (primaryImageTag == null) {
                        ImageTags imageTags2 = library4.getImageTags();
                        primaryImageTag = imageTags2 != null ? imageTags2.getPrimary() : null;
                    }
                    if (thumb != null) {
                        primaryImageTag = thumb;
                    }
                    String str8 = thumb != null ? "Thumb" : "Primary";
                    String id = library4.getId();
                    String name2 = library4.getName();
                    Iterator it5 = it4;
                    if (primaryImageTag == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(library4.getId(), str8, primaryImageTag, 500)) == null) {
                        imageUrl = "";
                    }
                    arrayList.add(new uv1(id, name2, imageUrl));
                    it4 = it5;
                }
                composer3.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue36;
            List list7 = (List) obj;
            Object[] objArr4 = new Object[0];
            Object objRememberedValue37 = composer3.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue37 == companion4.getEmpty()) {
                objRememberedValue37 = new bo0(4);
                composer3.updateRememberedValue(objRememberedValue37);
            }
            MutableState mutableState23 = (MutableState) RememberSaveableKt.rememberSaveable(objArr4, (Function0) objRememberedValue37, composer3, 48);
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(b(mutableState23), composer3, 0, 0);
            boolean zChanged21 = composer3.changed(r2);
            Object objRememberedValue38 = composer3.rememberedValue();
            if (zChanged21 || objRememberedValue38 == companion4.getEmpty()) {
                list4 = r2;
                objRememberedValue38 = CollectionsKt___CollectionsKt.joinToString$default(list4, "|", null, null, 0, null, new vi0(17), 30, null);
                composer3.updateRememberedValue(objRememberedValue38);
            } else {
                list4 = list;
            }
            String str9 = (String) objRememberedValue38;
            Object[] objArr5 = {str9};
            Object objRememberedValue39 = composer3.rememberedValue();
            if (objRememberedValue39 == companion4.getEmpty()) {
                objRememberedValue39 = new bo0(5);
                composer3.updateRememberedValue(objRememberedValue39);
            }
            MutableState mutableState24 = (MutableState) RememberSaveableKt.rememberSaveable(objArr5, (Function0) objRememberedValue39, composer3, 48);
            int i42 = i36 & 29360128;
            boolean zChanged22 = composer3.changed(list4) | (i42 == 8388608);
            Object objRememberedValue40 = composer3.rememberedValue();
            int iNextIndex = -1;
            if (zChanged22 || objRememberedValue40 == companion4.getEmpty()) {
                Iterator it6 = list4.iterator();
                int i43 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i43 = -1;
                        break;
                    } else if (Intrinsics.areEqual(((Library) it6.next()).getName(), str3)) {
                        break;
                    } else {
                        i43++;
                    }
                }
                objRememberedValue40 = Integer.valueOf(i43);
                composer3.updateRememberedValue(objRememberedValue40);
            }
            int iIntValue4 = ((Number) objRememberedValue40).intValue();
            int i44 = i36 & 234881024;
            boolean zChanged23 = composer3.changed(list4.size()) | composer3.changed(iIntValue4) | (i44 == 67108864);
            Object objRememberedValue41 = composer3.rememberedValue();
            if (zChanged23 || objRememberedValue41 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue41 = Integer.valueOf((!z2 || iIntValue4 < 0) ? RangesKt.coerceAtMost(3, list4.size()) : RangesKt.coerceAtMost(RangesKt.coerceAtLeast(((iIntValue4 / 5) + 1) * 5, 3), list4.size()));
                composer3.updateRememberedValue(objRememberedValue41);
            }
            int iIntValue5 = ((Number) objRememberedValue41).intValue();
            Object[] objArr6 = {str9};
            boolean zChangedInstance4 = composer3.changedInstance(list4);
            Object objRememberedValue42 = composer3.rememberedValue();
            if (zChangedInstance4 || objRememberedValue42 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue42 = new uo(list4, 4);
                composer3.updateRememberedValue(objRememberedValue42);
            }
            MutableState mutableState25 = (MutableState) RememberSaveableKt.rememberSaveable(objArr6, (Function0) objRememberedValue42, composer3, 0);
            Object[] objArr7 = {str9};
            Object objRememberedValue43 = composer3.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue43 == companion5.getEmpty()) {
                objRememberedValue43 = new bo0(6);
                composer3.updateRememberedValue(objRememberedValue43);
            }
            MutableState mutableState26 = (MutableState) RememberSaveableKt.rememberSaveable(objArr7, (Function0) objRememberedValue43, composer3, 48);
            Object[] objArr8 = {str9};
            Object objRememberedValue44 = composer3.rememberedValue();
            if (objRememberedValue44 == companion5.getEmpty()) {
                objRememberedValue44 = new bo0(7);
                composer3.updateRememberedValue(objRememberedValue44);
            }
            MutableState mutableState27 = (MutableState) RememberSaveableKt.rememberSaveable(objArr8, (Function0) objRememberedValue44, composer3, 48);
            Object[] objArr9 = {str9};
            Object objRememberedValue45 = composer3.rememberedValue();
            if (objRememberedValue45 == companion5.getEmpty()) {
                objRememberedValue45 = new bo0(0);
                composer3.updateRememberedValue(objRememberedValue45);
            }
            MutableState mutableState28 = (MutableState) RememberSaveableKt.rememberSaveable(objArr9, (Function0) objRememberedValue45, composer3, 48);
            boolean zChanged24 = composer3.changed(list4) | composer3.changed(d(mutableState25));
            Object objRememberedValue46 = composer3.rememberedValue();
            if (zChanged24 || objRememberedValue46 == companion5.getEmpty()) {
                objRememberedValue46 = CollectionsKt.take(list4, RangesKt.coerceAtMost(d(mutableState25), list4.size()));
                composer3.updateRememberedValue(objRememberedValue46);
            }
            List list8 = (List) objRememberedValue46;
            boolean zChanged25 = composer3.changed(list3);
            Object objRememberedValue47 = composer3.rememberedValue();
            if (zChanged25) {
                i6 = i44;
            } else {
                i6 = i44;
                if (objRememberedValue47 == companion5.getEmpty()) {
                }
                map = (Map) objRememberedValue47;
                zChanged = composer3.changed(list8) | composer3.changed(map);
                objRememberedValue = composer3.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    listIterator = list8.listIterator(list8.size());
                    while (listIterator.hasPrevious()) {
                        rx0Var = (rx0) map.get(((Library) listIterator.previous()).getId());
                        if (rx0Var != null || !rx0Var.getItems().isEmpty()) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    objRememberedValue = Integer.valueOf(iNextIndex);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                iIntValue = ((Number) objRememberedValue).intValue();
                Boolean boolValueOf2 = Boolean.valueOf(z);
                String str10 = (String) r32.getValue();
                Integer numValueOf3 = Integer.valueOf(c(mutableState24));
                Integer numValueOf4 = Integer.valueOf(d(mutableState25));
                Integer numValueOf5 = Integer.valueOf(iIntValue);
                Boolean boolValueOf3 = Boolean.valueOf(e(mutableState28));
                Object[] objArr10 = new Object[7];
                objArr10[0] = boolValueOf2;
                objArr10[1] = str10;
                objArr10[c] = numValueOf3;
                objArr10[3] = numValueOf4;
                objArr10[4] = numValueOf5;
                objArr10[5] = list4;
                objArr10[6] = boolValueOf3;
                if (i5 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zChanged2 = z6 | composer3.changed(mutableState28) | composer3.changed(mutableState25) | composer3.changedInstance(list4) | composer3.changed(iIntValue) | composer3.changed(mutableState24) | composer3.changed(r32) | composer3.changed(scrollStateRememberScrollState) | composer3.changed(mutableState26) | composer3.changed(mutableState27) | composer3.changedInstance(map) | composer3.changedInstance(zq0Var);
                objRememberedValue2 = composer3.rememberedValue();
                if (zChanged2) {
                    mutableState2 = mutableState24;
                } else {
                    mutableState2 = mutableState24;
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        map2 = map;
                        i7 = iIntValue;
                        mutableState5 = mutableState2;
                        mutableState3 = mutableState25;
                        mutableState4 = mutableState28;
                        scrollState = scrollStateRememberScrollState;
                        composer4 = composer3;
                        list5 = list;
                    }
                    EffectsKt.LaunchedEffect(objArr10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, 0);
                    Object[] objArr11 = {Boolean.valueOf(z), Integer.valueOf(d(mutableState3)), Integer.valueOf(i7), list8, map2, Boolean.valueOf(e(mutableState4))};
                    i8 = i5;
                    if (i8 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChanged3 = z7 | composer4.changed(mutableState4) | composer4.changed(mutableState3) | composer4.changedInstance(list5) | composer4.changed(i7) | composer4.changedInstance(list8) | composer4.changedInstance(map2) | composer4.changed(mutableState26) | composer4.changed(mutableState27) | composer4.changedInstance(zq0Var);
                    objRememberedValue3 = composer4.rememberedValue();
                    if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        MutableState mutableState29 = mutableState5;
                        Map map5 = map2;
                        zq0Var3 = zq0Var;
                        mutableState6 = mutableState29;
                        i9 = 4;
                        MutableState mutableState30 = mutableState26;
                        objRememberedValue3 = new o80(z, list5, i7, list8, mutableState4, mutableState3, map5, mutableState30, mutableState27, zq0Var3, (Continuation) null);
                        mutableState7 = mutableState30;
                        map3 = map5;
                        composer4.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState6 = mutableState5;
                        zq0Var3 = zq0Var;
                        i9 = 4;
                        map3 = map2;
                        mutableState7 = mutableState26;
                    }
                    EffectsKt.LaunchedEffect(objArr11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer4, 0);
                    Integer numValueOf6 = Integer.valueOf(list5.size());
                    zChanged4 = composer4.changed(mutableState3) | composer4.changedInstance(list5);
                    objRememberedValue4 = composer4.rememberedValue();
                    if (!zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        i10 = 0;
                        continuation = null;
                        objRememberedValue4 = new fp0(list5, mutableState3, null, 0);
                        composer4.updateRememberedValue(objRememberedValue4);
                    } else {
                        i10 = 0;
                        continuation = null;
                    }
                    EffectsKt.LaunchedEffect(numValueOf6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, i10);
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    Boolean boolValueOf5 = Boolean.valueOf(z2);
                    Integer numValueOf7 = Integer.valueOf(iIntValue5);
                    if (i8 == i9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i11 = i6;
                    if (i11 == 67108864) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zChanged5 = z8 | z9 | composer4.changed(mutableState3) | composer4.changed(iIntValue5);
                    objRememberedValue5 = composer4.rememberedValue();
                    if (!zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        MutableState mutableState31 = mutableState3;
                        mg1 mg1Var = new mg1(iIntValue5, mutableState31, null, z, z2);
                        mutableState8 = mutableState31;
                        composer4.updateRememberedValue(mg1Var);
                        objRememberedValue5 = mg1Var;
                    } else {
                        mutableState8 = mutableState3;
                    }
                    MutableState mutableState32 = mutableState8;
                    composer5 = composer4;
                    EffectsKt.LaunchedEffect(boolValueOf4, boolValueOf5, numValueOf7, (Function2) objRememberedValue5, composer5, i8 | ((i36 >> 21) & Input.Keys.FORWARD_DEL));
                    objRememberedValue6 = composer5.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        scrollState2 = scrollState;
                        objRememberedValue6 = SnapshotStateKt.derivedStateOf(new v6(scrollState2, 2));
                        composer5.updateRememberedValue(objRememberedValue6);
                    } else {
                        scrollState2 = scrollState;
                    }
                    state = (State) objRememberedValue6;
                    Boolean bool = (Boolean) state.getValue();
                    bool.getClass();
                    i12 = i9;
                    i13 = i40 & Input.Keys.FORWARD_DEL;
                    map4 = map3;
                    if (i13 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objRememberedValue7 = composer5.rememberedValue();
                    if (z10 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new gq(function7, state, continuation, 6);
                        composer5.updateRememberedValue(objRememberedValue7);
                    }
                    EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer5, 0);
                    Integer numValueOf8 = Integer.valueOf(i);
                    if ((i40 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zChanged26 = z11 | composer5.changed(scrollState2);
                    if (i13 == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z22 = zChanged26 | z12;
                    i14 = i40 & 896;
                    if (i14 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z23 = z22 | z13;
                    if ((i40 & 57344) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z23 | z14;
                    objRememberedValue8 = composer5.rememberedValue();
                    if (!z15 || objRememberedValue8 == companion.getEmpty()) {
                        ScrollState scrollState4 = scrollState2;
                        c2 = 2;
                        Composer composer12 = composer5;
                        iq iqVar = new iq(i, scrollState4, function7, function8, function9, null);
                        scrollState2 = scrollState4;
                        composer12.updateRememberedValue(iqVar);
                        objRememberedValue8 = iqVar;
                        composer6 = composer12;
                    } else {
                        c2 = 2;
                        composer6 = composer5;
                    }
                    EffectsKt.LaunchedEffect(numValueOf8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer6, (r5 >> 9) & 14);
                    zChanged6 = composer6.changed(list5) | composer6.changed(list3);
                    objRememberedValue9 = composer6.rememberedValue();
                    if (zChanged6 || objRememberedValue9 == companion.getEmpty()) {
                        it = list5.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            library2 = (Library) next;
                            it2 = list3.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (!Intrinsics.areEqual(((rx0) next2).getLibrary().getId(), library2.getId()));
                            rx0Var2 = (rx0) next2;
                            if (rx0Var2 == null) {
                                break;
                            }
                        } while (rx0Var2.getItems().isEmpty());
                        library = (Library) next;
                        if (library != null) {
                            name = library.getName();
                        } else {
                            name = null;
                        }
                        composer6.updateRememberedValue(name);
                        objRememberedValue9 = name;
                    }
                    str4 = (String) objRememberedValue9;
                    zChanged7 = composer6.changed(list5) | composer6.changed(list2) | composer6.changed(str4);
                    objRememberedValue10 = composer6.rememberedValue();
                    if (zChanged7 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        if (!list5.isEmpty()) {
                            str4 = "我的媒体";
                        } else if (!list2.isEmpty()) {
                            str4 = "继续观看";
                        }
                        composer6.updateRememberedValue(str4);
                        objRememberedValue10 = str4;
                    }
                    str5 = (String) objRememberedValue10;
                    zChanged8 = composer6.changed(str5);
                    objRememberedValue11 = composer6.rememberedValue();
                    if (zChanged8 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        if (Intrinsics.areEqual(str5, "我的媒体")) {
                            x82Var = x82.a;
                        } else {
                            x82Var = x82.b;
                        }
                        objRememberedValue11 = x82Var;
                        composer6.updateRememberedValue(objRememberedValue11);
                    }
                    x82Var2 = (x82) objRememberedValue11;
                    objRememberedValue12 = composer6.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue12 == companion2.getEmpty()) {
                        objRememberedValue12 = new LinkedHashSet();
                        composer6.updateRememberedValue(objRememberedValue12);
                    }
                    set = (Set) objRememberedValue12;
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    String str11 = (String) r32.getValue();
                    Integer numValueOf9 = Integer.valueOf(d(mutableState32));
                    Integer numValueOf10 = Integer.valueOf(iIntValue2);
                    Object[] objArr12 = new Object[7];
                    objArr12[0] = boolValueOf6;
                    objArr12[1] = str11;
                    objArr12[c2] = list5;
                    objArr12[3] = list2;
                    objArr12[i12] = list3;
                    objArr12[5] = numValueOf9;
                    objArr12[6] = numValueOf10;
                    if (i8 == i12) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    mutableState9 = mutableState32;
                    zChanged9 = z16 | composer6.changed(mutableState20) | composer6.changedInstance(list5) | composer6.changed(mutableState9) | composer6.changedInstance(list3) | composer6.changedInstance(zq0Var3) | composer6.changed(iIntValue2) | composer6.changedInstance(set) | composer6.changedInstance(context);
                    Object objRememberedValue48 = composer6.rememberedValue();
                    if (!zChanged9 || objRememberedValue48 == companion2.getEmpty()) {
                        list6 = list5;
                        str6 = str5;
                        c6Var = new c6(z, list6, mutableState20, mutableState9, list3, zq0Var, iIntValue2, set, context, null);
                        mutableState9 = mutableState9;
                        i15 = iIntValue2;
                        composer6.updateRememberedValue(c6Var);
                    } else {
                        str6 = str5;
                        i15 = iIntValue2;
                        list6 = list5;
                        c6Var = objRememberedValue48;
                    }
                    EffectsKt.LaunchedEffect(objArr12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c6Var, composer6, 0);
                    Boolean boolValueOf7 = Boolean.valueOf(e(mutableState4));
                    Integer numValueOf11 = Integer.valueOf(((Number) mutableState7.getValue()).intValue());
                    Integer numValueOf12 = Integer.valueOf(((Number) mutableState27.getValue()).intValue());
                    Object[] objArr13 = new Object[5];
                    objArr13[0] = boolValueOf7;
                    objArr13[1] = numValueOf11;
                    objArr13[c2] = numValueOf12;
                    i16 = 3;
                    objArr13[3] = list3;
                    objArr13[4] = list6;
                    mutableState10 = mutableState4;
                    zChanged10 = composer6.changed(mutableState10) | composer6.changed(mutableState7) | composer6.changed(mutableState27) | composer6.changedInstance(list6) | composer6.changedInstance(map4) | composer6.changed(mutableState9);
                    objRememberedValue13 = composer6.rememberedValue();
                    if (!zChanged10 || objRememberedValue13 == companion2.getEmpty()) {
                        ap0 ap0Var = new ap0(list6, mutableState10, mutableState7, mutableState27, map4, mutableState9, null);
                        mutableState11 = mutableState10;
                        composer6.updateRememberedValue(ap0Var);
                        objRememberedValue13 = ap0Var;
                    } else {
                        mutableState11 = mutableState10;
                    }
                    EffectsKt.LaunchedEffect(objArr13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composer6, 0);
                    scrollState3 = scrollState2;
                    zChanged11 = composer6.changed(scrollState3) | composer6.changed(mutableState23);
                    objRememberedValue14 = composer6.rememberedValue();
                    if (!zChanged11 || objRememberedValue14 == companion2.getEmpty()) {
                        continuation2 = null;
                        objRememberedValue14 = new n2(scrollState3, mutableState23, continuation2, i16);
                        composer6.updateRememberedValue(objRememberedValue14);
                    } else {
                        continuation2 = null;
                    }
                    EffectsKt.LaunchedEffect(scrollState3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composer6, 0);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, continuation2);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                    int iB = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    constructor = companion8.getConstructor();
                    if (!id.n(composer6.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer6);
                    mr.z(companion8, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl, Integer.valueOf(iB), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer6.startMovableGroup(-820140454, Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                    objRememberedValue15 = composer6.rememberedValue();
                    if (objRememberedValue15 == companion2.getEmpty()) {
                        objRememberedValue15 = new vi0(15);
                        composer6.updateRememberedValue(objRememberedValue15);
                    }
                    Function1 function11 = (Function1) objRememberedValue15;
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion6, Dp.m7813constructorimpl(0.0f));
                    objRememberedValue16 = composer6.rememberedValue();
                    if (objRememberedValue16 == companion2.getEmpty()) {
                        objRememberedValue16 = new vi0(16);
                        composer6.updateRememberedValue(objRememberedValue16);
                    }
                    Composer composer13 = composer6;
                    AndroidView_androidKt.AndroidView(function11, modifierM1064size3ABfNKs, (Function1) objRememberedValue16, composer13, 438, 0);
                    composer7 = composer13;
                    composer7.endMovableGroup();
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                    str7 = str6;
                    boolean zChanged27 = composer7.changed(r3) | composer7.changed(str7) | composer7.changedInstance(coroutineScope) | composer7.changed(scrollState3);
                    if (i14 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zChanged12 = zChanged27 | z17 | composer7.changed(x82Var2.ordinal());
                    Object objRememberedValue49 = composer7.rememberedValue();
                    if (!zChanged12 || objRememberedValue49 == companion2.getEmpty()) {
                        mutableState12 = r3;
                        c3 = 7;
                        bp0Var = new bp0(str7, coroutineScope, mutableState12, scrollState3, function8, x82Var2);
                        composer7.updateRememberedValue(bp0Var);
                    } else {
                        mutableState12 = mutableState20;
                        bp0Var = objRememberedValue49;
                        c3 = 7;
                    }
                    Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(ScrollKt.verticalScroll$default(KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default2, (Function1) bp0Var), scrollState3, false, null, false, 14, null), 0.0f, Dp.m7813constructorimpl(80.0f), 0.0f, Dp.m7813constructorimpl(28.0f), 5, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f)), companion7.getStart(), composer7, 54);
                    int iB2 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer7, modifierM1003paddingqDBjuR0$default);
                    constructor2 = companion8.getConstructor();
                    if (!id.n(composer7.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor2);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer7);
                    mr.z(companion8, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl2, Integer.valueOf(iB2), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (list.isEmpty()) {
                        f = fM7813constructorimpl;
                        i17 = i38;
                        mutableState13 = mutableState6;
                        i18 = 0;
                        composer7.startReplaceGroup(-1309622742);
                        composer7.endReplaceGroup();
                        composer8 = composer7;
                    } else {
                        composer7.startReplaceGroup(-1310464578);
                        mutableState13 = mutableState6;
                        zChanged16 = composer7.changed(mutableState12) | composer7.changed(mutableState13);
                        objRememberedValue26 = composer7.rememberedValue();
                        if (zChanged16 || objRememberedValue26 == companion2.getEmpty()) {
                            objRememberedValue26 = new ai(6, mutableState12, mutableState13);
                            composer7.updateRememberedValue(objRememberedValue26);
                        }
                        Function1 function12 = (Function1) objRememberedValue26;
                        i17 = i38;
                        if ((i17 & 14) == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objRememberedValue27 = composer7.rememberedValue();
                        if (z18 || objRememberedValue27 == companion2.getEmpty()) {
                            objRememberedValue27 = new co0(function1, 0);
                            composer7.updateRememberedValue(objRememberedValue27);
                        }
                        Function2 function13 = (Function2) objRememberedValue27;
                        if (i13 == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean zChangedInstance5 = composer7.changedInstance(zq0Var) | z19;
                        if ((i17 & 3670016) == 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        z21 = zChangedInstance5 | z20;
                        objRememberedValue28 = composer7.rememberedValue();
                        if (!z21 || objRememberedValue28 == companion2.getEmpty()) {
                            i32 = 0;
                            objRememberedValue28 = new Function0() { // from class: do0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i45 = i32;
                                    Function0 function14 = function0;
                                    zq0 zq0Var4 = zq0Var;
                                    Function1 function15 = function7;
                                    switch (i45) {
                                        case 0:
                                            function15.invoke(Boolean.TRUE);
                                            zq0Var4.h();
                                            function14.invoke();
                                            break;
                                        case 1:
                                            function15.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function14.invoke();
                                            break;
                                        default:
                                            function15.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function14.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer7.updateRememberedValue(objRememberedValue28);
                        } else {
                            i32 = 0;
                        }
                        int i45 = i36 >> 9;
                        i18 = i32;
                        f = fM7813constructorimpl;
                        R(z, list7, str, str3, z2, function12, function13, f, (Function0) objRememberedValue28, composer7, (i45 & 458752) | ((r15 >> 3) & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 100663302 | (i45 & 57344));
                        Composer composer14 = composer7;
                        composer14.endReplaceGroup();
                        composer8 = composer14;
                    }
                    list2.size();
                    if (list2.isEmpty()) {
                        i19 = i13;
                        composer8.startReplaceGroup(-1308097015);
                        composer8.endReplaceGroup();
                        composer9 = composer8;
                    } else {
                        composer8.startReplaceGroup(-1309440772);
                        zChanged15 = composer8.changed(mutableState12) | composer8.changed(mutableState13);
                        objRememberedValue22 = composer8.rememberedValue();
                        if (zChanged15 || objRememberedValue22 == companion2.getEmpty()) {
                            objRememberedValue22 = new ai(c3, mutableState12, mutableState13);
                            composer8.updateRememberedValue(objRememberedValue22);
                        }
                        Function1 function14 = (Function1) objRememberedValue22;
                        if (function6 == null) {
                            composer8.startReplaceGroup(-1308759857);
                            if ((i17 & 7168) == 2048) {
                                i31 = 1;
                            } else {
                                i31 = i18;
                            }
                            objRememberedValue25 = composer8.rememberedValue();
                            if (i31 == 0 || objRememberedValue25 == companion2.getEmpty()) {
                                objRememberedValue25 = new i2(function4, 8);
                                composer8.updateRememberedValue(objRememberedValue25);
                            }
                            composer8.endReplaceGroup();
                            function10 = (Function3) objRememberedValue25;
                        } else {
                            composer8.startReplaceGroup(-1150597368);
                            composer8.endReplaceGroup();
                            function10 = function6;
                        }
                        zChangedInstance3 = composer8.changedInstance(zq0Var);
                        objRememberedValue23 = composer8.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue23 == companion2.getEmpty()) {
                            objRememberedValue23 = new yn0(zq0Var, 1);
                            composer8.updateRememberedValue(objRememberedValue23);
                        }
                        Function1 function15 = (Function1) objRememberedValue23;
                        if (i13 == 32) {
                            i28 = 1;
                        } else {
                            i28 = i18;
                        }
                        int i46 = (composer8.changedInstance(zq0Var) ? 1 : 0) | i28;
                        if ((i17 & 3670016) == 1048576) {
                            i29 = 1;
                        } else {
                            i29 = i18;
                        }
                        i30 = i46 | i29;
                        objRememberedValue24 = composer8.rememberedValue();
                        if (i30 == 0 || objRememberedValue24 == companion2.getEmpty()) {
                            final int i47 = 1;
                            objRememberedValue24 = new Function0() { // from class: do0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i48 = i47;
                                    Function0 function16 = function0;
                                    zq0 zq0Var4 = zq0Var;
                                    Function1 function17 = function7;
                                    switch (i48) {
                                        case 0:
                                            function17.invoke(Boolean.TRUE);
                                            zq0Var4.h();
                                            function16.invoke();
                                            break;
                                        case 1:
                                            function17.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function16.invoke();
                                            break;
                                        default:
                                            function17.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function16.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer8.updateRememberedValue(objRememberedValue24);
                        }
                        int i48 = r15 >> 3;
                        i19 = i13;
                        Composer composer15 = composer8;
                        float f2 = f;
                        W(z, list2, str, num, str2, str3, function14, z2, z3, function10, function15, f2, iIntValue3, (Function0) objRememberedValue24, composer15, (i48 & 3670016) | (i48 & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 6 | (r15 & 896) | (i48 & 57344) | (i48 & 458752) | i11 | (r15 & 1879048192), RendererCapabilities.DECODER_SUPPORT_MASK);
                        f = f2;
                        Composer composer16 = composer15;
                        composer16.endReplaceGroup();
                        composer9 = composer16;
                    }
                    composer9.startReplaceGroup(-1150568274);
                    i20 = 0;
                    composer10 = composer9;
                    for (Object obj2 : list8) {
                        int i49 = i20 + 1;
                        if (i20 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        library3 = (Library) obj2;
                        it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                        } while (!Intrinsics.areEqual(((rx0) next3).getLibrary().getId(), library3.getId()));
                        rx0Var3 = (rx0) next3;
                        if (rx0Var3 != null) {
                            composer10.startReplaceGroup(-1966840846);
                            if (rx0Var3.getItems().isEmpty()) {
                                mutableState16 = mutableState12;
                                mutableState17 = mutableState13;
                                i22 = i19;
                                composer10.startReplaceGroup(-1965146200);
                                composer10.endReplaceGroup();
                                library3.getName();
                                composer10 = composer10;
                            } else {
                                composer10.startReplaceGroup(-1966757828);
                                String id2 = rx0Var3.getLibrary().getId();
                                String name3 = rx0Var3.getLibrary().getName();
                                List items = rx0Var3.getItems();
                                mutableState18 = mutableState12;
                                mutableState19 = mutableState13;
                                zChanged14 = composer10.changed(mutableState18) | composer10.changed(mutableState19) | composer10.changed(i20);
                                objRememberedValue19 = composer10.rememberedValue();
                                if (!zChanged14 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                    i24 = 0;
                                    objRememberedValue19 = new Function1() { // from class: eo0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            int i50 = i24;
                                            MutableState mutableState33 = mutableState19;
                                            MutableState mutableState34 = mutableState18;
                                            int i51 = i20;
                                            String str12 = (String) obj3;
                                            switch (i50) {
                                                case 0:
                                                    str12.getClass();
                                                    mutableState34.setValue(str12);
                                                    mutableState33.setValue(Integer.valueOf(i51));
                                                    break;
                                                default:
                                                    str12.getClass();
                                                    mutableState34.setValue(str12);
                                                    mutableState33.setValue(Integer.valueOf(i51));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer10.updateRememberedValue(objRememberedValue19);
                                } else {
                                    i24 = 0;
                                }
                                Function1 function16 = (Function1) objRememberedValue19;
                                i25 = i19;
                                if (i25 == 32) {
                                    i26 = 1;
                                } else {
                                    i26 = i24;
                                }
                                int i50 = i26 | (composer10.changedInstance(zq0Var) ? 1 : 0);
                                if ((i17 & 3670016) == 1048576) {
                                    c4 = 1;
                                } else {
                                    c4 = 0;
                                }
                                i27 = (i50 == true ? 1 : 0) | c4;
                                objRememberedValue20 = composer10.rememberedValue();
                                if (i27 == 0 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                    final int i51 = 2;
                                    objRememberedValue20 = new Function0() { // from class: do0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i410 = i51;
                                            Function0 function17 = function0;
                                            zq0 zq0Var4 = zq0Var;
                                            Function1 function18 = function7;
                                            switch (i410) {
                                                case 0:
                                                    function18.invoke(Boolean.TRUE);
                                                    zq0Var4.h();
                                                    function17.invoke();
                                                    break;
                                                case 1:
                                                    function18.invoke(Boolean.FALSE);
                                                    zq0Var4.h();
                                                    function17.invoke();
                                                    break;
                                                default:
                                                    function18.invoke(Boolean.FALSE);
                                                    zq0Var4.h();
                                                    function17.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer10.updateRememberedValue(objRememberedValue20);
                                }
                                Function0 function17 = (Function0) objRememberedValue20;
                                boolean hasMore = rx0Var3.getHasMore();
                                boolean isLoadingMore = rx0Var3.getIsLoadingMore();
                                zChangedInstance2 = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                                objRememberedValue21 = composer10.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                    final int i52 = 0;
                                    objRememberedValue21 = new Function0() { // from class: fo0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i53 = i52;
                                            Library library5 = library3;
                                            switch (i53) {
                                                case 0:
                                                    String id3 = library5.getId();
                                                    id3.getClass();
                                                    zq0 zq0Var4 = zq0Var;
                                                    if (zq0Var4.H) {
                                                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id3, null), 2, null);
                                                    }
                                                    break;
                                                default:
                                                    zq0Var.F(library5.getId());
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer10.updateRememberedValue(objRememberedValue21);
                                }
                                int i53 = r15 << 6;
                                int i54 = i17 >> 12;
                                Composer composer17 = composer10;
                                mutableState16 = mutableState18;
                                float f3 = f;
                                i22 = i25;
                                mutableState17 = mutableState19;
                                Q(id2, name3, z, items, z4, z5, str, str3, z2, function2, function3, function5, f3, i15, function16, function17, hasMore, isLoadingMore, (Function0) objRememberedValue21, composer17, (i53 & 3670016) | (i53 & 896) | (i54 & 57344) | (i54 & 458752) | i42 | i11 | ((i17 << 24) & 1879048192), ((i17 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i17 >> 9) & Input.Keys.FORWARD_DEL));
                                f = f3;
                                Composer composer18 = composer17;
                                composer18.endReplaceGroup();
                                composer10 = composer18;
                            }
                            composer10.endReplaceGroup();
                            mutableState14 = mutableState16;
                            mutableState15 = mutableState17;
                        } else {
                            i22 = i19;
                            composer10.startReplaceGroup(-1964959456);
                            float f4 = f;
                            String name4 = library3.getName();
                            mutableState14 = mutableState12;
                            mutableState15 = mutableState13;
                            zChanged13 = composer10.changed(mutableState14) | composer10.changed(mutableState15) | composer10.changed(i20);
                            objRememberedValue17 = composer10.rememberedValue();
                            if (!zChanged13 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                i23 = 1;
                                objRememberedValue17 = new Function1() { // from class: eo0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        int i55 = i23;
                                        MutableState mutableState33 = mutableState15;
                                        MutableState mutableState34 = mutableState14;
                                        int i56 = i20;
                                        String str12 = (String) obj3;
                                        switch (i55) {
                                            case 0:
                                                str12.getClass();
                                                mutableState34.setValue(str12);
                                                mutableState33.setValue(Integer.valueOf(i56));
                                                break;
                                            default:
                                                str12.getClass();
                                                mutableState34.setValue(str12);
                                                mutableState33.setValue(Integer.valueOf(i56));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue17);
                            } else {
                                i23 = 1;
                            }
                            Function1 function18 = (Function1) objRememberedValue17;
                            zChangedInstance = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                            objRememberedValue18 = composer10.rememberedValue();
                            if (zChangedInstance || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue18 = new Function0() { // from class: fo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i55 = i23;
                                        Library library5 = library3;
                                        switch (i55) {
                                            case 0:
                                                String id3 = library5.getId();
                                                id3.getClass();
                                                zq0 zq0Var4 = zq0Var;
                                                if (zq0Var4.H) {
                                                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id3, null), 2, null);
                                                }
                                                break;
                                            default:
                                                zq0Var.F(library5.getId());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue18);
                            }
                            P(name4, f4, false, function18, (Function0) objRememberedValue18, composer10, 432);
                            f = f4;
                            composer10.endReplaceGroup();
                        }
                        mutableState13 = mutableState15;
                        mutableState12 = mutableState14;
                        i20 = i49;
                        i19 = i22;
                        composer10 = composer10;
                    }
                    zq0Var2 = zq0Var;
                    composer10.endReplaceGroup();
                    if (e(mutableState11) || d(mutableState9) >= list.size()) {
                        i21 = 6;
                        composer10.startReplaceGroup(-1305008950);
                        composer10.endReplaceGroup();
                    } else {
                        composer10.startReplaceGroup(-1305127153);
                        i21 = 6;
                        N(f, composer10, 6);
                        composer10.endReplaceGroup();
                    }
                    itemCounts2 = itemCounts;
                    if (itemCounts2 != null || d(mutableState9) < list.size()) {
                        composer10.startReplaceGroup(-1304721270);
                        composer10.endReplaceGroup();
                    } else {
                        composer10.startReplaceGroup(-1304926924);
                        id.i(4.0f, Modifier.INSTANCE, composer10, i21);
                        X(itemCounts2, f, composer10, (i40 & 14) | 48);
                        composer10.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(1.0f)), composer10, i21);
                    composer10.endNode();
                    composer10.endNode();
                    composer2 = composer10;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        composer2 = composer10;
                    }
                }
                map2 = map;
                Composer composer19 = composer3;
                mutableState3 = mutableState25;
                mutableState4 = mutableState28;
                scrollState = scrollStateRememberScrollState;
                list5 = list;
                mutableState5 = mutableState2;
                objRememberedValue2 = new ep0(z, list5, iIntValue, scrollState, mutableState4, mutableState3, mutableState5, r32, mutableState26, mutableState27, map2, zq0Var, null);
                i7 = iIntValue;
                mutableState26 = mutableState26;
                mutableState27 = mutableState27;
                composer19.updateRememberedValue(objRememberedValue2);
                composer4 = composer19;
                EffectsKt.LaunchedEffect(objArr10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, 0);
                Object[] objArr14 = {Boolean.valueOf(z), Integer.valueOf(d(mutableState3)), Integer.valueOf(i7), list8, map2, Boolean.valueOf(e(mutableState4))};
                i8 = i5;
                if (i8 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChanged3 = z7 | composer4.changed(mutableState4) | composer4.changed(mutableState3) | composer4.changedInstance(list5) | composer4.changed(i7) | composer4.changedInstance(list8) | composer4.changedInstance(map2) | composer4.changed(mutableState26) | composer4.changed(mutableState27) | composer4.changedInstance(zq0Var);
                objRememberedValue3 = composer4.rememberedValue();
                if (zChanged3) {
                    MutableState mutableState210 = mutableState5;
                    Map map6 = map2;
                    zq0Var3 = zq0Var;
                    mutableState6 = mutableState210;
                    i9 = 4;
                    MutableState mutableState33 = mutableState26;
                    objRememberedValue3 = new o80(z, list5, i7, list8, mutableState4, mutableState3, map6, mutableState33, mutableState27, zq0Var3, (Continuation) null);
                    mutableState7 = mutableState33;
                    map3 = map6;
                    composer4.updateRememberedValue(objRememberedValue3);
                } else {
                    MutableState mutableState211 = mutableState5;
                    Map map7 = map2;
                    zq0Var3 = zq0Var;
                    mutableState6 = mutableState211;
                    i9 = 4;
                    MutableState mutableState34 = mutableState26;
                    objRememberedValue3 = new o80(z, list5, i7, list8, mutableState4, mutableState3, map7, mutableState34, mutableState27, zq0Var3, (Continuation) null);
                    mutableState7 = mutableState34;
                    map3 = map7;
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.LaunchedEffect(objArr14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer4, 0);
                Integer numValueOf13 = Integer.valueOf(list5.size());
                zChanged4 = composer4.changed(mutableState3) | composer4.changedInstance(list5);
                objRememberedValue4 = composer4.rememberedValue();
                if (zChanged4) {
                    i10 = 0;
                    continuation = null;
                    objRememberedValue4 = new fp0(list5, mutableState3, null, 0);
                    composer4.updateRememberedValue(objRememberedValue4);
                } else {
                    i10 = 0;
                    continuation = null;
                    objRememberedValue4 = new fp0(list5, mutableState3, null, 0);
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                EffectsKt.LaunchedEffect(numValueOf13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, i10);
                Boolean boolValueOf8 = Boolean.valueOf(z);
                Boolean boolValueOf9 = Boolean.valueOf(z2);
                Integer numValueOf14 = Integer.valueOf(iIntValue5);
                if (i8 == i9) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                i11 = i6;
                if (i11 == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zChanged5 = z8 | z9 | composer4.changed(mutableState3) | composer4.changed(iIntValue5);
                objRememberedValue5 = composer4.rememberedValue();
                if (zChanged5) {
                    MutableState mutableState35 = mutableState3;
                    mg1 mg1Var2 = new mg1(iIntValue5, mutableState35, null, z, z2);
                    mutableState8 = mutableState35;
                    composer4.updateRememberedValue(mg1Var2);
                    objRememberedValue5 = mg1Var2;
                } else {
                    MutableState mutableState36 = mutableState3;
                    mg1 mg1Var3 = new mg1(iIntValue5, mutableState36, null, z, z2);
                    mutableState8 = mutableState36;
                    composer4.updateRememberedValue(mg1Var3);
                    objRememberedValue5 = mg1Var3;
                }
                MutableState mutableState37 = mutableState8;
                composer5 = composer4;
                EffectsKt.LaunchedEffect(boolValueOf8, boolValueOf9, numValueOf14, (Function2) objRememberedValue5, composer5, i8 | ((i36 >> 21) & Input.Keys.FORWARD_DEL));
                objRememberedValue6 = composer5.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    scrollState2 = scrollState;
                    objRememberedValue6 = SnapshotStateKt.derivedStateOf(new v6(scrollState2, 2));
                    composer5.updateRememberedValue(objRememberedValue6);
                } else {
                    scrollState2 = scrollState;
                }
                state = (State) objRememberedValue6;
                Boolean bool2 = (Boolean) state.getValue();
                bool2.getClass();
                i12 = i9;
                i13 = i40 & Input.Keys.FORWARD_DEL;
                map4 = map3;
                if (i13 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objRememberedValue7 = composer5.rememberedValue();
                if (z10) {
                    objRememberedValue7 = new gq(function7, state, continuation, 6);
                    composer5.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new gq(function7, state, continuation, 6);
                    composer5.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.LaunchedEffect(bool2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer5, 0);
                Integer numValueOf15 = Integer.valueOf(i);
                if ((i40 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zChanged28 = z11 | composer5.changed(scrollState2);
                if (i13 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z24 = zChanged28 | z12;
                i14 = i40 & 896;
                if (i14 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z25 = z24 | z13;
                if ((i40 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z25 | z14;
                objRememberedValue8 = composer5.rememberedValue();
                if (z15) {
                    ScrollState scrollState5 = scrollState2;
                    c2 = 2;
                    Composer composer110 = composer5;
                    iq iqVar2 = new iq(i, scrollState5, function7, function8, function9, null);
                    scrollState2 = scrollState5;
                    composer110.updateRememberedValue(iqVar2);
                    objRememberedValue8 = iqVar2;
                    composer6 = composer110;
                } else {
                    ScrollState scrollState6 = scrollState2;
                    c2 = 2;
                    Composer composer111 = composer5;
                    iq iqVar3 = new iq(i, scrollState6, function7, function8, function9, null);
                    scrollState2 = scrollState6;
                    composer111.updateRememberedValue(iqVar3);
                    objRememberedValue8 = iqVar3;
                    composer6 = composer111;
                }
                EffectsKt.LaunchedEffect(numValueOf15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer6, (r5 >> 9) & 14);
                zChanged6 = composer6.changed(list5) | composer6.changed(list3);
                objRememberedValue9 = composer6.rememberedValue();
                if (zChanged6) {
                    it = list5.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        library2 = (Library) next;
                        it2 = list3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.areEqual(((rx0) next2).getLibrary().getId(), library2.getId()));
                        rx0Var2 = (rx0) next2;
                        if (rx0Var2 == null) {
                            break;
                            break;
                        }
                    } while (rx0Var2.getItems().isEmpty());
                    library = (Library) next;
                    if (library != null) {
                        name = library.getName();
                    } else {
                        name = null;
                    }
                    composer6.updateRememberedValue(name);
                    objRememberedValue9 = name;
                } else {
                    it = list5.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        library2 = (Library) next;
                        it2 = list3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.areEqual(((rx0) next2).getLibrary().getId(), library2.getId()));
                        rx0Var2 = (rx0) next2;
                        if (rx0Var2 == null) {
                            break;
                            break;
                        }
                    } while (rx0Var2.getItems().isEmpty());
                    library = (Library) next;
                    if (library != null) {
                        name = library.getName();
                    } else {
                        name = null;
                    }
                    composer6.updateRememberedValue(name);
                    objRememberedValue9 = name;
                }
                str4 = (String) objRememberedValue9;
                zChanged7 = composer6.changed(list5) | composer6.changed(list2) | composer6.changed(str4);
                objRememberedValue10 = composer6.rememberedValue();
                if (zChanged7) {
                    if (!list5.isEmpty()) {
                        str4 = "我的媒体";
                    } else if (!list2.isEmpty()) {
                        str4 = "继续观看";
                    }
                    composer6.updateRememberedValue(str4);
                    objRememberedValue10 = str4;
                } else {
                    if (!list5.isEmpty()) {
                        str4 = "我的媒体";
                    } else if (!list2.isEmpty()) {
                        str4 = "继续观看";
                    }
                    composer6.updateRememberedValue(str4);
                    objRememberedValue10 = str4;
                }
                str5 = (String) objRememberedValue10;
                zChanged8 = composer6.changed(str5);
                objRememberedValue11 = composer6.rememberedValue();
                if (zChanged8) {
                    if (Intrinsics.areEqual(str5, "我的媒体")) {
                        x82Var = x82.a;
                    } else {
                        x82Var = x82.b;
                    }
                    objRememberedValue11 = x82Var;
                    composer6.updateRememberedValue(objRememberedValue11);
                } else {
                    if (Intrinsics.areEqual(str5, "我的媒体")) {
                        x82Var = x82.a;
                    } else {
                        x82Var = x82.b;
                    }
                    objRememberedValue11 = x82Var;
                    composer6.updateRememberedValue(objRememberedValue11);
                }
                x82Var2 = (x82) objRememberedValue11;
                objRememberedValue12 = composer6.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue12 == companion2.getEmpty()) {
                    objRememberedValue12 = new LinkedHashSet();
                    composer6.updateRememberedValue(objRememberedValue12);
                }
                set = (Set) objRememberedValue12;
                Boolean boolValueOf10 = Boolean.valueOf(z);
                String str12 = (String) r32.getValue();
                Integer numValueOf16 = Integer.valueOf(d(mutableState37));
                Integer numValueOf17 = Integer.valueOf(iIntValue2);
                Object[] objArr15 = new Object[7];
                objArr15[0] = boolValueOf10;
                objArr15[1] = str12;
                objArr15[c2] = list5;
                objArr15[3] = list2;
                objArr15[i12] = list3;
                objArr15[5] = numValueOf16;
                objArr15[6] = numValueOf17;
                if (i8 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                mutableState9 = mutableState37;
                zChanged9 = z16 | composer6.changed(mutableState20) | composer6.changedInstance(list5) | composer6.changed(mutableState9) | composer6.changedInstance(list3) | composer6.changedInstance(zq0Var3) | composer6.changed(iIntValue2) | composer6.changedInstance(set) | composer6.changedInstance(context);
                Object objRememberedValue410 = composer6.rememberedValue();
                if (zChanged9) {
                    list6 = list5;
                    str6 = str5;
                    c6Var = new c6(z, list6, mutableState20, mutableState9, list3, zq0Var, iIntValue2, set, context, null);
                    mutableState9 = mutableState9;
                    i15 = iIntValue2;
                    composer6.updateRememberedValue(c6Var);
                } else {
                    list6 = list5;
                    str6 = str5;
                    c6Var = new c6(z, list6, mutableState20, mutableState9, list3, zq0Var, iIntValue2, set, context, null);
                    mutableState9 = mutableState9;
                    i15 = iIntValue2;
                    composer6.updateRememberedValue(c6Var);
                }
                EffectsKt.LaunchedEffect(objArr15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c6Var, composer6, 0);
                Boolean boolValueOf11 = Boolean.valueOf(e(mutableState4));
                Integer numValueOf18 = Integer.valueOf(((Number) mutableState7.getValue()).intValue());
                Integer numValueOf19 = Integer.valueOf(((Number) mutableState27.getValue()).intValue());
                Object[] objArr16 = new Object[5];
                objArr16[0] = boolValueOf11;
                objArr16[1] = numValueOf18;
                objArr16[c2] = numValueOf19;
                i16 = 3;
                objArr16[3] = list3;
                objArr16[4] = list6;
                mutableState10 = mutableState4;
                zChanged10 = composer6.changed(mutableState10) | composer6.changed(mutableState7) | composer6.changed(mutableState27) | composer6.changedInstance(list6) | composer6.changedInstance(map4) | composer6.changed(mutableState9);
                objRememberedValue13 = composer6.rememberedValue();
                if (zChanged10) {
                    ap0 ap0Var2 = new ap0(list6, mutableState10, mutableState7, mutableState27, map4, mutableState9, null);
                    mutableState11 = mutableState10;
                    composer6.updateRememberedValue(ap0Var2);
                    objRememberedValue13 = ap0Var2;
                } else {
                    ap0 ap0Var3 = new ap0(list6, mutableState10, mutableState7, mutableState27, map4, mutableState9, null);
                    mutableState11 = mutableState10;
                    composer6.updateRememberedValue(ap0Var3);
                    objRememberedValue13 = ap0Var3;
                }
                EffectsKt.LaunchedEffect(objArr16, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composer6, 0);
                scrollState3 = scrollState2;
                zChanged11 = composer6.changed(scrollState3) | composer6.changed(mutableState23);
                objRememberedValue14 = composer6.rememberedValue();
                if (zChanged11) {
                    continuation2 = null;
                    objRememberedValue14 = new n2(scrollState3, mutableState23, continuation2, i16);
                    composer6.updateRememberedValue(objRememberedValue14);
                } else {
                    continuation2 = null;
                    objRememberedValue14 = new n2(scrollState3, mutableState23, continuation2, i16);
                    composer6.updateRememberedValue(objRememberedValue14);
                }
                EffectsKt.LaunchedEffect(scrollState3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composer6, 0);
                Modifier.Companion companion9 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion9, 0.0f, 1, continuation2);
                Alignment.Companion companion10 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion10.getTopStart(), false);
                int iB3 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxSize$default3);
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                constructor = companion11.getConstructor();
                if (!id.n(composer6.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer6.startReusableNode();
                if (composer6.getInserting()) {
                    composer6.createNode(constructor);
                } else {
                    composer6.useNode();
                }
                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer6);
                mr.z(companion11, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl3, Integer.valueOf(iB3), composerM4318constructorimpl3));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer6.startMovableGroup(-820140454, Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                objRememberedValue15 = composer6.rememberedValue();
                if (objRememberedValue15 == companion2.getEmpty()) {
                    objRememberedValue15 = new vi0(15);
                    composer6.updateRememberedValue(objRememberedValue15);
                }
                Function1 function19 = (Function1) objRememberedValue15;
                Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion9, Dp.m7813constructorimpl(0.0f));
                objRememberedValue16 = composer6.rememberedValue();
                if (objRememberedValue16 == companion2.getEmpty()) {
                    objRememberedValue16 = new vi0(16);
                    composer6.updateRememberedValue(objRememberedValue16);
                }
                Composer composer112 = composer6;
                AndroidView_androidKt.AndroidView(function19, modifierM1064size3ABfNKs2, (Function1) objRememberedValue16, composer112, 438, 0);
                composer7 = composer112;
                composer7.endMovableGroup();
                Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion9, 0.0f, 1, null);
                str7 = str6;
                boolean zChanged29 = composer7.changed(r3) | composer7.changed(str7) | composer7.changedInstance(coroutineScope) | composer7.changed(scrollState3);
                if (i14 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zChanged12 = zChanged29 | z17 | composer7.changed(x82Var2.ordinal());
                Object objRememberedValue411 = composer7.rememberedValue();
                if (zChanged12) {
                    mutableState12 = r3;
                    c3 = 7;
                    bp0Var = new bp0(str7, coroutineScope, mutableState12, scrollState3, function8, x82Var2);
                    composer7.updateRememberedValue(bp0Var);
                } else {
                    mutableState12 = r3;
                    c3 = 7;
                    bp0Var = new bp0(str7, coroutineScope, mutableState12, scrollState3, function8, x82Var2);
                    composer7.updateRememberedValue(bp0Var);
                }
                Modifier modifierM1003paddingqDBjuR0$default2 = PaddingKt.m1003paddingqDBjuR0$default(ScrollKt.verticalScroll$default(KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default4, (Function1) bp0Var), scrollState3, false, null, false, 14, null), 0.0f, Dp.m7813constructorimpl(80.0f), 0.0f, Dp.m7813constructorimpl(28.0f), 5, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f)), companion10.getStart(), composer7, 54);
                int iB4 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer7, modifierM1003paddingqDBjuR0$default2);
                constructor2 = companion11.getConstructor();
                if (!id.n(composer7.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer7.startReusableNode();
                if (composer7.getInserting()) {
                    composer7.createNode(constructor2);
                } else {
                    composer7.useNode();
                }
                Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer7);
                mr.z(companion11, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl4, Integer.valueOf(iB4), composerM4318constructorimpl4));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (list.isEmpty()) {
                    composer7.startReplaceGroup(-1310464578);
                    mutableState13 = mutableState6;
                    zChanged16 = composer7.changed(mutableState12) | composer7.changed(mutableState13);
                    objRememberedValue26 = composer7.rememberedValue();
                    if (zChanged16) {
                        objRememberedValue26 = new ai(6, mutableState12, mutableState13);
                        composer7.updateRememberedValue(objRememberedValue26);
                    } else {
                        objRememberedValue26 = new ai(6, mutableState12, mutableState13);
                        composer7.updateRememberedValue(objRememberedValue26);
                    }
                    Function1 function110 = (Function1) objRememberedValue26;
                    i17 = i38;
                    if ((i17 & 14) == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objRememberedValue27 = composer7.rememberedValue();
                    if (z18) {
                        objRememberedValue27 = new co0(function1, 0);
                        composer7.updateRememberedValue(objRememberedValue27);
                    } else {
                        objRememberedValue27 = new co0(function1, 0);
                        composer7.updateRememberedValue(objRememberedValue27);
                    }
                    Function2 function111 = (Function2) objRememberedValue27;
                    if (i13 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zChangedInstance6 = composer7.changedInstance(zq0Var) | z19;
                    if ((i17 & 3670016) == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zChangedInstance6 | z20;
                    objRememberedValue28 = composer7.rememberedValue();
                    if (z21) {
                        i32 = 0;
                        objRememberedValue28 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i410 = i32;
                                Function0 function112 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function113 = function7;
                                switch (i410) {
                                    case 0:
                                        function113.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function112.invoke();
                                        break;
                                    case 1:
                                        function113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function112.invoke();
                                        break;
                                    default:
                                        function113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function112.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer7.updateRememberedValue(objRememberedValue28);
                    } else {
                        i32 = 0;
                        objRememberedValue28 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i410 = i32;
                                Function0 function112 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function113 = function7;
                                switch (i410) {
                                    case 0:
                                        function113.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function112.invoke();
                                        break;
                                    case 1:
                                        function113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function112.invoke();
                                        break;
                                    default:
                                        function113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function112.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer7.updateRememberedValue(objRememberedValue28);
                    }
                    int i410 = i36 >> 9;
                    i18 = i32;
                    f = fM7813constructorimpl;
                    R(z, list7, str, str3, z2, function110, function111, f, (Function0) objRememberedValue28, composer7, (i410 & 458752) | ((r15 >> 3) & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 100663302 | (i410 & 57344));
                    Composer composer113 = composer7;
                    composer113.endReplaceGroup();
                    composer8 = composer113;
                } else {
                    f = fM7813constructorimpl;
                    i17 = i38;
                    mutableState13 = mutableState6;
                    i18 = 0;
                    composer7.startReplaceGroup(-1309622742);
                    composer7.endReplaceGroup();
                    composer8 = composer7;
                }
                list2.size();
                if (list2.isEmpty()) {
                    composer8.startReplaceGroup(-1309440772);
                    zChanged15 = composer8.changed(mutableState12) | composer8.changed(mutableState13);
                    objRememberedValue22 = composer8.rememberedValue();
                    if (zChanged15) {
                        objRememberedValue22 = new ai(c3, mutableState12, mutableState13);
                        composer8.updateRememberedValue(objRememberedValue22);
                    } else {
                        objRememberedValue22 = new ai(c3, mutableState12, mutableState13);
                        composer8.updateRememberedValue(objRememberedValue22);
                    }
                    Function1 function112 = (Function1) objRememberedValue22;
                    if (function6 == null) {
                        composer8.startReplaceGroup(-1308759857);
                        if ((i17 & 7168) == 2048) {
                            i31 = 1;
                        } else {
                            i31 = i18;
                        }
                        objRememberedValue25 = composer8.rememberedValue();
                        if (i31 == 0) {
                            objRememberedValue25 = new i2(function4, 8);
                            composer8.updateRememberedValue(objRememberedValue25);
                        } else {
                            objRememberedValue25 = new i2(function4, 8);
                            composer8.updateRememberedValue(objRememberedValue25);
                        }
                        composer8.endReplaceGroup();
                        function10 = (Function3) objRememberedValue25;
                    } else {
                        composer8.startReplaceGroup(-1150597368);
                        composer8.endReplaceGroup();
                        function10 = function6;
                    }
                    zChangedInstance3 = composer8.changedInstance(zq0Var);
                    objRememberedValue23 = composer8.rememberedValue();
                    if (zChangedInstance3) {
                        objRememberedValue23 = new yn0(zq0Var, 1);
                        composer8.updateRememberedValue(objRememberedValue23);
                    } else {
                        objRememberedValue23 = new yn0(zq0Var, 1);
                        composer8.updateRememberedValue(objRememberedValue23);
                    }
                    Function1 function113 = (Function1) objRememberedValue23;
                    if (i13 == 32) {
                        i28 = 1;
                    } else {
                        i28 = i18;
                    }
                    int i411 = (composer8.changedInstance(zq0Var) ? 1 : 0) | i28;
                    if ((i17 & 3670016) == 1048576) {
                        i29 = 1;
                    } else {
                        i29 = i18;
                    }
                    i30 = i411 | i29;
                    objRememberedValue24 = composer8.rememberedValue();
                    if (i30 == 0) {
                        final int i412 = 1;
                        objRememberedValue24 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i413 = i412;
                                Function0 function114 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function115 = function7;
                                switch (i413) {
                                    case 0:
                                        function115.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function114.invoke();
                                        break;
                                    case 1:
                                        function115.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function114.invoke();
                                        break;
                                    default:
                                        function115.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function114.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer8.updateRememberedValue(objRememberedValue24);
                    } else {
                        final int i413 = 1;
                        objRememberedValue24 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i414 = i413;
                                Function0 function114 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function115 = function7;
                                switch (i414) {
                                    case 0:
                                        function115.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function114.invoke();
                                        break;
                                    case 1:
                                        function115.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function114.invoke();
                                        break;
                                    default:
                                        function115.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function114.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer8.updateRememberedValue(objRememberedValue24);
                    }
                    int i414 = r15 >> 3;
                    i19 = i13;
                    Composer composer114 = composer8;
                    float f5 = f;
                    W(z, list2, str, num, str2, str3, function112, z2, z3, function10, function113, f5, iIntValue3, (Function0) objRememberedValue24, composer114, (i414 & 3670016) | (i414 & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 6 | (r15 & 896) | (i414 & 57344) | (i414 & 458752) | i11 | (r15 & 1879048192), RendererCapabilities.DECODER_SUPPORT_MASK);
                    f = f5;
                    Composer composer115 = composer114;
                    composer115.endReplaceGroup();
                    composer9 = composer115;
                } else {
                    i19 = i13;
                    composer8.startReplaceGroup(-1308097015);
                    composer8.endReplaceGroup();
                    composer9 = composer8;
                }
                composer9.startReplaceGroup(-1150568274);
                i20 = 0;
                composer10 = composer9;
                while (r25.hasNext()) {
                    int i415 = i20 + 1;
                    if (i20 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    library3 = (Library) obj2;
                    it3 = list3.iterator();
                    do {
                        if (it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!Intrinsics.areEqual(((rx0) next3).getLibrary().getId(), library3.getId()));
                    rx0Var3 = (rx0) next3;
                    if (rx0Var3 != null) {
                        composer10.startReplaceGroup(-1966840846);
                        if (rx0Var3.getItems().isEmpty()) {
                            composer10.startReplaceGroup(-1966757828);
                            String id3 = rx0Var3.getLibrary().getId();
                            String name5 = rx0Var3.getLibrary().getName();
                            List items2 = rx0Var3.getItems();
                            mutableState18 = mutableState12;
                            mutableState19 = mutableState13;
                            zChanged14 = composer10.changed(mutableState18) | composer10.changed(mutableState19) | composer10.changed(i20);
                            objRememberedValue19 = composer10.rememberedValue();
                            if (zChanged14) {
                                i24 = 0;
                                objRememberedValue19 = new Function1() { // from class: eo0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        int i55 = i24;
                                        MutableState mutableState38 = mutableState19;
                                        MutableState mutableState39 = mutableState18;
                                        int i56 = i20;
                                        String str13 = (String) obj3;
                                        switch (i55) {
                                            case 0:
                                                str13.getClass();
                                                mutableState39.setValue(str13);
                                                mutableState38.setValue(Integer.valueOf(i56));
                                                break;
                                            default:
                                                str13.getClass();
                                                mutableState39.setValue(str13);
                                                mutableState38.setValue(Integer.valueOf(i56));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue19);
                            } else {
                                i24 = 0;
                                objRememberedValue19 = new Function1() { // from class: eo0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        int i55 = i24;
                                        MutableState mutableState38 = mutableState19;
                                        MutableState mutableState39 = mutableState18;
                                        int i56 = i20;
                                        String str13 = (String) obj3;
                                        switch (i55) {
                                            case 0:
                                                str13.getClass();
                                                mutableState39.setValue(str13);
                                                mutableState38.setValue(Integer.valueOf(i56));
                                                break;
                                            default:
                                                str13.getClass();
                                                mutableState39.setValue(str13);
                                                mutableState38.setValue(Integer.valueOf(i56));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue19);
                            }
                            Function1 function114 = (Function1) objRememberedValue19;
                            i25 = i19;
                            if (i25 == 32) {
                                i26 = 1;
                            } else {
                                i26 = i24;
                            }
                            int i55 = i26 | (composer10.changedInstance(zq0Var) ? 1 : 0);
                            if ((i17 & 3670016) == 1048576) {
                                c4 = 1;
                            } else {
                                c4 = 0;
                            }
                            i27 = (i55 == true ? 1 : 0) | c4;
                            objRememberedValue20 = composer10.rememberedValue();
                            if (i27 == 0) {
                                final int i56 = 2;
                                objRememberedValue20 = new Function0() { // from class: do0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i416 = i56;
                                        Function0 function115 = function0;
                                        zq0 zq0Var4 = zq0Var;
                                        Function1 function116 = function7;
                                        switch (i416) {
                                            case 0:
                                                function116.invoke(Boolean.TRUE);
                                                zq0Var4.h();
                                                function115.invoke();
                                                break;
                                            case 1:
                                                function116.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function115.invoke();
                                                break;
                                            default:
                                                function116.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function115.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue20);
                            } else {
                                final int i57 = 2;
                                objRememberedValue20 = new Function0() { // from class: do0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i416 = i57;
                                        Function0 function115 = function0;
                                        zq0 zq0Var4 = zq0Var;
                                        Function1 function116 = function7;
                                        switch (i416) {
                                            case 0:
                                                function116.invoke(Boolean.TRUE);
                                                zq0Var4.h();
                                                function115.invoke();
                                                break;
                                            case 1:
                                                function116.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function115.invoke();
                                                break;
                                            default:
                                                function116.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function115.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue20);
                            }
                            Function0 function115 = (Function0) objRememberedValue20;
                            boolean hasMore2 = rx0Var3.getHasMore();
                            boolean isLoadingMore2 = rx0Var3.getIsLoadingMore();
                            zChangedInstance2 = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                            objRememberedValue21 = composer10.rememberedValue();
                            if (zChangedInstance2) {
                                final int i58 = 0;
                                objRememberedValue21 = new Function0() { // from class: fo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i59 = i58;
                                        Library library5 = library3;
                                        switch (i59) {
                                            case 0:
                                                String id4 = library5.getId();
                                                id4.getClass();
                                                zq0 zq0Var4 = zq0Var;
                                                if (zq0Var4.H) {
                                                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id4, null), 2, null);
                                                }
                                                break;
                                            default:
                                                zq0Var.F(library5.getId());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue21);
                            } else {
                                final int i59 = 0;
                                objRememberedValue21 = new Function0() { // from class: fo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i510 = i59;
                                        Library library5 = library3;
                                        switch (i510) {
                                            case 0:
                                                String id4 = library5.getId();
                                                id4.getClass();
                                                zq0 zq0Var4 = zq0Var;
                                                if (zq0Var4.H) {
                                                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id4, null), 2, null);
                                                }
                                                break;
                                            default:
                                                zq0Var.F(library5.getId());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue21);
                            }
                            int i510 = r15 << 6;
                            int i511 = i17 >> 12;
                            Composer composer116 = composer10;
                            mutableState16 = mutableState18;
                            float f6 = f;
                            i22 = i25;
                            mutableState17 = mutableState19;
                            Q(id3, name5, z, items2, z4, z5, str, str3, z2, function2, function3, function5, f6, i15, function114, function115, hasMore2, isLoadingMore2, (Function0) objRememberedValue21, composer116, (i510 & 3670016) | (i510 & 896) | (i511 & 57344) | (i511 & 458752) | i42 | i11 | ((i17 << 24) & 1879048192), ((i17 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i17 >> 9) & Input.Keys.FORWARD_DEL));
                            f = f6;
                            Composer composer117 = composer116;
                            composer117.endReplaceGroup();
                            composer10 = composer117;
                        } else {
                            mutableState16 = mutableState12;
                            mutableState17 = mutableState13;
                            i22 = i19;
                            composer10.startReplaceGroup(-1965146200);
                            composer10.endReplaceGroup();
                            library3.getName();
                            composer10 = composer10;
                        }
                        composer10.endReplaceGroup();
                        mutableState14 = mutableState16;
                        mutableState15 = mutableState17;
                    } else {
                        i22 = i19;
                        composer10.startReplaceGroup(-1964959456);
                        float f7 = f;
                        String name6 = library3.getName();
                        mutableState14 = mutableState12;
                        mutableState15 = mutableState13;
                        zChanged13 = composer10.changed(mutableState14) | composer10.changed(mutableState15) | composer10.changed(i20);
                        objRememberedValue17 = composer10.rememberedValue();
                        if (zChanged13) {
                            i23 = 1;
                            objRememberedValue17 = new Function1() { // from class: eo0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i512 = i23;
                                    MutableState mutableState38 = mutableState15;
                                    MutableState mutableState39 = mutableState14;
                                    int i513 = i20;
                                    String str13 = (String) obj3;
                                    switch (i512) {
                                        case 0:
                                            str13.getClass();
                                            mutableState39.setValue(str13);
                                            mutableState38.setValue(Integer.valueOf(i513));
                                            break;
                                        default:
                                            str13.getClass();
                                            mutableState39.setValue(str13);
                                            mutableState38.setValue(Integer.valueOf(i513));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue17);
                        } else {
                            i23 = 1;
                            objRememberedValue17 = new Function1() { // from class: eo0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i512 = i23;
                                    MutableState mutableState38 = mutableState15;
                                    MutableState mutableState39 = mutableState14;
                                    int i513 = i20;
                                    String str13 = (String) obj3;
                                    switch (i512) {
                                        case 0:
                                            str13.getClass();
                                            mutableState39.setValue(str13);
                                            mutableState38.setValue(Integer.valueOf(i513));
                                            break;
                                        default:
                                            str13.getClass();
                                            mutableState39.setValue(str13);
                                            mutableState38.setValue(Integer.valueOf(i513));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue17);
                        }
                        Function1 function116 = (Function1) objRememberedValue17;
                        zChangedInstance = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                        objRememberedValue18 = composer10.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue18 = new Function0() { // from class: fo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i512 = i23;
                                    Library library5 = library3;
                                    switch (i512) {
                                        case 0:
                                            String id4 = library5.getId();
                                            id4.getClass();
                                            zq0 zq0Var4 = zq0Var;
                                            if (zq0Var4.H) {
                                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id4, null), 2, null);
                                            }
                                            break;
                                        default:
                                            zq0Var.F(library5.getId());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue18);
                        } else {
                            objRememberedValue18 = new Function0() { // from class: fo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i512 = i23;
                                    Library library5 = library3;
                                    switch (i512) {
                                        case 0:
                                            String id4 = library5.getId();
                                            id4.getClass();
                                            zq0 zq0Var4 = zq0Var;
                                            if (zq0Var4.H) {
                                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id4, null), 2, null);
                                            }
                                            break;
                                        default:
                                            zq0Var.F(library5.getId());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue18);
                        }
                        P(name6, f7, false, function116, (Function0) objRememberedValue18, composer10, 432);
                        f = f7;
                        composer10.endReplaceGroup();
                    }
                    mutableState13 = mutableState15;
                    mutableState12 = mutableState14;
                    i20 = i415;
                    i19 = i22;
                    composer10 = composer10;
                }
                zq0Var2 = zq0Var;
                composer10.endReplaceGroup();
                if (e(mutableState11)) {
                    i21 = 6;
                    composer10.startReplaceGroup(-1305008950);
                    composer10.endReplaceGroup();
                } else {
                    i21 = 6;
                    composer10.startReplaceGroup(-1305008950);
                    composer10.endReplaceGroup();
                }
                itemCounts2 = itemCounts;
                if (itemCounts2 != null) {
                    composer10.startReplaceGroup(-1304721270);
                    composer10.endReplaceGroup();
                } else {
                    composer10.startReplaceGroup(-1304721270);
                    composer10.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(1.0f)), composer10, i21);
                composer10.endNode();
                composer10.endNode();
                composer2 = composer10;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    composer2 = composer10;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10)), 16));
            Iterator it7 = list3.iterator();
            while (it7.hasNext()) {
                Iterator it8 = it7;
                Object next4 = it8.next();
                linkedHashMap.put(((rx0) next4).getLibrary().getId(), next4);
                it7 = it8;
            }
            composer3.updateRememberedValue(linkedHashMap);
            objRememberedValue47 = linkedHashMap;
            map = (Map) objRememberedValue47;
            zChanged = composer3.changed(list8) | composer3.changed(map);
            objRememberedValue = composer3.rememberedValue();
            if (zChanged) {
                listIterator = list8.listIterator(list8.size());
                while (listIterator.hasPrevious()) {
                    rx0Var = (rx0) map.get(((Library) listIterator.previous()).getId());
                    if (rx0Var != null) {
                    }
                    iNextIndex = listIterator.nextIndex();
                }
                objRememberedValue = Integer.valueOf(iNextIndex);
                composer3.updateRememberedValue(objRememberedValue);
            } else {
                listIterator = list8.listIterator(list8.size());
                while (listIterator.hasPrevious()) {
                    rx0Var = (rx0) map.get(((Library) listIterator.previous()).getId());
                    if (rx0Var != null) {
                    }
                    iNextIndex = listIterator.nextIndex();
                }
                objRememberedValue = Integer.valueOf(iNextIndex);
                composer3.updateRememberedValue(objRememberedValue);
            }
            iIntValue = ((Number) objRememberedValue).intValue();
            Boolean boolValueOf12 = Boolean.valueOf(z);
            String str13 = (String) r32.getValue();
            Integer numValueOf20 = Integer.valueOf(c(mutableState24));
            Integer numValueOf21 = Integer.valueOf(d(mutableState25));
            Integer numValueOf22 = Integer.valueOf(iIntValue);
            Boolean boolValueOf13 = Boolean.valueOf(e(mutableState28));
            Object[] objArr17 = new Object[7];
            objArr17[0] = boolValueOf12;
            objArr17[1] = str13;
            objArr17[c] = numValueOf20;
            objArr17[3] = numValueOf21;
            objArr17[4] = numValueOf22;
            objArr17[5] = list4;
            objArr17[6] = boolValueOf13;
            if (i5 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            zChanged2 = z6 | composer3.changed(mutableState28) | composer3.changed(mutableState25) | composer3.changedInstance(list4) | composer3.changed(iIntValue) | composer3.changed(mutableState24) | composer3.changed(r32) | composer3.changed(scrollStateRememberScrollState) | composer3.changed(mutableState26) | composer3.changed(mutableState27) | composer3.changedInstance(map) | composer3.changedInstance(zq0Var);
            objRememberedValue2 = composer3.rememberedValue();
            if (zChanged2) {
                mutableState2 = mutableState24;
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    map2 = map;
                    i7 = iIntValue;
                    mutableState5 = mutableState2;
                    mutableState3 = mutableState25;
                    mutableState4 = mutableState28;
                    scrollState = scrollStateRememberScrollState;
                    composer4 = composer3;
                    list5 = list;
                }
                EffectsKt.LaunchedEffect(objArr17, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, 0);
                Object[] objArr18 = {Boolean.valueOf(z), Integer.valueOf(d(mutableState3)), Integer.valueOf(i7), list8, map2, Boolean.valueOf(e(mutableState4))};
                i8 = i5;
                if (i8 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChanged3 = z7 | composer4.changed(mutableState4) | composer4.changed(mutableState3) | composer4.changedInstance(list5) | composer4.changed(i7) | composer4.changedInstance(list8) | composer4.changedInstance(map2) | composer4.changed(mutableState26) | composer4.changed(mutableState27) | composer4.changedInstance(zq0Var);
                objRememberedValue3 = composer4.rememberedValue();
                if (zChanged3) {
                    MutableState mutableState212 = mutableState5;
                    Map map8 = map2;
                    zq0Var3 = zq0Var;
                    mutableState6 = mutableState212;
                    i9 = 4;
                    MutableState mutableState38 = mutableState26;
                    objRememberedValue3 = new o80(z, list5, i7, list8, mutableState4, mutableState3, map8, mutableState38, mutableState27, zq0Var3, (Continuation) null);
                    mutableState7 = mutableState38;
                    map3 = map8;
                    composer4.updateRememberedValue(objRememberedValue3);
                } else {
                    MutableState mutableState213 = mutableState5;
                    Map map9 = map2;
                    zq0Var3 = zq0Var;
                    mutableState6 = mutableState213;
                    i9 = 4;
                    MutableState mutableState39 = mutableState26;
                    objRememberedValue3 = new o80(z, list5, i7, list8, mutableState4, mutableState3, map9, mutableState39, mutableState27, zq0Var3, (Continuation) null);
                    mutableState7 = mutableState39;
                    map3 = map9;
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.LaunchedEffect(objArr18, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer4, 0);
                Integer numValueOf110 = Integer.valueOf(list5.size());
                zChanged4 = composer4.changed(mutableState3) | composer4.changedInstance(list5);
                objRememberedValue4 = composer4.rememberedValue();
                if (zChanged4) {
                    i10 = 0;
                    continuation = null;
                    objRememberedValue4 = new fp0(list5, mutableState3, null, 0);
                    composer4.updateRememberedValue(objRememberedValue4);
                } else {
                    i10 = 0;
                    continuation = null;
                    objRememberedValue4 = new fp0(list5, mutableState3, null, 0);
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                EffectsKt.LaunchedEffect(numValueOf110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, i10);
                Boolean boolValueOf14 = Boolean.valueOf(z);
                Boolean boolValueOf15 = Boolean.valueOf(z2);
                Integer numValueOf111 = Integer.valueOf(iIntValue5);
                if (i8 == i9) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                i11 = i6;
                if (i11 == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zChanged5 = z8 | z9 | composer4.changed(mutableState3) | composer4.changed(iIntValue5);
                objRememberedValue5 = composer4.rememberedValue();
                if (zChanged5) {
                    MutableState mutableState310 = mutableState3;
                    mg1 mg1Var4 = new mg1(iIntValue5, mutableState310, null, z, z2);
                    mutableState8 = mutableState310;
                    composer4.updateRememberedValue(mg1Var4);
                    objRememberedValue5 = mg1Var4;
                } else {
                    MutableState mutableState311 = mutableState3;
                    mg1 mg1Var5 = new mg1(iIntValue5, mutableState311, null, z, z2);
                    mutableState8 = mutableState311;
                    composer4.updateRememberedValue(mg1Var5);
                    objRememberedValue5 = mg1Var5;
                }
                MutableState mutableState312 = mutableState8;
                composer5 = composer4;
                EffectsKt.LaunchedEffect(boolValueOf14, boolValueOf15, numValueOf111, (Function2) objRememberedValue5, composer5, i8 | ((i36 >> 21) & Input.Keys.FORWARD_DEL));
                objRememberedValue6 = composer5.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    scrollState2 = scrollState;
                    objRememberedValue6 = SnapshotStateKt.derivedStateOf(new v6(scrollState2, 2));
                    composer5.updateRememberedValue(objRememberedValue6);
                } else {
                    scrollState2 = scrollState;
                }
                state = (State) objRememberedValue6;
                Boolean bool3 = (Boolean) state.getValue();
                bool3.getClass();
                i12 = i9;
                i13 = i40 & Input.Keys.FORWARD_DEL;
                map4 = map3;
                if (i13 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objRememberedValue7 = composer5.rememberedValue();
                if (z10) {
                    objRememberedValue7 = new gq(function7, state, continuation, 6);
                    composer5.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new gq(function7, state, continuation, 6);
                    composer5.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.LaunchedEffect(bool3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer5, 0);
                Integer numValueOf112 = Integer.valueOf(i);
                if ((i40 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zChanged210 = z11 | composer5.changed(scrollState2);
                if (i13 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z26 = zChanged210 | z12;
                i14 = i40 & 896;
                if (i14 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z27 = z26 | z13;
                if ((i40 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z27 | z14;
                objRememberedValue8 = composer5.rememberedValue();
                if (z15) {
                    ScrollState scrollState7 = scrollState2;
                    c2 = 2;
                    Composer composer118 = composer5;
                    iq iqVar4 = new iq(i, scrollState7, function7, function8, function9, null);
                    scrollState2 = scrollState7;
                    composer118.updateRememberedValue(iqVar4);
                    objRememberedValue8 = iqVar4;
                    composer6 = composer118;
                } else {
                    ScrollState scrollState8 = scrollState2;
                    c2 = 2;
                    Composer composer119 = composer5;
                    iq iqVar5 = new iq(i, scrollState8, function7, function8, function9, null);
                    scrollState2 = scrollState8;
                    composer119.updateRememberedValue(iqVar5);
                    objRememberedValue8 = iqVar5;
                    composer6 = composer119;
                }
                EffectsKt.LaunchedEffect(numValueOf112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer6, (r5 >> 9) & 14);
                zChanged6 = composer6.changed(list5) | composer6.changed(list3);
                objRememberedValue9 = composer6.rememberedValue();
                if (zChanged6) {
                    it = list5.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        library2 = (Library) next;
                        it2 = list3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.areEqual(((rx0) next2).getLibrary().getId(), library2.getId()));
                        rx0Var2 = (rx0) next2;
                        if (rx0Var2 == null) {
                            break;
                            break;
                        }
                    } while (rx0Var2.getItems().isEmpty());
                    library = (Library) next;
                    if (library != null) {
                        name = library.getName();
                    } else {
                        name = null;
                    }
                    composer6.updateRememberedValue(name);
                    objRememberedValue9 = name;
                } else {
                    it = list5.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        library2 = (Library) next;
                        it2 = list3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.areEqual(((rx0) next2).getLibrary().getId(), library2.getId()));
                        rx0Var2 = (rx0) next2;
                        if (rx0Var2 == null) {
                            break;
                            break;
                        }
                    } while (rx0Var2.getItems().isEmpty());
                    library = (Library) next;
                    if (library != null) {
                        name = library.getName();
                    } else {
                        name = null;
                    }
                    composer6.updateRememberedValue(name);
                    objRememberedValue9 = name;
                }
                str4 = (String) objRememberedValue9;
                zChanged7 = composer6.changed(list5) | composer6.changed(list2) | composer6.changed(str4);
                objRememberedValue10 = composer6.rememberedValue();
                if (zChanged7) {
                    if (!list5.isEmpty()) {
                        str4 = "我的媒体";
                    } else if (!list2.isEmpty()) {
                        str4 = "继续观看";
                    }
                    composer6.updateRememberedValue(str4);
                    objRememberedValue10 = str4;
                } else {
                    if (!list5.isEmpty()) {
                        str4 = "我的媒体";
                    } else if (!list2.isEmpty()) {
                        str4 = "继续观看";
                    }
                    composer6.updateRememberedValue(str4);
                    objRememberedValue10 = str4;
                }
                str5 = (String) objRememberedValue10;
                zChanged8 = composer6.changed(str5);
                objRememberedValue11 = composer6.rememberedValue();
                if (zChanged8) {
                    if (Intrinsics.areEqual(str5, "我的媒体")) {
                        x82Var = x82.a;
                    } else {
                        x82Var = x82.b;
                    }
                    objRememberedValue11 = x82Var;
                    composer6.updateRememberedValue(objRememberedValue11);
                } else {
                    if (Intrinsics.areEqual(str5, "我的媒体")) {
                        x82Var = x82.a;
                    } else {
                        x82Var = x82.b;
                    }
                    objRememberedValue11 = x82Var;
                    composer6.updateRememberedValue(objRememberedValue11);
                }
                x82Var2 = (x82) objRememberedValue11;
                objRememberedValue12 = composer6.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue12 == companion2.getEmpty()) {
                    objRememberedValue12 = new LinkedHashSet();
                    composer6.updateRememberedValue(objRememberedValue12);
                }
                set = (Set) objRememberedValue12;
                Boolean boolValueOf16 = Boolean.valueOf(z);
                String str14 = (String) r32.getValue();
                Integer numValueOf113 = Integer.valueOf(d(mutableState312));
                Integer numValueOf114 = Integer.valueOf(iIntValue2);
                Object[] objArr19 = new Object[7];
                objArr19[0] = boolValueOf16;
                objArr19[1] = str14;
                objArr19[c2] = list5;
                objArr19[3] = list2;
                objArr19[i12] = list3;
                objArr19[5] = numValueOf113;
                objArr19[6] = numValueOf114;
                if (i8 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                mutableState9 = mutableState312;
                zChanged9 = z16 | composer6.changed(mutableState20) | composer6.changedInstance(list5) | composer6.changed(mutableState9) | composer6.changedInstance(list3) | composer6.changedInstance(zq0Var3) | composer6.changed(iIntValue2) | composer6.changedInstance(set) | composer6.changedInstance(context);
                Object objRememberedValue412 = composer6.rememberedValue();
                if (zChanged9) {
                    list6 = list5;
                    str6 = str5;
                    c6Var = new c6(z, list6, mutableState20, mutableState9, list3, zq0Var, iIntValue2, set, context, null);
                    mutableState9 = mutableState9;
                    i15 = iIntValue2;
                    composer6.updateRememberedValue(c6Var);
                } else {
                    list6 = list5;
                    str6 = str5;
                    c6Var = new c6(z, list6, mutableState20, mutableState9, list3, zq0Var, iIntValue2, set, context, null);
                    mutableState9 = mutableState9;
                    i15 = iIntValue2;
                    composer6.updateRememberedValue(c6Var);
                }
                EffectsKt.LaunchedEffect(objArr19, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c6Var, composer6, 0);
                Boolean boolValueOf17 = Boolean.valueOf(e(mutableState4));
                Integer numValueOf115 = Integer.valueOf(((Number) mutableState7.getValue()).intValue());
                Integer numValueOf116 = Integer.valueOf(((Number) mutableState27.getValue()).intValue());
                Object[] objArr110 = new Object[5];
                objArr110[0] = boolValueOf17;
                objArr110[1] = numValueOf115;
                objArr110[c2] = numValueOf116;
                i16 = 3;
                objArr110[3] = list3;
                objArr110[4] = list6;
                mutableState10 = mutableState4;
                zChanged10 = composer6.changed(mutableState10) | composer6.changed(mutableState7) | composer6.changed(mutableState27) | composer6.changedInstance(list6) | composer6.changedInstance(map4) | composer6.changed(mutableState9);
                objRememberedValue13 = composer6.rememberedValue();
                if (zChanged10) {
                    ap0 ap0Var4 = new ap0(list6, mutableState10, mutableState7, mutableState27, map4, mutableState9, null);
                    mutableState11 = mutableState10;
                    composer6.updateRememberedValue(ap0Var4);
                    objRememberedValue13 = ap0Var4;
                } else {
                    ap0 ap0Var5 = new ap0(list6, mutableState10, mutableState7, mutableState27, map4, mutableState9, null);
                    mutableState11 = mutableState10;
                    composer6.updateRememberedValue(ap0Var5);
                    objRememberedValue13 = ap0Var5;
                }
                EffectsKt.LaunchedEffect(objArr110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composer6, 0);
                scrollState3 = scrollState2;
                zChanged11 = composer6.changed(scrollState3) | composer6.changed(mutableState23);
                objRememberedValue14 = composer6.rememberedValue();
                if (zChanged11) {
                    continuation2 = null;
                    objRememberedValue14 = new n2(scrollState3, mutableState23, continuation2, i16);
                    composer6.updateRememberedValue(objRememberedValue14);
                } else {
                    continuation2 = null;
                    objRememberedValue14 = new n2(scrollState3, mutableState23, continuation2, i16);
                    composer6.updateRememberedValue(objRememberedValue14);
                }
                EffectsKt.LaunchedEffect(scrollState3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composer6, 0);
                Modifier.Companion companion12 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(companion12, 0.0f, 1, continuation2);
                Alignment.Companion companion13 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion13.getTopStart(), false);
                int iB5 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxSize$default5);
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                if (!id.n(composer6.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer6.startReusableNode();
                if (composer6.getInserting()) {
                    composer6.createNode(constructor);
                } else {
                    composer6.useNode();
                }
                Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer6);
                mr.z(companion14, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl5, Integer.valueOf(iB5), composerM4318constructorimpl5));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composer6.startMovableGroup(-820140454, Integer.valueOf(((Number) mutableState.getValue()).intValue()));
                objRememberedValue15 = composer6.rememberedValue();
                if (objRememberedValue15 == companion2.getEmpty()) {
                    objRememberedValue15 = new vi0(15);
                    composer6.updateRememberedValue(objRememberedValue15);
                }
                Function1 function117 = (Function1) objRememberedValue15;
                Modifier modifierM1064size3ABfNKs3 = SizeKt.m1064size3ABfNKs(companion12, Dp.m7813constructorimpl(0.0f));
                objRememberedValue16 = composer6.rememberedValue();
                if (objRememberedValue16 == companion2.getEmpty()) {
                    objRememberedValue16 = new vi0(16);
                    composer6.updateRememberedValue(objRememberedValue16);
                }
                Composer composer1110 = composer6;
                AndroidView_androidKt.AndroidView(function117, modifierM1064size3ABfNKs3, (Function1) objRememberedValue16, composer1110, 438, 0);
                composer7 = composer1110;
                composer7.endMovableGroup();
                Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(companion12, 0.0f, 1, null);
                str7 = str6;
                boolean zChanged211 = composer7.changed(r3) | composer7.changed(str7) | composer7.changedInstance(coroutineScope) | composer7.changed(scrollState3);
                if (i14 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zChanged12 = zChanged211 | z17 | composer7.changed(x82Var2.ordinal());
                Object objRememberedValue413 = composer7.rememberedValue();
                if (zChanged12) {
                    mutableState12 = r3;
                    c3 = 7;
                    bp0Var = new bp0(str7, coroutineScope, mutableState12, scrollState3, function8, x82Var2);
                    composer7.updateRememberedValue(bp0Var);
                } else {
                    mutableState12 = r3;
                    c3 = 7;
                    bp0Var = new bp0(str7, coroutineScope, mutableState12, scrollState3, function8, x82Var2);
                    composer7.updateRememberedValue(bp0Var);
                }
                Modifier modifierM1003paddingqDBjuR0$default3 = PaddingKt.m1003paddingqDBjuR0$default(ScrollKt.verticalScroll$default(KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default6, (Function1) bp0Var), scrollState3, false, null, false, 14, null), 0.0f, Dp.m7813constructorimpl(80.0f), 0.0f, Dp.m7813constructorimpl(28.0f), 5, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f)), companion13.getStart(), composer7, 54);
                int iB6 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer7, modifierM1003paddingqDBjuR0$default3);
                constructor2 = companion14.getConstructor();
                if (!id.n(composer7.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer7.startReusableNode();
                if (composer7.getInserting()) {
                    composer7.createNode(constructor2);
                } else {
                    composer7.useNode();
                }
                Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer7);
                mr.z(companion14, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl6, Integer.valueOf(iB6), composerM4318constructorimpl6));
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                if (list.isEmpty()) {
                    composer7.startReplaceGroup(-1310464578);
                    mutableState13 = mutableState6;
                    zChanged16 = composer7.changed(mutableState12) | composer7.changed(mutableState13);
                    objRememberedValue26 = composer7.rememberedValue();
                    if (zChanged16) {
                        objRememberedValue26 = new ai(6, mutableState12, mutableState13);
                        composer7.updateRememberedValue(objRememberedValue26);
                    } else {
                        objRememberedValue26 = new ai(6, mutableState12, mutableState13);
                        composer7.updateRememberedValue(objRememberedValue26);
                    }
                    Function1 function118 = (Function1) objRememberedValue26;
                    i17 = i38;
                    if ((i17 & 14) == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objRememberedValue27 = composer7.rememberedValue();
                    if (z18) {
                        objRememberedValue27 = new co0(function1, 0);
                        composer7.updateRememberedValue(objRememberedValue27);
                    } else {
                        objRememberedValue27 = new co0(function1, 0);
                        composer7.updateRememberedValue(objRememberedValue27);
                    }
                    Function2 function119 = (Function2) objRememberedValue27;
                    if (i13 == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zChangedInstance7 = composer7.changedInstance(zq0Var) | z19;
                    if ((i17 & 3670016) == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zChangedInstance7 | z20;
                    objRememberedValue28 = composer7.rememberedValue();
                    if (z21) {
                        i32 = 0;
                        objRememberedValue28 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i416 = i32;
                                Function0 function1110 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function1111 = function7;
                                switch (i416) {
                                    case 0:
                                        function1111.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function1110.invoke();
                                        break;
                                    case 1:
                                        function1111.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1110.invoke();
                                        break;
                                    default:
                                        function1111.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1110.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer7.updateRememberedValue(objRememberedValue28);
                    } else {
                        i32 = 0;
                        objRememberedValue28 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i416 = i32;
                                Function0 function1110 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function1111 = function7;
                                switch (i416) {
                                    case 0:
                                        function1111.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function1110.invoke();
                                        break;
                                    case 1:
                                        function1111.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1110.invoke();
                                        break;
                                    default:
                                        function1111.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1110.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer7.updateRememberedValue(objRememberedValue28);
                    }
                    int i416 = i36 >> 9;
                    i18 = i32;
                    f = fM7813constructorimpl;
                    R(z, list7, str, str3, z2, function118, function119, f, (Function0) objRememberedValue28, composer7, (i416 & 458752) | ((r15 >> 3) & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 100663302 | (i416 & 57344));
                    Composer composer1111 = composer7;
                    composer1111.endReplaceGroup();
                    composer8 = composer1111;
                } else {
                    f = fM7813constructorimpl;
                    i17 = i38;
                    mutableState13 = mutableState6;
                    i18 = 0;
                    composer7.startReplaceGroup(-1309622742);
                    composer7.endReplaceGroup();
                    composer8 = composer7;
                }
                list2.size();
                if (list2.isEmpty()) {
                    composer8.startReplaceGroup(-1309440772);
                    zChanged15 = composer8.changed(mutableState12) | composer8.changed(mutableState13);
                    objRememberedValue22 = composer8.rememberedValue();
                    if (zChanged15) {
                        objRememberedValue22 = new ai(c3, mutableState12, mutableState13);
                        composer8.updateRememberedValue(objRememberedValue22);
                    } else {
                        objRememberedValue22 = new ai(c3, mutableState12, mutableState13);
                        composer8.updateRememberedValue(objRememberedValue22);
                    }
                    Function1 function1110 = (Function1) objRememberedValue22;
                    if (function6 == null) {
                        composer8.startReplaceGroup(-1308759857);
                        if ((i17 & 7168) == 2048) {
                            i31 = 1;
                        } else {
                            i31 = i18;
                        }
                        objRememberedValue25 = composer8.rememberedValue();
                        if (i31 == 0) {
                            objRememberedValue25 = new i2(function4, 8);
                            composer8.updateRememberedValue(objRememberedValue25);
                        } else {
                            objRememberedValue25 = new i2(function4, 8);
                            composer8.updateRememberedValue(objRememberedValue25);
                        }
                        composer8.endReplaceGroup();
                        function10 = (Function3) objRememberedValue25;
                    } else {
                        composer8.startReplaceGroup(-1150597368);
                        composer8.endReplaceGroup();
                        function10 = function6;
                    }
                    zChangedInstance3 = composer8.changedInstance(zq0Var);
                    objRememberedValue23 = composer8.rememberedValue();
                    if (zChangedInstance3) {
                        objRememberedValue23 = new yn0(zq0Var, 1);
                        composer8.updateRememberedValue(objRememberedValue23);
                    } else {
                        objRememberedValue23 = new yn0(zq0Var, 1);
                        composer8.updateRememberedValue(objRememberedValue23);
                    }
                    Function1 function1111 = (Function1) objRememberedValue23;
                    if (i13 == 32) {
                        i28 = 1;
                    } else {
                        i28 = i18;
                    }
                    int i417 = (composer8.changedInstance(zq0Var) ? 1 : 0) | i28;
                    if ((i17 & 3670016) == 1048576) {
                        i29 = 1;
                    } else {
                        i29 = i18;
                    }
                    i30 = i417 | i29;
                    objRememberedValue24 = composer8.rememberedValue();
                    if (i30 == 0) {
                        final int i418 = 1;
                        objRememberedValue24 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i419 = i418;
                                Function0 function1112 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function1113 = function7;
                                switch (i419) {
                                    case 0:
                                        function1113.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function1112.invoke();
                                        break;
                                    case 1:
                                        function1113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1112.invoke();
                                        break;
                                    default:
                                        function1113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1112.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer8.updateRememberedValue(objRememberedValue24);
                    } else {
                        final int i419 = 1;
                        objRememberedValue24 = new Function0() { // from class: do0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4110 = i419;
                                Function0 function1112 = function0;
                                zq0 zq0Var4 = zq0Var;
                                Function1 function1113 = function7;
                                switch (i4110) {
                                    case 0:
                                        function1113.invoke(Boolean.TRUE);
                                        zq0Var4.h();
                                        function1112.invoke();
                                        break;
                                    case 1:
                                        function1113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1112.invoke();
                                        break;
                                    default:
                                        function1113.invoke(Boolean.FALSE);
                                        zq0Var4.h();
                                        function1112.invoke();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer8.updateRememberedValue(objRememberedValue24);
                    }
                    int i4110 = r15 >> 3;
                    i19 = i13;
                    Composer composer1112 = composer8;
                    float f8 = f;
                    W(z, list2, str, num, str2, str3, function1110, z2, z3, function10, function1111, f8, iIntValue3, (Function0) objRememberedValue24, composer1112, (i4110 & 3670016) | (i4110 & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 6 | (r15 & 896) | (i4110 & 57344) | (i4110 & 458752) | i11 | (r15 & 1879048192), RendererCapabilities.DECODER_SUPPORT_MASK);
                    f = f8;
                    Composer composer1113 = composer1112;
                    composer1113.endReplaceGroup();
                    composer9 = composer1113;
                } else {
                    i19 = i13;
                    composer8.startReplaceGroup(-1308097015);
                    composer8.endReplaceGroup();
                    composer9 = composer8;
                }
                composer9.startReplaceGroup(-1150568274);
                i20 = 0;
                composer10 = composer9;
                while (r25.hasNext()) {
                    int i4111 = i20 + 1;
                    if (i20 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    library3 = (Library) obj2;
                    it3 = list3.iterator();
                    do {
                        if (it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!Intrinsics.areEqual(((rx0) next3).getLibrary().getId(), library3.getId()));
                    rx0Var3 = (rx0) next3;
                    if (rx0Var3 != null) {
                        composer10.startReplaceGroup(-1966840846);
                        if (rx0Var3.getItems().isEmpty()) {
                            composer10.startReplaceGroup(-1966757828);
                            String id4 = rx0Var3.getLibrary().getId();
                            String name7 = rx0Var3.getLibrary().getName();
                            List items3 = rx0Var3.getItems();
                            mutableState18 = mutableState12;
                            mutableState19 = mutableState13;
                            zChanged14 = composer10.changed(mutableState18) | composer10.changed(mutableState19) | composer10.changed(i20);
                            objRememberedValue19 = composer10.rememberedValue();
                            if (zChanged14) {
                                i24 = 0;
                                objRememberedValue19 = new Function1() { // from class: eo0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        int i512 = i24;
                                        MutableState mutableState313 = mutableState19;
                                        MutableState mutableState314 = mutableState18;
                                        int i513 = i20;
                                        String str15 = (String) obj3;
                                        switch (i512) {
                                            case 0:
                                                str15.getClass();
                                                mutableState314.setValue(str15);
                                                mutableState313.setValue(Integer.valueOf(i513));
                                                break;
                                            default:
                                                str15.getClass();
                                                mutableState314.setValue(str15);
                                                mutableState313.setValue(Integer.valueOf(i513));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue19);
                            } else {
                                i24 = 0;
                                objRememberedValue19 = new Function1() { // from class: eo0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        int i512 = i24;
                                        MutableState mutableState313 = mutableState19;
                                        MutableState mutableState314 = mutableState18;
                                        int i513 = i20;
                                        String str15 = (String) obj3;
                                        switch (i512) {
                                            case 0:
                                                str15.getClass();
                                                mutableState314.setValue(str15);
                                                mutableState313.setValue(Integer.valueOf(i513));
                                                break;
                                            default:
                                                str15.getClass();
                                                mutableState314.setValue(str15);
                                                mutableState313.setValue(Integer.valueOf(i513));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue19);
                            }
                            Function1 function1112 = (Function1) objRememberedValue19;
                            i25 = i19;
                            if (i25 == 32) {
                                i26 = 1;
                            } else {
                                i26 = i24;
                            }
                            int i512 = i26 | (composer10.changedInstance(zq0Var) ? 1 : 0);
                            if ((i17 & 3670016) == 1048576) {
                                c4 = 1;
                            } else {
                                c4 = 0;
                            }
                            i27 = (i512 == true ? 1 : 0) | c4;
                            objRememberedValue20 = composer10.rememberedValue();
                            if (i27 == 0) {
                                final int i513 = 2;
                                objRememberedValue20 = new Function0() { // from class: do0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i4112 = i513;
                                        Function0 function1113 = function0;
                                        zq0 zq0Var4 = zq0Var;
                                        Function1 function1114 = function7;
                                        switch (i4112) {
                                            case 0:
                                                function1114.invoke(Boolean.TRUE);
                                                zq0Var4.h();
                                                function1113.invoke();
                                                break;
                                            case 1:
                                                function1114.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function1113.invoke();
                                                break;
                                            default:
                                                function1114.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function1113.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue20);
                            } else {
                                final int i514 = 2;
                                objRememberedValue20 = new Function0() { // from class: do0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i4112 = i514;
                                        Function0 function1113 = function0;
                                        zq0 zq0Var4 = zq0Var;
                                        Function1 function1114 = function7;
                                        switch (i4112) {
                                            case 0:
                                                function1114.invoke(Boolean.TRUE);
                                                zq0Var4.h();
                                                function1113.invoke();
                                                break;
                                            case 1:
                                                function1114.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function1113.invoke();
                                                break;
                                            default:
                                                function1114.invoke(Boolean.FALSE);
                                                zq0Var4.h();
                                                function1113.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue20);
                            }
                            Function0 function1113 = (Function0) objRememberedValue20;
                            boolean hasMore3 = rx0Var3.getHasMore();
                            boolean isLoadingMore3 = rx0Var3.getIsLoadingMore();
                            zChangedInstance2 = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                            objRememberedValue21 = composer10.rememberedValue();
                            if (zChangedInstance2) {
                                final int i515 = 0;
                                objRememberedValue21 = new Function0() { // from class: fo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i516 = i515;
                                        Library library5 = library3;
                                        switch (i516) {
                                            case 0:
                                                String id5 = library5.getId();
                                                id5.getClass();
                                                zq0 zq0Var4 = zq0Var;
                                                if (zq0Var4.H) {
                                                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id5, null), 2, null);
                                                }
                                                break;
                                            default:
                                                zq0Var.F(library5.getId());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue21);
                            } else {
                                final int i516 = 0;
                                objRememberedValue21 = new Function0() { // from class: fo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i517 = i516;
                                        Library library5 = library3;
                                        switch (i517) {
                                            case 0:
                                                String id5 = library5.getId();
                                                id5.getClass();
                                                zq0 zq0Var4 = zq0Var;
                                                if (zq0Var4.H) {
                                                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id5, null), 2, null);
                                                }
                                                break;
                                            default:
                                                zq0Var.F(library5.getId());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer10.updateRememberedValue(objRememberedValue21);
                            }
                            int i517 = r15 << 6;
                            int i518 = i17 >> 12;
                            Composer composer1114 = composer10;
                            mutableState16 = mutableState18;
                            float f9 = f;
                            i22 = i25;
                            mutableState17 = mutableState19;
                            Q(id4, name7, z, items3, z4, z5, str, str3, z2, function2, function3, function5, f9, i15, function1112, function1113, hasMore3, isLoadingMore3, (Function0) objRememberedValue21, composer1114, (i517 & 3670016) | (i517 & 896) | (i518 & 57344) | (i518 & 458752) | i42 | i11 | ((i17 << 24) & 1879048192), ((i17 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i17 >> 9) & Input.Keys.FORWARD_DEL));
                            f = f9;
                            Composer composer1115 = composer1114;
                            composer1115.endReplaceGroup();
                            composer10 = composer1115;
                        } else {
                            mutableState16 = mutableState12;
                            mutableState17 = mutableState13;
                            i22 = i19;
                            composer10.startReplaceGroup(-1965146200);
                            composer10.endReplaceGroup();
                            library3.getName();
                            composer10 = composer10;
                        }
                        composer10.endReplaceGroup();
                        mutableState14 = mutableState16;
                        mutableState15 = mutableState17;
                    } else {
                        i22 = i19;
                        composer10.startReplaceGroup(-1964959456);
                        float f10 = f;
                        String name8 = library3.getName();
                        mutableState14 = mutableState12;
                        mutableState15 = mutableState13;
                        zChanged13 = composer10.changed(mutableState14) | composer10.changed(mutableState15) | composer10.changed(i20);
                        objRememberedValue17 = composer10.rememberedValue();
                        if (zChanged13) {
                            i23 = 1;
                            objRememberedValue17 = new Function1() { // from class: eo0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i519 = i23;
                                    MutableState mutableState313 = mutableState15;
                                    MutableState mutableState314 = mutableState14;
                                    int i5110 = i20;
                                    String str15 = (String) obj3;
                                    switch (i519) {
                                        case 0:
                                            str15.getClass();
                                            mutableState314.setValue(str15);
                                            mutableState313.setValue(Integer.valueOf(i5110));
                                            break;
                                        default:
                                            str15.getClass();
                                            mutableState314.setValue(str15);
                                            mutableState313.setValue(Integer.valueOf(i5110));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue17);
                        } else {
                            i23 = 1;
                            objRememberedValue17 = new Function1() { // from class: eo0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i519 = i23;
                                    MutableState mutableState313 = mutableState15;
                                    MutableState mutableState314 = mutableState14;
                                    int i5110 = i20;
                                    String str15 = (String) obj3;
                                    switch (i519) {
                                        case 0:
                                            str15.getClass();
                                            mutableState314.setValue(str15);
                                            mutableState313.setValue(Integer.valueOf(i5110));
                                            break;
                                        default:
                                            str15.getClass();
                                            mutableState314.setValue(str15);
                                            mutableState313.setValue(Integer.valueOf(i5110));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue17);
                        }
                        Function1 function1114 = (Function1) objRememberedValue17;
                        zChangedInstance = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                        objRememberedValue18 = composer10.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue18 = new Function0() { // from class: fo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i519 = i23;
                                    Library library5 = library3;
                                    switch (i519) {
                                        case 0:
                                            String id5 = library5.getId();
                                            id5.getClass();
                                            zq0 zq0Var4 = zq0Var;
                                            if (zq0Var4.H) {
                                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id5, null), 2, null);
                                            }
                                            break;
                                        default:
                                            zq0Var.F(library5.getId());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue18);
                        } else {
                            objRememberedValue18 = new Function0() { // from class: fo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i519 = i23;
                                    Library library5 = library3;
                                    switch (i519) {
                                        case 0:
                                            String id5 = library5.getId();
                                            id5.getClass();
                                            zq0 zq0Var4 = zq0Var;
                                            if (zq0Var4.H) {
                                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id5, null), 2, null);
                                            }
                                            break;
                                        default:
                                            zq0Var.F(library5.getId());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue18);
                        }
                        P(name8, f10, false, function1114, (Function0) objRememberedValue18, composer10, 432);
                        f = f10;
                        composer10.endReplaceGroup();
                    }
                    mutableState13 = mutableState15;
                    mutableState12 = mutableState14;
                    i20 = i4111;
                    i19 = i22;
                    composer10 = composer10;
                }
                zq0Var2 = zq0Var;
                composer10.endReplaceGroup();
                if (e(mutableState11)) {
                    i21 = 6;
                    composer10.startReplaceGroup(-1305008950);
                    composer10.endReplaceGroup();
                } else {
                    i21 = 6;
                    composer10.startReplaceGroup(-1305008950);
                    composer10.endReplaceGroup();
                }
                itemCounts2 = itemCounts;
                if (itemCounts2 != null) {
                    composer10.startReplaceGroup(-1304721270);
                    composer10.endReplaceGroup();
                } else {
                    composer10.startReplaceGroup(-1304721270);
                    composer10.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(1.0f)), composer10, i21);
                composer10.endNode();
                composer10.endNode();
                composer2 = composer10;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    composer2 = composer10;
                }
            } else {
                mutableState2 = mutableState24;
            }
            map2 = map;
            Composer composer120 = composer3;
            mutableState3 = mutableState25;
            mutableState4 = mutableState28;
            scrollState = scrollStateRememberScrollState;
            list5 = list;
            mutableState5 = mutableState2;
            objRememberedValue2 = new ep0(z, list5, iIntValue, scrollState, mutableState4, mutableState3, mutableState5, r32, mutableState26, mutableState27, map2, zq0Var, null);
            i7 = iIntValue;
            mutableState26 = mutableState26;
            mutableState27 = mutableState27;
            composer120.updateRememberedValue(objRememberedValue2);
            composer4 = composer120;
            EffectsKt.LaunchedEffect(objArr17, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, 0);
            Object[] objArr111 = {Boolean.valueOf(z), Integer.valueOf(d(mutableState3)), Integer.valueOf(i7), list8, map2, Boolean.valueOf(e(mutableState4))};
            i8 = i5;
            if (i8 == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            zChanged3 = z7 | composer4.changed(mutableState4) | composer4.changed(mutableState3) | composer4.changedInstance(list5) | composer4.changed(i7) | composer4.changedInstance(list8) | composer4.changedInstance(map2) | composer4.changed(mutableState26) | composer4.changed(mutableState27) | composer4.changedInstance(zq0Var);
            objRememberedValue3 = composer4.rememberedValue();
            if (zChanged3) {
                MutableState mutableState214 = mutableState5;
                Map map10 = map2;
                zq0Var3 = zq0Var;
                mutableState6 = mutableState214;
                i9 = 4;
                MutableState mutableState313 = mutableState26;
                objRememberedValue3 = new o80(z, list5, i7, list8, mutableState4, mutableState3, map10, mutableState313, mutableState27, zq0Var3, (Continuation) null);
                mutableState7 = mutableState313;
                map3 = map10;
                composer4.updateRememberedValue(objRememberedValue3);
            } else {
                MutableState mutableState215 = mutableState5;
                Map map11 = map2;
                zq0Var3 = zq0Var;
                mutableState6 = mutableState215;
                i9 = 4;
                MutableState mutableState314 = mutableState26;
                objRememberedValue3 = new o80(z, list5, i7, list8, mutableState4, mutableState3, map11, mutableState314, mutableState27, zq0Var3, (Continuation) null);
                mutableState7 = mutableState314;
                map3 = map11;
                composer4.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(objArr111, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer4, 0);
            Integer numValueOf117 = Integer.valueOf(list5.size());
            zChanged4 = composer4.changed(mutableState3) | composer4.changedInstance(list5);
            objRememberedValue4 = composer4.rememberedValue();
            if (zChanged4) {
                i10 = 0;
                continuation = null;
                objRememberedValue4 = new fp0(list5, mutableState3, null, 0);
                composer4.updateRememberedValue(objRememberedValue4);
            } else {
                i10 = 0;
                continuation = null;
                objRememberedValue4 = new fp0(list5, mutableState3, null, 0);
                composer4.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(numValueOf117, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer4, i10);
            Boolean boolValueOf18 = Boolean.valueOf(z);
            Boolean boolValueOf19 = Boolean.valueOf(z2);
            Integer numValueOf118 = Integer.valueOf(iIntValue5);
            if (i8 == i9) {
                z8 = true;
            } else {
                z8 = false;
            }
            i11 = i6;
            if (i11 == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            zChanged5 = z8 | z9 | composer4.changed(mutableState3) | composer4.changed(iIntValue5);
            objRememberedValue5 = composer4.rememberedValue();
            if (zChanged5) {
                MutableState mutableState315 = mutableState3;
                mg1 mg1Var6 = new mg1(iIntValue5, mutableState315, null, z, z2);
                mutableState8 = mutableState315;
                composer4.updateRememberedValue(mg1Var6);
                objRememberedValue5 = mg1Var6;
            } else {
                MutableState mutableState316 = mutableState3;
                mg1 mg1Var7 = new mg1(iIntValue5, mutableState316, null, z, z2);
                mutableState8 = mutableState316;
                composer4.updateRememberedValue(mg1Var7);
                objRememberedValue5 = mg1Var7;
            }
            MutableState mutableState317 = mutableState8;
            composer5 = composer4;
            EffectsKt.LaunchedEffect(boolValueOf18, boolValueOf19, numValueOf118, (Function2) objRememberedValue5, composer5, i8 | ((i36 >> 21) & Input.Keys.FORWARD_DEL));
            objRememberedValue6 = composer5.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue6 == companion.getEmpty()) {
                scrollState2 = scrollState;
                objRememberedValue6 = SnapshotStateKt.derivedStateOf(new v6(scrollState2, 2));
                composer5.updateRememberedValue(objRememberedValue6);
            } else {
                scrollState2 = scrollState;
            }
            state = (State) objRememberedValue6;
            Boolean bool4 = (Boolean) state.getValue();
            bool4.getClass();
            i12 = i9;
            i13 = i40 & Input.Keys.FORWARD_DEL;
            map4 = map3;
            if (i13 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            objRememberedValue7 = composer5.rememberedValue();
            if (z10) {
                objRememberedValue7 = new gq(function7, state, continuation, 6);
                composer5.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new gq(function7, state, continuation, 6);
                composer5.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.LaunchedEffect(bool4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer5, 0);
            Integer numValueOf119 = Integer.valueOf(i);
            if ((i40 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zChanged212 = z11 | composer5.changed(scrollState2);
            if (i13 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z28 = zChanged212 | z12;
            i14 = i40 & 896;
            if (i14 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z29 = z28 | z13;
            if ((i40 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z29 | z14;
            objRememberedValue8 = composer5.rememberedValue();
            if (z15) {
                ScrollState scrollState9 = scrollState2;
                c2 = 2;
                Composer composer1116 = composer5;
                iq iqVar6 = new iq(i, scrollState9, function7, function8, function9, null);
                scrollState2 = scrollState9;
                composer1116.updateRememberedValue(iqVar6);
                objRememberedValue8 = iqVar6;
                composer6 = composer1116;
            } else {
                ScrollState scrollState10 = scrollState2;
                c2 = 2;
                Composer composer1117 = composer5;
                iq iqVar7 = new iq(i, scrollState10, function7, function8, function9, null);
                scrollState2 = scrollState10;
                composer1117.updateRememberedValue(iqVar7);
                objRememberedValue8 = iqVar7;
                composer6 = composer1117;
            }
            EffectsKt.LaunchedEffect(numValueOf119, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer6, (r5 >> 9) & 14);
            zChanged6 = composer6.changed(list5) | composer6.changed(list3);
            objRememberedValue9 = composer6.rememberedValue();
            if (zChanged6) {
                it = list5.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    library2 = (Library) next;
                    it2 = list3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.areEqual(((rx0) next2).getLibrary().getId(), library2.getId()));
                    rx0Var2 = (rx0) next2;
                    if (rx0Var2 == null) {
                        break;
                        break;
                    }
                } while (rx0Var2.getItems().isEmpty());
                library = (Library) next;
                if (library != null) {
                    name = library.getName();
                } else {
                    name = null;
                }
                composer6.updateRememberedValue(name);
                objRememberedValue9 = name;
            } else {
                it = list5.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    library2 = (Library) next;
                    it2 = list3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.areEqual(((rx0) next2).getLibrary().getId(), library2.getId()));
                    rx0Var2 = (rx0) next2;
                    if (rx0Var2 == null) {
                        break;
                        break;
                    }
                } while (rx0Var2.getItems().isEmpty());
                library = (Library) next;
                if (library != null) {
                    name = library.getName();
                } else {
                    name = null;
                }
                composer6.updateRememberedValue(name);
                objRememberedValue9 = name;
            }
            str4 = (String) objRememberedValue9;
            zChanged7 = composer6.changed(list5) | composer6.changed(list2) | composer6.changed(str4);
            objRememberedValue10 = composer6.rememberedValue();
            if (zChanged7) {
                if (!list5.isEmpty()) {
                    str4 = "我的媒体";
                } else if (!list2.isEmpty()) {
                    str4 = "继续观看";
                }
                composer6.updateRememberedValue(str4);
                objRememberedValue10 = str4;
            } else {
                if (!list5.isEmpty()) {
                    str4 = "我的媒体";
                } else if (!list2.isEmpty()) {
                    str4 = "继续观看";
                }
                composer6.updateRememberedValue(str4);
                objRememberedValue10 = str4;
            }
            str5 = (String) objRememberedValue10;
            zChanged8 = composer6.changed(str5);
            objRememberedValue11 = composer6.rememberedValue();
            if (zChanged8) {
                if (Intrinsics.areEqual(str5, "我的媒体")) {
                    x82Var = x82.a;
                } else {
                    x82Var = x82.b;
                }
                objRememberedValue11 = x82Var;
                composer6.updateRememberedValue(objRememberedValue11);
            } else {
                if (Intrinsics.areEqual(str5, "我的媒体")) {
                    x82Var = x82.a;
                } else {
                    x82Var = x82.b;
                }
                objRememberedValue11 = x82Var;
                composer6.updateRememberedValue(objRememberedValue11);
            }
            x82Var2 = (x82) objRememberedValue11;
            objRememberedValue12 = composer6.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue12 == companion2.getEmpty()) {
                objRememberedValue12 = new LinkedHashSet();
                composer6.updateRememberedValue(objRememberedValue12);
            }
            set = (Set) objRememberedValue12;
            Boolean boolValueOf110 = Boolean.valueOf(z);
            String str15 = (String) r32.getValue();
            Integer numValueOf1110 = Integer.valueOf(d(mutableState317));
            Integer numValueOf1111 = Integer.valueOf(iIntValue2);
            Object[] objArr112 = new Object[7];
            objArr112[0] = boolValueOf110;
            objArr112[1] = str15;
            objArr112[c2] = list5;
            objArr112[3] = list2;
            objArr112[i12] = list3;
            objArr112[5] = numValueOf1110;
            objArr112[6] = numValueOf1111;
            if (i8 == i12) {
                z16 = true;
            } else {
                z16 = false;
            }
            mutableState9 = mutableState317;
            zChanged9 = z16 | composer6.changed(mutableState20) | composer6.changedInstance(list5) | composer6.changed(mutableState9) | composer6.changedInstance(list3) | composer6.changedInstance(zq0Var3) | composer6.changed(iIntValue2) | composer6.changedInstance(set) | composer6.changedInstance(context);
            Object objRememberedValue414 = composer6.rememberedValue();
            if (zChanged9) {
                list6 = list5;
                str6 = str5;
                c6Var = new c6(z, list6, mutableState20, mutableState9, list3, zq0Var, iIntValue2, set, context, null);
                mutableState9 = mutableState9;
                i15 = iIntValue2;
                composer6.updateRememberedValue(c6Var);
            } else {
                list6 = list5;
                str6 = str5;
                c6Var = new c6(z, list6, mutableState20, mutableState9, list3, zq0Var, iIntValue2, set, context, null);
                mutableState9 = mutableState9;
                i15 = iIntValue2;
                composer6.updateRememberedValue(c6Var);
            }
            EffectsKt.LaunchedEffect(objArr112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c6Var, composer6, 0);
            Boolean boolValueOf111 = Boolean.valueOf(e(mutableState4));
            Integer numValueOf1112 = Integer.valueOf(((Number) mutableState7.getValue()).intValue());
            Integer numValueOf1113 = Integer.valueOf(((Number) mutableState27.getValue()).intValue());
            Object[] objArr113 = new Object[5];
            objArr113[0] = boolValueOf111;
            objArr113[1] = numValueOf1112;
            objArr113[c2] = numValueOf1113;
            i16 = 3;
            objArr113[3] = list3;
            objArr113[4] = list6;
            mutableState10 = mutableState4;
            zChanged10 = composer6.changed(mutableState10) | composer6.changed(mutableState7) | composer6.changed(mutableState27) | composer6.changedInstance(list6) | composer6.changedInstance(map4) | composer6.changed(mutableState9);
            objRememberedValue13 = composer6.rememberedValue();
            if (zChanged10) {
                ap0 ap0Var6 = new ap0(list6, mutableState10, mutableState7, mutableState27, map4, mutableState9, null);
                mutableState11 = mutableState10;
                composer6.updateRememberedValue(ap0Var6);
                objRememberedValue13 = ap0Var6;
            } else {
                ap0 ap0Var7 = new ap0(list6, mutableState10, mutableState7, mutableState27, map4, mutableState9, null);
                mutableState11 = mutableState10;
                composer6.updateRememberedValue(ap0Var7);
                objRememberedValue13 = ap0Var7;
            }
            EffectsKt.LaunchedEffect(objArr113, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composer6, 0);
            scrollState3 = scrollState2;
            zChanged11 = composer6.changed(scrollState3) | composer6.changed(mutableState23);
            objRememberedValue14 = composer6.rememberedValue();
            if (zChanged11) {
                continuation2 = null;
                objRememberedValue14 = new n2(scrollState3, mutableState23, continuation2, i16);
                composer6.updateRememberedValue(objRememberedValue14);
            } else {
                continuation2 = null;
                objRememberedValue14 = new n2(scrollState3, mutableState23, continuation2, i16);
                composer6.updateRememberedValue(objRememberedValue14);
            }
            EffectsKt.LaunchedEffect(scrollState3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composer6, 0);
            Modifier.Companion companion15 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(companion15, 0.0f, 1, continuation2);
            Alignment.Companion companion16 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion16.getTopStart(), false);
            int iB7 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
            CompositionLocalMap currentCompositionLocalMap7 = composer6.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxSize$default7);
            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
            constructor = companion17.getConstructor();
            if (!id.n(composer6.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor);
            } else {
                composer6.useNode();
            }
            Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer6);
            mr.z(companion17, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
            Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl7, Integer.valueOf(iB7), composerM4318constructorimpl7));
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            composer6.startMovableGroup(-820140454, Integer.valueOf(((Number) mutableState.getValue()).intValue()));
            objRememberedValue15 = composer6.rememberedValue();
            if (objRememberedValue15 == companion2.getEmpty()) {
                objRememberedValue15 = new vi0(15);
                composer6.updateRememberedValue(objRememberedValue15);
            }
            Function1 function1115 = (Function1) objRememberedValue15;
            Modifier modifierM1064size3ABfNKs4 = SizeKt.m1064size3ABfNKs(companion15, Dp.m7813constructorimpl(0.0f));
            objRememberedValue16 = composer6.rememberedValue();
            if (objRememberedValue16 == companion2.getEmpty()) {
                objRememberedValue16 = new vi0(16);
                composer6.updateRememberedValue(objRememberedValue16);
            }
            Composer composer1118 = composer6;
            AndroidView_androidKt.AndroidView(function1115, modifierM1064size3ABfNKs4, (Function1) objRememberedValue16, composer1118, 438, 0);
            composer7 = composer1118;
            composer7.endMovableGroup();
            Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(companion15, 0.0f, 1, null);
            str7 = str6;
            boolean zChanged213 = composer7.changed(r3) | composer7.changed(str7) | composer7.changedInstance(coroutineScope) | composer7.changed(scrollState3);
            if (i14 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            zChanged12 = zChanged213 | z17 | composer7.changed(x82Var2.ordinal());
            Object objRememberedValue415 = composer7.rememberedValue();
            if (zChanged12) {
                mutableState12 = r3;
                c3 = 7;
                bp0Var = new bp0(str7, coroutineScope, mutableState12, scrollState3, function8, x82Var2);
                composer7.updateRememberedValue(bp0Var);
            } else {
                mutableState12 = r3;
                c3 = 7;
                bp0Var = new bp0(str7, coroutineScope, mutableState12, scrollState3, function8, x82Var2);
                composer7.updateRememberedValue(bp0Var);
            }
            Modifier modifierM1003paddingqDBjuR0$default4 = PaddingKt.m1003paddingqDBjuR0$default(ScrollKt.verticalScroll$default(KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default8, (Function1) bp0Var), scrollState3, false, null, false, 14, null), 0.0f, Dp.m7813constructorimpl(80.0f), 0.0f, Dp.m7813constructorimpl(28.0f), 5, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f)), companion16.getStart(), composer7, 54);
            int iB8 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
            CompositionLocalMap currentCompositionLocalMap8 = composer7.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer7, modifierM1003paddingqDBjuR0$default4);
            constructor2 = companion17.getConstructor();
            if (!id.n(composer7.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor2);
            } else {
                composer7.useNode();
            }
            Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer7);
            mr.z(companion17, composerM4318constructorimpl8, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl8, currentCompositionLocalMap8);
            Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl8, Integer.valueOf(iB8), composerM4318constructorimpl8));
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            if (list.isEmpty()) {
                composer7.startReplaceGroup(-1310464578);
                mutableState13 = mutableState6;
                zChanged16 = composer7.changed(mutableState12) | composer7.changed(mutableState13);
                objRememberedValue26 = composer7.rememberedValue();
                if (zChanged16) {
                    objRememberedValue26 = new ai(6, mutableState12, mutableState13);
                    composer7.updateRememberedValue(objRememberedValue26);
                } else {
                    objRememberedValue26 = new ai(6, mutableState12, mutableState13);
                    composer7.updateRememberedValue(objRememberedValue26);
                }
                Function1 function1116 = (Function1) objRememberedValue26;
                i17 = i38;
                if ((i17 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objRememberedValue27 = composer7.rememberedValue();
                if (z18) {
                    objRememberedValue27 = new co0(function1, 0);
                    composer7.updateRememberedValue(objRememberedValue27);
                } else {
                    objRememberedValue27 = new co0(function1, 0);
                    composer7.updateRememberedValue(objRememberedValue27);
                }
                Function2 function1117 = (Function2) objRememberedValue27;
                if (i13 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zChangedInstance8 = composer7.changedInstance(zq0Var) | z19;
                if ((i17 & 3670016) == 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = zChangedInstance8 | z20;
                objRememberedValue28 = composer7.rememberedValue();
                if (z21) {
                    i32 = 0;
                    objRememberedValue28 = new Function0() { // from class: do0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i4112 = i32;
                            Function0 function1118 = function0;
                            zq0 zq0Var4 = zq0Var;
                            Function1 function1119 = function7;
                            switch (i4112) {
                                case 0:
                                    function1119.invoke(Boolean.TRUE);
                                    zq0Var4.h();
                                    function1118.invoke();
                                    break;
                                case 1:
                                    function1119.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function1118.invoke();
                                    break;
                                default:
                                    function1119.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function1118.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer7.updateRememberedValue(objRememberedValue28);
                } else {
                    i32 = 0;
                    objRememberedValue28 = new Function0() { // from class: do0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i4112 = i32;
                            Function0 function1118 = function0;
                            zq0 zq0Var4 = zq0Var;
                            Function1 function1119 = function7;
                            switch (i4112) {
                                case 0:
                                    function1119.invoke(Boolean.TRUE);
                                    zq0Var4.h();
                                    function1118.invoke();
                                    break;
                                case 1:
                                    function1119.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function1118.invoke();
                                    break;
                                default:
                                    function1119.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function1118.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer7.updateRememberedValue(objRememberedValue28);
                }
                int i4112 = i36 >> 9;
                i18 = i32;
                f = fM7813constructorimpl;
                R(z, list7, str, str3, z2, function1116, function1117, f, (Function0) objRememberedValue28, composer7, (i4112 & 458752) | ((r15 >> 3) & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 100663302 | (i4112 & 57344));
                Composer composer1119 = composer7;
                composer1119.endReplaceGroup();
                composer8 = composer1119;
            } else {
                f = fM7813constructorimpl;
                i17 = i38;
                mutableState13 = mutableState6;
                i18 = 0;
                composer7.startReplaceGroup(-1309622742);
                composer7.endReplaceGroup();
                composer8 = composer7;
            }
            list2.size();
            if (list2.isEmpty()) {
                composer8.startReplaceGroup(-1309440772);
                zChanged15 = composer8.changed(mutableState12) | composer8.changed(mutableState13);
                objRememberedValue22 = composer8.rememberedValue();
                if (zChanged15) {
                    objRememberedValue22 = new ai(c3, mutableState12, mutableState13);
                    composer8.updateRememberedValue(objRememberedValue22);
                } else {
                    objRememberedValue22 = new ai(c3, mutableState12, mutableState13);
                    composer8.updateRememberedValue(objRememberedValue22);
                }
                Function1 function1118 = (Function1) objRememberedValue22;
                if (function6 == null) {
                    composer8.startReplaceGroup(-1308759857);
                    if ((i17 & 7168) == 2048) {
                        i31 = 1;
                    } else {
                        i31 = i18;
                    }
                    objRememberedValue25 = composer8.rememberedValue();
                    if (i31 == 0) {
                        objRememberedValue25 = new i2(function4, 8);
                        composer8.updateRememberedValue(objRememberedValue25);
                    } else {
                        objRememberedValue25 = new i2(function4, 8);
                        composer8.updateRememberedValue(objRememberedValue25);
                    }
                    composer8.endReplaceGroup();
                    function10 = (Function3) objRememberedValue25;
                } else {
                    composer8.startReplaceGroup(-1150597368);
                    composer8.endReplaceGroup();
                    function10 = function6;
                }
                zChangedInstance3 = composer8.changedInstance(zq0Var);
                objRememberedValue23 = composer8.rememberedValue();
                if (zChangedInstance3) {
                    objRememberedValue23 = new yn0(zq0Var, 1);
                    composer8.updateRememberedValue(objRememberedValue23);
                } else {
                    objRememberedValue23 = new yn0(zq0Var, 1);
                    composer8.updateRememberedValue(objRememberedValue23);
                }
                Function1 function1119 = (Function1) objRememberedValue23;
                if (i13 == 32) {
                    i28 = 1;
                } else {
                    i28 = i18;
                }
                int i4113 = (composer8.changedInstance(zq0Var) ? 1 : 0) | i28;
                if ((i17 & 3670016) == 1048576) {
                    i29 = 1;
                } else {
                    i29 = i18;
                }
                i30 = i4113 | i29;
                objRememberedValue24 = composer8.rememberedValue();
                if (i30 == 0) {
                    final int i4114 = 1;
                    objRememberedValue24 = new Function0() { // from class: do0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i4115 = i4114;
                            Function0 function11110 = function0;
                            zq0 zq0Var4 = zq0Var;
                            Function1 function11111 = function7;
                            switch (i4115) {
                                case 0:
                                    function11111.invoke(Boolean.TRUE);
                                    zq0Var4.h();
                                    function11110.invoke();
                                    break;
                                case 1:
                                    function11111.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function11110.invoke();
                                    break;
                                default:
                                    function11111.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function11110.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer8.updateRememberedValue(objRememberedValue24);
                } else {
                    final int i4115 = 1;
                    objRememberedValue24 = new Function0() { // from class: do0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i4116 = i4115;
                            Function0 function11110 = function0;
                            zq0 zq0Var4 = zq0Var;
                            Function1 function11111 = function7;
                            switch (i4116) {
                                case 0:
                                    function11111.invoke(Boolean.TRUE);
                                    zq0Var4.h();
                                    function11110.invoke();
                                    break;
                                case 1:
                                    function11111.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function11110.invoke();
                                    break;
                                default:
                                    function11111.invoke(Boolean.FALSE);
                                    zq0Var4.h();
                                    function11110.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer8.updateRememberedValue(objRememberedValue24);
                }
                int i4116 = r15 >> 3;
                i19 = i13;
                Composer composer11110 = composer8;
                float f11 = f;
                W(z, list2, str, num, str2, str3, function1118, z2, z3, function10, function1119, f11, iIntValue3, (Function0) objRememberedValue24, composer11110, (i4116 & 3670016) | (i4116 & 7168) | ((r15 << 3) & Input.Keys.FORWARD_DEL) | 6 | (r15 & 896) | (i4116 & 57344) | (i4116 & 458752) | i11 | (r15 & 1879048192), RendererCapabilities.DECODER_SUPPORT_MASK);
                f = f11;
                Composer composer11111 = composer11110;
                composer11111.endReplaceGroup();
                composer9 = composer11111;
            } else {
                i19 = i13;
                composer8.startReplaceGroup(-1308097015);
                composer8.endReplaceGroup();
                composer9 = composer8;
            }
            composer9.startReplaceGroup(-1150568274);
            i20 = 0;
            composer10 = composer9;
            while (r25.hasNext()) {
                int i4117 = i20 + 1;
                if (i20 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                library3 = (Library) obj2;
                it3 = list3.iterator();
                do {
                    if (it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!Intrinsics.areEqual(((rx0) next3).getLibrary().getId(), library3.getId()));
                rx0Var3 = (rx0) next3;
                if (rx0Var3 != null) {
                    composer10.startReplaceGroup(-1966840846);
                    if (rx0Var3.getItems().isEmpty()) {
                        composer10.startReplaceGroup(-1966757828);
                        String id5 = rx0Var3.getLibrary().getId();
                        String name9 = rx0Var3.getLibrary().getName();
                        List items4 = rx0Var3.getItems();
                        mutableState18 = mutableState12;
                        mutableState19 = mutableState13;
                        zChanged14 = composer10.changed(mutableState18) | composer10.changed(mutableState19) | composer10.changed(i20);
                        objRememberedValue19 = composer10.rememberedValue();
                        if (zChanged14) {
                            i24 = 0;
                            objRememberedValue19 = new Function1() { // from class: eo0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i519 = i24;
                                    MutableState mutableState318 = mutableState19;
                                    MutableState mutableState319 = mutableState18;
                                    int i5110 = i20;
                                    String str16 = (String) obj3;
                                    switch (i519) {
                                        case 0:
                                            str16.getClass();
                                            mutableState319.setValue(str16);
                                            mutableState318.setValue(Integer.valueOf(i5110));
                                            break;
                                        default:
                                            str16.getClass();
                                            mutableState319.setValue(str16);
                                            mutableState318.setValue(Integer.valueOf(i5110));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue19);
                        } else {
                            i24 = 0;
                            objRememberedValue19 = new Function1() { // from class: eo0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i519 = i24;
                                    MutableState mutableState318 = mutableState19;
                                    MutableState mutableState319 = mutableState18;
                                    int i5110 = i20;
                                    String str16 = (String) obj3;
                                    switch (i519) {
                                        case 0:
                                            str16.getClass();
                                            mutableState319.setValue(str16);
                                            mutableState318.setValue(Integer.valueOf(i5110));
                                            break;
                                        default:
                                            str16.getClass();
                                            mutableState319.setValue(str16);
                                            mutableState318.setValue(Integer.valueOf(i5110));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue19);
                        }
                        Function1 function11110 = (Function1) objRememberedValue19;
                        i25 = i19;
                        if (i25 == 32) {
                            i26 = 1;
                        } else {
                            i26 = i24;
                        }
                        int i519 = i26 | (composer10.changedInstance(zq0Var) ? 1 : 0);
                        if ((i17 & 3670016) == 1048576) {
                            c4 = 1;
                        } else {
                            c4 = 0;
                        }
                        i27 = (i519 == true ? 1 : 0) | c4;
                        objRememberedValue20 = composer10.rememberedValue();
                        if (i27 == 0) {
                            final int i5110 = 2;
                            objRememberedValue20 = new Function0() { // from class: do0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i4118 = i5110;
                                    Function0 function11111 = function0;
                                    zq0 zq0Var4 = zq0Var;
                                    Function1 function11112 = function7;
                                    switch (i4118) {
                                        case 0:
                                            function11112.invoke(Boolean.TRUE);
                                            zq0Var4.h();
                                            function11111.invoke();
                                            break;
                                        case 1:
                                            function11112.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function11111.invoke();
                                            break;
                                        default:
                                            function11112.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function11111.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue20);
                        } else {
                            final int i5111 = 2;
                            objRememberedValue20 = new Function0() { // from class: do0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i4118 = i5111;
                                    Function0 function11111 = function0;
                                    zq0 zq0Var4 = zq0Var;
                                    Function1 function11112 = function7;
                                    switch (i4118) {
                                        case 0:
                                            function11112.invoke(Boolean.TRUE);
                                            zq0Var4.h();
                                            function11111.invoke();
                                            break;
                                        case 1:
                                            function11112.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function11111.invoke();
                                            break;
                                        default:
                                            function11112.invoke(Boolean.FALSE);
                                            zq0Var4.h();
                                            function11111.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue20);
                        }
                        Function0 function11111 = (Function0) objRememberedValue20;
                        boolean hasMore4 = rx0Var3.getHasMore();
                        boolean isLoadingMore4 = rx0Var3.getIsLoadingMore();
                        zChangedInstance2 = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                        objRememberedValue21 = composer10.rememberedValue();
                        if (zChangedInstance2) {
                            final int i5112 = 0;
                            objRememberedValue21 = new Function0() { // from class: fo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i5113 = i5112;
                                    Library library5 = library3;
                                    switch (i5113) {
                                        case 0:
                                            String id6 = library5.getId();
                                            id6.getClass();
                                            zq0 zq0Var4 = zq0Var;
                                            if (zq0Var4.H) {
                                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id6, null), 2, null);
                                            }
                                            break;
                                        default:
                                            zq0Var.F(library5.getId());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue21);
                        } else {
                            final int i5113 = 0;
                            objRememberedValue21 = new Function0() { // from class: fo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i5114 = i5113;
                                    Library library5 = library3;
                                    switch (i5114) {
                                        case 0:
                                            String id6 = library5.getId();
                                            id6.getClass();
                                            zq0 zq0Var4 = zq0Var;
                                            if (zq0Var4.H) {
                                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id6, null), 2, null);
                                            }
                                            break;
                                        default:
                                            zq0Var.F(library5.getId());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer10.updateRememberedValue(objRememberedValue21);
                        }
                        int i5114 = r15 << 6;
                        int i5115 = i17 >> 12;
                        Composer composer11112 = composer10;
                        mutableState16 = mutableState18;
                        float f12 = f;
                        i22 = i25;
                        mutableState17 = mutableState19;
                        Q(id5, name9, z, items4, z4, z5, str, str3, z2, function2, function3, function5, f12, i15, function11110, function11111, hasMore4, isLoadingMore4, (Function0) objRememberedValue21, composer11112, (i5114 & 3670016) | (i5114 & 896) | (i5115 & 57344) | (i5115 & 458752) | i42 | i11 | ((i17 << 24) & 1879048192), ((i17 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i17 >> 9) & Input.Keys.FORWARD_DEL));
                        f = f12;
                        Composer composer11113 = composer11112;
                        composer11113.endReplaceGroup();
                        composer10 = composer11113;
                    } else {
                        mutableState16 = mutableState12;
                        mutableState17 = mutableState13;
                        i22 = i19;
                        composer10.startReplaceGroup(-1965146200);
                        composer10.endReplaceGroup();
                        library3.getName();
                        composer10 = composer10;
                    }
                    composer10.endReplaceGroup();
                    mutableState14 = mutableState16;
                    mutableState15 = mutableState17;
                } else {
                    i22 = i19;
                    composer10.startReplaceGroup(-1964959456);
                    float f13 = f;
                    String name10 = library3.getName();
                    mutableState14 = mutableState12;
                    mutableState15 = mutableState13;
                    zChanged13 = composer10.changed(mutableState14) | composer10.changed(mutableState15) | composer10.changed(i20);
                    objRememberedValue17 = composer10.rememberedValue();
                    if (zChanged13) {
                        i23 = 1;
                        objRememberedValue17 = new Function1() { // from class: eo0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i5116 = i23;
                                MutableState mutableState318 = mutableState15;
                                MutableState mutableState319 = mutableState14;
                                int i5117 = i20;
                                String str16 = (String) obj3;
                                switch (i5116) {
                                    case 0:
                                        str16.getClass();
                                        mutableState319.setValue(str16);
                                        mutableState318.setValue(Integer.valueOf(i5117));
                                        break;
                                    default:
                                        str16.getClass();
                                        mutableState319.setValue(str16);
                                        mutableState318.setValue(Integer.valueOf(i5117));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer10.updateRememberedValue(objRememberedValue17);
                    } else {
                        i23 = 1;
                        objRememberedValue17 = new Function1() { // from class: eo0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i5116 = i23;
                                MutableState mutableState318 = mutableState15;
                                MutableState mutableState319 = mutableState14;
                                int i5117 = i20;
                                String str16 = (String) obj3;
                                switch (i5116) {
                                    case 0:
                                        str16.getClass();
                                        mutableState319.setValue(str16);
                                        mutableState318.setValue(Integer.valueOf(i5117));
                                        break;
                                    default:
                                        str16.getClass();
                                        mutableState319.setValue(str16);
                                        mutableState318.setValue(Integer.valueOf(i5117));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer10.updateRememberedValue(objRememberedValue17);
                    }
                    Function1 function11112 = (Function1) objRememberedValue17;
                    zChangedInstance = composer10.changedInstance(zq0Var) | composer10.changed(library3);
                    objRememberedValue18 = composer10.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue18 = new Function0() { // from class: fo0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5116 = i23;
                                Library library5 = library3;
                                switch (i5116) {
                                    case 0:
                                        String id6 = library5.getId();
                                        id6.getClass();
                                        zq0 zq0Var4 = zq0Var;
                                        if (zq0Var4.H) {
                                            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id6, null), 2, null);
                                        }
                                        break;
                                    default:
                                        zq0Var.F(library5.getId());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer10.updateRememberedValue(objRememberedValue18);
                    } else {
                        objRememberedValue18 = new Function0() { // from class: fo0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5116 = i23;
                                Library library5 = library3;
                                switch (i5116) {
                                    case 0:
                                        String id6 = library5.getId();
                                        id6.getClass();
                                        zq0 zq0Var4 = zq0Var;
                                        if (zq0Var4.H) {
                                            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(zq0Var4), Dispatchers.getIO(), null, new qq0(zq0Var4, zq0Var4.G, id6, null), 2, null);
                                        }
                                        break;
                                    default:
                                        zq0Var.F(library5.getId());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer10.updateRememberedValue(objRememberedValue18);
                    }
                    P(name10, f13, false, function11112, (Function0) objRememberedValue18, composer10, 432);
                    f = f13;
                    composer10.endReplaceGroup();
                }
                mutableState13 = mutableState15;
                mutableState12 = mutableState14;
                i20 = i4117;
                i19 = i22;
                composer10 = composer10;
            }
            zq0Var2 = zq0Var;
            composer10.endReplaceGroup();
            if (e(mutableState11)) {
                i21 = 6;
                composer10.startReplaceGroup(-1305008950);
                composer10.endReplaceGroup();
            } else {
                i21 = 6;
                composer10.startReplaceGroup(-1305008950);
                composer10.endReplaceGroup();
            }
            itemCounts2 = itemCounts;
            if (itemCounts2 != null) {
                composer10.startReplaceGroup(-1304721270);
                composer10.endReplaceGroup();
            } else {
                composer10.startReplaceGroup(-1304721270);
                composer10.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(1.0f)), composer10, i21);
            composer10.endNode();
            composer10.endNode();
            composer2 = composer10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer10;
            }
        } else {
            itemCounts2 = itemCounts;
            Composer composer20 = composerStartRestartGroup;
            zq0Var2 = zq0Var;
            composer20.skipToGroupEnd();
            composer2 = composer20;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final zq0 zq0Var4 = zq0Var2;
            final ItemCounts itemCounts3 = itemCounts2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ho0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i4);
                    bq0.a(z, list, list2, list3, str, num, str2, str3, z2, z3, function1, function2, function3, function4, function5, function6, function0, zq0Var4, z4, z5, itemCounts3, function7, function8, i, function9, (Composer) obj3, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int c(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:1000:0x2127  */
    /* JADX WARN: Code duplicated, block: B:1003:0x213a  */
    /* JADX WARN: Code duplicated, block: B:1004:0x2146  */
    /* JADX WARN: Code duplicated, block: B:1007:0x2157  */
    /* JADX WARN: Code duplicated, block: B:1008:0x2166  */
    /* JADX WARN: Code duplicated, block: B:1011:0x2179  */
    /* JADX WARN: Code duplicated, block: B:1012:0x2188  */
    /* JADX WARN: Code duplicated, block: B:1015:0x219d  */
    /* JADX WARN: Code duplicated, block: B:1018:0x21a6  */
    /* JADX WARN: Code duplicated, block: B:1019:0x21a8  */
    /* JADX WARN: Code duplicated, block: B:1023:0x21c3  */
    /* JADX WARN: Code duplicated, block: B:1024:0x21d2  */
    /* JADX WARN: Code duplicated, block: B:1027:0x21e5  */
    /* JADX WARN: Code duplicated, block: B:1028:0x21f4  */
    /* JADX WARN: Code duplicated, block: B:1031:0x2208  */
    /* JADX WARN: Code duplicated, block: B:1032:0x2217  */
    /* JADX WARN: Code duplicated, block: B:1035:0x222b  */
    /* JADX WARN: Code duplicated, block: B:1036:0x223a  */
    /* JADX WARN: Code duplicated, block: B:1039:0x224d  */
    /* JADX WARN: Code duplicated, block: B:1040:0x225c  */
    /* JADX WARN: Code duplicated, block: B:1043:0x2273  */
    /* JADX WARN: Code duplicated, block: B:1045:0x2279  */
    /* JADX WARN: Code duplicated, block: B:1050:0x22da  */
    /* JADX WARN: Code duplicated, block: B:1053:0x2309  */
    /* JADX WARN: Code duplicated, block: B:1055:0x231b  */
    /* JADX WARN: Code duplicated, block: B:1057:0x234e  */
    /* JADX WARN: Code duplicated, block: B:1060:0x2377  */
    /* JADX WARN: Code duplicated, block: B:1062:0x2389  */
    /* JADX WARN: Code duplicated, block: B:1064:0x239b  */
    /* JADX WARN: Code duplicated, block: B:1067:0x23b1  */
    /* JADX WARN: Code duplicated, block: B:1069:0x23c3  */
    /* JADX WARN: Code duplicated, block: B:1076:0x23eb  */
    /* JADX WARN: Code duplicated, block: B:1078:0x23ff  */
    /* JADX WARN: Code duplicated, block: B:1081:0x2419  */
    /* JADX WARN: Code duplicated, block: B:1083:0x242b  */
    /* JADX WARN: Code duplicated, block: B:1085:0x2440  */
    /* JADX WARN: Code duplicated, block: B:1088:0x2455  */
    /* JADX WARN: Code duplicated, block: B:1090:0x24e1  */
    /* JADX WARN: Code duplicated, block: B:1091:0x24ee  */
    /* JADX WARN: Code duplicated, block: B:1098:0x251f  */
    /* JADX WARN: Code duplicated, block: B:1100:0x2578  */
    /* JADX WARN: Code duplicated, block: B:1103:0x25ae  */
    /* JADX WARN: Code duplicated, block: B:1105:0x25c6  */
    /* JADX WARN: Code duplicated, block: B:1112:0x25e9  */
    /* JADX WARN: Code duplicated, block: B:1114:0x25fd  */
    /* JADX WARN: Code duplicated, block: B:1117:0x2617  */
    /* JADX WARN: Code duplicated, block: B:1119:0x2629  */
    /* JADX WARN: Code duplicated, block: B:1120:0x2634  */
    /* JADX WARN: Code duplicated, block: B:1122:0x2640  */
    /* JADX WARN: Code duplicated, block: B:1125:0x2658  */
    /* JADX WARN: Code duplicated, block: B:1127:0x2672  */
    /* JADX WARN: Code duplicated, block: B:1128:0x267f  */
    /* JADX WARN: Code duplicated, block: B:1133:0x269d  */
    /* JADX WARN: Code duplicated, block: B:1138:0x26bf  */
    /* JADX WARN: Code duplicated, block: B:1141:0x26d6  */
    /* JADX WARN: Code duplicated, block: B:1143:0x26f5  */
    /* JADX WARN: Code duplicated, block: B:1146:0x270a  */
    /* JADX WARN: Code duplicated, block: B:1148:0x2720  */
    /* JADX WARN: Code duplicated, block: B:1155:0x274b  */
    /* JADX WARN: Code duplicated, block: B:1157:0x2780  */
    /* JADX WARN: Code duplicated, block: B:1160:0x279e  */
    /* JADX WARN: Code duplicated, block: B:1170:0x27dd  */
    /* JADX WARN: Code duplicated, block: B:1172:0x27f2  */
    /* JADX WARN: Code duplicated, block: B:1175:0x2807  */
    /* JADX WARN: Code duplicated, block: B:1177:0x281d  */
    /* JADX WARN: Code duplicated, block: B:1178:0x282a  */
    /* JADX WARN: Code duplicated, block: B:1183:0x2840  */
    /* JADX WARN: Code duplicated, block: B:1185:0x285e  */
    /* JADX WARN: Code duplicated, block: B:1188:0x2874  */
    /* JADX WARN: Code duplicated, block: B:1190:0x288a  */
    /* JADX WARN: Code duplicated, block: B:1195:0x28ac  */
    /* JADX WARN: Code duplicated, block: B:1198:0x28d1  */
    /* JADX WARN: Code duplicated, block: B:1199:0x28d3  */
    /* JADX WARN: Code duplicated, block: B:1202:0x28e0  */
    /* JADX WARN: Code duplicated, block: B:1203:0x28e3  */
    /* JADX WARN: Code duplicated, block: B:1208:0x28f3  */
    /* JADX WARN: Code duplicated, block: B:1212:0x2950  */
    /* JADX WARN: Code duplicated, block: B:1215:0x2967  */
    /* JADX WARN: Code duplicated, block: B:1217:0x297d  */
    /* JADX WARN: Code duplicated, block: B:1224:0x29a1  */
    /* JADX WARN: Code duplicated, block: B:1226:0x29b9  */
    /* JADX WARN: Code duplicated, block: B:1229:0x29cf  */
    /* JADX WARN: Code duplicated, block: B:1231:0x29e1  */
    /* JADX WARN: Code duplicated, block: B:1232:0x29ec  */
    /* JADX WARN: Code duplicated, block: B:1234:0x2a21  */
    /* JADX WARN: Code duplicated, block: B:1237:0x2a38  */
    /* JADX WARN: Code duplicated, block: B:1239:0x2a4a  */
    /* JADX WARN: Code duplicated, block: B:1240:0x2a55  */
    /* JADX WARN: Code duplicated, block: B:1242:0x2a94  */
    /* JADX WARN: Code duplicated, block: B:1245:0x2aa5  */
    /* JADX WARN: Code duplicated, block: B:1247:0x2ab7  */
    /* JADX WARN: Code duplicated, block: B:1248:0x2ac4  */
    /* JADX WARN: Code duplicated, block: B:1250:0x2b0d  */
    /* JADX WARN: Code duplicated, block: B:1253:0x2b1c  */
    /* JADX WARN: Code duplicated, block: B:1255:0x2b2e  */
    /* JADX WARN: Code duplicated, block: B:1256:0x2b3b  */
    /* JADX WARN: Code duplicated, block: B:1258:0x2b84  */
    /* JADX WARN: Code duplicated, block: B:1260:0x2b91  */
    /* JADX WARN: Code duplicated, block: B:1263:0x2ba0  */
    /* JADX WARN: Code duplicated, block: B:1264:0x2ba4  */
    /* JADX WARN: Code duplicated, block: B:1273:0x0e3a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1275:0x1728 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1277:0x1707 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1281:0x16d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0dd7  */
    /* JADX WARN: Code duplicated, block: B:467:0x0de9  */
    /* JADX WARN: Code duplicated, block: B:468:0x0dec  */
    /* JADX WARN: Code duplicated, block: B:472:0x0e23  */
    /* JADX WARN: Code duplicated, block: B:474:0x0e37  */
    /* JADX WARN: Code duplicated, block: B:477:0x0e80  */
    /* JADX WARN: Code duplicated, block: B:479:0x0e83  */
    /* JADX WARN: Code duplicated, block: B:491:0x0ece  */
    /* JADX WARN: Code duplicated, block: B:494:0x0edb  */
    /* JADX WARN: Code duplicated, block: B:495:0x0f0c  */
    /* JADX WARN: Code duplicated, block: B:498:0x0f28  */
    /* JADX WARN: Code duplicated, block: B:499:0x0f2a  */
    /* JADX WARN: Code duplicated, block: B:504:0x0f3c  */
    /* JADX WARN: Code duplicated, block: B:507:0x0f59  */
    /* JADX WARN: Code duplicated, block: B:508:0x0f5b  */
    /* JADX WARN: Code duplicated, block: B:513:0x0f68  */
    /* JADX WARN: Code duplicated, block: B:516:0x0f7b  */
    /* JADX WARN: Code duplicated, block: B:517:0x0f7d  */
    /* JADX WARN: Code duplicated, block: B:522:0x0f94  */
    /* JADX WARN: Code duplicated, block: B:525:0x0fd1  */
    /* JADX WARN: Code duplicated, block: B:528:0x0fdd  */
    /* JADX WARN: Code duplicated, block: B:529:0x0fe1  */
    /* JADX WARN: Code duplicated, block: B:532:0x103e  */
    /* JADX WARN: Code duplicated, block: B:535:0x104a  */
    /* JADX WARN: Code duplicated, block: B:536:0x104e  */
    /* JADX WARN: Code duplicated, block: B:539:0x107b  */
    /* JADX WARN: Code duplicated, block: B:541:0x107e  */
    /* JADX WARN: Code duplicated, block: B:543:0x1081  */
    /* JADX WARN: Code duplicated, block: B:545:0x1089  */
    /* JADX WARN: Code duplicated, block: B:547:0x1099  */
    /* JADX WARN: Code duplicated, block: B:550:0x10b4  */
    /* JADX WARN: Code duplicated, block: B:551:0x10b6  */
    /* JADX WARN: Code duplicated, block: B:554:0x10be  */
    /* JADX WARN: Code duplicated, block: B:555:0x10c0  */
    /* JADX WARN: Code duplicated, block: B:562:0x10e7  */
    /* JADX WARN: Code duplicated, block: B:564:0x1186  */
    /* JADX WARN: Code duplicated, block: B:566:0x11d6  */
    /* JADX WARN: Code duplicated, block: B:567:0x11d8  */
    /* JADX WARN: Code duplicated, block: B:572:0x11e6  */
    /* JADX WARN: Code duplicated, block: B:575:0x1229  */
    /* JADX WARN: Code duplicated, block: B:577:0x1236  */
    /* JADX WARN: Code duplicated, block: B:579:0x129f  */
    /* JADX WARN: Code duplicated, block: B:582:0x12a8  */
    /* JADX WARN: Code duplicated, block: B:583:0x12ab  */
    /* JADX WARN: Code duplicated, block: B:587:0x12c3  */
    /* JADX WARN: Code duplicated, block: B:588:0x12ce  */
    /* JADX WARN: Code duplicated, block: B:591:0x12e0  */
    /* JADX WARN: Code duplicated, block: B:592:0x12e2  */
    /* JADX WARN: Code duplicated, block: B:595:0x12ea  */
    /* JADX WARN: Code duplicated, block: B:597:0x12f0  */
    /* JADX WARN: Code duplicated, block: B:599:0x1345  */
    /* JADX WARN: Code duplicated, block: B:601:0x139a  */
    /* JADX WARN: Code duplicated, block: B:603:0x13ce  */
    /* JADX WARN: Code duplicated, block: B:606:0x13da  */
    /* JADX WARN: Code duplicated, block: B:607:0x13de  */
    /* JADX WARN: Code duplicated, block: B:610:0x143e  */
    /* JADX WARN: Code duplicated, block: B:612:0x144a  */
    /* JADX WARN: Code duplicated, block: B:614:0x145a  */
    /* JADX WARN: Code duplicated, block: B:615:0x1468  */
    /* JADX WARN: Code duplicated, block: B:618:0x14a0  */
    /* JADX WARN: Code duplicated, block: B:621:0x14ac  */
    /* JADX WARN: Code duplicated, block: B:622:0x14b0  */
    /* JADX WARN: Code duplicated, block: B:625:0x14f0  */
    /* JADX WARN: Code duplicated, block: B:628:0x14fc  */
    /* JADX WARN: Code duplicated, block: B:629:0x1500  */
    /* JADX WARN: Code duplicated, block: B:634:0x156f  */
    /* JADX WARN: Code duplicated, block: B:637:0x1584  */
    /* JADX WARN: Code duplicated, block: B:640:0x159a  */
    /* JADX WARN: Code duplicated, block: B:641:0x15bd  */
    /* JADX WARN: Code duplicated, block: B:643:0x1610  */
    /* JADX WARN: Code duplicated, block: B:645:0x161b  */
    /* JADX WARN: Code duplicated, block: B:647:0x164f  */
    /* JADX WARN: Code duplicated, block: B:648:0x1651  */
    /* JADX WARN: Code duplicated, block: B:655:0x1675  */
    /* JADX WARN: Code duplicated, block: B:660:0x16ae  */
    /* JADX WARN: Code duplicated, block: B:663:0x16bd  */
    /* JADX WARN: Code duplicated, block: B:665:0x16d6  */
    /* JADX WARN: Code duplicated, block: B:672:0x16fe  */
    /* JADX WARN: Code duplicated, block: B:675:0x170d  */
    /* JADX WARN: Code duplicated, block: B:681:0x1754  */
    /* JADX WARN: Code duplicated, block: B:682:0x1763  */
    /* JADX WARN: Code duplicated, block: B:688:0x1785  */
    /* JADX WARN: Code duplicated, block: B:692:0x17c4  */
    /* JADX WARN: Code duplicated, block: B:693:0x17c6  */
    /* JADX WARN: Code duplicated, block: B:700:0x17dc  */
    /* JADX WARN: Code duplicated, block: B:703:0x17f5  */
    /* JADX WARN: Code duplicated, block: B:704:0x17f7  */
    /* JADX WARN: Code duplicated, block: B:707:0x1802  */
    /* JADX WARN: Code duplicated, block: B:710:0x180d  */
    /* JADX WARN: Code duplicated, block: B:711:0x180f  */
    /* JADX WARN: Code duplicated, block: B:715:0x1825  */
    /* JADX WARN: Code duplicated, block: B:716:0x1827  */
    /* JADX WARN: Code duplicated, block: B:719:0x182f  */
    /* JADX WARN: Code duplicated, block: B:723:0x183a  */
    /* JADX WARN: Code duplicated, block: B:726:0x1851  */
    /* JADX WARN: Code duplicated, block: B:727:0x1853  */
    /* JADX WARN: Code duplicated, block: B:730:0x185b  */
    /* JADX WARN: Code duplicated, block: B:732:0x1863  */
    /* JADX WARN: Code duplicated, block: B:735:0x187a  */
    /* JADX WARN: Code duplicated, block: B:736:0x187c  */
    /* JADX WARN: Code duplicated, block: B:739:0x1882  */
    /* JADX WARN: Code duplicated, block: B:740:0x1884  */
    /* JADX WARN: Code duplicated, block: B:743:0x188c  */
    /* JADX WARN: Code duplicated, block: B:747:0x18b3  */
    /* JADX WARN: Code duplicated, block: B:750:0x18e8  */
    /* JADX WARN: Code duplicated, block: B:752:0x18f0  */
    /* JADX WARN: Code duplicated, block: B:755:0x1907  */
    /* JADX WARN: Code duplicated, block: B:756:0x1912  */
    /* JADX WARN: Code duplicated, block: B:759:0x1922  */
    /* JADX WARN: Code duplicated, block: B:762:0x1939  */
    /* JADX WARN: Code duplicated, block: B:763:0x1944  */
    /* JADX WARN: Code duplicated, block: B:773:0x1997  */
    /* JADX WARN: Code duplicated, block: B:784:0x19c1  */
    /* JADX WARN: Code duplicated, block: B:791:0x19da  */
    /* JADX WARN: Code duplicated, block: B:794:0x19e0  */
    /* JADX WARN: Code duplicated, block: B:796:0x19f6  */
    /* JADX WARN: Code duplicated, block: B:799:0x1a33  */
    /* JADX WARN: Code duplicated, block: B:800:0x1a40  */
    /* JADX WARN: Code duplicated, block: B:803:0x1a50  */
    /* JADX WARN: Code duplicated, block: B:804:0x1a5d  */
    /* JADX WARN: Code duplicated, block: B:807:0x1a6d  */
    /* JADX WARN: Code duplicated, block: B:808:0x1a79  */
    /* JADX WARN: Code duplicated, block: B:811:0x1a89  */
    /* JADX WARN: Code duplicated, block: B:812:0x1a93  */
    /* JADX WARN: Code duplicated, block: B:817:0x1aa8  */
    /* JADX WARN: Code duplicated, block: B:823:0x1ad4  */
    /* JADX WARN: Code duplicated, block: B:826:0x1ae2  */
    /* JADX WARN: Code duplicated, block: B:828:0x1af3  */
    /* JADX WARN: Code duplicated, block: B:829:0x1af6  */
    /* JADX WARN: Code duplicated, block: B:832:0x1b1a  */
    /* JADX WARN: Code duplicated, block: B:833:0x1b25  */
    /* JADX WARN: Code duplicated, block: B:836:0x1b35  */
    /* JADX WARN: Code duplicated, block: B:837:0x1b40  */
    /* JADX WARN: Code duplicated, block: B:840:0x1b50  */
    /* JADX WARN: Code duplicated, block: B:841:0x1b5d  */
    /* JADX WARN: Code duplicated, block: B:843:0x1b86  */
    /* JADX WARN: Code duplicated, block: B:846:0x1b9d  */
    /* JADX WARN: Code duplicated, block: B:848:0x1baf  */
    /* JADX WARN: Code duplicated, block: B:850:0x1bc1  */
    /* JADX WARN: Code duplicated, block: B:851:0x1bce  */
    /* JADX WARN: Code duplicated, block: B:856:0x1be6  */
    /* JADX WARN: Code duplicated, block: B:859:0x1bf7  */
    /* JADX WARN: Code duplicated, block: B:860:0x1bf9  */
    /* JADX WARN: Code duplicated, block: B:867:0x1c0a  */
    /* JADX WARN: Code duplicated, block: B:869:0x1c4a  */
    /* JADX WARN: Code duplicated, block: B:872:0x1c63  */
    /* JADX WARN: Code duplicated, block: B:874:0x1c73  */
    /* JADX WARN: Code duplicated, block: B:880:0x1cad  */
    /* JADX WARN: Code duplicated, block: B:883:0x1cc4  */
    /* JADX WARN: Code duplicated, block: B:884:0x1cd3  */
    /* JADX WARN: Code duplicated, block: B:886:0x1cee  */
    /* JADX WARN: Code duplicated, block: B:888:0x1d03  */
    /* JADX WARN: Code duplicated, block: B:891:0x1d20  */
    /* JADX WARN: Code duplicated, block: B:895:0x1d3c  */
    /* JADX WARN: Code duplicated, block: B:898:0x1d55  */
    /* JADX WARN: Code duplicated, block: B:901:0x1d60  */
    /* JADX WARN: Code duplicated, block: B:905:0x1d7b  */
    /* JADX WARN: Code duplicated, block: B:906:0x1d8d  */
    /* JADX WARN: Code duplicated, block: B:908:0x1da8  */
    /* JADX WARN: Code duplicated, block: B:911:0x1dc5  */
    /* JADX WARN: Code duplicated, block: B:913:0x1dd7  */
    /* JADX WARN: Code duplicated, block: B:914:0x1de7  */
    /* JADX WARN: Code duplicated, block: B:916:0x1e3e  */
    /* JADX WARN: Code duplicated, block: B:919:0x1e5b  */
    /* JADX WARN: Code duplicated, block: B:921:0x1e77  */
    /* JADX WARN: Code duplicated, block: B:922:0x1e83  */
    /* JADX WARN: Code duplicated, block: B:925:0x1e94  */
    /* JADX WARN: Code duplicated, block: B:932:0x1ec1  */
    /* JADX WARN: Code duplicated, block: B:935:0x1eec  */
    /* JADX WARN: Code duplicated, block: B:936:0x1ef6  */
    /* JADX WARN: Code duplicated, block: B:938:0x1f10  */
    /* JADX WARN: Code duplicated, block: B:941:0x1f2b  */
    /* JADX WARN: Code duplicated, block: B:947:0x1f58  */
    /* JADX WARN: Code duplicated, block: B:950:0x1f7e  */
    /* JADX WARN: Code duplicated, block: B:952:0x1fa0  */
    /* JADX WARN: Code duplicated, block: B:955:0x1fb9  */
    /* JADX WARN: Code duplicated, block: B:957:0x1fc5  */
    /* JADX WARN: Code duplicated, block: B:958:0x1fc7  */
    /* JADX WARN: Code duplicated, block: B:961:0x1fce  */
    /* JADX WARN: Code duplicated, block: B:962:0x1fd0  */
    /* JADX WARN: Code duplicated, block: B:965:0x1fec  */
    /* JADX WARN: Code duplicated, block: B:966:0x1fee  */
    /* JADX WARN: Code duplicated, block: B:971:0x1ffe  */
    /* JADX WARN: Code duplicated, block: B:976:0x204b  */
    /* JADX WARN: Code duplicated, block: B:977:0x2056  */
    /* JADX WARN: Code duplicated, block: B:979:0x2075  */
    /* JADX WARN: Code duplicated, block: B:982:0x209d  */
    /* JADX WARN: Code duplicated, block: B:984:0x20af  */
    /* JADX WARN: Code duplicated, block: B:987:0x20c6  */
    /* JADX WARN: Code duplicated, block: B:988:0x20d3  */
    /* JADX WARN: Code duplicated, block: B:991:0x20e3  */
    /* JADX WARN: Code duplicated, block: B:992:0x20ef  */
    /* JADX WARN: Code duplicated, block: B:995:0x20ff  */
    /* JADX WARN: Code duplicated, block: B:996:0x210a  */
    /* JADX WARN: Code duplicated, block: B:999:0x2119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v128, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v148, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v152 */
    /* JADX WARN: Type inference failed for: r14v153, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v154 */
    /* JADX WARN: Type inference failed for: r14v156, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v157, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v158, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v159 */
    /* JADX WARN: Type inference failed for: r14v160, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v161, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v162, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v163, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v164, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v165, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v166, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v169, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v170, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v171, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v174, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v175, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v176, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v177, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v178, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v179, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v181, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v183, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v185, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v187, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v190, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v193, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v195, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v199, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v201, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v205, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v221, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v222, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v224, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v226, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v228, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v230, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v231, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v233, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v286 */
    /* JADX WARN: Type inference failed for: r14v287 */
    /* JADX WARN: Type inference failed for: r14v288 */
    /* JADX WARN: Type inference failed for: r14v289 */
    /* JADX WARN: Type inference failed for: r14v290 */
    /* JADX WARN: Type inference failed for: r14v291 */
    /* JADX WARN: Type inference failed for: r14v292 */
    /* JADX WARN: Type inference failed for: r14v293 */
    /* JADX WARN: Type inference failed for: r14v294 */
    /* JADX WARN: Type inference failed for: r14v295 */
    /* JADX WARN: Type inference failed for: r14v296 */
    /* JADX WARN: Type inference failed for: r14v297 */
    /* JADX WARN: Type inference failed for: r14v298 */
    /* JADX WARN: Type inference failed for: r14v299 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r14v300 */
    /* JADX WARN: Type inference failed for: r14v301 */
    /* JADX WARN: Type inference failed for: r14v302 */
    /* JADX WARN: Type inference failed for: r14v303 */
    /* JADX WARN: Type inference failed for: r14v304 */
    /* JADX WARN: Type inference failed for: r14v305 */
    /* JADX WARN: Type inference failed for: r14v306 */
    /* JADX WARN: Type inference failed for: r14v307 */
    /* JADX WARN: Type inference failed for: r14v308 */
    /* JADX WARN: Type inference failed for: r14v309 */
    /* JADX WARN: Type inference failed for: r14v310 */
    /* JADX WARN: Type inference failed for: r14v311 */
    /* JADX WARN: Type inference failed for: r14v312 */
    /* JADX WARN: Type inference failed for: r14v313 */
    /* JADX WARN: Type inference failed for: r14v314 */
    /* JADX WARN: Type inference failed for: r14v315 */
    /* JADX WARN: Type inference failed for: r14v316 */
    /* JADX WARN: Type inference failed for: r14v317 */
    /* JADX WARN: Type inference failed for: r14v318 */
    /* JADX WARN: Type inference failed for: r14v319 */
    /* JADX WARN: Type inference failed for: r14v320 */
    /* JADX WARN: Type inference failed for: r14v321 */
    /* JADX WARN: Type inference failed for: r14v322 */
    /* JADX WARN: Type inference failed for: r14v323 */
    /* JADX WARN: Type inference failed for: r14v324 */
    /* JADX WARN: Type inference failed for: r14v325 */
    /* JADX WARN: Type inference failed for: r14v326 */
    /* JADX WARN: Type inference failed for: r14v327 */
    /* JADX WARN: Type inference failed for: r14v328 */
    /* JADX WARN: Type inference failed for: r15v209 */
    /* JADX WARN: Type inference failed for: r15v238 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94, types: [com.dh.myembyapp.data.model.ServerConfig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v15, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r18v37, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r18v56, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r18v57, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r19v33, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r1v119, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r1v191 */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v75, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r1v76, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r20v17, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r20v25, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r23v25, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v237 */
    /* JADX WARN: Type inference failed for: r30v16, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v17, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v18, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v19, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v20, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v21, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r30v22, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r32v13, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r38v9, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v147, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v208 */
    /* JADX WARN: Type inference failed for: r3v84, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v85, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r6v112, types: [androidx.compose.material3.MaterialTheme] */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r6v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v147 */
    /* JADX WARN: Type inference failed for: r8v102, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r8v148 */
    /* JADX WARN: Type inference failed for: r8v151 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v103 */
    /* JADX WARN: Type inference failed for: r9v104 */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v24, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v25, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v28, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v29, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v32, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v33, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v35, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v39, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v42, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r9v68, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void f(Function1 function1, final Function1 function2, Function1 function3, Function2 function4, Function2 function5, Function1 function6, Function0 function0, Function0 function7, Function0 function8, Function0 function9, cq0 cq0Var, zq0 zq0Var, boolean z, Composer composer, int i, int i2) {
        Object r14;
        int i3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i4;
        Object r15;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        int i5;
        Object objMutableStateOf$default;
        SnapshotMutationPolicy snapshotMutationPolicy3;
        int i6;
        Object e6Var;
        ProxyConfig proxyConfig;
        Composer composer2;
        zq0 zq0Var2;
        ServerPreferences serverPreferences;
        SnapshotMutationPolicy snapshotMutationPolicy4;
        int i7;
        Object obj;
        Object obj2;
        SnapshotMutationPolicy snapshotMutationPolicy5;
        int i8;
        MutableState mutableState;
        y32 y32Var;
        Object lp0Var;
        Context context;
        boolean z2;
        MutableState mutableState2;
        MutableState mutableState3;
        Object r8;
        int i9;
        State state;
        MutableState mutableState4;
        Object hp0Var;
        final MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        State state2;
        boolean z3;
        MutableState mutableState8;
        Continuation continuation;
        Object e6Var2;
        ServerPreferences serverPreferences2;
        zq0 zq0Var3;
        int i10;
        List listEmptyList;
        List listA;
        boolean z4;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState9;
        final MutableState mutableState10;
        List list;
        boolean z5;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Modifier.Companion companion2;
        vc vcVar;
        boolean z6;
        Object objRememberedValue3;
        boolean z7;
        boolean zChanged;
        Object objRememberedValue4;
        Alignment.Companion companion3;
        ComposeUiNode.Companion companion4;
        MutableState mutableState11;
        Function0<ComposeUiNode> constructor;
        BoxScopeInstance boxScopeInstance;
        State state3;
        FocusRequester focusRequester;
        Arrangement arrangement;
        Function0<ComposeUiNode> constructor2;
        int iOrdinal;
        int i11;
        MutableState mutableState12;
        State state4;
        lz0 lz0Var;
        final zq0 zq0Var4;
        MutableState mutableState13;
        Modifier modifierM286borderxT4_qwU;
        State state5;
        hq0 hq0Var;
        MutableState mutableState14;
        MutableState mutableState15;
        MutableState mutableState16;
        MutableState mutableState17;
        MutableState mutableState18;
        String str;
        gq0 gq0Var;
        List list2;
        List list3;
        boolean z8;
        boolean zChanged2;
        Object objRememberedValue5;
        gq0 gq0Var2;
        final MutableState mutableState19;
        boolean zChanged3;
        Object objRememberedValue6;
        ArrayList arrayList;
        Object obj3;
        boolean zChanged4;
        Object objRememberedValue7;
        ArrayList arrayList2;
        Object obj4;
        boolean zChangedInstance2;
        Object objRememberedValue8;
        Function3 function10;
        int i12;
        boolean z9;
        boolean z10;
        Object objRememberedValue9;
        final Function1 function11;
        Function1 function12;
        boolean z11;
        boolean z12;
        Object objRememberedValue10;
        Function1 function13;
        boolean z13;
        boolean z14;
        Object objRememberedValue11;
        int i13;
        boolean z15;
        boolean z16;
        Object objRememberedValue12;
        MutableState mutableState20;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objRememberedValue13;
        MutableState mutableState21;
        boolean zChangedInstance3;
        Object objRememberedValue14;
        Object objRememberedValue15;
        Composer.Companion companion5;
        Object objRememberedValue16;
        Object objRememberedValue17;
        char c;
        Object objRememberedValue18;
        Object obj5;
        MutableState mutableState22;
        Function0<ComposeUiNode> constructor3;
        Function0<ComposeUiNode> constructor4;
        Object r6;
        int i14;
        boolean zChangedInstance4;
        Object objRememberedValue19;
        Object objRememberedValue20;
        Object r16;
        Object r17;
        Function0<ComposeUiNode> constructor5;
        UserPreferences userPreferences;
        CoroutineScope coroutineScope;
        MutableState mutableState23;
        Object r18;
        ServerPreferences serverPreferences3;
        String strC;
        String host;
        boolean z20;
        boolean z21;
        int i15;
        MutableState mutableState24;
        MutableState mutableState25;
        MutableState mutableState26;
        Object r19;
        Object r110;
        Context context2;
        Object r111;
        MutableState mutableState27;
        MutableState mutableState28;
        CoroutineScope coroutineScope2;
        Object r112;
        MutableState mutableState29;
        MutableState mutableState30;
        MutableState mutableState31;
        Object r113;
        Object r3;
        CoroutineScope coroutineScope3;
        MutableState mutableState32;
        Object r9;
        ServerPreferences serverPreferences4;
        Object r114;
        int i16;
        MutableState mutableState33;
        ServerPreferences serverPreferences5;
        MutableState mutableState34;
        int i17;
        Object r115;
        vc vcVar2;
        MutableState mutableState35;
        MutableState mutableState36;
        MutableState mutableState37;
        MutableState mutableState38;
        MutableState mutableState39;
        MutableState mutableState40;
        MutableState mutableState41;
        MutableState mutableState42;
        MutableState mutableState43;
        Object r116;
        MutableState mutableState44;
        int i18;
        MutableState mutableState45;
        Object r10;
        int i19;
        MutableState mutableState46;
        UserPreferences userPreferences2;
        UserPreferences userPreferences3;
        MutableState mutableState47;
        MutableState mutableState48;
        MutableState mutableState49;
        MutableState mutableState50;
        MutableState mutableState51;
        MutableState mutableState52;
        MutableState mutableState53;
        MutableState mutableState54;
        MutableState mutableState55;
        MutableState mutableState56;
        MutableState mutableState57;
        Object r117;
        Object r118;
        MutableState mutableState58;
        int i20;
        Object r11;
        Object r1;
        Object r119;
        Object r2;
        int i21;
        Object r120;
        int i22;
        Object r121;
        Object r122;
        Object r123;
        Object objRememberedValue21;
        MutableState mutableState59;
        Object objRememberedValue22;
        MutableState mutableState60;
        Object objRememberedValue23;
        MutableState mutableState61;
        Object objRememberedValue24;
        Object objRememberedValue25;
        Composer.Companion companion6;
        ab2 ab2Var;
        boolean zChangedInstance5;
        Object objRememberedValue26;
        boolean z22;
        Object objRememberedValue27;
        Composer.Companion companion7;
        qf2 qf2Var;
        boolean zChangedInstance6;
        Object objRememberedValue28;
        int i23;
        int i24;
        int i25;
        Object objRememberedValue29;
        Object objRememberedValue30;
        Composer.Companion companion8;
        MutableState mutableState62;
        boolean zChangedInstance7;
        Object objRememberedValue31;
        Object objRememberedValue32;
        Object objRememberedValue33;
        Composer.Companion companion9;
        boolean zChangedInstance8;
        Object objRememberedValue34;
        Object objRememberedValue35;
        Composer.Companion companion10;
        MutableState mutableState63;
        y32 y32Var2;
        boolean zChangedInstance9;
        Object objRememberedValue36;
        boolean zChangedInstance10;
        Object objRememberedValue37;
        Object objRememberedValue38;
        Object objRememberedValue39;
        Object objRememberedValue40;
        Composer.Companion companion11;
        boolean zChangedInstance11;
        Object objRememberedValue41;
        Object objRememberedValue42;
        Composer.Companion companion12;
        MutableState mutableState64;
        boolean zChangedInstance12;
        MutableState mutableState65;
        Object objRememberedValue43;
        Object objRememberedValue44;
        Object objRememberedValue45;
        Composer.Companion companion13;
        boolean zChangedInstance13;
        Object objRememberedValue46;
        Object objRememberedValue47;
        Object objRememberedValue48;
        Object objRememberedValue49;
        Composer.Companion companion14;
        Object objRememberedValue50;
        MutableState mutableState66;
        Object objRememberedValue51;
        Object objRememberedValue52;
        Object objRememberedValue53;
        Object objRememberedValue54;
        Object objRememberedValue55;
        Object objRememberedValue56;
        boolean zChanged5;
        Object objRememberedValue57;
        Composer.Companion companion15;
        Object objRememberedValue58;
        Object objRememberedValue59;
        Object objRememberedValue60;
        Object objRememberedValue61;
        Object objRememberedValue62;
        boolean zChangedInstance14;
        Object ghVar;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objRememberedValue63;
        MutableState mutableState67;
        Object objRememberedValue64;
        boolean zChanged6;
        Object j1Var;
        MutableState mutableState68;
        Object objRememberedValue65;
        Object objRememberedValue66;
        Composer.Companion companion16;
        Object objRememberedValue67;
        boolean zChangedInstance15;
        Object objRememberedValue68;
        Object objRememberedValue69;
        Object objRememberedValue70;
        MutableState mutableState69;
        MutableState mutableState70;
        boolean zChangedInstance16;
        Object objRememberedValue71;
        boolean zChangedInstance17;
        Object objRememberedValue72;
        Object objRememberedValue73;
        hq0 hq0Var2;
        Object r124;
        lz0 lz0Var2;
        boolean zChangedInstance18;
        Object objRememberedValue74;
        Object objRememberedValue75;
        Object objRememberedValue76;
        Composer.Companion companion17;
        MutableState mutableState71;
        Context context3;
        boolean zChangedInstance19;
        Object objRememberedValue77;
        boolean z27;
        Object objRememberedValue78;
        Object objRememberedValue79;
        Composer.Companion companion18;
        Object objRememberedValue80;
        Object objRememberedValue81;
        Object objRememberedValue82;
        Object objRememberedValue83;
        boolean zChangedInstance20;
        Object objRememberedValue84;
        boolean z28;
        boolean z29;
        Object objRememberedValue85;
        Object objRememberedValue86;
        Object objRememberedValue87;
        ServerConfig serverById;
        ServerConfig effectiveServerConfig;
        MutableState mutableState72;
        boolean zBooleanValue;
        boolean zChanged7;
        Object objRememberedValue88;
        boolean z30;
        Object objRememberedValue89;
        boolean z31;
        boolean z32;
        Object objRememberedValue90;
        MutableState mutableState73;
        MutableState mutableState74;
        ServerPreferences serverPreferences6;
        MutableState mutableState75;
        boolean z33;
        boolean z34;
        Object objRememberedValue91;
        Object r125;
        Object objRememberedValue92;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objRememberedValue93;
        ServerPreferences serverPreferences7;
        List listCreateListBuilder;
        boolean z38;
        Iterator it;
        String alias;
        function1.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(916822889);
        int i26 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(function5) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(function6) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i26 |= composerStartRestartGroup.changedInstance(function7) ? 8388608 : 4194304;
        }
        int i27 = (i2 & 6) == 0 ? i2 | (composerStartRestartGroup.changed(cq0Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i27 |= composerStartRestartGroup.changedInstance(zq0Var) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i27 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i28 = i27;
        if (composerStartRestartGroup.shouldExecute(((i26 & 4793491) == 4793490 && (i28 & Input.Keys.NUMPAD_3) == 146) ? false : true, i26 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(916822889, i26, i28, "com.dh.myembyapp.ui.screens.home.HomeScreen (HomeScreen.kt:194)");
            }
            Object objRememberedValue94 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion19 = Composer.INSTANCE;
            if (objRememberedValue94 == companion19.getEmpty()) {
                objRememberedValue94 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rn0.a, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue94);
            }
            MutableState mutableState76 = (MutableState) objRememberedValue94;
            Object[] objArr = new Object[0];
            Object objRememberedValue95 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue95 == companion19.getEmpty()) {
                objRememberedValue95 = new h10(26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue95);
            }
            MutableState mutableState77 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue95, composerStartRestartGroup, 48);
            State stateCollectAsState = SnapshotStateKt.collectAsState(zq0Var.r(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue96 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue96 == companion19.getEmpty()) {
                objRememberedValue96 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue96);
            }
            MutableState mutableState78 = (MutableState) objRememberedValue96;
            Object objRememberedValue97 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue97 == companion19.getEmpty()) {
                objRememberedValue97 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue97;
            Object objRememberedValue98 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue98 == companion19.getEmpty()) {
                i3 = 2;
                snapshotMutationPolicy = null;
                objRememberedValue98 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue98);
            } else {
                i3 = 2;
                snapshotMutationPolicy = null;
            }
            final MutableState mutableState79 = (MutableState) objRememberedValue98;
            Object objRememberedValue99 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue99 == companion19.getEmpty()) {
                objRememberedValue99 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue99);
            }
            final MutableState mutableState80 = (MutableState) objRememberedValue99;
            Object objRememberedValue100 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue100 == companion19.getEmpty()) {
                objRememberedValue100 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue100);
            }
            MutableState mutableState81 = (MutableState) objRememberedValue100;
            Object[] objArr2 = new Object[0];
            Object objRememberedValue101 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue101 == companion19.getEmpty()) {
                objRememberedValue101 = new h10(27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue101);
            }
            MutableState mutableState82 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue101, composerStartRestartGroup, 48);
            Object objRememberedValue102 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue102 == companion19.getEmpty()) {
                i4 = 2;
                r15 = 0;
                objRememberedValue102 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue102);
            } else {
                i4 = 2;
                r15 = 0;
            }
            final MutableState mutableState83 = (MutableState) objRememberedValue102;
            Object objRememberedValue103 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue103 == companion19.getEmpty()) {
                objRememberedValue103 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r15, i4, r15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue103);
            }
            MutableState mutableState84 = (MutableState) objRememberedValue103;
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(zq0Var.y(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(zq0Var.o(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(zq0Var.p(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(zq0Var.q(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(zq0Var.u(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(zq0Var.w(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState8 = SnapshotStateKt.collectAsState(zq0Var.s(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState9 = SnapshotStateKt.collectAsState(zq0Var.x(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState10 = SnapshotStateKt.collectAsState(zq0Var.n(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState11 = SnapshotStateKt.collectAsState(zq0Var.v(), r15, composerStartRestartGroup, 0, 1);
            State stateCollectAsState12 = SnapshotStateKt.collectAsState(zq0Var.t(), r15, composerStartRestartGroup, 0, 1);
            Context context4 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue104 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue104 == companion19.getEmpty()) {
                objRememberedValue104 = new UserPreferences(context4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue104);
            }
            UserPreferences userPreferences4 = (UserPreferences) objRememberedValue104;
            Object objRememberedValue105 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue105 == companion19.getEmpty()) {
                objRememberedValue105 = new ServerPreferences(context4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue105);
            }
            ServerPreferences serverPreferences8 = (ServerPreferences) objRememberedValue105;
            Object objRememberedValue106 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue106 == companion19.getEmpty()) {
                snapshotMutationPolicy2 = null;
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableAggregateSearch()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue106 = mutableStateMutableStateOf$default;
            } else {
                snapshotMutationPolicy2 = null;
            }
            MutableState mutableState85 = (MutableState) objRememberedValue106;
            Object objRememberedValue107 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue107 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableAggregateSearchInServerSearch()), snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue107 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState86 = (MutableState) objRememberedValue107;
            boolean zBooleanValue2 = ((Boolean) mutableState86.getValue()).booleanValue();
            Object objRememberedValue108 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue108 == companion19.getEmpty()) {
                i5 = 2;
                objRememberedValue108 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getDisableTopNavFocusRefresh()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue108);
            } else {
                i5 = 2;
            }
            MutableState mutableState87 = (MutableState) objRememberedValue108;
            Object objRememberedValue109 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue109 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableTransparentTopNavButtons()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue109 = mutableStateMutableStateOf$default3;
            }
            MutableState mutableState88 = (MutableState) objRememberedValue109;
            Object objRememberedValue110 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue110 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableClickableLibrarySectionTitle()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue110 = mutableStateMutableStateOf$default4;
            }
            MutableState mutableState89 = (MutableState) objRememberedValue110;
            Object objRememberedValue111 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue111 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableLibraryRowMoreButton()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                objRememberedValue111 = mutableStateMutableStateOf$default5;
            }
            MutableState mutableState90 = (MutableState) objRememberedValue111;
            Object objRememberedValue112 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue112 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableHomeUnplayedOnly()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                objRememberedValue112 = mutableStateMutableStateOf$default6;
            }
            MutableState mutableState91 = (MutableState) objRememberedValue112;
            Object objRememberedValue113 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue113 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnablePlaybackStartupPoster()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default7);
                objRememberedValue113 = mutableStateMutableStateOf$default7;
            }
            MutableState mutableState92 = (MutableState) objRememberedValue113;
            Object objRememberedValue114 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue114 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableAggregateSearchVersionTags()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default8);
                objRememberedValue114 = mutableStateMutableStateOf$default8;
            }
            MutableState mutableState93 = (MutableState) objRememberedValue114;
            Object objRememberedValue115 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue115 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableDetailAggregateVersionRail()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default9);
                objRememberedValue115 = mutableStateMutableStateOf$default9;
            }
            MutableState mutableState94 = (MutableState) objRememberedValue115;
            Object objRememberedValue116 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue116 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableHomeBackFocusServerButton()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default10);
                objRememberedValue116 = mutableStateMutableStateOf$default10;
            }
            final MutableState mutableState95 = (MutableState) objRememberedValue116;
            Object objRememberedValue117 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue117 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableAppUpdateCheckOnStartup()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default11);
                objRememberedValue117 = mutableStateMutableStateOf$default11;
            }
            MutableState mutableState96 = (MutableState) objRememberedValue117;
            Object objRememberedValue118 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue118 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getAdminDebugFeaturesUnlocked()), null, i5, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default12);
                objRememberedValue118 = mutableStateMutableStateOf$default12;
            }
            MutableState mutableState97 = (MutableState) objRememberedValue118;
            Object objRememberedValue119 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue119 == companion19.getEmpty()) {
                objRememberedValue119 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences4.getEnableSpecialFeatures()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue119);
            }
            MutableState mutableState98 = (MutableState) objRememberedValue119;
            boolean z39 = (((i28 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(cq0Var)) || (i28 & 6) == 4;
            Object objRememberedValue120 = composerStartRestartGroup.rememberedValue();
            if (z39 || objRememberedValue120 == companion19.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(cq0Var, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue120;
            }
            MutableState mutableState99 = (MutableState) objMutableStateOf$default;
            Object[] objArr3 = {L(mutableState99).c()};
            Object objRememberedValue121 = composerStartRestartGroup.rememberedValue();
            int i29 = i26;
            if (objRememberedValue121 == companion19.getEmpty()) {
                objRememberedValue121 = new h10(28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue121);
            }
            MutableState mutableState100 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (Function0) objRememberedValue121, composerStartRestartGroup, 48);
            Object objRememberedValue122 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue122 == companion19.getEmpty()) {
                objRememberedValue122 = new ProxySettings(context4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue122);
            }
            ProxySettings proxySettings = (ProxySettings) objRememberedValue122;
            State stateCollectAsState13 = SnapshotStateKt.collectAsState(proxySettings.getProxyConfigFlow(), new ProxyConfig(false, null, null, 0, null, null, false, 127, null), null, composerStartRestartGroup, 0, 2);
            Object objRememberedValue123 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue123 == companion19.getEmpty()) {
                objRememberedValue123 = new ProxyConfigServerManager(context4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue123);
            }
            ProxyConfigServerManager proxyConfigServerManager = (ProxyConfigServerManager) objRememberedValue123;
            Object objRememberedValue124 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue124 == companion19.getEmpty()) {
                objRememberedValue124 = new lz0(context4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue124);
            }
            lz0 lz0Var3 = (lz0) objRememberedValue124;
            State stateCollectAsState14 = SnapshotStateKt.collectAsState(lz0Var3.a(L(mutableState99).c()), SetsKt.emptySet(), null, composerStartRestartGroup, 48, 2);
            Object objRememberedValue125 = composerStartRestartGroup.rememberedValue();
            lz0 lz0Var4 = lz0Var3;
            if (objRememberedValue125 == companion19.getEmpty()) {
                snapshotMutationPolicy3 = null;
                MutableState mutableStateMutableStateOf$default13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default13);
                objRememberedValue125 = mutableStateMutableStateOf$default13;
            } else {
                snapshotMutationPolicy3 = null;
            }
            final MutableState mutableState101 = (MutableState) objRememberedValue125;
            Object objRememberedValue126 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue126 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, 2, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default14);
                objRememberedValue126 = mutableStateMutableStateOf$default14;
            }
            final MutableState mutableState102 = (MutableState) objRememberedValue126;
            Object objRememberedValue127 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue127 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, 2, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default15);
                objRememberedValue127 = mutableStateMutableStateOf$default15;
            }
            final MutableState mutableState103 = (MutableState) objRememberedValue127;
            Object objRememberedValue128 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue128 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, 2, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default16);
                objRememberedValue128 = mutableStateMutableStateOf$default16;
            }
            final MutableState mutableState104 = (MutableState) objRememberedValue128;
            Object objRememberedValue129 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue129 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, 2, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default17);
                objRememberedValue129 = mutableStateMutableStateOf$default17;
            }
            final MutableState mutableState105 = (MutableState) objRememberedValue129;
            Object objRememberedValue130 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue130 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, 2, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default18);
                objRememberedValue130 = mutableStateMutableStateOf$default18;
            }
            final MutableState mutableState106 = (MutableState) objRememberedValue130;
            Object objRememberedValue131 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue131 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy3, 2, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default19);
                objRememberedValue131 = mutableStateMutableStateOf$default19;
            }
            final MutableState mutableState107 = (MutableState) objRememberedValue131;
            Object objRememberedValue132 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue132 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), snapshotMutationPolicy3, 2, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default20);
                objRememberedValue132 = mutableStateMutableStateOf$default20;
                i6 = 2;
            } else {
                i6 = 2;
            }
            final MutableState mutableState108 = (MutableState) objRememberedValue132;
            Object objRememberedValue133 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue133 == companion19.getEmpty()) {
                objRememberedValue133 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy3, snapshotMutationPolicy3, i6, snapshotMutationPolicy3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue133);
            }
            final MutableState mutableState109 = (MutableState) objRememberedValue133;
            Object objRememberedValue134 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue134 == companion19.getEmpty()) {
                objRememberedValue134 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue134);
            }
            Boolean bool = (Boolean) mutableState104.getValue();
            bool.getClass();
            ProxyConfig proxyConfigM = M(stateCollectAsState13);
            boolean zChangedInstance21 = composerStartRestartGroup.changedInstance(zq0Var) | composerStartRestartGroup.changedInstance(serverPreferences8);
            Object objRememberedValue135 = composerStartRestartGroup.rememberedValue();
            CoroutineScope coroutineScope4 = (CoroutineScope) objRememberedValue134;
            if (zChangedInstance21 || objRememberedValue135 == companion19.getEmpty()) {
                proxyConfig = proxyConfigM;
                composer2 = composerStartRestartGroup;
                e6Var = new e6(zq0Var, serverPreferences8, mutableState104, (Continuation) null, 6);
                zq0Var2 = zq0Var;
                serverPreferences = serverPreferences8;
                composer2.updateRememberedValue(e6Var);
            } else {
                composer2 = composerStartRestartGroup;
                e6Var = objRememberedValue135;
                serverPreferences = serverPreferences8;
                zq0Var2 = zq0Var;
                proxyConfig = proxyConfigM;
            }
            EffectsKt.LaunchedEffect(bool, proxyConfig, (Function2) e6Var, composer2, 0);
            Object objRememberedValue136 = composer2.rememberedValue();
            if (objRememberedValue136 == companion19.getEmpty()) {
                snapshotMutationPolicy4 = null;
                i7 = 2;
                objRememberedValue136 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue136);
            } else {
                snapshotMutationPolicy4 = null;
                i7 = 2;
            }
            final MutableState mutableState110 = (MutableState) objRememberedValue136;
            Object objRememberedValue137 = composer2.rememberedValue();
            if (objRememberedValue137 == companion19.getEmpty()) {
                objRememberedValue137 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy4, i7, snapshotMutationPolicy4);
                composer2.updateRememberedValue(objRememberedValue137);
            }
            final MutableState mutableState111 = (MutableState) objRememberedValue137;
            Object objRememberedValue138 = composer2.rememberedValue();
            if (objRememberedValue138 == companion19.getEmpty()) {
                objRememberedValue138 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy4, i7, snapshotMutationPolicy4);
                composer2.updateRememberedValue(objRememberedValue138);
            }
            final MutableState mutableState112 = (MutableState) objRememberedValue138;
            Object objRememberedValue139 = composer2.rememberedValue();
            if (objRememberedValue139 == companion19.getEmpty()) {
                objRememberedValue139 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy4, i7, snapshotMutationPolicy4);
                composer2.updateRememberedValue(objRememberedValue139);
            }
            final MutableState mutableState113 = (MutableState) objRememberedValue139;
            Object objRememberedValue140 = composer2.rememberedValue();
            if (objRememberedValue140 == companion19.getEmpty()) {
                objRememberedValue140 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy4, i7, snapshotMutationPolicy4);
                composer2.updateRememberedValue(objRememberedValue140);
            }
            final MutableState mutableState114 = (MutableState) objRememberedValue140;
            Object objRememberedValue141 = composer2.rememberedValue();
            if (objRememberedValue141 == companion19.getEmpty()) {
                objRememberedValue141 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy4, i7, snapshotMutationPolicy4);
                composer2.updateRememberedValue(objRememberedValue141);
            }
            MutableState mutableState115 = (MutableState) objRememberedValue141;
            Object objRememberedValue142 = composer2.rememberedValue();
            if (objRememberedValue142 == companion19.getEmpty()) {
                objRememberedValue142 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue142);
            }
            final MutableState mutableState116 = (MutableState) objRememberedValue142;
            Object objRememberedValue143 = composer2.rememberedValue();
            if (objRememberedValue143 == companion19.getEmpty()) {
                objRememberedValue143 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue143);
            }
            final MutableState mutableState117 = (MutableState) objRememberedValue143;
            Object objRememberedValue144 = composer2.rememberedValue();
            if (objRememberedValue144 == companion19.getEmpty()) {
                objRememberedValue144 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue144);
            }
            final MutableState mutableState118 = (MutableState) objRememberedValue144;
            Object objRememberedValue145 = composer2.rememberedValue();
            if (objRememberedValue145 == companion19.getEmpty()) {
                objRememberedValue145 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue145);
            }
            final MutableState mutableState119 = (MutableState) objRememberedValue145;
            Object objRememberedValue146 = composer2.rememberedValue();
            if (objRememberedValue146 == companion19.getEmpty()) {
                objRememberedValue146 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue146);
            }
            final MutableState mutableState120 = (MutableState) objRememberedValue146;
            Object objRememberedValue147 = composer2.rememberedValue();
            if (objRememberedValue147 == companion19.getEmpty()) {
                objRememberedValue147 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue147);
            }
            final MutableState mutableState121 = (MutableState) objRememberedValue147;
            Object objRememberedValue148 = composer2.rememberedValue();
            if (objRememberedValue148 == companion19.getEmpty()) {
                objRememberedValue148 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue148);
            }
            final MutableState mutableState122 = (MutableState) objRememberedValue148;
            Object objRememberedValue149 = composer2.rememberedValue();
            if (objRememberedValue149 == companion19.getEmpty()) {
                objRememberedValue149 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue149);
            }
            final MutableState mutableState123 = (MutableState) objRememberedValue149;
            Object objRememberedValue150 = composer2.rememberedValue();
            if (objRememberedValue150 == companion19.getEmpty()) {
                objRememberedValue150 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue150);
            }
            final MutableState mutableState124 = (MutableState) objRememberedValue150;
            Object objRememberedValue151 = composer2.rememberedValue();
            if (objRememberedValue151 == companion19.getEmpty()) {
                obj = null;
                objRememberedValue151 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue151);
            } else {
                obj = null;
            }
            final MutableState mutableState125 = (MutableState) objRememberedValue151;
            Object objRememberedValue152 = composer2.rememberedValue();
            if (objRememberedValue152 == companion19.getEmpty()) {
                objRememberedValue152 = new y32(context4);
                composer2.updateRememberedValue(objRememberedValue152);
            }
            y32 y32Var3 = (y32) objRememberedValue152;
            Composer composer3 = composer2;
            State stateCollectAsState15 = SnapshotStateKt.collectAsState(y32Var3.d, CollectionsKt.emptyList(), null, composer3, 48, 2);
            State stateCollectAsState16 = SnapshotStateKt.collectAsState(y32Var3.e, null, null, composer3, 48, 2);
            Object objRememberedValue153 = composer3.rememberedValue();
            if (objRememberedValue153 == companion19.getEmpty()) {
                objRememberedValue153 = new SubtitleFontUploadServerManager(context4);
                composer3.updateRememberedValue(objRememberedValue153);
            }
            SubtitleFontUploadServerManager subtitleFontUploadServerManager = (SubtitleFontUploadServerManager) objRememberedValue153;
            Object objRememberedValue154 = composer3.rememberedValue();
            final MutableState mutableState126 = mutableState115;
            if (objRememberedValue154 == companion19.getEmpty()) {
                snapshotMutationPolicy5 = null;
                MutableState mutableStateMutableStateOf$default21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default21);
                obj2 = mutableStateMutableStateOf$default21;
            } else {
                obj2 = objRememberedValue154;
                snapshotMutationPolicy5 = null;
            }
            MutableState mutableState127 = (MutableState) obj2;
            Object objRememberedValue155 = composer3.rememberedValue();
            if (objRememberedValue155 == companion19.getEmpty()) {
                MutableState mutableStateMutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy5, 2, snapshotMutationPolicy5);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default22);
                objRememberedValue155 = mutableStateMutableStateOf$default22;
                i8 = 2;
            } else {
                i8 = 2;
            }
            MutableState mutableState128 = (MutableState) objRememberedValue155;
            Object objRememberedValue156 = composer3.rememberedValue();
            if (objRememberedValue156 == companion19.getEmpty()) {
                objRememberedValue156 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy5, snapshotMutationPolicy5, i8, snapshotMutationPolicy5);
                composer3.updateRememberedValue(objRememberedValue156);
            }
            Object objRememberedValue157 = composer3.rememberedValue();
            final MutableState mutableState129 = (MutableState) objRememberedValue156;
            if (objRememberedValue157 == companion19.getEmpty()) {
                objRememberedValue157 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy5, snapshotMutationPolicy5, i8, snapshotMutationPolicy5);
                composer3.updateRememberedValue(objRememberedValue157);
            }
            final MutableState mutableState130 = (MutableState) objRememberedValue157;
            Object objRememberedValue158 = composer3.rememberedValue();
            if (objRememberedValue158 == companion19.getEmpty()) {
                objRememberedValue158 = new sa1(context4);
                composer3.updateRememberedValue(objRememberedValue158);
            }
            sa1 sa1Var = (sa1) objRememberedValue158;
            State stateCollectAsState17 = SnapshotStateKt.collectAsState(sa1Var.c, (t91) sa1Var.b.getValue(), null, composer3, 0, 2);
            Object objRememberedValue159 = composer3.rememberedValue();
            if (objRememberedValue159 == companion19.getEmpty()) {
                objRememberedValue159 = new OnlineSubtitleConfigServerManager(context4);
                composer3.updateRememberedValue(objRememberedValue159);
            }
            OnlineSubtitleConfigServerManager onlineSubtitleConfigServerManager = (OnlineSubtitleConfigServerManager) objRememberedValue159;
            Object objRememberedValue160 = composer3.rememberedValue();
            if (objRememberedValue160 == companion19.getEmpty()) {
                objRememberedValue160 = new qf2(context4);
                composer3.updateRememberedValue(objRememberedValue160);
            }
            qf2 qf2Var2 = (qf2) objRememberedValue160;
            State stateCollectAsState18 = SnapshotStateKt.collectAsState(qf2Var2.c, (ye2) qf2Var2.b.getValue(), null, composer3, 0, 2);
            Object objRememberedValue161 = composer3.rememberedValue();
            if (objRememberedValue161 == companion19.getEmpty()) {
                objRememberedValue161 = new pf2(context4);
                composer3.updateRememberedValue(objRememberedValue161);
            }
            pf2 pf2Var = (pf2) objRememberedValue161;
            Object objRememberedValue162 = composer3.rememberedValue();
            if (objRememberedValue162 == companion19.getEmpty()) {
                objRememberedValue162 = new WebDavSyncConfigServerManager(context4);
                composer3.updateRememberedValue(objRememberedValue162);
            }
            WebDavSyncConfigServerManager webDavSyncConfigServerManager = (WebDavSyncConfigServerManager) objRememberedValue162;
            Object objRememberedValue163 = composer3.rememberedValue();
            if (objRememberedValue163 == companion19.getEmpty()) {
                objRememberedValue163 = new ab2(context4);
                composer3.updateRememberedValue(objRememberedValue163);
            }
            ab2 ab2Var2 = (ab2) objRememberedValue163;
            State stateCollectAsState19 = SnapshotStateKt.collectAsState(ab2Var2.b, ab2Var2.a(), null, composer3, 0, 2);
            Object objRememberedValue164 = composer3.rememberedValue();
            ab2 ab2Var3 = ab2Var2;
            if (objRememberedValue164 == companion19.getEmpty()) {
                objRememberedValue164 = new xa2(context4);
                composer3.updateRememberedValue(objRememberedValue164);
            }
            xa2 xa2Var = (xa2) objRememberedValue164;
            vc vcVarB = bd.b(composer3);
            Boolean bool2 = (Boolean) mutableState96.getValue();
            bool2.getClass();
            boolean zChanged8 = composer3.changed(vcVarB);
            qf2 qf2Var3 = qf2Var2;
            Object objRememberedValue165 = composer3.rememberedValue();
            if (zChanged8 || objRememberedValue165 == companion19.getEmpty()) {
                mutableState = mutableState96;
                objRememberedValue165 = new h6(vcVarB, mutableState, null, 1);
                composer3.updateRememberedValue(objRememberedValue165);
            } else {
                mutableState = mutableState96;
            }
            EffectsKt.LaunchedEffect(bool2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue165, composer3, 0);
            Boolean bool3 = (Boolean) mutableState120.getValue();
            bool3.getClass();
            boolean zChangedInstance22 = composer3.changedInstance(subtitleFontUploadServerManager) | composer3.changedInstance(y32Var3);
            Object objRememberedValue166 = composer3.rememberedValue();
            if (zChangedInstance22 || objRememberedValue166 == companion19.getEmpty()) {
                y32Var = y32Var3;
                objRememberedValue166 = new k6(subtitleFontUploadServerManager, mutableState120, mutableState127, mutableState128, y32Var, mutableState130, mutableState119, null, 1);
                composer3.updateRememberedValue(objRememberedValue166);
            } else {
                y32Var = y32Var3;
            }
            EffectsKt.LaunchedEffect(bool3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue166, composer3, 0);
            String strC2 = L(mutableState99).c();
            Boolean bool4 = (Boolean) mutableState91.getValue();
            bool4.getClass();
            int i30 = i28 & 896;
            boolean zChanged9 = composer3.changed(mutableState99) | composer3.changedInstance(zq0Var2) | composer3.changedInstance(context4) | (i30 == 256);
            Object objRememberedValue167 = composer3.rememberedValue();
            if (zChanged9 || objRememberedValue167 == companion19.getEmpty()) {
                Composer composer4 = composer3;
                lp0Var = new lp0(zq0Var2, context4, z, mutableState99, mutableState91, (Continuation) null);
                context = context4;
                z2 = z;
                mutableState2 = mutableState99;
                mutableState3 = mutableState91;
                composer4.updateRememberedValue(lp0Var);
                r8 = composer4;
            } else {
                context = context4;
                r8 = composer3;
                lp0Var = objRememberedValue167;
                z2 = z;
                mutableState2 = mutableState99;
                mutableState3 = mutableState91;
            }
            EffectsKt.LaunchedEffect(strC2, bool4, (Function2) lp0Var, r8, 0);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zChangedInstance23 = (i30 == 256) | r8.changedInstance(zq0Var2);
            Object objRememberedValue168 = r8.rememberedValue();
            if (zChangedInstance23 || objRememberedValue168 == companion19.getEmpty()) {
                objRememberedValue168 = new jp0(z2, zq0Var2, null, 4);
                r8.updateRememberedValue(objRememberedValue168);
            }
            int i31 = (i28 >> 6) & 14;
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue168, (Composer) r8, i31);
            rn0 rn0VarG = G(mutableState76);
            Object objRememberedValue169 = r8.rememberedValue();
            if (objRememberedValue169 == companion19.getEmpty()) {
                i9 = 0;
                objRememberedValue169 = new gp0(mutableState76, null, 0);
                r8.updateRememberedValue(objRememberedValue169);
            } else {
                i9 = 0;
            }
            EffectsKt.LaunchedEffect(rn0VarG, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue169, (Composer) r8, i9);
            String str2 = (String) stateCollectAsState3.getValue();
            rn0 rn0VarL = l(stateCollectAsState);
            boolean zChanged10 = r8.changed(stateCollectAsState3) | r8.changed(stateCollectAsState);
            Object objRememberedValue170 = r8.rememberedValue();
            if (zChanged10 || objRememberedValue170 == companion19.getEmpty()) {
                objRememberedValue170 = new e6((Object) stateCollectAsState3, mutableState76, stateCollectAsState, (Continuation) null, 4);
                state = stateCollectAsState3;
                mutableState4 = mutableState76;
                r8.updateRememberedValue(objRememberedValue170);
            } else {
                mutableState4 = mutableState76;
                state = stateCollectAsState3;
            }
            EffectsKt.LaunchedEffect(str2, rn0VarL, (Function2) objRememberedValue170, r8, 0);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            rn0 rn0VarG2 = G(mutableState4);
            String str3 = (String) state.getValue();
            Boolean boolValueOf3 = Boolean.valueOf(C(stateCollectAsState7));
            Boolean bool5 = (Boolean) mutableState100.getValue();
            bool5.getClass();
            int i32 = 3;
            Object[] objArr4 = {boolValueOf2, rn0VarG2, str3, boolValueOf3, bool5};
            boolean zChanged11 = (i30 == 256) | r8.changed(mutableState100) | r8.changed(state) | r8.changed(stateCollectAsState7);
            Object objRememberedValue171 = r8.rememberedValue();
            if (zChanged11 || objRememberedValue171 == companion19.getEmpty()) {
                mutableState5 = mutableState81;
                mutableState6 = mutableState4;
                mutableState7 = mutableState78;
                hp0Var = new hp0(z2, mutableState6, mutableState100, state, stateCollectAsState7, mutableState7, mutableState5, null);
                state2 = stateCollectAsState7;
                r8.updateRememberedValue(hp0Var);
            } else {
                state2 = stateCollectAsState7;
                mutableState6 = mutableState4;
                mutableState7 = mutableState78;
                mutableState5 = mutableState81;
                hp0Var = objRememberedValue171;
            }
            EffectsKt.LaunchedEffect(objArr4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) hp0Var, (Composer) r8, 0);
            Object[] objArr5 = {Boolean.valueOf(z), G(mutableState6), Boolean.valueOf(C(state2)), D(stateCollectAsState8), (String) state.getValue()};
            boolean zChanged12 = (i30 == 256) | r8.changed(state2) | r8.changed(state) | r8.changed(stateCollectAsState8) | r8.changed(mutableState100);
            Object objRememberedValue172 = r8.rememberedValue();
            if (zChanged12 || objRememberedValue172 == companion19.getEmpty()) {
                MutableState mutableState131 = mutableState7;
                ip0 ip0Var = new ip0(z, mutableState6, state2, state, stateCollectAsState8, mutableState100, mutableState131, mutableState5, mutableState80, null);
                z3 = z;
                mutableState7 = mutableState131;
                r8.updateRememberedValue(ip0Var);
                objRememberedValue172 = ip0Var;
            } else {
                z3 = z;
            }
            EffectsKt.LaunchedEffect(objArr5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue172, (Composer) r8, 0);
            Boolean boolValueOf4 = Boolean.valueOf(z3);
            boolean z40 = i30 == 256;
            Object objRememberedValue173 = r8.rememberedValue();
            if (z40 || objRememberedValue173 == companion19.getEmpty()) {
                mutableState8 = mutableState84;
                continuation = null;
                objRememberedValue173 = new jp0(z3, mutableState8, continuation, 0);
                r8.updateRememberedValue(objRememberedValue173);
            } else {
                mutableState8 = mutableState84;
                continuation = null;
            }
            EffectsKt.LaunchedEffect(boolValueOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue173, (Composer) r8, i31);
            String strC3 = L(mutableState2).c();
            ServerPreferences serverPreferences9 = serverPreferences;
            Object serverById2 = strC3 != null ? serverPreferences9.getServerById(strC3) : continuation;
            Boolean bool6 = (Boolean) mutableState103.getValue();
            bool6.getClass();
            ProxyConfig proxyConfigM2 = M(stateCollectAsState13);
            boolean zChangedInstance24 = r8.changedInstance(serverById2) | r8.changedInstance(zq0Var2);
            Object objRememberedValue174 = r8.rememberedValue();
            if (zChangedInstance24 || objRememberedValue174 == companion19.getEmpty()) {
                zq0 zq0Var5 = zq0Var2;
                serverPreferences2 = serverPreferences9;
                e6Var2 = new e6((Object) serverById2, zq0Var5, mutableState103, (Continuation) null, 5);
                zq0Var3 = zq0Var5;
                r8.updateRememberedValue(e6Var2);
            } else {
                e6Var2 = objRememberedValue174;
                zq0Var3 = zq0Var2;
                serverPreferences2 = serverPreferences9;
            }
            Object r126 = r8;
            EffectsKt.LaunchedEffect(bool6, serverById2, proxyConfigM2, (Function2) e6Var2, r126, ServerConfig.$stable << 3);
            Object r127 = r126;
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance25 = r127.changedInstance(zq0Var3);
            Object objRememberedValue175 = r127.rememberedValue();
            if (zChangedInstance25) {
                i10 = i28;
            } else {
                i10 = i28;
                if (objRememberedValue175 == companion19.getEmpty()) {
                }
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue175, (Composer) r127, 6);
                if (serverById2 != 0) {
                    listCreateListBuilder = CollectionsKt.createListBuilder();
                    String displayAddress = serverById2.getDisplayAddress();
                    if (L(mutableState2).e == null) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    listCreateListBuilder.add(new tn0(null, "主线路", displayAddress, z38, true, null, null, null, (ServerPingState) ((Map) stateCollectAsState12.getValue()).get(null), null, 1504));
                    for (it = serverById2.getBackupRoutesSafe().iterator(); it.hasNext(); it = it) {
                        BackupRouteConfig backupRouteConfig = (BackupRouteConfig) it.next();
                        String id = backupRouteConfig.getId();
                        alias = backupRouteConfig.getAlias();
                        if (StringsKt.isBlank(alias)) {
                            alias = "未命名线路";
                        }
                        listCreateListBuilder.add(new tn0(id, alias, backupRouteConfig.getDisplayAddress(), Intrinsics.areEqual(L(mutableState2).e, backupRouteConfig.getId()), false, null, null, null, (ServerPingState) ((Map) stateCollectAsState12.getValue()).get(backupRouteConfig.getId()), null, 1504));
                    }
                    listEmptyList = CollectionsKt.build(listCreateListBuilder);
                } else {
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                listA = zy1.a(serverPreferences2.getAllServers(), L(mutableState2).c(), ((Boolean) mutableState85.getValue()).booleanValue(), false, F(stateCollectAsState11), "查看、添加或编辑服务器");
                if (z3 || ((Boolean) vcVarB.e.getValue()).booleanValue() || vcVarB.e() || ((String) vcVarB.g.getValue()) != null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                objRememberedValue = r127.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    mutableState9 = mutableState8;
                    final MutableState mutableState132 = mutableState7;
                    final MutableState mutableState133 = mutableState6;
                    objRememberedValue = new Function0() { // from class: zn0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState mutableState134;
                            Number number;
                            MutableState mutableState135 = mutableState133;
                            rn0 rn0Var = (rn0) mutableState135.getValue();
                            MutableState mutableState136 = mutableState104;
                            if (((Boolean) mutableState136.getValue()).booleanValue()) {
                                mutableState136.setValue(Boolean.FALSE);
                            } else {
                                MutableState mutableState137 = mutableState120;
                                boolean zBooleanValue3 = ((Boolean) mutableState137.getValue()).booleanValue();
                                MutableState mutableState138 = mutableState119;
                                if (zBooleanValue3) {
                                    mutableState137.setValue(Boolean.FALSE);
                                    Unit unit2 = Unit.INSTANCE;
                                    bq0.p(mutableState138, true);
                                } else {
                                    MutableState mutableState139 = mutableState129;
                                    if (((String) mutableState139.getValue()) != null) {
                                        mutableState139.setValue(null);
                                    } else {
                                        MutableState mutableState140 = mutableState130;
                                        if (((String) mutableState140.getValue()) != null) {
                                            mutableState140.setValue(null);
                                        } else {
                                            MutableState mutableState141 = mutableState111;
                                            boolean zBooleanValue4 = ((Boolean) mutableState141.getValue()).booleanValue();
                                            MutableState mutableState142 = mutableState110;
                                            if (zBooleanValue4) {
                                                mutableState141.setValue(Boolean.FALSE);
                                                Unit unit3 = Unit.INSTANCE;
                                                bq0.n(mutableState142, true);
                                            } else {
                                                MutableState mutableState143 = mutableState112;
                                                if (((Boolean) mutableState143.getValue()).booleanValue()) {
                                                    mutableState143.setValue(Boolean.FALSE);
                                                    Unit unit4 = Unit.INSTANCE;
                                                    bq0.n(mutableState142, true);
                                                } else {
                                                    MutableState mutableState144 = mutableState113;
                                                    if (((Boolean) mutableState144.getValue()).booleanValue()) {
                                                        mutableState144.setValue(Boolean.FALSE);
                                                        Unit unit5 = Unit.INSTANCE;
                                                        bq0.n(mutableState142, true);
                                                    } else {
                                                        MutableState mutableState145 = mutableState114;
                                                        if (((Boolean) mutableState145.getValue()).booleanValue()) {
                                                            mutableState145.setValue(Boolean.FALSE);
                                                            Unit unit6 = Unit.INSTANCE;
                                                            bq0.n(mutableState142, true);
                                                        } else {
                                                            MutableState mutableState146 = mutableState126;
                                                            if (((Boolean) mutableState146.getValue()).booleanValue()) {
                                                                mutableState146.setValue(Boolean.FALSE);
                                                                Unit unit7 = Unit.INSTANCE;
                                                                bq0.n(mutableState142, true);
                                                            } else {
                                                                MutableState mutableState147 = mutableState116;
                                                                if (((Boolean) mutableState147.getValue()).booleanValue()) {
                                                                    mutableState147.setValue(Boolean.FALSE);
                                                                    Unit unit8 = Unit.INSTANCE;
                                                                    bq0.n(mutableState142, true);
                                                                } else {
                                                                    MutableState mutableState148 = mutableState117;
                                                                    if (((Boolean) mutableState148.getValue()).booleanValue()) {
                                                                        mutableState148.setValue(Boolean.FALSE);
                                                                        Unit unit9 = Unit.INSTANCE;
                                                                        bq0.n(mutableState142, true);
                                                                    } else {
                                                                        MutableState mutableState149 = mutableState118;
                                                                        if (((Boolean) mutableState149.getValue()).booleanValue()) {
                                                                            mutableState149.setValue(Boolean.FALSE);
                                                                            Unit unit10 = Unit.INSTANCE;
                                                                            bq0.n(mutableState142, true);
                                                                        } else if (((Boolean) mutableState138.getValue()).booleanValue()) {
                                                                            mutableState138.setValue(Boolean.FALSE);
                                                                            Unit unit11 = Unit.INSTANCE;
                                                                            bq0.n(mutableState142, true);
                                                                        } else {
                                                                            MutableState mutableState150 = mutableState121;
                                                                            if (((Boolean) mutableState150.getValue()).booleanValue()) {
                                                                                mutableState150.setValue(Boolean.FALSE);
                                                                                Unit unit12 = Unit.INSTANCE;
                                                                                bq0.n(mutableState142, true);
                                                                            } else {
                                                                                MutableState mutableState151 = mutableState122;
                                                                                if (((Boolean) mutableState151.getValue()).booleanValue()) {
                                                                                    mutableState151.setValue(Boolean.FALSE);
                                                                                    Unit unit13 = Unit.INSTANCE;
                                                                                    bq0.n(mutableState142, true);
                                                                                } else {
                                                                                    MutableState mutableState152 = mutableState123;
                                                                                    if (((Boolean) mutableState152.getValue()).booleanValue()) {
                                                                                        mutableState152.setValue(Boolean.FALSE);
                                                                                        Unit unit14 = Unit.INSTANCE;
                                                                                        bq0.n(mutableState142, true);
                                                                                    } else {
                                                                                        MutableState mutableState153 = mutableState125;
                                                                                        if (((Boolean) mutableState153.getValue()).booleanValue()) {
                                                                                            mutableState153.setValue(Boolean.FALSE);
                                                                                            Unit unit15 = Unit.INSTANCE;
                                                                                            bq0.n(mutableState142, true);
                                                                                        } else if (((Boolean) mutableState142.getValue()).booleanValue()) {
                                                                                            mutableState142.setValue(Boolean.FALSE);
                                                                                        } else if (!((Boolean) mutableState124.getValue()).booleanValue()) {
                                                                                            MutableState mutableState154 = mutableState103;
                                                                                            if (((Boolean) mutableState154.getValue()).booleanValue()) {
                                                                                                mutableState154.setValue(Boolean.FALSE);
                                                                                            } else {
                                                                                                MutableState mutableState155 = mutableState101;
                                                                                                if (((Boolean) mutableState155.getValue()).booleanValue()) {
                                                                                                    mutableState155.setValue(Boolean.FALSE);
                                                                                                    bq0.k(mutableState102, false);
                                                                                                } else {
                                                                                                    MutableState mutableState156 = mutableState105;
                                                                                                    if (((Boolean) mutableState156.getValue()).booleanValue()) {
                                                                                                        mutableState156.setValue(Boolean.FALSE);
                                                                                                    } else {
                                                                                                        MutableState mutableState157 = mutableState107;
                                                                                                        boolean zBooleanValue5 = ((Boolean) mutableState157.getValue()).booleanValue();
                                                                                                        MutableState mutableState158 = mutableState108;
                                                                                                        if (zBooleanValue5) {
                                                                                                            bq0.h(mutableState109, mutableState157, mutableState158);
                                                                                                        } else {
                                                                                                            MutableState mutableState159 = mutableState106;
                                                                                                            if (((Boolean) mutableState159.getValue()).booleanValue()) {
                                                                                                                mutableState159.setValue(Boolean.FALSE);
                                                                                                                mutableState158.setValue(CollectionsKt.emptyList());
                                                                                                            } else {
                                                                                                                MutableState mutableState160 = mutableState79;
                                                                                                                if (((Boolean) mutableState160.getValue()).booleanValue()) {
                                                                                                                    mutableState160.setValue(Boolean.FALSE);
                                                                                                                } else {
                                                                                                                    rn0 rn0Var2 = rn0.a;
                                                                                                                    MutableState mutableState161 = mutableState132;
                                                                                                                    if (rn0Var != rn0Var2) {
                                                                                                                        mutableState135.setValue(rn0Var2);
                                                                                                                        bq0.o(mutableState161, true);
                                                                                                                        MutableState mutableState162 = mutableState5;
                                                                                                                        mr.A((Number) mutableState162.getValue(), 1, mutableState162);
                                                                                                                        mutableState160.setValue(Boolean.FALSE);
                                                                                                                    } else if (!((Boolean) mutableState95.getValue()).booleanValue() || ((Boolean) mutableState9.getValue()).booleanValue()) {
                                                                                                                        mutableState160.setValue(Boolean.TRUE);
                                                                                                                    } else {
                                                                                                                        if (((Boolean) mutableState161.getValue()).booleanValue()) {
                                                                                                                            mutableState134 = mutableState80;
                                                                                                                            number = (Number) mutableState134.getValue();
                                                                                                                        } else {
                                                                                                                            mutableState134 = mutableState83;
                                                                                                                            number = (Number) mutableState134.getValue();
                                                                                                                        }
                                                                                                                        mr.A(number, 1, mutableState134);
                                                                                                                        mutableState160.setValue(Boolean.FALSE);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mutableState10 = mutableState133;
                    mutableState126 = mutableState126;
                    mutableState116 = mutableState116;
                    mutableState95 = mutableState95;
                    mutableState129 = mutableState129;
                    mutableState110 = mutableState110;
                    r127.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState9 = mutableState8;
                    mutableState10 = mutableState6;
                }
                list = listEmptyList;
                BackHandlerKt.BackHandler(z4, (Function0) objRememberedValue, r127, 48, 0);
                Boolean boolValueOf5 = Boolean.valueOf(z3);
                if (i30 == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zChangedInstance = z5 | r127.changedInstance(zq0Var3);
                objRememberedValue2 = r127.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new to0(0, zq0Var3, z3);
                    r127.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.DisposableEffect(boolValueOf5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, (Composer) r127, i31);
                companion2 = Modifier.INSTANCE;
                vcVar = vcVarB;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                if (i30 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objRememberedValue3 = r127.rememberedValue();
                if (z6 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new uo0(z3, 0);
                    r127.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxSize$default, (Function1) objRememberedValue3);
                if (i30 == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChanged = z7 | r127.changed(state2) | r127.changedInstance(zq0Var3);
                objRememberedValue4 = r127.rememberedValue();
                if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new kp0(z3, zq0Var3, mutableState10, state2);
                    r127.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierGraphicsLayer, (Function1) objRememberedValue4);
                companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int iB = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                CompositionLocalMap currentCompositionLocalMap = r127.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(r127, modifierOnPreviewKeyEvent);
                companion4 = ComposeUiNode.INSTANCE;
                mutableState11 = mutableState2;
                constructor = companion4.getConstructor();
                if (!id.n(r127.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                r127.startReusableNode();
                if (r127.getInserting()) {
                    r127.createNode(constructor);
                } else {
                    r127.useNode();
                }
                Composer composerM4318constructorimpl = Updater.m4318constructorimpl(r127);
                mr.z(companion4, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(iB), composerM4318constructorimpl));
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                state3 = state2;
                focusRequester = focusRequester2;
                Modifier modifierFocusGroup = FocusableKt.focusGroup(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), focusRequester));
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), r127, 0);
                int iB2 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                CompositionLocalMap currentCompositionLocalMap2 = r127.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(r127, modifierFocusGroup);
                constructor2 = companion4.getConstructor();
                if (!id.n(r127.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                r127.startReusableNode();
                if (r127.getInserting()) {
                    r127.createNode(constructor2);
                } else {
                    r127.useNode();
                }
                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(r127);
                mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(iB2), composerM4318constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                iOrdinal = G(mutableState10).ordinal();
                if (iOrdinal != 0) {
                    focusRequester = focusRequester;
                    i11 = i10;
                    mutableState12 = mutableState109;
                    vcVar = vcVar;
                    state4 = stateCollectAsState10;
                    mutableState126 = mutableState126;
                    mutableState120 = mutableState120;
                    mutableState116 = mutableState116;
                    mutableState110 = mutableState110;
                    mutableState111 = mutableState111;
                    mutableState112 = mutableState112;
                    mutableState113 = mutableState113;
                    mutableState114 = mutableState114;
                    mutableState117 = mutableState117;
                    mutableState118 = mutableState118;
                    mutableState121 = mutableState121;
                    mutableState122 = mutableState122;
                    mutableState123 = mutableState123;
                    lz0Var = lz0Var4;
                    mutableState119 = mutableState119;
                    ab2Var3 = ab2Var3;
                    zq0Var4 = zq0Var3;
                    mutableState13 = mutableState7;
                    modifierM286borderxT4_qwU = companion2;
                    mutableState129 = mutableState129;
                    state5 = state;
                    r127.startReplaceGroup(-1697239098);
                    hq0Var = (hq0) stateCollectAsState2.getValue();
                    if (hq0Var instanceof fq0) {
                        r127.startReplaceGroup(-1697475876);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifierM286borderxT4_qwU, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        int iB3 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = r127.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(r127, modifierFillMaxSize$default2);
                        constructor5 = companion4.getConstructor();
                        if (!id.n(r127.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        r127.startReusableNode();
                        if (r127.getInserting()) {
                            r127.createNode(constructor5);
                        } else {
                            r127.useNode();
                        }
                        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(r127);
                        mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(iB3), composerM4318constructorimpl3));
                        ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, r127, 0, 63);
                        Object r128 = r127;
                        r128.endNode();
                        r128.endReplaceGroup();
                        mutableState14 = mutableState102;
                        mutableState21 = mutableState10;
                        mutableState15 = mutableState104;
                        mutableState16 = mutableState103;
                        c = 23;
                        str = null;
                        mutableState17 = mutableState106;
                        r16 = r128;
                    } else {
                        mutableState14 = mutableState102;
                        mutableState15 = mutableState104;
                        mutableState16 = mutableState103;
                        mutableState17 = mutableState106;
                        if (hq0Var instanceof eq0) {
                            r127.startReplaceGroup(-1697072938);
                            objRememberedValue18 = r127.rememberedValue();
                            if (objRememberedValue18 == companion.getEmpty()) {
                                obj5 = null;
                                objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                r127.updateRememberedValue(objRememberedValue18);
                            } else {
                                obj5 = null;
                            }
                            mutableState22 = (MutableState) objRememberedValue18;
                            MutableState mutableState134 = mutableState10;
                            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifierM286borderxT4_qwU, 0.0f, 1, obj5);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                            int iB4 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                            CompositionLocalMap currentCompositionLocalMap4 = r127.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(r127, modifierFillMaxSize$default3);
                            constructor3 = companion4.getConstructor();
                            if (!id.n(r127.getApplier())) {
                                ComposablesKt.invalidApplier();
                            }
                            r127.startReusableNode();
                            if (r127.getInserting()) {
                                r127.createNode(constructor3);
                            } else {
                                r127.useNode();
                            }
                            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(r127);
                            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(iB4), composerM4318constructorimpl4));
                            MeasurePolicy measurePolicyP = mr.p(16.0f, arrangement, companion3.getCenterHorizontally(), r127, 54);
                            int iB5 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                            CompositionLocalMap currentCompositionLocalMap5 = r127.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(r127, modifierM286borderxT4_qwU);
                            constructor4 = companion4.getConstructor();
                            if (!id.n(r127.getApplier())) {
                                ComposablesKt.invalidApplier();
                            }
                            r127.startReusableNode();
                            if (r127.getInserting()) {
                                r127.createNode(constructor4);
                            } else {
                                r127.useNode();
                            }
                            Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(r127);
                            mr.z(companion4, composerM4318constructorimpl5, measurePolicyP, composerM4318constructorimpl5, currentCompositionLocalMap5);
                            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl5, Integer.valueOf(iB5), composerM4318constructorimpl5));
                            String strA = ((eq0) hq0Var).a();
                            r6 = MaterialTheme.INSTANCE;
                            i14 = MaterialTheme.$stable;
                            str = null;
                            TextKt.m3048TextNvy7gAk(strA, null, r6.getColorScheme(r127, i14).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r6.getTypography(r127, i14).getBodyLarge(), r127, 0, 0, 131066);
                            zChangedInstance4 = r127.changedInstance(zq0Var4);
                            objRememberedValue19 = r127.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue19 == companion.getEmpty()) {
                                final int i33 = 0;
                                objRememberedValue19 = new Function0() { // from class: vo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i34 = i33;
                                        zq0 zq0Var6 = zq0Var4;
                                        switch (i34) {
                                            case 0:
                                                zq0Var6.E(false, false);
                                                break;
                                            case 1:
                                                zq0Var6.k.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                zq0Var6.E(false, false);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue19);
                            }
                            Function0 function14 = (Function0) objRememberedValue19;
                            objRememberedValue20 = r127.rememberedValue();
                            if (objRememberedValue20 == companion.getEmpty()) {
                                objRememberedValue20 = new h70(18, mutableState22);
                                r127.updateRememberedValue(objRememberedValue20);
                            }
                            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM286borderxT4_qwU, (Function1) objRememberedValue20);
                            if (x(mutableState22)) {
                                r127.startReplaceGroup(492049091);
                                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierM286borderxT4_qwU, Dp.m7813constructorimpl(3.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), r6.getShapes(r127, i14).getMedium());
                                r127.endReplaceGroup();
                            } else {
                                r127.startReplaceGroup(492432096);
                                r127.endReplaceGroup();
                            }
                            ButtonKt.Button(function14, modifierOnFocusChanged.then(modifierM286borderxT4_qwU), false, null, null, null, null, null, null, et.k(), r127, 805306368, 508);
                            r127.endNode();
                            r127.endNode();
                            r127.endReplaceGroup();
                            r16 = r127;
                            mutableState14 = mutableState14;
                            mutableState21 = mutableState134;
                            c = 23;
                        } else {
                            lz0Var = lz0Var;
                            mutableState18 = mutableState10;
                            str = null;
                            if (hq0Var instanceof gq0) {
                                r127.startReplaceGroup(360892348);
                                r127.endReplaceGroup();
                                qu.f();
                                return;
                            }
                            r127.startReplaceGroup(-1694909231);
                            Boolean boolValueOf6 = Boolean.valueOf(z);
                            rn0 rn0VarG3 = G(mutableState18);
                            gq0Var = (gq0) hq0Var;
                            list2 = gq0Var.c;
                            list3 = gq0Var.a;
                            Object[] objArr6 = {boolValueOf6, rn0VarG3, list3, (ItemCounts) state4.getValue()};
                            if (i30 == 256) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            zChanged2 = z8 | r127.changed(hq0Var) | r127.changed(state4) | r127.changedInstance(zq0Var4);
                            objRememberedValue5 = r127.rememberedValue();
                            if (!zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                                gq0Var2 = gq0Var;
                                objRememberedValue5 = new lp0(z, gq0Var2, zq0Var4, mutableState18, state4, (Continuation) null);
                                mutableState19 = mutableState18;
                                r127.updateRememberedValue(objRememberedValue5);
                            } else {
                                gq0Var2 = gq0Var;
                                mutableState19 = mutableState18;
                            }
                            EffectsKt.LaunchedEffect(objArr6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, (Composer) r127, 0);
                            zChanged3 = r127.changed((Set) stateCollectAsState14.getValue()) | r127.changed(list3);
                            objRememberedValue6 = r127.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                                obj3 = objRememberedValue6;
                                arrayList = new ArrayList();
                                for (Object obj6 : list3) {
                                    if (!((Set) stateCollectAsState14.getValue()).contains(((Library) obj6).getId())) {
                                        arrayList.add(obj6);
                                    }
                                }
                                r127.updateRememberedValue(arrayList);
                                obj3 = arrayList;
                            }
                            obj3 = objRememberedValue6;
                            List list4 = (List) obj3;
                            zChanged4 = r127.changed((Set) stateCollectAsState14.getValue()) | r127.changed(list2);
                            objRememberedValue7 = r127.rememberedValue();
                            if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                obj4 = objRememberedValue7;
                                arrayList2 = new ArrayList();
                                for (Object obj7 : list2) {
                                    if (!((Set) stateCollectAsState14.getValue()).contains(((rx0) obj7).getLibrary().getId())) {
                                        arrayList2.add(obj7);
                                    }
                                }
                                r127.updateRememberedValue(arrayList2);
                                obj4 = arrayList2;
                            }
                            obj4 = objRememberedValue7;
                            List list5 = (List) obj4;
                            List listB = gq0Var2.b();
                            String str4 = (String) state5.getValue();
                            Integer numZ = z(stateCollectAsState4);
                            String strA2 = A(stateCollectAsState5);
                            String strB = B(stateCollectAsState6);
                            boolean zC = C(state3);
                            boolean zE = E(stateCollectAsState9);
                            if (function5 == null) {
                                r127.startReplaceGroup(-1689383606);
                                r127.endReplaceGroup();
                                function10 = null;
                            } else {
                                r127.startReplaceGroup(-1689383605);
                                zChangedInstance2 = r127.changedInstance(zq0Var4) | r127.changed(function5);
                                objRememberedValue8 = r127.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new ph(zq0Var4, function5, mutableState19, 5);
                                    r127.updateRememberedValue(objRememberedValue8);
                                }
                                r127.endReplaceGroup();
                                function10 = (Function3) objRememberedValue8;
                            }
                            boolean zBooleanValue3 = ((Boolean) mutableState89.getValue()).booleanValue();
                            boolean zBooleanValue4 = ((Boolean) mutableState90.getValue()).booleanValue();
                            ItemCounts itemCounts = (ItemCounts) state4.getValue();
                            int iIntValue = ((Number) mutableState83.getValue()).intValue();
                            boolean zChangedInstance26 = r127.changedInstance(zq0Var4);
                            i12 = i29 & 14;
                            if (i12 == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 = z9 | zChangedInstance26;
                            objRememberedValue9 = r127.rememberedValue();
                            if (!z10 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                function11 = function1;
                                final int i34 = 0;
                                objRememberedValue9 = new Function1() { // from class: wo0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj8) {
                                        int i35 = i34;
                                        MutableState mutableState135 = mutableState19;
                                        Function1 function15 = function11;
                                        zq0 zq0Var6 = zq0Var4;
                                        String str5 = (String) obj8;
                                        switch (i35) {
                                            case 0:
                                                str5.getClass();
                                                Objects.toString((rn0) mutableState135.getValue());
                                                zq0Var6.P((rn0) mutableState135.getValue());
                                                zq0.O(zq0Var6, str5, "我的媒体", sn0.b, 12);
                                                function15.invoke(str5);
                                                break;
                                            case 1:
                                                str5.getClass();
                                                Objects.toString((rn0) mutableState135.getValue());
                                                zq0Var6.P((rn0) mutableState135.getValue());
                                                zq0.O(zq0Var6, str5, null, null, 30);
                                                function15.invoke(str5);
                                                break;
                                            default:
                                                str5.getClass();
                                                Objects.toString((rn0) mutableState135.getValue());
                                                zq0Var6.P((rn0) mutableState135.getValue());
                                                zq0.O(zq0Var6, str5, null, null, 30);
                                                function15.invoke(str5);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue9);
                            } else {
                                function11 = function1;
                            }
                            function12 = (Function1) objRememberedValue9;
                            boolean zChangedInstance27 = r127.changedInstance(zq0Var4);
                            if (i12 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = zChangedInstance27 | z11;
                            objRememberedValue10 = r127.rememberedValue();
                            if (z12) {
                                function13 = function12;
                            } else {
                                function13 = function12;
                                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                }
                                Function2 function15 = (Function2) objRememberedValue10;
                                boolean zChangedInstance28 = r127.changedInstance(zq0Var4);
                                if (i12 == 4) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = z13 | zChangedInstance28;
                                objRememberedValue11 = r127.rememberedValue();
                                if (z14 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new ph(zq0Var4, function11, mutableState19, 6);
                                    r127.updateRememberedValue(objRememberedValue11);
                                }
                                Function3 function16 = (Function3) objRememberedValue11;
                                boolean zChangedInstance29 = r127.changedInstance(zq0Var4);
                                i13 = i29 & Input.Keys.FORWARD_DEL;
                                if (i13 == 32) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = zChangedInstance29 | z15;
                                objRememberedValue12 = r127.rememberedValue();
                                if (z16 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    final int i35 = 1;
                                    objRememberedValue12 = new Function2() { // from class: xo0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj8, Object obj9) {
                                            int i36 = i35;
                                            MutableState mutableState135 = mutableState19;
                                            Function1 function17 = function2;
                                            zq0 zq0Var6 = zq0Var4;
                                            String str5 = (String) obj8;
                                            String str6 = (String) obj9;
                                            switch (i36) {
                                                case 0:
                                                    str5.getClass();
                                                    str6.getClass();
                                                    Objects.toString((rn0) mutableState135.getValue());
                                                    zq0Var6.P((rn0) mutableState135.getValue());
                                                    zq0.O(zq0Var6, "header_".concat(str5), str6, sn0.c, 12);
                                                    function17.invoke(str5);
                                                    break;
                                                default:
                                                    str5.getClass();
                                                    str6.getClass();
                                                    Objects.toString((rn0) mutableState135.getValue());
                                                    zq0Var6.P((rn0) mutableState135.getValue());
                                                    zq0.O(zq0Var6, str5, str6, sn0.c, 12);
                                                    function17.invoke(str5);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    r127.updateRememberedValue(objRememberedValue12);
                                }
                                Function2 function17 = (Function2) objRememberedValue12;
                                boolean zChangedInstance30 = r127.changedInstance(zq0Var4);
                                mutableState20 = mutableState19;
                                if ((i29 & 896) == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                boolean z41 = z17 | zChangedInstance30;
                                if (i13 == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = z18 | z41;
                                objRememberedValue13 = r127.rememberedValue();
                                if (!z19 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    mutableState21 = mutableState20;
                                    zj zjVar = new zj(2, mutableState21, (Object) zq0Var4, (Object) function3, (Object) function2);
                                    r127.updateRememberedValue(zjVar);
                                    objRememberedValue13 = zjVar;
                                } else {
                                    mutableState21 = mutableState20;
                                }
                                Function2 function18 = (Function2) objRememberedValue13;
                                zChangedInstance3 = r127.changedInstance(zq0Var4);
                                objRememberedValue14 = r127.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    final int i36 = 1;
                                    objRememberedValue14 = new Function0() { // from class: vo0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i37 = i36;
                                            zq0 zq0Var6 = zq0Var4;
                                            switch (i37) {
                                                case 0:
                                                    zq0Var6.E(false, false);
                                                    break;
                                                case 1:
                                                    zq0Var6.k.setValue(Boolean.FALSE);
                                                    break;
                                                default:
                                                    zq0Var6.E(false, false);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    r127.updateRememberedValue(objRememberedValue14);
                                }
                                Function0 function19 = (Function0) objRememberedValue14;
                                objRememberedValue15 = r127.rememberedValue();
                                companion5 = Composer.INSTANCE;
                                if (objRememberedValue15 == companion5.getEmpty()) {
                                    objRememberedValue15 = new h70(19, mutableState13);
                                    r127.updateRememberedValue(objRememberedValue15);
                                }
                                Function1 function20 = (Function1) objRememberedValue15;
                                objRememberedValue16 = r127.rememberedValue();
                                if (objRememberedValue16 == companion5.getEmpty()) {
                                    objRememberedValue16 = new y1(mutableState13, mutableState80, mutableState5, 4);
                                    r127.updateRememberedValue(objRememberedValue16);
                                }
                                Function1 function21 = (Function1) objRememberedValue16;
                                objRememberedValue17 = r127.rememberedValue();
                                if (objRememberedValue17 == companion5.getEmpty()) {
                                    c = 23;
                                    objRememberedValue17 = new a50(23, mutableState83);
                                    r127.updateRememberedValue(objRememberedValue17);
                                } else {
                                    c = 23;
                                }
                                a(z, list4, listB, list5, str4, numZ, strA2, strB, zC, zE, function13, function15, function16, function17, function18, function10, function19, zq0Var4, zBooleanValue3, zBooleanValue4, itemCounts, function20, function21, iIntValue, (Function0) objRememberedValue17, r127, i31, (i11 << 18) & 29360128, 25008);
                                Object r129 = r127;
                                r129.endReplaceGroup();
                                r17 = r129;
                            }
                            final int i37 = 0;
                            objRememberedValue10 = new Function2() { // from class: xo0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj8, Object obj9) {
                                    int i38 = i37;
                                    MutableState mutableState135 = mutableState19;
                                    Function1 function110 = function11;
                                    zq0 zq0Var6 = zq0Var4;
                                    String str5 = (String) obj8;
                                    String str6 = (String) obj9;
                                    switch (i38) {
                                        case 0:
                                            str5.getClass();
                                            str6.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, "header_".concat(str5), str6, sn0.c, 12);
                                            function110.invoke(str5);
                                            break;
                                        default:
                                            str5.getClass();
                                            str6.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, str5, str6, sn0.c, 12);
                                            function110.invoke(str5);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue10);
                            Function2 function110 = (Function2) objRememberedValue10;
                            boolean zChangedInstance210 = r127.changedInstance(zq0Var4);
                            if (i12 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = z13 | zChangedInstance210;
                            objRememberedValue11 = r127.rememberedValue();
                            if (z14) {
                                objRememberedValue11 = new ph(zq0Var4, function11, mutableState19, 6);
                                r127.updateRememberedValue(objRememberedValue11);
                            } else {
                                objRememberedValue11 = new ph(zq0Var4, function11, mutableState19, 6);
                                r127.updateRememberedValue(objRememberedValue11);
                            }
                            Function3 function111 = (Function3) objRememberedValue11;
                            boolean zChangedInstance211 = r127.changedInstance(zq0Var4);
                            i13 = i29 & Input.Keys.FORWARD_DEL;
                            if (i13 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zChangedInstance211 | z15;
                            objRememberedValue12 = r127.rememberedValue();
                            if (z16) {
                                final int i38 = 1;
                                objRememberedValue12 = new Function2() { // from class: xo0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i39 = i38;
                                        MutableState mutableState135 = mutableState19;
                                        Function1 function112 = function2;
                                        zq0 zq0Var6 = zq0Var4;
                                        String str5 = (String) obj8;
                                        String str6 = (String) obj9;
                                        switch (i39) {
                                            case 0:
                                                str5.getClass();
                                                str6.getClass();
                                                Objects.toString((rn0) mutableState135.getValue());
                                                zq0Var6.P((rn0) mutableState135.getValue());
                                                zq0.O(zq0Var6, "header_".concat(str5), str6, sn0.c, 12);
                                                function112.invoke(str5);
                                                break;
                                            default:
                                                str5.getClass();
                                                str6.getClass();
                                                Objects.toString((rn0) mutableState135.getValue());
                                                zq0Var6.P((rn0) mutableState135.getValue());
                                                zq0.O(zq0Var6, str5, str6, sn0.c, 12);
                                                function112.invoke(str5);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue12);
                            } else {
                                final int i39 = 1;
                                objRememberedValue12 = new Function2() { // from class: xo0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i310 = i39;
                                        MutableState mutableState135 = mutableState19;
                                        Function1 function112 = function2;
                                        zq0 zq0Var6 = zq0Var4;
                                        String str5 = (String) obj8;
                                        String str6 = (String) obj9;
                                        switch (i310) {
                                            case 0:
                                                str5.getClass();
                                                str6.getClass();
                                                Objects.toString((rn0) mutableState135.getValue());
                                                zq0Var6.P((rn0) mutableState135.getValue());
                                                zq0.O(zq0Var6, "header_".concat(str5), str6, sn0.c, 12);
                                                function112.invoke(str5);
                                                break;
                                            default:
                                                str5.getClass();
                                                str6.getClass();
                                                Objects.toString((rn0) mutableState135.getValue());
                                                zq0Var6.P((rn0) mutableState135.getValue());
                                                zq0.O(zq0Var6, str5, str6, sn0.c, 12);
                                                function112.invoke(str5);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue12);
                            }
                            Function2 function112 = (Function2) objRememberedValue12;
                            boolean zChangedInstance31 = r127.changedInstance(zq0Var4);
                            mutableState20 = mutableState19;
                            if ((i29 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z42 = z17 | zChangedInstance31;
                            if (i13 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z42;
                            objRememberedValue13 = r127.rememberedValue();
                            if (z19) {
                                mutableState21 = mutableState20;
                                zj zjVar2 = new zj(2, mutableState21, (Object) zq0Var4, (Object) function3, (Object) function2);
                                r127.updateRememberedValue(zjVar2);
                                objRememberedValue13 = zjVar2;
                            } else {
                                mutableState21 = mutableState20;
                                zj zjVar3 = new zj(2, mutableState21, (Object) zq0Var4, (Object) function3, (Object) function2);
                                r127.updateRememberedValue(zjVar3);
                                objRememberedValue13 = zjVar3;
                            }
                            Function2 function113 = (Function2) objRememberedValue13;
                            zChangedInstance3 = r127.changedInstance(zq0Var4);
                            objRememberedValue14 = r127.rememberedValue();
                            if (zChangedInstance3) {
                                final int i310 = 1;
                                objRememberedValue14 = new Function0() { // from class: vo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i311 = i310;
                                        zq0 zq0Var6 = zq0Var4;
                                        switch (i311) {
                                            case 0:
                                                zq0Var6.E(false, false);
                                                break;
                                            case 1:
                                                zq0Var6.k.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                zq0Var6.E(false, false);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue14);
                            } else {
                                final int i311 = 1;
                                objRememberedValue14 = new Function0() { // from class: vo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i312 = i311;
                                        zq0 zq0Var6 = zq0Var4;
                                        switch (i312) {
                                            case 0:
                                                zq0Var6.E(false, false);
                                                break;
                                            case 1:
                                                zq0Var6.k.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                zq0Var6.E(false, false);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue14);
                            }
                            Function0 function114 = (Function0) objRememberedValue14;
                            objRememberedValue15 = r127.rememberedValue();
                            companion5 = Composer.INSTANCE;
                            if (objRememberedValue15 == companion5.getEmpty()) {
                                objRememberedValue15 = new h70(19, mutableState13);
                                r127.updateRememberedValue(objRememberedValue15);
                            }
                            Function1 function22 = (Function1) objRememberedValue15;
                            objRememberedValue16 = r127.rememberedValue();
                            if (objRememberedValue16 == companion5.getEmpty()) {
                                objRememberedValue16 = new y1(mutableState13, mutableState80, mutableState5, 4);
                                r127.updateRememberedValue(objRememberedValue16);
                            }
                            Function1 function23 = (Function1) objRememberedValue16;
                            objRememberedValue17 = r127.rememberedValue();
                            if (objRememberedValue17 == companion5.getEmpty()) {
                                c = 23;
                                objRememberedValue17 = new a50(23, mutableState83);
                                r127.updateRememberedValue(objRememberedValue17);
                            } else {
                                c = 23;
                            }
                            a(z, list4, listB, list5, str4, numZ, strA2, strB, zC, zE, function13, function110, function111, function112, function113, function10, function114, zq0Var4, zBooleanValue3, zBooleanValue4, itemCounts, function22, function23, iIntValue, (Function0) objRememberedValue17, r127, i31, (i11 << 18) & 29360128, 25008);
                            Object r1210 = r127;
                            r1210.endReplaceGroup();
                            r17 = r1210;
                        }
                        r17.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        r18 = r17;
                    }
                    state4 = state4;
                    mutableState13 = mutableState13;
                    r17 = r16;
                    r17.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                    r18 = r17;
                } else if (iOrdinal != 1) {
                    zq0Var4 = zq0Var3;
                    ServerPreferences serverPreferences10 = serverPreferences2;
                    focusRequester = focusRequester;
                    mutableState12 = mutableState109;
                    vcVar = vcVar;
                    mutableState72 = mutableState7;
                    mutableState126 = mutableState126;
                    mutableState120 = mutableState120;
                    mutableState116 = mutableState116;
                    mutableState110 = mutableState110;
                    mutableState111 = mutableState111;
                    mutableState112 = mutableState112;
                    mutableState113 = mutableState113;
                    mutableState114 = mutableState114;
                    mutableState117 = mutableState117;
                    mutableState118 = mutableState118;
                    mutableState121 = mutableState121;
                    mutableState122 = mutableState122;
                    mutableState123 = mutableState123;
                    mutableState119 = mutableState119;
                    ab2Var3 = ab2Var3;
                    mutableState129 = mutableState129;
                    r127.startReplaceGroup(-1687220673);
                    zBooleanValue = ((Boolean) mutableState89.getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) mutableState90.getValue()).booleanValue();
                    String strK = K(mutableState77);
                    zChanged7 = r127.changed(mutableState77);
                    objRememberedValue88 = r127.rememberedValue();
                    if (zChanged7) {
                        z30 = zBooleanValue;
                    } else {
                        z30 = zBooleanValue;
                        if (objRememberedValue88 == companion.getEmpty()) {
                        }
                        Function1 function24 = (Function1) objRememberedValue88;
                        objRememberedValue89 = r127.rememberedValue();
                        if (objRememberedValue89 == companion.getEmpty()) {
                            objRememberedValue89 = new h70(21, mutableState72);
                            r127.updateRememberedValue(objRememberedValue89);
                        }
                        Function1 function25 = (Function1) objRememberedValue89;
                        boolean zChangedInstance32 = r127.changedInstance(zq0Var4);
                        if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        z32 = z31 | zChangedInstance32;
                        objRememberedValue90 = r127.rememberedValue();
                        if (z32 || objRememberedValue90 == companion.getEmpty()) {
                            final int i40 = 1;
                            objRememberedValue90 = new Function1() { // from class: wo0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    int i312 = i40;
                                    MutableState mutableState135 = mutableState10;
                                    Function1 function115 = function2;
                                    zq0 zq0Var6 = zq0Var4;
                                    String str5 = (String) obj8;
                                    switch (i312) {
                                        case 0:
                                            str5.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, str5, "我的媒体", sn0.b, 12);
                                            function115.invoke(str5);
                                            break;
                                        case 1:
                                            str5.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, str5, null, null, 30);
                                            function115.invoke(str5);
                                            break;
                                        default:
                                            str5.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, str5, null, null, 30);
                                            function115.invoke(str5);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue90);
                        }
                        vj0.b(z, z30, zBooleanValue5, strK, function24, function25, function3, (Function1) objRememberedValue90, null, r127, i31 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i29 << 12) & 3670016));
                        Object r130 = r127;
                        r130.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                        boxScopeInstance = boxScopeInstance;
                        coroutineScope = coroutineScope4;
                        lz0Var = lz0Var4;
                        mutableState23 = mutableState11;
                        mutableState21 = mutableState10;
                        state4 = stateCollectAsState10;
                        context = context;
                        mutableState14 = mutableState102;
                        mutableState13 = mutableState72;
                        mutableState15 = mutableState104;
                        mutableState16 = mutableState103;
                        mutableState5 = mutableState5;
                        mutableState80 = mutableState80;
                        userPreferences = userPreferences4;
                        serverPreferences3 = serverPreferences10;
                        c = 23;
                        str = null;
                        mutableState17 = mutableState106;
                        r18 = r130;
                    }
                    objRememberedValue88 = new h70(20, mutableState77);
                    r127.updateRememberedValue(objRememberedValue88);
                    Function1 function26 = (Function1) objRememberedValue88;
                    objRememberedValue89 = r127.rememberedValue();
                    if (objRememberedValue89 == companion.getEmpty()) {
                        objRememberedValue89 = new h70(21, mutableState72);
                        r127.updateRememberedValue(objRememberedValue89);
                    }
                    Function1 function27 = (Function1) objRememberedValue89;
                    boolean zChangedInstance33 = r127.changedInstance(zq0Var4);
                    if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    z32 = z31 | zChangedInstance33;
                    objRememberedValue90 = r127.rememberedValue();
                    if (z32) {
                        final int i41 = 1;
                        objRememberedValue90 = new Function1() { // from class: wo0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i312 = i41;
                                MutableState mutableState135 = mutableState10;
                                Function1 function115 = function2;
                                zq0 zq0Var6 = zq0Var4;
                                String str5 = (String) obj8;
                                switch (i312) {
                                    case 0:
                                        str5.getClass();
                                        Objects.toString((rn0) mutableState135.getValue());
                                        zq0Var6.P((rn0) mutableState135.getValue());
                                        zq0.O(zq0Var6, str5, "我的媒体", sn0.b, 12);
                                        function115.invoke(str5);
                                        break;
                                    case 1:
                                        str5.getClass();
                                        Objects.toString((rn0) mutableState135.getValue());
                                        zq0Var6.P((rn0) mutableState135.getValue());
                                        zq0.O(zq0Var6, str5, null, null, 30);
                                        function115.invoke(str5);
                                        break;
                                    default:
                                        str5.getClass();
                                        Objects.toString((rn0) mutableState135.getValue());
                                        zq0Var6.P((rn0) mutableState135.getValue());
                                        zq0.O(zq0Var6, str5, null, null, 30);
                                        function115.invoke(str5);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r127.updateRememberedValue(objRememberedValue90);
                    } else {
                        final int i42 = 1;
                        objRememberedValue90 = new Function1() { // from class: wo0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i312 = i42;
                                MutableState mutableState135 = mutableState10;
                                Function1 function115 = function2;
                                zq0 zq0Var6 = zq0Var4;
                                String str5 = (String) obj8;
                                switch (i312) {
                                    case 0:
                                        str5.getClass();
                                        Objects.toString((rn0) mutableState135.getValue());
                                        zq0Var6.P((rn0) mutableState135.getValue());
                                        zq0.O(zq0Var6, str5, "我的媒体", sn0.b, 12);
                                        function115.invoke(str5);
                                        break;
                                    case 1:
                                        str5.getClass();
                                        Objects.toString((rn0) mutableState135.getValue());
                                        zq0Var6.P((rn0) mutableState135.getValue());
                                        zq0.O(zq0Var6, str5, null, null, 30);
                                        function115.invoke(str5);
                                        break;
                                    default:
                                        str5.getClass();
                                        Objects.toString((rn0) mutableState135.getValue());
                                        zq0Var6.P((rn0) mutableState135.getValue());
                                        zq0.O(zq0Var6, str5, null, null, 30);
                                        function115.invoke(str5);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r127.updateRememberedValue(objRememberedValue90);
                    }
                    vj0.b(z, z30, zBooleanValue5, strK, function26, function27, function3, (Function1) objRememberedValue90, null, r127, i31 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i29 << 12) & 3670016));
                    Object r131 = r127;
                    r131.endReplaceGroup();
                    Unit unit5 = Unit.INSTANCE;
                    boxScopeInstance = boxScopeInstance;
                    coroutineScope = coroutineScope4;
                    lz0Var = lz0Var4;
                    mutableState23 = mutableState11;
                    mutableState21 = mutableState10;
                    state4 = stateCollectAsState10;
                    context = context;
                    mutableState14 = mutableState102;
                    mutableState13 = mutableState72;
                    mutableState15 = mutableState104;
                    mutableState16 = mutableState103;
                    mutableState5 = mutableState5;
                    mutableState80 = mutableState80;
                    userPreferences = userPreferences4;
                    serverPreferences3 = serverPreferences10;
                    c = 23;
                    str = null;
                    mutableState17 = mutableState106;
                    r18 = r131;
                } else {
                    if (iOrdinal == 2) {
                        r127.startReplaceGroup(360892379);
                        r127.endReplaceGroup();
                        qu.f();
                        return;
                    }
                    r127.startReplaceGroup(-1686184064);
                    if (zBooleanValue2) {
                        r127.startReplaceGroup(-1686123273);
                        objRememberedValue92 = r127.rememberedValue();
                        if (objRememberedValue92 == companion.getEmpty()) {
                            objRememberedValue92 = new bo0(11);
                            r127.updateRememberedValue(objRememberedValue92);
                        }
                        Function0 function28 = (Function0) objRememberedValue92;
                        boolean zChangedInstance34 = r127.changedInstance(serverPreferences2) | r127.changedInstance(zq0Var3);
                        i29 = i29;
                        if ((i29 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z43 = zChangedInstance34 | z35;
                        if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = z43 | z36;
                        objRememberedValue93 = r127.rememberedValue();
                        if (!z37 || objRememberedValue93 == companion.getEmpty()) {
                            zq0Var4 = zq0Var;
                            ServerPreferences serverPreferences11 = serverPreferences2;
                            zj zjVar4 = new zj(3, serverPreferences11, zq0Var4, function4, function2);
                            serverPreferences7 = serverPreferences11;
                            r127.updateRememberedValue(zjVar4);
                            objRememberedValue93 = zjVar4;
                        } else {
                            zq0Var4 = zq0Var3;
                            serverPreferences7 = serverPreferences2;
                        }
                        mutableState74 = mutableState106;
                        mutableState12 = mutableState109;
                        mutableState73 = mutableState7;
                        s8.a(function28, (Function2) objRememberedValue93, ((Boolean) mutableState93.getValue()).booleanValue(), z, false, PaddingKt.m1003paddingqDBjuR0$default(companion2, 0.0f, Dp.m7813constructorimpl(64.0f), 0.0f, 0.0f, 13, null), null, r127, ((i10 << 3) & 7168) | 221190);
                        Object r132 = r127;
                        r132.endReplaceGroup();
                        serverPreferences6 = serverPreferences7;
                        mutableState75 = mutableState102;
                        r125 = r132;
                    } else {
                        zq0Var4 = zq0Var3;
                        ServerPreferences serverPreferences12 = serverPreferences2;
                        mutableState12 = mutableState109;
                        vcVar = vcVar;
                        mutableState73 = mutableState7;
                        mutableState74 = mutableState106;
                        mutableState11 = mutableState11;
                        stateCollectAsState10 = stateCollectAsState10;
                        lz0Var4 = lz0Var4;
                        coroutineScope4 = coroutineScope4;
                        ab2Var3 = ab2Var3;
                        r127.startReplaceGroup(-1684589238);
                        boolean zChangedInstance35 = r127.changedInstance(zq0Var4);
                        serverPreferences6 = serverPreferences12;
                        mutableState75 = mutableState102;
                        if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                            z33 = true;
                        } else {
                            z33 = false;
                        }
                        z34 = z33 | zChangedInstance35;
                        objRememberedValue91 = r127.rememberedValue();
                        if (z34 || objRememberedValue91 == companion.getEmpty()) {
                            final int i43 = 2;
                            objRememberedValue91 = new Function1() { // from class: wo0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    int i312 = i43;
                                    MutableState mutableState135 = mutableState10;
                                    Function1 function115 = function2;
                                    zq0 zq0Var6 = zq0Var4;
                                    String str5 = (String) obj8;
                                    switch (i312) {
                                        case 0:
                                            str5.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, str5, "我的媒体", sn0.b, 12);
                                            function115.invoke(str5);
                                            break;
                                        case 1:
                                            str5.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, str5, null, null, 30);
                                            function115.invoke(str5);
                                            break;
                                        default:
                                            str5.getClass();
                                            Objects.toString((rn0) mutableState135.getValue());
                                            zq0Var6.P((rn0) mutableState135.getValue());
                                            zq0.O(zq0Var6, str5, null, null, 30);
                                            function115.invoke(str5);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue91);
                        }
                        sv1.b(z, (Function1) objRememberedValue91, null, r127, i31);
                        r127.endReplaceGroup();
                        r125 = r127;
                    }
                    r125.endReplaceGroup();
                    Unit unit6 = Unit.INSTANCE;
                    boxScopeInstance = boxScopeInstance;
                    coroutineScope = coroutineScope4;
                    lz0Var = lz0Var4;
                    mutableState23 = mutableState11;
                    mutableState21 = mutableState10;
                    state4 = stateCollectAsState10;
                    context = context;
                    mutableState14 = mutableState75;
                    mutableState15 = mutableState104;
                    mutableState16 = mutableState103;
                    mutableState5 = mutableState5;
                    mutableState80 = mutableState80;
                    userPreferences = userPreferences4;
                    serverPreferences3 = serverPreferences6;
                    str = null;
                    mutableState13 = mutableState73;
                    mutableState17 = mutableState74;
                    c = 23;
                    r18 = r125;
                }
                r18.endNode();
                strC = L(mutableState23).c();
                if (strC != null || (serverById = serverPreferences3.getServerById(strC)) == null || (effectiveServerConfig = serverById.getEffectiveServerConfig()) == null) {
                    host = str;
                } else {
                    host = effectiveServerConfig.getHost();
                }
                if (M(stateCollectAsState13).getEnabled() || !M(stateCollectAsState13).getBypassLan() || L(mutableState23).c || host == null || !lr1.b(host)) {
                    z20 = false;
                } else {
                    z20 = true;
                }
                if (M(stateCollectAsState13).getEnabled() || L(mutableState23).c || z20) {
                    z21 = false;
                } else {
                    z21 = true;
                }
                i15 = 22;
                if (z) {
                    r18.startReplaceGroup(1337616380);
                    rn0 rn0VarG4 = G(mutableState21);
                    objRememberedValue79 = r18.rememberedValue();
                    companion18 = Composer.INSTANCE;
                    if (objRememberedValue79 == companion18.getEmpty()) {
                        objRememberedValue79 = new h70(i15, mutableState21);
                        r18.updateRememberedValue(objRememberedValue79);
                    }
                    Function1 function29 = (Function1) objRememberedValue79;
                    boolean z44 = !((Boolean) mutableState87.getValue()).booleanValue();
                    boolean zBooleanValue6 = ((Boolean) mutableState88.getValue()).booleanValue();
                    String strA3 = L(mutableState23).a();
                    String strB2 = L(mutableState23).b();
                    objRememberedValue80 = r18.rememberedValue();
                    if (objRememberedValue80 == companion18.getEmpty()) {
                        mutableState26 = mutableState15;
                        objRememberedValue80 = new a50(24, mutableState26);
                        r18.updateRememberedValue(objRememberedValue80);
                    } else {
                        mutableState26 = mutableState15;
                    }
                    Function0 function30 = (Function0) objRememberedValue80;
                    objRememberedValue81 = r18.rememberedValue();
                    if (objRememberedValue81 == companion18.getEmpty()) {
                        mutableState25 = mutableState110;
                        objRememberedValue81 = new a50(25, mutableState25);
                        r18.updateRememberedValue(objRememberedValue81);
                    } else {
                        mutableState25 = mutableState110;
                    }
                    Function0 function31 = (Function0) objRememberedValue81;
                    objRememberedValue82 = r18.rememberedValue();
                    if (objRememberedValue82 == companion18.getEmpty()) {
                        mutableState24 = mutableState101;
                        objRememberedValue82 = new ii(mutableState21, mutableState14, mutableState24, 4);
                        r18.updateRememberedValue(objRememberedValue82);
                    } else {
                        mutableState24 = mutableState101;
                    }
                    Function0 function32 = (Function0) objRememberedValue82;
                    objRememberedValue83 = r18.rememberedValue();
                    if (objRememberedValue83 == companion18.getEmpty()) {
                        objRememberedValue83 = new ii(mutableState21, mutableState14, mutableState24, 5);
                        r18.updateRememberedValue(objRememberedValue83);
                    }
                    Function0 function33 = (Function0) objRememberedValue83;
                    zChangedInstance20 = r18.changedInstance(zq0Var4);
                    objRememberedValue84 = r18.rememberedValue();
                    if (zChangedInstance20 || objRememberedValue84 == companion18.getEmpty()) {
                        final int i44 = 2;
                        objRememberedValue84 = new Function0() { // from class: vo0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i312 = i44;
                                zq0 zq0Var6 = zq0Var4;
                                switch (i312) {
                                    case 0:
                                        zq0Var6.E(false, false);
                                        break;
                                    case 1:
                                        zq0Var6.k.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        zq0Var6.E(false, false);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r18.updateRememberedValue(objRememberedValue84);
                    }
                    Function0 function34 = (Function0) objRememberedValue84;
                    boolean zBooleanValue7 = ((Boolean) mutableState13.getValue()).booleanValue();
                    if (M(stateCollectAsState13).getEnabled() || !L(mutableState23).c) {
                        z28 = false;
                    } else {
                        z28 = true;
                    }
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        vcVar.getClass();
                        if (((Boolean) qc.b.getValue()).booleanValue()) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                    } else {
                        z29 = false;
                    }
                    int iIntValue2 = ((Number) mutableState80.getValue()).intValue();
                    int iIntValue3 = ((Number) mutableState5.getValue()).intValue();
                    int iY = y(mutableState82);
                    objRememberedValue85 = r18.rememberedValue();
                    if (objRememberedValue85 == companion18.getEmpty()) {
                        objRememberedValue85 = new a50(26, mutableState80);
                        r18.updateRememberedValue(objRememberedValue85);
                    }
                    Function0 function35 = (Function0) objRememberedValue85;
                    objRememberedValue86 = r18.rememberedValue();
                    if (objRememberedValue86 == companion18.getEmpty()) {
                        objRememberedValue86 = new a50(27, mutableState5);
                        r18.updateRememberedValue(objRememberedValue86);
                    }
                    Function0 function36 = (Function0) objRememberedValue86;
                    objRememberedValue87 = r18.rememberedValue();
                    if (objRememberedValue87 == companion18.getEmpty()) {
                        objRememberedValue87 = new h70(23, mutableState9);
                        r18.updateRememberedValue(objRememberedValue87);
                    }
                    Object r38 = r18;
                    e92.d(rn0VarG4, function29, z44, zBooleanValue6, strA3, strB2, function30, function31, function32, function33, function34, zBooleanValue7, z21, z28, z20, z29, focusRequester, iIntValue2, iIntValue3, iY, function35, function36, (Function1) objRememberedValue87, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), r38, 920125488, 1572864, 438);
                    Object r133 = r38;
                    r133.endReplaceGroup();
                    r19 = r133;
                } else {
                    mutableState24 = mutableState101;
                    mutableState25 = mutableState110;
                    mutableState26 = mutableState15;
                    r18.startReplaceGroup(1339821875);
                    r18.endReplaceGroup();
                    r19 = r18;
                }
                r19.endNode();
                if (z) {
                    r19.startReplaceGroup(1417498825);
                    if (((Boolean) mutableState79.getValue()).booleanValue()) {
                        r19.startReplaceGroup(1416967547);
                        objRememberedValue76 = r19.rememberedValue();
                        companion17 = Composer.INSTANCE;
                        if (objRememberedValue76 == companion17.getEmpty()) {
                            mutableState71 = mutableState79;
                            objRememberedValue76 = new a50(28, mutableState71);
                            r19.updateRememberedValue(objRememberedValue76);
                        } else {
                            mutableState71 = mutableState79;
                        }
                        Function0 function37 = (Function0) objRememberedValue76;
                        context3 = context;
                        zChangedInstance19 = r19.changedInstance(context3);
                        objRememberedValue77 = r19.rememberedValue();
                        if (zChangedInstance19 || objRememberedValue77 == companion17.getEmpty()) {
                            objRememberedValue77 = new u5(context3, 1);
                            r19.updateRememberedValue(objRememberedValue77);
                        }
                        Function0 function38 = (Function0) objRememberedValue77;
                        if ((i29 & 3670016) == 1048576) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objRememberedValue78 = r19.rememberedValue();
                        if (z27 || objRememberedValue78 == companion17.getEmpty()) {
                            objRememberedValue78 = new o5(function0, mutableState71, 2);
                            r19.updateRememberedValue(objRememberedValue78);
                        }
                        context2 = context3;
                        Object r23 = r19;
                        kh0.a(function37, function38, (Function0) objRememberedValue78, "是否退出", "退出软件", "退回服务页", Dp.m7813constructorimpl(400.0f), Dp.m7813constructorimpl(198.0f), Dp.m7813constructorimpl(156.0f), r23, 115043334, 512);
                        Object r134 = r23;
                        r134.endReplaceGroup();
                        r111 = r134;
                    } else {
                        context2 = context;
                        r19.startReplaceGroup(1417549913);
                        r19.endReplaceGroup();
                        r111 = r19;
                    }
                    if (((Boolean) mutableState105.getValue()).booleanValue()) {
                        r111.startReplaceGroup(1417611882);
                        hq0Var2 = (hq0) stateCollectAsState2.getValue();
                        if (hq0Var2 instanceof gq0) {
                            r111.startReplaceGroup(1417688452);
                            List list6 = ((gq0) hq0Var2).a;
                            Set set = (Set) stateCollectAsState14.getValue();
                            coroutineScope2 = coroutineScope;
                            lz0Var2 = lz0Var;
                            mutableState27 = mutableState23;
                            zChangedInstance18 = r111.changedInstance(coroutineScope2) | r111.changedInstance(lz0Var2) | r111.changed(mutableState27);
                            objRememberedValue74 = r111.rememberedValue();
                            if (zChangedInstance18 || objRememberedValue74 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue74 = new r5(coroutineScope2, lz0Var2, mutableState27, 6);
                                r111.updateRememberedValue(objRememberedValue74);
                            }
                            Function2 function39 = (Function2) objRememberedValue74;
                            objRememberedValue75 = r111.rememberedValue();
                            if (objRememberedValue75 == Composer.INSTANCE.getEmpty()) {
                                mutableState28 = mutableState105;
                                objRememberedValue75 = new a50(29, mutableState28);
                                r111.updateRememberedValue(objRememberedValue75);
                            } else {
                                mutableState28 = mutableState105;
                            }
                            Object r135 = r111;
                            fz0.a(list6, set, function39, (Function0) objRememberedValue75, r135, 3072);
                            Object r136 = r135;
                            r136.endReplaceGroup();
                            r124 = r136;
                        } else {
                            mutableState27 = mutableState23;
                            mutableState28 = mutableState105;
                            coroutineScope2 = coroutineScope;
                            r111.startReplaceGroup(1418200665);
                            r111.endReplaceGroup();
                            r124 = r111;
                        }
                        r124.endReplaceGroup();
                        r112 = r124;
                    } else {
                        mutableState27 = mutableState23;
                        mutableState28 = mutableState105;
                        coroutineScope2 = coroutineScope;
                        r111.startReplaceGroup(1418210585);
                        r111.endReplaceGroup();
                        r112 = r111;
                    }
                    if (((Boolean) mutableState17.getValue()).booleanValue()) {
                        r112.startReplaceGroup(1418261549);
                        List listM = m(mutableState108);
                        zChangedInstance16 = r112.changedInstance(zq0Var4);
                        objRememberedValue71 = r112.rememberedValue();
                        if (zChangedInstance16 || objRememberedValue71 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue71 = new v80(zq0Var4);
                            r112.updateRememberedValue(objRememberedValue71);
                        }
                        Function2 function40 = (Function2) ((KFunction) objRememberedValue71);
                        zChangedInstance17 = r112.changedInstance(zq0Var4);
                        objRememberedValue72 = r112.rememberedValue();
                        if (zChangedInstance17) {
                            mutableState29 = mutableState21;
                        } else {
                            mutableState29 = mutableState21;
                            if (objRememberedValue72 == Composer.INSTANCE.getEmpty()) {
                            }
                            Function1 function41 = (Function1) objRememberedValue72;
                            objRememberedValue73 = r112.rememberedValue();
                            if (objRememberedValue73 == Composer.INSTANCE.getEmpty()) {
                                mutableState30 = mutableState17;
                                mutableState31 = mutableState108;
                                objRememberedValue73 = new ao0(1, mutableState30, mutableState31);
                                r112.updateRememberedValue(objRememberedValue73);
                            } else {
                                mutableState30 = mutableState17;
                                mutableState31 = mutableState108;
                            }
                            Object r137 = r112;
                            sy0.b(listM, function40, function41, (Function0) objRememberedValue73, r137, 24576);
                            Object r138 = r137;
                            r138.endReplaceGroup();
                            r113 = r138;
                        }
                        objRememberedValue72 = new yn0(zq0Var4, 2);
                        r112.updateRememberedValue(objRememberedValue72);
                        Function1 function42 = (Function1) objRememberedValue72;
                        objRememberedValue73 = r112.rememberedValue();
                        if (objRememberedValue73 == Composer.INSTANCE.getEmpty()) {
                            mutableState30 = mutableState17;
                            mutableState31 = mutableState108;
                            objRememberedValue73 = new ao0(1, mutableState30, mutableState31);
                            r112.updateRememberedValue(objRememberedValue73);
                        } else {
                            mutableState30 = mutableState17;
                            mutableState31 = mutableState108;
                        }
                        Object r139 = r112;
                        sy0.b(listM, function40, function42, (Function0) objRememberedValue73, r139, 24576);
                        Object r1310 = r139;
                        r1310.endReplaceGroup();
                        r113 = r1310;
                    } else {
                        mutableState29 = mutableState21;
                        mutableState30 = mutableState17;
                        mutableState31 = mutableState108;
                        mutableState26 = mutableState26;
                        r112.startReplaceGroup(1418703609);
                        r112.endReplaceGroup();
                        r113 = r112;
                    }
                    if (((Boolean) mutableState107.getValue()).booleanValue()) {
                        r113.startReplaceGroup(1418776273);
                        objRememberedValue70 = r113.rememberedValue();
                        if (objRememberedValue70 == Composer.INSTANCE.getEmpty()) {
                            mutableState69 = mutableState107;
                            mutableState70 = mutableState12;
                            objRememberedValue70 = new ii(mutableState70, mutableState69, mutableState31, 6);
                            r113.updateRememberedValue(objRememberedValue70);
                        } else {
                            mutableState69 = mutableState107;
                            mutableState70 = mutableState12;
                        }
                        mutableState12 = mutableState70;
                        mutableState107 = mutableState69;
                        Object r32 = r113;
                        AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue70, et.i(), null, ComposableLambdaKt.rememberComposableLambda(646043598, true, new r5(mutableState70, mutableState69, mutableState31, 7), r113, 54), null, et.d(), et.a(), null, 0L, 0L, 0L, 0L, 0.0f, null, r32, 1772598, 0, 16276);
                        Object r4 = r32;
                        r4.endReplaceGroup();
                        r3 = r4;
                    } else {
                        mutableState30 = mutableState30;
                        Object r5 = r113;
                        r5.startReplaceGroup(1419675769);
                        r5.endReplaceGroup();
                        r3 = r5;
                    }
                    if (((Boolean) mutableState24.getValue()).booleanValue()) {
                        r3.startReplaceGroup(1419785168);
                        ItemCounts itemCounts2 = (ItemCounts) state4.getValue();
                        boolean zJ = j(mutableState14);
                        objRememberedValue66 = r3.rememberedValue();
                        companion16 = Composer.INSTANCE;
                        if (objRememberedValue66 == companion16.getEmpty()) {
                            mutableState32 = mutableState16;
                            objRememberedValue66 = new ii(mutableState24, mutableState14, mutableState32, 7);
                            r3.updateRememberedValue(objRememberedValue66);
                        } else {
                            mutableState32 = mutableState16;
                        }
                        Function0 function43 = (Function0) objRememberedValue66;
                        objRememberedValue67 = r3.rememberedValue();
                        if (objRememberedValue67 == companion16.getEmpty()) {
                            objRememberedValue67 = new ii(mutableState24, mutableState14, mutableState28, 8);
                            r3.updateRememberedValue(objRememberedValue67);
                        }
                        Function0 function44 = (Function0) objRememberedValue67;
                        zChangedInstance15 = r3.changedInstance(coroutineScope2) | r3.changedInstance(zq0Var4) | r3.changedInstance(context2);
                        objRememberedValue68 = r3.rememberedValue();
                        if (!zChangedInstance15 || objRememberedValue68 == companion16.getEmpty()) {
                            CoroutineScope coroutineScope5 = coroutineScope2;
                            objRememberedValue68 = new th(coroutineScope5, mutableState24, mutableState14, mutableState12, zq0Var4, mutableState107, mutableState31, mutableState30, context2);
                            coroutineScope3 = coroutineScope5;
                            r3.updateRememberedValue(objRememberedValue68);
                        } else {
                            coroutineScope3 = coroutineScope2;
                        }
                        Function0 function45 = (Function0) objRememberedValue68;
                        objRememberedValue69 = r3.rememberedValue();
                        if (objRememberedValue69 == companion16.getEmpty()) {
                            objRememberedValue69 = new ey(2, mutableState24, mutableState14);
                            r3.updateRememberedValue(objRememberedValue69);
                        }
                        Object r20 = r3;
                        qn0.a(itemCounts2, zJ, function43, function44, function45, (Function0) objRememberedValue69, r20, 200064);
                        Object r12 = r20;
                        r12.endReplaceGroup();
                        r9 = r12;
                    } else {
                        coroutineScope3 = coroutineScope2;
                        mutableState32 = mutableState16;
                        Object r13 = r3;
                        r13.startReplaceGroup(1422100217);
                        r13.endReplaceGroup();
                        r9 = r13;
                    }
                    if (((Boolean) mutableState32.getValue()).booleanValue()) {
                        r9.startReplaceGroup(1422146128);
                        zChanged6 = r9.changed(mutableState27) | r9.changedInstance(serverPreferences3) | r9.changedInstance(context2) | r9.changedInstance(zq0Var4);
                        Object objRememberedValue176 = r9.rememberedValue();
                        if (!zChanged6 || objRememberedValue176 == Composer.INSTANCE.getEmpty()) {
                            ServerPreferences serverPreferences13 = serverPreferences3;
                            MutableState mutableState135 = mutableState32;
                            j1Var = new j1(serverPreferences13, context2, zq0Var4, mutableState27, mutableState135, 7);
                            serverPreferences4 = serverPreferences13;
                            mutableState68 = mutableState135;
                            r9.updateRememberedValue(j1Var);
                        } else {
                            j1Var = objRememberedValue176;
                            serverPreferences4 = serverPreferences3;
                            mutableState68 = mutableState32;
                        }
                        Function1 function46 = (Function1) j1Var;
                        objRememberedValue65 = r9.rememberedValue();
                        if (objRememberedValue65 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue65 = new a50(15, mutableState68);
                            r9.updateRememberedValue(objRememberedValue65);
                        }
                        Object r140 = r9;
                        qn0.d(null, list, true, function46, (Function0) objRememberedValue65, r140, 24960, 1);
                        Object r141 = r140;
                        r141.endReplaceGroup();
                        r114 = r141;
                    } else {
                        Object r142 = r9;
                        serverPreferences4 = serverPreferences3;
                        r142.startReplaceGroup(1422431545);
                        r142.endReplaceGroup();
                        r114 = r142;
                    }
                    i16 = 458752;
                    if (((Boolean) mutableState26.getValue()).booleanValue()) {
                        r114.startReplaceGroup(1422494940);
                        if ((i29 & 3670016) == 1048576) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if ((i29 & 29360128) == 8388608) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean zChangedInstance36 = z23 | z24 | r114.changedInstance(serverPreferences4) | r114.changedInstance(context2) | r114.changed(mutableState27) | r114.changedInstance(zq0Var4);
                        if ((i29 & 458752) == 131072) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = zChangedInstance36 | z25;
                        objRememberedValue63 = r114.rememberedValue();
                        if (!z26 || objRememberedValue63 == Composer.INSTANCE.getEmpty()) {
                            MutableState mutableState136 = mutableState27;
                            zq0 zq0Var6 = zq0Var4;
                            Context context5 = context2;
                            MutableState mutableState137 = mutableState26;
                            mutableState34 = mutableState29;
                            i17 = 5;
                            ServerPreferences serverPreferences14 = serverPreferences4;
                            un0 un0Var = new un0(function0, function7, mutableState137, serverPreferences14, context5, mutableState136, zq0Var6, function6, mutableState34, mutableState13);
                            mutableState67 = mutableState137;
                            serverPreferences5 = serverPreferences14;
                            context2 = context5;
                            mutableState33 = mutableState136;
                            zq0Var4 = zq0Var6;
                            r114.updateRememberedValue(un0Var);
                            objRememberedValue63 = un0Var;
                        } else {
                            mutableState33 = mutableState27;
                            serverPreferences5 = serverPreferences4;
                            mutableState67 = mutableState26;
                            mutableState34 = mutableState29;
                            i17 = 5;
                        }
                        Function1 function47 = (Function1) objRememberedValue63;
                        objRememberedValue64 = r114.rememberedValue();
                        if (objRememberedValue64 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue64 = new a50(16, mutableState67);
                            r114.updateRememberedValue(objRememberedValue64);
                        }
                        Object r30 = r114;
                        qn0.d("切换服务器", listA, true, function47, (Function0) objRememberedValue64, r30, 24966, 0);
                        Object r143 = r30;
                        r143.endReplaceGroup();
                        r115 = r143;
                    } else {
                        mutableState33 = mutableState27;
                        serverPreferences5 = serverPreferences4;
                        i16 = 458752;
                        mutableState34 = mutableState29;
                        coroutineScope3 = coroutineScope3;
                        y32Var = y32Var;
                        qf2Var3 = qf2Var3;
                        i17 = 5;
                        r114.startReplaceGroup(1423291609);
                        r114.endReplaceGroup();
                        r115 = r114;
                    }
                    if (((Boolean) mutableState25.getValue()).booleanValue()) {
                        r115.startReplaceGroup(1423390065);
                        objRememberedValue49 = r115.rememberedValue();
                        companion14 = Composer.INSTANCE;
                        if (objRememberedValue49 == companion14.getEmpty()) {
                            objRememberedValue49 = new a50(17, mutableState25);
                            r115.updateRememberedValue(objRememberedValue49);
                        }
                        Function0 function48 = (Function0) objRememberedValue49;
                        objRememberedValue50 = r115.rememberedValue();
                        if (objRememberedValue50 == companion14.getEmpty()) {
                            mutableState66 = mutableState111;
                            objRememberedValue50 = new ey(i32, mutableState66, mutableState25);
                            r115.updateRememberedValue(objRememberedValue50);
                        } else {
                            mutableState66 = mutableState111;
                        }
                        Function0 function49 = (Function0) objRememberedValue50;
                        objRememberedValue51 = r115.rememberedValue();
                        if (objRememberedValue51 == companion14.getEmpty()) {
                            mutableState113 = mutableState113;
                            objRememberedValue51 = new ey(4, mutableState113, mutableState25);
                            r115.updateRememberedValue(objRememberedValue51);
                        } else {
                            mutableState113 = mutableState113;
                        }
                        Function0 function50 = (Function0) objRememberedValue51;
                        objRememberedValue52 = r115.rememberedValue();
                        if (objRememberedValue52 == companion14.getEmpty()) {
                            mutableState37 = mutableState114;
                            objRememberedValue52 = new ey(i17, mutableState37, mutableState25);
                            r115.updateRememberedValue(objRememberedValue52);
                        } else {
                            mutableState37 = mutableState114;
                        }
                        Function0 function51 = (Function0) objRememberedValue52;
                        objRememberedValue53 = r115.rememberedValue();
                        if (objRememberedValue53 == companion14.getEmpty()) {
                            mutableState126 = mutableState126;
                            objRememberedValue53 = new ey(6, mutableState126, mutableState25);
                            r115.updateRememberedValue(objRememberedValue53);
                        } else {
                            mutableState126 = mutableState126;
                        }
                        Function0 function52 = (Function0) objRememberedValue53;
                        objRememberedValue54 = r115.rememberedValue();
                        if (objRememberedValue54 == companion14.getEmpty()) {
                            mutableState36 = mutableState112;
                            objRememberedValue54 = new ey(7, mutableState36, mutableState25);
                            r115.updateRememberedValue(objRememberedValue54);
                        } else {
                            mutableState36 = mutableState112;
                        }
                        Function0 function53 = (Function0) objRememberedValue54;
                        objRememberedValue55 = r115.rememberedValue();
                        if (objRememberedValue55 == companion14.getEmpty()) {
                            mutableState38 = mutableState116;
                            objRememberedValue55 = new ey(8, mutableState38, mutableState25);
                            r115.updateRememberedValue(objRememberedValue55);
                        } else {
                            mutableState38 = mutableState116;
                        }
                        Function0 function54 = (Function0) objRememberedValue55;
                        objRememberedValue56 = r115.rememberedValue();
                        if (objRememberedValue56 == companion14.getEmpty()) {
                            mutableState39 = mutableState117;
                            objRememberedValue56 = new ey(9, mutableState39, mutableState25);
                            r115.updateRememberedValue(objRememberedValue56);
                        } else {
                            mutableState39 = mutableState117;
                        }
                        Function0 function55 = (Function0) objRememberedValue56;
                        vc vcVar3 = vcVar;
                        zChanged5 = r115.changed(vcVar3);
                        objRememberedValue57 = r115.rememberedValue();
                        if (zChanged5) {
                            companion15 = companion14;
                        } else {
                            companion15 = companion14;
                            if (objRememberedValue57 == companion15.getEmpty()) {
                            }
                            Function0 function56 = (Function0) ((KFunction) objRememberedValue57);
                            objRememberedValue58 = r115.rememberedValue();
                            if (objRememberedValue58 == companion15.getEmpty()) {
                                mutableState40 = mutableState118;
                                objRememberedValue58 = new ey(10, mutableState40, mutableState25);
                                r115.updateRememberedValue(objRememberedValue58);
                            } else {
                                mutableState40 = mutableState118;
                            }
                            Function0 function57 = (Function0) objRememberedValue58;
                            objRememberedValue59 = r115.rememberedValue();
                            if (objRememberedValue59 == companion15.getEmpty()) {
                                mutableState41 = mutableState119;
                                objRememberedValue59 = new ey(11, mutableState41, mutableState25);
                                r115.updateRememberedValue(objRememberedValue59);
                            } else {
                                mutableState41 = mutableState119;
                            }
                            Function0 function58 = (Function0) objRememberedValue59;
                            objRememberedValue60 = r115.rememberedValue();
                            if (objRememberedValue60 == companion15.getEmpty()) {
                                mutableState42 = mutableState121;
                                objRememberedValue60 = new ey(12, mutableState42, mutableState25);
                                r115.updateRememberedValue(objRememberedValue60);
                            } else {
                                mutableState42 = mutableState121;
                            }
                            Function0 function59 = (Function0) objRememberedValue60;
                            objRememberedValue61 = r115.rememberedValue();
                            if (objRememberedValue61 == companion15.getEmpty()) {
                                mutableState43 = mutableState122;
                                objRememberedValue61 = new ey(13, mutableState43, mutableState25);
                                r115.updateRememberedValue(objRememberedValue61);
                            } else {
                                mutableState43 = mutableState122;
                            }
                            Function0 function60 = (Function0) objRememberedValue61;
                            objRememberedValue62 = r115.rememberedValue();
                            vcVar2 = vcVar3;
                            if (objRememberedValue62 == companion15.getEmpty()) {
                                mutableState123 = mutableState123;
                                objRememberedValue62 = new ey(14, mutableState123, mutableState25);
                                r115.updateRememberedValue(objRememberedValue62);
                            } else {
                                mutableState123 = mutableState123;
                            }
                            Function0 function61 = (Function0) objRememberedValue62;
                            zChangedInstance14 = r115.changedInstance(zq0Var4) | r115.changedInstance(context2);
                            Object objRememberedValue177 = r115.rememberedValue();
                            if (!zChangedInstance14 || objRememberedValue177 == companion15.getEmpty()) {
                                ghVar = new gh(6, mutableState124, (Object) zq0Var4, (Object) context2, (Object) mutableState125);
                                r115.updateRememberedValue(ghVar);
                            } else {
                                ghVar = objRememberedValue177;
                            }
                            Object r31 = r115;
                            mutableState35 = mutableState66;
                            kz1.b(function48, function49, function50, function51, function52, function53, function54, function55, false, function56, function57, function58, function59, function60, function61, (Function0) ghVar, r31, 14380470, 28086);
                            Object r144 = r31;
                            r144.endReplaceGroup();
                            r116 = r144;
                        }
                        objRememberedValue57 = new g6(vcVar3, 2);
                        r115.updateRememberedValue(objRememberedValue57);
                        Function0 function510 = (Function0) ((KFunction) objRememberedValue57);
                        objRememberedValue58 = r115.rememberedValue();
                        if (objRememberedValue58 == companion15.getEmpty()) {
                            mutableState40 = mutableState118;
                            objRememberedValue58 = new ey(10, mutableState40, mutableState25);
                            r115.updateRememberedValue(objRememberedValue58);
                        } else {
                            mutableState40 = mutableState118;
                        }
                        Function0 function511 = (Function0) objRememberedValue58;
                        objRememberedValue59 = r115.rememberedValue();
                        if (objRememberedValue59 == companion15.getEmpty()) {
                            mutableState41 = mutableState119;
                            objRememberedValue59 = new ey(11, mutableState41, mutableState25);
                            r115.updateRememberedValue(objRememberedValue59);
                        } else {
                            mutableState41 = mutableState119;
                        }
                        Function0 function512 = (Function0) objRememberedValue59;
                        objRememberedValue60 = r115.rememberedValue();
                        if (objRememberedValue60 == companion15.getEmpty()) {
                            mutableState42 = mutableState121;
                            objRememberedValue60 = new ey(12, mutableState42, mutableState25);
                            r115.updateRememberedValue(objRememberedValue60);
                        } else {
                            mutableState42 = mutableState121;
                        }
                        Function0 function513 = (Function0) objRememberedValue60;
                        objRememberedValue61 = r115.rememberedValue();
                        if (objRememberedValue61 == companion15.getEmpty()) {
                            mutableState43 = mutableState122;
                            objRememberedValue61 = new ey(13, mutableState43, mutableState25);
                            r115.updateRememberedValue(objRememberedValue61);
                        } else {
                            mutableState43 = mutableState122;
                        }
                        Function0 function62 = (Function0) objRememberedValue61;
                        objRememberedValue62 = r115.rememberedValue();
                        vcVar2 = vcVar3;
                        if (objRememberedValue62 == companion15.getEmpty()) {
                            mutableState123 = mutableState123;
                            objRememberedValue62 = new ey(14, mutableState123, mutableState25);
                            r115.updateRememberedValue(objRememberedValue62);
                        } else {
                            mutableState123 = mutableState123;
                        }
                        Function0 function63 = (Function0) objRememberedValue62;
                        zChangedInstance14 = r115.changedInstance(zq0Var4) | r115.changedInstance(context2);
                        Object objRememberedValue178 = r115.rememberedValue();
                        if (zChangedInstance14) {
                            ghVar = new gh(6, mutableState124, (Object) zq0Var4, (Object) context2, (Object) mutableState125);
                            r115.updateRememberedValue(ghVar);
                        } else {
                            ghVar = new gh(6, mutableState124, (Object) zq0Var4, (Object) context2, (Object) mutableState125);
                            r115.updateRememberedValue(ghVar);
                        }
                        Object r33 = r115;
                        mutableState35 = mutableState66;
                        kz1.b(function48, function49, function50, function51, function52, function53, function54, function55, false, function510, function511, function512, function513, function62, function63, (Function0) ghVar, r33, 14380470, 28086);
                        Object r145 = r33;
                        r145.endReplaceGroup();
                        r116 = r145;
                    } else {
                        zq0Var4 = zq0Var4;
                        context2 = context2;
                        vcVar2 = vcVar;
                        mutableState35 = mutableState111;
                        mutableState36 = mutableState112;
                        mutableState37 = mutableState114;
                        mutableState38 = mutableState116;
                        mutableState39 = mutableState117;
                        mutableState40 = mutableState118;
                        mutableState41 = mutableState119;
                        mutableState42 = mutableState121;
                        mutableState43 = mutableState122;
                        r115.startReplaceGroup(1425458137);
                        r115.endReplaceGroup();
                        r116 = r115;
                    }
                    bd.a(vcVar2, r116, 0);
                    if (((Boolean) mutableState35.getValue()).booleanValue()) {
                        r116.startReplaceGroup(1425554082);
                        objRememberedValue48 = r116.rememberedValue();
                        if (objRememberedValue48 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue48 = new ey(15, mutableState35, mutableState25);
                            r116.updateRememberedValue(objRememberedValue48);
                        }
                        Object r21 = r116;
                        mutableState45 = mutableState36;
                        mutableState44 = mutableState43;
                        i18 = 16;
                        b00.a((Function0) objRememberedValue48, true, null, r21, 54, 4);
                        Object r22 = r21;
                        r22.endReplaceGroup();
                        r10 = r22;
                    } else {
                        mutableState44 = mutableState43;
                        Object r24 = r116;
                        i18 = 16;
                        mutableState45 = mutableState36;
                        r24.startReplaceGroup(1425729945);
                        r24.endReplaceGroup();
                        r10 = r24;
                    }
                    if (((Boolean) mutableState45.getValue()).booleanValue()) {
                        r10.startReplaceGroup(1425771981);
                        objRememberedValue47 = r10.rememberedValue();
                        if (objRememberedValue47 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue47 = new ey(i18, mutableState45, mutableState25);
                            r10.updateRememberedValue(objRememberedValue47);
                        }
                        i19 = 6;
                        zb0.b((Function0) objRememberedValue47, r10, 6);
                        r10.endReplaceGroup();
                    } else {
                        i19 = 6;
                        r10.startReplaceGroup(1425906521);
                        r10.endReplaceGroup();
                    }
                    if (((Boolean) mutableState40.getValue()).booleanValue()) {
                        r10.startReplaceGroup(1425965886);
                        objRememberedValue45 = r10.rememberedValue();
                        companion13 = Composer.INSTANCE;
                        if (objRememberedValue45 == companion13.getEmpty()) {
                            objRememberedValue45 = new ey(17, mutableState40, mutableState25);
                            r10.updateRememberedValue(objRememberedValue45);
                        }
                        Function0 function64 = (Function0) objRememberedValue45;
                        userPreferences2 = userPreferences;
                        zChangedInstance13 = r10.changedInstance(userPreferences2) | r10.changedInstance(context2);
                        objRememberedValue46 = r10.rememberedValue();
                        if (!zChangedInstance13 || objRememberedValue46 == companion13.getEmpty()) {
                            mutableState46 = mutableState97;
                            objRememberedValue46 = new t5(userPreferences2, context2, mutableState46, 1);
                            r10.updateRememberedValue(objRememberedValue46);
                        } else {
                            mutableState46 = mutableState97;
                        }
                        q41.a(function64, (Function0) objRememberedValue46, r10, i19);
                        r10.endReplaceGroup();
                    } else {
                        mutableState46 = mutableState97;
                        userPreferences2 = userPreferences;
                        r10.startReplaceGroup(1426576121);
                        r10.endReplaceGroup();
                    }
                    if (((Boolean) mutableState37.getValue()).booleanValue()) {
                        r10.startReplaceGroup(1426619304);
                        objRememberedValue44 = r10.rememberedValue();
                        if (objRememberedValue44 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue44 = new ey(18, mutableState37, mutableState25);
                            r10.updateRememberedValue(objRememberedValue44);
                        }
                        v72.f((Function0) objRememberedValue44, r10, i19);
                        r10.endReplaceGroup();
                    } else {
                        r10.startReplaceGroup(1426758649);
                        r10.endReplaceGroup();
                    }
                    if (((Boolean) mutableState113.getValue()).booleanValue()) {
                        r10.startReplaceGroup(1426917028);
                        boolean zBooleanValue8 = ((Boolean) mutableState85.getValue()).booleanValue();
                        boolean zBooleanValue9 = ((Boolean) mutableState86.getValue()).booleanValue();
                        boolean zBooleanValue10 = ((Boolean) mutableState87.getValue()).booleanValue();
                        boolean zBooleanValue11 = ((Boolean) mutableState88.getValue()).booleanValue();
                        boolean zBooleanValue12 = ((Boolean) mutableState89.getValue()).booleanValue();
                        boolean zBooleanValue13 = ((Boolean) mutableState90.getValue()).booleanValue();
                        boolean zBooleanValue14 = ((Boolean) mutableState3.getValue()).booleanValue();
                        boolean zH = H(mutableState92);
                        boolean zBooleanValue15 = ((Boolean) mutableState93.getValue()).booleanValue();
                        boolean zI = I(mutableState94);
                        boolean zBooleanValue16 = ((Boolean) mutableState95.getValue()).booleanValue();
                        boolean zBooleanValue17 = ((Boolean) mutableState.getValue()).booleanValue();
                        boolean zJ2 = J(mutableState98);
                        boolean zBooleanValue18 = ((Boolean) mutableState46.getValue()).booleanValue();
                        objRememberedValue42 = r10.rememberedValue();
                        companion12 = Composer.INSTANCE;
                        if (objRememberedValue42 == companion12.getEmpty()) {
                            mutableState64 = mutableState113;
                            objRememberedValue42 = new ey(19, mutableState64, mutableState25);
                            r10.updateRememberedValue(objRememberedValue42);
                        } else {
                            mutableState64 = mutableState113;
                        }
                        Function0 function65 = (Function0) objRememberedValue42;
                        zChangedInstance12 = r10.changedInstance(userPreferences2);
                        mutableState65 = mutableState25;
                        objRememberedValue43 = r10.rememberedValue();
                        if (!zChangedInstance12 || objRememberedValue43 == companion12.getEmpty()) {
                            UserPreferences userPreferences5 = userPreferences2;
                            mutableState52 = mutableState90;
                            mutableState53 = mutableState92;
                            mutableState54 = mutableState93;
                            mutableState55 = mutableState94;
                            mutableState56 = mutableState98;
                            objRememberedValue43 = new e4(userPreferences5, mutableState85, mutableState86, mutableState87, mutableState88, mutableState89, mutableState52, mutableState3, mutableState53, mutableState54, mutableState55, mutableState95, mutableState, mutableState56, mutableState64, mutableState65, 1);
                            userPreferences3 = userPreferences5;
                            mutableState47 = mutableState85;
                            mutableState48 = mutableState86;
                            mutableState49 = mutableState87;
                            mutableState50 = mutableState88;
                            mutableState51 = mutableState89;
                            mutableState57 = mutableState65;
                            r10.updateRememberedValue(objRememberedValue43);
                        } else {
                            userPreferences3 = userPreferences2;
                            mutableState57 = mutableState65;
                            mutableState47 = mutableState85;
                            mutableState48 = mutableState86;
                            mutableState49 = mutableState87;
                            mutableState50 = mutableState88;
                            mutableState51 = mutableState89;
                            mutableState52 = mutableState90;
                            mutableState53 = mutableState92;
                            mutableState54 = mutableState93;
                            mutableState55 = mutableState94;
                            mutableState56 = mutableState98;
                        }
                        Object r34 = r10;
                        qu0.a(zBooleanValue8, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, zBooleanValue14, zH, zBooleanValue15, zI, zBooleanValue16, zBooleanValue17, zJ2, zBooleanValue18, function65, (Function13) objRememberedValue43, r34, 0, 24576);
                        Object r146 = r34;
                        r146.endReplaceGroup();
                        r117 = r146;
                    } else {
                        userPreferences3 = userPreferences2;
                        Object r147 = r10;
                        mutableState13 = mutableState13;
                        mutableState47 = mutableState85;
                        mutableState48 = mutableState86;
                        mutableState49 = mutableState87;
                        mutableState50 = mutableState88;
                        mutableState51 = mutableState89;
                        mutableState52 = mutableState90;
                        mutableState53 = mutableState92;
                        mutableState54 = mutableState93;
                        mutableState55 = mutableState94;
                        mutableState56 = mutableState98;
                        mutableState57 = mutableState25;
                        r147.startReplaceGroup(1430504441);
                        r147.endReplaceGroup();
                        r117 = r147;
                    }
                    if (((Boolean) mutableState126.getValue()).booleanValue()) {
                        r117.startReplaceGroup(1430560892);
                        String qrNetworkInterfaceName = userPreferences3.getQrNetworkInterfaceName();
                        objRememberedValue40 = r117.rememberedValue();
                        companion11 = Composer.INSTANCE;
                        if (objRememberedValue40 == companion11.getEmpty()) {
                            objRememberedValue40 = new ey(20, mutableState126, mutableState57);
                            r117.updateRememberedValue(objRememberedValue40);
                        }
                        Function0 function66 = (Function0) objRememberedValue40;
                        zChangedInstance11 = r117.changedInstance(userPreferences3);
                        objRememberedValue41 = r117.rememberedValue();
                        if (zChangedInstance11 || objRememberedValue41 == companion11.getEmpty()) {
                            objRememberedValue41 = new xn0(userPreferences3, mutableState126, mutableState57, 0);
                            r117.updateRememberedValue(objRememberedValue41);
                        }
                        xr1.b(qrNetworkInterfaceName, function66, (Function1) objRememberedValue41, r117, 48);
                        r117.endReplaceGroup();
                    } else {
                        r117.startReplaceGroup(1430988537);
                        r117.endReplaceGroup();
                    }
                    if (((Boolean) mutableState39.getValue()).booleanValue()) {
                        r117.startReplaceGroup(1431032774);
                        objRememberedValue39 = r117.rememberedValue();
                        if (objRememberedValue39 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue39 = new ey(21, mutableState39, mutableState57);
                            r117.updateRememberedValue(objRememberedValue39);
                        }
                        wm.a((Function0) objRememberedValue39, r117, 6);
                        r117.endReplaceGroup();
                    } else {
                        r117.startReplaceGroup(1431174041);
                        r117.endReplaceGroup();
                    }
                    if (((Boolean) mutableState41.getValue()).booleanValue()) {
                        r117.startReplaceGroup(1431231670);
                        List listQ = q(stateCollectAsState15);
                        String strR = r(stateCollectAsState16);
                        objRememberedValue35 = r117.rememberedValue();
                        companion10 = Composer.INSTANCE;
                        if (objRememberedValue35 == companion10.getEmpty()) {
                            mutableState63 = mutableState120;
                            objRememberedValue35 = new ey(22, mutableState63, mutableState41);
                            r117.updateRememberedValue(objRememberedValue35);
                        } else {
                            mutableState63 = mutableState120;
                        }
                        Function0 function67 = (Function0) objRememberedValue35;
                        y32Var2 = y32Var;
                        zChangedInstance9 = r117.changedInstance(coroutineScope3) | r117.changedInstance(y32Var2);
                        mutableState120 = mutableState63;
                        objRememberedValue36 = r117.rememberedValue();
                        if (zChangedInstance9 || objRememberedValue36 == companion10.getEmpty()) {
                            objRememberedValue36 = new g4(coroutineScope3, y32Var2, 2);
                            r117.updateRememberedValue(objRememberedValue36);
                        }
                        Function1 function68 = (Function1) objRememberedValue36;
                        zChangedInstance10 = r117.changedInstance(coroutineScope3) | r117.changedInstance(y32Var2);
                        objRememberedValue37 = r117.rememberedValue();
                        if (zChangedInstance10 || objRememberedValue37 == companion10.getEmpty()) {
                            objRememberedValue37 = new g4(coroutineScope3, y32Var2, 3);
                            r117.updateRememberedValue(objRememberedValue37);
                        }
                        Function1 function69 = (Function1) objRememberedValue37;
                        objRememberedValue38 = r117.rememberedValue();
                        if (objRememberedValue38 == companion10.getEmpty()) {
                            objRememberedValue38 = new ey(23, mutableState41, mutableState57);
                            r117.updateRememberedValue(objRememberedValue38);
                        }
                        Object r25 = r117;
                        q32.d(listQ, strR, function67, function68, function69, (Function0) objRememberedValue38, r25, 196992);
                        Object r148 = r25;
                        r148.endReplaceGroup();
                        r118 = r148;
                    } else {
                        r117.startReplaceGroup(1431880345);
                        r117.endReplaceGroup();
                        r118 = r117;
                    }
                    if (((Boolean) mutableState38.getValue()).booleanValue()) {
                        r118.startReplaceGroup(1431928519);
                        ProxyConfig proxyConfigM3 = M(stateCollectAsState13);
                        objRememberedValue33 = r118.rememberedValue();
                        companion9 = Composer.INSTANCE;
                        if (objRememberedValue33 == companion9.getEmpty()) {
                            objRememberedValue33 = new ey(24, mutableState38, mutableState57);
                            r118.updateRememberedValue(objRememberedValue33);
                        }
                        Function0 function70 = (Function0) objRememberedValue33;
                        zChangedInstance8 = r118.changedInstance(coroutineScope3) | r118.changedInstance(proxySettings) | r118.changedInstance(context2);
                        objRememberedValue34 = r118.rememberedValue();
                        if (!zChangedInstance8 || objRememberedValue34 == companion9.getEmpty()) {
                            MutableState mutableState138 = mutableState57;
                            objRememberedValue34 = new i4(coroutineScope3, proxySettings, context2, mutableState38, mutableState138, 1);
                            mutableState58 = mutableState138;
                            r118.updateRememberedValue(objRememberedValue34);
                        } else {
                            mutableState58 = mutableState57;
                        }
                        Object r26 = r118;
                        i20 = 1;
                        gr1.c(proxyConfigM3, proxyConfigServerManager, function70, (Function1) objRememberedValue34, r26, (ProxyConfigServerManager.$stable << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                        r26.endReplaceGroup();
                        r11 = r26;
                    } else {
                        mutableState58 = mutableState57;
                        Object r27 = r118;
                        i20 = 1;
                        r27.startReplaceGroup(1432468601);
                        r27.endReplaceGroup();
                        r11 = r27;
                    }
                    if (((Boolean) mutableState120.getValue()).booleanValue()) {
                        r11.startReplaceGroup(1432514016);
                        String str5 = (String) mutableState127.getValue();
                        String str6 = (String) mutableState127.getValue();
                        Object r7 = ((str6 != null || StringsKt.isBlank(str6)) && !((Boolean) mutableState128.getValue()).booleanValue()) ? i20 : 0;
                        boolean zBooleanValue19 = ((Boolean) mutableState128.getValue()).booleanValue();
                        objRememberedValue32 = r11.rememberedValue();
                        if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue32 = new ey(25, mutableState120, mutableState41);
                            r11.updateRememberedValue(objRememberedValue32);
                        }
                        e42.a(str5, r7, zBooleanValue19, (Function0) objRememberedValue32, r11, 3072);
                        r11.endReplaceGroup();
                    } else {
                        r11.startReplaceGroup(1432814809);
                        r11.endReplaceGroup();
                    }
                    if (((Boolean) mutableState42.getValue()).booleanValue()) {
                        r11.startReplaceGroup(1432875321);
                        t91 t91VarU = u(stateCollectAsState17);
                        objRememberedValue30 = r11.rememberedValue();
                        companion8 = Composer.INSTANCE;
                        if (objRememberedValue30 == companion8.getEmpty()) {
                            mutableState62 = mutableState42;
                            objRememberedValue30 = new ey(26, mutableState62, mutableState58);
                            r11.updateRememberedValue(objRememberedValue30);
                        } else {
                            mutableState62 = mutableState42;
                        }
                        Function0 function71 = (Function0) objRememberedValue30;
                        zChangedInstance7 = r11.changedInstance(sa1Var);
                        objRememberedValue31 = r11.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue31 == companion8.getEmpty()) {
                            objRememberedValue31 = new j4(sa1Var, mutableState62, mutableState58, i20);
                            r11.updateRememberedValue(objRememberedValue31);
                        }
                        y91.c(t91VarU, onlineSubtitleConfigServerManager, function71, (Function1) objRememberedValue31, r11, (OnlineSubtitleConfigServerManager.$stable << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                        Object r28 = r11;
                        r28.endReplaceGroup();
                        r1 = r28;
                    } else {
                        Object r29 = r11;
                        r29.startReplaceGroup(1433336601);
                        r29.endReplaceGroup();
                        r1 = r29;
                    }
                    if (((Boolean) mutableState44.getValue()).booleanValue()) {
                        r1.startReplaceGroup(1433387627);
                        ye2 ye2VarV = v(stateCollectAsState18);
                        objRememberedValue27 = r1.rememberedValue();
                        companion7 = Composer.INSTANCE;
                        if (objRememberedValue27 == companion7.getEmpty()) {
                            objRememberedValue27 = new ey(27, mutableState44, mutableState58);
                            r1.updateRememberedValue(objRememberedValue27);
                        }
                        Function0 function72 = (Function0) objRememberedValue27;
                        qf2Var = qf2Var3;
                        zChangedInstance6 = r1.changedInstance(qf2Var);
                        objRememberedValue28 = r1.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue28 == companion7.getEmpty()) {
                            objRememberedValue28 = new k4(qf2Var, i20);
                            r1.updateRememberedValue(objRememberedValue28);
                        }
                        Function1 function73 = (Function1) objRememberedValue28;
                        int i45 = (r1.changedInstance(userPreferences3) ? 1 : 0) | (r1.changedInstance(serverPreferences5) ? 1 : 0) | (r1.changed(mutableState33) ? 1 : 0) | (r1.changedInstance(context2) ? 1 : 0);
                        if ((i29 & 3670016) == 1048576) {
                            i23 = i20;
                        } else {
                            i23 = 0;
                        }
                        int i46 = i45 | i23 | (r1.changedInstance(zq0Var4) ? 1 : 0);
                        if ((i29 & i16) == 131072) {
                            i24 = i20;
                        } else {
                            i24 = 0;
                        }
                        i25 = i46 | i24;
                        objRememberedValue29 = r1.rememberedValue();
                        if (i25 == 0 || objRememberedValue29 == companion7.getEmpty()) {
                            np0 np0Var = new np0(serverPreferences5, context2, function0, zq0Var4, userPreferences3, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState3, mutableState53, mutableState54, mutableState55, mutableState95, mutableState, mutableState46, mutableState56, mutableState33, function6, mutableState34, mutableState13);
                            r1.updateRememberedValue(np0Var);
                            objRememberedValue29 = np0Var;
                        }
                        Object r149 = r1;
                        ef2.f(ye2VarV, pf2Var, webDavSyncConfigServerManager, function72, function73, (Function1) ((KFunction) objRememberedValue29), r149, (WebDavSyncConfigServerManager.$stable << 6) | 3072);
                        Object r150 = r149;
                        r150.endReplaceGroup();
                        r119 = r150;
                    } else {
                        Object r151 = r1;
                        mutableState58 = mutableState58;
                        r151.startReplaceGroup(1433862361);
                        r151.endReplaceGroup();
                        r119 = r151;
                    }
                    if (((Boolean) mutableState123.getValue()).booleanValue()) {
                        r119.startReplaceGroup(1433907714);
                        i92 i92VarW = w(stateCollectAsState19);
                        objRememberedValue25 = r119.rememberedValue();
                        companion6 = Composer.INSTANCE;
                        if (objRememberedValue25 == companion6.getEmpty()) {
                            objRememberedValue25 = new ey(28, mutableState123, mutableState58);
                            r119.updateRememberedValue(objRememberedValue25);
                        }
                        Function0 function74 = (Function0) objRememberedValue25;
                        ab2Var = ab2Var3;
                        zChangedInstance5 = r119.changedInstance(ab2Var);
                        objRememberedValue26 = r119.rememberedValue();
                        if (!zChangedInstance5 || objRememberedValue26 == companion6.getEmpty()) {
                            z22 = true;
                            objRememberedValue26 = new l4(ab2Var, 1);
                            r119.updateRememberedValue(objRememberedValue26);
                        } else {
                            z22 = true;
                        }
                        hb2.b(i92VarW, xa2Var, function74, (Function1) objRememberedValue26, r119, 448);
                        r119.endReplaceGroup();
                        r2 = z22;
                    } else {
                        r2 = 1;
                        r119.startReplaceGroup(1434237337);
                        r119.endReplaceGroup();
                    }
                    if (((Boolean) mutableState124.getValue()).booleanValue()) {
                        r119.startReplaceGroup(1434277296);
                        objRememberedValue24 = r119.rememberedValue();
                        if (objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                            i21 = 29;
                            objRememberedValue24 = new h10(29);
                            r119.updateRememberedValue(objRememberedValue24);
                        } else {
                            i21 = 29;
                        }
                        Object r35 = r119;
                        AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue24, et.g(), null, null, null, et.c(), et.e(), null, 0L, 0L, 0L, 0L, 0.0f, null, r35, 1769526, 0, 16284);
                        Object r152 = r35;
                        r152.endReplaceGroup();
                        r120 = r152;
                    } else {
                        i21 = 29;
                        r119.startReplaceGroup(1434716473);
                        r119.endReplaceGroup();
                        r120 = r119;
                    }
                    if (((Boolean) mutableState125.getValue()).booleanValue()) {
                        r120.startReplaceGroup(1434768770);
                        objRememberedValue23 = r120.rememberedValue();
                        if (objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                            mutableState61 = mutableState125;
                            objRememberedValue23 = new ey(i21, mutableState61, mutableState58);
                            r120.updateRememberedValue(objRememberedValue23);
                        } else {
                            mutableState61 = mutableState125;
                        }
                        i22 = 54;
                        Object r36 = r120;
                        AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue23, ComposableLambdaKt.rememberComposableLambda(2080795661, r2, new m4(r2, mutableState61, mutableState58), r120, 54), null, null, null, et.j(), et.f(), null, 0L, 0L, 0L, 0L, 0.0f, null, r36, 1769526, 0, 16284);
                        Object r153 = r36;
                        r153.endReplaceGroup();
                        r121 = r153;
                    } else {
                        i22 = 54;
                        r120.startReplaceGroup(1435190649);
                        r120.endReplaceGroup();
                        r121 = r120;
                    }
                    if (s(mutableState129) != null) {
                        r121.startReplaceGroup(1435242636);
                        objRememberedValue22 = r121.rememberedValue();
                        if (objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                            mutableState60 = mutableState129;
                            objRememberedValue22 = new a50(21, mutableState60);
                            r121.updateRememberedValue(objRememberedValue22);
                        } else {
                            mutableState60 = mutableState129;
                        }
                        Object r37 = r121;
                        AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue22, ComposableLambdaKt.rememberComposableLambda(-1287416882, r2, new b2(11, mutableState60), r121, i22), null, null, null, et.h(), ComposableLambdaKt.rememberComposableLambda(1035531219, r2, new b2(12, mutableState60), r121, i22), null, 0L, 0L, 0L, 0L, 0.0f, null, r37, 1769526, 0, 16284);
                        Object r154 = r37;
                        r154.endReplaceGroup();
                        r122 = r154;
                    } else {
                        r121.startReplaceGroup(1435624153);
                        r121.endReplaceGroup();
                        r122 = r121;
                    }
                    if (t(mutableState130) != null) {
                        r122.startReplaceGroup(1435674993);
                        objRememberedValue21 = r122.rememberedValue();
                        if (objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                            mutableState59 = mutableState130;
                            objRememberedValue21 = new a50(22, mutableState59);
                            r122.updateRememberedValue(objRememberedValue21);
                        } else {
                            mutableState59 = mutableState130;
                        }
                        Object r39 = r122;
                        AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue21, ComposableLambdaKt.rememberComposableLambda(-360662129, r2, new b2(13, mutableState59), r122, i22), null, null, null, et.b(), ComposableLambdaKt.rememberComposableLambda(1962285972, r2, new b2(14, mutableState59), r122, i22), null, 0L, 0L, 0L, 0L, 0.0f, null, r39, 1769526, 0, 16284);
                        Object r155 = r39;
                        r155.endReplaceGroup();
                        r123 = r155;
                    } else {
                        r122.startReplaceGroup(1436051705);
                        r122.endReplaceGroup();
                        r123 = r122;
                    }
                    r123.endReplaceGroup();
                    r110 = r123;
                } else {
                    r19.startReplaceGroup(1436057657);
                    r19.endReplaceGroup();
                    r110 = r19;
                }
                r14 = r110;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    r14 = r110;
                }
            }
            objRememberedValue175 = new yn0(zq0Var3, 0);
            r127.updateRememberedValue(objRememberedValue175);
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue175, (Composer) r127, 6);
            if (serverById2 != 0) {
                listCreateListBuilder = CollectionsKt.createListBuilder();
                String displayAddress2 = serverById2.getDisplayAddress();
                if (L(mutableState2).e == null) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                listCreateListBuilder.add(new tn0(null, "主线路", displayAddress2, z38, true, null, null, null, (ServerPingState) ((Map) stateCollectAsState12.getValue()).get(null), null, 1504));
                while (it.hasNext()) {
                    BackupRouteConfig backupRouteConfig2 = (BackupRouteConfig) it.next();
                    String id2 = backupRouteConfig2.getId();
                    alias = backupRouteConfig2.getAlias();
                    if (StringsKt.isBlank(alias)) {
                        alias = "未命名线路";
                    }
                    listCreateListBuilder.add(new tn0(id2, alias, backupRouteConfig2.getDisplayAddress(), Intrinsics.areEqual(L(mutableState2).e, backupRouteConfig2.getId()), false, null, null, null, (ServerPingState) ((Map) stateCollectAsState12.getValue()).get(backupRouteConfig2.getId()), null, 1504));
                }
                listEmptyList = CollectionsKt.build(listCreateListBuilder);
            } else {
                listEmptyList = null;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            listA = zy1.a(serverPreferences2.getAllServers(), L(mutableState2).c(), ((Boolean) mutableState85.getValue()).booleanValue(), false, F(stateCollectAsState11), "查看、添加或编辑服务器");
            if (z3) {
                z4 = false;
            } else {
                z4 = false;
            }
            objRememberedValue = r127.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                mutableState9 = mutableState8;
                final MutableState mutableState139 = mutableState7;
                final MutableState mutableState1310 = mutableState6;
                objRememberedValue = new Function0() { // from class: zn0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState mutableState1311;
                        Number number;
                        MutableState mutableState1312 = mutableState1310;
                        rn0 rn0Var = (rn0) mutableState1312.getValue();
                        MutableState mutableState1313 = mutableState104;
                        if (((Boolean) mutableState1313.getValue()).booleanValue()) {
                            mutableState1313.setValue(Boolean.FALSE);
                        } else {
                            MutableState mutableState1314 = mutableState120;
                            boolean zBooleanValue20 = ((Boolean) mutableState1314.getValue()).booleanValue();
                            MutableState mutableState1315 = mutableState119;
                            if (zBooleanValue20) {
                                mutableState1314.setValue(Boolean.FALSE);
                                Unit unit7 = Unit.INSTANCE;
                                bq0.p(mutableState1315, true);
                            } else {
                                MutableState mutableState1316 = mutableState129;
                                if (((String) mutableState1316.getValue()) != null) {
                                    mutableState1316.setValue(null);
                                } else {
                                    MutableState mutableState140 = mutableState130;
                                    if (((String) mutableState140.getValue()) != null) {
                                        mutableState140.setValue(null);
                                    } else {
                                        MutableState mutableState141 = mutableState111;
                                        boolean zBooleanValue21 = ((Boolean) mutableState141.getValue()).booleanValue();
                                        MutableState mutableState142 = mutableState110;
                                        if (zBooleanValue21) {
                                            mutableState141.setValue(Boolean.FALSE);
                                            Unit unit8 = Unit.INSTANCE;
                                            bq0.n(mutableState142, true);
                                        } else {
                                            MutableState mutableState143 = mutableState112;
                                            if (((Boolean) mutableState143.getValue()).booleanValue()) {
                                                mutableState143.setValue(Boolean.FALSE);
                                                Unit unit9 = Unit.INSTANCE;
                                                bq0.n(mutableState142, true);
                                            } else {
                                                MutableState mutableState144 = mutableState113;
                                                if (((Boolean) mutableState144.getValue()).booleanValue()) {
                                                    mutableState144.setValue(Boolean.FALSE);
                                                    Unit unit10 = Unit.INSTANCE;
                                                    bq0.n(mutableState142, true);
                                                } else {
                                                    MutableState mutableState145 = mutableState114;
                                                    if (((Boolean) mutableState145.getValue()).booleanValue()) {
                                                        mutableState145.setValue(Boolean.FALSE);
                                                        Unit unit11 = Unit.INSTANCE;
                                                        bq0.n(mutableState142, true);
                                                    } else {
                                                        MutableState mutableState146 = mutableState126;
                                                        if (((Boolean) mutableState146.getValue()).booleanValue()) {
                                                            mutableState146.setValue(Boolean.FALSE);
                                                            Unit unit12 = Unit.INSTANCE;
                                                            bq0.n(mutableState142, true);
                                                        } else {
                                                            MutableState mutableState147 = mutableState116;
                                                            if (((Boolean) mutableState147.getValue()).booleanValue()) {
                                                                mutableState147.setValue(Boolean.FALSE);
                                                                Unit unit13 = Unit.INSTANCE;
                                                                bq0.n(mutableState142, true);
                                                            } else {
                                                                MutableState mutableState148 = mutableState117;
                                                                if (((Boolean) mutableState148.getValue()).booleanValue()) {
                                                                    mutableState148.setValue(Boolean.FALSE);
                                                                    Unit unit14 = Unit.INSTANCE;
                                                                    bq0.n(mutableState142, true);
                                                                } else {
                                                                    MutableState mutableState149 = mutableState118;
                                                                    if (((Boolean) mutableState149.getValue()).booleanValue()) {
                                                                        mutableState149.setValue(Boolean.FALSE);
                                                                        Unit unit15 = Unit.INSTANCE;
                                                                        bq0.n(mutableState142, true);
                                                                    } else if (((Boolean) mutableState1315.getValue()).booleanValue()) {
                                                                        mutableState1315.setValue(Boolean.FALSE);
                                                                        Unit unit16 = Unit.INSTANCE;
                                                                        bq0.n(mutableState142, true);
                                                                    } else {
                                                                        MutableState mutableState150 = mutableState121;
                                                                        if (((Boolean) mutableState150.getValue()).booleanValue()) {
                                                                            mutableState150.setValue(Boolean.FALSE);
                                                                            Unit unit17 = Unit.INSTANCE;
                                                                            bq0.n(mutableState142, true);
                                                                        } else {
                                                                            MutableState mutableState151 = mutableState122;
                                                                            if (((Boolean) mutableState151.getValue()).booleanValue()) {
                                                                                mutableState151.setValue(Boolean.FALSE);
                                                                                Unit unit18 = Unit.INSTANCE;
                                                                                bq0.n(mutableState142, true);
                                                                            } else {
                                                                                MutableState mutableState152 = mutableState123;
                                                                                if (((Boolean) mutableState152.getValue()).booleanValue()) {
                                                                                    mutableState152.setValue(Boolean.FALSE);
                                                                                    Unit unit19 = Unit.INSTANCE;
                                                                                    bq0.n(mutableState142, true);
                                                                                } else {
                                                                                    MutableState mutableState153 = mutableState125;
                                                                                    if (((Boolean) mutableState153.getValue()).booleanValue()) {
                                                                                        mutableState153.setValue(Boolean.FALSE);
                                                                                        Unit unit110 = Unit.INSTANCE;
                                                                                        bq0.n(mutableState142, true);
                                                                                    } else if (((Boolean) mutableState142.getValue()).booleanValue()) {
                                                                                        mutableState142.setValue(Boolean.FALSE);
                                                                                    } else if (!((Boolean) mutableState124.getValue()).booleanValue()) {
                                                                                        MutableState mutableState154 = mutableState103;
                                                                                        if (((Boolean) mutableState154.getValue()).booleanValue()) {
                                                                                            mutableState154.setValue(Boolean.FALSE);
                                                                                        } else {
                                                                                            MutableState mutableState155 = mutableState101;
                                                                                            if (((Boolean) mutableState155.getValue()).booleanValue()) {
                                                                                                mutableState155.setValue(Boolean.FALSE);
                                                                                                bq0.k(mutableState102, false);
                                                                                            } else {
                                                                                                MutableState mutableState156 = mutableState105;
                                                                                                if (((Boolean) mutableState156.getValue()).booleanValue()) {
                                                                                                    mutableState156.setValue(Boolean.FALSE);
                                                                                                } else {
                                                                                                    MutableState mutableState157 = mutableState107;
                                                                                                    boolean zBooleanValue22 = ((Boolean) mutableState157.getValue()).booleanValue();
                                                                                                    MutableState mutableState158 = mutableState108;
                                                                                                    if (zBooleanValue22) {
                                                                                                        bq0.h(mutableState109, mutableState157, mutableState158);
                                                                                                    } else {
                                                                                                        MutableState mutableState159 = mutableState106;
                                                                                                        if (((Boolean) mutableState159.getValue()).booleanValue()) {
                                                                                                            mutableState159.setValue(Boolean.FALSE);
                                                                                                            mutableState158.setValue(CollectionsKt.emptyList());
                                                                                                        } else {
                                                                                                            MutableState mutableState160 = mutableState79;
                                                                                                            if (((Boolean) mutableState160.getValue()).booleanValue()) {
                                                                                                                mutableState160.setValue(Boolean.FALSE);
                                                                                                            } else {
                                                                                                                rn0 rn0Var2 = rn0.a;
                                                                                                                MutableState mutableState161 = mutableState139;
                                                                                                                if (rn0Var != rn0Var2) {
                                                                                                                    mutableState1312.setValue(rn0Var2);
                                                                                                                    bq0.o(mutableState161, true);
                                                                                                                    MutableState mutableState162 = mutableState5;
                                                                                                                    mr.A((Number) mutableState162.getValue(), 1, mutableState162);
                                                                                                                    mutableState160.setValue(Boolean.FALSE);
                                                                                                                } else if (!((Boolean) mutableState95.getValue()).booleanValue() || ((Boolean) mutableState9.getValue()).booleanValue()) {
                                                                                                                    mutableState160.setValue(Boolean.TRUE);
                                                                                                                } else {
                                                                                                                    if (((Boolean) mutableState161.getValue()).booleanValue()) {
                                                                                                                        mutableState1311 = mutableState80;
                                                                                                                        number = (Number) mutableState1311.getValue();
                                                                                                                    } else {
                                                                                                                        mutableState1311 = mutableState83;
                                                                                                                        number = (Number) mutableState1311.getValue();
                                                                                                                    }
                                                                                                                    mr.A(number, 1, mutableState1311);
                                                                                                                    mutableState160.setValue(Boolean.FALSE);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                mutableState10 = mutableState1310;
                mutableState126 = mutableState126;
                mutableState116 = mutableState116;
                mutableState95 = mutableState95;
                mutableState129 = mutableState129;
                mutableState110 = mutableState110;
                r127.updateRememberedValue(objRememberedValue);
            } else {
                mutableState9 = mutableState8;
                mutableState10 = mutableState6;
            }
            list = listEmptyList;
            BackHandlerKt.BackHandler(z4, (Function0) objRememberedValue, r127, 48, 0);
            Boolean boolValueOf7 = Boolean.valueOf(z3);
            if (i30 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            zChangedInstance = z5 | r127.changedInstance(zq0Var3);
            objRememberedValue2 = r127.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue2 = new to0(0, zq0Var3, z3);
                r127.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new to0(0, zq0Var3, z3);
                r127.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(boolValueOf7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, (Composer) r127, i31);
            companion2 = Modifier.INSTANCE;
            vcVar = vcVarB;
            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            if (i30 == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            objRememberedValue3 = r127.rememberedValue();
            if (z6) {
                objRememberedValue3 = new uo0(z3, 0);
                r127.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new uo0(z3, 0);
                r127.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxSize$default4, (Function1) objRememberedValue3);
            if (i30 == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            zChanged = z7 | r127.changed(state2) | r127.changedInstance(zq0Var3);
            objRememberedValue4 = r127.rememberedValue();
            if (zChanged) {
                objRememberedValue4 = new kp0(z3, zq0Var3, mutableState10, state2);
                r127.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new kp0(z3, zq0Var3, mutableState10, state2);
                r127.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(modifierGraphicsLayer2, (Function1) objRememberedValue4);
            companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int iB6 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
            CompositionLocalMap currentCompositionLocalMap6 = r127.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(r127, modifierOnPreviewKeyEvent2);
            companion4 = ComposeUiNode.INSTANCE;
            mutableState11 = mutableState2;
            constructor = companion4.getConstructor();
            if (!id.n(r127.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            r127.startReusableNode();
            if (r127.getInserting()) {
                r127.createNode(constructor);
            } else {
                r127.useNode();
            }
            Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(r127);
            mr.z(companion4, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
            Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl6, Integer.valueOf(iB6), composerM4318constructorimpl6));
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            state3 = state2;
            focusRequester = focusRequester2;
            Modifier modifierFocusGroup2 = FocusableKt.focusGroup(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), focusRequester));
            arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), r127, 0);
            int iB7 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
            CompositionLocalMap currentCompositionLocalMap7 = r127.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(r127, modifierFocusGroup2);
            constructor2 = companion4.getConstructor();
            if (!id.n(r127.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            r127.startReusableNode();
            if (r127.getInserting()) {
                r127.createNode(constructor2);
            } else {
                r127.useNode();
            }
            Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(r127);
            mr.z(companion4, composerM4318constructorimpl7, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl7, currentCompositionLocalMap7);
            Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl7, Integer.valueOf(iB7), composerM4318constructorimpl7));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            iOrdinal = G(mutableState10).ordinal();
            if (iOrdinal != 0) {
                focusRequester = focusRequester;
                i11 = i10;
                mutableState12 = mutableState109;
                vcVar = vcVar;
                state4 = stateCollectAsState10;
                mutableState126 = mutableState126;
                mutableState120 = mutableState120;
                mutableState116 = mutableState116;
                mutableState110 = mutableState110;
                mutableState111 = mutableState111;
                mutableState112 = mutableState112;
                mutableState113 = mutableState113;
                mutableState114 = mutableState114;
                mutableState117 = mutableState117;
                mutableState118 = mutableState118;
                mutableState121 = mutableState121;
                mutableState122 = mutableState122;
                mutableState123 = mutableState123;
                lz0Var = lz0Var4;
                mutableState119 = mutableState119;
                ab2Var3 = ab2Var3;
                zq0Var4 = zq0Var3;
                mutableState13 = mutableState7;
                modifierM286borderxT4_qwU = companion2;
                mutableState129 = mutableState129;
                state5 = state;
                r127.startReplaceGroup(-1697239098);
                hq0Var = (hq0) stateCollectAsState2.getValue();
                if (hq0Var instanceof fq0) {
                    r127.startReplaceGroup(-1697475876);
                    Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(modifierM286borderxT4_qwU, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    int iB8 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                    CompositionLocalMap currentCompositionLocalMap8 = r127.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(r127, modifierFillMaxSize$default5);
                    constructor5 = companion4.getConstructor();
                    if (!id.n(r127.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    r127.startReusableNode();
                    if (r127.getInserting()) {
                        r127.createNode(constructor5);
                    } else {
                        r127.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(r127);
                    mr.z(companion4, composerM4318constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl8, Integer.valueOf(iB8), composerM4318constructorimpl8));
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, r127, 0, 63);
                    Object r1211 = r127;
                    r1211.endNode();
                    r1211.endReplaceGroup();
                    mutableState14 = mutableState102;
                    mutableState21 = mutableState10;
                    mutableState15 = mutableState104;
                    mutableState16 = mutableState103;
                    c = 23;
                    str = null;
                    mutableState17 = mutableState106;
                    r16 = r1211;
                } else {
                    mutableState14 = mutableState102;
                    mutableState15 = mutableState104;
                    mutableState16 = mutableState103;
                    mutableState17 = mutableState106;
                    if (hq0Var instanceof eq0) {
                        r127.startReplaceGroup(-1697072938);
                        objRememberedValue18 = r127.rememberedValue();
                        if (objRememberedValue18 == companion.getEmpty()) {
                            obj5 = null;
                            objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            r127.updateRememberedValue(objRememberedValue18);
                        } else {
                            obj5 = null;
                        }
                        mutableState22 = (MutableState) objRememberedValue18;
                        MutableState mutableState1311 = mutableState10;
                        Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(modifierM286borderxT4_qwU, 0.0f, 1, obj5);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        int iB9 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                        CompositionLocalMap currentCompositionLocalMap9 = r127.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(r127, modifierFillMaxSize$default6);
                        constructor3 = companion4.getConstructor();
                        if (!id.n(r127.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        r127.startReusableNode();
                        if (r127.getInserting()) {
                            r127.createNode(constructor3);
                        } else {
                            r127.useNode();
                        }
                        Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(r127);
                        mr.z(companion4, composerM4318constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM4318constructorimpl9, currentCompositionLocalMap9);
                        Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl9, Integer.valueOf(iB9), composerM4318constructorimpl9));
                        MeasurePolicy measurePolicyP2 = mr.p(16.0f, arrangement, companion3.getCenterHorizontally(), r127, 54);
                        int iB10 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(r127, 0));
                        CompositionLocalMap currentCompositionLocalMap10 = r127.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(r127, modifierM286borderxT4_qwU);
                        constructor4 = companion4.getConstructor();
                        if (!id.n(r127.getApplier())) {
                            ComposablesKt.invalidApplier();
                        }
                        r127.startReusableNode();
                        if (r127.getInserting()) {
                            r127.createNode(constructor4);
                        } else {
                            r127.useNode();
                        }
                        Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(r127);
                        mr.z(companion4, composerM4318constructorimpl10, measurePolicyP2, composerM4318constructorimpl10, currentCompositionLocalMap10);
                        Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl10, Integer.valueOf(iB10), composerM4318constructorimpl10));
                        String strA4 = ((eq0) hq0Var).a();
                        r6 = MaterialTheme.INSTANCE;
                        i14 = MaterialTheme.$stable;
                        str = null;
                        TextKt.m3048TextNvy7gAk(strA4, null, r6.getColorScheme(r127, i14).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r6.getTypography(r127, i14).getBodyLarge(), r127, 0, 0, 131066);
                        zChangedInstance4 = r127.changedInstance(zq0Var4);
                        objRememberedValue19 = r127.rememberedValue();
                        if (zChangedInstance4) {
                            final int i312 = 0;
                            objRememberedValue19 = new Function0() { // from class: vo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i313 = i312;
                                    zq0 zq0Var7 = zq0Var4;
                                    switch (i313) {
                                        case 0:
                                            zq0Var7.E(false, false);
                                            break;
                                        case 1:
                                            zq0Var7.k.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            zq0Var7.E(false, false);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue19);
                        } else {
                            final int i313 = 0;
                            objRememberedValue19 = new Function0() { // from class: vo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i314 = i313;
                                    zq0 zq0Var7 = zq0Var4;
                                    switch (i314) {
                                        case 0:
                                            zq0Var7.E(false, false);
                                            break;
                                        case 1:
                                            zq0Var7.k.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            zq0Var7.E(false, false);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue19);
                        }
                        Function0 function115 = (Function0) objRememberedValue19;
                        objRememberedValue20 = r127.rememberedValue();
                        if (objRememberedValue20 == companion.getEmpty()) {
                            objRememberedValue20 = new h70(18, mutableState22);
                            r127.updateRememberedValue(objRememberedValue20);
                        }
                        Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM286borderxT4_qwU, (Function1) objRememberedValue20);
                        if (x(mutableState22)) {
                            r127.startReplaceGroup(492049091);
                            modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierM286borderxT4_qwU, Dp.m7813constructorimpl(3.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), r6.getShapes(r127, i14).getMedium());
                            r127.endReplaceGroup();
                        } else {
                            r127.startReplaceGroup(492432096);
                            r127.endReplaceGroup();
                        }
                        ButtonKt.Button(function115, modifierOnFocusChanged2.then(modifierM286borderxT4_qwU), false, null, null, null, null, null, null, et.k(), r127, 805306368, 508);
                        r127.endNode();
                        r127.endNode();
                        r127.endReplaceGroup();
                        r16 = r127;
                        mutableState14 = mutableState14;
                        mutableState21 = mutableState1311;
                        c = 23;
                    } else {
                        lz0Var = lz0Var;
                        mutableState18 = mutableState10;
                        str = null;
                        if (hq0Var instanceof gq0) {
                            r127.startReplaceGroup(360892348);
                            r127.endReplaceGroup();
                            qu.f();
                            return;
                        }
                        r127.startReplaceGroup(-1694909231);
                        Boolean boolValueOf8 = Boolean.valueOf(z);
                        rn0 rn0VarG5 = G(mutableState18);
                        gq0Var = (gq0) hq0Var;
                        list2 = gq0Var.c;
                        list3 = gq0Var.a;
                        Object[] objArr7 = {boolValueOf8, rn0VarG5, list3, (ItemCounts) state4.getValue()};
                        if (i30 == 256) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        zChanged2 = z8 | r127.changed(hq0Var) | r127.changed(state4) | r127.changedInstance(zq0Var4);
                        objRememberedValue5 = r127.rememberedValue();
                        if (zChanged2) {
                            gq0Var2 = gq0Var;
                            objRememberedValue5 = new lp0(z, gq0Var2, zq0Var4, mutableState18, state4, (Continuation) null);
                            mutableState19 = mutableState18;
                            r127.updateRememberedValue(objRememberedValue5);
                        } else {
                            gq0Var2 = gq0Var;
                            objRememberedValue5 = new lp0(z, gq0Var2, zq0Var4, mutableState18, state4, (Continuation) null);
                            mutableState19 = mutableState18;
                            r127.updateRememberedValue(objRememberedValue5);
                        }
                        EffectsKt.LaunchedEffect(objArr7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, (Composer) r127, 0);
                        zChanged3 = r127.changed((Set) stateCollectAsState14.getValue()) | r127.changed(list3);
                        objRememberedValue6 = r127.rememberedValue();
                        if (zChanged3) {
                            obj3 = objRememberedValue6;
                            arrayList = new ArrayList();
                            while (r2.hasNext()) {
                                if (!((Set) stateCollectAsState14.getValue()).contains(((Library) obj6).getId())) {
                                    arrayList.add(obj6);
                                }
                            }
                            r127.updateRememberedValue(arrayList);
                            obj3 = arrayList;
                        } else {
                            obj3 = objRememberedValue6;
                            arrayList = new ArrayList();
                            while (r2.hasNext()) {
                                if (!((Set) stateCollectAsState14.getValue()).contains(((Library) obj6).getId())) {
                                    arrayList.add(obj6);
                                }
                            }
                            r127.updateRememberedValue(arrayList);
                            obj3 = arrayList;
                        }
                        obj3 = objRememberedValue6;
                        List list7 = (List) obj3;
                        zChanged4 = r127.changed((Set) stateCollectAsState14.getValue()) | r127.changed(list2);
                        objRememberedValue7 = r127.rememberedValue();
                        if (zChanged4) {
                            obj4 = objRememberedValue7;
                            arrayList2 = new ArrayList();
                            while (r2.hasNext()) {
                                if (!((Set) stateCollectAsState14.getValue()).contains(((rx0) obj7).getLibrary().getId())) {
                                    arrayList2.add(obj7);
                                }
                            }
                            r127.updateRememberedValue(arrayList2);
                            obj4 = arrayList2;
                        } else {
                            obj4 = objRememberedValue7;
                            arrayList2 = new ArrayList();
                            while (r2.hasNext()) {
                                if (!((Set) stateCollectAsState14.getValue()).contains(((rx0) obj7).getLibrary().getId())) {
                                    arrayList2.add(obj7);
                                }
                            }
                            r127.updateRememberedValue(arrayList2);
                            obj4 = arrayList2;
                        }
                        obj4 = objRememberedValue7;
                        List list8 = (List) obj4;
                        List listB2 = gq0Var2.b();
                        String str7 = (String) state5.getValue();
                        Integer numZ2 = z(stateCollectAsState4);
                        String strA5 = A(stateCollectAsState5);
                        String strB3 = B(stateCollectAsState6);
                        boolean zC2 = C(state3);
                        boolean zE2 = E(stateCollectAsState9);
                        if (function5 == null) {
                            r127.startReplaceGroup(-1689383606);
                            r127.endReplaceGroup();
                            function10 = null;
                        } else {
                            r127.startReplaceGroup(-1689383605);
                            zChangedInstance2 = r127.changedInstance(zq0Var4) | r127.changed(function5);
                            objRememberedValue8 = r127.rememberedValue();
                            if (zChangedInstance2) {
                                objRememberedValue8 = new ph(zq0Var4, function5, mutableState19, 5);
                                r127.updateRememberedValue(objRememberedValue8);
                            } else {
                                objRememberedValue8 = new ph(zq0Var4, function5, mutableState19, 5);
                                r127.updateRememberedValue(objRememberedValue8);
                            }
                            r127.endReplaceGroup();
                            function10 = (Function3) objRememberedValue8;
                        }
                        boolean zBooleanValue20 = ((Boolean) mutableState89.getValue()).booleanValue();
                        boolean zBooleanValue21 = ((Boolean) mutableState90.getValue()).booleanValue();
                        ItemCounts itemCounts3 = (ItemCounts) state4.getValue();
                        int iIntValue4 = ((Number) mutableState83.getValue()).intValue();
                        boolean zChangedInstance212 = r127.changedInstance(zq0Var4);
                        i12 = i29 & 14;
                        if (i12 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z9 | zChangedInstance212;
                        objRememberedValue9 = r127.rememberedValue();
                        if (z10) {
                            function11 = function1;
                            final int i314 = 0;
                            objRememberedValue9 = new Function1() { // from class: wo0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    int i315 = i314;
                                    MutableState mutableState1312 = mutableState19;
                                    Function1 function116 = function11;
                                    zq0 zq0Var7 = zq0Var4;
                                    String str8 = (String) obj8;
                                    switch (i315) {
                                        case 0:
                                            str8.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                            function116.invoke(str8);
                                            break;
                                        case 1:
                                            str8.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, null, null, 30);
                                            function116.invoke(str8);
                                            break;
                                        default:
                                            str8.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, null, null, 30);
                                            function116.invoke(str8);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue9);
                        } else {
                            function11 = function1;
                            final int i315 = 0;
                            objRememberedValue9 = new Function1() { // from class: wo0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    int i316 = i315;
                                    MutableState mutableState1312 = mutableState19;
                                    Function1 function116 = function11;
                                    zq0 zq0Var7 = zq0Var4;
                                    String str8 = (String) obj8;
                                    switch (i316) {
                                        case 0:
                                            str8.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                            function116.invoke(str8);
                                            break;
                                        case 1:
                                            str8.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, null, null, 30);
                                            function116.invoke(str8);
                                            break;
                                        default:
                                            str8.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, null, null, 30);
                                            function116.invoke(str8);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue9);
                        }
                        function12 = (Function1) objRememberedValue9;
                        boolean zChangedInstance213 = r127.changedInstance(zq0Var4);
                        if (i12 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = zChangedInstance213 | z11;
                        objRememberedValue10 = r127.rememberedValue();
                        if (z12) {
                            function13 = function12;
                            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            }
                            Function2 function116 = (Function2) objRememberedValue10;
                            boolean zChangedInstance214 = r127.changedInstance(zq0Var4);
                            if (i12 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = z13 | zChangedInstance214;
                            objRememberedValue11 = r127.rememberedValue();
                            if (z14) {
                                objRememberedValue11 = new ph(zq0Var4, function11, mutableState19, 6);
                                r127.updateRememberedValue(objRememberedValue11);
                            } else {
                                objRememberedValue11 = new ph(zq0Var4, function11, mutableState19, 6);
                                r127.updateRememberedValue(objRememberedValue11);
                            }
                            Function3 function117 = (Function3) objRememberedValue11;
                            boolean zChangedInstance215 = r127.changedInstance(zq0Var4);
                            i13 = i29 & Input.Keys.FORWARD_DEL;
                            if (i13 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zChangedInstance215 | z15;
                            objRememberedValue12 = r127.rememberedValue();
                            if (z16) {
                                final int i316 = 1;
                                objRememberedValue12 = new Function2() { // from class: xo0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i317 = i316;
                                        MutableState mutableState1312 = mutableState19;
                                        Function1 function118 = function2;
                                        zq0 zq0Var7 = zq0Var4;
                                        String str8 = (String) obj8;
                                        String str9 = (String) obj9;
                                        switch (i317) {
                                            case 0:
                                                str8.getClass();
                                                str9.getClass();
                                                Objects.toString((rn0) mutableState1312.getValue());
                                                zq0Var7.P((rn0) mutableState1312.getValue());
                                                zq0.O(zq0Var7, "header_".concat(str8), str9, sn0.c, 12);
                                                function118.invoke(str8);
                                                break;
                                            default:
                                                str8.getClass();
                                                str9.getClass();
                                                Objects.toString((rn0) mutableState1312.getValue());
                                                zq0Var7.P((rn0) mutableState1312.getValue());
                                                zq0.O(zq0Var7, str8, str9, sn0.c, 12);
                                                function118.invoke(str8);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue12);
                            } else {
                                final int i317 = 1;
                                objRememberedValue12 = new Function2() { // from class: xo0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj8, Object obj9) {
                                        int i318 = i317;
                                        MutableState mutableState1312 = mutableState19;
                                        Function1 function118 = function2;
                                        zq0 zq0Var7 = zq0Var4;
                                        String str8 = (String) obj8;
                                        String str9 = (String) obj9;
                                        switch (i318) {
                                            case 0:
                                                str8.getClass();
                                                str9.getClass();
                                                Objects.toString((rn0) mutableState1312.getValue());
                                                zq0Var7.P((rn0) mutableState1312.getValue());
                                                zq0.O(zq0Var7, "header_".concat(str8), str9, sn0.c, 12);
                                                function118.invoke(str8);
                                                break;
                                            default:
                                                str8.getClass();
                                                str9.getClass();
                                                Objects.toString((rn0) mutableState1312.getValue());
                                                zq0Var7.P((rn0) mutableState1312.getValue());
                                                zq0.O(zq0Var7, str8, str9, sn0.c, 12);
                                                function118.invoke(str8);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue12);
                            }
                            Function2 function118 = (Function2) objRememberedValue12;
                            boolean zChangedInstance37 = r127.changedInstance(zq0Var4);
                            mutableState20 = mutableState19;
                            if ((i29 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z45 = z17 | zChangedInstance37;
                            if (i13 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z45;
                            objRememberedValue13 = r127.rememberedValue();
                            if (z19) {
                                mutableState21 = mutableState20;
                                zj zjVar5 = new zj(2, mutableState21, (Object) zq0Var4, (Object) function3, (Object) function2);
                                r127.updateRememberedValue(zjVar5);
                                objRememberedValue13 = zjVar5;
                            } else {
                                mutableState21 = mutableState20;
                                zj zjVar6 = new zj(2, mutableState21, (Object) zq0Var4, (Object) function3, (Object) function2);
                                r127.updateRememberedValue(zjVar6);
                                objRememberedValue13 = zjVar6;
                            }
                            Function2 function119 = (Function2) objRememberedValue13;
                            zChangedInstance3 = r127.changedInstance(zq0Var4);
                            objRememberedValue14 = r127.rememberedValue();
                            if (zChangedInstance3) {
                                final int i318 = 1;
                                objRememberedValue14 = new Function0() { // from class: vo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i319 = i318;
                                        zq0 zq0Var7 = zq0Var4;
                                        switch (i319) {
                                            case 0:
                                                zq0Var7.E(false, false);
                                                break;
                                            case 1:
                                                zq0Var7.k.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                zq0Var7.E(false, false);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue14);
                            } else {
                                final int i319 = 1;
                                objRememberedValue14 = new Function0() { // from class: vo0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i3110 = i319;
                                        zq0 zq0Var7 = zq0Var4;
                                        switch (i3110) {
                                            case 0:
                                                zq0Var7.E(false, false);
                                                break;
                                            case 1:
                                                zq0Var7.k.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                zq0Var7.E(false, false);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r127.updateRememberedValue(objRememberedValue14);
                            }
                            Function0 function1110 = (Function0) objRememberedValue14;
                            objRememberedValue15 = r127.rememberedValue();
                            companion5 = Composer.INSTANCE;
                            if (objRememberedValue15 == companion5.getEmpty()) {
                                objRememberedValue15 = new h70(19, mutableState13);
                                r127.updateRememberedValue(objRememberedValue15);
                            }
                            Function1 function210 = (Function1) objRememberedValue15;
                            objRememberedValue16 = r127.rememberedValue();
                            if (objRememberedValue16 == companion5.getEmpty()) {
                                objRememberedValue16 = new y1(mutableState13, mutableState80, mutableState5, 4);
                                r127.updateRememberedValue(objRememberedValue16);
                            }
                            Function1 function211 = (Function1) objRememberedValue16;
                            objRememberedValue17 = r127.rememberedValue();
                            if (objRememberedValue17 == companion5.getEmpty()) {
                                c = 23;
                                objRememberedValue17 = new a50(23, mutableState83);
                                r127.updateRememberedValue(objRememberedValue17);
                            } else {
                                c = 23;
                            }
                            a(z, list7, listB2, list8, str7, numZ2, strA5, strB3, zC2, zE2, function13, function116, function117, function118, function119, function10, function1110, zq0Var4, zBooleanValue20, zBooleanValue21, itemCounts3, function210, function211, iIntValue4, (Function0) objRememberedValue17, r127, i31, (i11 << 18) & 29360128, 25008);
                            Object r1212 = r127;
                            r1212.endReplaceGroup();
                            r17 = r1212;
                        } else {
                            function13 = function12;
                        }
                        final int i320 = 0;
                        objRememberedValue10 = new Function2() { // from class: xo0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj8, Object obj9) {
                                int i3110 = i320;
                                MutableState mutableState1312 = mutableState19;
                                Function1 function1111 = function11;
                                zq0 zq0Var7 = zq0Var4;
                                String str8 = (String) obj8;
                                String str9 = (String) obj9;
                                switch (i3110) {
                                    case 0:
                                        str8.getClass();
                                        str9.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, "header_".concat(str8), str9, sn0.c, 12);
                                        function1111.invoke(str8);
                                        break;
                                    default:
                                        str8.getClass();
                                        str9.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, str9, sn0.c, 12);
                                        function1111.invoke(str8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r127.updateRememberedValue(objRememberedValue10);
                        Function2 function1111 = (Function2) objRememberedValue10;
                        boolean zChangedInstance216 = r127.changedInstance(zq0Var4);
                        if (i12 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | zChangedInstance216;
                        objRememberedValue11 = r127.rememberedValue();
                        if (z14) {
                            objRememberedValue11 = new ph(zq0Var4, function11, mutableState19, 6);
                            r127.updateRememberedValue(objRememberedValue11);
                        } else {
                            objRememberedValue11 = new ph(zq0Var4, function11, mutableState19, 6);
                            r127.updateRememberedValue(objRememberedValue11);
                        }
                        Function3 function1112 = (Function3) objRememberedValue11;
                        boolean zChangedInstance217 = r127.changedInstance(zq0Var4);
                        i13 = i29 & Input.Keys.FORWARD_DEL;
                        if (i13 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zChangedInstance217 | z15;
                        objRememberedValue12 = r127.rememberedValue();
                        if (z16) {
                            final int i3110 = 1;
                            objRememberedValue12 = new Function2() { // from class: xo0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj8, Object obj9) {
                                    int i3111 = i3110;
                                    MutableState mutableState1312 = mutableState19;
                                    Function1 function1113 = function2;
                                    zq0 zq0Var7 = zq0Var4;
                                    String str8 = (String) obj8;
                                    String str9 = (String) obj9;
                                    switch (i3111) {
                                        case 0:
                                            str8.getClass();
                                            str9.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, "header_".concat(str8), str9, sn0.c, 12);
                                            function1113.invoke(str8);
                                            break;
                                        default:
                                            str8.getClass();
                                            str9.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, str9, sn0.c, 12);
                                            function1113.invoke(str8);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue12);
                        } else {
                            final int i3111 = 1;
                            objRememberedValue12 = new Function2() { // from class: xo0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj8, Object obj9) {
                                    int i3112 = i3111;
                                    MutableState mutableState1312 = mutableState19;
                                    Function1 function1113 = function2;
                                    zq0 zq0Var7 = zq0Var4;
                                    String str8 = (String) obj8;
                                    String str9 = (String) obj9;
                                    switch (i3112) {
                                        case 0:
                                            str8.getClass();
                                            str9.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, "header_".concat(str8), str9, sn0.c, 12);
                                            function1113.invoke(str8);
                                            break;
                                        default:
                                            str8.getClass();
                                            str9.getClass();
                                            Objects.toString((rn0) mutableState1312.getValue());
                                            zq0Var7.P((rn0) mutableState1312.getValue());
                                            zq0.O(zq0Var7, str8, str9, sn0.c, 12);
                                            function1113.invoke(str8);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue12);
                        }
                        Function2 function1113 = (Function2) objRememberedValue12;
                        boolean zChangedInstance38 = r127.changedInstance(zq0Var4);
                        mutableState20 = mutableState19;
                        if ((i29 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z46 = z17 | zChangedInstance38;
                        if (i13 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | z46;
                        objRememberedValue13 = r127.rememberedValue();
                        if (z19) {
                            mutableState21 = mutableState20;
                            zj zjVar7 = new zj(2, mutableState21, (Object) zq0Var4, (Object) function3, (Object) function2);
                            r127.updateRememberedValue(zjVar7);
                            objRememberedValue13 = zjVar7;
                        } else {
                            mutableState21 = mutableState20;
                            zj zjVar8 = new zj(2, mutableState21, (Object) zq0Var4, (Object) function3, (Object) function2);
                            r127.updateRememberedValue(zjVar8);
                            objRememberedValue13 = zjVar8;
                        }
                        Function2 function1114 = (Function2) objRememberedValue13;
                        zChangedInstance3 = r127.changedInstance(zq0Var4);
                        objRememberedValue14 = r127.rememberedValue();
                        if (zChangedInstance3) {
                            final int i3112 = 1;
                            objRememberedValue14 = new Function0() { // from class: vo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i3113 = i3112;
                                    zq0 zq0Var7 = zq0Var4;
                                    switch (i3113) {
                                        case 0:
                                            zq0Var7.E(false, false);
                                            break;
                                        case 1:
                                            zq0Var7.k.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            zq0Var7.E(false, false);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue14);
                        } else {
                            final int i3113 = 1;
                            objRememberedValue14 = new Function0() { // from class: vo0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i3114 = i3113;
                                    zq0 zq0Var7 = zq0Var4;
                                    switch (i3114) {
                                        case 0:
                                            zq0Var7.E(false, false);
                                            break;
                                        case 1:
                                            zq0Var7.k.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            zq0Var7.E(false, false);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r127.updateRememberedValue(objRememberedValue14);
                        }
                        Function0 function1115 = (Function0) objRememberedValue14;
                        objRememberedValue15 = r127.rememberedValue();
                        companion5 = Composer.INSTANCE;
                        if (objRememberedValue15 == companion5.getEmpty()) {
                            objRememberedValue15 = new h70(19, mutableState13);
                            r127.updateRememberedValue(objRememberedValue15);
                        }
                        Function1 function212 = (Function1) objRememberedValue15;
                        objRememberedValue16 = r127.rememberedValue();
                        if (objRememberedValue16 == companion5.getEmpty()) {
                            objRememberedValue16 = new y1(mutableState13, mutableState80, mutableState5, 4);
                            r127.updateRememberedValue(objRememberedValue16);
                        }
                        Function1 function213 = (Function1) objRememberedValue16;
                        objRememberedValue17 = r127.rememberedValue();
                        if (objRememberedValue17 == companion5.getEmpty()) {
                            c = 23;
                            objRememberedValue17 = new a50(23, mutableState83);
                            r127.updateRememberedValue(objRememberedValue17);
                        } else {
                            c = 23;
                        }
                        a(z, list7, listB2, list8, str7, numZ2, strA5, strB3, zC2, zE2, function13, function1111, function1112, function1113, function1114, function10, function1115, zq0Var4, zBooleanValue20, zBooleanValue21, itemCounts3, function212, function213, iIntValue4, (Function0) objRememberedValue17, r127, i31, (i11 << 18) & 29360128, 25008);
                        Object r1213 = r127;
                        r1213.endReplaceGroup();
                        r17 = r1213;
                    }
                    r17.endReplaceGroup();
                    Unit unit7 = Unit.INSTANCE;
                    r18 = r17;
                }
                state4 = state4;
                mutableState13 = mutableState13;
                r17 = r16;
                r17.endReplaceGroup();
                Unit unit8 = Unit.INSTANCE;
                r18 = r17;
            } else if (iOrdinal != 1) {
                zq0Var4 = zq0Var3;
                ServerPreferences serverPreferences15 = serverPreferences2;
                focusRequester = focusRequester;
                mutableState12 = mutableState109;
                vcVar = vcVar;
                mutableState72 = mutableState7;
                mutableState126 = mutableState126;
                mutableState120 = mutableState120;
                mutableState116 = mutableState116;
                mutableState110 = mutableState110;
                mutableState111 = mutableState111;
                mutableState112 = mutableState112;
                mutableState113 = mutableState113;
                mutableState114 = mutableState114;
                mutableState117 = mutableState117;
                mutableState118 = mutableState118;
                mutableState121 = mutableState121;
                mutableState122 = mutableState122;
                mutableState123 = mutableState123;
                mutableState119 = mutableState119;
                ab2Var3 = ab2Var3;
                mutableState129 = mutableState129;
                r127.startReplaceGroup(-1687220673);
                zBooleanValue = ((Boolean) mutableState89.getValue()).booleanValue();
                boolean zBooleanValue22 = ((Boolean) mutableState90.getValue()).booleanValue();
                String strK2 = K(mutableState77);
                zChanged7 = r127.changed(mutableState77);
                objRememberedValue88 = r127.rememberedValue();
                if (zChanged7) {
                    z30 = zBooleanValue;
                    if (objRememberedValue88 == companion.getEmpty()) {
                    }
                    Function1 function214 = (Function1) objRememberedValue88;
                    objRememberedValue89 = r127.rememberedValue();
                    if (objRememberedValue89 == companion.getEmpty()) {
                        objRememberedValue89 = new h70(21, mutableState72);
                        r127.updateRememberedValue(objRememberedValue89);
                    }
                    Function1 function215 = (Function1) objRememberedValue89;
                    boolean zChangedInstance39 = r127.changedInstance(zq0Var4);
                    if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    z32 = z31 | zChangedInstance39;
                    objRememberedValue90 = r127.rememberedValue();
                    if (z32) {
                        final int i47 = 1;
                        objRememberedValue90 = new Function1() { // from class: wo0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i3114 = i47;
                                MutableState mutableState1312 = mutableState10;
                                Function1 function1116 = function2;
                                zq0 zq0Var7 = zq0Var4;
                                String str8 = (String) obj8;
                                switch (i3114) {
                                    case 0:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                        function1116.invoke(str8);
                                        break;
                                    case 1:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                    default:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r127.updateRememberedValue(objRememberedValue90);
                    } else {
                        final int i48 = 1;
                        objRememberedValue90 = new Function1() { // from class: wo0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i3114 = i48;
                                MutableState mutableState1312 = mutableState10;
                                Function1 function1116 = function2;
                                zq0 zq0Var7 = zq0Var4;
                                String str8 = (String) obj8;
                                switch (i3114) {
                                    case 0:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                        function1116.invoke(str8);
                                        break;
                                    case 1:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                    default:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r127.updateRememberedValue(objRememberedValue90);
                    }
                    vj0.b(z, z30, zBooleanValue22, strK2, function214, function215, function3, (Function1) objRememberedValue90, null, r127, i31 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i29 << 12) & 3670016));
                    Object r1311 = r127;
                    r1311.endReplaceGroup();
                    Unit unit9 = Unit.INSTANCE;
                    boxScopeInstance = boxScopeInstance;
                    coroutineScope = coroutineScope4;
                    lz0Var = lz0Var4;
                    mutableState23 = mutableState11;
                    mutableState21 = mutableState10;
                    state4 = stateCollectAsState10;
                    context = context;
                    mutableState14 = mutableState102;
                    mutableState13 = mutableState72;
                    mutableState15 = mutableState104;
                    mutableState16 = mutableState103;
                    mutableState5 = mutableState5;
                    mutableState80 = mutableState80;
                    userPreferences = userPreferences4;
                    serverPreferences3 = serverPreferences15;
                    c = 23;
                    str = null;
                    mutableState17 = mutableState106;
                    r18 = r1311;
                } else {
                    z30 = zBooleanValue;
                }
                objRememberedValue88 = new h70(20, mutableState77);
                r127.updateRememberedValue(objRememberedValue88);
                Function1 function216 = (Function1) objRememberedValue88;
                objRememberedValue89 = r127.rememberedValue();
                if (objRememberedValue89 == companion.getEmpty()) {
                    objRememberedValue89 = new h70(21, mutableState72);
                    r127.updateRememberedValue(objRememberedValue89);
                }
                Function1 function217 = (Function1) objRememberedValue89;
                boolean zChangedInstance310 = r127.changedInstance(zq0Var4);
                if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                    z31 = true;
                } else {
                    z31 = false;
                }
                z32 = z31 | zChangedInstance310;
                objRememberedValue90 = r127.rememberedValue();
                if (z32) {
                    final int i49 = 1;
                    objRememberedValue90 = new Function1() { // from class: wo0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i3114 = i49;
                            MutableState mutableState1312 = mutableState10;
                            Function1 function1116 = function2;
                            zq0 zq0Var7 = zq0Var4;
                            String str8 = (String) obj8;
                            switch (i3114) {
                                case 0:
                                    str8.getClass();
                                    Objects.toString((rn0) mutableState1312.getValue());
                                    zq0Var7.P((rn0) mutableState1312.getValue());
                                    zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                    function1116.invoke(str8);
                                    break;
                                case 1:
                                    str8.getClass();
                                    Objects.toString((rn0) mutableState1312.getValue());
                                    zq0Var7.P((rn0) mutableState1312.getValue());
                                    zq0.O(zq0Var7, str8, null, null, 30);
                                    function1116.invoke(str8);
                                    break;
                                default:
                                    str8.getClass();
                                    Objects.toString((rn0) mutableState1312.getValue());
                                    zq0Var7.P((rn0) mutableState1312.getValue());
                                    zq0.O(zq0Var7, str8, null, null, 30);
                                    function1116.invoke(str8);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r127.updateRememberedValue(objRememberedValue90);
                } else {
                    final int i410 = 1;
                    objRememberedValue90 = new Function1() { // from class: wo0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i3114 = i410;
                            MutableState mutableState1312 = mutableState10;
                            Function1 function1116 = function2;
                            zq0 zq0Var7 = zq0Var4;
                            String str8 = (String) obj8;
                            switch (i3114) {
                                case 0:
                                    str8.getClass();
                                    Objects.toString((rn0) mutableState1312.getValue());
                                    zq0Var7.P((rn0) mutableState1312.getValue());
                                    zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                    function1116.invoke(str8);
                                    break;
                                case 1:
                                    str8.getClass();
                                    Objects.toString((rn0) mutableState1312.getValue());
                                    zq0Var7.P((rn0) mutableState1312.getValue());
                                    zq0.O(zq0Var7, str8, null, null, 30);
                                    function1116.invoke(str8);
                                    break;
                                default:
                                    str8.getClass();
                                    Objects.toString((rn0) mutableState1312.getValue());
                                    zq0Var7.P((rn0) mutableState1312.getValue());
                                    zq0.O(zq0Var7, str8, null, null, 30);
                                    function1116.invoke(str8);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r127.updateRememberedValue(objRememberedValue90);
                }
                vj0.b(z, z30, zBooleanValue22, strK2, function216, function217, function3, (Function1) objRememberedValue90, null, r127, i31 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i29 << 12) & 3670016));
                Object r1312 = r127;
                r1312.endReplaceGroup();
                Unit unit10 = Unit.INSTANCE;
                boxScopeInstance = boxScopeInstance;
                coroutineScope = coroutineScope4;
                lz0Var = lz0Var4;
                mutableState23 = mutableState11;
                mutableState21 = mutableState10;
                state4 = stateCollectAsState10;
                context = context;
                mutableState14 = mutableState102;
                mutableState13 = mutableState72;
                mutableState15 = mutableState104;
                mutableState16 = mutableState103;
                mutableState5 = mutableState5;
                mutableState80 = mutableState80;
                userPreferences = userPreferences4;
                serverPreferences3 = serverPreferences15;
                c = 23;
                str = null;
                mutableState17 = mutableState106;
                r18 = r1312;
            } else {
                if (iOrdinal == 2) {
                    r127.startReplaceGroup(360892379);
                    r127.endReplaceGroup();
                    qu.f();
                    return;
                }
                r127.startReplaceGroup(-1686184064);
                if (zBooleanValue2) {
                    r127.startReplaceGroup(-1686123273);
                    objRememberedValue92 = r127.rememberedValue();
                    if (objRememberedValue92 == companion.getEmpty()) {
                        objRememberedValue92 = new bo0(11);
                        r127.updateRememberedValue(objRememberedValue92);
                    }
                    Function0 function218 = (Function0) objRememberedValue92;
                    boolean zChangedInstance311 = r127.changedInstance(serverPreferences2) | r127.changedInstance(zq0Var3);
                    i29 = i29;
                    if ((i29 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z47 = zChangedInstance311 | z35;
                    if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    z37 = z47 | z36;
                    objRememberedValue93 = r127.rememberedValue();
                    if (z37) {
                        zq0Var4 = zq0Var;
                        ServerPreferences serverPreferences16 = serverPreferences2;
                        zj zjVar9 = new zj(3, serverPreferences16, zq0Var4, function4, function2);
                        serverPreferences7 = serverPreferences16;
                        r127.updateRememberedValue(zjVar9);
                        objRememberedValue93 = zjVar9;
                    } else {
                        zq0Var4 = zq0Var;
                        ServerPreferences serverPreferences17 = serverPreferences2;
                        zj zjVar10 = new zj(3, serverPreferences17, zq0Var4, function4, function2);
                        serverPreferences7 = serverPreferences17;
                        r127.updateRememberedValue(zjVar10);
                        objRememberedValue93 = zjVar10;
                    }
                    mutableState74 = mutableState106;
                    mutableState12 = mutableState109;
                    mutableState73 = mutableState7;
                    s8.a(function218, (Function2) objRememberedValue93, ((Boolean) mutableState93.getValue()).booleanValue(), z, false, PaddingKt.m1003paddingqDBjuR0$default(companion2, 0.0f, Dp.m7813constructorimpl(64.0f), 0.0f, 0.0f, 13, null), null, r127, ((i10 << 3) & 7168) | 221190);
                    Object r1313 = r127;
                    r1313.endReplaceGroup();
                    serverPreferences6 = serverPreferences7;
                    mutableState75 = mutableState102;
                    r125 = r1313;
                } else {
                    zq0Var4 = zq0Var3;
                    ServerPreferences serverPreferences18 = serverPreferences2;
                    mutableState12 = mutableState109;
                    vcVar = vcVar;
                    mutableState73 = mutableState7;
                    mutableState74 = mutableState106;
                    mutableState11 = mutableState11;
                    stateCollectAsState10 = stateCollectAsState10;
                    lz0Var4 = lz0Var4;
                    coroutineScope4 = coroutineScope4;
                    ab2Var3 = ab2Var3;
                    r127.startReplaceGroup(-1684589238);
                    boolean zChangedInstance312 = r127.changedInstance(zq0Var4);
                    serverPreferences6 = serverPreferences18;
                    mutableState75 = mutableState102;
                    if ((i29 & Input.Keys.FORWARD_DEL) == 32) {
                        z33 = true;
                    } else {
                        z33 = false;
                    }
                    z34 = z33 | zChangedInstance312;
                    objRememberedValue91 = r127.rememberedValue();
                    if (z34) {
                        final int i411 = 2;
                        objRememberedValue91 = new Function1() { // from class: wo0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i3114 = i411;
                                MutableState mutableState1312 = mutableState10;
                                Function1 function1116 = function2;
                                zq0 zq0Var7 = zq0Var4;
                                String str8 = (String) obj8;
                                switch (i3114) {
                                    case 0:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                        function1116.invoke(str8);
                                        break;
                                    case 1:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                    default:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r127.updateRememberedValue(objRememberedValue91);
                    } else {
                        final int i412 = 2;
                        objRememberedValue91 = new Function1() { // from class: wo0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i3114 = i412;
                                MutableState mutableState1312 = mutableState10;
                                Function1 function1116 = function2;
                                zq0 zq0Var7 = zq0Var4;
                                String str8 = (String) obj8;
                                switch (i3114) {
                                    case 0:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, "我的媒体", sn0.b, 12);
                                        function1116.invoke(str8);
                                        break;
                                    case 1:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                    default:
                                        str8.getClass();
                                        Objects.toString((rn0) mutableState1312.getValue());
                                        zq0Var7.P((rn0) mutableState1312.getValue());
                                        zq0.O(zq0Var7, str8, null, null, 30);
                                        function1116.invoke(str8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r127.updateRememberedValue(objRememberedValue91);
                    }
                    sv1.b(z, (Function1) objRememberedValue91, null, r127, i31);
                    r127.endReplaceGroup();
                    r125 = r127;
                }
                r125.endReplaceGroup();
                Unit unit11 = Unit.INSTANCE;
                boxScopeInstance = boxScopeInstance;
                coroutineScope = coroutineScope4;
                lz0Var = lz0Var4;
                mutableState23 = mutableState11;
                mutableState21 = mutableState10;
                state4 = stateCollectAsState10;
                context = context;
                mutableState14 = mutableState75;
                mutableState15 = mutableState104;
                mutableState16 = mutableState103;
                mutableState5 = mutableState5;
                mutableState80 = mutableState80;
                userPreferences = userPreferences4;
                serverPreferences3 = serverPreferences6;
                str = null;
                mutableState13 = mutableState73;
                mutableState17 = mutableState74;
                c = 23;
                r18 = r125;
            }
            r18.endNode();
            strC = L(mutableState23).c();
            if (strC != null) {
                host = str;
            } else {
                host = str;
            }
            if (M(stateCollectAsState13).getEnabled()) {
                z20 = false;
            } else {
                z20 = false;
            }
            if (M(stateCollectAsState13).getEnabled()) {
                z21 = false;
            } else {
                z21 = false;
            }
            i15 = 22;
            if (z) {
                r18.startReplaceGroup(1337616380);
                rn0 rn0VarG6 = G(mutableState21);
                objRememberedValue79 = r18.rememberedValue();
                companion18 = Composer.INSTANCE;
                if (objRememberedValue79 == companion18.getEmpty()) {
                    objRememberedValue79 = new h70(i15, mutableState21);
                    r18.updateRememberedValue(objRememberedValue79);
                }
                Function1 function219 = (Function1) objRememberedValue79;
                boolean z48 = !((Boolean) mutableState87.getValue()).booleanValue();
                boolean zBooleanValue23 = ((Boolean) mutableState88.getValue()).booleanValue();
                String strA6 = L(mutableState23).a();
                String strB4 = L(mutableState23).b();
                objRememberedValue80 = r18.rememberedValue();
                if (objRememberedValue80 == companion18.getEmpty()) {
                    mutableState26 = mutableState15;
                    objRememberedValue80 = new a50(24, mutableState26);
                    r18.updateRememberedValue(objRememberedValue80);
                } else {
                    mutableState26 = mutableState15;
                }
                Function0 function310 = (Function0) objRememberedValue80;
                objRememberedValue81 = r18.rememberedValue();
                if (objRememberedValue81 == companion18.getEmpty()) {
                    mutableState25 = mutableState110;
                    objRememberedValue81 = new a50(25, mutableState25);
                    r18.updateRememberedValue(objRememberedValue81);
                } else {
                    mutableState25 = mutableState110;
                }
                Function0 function311 = (Function0) objRememberedValue81;
                objRememberedValue82 = r18.rememberedValue();
                if (objRememberedValue82 == companion18.getEmpty()) {
                    mutableState24 = mutableState101;
                    objRememberedValue82 = new ii(mutableState21, mutableState14, mutableState24, 4);
                    r18.updateRememberedValue(objRememberedValue82);
                } else {
                    mutableState24 = mutableState101;
                }
                Function0 function312 = (Function0) objRememberedValue82;
                objRememberedValue83 = r18.rememberedValue();
                if (objRememberedValue83 == companion18.getEmpty()) {
                    objRememberedValue83 = new ii(mutableState21, mutableState14, mutableState24, 5);
                    r18.updateRememberedValue(objRememberedValue83);
                }
                Function0 function313 = (Function0) objRememberedValue83;
                zChangedInstance20 = r18.changedInstance(zq0Var4);
                objRememberedValue84 = r18.rememberedValue();
                if (zChangedInstance20) {
                    final int i413 = 2;
                    objRememberedValue84 = new Function0() { // from class: vo0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3114 = i413;
                            zq0 zq0Var7 = zq0Var4;
                            switch (i3114) {
                                case 0:
                                    zq0Var7.E(false, false);
                                    break;
                                case 1:
                                    zq0Var7.k.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    zq0Var7.E(false, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r18.updateRememberedValue(objRememberedValue84);
                } else {
                    final int i414 = 2;
                    objRememberedValue84 = new Function0() { // from class: vo0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3114 = i414;
                            zq0 zq0Var7 = zq0Var4;
                            switch (i3114) {
                                case 0:
                                    zq0Var7.E(false, false);
                                    break;
                                case 1:
                                    zq0Var7.k.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    zq0Var7.E(false, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r18.updateRememberedValue(objRememberedValue84);
                }
                Function0 function314 = (Function0) objRememberedValue84;
                boolean zBooleanValue24 = ((Boolean) mutableState13.getValue()).booleanValue();
                if (M(stateCollectAsState13).getEnabled()) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    vcVar.getClass();
                    if (((Boolean) qc.b.getValue()).booleanValue()) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                } else {
                    z29 = false;
                }
                int iIntValue5 = ((Number) mutableState80.getValue()).intValue();
                int iIntValue6 = ((Number) mutableState5.getValue()).intValue();
                int iY2 = y(mutableState82);
                objRememberedValue85 = r18.rememberedValue();
                if (objRememberedValue85 == companion18.getEmpty()) {
                    objRememberedValue85 = new a50(26, mutableState80);
                    r18.updateRememberedValue(objRememberedValue85);
                }
                Function0 function315 = (Function0) objRememberedValue85;
                objRememberedValue86 = r18.rememberedValue();
                if (objRememberedValue86 == companion18.getEmpty()) {
                    objRememberedValue86 = new a50(27, mutableState5);
                    r18.updateRememberedValue(objRememberedValue86);
                }
                Function0 function316 = (Function0) objRememberedValue86;
                objRememberedValue87 = r18.rememberedValue();
                if (objRememberedValue87 == companion18.getEmpty()) {
                    objRememberedValue87 = new h70(23, mutableState9);
                    r18.updateRememberedValue(objRememberedValue87);
                }
                Object r310 = r18;
                e92.d(rn0VarG6, function219, z48, zBooleanValue23, strA6, strB4, function310, function311, function312, function313, function314, zBooleanValue24, z21, z28, z20, z29, focusRequester, iIntValue5, iIntValue6, iY2, function315, function316, (Function1) objRememberedValue87, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), r310, 920125488, 1572864, 438);
                Object r1314 = r310;
                r1314.endReplaceGroup();
                r19 = r1314;
            } else {
                mutableState24 = mutableState101;
                mutableState25 = mutableState110;
                mutableState26 = mutableState15;
                r18.startReplaceGroup(1339821875);
                r18.endReplaceGroup();
                r19 = r18;
            }
            r19.endNode();
            if (z) {
                r19.startReplaceGroup(1417498825);
                if (((Boolean) mutableState79.getValue()).booleanValue()) {
                    r19.startReplaceGroup(1416967547);
                    objRememberedValue76 = r19.rememberedValue();
                    companion17 = Composer.INSTANCE;
                    if (objRememberedValue76 == companion17.getEmpty()) {
                        mutableState71 = mutableState79;
                        objRememberedValue76 = new a50(28, mutableState71);
                        r19.updateRememberedValue(objRememberedValue76);
                    } else {
                        mutableState71 = mutableState79;
                    }
                    Function0 function317 = (Function0) objRememberedValue76;
                    context3 = context;
                    zChangedInstance19 = r19.changedInstance(context3);
                    objRememberedValue77 = r19.rememberedValue();
                    if (zChangedInstance19) {
                        objRememberedValue77 = new u5(context3, 1);
                        r19.updateRememberedValue(objRememberedValue77);
                    } else {
                        objRememberedValue77 = new u5(context3, 1);
                        r19.updateRememberedValue(objRememberedValue77);
                    }
                    Function0 function318 = (Function0) objRememberedValue77;
                    if ((i29 & 3670016) == 1048576) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objRememberedValue78 = r19.rememberedValue();
                    if (z27) {
                        objRememberedValue78 = new o5(function0, mutableState71, 2);
                        r19.updateRememberedValue(objRememberedValue78);
                    } else {
                        objRememberedValue78 = new o5(function0, mutableState71, 2);
                        r19.updateRememberedValue(objRememberedValue78);
                    }
                    context2 = context3;
                    Object r210 = r19;
                    kh0.a(function317, function318, (Function0) objRememberedValue78, "是否退出", "退出软件", "退回服务页", Dp.m7813constructorimpl(400.0f), Dp.m7813constructorimpl(198.0f), Dp.m7813constructorimpl(156.0f), r210, 115043334, 512);
                    Object r1315 = r210;
                    r1315.endReplaceGroup();
                    r111 = r1315;
                } else {
                    context2 = context;
                    r19.startReplaceGroup(1417549913);
                    r19.endReplaceGroup();
                    r111 = r19;
                }
                if (((Boolean) mutableState105.getValue()).booleanValue()) {
                    r111.startReplaceGroup(1417611882);
                    hq0Var2 = (hq0) stateCollectAsState2.getValue();
                    if (hq0Var2 instanceof gq0) {
                        r111.startReplaceGroup(1417688452);
                        List list9 = ((gq0) hq0Var2).a;
                        Set set2 = (Set) stateCollectAsState14.getValue();
                        coroutineScope2 = coroutineScope;
                        lz0Var2 = lz0Var;
                        mutableState27 = mutableState23;
                        zChangedInstance18 = r111.changedInstance(coroutineScope2) | r111.changedInstance(lz0Var2) | r111.changed(mutableState27);
                        objRememberedValue74 = r111.rememberedValue();
                        if (zChangedInstance18) {
                            objRememberedValue74 = new r5(coroutineScope2, lz0Var2, mutableState27, 6);
                            r111.updateRememberedValue(objRememberedValue74);
                        } else {
                            objRememberedValue74 = new r5(coroutineScope2, lz0Var2, mutableState27, 6);
                            r111.updateRememberedValue(objRememberedValue74);
                        }
                        Function2 function319 = (Function2) objRememberedValue74;
                        objRememberedValue75 = r111.rememberedValue();
                        if (objRememberedValue75 == Composer.INSTANCE.getEmpty()) {
                            mutableState28 = mutableState105;
                            objRememberedValue75 = new a50(29, mutableState28);
                            r111.updateRememberedValue(objRememberedValue75);
                        } else {
                            mutableState28 = mutableState105;
                        }
                        Object r1316 = r111;
                        fz0.a(list9, set2, function319, (Function0) objRememberedValue75, r1316, 3072);
                        Object r1317 = r1316;
                        r1317.endReplaceGroup();
                        r124 = r1317;
                    } else {
                        mutableState27 = mutableState23;
                        mutableState28 = mutableState105;
                        coroutineScope2 = coroutineScope;
                        r111.startReplaceGroup(1418200665);
                        r111.endReplaceGroup();
                        r124 = r111;
                    }
                    r124.endReplaceGroup();
                    r112 = r124;
                } else {
                    mutableState27 = mutableState23;
                    mutableState28 = mutableState105;
                    coroutineScope2 = coroutineScope;
                    r111.startReplaceGroup(1418210585);
                    r111.endReplaceGroup();
                    r112 = r111;
                }
                if (((Boolean) mutableState17.getValue()).booleanValue()) {
                    r112.startReplaceGroup(1418261549);
                    List listM2 = m(mutableState108);
                    zChangedInstance16 = r112.changedInstance(zq0Var4);
                    objRememberedValue71 = r112.rememberedValue();
                    if (zChangedInstance16) {
                        objRememberedValue71 = new v80(zq0Var4);
                        r112.updateRememberedValue(objRememberedValue71);
                    } else {
                        objRememberedValue71 = new v80(zq0Var4);
                        r112.updateRememberedValue(objRememberedValue71);
                    }
                    Function2 function410 = (Function2) ((KFunction) objRememberedValue71);
                    zChangedInstance17 = r112.changedInstance(zq0Var4);
                    objRememberedValue72 = r112.rememberedValue();
                    if (zChangedInstance17) {
                        mutableState29 = mutableState21;
                        if (objRememberedValue72 == Composer.INSTANCE.getEmpty()) {
                        }
                        Function1 function411 = (Function1) objRememberedValue72;
                        objRememberedValue73 = r112.rememberedValue();
                        if (objRememberedValue73 == Composer.INSTANCE.getEmpty()) {
                            mutableState30 = mutableState17;
                            mutableState31 = mutableState108;
                            objRememberedValue73 = new ao0(1, mutableState30, mutableState31);
                            r112.updateRememberedValue(objRememberedValue73);
                        } else {
                            mutableState30 = mutableState17;
                            mutableState31 = mutableState108;
                        }
                        Object r1318 = r112;
                        sy0.b(listM2, function410, function411, (Function0) objRememberedValue73, r1318, 24576);
                        Object r1319 = r1318;
                        r1319.endReplaceGroup();
                        r113 = r1319;
                    } else {
                        mutableState29 = mutableState21;
                    }
                    objRememberedValue72 = new yn0(zq0Var4, 2);
                    r112.updateRememberedValue(objRememberedValue72);
                    Function1 function412 = (Function1) objRememberedValue72;
                    objRememberedValue73 = r112.rememberedValue();
                    if (objRememberedValue73 == Composer.INSTANCE.getEmpty()) {
                        mutableState30 = mutableState17;
                        mutableState31 = mutableState108;
                        objRememberedValue73 = new ao0(1, mutableState30, mutableState31);
                        r112.updateRememberedValue(objRememberedValue73);
                    } else {
                        mutableState30 = mutableState17;
                        mutableState31 = mutableState108;
                    }
                    Object r13110 = r112;
                    sy0.b(listM2, function410, function412, (Function0) objRememberedValue73, r13110, 24576);
                    Object r13111 = r13110;
                    r13111.endReplaceGroup();
                    r113 = r13111;
                } else {
                    mutableState29 = mutableState21;
                    mutableState30 = mutableState17;
                    mutableState31 = mutableState108;
                    mutableState26 = mutableState26;
                    r112.startReplaceGroup(1418703609);
                    r112.endReplaceGroup();
                    r113 = r112;
                }
                if (((Boolean) mutableState107.getValue()).booleanValue()) {
                    r113.startReplaceGroup(1418776273);
                    objRememberedValue70 = r113.rememberedValue();
                    if (objRememberedValue70 == Composer.INSTANCE.getEmpty()) {
                        mutableState69 = mutableState107;
                        mutableState70 = mutableState12;
                        objRememberedValue70 = new ii(mutableState70, mutableState69, mutableState31, 6);
                        r113.updateRememberedValue(objRememberedValue70);
                    } else {
                        mutableState69 = mutableState107;
                        mutableState70 = mutableState12;
                    }
                    mutableState12 = mutableState70;
                    mutableState107 = mutableState69;
                    Object r311 = r113;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue70, et.i(), null, ComposableLambdaKt.rememberComposableLambda(646043598, true, new r5(mutableState70, mutableState69, mutableState31, 7), r113, 54), null, et.d(), et.a(), null, 0L, 0L, 0L, 0L, 0.0f, null, r311, 1772598, 0, 16276);
                    Object r40 = r311;
                    r40.endReplaceGroup();
                    r3 = r40;
                } else {
                    mutableState30 = mutableState30;
                    Object r41 = r113;
                    r41.startReplaceGroup(1419675769);
                    r41.endReplaceGroup();
                    r3 = r41;
                }
                if (((Boolean) mutableState24.getValue()).booleanValue()) {
                    r3.startReplaceGroup(1419785168);
                    ItemCounts itemCounts4 = (ItemCounts) state4.getValue();
                    boolean zJ3 = j(mutableState14);
                    objRememberedValue66 = r3.rememberedValue();
                    companion16 = Composer.INSTANCE;
                    if (objRememberedValue66 == companion16.getEmpty()) {
                        mutableState32 = mutableState16;
                        objRememberedValue66 = new ii(mutableState24, mutableState14, mutableState32, 7);
                        r3.updateRememberedValue(objRememberedValue66);
                    } else {
                        mutableState32 = mutableState16;
                    }
                    Function0 function413 = (Function0) objRememberedValue66;
                    objRememberedValue67 = r3.rememberedValue();
                    if (objRememberedValue67 == companion16.getEmpty()) {
                        objRememberedValue67 = new ii(mutableState24, mutableState14, mutableState28, 8);
                        r3.updateRememberedValue(objRememberedValue67);
                    }
                    Function0 function414 = (Function0) objRememberedValue67;
                    zChangedInstance15 = r3.changedInstance(coroutineScope2) | r3.changedInstance(zq0Var4) | r3.changedInstance(context2);
                    objRememberedValue68 = r3.rememberedValue();
                    if (zChangedInstance15) {
                        CoroutineScope coroutineScope6 = coroutineScope2;
                        objRememberedValue68 = new th(coroutineScope6, mutableState24, mutableState14, mutableState12, zq0Var4, mutableState107, mutableState31, mutableState30, context2);
                        coroutineScope3 = coroutineScope6;
                        r3.updateRememberedValue(objRememberedValue68);
                    } else {
                        CoroutineScope coroutineScope7 = coroutineScope2;
                        objRememberedValue68 = new th(coroutineScope7, mutableState24, mutableState14, mutableState12, zq0Var4, mutableState107, mutableState31, mutableState30, context2);
                        coroutineScope3 = coroutineScope7;
                        r3.updateRememberedValue(objRememberedValue68);
                    }
                    Function0 function415 = (Function0) objRememberedValue68;
                    objRememberedValue69 = r3.rememberedValue();
                    if (objRememberedValue69 == companion16.getEmpty()) {
                        objRememberedValue69 = new ey(2, mutableState24, mutableState14);
                        r3.updateRememberedValue(objRememberedValue69);
                    }
                    Object r211 = r3;
                    qn0.a(itemCounts4, zJ3, function413, function414, function415, (Function0) objRememberedValue69, r211, 200064);
                    Object r156 = r211;
                    r156.endReplaceGroup();
                    r9 = r156;
                } else {
                    coroutineScope3 = coroutineScope2;
                    mutableState32 = mutableState16;
                    Object r157 = r3;
                    r157.startReplaceGroup(1422100217);
                    r157.endReplaceGroup();
                    r9 = r157;
                }
                if (((Boolean) mutableState32.getValue()).booleanValue()) {
                    r9.startReplaceGroup(1422146128);
                    zChanged6 = r9.changed(mutableState27) | r9.changedInstance(serverPreferences3) | r9.changedInstance(context2) | r9.changedInstance(zq0Var4);
                    Object objRememberedValue179 = r9.rememberedValue();
                    if (zChanged6) {
                        ServerPreferences serverPreferences19 = serverPreferences3;
                        MutableState mutableState1312 = mutableState32;
                        j1Var = new j1(serverPreferences19, context2, zq0Var4, mutableState27, mutableState1312, 7);
                        serverPreferences4 = serverPreferences19;
                        mutableState68 = mutableState1312;
                        r9.updateRememberedValue(j1Var);
                    } else {
                        ServerPreferences serverPreferences110 = serverPreferences3;
                        MutableState mutableState1313 = mutableState32;
                        j1Var = new j1(serverPreferences110, context2, zq0Var4, mutableState27, mutableState1313, 7);
                        serverPreferences4 = serverPreferences110;
                        mutableState68 = mutableState1313;
                        r9.updateRememberedValue(j1Var);
                    }
                    Function1 function416 = (Function1) j1Var;
                    objRememberedValue65 = r9.rememberedValue();
                    if (objRememberedValue65 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue65 = new a50(15, mutableState68);
                        r9.updateRememberedValue(objRememberedValue65);
                    }
                    Object r1410 = r9;
                    qn0.d(null, list, true, function416, (Function0) objRememberedValue65, r1410, 24960, 1);
                    Object r1411 = r1410;
                    r1411.endReplaceGroup();
                    r114 = r1411;
                } else {
                    Object r1412 = r9;
                    serverPreferences4 = serverPreferences3;
                    r1412.startReplaceGroup(1422431545);
                    r1412.endReplaceGroup();
                    r114 = r1412;
                }
                i16 = 458752;
                if (((Boolean) mutableState26.getValue()).booleanValue()) {
                    r114.startReplaceGroup(1422494940);
                    if ((i29 & 3670016) == 1048576) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    if ((i29 & 29360128) == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean zChangedInstance313 = z23 | z24 | r114.changedInstance(serverPreferences4) | r114.changedInstance(context2) | r114.changed(mutableState27) | r114.changedInstance(zq0Var4);
                    if ((i29 & 458752) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zChangedInstance313 | z25;
                    objRememberedValue63 = r114.rememberedValue();
                    if (z26) {
                        MutableState mutableState1314 = mutableState27;
                        zq0 zq0Var7 = zq0Var4;
                        Context context6 = context2;
                        MutableState mutableState1315 = mutableState26;
                        mutableState34 = mutableState29;
                        i17 = 5;
                        ServerPreferences serverPreferences111 = serverPreferences4;
                        un0 un0Var2 = new un0(function0, function7, mutableState1315, serverPreferences111, context6, mutableState1314, zq0Var7, function6, mutableState34, mutableState13);
                        mutableState67 = mutableState1315;
                        serverPreferences5 = serverPreferences111;
                        context2 = context6;
                        mutableState33 = mutableState1314;
                        zq0Var4 = zq0Var7;
                        r114.updateRememberedValue(un0Var2);
                        objRememberedValue63 = un0Var2;
                    } else {
                        MutableState mutableState1316 = mutableState27;
                        zq0 zq0Var8 = zq0Var4;
                        Context context7 = context2;
                        MutableState mutableState1317 = mutableState26;
                        mutableState34 = mutableState29;
                        i17 = 5;
                        ServerPreferences serverPreferences112 = serverPreferences4;
                        un0 un0Var3 = new un0(function0, function7, mutableState1317, serverPreferences112, context7, mutableState1316, zq0Var8, function6, mutableState34, mutableState13);
                        mutableState67 = mutableState1317;
                        serverPreferences5 = serverPreferences112;
                        context2 = context7;
                        mutableState33 = mutableState1316;
                        zq0Var4 = zq0Var8;
                        r114.updateRememberedValue(un0Var3);
                        objRememberedValue63 = un0Var3;
                    }
                    Function1 function417 = (Function1) objRememberedValue63;
                    objRememberedValue64 = r114.rememberedValue();
                    if (objRememberedValue64 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue64 = new a50(16, mutableState67);
                        r114.updateRememberedValue(objRememberedValue64);
                    }
                    Object r312 = r114;
                    qn0.d("切换服务器", listA, true, function417, (Function0) objRememberedValue64, r312, 24966, 0);
                    Object r1413 = r312;
                    r1413.endReplaceGroup();
                    r115 = r1413;
                } else {
                    mutableState33 = mutableState27;
                    serverPreferences5 = serverPreferences4;
                    i16 = 458752;
                    mutableState34 = mutableState29;
                    coroutineScope3 = coroutineScope3;
                    y32Var = y32Var;
                    qf2Var3 = qf2Var3;
                    i17 = 5;
                    r114.startReplaceGroup(1423291609);
                    r114.endReplaceGroup();
                    r115 = r114;
                }
                if (((Boolean) mutableState25.getValue()).booleanValue()) {
                    r115.startReplaceGroup(1423390065);
                    objRememberedValue49 = r115.rememberedValue();
                    companion14 = Composer.INSTANCE;
                    if (objRememberedValue49 == companion14.getEmpty()) {
                        objRememberedValue49 = new a50(17, mutableState25);
                        r115.updateRememberedValue(objRememberedValue49);
                    }
                    Function0 function418 = (Function0) objRememberedValue49;
                    objRememberedValue50 = r115.rememberedValue();
                    if (objRememberedValue50 == companion14.getEmpty()) {
                        mutableState66 = mutableState111;
                        objRememberedValue50 = new ey(i32, mutableState66, mutableState25);
                        r115.updateRememberedValue(objRememberedValue50);
                    } else {
                        mutableState66 = mutableState111;
                    }
                    Function0 function419 = (Function0) objRememberedValue50;
                    objRememberedValue51 = r115.rememberedValue();
                    if (objRememberedValue51 == companion14.getEmpty()) {
                        mutableState113 = mutableState113;
                        objRememberedValue51 = new ey(4, mutableState113, mutableState25);
                        r115.updateRememberedValue(objRememberedValue51);
                    } else {
                        mutableState113 = mutableState113;
                    }
                    Function0 function514 = (Function0) objRememberedValue51;
                    objRememberedValue52 = r115.rememberedValue();
                    if (objRememberedValue52 == companion14.getEmpty()) {
                        mutableState37 = mutableState114;
                        objRememberedValue52 = new ey(i17, mutableState37, mutableState25);
                        r115.updateRememberedValue(objRememberedValue52);
                    } else {
                        mutableState37 = mutableState114;
                    }
                    Function0 function515 = (Function0) objRememberedValue52;
                    objRememberedValue53 = r115.rememberedValue();
                    if (objRememberedValue53 == companion14.getEmpty()) {
                        mutableState126 = mutableState126;
                        objRememberedValue53 = new ey(6, mutableState126, mutableState25);
                        r115.updateRememberedValue(objRememberedValue53);
                    } else {
                        mutableState126 = mutableState126;
                    }
                    Function0 function516 = (Function0) objRememberedValue53;
                    objRememberedValue54 = r115.rememberedValue();
                    if (objRememberedValue54 == companion14.getEmpty()) {
                        mutableState36 = mutableState112;
                        objRememberedValue54 = new ey(7, mutableState36, mutableState25);
                        r115.updateRememberedValue(objRememberedValue54);
                    } else {
                        mutableState36 = mutableState112;
                    }
                    Function0 function517 = (Function0) objRememberedValue54;
                    objRememberedValue55 = r115.rememberedValue();
                    if (objRememberedValue55 == companion14.getEmpty()) {
                        mutableState38 = mutableState116;
                        objRememberedValue55 = new ey(8, mutableState38, mutableState25);
                        r115.updateRememberedValue(objRememberedValue55);
                    } else {
                        mutableState38 = mutableState116;
                    }
                    Function0 function518 = (Function0) objRememberedValue55;
                    objRememberedValue56 = r115.rememberedValue();
                    if (objRememberedValue56 == companion14.getEmpty()) {
                        mutableState39 = mutableState117;
                        objRememberedValue56 = new ey(9, mutableState39, mutableState25);
                        r115.updateRememberedValue(objRememberedValue56);
                    } else {
                        mutableState39 = mutableState117;
                    }
                    Function0 function519 = (Function0) objRememberedValue56;
                    vc vcVar4 = vcVar;
                    zChanged5 = r115.changed(vcVar4);
                    objRememberedValue57 = r115.rememberedValue();
                    if (zChanged5) {
                        companion15 = companion14;
                        if (objRememberedValue57 == companion15.getEmpty()) {
                        }
                        Function0 function5110 = (Function0) ((KFunction) objRememberedValue57);
                        objRememberedValue58 = r115.rememberedValue();
                        if (objRememberedValue58 == companion15.getEmpty()) {
                            mutableState40 = mutableState118;
                            objRememberedValue58 = new ey(10, mutableState40, mutableState25);
                            r115.updateRememberedValue(objRememberedValue58);
                        } else {
                            mutableState40 = mutableState118;
                        }
                        Function0 function5111 = (Function0) objRememberedValue58;
                        objRememberedValue59 = r115.rememberedValue();
                        if (objRememberedValue59 == companion15.getEmpty()) {
                            mutableState41 = mutableState119;
                            objRememberedValue59 = new ey(11, mutableState41, mutableState25);
                            r115.updateRememberedValue(objRememberedValue59);
                        } else {
                            mutableState41 = mutableState119;
                        }
                        Function0 function5112 = (Function0) objRememberedValue59;
                        objRememberedValue60 = r115.rememberedValue();
                        if (objRememberedValue60 == companion15.getEmpty()) {
                            mutableState42 = mutableState121;
                            objRememberedValue60 = new ey(12, mutableState42, mutableState25);
                            r115.updateRememberedValue(objRememberedValue60);
                        } else {
                            mutableState42 = mutableState121;
                        }
                        Function0 function5113 = (Function0) objRememberedValue60;
                        objRememberedValue61 = r115.rememberedValue();
                        if (objRememberedValue61 == companion15.getEmpty()) {
                            mutableState43 = mutableState122;
                            objRememberedValue61 = new ey(13, mutableState43, mutableState25);
                            r115.updateRememberedValue(objRememberedValue61);
                        } else {
                            mutableState43 = mutableState122;
                        }
                        Function0 function610 = (Function0) objRememberedValue61;
                        objRememberedValue62 = r115.rememberedValue();
                        vcVar2 = vcVar4;
                        if (objRememberedValue62 == companion15.getEmpty()) {
                            mutableState123 = mutableState123;
                            objRememberedValue62 = new ey(14, mutableState123, mutableState25);
                            r115.updateRememberedValue(objRememberedValue62);
                        } else {
                            mutableState123 = mutableState123;
                        }
                        Function0 function611 = (Function0) objRememberedValue62;
                        zChangedInstance14 = r115.changedInstance(zq0Var4) | r115.changedInstance(context2);
                        Object objRememberedValue1710 = r115.rememberedValue();
                        if (zChangedInstance14) {
                            ghVar = new gh(6, mutableState124, (Object) zq0Var4, (Object) context2, (Object) mutableState125);
                            r115.updateRememberedValue(ghVar);
                        } else {
                            ghVar = new gh(6, mutableState124, (Object) zq0Var4, (Object) context2, (Object) mutableState125);
                            r115.updateRememberedValue(ghVar);
                        }
                        Object r313 = r115;
                        mutableState35 = mutableState66;
                        kz1.b(function418, function419, function514, function515, function516, function517, function518, function519, false, function5110, function5111, function5112, function5113, function610, function611, (Function0) ghVar, r313, 14380470, 28086);
                        Object r1414 = r313;
                        r1414.endReplaceGroup();
                        r116 = r1414;
                    } else {
                        companion15 = companion14;
                    }
                    objRememberedValue57 = new g6(vcVar4, 2);
                    r115.updateRememberedValue(objRememberedValue57);
                    Function0 function5114 = (Function0) ((KFunction) objRememberedValue57);
                    objRememberedValue58 = r115.rememberedValue();
                    if (objRememberedValue58 == companion15.getEmpty()) {
                        mutableState40 = mutableState118;
                        objRememberedValue58 = new ey(10, mutableState40, mutableState25);
                        r115.updateRememberedValue(objRememberedValue58);
                    } else {
                        mutableState40 = mutableState118;
                    }
                    Function0 function5115 = (Function0) objRememberedValue58;
                    objRememberedValue59 = r115.rememberedValue();
                    if (objRememberedValue59 == companion15.getEmpty()) {
                        mutableState41 = mutableState119;
                        objRememberedValue59 = new ey(11, mutableState41, mutableState25);
                        r115.updateRememberedValue(objRememberedValue59);
                    } else {
                        mutableState41 = mutableState119;
                    }
                    Function0 function5116 = (Function0) objRememberedValue59;
                    objRememberedValue60 = r115.rememberedValue();
                    if (objRememberedValue60 == companion15.getEmpty()) {
                        mutableState42 = mutableState121;
                        objRememberedValue60 = new ey(12, mutableState42, mutableState25);
                        r115.updateRememberedValue(objRememberedValue60);
                    } else {
                        mutableState42 = mutableState121;
                    }
                    Function0 function5117 = (Function0) objRememberedValue60;
                    objRememberedValue61 = r115.rememberedValue();
                    if (objRememberedValue61 == companion15.getEmpty()) {
                        mutableState43 = mutableState122;
                        objRememberedValue61 = new ey(13, mutableState43, mutableState25);
                        r115.updateRememberedValue(objRememberedValue61);
                    } else {
                        mutableState43 = mutableState122;
                    }
                    Function0 function612 = (Function0) objRememberedValue61;
                    objRememberedValue62 = r115.rememberedValue();
                    vcVar2 = vcVar4;
                    if (objRememberedValue62 == companion15.getEmpty()) {
                        mutableState123 = mutableState123;
                        objRememberedValue62 = new ey(14, mutableState123, mutableState25);
                        r115.updateRememberedValue(objRememberedValue62);
                    } else {
                        mutableState123 = mutableState123;
                    }
                    Function0 function613 = (Function0) objRememberedValue62;
                    zChangedInstance14 = r115.changedInstance(zq0Var4) | r115.changedInstance(context2);
                    Object objRememberedValue1711 = r115.rememberedValue();
                    if (zChangedInstance14) {
                        ghVar = new gh(6, mutableState124, (Object) zq0Var4, (Object) context2, (Object) mutableState125);
                        r115.updateRememberedValue(ghVar);
                    } else {
                        ghVar = new gh(6, mutableState124, (Object) zq0Var4, (Object) context2, (Object) mutableState125);
                        r115.updateRememberedValue(ghVar);
                    }
                    Object r314 = r115;
                    mutableState35 = mutableState66;
                    kz1.b(function418, function419, function514, function515, function516, function517, function518, function519, false, function5114, function5115, function5116, function5117, function612, function613, (Function0) ghVar, r314, 14380470, 28086);
                    Object r1415 = r314;
                    r1415.endReplaceGroup();
                    r116 = r1415;
                } else {
                    zq0Var4 = zq0Var4;
                    context2 = context2;
                    vcVar2 = vcVar;
                    mutableState35 = mutableState111;
                    mutableState36 = mutableState112;
                    mutableState37 = mutableState114;
                    mutableState38 = mutableState116;
                    mutableState39 = mutableState117;
                    mutableState40 = mutableState118;
                    mutableState41 = mutableState119;
                    mutableState42 = mutableState121;
                    mutableState43 = mutableState122;
                    r115.startReplaceGroup(1425458137);
                    r115.endReplaceGroup();
                    r116 = r115;
                }
                bd.a(vcVar2, r116, 0);
                if (((Boolean) mutableState35.getValue()).booleanValue()) {
                    r116.startReplaceGroup(1425554082);
                    objRememberedValue48 = r116.rememberedValue();
                    if (objRememberedValue48 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue48 = new ey(15, mutableState35, mutableState25);
                        r116.updateRememberedValue(objRememberedValue48);
                    }
                    Object r212 = r116;
                    mutableState45 = mutableState36;
                    mutableState44 = mutableState43;
                    i18 = 16;
                    b00.a((Function0) objRememberedValue48, true, null, r212, 54, 4);
                    Object r213 = r212;
                    r213.endReplaceGroup();
                    r10 = r213;
                } else {
                    mutableState44 = mutableState43;
                    Object r214 = r116;
                    i18 = 16;
                    mutableState45 = mutableState36;
                    r214.startReplaceGroup(1425729945);
                    r214.endReplaceGroup();
                    r10 = r214;
                }
                if (((Boolean) mutableState45.getValue()).booleanValue()) {
                    r10.startReplaceGroup(1425771981);
                    objRememberedValue47 = r10.rememberedValue();
                    if (objRememberedValue47 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue47 = new ey(i18, mutableState45, mutableState25);
                        r10.updateRememberedValue(objRememberedValue47);
                    }
                    i19 = 6;
                    zb0.b((Function0) objRememberedValue47, r10, 6);
                    r10.endReplaceGroup();
                } else {
                    i19 = 6;
                    r10.startReplaceGroup(1425906521);
                    r10.endReplaceGroup();
                }
                if (((Boolean) mutableState40.getValue()).booleanValue()) {
                    r10.startReplaceGroup(1425965886);
                    objRememberedValue45 = r10.rememberedValue();
                    companion13 = Composer.INSTANCE;
                    if (objRememberedValue45 == companion13.getEmpty()) {
                        objRememberedValue45 = new ey(17, mutableState40, mutableState25);
                        r10.updateRememberedValue(objRememberedValue45);
                    }
                    Function0 function614 = (Function0) objRememberedValue45;
                    userPreferences2 = userPreferences;
                    zChangedInstance13 = r10.changedInstance(userPreferences2) | r10.changedInstance(context2);
                    objRememberedValue46 = r10.rememberedValue();
                    if (zChangedInstance13) {
                        mutableState46 = mutableState97;
                        objRememberedValue46 = new t5(userPreferences2, context2, mutableState46, 1);
                        r10.updateRememberedValue(objRememberedValue46);
                    } else {
                        mutableState46 = mutableState97;
                        objRememberedValue46 = new t5(userPreferences2, context2, mutableState46, 1);
                        r10.updateRememberedValue(objRememberedValue46);
                    }
                    q41.a(function614, (Function0) objRememberedValue46, r10, i19);
                    r10.endReplaceGroup();
                } else {
                    mutableState46 = mutableState97;
                    userPreferences2 = userPreferences;
                    r10.startReplaceGroup(1426576121);
                    r10.endReplaceGroup();
                }
                if (((Boolean) mutableState37.getValue()).booleanValue()) {
                    r10.startReplaceGroup(1426619304);
                    objRememberedValue44 = r10.rememberedValue();
                    if (objRememberedValue44 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue44 = new ey(18, mutableState37, mutableState25);
                        r10.updateRememberedValue(objRememberedValue44);
                    }
                    v72.f((Function0) objRememberedValue44, r10, i19);
                    r10.endReplaceGroup();
                } else {
                    r10.startReplaceGroup(1426758649);
                    r10.endReplaceGroup();
                }
                if (((Boolean) mutableState113.getValue()).booleanValue()) {
                    r10.startReplaceGroup(1426917028);
                    boolean zBooleanValue25 = ((Boolean) mutableState85.getValue()).booleanValue();
                    boolean zBooleanValue26 = ((Boolean) mutableState86.getValue()).booleanValue();
                    boolean zBooleanValue110 = ((Boolean) mutableState87.getValue()).booleanValue();
                    boolean zBooleanValue111 = ((Boolean) mutableState88.getValue()).booleanValue();
                    boolean zBooleanValue112 = ((Boolean) mutableState89.getValue()).booleanValue();
                    boolean zBooleanValue113 = ((Boolean) mutableState90.getValue()).booleanValue();
                    boolean zBooleanValue114 = ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean zH2 = H(mutableState92);
                    boolean zBooleanValue115 = ((Boolean) mutableState93.getValue()).booleanValue();
                    boolean zI2 = I(mutableState94);
                    boolean zBooleanValue116 = ((Boolean) mutableState95.getValue()).booleanValue();
                    boolean zBooleanValue117 = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean zJ4 = J(mutableState98);
                    boolean zBooleanValue118 = ((Boolean) mutableState46.getValue()).booleanValue();
                    objRememberedValue42 = r10.rememberedValue();
                    companion12 = Composer.INSTANCE;
                    if (objRememberedValue42 == companion12.getEmpty()) {
                        mutableState64 = mutableState113;
                        objRememberedValue42 = new ey(19, mutableState64, mutableState25);
                        r10.updateRememberedValue(objRememberedValue42);
                    } else {
                        mutableState64 = mutableState113;
                    }
                    Function0 function615 = (Function0) objRememberedValue42;
                    zChangedInstance12 = r10.changedInstance(userPreferences2);
                    mutableState65 = mutableState25;
                    objRememberedValue43 = r10.rememberedValue();
                    if (zChangedInstance12) {
                        UserPreferences userPreferences6 = userPreferences2;
                        mutableState52 = mutableState90;
                        mutableState53 = mutableState92;
                        mutableState54 = mutableState93;
                        mutableState55 = mutableState94;
                        mutableState56 = mutableState98;
                        objRememberedValue43 = new e4(userPreferences6, mutableState85, mutableState86, mutableState87, mutableState88, mutableState89, mutableState52, mutableState3, mutableState53, mutableState54, mutableState55, mutableState95, mutableState, mutableState56, mutableState64, mutableState65, 1);
                        userPreferences3 = userPreferences6;
                        mutableState47 = mutableState85;
                        mutableState48 = mutableState86;
                        mutableState49 = mutableState87;
                        mutableState50 = mutableState88;
                        mutableState51 = mutableState89;
                        mutableState57 = mutableState65;
                        r10.updateRememberedValue(objRememberedValue43);
                    } else {
                        UserPreferences userPreferences7 = userPreferences2;
                        mutableState52 = mutableState90;
                        mutableState53 = mutableState92;
                        mutableState54 = mutableState93;
                        mutableState55 = mutableState94;
                        mutableState56 = mutableState98;
                        objRememberedValue43 = new e4(userPreferences7, mutableState85, mutableState86, mutableState87, mutableState88, mutableState89, mutableState52, mutableState3, mutableState53, mutableState54, mutableState55, mutableState95, mutableState, mutableState56, mutableState64, mutableState65, 1);
                        userPreferences3 = userPreferences7;
                        mutableState47 = mutableState85;
                        mutableState48 = mutableState86;
                        mutableState49 = mutableState87;
                        mutableState50 = mutableState88;
                        mutableState51 = mutableState89;
                        mutableState57 = mutableState65;
                        r10.updateRememberedValue(objRememberedValue43);
                    }
                    Object r315 = r10;
                    qu0.a(zBooleanValue25, zBooleanValue26, zBooleanValue110, zBooleanValue111, zBooleanValue112, zBooleanValue113, zBooleanValue114, zH2, zBooleanValue115, zI2, zBooleanValue116, zBooleanValue117, zJ4, zBooleanValue118, function615, (Function13) objRememberedValue43, r315, 0, 24576);
                    Object r1416 = r315;
                    r1416.endReplaceGroup();
                    r117 = r1416;
                } else {
                    userPreferences3 = userPreferences2;
                    Object r1417 = r10;
                    mutableState13 = mutableState13;
                    mutableState47 = mutableState85;
                    mutableState48 = mutableState86;
                    mutableState49 = mutableState87;
                    mutableState50 = mutableState88;
                    mutableState51 = mutableState89;
                    mutableState52 = mutableState90;
                    mutableState53 = mutableState92;
                    mutableState54 = mutableState93;
                    mutableState55 = mutableState94;
                    mutableState56 = mutableState98;
                    mutableState57 = mutableState25;
                    r1417.startReplaceGroup(1430504441);
                    r1417.endReplaceGroup();
                    r117 = r1417;
                }
                if (((Boolean) mutableState126.getValue()).booleanValue()) {
                    r117.startReplaceGroup(1430560892);
                    String qrNetworkInterfaceName2 = userPreferences3.getQrNetworkInterfaceName();
                    objRememberedValue40 = r117.rememberedValue();
                    companion11 = Composer.INSTANCE;
                    if (objRememberedValue40 == companion11.getEmpty()) {
                        objRememberedValue40 = new ey(20, mutableState126, mutableState57);
                        r117.updateRememberedValue(objRememberedValue40);
                    }
                    Function0 function616 = (Function0) objRememberedValue40;
                    zChangedInstance11 = r117.changedInstance(userPreferences3);
                    objRememberedValue41 = r117.rememberedValue();
                    if (zChangedInstance11) {
                        objRememberedValue41 = new xn0(userPreferences3, mutableState126, mutableState57, 0);
                        r117.updateRememberedValue(objRememberedValue41);
                    } else {
                        objRememberedValue41 = new xn0(userPreferences3, mutableState126, mutableState57, 0);
                        r117.updateRememberedValue(objRememberedValue41);
                    }
                    xr1.b(qrNetworkInterfaceName2, function616, (Function1) objRememberedValue41, r117, 48);
                    r117.endReplaceGroup();
                } else {
                    r117.startReplaceGroup(1430988537);
                    r117.endReplaceGroup();
                }
                if (((Boolean) mutableState39.getValue()).booleanValue()) {
                    r117.startReplaceGroup(1431032774);
                    objRememberedValue39 = r117.rememberedValue();
                    if (objRememberedValue39 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue39 = new ey(21, mutableState39, mutableState57);
                        r117.updateRememberedValue(objRememberedValue39);
                    }
                    wm.a((Function0) objRememberedValue39, r117, 6);
                    r117.endReplaceGroup();
                } else {
                    r117.startReplaceGroup(1431174041);
                    r117.endReplaceGroup();
                }
                if (((Boolean) mutableState41.getValue()).booleanValue()) {
                    r117.startReplaceGroup(1431231670);
                    List listQ2 = q(stateCollectAsState15);
                    String strR2 = r(stateCollectAsState16);
                    objRememberedValue35 = r117.rememberedValue();
                    companion10 = Composer.INSTANCE;
                    if (objRememberedValue35 == companion10.getEmpty()) {
                        mutableState63 = mutableState120;
                        objRememberedValue35 = new ey(22, mutableState63, mutableState41);
                        r117.updateRememberedValue(objRememberedValue35);
                    } else {
                        mutableState63 = mutableState120;
                    }
                    Function0 function617 = (Function0) objRememberedValue35;
                    y32Var2 = y32Var;
                    zChangedInstance9 = r117.changedInstance(coroutineScope3) | r117.changedInstance(y32Var2);
                    mutableState120 = mutableState63;
                    objRememberedValue36 = r117.rememberedValue();
                    if (zChangedInstance9) {
                        objRememberedValue36 = new g4(coroutineScope3, y32Var2, 2);
                        r117.updateRememberedValue(objRememberedValue36);
                    } else {
                        objRememberedValue36 = new g4(coroutineScope3, y32Var2, 2);
                        r117.updateRememberedValue(objRememberedValue36);
                    }
                    Function1 function618 = (Function1) objRememberedValue36;
                    zChangedInstance10 = r117.changedInstance(coroutineScope3) | r117.changedInstance(y32Var2);
                    objRememberedValue37 = r117.rememberedValue();
                    if (zChangedInstance10) {
                        objRememberedValue37 = new g4(coroutineScope3, y32Var2, 3);
                        r117.updateRememberedValue(objRememberedValue37);
                    } else {
                        objRememberedValue37 = new g4(coroutineScope3, y32Var2, 3);
                        r117.updateRememberedValue(objRememberedValue37);
                    }
                    Function1 function619 = (Function1) objRememberedValue37;
                    objRememberedValue38 = r117.rememberedValue();
                    if (objRememberedValue38 == companion10.getEmpty()) {
                        objRememberedValue38 = new ey(23, mutableState41, mutableState57);
                        r117.updateRememberedValue(objRememberedValue38);
                    }
                    Object r215 = r117;
                    q32.d(listQ2, strR2, function617, function618, function619, (Function0) objRememberedValue38, r215, 196992);
                    Object r1418 = r215;
                    r1418.endReplaceGroup();
                    r118 = r1418;
                } else {
                    r117.startReplaceGroup(1431880345);
                    r117.endReplaceGroup();
                    r118 = r117;
                }
                if (((Boolean) mutableState38.getValue()).booleanValue()) {
                    r118.startReplaceGroup(1431928519);
                    ProxyConfig proxyConfigM4 = M(stateCollectAsState13);
                    objRememberedValue33 = r118.rememberedValue();
                    companion9 = Composer.INSTANCE;
                    if (objRememberedValue33 == companion9.getEmpty()) {
                        objRememberedValue33 = new ey(24, mutableState38, mutableState57);
                        r118.updateRememberedValue(objRememberedValue33);
                    }
                    Function0 function75 = (Function0) objRememberedValue33;
                    zChangedInstance8 = r118.changedInstance(coroutineScope3) | r118.changedInstance(proxySettings) | r118.changedInstance(context2);
                    objRememberedValue34 = r118.rememberedValue();
                    if (zChangedInstance8) {
                        MutableState mutableState1318 = mutableState57;
                        objRememberedValue34 = new i4(coroutineScope3, proxySettings, context2, mutableState38, mutableState1318, 1);
                        mutableState58 = mutableState1318;
                        r118.updateRememberedValue(objRememberedValue34);
                    } else {
                        MutableState mutableState1319 = mutableState57;
                        objRememberedValue34 = new i4(coroutineScope3, proxySettings, context2, mutableState38, mutableState1319, 1);
                        mutableState58 = mutableState1319;
                        r118.updateRememberedValue(objRememberedValue34);
                    }
                    Object r216 = r118;
                    i20 = 1;
                    gr1.c(proxyConfigM4, proxyConfigServerManager, function75, (Function1) objRememberedValue34, r216, (ProxyConfigServerManager.$stable << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                    r216.endReplaceGroup();
                    r11 = r216;
                } else {
                    mutableState58 = mutableState57;
                    Object r217 = r118;
                    i20 = 1;
                    r217.startReplaceGroup(1432468601);
                    r217.endReplaceGroup();
                    r11 = r217;
                }
                if (((Boolean) mutableState120.getValue()).booleanValue()) {
                    r11.startReplaceGroup(1432514016);
                    String str8 = (String) mutableState127.getValue();
                    String str9 = (String) mutableState127.getValue();
                    if (str9 != null) {
                    }
                    boolean zBooleanValue119 = ((Boolean) mutableState128.getValue()).booleanValue();
                    objRememberedValue32 = r11.rememberedValue();
                    if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue32 = new ey(25, mutableState120, mutableState41);
                        r11.updateRememberedValue(objRememberedValue32);
                    }
                    e42.a(str8, r7, zBooleanValue119, (Function0) objRememberedValue32, r11, 3072);
                    r11.endReplaceGroup();
                } else {
                    r11.startReplaceGroup(1432814809);
                    r11.endReplaceGroup();
                }
                if (((Boolean) mutableState42.getValue()).booleanValue()) {
                    r11.startReplaceGroup(1432875321);
                    t91 t91VarU2 = u(stateCollectAsState17);
                    objRememberedValue30 = r11.rememberedValue();
                    companion8 = Composer.INSTANCE;
                    if (objRememberedValue30 == companion8.getEmpty()) {
                        mutableState62 = mutableState42;
                        objRememberedValue30 = new ey(26, mutableState62, mutableState58);
                        r11.updateRememberedValue(objRememberedValue30);
                    } else {
                        mutableState62 = mutableState42;
                    }
                    Function0 function76 = (Function0) objRememberedValue30;
                    zChangedInstance7 = r11.changedInstance(sa1Var);
                    objRememberedValue31 = r11.rememberedValue();
                    if (zChangedInstance7) {
                        objRememberedValue31 = new j4(sa1Var, mutableState62, mutableState58, i20);
                        r11.updateRememberedValue(objRememberedValue31);
                    } else {
                        objRememberedValue31 = new j4(sa1Var, mutableState62, mutableState58, i20);
                        r11.updateRememberedValue(objRememberedValue31);
                    }
                    y91.c(t91VarU2, onlineSubtitleConfigServerManager, function76, (Function1) objRememberedValue31, r11, (OnlineSubtitleConfigServerManager.$stable << 3) | RendererCapabilities.DECODER_SUPPORT_MASK);
                    Object r218 = r11;
                    r218.endReplaceGroup();
                    r1 = r218;
                } else {
                    Object r219 = r11;
                    r219.startReplaceGroup(1433336601);
                    r219.endReplaceGroup();
                    r1 = r219;
                }
                if (((Boolean) mutableState44.getValue()).booleanValue()) {
                    r1.startReplaceGroup(1433387627);
                    ye2 ye2VarV2 = v(stateCollectAsState18);
                    objRememberedValue27 = r1.rememberedValue();
                    companion7 = Composer.INSTANCE;
                    if (objRememberedValue27 == companion7.getEmpty()) {
                        objRememberedValue27 = new ey(27, mutableState44, mutableState58);
                        r1.updateRememberedValue(objRememberedValue27);
                    }
                    Function0 function77 = (Function0) objRememberedValue27;
                    qf2Var = qf2Var3;
                    zChangedInstance6 = r1.changedInstance(qf2Var);
                    objRememberedValue28 = r1.rememberedValue();
                    if (zChangedInstance6) {
                        objRememberedValue28 = new k4(qf2Var, i20);
                        r1.updateRememberedValue(objRememberedValue28);
                    } else {
                        objRememberedValue28 = new k4(qf2Var, i20);
                        r1.updateRememberedValue(objRememberedValue28);
                    }
                    Function1 function78 = (Function1) objRememberedValue28;
                    int i415 = (r1.changedInstance(userPreferences3) ? 1 : 0) | (r1.changedInstance(serverPreferences5) ? 1 : 0) | (r1.changed(mutableState33) ? 1 : 0) | (r1.changedInstance(context2) ? 1 : 0);
                    if ((i29 & 3670016) == 1048576) {
                        i23 = i20;
                    } else {
                        i23 = 0;
                    }
                    int i416 = i415 | i23 | (r1.changedInstance(zq0Var4) ? 1 : 0);
                    if ((i29 & i16) == 131072) {
                        i24 = i20;
                    } else {
                        i24 = 0;
                    }
                    i25 = i416 | i24;
                    objRememberedValue29 = r1.rememberedValue();
                    if (i25 == 0) {
                        np0 np0Var2 = new np0(serverPreferences5, context2, function0, zq0Var4, userPreferences3, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState3, mutableState53, mutableState54, mutableState55, mutableState95, mutableState, mutableState46, mutableState56, mutableState33, function6, mutableState34, mutableState13);
                        r1.updateRememberedValue(np0Var2);
                        objRememberedValue29 = np0Var2;
                    } else {
                        np0 np0Var3 = new np0(serverPreferences5, context2, function0, zq0Var4, userPreferences3, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState3, mutableState53, mutableState54, mutableState55, mutableState95, mutableState, mutableState46, mutableState56, mutableState33, function6, mutableState34, mutableState13);
                        r1.updateRememberedValue(np0Var3);
                        objRememberedValue29 = np0Var3;
                    }
                    Object r1419 = r1;
                    ef2.f(ye2VarV2, pf2Var, webDavSyncConfigServerManager, function77, function78, (Function1) ((KFunction) objRememberedValue29), r1419, (WebDavSyncConfigServerManager.$stable << 6) | 3072);
                    Object r158 = r1419;
                    r158.endReplaceGroup();
                    r119 = r158;
                } else {
                    Object r159 = r1;
                    mutableState58 = mutableState58;
                    r159.startReplaceGroup(1433862361);
                    r159.endReplaceGroup();
                    r119 = r159;
                }
                if (((Boolean) mutableState123.getValue()).booleanValue()) {
                    r119.startReplaceGroup(1433907714);
                    i92 i92VarW2 = w(stateCollectAsState19);
                    objRememberedValue25 = r119.rememberedValue();
                    companion6 = Composer.INSTANCE;
                    if (objRememberedValue25 == companion6.getEmpty()) {
                        objRememberedValue25 = new ey(28, mutableState123, mutableState58);
                        r119.updateRememberedValue(objRememberedValue25);
                    }
                    Function0 function79 = (Function0) objRememberedValue25;
                    ab2Var = ab2Var3;
                    zChangedInstance5 = r119.changedInstance(ab2Var);
                    objRememberedValue26 = r119.rememberedValue();
                    if (zChangedInstance5) {
                        z22 = true;
                        objRememberedValue26 = new l4(ab2Var, 1);
                        r119.updateRememberedValue(objRememberedValue26);
                    } else {
                        z22 = true;
                        objRememberedValue26 = new l4(ab2Var, 1);
                        r119.updateRememberedValue(objRememberedValue26);
                    }
                    hb2.b(i92VarW2, xa2Var, function79, (Function1) objRememberedValue26, r119, 448);
                    r119.endReplaceGroup();
                    r2 = z22;
                } else {
                    r2 = 1;
                    r119.startReplaceGroup(1434237337);
                    r119.endReplaceGroup();
                }
                if (((Boolean) mutableState124.getValue()).booleanValue()) {
                    r119.startReplaceGroup(1434277296);
                    objRememberedValue24 = r119.rememberedValue();
                    if (objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                        i21 = 29;
                        objRememberedValue24 = new h10(29);
                        r119.updateRememberedValue(objRememberedValue24);
                    } else {
                        i21 = 29;
                    }
                    Object r316 = r119;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue24, et.g(), null, null, null, et.c(), et.e(), null, 0L, 0L, 0L, 0L, 0.0f, null, r316, 1769526, 0, 16284);
                    Object r1510 = r316;
                    r1510.endReplaceGroup();
                    r120 = r1510;
                } else {
                    i21 = 29;
                    r119.startReplaceGroup(1434716473);
                    r119.endReplaceGroup();
                    r120 = r119;
                }
                if (((Boolean) mutableState125.getValue()).booleanValue()) {
                    r120.startReplaceGroup(1434768770);
                    objRememberedValue23 = r120.rememberedValue();
                    if (objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                        mutableState61 = mutableState125;
                        objRememberedValue23 = new ey(i21, mutableState61, mutableState58);
                        r120.updateRememberedValue(objRememberedValue23);
                    } else {
                        mutableState61 = mutableState125;
                    }
                    i22 = 54;
                    Object r317 = r120;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue23, ComposableLambdaKt.rememberComposableLambda(2080795661, r2, new m4(r2, mutableState61, mutableState58), r120, 54), null, null, null, et.j(), et.f(), null, 0L, 0L, 0L, 0L, 0.0f, null, r317, 1769526, 0, 16284);
                    Object r1511 = r317;
                    r1511.endReplaceGroup();
                    r121 = r1511;
                } else {
                    i22 = 54;
                    r120.startReplaceGroup(1435190649);
                    r120.endReplaceGroup();
                    r121 = r120;
                }
                if (s(mutableState129) != null) {
                    r121.startReplaceGroup(1435242636);
                    objRememberedValue22 = r121.rememberedValue();
                    if (objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                        mutableState60 = mutableState129;
                        objRememberedValue22 = new a50(21, mutableState60);
                        r121.updateRememberedValue(objRememberedValue22);
                    } else {
                        mutableState60 = mutableState129;
                    }
                    Object r318 = r121;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue22, ComposableLambdaKt.rememberComposableLambda(-1287416882, r2, new b2(11, mutableState60), r121, i22), null, null, null, et.h(), ComposableLambdaKt.rememberComposableLambda(1035531219, r2, new b2(12, mutableState60), r121, i22), null, 0L, 0L, 0L, 0L, 0.0f, null, r318, 1769526, 0, 16284);
                    Object r1512 = r318;
                    r1512.endReplaceGroup();
                    r122 = r1512;
                } else {
                    r121.startReplaceGroup(1435624153);
                    r121.endReplaceGroup();
                    r122 = r121;
                }
                if (t(mutableState130) != null) {
                    r122.startReplaceGroup(1435674993);
                    objRememberedValue21 = r122.rememberedValue();
                    if (objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                        mutableState59 = mutableState130;
                        objRememberedValue21 = new a50(22, mutableState59);
                        r122.updateRememberedValue(objRememberedValue21);
                    } else {
                        mutableState59 = mutableState130;
                    }
                    Object r319 = r122;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue21, ComposableLambdaKt.rememberComposableLambda(-360662129, r2, new b2(13, mutableState59), r122, i22), null, null, null, et.b(), ComposableLambdaKt.rememberComposableLambda(1962285972, r2, new b2(14, mutableState59), r122, i22), null, 0L, 0L, 0L, 0L, 0.0f, null, r319, 1769526, 0, 16284);
                    Object r1513 = r319;
                    r1513.endReplaceGroup();
                    r123 = r1513;
                } else {
                    r122.startReplaceGroup(1436051705);
                    r122.endReplaceGroup();
                    r123 = r122;
                }
                r123.endReplaceGroup();
                r110 = r123;
            } else {
                r19.startReplaceGroup(1436057657);
                r19.endReplaceGroup();
                r110 = r19;
            }
            r14 = r110;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                r14 = r110;
            }
        } else {
            Composer composer5 = composerStartRestartGroup;
            composer5.skipToGroupEnd();
            r14 = composer5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = r14.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new so0(function1, function2, function3, function4, function5, function6, function0, function7, function8, function9, cq0Var, zq0Var, z, i, i2));
        }
    }

    public static final boolean g(ServerPreferences serverPreferences, Context context, zq0 zq0Var, Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ServerConfig serverConfig, boolean z) {
        ServerConfig effectiveServerConfig = serverConfig.getEffectiveServerConfig();
        String accessToken = effectiveServerConfig.getAccessToken();
        String userId = effectiveServerConfig.getUserId();
        if (accessToken == null || StringsKt.isBlank(accessToken) || userId == null || StringsKt.isBlank(userId)) {
            return false;
        }
        if (z) {
            serverPreferences.setLastUsedServerId(serverConfig.getId());
        }
        RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
        retrofitClient.initialize(effectiveServerConfig.getFullUrl());
        retrofitClient.setAuthToken(accessToken, userId);
        retrofitClient.setDeviceId(DeviceIdManager.INSTANCE.getDeviceId(context));
        retrofitClient.setTrustAllCerts(effectiveServerConfig.getTrustAllCerts());
        Proxy proxy = lr1.a;
        lr1.c(effectiveServerConfig.getDirectOnly());
        mutableState.setValue(new cq0(serverConfig.getId(), effectiveServerConfig.getAlias(), effectiveServerConfig.getDirectOnly(), serverConfig.getCustomIconPath(), serverConfig.getActiveBackupRouteId()));
        String id = serverConfig.getId();
        context.getClass();
        if (zq0Var.Q == null) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            zq0Var.Q = new aa(applicationContext);
        }
        zq0Var.R = id;
        function1.invoke(serverConfig.getId());
        rn0 rn0Var = rn0.a;
        mutableState2.setValue(rn0Var);
        o(mutableState3, true);
        zq0Var.h();
        zq0Var.P(rn0Var);
        return true;
    }

    public static final void h(MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        Job job = (Job) mutableState.getValue();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        mutableState.setValue(null);
        mutableState2.setValue(false);
        mutableState3.setValue(CollectionsKt.emptyList());
    }

    public static final void i(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean j(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void k(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final rn0 l(State state) {
        return (rn0) state.getValue();
    }

    public static final List m(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    public static final void n(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void o(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void p(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final List q(State state) {
        return (List) state.getValue();
    }

    public static final String r(State state) {
        return (String) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String s(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String t(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    public static final t91 u(State state) {
        return (t91) state.getValue();
    }

    public static final ye2 v(State state) {
        return (ye2) state.getValue();
    }

    public static final i92 w(State state) {
        return (i92) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean x(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int y(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final Integer z(State state) {
        return (Integer) state.getValue();
    }
}
