package defpackage;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final List list, final String str, final int i, final boolean z, final boolean z2, final boolean z3, final uy0 uy0Var, final boolean z4, final boolean z5, final String str2, final String str3, final Function0 function0, final Function0 function1, final Function1 function2, final Function0 function3, final Function0 function4, final Function1 function5, final Function1 function6, final Function1 function7, final boolean z6, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Function0 function8;
        Composer composer2;
        String str4;
        LazyGridState lazyGridState;
        int i6;
        LazyGridState lazyGridState2;
        int i7;
        Object dy0Var;
        Object obj;
        MutableState mutableState;
        Composer composer3;
        final FocusRequester focusRequester;
        final FocusRequester focusRequester2;
        final FocusRequester focusRequester3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1293244086);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(uy0Var.ordinal()) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
        }
        int i8 = i2 & 100663296;
        int i9 = GroupFlagsKt.HasAuxSlotFlag;
        if (i8 == 0) {
            i4 |= composerStartRestartGroup.changed(z5) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(str3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            function8 = function3;
            i5 |= composerStartRestartGroup.changedInstance(function8) ? 16384 : 8192;
        } else {
            function8 = function3;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function5) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function6) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function7)) {
                i9 = 67108864;
            }
            i5 |= i9;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changed(z6) ? 536870912 : 268435456;
        }
        int i10 = i5;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i10 & 306783379) == 306783378) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1293244086, i4, i10, "com.dh.myembyapp.ui.screens.library.LibraryContent (LibraryScreen.kt:212)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            final boolean z7 = !zBooleanValue;
            final long onBackground = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnBackground();
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            final float f = ioVar.c;
            final float fM7813constructorimpl = Dp.m7813constructorimpl(Dp.m7813constructorimpl(16.0f) + ioVar.f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester4 = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester5 = (FocusRequester) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester6 = (FocusRequester) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            Object[] objArr = new Object[0];
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new bo0(22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState3 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue5, composerStartRestartGroup, 48);
            Object[] objArr2 = new Object[0];
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new bo0(23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState4 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue6, composerStartRestartGroup, 48);
            LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(((Number) mutableState3.getValue()).intValue(), ((Number) mutableState4.getValue()).intValue(), composerStartRestartGroup, 0, 0);
            Integer numValueOf = Integer.valueOf(lazyGridStateRememberLazyGridState.getFirstVisibleItemIndex());
            Integer numValueOf2 = Integer.valueOf(lazyGridStateRememberLazyGridState.getFirstVisibleItemScrollOffset());
            boolean zChanged = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(lazyGridStateRememberLazyGridState) | composerStartRestartGroup.changed(mutableState4);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                str4 = null;
                objRememberedValue7 = new zx0(lazyGridStateRememberLazyGridState, mutableState3, mutableState4, null, 0);
                lazyGridState = lazyGridStateRememberLazyGridState;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                lazyGridState = lazyGridStateRememberLazyGridState;
                str4 = null;
            }
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (Function2) objRememberedValue7, composerStartRestartGroup, 0);
            int i11 = 1879048192 & i4;
            boolean zChanged2 = (i11 == 536870912) | composerStartRestartGroup.changed(list);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                if (str2 == null) {
                    i6 = -1;
                    break;
                }
                Iterator it = list.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i6 = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(((MediaItem) it.next()).getId(), str2)) {
                            i6 = i12;
                            break;
                        }
                        i12++;
                    }
                }
                objRememberedValue8 = Integer.valueOf(i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            ((Number) objRememberedValue8).intValue();
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            int i13 = i4;
            boolean zChanged3 = composerStartRestartGroup.changed(lazyGridState) | ((i4 & 7168) == 2048) | ((i13 & 57344) == 16384) | ((458752 & i10) == 131072);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new by0(lazyGridState, z, z2, function4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            LazyGridState lazyGridState3 = lazyGridState;
            EffectsKt.LaunchedEffect(lazyGridState3, boolValueOf, boolValueOf2, (Function2) objRememberedValue9, composerStartRestartGroup, (i13 >> 6) & 1008);
            int size = list.size();
            MediaItem mediaItem = (MediaItem) CollectionsKt.firstOrNull(list);
            boolean zChanged4 = composerStartRestartGroup.changed(size) | composerStartRestartGroup.changed(mediaItem != null ? mediaItem.getId() : str4);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new LinkedHashSet();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Set set = (Set) objRememberedValue10;
            boolean zChanged5 = composerStartRestartGroup.changed(lazyGridState3) | composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(set) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                lazyGridState2 = lazyGridState3;
                jj0 jj0Var = new jj0(lazyGridState2, list, set, context, null, 1);
                composerStartRestartGroup.updateRememberedValue(jj0Var);
                objRememberedValue11 = jj0Var;
            } else {
                lazyGridState2 = lazyGridState3;
            }
            EffectsKt.LaunchedEffect(lazyGridState2, list, (Function2) objRememberedValue11, composerStartRestartGroup, (i13 << 3) & Input.Keys.FORWARD_DEL);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue12 == companion2.getEmpty()) {
                i7 = 2;
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, str4, 2, str4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            } else {
                i7 = 2;
            }
            MutableState mutableState5 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion2.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, str4, i7, str4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue13;
            Integer numValueOf3 = Integer.valueOf(list.size());
            int i14 = i10 & 14;
            boolean zChangedInstance = (i14 == 4) | composerStartRestartGroup.changedInstance(list) | (i11 == 536870912);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue14 == companion2.getEmpty()) {
                obj = str4;
                mutableState = mutableState2;
                composer3 = composerStartRestartGroup;
                dy0Var = new dy0(str3, list, focusRequester4, str2, focusRequester5, focusRequester6, mutableState5, mutableState, null);
                focusRequester = focusRequester4;
                focusRequester2 = focusRequester6;
                focusRequester3 = focusRequester5;
                composer3.updateRememberedValue(dy0Var);
            } else {
                dy0Var = objRememberedValue14;
                composer3 = composerStartRestartGroup;
                focusRequester = focusRequester4;
                focusRequester3 = focusRequester5;
                focusRequester2 = focusRequester6;
                mutableState = mutableState2;
                obj = str4;
            }
            int i15 = i14 | ((i13 >> 24) & Input.Keys.FORWARD_DEL);
            Composer composer4 = composer3;
            EffectsKt.LaunchedEffect(str3, str2, numValueOf3, (Function2) dy0Var, composer4, i15);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
            final LazyGridState lazyGridState4 = lazyGridState2;
            final Function0 function9 = function8;
            final MutableState mutableState7 = mutableState;
            Function3 function10 = new Function3() { // from class: wx0
                /* JADX WARN: Code duplicated, block: B:24:0x00d9  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    sx0 sx0Var;
                    MutableState mutableState8;
                    MaterialTheme materialTheme;
                    int i16;
                    MutableState mutableState9;
                    uy0 uy0Var2;
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj2;
                    Composer composer5 = (Composer) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    boxWithConstraintsScope.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer5.changed(boxWithConstraintsScope) ? 4 : 2;
                    }
                    if (composer5.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1494249376, iIntValue, -1, "com.dh.myembyapp.ui.screens.library.LibraryContent.<anonymous> (LibraryScreen.kt:342)");
                        }
                        float fMo734getMaxWidthD9Ej5fM = boxWithConstraintsScope.mo734getMaxWidthD9Ej5fM();
                        float fM7813constructorimpl2 = Dp.m7813constructorimpl(24.0f);
                        float fM7813constructorimpl3 = Dp.m7813constructorimpl(24.0f);
                        if (Dp.m7812compareTo0680j_4(fMo734getMaxWidthD9Ej5fM, Dp.m7813constructorimpl(0.0f)) > 0) {
                            float fM7813constructorimpl4 = Dp.m7813constructorimpl(0.0f);
                            float f2 = f;
                            if (Dp.m7812compareTo0680j_4(f2, fM7813constructorimpl4) <= 0) {
                                sx0Var = new sx0(1, fM7813constructorimpl2, fM7813constructorimpl3);
                            } else {
                                int iCoerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int) (Dp.m7813constructorimpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(fMo734getMaxWidthD9Ej5fM - Dp.m7813constructorimpl(fM7813constructorimpl2 * 2.0f))), Dp.m7811boximpl(f2))).m7827unboximpl() + fM7813constructorimpl3) / Dp.m7813constructorimpl(f2 + fM7813constructorimpl3)), 1), 12);
                                sx0Var = new sx0(iCoerceAtMost, ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(fMo734getMaxWidthD9Ej5fM - Dp.m7813constructorimpl(Dp.m7813constructorimpl((iCoerceAtMost - 1) * fM7813constructorimpl3) + Dp.m7813constructorimpl(f2 * iCoerceAtMost))) / 2.0f)), Dp.m7811boximpl(fM7813constructorimpl2))).m7827unboximpl(), fM7813constructorimpl3);
                            }
                        } else {
                            sx0Var = new sx0(1, fM7813constructorimpl2, fM7813constructorimpl3);
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer5, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                        int i17 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxSize$default2);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                        if (composer5.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer5);
                        mr.z(companion5, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i17), composerM4318constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Object objRememberedValue15 = composer5.rememberedValue();
                        Composer.Companion companion6 = Composer.INSTANCE;
                        if (objRememberedValue15 == companion6.getEmpty()) {
                            objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer5.updateRememberedValue(objRememberedValue15);
                        }
                        MutableState mutableState10 = (MutableState) objRememberedValue15;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        float fM7813constructorimpl5 = Dp.m7813constructorimpl(14.0f);
                        float fM7813constructorimpl6 = Dp.m7813constructorimpl(8.0f);
                        float f3 = sx0Var.b;
                        Modifier modifierM1002paddingqDBjuR0 = PaddingKt.m1002paddingqDBjuR0(modifierFillMaxWidth$default, f3, fM7813constructorimpl5, f3, fM7813constructorimpl6);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                        int i18 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM1002paddingqDBjuR0);
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        if (composer5.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor2);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer5);
                        mr.z(companion5, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i18), composerM4318constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion4.getCenterVertically(), composer5, 54);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                        int i19 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                        mr.z(companion5, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i19), composerM4318constructorimpl3));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(FocusRequesterModifierKt.focusRequester(companion3, focusRequester), Dp.m7813constructorimpl(34.0f));
                        Object objRememberedValue16 = composer5.rememberedValue();
                        if (objRememberedValue16 == companion6.getEmpty()) {
                            mutableState8 = mutableState10;
                            objRememberedValue16 = new h70(27, mutableState8);
                            composer5.updateRememberedValue(objRememberedValue16);
                        } else {
                            mutableState8 = mutableState10;
                        }
                        Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue16);
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        boolean z8 = z5;
                        u61 u61Var2 = u61Var;
                        long jM5187getTransparent0d7_KjU = z8 ? Color.INSTANCE.m5187getTransparent0d7_KjU() : u61Var2.e;
                        boolean z9 = z7;
                        long jM5189getWhite0d7_KjU = z9 ? Color.INSTANCE.m5189getWhite0d7_KjU() : u61Var2.f;
                        long j = u61Var2.g;
                        MutableState mutableState11 = mutableState8;
                        sx0 sx0Var2 = sx0Var;
                        ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(jM5187getTransparent0d7_KjU, j, jM5189getWhite0d7_KjU, z9 ? ColorKt.Color(4279308561L) : j, 0L, 0L, 0L, 0L, composer5, ButtonDefaults.$stable << 24, PsExtractor.VIDEO_STREAM_MASK);
                        ButtonBorder buttonBorderH = hc2.h(composer5);
                        ButtonScale buttonScaleL = hc2.l(1.02f);
                        ButtonGlow buttonGlowA = el0.a(u61Var2);
                        PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(0.0f));
                        Object objRememberedValue17 = composer5.rememberedValue();
                        Object empty = companion6.getEmpty();
                        MutableState mutableState12 = mutableState6;
                        if (objRememberedValue17 == empty) {
                            objRememberedValue17 = new lu0(14, mutableState12);
                            composer5.updateRememberedValue(objRememberedValue17);
                        }
                        uy0 uy0Var3 = uy0Var;
                        long j2 = onBackground;
                        boolean z10 = z4;
                        ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue17, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderH, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-347937680, true, new hi(uy0Var3, j2, z10, mutableState11), composer5, 54), composer5, 6, 390, 2380);
                        SpacerKt.Spacer(zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), composer5, 0);
                        final List list2 = list;
                        int i20 = i;
                        String strK = i20 > 0 ? c61.k("共 ", list2.size(), i20, "/", " 项") : x2.f(list2.size(), "共 ", " 项");
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i21 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk(strK, null, materialTheme2.getColorScheme(composer5, i21).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer5, i21).getTitleSmall(), composer5, 0, 0, 131066);
                        Composer composer6 = composer5;
                        composer6.endNode();
                        String str5 = str;
                        if (StringsKt.isBlank(str5)) {
                            materialTheme = materialTheme2;
                            i16 = i21;
                            composer6.startReplaceGroup(2043235174);
                            composer6.endReplaceGroup();
                        } else {
                            composer6.startReplaceGroup(2042740662);
                            materialTheme = materialTheme2;
                            i16 = i21;
                            TextKt.m3048TextNvy7gAk(str5, PaddingKt.m1001paddingVpY3zN4$default(boxScopeInstance.align(companion3, companion4.getCenter()), Dp.m7813constructorimpl(180.0f), 0.0f, 2, null), j2, null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme2.getTypography(composer6, i21).getTitleMedium(), composer6, 0, 24960, 109560);
                            composer6 = composer6;
                            composer6.endReplaceGroup();
                        }
                        if (((Boolean) mutableState12.getValue()).booleanValue()) {
                            composer6.startReplaceGroup(2043292152);
                            Object objRememberedValue18 = composer6.rememberedValue();
                            if (objRememberedValue18 == companion6.getEmpty()) {
                                mutableState9 = mutableState12;
                                objRememberedValue18 = new lu0(13, mutableState9);
                                composer6.updateRememberedValue(objRememberedValue18);
                            } else {
                                mutableState9 = mutableState12;
                            }
                            Function0 function11 = (Function0) objRememberedValue18;
                            boolean zChanged6 = composer6.changed(uy0Var3.ordinal());
                            Function0 function12 = function9;
                            boolean zChanged7 = zChanged6 | composer6.changed(function12);
                            Function1 function13 = function2;
                            boolean zChanged8 = zChanged7 | composer6.changed(function13);
                            Object objRememberedValue19 = composer6.rememberedValue();
                            if (zChanged8 || objRememberedValue19 == companion6.getEmpty()) {
                                uy0Var2 = uy0Var3;
                                g9 g9Var = new g9(uy0Var2, function12, function13, mutableState9, 13);
                                composer6.updateRememberedValue(g9Var);
                                objRememberedValue19 = g9Var;
                            } else {
                                uy0Var2 = uy0Var3;
                            }
                            gy0.c(uy0Var2, z10, function11, (Function1) objRememberedValue19, composer6, RendererCapabilities.DECODER_SUPPORT_MASK);
                            composer6.endReplaceGroup();
                        } else {
                            composer6.startReplaceGroup(2043889894);
                            composer6.endReplaceGroup();
                        }
                        composer6.endNode();
                        String str6 = str3;
                        if (str6 != null) {
                            composer6.startReplaceGroup(-177466368);
                            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                            int i22 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxSize$default3);
                            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                            if (composer6.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor4);
                            } else {
                                composer6.useNode();
                            }
                            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer6);
                            mr.z(companion5, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i22), composerM4318constructorimpl4));
                            MeasurePolicy measurePolicyP = mr.p(16.0f, arrangement, companion4.getCenterHorizontally(), composer6, 54);
                            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                            int i23 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, companion3);
                            Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
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
                            mr.z(companion5, composerM4318constructorimpl5, measurePolicyP, composerM4318constructorimpl5, currentCompositionLocalMap5);
                            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl5, Integer.valueOf(i23), composerM4318constructorimpl5));
                            MaterialTheme materialTheme3 = materialTheme;
                            int i24 = i16;
                            Composer composer7 = composer6;
                            TextKt.m3048TextNvy7gAk(str6, null, materialTheme3.getColorScheme(composer6, i24).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer6, i24).getBodyLarge(), composer7, 0, 0, 131066);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), companion4.getCenterVertically(), composer7, 54);
                            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                            int i25 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer7, companion3);
                            Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
                            if (composer7.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer7.startReusableNode();
                            if (composer7.getInserting()) {
                                composer7.createNode(constructor6);
                            } else {
                                composer7.useNode();
                            }
                            Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer7);
                            mr.z(companion5, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                            Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl6, Integer.valueOf(i25), composerM4318constructorimpl6));
                            long sp = TextUnitKt.getSp(20);
                            float fM7813constructorimpl7 = Dp.m7813constructorimpl(8.0f);
                            float fM7813constructorimpl8 = Dp.m7813constructorimpl(8.0f);
                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(120.0f)), Dp.m7813constructorimpl(48.0f)), focusRequester2);
                            Function0 function14 = function1;
                            boolean zChanged9 = composer7.changed(function14);
                            Object objRememberedValue20 = composer7.rememberedValue();
                            if (zChanged9 || objRememberedValue20 == companion6.getEmpty()) {
                                objRememberedValue20 = new n8(14, function14);
                                composer7.updateRememberedValue(objRememberedValue20);
                            }
                            hc2.c("返回", (Function0) objRememberedValue20, modifierFocusRequester, false, null, sp, fM7813constructorimpl7, fM7813constructorimpl8, composer7, 14352390, 24);
                            composer6 = composer7;
                            long sp2 = TextUnitKt.getSp(20);
                            float fM7813constructorimpl9 = Dp.m7813constructorimpl(8.0f);
                            float fM7813constructorimpl10 = Dp.m7813constructorimpl(8.0f);
                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(120.0f)), Dp.m7813constructorimpl(48.0f));
                            Function0 function15 = function0;
                            boolean zChanged10 = composer6.changed(function15);
                            Object objRememberedValue21 = composer6.rememberedValue();
                            if (zChanged10 || objRememberedValue21 == companion6.getEmpty()) {
                                objRememberedValue21 = new n8(15, function15);
                                composer6.updateRememberedValue(objRememberedValue21);
                            }
                            hc2.b("重试", (Function0) objRememberedValue21, modifierM1050height3ABfNKs2, false, sp2, fM7813constructorimpl9, fM7813constructorimpl10, composer6, 1794438, 8);
                            composer6.endNode();
                            composer6.endNode();
                            composer6.endNode();
                            composer6.endReplaceGroup();
                        } else {
                            MaterialTheme materialTheme4 = materialTheme;
                            int i26 = i16;
                            if (list2.isEmpty()) {
                                composer6.startReplaceGroup(-175445819);
                                Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                                long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                                int i27 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap7 = composer6.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxSize$default4);
                                Function0<ComposeUiNode> constructor7 = companion5.getConstructor();
                                if (composer6.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor7);
                                } else {
                                    composer6.useNode();
                                }
                                Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer6);
                                mr.z(companion5, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl7, currentCompositionLocalMap7);
                                Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl7, Integer.valueOf(i27), composerM4318constructorimpl7));
                                Composer composer8 = composer6;
                                TextKt.m3048TextNvy7gAk("此媒体库为空", null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composer6, i26).getOnBackground(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer6, i26).getBodyLarge(), composer8, 6, 0, 131066);
                                composer6 = composer8;
                                composer6.endNode();
                                composer6.endReplaceGroup();
                            } else {
                                composer6.startReplaceGroup(-174821944);
                                GridCells.Fixed fixed = new GridCells.Fixed(sx0Var2.a);
                                PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f3, fM7813constructorimpl, f3, Dp.m7813constructorimpl(14.0f));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(sx0Var2.c);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(20.0f));
                                boolean zChangedInstance2 = composer6.changedInstance(list2);
                                final String str7 = str2;
                                boolean zChanged11 = zChangedInstance2 | composer6.changed(str7);
                                final boolean z11 = z3;
                                boolean zChanged12 = zChanged11 | composer6.changed(z11);
                                final Function1 function16 = function6;
                                boolean zChanged13 = zChanged12 | composer6.changed(function16);
                                final boolean z12 = z6;
                                boolean zChanged14 = zChanged13 | composer6.changed(z12);
                                final Function1 function17 = function7;
                                boolean zChanged15 = zChanged14 | composer6.changed(function17);
                                final Function1 function18 = function5;
                                boolean zChanged16 = zChanged15 | composer6.changed(function18);
                                final boolean z13 = z2;
                                boolean zChanged17 = zChanged16 | composer6.changed(z13);
                                Object objRememberedValue22 = composer6.rememberedValue();
                                if (zChanged17 || objRememberedValue22 == companion6.getEmpty()) {
                                    final MutableState mutableState13 = mutableState7;
                                    final FocusRequester focusRequester7 = focusRequester3;
                                    objRememberedValue22 = new Function1() { // from class: yx0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            LazyGridScope lazyGridScope = (LazyGridScope) obj5;
                                            lazyGridScope.getClass();
                                            ox0 ox0Var = new ox0(1);
                                            List list3 = list2;
                                            lazyGridScope.items(list3.size(), new w5(22, ox0Var, list3), null, new x5(list3, 22), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new fy0(list3, str7, mutableState13, focusRequester7, z11, function16, z12, function17, function18)));
                                            if (z13) {
                                                lazyGridScope.item(null, null, null, ft.a);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer6.updateRememberedValue(objRememberedValue22);
                                }
                                LazyGridDslKt.LazyVerticalGrid(fixed, null, lazyGridState4, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_5, horizontalOrVerticalM712spacedBy0680j_4, null, false, null, (Function1) objRememberedValue22, composer6, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 914);
                                composer6.endReplaceGroup();
                            }
                        }
                        composer6.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer5.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            composer2 = composer4;
            BoxWithConstraintsKt.BoxWithConstraints(modifierFillMaxSize$default, null, false, ComposableLambdaKt.rememberComposableLambda(1494249376, true, function10, composer2, 54), composer2, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xx0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i3);
                    gy0.a(list, str, i, z, z2, z3, uy0Var, z4, z5, str2, str3, function0, function1, function2, function3, function4, function5, function6, function7, z6, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, Function1 function1, Function1 function2, Function1 function3, Function0 function0, cz0 cz0Var, Composer composer, int i) {
        int i2;
        final Function1 function4;
        cz0 cz0Var2;
        int i3;
        int i4;
        cz0 cz0Var3;
        int i5;
        final cz0 cz0Var4;
        String str2;
        Function1 function5;
        cz0 cz0Var5;
        final Function1 function6 = function1;
        final Function1 function7 = function3;
        function6.getClass();
        function2.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1416728356);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function7) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        int i6 = i2;
        if (composerStartRestartGroup.shouldExecute((i6 & 74899) != 74898, i6 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                i3 = 1;
                i4 = 0;
                cz0Var3 = (cz0) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(cz0.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                i5 = i6 & (-458753);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i5 = i6 & (-458753);
                i3 = 1;
                i4 = 0;
                cz0Var3 = cz0Var;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416728356, i5, -1, "com.dh.myembyapp.ui.screens.library.LibraryScreen (LibraryScreen.kt:69)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChanged = composerStartRestartGroup.changed(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new UserPreferences(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            UserPreferences userPreferences = (UserPreferences) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Boolean.valueOf(userPreferences.getEnableTransparentTopNavButtons());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue2).booleanValue();
            StateFlow stateFlow = cz0Var3.c;
            StateFlow stateFlow2 = cz0Var3.g;
            StateFlow stateFlow3 = cz0Var3.e;
            State stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow, null, composerStartRestartGroup, i4, i3);
            Object[] objArr = new Object[i4];
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new bo0(24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue3, composerStartRestartGroup, 48);
            int i7 = i5 & 14;
            boolean zChangedInstance = (i7 == 4) | composerStartRestartGroup.changedInstance(cz0Var3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new gq((ViewModel) cz0Var3, str, (Continuation) null, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i7);
            String str3 = (String) mutableState.getValue();
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(cz0Var3);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new gq(cz0Var3, mutableState, (Continuation) null, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(str3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            yy0 yy0Var = (yy0) stateCollectAsState.getValue();
            if (yy0Var instanceof wy0) {
                composerStartRestartGroup.startReplaceGroup(890299449);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                function4 = function2;
                cz0Var4 = cz0Var3;
                function6 = function1;
            } else {
                final cz0 cz0Var6 = cz0Var3;
                if (yy0Var instanceof vy0) {
                    composerStartRestartGroup.startReplaceGroup(890581735);
                    State stateCollectAsState2 = SnapshotStateKt.collectAsState(stateFlow3, null, composerStartRestartGroup, 0, 1);
                    State stateCollectAsState3 = SnapshotStateKt.collectAsState(stateFlow2, null, composerStartRestartGroup, 0, 1);
                    List listEmptyList = CollectionsKt.emptyList();
                    vy0 vy0Var = (vy0) yy0Var;
                    Library library = vy0Var.b;
                    String name = library != null ? library.getName() : null;
                    str2 = name != null ? name : "";
                    int i9 = i5;
                    boolean z = vy0Var.c;
                    uy0 uy0Var = (uy0) stateCollectAsState2.getValue();
                    boolean zBooleanValue2 = ((Boolean) stateCollectAsState3.getValue()).booleanValue();
                    String str4 = vy0Var.a;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(cz0Var6) | (i7 == 4);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new jx0(2, cz0Var6, str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    Function0 function8 = (Function0) objRememberedValue6;
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(cz0Var6);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue7 == companion.getEmpty()) {
                        final int i10 = 0;
                        objRememberedValue7 = new Function1() { // from class: ux0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i11 = i10;
                                cz0 cz0Var7 = cz0Var6;
                                uy0 uy0Var2 = (uy0) obj;
                                switch (i11) {
                                    case 0:
                                        uy0Var2.getClass();
                                        cz0Var7.g(uy0Var2);
                                        break;
                                    default:
                                        uy0Var2.getClass();
                                        cz0Var7.g(uy0Var2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Function1 function9 = (Function1) objRememberedValue7;
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(cz0Var6);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new g6(0, cz0Var6, cz0.class, "toggleSortOrder", "toggleSortOrder()V", 0, 4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function10 = (Function0) ((KFunction) objRememberedValue8);
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(cz0Var6);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new g6(0, cz0Var6, cz0.class, "loadMore", "loadMore()V", 0, 5);
                        cz0Var5 = cz0Var6;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        cz0Var5 = cz0Var6;
                    }
                    int i11 = i9 << 15;
                    a(listEmptyList, str2, 0, false, false, z, uy0Var, zBooleanValue2, zBooleanValue, null, str4, function8, function0, function9, function10, (Function0) ((KFunction) objRememberedValue9), function1, function2, function3, Intrinsics.areEqual(library != null ? library.getCollectionType() : null, "boxsets"), composerStartRestartGroup, 905997702, ((i9 >> 6) & 896) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024));
                    function6 = function1;
                    function4 = function2;
                    function7 = function3;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    cz0Var4 = cz0Var5;
                } else {
                    function4 = function2;
                    cz0Var4 = cz0Var6;
                    function6 = function1;
                    if (!(yy0Var instanceof xy0)) {
                        composerStartRestartGroup.startReplaceGroup(28720876);
                        composerStartRestartGroup.endReplaceGroup();
                        qu.f();
                        return;
                    }
                    composerStartRestartGroup.startReplaceGroup(891955686);
                    State stateCollectAsState4 = SnapshotStateKt.collectAsState(stateFlow3, null, composerStartRestartGroup, 0, 1);
                    State stateCollectAsState5 = SnapshotStateKt.collectAsState(stateFlow2, null, composerStartRestartGroup, 0, 1);
                    State stateCollectAsState6 = SnapshotStateKt.collectAsState(cz0Var4.i, null, composerStartRestartGroup, 0, 1);
                    String str5 = (String) mutableState.getValue();
                    if (str5 == null) {
                        str5 = (String) stateCollectAsState6.getValue();
                    }
                    xy0 xy0Var = (xy0) yy0Var;
                    Library library2 = xy0Var.b;
                    List list = xy0Var.a;
                    String name2 = library2 != null ? library2.getName() : null;
                    str2 = name2 != null ? name2 : "";
                    int i12 = xy0Var.d;
                    boolean z2 = xy0Var.e;
                    String str6 = str2;
                    boolean z3 = xy0Var.f;
                    boolean z4 = xy0Var.c;
                    uy0 uy0Var2 = (uy0) stateCollectAsState4.getValue();
                    boolean zBooleanValue3 = ((Boolean) stateCollectAsState5.getValue()).booleanValue();
                    boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(cz0Var4);
                    String str7 = str5;
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue10 == companion.getEmpty()) {
                        final int i13 = 1;
                        objRememberedValue10 = new Function1() { // from class: ux0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i14 = i13;
                                cz0 cz0Var7 = cz0Var4;
                                uy0 uy0Var3 = (uy0) obj;
                                switch (i14) {
                                    case 0:
                                        uy0Var3.getClass();
                                        cz0Var7.g(uy0Var3);
                                        break;
                                    default:
                                        uy0Var3.getClass();
                                        cz0Var7.g(uy0Var3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    Function1 function11 = (Function1) objRememberedValue10;
                    boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(cz0Var4);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new g6(0, cz0Var4, cz0.class, "toggleSortOrder", "toggleSortOrder()V", 0, 6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    Function0 function12 = (Function0) ((KFunction) objRememberedValue11);
                    boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(cz0Var4);
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = new g6(0, cz0Var4, cz0.class, "loadMore", "loadMore()V", 0, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    Function0 function13 = (Function0) ((KFunction) objRememberedValue12);
                    boolean zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(cz0Var4) | ((i5 & Input.Keys.FORWARD_DEL) == 32);
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue13 == companion.getEmpty()) {
                        final int i14 = 0;
                        objRememberedValue13 = new Function1() { // from class: vx0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i15 = i14;
                                MutableState mutableState2 = mutableState;
                                Function1 function14 = function6;
                                cz0 cz0Var7 = cz0Var4;
                                String str8 = (String) obj;
                                switch (i15) {
                                    case 0:
                                        str8.getClass();
                                        mutableState2.setValue(str8);
                                        cz0Var7.h.setValue(str8);
                                        function14.invoke(str8);
                                        break;
                                    case 1:
                                        str8.getClass();
                                        mutableState2.setValue(str8);
                                        cz0Var7.h.setValue(str8);
                                        function14.invoke(str8);
                                        break;
                                    default:
                                        str8.getClass();
                                        mutableState2.setValue(str8);
                                        cz0Var7.h.setValue(str8);
                                        function14.invoke(str8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    Function1 function14 = (Function1) objRememberedValue13;
                    boolean zChanged4 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(cz0Var4) | ((i5 & 896) == 256);
                    Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue14 == companion.getEmpty()) {
                        final int i15 = 1;
                        objRememberedValue14 = new Function1() { // from class: vx0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i16 = i15;
                                MutableState mutableState2 = mutableState;
                                Function1 function15 = function4;
                                cz0 cz0Var7 = cz0Var4;
                                String str8 = (String) obj;
                                switch (i16) {
                                    case 0:
                                        str8.getClass();
                                        mutableState2.setValue(str8);
                                        cz0Var7.h.setValue(str8);
                                        function15.invoke(str8);
                                        break;
                                    case 1:
                                        str8.getClass();
                                        mutableState2.setValue(str8);
                                        cz0Var7.h.setValue(str8);
                                        function15.invoke(str8);
                                        break;
                                    default:
                                        str8.getClass();
                                        mutableState2.setValue(str8);
                                        cz0Var7.h.setValue(str8);
                                        function15.invoke(str8);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    Function1 function15 = (Function1) objRememberedValue14;
                    if (function7 == null) {
                        composerStartRestartGroup.startReplaceGroup(893706224);
                        composerStartRestartGroup.endReplaceGroup();
                        function5 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(893706225);
                        boolean zChanged5 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(cz0Var4) | composerStartRestartGroup.changed(function7);
                        Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5 || objRememberedValue15 == companion.getEmpty()) {
                            final int i16 = 2;
                            objRememberedValue15 = new Function1() { // from class: vx0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i17 = i16;
                                    MutableState mutableState2 = mutableState;
                                    Function1 function16 = function7;
                                    cz0 cz0Var7 = cz0Var4;
                                    String str8 = (String) obj;
                                    switch (i17) {
                                        case 0:
                                            str8.getClass();
                                            mutableState2.setValue(str8);
                                            cz0Var7.h.setValue(str8);
                                            function16.invoke(str8);
                                            break;
                                        case 1:
                                            str8.getClass();
                                            mutableState2.setValue(str8);
                                            cz0Var7.h.setValue(str8);
                                            function16.invoke(str8);
                                            break;
                                        default:
                                            str8.getClass();
                                            mutableState2.setValue(str8);
                                            cz0Var7.h.setValue(str8);
                                            function16.invoke(str8);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function5 = (Function1) objRememberedValue15;
                    }
                    a(list, str6, i12, z2, z3, z4, uy0Var2, zBooleanValue3, zBooleanValue, str7, null, null, null, function11, function12, function13, function14, function15, function5, Intrinsics.areEqual(library2 != null ? library2.getCollectionType() : null, "boxsets"), composerStartRestartGroup, 100663296, 438);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cz0Var2 = cz0Var4;
        } else {
            function4 = function2;
            composerStartRestartGroup.skipToGroupEnd();
            cz0Var2 = cz0Var;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(str, function6, function4, function7, function0, cz0Var2, i));
        }
    }

    public static final void c(uy0 uy0Var, boolean z, Function0 function0, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1731759920);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(uy0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1731759920, i2, -1, "com.dh.myembyapp.ui.screens.library.LibrarySortDialog (LibraryScreen.kt:670)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            boolean z2 = (i2 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new n8(13, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue2, composerStartRestartGroup, 6, 0);
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new vm(focusRequester, null, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            AndroidDialog_androidKt.Dialog(function0, null, ComposableLambdaKt.rememberComposableLambda(-1739697127, true, new tx0(uy0Var, u61Var, function1, focusRequester, z, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7((Object) uy0Var, z, (Object) function0, (Function) function1, i, 5));
        }
    }
}
