package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
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

import com.dh.myembyapp.data.model.ServerConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xy1 {
    public static final void a(ImageVector imageVector, String str, boolean z, FocusRequester focusRequester, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        boolean z2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-136078031);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
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
                ComposerKt.traceEventStart(-136078031, i2, -1, "com.dh.myembyapp.ui.components.ServerSortActionButton (ServerSortDialog.kt:383)");
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
            long surfaceVariant = materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant();
            long j = u61Var.D;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            int i4 = IconButtonDefaults.$stable;
            int i5 = i2;
            ButtonColors buttonColorsM8385colorsoq7We08 = iconButtonDefaults.m8385colorsoq7We08(surfaceVariant, onSurface, j, onSurface2, 0L, 0L, jM5151copywmQWz5c$default, jM5151copywmQWz5c$default2, composerStartRestartGroup, i4 << 24, 48);
            ButtonScale buttonScaleScale$default = IconButtonDefaults.scale$default(iconButtonDefaults, 0.0f, 1.15f, 0.0f, 0.0f, 0.0f, 29, null);
            ButtonGlow buttonGlowB = el0.b(u61Var);
            ButtonBorder buttonBorderBorder = iconButtonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4 << 15, 29);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(48.0f)), focusRequester);
            boolean z3 = (i5 & 57344) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new f5(function1, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            IconButtonKt.IconButton(function0, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue), null, z2, buttonScaleScale$default, buttonGlowB, null, buttonColorsM8385colorsoq7We08, buttonBorderBorder, null, ComposableLambdaKt.rememberComposableLambda(-902230359, true, new jy0(imageVector, str, 1), composerStartRestartGroup, 54), composer2, ((i5 >> 15) & 14) | ((i5 << 3) & 7168), 6, 580);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ky0(imageVector, str, z, focusRequester, function1, function0, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void b(List list, String str, String str2, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object obj;
        Object obj2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SnapshotStateMap snapshotStateMap;
        LazyListState lazyListState;
        Object r0;
        LazyListState lazyListState2;
        MutableState mutableState;
        String str3 = str2;
        list.getClass();
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(787277510);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(787277510, i3, -1, "com.dh.myembyapp.ui.components.ServerSortDialog (ServerSortDialog.kt:76)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed((List) mutableState2.getValue());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                List list2 = (List) mutableState2.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ServerConfig) it.next()).getId());
                }
                objRememberedValue2 = CollectionsKt___CollectionsKt.sorted(arrayList);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            List list3 = (List) objRememberedValue2;
            boolean zChanged3 = composerStartRestartGroup.changed(list3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue3;
                SnapshotStateMap snapshotStateMapMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    snapshotStateMapMutableStateMapOf.put((String) it2.next(), new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(snapshotStateMapMutableStateMapOf);
                obj = snapshotStateMapMutableStateMapOf;
            }
            obj = objRememberedValue3;
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj;
            boolean zChanged4 = composerStartRestartGroup.changed(list3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj2 = objRememberedValue4;
                SnapshotStateMap snapshotStateMapMutableStateMapOf2 = SnapshotStateKt.mutableStateMapOf();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    snapshotStateMapMutableStateMapOf2.put((String) it3.next(), new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(snapshotStateMapMutableStateMapOf2);
                obj2 = snapshotStateMapMutableStateMapOf2;
            }
            obj2 = objRememberedValue4;
            SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj2;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue5 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue7;
            BackHandlerKt.BackHandler(true, function0, composerStartRestartGroup, ((i3 >> 9) & Input.Keys.FORWARD_DEL) | 6, 0);
            List list4 = (List) mutableState2.getValue();
            boolean zChanged5 = composerStartRestartGroup.changed(mutableState2) | ((i3 & 896) == 256) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(snapshotStateMap2) | composerStartRestartGroup.changed(snapshotStateMap3);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue8 == companion.getEmpty()) {
                snapshotStateMap = snapshotStateMap2;
                lazyListState = lazyListStateRememberLazyListState;
                r0 = 0;
                vy1 vy1Var = new vy1(str3, lazyListState, snapshotStateMap, snapshotStateMap3, mutableState3, mutableState2, mutableState5, null);
                mutableState2 = mutableState2;
                composerStartRestartGroup.updateRememberedValue(vy1Var);
                objRememberedValue8 = vy1Var;
            } else {
                lazyListState = lazyListStateRememberLazyListState;
                snapshotStateMap = snapshotStateMap2;
                r0 = 0;
            }
            EffectsKt.LaunchedEffect(list4, str3, (Function2) objRememberedValue8, composerStartRestartGroup, (i3 >> 3) & Input.Keys.FORWARD_DEL);
            yy1 yy1Var = (yy1) mutableState4.getValue();
            List list5 = (List) mutableState2.getValue();
            boolean zChanged6 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(lazyListState) | composerStartRestartGroup.changed(snapshotStateMap) | composerStartRestartGroup.changed(snapshotStateMap3);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue9 == companion.getEmpty()) {
                lazyListState2 = lazyListState;
                mutableState = mutableState4;
                objRememberedValue9 = new py0(lazyListState2, snapshotStateMap, snapshotStateMap3, mutableState, mutableState2, mutableState5, null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                lazyListState2 = lazyListState;
                mutableState = mutableState4;
            }
            EffectsKt.LaunchedEffect(yy1Var, list5, (Function2) objRememberedValue9, composerStartRestartGroup, r0);
            SnapshotStateMap snapshotStateMap4 = snapshotStateMap;
            Composer composer3 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, (boolean) r0, (boolean) r0), ComposableLambdaKt.rememberComposableLambda(-34561713, true, new ry1(u61Var, lazyListState2, mutableState2, str, snapshotStateMap4, snapshotStateMap3, function1, mutableState5, mutableState), composerStartRestartGroup, 54), composer3, ((i3 >> 12) & 14) | 432, 0);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            str3 = str3;
            Composer composer4 = composerStartRestartGroup;
            composer4.skipToGroupEnd();
            composer2 = composer4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ig(list, str, str3, function1, function0, i, 2));
        }
    }

    public static final void c(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, String str, int i, qy1 qy1Var) {
        int i2;
        qy1 qy1Var2;
        Iterator it = ((List) mutableState.getValue()).iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (Intrinsics.areEqual(((ServerConfig) it.next()).getId(), str)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0 && (i2 = i + i3) >= 0 && i2 < ((List) mutableState.getValue()).size()) {
            List mutableList = CollectionsKt.toMutableList((Collection) mutableState.getValue());
            mutableList.add(i2, mutableList.remove(i3));
            mutableState2.setValue(null);
            mutableState.setValue(mutableList);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
            Iterator it2 = mutableList.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ServerConfig) it2.next()).getId());
            }
            function1.invoke(arrayList);
            int lastIndex = CollectionsKt.getLastIndex(mutableList);
            int iOrdinal = qy1Var.ordinal();
            if (iOrdinal == 0) {
                qy1Var2 = (i2 <= 0 && i2 < lastIndex) ? qy1.b : qy1.a;
            } else {
                if (iOrdinal != 1) {
                    qu.f();
                    return;
                }
                qy1Var2 = (i2 >= lastIndex && i2 > 0) ? qy1.a : qy1.b;
            }
            mutableState3.setValue(new yy1(str, qy1Var2));
        }
    }

    public static final void d(final String str, final ServerConfig serverConfig, final String str2, final boolean z, final boolean z2, final boolean z3, final FocusRequester focusRequester, final FocusRequester focusRequester2, final Function1 function1, final Function1 function2, final Function0 function0, final Function0 function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        long outlineVariant;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1335020466);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(serverConfig) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i5 = i4;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1335020466, i3, i5, "com.dh.myembyapp.ui.components.ServerSortRow (ServerSortDialog.kt:254)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(16.0f));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFocusGroup = FocusableKt.focusGroup(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(42.0f)), Dp.m7813constructorimpl(72.0f));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i7 = MaterialTheme.$stable;
            int i8 = i3;
            Modifier modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(kb0.v(14.0f, modifierM1050height3ABfNKs, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i7).getSurfaceVariant(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i7).getOutlineVariant(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM286borderxT4_qwU);
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextStyle labelLarge = materialTheme.getTypography(composerStartRestartGroup, i7).getLabelLarge();
            long j = u61Var.B;
            FontWeight.Companion companion5 = FontWeight.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, null, j, null, 0L, null, companion5.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, labelLarge, composerStartRestartGroup, (i8 & 14) | 1572864, 0, 131002);
            composerStartRestartGroup.endNode();
            Modifier modifierM274backgroundbw27NRU = BackgroundKt.m274backgroundbw27NRU(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.m7813constructorimpl(72.0f)), z ? u61Var.y : u61Var.w, roundedCornerShapeM1312RoundedCornerShape0680j_4);
            float fM7813constructorimpl = Dp.m7813constructorimpl(1.0f);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1852276568);
                composerStartRestartGroup.endReplaceGroup();
                outlineVariant = Color.m5151copywmQWz5c$default(u61Var.P, 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                composerStartRestartGroup.startReplaceGroup(1852369816);
                outlineVariant = materialTheme.getColorScheme(composerStartRestartGroup, i7).getOutlineVariant();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(BorderKt.m286borderxT4_qwU(modifierM274backgroundbw27NRU, fM7813constructorimpl, outlineVariant, roundedCornerShapeM1312RoundedCornerShape0680j_4), Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(12.0f));
            MeasurePolicy measurePolicyQ = mr.q(12.0f, arrangement, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyQ, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
            lx1.c(serverConfig.getCustomIconPath(), c61.n(serverConfig.getAlias(), " 图标"), SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f)), null, composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierE = zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(2.0f)), companion3.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i11), composerM4318constructorimpl4));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String alias = serverConfig.getAlias();
            TextStyle bodyLarge = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyLarge();
            long j2 = z ? u61Var.P : u61Var.A;
            FontWeight medium = companion5.getMedium();
            TextOverflow.Companion companion6 = TextOverflow.INSTANCE;
            TextKt.m3048TextNvy7gAk(alias, null, j2, null, 0L, null, medium, null, 0L, null, null, 0L, companion6.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyLarge, composerStartRestartGroup, 1572864, 24960, 110522);
            TextStyle bodySmall = materialTheme.getTypography(composerStartRestartGroup, i7).getBodySmall();
            long j3 = u61Var.B;
            int iM7761getEllipsisgIe3tQ8 = companion6.m7761getEllipsisgIe3tQ8();
            int i12 = i8 >> 6;
            TextKt.m3048TextNvy7gAk(str2, null, j3, null, 0L, null, null, null, 0L, null, null, 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, bodySmall, composerStartRestartGroup, i12 & 14, 24960, 110586);
            composerStartRestartGroup.endNode();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1085200473);
                ImageVector check = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                long j4 = u61Var.P;
                companion = companion2;
                IconKt.m2496Iconww6aTOc(check, "当前服务器", SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(18.0f)), j4, composerStartRestartGroup, 432, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                companion = companion2;
                composerStartRestartGroup.startReplaceGroup(-1084966516);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i13 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl5, Integer.valueOf(i13), composerM4318constructorimpl5));
            Icons icons = Icons.INSTANCE;
            int i14 = i8 >> 9;
            int i15 = i8 >> 12;
            a(KeyboardArrowUpKt.getKeyboardArrowUp(icons.getDefault()), kb0.x("上移 ", serverConfig.getAlias()), z2, focusRequester, function1, function0, composerStartRestartGroup, (i12 & 896) | (i14 & 7168) | (i15 & 57344) | ((i5 << 15) & 458752));
            a(KeyboardArrowDownKt.getKeyboardArrowDown(icons.getDefault()), kb0.x("下移 ", serverConfig.getAlias()), z3, focusRequester2, function2, function3, composerStartRestartGroup, (i14 & 896) | (i15 & 7168) | ((i8 >> 15) & 57344) | ((i5 << 12) & 458752));
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: sy1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    xy1.d(str, serverConfig, str2, z, z2, z3, focusRequester, focusRequester2, function1, function2, function0, function3, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
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
    public static final java.lang.Object e(defpackage.yy1 r18, java.util.Map r19, java.util.Map r20, kotlin.jvm.functions.Function0 r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy1.e(yy1, java.util.Map, java.util.Map, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
