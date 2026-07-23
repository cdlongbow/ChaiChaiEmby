package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d2(long j, MutableState mutableState, MutableState mutableState2) {
        this.b = j;
        this.c = mutableState;
        this.d = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2130471093, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:328)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextStyle titleMedium = materialTheme.getTypography(composer, i3).getTitleMedium();
                    long j2 = this.b;
                    TextKt.m3048TextNvy7gAk("📱 手机扫码配置", null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleMedium, composer, 6, 0, 131066);
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), composer, 6);
                    Bitmap bitmap = (Bitmap) mutableState.getValue();
                    bitmap.getClass();
                    ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "配置二维码", SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(220.0f)), null, null, 0.0f, null, 0, composer, 432, 248);
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), composer, 6);
                    String str = (String) mutableState2.getValue();
                    if (str == null) {
                        composer.startReplaceGroup(527420639);
                        composer.endReplaceGroup();
                        j = j2;
                    } else {
                        composer.startReplaceGroup(527420640);
                        j = j2;
                        TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(j2, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, 0, 0, 131066);
                        composer.endReplaceGroup();
                    }
                    id.i(12.0f, companion, composer, 6);
                    TextKt.m3048TextNvy7gAk("扫码后填写的内容会实时同步到右侧表单", PaddingKt.m1001paddingVpY3zN4$default(companion, Dp.m7813constructorimpl(8.0f), 0.0f, 2, null), Color.m5151copywmQWz5c$default(j, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, 54, 0, 130040);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Function2 function2 = (Function2) obj5;
                String str2 = (String) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1906362437, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.PlaybackErrorActionButton.<anonymous>.<anonymous> (PlaybackErrorDialog.kt:364)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    float fM7813constructorimpl = Dp.m7813constructorimpl(8.0f);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Arrangement.Horizontal horizontalM713spacedByD5KLDUw = arrangement.m713spacedByD5KLDUw(fM7813constructorimpl, companion3.getCenterHorizontally());
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM713spacedByD5KLDUw, centerVertically, composer2, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (function2 != null) {
                        composer2.startReplaceGroup(1758047890);
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(companion4, Dp.m7813constructorimpl(18.0f));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1050height3ABfNKs);
                        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion5, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        c61.r(composer2, 0, function2);
                    } else {
                        composer2.startReplaceGroup(1758217987);
                        composer2.endReplaceGroup();
                    }
                    TextKt.m3048TextNvy7gAk(str2, null, this.b, null, TextUnitKt.getSp(15), null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 1597440, 24576, 245674);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d2(Function2 function2, String str, long j) {
        this.c = function2;
        this.d = str;
        this.b = j;
    }
}
