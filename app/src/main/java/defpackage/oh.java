package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.MediaSource;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ oh(u61 u61Var, FocusRequester focusRequester, List list, Function0 function0, MutableIntState mutableIntState) {
        this.a = 2;
        this.c = u61Var;
        this.b = focusRequester;
        this.e = list;
        this.d = function0;
        this.g = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier.Companion companion;
        Modifier modifierM275backgroundbw27NRU$default;
        int i = this.a;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj7;
                Function0 function0 = (Function0) obj6;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Function0 function1 = (Function0) obj5;
                Function0 function2 = (Function0) obj4;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(758973747, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteImportConfirmDialog.<anonymous> (BackupRouteManagerDialog.kt:1144)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default2 = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM275backgroundbw27NRU$default2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(460.0f)), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(790353723, true, new n1(str, function0, focusRequester, function1, function2, 1), composer, 54), composer, 196614, 26);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                u61 u61Var = (u61) obj7;
                List list = (List) obj6;
                Set set = (Set) obj5;
                Function2 function3 = (Function2) obj4;
                FocusRequester focusRequester2 = (FocusRequester) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229627430, iIntValue2, -1, "com.dh.myembyapp.ui.components.LibraryVisibilityDialog.<anonymous> (LibraryVisibilityDialog.kt:68)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default3 = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default3);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(420.0f)), 0.0f, Dp.m7813constructorimpl(520.0f), 1, null), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-340180510, true, new f20(list, set, function3, focusRequester2), composer2, 54), composer2, 196614, 26);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                u61 u61Var2 = (u61) obj7;
                FocusRequester focusRequester3 = (FocusRequester) obj3;
                List list2 = (List) obj5;
                Function0 function4 = (Function0) obj6;
                MutableIntState mutableIntState = (MutableIntState) obj4;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2047112576, iIntValue3, -1, "com.dh.myembyapp.ui.components.MilkTeaSupportDialog.<anonymous> (MilkTeaSupportDialog.kt:84)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierFocusable$default = FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), u61Var2.a, null, 2, null), focusRequester3), false, null, 3, null);
                    boolean zChangedInstance = composer3.changedInstance(list2) | composer3.changed(function4);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new p41(list2, function4, mutableIntState);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFocusable$default, (Function1) objRememberedValue);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierOnPreviewKeyEvent);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
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
                    mr.z(companion7, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i4), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(560.0f)), 0.0f, Dp.m7813constructorimpl(640.0f), 1, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14), null, null, kt.a, composer3, 196614, 24);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4((Modifier) obj7, (MutableState) obj5, (Function2) obj4, (BasicTextContextMenuProvider) obj3, (Function0) obj6, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                MediaSource mediaSource = (MediaSource) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                mediaSource.getClass();
                ((ak1) obj7).invoke(mediaSource, bool, (List) obj4);
                ((Function1) obj3).invoke(Boolean.FALSE);
                ((Function0) obj6).invoke();
                ((Function0) obj5).invoke();
                return Unit.INSTANCE;
            default:
                AppThemePreset appThemePreset = (AppThemePreset) obj7;
                DarkThemeStyle darkThemeStyle = (DarkThemeStyle) obj6;
                DarkThemeGlowPosition darkThemeGlowPosition = (DarkThemeGlowPosition) obj5;
                gb gbVar = (gb) obj4;
                Function2 function5 = (Function2) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(805248121, iIntValue4, -1, "com.dh.myembyapp.ui.theme.MyEmbyAppTheme.<anonymous>.<anonymous> (Theme.kt:205)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion9.getConstructor();
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
                    mr.z(companion9, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl4, Integer.valueOf(i5), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    int i6 = m72.$EnumSwitchMapping$0[appThemePreset.ordinal()];
                    if (i6 == 1) {
                        composer4.startReplaceGroup(672025464);
                        l72.a(darkThemeStyle, darkThemeGlowPosition, SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                        composer4.endReplaceGroup();
                    } else {
                        if (i6 != 2) {
                            composer4.startReplaceGroup(1407150144);
                            composer4.endReplaceGroup();
                            qu.f();
                            return null;
                        }
                        composer4.startReplaceGroup(672353816);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null);
                        Brush brushB = l72.b(gbVar);
                        if (brushB != null) {
                            companion = companion8;
                            modifierM275backgroundbw27NRU$default = BackgroundKt.background$default(companion, brushB, null, 0.0f, 6, null);
                            if (modifierM275backgroundbw27NRU$default == null) {
                            }
                            BoxKt.Box(modifierFillMaxSize$default2.then(modifierM275backgroundbw27NRU$default), composer4, 0);
                            composer4.endReplaceGroup();
                        } else {
                            companion = companion8;
                        }
                        modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(companion, gbVar.a, null, 2, null);
                        BoxKt.Box(modifierFillMaxSize$default2.then(modifierM275backgroundbw27NRU$default), composer4, 0);
                        composer4.endReplaceGroup();
                    }
                    if (id.o(composer4, 0, function5)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ oh(ak1 ak1Var, List list, Function1 function1, Function0 function0, Function0 function2) {
        this.a = 4;
        this.c = ak1Var;
        this.g = list;
        this.b = function1;
        this.d = function0;
        this.e = function2;
    }

    public /* synthetic */ oh(Modifier modifier, MutableState mutableState, Function2 function2, BasicTextContextMenuProvider basicTextContextMenuProvider, Function0 function0) {
        this.a = 3;
        this.c = modifier;
        this.e = mutableState;
        this.g = function2;
        this.b = basicTextContextMenuProvider;
        this.d = function0;
    }

    public /* synthetic */ oh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
        this.b = obj5;
    }

    public /* synthetic */ oh(String str, Function0 function0, FocusRequester focusRequester, Function0 function1, Function0 function2) {
        this.a = 0;
        this.c = str;
        this.d = function0;
        this.b = focusRequester;
        this.e = function1;
        this.g = function2;
    }
}
