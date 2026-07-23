package defpackage;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vj0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z, final String str, final List list, String str2, final Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        LazyGridState lazyGridState;
        List list2;
        Object[] objArr;
        int i6;
        final MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        final FocusRequester focusRequester;
        Composer composerStartRestartGroup = composer.startRestartGroup(634674248);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634674248, i2, -1, "com.dh.myembyapp.ui.screens.home.FavoriteGridContent (FavoritePage.kt:746)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            final float f = ioVar.c;
            LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue4;
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                i3 = 1;
                i4 = i2;
                i5 = 0;
                objRememberedValue5 = CollectionsKt___CollectionsKt.joinToString$default(list, "|", null, null, 0, null, new vi0(1), 30, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                i5 = 0;
                i3 = 1;
                i4 = i2;
            }
            String str3 = (String) objRememberedValue5;
            int size = list.size();
            MediaItem mediaItem = (MediaItem) CollectionsKt.firstOrNull(list);
            boolean zChanged2 = composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(mediaItem != null ? mediaItem.getId() : null);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new LinkedHashSet();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Set set = (Set) objRememberedValue6;
            boolean zChanged3 = composerStartRestartGroup.changed(lazyGridStateRememberLazyGridState) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(set) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue7 == companion.getEmpty()) {
                jj0 jj0Var = new jj0(lazyGridStateRememberLazyGridState, list, set, context, null, 0);
                lazyGridState = lazyGridStateRememberLazyGridState;
                list2 = list;
                composerStartRestartGroup.updateRememberedValue(jj0Var);
                objRememberedValue7 = jj0Var;
            } else {
                list2 = list;
                lazyGridState = lazyGridStateRememberLazyGridState;
            }
            EffectsKt.LaunchedEffect(lazyGridState, list2, (Function2) objRememberedValue7, composerStartRestartGroup, (i4 >> 3) & Input.Keys.FORWARD_DEL);
            Object[] objArr2 = new Object[4];
            objArr2[i5] = Boolean.valueOf(z);
            objArr2[i3] = str2;
            objArr2[2] = str3;
            objArr2[3] = str;
            boolean z2 = (((((i4 & 14) == 4 ? i3 : i5) | ((i4 & 7168) == 2048 ? i3 : i5)) | (composerStartRestartGroup.changedInstance(list2) ? 1 : 0)) == true ? 1 : 0) | (composerStartRestartGroup.changed(lazyGridState) ? 1 : 0);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z2 != 0 || objRememberedValue8 == companion.getEmpty()) {
                objArr = objArr2;
                i6 = i5;
                mutableState = mutableState6;
                objRememberedValue8 = new kj0(z, str2, list2, lazyGridState, mutableState5, mutableState4, mutableState, focusRequester2, null);
                mutableState2 = mutableState5;
                mutableState3 = mutableState4;
                focusRequester = focusRequester2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                objArr = objArr2;
                i6 = i5;
                focusRequester = focusRequester2;
                mutableState3 = mutableState4;
                mutableState2 = mutableState5;
                mutableState = mutableState6;
            }
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, i6);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i3, null);
            final LazyGridState lazyGridState2 = lazyGridState;
            final MutableState mutableState7 = mutableState3;
            final MutableState mutableState8 = mutableState2;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(749426206, i3, new Function3() { // from class: cj0
                /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
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
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wj0 wj0Var;
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScope.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer3.changed(boxWithConstraintsScope) ? 4 : 2;
                    }
                    if (composer3.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(749426206, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.FavoriteGridContent.<anonymous> (FavoritePage.kt:824)");
                        }
                        float fMo734getMaxWidthD9Ej5fM = boxWithConstraintsScope.mo734getMaxWidthD9Ej5fM();
                        float fM7813constructorimpl = Dp.m7813constructorimpl(24.0f);
                        float fM7813constructorimpl2 = Dp.m7813constructorimpl(24.0f);
                        if (Dp.m7812compareTo0680j_4(fMo734getMaxWidthD9Ej5fM, Dp.m7813constructorimpl(0.0f)) > 0) {
                            float fM7813constructorimpl3 = Dp.m7813constructorimpl(0.0f);
                            float f2 = f;
                            if (Dp.m7812compareTo0680j_4(f2, fM7813constructorimpl3) <= 0) {
                                wj0Var = new wj0(1, fM7813constructorimpl, fM7813constructorimpl2);
                            } else {
                                int iCoerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int) (Dp.m7813constructorimpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(fMo734getMaxWidthD9Ej5fM - Dp.m7813constructorimpl(fM7813constructorimpl * 2.0f))), Dp.m7811boximpl(f2))).m7827unboximpl() + fM7813constructorimpl2) / Dp.m7813constructorimpl(f2 + fM7813constructorimpl2)), 1), 12);
                                wj0Var = new wj0(iCoerceAtMost, ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(fMo734getMaxWidthD9Ej5fM - Dp.m7813constructorimpl(Dp.m7813constructorimpl((iCoerceAtMost - 1) * fM7813constructorimpl2) + Dp.m7813constructorimpl(f2 * iCoerceAtMost))) / 2.0f)), Dp.m7811boximpl(fM7813constructorimpl))).m7827unboximpl(), fM7813constructorimpl2);
                            }
                        } else {
                            wj0Var = new wj0(1, fM7813constructorimpl, fM7813constructorimpl2);
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default2);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
                        mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        float fM7813constructorimpl4 = Dp.m7813constructorimpl(14.0f);
                        float fM7813constructorimpl5 = Dp.m7813constructorimpl(8.0f);
                        float f3 = wj0Var.b;
                        Modifier modifierM1002paddingqDBjuR0 = PaddingKt.m1002paddingqDBjuR0(modifierFillMaxWidth$default, f3, fM7813constructorimpl4, f3, fM7813constructorimpl5);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1002paddingqDBjuR0);
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
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getCenter());
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i9 = MaterialTheme.$stable;
                        wj0 wj0Var2 = wj0Var;
                        TextKt.m3048TextNvy7gAk(str, modifierAlign, materialTheme.getColorScheme(composer3, i9).getOnBackground(), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i9).getTitleMedium(), composer3, 0, 0, 130040);
                        List list3 = list;
                        TextKt.m3048TextNvy7gAk(x2.f(list3.size(), "共 ", " 项"), boxScopeInstance.align(companion2, companion3.getCenterEnd()), materialTheme.getColorScheme(composer3, i9).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i9).getTitleSmall(), composer3, 0, 0, 131064);
                        composer3.endNode();
                        GridCells.Fixed fixed = new GridCells.Fixed(wj0Var2.a);
                        PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f3, Dp.m7813constructorimpl(Dp.m7813constructorimpl(16.0f) + ioVar.f), f3, Dp.m7813constructorimpl(14.0f));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(wj0Var2.c);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f));
                        boolean zChangedInstance = composer3.changedInstance(list3);
                        Function1 function2 = function1;
                        boolean zChanged4 = zChangedInstance | composer3.changed(function2);
                        Object objRememberedValue9 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            f4 f4Var = new f4(list3, mutableState7, mutableState8, focusRequester, function2, mutableState);
                            composer3.updateRememberedValue(f4Var);
                            objRememberedValue9 = f4Var;
                        }
                        LazyGridDslKt.LazyVerticalGrid(fixed, null, lazyGridState2, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_5, horizontalOrVerticalM712spacedBy0680j_4, null, false, null, (Function1) objRememberedValue9, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 914);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifierFillMaxSize$default, null, false, composableLambdaRememberComposableLambda, composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el(z, str, list, str2, function1, i, 1));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x029e  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:142:0x0349  */
    /* JADX WARN: Code duplicated, block: B:144:0x035a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0370  */
    /* JADX WARN: Code duplicated, block: B:153:0x0386 A[LOOP:0: B:148:0x036a->B:153:0x0386, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:167:0x0408  */
    /* JADX WARN: Code duplicated, block: B:170:0x040f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0428  */
    /* JADX WARN: Code duplicated, block: B:181:0x043c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0443  */
    /* JADX WARN: Code duplicated, block: B:192:0x045c  */
    /* JADX WARN: Code duplicated, block: B:195:0x046d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0474  */
    /* JADX WARN: Code duplicated, block: B:206:0x048e  */
    /* JADX WARN: Code duplicated, block: B:209:0x049f  */
    /* JADX WARN: Code duplicated, block: B:212:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:220:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:228:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:231:0x0508  */
    /* JADX WARN: Code duplicated, block: B:239:0x052b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0535  */
    /* JADX WARN: Code duplicated, block: B:248:0x054a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0562  */
    /* JADX WARN: Code duplicated, block: B:257:0x057e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0581  */
    /* JADX WARN: Code duplicated, block: B:261:0x0590  */
    /* JADX WARN: Code duplicated, block: B:262:0x0593  */
    /* JADX WARN: Code duplicated, block: B:269:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:273:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:276:0x05df  */
    /* JADX WARN: Code duplicated, block: B:277:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:282:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:287:0x0629  */
    /* JADX WARN: Code duplicated, block: B:288:0x062c  */
    /* JADX WARN: Code duplicated, block: B:293:0x063b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0654  */
    /* JADX WARN: Code duplicated, block: B:302:0x066a  */
    /* JADX WARN: Code duplicated, block: B:303:0x066d  */
    /* JADX WARN: Code duplicated, block: B:308:0x067d  */
    /* JADX WARN: Code duplicated, block: B:313:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:321:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:324:0x0722  */
    /* JADX WARN: Code duplicated, block: B:325:0x0725  */
    /* JADX WARN: Code duplicated, block: B:330:0x074e  */
    /* JADX WARN: Code duplicated, block: B:336:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:339:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:340:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:343:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:346:0x0825  */
    /* JADX WARN: Code duplicated, block: B:349:0x0831  */
    /* JADX WARN: Code duplicated, block: B:350:0x0835  */
    /* JADX WARN: Code duplicated, block: B:353:0x0869  */
    /* JADX WARN: Code duplicated, block: B:355:0x0873  */
    /* JADX WARN: Code duplicated, block: B:358:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:361:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:362:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:365:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:367:0x0920 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:368:0x0922  */
    /* JADX WARN: Code duplicated, block: B:371:0x0955  */
    /* JADX WARN: Code duplicated, block: B:374:0x0961  */
    /* JADX WARN: Code duplicated, block: B:375:0x0965  */
    /* JADX WARN: Code duplicated, block: B:377:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:379:0x09da  */
    /* JADX WARN: Code duplicated, block: B:381:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:391:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:396:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:399:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:400:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:404:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:406:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:407:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:414:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:417:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:418:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:421:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:422:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:427:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:432:0x0bfb  */
    /* JADX WARN: Code duplicated, block: B:439:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x038a A[EDGE_INSN: B:440:0x038a->B:155:0x038a BREAK  A[LOOP:0: B:148:0x036a->B:153:0x0386], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x051d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0502 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:? A[LOOP:4: B:176:0x0422->B:455:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:? A[LOOP:5: B:190:0x0456->B:458:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:? A[LOOP:6: B:204:0x0488->B:461:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:? A[LOOP:7: B:218:0x04bb->B:464:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x035d A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void b(boolean z, boolean z2, boolean z3, String str, Function1 function1, Function1 function2, final Function1 function3, final Function1 function4, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composer2;
        int i3;
        Boolean bool;
        MutableState mutableState;
        int i4;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Boolean bool2;
        int i5;
        boolean z4;
        boolean zChanged;
        Object objRememberedValue;
        ArrayList arrayList;
        Iterator it;
        Object next;
        Object obj;
        List list;
        Iterator it2;
        Object next2;
        yj0 yj0Var;
        MutableState mutableState5;
        boolean zChanged2;
        Object objRememberedValue2;
        String str2;
        String str3;
        List list2;
        Iterator it3;
        List list3;
        Iterator it4;
        List list4;
        Iterator it5;
        boolean z5;
        List list5;
        Iterator it6;
        boolean zBooleanValue;
        boolean zChanged3;
        Object objRememberedValue3;
        Iterator it7;
        Object next3;
        yj0 yj0Var2;
        xj0 xj0Var;
        List list6;
        MediaItem mediaItem;
        Iterator it8;
        Object next4;
        yj0 yj0Var3;
        xj0 xj0Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        Object objRememberedValue4;
        yj0 yj0Var4;
        yj0 yj0Var5;
        Boolean boolValueOf;
        int i10;
        int i11;
        int i12;
        int i13;
        Object objRememberedValue5;
        Boolean bool3;
        Function1 function5;
        int i14;
        Object objRememberedValue6;
        boolean z6;
        int i15;
        int i16;
        Object objRememberedValue7;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        int i17;
        boolean z7;
        Object objRememberedValue8;
        MutableState mutableState10;
        MutableState mutableState11;
        int i18;
        boolean z8;
        Object mj0Var;
        int i19;
        FocusRequester focusRequester;
        MutableState mutableState12;
        yj0 yj0Var6;
        MutableState mutableState13;
        MutableState mutableState14;
        MutableState mutableState15;
        Arrangement arrangement;
        Alignment.Companion companion;
        ComposeUiNode.Companion companion2;
        MutableState mutableState16;
        Function0<ComposeUiNode> constructor;
        Modifier.Companion companion3;
        final MutableState mutableState17;
        int i20;
        Function0<ComposeUiNode> constructor2;
        Iterator it9;
        int i21;
        Composer composer3;
        final yj0 yj0Var7;
        int i22;
        int i23;
        boolean z9;
        boolean z10;
        Object objRememberedValue9;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objRememberedValue10;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objRememberedValue11;
        Function0<ComposeUiNode> constructor3;
        Function0<ComposeUiNode> constructor4;
        String str4;
        Composer composer4;
        Composer composer5;
        Function0<ComposeUiNode> constructor5;
        Iterator it10;
        function4.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1614895015);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
        }
        int i24 = i2 | 100663296;
        if (composerStartRestartGroup.shouldExecute((i24 & 38347923) != 38347922, i24 & 1)) {
            Modifier.Companion companion4 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1614895015, i24, -1, "com.dh.myembyapp.ui.screens.home.FavoritePage (FavoritePage.kt:86)");
            }
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue12 == companion5.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState18 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion5.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            MutableState mutableState19 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion5.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            MutableState mutableState20 = (MutableState) objRememberedValue14;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion5.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue15 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState21 = (MutableState) objRememberedValue15;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == companion5.getEmpty()) {
                i3 = 2;
                objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            } else {
                i3 = 2;
            }
            MutableState mutableState22 = (MutableState) objRememberedValue16;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion5.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            MutableState mutableState23 = (MutableState) objRememberedValue17;
            Object[] objArr = new Object[0];
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == companion5.getEmpty()) {
                objRememberedValue18 = new h10(23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            MutableState mutableState24 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue18, composerStartRestartGroup, 48);
            Object[] objArr2 = new Object[0];
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            int i25 = i24;
            if (objRememberedValue19 == companion5.getEmpty()) {
                objRememberedValue19 = new h10(24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            MutableState mutableState25 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue19, composerStartRestartGroup, 48);
            Object[] objArr3 = new Object[0];
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == companion5.getEmpty()) {
                objRememberedValue20 = new h10(25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            MutableState mutableState26 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (Function0) objRememberedValue20, composerStartRestartGroup, 48);
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == companion5.getEmpty()) {
                objRememberedValue21 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue21;
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == companion5.getEmpty()) {
                objRememberedValue22 = mr.m(((String) mutableState25.getValue()) != null, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState27 = (MutableState) objRememberedValue22;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            int i26 = i25 & 14;
            boolean z17 = i26 == 4;
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (z17) {
                bool = boolValueOf2;
            } else {
                bool = boolValueOf2;
                if (objRememberedValue23 != companion5.getEmpty()) {
                    i4 = i26;
                    mutableState2 = mutableState19;
                    mutableState = mutableState22;
                    mutableState3 = mutableState21;
                    mutableState4 = mutableState20;
                    bool2 = bool;
                    i5 = 1;
                }
                EffectsKt.LaunchedEffect(bool2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue23, composerStartRestartGroup, i4);
                if (!((List) mutableState18.getValue()).isEmpty() && ((List) mutableState2.getValue()).isEmpty() && ((List) mutableState4.getValue()).isEmpty() && ((List) mutableState3.getValue()).isEmpty()) {
                    z4 = 0;
                } else {
                    z4 = i5;
                }
                zChanged = composerStartRestartGroup.changed((List) mutableState18.getValue()) | composerStartRestartGroup.changed((List) mutableState2.getValue()) | composerStartRestartGroup.changed((List) mutableState4.getValue()) | composerStartRestartGroup.changed((List) mutableState3.getValue());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == companion5.getEmpty()) {
                    obj = objRememberedValue;
                    yj0 yj0Var8 = new yj0(zj0.a, "收藏的剧集", (List) mutableState18.getValue());
                    yj0 yj0Var9 = new yj0(zj0.b, "收藏的电影", (List) mutableState2.getValue());
                    yj0 yj0Var10 = new yj0(zj0.c, "收藏的单集", (List) mutableState4.getValue());
                    yj0 yj0Var11 = new yj0(zj0.d, "收藏的合集", (List) mutableState3.getValue());
                    yj0[] yj0VarArr = new yj0[4];
                    yj0VarArr[0] = yj0Var8;
                    yj0VarArr[i5] = yj0Var9;
                    yj0VarArr[2] = yj0Var10;
                    yj0VarArr[3] = yj0Var11;
                    List listListOf = CollectionsKt.listOf((Object[]) yj0VarArr);
                    arrayList = new ArrayList();
                    it = listListOf.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator it11 = it;
                        if (!((yj0) next).c.isEmpty()) {
                            arrayList.add(next);
                        }
                        it = it11;
                    }
                    composerStartRestartGroup.updateRememberedValue(arrayList);
                    obj = arrayList;
                }
                obj = objRememberedValue;
                list = (List) obj;
                it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    it10 = it2;
                    if (Intrinsics.areEqual(((yj0) next2).a.name(), str)) {
                        break;
                    } else {
                        it2 = it10;
                    }
                }
                yj0Var = (yj0) next2;
                mutableState5 = mutableState;
                MutableState mutableState28 = mutableState2;
                MutableState mutableState29 = mutableState4;
                MutableState mutableState30 = mutableState3;
                zChanged2 = composerStartRestartGroup.changed((String) mutableState25.getValue()) | composerStartRestartGroup.changed((String) mutableState26.getValue()) | composerStartRestartGroup.changed((List) mutableState18.getValue()) | composerStartRestartGroup.changed((List) mutableState28.getValue()) | composerStartRestartGroup.changed((List) mutableState29.getValue()) | composerStartRestartGroup.changed((List) mutableState30.getValue());
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    str2 = (String) mutableState25.getValue();
                    if (str2 == null && (str3 = (String) mutableState26.getValue()) != null) {
                        switch (str3.hashCode()) {
                            case -791034678:
                                if (str3.equals("收藏的剧集") && ((list2 = (List) mutableState18.getValue()) == null || !list2.isEmpty())) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (Intrinsics.areEqual(((MediaItem) it3.next()).getId(), str2)) {
                                                z5 = i5;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z5 = 0;
                                break;
                            case -791027300:
                                if (str3.equals("收藏的单集") && ((list3 = (List) mutableState29.getValue()) == null || !list3.isEmpty())) {
                                    it4 = list3.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (Intrinsics.areEqual(((MediaItem) it4.next()).getId(), str2)) {
                                                z5 = i5;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z5 = 0;
                                break;
                            case -791021751:
                                if (str3.equals("收藏的合集") && ((list4 = (List) mutableState30.getValue()) == null || !list4.isEmpty())) {
                                    it5 = list4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            if (Intrinsics.areEqual(((MediaItem) it5.next()).getId(), str2)) {
                                                z5 = i5;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z5 = 0;
                                break;
                            case -790772633:
                                if (str3.equals("收藏的电影") && ((list5 = (List) mutableState28.getValue()) == null || !list5.isEmpty())) {
                                    it6 = list5.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            if (Intrinsics.areEqual(((MediaItem) it6.next()).getId(), str2)) {
                                                z5 = i5;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z5 = 0;
                                break;
                            default:
                                z5 = 0;
                                break;
                        }
                    } else {
                        z5 = 0;
                    }
                    objRememberedValue2 = Boolean.valueOf(z5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Boolean bool4 = (Boolean) objRememberedValue2;
                zBooleanValue = bool4.booleanValue();
                zChanged3 = composerStartRestartGroup.changed((String) mutableState26.getValue()) | composerStartRestartGroup.changed(list);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    it7 = list.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            next3 = it7.next();
                            yj0Var3 = (yj0) next3;
                            if (Intrinsics.areEqual(yj0Var3.b, (String) mutableState26.getValue()) || yj0Var3.c.isEmpty()) {
                            }
                        } else {
                            next3 = null;
                        }
                    }
                    yj0Var2 = (yj0) next3;
                    if (yj0Var2 == null) {
                        it8 = list.iterator();
                        do {
                            if (it8.hasNext()) {
                                next4 = it8.next();
                            } else {
                                next4 = null;
                            }
                            yj0Var2 = (yj0) next4;
                        } while (((yj0) next4).c.isEmpty());
                        yj0Var2 = (yj0) next4;
                    }
                    if (yj0Var2 != null || (list6 = yj0Var2.c) == null || (mediaItem = (MediaItem) CollectionsKt.firstOrNull(list6)) == null) {
                        xj0Var = null;
                    } else {
                        xj0Var = new xj0(yj0Var2.b, mediaItem.getId());
                    }
                    composerStartRestartGroup.updateRememberedValue(xj0Var);
                    objRememberedValue3 = xj0Var;
                }
                xj0Var2 = (xj0) objRememberedValue3;
                Boolean boolValueOf3 = Boolean.valueOf(((Boolean) mutableState5.getValue()).booleanValue());
                if ((i25 & 7168) == 2048) {
                    i6 = i5;
                } else {
                    i6 = 0;
                }
                int i27 = i6 | (composerStartRestartGroup.changedInstance(yj0Var) ? 1 : 0);
                i7 = i25 & 57344;
                if (i7 == 16384) {
                    i8 = i5;
                } else {
                    i8 = 0;
                }
                i9 = i27 | i8;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (i9 == 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    yj0Var4 = yj0Var;
                    m2 m2Var = new m2(str, yj0Var4, function1, mutableState5, (Continuation) null);
                    composerStartRestartGroup.updateRememberedValue(m2Var);
                    objRememberedValue4 = m2Var;
                } else {
                    yj0Var4 = yj0Var;
                }
                yj0 yj0Var12 = yj0Var4;
                EffectsKt.LaunchedEffect(str, yj0Var12, boolValueOf3, (Function2) objRememberedValue4, composerStartRestartGroup, (i25 >> 9) & 14);
                yj0Var5 = yj0Var12;
                boolValueOf = Boolean.valueOf(z);
                if (i4 == 4) {
                    i10 = i5;
                } else {
                    i10 = 0;
                }
                i11 = 458752 & i25;
                if (i11 == 131072) {
                    i12 = i5;
                } else {
                    i12 = 0;
                }
                i13 = i10 | i12 | (composerStartRestartGroup.changedInstance(yj0Var5) ? 1 : 0);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (i13 == 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    bool3 = boolValueOf;
                    f6 f6Var = new f6(z, function2, yj0Var5, null, 2);
                    function5 = function2;
                    yj0Var5 = yj0Var5;
                    composerStartRestartGroup.updateRememberedValue(f6Var);
                    objRememberedValue5 = f6Var;
                } else {
                    function5 = function2;
                    bool3 = boolValueOf;
                }
                EffectsKt.LaunchedEffect(bool3, yj0Var5, (Function2) objRememberedValue5, composerStartRestartGroup, i4);
                Unit unit = Unit.INSTANCE;
                if (i11 == 131072) {
                    i14 = i5;
                } else {
                    i14 = 0;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (i14 == 0 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new f5(function5, 9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 6);
                if (z || str == null) {
                    z6 = 0;
                } else {
                    z6 = i5;
                }
                int i28 = (composerStartRestartGroup.changed(mutableState25) ? 1 : 0) | (composerStartRestartGroup.changed(mutableState26) ? 1 : 0) | (composerStartRestartGroup.changed(mutableState24) ? 1 : 0);
                if (i7 == 16384) {
                    i15 = i5;
                } else {
                    i15 = 0;
                }
                i16 = i28 | i15;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (i16 == 0 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    mutableState6 = mutableState26;
                    mutableState7 = mutableState27;
                    mutableState8 = mutableState25;
                    v1 v1Var = new v1(function1, mutableState8, mutableState6, mutableState7, mutableState24, 8);
                    mutableState9 = mutableState24;
                    composerStartRestartGroup.updateRememberedValue(v1Var);
                    objRememberedValue7 = v1Var;
                } else {
                    mutableState6 = mutableState26;
                    mutableState9 = mutableState24;
                    mutableState7 = mutableState27;
                    mutableState8 = mutableState25;
                }
                BackHandlerKt.BackHandler(z6, (Function0) objRememberedValue7, composerStartRestartGroup, 0, 0);
                Boolean boolValueOf4 = Boolean.valueOf(z);
                String str5 = (String) mutableState8.getValue();
                String str6 = (String) mutableState6.getValue();
                if (i4 == 4) {
                    i17 = i5;
                } else {
                    i17 = 0;
                }
                z7 = ((i17 | (composerStartRestartGroup.changed(mutableState8) ? 1 : 0)) == true ? 1 : 0) | (composerStartRestartGroup.changed(mutableState6) ? 1 : 0);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (z7 == 0 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    o6 o6Var = new o6(z, mutableState8, mutableState6, mutableState7, null, 2);
                    composerStartRestartGroup.updateRememberedValue(o6Var);
                    objRememberedValue8 = o6Var;
                }
                mutableState10 = mutableState8;
                mutableState11 = mutableState6;
                EffectsKt.LaunchedEffect(boolValueOf4, str5, str6, (Function2) objRememberedValue8, composerStartRestartGroup, i4);
                Boolean boolValueOf5 = Boolean.valueOf(z);
                Boolean boolValueOf6 = Boolean.valueOf(z4);
                Boolean bool5 = (Boolean) mutableState5.getValue();
                bool5.getClass();
                Object[] objArr4 = new Object[6];
                objArr4[0] = boolValueOf5;
                objArr4[i5] = boolValueOf6;
                objArr4[2] = bool5;
                objArr4[3] = bool4;
                objArr4[4] = xj0Var2;
                objArr4[5] = yj0Var5;
                if (i4 == 4) {
                    i18 = i5;
                } else {
                    i18 = 0;
                }
                z8 = ((((i18 | (composerStartRestartGroup.changedInstance(yj0Var5) ? 1 : 0)) == true ? 1 : 0) | (composerStartRestartGroup.changed(mutableState10) ? 1 : 0)) | (composerStartRestartGroup.changed(zBooleanValue) ? 1 : 0) ? 1 : 0) | (composerStartRestartGroup.changed(xj0Var2) ? 1 : 0) | (composerStartRestartGroup.changed(mutableState11) ? 1 : 0);
                Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                if (!z8 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                    i19 = i7;
                    focusRequester = focusRequester2;
                    MutableState mutableState31 = mutableState7;
                    mutableState12 = mutableState10;
                    yj0 yj0Var13 = yj0Var5;
                    mj0Var = new mj0(z, yj0Var13, zBooleanValue, xj0Var2, focusRequester, mutableState31, mutableState5, mutableState12, mutableState11, null);
                    yj0Var6 = yj0Var13;
                    mutableState13 = mutableState31;
                    mutableState14 = mutableState5;
                    mutableState15 = mutableState11;
                    composerStartRestartGroup.updateRememberedValue(mj0Var);
                } else {
                    mutableState12 = mutableState10;
                    mj0Var = objRememberedValue24;
                    mutableState15 = mutableState11;
                    i19 = i7;
                    yj0Var6 = yj0Var5;
                    focusRequester = focusRequester2;
                    mutableState13 = mutableState7;
                    mutableState14 = mutableState5;
                }
                EffectsKt.LaunchedEffect(objArr4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) mj0Var, composerStartRestartGroup, (int) r24);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, i5, null);
                arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, r24);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i29 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                companion2 = ComposeUiNode.INSTANCE;
                mutableState16 = mutableState14;
                constructor = companion2.getConstructor();
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
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i29), composerM4318constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (((Boolean) mutableState16.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(1830877002);
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i30 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                    constructor5 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion2, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl2, Integer.valueOf(i30), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    companion3 = companion4;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    composer5 = composerStartRestartGroup;
                } else {
                    companion3 = companion4;
                    if (((String) mutableState23.getValue()) != null) {
                        composerStartRestartGroup.startReplaceGroup(1831150639);
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i31 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
                        constructor4 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                        mr.z(companion2, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl3, Integer.valueOf(i31), composerM4318constructorimpl3));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        str4 = (String) mutableState23.getValue();
                        if (str4 == null) {
                            str4 = "未知错误";
                        }
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i32 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk(str4, null, materialTheme.getColorScheme(composerStartRestartGroup, i32).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i32).getBodyLarge(), composerStartRestartGroup, 0, 0, 131066);
                        Composer composer6 = composerStartRestartGroup;
                        composer6.endNode();
                        composer6.endReplaceGroup();
                        composer5 = composer6;
                    } else if (z4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1831600387);
                        Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i33 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default4);
                        constructor3 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
                        mr.z(companion2, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl4, Integer.valueOf(i33), composerM4318constructorimpl4));
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i34 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk("暂无收藏内容", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i34).getOnBackground(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i34).getBodyLarge(), composerStartRestartGroup, 6, 0, 131066);
                        Composer composer7 = composerStartRestartGroup;
                        composer7.endNode();
                        composer7.endReplaceGroup();
                        composer5 = composer7;
                    } else {
                        if (yj0Var6 != null) {
                            composerStartRestartGroup.startReplaceGroup(1832075214);
                            String str7 = yj0Var6.b;
                            List list7 = yj0Var6.c;
                            String str8 = (String) mutableState12.getValue();
                            boolean zChanged4 = composerStartRestartGroup.changed(mutableState12) | composerStartRestartGroup.changed(mutableState15) | composerStartRestartGroup.changedInstance(yj0Var6);
                            if ((3670016 & i25) == 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z18 = zChanged4 | z14;
                            if ((29360128 & i25) == 8388608) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z18 | z15;
                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (z16 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                final int i35 = 0;
                                final yj0 yj0Var14 = yj0Var6;
                                final MutableState mutableState32 = mutableState15;
                                final MutableState mutableState33 = mutableState12;
                                objRememberedValue11 = new Function1() { // from class: zi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i36 = i35;
                                        Function1 function6 = function4;
                                        Function1 function7 = function3;
                                        MutableState mutableState34 = mutableState32;
                                        MutableState mutableState35 = mutableState33;
                                        yj0 yj0Var15 = yj0Var14;
                                        MediaItem mediaItem2 = (MediaItem) obj2;
                                        switch (i36) {
                                            case 0:
                                                mediaItem2.getClass();
                                                mutableState35.setValue(mediaItem2.getId());
                                                mutableState34.setValue(yj0Var15.b);
                                                vj0.d(function7, function6, mediaItem2);
                                                break;
                                            default:
                                                mediaItem2.getClass();
                                                mutableState35.setValue(mediaItem2.getId());
                                                mutableState34.setValue(yj0Var15.b);
                                                vj0.d(function7, function6, mediaItem2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                            }
                            a(z, str7, list7, str8, (Function1) objRememberedValue11, composerStartRestartGroup, i4);
                            composerStartRestartGroup.endReplaceGroup();
                            composer5 = composerStartRestartGroup;
                        } else {
                            mutableState17 = mutableState12;
                            i20 = 1048576;
                            composerStartRestartGroup.startReplaceGroup(1832650822);
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m1002paddingqDBjuR0(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(80.0f), Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(0.0f)), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f)), companion.getStart(), composerStartRestartGroup, 6);
                            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                            int i36 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                            constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
                            mr.z(companion2, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl5, Integer.valueOf(i36), composerM4318constructorimpl5));
                            composerStartRestartGroup.startReplaceGroup(-522021376);
                            it9 = list.iterator();
                            composer3 = composerStartRestartGroup;
                            i21 = i19;
                            while (it9.hasNext()) {
                                yj0Var7 = (yj0) it9.next();
                                String str9 = yj0Var7.b;
                                i22 = i25;
                                List list8 = yj0Var7.c;
                                String str10 = (String) mutableState17.getValue();
                                String str11 = (String) mutableState15.getValue();
                                boolean zBooleanValue2 = ((Boolean) mutableState13.getValue()).booleanValue();
                                int iIntValue = ((Number) mutableState9.getValue()).intValue();
                                boolean zChanged5 = composer3.changed(mutableState17) | composer3.changed(mutableState15) | composer3.changedInstance(yj0Var7);
                                i23 = i21;
                                if (i23 == 16384) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                z10 = zChanged5 | z9;
                                objRememberedValue9 = composer3.rememberedValue();
                                if (z10 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new g9(yj0Var7, function1, mutableState17, mutableState15);
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                Function1 function6 = (Function1) objRememberedValue9;
                                boolean zChanged6 = composer3.changed(mutableState17) | composer3.changed(mutableState15) | composer3.changedInstance(yj0Var7);
                                Iterator it12 = it9;
                                if ((i22 & 3670016) == i20) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                boolean z19 = zChanged6 | z11;
                                if ((i22 & 29360128) == 8388608) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z13 = z19 | z12;
                                objRememberedValue10 = composer3.rememberedValue();
                                if (z13 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    final int i37 = 1;
                                    final MutableState mutableState34 = mutableState15;
                                    objRememberedValue10 = new Function1() { // from class: zi0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            int i38 = i37;
                                            Function1 function7 = function4;
                                            Function1 function8 = function3;
                                            MutableState mutableState35 = mutableState34;
                                            MutableState mutableState36 = mutableState17;
                                            yj0 yj0Var15 = yj0Var7;
                                            MediaItem mediaItem2 = (MediaItem) obj2;
                                            switch (i38) {
                                                case 0:
                                                    mediaItem2.getClass();
                                                    mutableState36.setValue(mediaItem2.getId());
                                                    mutableState35.setValue(yj0Var15.b);
                                                    vj0.d(function8, function7, mediaItem2);
                                                    break;
                                                default:
                                                    mediaItem2.getClass();
                                                    mutableState36.setValue(mediaItem2.getId());
                                                    mutableState35.setValue(yj0Var15.b);
                                                    vj0.d(function8, function7, mediaItem2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue10);
                                }
                                Function1 function7 = (Function1) objRememberedValue10;
                                int i38 = i22 << 3;
                                Composer composer8 = composer3;
                                f(str9, list8, z2, z3, str10, str11, zBooleanValue2, iIntValue, focusRequester, function6, function7, composer8, (i38 & 7168) | (i38 & 896) | 100663296, 0);
                                i21 = i23;
                                i25 = i22;
                                composer3 = composer8;
                                it9 = it12;
                                i20 = 1048576;
                            }
                            composer3.endReplaceGroup();
                            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(24.0f)), composer3, 6);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                            composer4 = composer3;
                        }
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion3;
                        composer2 = composer4;
                    }
                }
                composer4 = composer5;
                composer4.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion3;
                composer2 = composer4;
            }
            mutableState = mutableState22;
            i4 = i26;
            mutableState2 = mutableState19;
            mutableState3 = mutableState21;
            mutableState4 = mutableState20;
            bool2 = bool;
            i5 = 1;
            objRememberedValue23 = new c6(z, mutableState, mutableState23, mutableState18, mutableState2, mutableState4, mutableState3, (Continuation) null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            EffectsKt.LaunchedEffect(bool2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue23, composerStartRestartGroup, i4);
            if (!((List) mutableState18.getValue()).isEmpty()) {
                z4 = i5;
            } else {
                z4 = i5;
            }
            zChanged = composerStartRestartGroup.changed((List) mutableState18.getValue()) | composerStartRestartGroup.changed((List) mutableState2.getValue()) | composerStartRestartGroup.changed((List) mutableState4.getValue()) | composerStartRestartGroup.changed((List) mutableState3.getValue());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                obj = objRememberedValue;
                yj0 yj0Var15 = new yj0(zj0.a, "收藏的剧集", (List) mutableState18.getValue());
                yj0 yj0Var16 = new yj0(zj0.b, "收藏的电影", (List) mutableState2.getValue());
                yj0 yj0Var17 = new yj0(zj0.c, "收藏的单集", (List) mutableState4.getValue());
                yj0 yj0Var18 = new yj0(zj0.d, "收藏的合集", (List) mutableState3.getValue());
                yj0[] yj0VarArr2 = new yj0[4];
                yj0VarArr2[0] = yj0Var15;
                yj0VarArr2[i5] = yj0Var16;
                yj0VarArr2[2] = yj0Var17;
                yj0VarArr2[3] = yj0Var18;
                List listListOf2 = CollectionsKt.listOf((Object[]) yj0VarArr2);
                arrayList = new ArrayList();
                it = listListOf2.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator it13 = it;
                    if (!((yj0) next).c.isEmpty()) {
                        arrayList.add(next);
                    }
                    it = it13;
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                obj = objRememberedValue;
                yj0 yj0Var19 = new yj0(zj0.a, "收藏的剧集", (List) mutableState18.getValue());
                yj0 yj0Var110 = new yj0(zj0.b, "收藏的电影", (List) mutableState2.getValue());
                yj0 yj0Var111 = new yj0(zj0.c, "收藏的单集", (List) mutableState4.getValue());
                yj0 yj0Var112 = new yj0(zj0.d, "收藏的合集", (List) mutableState3.getValue());
                yj0[] yj0VarArr3 = new yj0[4];
                yj0VarArr3[0] = yj0Var19;
                yj0VarArr3[i5] = yj0Var110;
                yj0VarArr3[2] = yj0Var111;
                yj0VarArr3[3] = yj0Var112;
                List listListOf3 = CollectionsKt.listOf((Object[]) yj0VarArr3);
                arrayList = new ArrayList();
                it = listListOf3.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    Iterator it14 = it;
                    if (!((yj0) next).c.isEmpty()) {
                        arrayList.add(next);
                    }
                    it = it14;
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue;
            list = (List) obj;
            it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                it10 = it2;
                if (Intrinsics.areEqual(((yj0) next2).a.name(), str)) {
                    break;
                    break;
                }
                it2 = it10;
            }
            yj0Var = (yj0) next2;
            mutableState5 = mutableState;
            MutableState mutableState210 = mutableState2;
            MutableState mutableState211 = mutableState4;
            MutableState mutableState35 = mutableState3;
            zChanged2 = composerStartRestartGroup.changed((String) mutableState25.getValue()) | composerStartRestartGroup.changed((String) mutableState26.getValue()) | composerStartRestartGroup.changed((List) mutableState18.getValue()) | composerStartRestartGroup.changed((List) mutableState210.getValue()) | composerStartRestartGroup.changed((List) mutableState211.getValue()) | composerStartRestartGroup.changed((List) mutableState35.getValue());
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                str2 = (String) mutableState25.getValue();
                if (str2 == null) {
                    switch (str3.hashCode()) {
                        case -791034678:
                            if (str3.equals("收藏的剧集")) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it3.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        case -791027300:
                            if (str3.equals("收藏的单集")) {
                                it4 = list3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it4.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        case -791021751:
                            if (str3.equals("收藏的合集")) {
                                it5 = list4.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it5.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        case -790772633:
                            if (str3.equals("收藏的电影")) {
                                it6 = list5.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it6.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        default:
                            z5 = 0;
                            break;
                    }
                } else {
                    z5 = 0;
                }
                objRememberedValue2 = Boolean.valueOf(z5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                str2 = (String) mutableState25.getValue();
                if (str2 == null) {
                    switch (str3.hashCode()) {
                        case -791034678:
                            if (str3.equals("收藏的剧集")) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it3.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        case -791027300:
                            if (str3.equals("收藏的单集")) {
                                it4 = list3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it4.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        case -791021751:
                            if (str3.equals("收藏的合集")) {
                                it5 = list4.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it5.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        case -790772633:
                            if (str3.equals("收藏的电影")) {
                                it6 = list5.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (Intrinsics.areEqual(((MediaItem) it6.next()).getId(), str2)) {
                                            z5 = i5;
                                            break;
                                        }
                                    }
                                }
                            }
                            z5 = 0;
                            break;
                        default:
                            z5 = 0;
                            break;
                    }
                } else {
                    z5 = 0;
                }
                objRememberedValue2 = Boolean.valueOf(z5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Boolean bool6 = (Boolean) objRememberedValue2;
            zBooleanValue = bool6.booleanValue();
            zChanged3 = composerStartRestartGroup.changed((String) mutableState26.getValue()) | composerStartRestartGroup.changed(list);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                it7 = list.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        next3 = it7.next();
                        yj0Var3 = (yj0) next3;
                        if (Intrinsics.areEqual(yj0Var3.b, (String) mutableState26.getValue())) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                yj0Var2 = (yj0) next3;
                if (yj0Var2 == null) {
                    it8 = list.iterator();
                    do {
                        if (it8.hasNext()) {
                            next4 = it8.next();
                        } else {
                            next4 = null;
                        }
                        yj0Var2 = (yj0) next4;
                    } while (((yj0) next4).c.isEmpty());
                    yj0Var2 = (yj0) next4;
                }
                if (yj0Var2 != null) {
                    xj0Var = null;
                } else {
                    xj0Var = null;
                }
                composerStartRestartGroup.updateRememberedValue(xj0Var);
                objRememberedValue3 = xj0Var;
            } else {
                it7 = list.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        next3 = it7.next();
                        yj0Var3 = (yj0) next3;
                        if (Intrinsics.areEqual(yj0Var3.b, (String) mutableState26.getValue())) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                yj0Var2 = (yj0) next3;
                if (yj0Var2 == null) {
                    it8 = list.iterator();
                    do {
                        if (it8.hasNext()) {
                            next4 = it8.next();
                        } else {
                            next4 = null;
                        }
                        yj0Var2 = (yj0) next4;
                    } while (((yj0) next4).c.isEmpty());
                    yj0Var2 = (yj0) next4;
                }
                if (yj0Var2 != null) {
                    xj0Var = null;
                } else {
                    xj0Var = null;
                }
                composerStartRestartGroup.updateRememberedValue(xj0Var);
                objRememberedValue3 = xj0Var;
            }
            xj0Var2 = (xj0) objRememberedValue3;
            Boolean boolValueOf7 = Boolean.valueOf(((Boolean) mutableState5.getValue()).booleanValue());
            if ((i25 & 7168) == 2048) {
                i6 = i5;
            } else {
                i6 = 0;
            }
            int i210 = i6 | (composerStartRestartGroup.changedInstance(yj0Var) ? 1 : 0);
            i7 = i25 & 57344;
            if (i7 == 16384) {
                i8 = i5;
            } else {
                i8 = 0;
            }
            i9 = i210 | i8;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i9 == 0) {
                yj0Var4 = yj0Var;
                m2 m2Var2 = new m2(str, yj0Var4, function1, mutableState5, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(m2Var2);
                objRememberedValue4 = m2Var2;
            } else {
                yj0Var4 = yj0Var;
                m2 m2Var3 = new m2(str, yj0Var4, function1, mutableState5, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(m2Var3);
                objRememberedValue4 = m2Var3;
            }
            yj0 yj0Var113 = yj0Var4;
            EffectsKt.LaunchedEffect(str, yj0Var113, boolValueOf7, (Function2) objRememberedValue4, composerStartRestartGroup, (i25 >> 9) & 14);
            yj0Var5 = yj0Var113;
            boolValueOf = Boolean.valueOf(z);
            if (i4 == 4) {
                i10 = i5;
            } else {
                i10 = 0;
            }
            i11 = 458752 & i25;
            if (i11 == 131072) {
                i12 = i5;
            } else {
                i12 = 0;
            }
            i13 = i10 | i12 | (composerStartRestartGroup.changedInstance(yj0Var5) ? 1 : 0);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i13 == 0) {
                bool3 = boolValueOf;
                f6 f6Var2 = new f6(z, function2, yj0Var5, null, 2);
                function5 = function2;
                yj0Var5 = yj0Var5;
                composerStartRestartGroup.updateRememberedValue(f6Var2);
                objRememberedValue5 = f6Var2;
            } else {
                bool3 = boolValueOf;
                f6 f6Var3 = new f6(z, function2, yj0Var5, null, 2);
                function5 = function2;
                yj0Var5 = yj0Var5;
                composerStartRestartGroup.updateRememberedValue(f6Var3);
                objRememberedValue5 = f6Var3;
            }
            EffectsKt.LaunchedEffect(bool3, yj0Var5, (Function2) objRememberedValue5, composerStartRestartGroup, i4);
            Unit unit2 = Unit.INSTANCE;
            if (i11 == 131072) {
                i14 = i5;
            } else {
                i14 = 0;
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (i14 == 0) {
                objRememberedValue6 = new f5(function5, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new f5(function5, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composerStartRestartGroup, 6);
            if (z) {
                z6 = 0;
            } else {
                z6 = 0;
            }
            int i211 = (composerStartRestartGroup.changed(mutableState25) ? 1 : 0) | (composerStartRestartGroup.changed(mutableState26) ? 1 : 0) | (composerStartRestartGroup.changed(mutableState24) ? 1 : 0);
            if (i7 == 16384) {
                i15 = i5;
            } else {
                i15 = 0;
            }
            i16 = i211 | i15;
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (i16 == 0) {
                mutableState6 = mutableState26;
                mutableState7 = mutableState27;
                mutableState8 = mutableState25;
                v1 v1Var2 = new v1(function1, mutableState8, mutableState6, mutableState7, mutableState24, 8);
                mutableState9 = mutableState24;
                composerStartRestartGroup.updateRememberedValue(v1Var2);
                objRememberedValue7 = v1Var2;
            } else {
                mutableState6 = mutableState26;
                mutableState7 = mutableState27;
                mutableState8 = mutableState25;
                v1 v1Var3 = new v1(function1, mutableState8, mutableState6, mutableState7, mutableState24, 8);
                mutableState9 = mutableState24;
                composerStartRestartGroup.updateRememberedValue(v1Var3);
                objRememberedValue7 = v1Var3;
            }
            BackHandlerKt.BackHandler(z6, (Function0) objRememberedValue7, composerStartRestartGroup, 0, 0);
            Boolean boolValueOf8 = Boolean.valueOf(z);
            String str12 = (String) mutableState8.getValue();
            String str13 = (String) mutableState6.getValue();
            if (i4 == 4) {
                i17 = i5;
            } else {
                i17 = 0;
            }
            z7 = ((i17 | (composerStartRestartGroup.changed(mutableState8) ? 1 : 0)) == true ? 1 : 0) | (composerStartRestartGroup.changed(mutableState6) ? 1 : 0);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z7 == 0) {
                o6 o6Var2 = new o6(z, mutableState8, mutableState6, mutableState7, null, 2);
                composerStartRestartGroup.updateRememberedValue(o6Var2);
                objRememberedValue8 = o6Var2;
            } else {
                o6 o6Var3 = new o6(z, mutableState8, mutableState6, mutableState7, null, 2);
                composerStartRestartGroup.updateRememberedValue(o6Var3);
                objRememberedValue8 = o6Var3;
            }
            mutableState10 = mutableState8;
            mutableState11 = mutableState6;
            EffectsKt.LaunchedEffect(boolValueOf8, str12, str13, (Function2) objRememberedValue8, composerStartRestartGroup, i4);
            Boolean boolValueOf9 = Boolean.valueOf(z);
            Boolean boolValueOf10 = Boolean.valueOf(z4);
            Boolean bool7 = (Boolean) mutableState5.getValue();
            bool7.getClass();
            Object[] objArr5 = new Object[6];
            objArr5[0] = boolValueOf9;
            objArr5[i5] = boolValueOf10;
            objArr5[2] = bool7;
            objArr5[3] = bool6;
            objArr5[4] = xj0Var2;
            objArr5[5] = yj0Var5;
            if (i4 == 4) {
                i18 = i5;
            } else {
                i18 = 0;
            }
            z8 = ((((i18 | (composerStartRestartGroup.changedInstance(yj0Var5) ? 1 : 0)) == true ? 1 : 0) | (composerStartRestartGroup.changed(mutableState10) ? 1 : 0)) | (composerStartRestartGroup.changed(zBooleanValue) ? 1 : 0) ? 1 : 0) | (composerStartRestartGroup.changed(xj0Var2) ? 1 : 0) | (composerStartRestartGroup.changed(mutableState11) ? 1 : 0);
            Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (z8) {
                i19 = i7;
                focusRequester = focusRequester2;
                MutableState mutableState36 = mutableState7;
                mutableState12 = mutableState10;
                yj0 yj0Var114 = yj0Var5;
                mj0Var = new mj0(z, yj0Var114, zBooleanValue, xj0Var2, focusRequester, mutableState36, mutableState5, mutableState12, mutableState11, null);
                yj0Var6 = yj0Var114;
                mutableState13 = mutableState36;
                mutableState14 = mutableState5;
                mutableState15 = mutableState11;
                composerStartRestartGroup.updateRememberedValue(mj0Var);
            } else {
                i19 = i7;
                focusRequester = focusRequester2;
                MutableState mutableState37 = mutableState7;
                mutableState12 = mutableState10;
                yj0 yj0Var115 = yj0Var5;
                mj0Var = new mj0(z, yj0Var115, zBooleanValue, xj0Var2, focusRequester, mutableState37, mutableState5, mutableState12, mutableState11, null);
                yj0Var6 = yj0Var115;
                mutableState13 = mutableState37;
                mutableState14 = mutableState5;
                mutableState15 = mutableState11;
                composerStartRestartGroup.updateRememberedValue(mj0Var);
            }
            EffectsKt.LaunchedEffect(objArr5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) mj0Var, composerStartRestartGroup, (int) r24);
            Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(companion4, 0.0f, i5, null);
            arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, r24);
            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i212 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default5);
            companion2 = ComposeUiNode.INSTANCE;
            mutableState16 = mutableState14;
            constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion2, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
            Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl6, Integer.valueOf(i212), composerM4318constructorimpl6));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (((Boolean) mutableState16.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1830877002);
                Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i39 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default6);
                constructor5 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion2, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl7, Integer.valueOf(i39), composerM4318constructorimpl7));
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                companion3 = companion4;
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                composer5 = composerStartRestartGroup;
            } else {
                companion3 = companion4;
                if (((String) mutableState23.getValue()) != null) {
                    composerStartRestartGroup.startReplaceGroup(1831150639);
                    Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i310 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default7);
                    constructor4 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion2, composerM4318constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl8, Integer.valueOf(i310), composerM4318constructorimpl8));
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    str4 = (String) mutableState23.getValue();
                    if (str4 == null) {
                        str4 = "未知错误";
                    }
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i311 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str4, null, materialTheme3.getColorScheme(composerStartRestartGroup, i311).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composerStartRestartGroup, i311).getBodyLarge(), composerStartRestartGroup, 0, 0, 131066);
                    Composer composer9 = composerStartRestartGroup;
                    composer9.endNode();
                    composer9.endReplaceGroup();
                    composer5 = composer9;
                } else if (z4 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1831600387);
                    Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i312 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default8);
                    constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion2, composerM4318constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM4318constructorimpl9, currentCompositionLocalMap9);
                    Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl9, Integer.valueOf(i312), composerM4318constructorimpl9));
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i313 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("暂无收藏内容", null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composerStartRestartGroup, i313).getOnBackground(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composerStartRestartGroup, i313).getBodyLarge(), composerStartRestartGroup, 6, 0, 131066);
                    Composer composer10 = composerStartRestartGroup;
                    composer10.endNode();
                    composer10.endReplaceGroup();
                    composer5 = composer10;
                } else {
                    if (yj0Var6 != null) {
                        composerStartRestartGroup.startReplaceGroup(1832075214);
                        String str14 = yj0Var6.b;
                        List list9 = yj0Var6.c;
                        String str15 = (String) mutableState12.getValue();
                        boolean zChanged7 = composerStartRestartGroup.changed(mutableState12) | composerStartRestartGroup.changed(mutableState15) | composerStartRestartGroup.changedInstance(yj0Var6);
                        if ((3670016 & i25) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z110 = zChanged7 | z14;
                        if ((29360128 & i25) == 8388608) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z110 | z15;
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (z16) {
                            final int i314 = 0;
                            final yj0 yj0Var116 = yj0Var6;
                            final MutableState mutableState38 = mutableState15;
                            final MutableState mutableState39 = mutableState12;
                            objRememberedValue11 = new Function1() { // from class: zi0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i315 = i314;
                                    Function1 function8 = function4;
                                    Function1 function9 = function3;
                                    MutableState mutableState310 = mutableState38;
                                    MutableState mutableState311 = mutableState39;
                                    yj0 yj0Var117 = yj0Var116;
                                    MediaItem mediaItem2 = (MediaItem) obj2;
                                    switch (i315) {
                                        case 0:
                                            mediaItem2.getClass();
                                            mutableState311.setValue(mediaItem2.getId());
                                            mutableState310.setValue(yj0Var117.b);
                                            vj0.d(function9, function8, mediaItem2);
                                            break;
                                        default:
                                            mediaItem2.getClass();
                                            mutableState311.setValue(mediaItem2.getId());
                                            mutableState310.setValue(yj0Var117.b);
                                            vj0.d(function9, function8, mediaItem2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        } else {
                            final int i315 = 0;
                            final yj0 yj0Var117 = yj0Var6;
                            final MutableState mutableState310 = mutableState15;
                            final MutableState mutableState311 = mutableState12;
                            objRememberedValue11 = new Function1() { // from class: zi0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i316 = i315;
                                    Function1 function8 = function4;
                                    Function1 function9 = function3;
                                    MutableState mutableState312 = mutableState310;
                                    MutableState mutableState313 = mutableState311;
                                    yj0 yj0Var118 = yj0Var117;
                                    MediaItem mediaItem2 = (MediaItem) obj2;
                                    switch (i316) {
                                        case 0:
                                            mediaItem2.getClass();
                                            mutableState313.setValue(mediaItem2.getId());
                                            mutableState312.setValue(yj0Var118.b);
                                            vj0.d(function9, function8, mediaItem2);
                                            break;
                                        default:
                                            mediaItem2.getClass();
                                            mutableState313.setValue(mediaItem2.getId());
                                            mutableState312.setValue(yj0Var118.b);
                                            vj0.d(function9, function8, mediaItem2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        a(z, str14, list9, str15, (Function1) objRememberedValue11, composerStartRestartGroup, i4);
                        composerStartRestartGroup.endReplaceGroup();
                        composer5 = composerStartRestartGroup;
                    } else {
                        mutableState17 = mutableState12;
                        i20 = 1048576;
                        composerStartRestartGroup.startReplaceGroup(1832650822);
                        Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m1002paddingqDBjuR0(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(80.0f), Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(0.0f)), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f)), companion.getStart(), composerStartRestartGroup, 6);
                        long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i316 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                        constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composerStartRestartGroup);
                        mr.z(companion2, composerM4318constructorimpl10, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl10, currentCompositionLocalMap10);
                        Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl10, Integer.valueOf(i316), composerM4318constructorimpl10));
                        composerStartRestartGroup.startReplaceGroup(-522021376);
                        it9 = list.iterator();
                        composer3 = composerStartRestartGroup;
                        i21 = i19;
                        while (it9.hasNext()) {
                            yj0Var7 = (yj0) it9.next();
                            String str16 = yj0Var7.b;
                            i22 = i25;
                            List list10 = yj0Var7.c;
                            String str17 = (String) mutableState17.getValue();
                            String str18 = (String) mutableState15.getValue();
                            boolean zBooleanValue3 = ((Boolean) mutableState13.getValue()).booleanValue();
                            int iIntValue2 = ((Number) mutableState9.getValue()).intValue();
                            boolean zChanged8 = composer3.changed(mutableState17) | composer3.changed(mutableState15) | composer3.changedInstance(yj0Var7);
                            i23 = i21;
                            if (i23 == 16384) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 = zChanged8 | z9;
                            objRememberedValue9 = composer3.rememberedValue();
                            if (z10) {
                                objRememberedValue9 = new g9(yj0Var7, function1, mutableState17, mutableState15);
                                composer3.updateRememberedValue(objRememberedValue9);
                            } else {
                                objRememberedValue9 = new g9(yj0Var7, function1, mutableState17, mutableState15);
                                composer3.updateRememberedValue(objRememberedValue9);
                            }
                            Function1 function8 = (Function1) objRememberedValue9;
                            boolean zChanged9 = composer3.changed(mutableState17) | composer3.changed(mutableState15) | composer3.changedInstance(yj0Var7);
                            Iterator it15 = it9;
                            if ((i22 & 3670016) == i20) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z111 = zChanged9 | z11;
                            if ((i22 & 29360128) == 8388608) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = z111 | z12;
                            objRememberedValue10 = composer3.rememberedValue();
                            if (z13) {
                                final int i317 = 1;
                                final MutableState mutableState312 = mutableState15;
                                objRememberedValue10 = new Function1() { // from class: zi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i318 = i317;
                                        Function1 function9 = function4;
                                        Function1 function10 = function3;
                                        MutableState mutableState313 = mutableState312;
                                        MutableState mutableState314 = mutableState17;
                                        yj0 yj0Var118 = yj0Var7;
                                        MediaItem mediaItem2 = (MediaItem) obj2;
                                        switch (i318) {
                                            case 0:
                                                mediaItem2.getClass();
                                                mutableState314.setValue(mediaItem2.getId());
                                                mutableState313.setValue(yj0Var118.b);
                                                vj0.d(function10, function9, mediaItem2);
                                                break;
                                            default:
                                                mediaItem2.getClass();
                                                mutableState314.setValue(mediaItem2.getId());
                                                mutableState313.setValue(yj0Var118.b);
                                                vj0.d(function10, function9, mediaItem2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue10);
                            } else {
                                final int i318 = 1;
                                final MutableState mutableState313 = mutableState15;
                                objRememberedValue10 = new Function1() { // from class: zi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i319 = i318;
                                        Function1 function9 = function4;
                                        Function1 function10 = function3;
                                        MutableState mutableState314 = mutableState313;
                                        MutableState mutableState315 = mutableState17;
                                        yj0 yj0Var118 = yj0Var7;
                                        MediaItem mediaItem2 = (MediaItem) obj2;
                                        switch (i319) {
                                            case 0:
                                                mediaItem2.getClass();
                                                mutableState315.setValue(mediaItem2.getId());
                                                mutableState314.setValue(yj0Var118.b);
                                                vj0.d(function10, function9, mediaItem2);
                                                break;
                                            default:
                                                mediaItem2.getClass();
                                                mutableState315.setValue(mediaItem2.getId());
                                                mutableState314.setValue(yj0Var118.b);
                                                vj0.d(function10, function9, mediaItem2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue10);
                            }
                            Function1 function9 = (Function1) objRememberedValue10;
                            int i319 = i22 << 3;
                            Composer composer11 = composer3;
                            f(str16, list10, z2, z3, str17, str18, zBooleanValue3, iIntValue2, focusRequester, function8, function9, composer11, (i319 & 7168) | (i319 & 896) | 100663296, 0);
                            i21 = i23;
                            i25 = i22;
                            composer3 = composer11;
                            it9 = it15;
                            i20 = 1048576;
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(24.0f)), composer3, 6);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                        composer4 = composer3;
                    }
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion3;
                    composer2 = composer4;
                }
            }
            composer4 = composer5;
            composer4.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion3;
            composer2 = composer4;
        } else {
            function1 = function1;
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c10(z, z2, z3, str, function1, function2, function3, function4, modifier2, i));
        }
    }

    public static final void c(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void d(Function1 function1, Function1 function2, MediaItem mediaItem) {
        if (!StringsKt__StringsJVMKt.equals(mediaItem.getType(), "BoxSet", true)) {
            function2.invoke(mediaItem.getId());
        } else if (function1 != null) {
            function1.invoke(mediaItem.getId());
        } else {
            function2.invoke(mediaItem.getId());
        }
    }

    public static final void e(Modifier modifier, FocusRequester focusRequester, Function0 function0, Function0 function1, Composer composer, int i) {
        Function0 function2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1340607908);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function2 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1340607908, i2, -1, "com.dh.myembyapp.ui.screens.home.FavoriteRowMoreButton (FavoritePage.kt:678)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f));
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, ioVar.b(Dp.m7813constructorimpl(36.0f))), ioVar.d), focusRequester);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new h70(15, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue2);
            boolean z = (i2 & 7168) == 2048;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new oj0(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue3);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
            long j = u61Var.D;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            int i4 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, onSurface, j, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 24, PsExtractor.VIDEO_STREAM_MASK);
            int i5 = i4 << 15;
            Function0 function3 = function2;
            SurfaceKt.m8520Surface05tvjtU(function3, modifierOnPreviewKeyEvent, null, false, 0.0f, clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composerStartRestartGroup, i5, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-224246341, true, new p1(23, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 6) & 14, 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yi0(modifier2, focusRequester, function0, function1, i, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0264  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02db  */
    /* JADX WARN: Code duplicated, block: B:156:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:166:0x0329  */
    /* JADX WARN: Code duplicated, block: B:167:0x032b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0331  */
    /* JADX WARN: Code duplicated, block: B:171:0x0333  */
    /* JADX WARN: Code duplicated, block: B:174:0x034e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0350  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:179:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0362  */
    /* JADX WARN: Code duplicated, block: B:183:0x0364  */
    /* JADX WARN: Code duplicated, block: B:186:0x036c  */
    /* JADX WARN: Code duplicated, block: B:187:0x036e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0375  */
    /* JADX WARN: Code duplicated, block: B:198:0x0386  */
    /* JADX WARN: Code duplicated, block: B:201:0x03bf  */
    public static final void f(final String str, final List list, final boolean z, final boolean z2, final String str2, final String str3, final boolean z3, final int i, final FocusRequester focusRequester, final Function1 function1, final Function1 function2, Composer composer, final int i2, final int i3) {
        int i4;
        String str4;
        int i5;
        Composer composer2;
        int i6;
        int i7;
        int i8;
        FocusRequester focusRequester2;
        Object objRememberedValue;
        Function0<ComposeUiNode> constructor;
        int i9;
        boolean z4;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objRememberedValue3;
        Composer composer3;
        final List list2 = list;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1191347115);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            str4 = str2;
            i4 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
        } else {
            str4 = str2;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(focusRequester) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1191347115, i4, i5, "com.dh.myembyapp.ui.screens.home.FavoriteSection (FavoritePage.kt:449)");
            }
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float f = ioVar.g;
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester4 = (FocusRequester) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState mutableState = (MutableState) objRememberedValue7;
            boolean z13 = z2 && !list2.isEmpty();
            int i10 = i5;
            Object[] objArr = {Integer.valueOf(i), str, str3, list2};
            final boolean z14 = z13;
            boolean z15 = (i4 & 29360128) == 8388608;
            int i11 = i4 & 14;
            int i12 = i4 & 458752;
            boolean zChangedInstance2 = z15 | (i11 == 4) | (i12 == 131072) | composerStartRestartGroup.changedInstance(list2);
            int i13 = i4 & 57344;
            boolean zChanged = zChangedInstance2 | (i13 == 16384) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            int i14 = i4 & 234881024;
            boolean z16 = zChanged | (i14 == 67108864);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z16) {
                i6 = i11;
            } else {
                i6 = i11;
                if (objRememberedValue8 != companion.getEmpty()) {
                    i7 = i14;
                    i8 = i6;
                    focusRequester2 = focusRequester3;
                }
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, (int) r27);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new h70(13, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(14.0f))), Alignment.INSTANCE.getStart(), composerStartRestartGroup, r27);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r27);
                int i15 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnFocusChanged);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
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
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i15), composerM4318constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                i9 = i4 & 1879048192;
                if (i9 == 536870912) {
                    z4 = true;
                } else {
                    z4 = r27;
                }
                zChangedInstance = z4 | composerStartRestartGroup.changedInstance(list2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    z5 = true;
                    objRememberedValue2 = new wi0(list2, 1, function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    z5 = true;
                }
                h(str, z, (Function0) objRememberedValue2, composerStartRestartGroup, i8 | ((i4 >> 3) & Input.Keys.FORWARD_DEL));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
                PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f, f, Dp.m7813constructorimpl(48.0f), f);
                boolean zChanged2 = composerStartRestartGroup.changed(z14);
                if (i8 == 4) {
                    z6 = z5;
                } else {
                    z6 = r27;
                }
                boolean z17 = zChanged2 | z6;
                if (i9 == 536870912) {
                    z7 = z5;
                } else {
                    z7 = r27;
                }
                boolean zChangedInstance3 = z7 | z17 | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                if ((i4 & 3670016) == 1048576) {
                    z8 = z5;
                } else {
                    z8 = r27;
                }
                boolean z18 = zChangedInstance3 | z8;
                if (i13 == 16384) {
                    z9 = z5;
                } else {
                    z9 = r27;
                }
                boolean z19 = z18 | z9;
                if (i12 == 131072) {
                    z10 = z5;
                } else {
                    z10 = r27;
                }
                boolean z20 = z19 | z10;
                if (i7 == 67108864) {
                    z11 = z5;
                } else {
                    z11 = r27;
                }
                boolean z21 = z20 | z11;
                if ((i10 & 14) != 4) {
                    z5 = false;
                }
                z12 = z21 | z5;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z12 || objRememberedValue3 == companion.getEmpty()) {
                    final FocusRequester focusRequester5 = focusRequester2;
                    composer3 = composerStartRestartGroup;
                    Function1 function3 = new Function1() { // from class: aj0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            List list3;
                            FocusRequester focusRequester6;
                            LazyListScope lazyListScope = (LazyListScope) obj;
                            lazyListScope.getClass();
                            boolean z22 = z14;
                            String str5 = str;
                            List list4 = list2;
                            MutableState mutableState2 = mutableState;
                            FocusRequester focusRequester7 = focusRequester4;
                            CoroutineScope coroutineScope2 = coroutineScope;
                            LazyListState lazyListState = lazyListStateRememberLazyListState;
                            FocusRequester focusRequester8 = focusRequester5;
                            if (z22 && ((Boolean) mutableState2.getValue()).booleanValue()) {
                                focusRequester6 = focusRequester8;
                                list3 = list4;
                                d.a(lazyListScope, kb0.x("more_", str5), null, ComposableLambdaKt.composableLambdaInstance(983711949, true, new dj0(focusRequester7, function1, list3, coroutineScope2, lazyListState, mutableState2, focusRequester6)), 2, null);
                            } else {
                                list3 = list4;
                                focusRequester6 = focusRequester8;
                            }
                            List list5 = list3;
                            lazyListScope.items(list3.size(), new w5(20, new xw(14), list3), new x5(list3, 20), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new tj0(list5, z3, str2, str5, str3, list3, z22, coroutineScope2, focusRequester, focusRequester6, function2, lazyListState, mutableState2, focusRequester7)));
                            return Unit.INSTANCE;
                        }
                    };
                    lazyListStateRememberLazyListState = lazyListStateRememberLazyListState;
                    composer3.updateRememberedValue(function3);
                    objRememberedValue3 = function3;
                } else {
                    composer3 = composerStartRestartGroup;
                }
                composer2 = composer3;
                LazyDslKt.LazyRow(null, lazyListStateRememberLazyListState, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue3, composer2, 24576, 489);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            i7 = i14;
            i8 = i6;
            focusRequester2 = focusRequester3;
            objRememberedValue8 = new pj0(i, str, str3, list2, str4, lazyListStateRememberLazyListState, focusRequester, focusRequester2, mutableState, null);
            list2 = list2;
            mutableState = mutableState;
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, (int) r27);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new h70(13, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(companion4, (Function1) objRememberedValue);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(14.0f))), Alignment.INSTANCE.getStart(), composerStartRestartGroup, r27);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r27);
            int i16 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnFocusChanged2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i16), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            i9 = i4 & 1879048192;
            if (i9 == 536870912) {
                z4 = true;
            } else {
                z4 = r27;
            }
            zChangedInstance = z4 | composerStartRestartGroup.changedInstance(list2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                z5 = true;
                objRememberedValue2 = new wi0(list2, 1, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                z5 = true;
                objRememberedValue2 = new wi0(list2, 1, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            h(str, z, (Function0) objRememberedValue2, composerStartRestartGroup, i8 | ((i4 >> 3) & Input.Keys.FORWARD_DEL));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            PaddingValues paddingValuesM995PaddingValuesa9UjIt5 = PaddingKt.m995PaddingValuesa9UjIt4(f, f, Dp.m7813constructorimpl(48.0f), f);
            boolean zChanged3 = composerStartRestartGroup.changed(z14);
            if (i8 == 4) {
                z6 = z5;
            } else {
                z6 = r27;
            }
            boolean z110 = zChanged3 | z6;
            if (i9 == 536870912) {
                z7 = z5;
            } else {
                z7 = r27;
            }
            boolean zChangedInstance4 = z7 | z110 | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            if ((i4 & 3670016) == 1048576) {
                z8 = z5;
            } else {
                z8 = r27;
            }
            boolean z111 = zChangedInstance4 | z8;
            if (i13 == 16384) {
                z9 = z5;
            } else {
                z9 = r27;
            }
            boolean z112 = z111 | z9;
            if (i12 == 131072) {
                z10 = z5;
            } else {
                z10 = r27;
            }
            boolean z22 = z112 | z10;
            if (i7 == 67108864) {
                z11 = z5;
            } else {
                z11 = r27;
            }
            boolean z23 = z22 | z11;
            if ((i10 & 14) != 4) {
                z5 = false;
            }
            z12 = z23 | z5;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z12) {
                final FocusRequester focusRequester6 = focusRequester2;
                composer3 = composerStartRestartGroup;
                Function1 function4 = new Function1() { // from class: aj0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list3;
                        FocusRequester focusRequester7;
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        lazyListScope.getClass();
                        boolean z24 = z14;
                        String str5 = str;
                        List list4 = list2;
                        MutableState mutableState2 = mutableState;
                        FocusRequester focusRequester8 = focusRequester4;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        LazyListState lazyListState = lazyListStateRememberLazyListState;
                        FocusRequester focusRequester9 = focusRequester6;
                        if (z24 && ((Boolean) mutableState2.getValue()).booleanValue()) {
                            focusRequester7 = focusRequester9;
                            list3 = list4;
                            d.a(lazyListScope, kb0.x("more_", str5), null, ComposableLambdaKt.composableLambdaInstance(983711949, true, new dj0(focusRequester8, function1, list3, coroutineScope2, lazyListState, mutableState2, focusRequester7)), 2, null);
                        } else {
                            list3 = list4;
                            focusRequester7 = focusRequester9;
                        }
                        List list5 = list3;
                        lazyListScope.items(list3.size(), new w5(20, new xw(14), list3), new x5(list3, 20), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new tj0(list5, z3, str2, str5, str3, list3, z24, coroutineScope2, focusRequester, focusRequester7, function2, lazyListState, mutableState2, focusRequester8)));
                        return Unit.INSTANCE;
                    }
                };
                lazyListStateRememberLazyListState = lazyListStateRememberLazyListState;
                composer3.updateRememberedValue(function4);
                objRememberedValue3 = function4;
            } else {
                final FocusRequester focusRequester7 = focusRequester2;
                composer3 = composerStartRestartGroup;
                Function1 function5 = new Function1() { // from class: aj0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list3;
                        FocusRequester focusRequester8;
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        lazyListScope.getClass();
                        boolean z24 = z14;
                        String str5 = str;
                        List list4 = list2;
                        MutableState mutableState2 = mutableState;
                        FocusRequester focusRequester9 = focusRequester4;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        LazyListState lazyListState = lazyListStateRememberLazyListState;
                        FocusRequester focusRequester10 = focusRequester7;
                        if (z24 && ((Boolean) mutableState2.getValue()).booleanValue()) {
                            focusRequester8 = focusRequester10;
                            list3 = list4;
                            d.a(lazyListScope, kb0.x("more_", str5), null, ComposableLambdaKt.composableLambdaInstance(983711949, true, new dj0(focusRequester9, function1, list3, coroutineScope2, lazyListState, mutableState2, focusRequester8)), 2, null);
                        } else {
                            list3 = list4;
                            focusRequester8 = focusRequester10;
                        }
                        List list5 = list3;
                        lazyListScope.items(list3.size(), new w5(20, new xw(14), list3), new x5(list3, 20), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new tj0(list5, z3, str2, str5, str3, list3, z24, coroutineScope2, focusRequester, focusRequester8, function2, lazyListState, mutableState2, focusRequester9)));
                        return Unit.INSTANCE;
                    }
                };
                lazyListStateRememberLazyListState = lazyListStateRememberLazyListState;
                composer3.updateRememberedValue(function5);
                objRememberedValue3 = function5;
            }
            composer2 = composer3;
            LazyDslKt.LazyRow(null, lazyListStateRememberLazyListState, paddingValuesM995PaddingValuesa9UjIt5, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue3, composer2, 24576, 489);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: bj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    vj0.f(str, list, z, z2, str2, str3, z3, i, focusRequester, function1, function2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void g(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(String str, boolean z, Function0 function0, Composer composer, int i) {
        String str2;
        int i2;
        Composer composer2;
        char c;
        Modifier modifierFocusable$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1367781832);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1367781832, i2, -1, "com.dh.myembyapp.ui.screens.home.FavoriteSectionTitle (FavoritePage.kt:626)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f));
            if (ComposerKt.isTraceInProgress()) {
                c = ' ';
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            } else {
                c = ' ';
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(BackgroundKt.m275backgroundbw27NRU$default(ClipKt.clip(companion2, roundedCornerShapeM1312RoundedCornerShape0680j_4), ((Boolean) mutableState.getValue()).booleanValue() ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU(), null, 2, null), Dp.m7813constructorimpl(((Boolean) mutableState.getValue()).booleanValue() ? 2.0f : 0.0f), ((Boolean) mutableState.getValue()).booleanValue() ? u61Var.b : Color.INSTANCE.m5187getTransparent0d7_KjU(), roundedCornerShapeM1312RoundedCornerShape0680j_4);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1233121807);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new h70(14, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue2);
                boolean z2 = (i2 & 896) == 256;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new uj0(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                modifierFocusable$default = FocusableKt.focusable$default(KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue3), false, null, 3, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1232413798);
                composerStartRestartGroup.endReplaceGroup();
                modifierFocusable$default = companion2;
            }
            Modifier modifierThen = modifierM286borderxT4_qwU.then(modifierFocusable$default);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(companion2, Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(3.0f));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            composer2 = composerStartRestartGroup;
            TextKt.m3048TextNvy7gAk(str2, modifierM1000paddingVpY3zN4, materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getTitleLarge(), composer2, (i2 & 14) | 48, 0, 131064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yh(str, z, function0, i, 1));
        }
    }
}
