package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class yz implements Function3 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ MutableState c;

    public yz(int i, MutableState mutableState, String str) {
        this.a = str;
        this.b = i;
        this.c = mutableState;
    }

    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object r14;
        boolean z;
        long jD;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((BoxScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1243473861, iIntValue, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen.ScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsScreen.kt:381)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(8.0f));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composer, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i2 = MaterialTheme.$stable;
            TextStyle bodyMedium = materialTheme.getTypography(composer, i2).getBodyMedium();
            long onSurface = materialTheme.getColorScheme(composer, i2).getOnSurface();
            String str = this.a;
            TextKt.m3048TextNvy7gAk("使用代理", null, Color.m5151copywmQWz5c$default(onSurface, StringsKt.isBlank(str) ? 0.4f : 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 6, 0, 131066);
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), Dp.m7813constructorimpl(24.0f));
            MutableState mutableState = this.c;
            Map map = (Map) mutableState.getValue();
            int i3 = this.b;
            Object obj4 = map.get(Integer.valueOf(i3));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.areEqual(obj4, bool) || StringsKt.isBlank(str)) {
                r14 = 0;
                z = true;
                composer.startReplaceGroup(-1823371806);
                jD = zc2.d(!StringsKt.isBlank(str), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1823508578);
                r14 = 0;
                z = true;
                jD = zc2.b(false, composer, 1);
                composer.endReplaceGroup();
            }
            Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, modifierM1050height3ABfNKs, jD), Dp.m7813constructorimpl(2.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Intrinsics.areEqual(((Map) mutableState.getValue()).get(Integer.valueOf(i3)), bool) ? companion2.getCenterEnd() : companion2.getCenterStart(), r14);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, r14);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(kb0.v(10.0f, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), zc2.c(StringsKt.isBlank(str) ^ z)), composer, r14);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
