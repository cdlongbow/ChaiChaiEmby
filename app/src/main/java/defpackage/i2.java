package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.PersonInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws UnsupportedEncodingException {
        Modifier modifierFocusProperties;
        String strE;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                State state = (State) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1202388022, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:804)");
                    }
                    String str = ((u2) state.getValue()) instanceof t2 ? "正在验证连接，请稍候..." : "点击保存将验证服务器连接并保存配置";
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 48, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                return AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22((BottomAppBarScrollBehavior) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 2:
                return BasicTextFieldKt.minHeightForSingleLineField$lambda$0((TextLayoutState) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 3:
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56((BufferedChannel) obj4, (SelectInstance) obj, obj2, obj3);
            case 4:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$5((CoreTextFieldSemanticsModifierNode) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            case 5:
                bx bxVar = (bx) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1178598854, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.DanmakuMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuMenuOverlay.kt:192)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str2 = bxVar.a;
                    String str3 = bxVar.b;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme2.getTypography(composer2, i4).getBodyLarge();
                    Color.Companion companion4 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk(str2, null, companion4.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    if (str3 != null) {
                        composer2.startReplaceGroup(-1967881728);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion3, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
                        TextKt.m3048TextNvy7gAk(bxVar.b, null, Intrinsics.areEqual(str3, "开") ? ColorKt.Color(4283215696L) : companion4.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i4).getBodyMedium(), composer2, 0, 0, 131066);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1967266688);
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
            case 6:
                PersonInfo personInfo = (PersonInfo) obj4;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1980806668, iIntValue3, -1, "com.dh.myembyapp.ui.screens.detail.CastCard.<anonymous> (DetailScreen.kt:9259)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Color.m5151copywmQWz5c$default(ColorKt.Color(4291875024L), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    IconKt.m2496Iconww6aTOc(PersonKt.getPerson(Icons.INSTANCE.getDefault()), personInfo.getName(), SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(48.0f)), ColorKt.Color(4286611584L), composer3, 3456, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                List list = (List) obj4;
                BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                boxWithConstraintsScope.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= composer4.changed(boxWithConstraintsScope) ? 4 : 2;
                }
                if (composer4.shouldExecute((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-182735775, iIntValue4, -1, "com.dh.myembyapp.ui.screens.detail.DetailMetadataCardsRow.<anonymous> (DetailScreen.kt:7385)");
                    }
                    float fM7813constructorimpl = Dp.m7813constructorimpl(14.0f);
                    float fM7827unboximpl = ((Dp) RangesKt___RangesKt.coerceAtMost(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(boxWithConstraintsScope.mo734getMaxWidthD9Ej5fM() - Dp.m7813constructorimpl(2.0f * fM7813constructorimpl)) / 3.0f)), Dp.m7811boximpl(u90.A))).m7827unboximpl();
                    Modifier modifierHeight = IntrinsicKt.height(ScrollKt.horizontalScroll$default(FocusableKt.focusGroup(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), IntrinsicSize.Max);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(fM7813constructorimpl), Alignment.INSTANCE.getTop(), composer4, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierHeight);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
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
                    mr.z(companion7, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(-1495590176);
                    int i8 = 0;
                    for (Object obj5 : list) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        p40 p40Var = (p40) obj5;
                        if (i8 == 0) {
                            composer4.startReplaceGroup(1003052673);
                            Modifier.Companion companion8 = Modifier.INSTANCE;
                            Object objRememberedValue = composer4.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new hq(19);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            modifierFocusProperties = FocusPropertiesKt.focusProperties(companion8, (Function1) objRememberedValue);
                            composer4.endReplaceGroup();
                        } else if (i8 == CollectionsKt.getLastIndex(list)) {
                            composer4.startReplaceGroup(1003055778);
                            Modifier.Companion companion9 = Modifier.INSTANCE;
                            Object objRememberedValue2 = composer4.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new hq(20);
                                composer4.updateRememberedValue(objRememberedValue2);
                            }
                            modifierFocusProperties = FocusPropertiesKt.focusProperties(companion9, (Function1) objRememberedValue2);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(1003058233);
                            composer4.endReplaceGroup();
                            modifierFocusProperties = Modifier.INSTANCE;
                        }
                        u90.E(p40Var, SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(modifierFocusProperties, fM7827unboximpl), 0.0f, 1, null), composer4, 0);
                        i8 = i9;
                    }
                    if (i9.s(composer4)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                String str4 = (String) obj;
                ((Integer) obj3).intValue();
                str4.getClass();
                ((String) obj2).getClass();
                ((Function2) obj4).invoke(str4, "继续观看");
                return Unit.INSTANCE;
            case 9:
                NavHostController navHostController = (NavHostController) obj4;
                String str5 = (String) obj;
                String str6 = (String) obj2;
                String str7 = (String) obj3;
                str5.getClass();
                str6.getClass();
                String strEncode = URLEncoder.encode(str6, "UTF-8");
                if (str7 != null) {
                    StringBuilder sbZ = kb0.z("person/", str5, "?personName=", strEncode, "&personImageTag=");
                    sbZ.append(str7);
                    strE = sbZ.toString();
                } else {
                    strE = ll0.e("person/", str5, "?personName=", strEncode);
                }
                NavController.navigate$default((NavController) navHostController, strE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.INSTANCE;
            case 10:
                j51 j51Var = (j51) obj4;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-758589858, iIntValue5, -1, "com.dh.myembyapp.ui.components.MoreMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MoreMenuOverlay.kt:191)");
                    }
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(14.0f));
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer5, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i10 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion10.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor5);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion10, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl5, Integer.valueOf(i10), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk(j51Var.a, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyLarge(), composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                return MovableContentKt.movableContentWithReceiverOf$lambda$0((Function3) obj4, obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) obj4, (SelectInstance) obj, obj2, obj3);
            case 13:
                w81 w81Var = (w81) obj4;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-123807738, iIntValue6, -1, "com.dh.myembyapp.ui.components.NetworkTestResultDialog.<anonymous>.<anonymous>.<anonymous> (ProxyConfigDialog.kt:500)");
                    }
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f));
                    Alignment.Companion companion12 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion12.getStart(), composer6, 6);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i11 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer6, modifierM999padding3ABfNKs2);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion13.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor6);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer6);
                    mr.z(companion13, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl6, Integer.valueOf(i11), composerM4318constructorimpl6));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i12 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("网络测试结果", null, materialTheme3.getColorScheme(composer6, i12).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i12).getTitleMedium(), composer6, 6, 0, 131066);
                    gr1.h("谷歌", w81Var.a, composer6, 6);
                    gr1.h("百度", w81Var.b, composer6, 6);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion12.getTop(), composer6, 6);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i13 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor7 = companion13.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor7);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer6);
                    mr.z(companion13, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl7, Integer.valueOf(i13), composerM4318constructorimpl7));
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("外网IP:", null, materialTheme3.getColorScheme(composer6, i12).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i12).getBodyMedium(), composer6, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk(w81Var.c, null, materialTheme3.getColorScheme(composer6, i12).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i12).getBodyMedium(), composer6, 0, 0, 131066);
                    composer6.endNode();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion12.getTop(), composer6, 6);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i14 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor8 = companion13.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor8);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer6);
                    mr.z(companion13, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy6, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl8, Integer.valueOf(i14), composerM4318constructorimpl8));
                    TextKt.m3048TextNvy7gAk("所属国家或地区:", null, materialTheme3.getColorScheme(composer6, i12).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i12).getBodyMedium(), composer6, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk(w81Var.d, null, materialTheme3.getColorScheme(composer6, i12).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i12).getBodyMedium(), composer6, 0, 0, 131066);
                    composer6.endNode();
                    TextKt.m3048TextNvy7gAk("（5秒后自动关闭）", columnScopeInstance.align(companion11, companion12.getCenterHorizontally()), Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composer6, i12).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i12).getBodySmall(), composer6, 6, 0, 131064);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                return RouteSerializerKt.generateRoutePattern$lambda$1((RouteBuilder) obj4, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            case 15:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0((SelectionManager) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return SemaphoreAndMutexImpl.onCancellationRelease$lambda$2((SemaphoreAndMutexImpl) obj4, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            case 17:
                g42 g42Var = (g42) obj4;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1723293026, iIntValue7, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:241)");
                    }
                    Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer7, 54);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i15 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer7, modifierM999padding3ABfNKs3);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor9 = companion14.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor9);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer7);
                    mr.z(companion14, composerM4318constructorimpl9, measurePolicyRowMeasurePolicy7, composerM4318constructorimpl9, currentCompositionLocalMap9);
                    Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl9, Integer.valueOf(i15), composerM4318constructorimpl9));
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    String str8 = g42Var.a;
                    String str9 = g42Var.b;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i16 = MaterialTheme.$stable;
                    TextStyle bodyLarge2 = materialTheme4.getTypography(composer7, i16).getBodyLarge();
                    Color.Companion companion15 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk(str8, null, companion15.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge2, composer7, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    if (str9 != null) {
                        composer7.startReplaceGroup(-790156670);
                        TextKt.m3048TextNvy7gAk(g42Var.b, null, Intrinsics.areEqual(str9, "开") ? ColorKt.Color(4283215696L) : companion15.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer7, i16).getBodyMedium(), composer7, 0, 0, 131066);
                        composer7.endReplaceGroup();
                    } else {
                        composer7.startReplaceGroup(-789840408);
                        composer7.endReplaceGroup();
                    }
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                SubtitlePreferences.SubtitleColor subtitleColor = (SubtitlePreferences.SubtitleColor) obj4;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(778617588, iIntValue8, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleColorButton.<anonymous> (SubtitleSettings.kt:878)");
                    }
                    Modifier.Companion companion16 = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion16, 0.0f, 1, null), Dp.m7813constructorimpl(4.0f), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composer8, 54);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i17 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer8, modifierM1001paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor10 = companion17.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor10);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer8);
                    mr.z(companion17, composerM4318constructorimpl10, measurePolicyRowMeasurePolicy8, composerM4318constructorimpl10, currentCompositionLocalMap10);
                    Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl10, Integer.valueOf(i17), composerM4318constructorimpl10));
                    RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                    Modifier modifierV = kb0.v(3.0f, SizeKt.m1064size3ABfNKs(companion16, Dp.m7813constructorimpl(16.0f)), ColorKt.Color(subtitleColor.getColorValue()));
                    float fM7813constructorimpl2 = Dp.m7813constructorimpl(1.0f);
                    Color.Companion companion18 = Color.INSTANCE;
                    BoxKt.Box(BorderKt.m286borderxT4_qwU(modifierV, fM7813constructorimpl2, Color.m5151copywmQWz5c$default(companion18.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(3.0f))), composer8, 0);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion16, Dp.m7813constructorimpl(4.0f)), composer8, 6);
                    TextKt.m3048TextNvy7gAk(subtitleColor.getDisplayName(), null, companion18.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(11), null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer8, 24960, 24576, 245738);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$5((TextFieldDecoratorModifierNode) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            case 20:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0((TextFieldSelectionManager) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 21:
                return TextFieldSizeKt.legacyTextFieldMinSize$lambda$0((TextStyle) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                ve2 ve2Var = (ve2) obj4;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1492766286, iIntValue9, -1, "com.dh.myembyapp.ui.components.WebDavDownloadConfirmDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WebDavSyncDialog.kt:819)");
                    }
                    Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(12.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), Alignment.INSTANCE.getStart(), composer9, 6);
                    long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer9, 0);
                    int i18 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap11 = composer9.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer9, modifierM1000paddingVpY3zN5);
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor11 = companion19.getConstructor();
                    if (composer9.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer9.startReusableNode();
                    if (composer9.getInserting()) {
                        composer9.createNode(constructor11);
                    } else {
                        composer9.useNode();
                    }
                    Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer9);
                    mr.z(companion19, composerM4318constructorimpl11, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl11, currentCompositionLocalMap11);
                    Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion19, composerM4318constructorimpl11, Integer.valueOf(i18), composerM4318constructorimpl11));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                    int i19 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("覆盖提醒", null, materialTheme5.getColorScheme(composer9, i19).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer9, i19).getTitleSmall(), composer9, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk("确认下载后，会覆盖当前电视上已勾选的本地配置。", null, Color.m5151copywmQWz5c$default(materialTheme5.getColorScheme(composer9, i19).getOnSurface(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer9, i19).getBodySmall(), composer9, 6, 0, 131066);
                    if (ve2Var.d.contains("服务器配置")) {
                        composer9.startReplaceGroup(291537460);
                        TextKt.m3048TextNvy7gAk("本次包含服务器配置，本地服务器列表会按远端快照整体替换。", null, Color.m5151copywmQWz5c$default(materialTheme5.getColorScheme(composer9, i19).getOnSurface(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer9, i19).getBodySmall(), composer9, 6, 0, 131066);
                        composer9.endReplaceGroup();
                    } else {
                        composer9.startReplaceGroup(291869098);
                        composer9.endReplaceGroup();
                    }
                    composer9.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
