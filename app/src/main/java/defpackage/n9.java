package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabIndicatorOffsetNode;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.RendererCapabilities;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n9(Placeable placeable, MeasureScope measureScope, float f) {
        this.a = 4;
        this.c = placeable;
        this.d = measureScope;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        final float f = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return AndroidCursorHandle_androidKt.drawCursorHandle_4WTKRHQ$lambda$0$0(f, (ImageBitmap) obj3, (ColorFilter) obj2, (ContentDrawScope) obj);
            case 1:
                return LazyLayoutScrollScopeKt.animateScrollToItem$lambda$7(f, (Ref.FloatRef) obj3, (LazyLayoutScrollScope) obj2, (AnimationScope) obj);
            case 2:
                return ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17$lambda$16(f, (IntSize) obj3, (SheetState) obj2, (DraggableAnchorsConfig) obj);
            case 3:
                final List list = (List) obj3;
                final MutableState mutableState = (MutableState) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                d.b(lazyListScope, list.size(), new jg(list, 7), null, ComposableLambdaKt.composableLambdaInstance(-1319027820, true, new Function4() { // from class: s22
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        long jM5151copywmQWz5c$default;
                        int iIntValue = ((Integer) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Integer) obj7).intValue();
                        ((LazyItemScope) obj4).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((iIntValue2 & Input.Keys.NUMPAD_1) != 144, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1319027820, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.SpeedSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedSelectionOverlay.kt:105)");
                            }
                            final float fFloatValue = ((Number) list.get(iIntValue)).floatValue();
                            boolean z = iIntValue == v22.b(mutableState);
                            final boolean z2 = fFloatValue == f;
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(60.0f));
                            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                            if (z2) {
                                composer.startReplaceGroup(-570366650);
                                jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                                composer.endReplaceGroup();
                            } else if (z) {
                                composer.startReplaceGroup(-570364346);
                                composer.endReplaceGroup();
                                jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                composer.startReplaceGroup(-570362330);
                                composer.endReplaceGroup();
                                jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, roundedCornerShapeM1312RoundedCornerShape0680j_4, jM5151copywmQWz5c$default, 0L, 0.0f, 0.0f, z ? BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()) : null, ComposableLambdaKt.rememberComposableLambda(-1926405841, true, new Function2() { // from class: t22
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj8, Object obj9) {
                                    Composer composer2 = (Composer) obj8;
                                    int iIntValue3 = ((Integer) obj9).intValue();
                                    if (composer2.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1926405841, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.SpeedSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedSelectionOverlay.kt:124)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f), 0.0f, 2, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                        int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1001paddingVpY3zN4$default);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                        mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        TextKt.m3048TextNvy7gAk(fFloatValue + "x", null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                                        if (z2) {
                                            composer2.startReplaceGroup(-211122692);
                                            IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(24.0f)), ColorKt.Color(4283215696L), composer2, 3504, 0);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(-210824937);
                                            composer2.endReplaceGroup();
                                        }
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer, 54), composer, 12582918, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }), 4, null);
                return Unit.INSTANCE;
            case 4:
                return TabIndicatorOffsetNode.measure_3p2s80s$lambda$3((Placeable) obj3, (MeasureScope) obj2, f, (Placeable.PlacementScope) obj);
            default:
                return UpdatableAnimationState.animateToZero$lambda$1((UpdatableAnimationState) obj3, f, (Function1) obj2, ((Long) obj).longValue());
        }
    }

    public /* synthetic */ n9(float f, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ n9(Object obj, float f, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }
}
