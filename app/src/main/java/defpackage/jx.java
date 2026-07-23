package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;

import com.dh.myembyapp.data.preferences.DanmakuPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jx {
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
    public static final void a(final boolean z, final boolean z2, final DanmakuPreferences danmakuPreferences, final uw uwVar, final int i, final Function1 function1, final Function0 function0, final Function0 function2, final Function0 function3, final Function1 function4, final Function0 function5, Composer composer, final int i2, final int i3) {
        int i4;
        Function1 function6;
        int i5;
        Composer composer2;
        String str;
        String str2;
        Object obj;
        MutableState mutableState;
        MutableState mutableState2;
        Continuation continuation;
        Composer composer3;
        uwVar.getClass();
        function0.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1306143275);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(uwVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function6 = function1;
            i4 |= composerStartRestartGroup.changedInstance(function6) ? 131072 : 65536;
        } else {
            function6 = function1;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function5) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783251) == 306783250 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306143275, i4, i5, "com.dh.myembyapp.ui.screens.player.components.DanmakuMenuOverlay (DanmakuMenuOverlay.kt:68)");
            }
            boolean z3 = ((i4 & 14) == 4) | ((i4 & Input.Keys.FORWARD_DEL) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (z) {
                    str2 = "关";
                    str = "开";
                } else {
                    str = "关";
                    str2 = str;
                }
                objRememberedValue = CollectionsKt.listOf((Object[]) new bx[]{new bx("显示弹幕", str, function2), new bx("开启自动匹配", z2 ? "开" : str2, new jp(2, z2, function4)), new bx("搜索弹幕", null, function0), new bx("弹幕设置", null, function3)});
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(list.size());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue2;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                int i6 = 0;
                while (i6 < size) {
                    arrayList.add(new FocusRequester());
                    i6++;
                    size = size;
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue2;
            List list2 = (List) obj;
            boolean zChanged2 = composerStartRestartGroup.changed(list.size()) | ((i4 & 57344) == 16384);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = Integer.valueOf(RangesKt.coerceIn(i, 0, RangesKt.coerceAtLeast(list.size() - 1, 0)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            boolean zChanged3 = composerStartRestartGroup.changed(list.size());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = mr.l(iIntValue, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            boolean z4 = uwVar.g > 0;
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numValueOf2 = Integer.valueOf(list.size());
            boolean zChanged4 = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changedInstance(list);
            int i7 = i4 & 458752;
            boolean zChanged5 = zChanged4 | (i7 == 131072) | composerStartRestartGroup.changed(iIntValue);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new gx(list, function6, iIntValue, mutableState3, null, 0);
                mutableState = mutableState3;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState = mutableState3;
            }
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (Function2) objRememberedValue5, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            boolean zChanged6 = ((i5 & 14) == 4) | composerStartRestartGroup.changed(mutableState) | (i7 == 131072) | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changedInstance(r18);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableState4 = mutableState;
                objRememberedValue6 = new hx(function5, function1, list2, r18, mutableState4);
                mutableState2 = mutableState4;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                mutableState2 = mutableState;
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default, (Function1) objRememberedValue6);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MutableState mutableState5 = mutableState2;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(BackgroundKt.m274backgroundbw27NRU(PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(320.0f)), 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), 1, null), tg1.a, tg1.b), Dp.m7813constructorimpl(24.0f));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM999padding3ABfNKs);
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
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            TextStyle headlineSmall = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineSmall();
            Color.Companion companion4 = Color.INSTANCE;
            TextKt.m3048TextNvy7gAk("弹幕", PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(16.0f), 7, null), companion4.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, headlineSmall, composerStartRestartGroup, 438, 0, 131064);
            Modifier modifierF = wn.F(columnScopeInstance, companion, 1.0f, false, 2, null);
            PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(8.0f), 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(r18) | composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changedInstance(list2) | (i7 == 131072);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new cx(r18, list2, mutableState5, function1, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            LazyDslKt.LazyColumn(modifierF, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue7, composerStartRestartGroup, 24960, 490);
            id.i(12.0f, companion, composerStartRestartGroup, 6);
            if (z4) {
                composerStartRestartGroup.startReplaceGroup(-1070442042);
                continuation = null;
                SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), ColorKt.Color(4280690214L), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1200679459, true, new a5(uwVar, 10), composerStartRestartGroup, 54), composerStartRestartGroup, 12583302, 120);
                Composer composer4 = composerStartRestartGroup;
                composer4.endReplaceGroup();
                composer3 = composer4;
            } else {
                continuation = null;
                composerStartRestartGroup.startReplaceGroup(-1068623892);
                TextKt.m3048TextNvy7gAk("提示：可在“弹幕设置”里调整速度、大小、延迟等参数", null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composerStartRestartGroup, i10).getBodySmall(), 0L, 0L, FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 390, 0, 131066);
                Composer composer5 = composerStartRestartGroup;
                composer5.endReplaceGroup();
                composer3 = composer5;
            }
            composer3.endNode();
            composer3.endNode();
            Integer numValueOf3 = Integer.valueOf(r20);
            Integer numValueOf4 = Integer.valueOf(r18.size());
            boolean zChangedInstance2 = composer3.changedInstance(r18) | composer3.changedInstance(list2) | composer3.changed(r20);
            Object objRememberedValue8 = composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new ix(list, list2, iIntValue, continuation, 0);
                composer3.updateRememberedValue(objRememberedValue8);
            }
            EffectsKt.LaunchedEffect(numValueOf3, numValueOf4, (Function2) objRememberedValue8, composer3, 0);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            Composer composer6 = composerStartRestartGroup;
            composer6.skipToGroupEnd();
            composer2 = composer6;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: dx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    jx.a(z, z2, danmakuPreferences, uwVar, i, function1, function0, function2, function3, function4, function5, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }
}
