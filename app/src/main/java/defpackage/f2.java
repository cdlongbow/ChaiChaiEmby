package defpackage;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoPrioritySortType;
import com.dh.myembyapp.data.model.VideoQualityStandard;
import com.dh.myembyapp.data.model.VideoValueSortDirection;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f2(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableIntState mutableIntState) {
        this.a = 2;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableIntState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long onSurfaceVariant;
        int i = this.a;
        Object obj3 = this.b;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                Context context = (Context) obj8;
                String str = (String) obj7;
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                lz0 lz0Var = (lz0) obj5;
                Function0 function0 = (Function0) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1328907537, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous> (AddServerScreen.kt:827)");
                    }
                    boolean zChangedInstance = composer.changedInstance(context) | composer.changed(str) | composer.changedInstance(coroutineScope) | composer.changedInstance(lz0Var) | composer.changed(function0);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        w1 w1Var = new w1(context, str, coroutineScope, function0, lz0Var, mutableState);
                        composer.updateRememberedValue(w1Var);
                        objRememberedValue = w1Var;
                    }
                    hc2.d("删除", (Function0) objRememberedValue, SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(120.0f)), false, 0L, 0.0f, 0.0f, composer, 390, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Function1 function1 = (Function1) obj8;
                FocusRequester focusRequester = (FocusRequester) obj7;
                FocusRequester focusRequester2 = (FocusRequester) obj6;
                Function1 function2 = (Function1) obj5;
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = (MutableState) obj4;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1880170654, iIntValue2, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchInputBar.<anonymous>.<anonymous> (AggregateSearchContent.kt:619)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
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
                    ImageVector search = SearchKt.getSearch(Icons.INSTANCE.getDefault());
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(-1970689615);
                        onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1970601110);
                        onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant();
                        composer2.endReplaceGroup();
                    }
                    IconKt.m2496Iconww6aTOc(search, (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(24.0f)), onSurfaceVariant, composer2, 432, 0);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(12.0f)), composer2, 6);
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState3.getValue();
                    boolean zChanged = composer2.changed(function1);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new r7(function1, mutableState3, 0);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function3 = (Function1) objRememberedValue2;
                    Modifier modifierE = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
                    if (focusRequester != null) {
                        modifierE = FocusPropertiesKt.focusProperties(modifierE, new h5(focusRequester, 1));
                    }
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierE, focusRequester2);
                    boolean zChanged2 = composer2.changed(function2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new s7(function2, mutableState2, mutableState3, 0);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue3);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    yc2.a(textFieldValue, function3, modifierOnFocusChanged, false, new TextStyle(materialTheme.getColorScheme(composer2, i3).getOnSurface(), TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), new SolidColor(materialTheme.getColorScheme(composer2, i3).getOnSurface(), null), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(651652630, true, new p1(5, mutableState3), composer2, 54), composer2, 100663296, RendererCapabilities.DECODER_SUPPORT_MASK, 3784);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                MutableState mutableState4 = (MutableState) obj8;
                MutableState mutableState5 = (MutableState) obj7;
                MutableState mutableState6 = (MutableState) obj6;
                MutableState mutableState7 = (MutableState) obj5;
                MutableIntState mutableIntState = (MutableIntState) obj4;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                if (((Boolean) ((MutableState) obj3).getValue()).booleanValue() && str2 != null && !StringsKt.isBlank(str2)) {
                    mutableState4.setValue(new ai0(str2, str3));
                    mutableState5.setValue(null);
                    mutableState6.setValue(null);
                    u90.v(mutableState7, true);
                    mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                }
                break;
            case 3:
                String str4 = (String) obj7;
                final VideoPriorityRule videoPriorityRule = (VideoPriorityRule) obj8;
                FocusRequester focusRequester3 = (FocusRequester) obj6;
                Function1 function4 = (Function1) obj5;
                final Function0 function5 = (Function0) obj4;
                Map map = (Map) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(426404864, iIntValue3, -1, "com.dh.myembyapp.ui.components.VideoPriorityOrderDialog.<anonymous> (OtherSettingsOverlay.kt:1395)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    Color.Companion companion4 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion4.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    final Function1 function6 = function4;
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(320.0f)), ColorKt.Color(4280032284L)), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion5.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs);
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
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk(str4, null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 24960, 0, 262122);
                    if (videoPriorityRule.getSortType() == VideoPrioritySortType.QUALITY) {
                        composer3.startReplaceGroup(-1139694529);
                        int i6 = 0;
                        for (VideoQualityStandard videoQualityStandard : VideoQualityStandard.getEntries()) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            VideoQualityStandard videoQualityStandard2 = videoQualityStandard;
                            String label = videoQualityStandard2.getLabel();
                            Integer num = (Integer) map.get(videoQualityStandard2);
                            int iIntValue4 = num != null ? num.intValue() : 1;
                            FocusRequester focusRequester4 = i6 == 0 ? focusRequester3 : null;
                            Function1 function7 = function6;
                            boolean zChangedInstance2 = composer3.changedInstance(map) | composer3.changed(videoQualityStandard2.ordinal()) | composer3.changed(function7) | composer3.changedInstance(videoPriorityRule);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new gh(12, map, videoQualityStandard2, function7, videoPriorityRule);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            cc1.u(label, iIntValue4, 3, null, focusRequester4, (Function0) objRememberedValue4, composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                            i6 = i7;
                            function6 = function7;
                        }
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1138601376);
                        VideoValueSortDirection videoValueSortDirection = VideoValueSortDirection.DESCENDING;
                        String label2 = videoValueSortDirection.getLabel();
                        boolean z = videoPriorityRule.getValueSortDirection() == videoValueSortDirection;
                        boolean zChanged3 = composer3.changed(function6) | composer3.changedInstance(videoPriorityRule) | composer3.changed(function5);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            final int i8 = 0;
                            objRememberedValue5 = new Function0() { // from class: ob1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i9 = i8;
                                    Function0 function8 = function5;
                                    Function1 function9 = function6;
                                    switch (i9) {
                                        case 0:
                                            function9.invoke(VideoPriorityRule.copy$default(videoPriorityRule, null, null, VideoValueSortDirection.DESCENDING, 3, null));
                                            function8.invoke();
                                            break;
                                        default:
                                            function9.invoke(VideoPriorityRule.copy$default(videoPriorityRule, null, null, VideoValueSortDirection.ASCENDING, 3, null));
                                            function8.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        cc1.d(label2, z, focusRequester3, (Function0) objRememberedValue5, composer3, 0, 0);
                        VideoValueSortDirection videoValueSortDirection2 = VideoValueSortDirection.ASCENDING;
                        String label3 = videoValueSortDirection2.getLabel();
                        boolean z2 = videoPriorityRule.getValueSortDirection() == videoValueSortDirection2;
                        boolean zChanged4 = composer3.changed(function6) | composer3.changedInstance(videoPriorityRule) | composer3.changed(function5);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            final int i9 = 1;
                            objRememberedValue6 = new Function0() { // from class: ob1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i10 = i9;
                                    Function0 function8 = function5;
                                    Function1 function9 = function6;
                                    switch (i10) {
                                        case 0:
                                            function9.invoke(VideoPriorityRule.copy$default(videoPriorityRule, null, null, VideoValueSortDirection.DESCENDING, 3, null));
                                            function8.invoke();
                                            break;
                                        default:
                                            function9.invoke(VideoPriorityRule.copy$default(videoPriorityRule, null, null, VideoValueSortDirection.ASCENDING, 3, null));
                                            function8.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        cc1.d(label3, z2, null, (Function0) objRememberedValue6, composer3, 0, 4);
                        composer3.endReplaceGroup();
                    }
                    if (x2.m(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            default:
                ColorScheme colorScheme = (ColorScheme) obj8;
                AppThemePreset appThemePreset = (AppThemePreset) obj7;
                DarkThemeStyle darkThemeStyle = (DarkThemeStyle) obj6;
                DarkThemeGlowPosition darkThemeGlowPosition = (DarkThemeGlowPosition) obj5;
                gb gbVar = (gb) obj4;
                Function2 function8 = (Function2) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(365760165, iIntValue5, -1, "com.dh.myembyapp.ui.theme.MyEmbyAppTheme.<anonymous> (Theme.kt:201)");
                    }
                    MaterialThemeKt.MaterialTheme(colorScheme, null, ad2.a, ComposableLambdaKt.rememberComposableLambda(805248121, true, new oh(appThemePreset, darkThemeStyle, darkThemeGlowPosition, gbVar, function8, 5), composer4, 54), composer4, 3456, 2);
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

    public /* synthetic */ f2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
        this.h = obj5;
        this.b = obj6;
    }

    public /* synthetic */ f2(String str, VideoPriorityRule videoPriorityRule, FocusRequester focusRequester, Function1 function1, Function0 function0, Map map) {
        this.a = 3;
        this.d = str;
        this.c = videoPriorityRule;
        this.e = focusRequester;
        this.g = function1;
        this.h = function0;
        this.b = map;
    }

    public /* synthetic */ f2(Function1 function1, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function2, MutableState mutableState, MutableState mutableState2) {
        this.a = 1;
        this.c = function1;
        this.d = focusRequester;
        this.e = focusRequester2;
        this.g = function2;
        this.b = mutableState;
        this.h = mutableState2;
    }
}
