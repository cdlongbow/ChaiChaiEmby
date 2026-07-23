package defpackage;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.UserData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pv1 implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ io b;
    public final /* synthetic */ float c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ FocusRequester h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ ScrollableState j;

    public /* synthetic */ pv1(io ioVar, float f, LazyGridState lazyGridState, MutableState mutableState, Function1 function1, MutableState mutableState2, MutableState mutableState3, FocusRequester focusRequester) {
        this.b = ioVar;
        this.c = f;
        this.j = lazyGridState;
        this.d = mutableState;
        this.i = function1;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = focusRequester;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0343  */
    /* JADX WARN: Code duplicated, block: B:107:0x034f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0353  */
    /* JADX WARN: Code duplicated, block: B:111:0x037e  */
    /* JADX WARN: Code duplicated, block: B:116:0x038e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0393  */
    /* JADX WARN: Code duplicated, block: B:120:0x0398  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0272  */
    /* JADX WARN: Code duplicated, block: B:65:0x0278  */
    /* JADX WARN: Code duplicated, block: B:68:0x0280  */
    /* JADX WARN: Code duplicated, block: B:70:0x0284  */
    /* JADX WARN: Code duplicated, block: B:71:0x028c  */
    /* JADX WARN: Code duplicated, block: B:75:0x029b  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02be  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:90:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ed  */
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
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        MutableState mutableState;
        String imageUrl;
        Integer productionYear;
        String premiereDate;
        String strSubstring;
        String type;
        Integer childCount;
        UserData userData;
        Integer num;
        UserData userData2;
        boolean zBooleanValue;
        MutableState mutableState2;
        boolean z;
        Function0<ComposeUiNode> constructor;
        FocusRequester focusRequester;
        Function1 function1;
        boolean zChanged;
        Object objRememberedValue;
        UserData userData3;
        UserData userData4;
        String strValueOf;
        String primary;
        int i = this.a;
        int i2 = 0;
        float f2 = this.c;
        ScrollableState scrollableState = this.j;
        io ioVar = this.b;
        switch (i) {
            case 0:
                LazyGridState lazyGridState = (LazyGridState) scrollableState;
                BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                boxWithConstraintsScope.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.changed(boxWithConstraintsScope) ? 4 : 2;
                }
                if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(499393140, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.SearchPage.<anonymous>.<anonymous> (SearchPage.kt:215)");
                    }
                    tv1 tv1VarC = sv1.c(boxWithConstraintsScope.mo734getMaxWidthD9Ej5fM(), ioVar.c);
                    GridCells.Fixed fixed = new GridCells.Fixed(tv1VarC.a);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(tv1VarC.c);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f));
                    float f3 = tv1VarC.b;
                    PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(f3, f2, f3, Dp.m7813constructorimpl(Dp.m7813constructorimpl(24.0f) + ioVar.f));
                    MutableState mutableState3 = this.d;
                    boolean zChanged2 = composer.changed(mutableState3) | composer.changed(tv1VarC);
                    Function1 function2 = this.i;
                    boolean zChanged3 = zChanged2 | composer.changed(function2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new f4(this.e, tv1VarC, this.g, mutableState3, this.h, function2);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed, null, lazyGridState, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_5, horizontalOrVerticalM712spacedBy0680j_4, null, false, null, (Function1) objRememberedValue2, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 914);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                float f4 = ioVar.c;
                ScrollState scrollState = (ScrollState) scrollableState;
                BoxWithConstraintsScope boxWithConstraintsScope2 = (BoxWithConstraintsScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                boxWithConstraintsScope2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer2.changed(boxWithConstraintsScope2) ? 4 : 2;
                }
                if (composer2.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1717711179, iIntValue2, -1, "com.dh.myembyapp.ui.screens.home.SearchPage.<anonymous>.<anonymous> (SearchPage.kt:321)");
                    }
                    tv1 tv1VarC2 = sv1.c(boxWithConstraintsScope2.mo734getMaxWidthD9Ej5fM(), f4);
                    float f5 = tv1VarC2.c;
                    float f6 = tv1VarC2.b;
                    int i3 = tv1VarC2.a;
                    float fM7827unboximpl = ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(boxWithConstraintsScope2.mo734getMaxWidthD9Ej5fM() - Dp.m7813constructorimpl(2.0f * f6)) - Dp.m7813constructorimpl((i3 - 1) * f5))), Dp.m7811boximpl(Dp.m7813constructorimpl(0.0f)))).m7827unboximpl() / i3)), Dp.m7811boximpl(f4))).m7827unboximpl();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1002paddingqDBjuR0 = PaddingKt.m1002paddingqDBjuR0(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), scrollState, false, null, false, 14, null), f6, f2, f6, Dp.m7813constructorimpl(Dp.m7813constructorimpl(16.0f) + ioVar.f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    char c = ' ';
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1002paddingqDBjuR0);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer2);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("推荐观看", PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null), materialTheme.getColorScheme(composer2, i5).getOnBackground(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i5).getTitleLarge(), composer2, 54, 0, 131064);
                    composer2.startReplaceGroup(1270050635);
                    MutableState mutableState4 = this.d;
                    int i6 = 0;
                    for (Object obj4 : CollectionsKt___CollectionsKt.chunked((List) mutableState4.getValue(), i3)) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        List list = (List) obj4;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = Arrangement.INSTANCE.m712spacedBy0680j_4(f5);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        char c2 = c;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_6, Alignment.INSTANCE.getTop(), composer2, i2);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i2);
                        int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c2));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(-1380343943);
                        int i9 = 0;
                        for (Object obj5 : list) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            MediaItem mediaItem = (MediaItem) obj5;
                            int i11 = (i6 * i3) + i9;
                            ImageTags imageTags = mediaItem.getImageTags();
                            if (imageTags == null || (primary = imageTags.getPrimary()) == null) {
                                f = f5;
                                mutableState = mutableState4;
                            } else {
                                f = f5;
                                mutableState = mutableState4;
                                imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320);
                                if (imageUrl == null) {
                                }
                                String str = imageUrl;
                                productionYear = mediaItem.getProductionYear();
                                if (productionYear != null || (strValueOf = String.valueOf(productionYear.intValue())) == null) {
                                    premiereDate = mediaItem.getPremiereDate();
                                    if (premiereDate != null) {
                                        if (premiereDate.length() < 4) {
                                            premiereDate = null;
                                        }
                                        if (premiereDate != null) {
                                            strSubstring = premiereDate.substring(0, 4);
                                        }
                                    }
                                    strSubstring = null;
                                } else {
                                    strSubstring = strValueOf;
                                }
                                type = mediaItem.getType();
                                if (Intrinsics.areEqual(type, "Series")) {
                                    userData4 = mediaItem.getUserData();
                                    if (userData4 != null || (childCount = userData4.getUnplayedItemCount()) == null) {
                                        childCount = mediaItem.getChildCount();
                                    }
                                } else {
                                    if (Intrinsics.areEqual(type, "Season")) {
                                        childCount = mediaItem.getChildCount();
                                        if (childCount == null) {
                                            userData2 = mediaItem.getUserData();
                                            if (userData2 != null) {
                                                childCount = userData2.getUnplayedItemCount();
                                            } else {
                                                num = null;
                                            }
                                        }
                                    } else {
                                        childCount = mediaItem.getChildCount();
                                        if (childCount == null) {
                                            userData = mediaItem.getUserData();
                                            if (userData != null) {
                                                childCount = userData.getUnplayedItemCount();
                                            } else {
                                                num = null;
                                            }
                                        }
                                    }
                                    zBooleanValue = ((Boolean) this.e.getValue()).booleanValue();
                                    mutableState2 = this.g;
                                    if (zBooleanValue || !Intrinsics.areEqual(mediaItem.getId(), (String) mutableState2.getValue())) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    Modifier modifierD = sv1.d(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7827unboximpl), i11, ((List) mutableState.getValue()).size(), i3);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                    int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c2));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierD);
                                    float f7 = fM7827unboximpl;
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    int i13 = i3;
                                    constructor = companion5.getConstructor();
                                    if (composer2.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer2);
                                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i12), composerM4318constructorimpl3));
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    String name = mediaItem.getName();
                                    Float communityRating = mediaItem.getCommunityRating();
                                    if (!Intrinsics.areEqual(mediaItem.getType(), "Movie") && (userData3 = mediaItem.getUserData()) != null) {
                                        boolean z2 = userData3.getPlayed();
                                        if (z) {
                                            focusRequester = this.h;
                                        } else {
                                            focusRequester = null;
                                        }
                                        boolean zChanged4 = composer2.changed(mutableState2) | composer2.changedInstance(mediaItem);
                                        function1 = this.i;
                                        zChanged = zChanged4 | composer2.changed(function1);
                                        objRememberedValue = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                            composer2.updateRememberedValue(objRememberedValue);
                                        }
                                        a41.e(name, str, (Function0) objRememberedValue, null, strSubstring, num, focusRequester, false, true, communityRating, z2, null, 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 520584);
                                        composer2.endNode();
                                        f5 = f;
                                        mutableState4 = mutableState;
                                        i9 = i10;
                                        fM7827unboximpl = f7;
                                        i3 = i13;
                                    }
                                    if (z) {
                                        focusRequester = this.h;
                                    } else {
                                        focusRequester = null;
                                    }
                                    boolean zChanged5 = composer2.changed(mutableState2) | composer2.changedInstance(mediaItem);
                                    function1 = this.i;
                                    zChanged = zChanged5 | composer2.changed(function1);
                                    objRememberedValue = composer2.rememberedValue();
                                    if (zChanged) {
                                        objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                        composer2.updateRememberedValue(objRememberedValue);
                                    } else {
                                        objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    a41.e(name, str, (Function0) objRememberedValue, null, strSubstring, num, focusRequester, false, true, communityRating, z2, null, 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 520584);
                                    composer2.endNode();
                                    f5 = f;
                                    mutableState4 = mutableState;
                                    i9 = i10;
                                    fM7827unboximpl = f7;
                                    i3 = i13;
                                }
                                num = childCount;
                                zBooleanValue = ((Boolean) this.e.getValue()).booleanValue();
                                mutableState2 = this.g;
                                if (zBooleanValue) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                Modifier modifierD2 = sv1.d(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7827unboximpl), i11, ((List) mutableState.getValue()).size(), i3);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i14 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> c2));
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierD2);
                                float f8 = fM7827unboximpl;
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                int i15 = i3;
                                constructor = companion6.getConstructor();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer2);
                                mr.z(companion6, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i14), composerM4318constructorimpl4));
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                String name2 = mediaItem.getName();
                                Float communityRating2 = mediaItem.getCommunityRating();
                                if (!Intrinsics.areEqual(mediaItem.getType(), "Movie")) {
                                }
                                if (z) {
                                    focusRequester = this.h;
                                } else {
                                    focusRequester = null;
                                }
                                boolean zChanged6 = composer2.changed(mutableState2) | composer2.changedInstance(mediaItem);
                                function1 = this.i;
                                zChanged = zChanged6 | composer2.changed(function1);
                                objRememberedValue = composer2.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                    composer2.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                a41.e(name2, str, (Function0) objRememberedValue, null, strSubstring, num, focusRequester, false, true, communityRating2, z2, null, 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 520584);
                                composer2.endNode();
                                f5 = f;
                                mutableState4 = mutableState;
                                i9 = i10;
                                fM7827unboximpl = f8;
                                i3 = i15;
                            }
                            imageUrl = "";
                            String str2 = imageUrl;
                            productionYear = mediaItem.getProductionYear();
                            if (productionYear != null) {
                                premiereDate = mediaItem.getPremiereDate();
                                if (premiereDate != null) {
                                    if (premiereDate.length() < 4) {
                                        premiereDate = null;
                                    }
                                    if (premiereDate != null) {
                                        strSubstring = premiereDate.substring(0, 4);
                                    }
                                }
                                strSubstring = null;
                            } else {
                                premiereDate = mediaItem.getPremiereDate();
                                if (premiereDate != null) {
                                    if (premiereDate.length() < 4) {
                                        premiereDate = null;
                                    }
                                    if (premiereDate != null) {
                                        strSubstring = premiereDate.substring(0, 4);
                                    }
                                }
                                strSubstring = null;
                            }
                            type = mediaItem.getType();
                            if (Intrinsics.areEqual(type, "Series")) {
                                userData4 = mediaItem.getUserData();
                                if (userData4 != null) {
                                    childCount = mediaItem.getChildCount();
                                } else {
                                    childCount = mediaItem.getChildCount();
                                }
                            } else {
                                if (Intrinsics.areEqual(type, "Season")) {
                                    childCount = mediaItem.getChildCount();
                                    if (childCount == null) {
                                        userData2 = mediaItem.getUserData();
                                        if (userData2 != null) {
                                            childCount = userData2.getUnplayedItemCount();
                                        } else {
                                            num = null;
                                        }
                                    }
                                } else {
                                    childCount = mediaItem.getChildCount();
                                    if (childCount == null) {
                                        userData = mediaItem.getUserData();
                                        if (userData != null) {
                                            childCount = userData.getUnplayedItemCount();
                                        } else {
                                            num = null;
                                        }
                                    }
                                }
                                zBooleanValue = ((Boolean) this.e.getValue()).booleanValue();
                                mutableState2 = this.g;
                                if (zBooleanValue) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                Modifier modifierD3 = sv1.d(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7827unboximpl), i11, ((List) mutableState.getValue()).size(), i3);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i16 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> c2));
                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierD3);
                                float f9 = fM7827unboximpl;
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                int i17 = i3;
                                constructor = companion7.getConstructor();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer2);
                                mr.z(companion7, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl5, Integer.valueOf(i16), composerM4318constructorimpl5));
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                String name3 = mediaItem.getName();
                                Float communityRating3 = mediaItem.getCommunityRating();
                                if (!Intrinsics.areEqual(mediaItem.getType(), "Movie")) {
                                }
                                if (z) {
                                    focusRequester = this.h;
                                } else {
                                    focusRequester = null;
                                }
                                boolean zChanged7 = composer2.changed(mutableState2) | composer2.changedInstance(mediaItem);
                                function1 = this.i;
                                zChanged = zChanged7 | composer2.changed(function1);
                                objRememberedValue = composer2.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                    composer2.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                a41.e(name3, str2, (Function0) objRememberedValue, null, strSubstring, num, focusRequester, false, true, communityRating3, z2, null, 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 520584);
                                composer2.endNode();
                                f5 = f;
                                mutableState4 = mutableState;
                                i9 = i10;
                                fM7827unboximpl = f9;
                                i3 = i17;
                            }
                            num = childCount;
                            zBooleanValue = ((Boolean) this.e.getValue()).booleanValue();
                            mutableState2 = this.g;
                            if (zBooleanValue) {
                                z = false;
                            } else {
                                z = false;
                            }
                            Modifier modifierD4 = sv1.d(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, fM7827unboximpl), i11, ((List) mutableState.getValue()).size(), i3);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i18 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> c2));
                            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierD4);
                            float f10 = fM7827unboximpl;
                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                            int i19 = i3;
                            constructor = companion8.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer2);
                            mr.z(companion8, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
                            Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl6, Integer.valueOf(i18), composerM4318constructorimpl6));
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            String name4 = mediaItem.getName();
                            Float communityRating4 = mediaItem.getCommunityRating();
                            if (!Intrinsics.areEqual(mediaItem.getType(), "Movie")) {
                            }
                            if (z) {
                                focusRequester = this.h;
                            } else {
                                focusRequester = null;
                            }
                            boolean zChanged8 = composer2.changed(mutableState2) | composer2.changedInstance(mediaItem);
                            function1 = this.i;
                            zChanged = zChanged8 | composer2.changed(function1);
                            objRememberedValue = composer2.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                composer2.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new ug(mediaItem, function1, mutableState2, 24);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            a41.e(name4, str2, (Function0) objRememberedValue, null, strSubstring, num, focusRequester, false, true, communityRating4, z2, null, 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 520584);
                            composer2.endNode();
                            f5 = f;
                            mutableState4 = mutableState;
                            i9 = i10;
                            fM7827unboximpl = f10;
                            i3 = i19;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        c = c2;
                        i6 = i7;
                        i2 = 0;
                    }
                    if (i9.s(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ pv1(io ioVar, ScrollState scrollState, float f, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, FocusRequester focusRequester, Function1 function1) {
        this.b = ioVar;
        this.j = scrollState;
        this.c = f;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = focusRequester;
        this.i = function1;
    }
}
