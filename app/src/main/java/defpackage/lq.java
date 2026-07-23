package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
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
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lq {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1690810342);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1690810342, i3, -1, "com.dh.myembyapp.ui.screens.collection.CollectionBackButton (CollectionDetailScreen.kt:315)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(28.0f));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierThen = BorderKt.border(BackgroundKt.m275backgroundbw27NRU$default(ClipKt.clip(companion2, roundedCornerShapeM1312RoundedCornerShape0680j_4), ((Boolean) mutableState.getValue()).booleanValue() ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.34f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(((Boolean) mutableState.getValue()).booleanValue() ? 2.0f : 1.0f), ((Boolean) mutableState.getValue()).booleanValue() ? u61Var.b : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), roundedCornerShapeM1312RoundedCornerShape0680j_4).then(companion2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new zh(7, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen, (Function1) objRememberedValue3);
            int i4 = i3 & Input.Keys.FORWARD_DEL;
            boolean z = i4 == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new fq(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue4);
            boolean z2 = i4 == 32;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new n8(2, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(ClickableKt.m306clickableO2vRcR0$default(modifierOnPreviewKeyEvent, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue5, 28, null), Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(10.0f));
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageVector arrowBack = ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE);
            Color.Companion companion4 = Color.INSTANCE;
            IconKt.m2496Iconww6aTOc(arrowBack, "返回", SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(22.0f)), companion4.m5189getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium();
            long jM5189getWhite0d7_KjU = companion4.m5189getWhite0d7_KjU();
            i2 = 1;
            TextKt.m3048TextNvy7gAk("返回", null, jM5189getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleMedium, composerStartRestartGroup, 390, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i2 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm(i, i2, function0));
        }
    }

    public static final void b(MediaItem mediaItem, Composer composer, int i) {
        int i2;
        String primary;
        Composer composerStartRestartGroup = composer.startRestartGroup(1318500828);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(mediaItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1318500828, i2, -1, "com.dh.myembyapp.ui.screens.collection.CollectionBackdrop (CollectionDetailScreen.kt:205)");
            }
            List<String> backdropImageTags = mediaItem.getBackdropImageTags();
            if (backdropImageTags == null || (primary = (String) CollectionsKt.firstOrNull((List) backdropImageTags)) == null) {
                ImageTags imageTags = mediaItem.getImageTags();
                primary = imageTags != null ? imageTags.getPrimary() : null;
            }
            List<String> backdropImageTags2 = mediaItem.getBackdropImageTags();
            String str = (backdropImageTags2 != null ? (String) CollectionsKt.firstOrNull((List) backdropImageTags2) : null) != null ? "Backdrop" : "Primary";
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.INSTANCE;
            Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, companion2.m5178getBlack0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM275backgroundbw27NRU$default);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (primary == null) {
                composerStartRestartGroup.startReplaceGroup(-1841871113);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1841871112);
                g12.a(RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), str, primary, 1920), null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ContentScale.INSTANCE.getCrop(), composerStartRestartGroup, 14156208, 1848);
                composerStartRestartGroup.endReplaceGroup();
            }
            BoxKt.Box(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 6);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Brush.Companion companion4 = Brush.INSTANCE;
            BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default2, Brush.Companion.m5113verticalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.44f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 6);
            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Brush.Companion.m5105horizontalGradient8A3gB4$default(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.52f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yc(mediaItem, i, 2));
        }
    }

    public static final void c(final MediaItem mediaItem, final List list, final List list2, final String str, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1457731986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(mediaItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function2 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        } else {
            function2 = function1;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1457731986, i2, -1, "com.dh.myembyapp.ui.screens.collection.CollectionDetailContent (CollectionDetailScreen.kt:138)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            final int size = list2.size() + list.size();
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new gq(str, focusRequester, (Continuation) null, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i2 >> 9) & 14);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            b(mediaItem, composerStartRestartGroup, i2 & 14);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(34.0f), Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(42.0f));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(28.0f));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(mediaItem) | composerStartRestartGroup.changed(size) | composerStartRestartGroup.changedInstance(list) | (i3 == 2048) | ((57344 & i2) == 16384) | composerStartRestartGroup.changedInstance(list2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                final Function1 function3 = function2;
                Function1 function4 = new Function1() { // from class: dq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        lazyListScope.getClass();
                        MediaItem mediaItem2 = mediaItem;
                        int i5 = size;
                        final int i6 = 1;
                        d.a(lazyListScope, "header", null, ComposableLambdaKt.composableLambdaInstance(-987855927, true, new vh(mediaItem2, i5, focusRequester)), 2, null);
                        final List list3 = list;
                        boolean zIsEmpty = list3.isEmpty();
                        final String str2 = str;
                        final Function1 function5 = function3;
                        if (!zIsEmpty) {
                            final int i7 = 0;
                            d.a(lazyListScope, "movies", null, ComposableLambdaKt.composableLambdaInstance(984839204, true, new Function3() { // from class: eq
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i8 = i7;
                                    LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i8) {
                                        case 0:
                                            lazyItemScope.getClass();
                                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(984839204, iIntValue, -1, "com.dh.myembyapp.ui.screens.collection.CollectionDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollectionDetailScreen.kt:171)");
                                                }
                                                lq.g("电影", list3, str2, function5, composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer3.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            lazyItemScope.getClass();
                                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-204297317, iIntValue, -1, "com.dh.myembyapp.ui.screens.collection.CollectionDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollectionDetailScreen.kt:182)");
                                                }
                                                lq.g("剧集", list3, str2, function5, composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer3.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 2, null);
                        }
                        final List list4 = list2;
                        if (!list4.isEmpty()) {
                            d.a(lazyListScope, "series", null, ComposableLambdaKt.composableLambdaInstance(-204297317, true, new Function3() { // from class: eq
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i8 = i6;
                                    LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i8) {
                                        case 0:
                                            lazyItemScope.getClass();
                                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(984839204, iIntValue, -1, "com.dh.myembyapp.ui.screens.collection.CollectionDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollectionDetailScreen.kt:171)");
                                                }
                                                lq.g("电影", list4, str2, function5, composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer3.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            lazyItemScope.getClass();
                                            if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-204297317, iIntValue, -1, "com.dh.myembyapp.ui.screens.collection.CollectionDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollectionDetailScreen.kt:182)");
                                                }
                                                lq.g("剧集", list4, str2, function5, composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer3.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 2, null);
                        }
                        if (i5 == 0) {
                            d.a(lazyListScope, "empty", null, xs.a, 2, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function4);
                objRememberedValue3 = function4;
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue3, composer2, 24966, 490);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh((Object) mediaItem, (Object) list, (Object) list2, (Object) str, function1, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, Function1 function1, Function0 function0, qq qqVar, Composer composer, int i) {
        int i2;
        qq qqVar2;
        int i3;
        boolean z;
        int i4;
        int i5;
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-85193061);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                i3 = 1;
                z = false;
                i4 = 32;
                qq qqVar3 = (qq) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(qq.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                i5 = i2 & (-7169);
                qqVar2 = qqVar3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i5 = i2 & (-7169);
                z = false;
                i3 = 1;
                i4 = 32;
                qqVar2 = qqVar;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-85193061, i5, -1, "com.dh.myembyapp.ui.screens.collection.CollectionDetailScreen (CollectionDetailScreen.kt:58)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(qqVar2.d, null, composerStartRestartGroup, z ? 1 : 0, i3);
            Object[] objArr = new Object[i3];
            objArr[z ? 1 : 0] = str;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new b1(23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue, composerStartRestartGroup, 48);
            int i6 = i5 & 14;
            int i7 = (composerStartRestartGroup.changedInstance(qqVar2) ? 1 : 0) | (i6 == 4 ? i3 : z ? 1 : 0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i7 != 0 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new gq((ViewModel) qqVar2, str, (Continuation) null, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i6);
            int i8 = (i5 & 896) == 256 ? i3 : z ? 1 : 0;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new n8(i3, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.BackHandler(z, (Function0) objRememberedValue3, composerStartRestartGroup, z ? 1 : 0, i3);
            pq pqVar = (pq) stateCollectAsState.getValue();
            if (pqVar instanceof nq) {
                composerStartRestartGroup.startReplaceGroup(339754616);
                Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i3, null), Color.INSTANCE.m5178getBlack0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), z);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, z ? 1 : 0);
                int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> i4));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM275backgroundbw27NRU$default);
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
                mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i9), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else if (pqVar instanceof mq) {
                composerStartRestartGroup.startReplaceGroup(340065143);
                e(((mq) pqVar).a, function0, composerStartRestartGroup, (i5 >> 3) & Input.Keys.FORWARD_DEL);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(pqVar instanceof oq)) {
                    composerStartRestartGroup.startReplaceGroup(-266136530);
                    composerStartRestartGroup.endReplaceGroup();
                    qu.f();
                    return;
                }
                composerStartRestartGroup.startReplaceGroup(340263202);
                oq oqVar = (oq) pqVar;
                int i10 = i5;
                MediaItem mediaItem = oqVar.a;
                List list = oqVar.b;
                List list2 = oqVar.c;
                String str2 = (String) mutableState.getValue();
                boolean zChanged = composerStartRestartGroup.changed(mutableState);
                if ((i10 & Input.Keys.FORWARD_DEL) == i4) {
                    z = true;
                }
                boolean z2 = (zChanged ? 1 : 0) | z;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z2 != 0 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new r7(function1, mutableState, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                c(mediaItem, list, list2, str2, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            qqVar2 = qqVar;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5((Object) str, (Object) function1, function0, (Object) qqVar2, i, 6));
        }
    }

    public static final void e(String str, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-768605563);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-768605563, i2, -1, "com.dh.myembyapp.ui.screens.collection.CollectionErrorContent (CollectionDetailScreen.kt:110)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.INSTANCE;
            Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, companion2.m5178getBlack0d7_KjU(), null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM275backgroundbw27NRU$default);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyP = mr.p(18.0f, Arrangement.INSTANCE, companion3.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyP, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyLarge(), composerStartRestartGroup, (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
            composer2 = composerStartRestartGroup;
            function1 = function0;
            a(function1, composer2, i2 & Input.Keys.FORWARD_DEL);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = function0;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d8(str, function1, i, 1));
        }
    }

    public static final void f(MediaItem mediaItem, int i, FocusRequester focusRequester, Composer composer, int i2) {
        MediaItem mediaItem2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1738071640);
        if ((i2 & 6) == 0) {
            mediaItem2 = mediaItem;
            i3 = (composerStartRestartGroup.changedInstance(mediaItem2) ? 4 : 2) | i2;
        } else {
            mediaItem2 = mediaItem;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & Input.Keys.NUMPAD_3) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1738071640, i3, -1, "com.dh.myembyapp.ui.screens.collection.CollectionHeader (CollectionDetailScreen.kt:265)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
            Modifier modifierFocusable$default = FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(companion, focusRequester), false, null, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusable$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion3, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
            String name = mediaItem2.getName();
            if (StringsKt.isBlank(name)) {
                name = "合集";
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i7 = MaterialTheme.$stable;
            TextStyle headlineLarge = materialTheme.getTypography(composerStartRestartGroup, i7).getHeadlineLarge();
            Color.Companion companion4 = Color.INSTANCE;
            long jM5189getWhite0d7_KjU = companion4.m5189getWhite0d7_KjU();
            TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
            TextKt.m3048TextNvy7gAk(name, null, jM5189getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, companion5.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, headlineLarge, composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
            TextKt.m3048TextNvy7gAk(x2.f(i, "包含 ", " 个项目"), null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i7).getTitleMedium(), composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            String overview = mediaItem.getOverview();
            if (overview == null || StringsKt.isBlank(overview)) {
                overview = null;
            }
            if (overview == null) {
                composerStartRestartGroup.startReplaceGroup(1219499599);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1219499600);
                composer2 = composerStartRestartGroup;
                String str = overview;
                TextKt.m3048TextNvy7gAk(str, SizeKt.m1071widthInVpY3zN4$default(companion, 0.0f, Dp.m7813constructorimpl(980.0f), 1, null), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.84f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion5.m7761getEllipsisgIe3tQ8(), false, 3, 0, null, materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium(), composer2, 432, 24960, 110584);
                Unit unit = Unit.INSTANCE;
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jh(mediaItem, i, focusRequester, i2, 2));
        }
    }

    public static final void g(String str, List list, String str2, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        char c;
        int i3;
        Object iqVar;
        int i4;
        int i5;
        LazyListState lazyListState;
        FocusRequester focusRequester;
        Composer composerStartRestartGroup = composer.startRestartGroup(1748904214);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i2;
        if (composerStartRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1748904214, i6, -1, "com.dh.myembyapp.ui.screens.collection.CollectionMediaRow (CollectionDetailScreen.kt:380)");
            }
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
            int i7 = i6 & 896;
            boolean zChanged = (i7 == 256) | composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                if (str2 == null) {
                    c = ' ';
                    i3 = -1;
                    break;
                }
                Iterator it = list.iterator();
                i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        c = ' ';
                        i3 = -1;
                        break;
                    } else {
                        c = ' ';
                        if (Intrinsics.areEqual(((MediaItem) it.next()).getId(), str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                objRememberedValue2 = Integer.valueOf(i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                c = ' ';
            }
            int iIntValue = ((Number) objRememberedValue2).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numValueOf2 = Integer.valueOf(list.size());
            boolean zChanged2 = composerStartRestartGroup.changed(iIntValue) | (i7 == 256) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i4 = 0;
                i5 = 1;
                iqVar = new iq(iIntValue, str2, lazyListStateRememberLazyListState, focusRequester2, null);
                lazyListState = lazyListStateRememberLazyListState;
                focusRequester = focusRequester2;
                composerStartRestartGroup.updateRememberedValue(iqVar);
            } else {
                lazyListState = lazyListStateRememberLazyListState;
                focusRequester = focusRequester2;
                iqVar = objRememberedValue3;
                i4 = 0;
                i5 = 1;
            }
            EffectsKt.LaunchedEffect(numValueOf, str2, numValueOf2, (Function2) iqVar, composerStartRestartGroup, (i6 >> 3) & Input.Keys.FORWARD_DEL);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFocusGroup = FocusableKt.focusGroup(SizeKt.fillMaxWidth$default(companion2, 0.0f, i5, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            float fA = ioVar.a(Dp.m7813constructorimpl(14.0f));
            float f = ioVar.f;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(fA), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i4);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i4);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusGroup);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleLarge(), composerStartRestartGroup, (i6 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f, f, Dp.m7813constructorimpl(48.0f), f);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | (i7 == 256) | ((i6 & 7168) == 2048);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                g9 g9Var = new g9(list, str2, focusRequester, function1, 3);
                composerStartRestartGroup.updateRememberedValue(g9Var);
                objRememberedValue4 = g9Var;
            }
            LazyDslKt.LazyRow(modifierFillMaxWidth$default, lazyListState, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 24582, 488);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5(str, list, str2, function1, i, 5));
        }
    }
}
