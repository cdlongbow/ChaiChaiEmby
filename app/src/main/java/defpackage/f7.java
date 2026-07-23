package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;


import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxySettings;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.UserData;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import com.dh.myembyapp.server.OnlineSubtitleConfigServerManager;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import com.dh.myembyapp.server.SearchInputServerManager;
import com.dh.myembyapp.server.SubtitleFontUploadServerManager;
import com.dh.myembyapp.server.WebDavSyncConfigServerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f7 {
    public static final float a = Dp.m7813constructorimpl(48.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean B(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void C(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void D(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void E(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void F(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void G(AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, p7 p7Var, List list, MutableState mutableState, MutableState mutableState2, State state, String str) {
        p7 p7Var2 = p7Var;
        String string = StringsKt.trim((CharSequence) str).toString();
        if (!StringsKt.isBlank(string)) {
            mutableState.setValue(aggregateSearchHistoryPreferences.addKeyword(string));
        }
        mutableState2.setValue(userPreferences.getVideoVersionPrioritySettings());
        boolean zBooleanValue = ((Boolean) state.getValue()).booleanValue();
        p7Var2.getClass();
        list.getClass();
        str.getClass();
        Job job = p7Var2.m.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (StringsKt.isBlank(str)) {
            p7Var2.c();
            return;
        }
        long jIncrementAndGet = p7Var2.o.incrementAndGet();
        p7Var2.q.clear();
        MutableStateFlow mutableStateFlow = p7Var2.e;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new g7((ServerConfig) it.next(), (List) null, true, 10));
        }
        mutableStateFlow.setValue(new h7(str, arrayList, 48));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(p7Var2), Dispatchers.getIO(), null, new l7(p7Var2, (ServerConfig) obj, str, zBooleanValue, i, jIncrementAndGet, null), 2, null);
            p7Var2 = p7Var;
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(SearchInputServerManager searchInputServerManager, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(searchInputServerManager.getServerUrl());
        mutableState2.setValue(ku.y(200, 200, (String) mutableState.getValue()));
    }

    public static final void I(UserPreferences userPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15) {
        mutableState.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearch()));
        mutableState2.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearchInServerSearch()));
        mutableState3.setValue(Boolean.valueOf(userPreferences.getDisableTopNavFocusRefresh()));
        mutableState4.setValue(Boolean.valueOf(userPreferences.getEnableTransparentTopNavButtons()));
        mutableState5.setValue(Boolean.valueOf(userPreferences.getEnableClickableLibrarySectionTitle()));
        mutableState6.setValue(Boolean.valueOf(userPreferences.getEnableLibraryRowMoreButton()));
        mutableState7.setValue(Boolean.valueOf(userPreferences.getEnableHomeUnplayedOnly()));
        mutableState8.setValue(Boolean.valueOf(userPreferences.getEnablePlaybackStartupPoster()));
        mutableState9.setValue(Boolean.valueOf(userPreferences.getEnableAggregateSearchVersionTags()));
        mutableState10.setValue(Boolean.valueOf(userPreferences.getEnableDetailAggregateVersionRail()));
        mutableState11.setValue(userPreferences.getVideoVersionPrioritySettings());
        mutableState12.setValue(Boolean.valueOf(userPreferences.getEnableHomeBackFocusServerButton()));
        mutableState13.setValue(Boolean.valueOf(userPreferences.getEnableAppUpdateCheckOnStartup()));
        mutableState14.setValue(Boolean.valueOf(userPreferences.getAdminDebugFeaturesUnlocked()));
        mutableState15.setValue(Boolean.valueOf(userPreferences.getEnableSpecialFeatures()));
    }

    /* JADX WARN: Failed to calculate best type for var: r2v17 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v17 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v33 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v33 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 Object, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void J(defpackage.i3 r41, boolean r42, boolean r43, boolean r44, kotlin.jvm.functions.Function1 r45, kotlin.jvm.functions.Function0 r46, kotlin.jvm.functions.Function0 r47, boolean r48, androidx.compose.ui.focus.FocusRequester r49, androidx.compose.ui.focus.FocusRequester r50, androidx.compose.ui.focus.FocusRequester r51, androidx.compose.ui.focus.FocusRequester r52, androidx.compose.ui.focus.FocusRequester r53, androidx.compose.ui.focus.FocusRequester r54, androidx.compose.ui.focus.FocusRequester r55, androidx.compose.ui.Modifier r56, androidx.compose.runtime.Composer r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 1583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7.J(i3, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

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
    public static final void K(final List list, final String str, final boolean z, final FocusRequester focusRequester, final FocusRequester focusRequester2, final Function1 function1, final Function3 function3, Composer composer, final int i) {
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        int i2;
        Modifier.Companion companion;
        int i3;
        float f;
        int i4;
        char c;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1808898860);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        int i5 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        char c2 = ' ';
        if (composerStartRestartGroup.shouldExecute((i5 & 599187) != 599186, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1808898860, i5, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateLibraryOverviewSection (AggregateHubScreen.kt:1573)");
            }
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float fM7827unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m7811boximpl(ioVar.b(Dp.m7813constructorimpl(12.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(16.0f)))).m7827unboximpl();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-447432513);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Iterator it = list.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (!((g3) it.next()).b.isEmpty()) {
                            i2 = i7;
                            break;
                        }
                        i7++;
                    }
                }
                objRememberedValue = Integer.valueOf(i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-447416270);
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i8 = 0;
                function2 = new Function2() { // from class: u4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i8) {
                            case 0:
                                ((Integer) obj2).intValue();
                                f7.K(list, str, z, focusRequester, focusRequester2, function1, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                f7.K(list, str, z, focusRequester, focusRequester2, function1, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                composerStartRestartGroup.startReplaceGroup(-447349000);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1122804245);
                int i9 = 0;
                for (Object obj : list) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    g3 g3Var = (g3) obj;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(12.0f)));
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, companion5.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c2));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i11), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion5.getCenterVertically(), composerStartRestartGroup, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c2));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i12), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String alias = g3Var.a.getAlias();
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i13 = MaterialTheme.$stable;
                    float f2 = fM7827unboximpl;
                    int i14 = i9;
                    int i15 = iIntValue;
                    Composer composer4 = composerStartRestartGroup;
                    int i16 = i5;
                    io ioVar2 = ioVar;
                    TextKt.m3048TextNvy7gAk(alias, null, materialTheme.getColorScheme(composerStartRestartGroup, i13).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i13).getTitleLarge(), composer4, 0, 0, 131066);
                    if (g3Var.c) {
                        composer4.startReplaceGroup(-1161011753);
                        companion = companion4;
                        ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer4, 390, 58);
                        composer4.endReplaceGroup();
                    } else {
                        companion = companion4;
                        composer4.startReplaceGroup(-1160811865);
                        composer4.endReplaceGroup();
                    }
                    composer4.endNode();
                    if (g3Var.b.isEmpty()) {
                        i3 = i16;
                        f = f2;
                        i4 = i15;
                        c = ' ';
                        if (g3Var.d != null) {
                            composer4.startReplaceGroup(1166685421);
                            String str2 = g3Var.d;
                            TextStyle bodyMedium = materialTheme.getTypography(composer4, i13).getBodyMedium();
                            long error = materialTheme.getColorScheme(composer4, i13).getError();
                            composer3 = composer4;
                            TextKt.m3048TextNvy7gAk(str2, null, error, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer3, 0, 0, 131066);
                            composer3.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(1166983982);
                            TextStyle bodyMedium2 = materialTheme.getTypography(composer4, i13).getBodyMedium();
                            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i13).getOnBackground(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null);
                            composer3 = composer4;
                            TextKt.m3048TextNvy7gAk("这个服务器暂无可显示的媒体库。", null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium2, composer3, 6, 0, 131066);
                            composer3.endReplaceGroup();
                        }
                    } else {
                        composer4.startReplaceGroup(1163902830);
                        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer4, 0, 3);
                        Object objRememberedValue2 = composer4.rememberedValue();
                        Composer.Companion companion7 = Composer.INSTANCE;
                        if (objRememberedValue2 == companion7.getEmpty()) {
                            objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer4);
                            composer4.updateRememberedValue(objRememberedValue2);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
                        Modifier modifierLayout = LayoutModifierKt.layout(companion, new f1(2));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
                        float f3 = a;
                        PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f3, f2, f3, f2);
                        i4 = i15;
                        i3 = i16;
                        boolean zChangedInstance = composer4.changedInstance(g3Var) | composer4.changed(i14) | composer4.changed(i4) | composer4.changed(lazyListStateRememberLazyListState) | composer4.changedInstance(coroutineScope) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 896) == 256) | ((i3 & Input.Keys.FORWARD_DEL) == 32) | ((i3 & 7168) == 2048) | ((3670016 & i3) == 1048576);
                        Object objRememberedValue3 = composer4.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion7.getEmpty()) {
                            objRememberedValue3 = new v4(g3Var, i14, i4, lazyListStateRememberLazyListState, coroutineScope, focusRequester2, function1, z, str, focusRequester, function3, 0);
                            composer4.updateRememberedValue(objRememberedValue3);
                        }
                        f = f2;
                        c = ' ';
                        LazyDslKt.LazyRow(modifierLayout, lazyListStateRememberLazyListState, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_6, null, null, false, null, (Function1) objRememberedValue3, composer4, 24576, 488);
                        composer4.endReplaceGroup();
                        composer3 = composer4;
                    }
                    composer3.endNode();
                    composerStartRestartGroup = composer3;
                    i9 = i10;
                    fM7827unboximpl = f;
                    i5 = i3;
                    c2 = c;
                    iIntValue = i4;
                    ioVar = ioVar2;
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i17 = 1;
            function2 = new Function2() { // from class: u4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i17) {
                        case 0:
                            ((Integer) obj3).intValue();
                            f7.K(list, str, z, focusRequester, focusRequester2, function1, function3, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj3).intValue();
                            f7.K(list, str, z, focusRequester, focusRequester2, function1, function3, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void L(int i, Function1 function1, Function1 function2, FocusRequester focusRequester, boolean z, Function0 function0, Function3 function3, Composer composer, int i2) {
        int i3;
        Function0 function4;
        int i4;
        Continuation continuation;
        int i5;
        ScrollState scrollState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1870607271);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function4 = function0;
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        } else {
            function4 = function0;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((599187 & i6) != 599186, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870607271, i6, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregatePageContainer (AggregateHubScreen.kt:1103)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(i, composerStartRestartGroup, i6 & 14, 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            int i7 = i6 & 896;
            boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState) | (i7 == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Continuation continuation2 = null;
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                i4 = 0;
                objRememberedValue2 = new x6(scrollStateRememberScrollState, function2, continuation2, i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i4 = 0;
            }
            EffectsKt.LaunchedEffect(scrollStateRememberScrollState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i4);
            boolean zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            int i8 = i6 & Input.Keys.FORWARD_DEL;
            boolean z2 = (i8 == 32) | zChanged2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                continuation = null;
                objRememberedValue3 = new x6(scrollStateRememberScrollState, function1, continuation, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                continuation = null;
            }
            EffectsKt.LaunchedEffect(scrollStateRememberScrollState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            Modifier modifierFocusGroup = FocusableKt.focusGroup(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, continuation), focusRequester));
            boolean zChangedInstance = ((57344 & i6) == 16384) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(scrollStateRememberScrollState) | (i8 == 32) | (i7 == 256) | ((458752 & i6) == 131072);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                i5 = 0;
                c7 c7Var = new c7(z, coroutineScope, scrollStateRememberScrollState, function1, function2, function4);
                scrollState = scrollStateRememberScrollState;
                composerStartRestartGroup.updateRememberedValue(c7Var);
                objRememberedValue4 = c7Var;
            } else {
                scrollState = scrollStateRememberScrollState;
                i5 = 0;
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(KeyInputModifierKt.onPreviewKeyEvent(modifierFocusGroup, (Function1) objRememberedValue4), scrollState, false, null, false, 14, null);
            float fM7813constructorimpl = Dp.m7813constructorimpl(80.0f);
            float fM7813constructorimpl2 = Dp.m7813constructorimpl(28.0f);
            float f = a;
            Modifier modifierM1002paddingqDBjuR0 = PaddingKt.m1002paddingqDBjuR0(modifierVerticalScroll$default, f, fM7813constructorimpl, f, fM7813constructorimpl2);
            int i9 = ((i6 >> 9) & 7168) | 48;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(28.0f)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i5);
            int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1002paddingqDBjuR0);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i10), composerM4318constructorimpl));
            function3.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i9 >> 6) & Input.Keys.FORWARD_DEL) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o4(i, function1, function2, focusRequester, z, function0, function3, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:113:0x0243  */
    /* JADX WARN: Code duplicated, block: B:118:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0266  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:132:0x0306  */
    /* JADX WARN: Code duplicated, block: B:135:0x0312  */
    /* JADX WARN: Code duplicated, block: B:136:0x0316  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:145:0x0400  */
    /* JADX WARN: Code duplicated, block: B:148:0x0456  */
    /* JADX WARN: Code duplicated, block: B:149:0x0458  */
    /* JADX WARN: Code duplicated, block: B:152:0x0461  */
    /* JADX WARN: Code duplicated, block: B:153:0x0463  */
    /* JADX WARN: Code duplicated, block: B:156:0x046b  */
    /* JADX WARN: Code duplicated, block: B:157:0x046d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0475  */
    /* JADX WARN: Code duplicated, block: B:161:0x0477  */
    /* JADX WARN: Code duplicated, block: B:164:0x047f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0481  */
    /* JADX WARN: Code duplicated, block: B:168:0x048a  */
    /* JADX WARN: Code duplicated, block: B:169:0x048c  */
    /* JADX WARN: Code duplicated, block: B:174:0x049a  */
    /* JADX WARN: Code duplicated, block: B:178:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:180:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:181:0x0541  */
    /* JADX WARN: Code duplicated, block: B:184:0x05b3 A[LOOP:2: B:111:0x023d->B:184:0x05b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x024d A[SYNTHETIC] */
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
    public static final void M(List list, String str, boolean z, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function2 function2, Composer composer, int i) {
        Composer composer2;
        int i2;
        Iterator it;
        int i3;
        j3 j3Var;
        Arrangement arrangement;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        Composer composer3;
        Function0<ComposeUiNode> constructor2;
        MaterialTheme materialTheme;
        int i4;
        int i5;
        float f;
        Composer composer4;
        Composer composer5;
        Composer composer6;
        LazyListState lazyListStateRememberLazyListState;
        Object objRememberedValue;
        Composer.Companion companion2;
        CoroutineScope coroutineScope;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objRememberedValue2;
        Composer composer7;
        List list2 = list;
        Composer composerStartRestartGroup = composer.startRestartGroup(-182520335);
        int i6 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        int i7 = 32;
        if ((i & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 599187) != 599186, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-182520335, i6, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateRecentOverviewSection (AggregateHubScreen.kt:1686)");
            }
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float fM7827unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m7811boximpl(ioVar.b(Dp.m7813constructorimpl(12.0f))), Dp.m7811boximpl(Dp.m7813constructorimpl(16.0f)))).m7827unboximpl();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean zChanged = composerStartRestartGroup.changed(list2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Iterator it2 = list2.iterator();
                int i9 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (!((j3) it2.next()).b.isEmpty()) {
                            i2 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                objRememberedValue3 = Integer.valueOf(i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            if (list2.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(2027685469);
                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(80.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1050height3ABfNKs);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion5, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i10), composerM4318constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else if (list2.isEmpty()) {
                if (!list2.isEmpty()) {
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((j3) it.next()).c) {
                                composerStartRestartGroup.startReplaceGroup(2028507620);
                                i3 = 0;
                                for (Object obj : list2) {
                                    int i11 = i3 + 1;
                                    if (i3 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    j3Var = (j3) obj;
                                    arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(12.0f)));
                                    companion = Modifier.INSTANCE;
                                    Alignment.Companion companion6 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, companion6.getStart(), composerStartRestartGroup, 0);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                                    io ioVar2 = ioVar;
                                    int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> i7));
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                    constructor = companion7.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                                    mr.z(companion7, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i12), composerM4318constructorimpl3));
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion6.getCenterVertically(), composerStartRestartGroup, 54);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                                    composer3 = composerStartRestartGroup;
                                    int i13 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> i7));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion);
                                    constructor2 = companion7.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer3);
                                    mr.z(companion7, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i13), composerM4318constructorimpl4));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    String alias = j3Var.a.getAlias();
                                    materialTheme = MaterialTheme.INSTANCE;
                                    i4 = MaterialTheme.$stable;
                                    i5 = i3;
                                    f = fM7827unboximpl;
                                    TextKt.m3048TextNvy7gAk(alias, null, materialTheme.getColorScheme(composer3, i4).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getTitleLarge(), composer3, 0, 0, 131066);
                                    if (j3Var.c) {
                                        composer3.startReplaceGroup(-1309678807);
                                        ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer3, 390, 58);
                                        composer4 = composer3;
                                        composer4.endReplaceGroup();
                                    } else {
                                        composer4 = composer3;
                                        composer4.startReplaceGroup(-1309440479);
                                        composer4.endReplaceGroup();
                                    }
                                    composer4.endNode();
                                    if (j3Var.b.isEmpty()) {
                                        composer5 = composer4;
                                        if (j3Var.d != null) {
                                            composer5.startReplaceGroup(524839989);
                                            TextKt.m3048TextNvy7gAk(j3Var.d, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i4).getError(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i4).getBodySmall(), composer5, 0, 0, 131066);
                                            composer6 = composer5;
                                            composer6.endReplaceGroup();
                                        } else {
                                            composer5.startReplaceGroup(525211307);
                                            TextKt.m3048TextNvy7gAk("这个服务器暂无历史记录。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i4).getOnBackground(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i4).getBodyMedium(), composer5, 6, 0, 131066);
                                            composer6 = composer5;
                                            composer6.endReplaceGroup();
                                        }
                                    } else {
                                        composer4.startReplaceGroup(521011706);
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer4, 0, 3);
                                        objRememberedValue = composer4.rememberedValue();
                                        companion2 = Composer.INSTANCE;
                                        if (objRememberedValue == companion2.getEmpty()) {
                                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer4);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        coroutineScope = (CoroutineScope) objRememberedValue;
                                        Modifier modifierLayout = LayoutModifierKt.layout(companion, new f1(2));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
                                        float fM7813constructorimpl = Dp.m7813constructorimpl(8.0f);
                                        float f2 = a;
                                        PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f2, f, Dp.m7813constructorimpl(fM7813constructorimpl + f2), f);
                                        boolean zChangedInstance = composer4.changedInstance(j3Var) | composer4.changed(i5) | composer4.changed(iIntValue) | composer4.changed(lazyListStateRememberLazyListState) | composer4.changedInstance(coroutineScope);
                                        if ((i6 & 57344) == 16384) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        boolean z9 = z2 | zChangedInstance;
                                        if ((458752 & i6) == 131072) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        boolean z10 = z9 | z3;
                                        if ((i6 & 896) == 256) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        boolean z11 = z10 | z4;
                                        if ((i6 & Input.Keys.FORWARD_DEL) == i7) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        boolean z12 = z11 | z5;
                                        if ((i6 & 7168) == 2048) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        boolean z13 = z12 | z6;
                                        if ((3670016 & i6) == 1048576) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        z8 = z13 | z7;
                                        objRememberedValue2 = composer4.rememberedValue();
                                        if (!z8 || objRememberedValue2 == companion2.getEmpty()) {
                                            composer7 = composer4;
                                            v4 v4Var = new v4(j3Var, i5, iIntValue, lazyListStateRememberLazyListState, coroutineScope, focusRequester2, function1, z, str, focusRequester, function2, 1);
                                            lazyListStateRememberLazyListState = lazyListStateRememberLazyListState;
                                            composer7.updateRememberedValue(v4Var);
                                            objRememberedValue2 = v4Var;
                                        } else {
                                            composer7 = composer4;
                                        }
                                        Composer composer8 = composer7;
                                        LazyDslKt.LazyRow(modifierLayout, lazyListStateRememberLazyListState, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_6, null, null, false, null, (Function1) objRememberedValue2, composer8, 24576, 488);
                                        composer6 = composer8;
                                        composer6.endReplaceGroup();
                                    }
                                    composer6.endNode();
                                    fM7827unboximpl = f;
                                    composerStartRestartGroup = composer6;
                                    i3 = i11;
                                    ioVar = ioVar2;
                                    i7 = 32;
                                }
                                Composer composer9 = composerStartRestartGroup;
                                composer9.endReplaceGroup();
                                composer2 = composer9;
                            } else {
                                list2 = list;
                                i7 = 32;
                            }
                        }
                    }
                }
                composerStartRestartGroup.startReplaceGroup(2028086578);
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i14 = MaterialTheme.$stable;
                composer2 = composerStartRestartGroup;
                TextKt.m3048TextNvy7gAk("暂无最近播放记录", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i14).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i14).getBodyLarge(), composer2, 6, 0, 131066);
                composer2.endReplaceGroup();
            } else {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        if (!list2.isEmpty()) {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((j3) it.next()).c) {
                                        list2 = list;
                                        i7 = 32;
                                    }
                                }
                            }
                        }
                        composerStartRestartGroup.startReplaceGroup(2028086578);
                        MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                        int i15 = MaterialTheme.$stable;
                        composer2 = composerStartRestartGroup;
                        TextKt.m3048TextNvy7gAk("暂无最近播放记录", null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composerStartRestartGroup, i15).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composerStartRestartGroup, i15).getBodyLarge(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    } else if (!((j3) it3.next()).b.isEmpty()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(2028507620);
                    i3 = 0;
                    while (r38.hasNext()) {
                        int i16 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        j3Var = (j3) obj;
                        arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_7 = arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(12.0f)));
                        companion = Modifier.INSTANCE;
                        Alignment.Companion companion8 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_7, companion8.getStart(), composerStartRestartGroup, 0);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        io ioVar3 = ioVar;
                        int i17 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> i7));
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
                        mr.z(companion9, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                        Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl5, Integer.valueOf(i17), composerM4318constructorimpl5));
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion8.getCenterVertically(), composerStartRestartGroup, 54);
                        long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        composer3 = composerStartRestartGroup;
                        int i18 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> i7));
                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, companion);
                        constructor2 = companion9.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion9, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                        Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl6, Integer.valueOf(i18), composerM4318constructorimpl6));
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        String alias2 = j3Var.a.getAlias();
                        materialTheme = MaterialTheme.INSTANCE;
                        i4 = MaterialTheme.$stable;
                        i5 = i3;
                        f = fM7827unboximpl;
                        TextKt.m3048TextNvy7gAk(alias2, null, materialTheme.getColorScheme(composer3, i4).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getTitleLarge(), composer3, 0, 0, 131066);
                        if (j3Var.c) {
                            composer3.startReplaceGroup(-1309678807);
                            ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer3, 390, 58);
                            composer4 = composer3;
                            composer4.endReplaceGroup();
                        } else {
                            composer4 = composer3;
                            composer4.startReplaceGroup(-1309440479);
                            composer4.endReplaceGroup();
                        }
                        composer4.endNode();
                        if (j3Var.b.isEmpty()) {
                            composer4.startReplaceGroup(521011706);
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer4, 0, 3);
                            objRememberedValue = composer4.rememberedValue();
                            companion2 = Composer.INSTANCE;
                            if (objRememberedValue == companion2.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer4);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            coroutineScope = (CoroutineScope) objRememberedValue;
                            Modifier modifierLayout2 = LayoutModifierKt.layout(companion, new f1(2));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_8 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
                            float fM7813constructorimpl2 = Dp.m7813constructorimpl(8.0f);
                            float f3 = a;
                            PaddingValues paddingValuesM995PaddingValuesa9UjIt5 = PaddingKt.m995PaddingValuesa9UjIt4(f3, f, Dp.m7813constructorimpl(fM7813constructorimpl2 + f3), f);
                            boolean zChangedInstance2 = composer4.changedInstance(j3Var) | composer4.changed(i5) | composer4.changed(iIntValue) | composer4.changed(lazyListStateRememberLazyListState) | composer4.changedInstance(coroutineScope);
                            if ((i6 & 57344) == 16384) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z14 = z2 | zChangedInstance2;
                            if ((458752 & i6) == 131072) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z15 = z14 | z3;
                            if ((i6 & 896) == 256) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            boolean z16 = z15 | z4;
                            if ((i6 & Input.Keys.FORWARD_DEL) == i7) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean z17 = z16 | z5;
                            if ((i6 & 7168) == 2048) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            boolean z18 = z17 | z6;
                            if ((3670016 & i6) == 1048576) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z18 | z7;
                            objRememberedValue2 = composer4.rememberedValue();
                            if (z8) {
                                composer7 = composer4;
                                v4 v4Var2 = new v4(j3Var, i5, iIntValue, lazyListStateRememberLazyListState, coroutineScope, focusRequester2, function1, z, str, focusRequester, function2, 1);
                                lazyListStateRememberLazyListState = lazyListStateRememberLazyListState;
                                composer7.updateRememberedValue(v4Var2);
                                objRememberedValue2 = v4Var2;
                            } else {
                                composer7 = composer4;
                                v4 v4Var3 = new v4(j3Var, i5, iIntValue, lazyListStateRememberLazyListState, coroutineScope, focusRequester2, function1, z, str, focusRequester, function2, 1);
                                lazyListStateRememberLazyListState = lazyListStateRememberLazyListState;
                                composer7.updateRememberedValue(v4Var3);
                                objRememberedValue2 = v4Var3;
                            }
                            Composer composer10 = composer7;
                            LazyDslKt.LazyRow(modifierLayout2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValuesa9UjIt5, false, horizontalOrVerticalM712spacedBy0680j_8, null, null, false, null, (Function1) objRememberedValue2, composer10, 24576, 488);
                            composer6 = composer10;
                            composer6.endReplaceGroup();
                        } else {
                            composer5 = composer4;
                            if (j3Var.d != null) {
                                composer5.startReplaceGroup(524839989);
                                TextKt.m3048TextNvy7gAk(j3Var.d, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i4).getError(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i4).getBodySmall(), composer5, 0, 0, 131066);
                                composer6 = composer5;
                                composer6.endReplaceGroup();
                            } else {
                                composer5.startReplaceGroup(525211307);
                                TextKt.m3048TextNvy7gAk("这个服务器暂无历史记录。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i4).getOnBackground(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i4).getBodyMedium(), composer5, 6, 0, 131066);
                                composer6 = composer5;
                                composer6.endReplaceGroup();
                            }
                        }
                        composer6.endNode();
                        fM7827unboximpl = f;
                        composerStartRestartGroup = composer6;
                        i3 = i16;
                        ioVar = ioVar3;
                        i7 = 32;
                    }
                    Composer composer11 = composerStartRestartGroup;
                    composer11.endReplaceGroup();
                    composer2 = composer11;
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new z4(list, str, z, focusRequester, focusRequester2, function1, function2, i, 0));
        }
    }

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
    public static final void N(h3 h3Var, Function0 function0, Modifier modifier, FocusRequester focusRequester, Composer composer, int i) {
        Composer composer2;
        String primary;
        String str;
        String thumb;
        String seriesId;
        Object obj;
        Double d;
        float fCoerceIn;
        float fM7813constructorimpl;
        final MediaItem mediaItem = h3Var.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1981164737);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(h3Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981164737, i2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateRecentResumeCard (AggregateHubScreen.kt:1828)");
            }
            ServerConfig serverConfig = h3Var.a;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(mediaItem.getImageTags()) | composerStartRestartGroup.changed(mediaItem.getId()) | composerStartRestartGroup.changed(serverConfig.getId()) | composerStartRestartGroup.changed(mediaItem.getType()) | composerStartRestartGroup.changed(mediaItem.getSeriesId()) | composerStartRestartGroup.changed(mediaItem.getBackdropImageTags());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (Intrinsics.areEqual(mediaItem.getType(), "Episode") && (seriesId = mediaItem.getSeriesId()) != null && !StringsKt.isBlank(seriesId)) {
                    arrayList.add(ku.n(serverConfig, mediaItem.getSeriesId(), "Thumb", null, HttpStatus.SC_BAD_REQUEST));
                    arrayList.add(ku.n(serverConfig, mediaItem.getSeriesId(), "Backdrop", null, HttpStatus.SC_BAD_REQUEST));
                    arrayList.add(ku.n(serverConfig, mediaItem.getSeriesId(), "Primary", null, HttpStatus.SC_BAD_REQUEST));
                }
                ImageTags imageTags = mediaItem.getImageTags();
                if (imageTags != null && (thumb = imageTags.getThumb()) != null) {
                    arrayList.add(ku.n(serverConfig, mediaItem.getId(), "Thumb", thumb, HttpStatus.SC_BAD_REQUEST));
                }
                List<String> backdropImageTags = mediaItem.getBackdropImageTags();
                if (backdropImageTags != null && (str = (String) CollectionsKt.firstOrNull((List) backdropImageTags)) != null) {
                    arrayList.add(ku.n(serverConfig, mediaItem.getId(), "Backdrop", str, HttpStatus.SC_BAD_REQUEST));
                }
                ImageTags imageTags2 = mediaItem.getImageTags();
                if (imageTags2 != null && (primary = imageTags2.getPrimary()) != null) {
                    arrayList.add(ku.n(serverConfig, mediaItem.getId(), "Primary", primary, HttpStatus.SC_BAD_REQUEST));
                }
                List listDistinct = CollectionsKt___CollectionsKt.distinct(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listDistinct) {
                    if (!StringsKt.isBlank((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList2);
                obj = arrayList2;
            } else {
                i2 = i2;
                obj = objRememberedValue2;
            }
            final List list = (List) obj;
            boolean zChanged2 = composerStartRestartGroup.changed(serverConfig.getId()) | composerStartRestartGroup.changed(mediaItem.getId()) | composerStartRestartGroup.changed(list);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                d = null;
                objRememberedValue3 = mr.l(0, null, 2, null, composerStartRestartGroup);
            } else {
                d = null;
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            int iIntValue = ((Number) mutableState2.getValue()).intValue();
            final String str2 = (String) ((iIntValue < 0 || iIntValue >= list.size()) ? "" : list.get(iIntValue));
            UserData userData = mediaItem.getUserData();
            Object objValueOf = userData != null ? Long.valueOf(userData.getPlaybackPositionTicks()) : d;
            UserData userData2 = mediaItem.getUserData();
            boolean zChanged3 = composerStartRestartGroup.changed(objValueOf) | composerStartRestartGroup.changed(userData2 != null ? userData2.getPlayedPercentage() : d) | composerStartRestartGroup.changed(mediaItem.getRunTimeTicks());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                UserData userData3 = mediaItem.getUserData();
                Double playedPercentage = userData3 != null ? userData3.getPlayedPercentage() : d;
                if (playedPercentage == null || playedPercentage.doubleValue() <= 0.0d) {
                    UserData userData4 = mediaItem.getUserData();
                    long playbackPositionTicks = userData4 != null ? userData4.getPlaybackPositionTicks() : 0L;
                    Long runTimeTicks = mediaItem.getRunTimeTicks();
                    long jLongValue = runTimeTicks != null ? runTimeTicks.longValue() : 0L;
                    fCoerceIn = (playbackPositionTicks <= 0 || jLongValue <= 0) ? 0.0f : RangesKt.coerceIn(playbackPositionTicks / jLongValue, 0.0f, 1.0f);
                } else {
                    fCoerceIn = RangesKt.coerceIn((float) (playedPercentage.doubleValue() / 100.0d), 0.0f, 1.0f);
                }
                objRememberedValue4 = Float.valueOf(fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            float fFloatValue = ((Number) objRememberedValue4).floatValue();
            boolean zChanged4 = composerStartRestartGroup.changed(mediaItem.getParentIndexNumber()) | composerStartRestartGroup.changed(mediaItem.getIndexNumber()) | composerStartRestartGroup.changed(mediaItem.getName());
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                StringBuilder sb = new StringBuilder();
                if (mediaItem.getParentIndexNumber() != null) {
                    sb.append(ExifInterface.LATITUDE_SOUTH + StringsKt__StringsKt.padStart(String.valueOf(mediaItem.getParentIndexNumber().intValue()), 2, '0'));
                }
                if (mediaItem.getIndexNumber() != null) {
                    if (sb.length() > 0) {
                        sb.append(" - ");
                    }
                    sb.append(ExifInterface.LONGITUDE_EAST + StringsKt__StringsKt.padStart(String.valueOf(mediaItem.getIndexNumber().intValue()), 2, '0'));
                }
                if (mediaItem.getName().length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(" - ");
                    }
                    sb.append(mediaItem.getName());
                }
                objRememberedValue5 = sb.toString();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState2 = mutableState2;
            }
            final String str3 = (String) objRememberedValue5;
            float f = ioVar.z;
            float f2 = ioVar.B;
            float f3 = ioVar.A;
            float fM7813constructorimpl2 = Dp.m7813constructorimpl(14.0f);
            final RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(fM7813constructorimpl2);
            composerStartRestartGroup.startReplaceGroup(-1228741454);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2025277826, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-detachedFocusBorderEnabled> (Theme.kt:152)");
                }
                boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.h)).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fM7813constructorimpl = zBooleanValue ? Dp.m7813constructorimpl(5.0f) : Dp.m7813constructorimpl(0.0f);
            } else {
                fM7813constructorimpl = Dp.m7813constructorimpl(0.0f);
                fFloatValue = fFloatValue;
                f3 = f3;
            }
            composerStartRestartGroup.endReplaceGroup();
            final RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(fM7813constructorimpl2 + fM7813constructorimpl));
            float f4 = ((Boolean) mutableState.getValue()).booleanValue() ? 1.03f : 1.0f;
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(modifier, f), f2);
            Modifier modifierFocusRequester = Modifier.INSTANCE;
            if (focusRequester != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester);
            }
            Modifier modifierThen = modifierM1050height3ABfNKs.then(modifierFocusRequester);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new t1(11, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen, (Function1) objRememberedValue6);
            boolean zChanged5 = composerStartRestartGroup.changed(f4);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = new j5(f4, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierOnFocusChanged, (Function1) objRememberedValue7);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            Color.Companion companion3 = Color.INSTANCE;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(companion3.m5187getTransparent0d7_KjU(), 0L, companion3.m5187getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, (ClickableSurfaceDefaults.$stable << 24) | 390, 250);
            final MutableState mutableState3 = mutableState2;
            final float f5 = fFloatValue;
            final float f6 = f3;
            final float f7 = fM7813constructorimpl;
            Composer composer3 = composerStartRestartGroup;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierGraphicsLayer, null, false, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We08, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(892301854, true, new Function3() { // from class: k5
                /* JADX WARN: Code duplicated, block: B:100:0x059b  */
                /* JADX WARN: Code duplicated, block: B:101:0x05a8  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r34v0 */
                /* JADX WARN: Type inference failed for: r8v23 */
                /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r8v29 */
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
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    BoxScopeInstance boxScopeInstance;
                    Arrangement arrangement;
                    ComposeUiNode.Companion companion4;
                    MediaItem mediaItem2;
                    ComposeUiNode.Companion companion5;
                    String str4;
                    Object r8;
                    int i3;
                    String str5;
                    String strSubstring;
                    Composer composer4;
                    Composer composer5;
                    Composer composer6;
                    Composer composer7 = (Composer) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    ((BoxScope) obj3).getClass();
                    if (composer7.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(892301854, iIntValue2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateRecentResumeCard.<anonymous> (AggregateHubScreen.kt:1898)");
                        }
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement2.getTop();
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion7.getStart(), composer7, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                        int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion8.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor);
                        } else {
                            composer7.useNode();
                        }
                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer7);
                        mr.z(companion8, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierThen2 = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), f6).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion6, Dp.m7813constructorimpl(2.0f), u61Var.b, roundedCornerShapeM1312RoundedCornerShape0680j_5) : companion6);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                        int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer7, modifierThen2);
                        Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor2);
                        } else {
                            composer7.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer7);
                        mr.z(companion8, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierClip = ClipKt.clip(PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), f7), roundedCornerShapeM1312RoundedCornerShape0680j_4);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                        int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer7, modifierClip);
                        Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor3);
                        } else {
                            composer7.useNode();
                        }
                        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer7);
                        mr.z(companion8, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                        v31.a(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), 0.0f, composer7, 6, 2);
                        String str6 = str2;
                        int length = str6.length();
                        MediaItem mediaItem3 = mediaItem;
                        if (length > 0) {
                            composer7.startReplaceGroup(192748763);
                            String name = mediaItem3.getName();
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                            ContentScale crop = ContentScale.INSTANCE.getCrop();
                            MutableState mutableState4 = mutableState3;
                            boolean zChanged6 = composer7.changed(mutableState4);
                            List list2 = list;
                            boolean zChangedInstance = zChanged6 | composer7.changedInstance(list2);
                            Object objRememberedValue8 = composer7.rememberedValue();
                            if (zChangedInstance || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new n5(list2, mutableState4);
                                composer7.updateRememberedValue(objRememberedValue8);
                            }
                            boxScopeInstance = boxScopeInstance2;
                            arrangement = arrangement2;
                            companion4 = companion8;
                            mediaItem2 = mediaItem3;
                            g12.b(str6, name, modifierFillMaxSize$default2, null, null, null, null, (Function1) objRememberedValue8, null, crop, composer7, RendererCapabilities.DECODER_SUPPORT_MASK, 6, 31480);
                            composer7.endReplaceGroup();
                        } else {
                            boxScopeInstance = boxScopeInstance2;
                            arrangement = arrangement2;
                            companion4 = companion8;
                            mediaItem2 = mediaItem3;
                            composer7.startReplaceGroup(193269346);
                            composer7.endReplaceGroup();
                        }
                        Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(boxScopeInstance.align(companion6, companion7.getCenter()), Dp.m7813constructorimpl(48.0f));
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i7 = MaterialTheme.$stable;
                        CornerBasedShape medium = materialTheme.getShapes(composer7, i7).getMedium();
                        Color.Companion companion9 = Color.INSTANCE;
                        androidx.compose.material3.SurfaceKt.m2905SurfaceT9BRK9s(modifierM1064size3ABfNKs, medium, Color.m5151copywmQWz5c$default(companion9.m5189getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ss.h, composer7, 12583296, 120);
                        float f8 = f5;
                        if (f8 > 0.0f) {
                            composer7.startReplaceGroup(194064496);
                            str4 = null;
                            i3 = 1;
                            Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1050height3ABfNKs(PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion6, companion7.getBottomCenter()), 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f)), Dp.m7813constructorimpl(4.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(999.0f))), Color.m5151copywmQWz5c$default(companion9.m5189getWhite0d7_KjU(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            r8 = 0;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                            int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer7, modifierM275backgroundbw27NRU$default);
                            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                            if (composer7.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer7.startReusableNode();
                            if (composer7.getInserting()) {
                                composer7.createNode(constructor4);
                            } else {
                                composer7.useNode();
                            }
                            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer7);
                            companion5 = companion4;
                            mr.z(companion5, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i8), composerM4318constructorimpl4));
                            BoxKt.Box(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion6, f8), 0.0f, 1, null), Color.m5151copywmQWz5c$default(companion9.m5189getWhite0d7_KjU(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer7, 0);
                            composer7.endNode();
                            composer7.endReplaceGroup();
                        } else {
                            companion5 = companion4;
                            str4 = null;
                            r8 = 0;
                            i3 = 1;
                            composer7.startReplaceGroup(194881346);
                            composer7.endReplaceGroup();
                        }
                        composer7.endNode();
                        composer7.endNode();
                        Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(wn.F(columnScopeInstance, SizeKt.fillMaxWidth$default(companion6, 0.0f, i3, str4), 1.0f, false, 2, null), Dp.m7813constructorimpl(4.0f), Dp.m7813constructorimpl(3.0f));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), r8);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, r8);
                        int i9 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composer7.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer7, modifierM1000paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                        if (composer7.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor5);
                        } else {
                            composer7.useNode();
                        }
                        Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer7);
                        mr.z(companion5, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                        Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl5, Integer.valueOf(i9), composerM4318constructorimpl5));
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(2.0f)), companion7.getStart(), composer7, 6);
                        long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, r8);
                        int i10 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer7, companion6);
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
                        mr.z(companion5, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                        Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl6, Integer.valueOf(i10), composerM4318constructorimpl6));
                        if (Intrinsics.areEqual(mediaItem2.getType(), "Episode")) {
                            composer7.startReplaceGroup(1493133527);
                            String seriesName = mediaItem2.getSeriesName();
                            if (seriesName == null) {
                                seriesName = mediaItem2.getName();
                            }
                            TextStyle bodyMedium = materialTheme.getTypography(composer7, i7).getBodyMedium();
                            long onSurface = materialTheme.getColorScheme(composer7, i7).getOnSurface();
                            TextOverflow.Companion companion10 = TextOverflow.INSTANCE;
                            TextKt.m3048TextNvy7gAk(seriesName, null, onSurface, null, 0L, null, null, null, 0L, null, null, 0L, companion10.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, composer7, 0, 24960, 110586);
                            Composer composer8 = composer7;
                            String str7 = str3;
                            if (str7.length() > 0) {
                                composer8.startReplaceGroup(1493571216);
                                TextKt.m3048TextNvy7gAk(str7, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer8, i7).getOnSurface(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion10.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer8, i7).getLabelSmall(), 0L, TextUnitKt.getSp(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer8, 0, 24960, 110586);
                                Composer composer9 = composer8;
                                composer9.endReplaceGroup();
                                composer6 = composer9;
                            } else {
                                composer8.startReplaceGroup(1493976603);
                                composer8.endReplaceGroup();
                                composer6 = composer8;
                            }
                            composer6.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            composer5 = composer6;
                        } else {
                            composer7.startReplaceGroup(1494032744);
                            String name2 = mediaItem2.getName();
                            TextStyle bodyMedium2 = materialTheme.getTypography(composer7, i7).getBodyMedium();
                            long onSurface2 = materialTheme.getColorScheme(composer7, i7).getOnSurface();
                            TextOverflow.Companion companion11 = TextOverflow.INSTANCE;
                            String str8 = str4;
                            Object r34 = r8;
                            TextKt.m3048TextNvy7gAk(name2, null, onSurface2, null, 0L, null, null, null, 0L, null, null, 0L, companion11.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium2, composer7, 0, 24960, 110586);
                            if (mediaItem2.getProductionYear() != null) {
                                strSubstring = String.valueOf(mediaItem2.getProductionYear().intValue());
                            } else {
                                String premiereDate = mediaItem2.getPremiereDate();
                                if (premiereDate == null || StringsKt.isBlank(premiereDate) || mediaItem2.getPremiereDate().length() < 4) {
                                    str5 = str8;
                                } else {
                                    strSubstring = mediaItem2.getPremiereDate().substring(r34 == true ? 1 : 0, 4);
                                }
                                if (str5 == null) {
                                    composer7.startReplaceGroup(1494434720);
                                    composer7.endReplaceGroup();
                                    composer4 = composer7;
                                } else {
                                    composer7.startReplaceGroup(1494434721);
                                    Composer composer10 = composer7;
                                    TextKt.m3048TextNvy7gAk(str5, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer7, i7).getOnSurface(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion11.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer7, i7).getLabelSmall(), 0L, TextUnitKt.getSp(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer10, 0, 24960, 110586);
                                    Unit unit2 = Unit.INSTANCE;
                                    composer10.endReplaceGroup();
                                    composer4 = composer10;
                                }
                                composer4.endReplaceGroup();
                                composer5 = composer4;
                            }
                            str5 = strSubstring;
                            if (str5 == null) {
                                composer7.startReplaceGroup(1494434720);
                                composer7.endReplaceGroup();
                                composer4 = composer7;
                            } else {
                                composer7.startReplaceGroup(1494434721);
                                Composer composer11 = composer7;
                                TextKt.m3048TextNvy7gAk(str5, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer7, i7).getOnSurface(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion11.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer7, i7).getLabelSmall(), 0L, TextUnitKt.getSp(11), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer11, 0, 24960, 110586);
                                Unit unit3 = Unit.INSTANCE;
                                composer11.endReplaceGroup();
                                composer4 = composer11;
                            }
                            composer4.endReplaceGroup();
                            composer5 = composer4;
                        }
                        if (i02.w(composer5)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer7.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer3, (i2 >> 3) & 14, 48, 1980);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            Composer composer4 = composerStartRestartGroup;
            composer4.skipToGroupEnd();
            composer2 = composer4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5(h3Var, function0, modifier, focusRequester, i, 0));
        }
    }

    public static final void O(final h7 h7Var, final List list, final Bitmap bitmap, final String str, final boolean z, final VideoVersionPrioritySettings videoVersionPrioritySettings, final String str2, final boolean z2, final FocusRequester focusRequester, final FocusRequester focusRequester2, final FocusRequester focusRequester3, final Function1 function1, final Function0 function0, final Function3 function3, final Function1 function2, final List list2, final Function1 function4, final Function0 function5, final Function1 function6, Composer composer, final int i, final int i2) {
        int i3;
        List list3;
        Bitmap bitmap2;
        int i4;
        Composer composer2;
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2082398575);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(h7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            list3 = list;
            i3 |= composerStartRestartGroup.changedInstance(list3) ? 32 : 16;
        } else {
            list3 = list;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            bitmap2 = bitmap;
            i3 |= composerStartRestartGroup.changedInstance(bitmap2) ? 256 : 128;
        } else {
            bitmap2 = bitmap;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(videoVersionPrioritySettings) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        int i7 = i & 100663296;
        int i8 = GroupFlagsKt.HasAuxSlotFlag;
        if (i7 == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(focusRequester3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function5) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function6)) {
                i8 = 67108864;
            }
            i4 |= i8;
        }
        int i9 = i4;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (38347923 & i9) == 38347922) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2082398575, i3, i9, "com.dh.myembyapp.ui.screens.aggregate.AggregateSearchModule (AggregateHubScreen.kt:1508)");
            }
            boolean zChanged = composerStartRestartGroup.changed(h7Var.d) | ((i3 & 57344) == 16384) | composerStartRestartGroup.changed(videoVersionPrioritySettings);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                List list4 = h7Var.d;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it = list4.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int i12 = i9;
                    g7 g7Var = (g7) next;
                    arrayList.add(TuplesKt.to(Integer.valueOf(i10), new t8(g7Var.a, g7Var.b, g7Var.c, g7Var.d)));
                    it = it;
                    i10 = i11;
                    i9 = i12;
                    i3 = i3;
                }
                i5 = i9;
                i6 = i3;
                if (z) {
                    int i13 = 0;
                    List listSortedWith = CollectionsKt.sortedWith(arrayList, new b5(i13, new a5(videoVersionPrioritySettings, i13)));
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
                    Iterator it2 = listSortedWith.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((t8) ((Pair) it2.next()).getSecond());
                    }
                    objRememberedValue = arrayList2;
                } else {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        arrayList3.add((t8) ((Pair) obj).getSecond());
                    }
                    objRememberedValue = arrayList3;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i5 = i9;
                i6 = i3;
            }
            composer2 = composerStartRestartGroup;
            int i15 = i6 >> 21;
            int i16 = i5 << 6;
            m8.a(h7Var.a, h7Var.c, h7Var.b, (List) objRememberedValue, list3.size(), bitmap2, str, z, videoVersionPrioritySettings, str2, z2, focusRequester, focusRequester2, function1, function0, function3, null, focusRequester3, "聚合搜索", h7Var.e, h7Var.f, function2, list2, function4, function5, function6, composer2, (i6 << 9) & 2147418112, (i16 & 458752) | (i16 & 7168) | (i15 & 14) | 100663296 | (i15 & Input.Keys.FORWARD_DEL) | (i15 & 896) | (i16 & 57344) | ((i5 << 21) & 29360128), (i5 >> 9) & 524272, 65536);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: c5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    f7.O(h7Var, list, bitmap, str, z, videoVersionPrioritySettings, str2, z2, focusRequester, focusRequester2, focusRequester3, function1, function0, function3, function2, list2, function4, function5, function6, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:191:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[LOOP:2: B:113:0x01ea->B:193:?, LOOP_END, SYNTHETIC] */
    public static final void a(List list, String str, boolean z, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function2 function2, Composer composer, int i) {
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        z4 z4Var;
        int i2;
        int i3;
        int i4;
        Iterator it;
        Modifier.Companion companion;
        String str2;
        boolean z2;
        f3 f3Var;
        List list2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-423089456);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        int i5 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            focusRequester3 = focusRequester2;
            i5 |= composerStartRestartGroup.changed(focusRequester3) ? 16384 : 8192;
        } else {
            focusRequester3 = focusRequester2;
        }
        if ((196608 & i) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i5) != 599186, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-423089456, i5, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateFavoriteOverviewSection (AggregateHubScreen.kt:2035)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1029588641);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Iterator it2 = list.iterator();
                int i7 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    f3 f3Var2 = (f3) it2.next();
                    if (!f3Var2.b.isEmpty() || !f3Var2.c.isEmpty()) {
                        i2 = i7;
                        break;
                    }
                    i7++;
                }
                objRememberedValue = Integer.valueOf(i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1029529246);
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    z4Var = new z4(list, str, z, focusRequester, focusRequester3, function1, function2, i, 1);
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(-1029461976);
                composerStartRestartGroup.endReplaceGroup();
                if (list.isEmpty()) {
                    if (!list.isEmpty()) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((f3) it.next()).d) {
                                    composerStartRestartGroup.startReplaceGroup(-1029054264);
                                    composerStartRestartGroup.endReplaceGroup();
                                    i3 = i5;
                                    i4 = 6;
                                }
                            }
                        }
                    }
                    composerStartRestartGroup.startReplaceGroup(-1029251579);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    i3 = i5;
                    i4 = 6;
                    TextKt.m3048TextNvy7gAk("暂无收藏内容", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i8).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i8).getBodyLarge(), composerStartRestartGroup, 6, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            f3 f3Var3 = (f3) it3.next();
                            if (!f3Var3.b.isEmpty() || !f3Var3.c.isEmpty()) {
                            }
                        } else {
                            if (!list.isEmpty()) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((f3) it.next()).d) {
                                        }
                                    }
                                }
                            }
                            composerStartRestartGroup.startReplaceGroup(-1029251579);
                            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                            int i9 = MaterialTheme.$stable;
                            i3 = i5;
                            i4 = 6;
                            TextKt.m3048TextNvy7gAk("暂无收藏内容", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i9).getOnBackground(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i9).getBodyLarge(), composerStartRestartGroup, 6, 0, 131066);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1029054264);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 = i5;
                        i4 = 6;
                    }
                }
                composerStartRestartGroup.startReplaceGroup(936640240);
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    f3 f3Var4 = (f3) obj;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, companion5.getStart(), composerStartRestartGroup, i4);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i12), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    iIntValue = iIntValue;
                    FocusRequester focusRequester4 = i10 == iIntValue ? focusRequester2 : null;
                    List list3 = f3Var4.b;
                    String str3 = f3Var4.e;
                    boolean z3 = f3Var4.d;
                    List list4 = f3Var4.c;
                    ServerConfig serverConfig = f3Var4.a;
                    if (list3.isEmpty()) {
                        companion = companion4;
                        str2 = str3;
                        z2 = z3;
                        composerStartRestartGroup.startReplaceGroup(-318462810);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-319134549);
                        int i13 = i3 << 9;
                        z2 = z3;
                        str2 = str3;
                        companion = companion4;
                        b(c61.n(serverConfig.getAlias(), " - 剧集"), f3Var4.b, "series", serverConfig.getId(), str, z, focusRequester, focusRequester4, function1, function2, composerStartRestartGroup, (i13 & 57344) | RendererCapabilities.DECODER_SUPPORT_MASK | (i13 & 458752) | (i13 & 3670016) | (i13 & 234881024) | (i13 & 1879048192));
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (list4.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(-317561082);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-318381776);
                        String strN = c61.n(serverConfig.getAlias(), " - 电影");
                        List list5 = f3Var4.c;
                        String id = serverConfig.getId();
                        if (!list3.isEmpty()) {
                            focusRequester4 = null;
                        }
                        int i14 = i3 << 9;
                        b(strN, list5, "movie", id, str, z, focusRequester, focusRequester4, function1, function2, composerStartRestartGroup, (i14 & 57344) | RendererCapabilities.DECODER_SUPPORT_MASK | (i14 & 458752) | (i14 & 3670016) | (i14 & 234881024) | (i14 & 1879048192));
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (z2 && list3.isEmpty() && list4.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(-317434726);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion5.getCenterVertically(), composerStartRestartGroup, 54);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i15 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                        mr.z(companion6, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i15), composerM4318constructorimpl3));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String alias = serverConfig.getAlias();
                        MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                        int i16 = MaterialTheme.$stable;
                        Composer composer2 = composerStartRestartGroup;
                        list2 = list3;
                        f3Var = f3Var4;
                        TextKt.m3048TextNvy7gAk(alias, null, materialTheme3.getColorScheme(composerStartRestartGroup, i16).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composerStartRestartGroup, i16).getTitleLarge(), composer2, 0, 0, 131066);
                        ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer2, 390, 58);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        f3Var = f3Var4;
                        list2 = list3;
                        composerStartRestartGroup.startReplaceGroup(-316777402);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (str2 != null) {
                        composerStartRestartGroup.startReplaceGroup(-316703994);
                        String str4 = f3Var.e;
                        MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                        int i17 = MaterialTheme.$stable;
                        Composer composer3 = composerStartRestartGroup;
                        TextKt.m3048TextNvy7gAk(str4, null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composerStartRestartGroup, i17).getError(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composerStartRestartGroup, i17).getBodySmall(), composer3, 0, 0, 131066);
                        composerStartRestartGroup = composer3;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-316470874);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (!z2 && list2.isEmpty() && list4.isEmpty() && str2 == null) {
                        composerStartRestartGroup.startReplaceGroup(-316213543);
                        MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                        int i18 = MaterialTheme.$stable;
                        Composer composer4 = composerStartRestartGroup;
                        TextKt.m3048TextNvy7gAk("这个服务器暂无剧集或电影收藏。", null, Color.m5151copywmQWz5c$default(materialTheme5.getColorScheme(composerStartRestartGroup, i18).getOnBackground(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composerStartRestartGroup, i18).getBodyMedium(), composer4, 6, 0, 131066);
                        composerStartRestartGroup = composer4;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-315967930);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    i10 = i11;
                    i4 = 6;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(z4Var);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            z4Var = new z4(list, str, z, focusRequester, focusRequester2, function1, function2, i, 2);
            scopeUpdateScopeEndRestartGroup.updateScope(z4Var);
        }
    }

    public static final void b(final String str, final List list, final String str2, final String str3, final String str4, final boolean z, final FocusRequester focusRequester, final FocusRequester focusRequester2, final Function1 function1, final Function2 function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final LazyListState lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(2087448796);
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
            i2 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2087448796, i2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateFavoriteServerRow (AggregateHubScreen.kt:2154)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float fM7827unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m7811boximpl(ioVar.g), Dp.m7811boximpl(Dp.m7813constructorimpl(14.0f)))).m7827unboximpl();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(ioVar.a(Dp.m7813constructorimpl(12.0f)));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk(str, PaddingKt.m1003paddingqDBjuR0$default(companion2, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnBackground(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getTitleLarge(), composerStartRestartGroup, (i2 & 14) | 48, 0, 131064);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
            PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(fM7827unboximpl, fM7827unboximpl, Dp.m7813constructorimpl(48.0f), fM7827unboximpl);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(coroutineScope) | ((29360128 & i2) == 8388608) | ((458752 & i2) == 131072) | ((57344 & i2) == 16384) | ((3670016 & i2) == 1048576) | ((1879048192 & i2) == 536870912) | ((i2 & 234881024) == 67108864);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                lazyListState = lazyListStateRememberLazyListState;
                Function1 function3 = new Function1() { // from class: d5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        lazyListScope.getClass();
                        String str5 = str2;
                        String str6 = str3;
                        a2 a2Var = new a2(2, str5, str6);
                        List list2 = list;
                        lazyListScope.items(list2.size(), new w5(1, a2Var, list2), new x5(list2, 0), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new y5(list2, str5, str6, lazyListState, coroutineScope, list2, focusRequester2, z, str4, focusRequester, function2, function1)));
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function3);
                objRememberedValue2 = function3;
            } else {
                lazyListState = lazyListStateRememberLazyListState;
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyRow(null, lazyListState, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue2, composer2, 24576, 489);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: e5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f7.b(str, list, str2, str3, str4, z, focusRequester, focusRequester2, function1, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void c(Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(12815877);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(12815877, i2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubExitConfirmDialog (AggregateHubScreen.kt:1078)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new u5(context, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kh0.a(function0, (Function0) objRememberedValue, function1, "是否退出", "退出软件", "退回服务页", Dp.m7813constructorimpl(400.0f), Dp.m7813constructorimpl(198.0f), Dp.m7813constructorimpl(156.0f), composerStartRestartGroup, (i2 & 14) | 115043328 | ((i2 << 3) & 896), 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h4(function0, function1, i, i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final String str, final ImageVector imageVector, final boolean z, final i3 i3Var, final i3 i3Var2, final boolean z2, final boolean z3, final boolean z4, final FocusRequester focusRequester, final Function0 function0, Composer composer, final int i) {
        int i2;
        boolean z5;
        Composer composer2;
        char c;
        long jM5187getTransparent0d7_KjU;
        MutableState mutableState;
        long j;
        long jU;
        Composer composerStartRestartGroup = composer.startRestartGroup(2079112405);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(i3Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(i3Var2.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            z5 = z2;
            i2 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
        } else {
            z5 = z2;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2079112405, i2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubNavButton (AggregateHubScreen.kt:1378)");
            }
            if (ComposerKt.isTraceInProgress()) {
                c = 1;
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            } else {
                c = 1;
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(n72.g)).booleanValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z6 = !zBooleanValue;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue2 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            if (z3) {
                jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
            } else {
                jM5187getTransparent0d7_KjU = z ? u61Var.I : u61Var.G;
            }
            long jM5189getWhite0d7_KjU = z ? u61Var.J : u61Var.H;
            char c2 = (i3Var == i3Var2 || z4) ? c : (char) 0;
            Boolean bool = (Boolean) mutableState2.getValue();
            bool.getClass();
            Boolean boolValueOf = Boolean.valueOf(z4);
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            Object[] objArr = new Object[4];
            objArr[0] = bool;
            objArr[c] = boolValueOf;
            objArr[2] = boolValueOf2;
            objArr[3] = i3Var2;
            int i3 = ((29360128 & i2) == 8388608 ? c : (char) 0) | ((458752 & i2) == 131072 ? c : (char) 0) | ((57344 & i2) == 16384 ? c : (char) 0) | ((i2 & 7168) == 2048 ? c : (char) 0) | ((1879048192 & i2) == 536870912 ? c : (char) 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i3 != 0 || objRememberedValue3 == companion.getEmpty()) {
                z5 z5Var = new z5(z4, z2, i3Var2, i3Var, function0, mutableState2, mutableState3, null, 0);
                mutableState = mutableState2;
                composerStartRestartGroup.updateRememberedValue(z5Var);
                objRememberedValue3 = z5Var;
            } else {
                mutableState = mutableState2;
            }
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(40.0f)), Dp.m7813constructorimpl(85.0f)), focusRequester);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new t1(10, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue4);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            if (c2 != 0) {
                if (!zBooleanValue) {
                    jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                }
                j = jM5189getWhite0d7_KjU;
            } else {
                j = jM5187getTransparent0d7_KjU;
            }
            if (zBooleanValue) {
                jU = kb0.u(composerStartRestartGroup, 1116484074, materialTheme, composerStartRestartGroup, i4);
            } else {
                composerStartRestartGroup.startReplaceGroup(1116428956);
                composerStartRestartGroup.endReplaceGroup();
                jU = ColorKt.Color(4279308561L);
            }
            long j2 = jU;
            int i5 = ButtonDefaults.$stable;
            ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(jM5187getTransparent0d7_KjU, onSurface, j, j2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i5 << 24, PsExtractor.VIDEO_STREAM_MASK);
            ButtonBorder buttonBorderBorder = buttonDefaults.border(null, c2 != 0 ? new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null) : new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 29);
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 0.0f, c2 != 0 ? 1.05f : 1.0f, 0.0f, 0.0f, 0.0f, 29, null), c2 != 0 ? el0.a(u61Var) : ButtonDefaults.glow$default(buttonDefaults, null, null, null, 7, null), null, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1879326011, true, new x4(imageVector, c2, z6, z, str, mutableState, 0), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 27) & 14, 390, 2380);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: y4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f7.d(str, imageVector, z, i3Var, i3Var2, z2, z3, z4, focusRequester, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:446:0x0d7d  */
    /* JADX WARN: Code duplicated, block: B:448:0x0d81  */
    /* JADX WARN: Code duplicated, block: B:453:0x0d94  */
    /* JADX WARN: Code duplicated, block: B:458:0x0dd4  */
    /* JADX WARN: Code duplicated, block: B:459:0x0dd7  */
    /* JADX WARN: Code duplicated, block: B:466:0x0df3  */
    /* JADX WARN: Code duplicated, block: B:469:0x0e63  */
    /* JADX WARN: Code duplicated, block: B:471:0x0e67  */
    /* JADX WARN: Code duplicated, block: B:476:0x0e81  */
    /* JADX WARN: Code duplicated, block: B:483:0x0eca  */
    /* JADX WARN: Code duplicated, block: B:537:0x0fe4  */
    /* JADX WARN: Code duplicated, block: B:540:0x0fef  */
    /* JADX WARN: Code duplicated, block: B:541:0x0ffc  */
    /* JADX WARN: Code duplicated, block: B:546:0x1022  */
    /* JADX WARN: Code duplicated, block: B:549:0x1039  */
    /* JADX WARN: Code duplicated, block: B:551:0x1070  */
    /* JADX WARN: Code duplicated, block: B:554:0x107c  */
    /* JADX WARN: Code duplicated, block: B:555:0x1080  */
    /* JADX WARN: Code duplicated, block: B:558:0x10fc  */
    /* JADX WARN: Code duplicated, block: B:560:0x110c  */
    /* JADX WARN: Code duplicated, block: B:563:0x111c  */
    /* JADX WARN: Code duplicated, block: B:564:0x111f  */
    /* JADX WARN: Code duplicated, block: B:569:0x112d  */
    /* JADX WARN: Code duplicated, block: B:571:0x113e  */
    /* JADX WARN: Code duplicated, block: B:574:0x1150  */
    /* JADX WARN: Code duplicated, block: B:577:0x1159  */
    /* JADX WARN: Code duplicated, block: B:579:0x1173  */
    /* JADX WARN: Code duplicated, block: B:581:0x11b6  */
    /* JADX WARN: Code duplicated, block: B:584:0x11c2  */
    /* JADX WARN: Code duplicated, block: B:585:0x11c6  */
    /* JADX WARN: Code duplicated, block: B:588:0x11eb  */
    /* JADX WARN: Code duplicated, block: B:590:0x11ee  */
    /* JADX WARN: Code duplicated, block: B:592:0x11f2  */
    /* JADX WARN: Code duplicated, block: B:594:0x11f6  */
    /* JADX WARN: Code duplicated, block: B:600:0x1217  */
    /* JADX WARN: Code duplicated, block: B:603:0x122d  */
    /* JADX WARN: Code duplicated, block: B:604:0x123a  */
    /* JADX WARN: Code duplicated, block: B:607:0x12a4  */
    /* JADX WARN: Code duplicated, block: B:609:0x12b1  */
    /* JADX WARN: Code duplicated, block: B:613:0x12e8  */
    /* JADX WARN: Code duplicated, block: B:616:0x12fd  */
    /* JADX WARN: Code duplicated, block: B:617:0x1308  */
    /* JADX WARN: Code duplicated, block: B:620:0x135e  */
    /* JADX WARN: Code duplicated, block: B:626:0x139a  */
    /* JADX WARN: Code duplicated, block: B:629:0x13b0  */
    /* JADX WARN: Code duplicated, block: B:630:0x13bb  */
    /* JADX WARN: Code duplicated, block: B:632:0x1406  */
    /* JADX WARN: Code duplicated, block: B:638:0x1440  */
    /* JADX WARN: Code duplicated, block: B:641:0x1457  */
    /* JADX WARN: Code duplicated, block: B:642:0x1462  */
    /* JADX WARN: Code duplicated, block: B:648:0x14f1  */
    /* JADX WARN: Code duplicated, block: B:651:0x1507  */
    /* JADX WARN: Code duplicated, block: B:654:0x1521  */
    /* JADX WARN: Code duplicated, block: B:657:0x1537  */
    /* JADX WARN: Code duplicated, block: B:659:0x1548  */
    /* JADX WARN: Code duplicated, block: B:660:0x154d  */
    /* JADX WARN: Code duplicated, block: B:663:0x1591  */
    /* JADX WARN: Code duplicated, block: B:665:0x159b  */
    /* JADX WARN: Code duplicated, block: B:667:0x15a0  */
    /* JADX WARN: Code duplicated, block: B:670:0x15b4  */
    /* JADX WARN: Code duplicated, block: B:671:0x15b7  */
    /* JADX WARN: Code duplicated, block: B:676:0x15c5  */
    /* JADX WARN: Code duplicated, block: B:681:0x15f6  */
    /* JADX WARN: Code duplicated, block: B:683:0x1618  */
    /* JADX WARN: Code duplicated, block: B:686:0x1636  */
    /* JADX WARN: Code duplicated, block: B:688:0x1646  */
    /* JADX WARN: Code duplicated, block: B:689:0x1653  */
    /* JADX WARN: Code duplicated, block: B:692:0x165d  */
    /* JADX WARN: Code duplicated, block: B:693:0x165f  */
    /* JADX WARN: Code duplicated, block: B:698:0x166c  */
    /* JADX WARN: Code duplicated, block: B:700:0x167e  */
    /* JADX WARN: Code duplicated, block: B:703:0x1696  */
    /* JADX WARN: Code duplicated, block: B:705:0x16a6  */
    /* JADX WARN: Code duplicated, block: B:706:0x16b3  */
    /* JADX WARN: Code duplicated, block: B:709:0x16c3  */
    /* JADX WARN: Code duplicated, block: B:710:0x16ce  */
    /* JADX WARN: Code duplicated, block: B:713:0x16dc  */
    /* JADX WARN: Code duplicated, block: B:714:0x16e7  */
    /* JADX WARN: Code duplicated, block: B:717:0x16f6  */
    /* JADX WARN: Code duplicated, block: B:718:0x1703  */
    /* JADX WARN: Code duplicated, block: B:721:0x1711  */
    /* JADX WARN: Code duplicated, block: B:722:0x171e  */
    /* JADX WARN: Code duplicated, block: B:725:0x172c  */
    /* JADX WARN: Code duplicated, block: B:726:0x173b  */
    /* JADX WARN: Code duplicated, block: B:729:0x174d  */
    /* JADX WARN: Code duplicated, block: B:730:0x175c  */
    /* JADX WARN: Code duplicated, block: B:733:0x176e  */
    /* JADX WARN: Code duplicated, block: B:734:0x177d  */
    /* JADX WARN: Code duplicated, block: B:741:0x1798  */
    /* JADX WARN: Code duplicated, block: B:744:0x17b1  */
    /* JADX WARN: Code duplicated, block: B:745:0x17c0  */
    /* JADX WARN: Code duplicated, block: B:748:0x17d2  */
    /* JADX WARN: Code duplicated, block: B:749:0x17e1  */
    /* JADX WARN: Code duplicated, block: B:752:0x17f3  */
    /* JADX WARN: Code duplicated, block: B:753:0x1802  */
    /* JADX WARN: Code duplicated, block: B:756:0x1814  */
    /* JADX WARN: Code duplicated, block: B:757:0x1823  */
    /* JADX WARN: Code duplicated, block: B:760:0x1835  */
    /* JADX WARN: Code duplicated, block: B:761:0x1844  */
    /* JADX WARN: Code duplicated, block: B:768:0x1867  */
    /* JADX WARN: Code duplicated, block: B:770:0x18c2  */
    /* JADX WARN: Code duplicated, block: B:773:0x18e5  */
    /* JADX WARN: Code duplicated, block: B:775:0x18f5  */
    /* JADX WARN: Code duplicated, block: B:777:0x1910  */
    /* JADX WARN: Code duplicated, block: B:780:0x1925  */
    /* JADX WARN: Code duplicated, block: B:782:0x1935  */
    /* JADX WARN: Code duplicated, block: B:784:0x194b  */
    /* JADX WARN: Code duplicated, block: B:787:0x1961  */
    /* JADX WARN: Code duplicated, block: B:789:0x1971  */
    /* JADX WARN: Code duplicated, block: B:796:0x199d  */
    /* JADX WARN: Code duplicated, block: B:798:0x19b1  */
    /* JADX WARN: Code duplicated, block: B:801:0x19cd  */
    /* JADX WARN: Code duplicated, block: B:803:0x19dd  */
    /* JADX WARN: Code duplicated, block: B:805:0x19f0  */
    /* JADX WARN: Code duplicated, block: B:808:0x1a05  */
    /* JADX WARN: Code duplicated, block: B:810:0x1a82  */
    /* JADX WARN: Code duplicated, block: B:811:0x1a90  */
    /* JADX WARN: Code duplicated, block: B:818:0x1aac  */
    /* JADX WARN: Code duplicated, block: B:820:0x1afb  */
    /* JADX WARN: Code duplicated, block: B:823:0x1b16  */
    /* JADX WARN: Code duplicated, block: B:825:0x1b2a  */
    /* JADX WARN: Code duplicated, block: B:826:0x1b36  */
    /* JADX WARN: Code duplicated, block: B:831:0x1b53  */
    /* JADX WARN: Code duplicated, block: B:833:0x1b76  */
    /* JADX WARN: Code duplicated, block: B:836:0x1b8f  */
    /* JADX WARN: Code duplicated, block: B:838:0x1b9f  */
    /* JADX WARN: Code duplicated, block: B:839:0x1bab  */
    /* JADX WARN: Code duplicated, block: B:841:0x1bb6  */
    /* JADX WARN: Code duplicated, block: B:844:0x1bcd  */
    /* JADX WARN: Code duplicated, block: B:846:0x1be5  */
    /* JADX WARN: Code duplicated, block: B:847:0x1bf3  */
    /* JADX WARN: Code duplicated, block: B:854:0x1c16  */
    /* JADX WARN: Code duplicated, block: B:861:0x1c3a  */
    /* JADX WARN: Code duplicated, block: B:864:0x1c4f  */
    /* JADX WARN: Code duplicated, block: B:865:0x1c59  */
    /* JADX WARN: Code duplicated, block: B:867:0x1c6c  */
    /* JADX WARN: Code duplicated, block: B:870:0x1c88  */
    /* JADX WARN: Code duplicated, block: B:872:0x1c9c  */
    /* JADX WARN: Code duplicated, block: B:873:0x1ca7  */
    /* JADX WARN: Code duplicated, block: B:878:0x1cc9  */
    /* JADX WARN: Code duplicated, block: B:880:0x1cef  */
    /* JADX WARN: Code duplicated, block: B:883:0x1d04  */
    /* JADX WARN: Code duplicated, block: B:893:0x1d41  */
    /* JADX WARN: Code duplicated, block: B:894:0x1d4b  */
    /* JADX WARN: Code duplicated, block: B:896:0x1d58  */
    /* JADX WARN: Code duplicated, block: B:899:0x1d6e  */
    /* JADX WARN: Code duplicated, block: B:901:0x1d82  */
    /* JADX WARN: Code duplicated, block: B:902:0x1d8f  */
    /* JADX WARN: Code duplicated, block: B:907:0x1da6  */
    /* JADX WARN: Code duplicated, block: B:909:0x1dbd  */
    /* JADX WARN: Code duplicated, block: B:912:0x1dd2  */
    /* JADX WARN: Code duplicated, block: B:914:0x1de6  */
    /* JADX WARN: Code duplicated, block: B:919:0x1e07  */
    /* JADX WARN: Code duplicated, block: B:924:0x1e26  */
    /* JADX WARN: Code duplicated, block: B:926:0x1e60  */
    /* JADX WARN: Code duplicated, block: B:929:0x1e75  */
    /* JADX WARN: Code duplicated, block: B:931:0x1e89  */
    /* JADX WARN: Code duplicated, block: B:936:0x1eaa  */
    /* JADX WARN: Code duplicated, block: B:938:0x1ec0  */
    /* JADX WARN: Code duplicated, block: B:941:0x1ed5  */
    /* JADX WARN: Code duplicated, block: B:943:0x1ee5  */
    /* JADX WARN: Code duplicated, block: B:944:0x1eef  */
    /* JADX WARN: Code duplicated, block: B:946:0x1f2d  */
    /* JADX WARN: Code duplicated, block: B:949:0x1f42  */
    /* JADX WARN: Code duplicated, block: B:951:0x1f52  */
    /* JADX WARN: Code duplicated, block: B:952:0x1f5f  */
    /* JADX WARN: Code duplicated, block: B:955:0x1fac  */
    /* JADX WARN: Code duplicated, block: B:958:0x1fc2  */
    /* JADX WARN: Code duplicated, block: B:960:0x1fd2  */
    /* JADX WARN: Code duplicated, block: B:961:0x1fde  */
    /* JADX WARN: Code duplicated, block: B:963:0x202f  */
    /* JADX WARN: Code duplicated, block: B:966:0x2041  */
    /* JADX WARN: Code duplicated, block: B:968:0x2051  */
    /* JADX WARN: Code duplicated, block: B:969:0x205d  */
    /* JADX WARN: Code duplicated, block: B:971:0x20a5  */
    /* JADX WARN: Code duplicated, block: B:974:0x20b4  */
    /* JADX WARN: Code duplicated, block: B:991:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v230 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.CoroutineContext] */
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
    public static final void e(Function0 function0, Function1 function1, String str, final Function2 function2, Function3 function3, final Function2 function4, boolean z, boolean z2, Modifier modifier, p7 p7Var, Composer composer, int i) {
        boolean z3;
        boolean z4;
        Modifier modifier2;
        p7 p7Var2;
        Composer composer2;
        Composer composer3;
        int i2;
        p7 p7Var3;
        boolean z5;
        boolean z6;
        Modifier modifier3;
        Object obj;
        int i3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i4;
        int i5;
        int i6;
        Object r5;
        Object objMutableStateOf$default;
        int i7;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        Object e6Var;
        int i8;
        Continuation continuation;
        MutableState mutableState;
        Object f6Var;
        int i9;
        y32 y32Var;
        List list;
        Continuation continuation2;
        Boolean bool;
        State state;
        SearchInputServerManager searchInputServerManager;
        p7 p7Var4;
        UserPreferences userPreferences;
        State state2;
        MutableState mutableState2;
        MutableState mutableState3;
        vc vcVar;
        List list2;
        boolean z7;
        boolean zChanged;
        Object q6Var;
        int i10;
        State state3;
        MutableState mutableState4;
        boolean z8;
        boolean zChanged2;
        Object objRememberedValue;
        final MutableState mutableState5;
        final State state4;
        FocusRequester focusRequester;
        State state5;
        SearchInputServerManager searchInputServerManager2;
        boolean z9;
        boolean zChanged3;
        Object objRememberedValue2;
        MutableState mutableState6;
        State state6;
        MutableState mutableState7;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean z10;
        Object objRememberedValue4;
        MutableState mutableState8;
        boolean zChanged4;
        Object objRememberedValue5;
        Function0 function5;
        final p7 p7Var5;
        Modifier modifier4;
        Function0<ComposeUiNode> constructor;
        BoxScopeInstance boxScopeInstance;
        int iOrdinal;
        FocusRequester focusRequester2;
        boolean zChanged5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        char c;
        MutableState mutableState9;
        p7 p7Var6;
        MutableState mutableState10;
        MutableState mutableState11;
        boolean z11;
        Composer composer4;
        boolean zChangedInstance2;
        Object objRememberedValue8;
        Object objRememberedValue9;
        Object objRememberedValue10;
        boolean z12;
        MutableState mutableState12;
        MutableState mutableState13;
        y32 y32Var2;
        int i11;
        Composer composer5;
        Function0 function6;
        int i12;
        Context context;
        Composer composer6;
        int i13;
        MutableState mutableState14;
        MutableState mutableState15;
        MutableState mutableState16;
        MutableState mutableState17;
        Composer composer7;
        int i14;
        UserPreferences userPreferences2;
        MutableState mutableState18;
        Context context2;
        int i15;
        MutableState mutableState19;
        Context context3;
        UserPreferences userPreferences3;
        Composer composer8;
        UserPreferences userPreferences4;
        SearchInputServerManager searchInputServerManager3;
        int i16;
        MutableState mutableState20;
        CoroutineScope coroutineScope;
        MutableState mutableState21;
        int i17;
        char c2;
        Composer composer9;
        int i18;
        Composer composer10;
        boolean z13;
        Composer composer11;
        Composer composer12;
        Object objRememberedValue11;
        MutableState mutableState22;
        Object objRememberedValue12;
        MutableState mutableState23;
        Object objRememberedValue13;
        MutableState mutableState24;
        Object objRememberedValue14;
        char c3;
        Object objRememberedValue15;
        boolean zChangedInstance3;
        Object objRememberedValue16;
        Object objRememberedValue17;
        boolean zChangedInstance4;
        Object objRememberedValue18;
        boolean zChangedInstance5;
        Object objRememberedValue19;
        Object objRememberedValue20;
        MutableState mutableState25;
        boolean zChangedInstance6;
        Object objRememberedValue21;
        Object objRememberedValue22;
        Object objRememberedValue23;
        MutableState mutableState26;
        Context context4;
        boolean zChangedInstance7;
        Object objRememberedValue24;
        Object objRememberedValue25;
        boolean zChangedInstance8;
        Object objRememberedValue26;
        boolean zChangedInstance9;
        Object objRememberedValue27;
        Object objRememberedValue28;
        Object objRememberedValue29;
        Object objRememberedValue30;
        MutableState mutableState27;
        boolean zChangedInstance10;
        Object objRememberedValue31;
        Object objRememberedValue32;
        MutableState mutableState28;
        boolean zChangedInstance11;
        Object objRememberedValue33;
        MutableState mutableState29;
        UserPreferences userPreferences5;
        Object objRememberedValue34;
        Object objRememberedValue35;
        boolean zChangedInstance12;
        Object objRememberedValue36;
        Object objRememberedValue37;
        Object objRememberedValue38;
        Object objRememberedValue39;
        MutableState mutableState30;
        int i19;
        Object objRememberedValue40;
        MutableState mutableState31;
        Object objRememberedValue41;
        MutableState mutableState32;
        Object objRememberedValue42;
        MutableState mutableState33;
        Object objRememberedValue43;
        MutableState mutableState34;
        Object objRememberedValue44;
        MutableState mutableState35;
        Object objRememberedValue45;
        MutableState mutableState36;
        Object objRememberedValue46;
        MutableState mutableState37;
        boolean zChanged6;
        Object objRememberedValue47;
        Object objRememberedValue48;
        MutableState mutableState38;
        Object objRememberedValue49;
        Object objRememberedValue50;
        MutableState mutableState39;
        Object objRememberedValue51;
        Object objRememberedValue52;
        boolean zChangedInstance13;
        Object objRememberedValue53;
        MutableState mutableState40;
        MutableState mutableState41;
        Object objRememberedValue54;
        MutableState mutableState42;
        int i20;
        Object objRememberedValue55;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objRememberedValue56;
        MutableState mutableState43;
        Object objRememberedValue57;
        boolean zChanged7;
        Object objRememberedValue58;
        Object objRememberedValue59;
        p7 p7Var7;
        Composer composer13;
        Composer composer14;
        boolean zChanged8;
        Object objRememberedValue60;
        Object objRememberedValue61;
        boolean zChanged9;
        Object objRememberedValue62;
        Object objRememberedValue63;
        MutableState mutableState44;
        Function0<ComposeUiNode> constructor2;
        Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue64;
        boolean z17;
        Object objRememberedValue65;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-328397035);
        int i21 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i21 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i21 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i21 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i21 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i21 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        int i22 = 114819072 | i21;
        if ((i & 805306368) == 0) {
            i22 = 383254528 | i21;
        }
        int i23 = i22;
        if (composerStartRestartGroup.shouldExecute((306783379 & i23) != 306783378, i23 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = Modifier.INSTANCE;
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                composer3 = composerStartRestartGroup;
                i2 = i23 & (-1879048193);
                p7Var3 = (p7) androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(p7.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                z5 = true;
                z6 = true;
                modifier3 = companion;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z6 = z;
                modifier3 = modifier;
                i2 = i23 & (-1879048193);
                composer3 = composerStartRestartGroup;
                z5 = z2;
                p7Var3 = p7Var;
            }
            composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-328397035, i2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen (AggregateHubScreen.kt:162)");
            }
            Context context5 = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue66 = composer3.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue66 == companion2.getEmpty()) {
                objRememberedValue66 = new ServerPreferences(context5);
                composer3.updateRememberedValue(objRememberedValue66);
            }
            ServerPreferences serverPreferences = (ServerPreferences) objRememberedValue66;
            Object objRememberedValue67 = composer3.rememberedValue();
            if (objRememberedValue67 == companion2.getEmpty()) {
                objRememberedValue67 = new UserPreferences(context5);
                composer3.updateRememberedValue(objRememberedValue67);
            }
            UserPreferences userPreferences6 = (UserPreferences) objRememberedValue67;
            Object objRememberedValue68 = composer3.rememberedValue();
            if (objRememberedValue68 == companion2.getEmpty()) {
                objRememberedValue68 = new AggregateSearchHistoryPreferences(context5);
                composer3.updateRememberedValue(objRememberedValue68);
            }
            AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences = (AggregateSearchHistoryPreferences) objRememberedValue68;
            Object objRememberedValue69 = composer3.rememberedValue();
            if (objRememberedValue69 == companion2.getEmpty()) {
                objRememberedValue69 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3);
                composer3.updateRememberedValue(objRememberedValue69);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue69;
            Object objRememberedValue70 = composer3.rememberedValue();
            if (objRememberedValue70 == companion2.getEmpty()) {
                objRememberedValue70 = mr.l(0, null, 2, null, composer3);
            }
            MutableState mutableState45 = (MutableState) objRememberedValue70;
            boolean zChanged10 = composer3.changed(((Number) mutableState45.getValue()).intValue());
            Object objRememberedValue71 = composer3.rememberedValue();
            if (zChanged10 || objRememberedValue71 == companion2.getEmpty()) {
                objRememberedValue71 = serverPreferences.getAllServers();
                composer3.updateRememberedValue(objRememberedValue71);
            }
            List list3 = (List) objRememberedValue71;
            boolean zChanged11 = composer3.changed(list3);
            Object objRememberedValue72 = composer3.rememberedValue();
            if (zChanged11 || objRememberedValue72 == companion2.getEmpty()) {
                obj = objRememberedValue72;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    ServerConfig serverConfig = (ServerConfig) obj2;
                    if (serverConfig.isVerified() && serverConfig.isLoggedIn()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                int size = arrayList.size();
                int i24 = 0;
                while (i24 < size) {
                    Object obj3 = arrayList.get(i24);
                    i24++;
                    arrayList2.add(((ServerConfig) obj3).getEffectiveServerConfig());
                    arrayList = arrayList;
                }
                composer3.updateRememberedValue(arrayList2);
                obj = arrayList2;
            }
            obj = objRememberedValue72;
            List list4 = (List) obj;
            Object objRememberedValue73 = composer3.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue73 == companion3.getEmpty()) {
                i3 = 2;
                snapshotMutationPolicy = null;
                objRememberedValue73 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableAggregateSearch()), null, 2, null);
                composer3.updateRememberedValue(objRememberedValue73);
            } else {
                i3 = 2;
                snapshotMutationPolicy = null;
            }
            MutableState mutableState46 = (MutableState) objRememberedValue73;
            Object objRememberedValue74 = composer3.rememberedValue();
            if (objRememberedValue74 == companion3.getEmpty()) {
                objRememberedValue74 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableAggregateSearchInServerSearch()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue74);
            }
            MutableState mutableState47 = (MutableState) objRememberedValue74;
            Object objRememberedValue75 = composer3.rememberedValue();
            if (objRememberedValue75 == companion3.getEmpty()) {
                objRememberedValue75 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getDisableTopNavFocusRefresh()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue75);
            }
            MutableState mutableState48 = (MutableState) objRememberedValue75;
            Object objRememberedValue76 = composer3.rememberedValue();
            if (objRememberedValue76 == companion3.getEmpty()) {
                objRememberedValue76 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableTransparentTopNavButtons()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue76);
            }
            MutableState mutableState49 = (MutableState) objRememberedValue76;
            Object objRememberedValue77 = composer3.rememberedValue();
            if (objRememberedValue77 == companion3.getEmpty()) {
                objRememberedValue77 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableClickableLibrarySectionTitle()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue77);
            }
            MutableState mutableState50 = (MutableState) objRememberedValue77;
            Object objRememberedValue78 = composer3.rememberedValue();
            if (objRememberedValue78 == companion3.getEmpty()) {
                objRememberedValue78 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableLibraryRowMoreButton()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue78);
            }
            MutableState mutableState51 = (MutableState) objRememberedValue78;
            Object objRememberedValue79 = composer3.rememberedValue();
            if (objRememberedValue79 == companion3.getEmpty()) {
                objRememberedValue79 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableHomeUnplayedOnly()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue79);
            }
            MutableState mutableState52 = (MutableState) objRememberedValue79;
            Object objRememberedValue80 = composer3.rememberedValue();
            if (objRememberedValue80 == companion3.getEmpty()) {
                objRememberedValue80 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnablePlaybackStartupPoster()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue80);
            }
            MutableState mutableState53 = (MutableState) objRememberedValue80;
            Object objRememberedValue81 = composer3.rememberedValue();
            if (objRememberedValue81 == companion3.getEmpty()) {
                objRememberedValue81 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableAggregateSearchVersionTags()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue81);
            }
            MutableState mutableState54 = (MutableState) objRememberedValue81;
            Object objRememberedValue82 = composer3.rememberedValue();
            if (objRememberedValue82 == companion3.getEmpty()) {
                objRememberedValue82 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableDetailAggregateVersionRail()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue82);
            }
            MutableState mutableState55 = (MutableState) objRememberedValue82;
            Object objRememberedValue83 = composer3.rememberedValue();
            if (objRememberedValue83 == companion3.getEmpty()) {
                objRememberedValue83 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userPreferences6.getVideoVersionPrioritySettings(), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue83);
            }
            MutableState mutableState56 = (MutableState) objRememberedValue83;
            Object objRememberedValue84 = composer3.rememberedValue();
            if (objRememberedValue84 == companion3.getEmpty()) {
                objRememberedValue84 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableHomeBackFocusServerButton()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue84);
            }
            MutableState mutableState57 = (MutableState) objRememberedValue84;
            Object objRememberedValue85 = composer3.rememberedValue();
            if (objRememberedValue85 == companion3.getEmpty()) {
                objRememberedValue85 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableAppUpdateCheckOnStartup()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue85);
            }
            MutableState mutableState58 = (MutableState) objRememberedValue85;
            Object objRememberedValue86 = composer3.rememberedValue();
            if (objRememberedValue86 == companion3.getEmpty()) {
                objRememberedValue86 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getAdminDebugFeaturesUnlocked()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue86);
            }
            MutableState mutableState59 = (MutableState) objRememberedValue86;
            Object objRememberedValue87 = composer3.rememberedValue();
            if (objRememberedValue87 == companion3.getEmpty()) {
                objRememberedValue87 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(userPreferences6.getEnableSpecialFeatures()), snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue87);
            }
            MutableState mutableState60 = (MutableState) objRememberedValue87;
            Object objRememberedValue88 = composer3.rememberedValue();
            if (objRememberedValue88 == companion3.getEmpty()) {
                objRememberedValue88 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue88);
            }
            MutableState mutableState61 = (MutableState) objRememberedValue88;
            Object objRememberedValue89 = composer3.rememberedValue();
            if (objRememberedValue89 == companion3.getEmpty()) {
                objRememberedValue89 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue89);
            }
            MutableState mutableState62 = (MutableState) objRememberedValue89;
            Object objRememberedValue90 = composer3.rememberedValue();
            if (objRememberedValue90 == companion3.getEmpty()) {
                objRememberedValue90 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i3, snapshotMutationPolicy);
                composer3.updateRememberedValue(objRememberedValue90);
            }
            MutableState mutableState63 = (MutableState) objRememberedValue90;
            Object objRememberedValue91 = composer3.rememberedValue();
            if (objRememberedValue91 == companion3.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue91 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState64 = (MutableState) objRememberedValue91;
            Object objRememberedValue92 = composer3.rememberedValue();
            if (objRememberedValue92 == companion3.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue92 = mutableStateMutableStateOf$default2;
            }
            MutableState mutableState65 = (MutableState) objRememberedValue92;
            Object objRememberedValue93 = composer3.rememberedValue();
            if (objRememberedValue93 == companion3.getEmpty()) {
                objRememberedValue93 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue93);
            }
            MutableState mutableState66 = (MutableState) objRememberedValue93;
            Object objRememberedValue94 = composer3.rememberedValue();
            if (objRememberedValue94 == companion3.getEmpty()) {
                objRememberedValue94 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue94);
            }
            MutableState mutableState67 = (MutableState) objRememberedValue94;
            Object objRememberedValue95 = composer3.rememberedValue();
            if (objRememberedValue95 == companion3.getEmpty()) {
                objRememberedValue95 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue95);
            }
            MutableState mutableState68 = (MutableState) objRememberedValue95;
            Object objRememberedValue96 = composer3.rememberedValue();
            if (objRememberedValue96 == companion3.getEmpty()) {
                i4 = 2;
                objRememberedValue96 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue96);
            } else {
                i4 = 2;
            }
            MutableState mutableState69 = (MutableState) objRememberedValue96;
            Object objRememberedValue97 = composer3.rememberedValue();
            if (objRememberedValue97 == companion3.getEmpty()) {
                objRememberedValue97 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i4, null);
                composer3.updateRememberedValue(objRememberedValue97);
            }
            MutableState mutableState70 = (MutableState) objRememberedValue97;
            Object objRememberedValue98 = composer3.rememberedValue();
            if (objRememberedValue98 == companion3.getEmpty()) {
                objRememberedValue98 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue98);
            }
            MutableState mutableState71 = (MutableState) objRememberedValue98;
            Object objRememberedValue99 = composer3.rememberedValue();
            if (objRememberedValue99 == companion3.getEmpty()) {
                objRememberedValue99 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue99);
            }
            MutableState mutableState72 = (MutableState) objRememberedValue99;
            Object objRememberedValue100 = composer3.rememberedValue();
            if (objRememberedValue100 == companion3.getEmpty()) {
                i5 = 2;
                objRememberedValue100 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue100);
            } else {
                i5 = 2;
            }
            MutableState mutableState73 = (MutableState) objRememberedValue100;
            Object objRememberedValue101 = composer3.rememberedValue();
            if (objRememberedValue101 == companion3.getEmpty()) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i5, null);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue101 = mutableStateMutableStateOf$default3;
            }
            MutableState mutableState74 = (MutableState) objRememberedValue101;
            Object objRememberedValue102 = composer3.rememberedValue();
            if (objRememberedValue102 == companion3.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i5, null);
                composer3.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue102 = mutableStateMutableStateOf$default4;
            }
            MutableState mutableState75 = (MutableState) objRememberedValue102;
            Object objRememberedValue103 = composer3.rememberedValue();
            if (objRememberedValue103 == companion3.getEmpty()) {
                objRememberedValue103 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue103);
            }
            MutableState mutableState76 = (MutableState) objRememberedValue103;
            Object objRememberedValue104 = composer3.rememberedValue();
            if (objRememberedValue104 == companion3.getEmpty()) {
                objRememberedValue104 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue104);
            }
            MutableState mutableState77 = (MutableState) objRememberedValue104;
            Object objRememberedValue105 = composer3.rememberedValue();
            if (objRememberedValue105 == companion3.getEmpty()) {
                objRememberedValue105 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue105);
            }
            MutableState mutableState78 = (MutableState) objRememberedValue105;
            Object objRememberedValue106 = composer3.rememberedValue();
            if (objRememberedValue106 == companion3.getEmpty()) {
                i6 = 2;
                objRememberedValue106 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue106);
            } else {
                i6 = 2;
            }
            MutableState mutableState79 = (MutableState) objRememberedValue106;
            Object objRememberedValue107 = composer3.rememberedValue();
            if (objRememberedValue107 == companion3.getEmpty()) {
                objRememberedValue107 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i6, null);
                composer3.updateRememberedValue(objRememberedValue107);
            }
            MutableState mutableState80 = (MutableState) objRememberedValue107;
            Object objRememberedValue108 = composer3.rememberedValue();
            if (objRememberedValue108 == companion3.getEmpty()) {
                r5 = 0;
                objRememberedValue108 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i6, null);
                composer3.updateRememberedValue(objRememberedValue108);
            } else {
                r5 = 0;
            }
            MutableState mutableState81 = (MutableState) objRememberedValue108;
            Object objRememberedValue109 = composer3.rememberedValue();
            if (objRememberedValue109 == companion3.getEmpty()) {
                objRememberedValue109 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r5, r5, i6, r5);
                composer3.updateRememberedValue(objRememberedValue109);
            }
            MutableState mutableState82 = (MutableState) objRememberedValue109;
            Object objRememberedValue110 = composer3.rememberedValue();
            if (objRememberedValue110 == companion3.getEmpty()) {
                objRememberedValue110 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r5, r5, i6, r5);
                composer3.updateRememberedValue(objRememberedValue110);
            }
            MutableState mutableState83 = (MutableState) objRememberedValue110;
            final State stateCollectAsState = SnapshotStateKt.collectAsState(p7Var3.h(), r5, composer3, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(p7Var3.f(), r5, composer3, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(p7Var3.e(), r5, composer3, 0, 1);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(p7Var3.d(), r5, composer3, 0, 1);
            Object objRememberedValue111 = composer3.rememberedValue();
            if (objRememberedValue111 == companion3.getEmpty()) {
                objRememberedValue111 = mr.n(composer3);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue111;
            Object objRememberedValue112 = composer3.rememberedValue();
            if (objRememberedValue112 == companion3.getEmpty()) {
                objRememberedValue112 = mr.n(composer3);
            }
            FocusRequester focusRequester4 = (FocusRequester) objRememberedValue112;
            Object objRememberedValue113 = composer3.rememberedValue();
            if (objRememberedValue113 == companion3.getEmpty()) {
                objRememberedValue113 = mr.n(composer3);
            }
            FocusRequester focusRequester5 = (FocusRequester) objRememberedValue113;
            Object objRememberedValue114 = composer3.rememberedValue();
            if (objRememberedValue114 == companion3.getEmpty()) {
                objRememberedValue114 = mr.n(composer3);
            }
            final FocusRequester focusRequester6 = (FocusRequester) objRememberedValue114;
            Object objRememberedValue115 = composer3.rememberedValue();
            if (objRememberedValue115 == companion3.getEmpty()) {
                objRememberedValue115 = mr.n(composer3);
            }
            FocusRequester focusRequester7 = (FocusRequester) objRememberedValue115;
            Object objRememberedValue116 = composer3.rememberedValue();
            if (objRememberedValue116 == companion3.getEmpty()) {
                objRememberedValue116 = mr.n(composer3);
            }
            final FocusRequester focusRequester8 = (FocusRequester) objRememberedValue116;
            Object objRememberedValue117 = composer3.rememberedValue();
            if (objRememberedValue117 == companion3.getEmpty()) {
                objRememberedValue117 = mr.n(composer3);
            }
            FocusRequester focusRequester9 = (FocusRequester) objRememberedValue117;
            Object objRememberedValue118 = composer3.rememberedValue();
            if (objRememberedValue118 == companion3.getEmpty()) {
                objRememberedValue118 = mr.n(composer3);
            }
            FocusRequester focusRequester10 = (FocusRequester) objRememberedValue118;
            Object objRememberedValue119 = composer3.rememberedValue();
            if (objRememberedValue119 == companion3.getEmpty()) {
                objRememberedValue119 = mr.m(((String) stateCollectAsState3.getValue()) != null, null, 2, null, composer3);
            }
            MutableState mutableState84 = (MutableState) objRememberedValue119;
            Object[] objArr = new Object[0];
            Object objRememberedValue120 = composer3.rememberedValue();
            if (objRememberedValue120 == companion3.getEmpty()) {
                objRememberedValue120 = new b1(5);
                composer3.updateRememberedValue(objRememberedValue120);
            }
            MutableState mutableState85 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue120, composer3, 48);
            Object[] objArr2 = new Object[0];
            Object objRememberedValue121 = composer3.rememberedValue();
            if (objRememberedValue121 == companion3.getEmpty()) {
                objRememberedValue121 = new b1(6);
                composer3.updateRememberedValue(objRememberedValue121);
            }
            MutableState mutableState86 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue121, composer3, 48);
            Object[] objArr3 = new Object[0];
            Object objRememberedValue122 = composer3.rememberedValue();
            MutableState mutableState87 = mutableState65;
            if (objRememberedValue122 == companion3.getEmpty()) {
                objRememberedValue122 = new b1(7);
                composer3.updateRememberedValue(objRememberedValue122);
            }
            MutableState mutableState88 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (Function0) objRememberedValue122, composer3, 48);
            Object[] objArr4 = new Object[0];
            Object objRememberedValue123 = composer3.rememberedValue();
            if (objRememberedValue123 == companion3.getEmpty()) {
                objRememberedValue123 = new b1(8);
                composer3.updateRememberedValue(objRememberedValue123);
            }
            MutableState mutableState89 = (MutableState) RememberSaveableKt.rememberSaveable(objArr4, (Function0) objRememberedValue123, composer3, 48);
            Object objRememberedValue124 = composer3.rememberedValue();
            if (objRememberedValue124 == companion3.getEmpty()) {
                objRememberedValue124 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue124);
            }
            MutableState mutableState90 = (MutableState) objRememberedValue124;
            boolean zChanged12 = composer3.changed(((i3) stateCollectAsState4.getValue()).ordinal());
            Object objRememberedValue125 = composer3.rememberedValue();
            if (zChanged12 || objRememberedValue125 == companion3.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue125;
            }
            final MutableState mutableState91 = (MutableState) objMutableStateOf$default;
            Object[] objArr5 = new Object[0];
            Object objRememberedValue126 = composer3.rememberedValue();
            if (objRememberedValue126 == companion3.getEmpty()) {
                objRememberedValue126 = new b1(9);
                composer3.updateRememberedValue(objRememberedValue126);
            }
            MutableState mutableState92 = (MutableState) RememberSaveableKt.rememberSaveable(objArr5, (Function0) objRememberedValue126, composer3, 48);
            Object[] objArr6 = new Object[0];
            Object objRememberedValue127 = composer3.rememberedValue();
            if (objRememberedValue127 == companion3.getEmpty()) {
                objRememberedValue127 = new b1(3);
                composer3.updateRememberedValue(objRememberedValue127);
            }
            MutableState mutableState93 = (MutableState) RememberSaveableKt.rememberSaveable(objArr6, (Function0) objRememberedValue127, composer3, 48);
            Object objRememberedValue128 = composer3.rememberedValue();
            if (objRememberedValue128 == companion3.getEmpty()) {
                objRememberedValue128 = new SearchInputServerManager(context5);
                composer3.updateRememberedValue(objRememberedValue128);
            }
            SearchInputServerManager searchInputServerManager4 = (SearchInputServerManager) objRememberedValue128;
            Object objRememberedValue129 = composer3.rememberedValue();
            if (objRememberedValue129 == companion3.getEmpty()) {
                objRememberedValue129 = new ProxySettings(context5);
                composer3.updateRememberedValue(objRememberedValue129);
            }
            ProxySettings proxySettings = (ProxySettings) objRememberedValue129;
            Composer composer15 = composer3;
            MutableState mutableState94 = mutableState68;
            MutableState mutableState95 = mutableState71;
            MutableState mutableState96 = mutableState69;
            MutableState mutableState97 = mutableState72;
            MutableState mutableState98 = mutableState77;
            MutableState mutableState99 = mutableState78;
            MutableState mutableState100 = mutableState79;
            MutableState mutableState101 = mutableState70;
            MutableState mutableState102 = mutableState75;
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(proxySettings.getProxyConfigFlow(), new ProxyConfig(false, null, null, 0, null, null, false, 127, null), null, composer15, 0, 2);
            Object objRememberedValue130 = composer15.rememberedValue();
            if (objRememberedValue130 == companion3.getEmpty()) {
                objRememberedValue130 = new ProxyConfigServerManager(context5);
                composer15.updateRememberedValue(objRememberedValue130);
            }
            ProxyConfigServerManager proxyConfigServerManager = (ProxyConfigServerManager) objRememberedValue130;
            Object objRememberedValue131 = composer15.rememberedValue();
            if (objRememberedValue131 == companion3.getEmpty()) {
                objRememberedValue131 = new y32(context5);
                composer15.updateRememberedValue(objRememberedValue131);
            }
            y32 y32Var3 = (y32) objRememberedValue131;
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(y32Var3.d, CollectionsKt.emptyList(), null, composer15, 48, 2);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(y32Var3.e, null, null, composer15, 48, 2);
            Object objRememberedValue132 = composer15.rememberedValue();
            if (objRememberedValue132 == companion3.getEmpty()) {
                objRememberedValue132 = new SubtitleFontUploadServerManager(context5);
                composer15.updateRememberedValue(objRememberedValue132);
            }
            SubtitleFontUploadServerManager subtitleFontUploadServerManager = (SubtitleFontUploadServerManager) objRememberedValue132;
            Object objRememberedValue133 = composer15.rememberedValue();
            if (objRememberedValue133 == companion3.getEmpty()) {
                objRememberedValue133 = new sa1(context5);
                composer15.updateRememberedValue(objRememberedValue133);
            }
            sa1 sa1Var = (sa1) objRememberedValue133;
            State stateCollectAsState8 = SnapshotStateKt.collectAsState(sa1Var.c, (t91) sa1Var.b.getValue(), null, composer15, 0, 2);
            Object objRememberedValue134 = composer15.rememberedValue();
            if (objRememberedValue134 == companion3.getEmpty()) {
                objRememberedValue134 = new OnlineSubtitleConfigServerManager(context5);
                composer15.updateRememberedValue(objRememberedValue134);
            }
            OnlineSubtitleConfigServerManager onlineSubtitleConfigServerManager = (OnlineSubtitleConfigServerManager) objRememberedValue134;
            Object objRememberedValue135 = composer15.rememberedValue();
            if (objRememberedValue135 == companion3.getEmpty()) {
                objRememberedValue135 = new qf2(context5);
                composer15.updateRememberedValue(objRememberedValue135);
            }
            qf2 qf2Var = (qf2) objRememberedValue135;
            State stateCollectAsState9 = SnapshotStateKt.collectAsState(qf2Var.c, (ye2) qf2Var.b.getValue(), null, composer15, 0, 2);
            Object objRememberedValue136 = composer15.rememberedValue();
            if (objRememberedValue136 == companion3.getEmpty()) {
                objRememberedValue136 = new pf2(context5);
                composer15.updateRememberedValue(objRememberedValue136);
            }
            pf2 pf2Var = (pf2) objRememberedValue136;
            Object objRememberedValue137 = composer15.rememberedValue();
            if (objRememberedValue137 == companion3.getEmpty()) {
                objRememberedValue137 = new WebDavSyncConfigServerManager(context5);
                composer15.updateRememberedValue(objRememberedValue137);
            }
            WebDavSyncConfigServerManager webDavSyncConfigServerManager = (WebDavSyncConfigServerManager) objRememberedValue137;
            Object objRememberedValue138 = composer15.rememberedValue();
            if (objRememberedValue138 == companion3.getEmpty()) {
                objRememberedValue138 = new ab2(context5);
                composer15.updateRememberedValue(objRememberedValue138);
            }
            ab2 ab2Var = (ab2) objRememberedValue138;
            State stateCollectAsState10 = SnapshotStateKt.collectAsState(ab2Var.b, ab2Var.a(), null, composer15, 0, 2);
            Object objRememberedValue139 = composer15.rememberedValue();
            if (objRememberedValue139 == companion3.getEmpty()) {
                objRememberedValue139 = new xa2(context5);
                composer15.updateRememberedValue(objRememberedValue139);
            }
            xa2 xa2Var = (xa2) objRememberedValue139;
            vc vcVarB = bd.b(composer15);
            State stateCollectAsState11 = SnapshotStateKt.collectAsState(p7Var3.g(), null, composer15, 0, 1);
            Boolean bool2 = (Boolean) mutableState54.getValue();
            bool2.getClass();
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(bool2, composer15, 0);
            Object objRememberedValue140 = composer15.rememberedValue();
            if (objRememberedValue140 == companion3.getEmpty()) {
                i7 = 2;
                objRememberedValue140 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aggregateSearchHistoryPreferences.getHistory(), null, 2, null);
                composer15.updateRememberedValue(objRememberedValue140);
            } else {
                i7 = 2;
            }
            MutableState mutableState103 = (MutableState) objRememberedValue140;
            Object objRememberedValue141 = composer15.rememberedValue();
            if (objRememberedValue141 == companion3.getEmpty()) {
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i7, null);
                composer15.updateRememberedValue(mutableStateMutableStateOf$default5);
                objRememberedValue141 = mutableStateMutableStateOf$default5;
                snapshotMutationPolicy2 = null;
            } else {
                snapshotMutationPolicy2 = null;
            }
            MutableState mutableState104 = (MutableState) objRememberedValue141;
            Object objRememberedValue142 = composer15.rememberedValue();
            if (objRememberedValue142 == companion3.getEmpty()) {
                objRememberedValue142 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                composer15.updateRememberedValue(objRememberedValue142);
            }
            MutableState mutableState105 = (MutableState) objRememberedValue142;
            Object objRememberedValue143 = composer15.rememberedValue();
            if (objRememberedValue143 == companion3.getEmpty()) {
                objRememberedValue143 = mr.n(composer15);
            }
            FocusRequester focusRequester11 = (FocusRequester) objRememberedValue143;
            boolean zChanged13 = composer15.changed(list3) | composer15.changed(((Boolean) mutableState46.getValue()).booleanValue()) | composer15.changed((Map) stateCollectAsState11.getValue()) | ((i2 & 896) == 256);
            Object objRememberedValue144 = composer15.rememberedValue();
            if (zChanged13 || objRememberedValue144 == companion3.getEmpty()) {
                objRememberedValue144 = zy1.a(list3, str, ((Boolean) mutableState46.getValue()).booleanValue(), true, (Map) stateCollectAsState11.getValue(), "");
                composer15.updateRememberedValue(objRememberedValue144);
            }
            List list5 = (List) objRememberedValue144;
            Boolean boolValueOf = Boolean.valueOf(z6);
            int i25 = 3670016 & i2;
            boolean zChangedInstance14 = (i25 == 1048576) | composer15.changedInstance(userPreferences6);
            int i26 = i7;
            Object objRememberedValue145 = composer15.rememberedValue();
            if (zChangedInstance14 || objRememberedValue145 == companion3.getEmpty()) {
                objRememberedValue145 = new a6(z6, userPreferences6, mutableState46, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState53, mutableState54, mutableState55, mutableState56, mutableState57, mutableState58, mutableState59, mutableState60, null);
                mutableState46 = mutableState46;
                mutableState47 = mutableState47;
                mutableState48 = mutableState48;
                mutableState49 = mutableState49;
                mutableState50 = mutableState50;
                mutableState51 = mutableState51;
                mutableState52 = mutableState52;
                composer15.updateRememberedValue(objRememberedValue145);
            }
            int i27 = (i2 >> 18) & 14;
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue145, composer15, i27);
            Boolean boolValueOf2 = Boolean.valueOf(A(mutableState62));
            boolean zChangedInstance15 = composer15.changedInstance(p7Var3) | composer15.changedInstance(list3);
            Object objRememberedValue146 = composer15.rememberedValue();
            if (zChangedInstance15 || objRememberedValue146 == companion3.getEmpty()) {
                i8 = i2;
                continuation = null;
                e6Var = new e6(p7Var3, list3, mutableState62, continuation, 0);
                mutableState = mutableState62;
                composer15.updateRememberedValue(e6Var);
            } else {
                i8 = i2;
                mutableState = mutableState62;
                continuation = null;
                e6Var = objRememberedValue146;
            }
            MutableState mutableState106 = mutableState;
            EffectsKt.LaunchedEffect(boolValueOf2, r16, (Function2) e6Var, composer15, 0);
            Boolean boolValueOf3 = Boolean.valueOf(z6);
            Boolean bool3 = (Boolean) mutableState92.getValue();
            bool3.getClass();
            boolean zChanged14 = (i25 == 1048576) | composer15.changed(mutableState92) | composer15.changedInstance(p7Var3);
            Object objRememberedValue147 = composer15.rememberedValue();
            if (zChanged14 || objRememberedValue147 == companion3.getEmpty()) {
                p7 p7Var8 = p7Var3;
                f6Var = new f6(z6, p7Var8, mutableState92, continuation, 0);
                p7Var3 = p7Var8;
                composer15.updateRememberedValue(f6Var);
            } else {
                f6Var = objRememberedValue147;
            }
            EffectsKt.LaunchedEffect(boolValueOf3, bool3, (Function2) f6Var, composer15, i27);
            Boolean bool4 = (Boolean) mutableState58.getValue();
            bool4.getClass();
            boolean zChanged15 = composer15.changed(vcVarB);
            Object objRememberedValue148 = composer15.rememberedValue();
            if (zChanged15 || objRememberedValue148 == companion3.getEmpty()) {
                i9 = 0;
                objRememberedValue148 = new h6(vcVarB, mutableState58, continuation, 0);
                composer15.updateRememberedValue(objRememberedValue148);
            } else {
                i9 = 0;
            }
            EffectsKt.LaunchedEffect(bool4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue148, composer15, i9);
            Boolean bool5 = (Boolean) mutableState74.getValue();
            bool5.getClass();
            boolean zChangedInstance16 = composer15.changedInstance(subtitleFontUploadServerManager) | composer15.changedInstance(y32Var3);
            Object objRememberedValue149 = composer15.rememberedValue();
            if (zChangedInstance16 || objRememberedValue149 == companion3.getEmpty()) {
                y32Var = y32Var3;
                objRememberedValue149 = new k6(subtitleFontUploadServerManager, mutableState74, mutableState80, mutableState81, y32Var, mutableState83, mutableState73, null, 0);
                composer15.updateRememberedValue(objRememberedValue149);
            } else {
                y32Var = y32Var3;
            }
            EffectsKt.LaunchedEffect(bool5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue149, composer15, 0);
            Boolean boolValueOf4 = Boolean.valueOf(z6);
            boolean zChangedInstance17 = (i25 == 1048576) | composer15.changedInstance(p7Var3) | composer15.changedInstance(list4);
            Object objRememberedValue150 = composer15.rememberedValue();
            if (zChangedInstance17 || objRememberedValue150 == companion3.getEmpty()) {
                list = list4;
                p7 p7Var9 = p7Var3;
                continuation2 = null;
                f6 f6Var2 = new f6(z6, p7Var9, list, continuation2, 1);
                p7Var3 = p7Var9;
                composer15.updateRememberedValue(f6Var2);
                objRememberedValue150 = f6Var2;
            } else {
                list = list4;
                continuation2 = null;
            }
            EffectsKt.LaunchedEffect(boolValueOf4, list, (Function2) objRememberedValue150, composer15, i27);
            Boolean boolValueOf5 = Boolean.valueOf(z6);
            List listB = g(stateCollectAsState2).b();
            boolean zChanged16 = (i25 == 1048576) | composer15.changed(stateCollectAsState2) | composer15.changedInstance(p7Var3) | composer15.changedInstance(context5);
            Context context6 = context5;
            Object objRememberedValue151 = composer15.rememberedValue();
            if (zChanged16 || objRememberedValue151 == companion3.getEmpty()) {
                objRememberedValue151 = new o6(z6, stateCollectAsState2, p7Var3, context6, null, 0);
                composer15.updateRememberedValue(objRememberedValue151);
            }
            EffectsKt.LaunchedEffect(boolValueOf5, listB, (Function2) objRememberedValue151, composer15, i27);
            Boolean boolValueOf6 = Boolean.valueOf(z6);
            Boolean bool6 = (Boolean) stateRememberUpdatedState.getValue();
            bool6.getClass();
            boolean zChangedInstance18 = (i25 == 1048576) | composer15.changedInstance(searchInputServerManager4) | composer15.changedInstance(p7Var3) | composer15.changed(stateCollectAsState2) | composer15.changedInstance(aggregateSearchHistoryPreferences) | composer15.changedInstance(userPreferences6) | composer15.changedInstance(list) | composer15.changed(stateRememberUpdatedState);
            Object objRememberedValue152 = composer15.rememberedValue();
            if (zChangedInstance18) {
                bool = bool6;
            } else {
                bool = bool6;
                if (objRememberedValue152 != companion3.getEmpty()) {
                    state = stateRememberUpdatedState;
                    searchInputServerManager = searchInputServerManager4;
                    state2 = stateCollectAsState2;
                    mutableState2 = mutableState103;
                    userPreferences = userPreferences6;
                    p7Var4 = p7Var3;
                }
                Function2 function7 = (Function2) objRememberedValue152;
                mutableState3 = mutableState58;
                vcVar = vcVarB;
                EffectsKt.LaunchedEffect(boolValueOf6, list, bool, function7, composer15, i27);
                list2 = list;
                Boolean boolValueOf7 = Boolean.valueOf(z6);
                String str2 = (String) stateCollectAsState3.getValue();
                if (i25 == 1048576) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChanged = z7 | composer15.changed(stateCollectAsState3);
                Object objRememberedValue153 = composer15.rememberedValue();
                if (!zChanged || objRememberedValue153 == companion3.getEmpty()) {
                    i10 = 1048576;
                    q6Var = new q6(z6, stateCollectAsState3, mutableState84, continuation2, 0);
                    state3 = stateCollectAsState3;
                    mutableState4 = mutableState84;
                    composer15.updateRememberedValue(q6Var);
                } else {
                    state3 = stateCollectAsState3;
                    i10 = 1048576;
                    q6Var = objRememberedValue153;
                    mutableState4 = mutableState84;
                }
                EffectsKt.LaunchedEffect(boolValueOf7, str2, (Function2) q6Var, composer15, i27);
                Boolean boolValueOf8 = Boolean.valueOf(z6);
                Boolean boolValueOf9 = Boolean.valueOf(h(mutableState4));
                String str3 = (String) state3.getValue();
                if (i25 == i10) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zChanged2 = z8 | composer15.changed(state3);
                objRememberedValue = composer15.rememberedValue();
                if (!zChanged2 || objRememberedValue == companion3.getEmpty()) {
                    State state7 = state3;
                    MutableState mutableState107 = mutableState4;
                    objRememberedValue = new b6(z6, mutableState107, state7, focusRequester3, null, 0);
                    mutableState5 = mutableState107;
                    state4 = state7;
                    focusRequester = focusRequester3;
                    composer15.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState5 = mutableState4;
                    focusRequester = focusRequester3;
                    state4 = state3;
                }
                state5 = state2;
                searchInputServerManager2 = searchInputServerManager;
                EffectsKt.LaunchedEffect(boolValueOf8, boolValueOf9, str3, (Function2) objRememberedValue, composer15, i27);
                Boolean boolValueOf10 = Boolean.valueOf(z6);
                i3 i3Var = (i3) stateCollectAsState4.getValue();
                Boolean bool7 = (Boolean) mutableState93.getValue();
                bool7.getClass();
                Boolean boolValueOf11 = Boolean.valueOf(h(mutableState5));
                Boolean boolValueOf12 = Boolean.valueOf(A(mutableState106));
                Boolean bool8 = (Boolean) mutableState61.getValue();
                bool8.getClass();
                Object[] objArr7 = new Object[6];
                objArr7[0] = boolValueOf10;
                objArr7[1] = i3Var;
                objArr7[i26] = bool7;
                objArr7[3] = boolValueOf11;
                objArr7[4] = boolValueOf12;
                objArr7[5] = bool8;
                if (i25 == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zChanged3 = composer15.changed(mutableState93) | z9 | composer15.changed(stateCollectAsState4);
                objRememberedValue2 = composer15.rememberedValue();
                if (!zChanged3 || objRememberedValue2 == companion3.getEmpty()) {
                    MutableState mutableState108 = mutableState5;
                    mutableState6 = mutableState106;
                    objRememberedValue2 = new c6(z6, mutableState93, mutableState108, stateCollectAsState4, mutableState6, mutableState61, focusRequester5, (Continuation) null);
                    mutableState5 = mutableState108;
                    state6 = stateCollectAsState4;
                    mutableState7 = mutableState61;
                    composer15.updateRememberedValue(objRememberedValue2);
                } else {
                    state6 = stateCollectAsState4;
                    mutableState7 = mutableState61;
                    mutableState6 = mutableState106;
                }
                EffectsKt.LaunchedEffect(objArr7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer15, 0);
                Unit unit = Unit.INSTANCE;
                zChangedInstance = composer15.changedInstance(searchInputServerManager2) | composer15.changedInstance(p7Var4);
                objRememberedValue3 = composer15.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion3.getEmpty()) {
                    objRememberedValue3 = new b(1, searchInputServerManager2, p7Var4);
                    composer15.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer15, 6);
                if (z5 != 0 || B(mutableState64) || A(mutableState6) || ((Boolean) mutableState7.getValue()).booleanValue() || ((Boolean) mutableState87.getValue()).booleanValue() || ((Boolean) mutableState66.getValue()).booleanValue() || ((Boolean) mutableState67.getValue()).booleanValue() || ((Boolean) mutableState94.getValue()).booleanValue() || ((Boolean) mutableState96.getValue()).booleanValue() || ((Boolean) mutableState101.getValue()).booleanValue() || ((Boolean) mutableState95.getValue()).booleanValue() || ((Boolean) mutableState97.getValue()).booleanValue() || ((Boolean) mutableState73.getValue()).booleanValue() || ((Boolean) mutableState74.getValue()).booleanValue() || ((Boolean) mutableState102.getValue()).booleanValue() || ((Boolean) mutableState76.getValue()).booleanValue() || ((Boolean) mutableState98.getValue()).booleanValue() || ((String) mutableState82.getValue()) != null || ((String) mutableState83.getValue()) != null || ((Boolean) mutableState99.getValue()).booleanValue() || ((Boolean) mutableState100.getValue()).booleanValue() || ((Boolean) mutableState63.getValue()).booleanValue() || ((Boolean) vcVar.e.getValue()).booleanValue() || vcVar.e() || ((String) vcVar.g.getValue()) != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                objRememberedValue4 = composer15.rememberedValue();
                if (objRememberedValue4 == companion3.getEmpty()) {
                    mutableState8 = mutableState63;
                    objRememberedValue4 = new r1(8, mutableState8);
                    composer15.updateRememberedValue(objRememberedValue4);
                } else {
                    mutableState8 = mutableState63;
                }
                BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue4, composer15, 48, 0);
                zChanged4 = composer15.changed(((i3) state6.getValue()).ordinal());
                objRememberedValue5 = composer15.rememberedValue();
                if (zChanged4 || objRememberedValue5 == companion3.getEmpty()) {
                    objRememberedValue5 = new v1(focusRequester5, focusRequester6, focusRequester7, focusRequester8, state6, 1);
                    composer15.updateRememberedValue(objRememberedValue5);
                }
                function5 = (Function0) objRememberedValue5;
                if (list2.isEmpty()) {
                    composer15.startReplaceGroup(676102436);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    int iB = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer15.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor2 = companion4.getConstructor();
                    if (!id.n(composer15.getApplier())) {
                        ComposablesKt.invalidApplier();
                    }
                    composer15.startReusableNode();
                    if (composer15.getInserting()) {
                        composer15.createNode(constructor2);
                    } else {
                        composer15.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer15);
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(iB), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i28 = MaterialTheme.$stable;
                    modifier5 = modifier3;
                    TextKt.m3048TextNvy7gAk("暂无可用服务器", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer15, i28).getOnBackground(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer15, i28).getTitleMedium(), composer15, 6, 0, 131066);
                    composer15.endNode();
                    if (((Boolean) mutableState8.getValue()).booleanValue()) {
                        composer15.startReplaceGroup(676458316);
                        objRememberedValue64 = composer15.rememberedValue();
                        if (objRememberedValue64 == companion3.getEmpty()) {
                            objRememberedValue64 = new r1(10, mutableState8);
                            composer15.updateRememberedValue(objRememberedValue64);
                        }
                        Function0 function8 = (Function0) objRememberedValue64;
                        if ((i8 & 14) == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objRememberedValue65 = composer15.rememberedValue();
                        if (z17 || objRememberedValue65 == companion3.getEmpty()) {
                            objRememberedValue65 = new o5(function0, mutableState8, 0);
                            composer15.updateRememberedValue(objRememberedValue65);
                        }
                        c(function8, (Function0) objRememberedValue65, composer15, 6);
                        composer15.endReplaceGroup();
                    } else {
                        composer15.startReplaceGroup(676705293);
                        composer15.endReplaceGroup();
                    }
                    composer15.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composer15.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new n4(function0, function1, str, function2, function3, function4, z6, z5, modifier5, p7Var4, i, 1));
                        return;
                    }
                    return;
                }
                z3 = z6;
                p7Var5 = p7Var4;
                modifier4 = modifier3;
                boolean z18 = z5;
                composer15.startReplaceGroup(676726125);
                composer15.endReplaceGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                int iB2 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer15.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                if (!id.n(composer15.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer15.startReusableNode();
                if (composer15.getInserting()) {
                    composer15.createNode(constructor);
                } else {
                    composer15.useNode();
                }
                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer15);
                mr.z(companion6, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(iB2), composerM4318constructorimpl2));
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                iOrdinal = ((i3) state6.getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != i26) {
                            FocusRequester focusRequester12 = focusRequester;
                            MutableState mutableState109 = mutableState8;
                            focusRequester2 = focusRequester10;
                            composer15.startReplaceGroup(-1535747178);
                            int iK = k(mutableState88);
                            zChanged8 = composer15.changed(mutableState88);
                            objRememberedValue60 = composer15.rememberedValue();
                            if (zChanged8 || objRememberedValue60 == companion3.getEmpty()) {
                                objRememberedValue60 = new t1(17, mutableState88);
                                composer15.updateRememberedValue(objRememberedValue60);
                            }
                            Function1 function9 = (Function1) objRememberedValue60;
                            objRememberedValue61 = composer15.rememberedValue();
                            if (objRememberedValue61 == companion3.getEmpty()) {
                                objRememberedValue61 = new t1(18, mutableState90);
                                composer15.updateRememberedValue(objRememberedValue61);
                            }
                            p7Var7 = p7Var5;
                            mutableState9 = mutableState109;
                            L(iK, function9, (Function1) objRememberedValue61, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(-1415189255, true, new q5(focusRequester12, focusRequester7, mutableState91, p7Var5, function3, function2, stateCollectAsState, state4, mutableState5), composer15, 54), composer15, 1576320);
                            Composer composer16 = composer15;
                            composer16.endReplaceGroup();
                            mutableState11 = mutableState90;
                            composer13 = composer16;
                        } else {
                            if (iOrdinal == 3) {
                                composer15.startReplaceGroup(-465309248);
                                composer15.endReplaceGroup();
                                qu.f();
                                return;
                            }
                            composer15.startReplaceGroup(-1534280444);
                            int iL = l(mutableState89);
                            zChanged9 = composer15.changed(mutableState89);
                            objRememberedValue62 = composer15.rememberedValue();
                            if (zChanged9 || objRememberedValue62 == companion3.getEmpty()) {
                                objRememberedValue62 = new t1(20, mutableState89);
                                composer15.updateRememberedValue(objRememberedValue62);
                            }
                            Function1 function10 = (Function1) objRememberedValue62;
                            objRememberedValue63 = composer15.rememberedValue();
                            if (objRememberedValue63 == companion3.getEmpty()) {
                                mutableState44 = mutableState90;
                                objRememberedValue63 = new t1(21, mutableState44);
                                composer15.updateRememberedValue(objRememberedValue63);
                            } else {
                                mutableState44 = mutableState90;
                            }
                            final State state8 = state4;
                            final int i29 = 1;
                            searchInputServerManager2 = searchInputServerManager2;
                            final FocusRequester focusRequester13 = focusRequester;
                            context6 = context6;
                            final MutableState mutableState110 = mutableState5;
                            vcVar = vcVar;
                            boxScopeInstance = boxScopeInstance;
                            modifier4 = modifier4;
                            mutableState7 = mutableState7;
                            MutableState mutableState111 = mutableState8;
                            focusRequester2 = focusRequester10;
                            L(iL, function10, (Function1) objRememberedValue63, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(-1337068166, true, new Function3() { // from class: p5
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i30 = i29;
                                    MutableState mutableState112 = mutableState110;
                                    State state9 = state8;
                                    State state10 = stateCollectAsState;
                                    Function2 function11 = function2;
                                    p7 p7Var10 = p7Var5;
                                    MutableState mutableState113 = mutableState91;
                                    int i31 = 1;
                                    switch (i30) {
                                        case 0:
                                            Composer composer17 = (Composer) obj5;
                                            int iIntValue = ((Integer) obj6).intValue();
                                            ((ColumnScope) obj4).getClass();
                                            if (composer17.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1493310344, iIntValue, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:624)");
                                                }
                                                List list6 = ((i7) state10.getValue()).a;
                                                String str4 = (String) state9.getValue();
                                                boolean zBooleanValue = ((Boolean) mutableState112.getValue()).booleanValue();
                                                boolean zChanged17 = composer17.changed(mutableState113);
                                                Object objRememberedValue154 = composer17.rememberedValue();
                                                if (zChanged17 || objRememberedValue154 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue154 = new t1(9, mutableState113);
                                                    composer17.updateRememberedValue(objRememberedValue154);
                                                }
                                                Function1 function12 = (Function1) objRememberedValue154;
                                                boolean zChangedInstance19 = composer17.changedInstance(p7Var10) | composer17.changed(function11);
                                                Object objRememberedValue155 = composer17.rememberedValue();
                                                if (zChangedInstance19 || objRememberedValue155 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue155 = new s4(p7Var10, function11, 1);
                                                    composer17.updateRememberedValue(objRememberedValue155);
                                                }
                                                f7.K(list6, str4, zBooleanValue, focusRequester13, focusRequester8, function12, (Function3) objRememberedValue155, composer17, 27648);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer17.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer18 = (Composer) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((ColumnScope) obj4).getClass();
                                            if (composer18.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1337068166, iIntValue2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:674)");
                                                }
                                                List list7 = ((i7) state10.getValue()).b;
                                                String str5 = (String) state9.getValue();
                                                boolean zBooleanValue2 = ((Boolean) mutableState112.getValue()).booleanValue();
                                                boolean zChanged18 = composer18.changed(mutableState113);
                                                Object objRememberedValue156 = composer18.rememberedValue();
                                                if (zChanged18 || objRememberedValue156 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue156 = new t1(7, mutableState113);
                                                    composer18.updateRememberedValue(objRememberedValue156);
                                                }
                                                Function1 function13 = (Function1) objRememberedValue156;
                                                boolean zChangedInstance20 = composer18.changedInstance(p7Var10) | composer18.changed(function11);
                                                Object objRememberedValue157 = composer18.rememberedValue();
                                                if (zChangedInstance20 || objRememberedValue157 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue157 = new a2(i31, p7Var10, function11);
                                                    composer18.updateRememberedValue(objRememberedValue157);
                                                }
                                                f7.a(list7, str5, zBooleanValue2, focusRequester13, focusRequester8, function13, (Function2) objRememberedValue157, composer18, 27648);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                composer18.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, composer15, 54), composer15, 1576320);
                            Composer composer17 = composer15;
                            composer17.endReplaceGroup();
                            userPreferences = userPreferences;
                            mutableState9 = mutableState111;
                            mutableState11 = mutableState44;
                            p7Var6 = p7Var5;
                            z11 = true;
                            composer14 = composer17;
                        }
                        mutableState10 = mutableState56;
                        composer4 = composer14;
                    } else {
                        final FocusRequester focusRequester14 = focusRequester;
                        MutableState mutableState112 = mutableState8;
                        focusRequester2 = focusRequester10;
                        composer15.startReplaceGroup(-1537039568);
                        int iJ = j(mutableState86);
                        zChanged7 = composer15.changed(mutableState86);
                        objRememberedValue58 = composer15.rememberedValue();
                        if (zChanged7 || objRememberedValue58 == companion3.getEmpty()) {
                            objRememberedValue58 = new t1(15, mutableState86);
                            composer15.updateRememberedValue(objRememberedValue58);
                        }
                        Function1 function11 = (Function1) objRememberedValue58;
                        objRememberedValue59 = composer15.rememberedValue();
                        if (objRememberedValue59 == companion3.getEmpty()) {
                            objRememberedValue59 = new t1(16, mutableState90);
                            composer15.updateRememberedValue(objRememberedValue59);
                        }
                        final int i30 = 0;
                        p7Var7 = p7Var5;
                        L(iJ, function11, (Function1) objRememberedValue59, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(-1493310344, true, new Function3() { // from class: p5
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i31 = i30;
                                MutableState mutableState113 = mutableState5;
                                State state9 = state4;
                                State state10 = stateCollectAsState;
                                Function2 function12 = function4;
                                p7 p7Var10 = p7Var5;
                                MutableState mutableState114 = mutableState91;
                                int i32 = 1;
                                switch (i31) {
                                    case 0:
                                        Composer composer18 = (Composer) obj5;
                                        int iIntValue = ((Integer) obj6).intValue();
                                        ((ColumnScope) obj4).getClass();
                                        if (composer18.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1493310344, iIntValue, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:624)");
                                            }
                                            List list6 = ((i7) state10.getValue()).a;
                                            String str4 = (String) state9.getValue();
                                            boolean zBooleanValue = ((Boolean) mutableState113.getValue()).booleanValue();
                                            boolean zChanged17 = composer18.changed(mutableState114);
                                            Object objRememberedValue154 = composer18.rememberedValue();
                                            if (zChanged17 || objRememberedValue154 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue154 = new t1(9, mutableState114);
                                                composer18.updateRememberedValue(objRememberedValue154);
                                            }
                                            Function1 function13 = (Function1) objRememberedValue154;
                                            boolean zChangedInstance19 = composer18.changedInstance(p7Var10) | composer18.changed(function12);
                                            Object objRememberedValue155 = composer18.rememberedValue();
                                            if (zChangedInstance19 || objRememberedValue155 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue155 = new s4(p7Var10, function12, 1);
                                                composer18.updateRememberedValue(objRememberedValue155);
                                            }
                                            f7.K(list6, str4, zBooleanValue, focusRequester14, focusRequester6, function13, (Function3) objRememberedValue155, composer18, 27648);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer18.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer19 = (Composer) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        ((ColumnScope) obj4).getClass();
                                        if (composer19.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1337068166, iIntValue2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:674)");
                                            }
                                            List list7 = ((i7) state10.getValue()).b;
                                            String str5 = (String) state9.getValue();
                                            boolean zBooleanValue2 = ((Boolean) mutableState113.getValue()).booleanValue();
                                            boolean zChanged18 = composer19.changed(mutableState114);
                                            Object objRememberedValue156 = composer19.rememberedValue();
                                            if (zChanged18 || objRememberedValue156 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue156 = new t1(7, mutableState114);
                                                composer19.updateRememberedValue(objRememberedValue156);
                                            }
                                            Function1 function14 = (Function1) objRememberedValue156;
                                            boolean zChangedInstance20 = composer19.changedInstance(p7Var10) | composer19.changed(function12);
                                            Object objRememberedValue157 = composer19.rememberedValue();
                                            if (zChangedInstance20 || objRememberedValue157 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue157 = new a2(i32, p7Var10, function12);
                                                composer19.updateRememberedValue(objRememberedValue157);
                                            }
                                            f7.a(list7, str5, zBooleanValue2, focusRequester14, focusRequester6, function14, (Function2) objRememberedValue157, composer19, 27648);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer19.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer15, 54), composer15, 1576320);
                        Composer composer18 = composer15;
                        composer18.endReplaceGroup();
                        mutableState11 = mutableState90;
                        mutableState9 = mutableState112;
                        composer13 = composer18;
                    }
                    p7Var6 = p7Var7;
                    z11 = true;
                    composer14 = composer13;
                    mutableState10 = mutableState56;
                    composer4 = composer14;
                } else {
                    vcVar = vcVar;
                    boxScopeInstance = boxScopeInstance;
                    modifier4 = modifier4;
                    context6 = context6;
                    searchInputServerManager2 = searchInputServerManager2;
                    FocusRequester focusRequester15 = focusRequester;
                    mutableState7 = mutableState7;
                    MutableState mutableState113 = mutableState8;
                    focusRequester2 = focusRequester10;
                    composer15.startReplaceGroup(-1539750332);
                    int i31 = i(mutableState85);
                    zChanged5 = composer15.changed(mutableState85);
                    objRememberedValue6 = composer15.rememberedValue();
                    if (zChanged5 || objRememberedValue6 == companion3.getEmpty()) {
                        objRememberedValue6 = new t1(13, mutableState85);
                        composer15.updateRememberedValue(objRememberedValue6);
                    }
                    Function1 function12 = (Function1) objRememberedValue6;
                    objRememberedValue7 = composer15.rememberedValue();
                    if (objRememberedValue7 == companion3.getEmpty()) {
                        c = 14;
                        objRememberedValue7 = new t1(14, mutableState90);
                        composer15.updateRememberedValue(objRememberedValue7);
                    } else {
                        c = 14;
                    }
                    userPreferences = userPreferences;
                    mutableState9 = mutableState113;
                    mutableState6 = mutableState6;
                    p7Var6 = p7Var5;
                    focusRequester9 = focusRequester9;
                    mutableState10 = mutableState56;
                    mutableState11 = mutableState90;
                    z11 = true;
                    L(i31, function12, (Function1) objRememberedValue7, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(436731073, true, new h2(list2, focusRequester15, focusRequester11, focusRequester5, p7Var5, state5, aggregateSearchHistoryPreferences, userPreferences, state, function2, mutableState91, mutableState105, mutableState104, mutableState56, state4, mutableState5, mutableState2), composer15, 54), composer15, 1576320);
                    Composer composer19 = composer15;
                    composer19.endReplaceGroup();
                    composer4 = composer19;
                }
                i3 i3Var2 = (i3) state6.getValue();
                boolean zM = m(mutableState11);
                boolean zBooleanValue = ((Boolean) mutableState48.getValue()).booleanValue() ^ z11;
                boolean zBooleanValue2 = ((Boolean) mutableState49.getValue()).booleanValue();
                zChangedInstance2 = composer4.changedInstance(p7Var6);
                objRememberedValue8 = composer4.rememberedValue();
                if (zChangedInstance2 || objRememberedValue8 == companion3.getEmpty()) {
                    objRememberedValue8 = new d6(p7Var6);
                    composer4.updateRememberedValue(objRememberedValue8);
                }
                Function1 function13 = (Function1) ((KFunction) objRememberedValue8);
                objRememberedValue9 = composer4.rememberedValue();
                if (objRememberedValue9 == companion3.getEmpty()) {
                    objRememberedValue9 = new r1(11, mutableState6);
                    composer4.updateRememberedValue(objRememberedValue9);
                }
                Function0 function14 = (Function0) objRememberedValue9;
                objRememberedValue10 = composer4.rememberedValue();
                if (objRememberedValue10 == companion3.getEmpty()) {
                    objRememberedValue10 = new r1(12, mutableState7);
                    composer4.updateRememberedValue(objRememberedValue10);
                }
                Function0 function15 = (Function0) objRememberedValue10;
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    vcVar.getClass();
                    if (((Boolean) qc.b.getValue()).booleanValue()) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                Composer composer20 = composer4;
                mutableState12 = mutableState6;
                mutableState13 = mutableState7;
                p7 p7Var10 = p7Var6;
                Modifier modifier6 = modifier4;
                y32Var2 = y32Var;
                i11 = 1;
                J(i3Var2, zM, zBooleanValue, zBooleanValue2, function13, function14, function15, z12, focusRequester4, focusRequester5, focusRequester6, focusRequester7, focusRequester8, focusRequester9, focusRequester2, boxScopeInstance.align(Modifier.INSTANCE, companion5.getTopCenter()), composer20, 907739136, 28086);
                composer5 = composer20;
                composer5.endNode();
                if (A(mutableState12)) {
                    composer5.startReplaceGroup(684767866);
                    if ((i8 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    context = context6;
                    boolean zChangedInstance19 = composer5.changedInstance(list3) | z14 | composer5.changedInstance(context);
                    if ((i8 & Input.Keys.FORWARD_DEL) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zChangedInstance19 | z15;
                    objRememberedValue56 = composer5.rememberedValue();
                    if (!z16 || objRememberedValue56 == companion3.getEmpty()) {
                        i12 = 4;
                        mutableState43 = mutableState12;
                        f4 f4Var = new f4(function0, list3, context, function1, mutableState43, mutableState64);
                        function6 = function0;
                        composer5.updateRememberedValue(f4Var);
                        objRememberedValue56 = f4Var;
                    } else {
                        function6 = function0;
                        i12 = 4;
                        mutableState43 = mutableState12;
                    }
                    Function1 function16 = (Function1) objRememberedValue56;
                    objRememberedValue57 = composer5.rememberedValue();
                    if (objRememberedValue57 == companion3.getEmpty()) {
                        objRememberedValue57 = new r1(13, mutableState43);
                        composer5.updateRememberedValue(objRememberedValue57);
                    }
                    qn0.d("切换视界", list5, true, function16, (Function0) objRememberedValue57, composer5, 24966, 0);
                    Composer composer21 = composer5;
                    composer21.endReplaceGroup();
                    composer6 = composer21;
                } else {
                    function6 = function0;
                    i12 = 4;
                    vcVar = vcVar;
                    i11 = 1;
                    context = context6;
                    composer5.startReplaceGroup(686754253);
                    composer5.endReplaceGroup();
                    composer6 = composer5;
                }
                if (((Boolean) mutableState9.getValue()).booleanValue()) {
                    composer6.startReplaceGroup(686787020);
                    objRememberedValue54 = composer6.rememberedValue();
                    if (objRememberedValue54 == companion3.getEmpty()) {
                        mutableState42 = mutableState9;
                        i13 = 14;
                        objRememberedValue54 = new r1(14, mutableState42);
                        composer6.updateRememberedValue(objRememberedValue54);
                    } else {
                        mutableState42 = mutableState9;
                        i13 = 14;
                    }
                    Function0 function17 = (Function0) objRememberedValue54;
                    if ((i8 & 14) == i12) {
                        i20 = i11;
                    } else {
                        i20 = 0;
                    }
                    objRememberedValue55 = composer6.rememberedValue();
                    if (i20 == 0 || objRememberedValue55 == companion3.getEmpty()) {
                        objRememberedValue55 = new o5(function6, mutableState42, i11);
                        composer6.updateRememberedValue(objRememberedValue55);
                    }
                    c(function17, (Function0) objRememberedValue55, composer6, 6);
                    composer6.endReplaceGroup();
                } else {
                    i13 = 14;
                    composer6.startReplaceGroup(687003245);
                    composer6.endReplaceGroup();
                }
                if (((Boolean) mutableState13.getValue()).booleanValue()) {
                    composer6.startReplaceGroup(687088092);
                    objRememberedValue39 = composer6.rememberedValue();
                    if (objRememberedValue39 == companion3.getEmpty()) {
                        mutableState30 = mutableState13;
                        i19 = 15;
                        objRememberedValue39 = new r1(15, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue39);
                    } else {
                        mutableState30 = mutableState13;
                        i19 = 15;
                    }
                    Function0 function18 = (Function0) objRememberedValue39;
                    objRememberedValue40 = composer6.rememberedValue();
                    if (objRememberedValue40 == companion3.getEmpty()) {
                        mutableState31 = mutableState87;
                        objRememberedValue40 = new d4(i13, mutableState31, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue40);
                    } else {
                        mutableState31 = mutableState87;
                    }
                    Function0 function19 = (Function0) objRememberedValue40;
                    objRememberedValue41 = composer6.rememberedValue();
                    if (objRememberedValue41 == companion3.getEmpty()) {
                        mutableState32 = mutableState67;
                        objRememberedValue41 = new d4(i19, mutableState32, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue41);
                    } else {
                        mutableState32 = mutableState67;
                    }
                    Function0 function20 = (Function0) objRememberedValue41;
                    objRememberedValue42 = composer6.rememberedValue();
                    if (objRememberedValue42 == companion3.getEmpty()) {
                        mutableState33 = mutableState94;
                        objRememberedValue42 = new d4(16, mutableState33, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue42);
                    } else {
                        mutableState33 = mutableState94;
                    }
                    Function0 function21 = (Function0) objRememberedValue42;
                    objRememberedValue43 = composer6.rememberedValue();
                    if (objRememberedValue43 == companion3.getEmpty()) {
                        mutableState34 = mutableState96;
                        objRememberedValue43 = new d4(17, mutableState34, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue43);
                    } else {
                        mutableState34 = mutableState96;
                    }
                    Function0 function22 = (Function0) objRememberedValue43;
                    objRememberedValue44 = composer6.rememberedValue();
                    if (objRememberedValue44 == companion3.getEmpty()) {
                        mutableState35 = mutableState66;
                        objRememberedValue44 = new d4(18, mutableState35, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue44);
                    } else {
                        mutableState35 = mutableState66;
                    }
                    Function0 function23 = (Function0) objRememberedValue44;
                    objRememberedValue45 = composer6.rememberedValue();
                    mutableState96 = mutableState34;
                    if (objRememberedValue45 == companion3.getEmpty()) {
                        mutableState36 = mutableState95;
                        objRememberedValue45 = new d4(19, mutableState36, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue45);
                    } else {
                        mutableState36 = mutableState95;
                    }
                    Function0 function24 = (Function0) objRememberedValue45;
                    objRememberedValue46 = composer6.rememberedValue();
                    if (objRememberedValue46 == companion3.getEmpty()) {
                        mutableState37 = mutableState97;
                        objRememberedValue46 = new d4(20, mutableState37, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue46);
                    } else {
                        mutableState37 = mutableState97;
                    }
                    Function0 function25 = (Function0) objRememberedValue46;
                    zChanged6 = composer6.changed(vcVar);
                    objRememberedValue47 = composer6.rememberedValue();
                    if (zChanged6 || objRememberedValue47 == companion3.getEmpty()) {
                        objRememberedValue47 = new g6(vcVar, 0);
                        composer6.updateRememberedValue(objRememberedValue47);
                    }
                    Function0 function26 = (Function0) ((KFunction) objRememberedValue47);
                    objRememberedValue48 = composer6.rememberedValue();
                    if (objRememberedValue48 == companion3.getEmpty()) {
                        mutableState38 = mutableState101;
                        objRememberedValue48 = new d4(21, mutableState38, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue48);
                    } else {
                        mutableState38 = mutableState101;
                    }
                    Function0 function27 = (Function0) objRememberedValue48;
                    objRememberedValue49 = composer6.rememberedValue();
                    mutableState101 = mutableState38;
                    if (objRememberedValue49 == companion3.getEmpty()) {
                        mutableState17 = mutableState73;
                        objRememberedValue49 = new d4(22, mutableState17, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue49);
                    } else {
                        mutableState17 = mutableState73;
                    }
                    Function0 function28 = (Function0) objRememberedValue49;
                    objRememberedValue50 = composer6.rememberedValue();
                    if (objRememberedValue50 == companion3.getEmpty()) {
                        mutableState39 = mutableState102;
                        objRememberedValue50 = new d4(23, mutableState39, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue50);
                    } else {
                        mutableState39 = mutableState102;
                    }
                    Function0 function29 = (Function0) objRememberedValue50;
                    objRememberedValue51 = composer6.rememberedValue();
                    if (objRememberedValue51 == companion3.getEmpty()) {
                        mutableState16 = mutableState76;
                        objRememberedValue51 = new d4(24, mutableState16, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue51);
                    } else {
                        mutableState16 = mutableState76;
                    }
                    Function0 function30 = (Function0) objRememberedValue51;
                    objRememberedValue52 = composer6.rememberedValue();
                    if (objRememberedValue52 == companion3.getEmpty()) {
                        mutableState98 = mutableState98;
                        objRememberedValue52 = new d4(25, mutableState98, mutableState30);
                        composer6.updateRememberedValue(objRememberedValue52);
                    } else {
                        mutableState98 = mutableState98;
                    }
                    Function0 function31 = (Function0) objRememberedValue52;
                    zChangedInstance13 = composer6.changedInstance(context);
                    objRememberedValue53 = composer6.rememberedValue();
                    if (!zChangedInstance13 || objRememberedValue53 == companion3.getEmpty()) {
                        mutableState40 = mutableState99;
                        mutableState41 = mutableState100;
                        objRememberedValue53 = new s5(context, mutableState40, mutableState41, 0);
                        composer6.updateRememberedValue(objRememberedValue53);
                    } else {
                        mutableState40 = mutableState99;
                        mutableState41 = mutableState100;
                    }
                    mutableState100 = mutableState41;
                    mutableState67 = mutableState32;
                    mutableState97 = mutableState37;
                    mutableState99 = mutableState40;
                    mutableState87 = mutableState31;
                    Composer composer22 = composer6;
                    mutableState95 = mutableState36;
                    mutableState15 = mutableState30;
                    mutableState102 = mutableState39;
                    mutableState94 = mutableState33;
                    mutableState14 = mutableState35;
                    kz1.b(function18, function19, function20, function21, function22, function23, function24, function25, false, function26, function27, function28, function29, function30, function31, (Function0) objRememberedValue53, composer22, 14380470, 28086);
                    Composer composer23 = composer22;
                    composer23.endReplaceGroup();
                    composer7 = composer23;
                } else {
                    mutableState14 = mutableState66;
                    mutableState15 = mutableState13;
                    mutableState16 = mutableState76;
                    mutableState17 = mutableState73;
                    composer6.startReplaceGroup(688857293);
                    composer6.endReplaceGroup();
                    composer7 = composer6;
                }
                if (((Boolean) mutableState87.getValue()).booleanValue()) {
                    composer7.startReplaceGroup(688899050);
                    objRememberedValue38 = composer7.rememberedValue();
                    if (objRememberedValue38 == companion3.getEmpty()) {
                        objRememberedValue38 = new d4(26, mutableState87, mutableState15);
                        composer7.updateRememberedValue(objRememberedValue38);
                    }
                    b00.a((Function0) objRememberedValue38, true, null, composer7, 54, 4);
                    composer7.endReplaceGroup();
                } else {
                    composer7.startReplaceGroup(689055693);
                    composer7.endReplaceGroup();
                }
                if (((Boolean) mutableState14.getValue()).booleanValue()) {
                    composer7.startReplaceGroup(689093265);
                    objRememberedValue37 = composer7.rememberedValue();
                    if (objRememberedValue37 == companion3.getEmpty()) {
                        objRememberedValue37 = new d4(27, mutableState14, mutableState15);
                        composer7.updateRememberedValue(objRememberedValue37);
                    }
                    i14 = 6;
                    zb0.b((Function0) objRememberedValue37, composer7, 6);
                    composer7.endReplaceGroup();
                } else {
                    i14 = 6;
                    composer7.startReplaceGroup(689212429);
                    composer7.endReplaceGroup();
                }
                if (((Boolean) mutableState101.getValue()).booleanValue()) {
                    composer7.startReplaceGroup(689267020);
                    objRememberedValue35 = composer7.rememberedValue();
                    if (objRememberedValue35 == companion3.getEmpty()) {
                        objRememberedValue35 = new d4(28, mutableState101, mutableState15);
                        composer7.updateRememberedValue(objRememberedValue35);
                    }
                    Function0 function32 = (Function0) objRememberedValue35;
                    userPreferences2 = userPreferences;
                    context2 = context;
                    zChangedInstance12 = composer7.changedInstance(userPreferences2) | composer7.changedInstance(context2);
                    objRememberedValue36 = composer7.rememberedValue();
                    if (!zChangedInstance12 || objRememberedValue36 == companion3.getEmpty()) {
                        mutableState18 = mutableState59;
                        i15 = 0;
                        objRememberedValue36 = new t5(userPreferences2, context2, mutableState18, 0);
                        composer7.updateRememberedValue(objRememberedValue36);
                    } else {
                        mutableState18 = mutableState59;
                        i15 = 0;
                    }
                    q41.a(function32, (Function0) objRememberedValue36, composer7, i14);
                    composer7.endReplaceGroup();
                } else {
                    userPreferences2 = userPreferences;
                    mutableState18 = mutableState59;
                    context2 = context;
                    i15 = 0;
                    composer7.startReplaceGroup(689852269);
                    composer7.endReplaceGroup();
                }
                if (((Boolean) mutableState94.getValue()).booleanValue()) {
                    composer7.startReplaceGroup(689890988);
                    objRememberedValue34 = composer7.rememberedValue();
                    if (objRememberedValue34 == companion3.getEmpty()) {
                        objRememberedValue34 = new d4(i15, mutableState94, mutableState15);
                        composer7.updateRememberedValue(objRememberedValue34);
                    }
                    v72.f((Function0) objRememberedValue34, composer7, i14);
                    composer7.endReplaceGroup();
                } else {
                    composer7.startReplaceGroup(690014957);
                    composer7.endReplaceGroup();
                }
                if (((Boolean) mutableState67.getValue()).booleanValue()) {
                    composer7.startReplaceGroup(690170360);
                    boolean zBooleanValue3 = ((Boolean) mutableState46.getValue()).booleanValue();
                    boolean zF = f(mutableState47);
                    boolean zBooleanValue4 = ((Boolean) mutableState48.getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) mutableState49.getValue()).booleanValue();
                    mutableState19 = mutableState18;
                    boolean zT = t(mutableState50);
                    boolean zU = u(mutableState51);
                    boolean zV = v(mutableState52);
                    Context context7 = context2;
                    boolean zW = w(mutableState53);
                    boolean zBooleanValue6 = ((Boolean) mutableState54.getValue()).booleanValue();
                    boolean zX = x(mutableState55);
                    boolean zY = y(mutableState57);
                    boolean zBooleanValue7 = ((Boolean) mutableState3.getValue()).booleanValue();
                    boolean z19 = z(mutableState60);
                    boolean zBooleanValue8 = ((Boolean) mutableState19.getValue()).booleanValue();
                    objRememberedValue32 = composer7.rememberedValue();
                    if (objRememberedValue32 == companion3.getEmpty()) {
                        mutableState28 = mutableState67;
                        objRememberedValue32 = new d4(1, mutableState28, mutableState15);
                        composer7.updateRememberedValue(objRememberedValue32);
                    } else {
                        mutableState28 = mutableState67;
                    }
                    Function0 function33 = (Function0) objRememberedValue32;
                    zChangedInstance11 = composer7.changedInstance(userPreferences2);
                    objRememberedValue33 = composer7.rememberedValue();
                    mutableState29 = mutableState15;
                    if (!zChangedInstance11 || objRememberedValue33 == companion3.getEmpty()) {
                        UserPreferences userPreferences7 = userPreferences2;
                        objRememberedValue33 = new e4(userPreferences7, mutableState46, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState53, mutableState54, mutableState55, mutableState57, mutableState3, mutableState60, mutableState28, mutableState29, 0);
                        userPreferences5 = userPreferences7;
                        mutableState3 = mutableState3;
                        mutableState60 = mutableState60;
                        mutableState57 = mutableState57;
                        composer7.updateRememberedValue(objRememberedValue33);
                    } else {
                        userPreferences5 = userPreferences2;
                    }
                    userPreferences3 = userPreferences5;
                    Composer composer24 = composer7;
                    mutableState15 = mutableState29;
                    context3 = context7;
                    qu0.a(zBooleanValue3, zF, zBooleanValue4, zBooleanValue5, zT, zU, zV, zW, zBooleanValue6, zX, zY, zBooleanValue7, z19, zBooleanValue8, function33, (Function13) objRememberedValue33, composer24, 0, 24576);
                    Composer composer25 = composer24;
                    composer25.endReplaceGroup();
                    composer8 = composer25;
                } else {
                    mutableState19 = mutableState18;
                    context3 = context2;
                    userPreferences3 = userPreferences2;
                    composer7.startReplaceGroup(693788525);
                    composer7.endReplaceGroup();
                    composer8 = composer7;
                }
                if (((Boolean) mutableState96.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(693841070);
                    String qrNetworkInterfaceName = userPreferences3.getQrNetworkInterfaceName();
                    objRememberedValue30 = composer8.rememberedValue();
                    if (objRememberedValue30 == companion3.getEmpty()) {
                        mutableState27 = mutableState96;
                        objRememberedValue30 = new d4(2, mutableState27, mutableState15);
                        composer8.updateRememberedValue(objRememberedValue30);
                    } else {
                        mutableState27 = mutableState96;
                    }
                    Function0 function34 = (Function0) objRememberedValue30;
                    userPreferences4 = userPreferences3;
                    searchInputServerManager3 = searchInputServerManager2;
                    zChangedInstance10 = composer8.changedInstance(userPreferences4) | composer8.changedInstance(searchInputServerManager3);
                    objRememberedValue31 = composer8.rememberedValue();
                    if (zChangedInstance10 || objRememberedValue31 == companion3.getEmpty()) {
                        objRememberedValue31 = new f4(userPreferences4, searchInputServerManager3, mutableState104, mutableState105, mutableState27, mutableState15, 0);
                        composer8.updateRememberedValue(objRememberedValue31);
                    }
                    xr1.b(qrNetworkInterfaceName, function34, (Function1) objRememberedValue31, composer8, 48);
                    composer8.endReplaceGroup();
                } else {
                    userPreferences4 = userPreferences3;
                    searchInputServerManager3 = searchInputServerManager2;
                    composer8.startReplaceGroup(694270637);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState97.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(694310410);
                    objRememberedValue29 = composer8.rememberedValue();
                    if (objRememberedValue29 == companion3.getEmpty()) {
                        objRememberedValue29 = new d4(3, mutableState97, mutableState15);
                        composer8.updateRememberedValue(objRememberedValue29);
                    }
                    i16 = 6;
                    wm.a((Function0) objRememberedValue29, composer8, 6);
                    composer8.endReplaceGroup();
                } else {
                    i16 = 6;
                    composer8.startReplaceGroup(694436301);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState17.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(694487544);
                    List listO = o(stateCollectAsState6);
                    String strP = p(stateCollectAsState7);
                    objRememberedValue25 = composer8.rememberedValue();
                    if (objRememberedValue25 == companion3.getEmpty()) {
                        mutableState20 = mutableState17;
                        mutableState21 = mutableState74;
                        objRememberedValue25 = new d4(4, mutableState21, mutableState20);
                        composer8.updateRememberedValue(objRememberedValue25);
                    } else {
                        mutableState20 = mutableState17;
                        mutableState21 = mutableState74;
                    }
                    Function0 function35 = (Function0) objRememberedValue25;
                    zChangedInstance8 = composer8.changedInstance(coroutineScope2) | composer8.changedInstance(y32Var2);
                    objRememberedValue26 = composer8.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue26 == companion3.getEmpty()) {
                        objRememberedValue26 = new g4(coroutineScope2, y32Var2, 0);
                        composer8.updateRememberedValue(objRememberedValue26);
                    }
                    Function1 function36 = (Function1) objRememberedValue26;
                    zChangedInstance9 = composer8.changedInstance(coroutineScope2) | composer8.changedInstance(y32Var2);
                    objRememberedValue27 = composer8.rememberedValue();
                    if (zChangedInstance9 || objRememberedValue27 == companion3.getEmpty()) {
                        objRememberedValue27 = new g4(coroutineScope2, y32Var2, 1);
                        composer8.updateRememberedValue(objRememberedValue27);
                    }
                    Function1 function37 = (Function1) objRememberedValue27;
                    objRememberedValue28 = composer8.rememberedValue();
                    if (objRememberedValue28 == companion3.getEmpty()) {
                        objRememberedValue28 = new d4(5, mutableState20, mutableState15);
                        composer8.updateRememberedValue(objRememberedValue28);
                    }
                    coroutineScope = coroutineScope2;
                    i17 = 0;
                    q32.d(listO, strP, function35, function36, function37, (Function0) objRememberedValue28, composer8, 196992);
                    composer8.endReplaceGroup();
                } else {
                    mutableState20 = mutableState17;
                    coroutineScope = coroutineScope2;
                    mutableState21 = mutableState74;
                    i17 = 0;
                    composer8.startReplaceGroup(695061261);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState95.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(695103576);
                    ProxyConfig proxyConfigN = n(stateCollectAsState5);
                    objRememberedValue23 = composer8.rememberedValue();
                    if (objRememberedValue23 == companion3.getEmpty()) {
                        mutableState26 = mutableState95;
                        objRememberedValue23 = new d4(i16, mutableState26, mutableState15);
                        composer8.updateRememberedValue(objRememberedValue23);
                    } else {
                        mutableState26 = mutableState95;
                    }
                    Function0 function38 = (Function0) objRememberedValue23;
                    context4 = context3;
                    zChangedInstance7 = composer8.changedInstance(coroutineScope) | composer8.changedInstance(proxySettings) | composer8.changedInstance(context4);
                    objRememberedValue24 = composer8.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue24 == companion3.getEmpty()) {
                        objRememberedValue24 = new i4(coroutineScope, proxySettings, context4, mutableState26, mutableState15, 0);
                        composer8.updateRememberedValue(objRememberedValue24);
                    }
                    gr1.c(proxyConfigN, proxyConfigServerManager, function38, (Function1) objRememberedValue24, composer8, RendererCapabilities.DECODER_SUPPORT_MASK);
                    composer8.endReplaceGroup();
                } else {
                    composer8.startReplaceGroup(695585037);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState21.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(695625616);
                    String str4 = (String) mutableState80.getValue();
                    String str5 = (String) mutableState80.getValue();
                    boolean z20 = ((str5 != null || StringsKt.isBlank(str5)) && !((Boolean) mutableState81.getValue()).booleanValue()) ? 1 : i17;
                    boolean zBooleanValue9 = ((Boolean) mutableState81.getValue()).booleanValue();
                    objRememberedValue22 = composer8.rememberedValue();
                    if (objRememberedValue22 == companion3.getEmpty()) {
                        c2 = 7;
                        objRememberedValue22 = new d4(7, mutableState21, mutableState20);
                        composer8.updateRememberedValue(objRememberedValue22);
                    } else {
                        c2 = 7;
                    }
                    e42.a(str4, z20, zBooleanValue9, (Function0) objRememberedValue22, composer8, 3072);
                    composer8.endReplaceGroup();
                } else {
                    c2 = 7;
                    composer8.startReplaceGroup(695899501);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState102.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(695954805);
                    t91 t91VarQ = q(stateCollectAsState8);
                    objRememberedValue20 = composer8.rememberedValue();
                    if (objRememberedValue20 == companion3.getEmpty()) {
                        mutableState25 = mutableState102;
                        objRememberedValue20 = new d4(8, mutableState25, mutableState15);
                        composer8.updateRememberedValue(objRememberedValue20);
                    } else {
                        mutableState25 = mutableState102;
                    }
                    Function0 function39 = (Function0) objRememberedValue20;
                    zChangedInstance6 = composer8.changedInstance(sa1Var);
                    objRememberedValue21 = composer8.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue21 == companion3.getEmpty()) {
                        objRememberedValue21 = new j4(sa1Var, mutableState25, mutableState15, i17);
                        composer8.updateRememberedValue(objRememberedValue21);
                    }
                    y91.c(t91VarQ, onlineSubtitleConfigServerManager, function39, (Function1) objRememberedValue21, composer8, RendererCapabilities.DECODER_SUPPORT_MASK);
                    composer8.endReplaceGroup();
                } else {
                    composer8.startReplaceGroup(696377645);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState16.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(696423339);
                    ye2 ye2VarR = r(stateCollectAsState9);
                    objRememberedValue17 = composer8.rememberedValue();
                    if (objRememberedValue17 == companion3.getEmpty()) {
                        objRememberedValue17 = new d4(9, mutableState16, mutableState15);
                        composer8.updateRememberedValue(objRememberedValue17);
                    }
                    Function0 function40 = (Function0) objRememberedValue17;
                    zChangedInstance4 = composer8.changedInstance(qf2Var);
                    objRememberedValue18 = composer8.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue18 == companion3.getEmpty()) {
                        objRememberedValue18 = new k4(qf2Var, i17);
                        composer8.updateRememberedValue(objRememberedValue18);
                    }
                    Function1 function41 = (Function1) objRememberedValue18;
                    zChangedInstance5 = composer8.changedInstance(userPreferences4) | composer8.changedInstance(searchInputServerManager3);
                    objRememberedValue19 = composer8.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue19 == companion3.getEmpty()) {
                        objRememberedValue19 = new n6(userPreferences4, mutableState46, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState53, mutableState54, mutableState55, mutableState10, mutableState57, mutableState3, mutableState19, mutableState60, searchInputServerManager3, mutableState104, mutableState105, mutableState45);
                        composer8.updateRememberedValue(objRememberedValue19);
                    }
                    ef2.f(ye2VarR, pf2Var, webDavSyncConfigServerManager, function40, function41, (Function1) ((KFunction) objRememberedValue19), composer8, 3072);
                    composer8.endReplaceGroup();
                } else {
                    composer8.startReplaceGroup(696855789);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState98.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(696896058);
                    i92 i92VarS = s(stateCollectAsState10);
                    objRememberedValue15 = composer8.rememberedValue();
                    if (objRememberedValue15 == companion3.getEmpty()) {
                        objRememberedValue15 = new d4(10, mutableState98, mutableState15);
                        composer8.updateRememberedValue(objRememberedValue15);
                    }
                    Function0 function42 = (Function0) objRememberedValue15;
                    zChangedInstance3 = composer8.changedInstance(ab2Var);
                    objRememberedValue16 = composer8.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue16 == companion3.getEmpty()) {
                        objRememberedValue16 = new l4(ab2Var, i17);
                        composer8.updateRememberedValue(objRememberedValue16);
                    }
                    hb2.b(i92VarS, xa2Var, function42, (Function1) objRememberedValue16, composer8, RendererCapabilities.DECODER_SUPPORT_MASK);
                    composer8.endReplaceGroup();
                } else {
                    composer8.startReplaceGroup(697191085);
                    composer8.endReplaceGroup();
                }
                if (((Boolean) mutableState99.getValue()).booleanValue()) {
                    composer8.startReplaceGroup(697225340);
                    objRememberedValue14 = composer8.rememberedValue();
                    if (objRememberedValue14 == companion3.getEmpty()) {
                        c3 = 4;
                        objRememberedValue14 = new b1(4);
                        composer8.updateRememberedValue(objRememberedValue14);
                    } else {
                        c3 = 4;
                    }
                    Composer composer26 = composer8;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue14, ss.e(), null, null, null, ss.c(), ss.g(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer26, 1769526, 0, 16284);
                    Composer composer27 = composer26;
                    composer27.endReplaceGroup();
                    composer9 = composer27;
                } else {
                    composer8.startReplaceGroup(697610701);
                    composer8.endReplaceGroup();
                    composer9 = composer8;
                }
                if (((Boolean) mutableState100.getValue()).booleanValue()) {
                    composer9.startReplaceGroup(697658565);
                    objRememberedValue13 = composer9.rememberedValue();
                    if (objRememberedValue13 == companion3.getEmpty()) {
                        mutableState24 = mutableState100;
                        objRememberedValue13 = new d4(12, mutableState24, mutableState15);
                        composer9.updateRememberedValue(objRememberedValue13);
                    } else {
                        mutableState24 = mutableState100;
                    }
                    Composer composer28 = composer9;
                    i18 = 0;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue13, ComposableLambdaKt.rememberComposableLambda(-957047835, true, new m4(0, mutableState24, mutableState15), composer9, 54), null, null, null, ss.d(), ss.b(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer28, 1769526, 0, 16284);
                    Composer composer29 = composer28;
                    composer29.endReplaceGroup();
                    composer10 = composer29;
                } else {
                    i18 = 0;
                    composer9.startReplaceGroup(698066029);
                    composer9.endReplaceGroup();
                    composer10 = composer9;
                }
                bd.a(vcVar, composer10, i18);
                if (((String) mutableState82.getValue()) != null) {
                    composer10.startReplaceGroup(698159091);
                    objRememberedValue12 = composer10.rememberedValue();
                    if (objRememberedValue12 == companion3.getEmpty()) {
                        mutableState23 = mutableState82;
                        objRememberedValue12 = new r1(6, mutableState23);
                        composer10.updateRememberedValue(objRememberedValue12);
                    } else {
                        mutableState23 = mutableState82;
                    }
                    Composer composer30 = composer10;
                    z13 = true;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue12, ComposableLambdaKt.rememberComposableLambda(754230532, true, new b2(3, mutableState23), composer10, 54), null, null, null, ss.a(), ComposableLambdaKt.rememberComposableLambda(1058623839, true, new b2(4, mutableState23), composer10, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer30, 1769526, 0, 16284);
                    Composer composer31 = composer30;
                    composer31.endReplaceGroup();
                    composer11 = composer31;
                } else {
                    z13 = true;
                    composer10.startReplaceGroup(698522349);
                    composer10.endReplaceGroup();
                    composer11 = composer10;
                }
                if (((String) mutableState83.getValue()) != null) {
                    composer11.startReplaceGroup(698568632);
                    objRememberedValue11 = composer11.rememberedValue();
                    if (objRememberedValue11 == companion3.getEmpty()) {
                        mutableState22 = mutableState83;
                        objRememberedValue11 = new r1(7, mutableState22);
                        composer11.updateRememberedValue(objRememberedValue11);
                    } else {
                        mutableState22 = mutableState83;
                    }
                    Composer composer32 = composer11;
                    AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue11, ComposableLambdaKt.rememberComposableLambda(-252351058, z13, new b2(5, mutableState22), composer11, 54), null, null, null, ss.f(), ComposableLambdaKt.rememberComposableLambda(52042249, z13, new b2(6, mutableState22), composer11, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer32, 1769526, 0, 16284);
                    Composer composer33 = composer32;
                    composer33.endReplaceGroup();
                    composer12 = composer33;
                } else {
                    composer11.startReplaceGroup(698927085);
                    composer11.endReplaceGroup();
                    composer12 = composer11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                p7Var2 = p7Var10;
                modifier2 = modifier6;
                z4 = z18;
                composer2 = composer12;
            }
            state = stateRememberUpdatedState;
            searchInputServerManager = searchInputServerManager4;
            p7 p7Var11 = p7Var3;
            objRememberedValue152 = new p6(z6, searchInputServerManager, p7Var11, aggregateSearchHistoryPreferences, userPreferences6, list, stateCollectAsState2, mutableState103, mutableState56, state, mutableState104, mutableState105, (Continuation) null);
            p7Var4 = p7Var11;
            userPreferences = userPreferences6;
            state2 = stateCollectAsState2;
            mutableState2 = mutableState103;
            composer15.updateRememberedValue(objRememberedValue152);
            Function2 function43 = (Function2) objRememberedValue152;
            mutableState3 = mutableState58;
            vcVar = vcVarB;
            EffectsKt.LaunchedEffect(boolValueOf6, list, bool, function43, composer15, i27);
            list2 = list;
            Boolean boolValueOf13 = Boolean.valueOf(z6);
            String str6 = (String) stateCollectAsState3.getValue();
            if (i25 == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            zChanged = z7 | composer15.changed(stateCollectAsState3);
            Object objRememberedValue154 = composer15.rememberedValue();
            if (zChanged) {
                i10 = 1048576;
                q6Var = new q6(z6, stateCollectAsState3, mutableState84, continuation2, 0);
                state3 = stateCollectAsState3;
                mutableState4 = mutableState84;
                composer15.updateRememberedValue(q6Var);
            } else {
                i10 = 1048576;
                q6Var = new q6(z6, stateCollectAsState3, mutableState84, continuation2, 0);
                state3 = stateCollectAsState3;
                mutableState4 = mutableState84;
                composer15.updateRememberedValue(q6Var);
            }
            EffectsKt.LaunchedEffect(boolValueOf13, str6, (Function2) q6Var, composer15, i27);
            Boolean boolValueOf14 = Boolean.valueOf(z6);
            Boolean boolValueOf15 = Boolean.valueOf(h(mutableState4));
            String str7 = (String) state3.getValue();
            if (i25 == i10) {
                z8 = true;
            } else {
                z8 = false;
            }
            zChanged2 = z8 | composer15.changed(state3);
            objRememberedValue = composer15.rememberedValue();
            if (zChanged2) {
                State state9 = state3;
                MutableState mutableState1010 = mutableState4;
                objRememberedValue = new b6(z6, mutableState1010, state9, focusRequester3, null, 0);
                mutableState5 = mutableState1010;
                state4 = state9;
                focusRequester = focusRequester3;
                composer15.updateRememberedValue(objRememberedValue);
            } else {
                State state10 = state3;
                MutableState mutableState1011 = mutableState4;
                objRememberedValue = new b6(z6, mutableState1011, state10, focusRequester3, null, 0);
                mutableState5 = mutableState1011;
                state4 = state10;
                focusRequester = focusRequester3;
                composer15.updateRememberedValue(objRememberedValue);
            }
            state5 = state2;
            searchInputServerManager2 = searchInputServerManager;
            EffectsKt.LaunchedEffect(boolValueOf14, boolValueOf15, str7, (Function2) objRememberedValue, composer15, i27);
            Boolean boolValueOf16 = Boolean.valueOf(z6);
            i3 i3Var3 = (i3) stateCollectAsState4.getValue();
            Boolean bool9 = (Boolean) mutableState93.getValue();
            bool9.getClass();
            Boolean boolValueOf17 = Boolean.valueOf(h(mutableState5));
            Boolean boolValueOf18 = Boolean.valueOf(A(mutableState106));
            Boolean bool10 = (Boolean) mutableState61.getValue();
            bool10.getClass();
            Object[] objArr8 = new Object[6];
            objArr8[0] = boolValueOf16;
            objArr8[1] = i3Var3;
            objArr8[i26] = bool9;
            objArr8[3] = boolValueOf17;
            objArr8[4] = boolValueOf18;
            objArr8[5] = bool10;
            if (i25 == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            zChanged3 = composer15.changed(mutableState93) | z9 | composer15.changed(stateCollectAsState4);
            objRememberedValue2 = composer15.rememberedValue();
            if (zChanged3) {
                MutableState mutableState1012 = mutableState5;
                mutableState6 = mutableState106;
                objRememberedValue2 = new c6(z6, mutableState93, mutableState1012, stateCollectAsState4, mutableState6, mutableState61, focusRequester5, (Continuation) null);
                mutableState5 = mutableState1012;
                state6 = stateCollectAsState4;
                mutableState7 = mutableState61;
                composer15.updateRememberedValue(objRememberedValue2);
            } else {
                MutableState mutableState1013 = mutableState5;
                mutableState6 = mutableState106;
                objRememberedValue2 = new c6(z6, mutableState93, mutableState1013, stateCollectAsState4, mutableState6, mutableState61, focusRequester5, (Continuation) null);
                mutableState5 = mutableState1013;
                state6 = stateCollectAsState4;
                mutableState7 = mutableState61;
                composer15.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(objArr8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer15, 0);
            Unit unit2 = Unit.INSTANCE;
            zChangedInstance = composer15.changedInstance(searchInputServerManager2) | composer15.changedInstance(p7Var4);
            objRememberedValue3 = composer15.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue3 = new b(1, searchInputServerManager2, p7Var4);
                composer15.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new b(1, searchInputServerManager2, p7Var4);
                composer15.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer15, 6);
            if (z5 != 0) {
                z10 = false;
            } else {
                z10 = false;
            }
            objRememberedValue4 = composer15.rememberedValue();
            if (objRememberedValue4 == companion3.getEmpty()) {
                mutableState8 = mutableState63;
                objRememberedValue4 = new r1(8, mutableState8);
                composer15.updateRememberedValue(objRememberedValue4);
            } else {
                mutableState8 = mutableState63;
            }
            BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue4, composer15, 48, 0);
            zChanged4 = composer15.changed(((i3) state6.getValue()).ordinal());
            objRememberedValue5 = composer15.rememberedValue();
            if (zChanged4) {
                objRememberedValue5 = new v1(focusRequester5, focusRequester6, focusRequester7, focusRequester8, state6, 1);
                composer15.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new v1(focusRequester5, focusRequester6, focusRequester7, focusRequester8, state6, 1);
                composer15.updateRememberedValue(objRememberedValue5);
            }
            function5 = (Function0) objRememberedValue5;
            if (list2.isEmpty()) {
                composer15.startReplaceGroup(676102436);
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int iB3 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer15.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default3);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor2 = companion7.getConstructor();
                if (!id.n(composer15.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer15.startReusableNode();
                if (composer15.getInserting()) {
                    composer15.createNode(constructor2);
                } else {
                    composer15.useNode();
                }
                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer15);
                mr.z(companion7, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(iB3), composerM4318constructorimpl3));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i210 = MaterialTheme.$stable;
                modifier5 = modifier3;
                TextKt.m3048TextNvy7gAk("暂无可用服务器", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer15, i210).getOnBackground(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer15, i210).getTitleMedium(), composer15, 6, 0, 131066);
                composer15.endNode();
                if (((Boolean) mutableState8.getValue()).booleanValue()) {
                    composer15.startReplaceGroup(676458316);
                    objRememberedValue64 = composer15.rememberedValue();
                    if (objRememberedValue64 == companion3.getEmpty()) {
                        objRememberedValue64 = new r1(10, mutableState8);
                        composer15.updateRememberedValue(objRememberedValue64);
                    }
                    Function0 function44 = (Function0) objRememberedValue64;
                    if ((i8 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objRememberedValue65 = composer15.rememberedValue();
                    if (z17) {
                        objRememberedValue65 = new o5(function0, mutableState8, 0);
                        composer15.updateRememberedValue(objRememberedValue65);
                    } else {
                        objRememberedValue65 = new o5(function0, mutableState8, 0);
                        composer15.updateRememberedValue(objRememberedValue65);
                    }
                    c(function44, (Function0) objRememberedValue65, composer15, 6);
                    composer15.endReplaceGroup();
                } else {
                    composer15.startReplaceGroup(676705293);
                    composer15.endReplaceGroup();
                }
                composer15.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composer15.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new n4(function0, function1, str, function2, function3, function4, z6, z5, modifier5, p7Var4, i, 1));
                    return;
                }
                return;
            }
            z3 = z6;
            p7Var5 = p7Var4;
            modifier4 = modifier3;
            boolean z110 = z5;
            composer15.startReplaceGroup(676726125);
            composer15.endReplaceGroup();
            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Alignment.Companion companion8 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getTopStart(), false);
            int iB4 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer15.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default4);
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            constructor = companion9.getConstructor();
            if (!id.n(composer15.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer15.startReusableNode();
            if (composer15.getInserting()) {
                composer15.createNode(constructor);
            } else {
                composer15.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer15);
            mr.z(companion9, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl4, Integer.valueOf(iB4), composerM4318constructorimpl4));
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            iOrdinal = ((i3) state6.getValue()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != i26) {
                        FocusRequester focusRequester16 = focusRequester;
                        MutableState mutableState1014 = mutableState8;
                        focusRequester2 = focusRequester10;
                        composer15.startReplaceGroup(-1535747178);
                        int iK2 = k(mutableState88);
                        zChanged8 = composer15.changed(mutableState88);
                        objRememberedValue60 = composer15.rememberedValue();
                        if (zChanged8) {
                            objRememberedValue60 = new t1(17, mutableState88);
                            composer15.updateRememberedValue(objRememberedValue60);
                        } else {
                            objRememberedValue60 = new t1(17, mutableState88);
                            composer15.updateRememberedValue(objRememberedValue60);
                        }
                        Function1 function45 = (Function1) objRememberedValue60;
                        objRememberedValue61 = composer15.rememberedValue();
                        if (objRememberedValue61 == companion3.getEmpty()) {
                            objRememberedValue61 = new t1(18, mutableState90);
                            composer15.updateRememberedValue(objRememberedValue61);
                        }
                        p7Var7 = p7Var5;
                        mutableState9 = mutableState1014;
                        L(iK2, function45, (Function1) objRememberedValue61, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(-1415189255, true, new q5(focusRequester16, focusRequester7, mutableState91, p7Var5, function3, function2, stateCollectAsState, state4, mutableState5), composer15, 54), composer15, 1576320);
                        Composer composer110 = composer15;
                        composer110.endReplaceGroup();
                        mutableState11 = mutableState90;
                        composer13 = composer110;
                    } else {
                        if (iOrdinal == 3) {
                            composer15.startReplaceGroup(-465309248);
                            composer15.endReplaceGroup();
                            qu.f();
                            return;
                        }
                        composer15.startReplaceGroup(-1534280444);
                        int iL2 = l(mutableState89);
                        zChanged9 = composer15.changed(mutableState89);
                        objRememberedValue62 = composer15.rememberedValue();
                        if (zChanged9) {
                            objRememberedValue62 = new t1(20, mutableState89);
                            composer15.updateRememberedValue(objRememberedValue62);
                        } else {
                            objRememberedValue62 = new t1(20, mutableState89);
                            composer15.updateRememberedValue(objRememberedValue62);
                        }
                        Function1 function110 = (Function1) objRememberedValue62;
                        objRememberedValue63 = composer15.rememberedValue();
                        if (objRememberedValue63 == companion3.getEmpty()) {
                            mutableState44 = mutableState90;
                            objRememberedValue63 = new t1(21, mutableState44);
                            composer15.updateRememberedValue(objRememberedValue63);
                        } else {
                            mutableState44 = mutableState90;
                        }
                        final State state11 = state4;
                        final int i211 = 1;
                        searchInputServerManager2 = searchInputServerManager2;
                        final FocusRequester focusRequester17 = focusRequester;
                        context6 = context6;
                        final MutableState mutableState114 = mutableState5;
                        vcVar = vcVar;
                        boxScopeInstance = boxScopeInstance;
                        modifier4 = modifier4;
                        mutableState7 = mutableState7;
                        MutableState mutableState115 = mutableState8;
                        focusRequester2 = focusRequester10;
                        L(iL2, function110, (Function1) objRememberedValue63, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(-1337068166, true, new Function3() { // from class: p5
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i32 = i211;
                                MutableState mutableState116 = mutableState114;
                                State state12 = state11;
                                State state13 = stateCollectAsState;
                                Function2 function111 = function2;
                                p7 p7Var12 = p7Var5;
                                MutableState mutableState117 = mutableState91;
                                int i33 = 1;
                                switch (i32) {
                                    case 0:
                                        Composer composer111 = (Composer) obj5;
                                        int iIntValue = ((Integer) obj6).intValue();
                                        ((ColumnScope) obj4).getClass();
                                        if (composer111.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1493310344, iIntValue, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:624)");
                                            }
                                            List list6 = ((i7) state13.getValue()).a;
                                            String str8 = (String) state12.getValue();
                                            boolean zBooleanValue10 = ((Boolean) mutableState116.getValue()).booleanValue();
                                            boolean zChanged17 = composer111.changed(mutableState117);
                                            Object objRememberedValue155 = composer111.rememberedValue();
                                            if (zChanged17 || objRememberedValue155 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue155 = new t1(9, mutableState117);
                                                composer111.updateRememberedValue(objRememberedValue155);
                                            }
                                            Function1 function112 = (Function1) objRememberedValue155;
                                            boolean zChangedInstance110 = composer111.changedInstance(p7Var12) | composer111.changed(function111);
                                            Object objRememberedValue156 = composer111.rememberedValue();
                                            if (zChangedInstance110 || objRememberedValue156 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue156 = new s4(p7Var12, function111, 1);
                                                composer111.updateRememberedValue(objRememberedValue156);
                                            }
                                            f7.K(list6, str8, zBooleanValue10, focusRequester17, focusRequester8, function112, (Function3) objRememberedValue156, composer111, 27648);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer111.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer112 = (Composer) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        ((ColumnScope) obj4).getClass();
                                        if (composer112.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1337068166, iIntValue2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:674)");
                                            }
                                            List list7 = ((i7) state13.getValue()).b;
                                            String str9 = (String) state12.getValue();
                                            boolean zBooleanValue11 = ((Boolean) mutableState116.getValue()).booleanValue();
                                            boolean zChanged18 = composer112.changed(mutableState117);
                                            Object objRememberedValue157 = composer112.rememberedValue();
                                            if (zChanged18 || objRememberedValue157 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue157 = new t1(7, mutableState117);
                                                composer112.updateRememberedValue(objRememberedValue157);
                                            }
                                            Function1 function113 = (Function1) objRememberedValue157;
                                            boolean zChangedInstance20 = composer112.changedInstance(p7Var12) | composer112.changed(function111);
                                            Object objRememberedValue158 = composer112.rememberedValue();
                                            if (zChangedInstance20 || objRememberedValue158 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue158 = new a2(i33, p7Var12, function111);
                                                composer112.updateRememberedValue(objRememberedValue158);
                                            }
                                            f7.a(list7, str9, zBooleanValue11, focusRequester17, focusRequester8, function113, (Function2) objRememberedValue158, composer112, 27648);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer112.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer15, 54), composer15, 1576320);
                        Composer composer111 = composer15;
                        composer111.endReplaceGroup();
                        userPreferences = userPreferences;
                        mutableState9 = mutableState115;
                        mutableState11 = mutableState44;
                        p7Var6 = p7Var5;
                        z11 = true;
                        composer14 = composer111;
                    }
                    mutableState10 = mutableState56;
                    composer4 = composer14;
                } else {
                    final FocusRequester focusRequester18 = focusRequester;
                    MutableState mutableState116 = mutableState8;
                    focusRequester2 = focusRequester10;
                    composer15.startReplaceGroup(-1537039568);
                    int iJ2 = j(mutableState86);
                    zChanged7 = composer15.changed(mutableState86);
                    objRememberedValue58 = composer15.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue58 = new t1(15, mutableState86);
                        composer15.updateRememberedValue(objRememberedValue58);
                    } else {
                        objRememberedValue58 = new t1(15, mutableState86);
                        composer15.updateRememberedValue(objRememberedValue58);
                    }
                    Function1 function111 = (Function1) objRememberedValue58;
                    objRememberedValue59 = composer15.rememberedValue();
                    if (objRememberedValue59 == companion3.getEmpty()) {
                        objRememberedValue59 = new t1(16, mutableState90);
                        composer15.updateRememberedValue(objRememberedValue59);
                    }
                    final int i32 = 0;
                    p7Var7 = p7Var5;
                    L(iJ2, function111, (Function1) objRememberedValue59, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(-1493310344, true, new Function3() { // from class: p5
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i33 = i32;
                            MutableState mutableState117 = mutableState5;
                            State state12 = state4;
                            State state13 = stateCollectAsState;
                            Function2 function112 = function4;
                            p7 p7Var12 = p7Var5;
                            MutableState mutableState118 = mutableState91;
                            int i34 = 1;
                            switch (i33) {
                                case 0:
                                    Composer composer112 = (Composer) obj5;
                                    int iIntValue = ((Integer) obj6).intValue();
                                    ((ColumnScope) obj4).getClass();
                                    if (composer112.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1493310344, iIntValue, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:624)");
                                        }
                                        List list6 = ((i7) state13.getValue()).a;
                                        String str8 = (String) state12.getValue();
                                        boolean zBooleanValue10 = ((Boolean) mutableState117.getValue()).booleanValue();
                                        boolean zChanged17 = composer112.changed(mutableState118);
                                        Object objRememberedValue155 = composer112.rememberedValue();
                                        if (zChanged17 || objRememberedValue155 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue155 = new t1(9, mutableState118);
                                            composer112.updateRememberedValue(objRememberedValue155);
                                        }
                                        Function1 function113 = (Function1) objRememberedValue155;
                                        boolean zChangedInstance110 = composer112.changedInstance(p7Var12) | composer112.changed(function112);
                                        Object objRememberedValue156 = composer112.rememberedValue();
                                        if (zChangedInstance110 || objRememberedValue156 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue156 = new s4(p7Var12, function112, 1);
                                            composer112.updateRememberedValue(objRememberedValue156);
                                        }
                                        f7.K(list6, str8, zBooleanValue10, focusRequester18, focusRequester6, function113, (Function3) objRememberedValue156, composer112, 27648);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer112.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer113 = (Composer) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((ColumnScope) obj4).getClass();
                                    if (composer113.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1337068166, iIntValue2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:674)");
                                        }
                                        List list7 = ((i7) state13.getValue()).b;
                                        String str9 = (String) state12.getValue();
                                        boolean zBooleanValue11 = ((Boolean) mutableState117.getValue()).booleanValue();
                                        boolean zChanged18 = composer113.changed(mutableState118);
                                        Object objRememberedValue157 = composer113.rememberedValue();
                                        if (zChanged18 || objRememberedValue157 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue157 = new t1(7, mutableState118);
                                            composer113.updateRememberedValue(objRememberedValue157);
                                        }
                                        Function1 function114 = (Function1) objRememberedValue157;
                                        boolean zChangedInstance20 = composer113.changedInstance(p7Var12) | composer113.changed(function112);
                                        Object objRememberedValue158 = composer113.rememberedValue();
                                        if (zChangedInstance20 || objRememberedValue158 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue158 = new a2(i34, p7Var12, function112);
                                            composer113.updateRememberedValue(objRememberedValue158);
                                        }
                                        f7.a(list7, str9, zBooleanValue11, focusRequester18, focusRequester6, function114, (Function2) objRememberedValue158, composer113, 27648);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer113.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer15, 54), composer15, 1576320);
                    Composer composer112 = composer15;
                    composer112.endReplaceGroup();
                    mutableState11 = mutableState90;
                    mutableState9 = mutableState116;
                    composer13 = composer112;
                }
                p7Var6 = p7Var7;
                z11 = true;
                composer14 = composer13;
                mutableState10 = mutableState56;
                composer4 = composer14;
            } else {
                vcVar = vcVar;
                boxScopeInstance = boxScopeInstance;
                modifier4 = modifier4;
                context6 = context6;
                searchInputServerManager2 = searchInputServerManager2;
                FocusRequester focusRequester19 = focusRequester;
                mutableState7 = mutableState7;
                MutableState mutableState117 = mutableState8;
                focusRequester2 = focusRequester10;
                composer15.startReplaceGroup(-1539750332);
                int i33 = i(mutableState85);
                zChanged5 = composer15.changed(mutableState85);
                objRememberedValue6 = composer15.rememberedValue();
                if (zChanged5) {
                    objRememberedValue6 = new t1(13, mutableState85);
                    composer15.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new t1(13, mutableState85);
                    composer15.updateRememberedValue(objRememberedValue6);
                }
                Function1 function112 = (Function1) objRememberedValue6;
                objRememberedValue7 = composer15.rememberedValue();
                if (objRememberedValue7 == companion3.getEmpty()) {
                    c = 14;
                    objRememberedValue7 = new t1(14, mutableState90);
                    composer15.updateRememberedValue(objRememberedValue7);
                } else {
                    c = 14;
                }
                userPreferences = userPreferences;
                mutableState9 = mutableState117;
                mutableState6 = mutableState6;
                p7Var6 = p7Var5;
                focusRequester9 = focusRequester9;
                mutableState10 = mutableState56;
                mutableState11 = mutableState90;
                z11 = true;
                L(i33, function112, (Function1) objRememberedValue7, focusRequester2, ((Boolean) mutableState91.getValue()).booleanValue(), function5, ComposableLambdaKt.rememberComposableLambda(436731073, true, new h2(list2, focusRequester19, focusRequester11, focusRequester5, p7Var5, state5, aggregateSearchHistoryPreferences, userPreferences, state, function2, mutableState91, mutableState105, mutableState104, mutableState56, state4, mutableState5, mutableState2), composer15, 54), composer15, 1576320);
                Composer composer113 = composer15;
                composer113.endReplaceGroup();
                composer4 = composer113;
            }
            i3 i3Var4 = (i3) state6.getValue();
            boolean zM2 = m(mutableState11);
            boolean zBooleanValue10 = ((Boolean) mutableState48.getValue()).booleanValue() ^ z11;
            boolean zBooleanValue11 = ((Boolean) mutableState49.getValue()).booleanValue();
            zChangedInstance2 = composer4.changedInstance(p7Var6);
            objRememberedValue8 = composer4.rememberedValue();
            if (zChangedInstance2) {
                objRememberedValue8 = new d6(p7Var6);
                composer4.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new d6(p7Var6);
                composer4.updateRememberedValue(objRememberedValue8);
            }
            Function1 function113 = (Function1) ((KFunction) objRememberedValue8);
            objRememberedValue9 = composer4.rememberedValue();
            if (objRememberedValue9 == companion3.getEmpty()) {
                objRememberedValue9 = new r1(11, mutableState6);
                composer4.updateRememberedValue(objRememberedValue9);
            }
            Function0 function114 = (Function0) objRememberedValue9;
            objRememberedValue10 = composer4.rememberedValue();
            if (objRememberedValue10 == companion3.getEmpty()) {
                objRememberedValue10 = new r1(12, mutableState7);
                composer4.updateRememberedValue(objRememberedValue10);
            }
            Function0 function115 = (Function0) objRememberedValue10;
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                vcVar.getClass();
                if (((Boolean) qc.b.getValue()).booleanValue()) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            Composer composer210 = composer4;
            mutableState12 = mutableState6;
            mutableState13 = mutableState7;
            p7 p7Var12 = p7Var6;
            Modifier modifier7 = modifier4;
            y32Var2 = y32Var;
            i11 = 1;
            J(i3Var4, zM2, zBooleanValue10, zBooleanValue11, function113, function114, function115, z12, focusRequester4, focusRequester5, focusRequester6, focusRequester7, focusRequester8, focusRequester9, focusRequester2, boxScopeInstance.align(Modifier.INSTANCE, companion8.getTopCenter()), composer210, 907739136, 28086);
            composer5 = composer210;
            composer5.endNode();
            if (A(mutableState12)) {
                composer5.startReplaceGroup(684767866);
                if ((i8 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                context = context6;
                boolean zChangedInstance110 = composer5.changedInstance(list3) | z14 | composer5.changedInstance(context);
                if ((i8 & Input.Keys.FORWARD_DEL) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zChangedInstance110 | z15;
                objRememberedValue56 = composer5.rememberedValue();
                if (z16) {
                    i12 = 4;
                    mutableState43 = mutableState12;
                    f4 f4Var2 = new f4(function0, list3, context, function1, mutableState43, mutableState64);
                    function6 = function0;
                    composer5.updateRememberedValue(f4Var2);
                    objRememberedValue56 = f4Var2;
                } else {
                    i12 = 4;
                    mutableState43 = mutableState12;
                    f4 f4Var3 = new f4(function0, list3, context, function1, mutableState43, mutableState64);
                    function6 = function0;
                    composer5.updateRememberedValue(f4Var3);
                    objRememberedValue56 = f4Var3;
                }
                Function1 function116 = (Function1) objRememberedValue56;
                objRememberedValue57 = composer5.rememberedValue();
                if (objRememberedValue57 == companion3.getEmpty()) {
                    objRememberedValue57 = new r1(13, mutableState43);
                    composer5.updateRememberedValue(objRememberedValue57);
                }
                qn0.d("切换视界", list5, true, function116, (Function0) objRememberedValue57, composer5, 24966, 0);
                Composer composer211 = composer5;
                composer211.endReplaceGroup();
                composer6 = composer211;
            } else {
                function6 = function0;
                i12 = 4;
                vcVar = vcVar;
                i11 = 1;
                context = context6;
                composer5.startReplaceGroup(686754253);
                composer5.endReplaceGroup();
                composer6 = composer5;
            }
            if (((Boolean) mutableState9.getValue()).booleanValue()) {
                composer6.startReplaceGroup(686787020);
                objRememberedValue54 = composer6.rememberedValue();
                if (objRememberedValue54 == companion3.getEmpty()) {
                    mutableState42 = mutableState9;
                    i13 = 14;
                    objRememberedValue54 = new r1(14, mutableState42);
                    composer6.updateRememberedValue(objRememberedValue54);
                } else {
                    mutableState42 = mutableState9;
                    i13 = 14;
                }
                Function0 function117 = (Function0) objRememberedValue54;
                if ((i8 & 14) == i12) {
                    i20 = i11;
                } else {
                    i20 = 0;
                }
                objRememberedValue55 = composer6.rememberedValue();
                if (i20 == 0) {
                    objRememberedValue55 = new o5(function6, mutableState42, i11);
                    composer6.updateRememberedValue(objRememberedValue55);
                } else {
                    objRememberedValue55 = new o5(function6, mutableState42, i11);
                    composer6.updateRememberedValue(objRememberedValue55);
                }
                c(function117, (Function0) objRememberedValue55, composer6, 6);
                composer6.endReplaceGroup();
            } else {
                i13 = 14;
                composer6.startReplaceGroup(687003245);
                composer6.endReplaceGroup();
            }
            if (((Boolean) mutableState13.getValue()).booleanValue()) {
                composer6.startReplaceGroup(687088092);
                objRememberedValue39 = composer6.rememberedValue();
                if (objRememberedValue39 == companion3.getEmpty()) {
                    mutableState30 = mutableState13;
                    i19 = 15;
                    objRememberedValue39 = new r1(15, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue39);
                } else {
                    mutableState30 = mutableState13;
                    i19 = 15;
                }
                Function0 function118 = (Function0) objRememberedValue39;
                objRememberedValue40 = composer6.rememberedValue();
                if (objRememberedValue40 == companion3.getEmpty()) {
                    mutableState31 = mutableState87;
                    objRememberedValue40 = new d4(i13, mutableState31, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue40);
                } else {
                    mutableState31 = mutableState87;
                }
                Function0 function119 = (Function0) objRememberedValue40;
                objRememberedValue41 = composer6.rememberedValue();
                if (objRememberedValue41 == companion3.getEmpty()) {
                    mutableState32 = mutableState67;
                    objRememberedValue41 = new d4(i19, mutableState32, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue41);
                } else {
                    mutableState32 = mutableState67;
                }
                Function0 function210 = (Function0) objRememberedValue41;
                objRememberedValue42 = composer6.rememberedValue();
                if (objRememberedValue42 == companion3.getEmpty()) {
                    mutableState33 = mutableState94;
                    objRememberedValue42 = new d4(16, mutableState33, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue42);
                } else {
                    mutableState33 = mutableState94;
                }
                Function0 function211 = (Function0) objRememberedValue42;
                objRememberedValue43 = composer6.rememberedValue();
                if (objRememberedValue43 == companion3.getEmpty()) {
                    mutableState34 = mutableState96;
                    objRememberedValue43 = new d4(17, mutableState34, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue43);
                } else {
                    mutableState34 = mutableState96;
                }
                Function0 function212 = (Function0) objRememberedValue43;
                objRememberedValue44 = composer6.rememberedValue();
                if (objRememberedValue44 == companion3.getEmpty()) {
                    mutableState35 = mutableState66;
                    objRememberedValue44 = new d4(18, mutableState35, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue44);
                } else {
                    mutableState35 = mutableState66;
                }
                Function0 function213 = (Function0) objRememberedValue44;
                objRememberedValue45 = composer6.rememberedValue();
                mutableState96 = mutableState34;
                if (objRememberedValue45 == companion3.getEmpty()) {
                    mutableState36 = mutableState95;
                    objRememberedValue45 = new d4(19, mutableState36, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue45);
                } else {
                    mutableState36 = mutableState95;
                }
                Function0 function214 = (Function0) objRememberedValue45;
                objRememberedValue46 = composer6.rememberedValue();
                if (objRememberedValue46 == companion3.getEmpty()) {
                    mutableState37 = mutableState97;
                    objRememberedValue46 = new d4(20, mutableState37, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue46);
                } else {
                    mutableState37 = mutableState97;
                }
                Function0 function215 = (Function0) objRememberedValue46;
                zChanged6 = composer6.changed(vcVar);
                objRememberedValue47 = composer6.rememberedValue();
                if (zChanged6) {
                    objRememberedValue47 = new g6(vcVar, 0);
                    composer6.updateRememberedValue(objRememberedValue47);
                } else {
                    objRememberedValue47 = new g6(vcVar, 0);
                    composer6.updateRememberedValue(objRememberedValue47);
                }
                Function0 function216 = (Function0) ((KFunction) objRememberedValue47);
                objRememberedValue48 = composer6.rememberedValue();
                if (objRememberedValue48 == companion3.getEmpty()) {
                    mutableState38 = mutableState101;
                    objRememberedValue48 = new d4(21, mutableState38, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue48);
                } else {
                    mutableState38 = mutableState101;
                }
                Function0 function217 = (Function0) objRememberedValue48;
                objRememberedValue49 = composer6.rememberedValue();
                mutableState101 = mutableState38;
                if (objRememberedValue49 == companion3.getEmpty()) {
                    mutableState17 = mutableState73;
                    objRememberedValue49 = new d4(22, mutableState17, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue49);
                } else {
                    mutableState17 = mutableState73;
                }
                Function0 function218 = (Function0) objRememberedValue49;
                objRememberedValue50 = composer6.rememberedValue();
                if (objRememberedValue50 == companion3.getEmpty()) {
                    mutableState39 = mutableState102;
                    objRememberedValue50 = new d4(23, mutableState39, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue50);
                } else {
                    mutableState39 = mutableState102;
                }
                Function0 function219 = (Function0) objRememberedValue50;
                objRememberedValue51 = composer6.rememberedValue();
                if (objRememberedValue51 == companion3.getEmpty()) {
                    mutableState16 = mutableState76;
                    objRememberedValue51 = new d4(24, mutableState16, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue51);
                } else {
                    mutableState16 = mutableState76;
                }
                Function0 function310 = (Function0) objRememberedValue51;
                objRememberedValue52 = composer6.rememberedValue();
                if (objRememberedValue52 == companion3.getEmpty()) {
                    mutableState98 = mutableState98;
                    objRememberedValue52 = new d4(25, mutableState98, mutableState30);
                    composer6.updateRememberedValue(objRememberedValue52);
                } else {
                    mutableState98 = mutableState98;
                }
                Function0 function311 = (Function0) objRememberedValue52;
                zChangedInstance13 = composer6.changedInstance(context);
                objRememberedValue53 = composer6.rememberedValue();
                if (zChangedInstance13) {
                    mutableState40 = mutableState99;
                    mutableState41 = mutableState100;
                    objRememberedValue53 = new s5(context, mutableState40, mutableState41, 0);
                    composer6.updateRememberedValue(objRememberedValue53);
                } else {
                    mutableState40 = mutableState99;
                    mutableState41 = mutableState100;
                    objRememberedValue53 = new s5(context, mutableState40, mutableState41, 0);
                    composer6.updateRememberedValue(objRememberedValue53);
                }
                mutableState100 = mutableState41;
                mutableState67 = mutableState32;
                mutableState97 = mutableState37;
                mutableState99 = mutableState40;
                mutableState87 = mutableState31;
                Composer composer212 = composer6;
                mutableState95 = mutableState36;
                mutableState15 = mutableState30;
                mutableState102 = mutableState39;
                mutableState94 = mutableState33;
                mutableState14 = mutableState35;
                kz1.b(function118, function119, function210, function211, function212, function213, function214, function215, false, function216, function217, function218, function219, function310, function311, (Function0) objRememberedValue53, composer212, 14380470, 28086);
                Composer composer213 = composer212;
                composer213.endReplaceGroup();
                composer7 = composer213;
            } else {
                mutableState14 = mutableState66;
                mutableState15 = mutableState13;
                mutableState16 = mutableState76;
                mutableState17 = mutableState73;
                composer6.startReplaceGroup(688857293);
                composer6.endReplaceGroup();
                composer7 = composer6;
            }
            if (((Boolean) mutableState87.getValue()).booleanValue()) {
                composer7.startReplaceGroup(688899050);
                objRememberedValue38 = composer7.rememberedValue();
                if (objRememberedValue38 == companion3.getEmpty()) {
                    objRememberedValue38 = new d4(26, mutableState87, mutableState15);
                    composer7.updateRememberedValue(objRememberedValue38);
                }
                b00.a((Function0) objRememberedValue38, true, null, composer7, 54, 4);
                composer7.endReplaceGroup();
            } else {
                composer7.startReplaceGroup(689055693);
                composer7.endReplaceGroup();
            }
            if (((Boolean) mutableState14.getValue()).booleanValue()) {
                composer7.startReplaceGroup(689093265);
                objRememberedValue37 = composer7.rememberedValue();
                if (objRememberedValue37 == companion3.getEmpty()) {
                    objRememberedValue37 = new d4(27, mutableState14, mutableState15);
                    composer7.updateRememberedValue(objRememberedValue37);
                }
                i14 = 6;
                zb0.b((Function0) objRememberedValue37, composer7, 6);
                composer7.endReplaceGroup();
            } else {
                i14 = 6;
                composer7.startReplaceGroup(689212429);
                composer7.endReplaceGroup();
            }
            if (((Boolean) mutableState101.getValue()).booleanValue()) {
                composer7.startReplaceGroup(689267020);
                objRememberedValue35 = composer7.rememberedValue();
                if (objRememberedValue35 == companion3.getEmpty()) {
                    objRememberedValue35 = new d4(28, mutableState101, mutableState15);
                    composer7.updateRememberedValue(objRememberedValue35);
                }
                Function0 function312 = (Function0) objRememberedValue35;
                userPreferences2 = userPreferences;
                context2 = context;
                zChangedInstance12 = composer7.changedInstance(userPreferences2) | composer7.changedInstance(context2);
                objRememberedValue36 = composer7.rememberedValue();
                if (zChangedInstance12) {
                    mutableState18 = mutableState59;
                    i15 = 0;
                    objRememberedValue36 = new t5(userPreferences2, context2, mutableState18, 0);
                    composer7.updateRememberedValue(objRememberedValue36);
                } else {
                    mutableState18 = mutableState59;
                    i15 = 0;
                    objRememberedValue36 = new t5(userPreferences2, context2, mutableState18, 0);
                    composer7.updateRememberedValue(objRememberedValue36);
                }
                q41.a(function312, (Function0) objRememberedValue36, composer7, i14);
                composer7.endReplaceGroup();
            } else {
                userPreferences2 = userPreferences;
                mutableState18 = mutableState59;
                context2 = context;
                i15 = 0;
                composer7.startReplaceGroup(689852269);
                composer7.endReplaceGroup();
            }
            if (((Boolean) mutableState94.getValue()).booleanValue()) {
                composer7.startReplaceGroup(689890988);
                objRememberedValue34 = composer7.rememberedValue();
                if (objRememberedValue34 == companion3.getEmpty()) {
                    objRememberedValue34 = new d4(i15, mutableState94, mutableState15);
                    composer7.updateRememberedValue(objRememberedValue34);
                }
                v72.f((Function0) objRememberedValue34, composer7, i14);
                composer7.endReplaceGroup();
            } else {
                composer7.startReplaceGroup(690014957);
                composer7.endReplaceGroup();
            }
            if (((Boolean) mutableState67.getValue()).booleanValue()) {
                composer7.startReplaceGroup(690170360);
                boolean zBooleanValue12 = ((Boolean) mutableState46.getValue()).booleanValue();
                boolean zF2 = f(mutableState47);
                boolean zBooleanValue13 = ((Boolean) mutableState48.getValue()).booleanValue();
                boolean zBooleanValue14 = ((Boolean) mutableState49.getValue()).booleanValue();
                mutableState19 = mutableState18;
                boolean zT2 = t(mutableState50);
                boolean zU2 = u(mutableState51);
                boolean zV2 = v(mutableState52);
                Context context8 = context2;
                boolean zW2 = w(mutableState53);
                boolean zBooleanValue15 = ((Boolean) mutableState54.getValue()).booleanValue();
                boolean zX2 = x(mutableState55);
                boolean zY2 = y(mutableState57);
                boolean zBooleanValue16 = ((Boolean) mutableState3.getValue()).booleanValue();
                boolean z111 = z(mutableState60);
                boolean zBooleanValue17 = ((Boolean) mutableState19.getValue()).booleanValue();
                objRememberedValue32 = composer7.rememberedValue();
                if (objRememberedValue32 == companion3.getEmpty()) {
                    mutableState28 = mutableState67;
                    objRememberedValue32 = new d4(1, mutableState28, mutableState15);
                    composer7.updateRememberedValue(objRememberedValue32);
                } else {
                    mutableState28 = mutableState67;
                }
                Function0 function313 = (Function0) objRememberedValue32;
                zChangedInstance11 = composer7.changedInstance(userPreferences2);
                objRememberedValue33 = composer7.rememberedValue();
                mutableState29 = mutableState15;
                if (zChangedInstance11) {
                    UserPreferences userPreferences8 = userPreferences2;
                    objRememberedValue33 = new e4(userPreferences8, mutableState46, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState53, mutableState54, mutableState55, mutableState57, mutableState3, mutableState60, mutableState28, mutableState29, 0);
                    userPreferences5 = userPreferences8;
                    mutableState3 = mutableState3;
                    mutableState60 = mutableState60;
                    mutableState57 = mutableState57;
                    composer7.updateRememberedValue(objRememberedValue33);
                } else {
                    UserPreferences userPreferences9 = userPreferences2;
                    objRememberedValue33 = new e4(userPreferences9, mutableState46, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState53, mutableState54, mutableState55, mutableState57, mutableState3, mutableState60, mutableState28, mutableState29, 0);
                    userPreferences5 = userPreferences9;
                    mutableState3 = mutableState3;
                    mutableState60 = mutableState60;
                    mutableState57 = mutableState57;
                    composer7.updateRememberedValue(objRememberedValue33);
                }
                userPreferences3 = userPreferences5;
                Composer composer214 = composer7;
                mutableState15 = mutableState29;
                context3 = context8;
                qu0.a(zBooleanValue12, zF2, zBooleanValue13, zBooleanValue14, zT2, zU2, zV2, zW2, zBooleanValue15, zX2, zY2, zBooleanValue16, z111, zBooleanValue17, function313, (Function13) objRememberedValue33, composer214, 0, 24576);
                Composer composer215 = composer214;
                composer215.endReplaceGroup();
                composer8 = composer215;
            } else {
                mutableState19 = mutableState18;
                context3 = context2;
                userPreferences3 = userPreferences2;
                composer7.startReplaceGroup(693788525);
                composer7.endReplaceGroup();
                composer8 = composer7;
            }
            if (((Boolean) mutableState96.getValue()).booleanValue()) {
                composer8.startReplaceGroup(693841070);
                String qrNetworkInterfaceName2 = userPreferences3.getQrNetworkInterfaceName();
                objRememberedValue30 = composer8.rememberedValue();
                if (objRememberedValue30 == companion3.getEmpty()) {
                    mutableState27 = mutableState96;
                    objRememberedValue30 = new d4(2, mutableState27, mutableState15);
                    composer8.updateRememberedValue(objRememberedValue30);
                } else {
                    mutableState27 = mutableState96;
                }
                Function0 function314 = (Function0) objRememberedValue30;
                userPreferences4 = userPreferences3;
                searchInputServerManager3 = searchInputServerManager2;
                zChangedInstance10 = composer8.changedInstance(userPreferences4) | composer8.changedInstance(searchInputServerManager3);
                objRememberedValue31 = composer8.rememberedValue();
                if (zChangedInstance10) {
                    objRememberedValue31 = new f4(userPreferences4, searchInputServerManager3, mutableState104, mutableState105, mutableState27, mutableState15, 0);
                    composer8.updateRememberedValue(objRememberedValue31);
                } else {
                    objRememberedValue31 = new f4(userPreferences4, searchInputServerManager3, mutableState104, mutableState105, mutableState27, mutableState15, 0);
                    composer8.updateRememberedValue(objRememberedValue31);
                }
                xr1.b(qrNetworkInterfaceName2, function314, (Function1) objRememberedValue31, composer8, 48);
                composer8.endReplaceGroup();
            } else {
                userPreferences4 = userPreferences3;
                searchInputServerManager3 = searchInputServerManager2;
                composer8.startReplaceGroup(694270637);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState97.getValue()).booleanValue()) {
                composer8.startReplaceGroup(694310410);
                objRememberedValue29 = composer8.rememberedValue();
                if (objRememberedValue29 == companion3.getEmpty()) {
                    objRememberedValue29 = new d4(3, mutableState97, mutableState15);
                    composer8.updateRememberedValue(objRememberedValue29);
                }
                i16 = 6;
                wm.a((Function0) objRememberedValue29, composer8, 6);
                composer8.endReplaceGroup();
            } else {
                i16 = 6;
                composer8.startReplaceGroup(694436301);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState17.getValue()).booleanValue()) {
                composer8.startReplaceGroup(694487544);
                List listO2 = o(stateCollectAsState6);
                String strP2 = p(stateCollectAsState7);
                objRememberedValue25 = composer8.rememberedValue();
                if (objRememberedValue25 == companion3.getEmpty()) {
                    mutableState20 = mutableState17;
                    mutableState21 = mutableState74;
                    objRememberedValue25 = new d4(4, mutableState21, mutableState20);
                    composer8.updateRememberedValue(objRememberedValue25);
                } else {
                    mutableState20 = mutableState17;
                    mutableState21 = mutableState74;
                }
                Function0 function315 = (Function0) objRememberedValue25;
                zChangedInstance8 = composer8.changedInstance(coroutineScope2) | composer8.changedInstance(y32Var2);
                objRememberedValue26 = composer8.rememberedValue();
                if (zChangedInstance8) {
                    objRememberedValue26 = new g4(coroutineScope2, y32Var2, 0);
                    composer8.updateRememberedValue(objRememberedValue26);
                } else {
                    objRememberedValue26 = new g4(coroutineScope2, y32Var2, 0);
                    composer8.updateRememberedValue(objRememberedValue26);
                }
                Function1 function316 = (Function1) objRememberedValue26;
                zChangedInstance9 = composer8.changedInstance(coroutineScope2) | composer8.changedInstance(y32Var2);
                objRememberedValue27 = composer8.rememberedValue();
                if (zChangedInstance9) {
                    objRememberedValue27 = new g4(coroutineScope2, y32Var2, 1);
                    composer8.updateRememberedValue(objRememberedValue27);
                } else {
                    objRememberedValue27 = new g4(coroutineScope2, y32Var2, 1);
                    composer8.updateRememberedValue(objRememberedValue27);
                }
                Function1 function317 = (Function1) objRememberedValue27;
                objRememberedValue28 = composer8.rememberedValue();
                if (objRememberedValue28 == companion3.getEmpty()) {
                    objRememberedValue28 = new d4(5, mutableState20, mutableState15);
                    composer8.updateRememberedValue(objRememberedValue28);
                }
                coroutineScope = coroutineScope2;
                i17 = 0;
                q32.d(listO2, strP2, function315, function316, function317, (Function0) objRememberedValue28, composer8, 196992);
                composer8.endReplaceGroup();
            } else {
                mutableState20 = mutableState17;
                coroutineScope = coroutineScope2;
                mutableState21 = mutableState74;
                i17 = 0;
                composer8.startReplaceGroup(695061261);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState95.getValue()).booleanValue()) {
                composer8.startReplaceGroup(695103576);
                ProxyConfig proxyConfigN2 = n(stateCollectAsState5);
                objRememberedValue23 = composer8.rememberedValue();
                if (objRememberedValue23 == companion3.getEmpty()) {
                    mutableState26 = mutableState95;
                    objRememberedValue23 = new d4(i16, mutableState26, mutableState15);
                    composer8.updateRememberedValue(objRememberedValue23);
                } else {
                    mutableState26 = mutableState95;
                }
                Function0 function318 = (Function0) objRememberedValue23;
                context4 = context3;
                zChangedInstance7 = composer8.changedInstance(coroutineScope) | composer8.changedInstance(proxySettings) | composer8.changedInstance(context4);
                objRememberedValue24 = composer8.rememberedValue();
                if (zChangedInstance7) {
                    objRememberedValue24 = new i4(coroutineScope, proxySettings, context4, mutableState26, mutableState15, 0);
                    composer8.updateRememberedValue(objRememberedValue24);
                } else {
                    objRememberedValue24 = new i4(coroutineScope, proxySettings, context4, mutableState26, mutableState15, 0);
                    composer8.updateRememberedValue(objRememberedValue24);
                }
                gr1.c(proxyConfigN2, proxyConfigServerManager, function318, (Function1) objRememberedValue24, composer8, RendererCapabilities.DECODER_SUPPORT_MASK);
                composer8.endReplaceGroup();
            } else {
                composer8.startReplaceGroup(695585037);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState21.getValue()).booleanValue()) {
                composer8.startReplaceGroup(695625616);
                String str8 = (String) mutableState80.getValue();
                String str9 = (String) mutableState80.getValue();
                if (str9 != null) {
                }
                boolean zBooleanValue18 = ((Boolean) mutableState81.getValue()).booleanValue();
                objRememberedValue22 = composer8.rememberedValue();
                if (objRememberedValue22 == companion3.getEmpty()) {
                    c2 = 7;
                    objRememberedValue22 = new d4(7, mutableState21, mutableState20);
                    composer8.updateRememberedValue(objRememberedValue22);
                } else {
                    c2 = 7;
                }
                e42.a(str8, z20, zBooleanValue18, (Function0) objRememberedValue22, composer8, 3072);
                composer8.endReplaceGroup();
            } else {
                c2 = 7;
                composer8.startReplaceGroup(695899501);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState102.getValue()).booleanValue()) {
                composer8.startReplaceGroup(695954805);
                t91 t91VarQ2 = q(stateCollectAsState8);
                objRememberedValue20 = composer8.rememberedValue();
                if (objRememberedValue20 == companion3.getEmpty()) {
                    mutableState25 = mutableState102;
                    objRememberedValue20 = new d4(8, mutableState25, mutableState15);
                    composer8.updateRememberedValue(objRememberedValue20);
                } else {
                    mutableState25 = mutableState102;
                }
                Function0 function319 = (Function0) objRememberedValue20;
                zChangedInstance6 = composer8.changedInstance(sa1Var);
                objRememberedValue21 = composer8.rememberedValue();
                if (zChangedInstance6) {
                    objRememberedValue21 = new j4(sa1Var, mutableState25, mutableState15, i17);
                    composer8.updateRememberedValue(objRememberedValue21);
                } else {
                    objRememberedValue21 = new j4(sa1Var, mutableState25, mutableState15, i17);
                    composer8.updateRememberedValue(objRememberedValue21);
                }
                y91.c(t91VarQ2, onlineSubtitleConfigServerManager, function319, (Function1) objRememberedValue21, composer8, RendererCapabilities.DECODER_SUPPORT_MASK);
                composer8.endReplaceGroup();
            } else {
                composer8.startReplaceGroup(696377645);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState16.getValue()).booleanValue()) {
                composer8.startReplaceGroup(696423339);
                ye2 ye2VarR2 = r(stateCollectAsState9);
                objRememberedValue17 = composer8.rememberedValue();
                if (objRememberedValue17 == companion3.getEmpty()) {
                    objRememberedValue17 = new d4(9, mutableState16, mutableState15);
                    composer8.updateRememberedValue(objRememberedValue17);
                }
                Function0 function46 = (Function0) objRememberedValue17;
                zChangedInstance4 = composer8.changedInstance(qf2Var);
                objRememberedValue18 = composer8.rememberedValue();
                if (zChangedInstance4) {
                    objRememberedValue18 = new k4(qf2Var, i17);
                    composer8.updateRememberedValue(objRememberedValue18);
                } else {
                    objRememberedValue18 = new k4(qf2Var, i17);
                    composer8.updateRememberedValue(objRememberedValue18);
                }
                Function1 function47 = (Function1) objRememberedValue18;
                zChangedInstance5 = composer8.changedInstance(userPreferences4) | composer8.changedInstance(searchInputServerManager3);
                objRememberedValue19 = composer8.rememberedValue();
                if (zChangedInstance5) {
                    objRememberedValue19 = new n6(userPreferences4, mutableState46, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState53, mutableState54, mutableState55, mutableState10, mutableState57, mutableState3, mutableState19, mutableState60, searchInputServerManager3, mutableState104, mutableState105, mutableState45);
                    composer8.updateRememberedValue(objRememberedValue19);
                } else {
                    objRememberedValue19 = new n6(userPreferences4, mutableState46, mutableState47, mutableState48, mutableState49, mutableState50, mutableState51, mutableState52, mutableState53, mutableState54, mutableState55, mutableState10, mutableState57, mutableState3, mutableState19, mutableState60, searchInputServerManager3, mutableState104, mutableState105, mutableState45);
                    composer8.updateRememberedValue(objRememberedValue19);
                }
                ef2.f(ye2VarR2, pf2Var, webDavSyncConfigServerManager, function46, function47, (Function1) ((KFunction) objRememberedValue19), composer8, 3072);
                composer8.endReplaceGroup();
            } else {
                composer8.startReplaceGroup(696855789);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState98.getValue()).booleanValue()) {
                composer8.startReplaceGroup(696896058);
                i92 i92VarS2 = s(stateCollectAsState10);
                objRememberedValue15 = composer8.rememberedValue();
                if (objRememberedValue15 == companion3.getEmpty()) {
                    objRememberedValue15 = new d4(10, mutableState98, mutableState15);
                    composer8.updateRememberedValue(objRememberedValue15);
                }
                Function0 function48 = (Function0) objRememberedValue15;
                zChangedInstance3 = composer8.changedInstance(ab2Var);
                objRememberedValue16 = composer8.rememberedValue();
                if (zChangedInstance3) {
                    objRememberedValue16 = new l4(ab2Var, i17);
                    composer8.updateRememberedValue(objRememberedValue16);
                } else {
                    objRememberedValue16 = new l4(ab2Var, i17);
                    composer8.updateRememberedValue(objRememberedValue16);
                }
                hb2.b(i92VarS2, xa2Var, function48, (Function1) objRememberedValue16, composer8, RendererCapabilities.DECODER_SUPPORT_MASK);
                composer8.endReplaceGroup();
            } else {
                composer8.startReplaceGroup(697191085);
                composer8.endReplaceGroup();
            }
            if (((Boolean) mutableState99.getValue()).booleanValue()) {
                composer8.startReplaceGroup(697225340);
                objRememberedValue14 = composer8.rememberedValue();
                if (objRememberedValue14 == companion3.getEmpty()) {
                    c3 = 4;
                    objRememberedValue14 = new b1(4);
                    composer8.updateRememberedValue(objRememberedValue14);
                } else {
                    c3 = 4;
                }
                Composer composer216 = composer8;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue14, ss.e(), null, null, null, ss.c(), ss.g(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer216, 1769526, 0, 16284);
                Composer composer217 = composer216;
                composer217.endReplaceGroup();
                composer9 = composer217;
            } else {
                composer8.startReplaceGroup(697610701);
                composer8.endReplaceGroup();
                composer9 = composer8;
            }
            if (((Boolean) mutableState100.getValue()).booleanValue()) {
                composer9.startReplaceGroup(697658565);
                objRememberedValue13 = composer9.rememberedValue();
                if (objRememberedValue13 == companion3.getEmpty()) {
                    mutableState24 = mutableState100;
                    objRememberedValue13 = new d4(12, mutableState24, mutableState15);
                    composer9.updateRememberedValue(objRememberedValue13);
                } else {
                    mutableState24 = mutableState100;
                }
                Composer composer218 = composer9;
                i18 = 0;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue13, ComposableLambdaKt.rememberComposableLambda(-957047835, true, new m4(0, mutableState24, mutableState15), composer9, 54), null, null, null, ss.d(), ss.b(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer218, 1769526, 0, 16284);
                Composer composer219 = composer218;
                composer219.endReplaceGroup();
                composer10 = composer219;
            } else {
                i18 = 0;
                composer9.startReplaceGroup(698066029);
                composer9.endReplaceGroup();
                composer10 = composer9;
            }
            bd.a(vcVar, composer10, i18);
            if (((String) mutableState82.getValue()) != null) {
                composer10.startReplaceGroup(698159091);
                objRememberedValue12 = composer10.rememberedValue();
                if (objRememberedValue12 == companion3.getEmpty()) {
                    mutableState23 = mutableState82;
                    objRememberedValue12 = new r1(6, mutableState23);
                    composer10.updateRememberedValue(objRememberedValue12);
                } else {
                    mutableState23 = mutableState82;
                }
                Composer composer34 = composer10;
                z13 = true;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue12, ComposableLambdaKt.rememberComposableLambda(754230532, true, new b2(3, mutableState23), composer10, 54), null, null, null, ss.a(), ComposableLambdaKt.rememberComposableLambda(1058623839, true, new b2(4, mutableState23), composer10, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer34, 1769526, 0, 16284);
                Composer composer35 = composer34;
                composer35.endReplaceGroup();
                composer11 = composer35;
            } else {
                z13 = true;
                composer10.startReplaceGroup(698522349);
                composer10.endReplaceGroup();
                composer11 = composer10;
            }
            if (((String) mutableState83.getValue()) != null) {
                composer11.startReplaceGroup(698568632);
                objRememberedValue11 = composer11.rememberedValue();
                if (objRememberedValue11 == companion3.getEmpty()) {
                    mutableState22 = mutableState83;
                    objRememberedValue11 = new r1(7, mutableState22);
                    composer11.updateRememberedValue(objRememberedValue11);
                } else {
                    mutableState22 = mutableState83;
                }
                Composer composer36 = composer11;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue11, ComposableLambdaKt.rememberComposableLambda(-252351058, z13, new b2(5, mutableState22), composer11, 54), null, null, null, ss.f(), ComposableLambdaKt.rememberComposableLambda(52042249, z13, new b2(6, mutableState22), composer11, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer36, 1769526, 0, 16284);
                Composer composer37 = composer36;
                composer37.endReplaceGroup();
                composer12 = composer37;
            } else {
                composer11.startReplaceGroup(698927085);
                composer11.endReplaceGroup();
                composer12 = composer11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            p7Var2 = p7Var12;
            modifier2 = modifier7;
            z4 = z110;
            composer2 = composer12;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z;
            z4 = z2;
            modifier2 = modifier;
            p7Var2 = p7Var;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new n4(function0, function1, str, function2, function3, function4, z3, z4, modifier2, p7Var2, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final h7 g(State state) {
        return (h7) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean h(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int i(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int j(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int k(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int l(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean m(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final ProxyConfig n(State state) {
        return (ProxyConfig) state.getValue();
    }

    public static final List o(State state) {
        return (List) state.getValue();
    }

    public static final String p(State state) {
        return (String) state.getValue();
    }

    public static final t91 q(State state) {
        return (t91) state.getValue();
    }

    public static final ye2 r(State state) {
        return (ye2) state.getValue();
    }

    public static final i92 s(State state) {
        return (i92) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean t(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean v(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean w(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean x(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean y(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean z(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
