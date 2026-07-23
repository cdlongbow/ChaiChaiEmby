package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.FontDownloadKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt implements Function3 {
    public final /* synthetic */ int a;

    public /* synthetic */ jt(int i) {
        this.a = i;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1920127217, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$-1920127217.<anonymous> (SubtitleSettings.kt:577)");
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(12.0f)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(120086989, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$120086989.<anonymous> (SubtitleSettings.kt:607)");
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(8.0f)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1007289556, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$-1007289556.<anonymous> (SubtitleSettings.kt:611)");
            }
            TextKt.m3048TextNvy7gAk("按返回键关闭", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 261096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(214128528, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$214128528.<anonymous> (SubtitleSettings.kt:368)");
            }
            TextKt.m3048TextNvy7gAk("时间偏移（+延后，-提前）", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((LazyItemScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(738447192, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$738447192.<anonymous> (SubtitleSettings.kt:392)");
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(12.0f)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-41089370, iIntValue, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$WebDavSyncDialogKt.lambda$-41089370.<anonymous> (WebDavSyncDialog.kt:431)");
            }
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(12.0f));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), Alignment.INSTANCE.getStart(), composer, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i2 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk("同步说明", null, materialTheme.getColorScheme(composer, i2).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getTitleSmall(), composer, 6, 0, 131066);
            TextKt.m3048TextNvy7gAk("固定目录：ChaiChaiEmby", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 0, 0, 131066);
            TextKt.m3048TextNvy7gAk("文件名称：sync-config.json", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 0, 0, 131066);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(903242616, iIntValue, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$MilkTeaSupportDialogKt.lambda$903242616.<anonymous> (MilkTeaSupportDialog.kt:130)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), Dp.m7813constructorimpl(20.0f));
                    MeasurePolicy measurePolicyP = mr.p(16.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterHorizontally(), composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyP, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(zr1.payment_qr, composer, 0);
                    ContentScale fit = ContentScale.INSTANCE.getFit();
                    Modifier modifierClip = ClipKt.clip(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(340.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)));
                    float fM7813constructorimpl = Dp.m7813constructorimpl(1.0f);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    ImageKt.Image(painterPainterResource, "赞赏二维码", BorderKt.m286borderxT4_qwU(modifierClip, fM7813constructorimpl, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOutline(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f))), (Alignment) null, fit, 0.0f, (ColorFilter) null, composer, Painter.$stable | 24624, 104);
                    TextStyle bodyMedium = materialTheme.getTypography(composer, i2).getBodyMedium();
                    long onSurface = materialTheme.getColorScheme(composer, i2).getOnSurface();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    TextKt.m3048TextNvy7gAk("如果佬友觉得软件好用，可以请作者喝奶茶哦。", null, onSurface, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(companion3.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, bodyMedium, composer, 6, 0, 130042);
                    TextKt.m3048TextNvy7gAk("软件功能不会受到打赏而影响，打赏仅仅是对作者的支持和鼓励", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(companion3.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodySmall(), composer, 6, 0, 130042);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1993234132, iIntValue2, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$MoreMenuOverlayKt.lambda$1993234132.<anonymous> (MoreMenuOverlay.kt:150)");
                    }
                    TextKt.m3048TextNvy7gAk("更多", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 7, null), Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getHeadlineSmall(), composer2, 438, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1150373734, iIntValue3, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$OnlineSubtitleSearchDialogKt.lambda$1150373734.<anonymous> (OnlineSubtitleSearchDialog.kt:608)");
                    }
                    Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, Dp.m7813constructorimpl(4.0f), 5, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1003paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("正在加载更多结果...", null, Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 390, 0, 131066);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(151781698, iIntValue4, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$151781698.<anonymous> (ServerListScreen.kt:951)");
                    }
                    TextKt.m3048TextNvy7gAk("+ 添加服务器", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleLarge(), composer4, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(923658924, iIntValue5, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$923658924.<anonymous> (ServerListScreen.kt:1330)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor3);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion7, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i4), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyP2 = mr.p(12.0f, Arrangement.INSTANCE, companion6.getCenterHorizontally(), composer5, 54);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, companion5);
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor4);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion7, composerM4318constructorimpl4, measurePolicyP2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i5), composerM4318constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ImageVector add = AddKt.getAdd(Icons.INSTANCE.getDefault());
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(48.0f));
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    IconKt.m2496Iconww6aTOc(add, "添加服务器", modifierM1064size3ABfNKs, materialTheme2.getColorScheme(composer5, i6).getOnSecondaryContainer(), composer5, 432, 0);
                    TextKt.m3048TextNvy7gAk("添加新服务器", null, materialTheme2.getColorScheme(composer5, i6).getOnSecondaryContainer(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer5, i6).getTitleMedium(), composer5, 6, 0, 131066);
                    if (x2.m(composer5)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-538600749, iIntValue6, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$SubtitleFontManagerDialogKt.lambda$-538600749.<anonymous> (SubtitleFontManagerDialog.kt:128)");
                    }
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(14.0f), 0.0f, 2, null);
                    MeasurePolicy measurePolicyQ = mr.q(10.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterVertically(), composer6, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifierM1001paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor5);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer6);
                    mr.z(companion8, composerM4318constructorimpl5, measurePolicyQ, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i7), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageVector fontDownload = FontDownloadKt.getFontDownload(Icons.INSTANCE.getDefault());
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    IconKt.m2496Iconww6aTOc(fontDownload, (String) null, (Modifier) null, materialTheme3.getColorScheme(composer6, i8).getOnSurface(), composer6, 48, 4);
                    TextKt.m3048TextNvy7gAk("手机扫码上传字体", null, materialTheme3.getColorScheme(composer6, i8).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i8).getBodyMedium(), composer6, 6, 0, 131066);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-42858137, iIntValue7, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$SubtitleFontManagerDialogKt.lambda$-42858137.<anonymous> (SubtitleFontManagerDialog.kt:168)");
                    }
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i9 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("暂无已导入字体", PaddingKt.m1001paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(8.0f), 1, null), Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composer7, i9).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer7, i9).getBodySmall(), composer7, 54, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1018468985, iIntValue8, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$SubtitleFontManagerDialogKt.lambda$1018468985.<anonymous> (SubtitleFontManagerDialog.kt:320)");
                    }
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i10 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxSize$default2);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor6);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer8);
                    mr.z(companion9, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl6, Integer.valueOf(i10), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    IconKt.m2496Iconww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOnSurface(), composer8, 48, 4);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1306478645, iIntValue9, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$-1306478645.<anonymous> (SubtitleSettings.kt:356)");
                    }
                    TextKt.m3048TextNvy7gAk("字幕设置", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(16.0f), 7, null), Color.INSTANCE.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer9, 1597878, 0, 262056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-863687530, iIntValue10, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$-863687530.<anonymous> (SubtitleSettings.kt:428)");
                    }
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(12.0f)), composer10, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1664754891, iIntValue11, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$-1664754891.<anonymous> (SubtitleSettings.kt:432)");
                    }
                    BoxKt.Box(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(1.0f)), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer11, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1829145044, iIntValue12, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$1829145044.<anonymous> (SubtitleSettings.kt:440)");
                    }
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(12.0f)), composer12, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(436400825, iIntValue13, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$436400825.<anonymous> (SubtitleSettings.kt:446)");
                    }
                    TextKt.m3048TextNvy7gAk("字幕颜色", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer13, 25014, 0, 262120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1795463297, iIntValue14, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$1795463297.<anonymous> (SubtitleSettings.kt:461)");
                    }
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(16.0f)), composer14, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(978365533, iIntValue15, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$978365533.<anonymous> (SubtitleSettings.kt:483)");
                    }
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(8.0f)), composer15, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(367460358, iIntValue16, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$367460358.<anonymous> (SubtitleSettings.kt:486)");
                    }
                    TextKt.m3048TextNvy7gAk("图形字幕亮度（全局）", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer16, 25014, 0, 262120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1694674689, iIntValue17, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$1694674689.<anonymous> (SubtitleSettings.kt:513)");
                    }
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(16.0f)), composer17, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer18.shouldExecute((iIntValue18 & 17) != 16, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-578211788, iIntValue18, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$-578211788.<anonymous> (SubtitleSettings.kt:518)");
                    }
                    TextKt.m3048TextNvy7gAk("垂直偏移", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer18, 25014, 0, 262120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer19.shouldExecute((iIntValue19 & 17) != 16, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1462002418, iIntValue19, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$1462002418.<anonymous> (SubtitleSettings.kt:551)");
                    }
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(16.0f)), composer19, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer20 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer20.shouldExecute((iIntValue20 & 17) != 16, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(334625873, iIntValue20, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$SubtitleSettingsKt.lambda$334625873.<anonymous> (SubtitleSettings.kt:555)");
                    }
                    TextKt.m3048TextNvy7gAk("大小缩放", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer20, 25014, 0, 262120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                return a(obj, obj2, obj3);
            case 21:
                return b(obj, obj2, obj3);
            case 22:
                return c(obj, obj2, obj3);
            case 23:
                return d(obj, obj2, obj3);
            case 24:
                return e(obj, obj2, obj3);
            case 25:
                return f(obj, obj2, obj3);
            case 26:
                return DragGestureDetectorKt.detectDragGestures$lambda$6((PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
            case 27:
                return Operation.TestOperation._init_$lambda$0((Applier) obj, (SlotTableEditor) obj2, (RememberManager) obj3);
            case 28:
                return androidx.compose.runtime.composer.gapbuffer.changelist.Operation.TestOperation._init_$lambda$0((Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
            default:
                return SliderDefaults.TrackImpl_xlyIBlM$lambda$44$lambda$43((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }
}
