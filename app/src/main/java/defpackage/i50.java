package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.OpenInNewKt;
import androidx.compose.material.icons.filled.ArrowDownwardKt;
import androidx.compose.material.icons.filled.ArrowUpwardKt;
import androidx.compose.material.icons.filled.CheckKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i50 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ i50(boolean z, MutableState mutableState, int i) {
        this.a = i;
        this.b = z;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jM5189getWhite0d7_KjU;
        long jM5189getWhite0d7_KjU2;
        int i = this.a;
        MutableState mutableState = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1739481675, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.ExternalPlayerButton.<anonymous> (DetailScreen.kt:4300)");
                    }
                    ImageVector openInNew = OpenInNewKt.getOpenInNew(Icons.AutoMirrored.Filled.INSTANCE);
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f));
                    if (z) {
                        jM5189getWhite0d7_KjU = ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU();
                    } else {
                        jM5189getWhite0d7_KjU = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    u90.C(openInNew, "外部播放器", modifierM1064size3ABfNKs, jM5189getWhite0d7_KjU, z && !((Boolean) mutableState.getValue()).booleanValue(), composer, 432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2009922115, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.SortOrderCircleButton.<anonymous> (DetailScreen.kt:4585)");
                    }
                    Icons.Filled filled = Icons.INSTANCE.getDefault();
                    u90.C(z ? ArrowDownwardKt.getArrowDownward(filled) : ArrowUpwardKt.getArrowUpward(filled), z ? "标题倒序" : "标题正序", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f)), ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU(), !((Boolean) mutableState.getValue()).booleanValue(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-192188939, iIntValue3, -1, "com.dh.myembyapp.ui.screens.detail.MarkPlayedCircleButton.<anonymous> (DetailScreen.kt:4192)");
                    }
                    ImageVector check = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                    Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f));
                    if (z) {
                        jM5189getWhite0d7_KjU2 = ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU();
                    } else {
                        jM5189getWhite0d7_KjU2 = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    u90.C(check, "标记已观看", modifierM1064size3ABfNKs2, jM5189getWhite0d7_KjU2, z && !((Boolean) mutableState.getValue()).booleanValue(), composer3, 432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2071984780, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingToggleButton.<anonymous> (SubtitleSettings.kt:657)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer4, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                    mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("图形字幕亮度增强（全局）", null, hc2.q(48, 0, ((Boolean) mutableState.getValue()).booleanValue(), true), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24576, 0, 262122);
                    TextKt.m3048TextNvy7gAk(z ? "开" : "关", null, z ? ColorKt.Color(4283215696L) : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24576, 0, 262122);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            default:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1657025662, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:596)");
                    }
                    TextKt.m3048TextNvy7gAk("重置当前字幕设置", null, hc2.q(0, 0, ((Boolean) mutableState.getValue()).booleanValue(), !z), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
