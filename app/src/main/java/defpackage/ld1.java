package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;


import com.dh.myembyapp.data.api.RetrofitClient;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ld1 {
    public static final void a(int i, Composer composer, String str, List list, Function1 function1) {
        int i2;
        Function1 function2;
        List list2 = list;
        Composer composerStartRestartGroup = composer.startRestartGroup(1581104707);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1581104707, i2, -1, "com.dh.myembyapp.ui.screens.person.MediaSection (PersonScreen.kt:220)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            long onBackground = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnBackground();
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float f = ioVar.g;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(12.0f)));
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, null, onBackground, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i3).getTitleLarge(), composerStartRestartGroup, i2 & 14, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f, f, Dp.m7813constructorimpl(48.0f), f);
            list2 = list;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list2) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function2 = function1;
                objRememberedValue = new vw0(10, list2, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function2 = function1;
            }
            LazyDslKt.LazyRow(null, null, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 24576, 491);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new px(str, list2, function2, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0285  */
    public static final void b(String str, String str2, Integer num, String str3, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        Composer composer2;
        MaterialTheme materialTheme;
        int i3;
        String str4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-851003738);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851003738, i2, -1, "com.dh.myembyapp.ui.screens.person.PersonHeader (PersonScreen.kt:142)");
            }
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            long onBackground = materialTheme2.getColorScheme(composerStartRestartGroup, i4).getOnBackground();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getTop(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = i2;
            CardKt.Card(FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(180.0f)), Dp.m7813constructorimpl(240.0f)), focusRequester), false, null, 3, null), null, null, CardDefaults.INSTANCE.m2120cardElevationaqJV_2Y(Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-834010372, true, new kd1(str, str2, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 22);
            Modifier modifierE = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
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
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, null, onBackground, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i4).getHeadlineMedium(), composerStartRestartGroup, i6 & 14, 0, 131066);
            Composer composer3 = composerStartRestartGroup;
            if (num == null) {
                composer3.startReplaceGroup(-1121731341);
                composer3.endReplaceGroup();
                materialTheme = materialTheme2;
                i3 = i4;
            } else {
                composer3.startReplaceGroup(-1121731340);
                materialTheme = materialTheme2;
                i3 = i4;
                TextKt.m3048TextNvy7gAk(String.valueOf(num.intValue()), null, Color.m5151copywmQWz5c$default(onBackground, 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i3).getTitleMedium(), composer3, 0, 0, 131066);
                Unit unit = Unit.INSTANCE;
                composer3.endReplaceGroup();
            }
            if (str3 != null) {
                composer3 = composer3;
                if (StringsKt.isBlank(str3)) {
                    composer3 = composer3;
                    str4 = null;
                } else {
                    str4 = str3;
                }
            } else {
                composer3 = composer3;
                str4 = null;
            }
            if (str4 == null) {
                composer3.startReplaceGroup(-1121429463);
                composer3.endReplaceGroup();
                composer2 = composer3;
            } else {
                composer3.startReplaceGroup(-1121429462);
                composer2 = composer3;
                TextKt.m3048TextNvy7gAk(str4, null, Color.m5151copywmQWz5c$default(onBackground, 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 4, 0, null, materialTheme.getTypography(composer3, i3).getBodyMedium(), composer2, 0, 24960, 110586);
                Unit unit2 = Unit.INSTANCE;
                composer2.endReplaceGroup();
            }
            if (x2.m(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(str, str2, num, str3, focusRequester, i, 10));
        }
    }

    public static final void c(String str, String str2, String str3, Function1 function1, Function0 function0, md1 md1Var, Composer composer, int i) {
        int i2;
        md1 md1Var2;
        int i3;
        md1 md1Var3;
        State state;
        Object obj;
        str2.getClass();
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(418623082);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i3 = i2 & (-458753);
                    md1Var3 = (md1) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(md1.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i2 & (-458753);
                md1Var3 = md1Var;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(418623082, i3, -1, "com.dh.myembyapp.ui.screens.person.PersonScreen (PersonScreen.kt:39)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(md1Var3.b, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(md1Var3.d, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(md1Var3.f, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(md1Var3.h, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(md1Var3.j, null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            boolean z = (57344 & i3) == 16384;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new n8(24, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 1);
            int i4 = i3 & 14;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(md1Var3) | (i4 == 4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new gq((ViewModel) md1Var3, str, (Continuation) null, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i4);
            Boolean bool = (Boolean) stateCollectAsState5.getValue();
            bool.getClass();
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState5);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                state = stateCollectAsState5;
                objRememberedValue5 = new ac(focusRequester, state, mutableState, (Continuation) null, 8);
                obj = null;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                state = stateCollectAsState5;
                obj = null;
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            boolean z2 = (i4 == 4) | ((i3 & 896) == 256);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = str3 != null ? RetrofitClient.INSTANCE.getPersonImageUrl(str, str3, HttpStatus.SC_BAD_REQUEST) : "";
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            String str4 = (String) objRememberedValue6;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            md1 md1Var4 = md1Var3;
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (((Boolean) state.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1528798959);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1528551579);
                Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f), 0.0f, 2, null);
                PaddingValues paddingValuesM996PaddingValuesa9UjIt4$default = PaddingKt.m996PaddingValuesa9UjIt4$default(0.0f, Dp.m7813constructorimpl(40.0f), 0.0f, Dp.m7813constructorimpl(24.0f), 5, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
                boolean zChanged2 = ((i3 & Input.Keys.FORWARD_DEL) == 32) | composerStartRestartGroup.changed(str4) | composerStartRestartGroup.changed(stateCollectAsState4) | composerStartRestartGroup.changed(stateCollectAsState3) | composerStartRestartGroup.changed(stateCollectAsState) | ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(stateCollectAsState2);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                    s21 s21Var = new s21(str2, str4, focusRequester, stateCollectAsState4, stateCollectAsState3, stateCollectAsState, function1, stateCollectAsState2);
                    composerStartRestartGroup.updateRememberedValue(s21Var);
                    objRememberedValue7 = s21Var;
                }
                LazyDslKt.LazyColumn(modifierM1001paddingVpY3zN4$default, null, paddingValuesM996PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue7, composerStartRestartGroup, 24966, 490);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            md1Var2 = md1Var4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            md1Var2 = md1Var;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(str, str2, str3, function1, function0, md1Var2, i));
        }
    }
}
