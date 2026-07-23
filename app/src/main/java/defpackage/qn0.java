package defpackage;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.ItemCounts;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qn0 {
    public static final void a(ItemCounts itemCounts, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Composer composer, int i) {
        ItemCounts itemCounts2;
        int i2;
        Function0 function4;
        Function0 function5;
        Function0 function6;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-760364776);
        if ((i & 6) == 0) {
            itemCounts2 = itemCounts;
            i2 = (composerStartRestartGroup.changed(itemCounts2) ? 4 : 2) | i;
        } else {
            itemCounts2 = itemCounts;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function4 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        } else {
            function4 = function0;
        }
        if ((i & 3072) == 0) {
            function5 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function5) ? 2048 : 1024;
        } else {
            function5 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function6 = function3;
            i2 |= composerStartRestartGroup.changedInstance(function6) ? 131072 : 65536;
        } else {
            function6 = function3;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760364776, i2, -1, "com.dh.myembyapp.ui.components.HomeMediaMenuDialog (HomeMediaMenuDialog.kt:90)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z2 = (i2 & Input.Keys.FORWARD_DEL) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.m(z, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ji(focusRequester, null, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            Function0 function7 = function5;
            AndroidDialog_androidKt.Dialog(function6, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-1501629855, true, new kn0(mutableState, u61Var, focusRequester, function4, function7, function2, itemCounts2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 15) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ip(itemCounts, z, function0, function1, function2, function3, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, ImageVector imageVector, Modifier modifier, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-817361997);
        int i5 = 4;
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
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
                if (i6 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-817361997, i3, -1, "com.dh.myembyapp.ui.components.HomeMediaMenuRow (HomeMediaMenuDialog.kt:329)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m7813constructorimpl(52.0f));
                ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                long j = u61Var.w;
                long j2 = u61Var.x;
                long j3 = u61Var.A;
                int i7 = ClickableSurfaceDefaults.$stable;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs, null, false, 0.0f, null, clickableSurfaceDefaults.m8292colorsoq7We08(j, j3, j2, j3, 0L, 0L, 0L, 0L, composerStartRestartGroup, i7 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i7 << 15, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-1888480686, true, new ph(imageVector, u61Var, str, i5), composerStartRestartGroup, 54), composer2, (i3 >> 9) & 14, 48, 1084);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new c2(str, imageVector, modifier3, function0, i, i2));
            }
        }
        i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
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
            if (i6 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-817361997, i3, -1, "com.dh.myembyapp.ui.components.HomeMediaMenuRow (HomeMediaMenuDialog.kt:329)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var2 = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m7813constructorimpl(52.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
            long j4 = u61Var2.w;
            long j5 = u61Var2.x;
            long j6 = u61Var2.A;
            int i8 = ClickableSurfaceDefaults.$stable;
            Modifier modifier6 = modifier4;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs2, null, false, 0.0f, null, clickableSurfaceDefaults2.m8292colorsoq7We08(j4, j6, j5, j6, 0L, 0L, 0L, 0L, composerStartRestartGroup, i8 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var2.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i8 << 15, 29), el0.c(u61Var2), null, ComposableLambdaKt.rememberComposableLambda(-1888480686, true, new ph(imageVector, u61Var2, str, i5), composerStartRestartGroup, 54), composer2, (i3 >> 9) & 14, 48, 1084);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c2(str, imageVector, modifier3, function0, i, i2));
        }
    }

    public static final void c(final ItemCounts itemCounts, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-656427186);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(itemCounts) ? 4 : 2) | i : i;
        final int i3 = 0;
        final int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-656427186, i2, -1, "com.dh.myembyapp.ui.components.HomeMediaMenuStatsSection (HomeMediaMenuDialog.kt:176)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (itemCounts == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: nn0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            Composer composer3 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    qn0.c(itemCounts, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                case 1:
                                    qn0.c(itemCounts, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    qn0.c(itemCounts, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            if (itemCounts.getMovieCount() == 0 && itemCounts.getSeriesCount() == 0 && itemCounts.getEpisodeCount() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: nn0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer3 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    qn0.c(itemCounts, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                case 1:
                                    qn0.c(itemCounts, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    qn0.c(itemCounts, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
            Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 13, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default);
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            u61 u61Var2 = u61Var;
            TextKt.m3048TextNvy7gAk("媒体数量", null, u61Var.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelLarge(), composerStartRestartGroup, 6, 0, 131066);
            Composer composer3 = composerStartRestartGroup;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion3.getTop(), composer3, 6);
            int i6 = 0;
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer3);
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer3.startReplaceGroup(-1017804747);
            for (Triple triple : list) {
                String str = (String) triple.component1();
                String str2 = (String) triple.component2();
                long jM5162unboximpl = ((Color) triple.component3()).m5162unboximpl();
                Modifier modifierE = zs1.E(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                u61 u61Var3 = u61Var2;
                Modifier modifierV = kb0.v(16.0f, modifierE, u61Var3.C);
                float fM7813constructorimpl = Dp.m7813constructorimpl(1.0f);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i8 = MaterialTheme.$stable;
                Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(BorderKt.m286borderxT4_qwU(modifierV, fM7813constructorimpl, materialTheme.getColorScheme(composer3, i8).getOutlineVariant(), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(16.0f))), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(10.0f));
                MeasurePolicy measurePolicyP = mr.p(3.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterHorizontally(), composer3, 54);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, i6);
                int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM1000paddingVpY3zN4);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer3);
                mr.z(companion5, composerM4318constructorimpl3, measurePolicyP, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                str.getClass();
                Composer composer4 = composer3;
                TextKt.m3048TextNvy7gAk(str, null, jM5162unboximpl, null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 1597440, 0, 262058);
                TextKt.m3048TextNvy7gAk(str2, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i8).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24576, 0, 262122);
                composer4.endNode();
                composer3 = composer4;
                rowScopeInstance = rowScopeInstance2;
                u61Var2 = u61Var3;
                i6 = 0;
            }
            composer2 = composer3;
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            final int i10 = 2;
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: nn0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i11 = i10;
                    Composer composer5 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i11) {
                        case 0:
                            qn0.c(itemCounts, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        case 1:
                            qn0.c(itemCounts, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            qn0.c(itemCounts, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void d(String str, List list, boolean z, Function1 function1, Function0 function0, Composer composer, int i, int i2) {
        String str2;
        int i3;
        boolean z2;
        Function1 function2;
        Composer composer2;
        String str3;
        list.getClass();
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1262486505);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z2 = z;
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            String str4 = i4 != 0 ? "切换线路" : str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1262486505, i5, -1, "com.dh.myembyapp.ui.components.HomeRouteSwitchDialog (HomeMediaMenuDialog.kt:250)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                tn0 tn0Var = (tn0) CollectionsKt.firstOrNull(list);
                objRememberedValue2 = tn0Var != null ? tn0Var.a : null;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            String str5 = (String) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ji(focusRequester, null, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(str5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            String str6 = str4;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-954526848, true, new ln0(u61Var, str6, list, z2, str5, function2, focusRequester), composerStartRestartGroup, 54), composer2, ((i5 >> 12) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str3 = str6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            str3 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m10(str3, list, z, function1, function0, i, i2));
        }
    }

    public static final void e(tn0 tn0Var, boolean z, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1676762659);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(tn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1676762659, i2, -1, "com.dh.myembyapp.ui.components.HomeRouteSwitchRow (HomeMediaMenuDialog.kt:376)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m7813constructorimpl(58.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            boolean z2 = tn0Var.d;
            long j = z2 ? u61Var.y : u61Var.w;
            long j2 = z2 ? u61Var.z : u61Var.x;
            long j3 = j;
            long j4 = u61Var.A;
            int i3 = ClickableSurfaceDefaults.$stable;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs, null, false, 0.0f, null, clickableSurfaceDefaults.m8292colorsoq7We08(j3, j4, j2, j4, 0L, 0L, 0L, 0L, composerStartRestartGroup, i3 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i3 << 15, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-1429292450, true, new r60(tn0Var, u61Var, z), composerStartRestartGroup, 54), composer2, (i2 >> 9) & 14, 48, 1084);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(tn0Var, z, modifier, function0, i, 4));
        }
    }
}
