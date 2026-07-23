package defpackage;

import androidx.compose.foundation.BorderKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tg0 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ tg0(io ioVar, MutableState mutableState, Function0 function0) {
        this.a = 2;
        this.b = ioVar;
        this.d = mutableState;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jM5151copywmQWz5c$default;
        long jM5151copywmQWz5c$default2;
        Composer composer;
        int i = this.a;
        Object obj5 = this.c;
        MutableState mutableState = this.d;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj6;
                String str = (String) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((LazyItemScope) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
                }
                int i2 = iIntValue2;
                if (composer2.shouldExecute((i2 & Input.Keys.NUMPAD_1) != 144, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1959799657, i2, -1, "com.dh.myembyapp.ui.screens.player.components.EpisodeSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpisodeSelectionOverlay.kt:126)");
                    }
                    MediaItem mediaItem = (MediaItem) list.get(iIntValue);
                    boolean z = iIntValue == vg0.b(mutableState);
                    boolean zAreEqual = Intrinsics.areEqual(mediaItem.getId(), str);
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(90.0f));
                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                    if (zAreEqual) {
                        composer2.startReplaceGroup(-2123156165);
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                        composer2.endReplaceGroup();
                    } else if (z) {
                        composer2.startReplaceGroup(-2123153861);
                        composer2.endReplaceGroup();
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        composer2.startReplaceGroup(-2123151845);
                        composer2.endReplaceGroup();
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, roundedCornerShapeM1312RoundedCornerShape0680j_4, jM5151copywmQWz5c$default, 0L, 0.0f, 0.0f, z ? BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()) : null, ComposableLambdaKt.rememberComposableLambda(1146244782, true, new a5(mediaItem, 16), composer2, 54), composer2, 12582918, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 1:
                List list2 = (List) obj6;
                String str2 = (String) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((LazyItemScope) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= composer3.changed(iIntValue3) ? 32 : 16;
                }
                int i3 = iIntValue4;
                if (composer3.shouldExecute((i3 & Input.Keys.NUMPAD_1) != 144, i3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1189899885, i3, -1, "com.dh.myembyapp.ui.screens.player.components.TranscodeQualitySelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TranscodeQualitySelectionOverlay.kt:130)");
                    }
                    TranscodeQualityOption transcodeQualityOption = (TranscodeQualityOption) list2.get(iIntValue3);
                    boolean zAreEqual2 = Intrinsics.areEqual(nb2.c(transcodeQualityOption), str2);
                    boolean z2 = iIntValue3 == nb2.b(mutableState);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    if (z2) {
                        jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM5151copywmQWz5c$default2 = zAreEqual2 ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                    }
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(BorderKt.border(kb0.v(8.0f, modifierFillMaxWidth$default, jM5151copywmQWz5c$default2), z2 ? BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)) : BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f))), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer3, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1000paddingVpY3zN4);
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(28.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1069width3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (zAreEqual2) {
                        composer3.startReplaceGroup(-637069328);
                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), composer3, 3504, 0);
                        composer = composer3;
                        composer.endReplaceGroup();
                    } else {
                        composer = composer3;
                        composer.startReplaceGroup(-636754151);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    Modifier modifierE = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierE);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer);
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String name = transcodeQualityOption.getName();
                    Color.Companion companion4 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk(name, null, companion4.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
                    if (transcodeQualityOption.isAuto() || transcodeQualityOption.getDisablesTranscoding() || transcodeQualityOption.getMaxHeight() == null) {
                        composer.startReplaceGroup(919276265);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(918866879);
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(2.0f)), composer, 6);
                        TextKt.m3048TextNvy7gAk("最高 " + transcodeQualityOption.getMaxHeight() + TtmlNode.TAG_P, null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer, 24960, 24576, 245738);
                        composer.endReplaceGroup();
                    }
                    if (x2.m(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            default:
                io ioVar = (io) obj6;
                Function0 function0 = (Function0) obj5;
                ((Integer) obj2).getClass();
                Composer composer4 = (Composer) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue5 & 129) != 128, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1203675175, iIntValue5, -1, "com.dh.myembyapp.ui.screens.home.LibrarySkeletonSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:2843)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion5, ioVar.c), ioVar.e);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i7 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierM1050height3ABfNKs2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Object objRememberedValue = composer4.rememberedValue();
                    Composer.Companion companion7 = Composer.INSTANCE;
                    if (objRememberedValue == companion7.getEmpty()) {
                        objRememberedValue = new bo0(10);
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function1 = (Function0) objRememberedValue;
                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), ioVar.d);
                    boolean zChanged = composer4.changed(mutableState) | composer4.changed(function0);
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion7.getEmpty()) {
                        objRememberedValue2 = new qx(function0, mutableState, 2);
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs3, (Function1) objRememberedValue2);
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i8).getSurfaceVariant(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    int i9 = CardDefaults.$stable;
                    CardKt.Card(function1, modifierOnFocusChanged, null, null, cardDefaults.m8247colors5tl4gsc(jM5151copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, composer4, i9 << 18, 62), null, cardDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i8).getPrimary(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, composer4, i9 << 9, 5), null, null, et.p, composer4, 805306374, 428);
                    composer4.endNode();
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

    public /* synthetic */ tg0(List list, String str, MutableState mutableState, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = mutableState;
    }
}
