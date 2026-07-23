package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qu0 {
    public static final void a(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, boolean z11, final boolean z12, boolean z13, final boolean z14, final Function0 function0, final Function13 function13, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final boolean z15;
        boolean z16;
        Composer composer2;
        Object objM;
        function0.getClass();
        function13.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(463593931);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(z7) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(z8) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(z9) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(z10) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(z11) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z12) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(z13) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z14) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        int i6 = i4;
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (74899 & i6) == 74898) ? false : true, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(463593931, i5, i6, "com.dh.myembyapp.ui.components.InterfaceSettingsDialog (InterfaceSettingsDialog.kt:75)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z17 = (i5 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z17 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = mr.m(z, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            boolean z18 = (i5 & Input.Keys.FORWARD_DEL) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z18 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = mr.m(z2, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            boolean z19 = (i5 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z19 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = mr.m(z3, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue3;
            boolean z20 = (i5 & 7168) == 2048;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z20 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = mr.m(z4, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue4;
            boolean z21 = (57344 & i5) == 16384;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z21 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = mr.m(z5, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState5 = (MutableState) objRememberedValue5;
            boolean z22 = (458752 & i5) == 131072;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z22 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = mr.m(z6, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue6;
            boolean z23 = (3670016 & i5) == 1048576;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z23 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = mr.m(z7, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState7 = (MutableState) objRememberedValue7;
            boolean z24 = (29360128 & i5) == 8388608;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z24 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = mr.m(z8, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState8 = (MutableState) objRememberedValue8;
            boolean z25 = (234881024 & i5) == 67108864;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z25 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = mr.m(z9, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue9;
            boolean z26 = (1879048192 & i5) == 536870912;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (z26 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = mr.m(z10, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState10 = (MutableState) objRememberedValue10;
            boolean z27 = (i6 & 14) == 4;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (z27 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                z15 = z11;
                objM = mr.m(z15, null, 2, null, composerStartRestartGroup);
            } else {
                objM = objRememberedValue11;
                z15 = z11;
            }
            final MutableState mutableState11 = (MutableState) objM;
            boolean z28 = (i6 & Input.Keys.FORWARD_DEL) == 32;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (z28 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue12 = mr.m(z12, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState12 = (MutableState) objRememberedValue12;
            boolean z29 = (i6 & 896) == 256;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (z29 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                z16 = z13;
                objRememberedValue13 = mr.m(z16, null, 2, null, composerStartRestartGroup);
            } else {
                z16 = z13;
            }
            final MutableState mutableState13 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue14;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new ji(focusRequester, null, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1815210708, true, new Function2() { // from class: ou0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1815210708, iIntValue, -1, "com.dh.myembyapp.ui.components.InterfaceSettingsDialog.<anonymous> (InterfaceSettingsDialog.kt:132)");
                        }
                        final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        final u61 u61Var2 = u61Var;
                        Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, u61Var2.a, null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(480.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null);
                        RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f));
                        CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14);
                        final FocusRequester focusRequester2 = focusRequester;
                        final MutableState mutableState14 = mutableState;
                        final MutableState mutableState15 = mutableState2;
                        final MutableState mutableState16 = mutableState3;
                        final MutableState mutableState17 = mutableState4;
                        final MutableState mutableState18 = mutableState5;
                        final MutableState mutableState19 = mutableState6;
                        final MutableState mutableState20 = mutableState7;
                        final MutableState mutableState21 = mutableState8;
                        final MutableState mutableState22 = mutableState9;
                        final MutableState mutableState23 = mutableState10;
                        final MutableState mutableState24 = mutableState11;
                        final MutableState mutableState25 = mutableState12;
                        final boolean z30 = z14;
                        final MutableState mutableState26 = mutableState13;
                        final Function0 function1 = function0;
                        final Function13 function14 = function13;
                        CardKt.Card(modifierM1052heightInVpY3zN4$default, roundedCornerShapeM1312RoundedCornerShape0680j_4, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(337648348, true, new Function3() { // from class: ku0
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
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                boolean z31;
                                char c;
                                MutableState mutableState27;
                                int i8;
                                MutableState mutableState28;
                                Object u1Var;
                                Composer composer4 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((ColumnScope) obj3).getClass();
                                if (composer4.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(337648348, iIntValue2, -1, "com.dh.myembyapp.ui.components.InterfaceSettingsDialog.<anonymous>.<anonymous>.<anonymous> (InterfaceSettingsDialog.kt:148)");
                                    }
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), Dp.m7813constructorimpl(12.0f));
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                                    Alignment.Companion companion5 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion5.getStart(), composer4, 6);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i10 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk("功能配置", null, materialTheme.getColorScheme(composer4, i10).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i10).getTitleSmall(), composer4, 6, 0, 131066);
                                    TextKt.m3048TextNvy7gAk("以下设置为整个软件全局生效，不区分服务器。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i10).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i10).getBodySmall(), composer4, 6, 0, 131066);
                                    MutableState mutableState29 = mutableState14;
                                    boolean zBooleanValue = ((Boolean) mutableState29.getValue()).booleanValue();
                                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), focusRequester2);
                                    boolean zChanged = composer4.changed(mutableState29);
                                    Object objRememberedValue16 = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                        z31 = false;
                                        objRememberedValue16 = new lu0(0, mutableState29);
                                        composer4.updateRememberedValue(objRememberedValue16);
                                    } else {
                                        z31 = false;
                                    }
                                    qu0.b(54, composer4, modifierFocusRequester, "聚合视界", "开启后，服务器列表和切换弹窗会显示聚合视界入口。", (Function0) objRememberedValue16, zBooleanValue);
                                    MutableState mutableState30 = mutableState15;
                                    boolean zBooleanValue2 = ((Boolean) mutableState30.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged2 = composer4.changed(mutableState30);
                                    Object objRememberedValue17 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue17 = new lu0(1, mutableState30);
                                        composer4.updateRememberedValue(objRememberedValue17);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default, "搜索页使用聚合搜索", "开启后，单服搜索页会使用聚合搜索能力。", (Function0) objRememberedValue17, zBooleanValue2);
                                    MutableState mutableState31 = mutableState16;
                                    boolean zBooleanValue3 = ((Boolean) mutableState31.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged3 = composer4.changed(mutableState31);
                                    Object objRememberedValue18 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue18 = new lu0(2, mutableState31);
                                        composer4.updateRememberedValue(objRememberedValue18);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default2, "切换顶部按钮不刷新", "开启后，聚焦到“媒体 / 收藏 / 搜索”时不自动切换内容，需要按确认键才切换。", (Function0) objRememberedValue18, zBooleanValue3);
                                    MutableState mutableState32 = mutableState17;
                                    boolean zBooleanValue4 = ((Boolean) mutableState32.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged4 = composer4.changed(mutableState32);
                                    Object objRememberedValue19 = composer4.rememberedValue();
                                    if (zChanged4 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue19 = new lu0(3, mutableState32);
                                        composer4.updateRememberedValue(objRememberedValue19);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default3, "顶部按钮透明背景", "开启后，服务器 / 媒体 / 收藏 / 搜索 / 设置在非聚焦时不显示底色，只保留图标和文字，更融入背景图。", (Function0) objRememberedValue19, zBooleanValue4);
                                    MutableState mutableState33 = mutableState18;
                                    boolean zBooleanValue5 = ((Boolean) mutableState33.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged5 = composer4.changed(mutableState33);
                                    Object objRememberedValue20 = composer4.rememberedValue();
                                    if (zChanged5 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue20 = new lu0(4, mutableState33);
                                        composer4.updateRememberedValue(objRememberedValue20);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default4, "媒体库标题可点击", "开启后，首页具体媒体库区块的标题可聚焦点击，按确认键可直接进入对应媒体库。", (Function0) objRememberedValue20, zBooleanValue5);
                                    MutableState mutableState34 = mutableState19;
                                    boolean zBooleanValue6 = ((Boolean) mutableState34.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged6 = composer4.changed(mutableState34);
                                    Object objRememberedValue21 = composer4.rememberedValue();
                                    if (zChanged6 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue21 = new lu0(5, mutableState34);
                                        composer4.updateRememberedValue(objRememberedValue21);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default5, "列表左端显示更多按钮", "开启后，在首页具体媒体库列表的第一个卡片处向左按，可显示“更多内容”按钮并进入对应媒体库。", (Function0) objRememberedValue21, zBooleanValue6);
                                    MutableState mutableState35 = mutableState20;
                                    boolean zBooleanValue7 = ((Boolean) mutableState35.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged7 = composer4.changed(mutableState35);
                                    Object objRememberedValue22 = composer4.rememberedValue();
                                    if (zChanged7 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                        c = 6;
                                        objRememberedValue22 = new lu0(6, mutableState35);
                                        composer4.updateRememberedValue(objRememberedValue22);
                                    } else {
                                        c = 6;
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default6, "媒体首页隐藏已观看", "开启后，媒体首页各媒体库列表只显示未观看内容。", (Function0) objRememberedValue22, zBooleanValue7);
                                    MutableState mutableState36 = mutableState21;
                                    boolean zBooleanValue8 = ((Boolean) mutableState36.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged8 = composer4.changed(mutableState36);
                                    Object objRememberedValue23 = composer4.rememberedValue();
                                    if (zChanged8 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue23 = new lu0(7, mutableState36);
                                        composer4.updateRememberedValue(objRememberedValue23);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default7, "播放前海报展示", "开启后，进入播放器首帧出来前会显示详情页海报；关闭后恢复原来的黑色等待效果。", (Function0) objRememberedValue23, zBooleanValue8);
                                    MutableState mutableState37 = mutableState22;
                                    boolean zBooleanValue9 = ((Boolean) mutableState37.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged9 = composer4.changed(mutableState37);
                                    Object objRememberedValue24 = composer4.rememberedValue();
                                    if (zChanged9 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue24 = new lu0(8, mutableState37);
                                        composer4.updateRememberedValue(objRememberedValue24);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default8, "聚合视界显示版本标签", "开启后，聚合视界里的电影卡片会额外显示分辨率、码率等标签；关闭后不再额外请求版本信息。", (Function0) objRememberedValue24, zBooleanValue9);
                                    MutableState mutableState38 = mutableState23;
                                    boolean zBooleanValue10 = ((Boolean) mutableState38.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged10 = composer4.changed(mutableState38);
                                    Object objRememberedValue25 = composer4.rememberedValue();
                                    if (zChanged10 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue25 = new lu0(9, mutableState38);
                                        composer4.updateRememberedValue(objRememberedValue25);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default9, "详情页显示横向聚合版本", "开启后，详情页简介下方会自动展示聚合搜索到的多服版本；关闭后仍可点搜索按钮查看。", (Function0) objRememberedValue25, zBooleanValue10);
                                    MutableState mutableState39 = mutableState24;
                                    boolean zBooleanValue11 = ((Boolean) mutableState39.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged11 = composer4.changed(mutableState39);
                                    Object objRememberedValue26 = composer4.rememberedValue();
                                    if (zChanged11 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue26 = new lu0(10, mutableState39);
                                        composer4.updateRememberedValue(objRememberedValue26);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default10, "返回键先回到顶部", "开启后，在媒体首页按返回键会先回到顶部。", (Function0) objRememberedValue26, zBooleanValue11);
                                    MutableState mutableState40 = mutableState25;
                                    boolean zBooleanValue12 = ((Boolean) mutableState40.getValue()).booleanValue();
                                    Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    boolean zChanged12 = composer4.changed(mutableState40);
                                    Object objRememberedValue27 = composer4.rememberedValue();
                                    if (zChanged12 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue27 = new lu0(11, mutableState40);
                                        composer4.updateRememberedValue(objRememberedValue27);
                                    }
                                    qu0.b(3126, composer4, modifierFillMaxWidth$default11, "启动时检查应用更新", "开启后，应用启动时会静默检查新版本，若检测到可升级版本，首页右上角设置按钮旁会显示黄色提示点。", (Function0) objRememberedValue27, zBooleanValue12);
                                    boolean z32 = z30;
                                    MutableState mutableState41 = mutableState26;
                                    if (z32) {
                                        composer4.startReplaceGroup(-1052070425);
                                        boolean zBooleanValue13 = ((Boolean) mutableState41.getValue()).booleanValue();
                                        Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                        boolean zChanged13 = composer4.changed(mutableState41);
                                        Object objRememberedValue28 = composer4.rememberedValue();
                                        if (zChanged13 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue28 = new lu0(12, mutableState41);
                                            composer4.updateRememberedValue(objRememberedValue28);
                                        }
                                        mutableState27 = mutableState41;
                                        qu0.b(3126, composer4, modifierFillMaxWidth$default12, "特殊功能", "开启后，启动跳转播放功能", (Function0) objRememberedValue28, zBooleanValue13);
                                        composer4.endReplaceGroup();
                                    } else {
                                        mutableState27 = mutableState41;
                                        composer4.startReplaceGroup(-1051619716);
                                        composer4.endReplaceGroup();
                                    }
                                    TextKt.m3048TextNvy7gAk("以上选项为全局开关，整个软件统一使用这一份配置。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i10).getOnSurface(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i10).getBodySmall(), composer4, 6, 0, 131066);
                                    Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(12.0f), companion5.getEnd()), companion5.getTop(), composer4, 6);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default13);
                                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer4);
                                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i11), composerM4318constructorimpl3));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Object objRememberedValue29 = composer4.rememberedValue();
                                    Composer.Companion companion7 = Composer.INSTANCE;
                                    if (objRememberedValue29 == companion7.getEmpty()) {
                                        i8 = 2;
                                        objRememberedValue29 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                        composer4.updateRememberedValue(objRememberedValue29);
                                    } else {
                                        i8 = 2;
                                    }
                                    MutableState mutableState42 = (MutableState) objRememberedValue29;
                                    Object objRememberedValue30 = composer4.rememberedValue();
                                    if (objRememberedValue30 == companion7.getEmpty()) {
                                        objRememberedValue30 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i8, null);
                                        composer4.updateRememberedValue(objRememberedValue30);
                                    }
                                    MutableState mutableState43 = (MutableState) objRememberedValue30;
                                    ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer4, 6, i8);
                                    ButtonScale buttonScaleL = hc2.l(1.05f);
                                    u61 u61Var3 = u61Var2;
                                    ButtonGlow buttonGlowA = el0.a(u61Var3);
                                    ButtonBorder buttonBorderH = hc2.h(composer4);
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                                    Object objRememberedValue31 = composer4.rememberedValue();
                                    if (objRememberedValue31 == companion7.getEmpty()) {
                                        objRememberedValue31 = new h70(24, mutableState42);
                                        composer4.updateRememberedValue(objRememberedValue31);
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg(function1, FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue31), null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(1948714450, true, new p1(25, mutableState42), composer4, 54), composer4, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    ButtonColors buttonColorsI2 = hc2.i(jc2.b, false, composer4, 6, i8);
                                    ButtonScale buttonScaleL2 = hc2.l(1.05f);
                                    ButtonGlow buttonGlowA2 = el0.a(u61Var3);
                                    ButtonBorder buttonBorderH2 = hc2.h(composer4);
                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                                    Object objRememberedValue32 = composer4.rememberedValue();
                                    if (objRememberedValue32 == companion7.getEmpty()) {
                                        mutableState28 = mutableState43;
                                        objRememberedValue32 = new h70(25, mutableState28);
                                        composer4.updateRememberedValue(objRememberedValue32);
                                    } else {
                                        mutableState28 = mutableState43;
                                    }
                                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue32);
                                    Function13 function15 = function14;
                                    MutableState mutableState44 = mutableState27;
                                    boolean zChanged14 = composer4.changed(function15) | composer4.changed(mutableState29) | composer4.changed(mutableState30) | composer4.changed(mutableState31) | composer4.changed(mutableState32) | composer4.changed(mutableState33) | composer4.changed(mutableState34) | composer4.changed(mutableState35) | composer4.changed(mutableState36) | composer4.changed(mutableState37) | composer4.changed(mutableState38) | composer4.changed(mutableState39) | composer4.changed(mutableState40) | composer4.changed(mutableState44);
                                    Object objRememberedValue33 = composer4.rememberedValue();
                                    if (zChanged14 || objRememberedValue33 == companion7.getEmpty()) {
                                        u1Var = new u1(function15, mutableState29, mutableState30, mutableState31, mutableState32, mutableState33, mutableState34, mutableState35, mutableState36, mutableState37, mutableState38, mutableState39, mutableState40, mutableState44, 3);
                                        composer4.updateRememberedValue(u1Var);
                                    } else {
                                        u1Var = objRememberedValue33;
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg((Function0) u1Var, modifierOnFocusChanged, null, false, buttonScaleL2, buttonGlowA2, null, buttonColorsI2, 0.0f, buttonBorderH2, null, null, ComposableLambdaKt.rememberComposableLambda(1086935291, true, new p1(26, mutableState28), composer4, 54), composer4, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    if (x2.m(composer4)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
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
            }, composerStartRestartGroup, 54), composer2, ((i6 >> 12) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            z15 = z11;
            z16 = z13;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z30 = z16;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: pu0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    qu0.a(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z15, z12, z30, z14, function0, function13, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1036679303);
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
            modifier2 = modifier;
            i2 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1036679303, i2, -1, "com.dh.myembyapp.ui.components.InterfaceToggleRow (InterfaceSettingsDialog.kt:397)");
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
            int i3 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            int i4 = ClickableSurfaceDefaults.$stable;
            int i5 = i2;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 24, PsExtractor.VIDEO_STREAM_MASK);
            int i6 = i4 << 15;
            Modifier modifier3 = modifier2;
            SurfaceKt.m8520Surface05tvjtU(function0, modifier3, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i6, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i6, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-1662618424, true, new mu0(str, str2, 0, z), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 12) & 14) | ((i5 >> 6) & Input.Keys.FORWARD_DEL), 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nu0(str, str2, z, modifier, function0, i, 0));
        }
    }
}
