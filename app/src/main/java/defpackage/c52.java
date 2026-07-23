package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material.icons.filled.RemoveKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.SubtitlePreferences;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c52 {
    public static final void a(SubtitlePreferences.SubtitleColor subtitleColor, boolean z, Function0 function0, FocusRequester focusRequester, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function1;
        subtitleColor.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1807926861);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(subtitleColor.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function1 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1807926861, i2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleColorButton (SubtitleSettings.kt:851)");
            }
            Modifier modifierThen = SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(36.0f)).then(focusRequester != null ? FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester) : Modifier.INSTANCE);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long jColor = ColorKt.Color(z ? 4282664004L : 4280953386L);
            long jColor2 = ColorKt.Color(4283782485L);
            int i3 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jColor, 0L, jColor2, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, (i3 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
            int i4 = i3 << 15;
            ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(z ? new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null) : Border.INSTANCE.getNone(), new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4 | 48, 28);
            SurfaceKt.m8520Surface05tvjtU(function1, modifierThen, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(6.0f)), null, null, null, null, composerStartRestartGroup, i4, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(778617588, true, new i2(subtitleColor, 18), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 6) & 14, 48, 1564);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el(subtitleColor, z, function0, focusRequester, modifier, i, 4));
        }
    }

    public static final void b(SubtitlePreferences.SubtitleColor subtitleColor, final Function1 function1, FocusRequester focusRequester, Composer composer, int i) {
        subtitleColor.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-190350358);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(subtitleColor.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-190350358, i2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleColorSelector (SubtitleSettings.kt:799)");
            }
            EnumEntries<SubtitlePreferences.SubtitleColor> entries = SubtitlePreferences.SubtitleColor.getEntries();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            int i3 = 32;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1531258888);
            int i6 = 0;
            for (Object obj : CollectionsKt.take(entries, 4)) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final SubtitlePreferences.SubtitleColor subtitleColor2 = (SubtitlePreferences.SubtitleColor) obj;
                boolean z = subtitleColor2 == subtitleColor;
                boolean zChanged = ((i2 & Input.Keys.FORWARD_DEL) == i3) | composerStartRestartGroup.changed(subtitleColor2.ordinal());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final int i8 = 0;
                    objRememberedValue = new Function0() { // from class: t42
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i8) {
                                case 0:
                                    function1.invoke(subtitleColor2);
                                    break;
                                default:
                                    function1.invoke(subtitleColor2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                a(subtitleColor2, z, (Function0) objRememberedValue, i6 == 0 ? focusRequester : null, zs1.E(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                i6 = i7;
                i3 = 32;
            }
            final int i9 = 1;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(422225252);
            for (final SubtitlePreferences.SubtitleColor subtitleColor3 : CollectionsKt.drop(entries, 4)) {
                boolean z2 = subtitleColor3 == subtitleColor;
                boolean zChanged2 = composerStartRestartGroup.changed(subtitleColor3.ordinal()) | ((i2 & Input.Keys.FORWARD_DEL) == 32);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: t42
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    function1.invoke(subtitleColor3);
                                    break;
                                default:
                                    function1.invoke(subtitleColor3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                a(subtitleColor3, z2, (Function0) objRememberedValue2, null, zs1.E(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 3072);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 28, subtitleColor, function1, focusRequester));
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r15v27 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v27 Object, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v27 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v27 Object, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r18v5 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v5 Object, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r7v30 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v30 Object, new type: long
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v27 Object, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void c(kotlin.jvm.functions.Function0 r39, boolean r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function0 r42, boolean r43, kotlin.jvm.functions.Function1 r44, boolean r45, boolean r46, int r47, kotlin.jvm.functions.Function1 r48, kotlin.jvm.functions.Function1 r49, kotlin.jvm.functions.Function0 r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c52.c(kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, boolean, boolean, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x0215  */
    /* JADX WARN: Code duplicated, block: B:143:0x021a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0347  */
    /* JADX WARN: Code duplicated, block: B:150:0x0353  */
    /* JADX WARN: Code duplicated, block: B:151:0x0357  */
    /* JADX WARN: Code duplicated, block: B:154:0x0372  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:158:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:160:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:163:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x011f  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    public static final void e(final float f, final String str, final Function0 function0, final Function0 function1, FocusRequester focusRequester, boolean z, ImageVector imageVector, ImageVector imageVector2, String str2, String str3, Composer composer, final int i, final int i2) {
        int i3;
        FocusRequester focusRequester2;
        int i4;
        boolean z2;
        int i5;
        ImageVector remove;
        ImageVector add;
        int i6;
        String str4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        final FocusRequester focusRequester3;
        final boolean z4;
        final String str5;
        final ImageVector imageVector3;
        final ImageVector imageVector4;
        final String str6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        String str7;
        String str8;
        int i13;
        FocusRequester focusRequester4;
        ImageVector imageVector5;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        Modifier modifierFocusRequester;
        Color.Companion companion2;
        int i14;
        boolean z5;
        Function0<ComposeUiNode> constructor2;
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(834823682);
        if ((i & 48) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i15 = i2 & 16;
        if (i15 == 0) {
            if ((i & 24576) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        remove = imageVector;
                        int i16 = composerStartRestartGroup.changed(remove) ? 1048576 : 524288;
                        i3 |= i16;
                    } else {
                        remove = imageVector;
                    }
                    i3 |= i16;
                } else {
                    remove = imageVector;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        add = imageVector2;
                        int i17 = composerStartRestartGroup.changed(add) ? 8388608 : 4194304;
                        i3 |= i17;
                    } else {
                        add = imageVector2;
                    }
                    i3 |= i17;
                } else {
                    add = imageVector2;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                    str4 = str2;
                    i7 = 16;
                } else {
                    str4 = str2;
                    i7 = 16;
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changed(str4)) {
                            i8 = 67108864;
                        } else {
                            i8 = GroupFlagsKt.HasAuxSlotFlag;
                        }
                        i3 |= i8;
                    }
                }
                i9 = i2 & 512;
                if (i9 != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changed(str3)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i3 |= i10;
                    }
                    i11 = i3;
                    if ((i3 & 306783377) != 306783376) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i15 != 0) {
                                focusRequester2 = null;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 64) != 0) {
                                i12 = i11 & (-3670017);
                                remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                            } else {
                                i12 = i11;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                            }
                            int i18 = i12;
                            if (i6 != 0) {
                                str7 = "减少";
                            } else {
                                str7 = str4;
                            }
                            if (i9 != 0) {
                                str8 = "增加";
                            } else {
                                str8 = str3;
                            }
                            i13 = i18;
                            focusRequester4 = focusRequester2;
                            imageVector5 = add;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            int i19 = (i2 & 64) != 0 ? i11 & (-3670017) : i11;
                            if ((i2 & 128) != 0) {
                                i19 &= -29360129;
                            }
                            str7 = str4;
                            remove = remove;
                            i13 = i19;
                            focusRequester4 = focusRequester2;
                            z2 = z2;
                            imageVector5 = add;
                            str8 = str3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        ImageVector imageVector6 = remove;
                        MeasurePolicy measurePolicyQ = mr.q(12.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        ImageVector imageVector7 = imageVector5;
                        int i20 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
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
                        mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i20), composerM4318constructorimpl));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        boolean z6 = !z2;
                        Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
                        if (focusRequester4 != null) {
                            modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
                        } else {
                            modifierFocusRequester = companion;
                        }
                        Modifier modifierThen = modifierM1064size3ABfNKs.then(modifierFocusRequester);
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        long jColor = ColorKt.Color(4281545523L);
                        long jColor2 = ColorKt.Color(4283782485L);
                        companion2 = Color.INSTANCE;
                        i14 = i13;
                        long jM5189getWhite0d7_KjU = companion2.m5189getWhite0d7_KjU();
                        long jM5189getWhite0d7_KjU2 = companion2.m5189getWhite0d7_KjU();
                        int i21 = ButtonDefaults.$stable;
                        int i22 = (i21 << 24) | 3510;
                        FocusRequester focusRequester5 = focusRequester4;
                        int i23 = (i21 << 15) | 48;
                        String str9 = str8;
                        z5 = z2;
                        String str10 = str7;
                        ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen, null, z6, ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults.m8228colorsoq7We08(jColor, jM5189getWhite0d7_KjU, jColor2, jM5189getWhite0d7_KjU2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i22, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i23, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector6, str10, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                        Modifier modifierV = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i24 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV);
                        constructor2 = companion4.getConstructor();
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
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i24), composerM4318constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z5) {
                            composerStartRestartGroup.startReplaceGroup(-1167455047);
                            TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1167262103);
                            TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endNode();
                        ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z6, ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i22, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i23, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector7, str9, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        imageVector4 = imageVector7;
                        str6 = str9;
                        str5 = str10;
                        focusRequester3 = focusRequester5;
                        z4 = z5;
                        imageVector3 = imageVector6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        focusRequester3 = focusRequester2;
                        z4 = z2;
                        str5 = str4;
                        imageVector3 = remove;
                        imageVector4 = add;
                        str6 = str3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 805306368;
                i11 = i3;
                if ((i3 & 306783377) != 306783376) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            focusRequester2 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 64) != 0) {
                            i12 = i11 & (-3670017);
                            remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                        }
                        int i110 = i12;
                        if (i6 != 0) {
                            str7 = "减少";
                        } else {
                            str7 = str4;
                        }
                        if (i9 != 0) {
                            str8 = "增加";
                        } else {
                            str8 = str3;
                        }
                        i13 = i110;
                        focusRequester4 = focusRequester2;
                        imageVector5 = add;
                    } else {
                        if (i15 != 0) {
                            focusRequester2 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 64) != 0) {
                            i12 = i11 & (-3670017);
                            remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                        }
                        int i111 = i12;
                        if (i6 != 0) {
                            str7 = "减少";
                        } else {
                            str7 = str4;
                        }
                        if (i9 != 0) {
                            str8 = "增加";
                        } else {
                            str8 = str3;
                        }
                        i13 = i111;
                        focusRequester4 = focusRequester2;
                        imageVector5 = add;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    ImageVector imageVector8 = remove;
                    MeasurePolicy measurePolicyQ2 = mr.q(12.0f, Arrangement.INSTANCE, companion5.getCenterVertically(), composerStartRestartGroup, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    ImageVector imageVector9 = imageVector5;
                    int i25 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyQ2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i25), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    boolean z7 = !z2;
                    Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
                    if (focusRequester4 != null) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
                    } else {
                        modifierFocusRequester = companion;
                    }
                    Modifier modifierThen2 = modifierM1064size3ABfNKs2.then(modifierFocusRequester);
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    long jColor3 = ColorKt.Color(4281545523L);
                    long jColor4 = ColorKt.Color(4283782485L);
                    companion2 = Color.INSTANCE;
                    i14 = i13;
                    long jM5189getWhite0d7_KjU3 = companion2.m5189getWhite0d7_KjU();
                    long jM5189getWhite0d7_KjU4 = companion2.m5189getWhite0d7_KjU();
                    int i26 = ButtonDefaults.$stable;
                    int i27 = (i26 << 24) | 3510;
                    FocusRequester focusRequester6 = focusRequester4;
                    int i28 = (i26 << 15) | 48;
                    String str11 = str8;
                    z5 = z2;
                    String str12 = str7;
                    ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen2, null, z7, ButtonDefaults.scale$default(buttonDefaults2, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults2, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults2.m8228colorsoq7We08(jColor3, jM5189getWhite0d7_KjU3, jColor4, jM5189getWhite0d7_KjU4, 0L, 0L, 0L, 0L, composerStartRestartGroup, i27, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i28, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector8, str12, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    Modifier modifierV2 = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i29 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV2);
                    constructor2 = companion6.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i29), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(-1167455047);
                        TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1167262103);
                        TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z7, ButtonDefaults.scale$default(buttonDefaults2, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults2, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults2.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i27, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i28, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector9, str11, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    imageVector4 = imageVector9;
                    str6 = str11;
                    str5 = str12;
                    focusRequester3 = focusRequester6;
                    z4 = z5;
                    imageVector3 = imageVector8;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    focusRequester3 = focusRequester2;
                    z4 = z2;
                    str5 = str4;
                    imageVector3 = remove;
                    imageVector4 = add;
                    str6 = str3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    remove = imageVector;
                    if (composerStartRestartGroup.changed(remove)) {
                    }
                    i3 |= i16;
                } else {
                    remove = imageVector;
                }
                i3 |= i16;
            } else {
                remove = imageVector;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    add = imageVector2;
                    if (composerStartRestartGroup.changed(add)) {
                    }
                    i3 |= i17;
                } else {
                    add = imageVector2;
                }
                i3 |= i17;
            } else {
                add = imageVector2;
            }
            i6 = i2 & 256;
            if (i6 != 0) {
                i3 |= 100663296;
                str4 = str2;
                i7 = 16;
            } else {
                str4 = str2;
                i7 = 16;
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(str4)) {
                        i8 = 67108864;
                    } else {
                        i8 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i3 |= i8;
                }
            }
            i9 = i2 & 512;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                i11 = i3;
                if ((i3 & 306783377) != 306783376) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            focusRequester2 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 64) != 0) {
                            i12 = i11 & (-3670017);
                            remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                        }
                        int i112 = i12;
                        if (i6 != 0) {
                            str7 = "减少";
                        } else {
                            str7 = str4;
                        }
                        if (i9 != 0) {
                            str8 = "增加";
                        } else {
                            str8 = str3;
                        }
                        i13 = i112;
                        focusRequester4 = focusRequester2;
                        imageVector5 = add;
                    } else {
                        if (i15 != 0) {
                            focusRequester2 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 64) != 0) {
                            i12 = i11 & (-3670017);
                            remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                        }
                        int i113 = i12;
                        if (i6 != 0) {
                            str7 = "减少";
                        } else {
                            str7 = str4;
                        }
                        if (i9 != 0) {
                            str8 = "增加";
                        } else {
                            str8 = str3;
                        }
                        i13 = i113;
                        focusRequester4 = focusRequester2;
                        imageVector5 = add;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    ImageVector imageVector10 = remove;
                    MeasurePolicy measurePolicyQ3 = mr.q(12.0f, Arrangement.INSTANCE, companion7.getCenterVertically(), composerStartRestartGroup, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    ImageVector imageVector11 = imageVector5;
                    int i210 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    constructor = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion8, composerM4318constructorimpl5, measurePolicyQ3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i210), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    boolean z8 = !z2;
                    Modifier modifierM1064size3ABfNKs3 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
                    if (focusRequester4 != null) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
                    } else {
                        modifierFocusRequester = companion;
                    }
                    Modifier modifierThen3 = modifierM1064size3ABfNKs3.then(modifierFocusRequester);
                    ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                    long jColor5 = ColorKt.Color(4281545523L);
                    long jColor6 = ColorKt.Color(4283782485L);
                    companion2 = Color.INSTANCE;
                    i14 = i13;
                    long jM5189getWhite0d7_KjU5 = companion2.m5189getWhite0d7_KjU();
                    long jM5189getWhite0d7_KjU6 = companion2.m5189getWhite0d7_KjU();
                    int i211 = ButtonDefaults.$stable;
                    int i212 = (i211 << 24) | 3510;
                    FocusRequester focusRequester7 = focusRequester4;
                    int i213 = (i211 << 15) | 48;
                    String str13 = str8;
                    z5 = z2;
                    String str14 = str7;
                    ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen3, null, z8, ButtonDefaults.scale$default(buttonDefaults3, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults3, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults3.m8228colorsoq7We08(jColor5, jM5189getWhite0d7_KjU5, jColor6, jM5189getWhite0d7_KjU6, 0L, 0L, 0L, 0L, composerStartRestartGroup, i212, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults3.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i213, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector10, str14, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    Modifier modifierV3 = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i214 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV3);
                    constructor2 = companion8.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion8, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl6, Integer.valueOf(i214), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(-1167455047);
                        TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1167262103);
                        TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z8, ButtonDefaults.scale$default(buttonDefaults3, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults3, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults3.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i212, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults3.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i213, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector11, str13, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    imageVector4 = imageVector11;
                    str6 = str13;
                    str5 = str14;
                    focusRequester3 = focusRequester7;
                    z4 = z5;
                    imageVector3 = imageVector10;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    focusRequester3 = focusRequester2;
                    z4 = z2;
                    str5 = str4;
                    imageVector3 = remove;
                    imageVector4 = add;
                    str6 = str3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 805306368;
            i11 = i3;
            if ((i3 & 306783377) != 306783376) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        focusRequester2 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 64) != 0) {
                        i12 = i11 & (-3670017);
                        remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    }
                    int i114 = i12;
                    if (i6 != 0) {
                        str7 = "减少";
                    } else {
                        str7 = str4;
                    }
                    if (i9 != 0) {
                        str8 = "增加";
                    } else {
                        str8 = str3;
                    }
                    i13 = i114;
                    focusRequester4 = focusRequester2;
                    imageVector5 = add;
                } else {
                    if (i15 != 0) {
                        focusRequester2 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 64) != 0) {
                        i12 = i11 & (-3670017);
                        remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    }
                    int i115 = i12;
                    if (i6 != 0) {
                        str7 = "减少";
                    } else {
                        str7 = str4;
                    }
                    if (i9 != 0) {
                        str8 = "增加";
                    } else {
                        str8 = str3;
                    }
                    i13 = i115;
                    focusRequester4 = focusRequester2;
                    imageVector5 = add;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Companion companion9 = Alignment.INSTANCE;
                ImageVector imageVector12 = remove;
                MeasurePolicy measurePolicyQ4 = mr.q(12.0f, Arrangement.INSTANCE, companion9.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                ImageVector imageVector13 = imageVector5;
                int i215 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default4);
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion10, composerM4318constructorimpl7, measurePolicyQ4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl7, Integer.valueOf(i215), composerM4318constructorimpl7));
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                boolean z9 = !z2;
                Modifier modifierM1064size3ABfNKs4 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
                } else {
                    modifierFocusRequester = companion;
                }
                Modifier modifierThen4 = modifierM1064size3ABfNKs4.then(modifierFocusRequester);
                ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
                long jColor7 = ColorKt.Color(4281545523L);
                long jColor8 = ColorKt.Color(4283782485L);
                companion2 = Color.INSTANCE;
                i14 = i13;
                long jM5189getWhite0d7_KjU7 = companion2.m5189getWhite0d7_KjU();
                long jM5189getWhite0d7_KjU8 = companion2.m5189getWhite0d7_KjU();
                int i216 = ButtonDefaults.$stable;
                int i217 = (i216 << 24) | 3510;
                FocusRequester focusRequester8 = focusRequester4;
                int i218 = (i216 << 15) | 48;
                String str15 = str8;
                z5 = z2;
                String str16 = str7;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen4, null, z9, ButtonDefaults.scale$default(buttonDefaults4, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults4, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults4.m8228colorsoq7We08(jColor7, jM5189getWhite0d7_KjU7, jColor8, jM5189getWhite0d7_KjU8, 0L, 0L, 0L, 0L, composerStartRestartGroup, i217, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults4.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i218, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector12, str16, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                Modifier modifierV4 = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getCenter(), false);
                long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i219 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV4);
                constructor2 = companion10.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion10, composerM4318constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl8, currentCompositionLocalMap8);
                Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl8, Integer.valueOf(i219), composerM4318constructorimpl8));
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(-1167455047);
                    TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1167262103);
                    TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z9, ButtonDefaults.scale$default(buttonDefaults4, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults4, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults4.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i217, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults4.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i218, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector13, str15, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                imageVector4 = imageVector13;
                str6 = str15;
                str5 = str16;
                focusRequester3 = focusRequester8;
                z4 = z5;
                imageVector3 = imageVector12;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
                z4 = z2;
                str5 = str4;
                imageVector3 = remove;
                imageVector4 = add;
                str6 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        focusRequester2 = focusRequester;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    remove = imageVector;
                    if (composerStartRestartGroup.changed(remove)) {
                    }
                    i3 |= i16;
                } else {
                    remove = imageVector;
                }
                i3 |= i16;
            } else {
                remove = imageVector;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    add = imageVector2;
                    if (composerStartRestartGroup.changed(add)) {
                    }
                    i3 |= i17;
                } else {
                    add = imageVector2;
                }
                i3 |= i17;
            } else {
                add = imageVector2;
            }
            i6 = i2 & 256;
            if (i6 != 0) {
                i3 |= 100663296;
                str4 = str2;
                i7 = 16;
            } else {
                str4 = str2;
                i7 = 16;
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changed(str4)) {
                        i8 = 67108864;
                    } else {
                        i8 = GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i3 |= i8;
                }
            }
            i9 = i2 & 512;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                i11 = i3;
                if ((i3 & 306783377) != 306783376) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            focusRequester2 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 64) != 0) {
                            i12 = i11 & (-3670017);
                            remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                        }
                        int i116 = i12;
                        if (i6 != 0) {
                            str7 = "减少";
                        } else {
                            str7 = str4;
                        }
                        if (i9 != 0) {
                            str8 = "增加";
                        } else {
                            str8 = str3;
                        }
                        i13 = i116;
                        focusRequester4 = focusRequester2;
                        imageVector5 = add;
                    } else {
                        if (i15 != 0) {
                            focusRequester2 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 64) != 0) {
                            i12 = i11 & (-3670017);
                            remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                        } else {
                            i12 = i11;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                        }
                        int i117 = i12;
                        if (i6 != 0) {
                            str7 = "减少";
                        } else {
                            str7 = str4;
                        }
                        if (i9 != 0) {
                            str8 = "增加";
                        } else {
                            str8 = str3;
                        }
                        i13 = i117;
                        focusRequester4 = focusRequester2;
                        imageVector5 = add;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    ImageVector imageVector14 = remove;
                    MeasurePolicy measurePolicyQ5 = mr.q(12.0f, Arrangement.INSTANCE, companion11.getCenterVertically(), composerStartRestartGroup, 54);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    ImageVector imageVector15 = imageVector5;
                    int i2110 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion12, composerM4318constructorimpl9, measurePolicyQ5, composerM4318constructorimpl9, currentCompositionLocalMap9);
                    Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion12, composerM4318constructorimpl9, Integer.valueOf(i2110), composerM4318constructorimpl9));
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    boolean z10 = !z2;
                    Modifier modifierM1064size3ABfNKs5 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
                    if (focusRequester4 != null) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
                    } else {
                        modifierFocusRequester = companion;
                    }
                    Modifier modifierThen5 = modifierM1064size3ABfNKs5.then(modifierFocusRequester);
                    ButtonDefaults buttonDefaults5 = ButtonDefaults.INSTANCE;
                    long jColor9 = ColorKt.Color(4281545523L);
                    long jColor10 = ColorKt.Color(4283782485L);
                    companion2 = Color.INSTANCE;
                    i14 = i13;
                    long jM5189getWhite0d7_KjU9 = companion2.m5189getWhite0d7_KjU();
                    long jM5189getWhite0d7_KjU10 = companion2.m5189getWhite0d7_KjU();
                    int i2111 = ButtonDefaults.$stable;
                    int i2112 = (i2111 << 24) | 3510;
                    FocusRequester focusRequester9 = focusRequester4;
                    int i2113 = (i2111 << 15) | 48;
                    String str17 = str8;
                    z5 = z2;
                    String str18 = str7;
                    ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen5, null, z10, ButtonDefaults.scale$default(buttonDefaults5, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults5, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults5.m8228colorsoq7We08(jColor9, jM5189getWhite0d7_KjU9, jColor10, jM5189getWhite0d7_KjU10, 0L, 0L, 0L, 0L, composerStartRestartGroup, i2112, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults5.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i2113, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector14, str18, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    Modifier modifierV5 = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance5, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion11.getCenter(), false);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i2114 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV5);
                    constructor2 = companion12.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion12, composerM4318constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl10, currentCompositionLocalMap10);
                    Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion12, composerM4318constructorimpl10, Integer.valueOf(i2114), composerM4318constructorimpl10));
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(-1167455047);
                        TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1167262103);
                        TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z10, ButtonDefaults.scale$default(buttonDefaults5, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults5, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults5.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i2112, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults5.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i2113, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector15, str17, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    imageVector4 = imageVector15;
                    str6 = str17;
                    str5 = str18;
                    focusRequester3 = focusRequester9;
                    z4 = z5;
                    imageVector3 = imageVector14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    focusRequester3 = focusRequester2;
                    z4 = z2;
                    str5 = str4;
                    imageVector3 = remove;
                    imageVector4 = add;
                    str6 = str3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 805306368;
            i11 = i3;
            if ((i3 & 306783377) != 306783376) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        focusRequester2 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 64) != 0) {
                        i12 = i11 & (-3670017);
                        remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    }
                    int i118 = i12;
                    if (i6 != 0) {
                        str7 = "减少";
                    } else {
                        str7 = str4;
                    }
                    if (i9 != 0) {
                        str8 = "增加";
                    } else {
                        str8 = str3;
                    }
                    i13 = i118;
                    focusRequester4 = focusRequester2;
                    imageVector5 = add;
                } else {
                    if (i15 != 0) {
                        focusRequester2 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 64) != 0) {
                        i12 = i11 & (-3670017);
                        remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    }
                    int i119 = i12;
                    if (i6 != 0) {
                        str7 = "减少";
                    } else {
                        str7 = str4;
                    }
                    if (i9 != 0) {
                        str8 = "增加";
                    } else {
                        str8 = str3;
                    }
                    i13 = i119;
                    focusRequester4 = focusRequester2;
                    imageVector5 = add;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Companion companion13 = Alignment.INSTANCE;
                ImageVector imageVector16 = remove;
                MeasurePolicy measurePolicyQ6 = mr.q(12.0f, Arrangement.INSTANCE, companion13.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                ImageVector imageVector17 = imageVector5;
                int i2115 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default6);
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion14, composerM4318constructorimpl11, measurePolicyQ6, composerM4318constructorimpl11, currentCompositionLocalMap11);
                Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl11, Integer.valueOf(i2115), composerM4318constructorimpl11));
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                boolean z11 = !z2;
                Modifier modifierM1064size3ABfNKs6 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
                } else {
                    modifierFocusRequester = companion;
                }
                Modifier modifierThen6 = modifierM1064size3ABfNKs6.then(modifierFocusRequester);
                ButtonDefaults buttonDefaults6 = ButtonDefaults.INSTANCE;
                long jColor11 = ColorKt.Color(4281545523L);
                long jColor12 = ColorKt.Color(4283782485L);
                companion2 = Color.INSTANCE;
                i14 = i13;
                long jM5189getWhite0d7_KjU11 = companion2.m5189getWhite0d7_KjU();
                long jM5189getWhite0d7_KjU12 = companion2.m5189getWhite0d7_KjU();
                int i2116 = ButtonDefaults.$stable;
                int i2117 = (i2116 << 24) | 3510;
                FocusRequester focusRequester10 = focusRequester4;
                int i2118 = (i2116 << 15) | 48;
                String str19 = str8;
                z5 = z2;
                String str110 = str7;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen6, null, z11, ButtonDefaults.scale$default(buttonDefaults6, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults6, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults6.m8228colorsoq7We08(jColor11, jM5189getWhite0d7_KjU11, jColor12, jM5189getWhite0d7_KjU12, 0L, 0L, 0L, 0L, composerStartRestartGroup, i2117, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults6.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i2118, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector16, str110, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                Modifier modifierV6 = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance6, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion13.getCenter(), false);
                long currentCompositeKeyHashCode12 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i2119 = (int) (currentCompositeKeyHashCode12 ^ (currentCompositeKeyHashCode12 >>> 32));
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV6);
                constructor2 = companion14.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl12 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion14, composerM4318constructorimpl12, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM4318constructorimpl12, currentCompositionLocalMap12);
                Updater.m4326setimpl(composerM4318constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl12, Integer.valueOf(i2119), composerM4318constructorimpl12));
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(-1167455047);
                    TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1167262103);
                    TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z11, ButtonDefaults.scale$default(buttonDefaults6, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults6, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults6.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i2117, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults6.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i2118, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector17, str19, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                imageVector4 = imageVector17;
                str6 = str19;
                str5 = str110;
                focusRequester3 = focusRequester10;
                z4 = z5;
                imageVector3 = imageVector16;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
                z4 = z2;
                str5 = str4;
                imageVector3 = remove;
                imageVector4 = add;
                str6 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                remove = imageVector;
                if (composerStartRestartGroup.changed(remove)) {
                }
                i3 |= i16;
            } else {
                remove = imageVector;
            }
            i3 |= i16;
        } else {
            remove = imageVector;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                add = imageVector2;
                if (composerStartRestartGroup.changed(add)) {
                }
                i3 |= i17;
            } else {
                add = imageVector2;
            }
            i3 |= i17;
        } else {
            add = imageVector2;
        }
        i6 = i2 & 256;
        if (i6 != 0) {
            i3 |= 100663296;
            str4 = str2;
            i7 = 16;
        } else {
            str4 = str2;
            i7 = 16;
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changed(str4)) {
                    i8 = 67108864;
                } else {
                    i8 = GroupFlagsKt.HasAuxSlotFlag;
                }
                i3 |= i8;
            }
        }
        i9 = i2 & 512;
        if (i9 != 0) {
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changed(str3)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            i11 = i3;
            if ((i3 & 306783377) != 306783376) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        focusRequester2 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 64) != 0) {
                        i12 = i11 & (-3670017);
                        remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    }
                    int i1110 = i12;
                    if (i6 != 0) {
                        str7 = "减少";
                    } else {
                        str7 = str4;
                    }
                    if (i9 != 0) {
                        str8 = "增加";
                    } else {
                        str8 = str3;
                    }
                    i13 = i1110;
                    focusRequester4 = focusRequester2;
                    imageVector5 = add;
                } else {
                    if (i15 != 0) {
                        focusRequester2 = null;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 64) != 0) {
                        i12 = i11 & (-3670017);
                        remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                    } else {
                        i12 = i11;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    }
                    int i1111 = i12;
                    if (i6 != 0) {
                        str7 = "减少";
                    } else {
                        str7 = str4;
                    }
                    if (i9 != 0) {
                        str8 = "增加";
                    } else {
                        str8 = str3;
                    }
                    i13 = i1111;
                    focusRequester4 = focusRequester2;
                    imageVector5 = add;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Companion companion15 = Alignment.INSTANCE;
                ImageVector imageVector18 = remove;
                MeasurePolicy measurePolicyQ7 = mr.q(12.0f, Arrangement.INSTANCE, companion15.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode13 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                ImageVector imageVector19 = imageVector5;
                int i21110 = (int) (currentCompositeKeyHashCode13 ^ (currentCompositeKeyHashCode13 >>> 32));
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default7);
                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                constructor = companion16.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl13 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion16, composerM4318constructorimpl13, measurePolicyQ7, composerM4318constructorimpl13, currentCompositionLocalMap13);
                Updater.m4326setimpl(composerM4318constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) id.h(companion16, composerM4318constructorimpl13, Integer.valueOf(i21110), composerM4318constructorimpl13));
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                boolean z12 = !z2;
                Modifier modifierM1064size3ABfNKs7 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
                } else {
                    modifierFocusRequester = companion;
                }
                Modifier modifierThen7 = modifierM1064size3ABfNKs7.then(modifierFocusRequester);
                ButtonDefaults buttonDefaults7 = ButtonDefaults.INSTANCE;
                long jColor13 = ColorKt.Color(4281545523L);
                long jColor14 = ColorKt.Color(4283782485L);
                companion2 = Color.INSTANCE;
                i14 = i13;
                long jM5189getWhite0d7_KjU13 = companion2.m5189getWhite0d7_KjU();
                long jM5189getWhite0d7_KjU14 = companion2.m5189getWhite0d7_KjU();
                int i21111 = ButtonDefaults.$stable;
                int i21112 = (i21111 << 24) | 3510;
                FocusRequester focusRequester11 = focusRequester4;
                int i21113 = (i21111 << 15) | 48;
                String str111 = str8;
                z5 = z2;
                String str112 = str7;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen7, null, z12, ButtonDefaults.scale$default(buttonDefaults7, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults7, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults7.m8228colorsoq7We08(jColor13, jM5189getWhite0d7_KjU13, jColor14, jM5189getWhite0d7_KjU14, 0L, 0L, 0L, 0L, composerStartRestartGroup, i21112, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults7.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i21113, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector18, str112, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                Modifier modifierV7 = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance7, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion15.getCenter(), false);
                long currentCompositeKeyHashCode14 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i21114 = (int) (currentCompositeKeyHashCode14 ^ (currentCompositeKeyHashCode14 >>> 32));
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV7);
                constructor2 = companion16.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl14 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion16, composerM4318constructorimpl14, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM4318constructorimpl14, currentCompositionLocalMap14);
                Updater.m4326setimpl(composerM4318constructorimpl14, modifierMaterializeModifier14, (Function2<? super T, ? super Modifier, Unit>) id.h(companion16, composerM4318constructorimpl14, Integer.valueOf(i21114), composerM4318constructorimpl14));
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(-1167455047);
                    TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1167262103);
                    TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z12, ButtonDefaults.scale$default(buttonDefaults7, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults7, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults7.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i21112, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults7.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i21113, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector19, str111, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                imageVector4 = imageVector19;
                str6 = str111;
                str5 = str112;
                focusRequester3 = focusRequester11;
                z4 = z5;
                imageVector3 = imageVector18;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
                z4 = z2;
                str5 = str4;
                imageVector3 = remove;
                imageVector4 = add;
                str6 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 805306368;
        i11 = i3;
        if ((i3 & 306783377) != 306783376) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i11 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    focusRequester2 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 64) != 0) {
                    i12 = i11 & (-3670017);
                    remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                } else {
                    i12 = i11;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                    add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                }
                int i1112 = i12;
                if (i6 != 0) {
                    str7 = "减少";
                } else {
                    str7 = str4;
                }
                if (i9 != 0) {
                    str8 = "增加";
                } else {
                    str8 = str3;
                }
                i13 = i1112;
                focusRequester4 = focusRequester2;
                imageVector5 = add;
            } else {
                if (i15 != 0) {
                    focusRequester2 = null;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 64) != 0) {
                    i12 = i11 & (-3670017);
                    remove = RemoveKt.getRemove(Icons.INSTANCE.getDefault());
                } else {
                    i12 = i11;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                    add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                }
                int i1113 = i12;
                if (i6 != 0) {
                    str7 = "减少";
                } else {
                    str7 = str4;
                }
                if (i9 != 0) {
                    str8 = "增加";
                } else {
                    str8 = str3;
                }
                i13 = i1113;
                focusRequester4 = focusRequester2;
                imageVector5 = add;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(834823682, i13, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingSliderTv (SubtitleSettings.kt:695)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Companion companion17 = Alignment.INSTANCE;
            ImageVector imageVector110 = remove;
            MeasurePolicy measurePolicyQ8 = mr.q(12.0f, Arrangement.INSTANCE, companion17.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode15 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            ImageVector imageVector111 = imageVector5;
            int i21115 = (int) (currentCompositeKeyHashCode15 ^ (currentCompositeKeyHashCode15 >>> 32));
            CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default8);
            ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
            constructor = companion18.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl15 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion18, composerM4318constructorimpl15, measurePolicyQ8, composerM4318constructorimpl15, currentCompositionLocalMap15);
            Updater.m4326setimpl(composerM4318constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) id.h(companion18, composerM4318constructorimpl15, Integer.valueOf(i21115), composerM4318constructorimpl15));
            RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
            boolean z13 = !z2;
            Modifier modifierM1064size3ABfNKs8 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f));
            if (focusRequester4 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester4);
            } else {
                modifierFocusRequester = companion;
            }
            Modifier modifierThen8 = modifierM1064size3ABfNKs8.then(modifierFocusRequester);
            ButtonDefaults buttonDefaults8 = ButtonDefaults.INSTANCE;
            long jColor15 = ColorKt.Color(4281545523L);
            long jColor16 = ColorKt.Color(4283782485L);
            companion2 = Color.INSTANCE;
            i14 = i13;
            long jM5189getWhite0d7_KjU15 = companion2.m5189getWhite0d7_KjU();
            long jM5189getWhite0d7_KjU16 = companion2.m5189getWhite0d7_KjU();
            int i21116 = ButtonDefaults.$stable;
            int i21117 = (i21116 << 24) | 3510;
            FocusRequester focusRequester12 = focusRequester4;
            int i21118 = (i21116 << 15) | 48;
            String str113 = str8;
            z5 = z2;
            String str114 = str7;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierThen8, null, z13, ButtonDefaults.scale$default(buttonDefaults8, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults8, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults8.m8228colorsoq7We08(jColor15, jM5189getWhite0d7_KjU15, jColor16, jM5189getWhite0d7_KjU16, 0L, 0L, 0L, 0L, composerStartRestartGroup, i21117, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults8.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i21118, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-554993578, true, new jy0(imageVector110, str114, 2), composerStartRestartGroup, 54), composerStartRestartGroup, (i14 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
            Modifier modifierV8 = kb0.v(22.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance8, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4281545523L));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion17.getCenter(), false);
            long currentCompositeKeyHashCode16 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i21119 = (int) (currentCompositeKeyHashCode16 ^ (currentCompositeKeyHashCode16 >>> 32));
            CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV8);
            constructor2 = companion18.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl16 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion18, composerM4318constructorimpl16, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM4318constructorimpl16, currentCompositionLocalMap16);
            Updater.m4326setimpl(composerM4318constructorimpl16, modifierMaterializeModifier16, (Function2<? super T, ? super Modifier, Unit>) id.h(companion18, composerM4318constructorimpl16, Integer.valueOf(i21119), composerM4318constructorimpl16));
            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
            if (z5) {
                composerStartRestartGroup.startReplaceGroup(-1167455047);
                TextKt.m3048TextNvy7gAk("应用中...", null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24966, 0, 262122);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1167262103);
                TextKt.m3048TextNvy7gAk(str, null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(i7), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, ((i14 >> 3) & 14) | 24960, 0, 262122);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            ButtonKt.m8231ButtonTCVpFMg(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), null, z13, ButtonDefaults.scale$default(buttonDefaults8, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 29, null), null, ButtonDefaults.shape$default(buttonDefaults8, RoundedCornerShapeKt.getCircleShape(), null, null, null, null, 30, null), buttonDefaults8.m8228colorsoq7We08(ColorKt.Color(4281545523L), companion2.m5189getWhite0d7_KjU(), ColorKt.Color(4283782485L), companion2.m5189getWhite0d7_KjU(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i21117, PsExtractor.VIDEO_STREAM_MASK), 0.0f, buttonDefaults8.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i21118, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1939602739, true, new jy0(imageVector111, str113, 3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 9) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3364);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            imageVector4 = imageVector111;
            str6 = str113;
            str5 = str114;
            focusRequester3 = focusRequester12;
            z4 = z5;
            imageVector3 = imageVector110;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            focusRequester3 = focusRequester2;
            z4 = z2;
            str5 = str4;
            imageVector3 = remove;
            imageVector4 = add;
            str6 = str3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: v42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c52.e(f, str, function0, function1, focusRequester3, z4, imageVector3, imageVector4, str5, str6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void f(boolean z, Function1 function1, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1702837372);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed("图形字幕亮度增强（全局）") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1702837372, i2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingToggleButton (SubtitleSettings.kt:634)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b42(2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue2);
            if (focusRequester != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester);
            }
            Modifier modifierThen = modifierOnFocusChanged.then(modifierFocusRequester);
            ButtonColors buttonColorsP = hc2.p(true, composerStartRestartGroup, 6, 0);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
            int i3 = i2;
            boolean z2 = false;
            ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, (ButtonDefaults.$stable << 15) | 48, 29);
            boolean z3 = (i3 & 896) == 256;
            if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new jp(11, z, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue3, modifierThen, null, false, buttonScaleScale$default, null, null, buttonColorsP, 0.0f, buttonBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-2071984780, true, new i50(z, mutableState, 3), composerStartRestartGroup, 54), composerStartRestartGroup, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3436);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kw0(z, function1, focusRequester, i, 4));
        }
    }

    public static final void g(final float f, final float f2, final int i, final int i2, final int i3, final boolean z, final SubtitlePreferences.SubtitleColor subtitleColor, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function1 function5, final Function1 function6, final Function0 function0, final Function0 function7, final Function0 function8, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        float f3;
        int i8;
        boolean z7;
        boolean z8;
        int i9;
        Function1 function9;
        int i10;
        subtitleColor.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function0.getClass();
        function7.getClass();
        function8.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-847499203);
        if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            f3 = f2;
            i7 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
        } else {
            f3 = f2;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i8 = i2;
            i7 |= composerStartRestartGroup.changed(i8) ? 2048 : 1024;
        } else {
            i8 = i2;
        }
        if ((i4 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            z7 = z;
            i7 |= composerStartRestartGroup.changed(z7) ? 131072 : 65536;
        } else {
            z7 = z;
        }
        if ((i4 & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changed(subtitleColor.ordinal()) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i7 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        int i11 = i4 & 100663296;
        int i12 = GroupFlagsKt.HasAuxSlotFlag;
        if (i11 == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= composerStartRestartGroup.changed(z4) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            z8 = z5;
            i9 = i5 | (composerStartRestartGroup.changed(z8) ? 4 : 2);
        } else {
            z8 = z5;
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function9 = function1;
            i9 |= composerStartRestartGroup.changedInstance(function9) ? 256 : 128;
        } else {
            function9 = function1;
        }
        if ((i5 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function5) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function6) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i12 = 67108864;
            }
            i9 |= i12;
        }
        if ((i5 & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function7) ? 536870912 : 268435456;
        }
        int i13 = i9;
        if ((i6 & 6) == 0) {
            i10 = i6 | (composerStartRestartGroup.changedInstance(function8) ? 4 : 2);
        } else {
            i10 = i6;
        }
        if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i10 & 3) == 2) ? false : true, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-847499203, i7, i13, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog (SubtitleSettings.kt:305)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            final boolean z9 = z2 && z3;
            final boolean z10 = !z4;
            final int iNormalizeBitmapSubtitleBrightness = SubtitlePreferences.INSTANCE.normalizeBitmapSubtitleBrightness(i3);
            final int i14 = i8;
            final Function1 function10 = function9;
            final float f4 = f3;
            final boolean z11 = z7;
            final boolean z12 = z8;
            AndroidDialog_androidKt.Dialog(function8, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(503055622, true, new Function2() { // from class: w42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(503055622, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous> (SubtitleSettings.kt:323)");
                        }
                        ViewParent parent = ((View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView())).getParent();
                        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
                        Window window = dialogWindowProvider != null ? dialogWindowProvider.getWindow() : null;
                        boolean zChangedInstance = composer2.changedInstance(window);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new c71(window, 27);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        EffectsKt.SideEffect((Function0) objRememberedValue2, composer2, 0);
                        Unit unit = Unit.INSTANCE;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        Object empty = companion.getEmpty();
                        final FocusRequester focusRequester2 = focusRequester;
                        if (objRememberedValue3 == empty) {
                            objRememberedValue3 = new b52(focusRequester2, null);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 6);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterEnd(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i15 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer2);
                        mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i15), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(BackgroundKt.m274backgroundbw27NRU(PaddingKt.m1003paddingqDBjuR0$default(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(320.0f)), 0.0f, Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), 1, null), tg1.a, tg1.b), Dp.m7813constructorimpl(20.0f));
                        final boolean z13 = z9;
                        boolean zChanged = composer2.changed(z13);
                        final float f5 = f;
                        boolean zChanged2 = zChanged | composer2.changed(f5);
                        final Function1 function11 = function6;
                        boolean zChanged3 = zChanged2 | composer2.changed(function11);
                        final boolean z14 = z6;
                        boolean zChanged4 = zChanged3 | composer2.changed(z14);
                        final float f6 = f;
                        boolean zChanged5 = zChanged4 | composer2.changed(f6);
                        final float f7 = f4;
                        boolean zChanged6 = zChanged5 | composer2.changed(f7);
                        final Function0 function12 = function0;
                        boolean zChanged7 = zChanged6 | composer2.changed(function12);
                        final boolean z15 = z10;
                        boolean zChanged8 = zChanged7 | composer2.changed(z15);
                        final SubtitlePreferences.SubtitleColor subtitleColor2 = subtitleColor;
                        boolean zChanged9 = zChanged8 | composer2.changed(subtitleColor2.ordinal());
                        final Function1 function13 = function5;
                        boolean zChanged10 = zChanged9 | composer2.changed(function13);
                        final boolean z16 = z12;
                        boolean zChanged11 = zChanged10 | composer2.changed(z16);
                        final boolean z17 = z11;
                        boolean zChanged12 = zChanged11 | composer2.changed(z17);
                        final Function1 function14 = function4;
                        boolean zChanged13 = zChanged12 | composer2.changed(function14);
                        final int i16 = iNormalizeBitmapSubtitleBrightness;
                        boolean zChanged14 = zChanged13 | composer2.changed(i16);
                        final Function1 function15 = function3;
                        boolean zChanged15 = zChanged14 | composer2.changed(function15);
                        final int i17 = i;
                        boolean zChanged16 = zChanged15 | composer2.changed(i17);
                        final Function1 function16 = function10;
                        boolean zChanged17 = zChanged16 | composer2.changed(function16);
                        final int i18 = i14;
                        boolean zChanged18 = zChanged17 | composer2.changed(i18);
                        final Function1 function17 = function2;
                        boolean zChanged19 = zChanged18 | composer2.changed(function17);
                        final Function0 function18 = function7;
                        boolean zChanged20 = zChanged19 | composer2.changed(function18);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged20 || objRememberedValue4 == companion.getEmpty()) {
                            Function1 function19 = new Function1() { // from class: y42
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    boolean z18;
                                    LazyListScope lazyListScope = (LazyListScope) obj3;
                                    lazyListScope.getClass();
                                    d.a(lazyListScope, null, null, ut.a, 3, null);
                                    final boolean z19 = z13;
                                    final FocusRequester focusRequester3 = focusRequester2;
                                    final boolean z20 = z14;
                                    final int i19 = 1;
                                    if (z19) {
                                        d.a(lazyListScope, null, null, ut.b, 3, null);
                                        final float f8 = f5;
                                        final Function1 function20 = function11;
                                        d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1539514553, true, new Function3() { // from class: o42
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                Composer composer3 = (Composer) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((LazyItemScope) obj4).getClass();
                                                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1539514553, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:376)");
                                                    }
                                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                                    float f9 = f8;
                                                    String str = String.format("%+.1fs", Arrays.copyOf(new Object[]{Float.valueOf(f9)}, 1));
                                                    boolean zChanged21 = composer3.changed(f9);
                                                    Function1 function21 = function20;
                                                    boolean zChanged22 = zChanged21 | composer3.changed(function21);
                                                    Object objRememberedValue5 = composer3.rememberedValue();
                                                    if (zChanged22 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = new yy(f9, function21, 2);
                                                        composer3.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    Function0 function22 = (Function0) objRememberedValue5;
                                                    boolean zChanged23 = composer3.changed(f9) | composer3.changed(function21);
                                                    Object objRememberedValue6 = composer3.rememberedValue();
                                                    if (zChanged23 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue6 = new yy(f9, function21, 3);
                                                        composer3.updateRememberedValue(objRememberedValue6);
                                                    }
                                                    c52.e(f9, str, function22, (Function0) objRememberedValue6, focusRequester3, z20, null, null, null, null, composer3, 24576, 960);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer3.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 3, null);
                                        d.a(lazyListScope, null, null, ut.c, 3, null);
                                        d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-62620169, true, new p42(z20, f6, f7, function12, 0)), 3, null);
                                        d.a(lazyListScope, null, null, ut.d, 3, null);
                                        d.a(lazyListScope, null, null, ut.e, 3, null);
                                        d.a(lazyListScope, null, null, ut.f, 3, null);
                                    }
                                    boolean z21 = z15;
                                    if (z21) {
                                        d.a(lazyListScope, null, null, ut.g, 3, null);
                                        d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1472916062, true, new cq(subtitleColor2, function13, z19, focusRequester3)), 3, null);
                                        d.a(lazyListScope, null, null, ut.h, 3, null);
                                    }
                                    final boolean z22 = z16;
                                    if (z22) {
                                        boolean z23 = z17;
                                        q42 q42Var = new q42(z23, function14, z19, z21, focusRequester3);
                                        z18 = z21;
                                        d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-690975720, true, q42Var), 3, null);
                                        if (z23) {
                                            d.a(lazyListScope, null, null, ut.i, 3, null);
                                            d.a(lazyListScope, null, null, ut.j, 3, null);
                                            final int i20 = 0;
                                            final int i21 = i16;
                                            final Function1 function21 = function15;
                                            d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1208764379, true, new Function3() { // from class: r42
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                    int i22 = i20;
                                                    Function1 function22 = function21;
                                                    int i23 = i21;
                                                    switch (i22) {
                                                        case 0:
                                                            Composer composer3 = (Composer) obj5;
                                                            int iIntValue2 = ((Integer) obj6).intValue();
                                                            ((LazyItemScope) obj4).getClass();
                                                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1208764379, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:494)");
                                                                }
                                                                float f9 = i23;
                                                                String str = i23 + "%";
                                                                boolean zChanged21 = composer3.changed(i23) | composer3.changed(function22);
                                                                Object objRememberedValue5 = composer3.rememberedValue();
                                                                if (zChanged21 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue5 = new uy(i23, function22, 14);
                                                                    composer3.updateRememberedValue(objRememberedValue5);
                                                                }
                                                                Function0 function23 = (Function0) objRememberedValue5;
                                                                boolean zChanged22 = composer3.changed(i23) | composer3.changed(function22);
                                                                Object objRememberedValue6 = composer3.rememberedValue();
                                                                if (zChanged22 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue6 = new uy(i23, function22, 15);
                                                                    composer3.updateRememberedValue(objRememberedValue6);
                                                                }
                                                                c52.e(f9, str, function23, (Function0) objRememberedValue6, null, false, null, null, null, null, composer3, 0, 1008);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            } else {
                                                                composer3.skipToGroupEnd();
                                                            }
                                                            break;
                                                        default:
                                                            Composer composer4 = (Composer) obj5;
                                                            int iIntValue3 = ((Integer) obj6).intValue();
                                                            ((LazyItemScope) obj4).getClass();
                                                            if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-792750672, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:563)");
                                                                }
                                                                float f10 = i23;
                                                                String str2 = i23 + "%";
                                                                boolean zChanged23 = composer4.changed(i23) | composer4.changed(function22);
                                                                Object objRememberedValue7 = composer4.rememberedValue();
                                                                if (zChanged23 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue7 = new uy(i23, function22, 12);
                                                                    composer4.updateRememberedValue(objRememberedValue7);
                                                                }
                                                                Function0 function24 = (Function0) objRememberedValue7;
                                                                boolean zChanged24 = composer4.changed(i23) | composer4.changed(function22);
                                                                Object objRememberedValue8 = composer4.rememberedValue();
                                                                if (zChanged24 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue8 = new uy(i23, function22, 13);
                                                                    composer4.updateRememberedValue(objRememberedValue8);
                                                                }
                                                                c52.e(f10, str2, function24, (Function0) objRememberedValue8, null, false, null, null, null, null, composer4, 0, 1008);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            } else {
                                                                composer4.skipToGroupEnd();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }), 3, null);
                                        }
                                        d.a(lazyListScope, null, null, ut.k, 3, null);
                                    } else {
                                        z18 = z21;
                                    }
                                    d.a(lazyListScope, null, null, ut.l, 3, null);
                                    final int i22 = i17;
                                    final Function1 function22 = function16;
                                    final boolean z24 = z18;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1705588333, true, new Function3() { // from class: s42
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            Composer composer3 = (Composer) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((LazyItemScope) obj4).getClass();
                                            if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1705588333, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:526)");
                                                }
                                                int i23 = i22;
                                                float f9 = i23;
                                                String str = i23 + "dp";
                                                Icons icons = Icons.INSTANCE;
                                                ImageVector keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(icons.getDefault());
                                                ImageVector keyboardArrowUp = KeyboardArrowUpKt.getKeyboardArrowUp(icons.getDefault());
                                                FocusRequester focusRequester4 = (z19 || z24 || z22) ? null : focusRequester3;
                                                Function1 function23 = function22;
                                                boolean zChanged21 = composer3.changed(function23) | composer3.changed(i23);
                                                Object objRememberedValue5 = composer3.rememberedValue();
                                                if (zChanged21 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue5 = new uy(function23, i23, 16);
                                                    composer3.updateRememberedValue(objRememberedValue5);
                                                }
                                                Function0 function24 = (Function0) objRememberedValue5;
                                                boolean zChanged22 = composer3.changed(function23) | composer3.changed(i23);
                                                Object objRememberedValue6 = composer3.rememberedValue();
                                                if (zChanged22 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue6 = new uy(function23, i23, 17);
                                                    composer3.updateRememberedValue(objRememberedValue6);
                                                }
                                                c52.e(f9, str, function24, (Function0) objRememberedValue6, focusRequester4, false, keyboardArrowDown, keyboardArrowUp, "下移", "上移", composer3, 905969664, 32);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer3.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    d.a(lazyListScope, null, null, ut.m, 3, null);
                                    d.a(lazyListScope, null, null, ut.n, 3, null);
                                    final int i23 = i18;
                                    final Function1 function23 = function17;
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-792750672, true, new Function3() { // from class: r42
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i24 = i19;
                                            Function1 function24 = function23;
                                            int i25 = i23;
                                            switch (i24) {
                                                case 0:
                                                    Composer composer3 = (Composer) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    ((LazyItemScope) obj4).getClass();
                                                    if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1208764379, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:494)");
                                                        }
                                                        float f9 = i25;
                                                        String str = i25 + "%";
                                                        boolean zChanged21 = composer3.changed(i25) | composer3.changed(function24);
                                                        Object objRememberedValue5 = composer3.rememberedValue();
                                                        if (zChanged21 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue5 = new uy(i25, function24, 14);
                                                            composer3.updateRememberedValue(objRememberedValue5);
                                                        }
                                                        Function0 function25 = (Function0) objRememberedValue5;
                                                        boolean zChanged22 = composer3.changed(i25) | composer3.changed(function24);
                                                        Object objRememberedValue6 = composer3.rememberedValue();
                                                        if (zChanged22 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new uy(i25, function24, 15);
                                                            composer3.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        c52.e(f9, str, function25, (Function0) objRememberedValue6, null, false, null, null, null, null, composer3, 0, 1008);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer3.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer4 = (Composer) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    ((LazyItemScope) obj4).getClass();
                                                    if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-792750672, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:563)");
                                                        }
                                                        float f10 = i25;
                                                        String str2 = i25 + "%";
                                                        boolean zChanged23 = composer4.changed(i25) | composer4.changed(function24);
                                                        Object objRememberedValue7 = composer4.rememberedValue();
                                                        if (zChanged23 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue7 = new uy(i25, function24, 12);
                                                            composer4.updateRememberedValue(objRememberedValue7);
                                                        }
                                                        Function0 function26 = (Function0) objRememberedValue7;
                                                        boolean zChanged24 = composer4.changed(i25) | composer4.changed(function24);
                                                        Object objRememberedValue8 = composer4.rememberedValue();
                                                        if (zChanged24 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue8 = new uy(i25, function24, 13);
                                                            composer4.updateRememberedValue(objRememberedValue8);
                                                        }
                                                        c52.e(f10, str2, function26, (Function0) objRememberedValue8, null, false, null, null, null, null, composer4, 0, 1008);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        composer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 3, null);
                                    d.a(lazyListScope, null, null, ut.o, 3, null);
                                    d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1247463534, true, new ha(z20, function18)), 3, null);
                                    d.a(lazyListScope, null, null, ut.p, 3, null);
                                    d.a(lazyListScope, null, null, ut.q, 3, null);
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(function19);
                            objRememberedValue4 = function19;
                        }
                        LazyDslKt.LazyColumn(modifierM999padding3ABfNKs, null, null, false, null, null, null, false, null, (Function1) objRememberedValue4, composer2, 0, 510);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i10 & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: x42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i4 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i5);
                    int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i6);
                    c52.g(f, f2, i, i2, i3, z, subtitleColor, z2, z3, z4, z5, z6, function1, function2, function3, function4, function5, function6, function0, function7, function8, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, iUpdateChangedFlags3);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
