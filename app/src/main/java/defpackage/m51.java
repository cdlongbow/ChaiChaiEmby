package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m51 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, Function1 function4, Function0 function5, Composer composer, int i2) {
        int i3;
        Composer composer2;
        char c;
        Object obj;
        Object obj2;
        List list;
        List list2;
        function5.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-688865543);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        char c2 = ' ';
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function5) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-688865543, i3, -1, "com.dh.myembyapp.ui.components.MoreMenuOverlay (MoreMenuOverlay.kt:35)");
            }
            boolean z = ((i3 & 14) == 4) | ((i3 & Input.Keys.FORWARD_DEL) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                if (function0 != null) {
                    listCreateListBuilder.add(new j51("视频版本", new n8(17, function0)));
                }
                if (function1 != null) {
                    listCreateListBuilder.add(new j51("转码质量", new n8(18, function1)));
                }
                if (function2 != null) {
                    listCreateListBuilder.add(new j51("片头片尾", new n8(19, function2)));
                }
                if (function3 != null) {
                    listCreateListBuilder.add(new j51("其他配置", new n8(20, function3)));
                }
                objRememberedValue = CollectionsKt.build(listCreateListBuilder);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list3 = (List) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(list3.size());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                int size = list3.size();
                ArrayList arrayList = new ArrayList(size);
                int i4 = 0;
                while (i4 < size) {
                    arrayList.add(new FocusRequester());
                    i4++;
                    c2 = c2;
                }
                c = c2;
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                c = ' ';
                obj = objRememberedValue2;
            }
            List list4 = (List) obj;
            boolean zChanged2 = composerStartRestartGroup.changed(list3.size()) | ((57344 & i3) == 16384);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = Integer.valueOf(RangesKt.coerceIn(i, 0, RangesKt.coerceAtLeast(list3.size() - 1, 0)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            boolean zChanged3 = composerStartRestartGroup.changed(list3.size());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = mr.l(iIntValue, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numValueOf2 = Integer.valueOf(list3.size());
            int i5 = i3 & 3670016;
            int i6 = i3 & 458752;
            boolean zChangedInstance = (i6 == 131072) | composerStartRestartGroup.changedInstance(list3) | (i5 == 1048576) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(iIntValue);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new q3(list3, function5, function4, iIntValue, mutableState, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (Function2) objRememberedValue5, composerStartRestartGroup, 0);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = mr.l(-1, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue6;
            Integer numValueOf3 = Integer.valueOf(((Number) mutableState2.getValue()).intValue());
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(list3);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                obj2 = null;
                objRememberedValue7 = new fp0(list3, mutableState2, null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                obj2 = null;
            }
            EffectsKt.LaunchedEffect(numValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj2);
            boolean zChanged4 = (i5 == 1048576) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(list3) | (i6 == 131072) | composerStartRestartGroup.changedInstance(list4);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new l51(function5, list3, function4, list4, mutableState, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default, (Function1) objRememberedValue8);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPreviewKeyEvent);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(BackgroundKt.m274backgroundbw27NRU(PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(320.0f)), 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), 1, null), tg1.a, tg1.b), Dp.m7813constructorimpl(24.0f));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(list3) | composerStartRestartGroup.changedInstance(list4) | composerStartRestartGroup.changed(mutableState) | (i6 == 131072);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new cx(list3, list4, mutableState, function4, 1);
                list = list3;
                list2 = list4;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                list = list3;
                list2 = list4;
            }
            List list5 = list2;
            LazyDslKt.LazyColumn(modifierM999padding3ABfNKs, null, null, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue9, composerStartRestartGroup, 24576, 494);
            Composer composer3 = composerStartRestartGroup;
            composer3.endNode();
            Integer numValueOf4 = Integer.valueOf(iIntValue);
            Integer numValueOf5 = Integer.valueOf(list.size());
            boolean zChangedInstance4 = composer3.changedInstance(list) | composer3.changed(iIntValue) | composer3.changedInstance(list5);
            Object objRememberedValue10 = composer3.rememberedValue();
            if (zChangedInstance4 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new ac(list, iIntValue, list5, (Continuation) null);
                composer3.updateRememberedValue(objRememberedValue10);
            }
            EffectsKt.LaunchedEffect(numValueOf4, numValueOf5, (Function2) objRememberedValue10, composer3, 0);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            Composer composer4 = composerStartRestartGroup;
            composer4.skipToGroupEnd();
            composer2 = composer4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k51(function0, function1, function2, function3, i, function4, function5, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }
}
