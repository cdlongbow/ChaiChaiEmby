package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.MediaSource;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i60 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ FocusRequester i;

    public /* synthetic */ i60(String str, List list, String str2, String str3, int i, Function2 function2, FocusRequester focusRequester, int i2) {
        this.a = i2;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.g = i;
        this.h = function2;
        this.i = focusRequester;
    }

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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1984946131, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeVersionDialog.<anonymous> (DetailScreen.kt:9007)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(400.0f), 1, null), Dp.m7813constructorimpl(8.0f), 0.0f, 2, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), Alignment.INSTANCE.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1001paddingVpY3zN4$default);
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium();
                    TextKt.m3048TextNvy7gAk(this.b, PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, Dp.m7813constructorimpl(8.0f), 5, null), u90.k, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110584);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
                    final List list = this.c;
                    boolean zChangedInstance = composer.changedInstance(list);
                    final String str = this.d;
                    boolean zChanged = zChangedInstance | composer.changed(str);
                    final String str2 = this.e;
                    boolean zChanged2 = zChanged | composer.changed(str2);
                    final int i2 = this.g;
                    boolean zChanged3 = zChanged2 | composer.changed(i2);
                    final Function2 function2 = this.h;
                    boolean zChanged4 = zChanged3 | composer.changed(function2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final int i3 = 0;
                        final FocusRequester focusRequester = this.i;
                        objRememberedValue = new Function1() { // from class: v60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i3) {
                                    case 0:
                                        LazyListScope lazyListScope = (LazyListScope) obj3;
                                        lazyListScope.getClass();
                                        final List list2 = list;
                                        int size = list2.size();
                                        final String str3 = str;
                                        final String str4 = str2;
                                        final int i4 = i2;
                                        final FocusRequester focusRequester2 = focusRequester;
                                        final Function2 function3 = function2;
                                        d.b(lazyListScope, size, null, null, ComposableLambdaKt.composableLambdaInstance(-388650983, true, new Function4() { // from class: y60
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                                boolean z;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                Composer composer2 = (Composer) obj6;
                                                int iIntValue3 = ((Integer) obj7).intValue();
                                                ((LazyItemScope) obj4).getClass();
                                                if ((iIntValue3 & 48) == 0) {
                                                    iIntValue3 |= composer2.changed(iIntValue2) ? 32 : 16;
                                                }
                                                if (composer2.shouldExecute((iIntValue3 & Input.Keys.NUMPAD_1) != 144, iIntValue3 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-388650983, iIntValue3, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeVersionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:9030)");
                                                    }
                                                    MediaSource mediaSource = (MediaSource) list2.get(iIntValue2);
                                                    boolean zAreEqual = Intrinsics.areEqual(mediaSource.getId(), str3);
                                                    boolean zAreEqual2 = Intrinsics.areEqual(mediaSource.getId(), str4);
                                                    String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(u90.T0(mediaSource), " · ", null, null, 0, null, null, 62, null);
                                                    boolean zChanged5 = composer2.changed(mediaSource.getId());
                                                    Object objRememberedValue2 = composer2.rememberedValue();
                                                    if (zChanged5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                        composer2.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    MutableState mutableState = (MutableState) objRememberedValue2;
                                                    Modifier modifierFocusRequester = Modifier.INSTANCE;
                                                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f), 0.0f, 2, null);
                                                    boolean zChanged6 = composer2.changed(mutableState);
                                                    Object objRememberedValue3 = composer2.rememberedValue();
                                                    if (zChanged6 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = new u00(27, mutableState);
                                                        composer2.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1052heightInVpY3zN4$default, (Function1) objRememberedValue3);
                                                    if (iIntValue2 == i4) {
                                                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester2);
                                                    }
                                                    Modifier modifierThen = modifierOnFocusChanged.then(modifierFocusRequester);
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                    long j = zAreEqual ? u90.h : u90.g;
                                                    long j2 = u90.i;
                                                    int i5 = ButtonDefaults.$stable;
                                                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer2, (i5 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null);
                                                    ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer2, (i5 << 15) | 48, 29);
                                                    ButtonShape buttonShapeShape$default = ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), null, null, null, null, 30, null);
                                                    PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(8.0f));
                                                    Function2 function4 = function3;
                                                    boolean zChanged7 = composer2.changed(function4) | composer2.changedInstance(mediaSource) | composer2.changed(zAreEqual2);
                                                    Object objRememberedValue4 = composer2.rememberedValue();
                                                    if (zChanged7 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        z = true;
                                                        objRememberedValue4 = new a60(function4, mediaSource, zAreEqual2, 1);
                                                        composer2.updateRememberedValue(objRememberedValue4);
                                                    } else {
                                                        z = true;
                                                    }
                                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue4, modifierThen, null, false, buttonScaleScale$default, null, buttonShapeShape$default, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-1089052631, z, new z60(mutableState, mediaSource, strJoinToString$default, zAreEqual2, zAreEqual), composer2, 54), composer2, 0, 390, 2348);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer2.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 6, null);
                                        break;
                                    default:
                                        LazyListScope lazyListScope2 = (LazyListScope) obj3;
                                        lazyListScope2.getClass();
                                        xw xwVar = new xw(23);
                                        List list3 = list;
                                        lazyListScope2.items(list3.size(), new w5(24, xwVar, list3), new x5(list3, 24), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new m90(list3, str, str2, i2, focusRequester, function2, 1)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24966, 490);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1659898572, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.VersionSelectionDialog.<anonymous> (PlayerControls.kt:2469)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default2 = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(400.0f), 1, null), Dp.m7813constructorimpl(8.0f), 0.0f, 2, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1001paddingVpY3zN4$default2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextStyle bodyMedium2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                    TextKt.m3048TextNvy7gAk(this.b, PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, Dp.m7813constructorimpl(4.0f), 0.0f, Dp.m7813constructorimpl(8.0f), 5, null), jg1.g, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium2, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110584);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default2 = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
                    final List list2 = this.c;
                    boolean zChangedInstance2 = composer2.changedInstance(list2);
                    final String str3 = this.d;
                    boolean zChanged5 = zChangedInstance2 | composer2.changed(str3);
                    final String str4 = this.e;
                    boolean zChanged6 = zChanged5 | composer2.changed(str4);
                    final int i5 = this.g;
                    boolean zChanged7 = zChanged6 | composer2.changed(i5);
                    final Function2 function3 = this.h;
                    boolean zChanged8 = zChanged7 | composer2.changed(function3);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final int i6 = 1;
                        final FocusRequester focusRequester2 = this.i;
                        Function1 function1 = new Function1() { // from class: v60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i6) {
                                    case 0:
                                        LazyListScope lazyListScope = (LazyListScope) obj3;
                                        lazyListScope.getClass();
                                        final List list3 = list2;
                                        int size = list3.size();
                                        final String str5 = str3;
                                        final String str6 = str4;
                                        final int i7 = i5;
                                        final FocusRequester focusRequester3 = focusRequester2;
                                        final Function2 function4 = function3;
                                        d.b(lazyListScope, size, null, null, ComposableLambdaKt.composableLambdaInstance(-388650983, true, new Function4() { // from class: y60
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                                boolean z;
                                                int iIntValue3 = ((Integer) obj5).intValue();
                                                Composer composer3 = (Composer) obj6;
                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                ((LazyItemScope) obj4).getClass();
                                                if ((iIntValue4 & 48) == 0) {
                                                    iIntValue4 |= composer3.changed(iIntValue3) ? 32 : 16;
                                                }
                                                if (composer3.shouldExecute((iIntValue4 & Input.Keys.NUMPAD_1) != 144, iIntValue4 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-388650983, iIntValue4, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeVersionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:9030)");
                                                    }
                                                    MediaSource mediaSource = (MediaSource) list3.get(iIntValue3);
                                                    boolean zAreEqual = Intrinsics.areEqual(mediaSource.getId(), str5);
                                                    boolean zAreEqual2 = Intrinsics.areEqual(mediaSource.getId(), str6);
                                                    String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(u90.T0(mediaSource), " · ", null, null, 0, null, null, 62, null);
                                                    boolean zChanged9 = composer3.changed(mediaSource.getId());
                                                    Object objRememberedValue3 = composer3.rememberedValue();
                                                    if (zChanged9 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                        composer3.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    MutableState mutableState = (MutableState) objRememberedValue3;
                                                    Modifier modifierFocusRequester = Modifier.INSTANCE;
                                                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f), 0.0f, 2, null);
                                                    boolean zChanged10 = composer3.changed(mutableState);
                                                    Object objRememberedValue4 = composer3.rememberedValue();
                                                    if (zChanged10 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = new u00(27, mutableState);
                                                        composer3.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1052heightInVpY3zN4$default, (Function1) objRememberedValue4);
                                                    if (iIntValue3 == i7) {
                                                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
                                                    }
                                                    Modifier modifierThen = modifierOnFocusChanged.then(modifierFocusRequester);
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                    long j = zAreEqual ? u90.h : u90.g;
                                                    long j2 = u90.i;
                                                    int i8 = ButtonDefaults.$stable;
                                                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer3, (i8 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null);
                                                    ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer3, (i8 << 15) | 48, 29);
                                                    ButtonShape buttonShapeShape$default = ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), null, null, null, null, 30, null);
                                                    PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(8.0f));
                                                    Function2 function5 = function4;
                                                    boolean zChanged11 = composer3.changed(function5) | composer3.changedInstance(mediaSource) | composer3.changed(zAreEqual2);
                                                    Object objRememberedValue5 = composer3.rememberedValue();
                                                    if (zChanged11 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        z = true;
                                                        objRememberedValue5 = new a60(function5, mediaSource, zAreEqual2, 1);
                                                        composer3.updateRememberedValue(objRememberedValue5);
                                                    } else {
                                                        z = true;
                                                    }
                                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue5, modifierThen, null, false, buttonScaleScale$default, null, buttonShapeShape$default, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-1089052631, z, new z60(mutableState, mediaSource, strJoinToString$default, zAreEqual2, zAreEqual), composer3, 54), composer3, 0, 390, 2348);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer3.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 6, null);
                                        break;
                                    default:
                                        LazyListScope lazyListScope2 = (LazyListScope) obj3;
                                        lazyListScope2.getClass();
                                        xw xwVar = new xw(23);
                                        List list4 = list2;
                                        lazyListScope2.items(list4.size(), new w5(24, xwVar, list4), new x5(list4, 24), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new m90(list4, str3, str4, i5, focusRequester2, function3, 1)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer2.updateRememberedValue(function1);
                        objRememberedValue2 = function1;
                    }
                    LazyDslKt.LazyColumn(modifierFillMaxWidth$default2, null, paddingValuesM994PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue2, composer2, 24966, 490);
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
}
