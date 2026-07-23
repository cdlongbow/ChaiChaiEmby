package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material.icons.filled.LiveTvKt;
import androidx.compose.material.icons.filled.MovieKt;
import androidx.compose.material.icons.filled.VideoLibraryKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.Library;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sy0 {
    public static final void a(ImageVector imageVector, String str, boolean z, FocusRequester focusRequester, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1636210129);
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
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1636210129, i2, -1, "com.dh.myembyapp.ui.components.LibrarySortActionButton (LibrarySortDialog.kt:441)");
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
            int i3 = MaterialTheme.$stable;
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
            long j = u61Var.z;
            long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(u61Var.A, z ? 0.86f : 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            long j2 = u61Var.A;
            long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            int i4 = i2;
            long jM5151copywmQWz5c$default4 = Color.m5151copywmQWz5c$default(u61Var.A, 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            int i5 = IconButtonDefaults.$stable;
            ButtonColors buttonColorsM8385colorsoq7We08 = iconButtonDefaults.m8385colorsoq7We08(jM5151copywmQWz5c$default, jM5151copywmQWz5c$default2, j, j2, 0L, 0L, jM5151copywmQWz5c$default3, jM5151copywmQWz5c$default4, composerStartRestartGroup, i5 << 24, 48);
            ButtonScale buttonScaleScale$default = IconButtonDefaults.scale$default(iconButtonDefaults, 0.0f, 1.08f, 0.0f, 0.0f, 0.0f, 29, null);
            ButtonGlow buttonGlowB = el0.b(u61Var);
            ButtonBorder buttonBorderBorder = iconButtonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 29);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(48.0f)), focusRequester);
            boolean z2 = (i4 & 57344) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new f5(function1, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            IconButtonKt.IconButton(function0, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue), null, z, buttonScaleScale$default, buttonGlowB, null, buttonColorsM8385colorsoq7We08, buttonBorderBorder, null, ComposableLambdaKt.rememberComposableLambda(825777575, true, new jy0(imageVector, str, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 15) & 14) | ((i4 << 3) & 7168), 6, 580);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ky0(imageVector, str, z, focusRequester, function1, function0, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(List list, Function2 function2, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Function1 function3;
        Object obj;
        Object obj2;
        int i3;
        MutableState mutableState;
        list.getClass();
        function2.getClass();
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-141631762);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-141631762, i4, -1, "com.dh.myembyapp.ui.components.LibrarySortDialog (LibrarySortDialog.kt:82)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
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
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            boolean zChanged2 = composerStartRestartGroup.changed((List) mutableState2.getValue());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                List list2 = (List) mutableState2.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Library) it.next()).getId());
                }
                objRememberedValue3 = CollectionsKt___CollectionsKt.sorted(arrayList);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            List list3 = (List) objRememberedValue3;
            boolean zChanged3 = composerStartRestartGroup.changed(list3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue4;
                SnapshotStateMap snapshotStateMapMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    snapshotStateMapMutableStateMapOf.put((String) it2.next(), new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(snapshotStateMapMutableStateMapOf);
                obj = snapshotStateMapMutableStateMapOf;
            }
            obj = objRememberedValue4;
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj;
            boolean zChanged4 = composerStartRestartGroup.changed(list3);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj2 = objRememberedValue5;
                SnapshotStateMap snapshotStateMapMutableStateMapOf2 = SnapshotStateKt.mutableStateMapOf();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    snapshotStateMapMutableStateMapOf2.put((String) it3.next(), new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(snapshotStateMapMutableStateMapOf2);
                obj2 = snapshotStateMapMutableStateMapOf2;
            }
            obj2 = objRememberedValue5;
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj2;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue6 == companion2.getEmpty()) {
                i3 = 2;
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                i3 = 2;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion2.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion2.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            int i5 = i4;
            if (objRememberedValue10 == companion2.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue10;
            int i6 = i5 & 57344;
            boolean z = i6 == 16384;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue11 == companion2.getEmpty()) {
                objRememberedValue11 = new o5(function0, mutableState6, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue11, composerStartRestartGroup, 6, 0);
            List list4 = (List) mutableState2.getValue();
            boolean zChanged5 = composerStartRestartGroup.changed(mutableState2);
            int i7 = i5 & Input.Keys.FORWARD_DEL;
            boolean zChanged6 = zChanged5 | (i7 == 32) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(snapshotStateMap) | composerStartRestartGroup.changed(snapshotStateMap2);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue12 == companion2.getEmpty()) {
                objRememberedValue12 = new oy0(lazyListStateRememberLazyListState, snapshotStateMap, snapshotStateMap2, mutableState3, mutableState2, mutableState5, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            EffectsKt.LaunchedEffect(list4, null, (Function2) objRememberedValue12, composerStartRestartGroup, i7);
            ty0 ty0Var = (ty0) mutableState4.getValue();
            List list5 = (List) mutableState2.getValue();
            boolean zChanged7 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(snapshotStateMap) | composerStartRestartGroup.changed(snapshotStateMap2);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue13 == companion2.getEmpty()) {
                mutableState = mutableState2;
                objRememberedValue13 = new py0(lazyListStateRememberLazyListState, snapshotStateMap, snapshotStateMap2, mutableState4, mutableState, mutableState5, null, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            } else {
                mutableState = mutableState2;
            }
            EffectsKt.LaunchedEffect(ty0Var, list5, (Function2) objRememberedValue13, composerStartRestartGroup, 0);
            boolean z2 = i6 == 16384;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = new o5(function0, mutableState6, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue14, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(820646903, true, new wy(u61Var, lazyListStateRememberLazyListState, mutableState, snapshotStateMap, snapshotStateMap2, coroutineScope, function2, function3, mutableState6, mutableState7, mutableState5, mutableState4), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5(list, (Object) function2, (Function) function1, function0, i, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, CoroutineScope coroutineScope, MutableState mutableState5, Function2 function2, Function1 function1, String str, int i, hy0 hy0Var) {
        int i2;
        hy0 hy0Var2;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            return;
        }
        Iterator it = ((List) mutableState2.getValue()).iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (Intrinsics.areEqual(((Library) it.next()).getId(), str)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0 && (i2 = i3 + i) >= 0 && i2 < ((List) mutableState2.getValue()).size()) {
            List list = (List) mutableState2.getValue();
            List mutableList = CollectionsKt.toMutableList((Collection) list);
            mutableList.add(i2, mutableList.remove(i3));
            mutableState3.setValue(null);
            mutableState2.setValue(mutableList);
            int lastIndex = CollectionsKt.getLastIndex(mutableList);
            int iOrdinal = hy0Var.ordinal();
            if (iOrdinal == 0) {
                hy0Var2 = (i2 <= 0 && i2 < lastIndex) ? hy0.b : hy0.a;
            } else {
                if (iOrdinal != 1) {
                    qu.f();
                    return;
                }
                hy0Var2 = (i2 >= lastIndex && i2 > 0) ? hy0.a : hy0.b;
            }
            mutableState4.setValue(new ty0(str, hy0Var2));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new qy0(mutableState, mutableState5, function2, mutableList, function1, list, mutableState2, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, Library library, boolean z, boolean z2, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function1 function2, Function0 function0, Function0 function3, Composer composer, int i) {
        int i2;
        Composer composer2;
        ImageVector liveTv;
        Composer composerStartRestartGroup = composer.startRestartGroup(1826275513);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(library) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826275513, i2, -1, "com.dh.myembyapp.ui.components.LibrarySortRow (LibrarySortDialog.kt:349)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(16.0f));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            boolean z3 = ((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) mutableState2.getValue()).booleanValue();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean z4 = z3;
            Modifier modifierFocusGroup = FocusableKt.focusGroup(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusGroup);
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(BorderKt.m286borderxT4_qwU(BackgroundKt.m274backgroundbw27NRU(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.m7813constructorimpl(56.0f)), z4 ? u61Var.z : u61Var.y, roundedCornerShapeM1312RoundedCornerShape0680j_4), z4 ? Dp.m7813constructorimpl(2.0f) : Dp.m7813constructorimpl(0.0f), z4 ? u61Var.b : Color.INSTANCE.m5187getTransparent0d7_KjU(), roundedCornerShapeM1312RoundedCornerShape0680j_4), Dp.m7813constructorimpl(12.0f), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i5).getBodyMedium();
            long j = u61Var.P;
            FontWeight.Companion companion5 = FontWeight.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(28.0f)), j, null, 0L, null, companion5.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composerStartRestartGroup, (i2 & 14) | 1572912, 0, 131000);
            String collectionType = library.getCollectionType();
            if (Intrinsics.areEqual(collectionType, "movies")) {
                liveTv = MovieKt.getMovie(Icons.INSTANCE.getDefault());
            } else {
                liveTv = Intrinsics.areEqual(collectionType, "tvshows") ? LiveTvKt.getLiveTv(Icons.INSTANCE.getDefault()) : VideoLibraryKt.getVideoLibrary(Icons.INSTANCE.getDefault());
            }
            IconKt.m2496Iconww6aTOc(liveTv, (String) null, SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(22.0f)), Color.m5151copywmQWz5c$default(u61Var.A, 0.92f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 432, 0);
            TextKt.m3048TextNvy7gAk(library.getName(), zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), u61Var.A, null, 0L, null, companion5.getMedium(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composerStartRestartGroup, i5).getBodyLarge(), composerStartRestartGroup, 1572864, 24960, 110520);
            composerStartRestartGroup.endNode();
            Icons icons = Icons.INSTANCE;
            ImageVector keyboardArrowUp = KeyboardArrowUpKt.getKeyboardArrowUp(icons.getDefault());
            String strX = kb0.x("上移 ", library.getName());
            boolean z5 = (3670016 & i2) == 1048576;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new r7(function1, mutableState, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int i6 = i2 >> 3;
            a(keyboardArrowUp, strX, z, focusRequester, (Function1) objRememberedValue3, function0, composerStartRestartGroup, (i2 & 896) | (i6 & 7168) | ((i2 >> 9) & 458752));
            ImageVector keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(icons.getDefault());
            String strX2 = kb0.x("下移 ", library.getName());
            boolean z6 = (29360128 & i2) == 8388608;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new r7(function2, mutableState2, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            a(keyboardArrowDown, strX2, z2, focusRequester2, (Function1) objRememberedValue4, function3, composerStartRestartGroup, (i6 & 896) | ((i2 >> 6) & 7168) | ((i2 >> 12) & 458752));
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new n4(str, library, z, z2, focusRequester, focusRequester2, function1, function2, function0, function3, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x012b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011b -> B:43:0x0121). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.ty0 r18, java.util.Map r19, java.util.Map r20, kotlin.jvm.functions.Function0 r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy0.e(ty0, java.util.Map, java.util.Map, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
