package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ReplayKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.SyncKt;
import androidx.compose.material3.CheckboxKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ p1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-280812288, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.OtherServerSearchButton.<anonymous> (DetailScreen.kt:4111)");
            }
            ImageVector search = SearchKt.getSearch(Icons.INSTANCE.getDefault());
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f));
            MutableState mutableState = this.b;
            u90.C(search, "其他服资源", modifierM1064size3ABfNKs, ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU(), !((Boolean) mutableState.getValue()).booleanValue(), composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851660626, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.TraktWatchedSyncButton.<anonymous> (DetailScreen.kt:4151)");
            }
            ImageVector sync = SyncKt.getSync(Icons.INSTANCE.getDefault());
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f));
            MutableState mutableState = this.b;
            u90.C(sync, "Trakt 已看同步", modifierM1064size3ABfNKs, ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU(), !((Boolean) mutableState.getValue()).booleanValue(), composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(830999120, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.ExternalPlayerErrorContent.<anonymous>.<anonymous> (DetailScreen.kt:4551)");
            }
            TextKt.m3048TextNvy7gAk("重试", null, ((Boolean) this.b.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 130042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(589253488, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.RestartButton.<anonymous> (DetailScreen.kt:4075)");
            }
            ImageVector replay = ReplayKt.getReplay(Icons.INSTANCE.getDefault());
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f));
            MutableState mutableState = this.b;
            u90.C(replay, null, modifierM1064size3ABfNKs, ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.INSTANCE.m5189getWhite0d7_KjU(), !((Boolean) mutableState.getValue()).booleanValue(), composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1326312855, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.SeasonSelectionDialog.<anonymous>.<anonymous> (DetailScreen.kt:3405)");
            }
            TextKt.m3048TextNvy7gAk("取消", null, ((Boolean) this.b.getValue()).booleanValue() ? u90.c : u90.j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262138);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-466863392, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeVersionDialog.<anonymous>.<anonymous> (DetailScreen.kt:9133)");
            }
            TextKt.m3048TextNvy7gAk("取消", null, ((Boolean) this.b.getValue()).booleanValue() ? u90.c : u90.j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262138);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1786856595, iIntValue, -1, "com.dh.myembyapp.dlna.DlnaSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DlnaSettingsScreen.kt:178)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("取消", null, hc2.k(jc2.c, ((Boolean) this.b.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1599905194, iIntValue, -1, "com.dh.myembyapp.dlna.DlnaSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DlnaSettingsScreen.kt:227)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) this.b.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object i(Object obj, Object obj2, Object obj3) {
        long jM5151copywmQWz5c$default;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-224246341, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.FavoriteRowMoreButton.<anonymous> (FavoritePage.kt:718)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int iM7703getCentere0LSkKk = TextAlign.INSTANCE.m7703getCentere0LSkKk();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i2 = MaterialTheme.$stable;
            TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer, i2).getTitleMedium(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646139, null);
            if (((Boolean) this.b.getValue()).booleanValue()) {
                jM5151copywmQWz5c$default = kb0.u(composer, -1233232490, materialTheme, composer, i2);
            } else {
                composer.startReplaceGroup(-1233151518);
                jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceGroup();
            }
            TextKt.m3048TextNvy7gAk("更\n多\n内\n容", null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(iM7703getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj, Object obj2, Object obj3) {
        long jM5151copywmQWz5c$default;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-470860992, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.LibraryRowMoreButton.<anonymous> (HomeScreen.kt:2764)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int iM7703getCentere0LSkKk = TextAlign.INSTANCE.m7703getCentere0LSkKk();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i2 = MaterialTheme.$stable;
            TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer, i2).getTitleMedium(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646139, null);
            if (((Boolean) this.b.getValue()).booleanValue()) {
                jM5151copywmQWz5c$default = kb0.u(composer, 629674173, materialTheme, composer, i2);
            } else {
                composer.startReplaceGroup(629755145);
                jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null);
                composer.endReplaceGroup();
            }
            TextKt.m3048TextNvy7gAk("更\n多\n内\n容", null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(iM7703getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1948714450, iIntValue, -1, "com.dh.myembyapp.ui.components.InterfaceSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InterfaceSettingsDialog.kt:324)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("取消", null, hc2.k(jc2.c, ((Boolean) this.b.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1086935291, iIntValue, -1, "com.dh.myembyapp.ui.components.InterfaceSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InterfaceSettingsDialog.kt:367)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) this.b.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object m(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-560948455, iIntValue, -1, "com.dh.myembyapp.ui.components.IntroOutroSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IntroOutroSettingsDialog.kt:345)");
            }
            TextKt.m3048TextNvy7gAk("保存", null, hc2.n(((Boolean) this.b.getValue()).booleanValue(), false, 2), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24582, 0, 262122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(481946160, iIntValue, -1, "com.dh.myembyapp.ui.components.IntroOutroSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IntroOutroSettingsDialog.kt:314)");
            }
            TextKt.m3048TextNvy7gAk("取消", null, hc2.q(0, 2, ((Boolean) this.b.getValue()).booleanValue(), false), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24582, 0, 262122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jU;
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-737736330, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:509)");
                    }
                    String str = (String) mutableState.getValue();
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new t1(3, mutableState);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    p2.b(str, (Function1) objRememberedValue, "路径（可选）", "常用于反向代理", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, composer, 28080, 224);
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
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(883343218, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:567)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
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
                    CheckboxKt.Checkbox(((Boolean) mutableState.getValue()).booleanValue(), null, null, false, null, null, composer2, 48, 60);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(8.0f)), composer2, 6);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("仅直连（不使用代理）", null, materialTheme.getColorScheme(composer2, i3).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodyMedium(), composer2, 6, 0, 131066);
                    composer2.endNode();
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
                ((BoxScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1914846151, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:656)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion4.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer3, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    CheckboxKt.Checkbox(((Boolean) mutableState.getValue()).booleanValue(), null, null, false, null, null, composer3, 48, 60);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(8.0f)), composer3, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion3);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme2.getTypography(composer3, i6).getBodyMedium();
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(-1369552316);
                        jU = materialTheme2.getColorScheme(composer3, i6).getError();
                        composer3.endReplaceGroup();
                    } else {
                        jU = kb0.u(composer3, -1369551128, materialTheme2, composer3, i6);
                    }
                    TextKt.m3048TextNvy7gAk("信任所有SSL证书（不安全）", null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer3, 6, 0, 131066);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(493728796);
                        TextKt.m3048TextNvy7gAk("⚠️ 仅用于自签名证书，会降低安全性", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer3, i6).getError(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i6).getBodySmall(), composer3, 6, 0, 131066);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(494046019);
                        composer3.endReplaceGroup();
                    }
                    if (x2.m(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1990833775, iIntValue4, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:607)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion7.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composer4, 48);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs3);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
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
                    mr.z(companion8, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    CheckboxKt.Checkbox(((Boolean) mutableState.getValue()).booleanValue(), null, null, false, null, null, composer4, 48, 60);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(8.0f)), composer4, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion6);
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion8, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i8), composerM4318constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i9 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("STRM直链播放", null, materialTheme3.getColorScheme(composer4, i9).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer4, i9).getBodyMedium(), composer4, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk("开启后，此服务器的STRM文件会优先尝试直链播放，不清楚请不要开启", null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composer4, i9).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer4, i9).getBodySmall(), composer4, 6, 0, 131066);
                    if (x2.m(composer4)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-705139943, iIntValue5, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:412)");
                    }
                    String str2 = (String) mutableState.getValue();
                    Object objRememberedValue2 = composer5.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new t1(5, mutableState);
                        composer5.updateRememberedValue(objRememberedValue2);
                    }
                    p2.b(str2, (Function1) objRememberedValue2, "备注（可选）", "例如：家里主服、走专线、朋友共享", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, composer5, 28080, 224);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Function2 function2 = (Function2) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= composer6.changedInstance(function2) ? 4 : 2;
                }
                if (composer6.shouldExecute((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(651652630, iIntValue6, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchInputBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AggregateSearchContent.kt:662)");
                    }
                    if (((TextFieldValue) mutableState.getValue()).getText().length() == 0) {
                        composer6.startReplaceGroup(131434725);
                        MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                        int i10 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk("输入影片名称", null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composer6, i10).getOnSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer6, i10).getBodyLarge(), composer6, 6, 0, 131066);
                        composer6.endReplaceGroup();
                    } else {
                        composer6.startReplaceGroup(131713260);
                        composer6.endReplaceGroup();
                    }
                    if (id.u(composer6, iIntValue6 & 14, function2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1637224008, iIntValue7, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous>.<anonymous> (AppUpdateSupport.kt:494)");
                    }
                    TextKt.m3048TextNvy7gAk("取消下载", null, hc2.k(jc2.c, ((Boolean) mutableState.getValue()).booleanValue(), false, composer7, 6, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 6, 0, 262138);
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
                ((RowScope) obj).getClass();
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(734012184, iIntValue8, -1, "com.dh.myembyapp.ui.components.BufferSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BufferSettingsDialog.kt:247)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i11 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxSize$default);
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
                    mr.z(companion9, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl6, Integer.valueOf(i11), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer8, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodyMedium(), composer8, 6, 0, 130042);
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
                ((RowScope) obj).getClass();
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2038284571, iIntValue9, -1, "com.dh.myembyapp.ui.components.DanmakuSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSearchDialog.kt:432)");
                    }
                    TextKt.m3048TextNvy7gAk("搜索", null, hc2.n(((Boolean) mutableState.getValue()).booleanValue(), false, 2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer9, 6, 0, 262138);
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
                ((RowScope) obj).getClass();
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1200176585, iIntValue10, -1, "com.dh.myembyapp.ui.components.DanmakuSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSearchDialog.kt:902)");
                    }
                    TextKt.m3048TextNvy7gAk("取消", null, hc2.q(0, 2, ((Boolean) mutableState.getValue()).booleanValue(), false), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer10, 6, 0, 262138);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Function2 function3 = (Function2) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                function3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= composer11.changedInstance(function3) ? 4 : 2;
                }
                if (composer11.shouldExecute((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1510484064, iIntValue11, -1, "com.dh.myembyapp.ui.components.DanmakuSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSearchDialog.kt:373)");
                    }
                    if (((String) mutableState.getValue()).length() == 0) {
                        composer11.startReplaceGroup(458539389);
                        TextKt.m3048TextNvy7gAk("点击输入搜索名称", null, Color.INSTANCE.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer11, MaterialTheme.$stable).getBodyLarge(), composer11, 390, 0, 131066);
                        composer11.endReplaceGroup();
                    } else {
                        composer11.startReplaceGroup(458866594);
                        composer11.endReplaceGroup();
                    }
                    if (id.u(composer11, iIntValue11 & 14, function3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1672985625, iIntValue12, -1, "com.dh.myembyapp.ui.components.DanmakuSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:336)");
                    }
                    TextKt.m3048TextNvy7gAk("确定", null, hc2.n(((Boolean) mutableState.getValue()).booleanValue(), false, 2), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 24582, 0, 262122);
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
                ((RowScope) obj).getClass();
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1374830302, iIntValue13, -1, "com.dh.myembyapp.ui.components.DanmakuSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:294)");
                    }
                    TextKt.m3048TextNvy7gAk("取消", null, hc2.q(0, 2, ((Boolean) mutableState.getValue()).booleanValue(), false), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer13, 24582, 0, 262122);
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
                ((RowScope) obj).getClass();
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-443694660, iIntValue14, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen.ScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsScreen.kt:467)");
                    }
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i12 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer14, modifierFillMaxSize$default2);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion10.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor7);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer14);
                    mr.z(companion10, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl7, Integer.valueOf(i12), composerM4318constructorimpl7));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("取消", null, hc2.k(jc2.c, ((Boolean) mutableState.getValue()).booleanValue(), false, composer14, 6, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer14, MaterialTheme.$stable).getTitleMedium(), composer14, 6, 0, 131066);
                    composer14.endNode();
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
                ((RowScope) obj).getClass();
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1174907763, iIntValue15, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen.ScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsScreen.kt:517)");
                    }
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0);
                    int i13 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer15.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default3);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion11.getConstructor();
                    if (composer15.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer15.startReusableNode();
                    if (composer15.getInserting()) {
                        composer15.createNode(constructor8);
                    } else {
                        composer15.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer15);
                    mr.z(companion11, composerM4318constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl8, Integer.valueOf(i13), composerM4318constructorimpl8));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer15, 6, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer15, MaterialTheme.$stable).getTitleMedium(), composer15, 6, 0, 131066);
                    composer15.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                return b(obj, obj2, obj3);
            case 17:
                return c(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return e(obj, obj2, obj3);
            case 20:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return i(obj, obj2, obj3);
            case 24:
                return j(obj, obj2, obj3);
            case 25:
                return k(obj, obj2, obj3);
            case 26:
                return l(obj, obj2, obj3);
            case 27:
                return m(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-731807525, iIntValue16, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleConfigDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleConfigDialog.kt:287)");
                    }
                    TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer16, 6, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer16, 6, 0, 262138);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
