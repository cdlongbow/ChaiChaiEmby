package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
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
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.UserData;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g90 implements Function4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public g90(List list, tv1 tv1Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, FocusRequester focusRequester, Function1 function1) {
        this.b = list;
        this.d = tv1Var;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = focusRequester;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:106:0x0236  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:86:0x0195  */
    /* JADX WARN: Code duplicated, block: B:87:0x0199  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long j;
        long jM5189getWhite0d7_KjU;
        int i2;
        String imageUrl;
        String str;
        Integer childCount;
        Integer num;
        boolean z;
        Function0<ComposeUiNode> constructor;
        boolean z2;
        FocusRequester focusRequester;
        boolean zChanged;
        Object objRememberedValue;
        UserData userData;
        String primary;
        int i3 = this.a;
        Object obj5 = this.i;
        Object obj6 = this.d;
        Object obj7 = this.h;
        Object obj8 = this.e;
        List list = this.b;
        Object obj9 = this.g;
        Function1 function1 = this.c;
        switch (i3) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function2 = (Function1) obj7;
                Function0 function0 = (Function0) obj5;
                List list2 = (List) obj6;
                if ((iIntValue2 & 6) == 0) {
                    i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= composer.changed(iIntValue) ? 32 : 16;
                }
                if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    rg0 rg0Var = (rg0) list.get(iIntValue);
                    composer.startReplaceGroup(238595219);
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue2;
                    boolean zAreEqual = Intrinsics.areEqual(rg0Var.a, (String) obj8);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        j = u90.b;
                    } else {
                        j = zAreEqual ? u90.a : u90.a;
                    }
                    long j2 = j;
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        jM5189getWhite0d7_KjU = u90.c;
                    } else {
                        jM5189getWhite0d7_KjU = zAreEqual ? u90.e : Color.INSTANCE.m5189getWhite0d7_KjU();
                    }
                    long j3 = jM5189getWhite0d7_KjU;
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(42.0f)), (FocusRequester) MapsKt.getValue((Map) obj9, rg0Var.a));
                    boolean zChangedInstance = composer.changedInstance(list2) | ((((i & Input.Keys.FORWARD_DEL) ^ 48) > 32 && composer.changed(iIntValue)) || (i & 48) == 32);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new c90(iIntValue, list2);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierFocusProperties = FocusPropertiesKt.focusProperties(modifierFocusRequester, (Function1) objRememberedValue3);
                    boolean zChanged2 = composer.changed(function1) | composer.changedInstance(rg0Var);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new d90(function1, rg0Var, mutableState);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusProperties, (Function1) objRememberedValue4);
                    boolean zChanged3 = composer.changed(function0);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new e90(function0);
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue5);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    long j4 = u90.b;
                    int i4 = ButtonDefaults.$stable;
                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(j2, 0L, j4, 0L, 0L, 0L, 0L, 0L, composer, (i4 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                    PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(0.0f));
                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null);
                    ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, (i4 << 15) | 48, 29);
                    boolean zChanged4 = composer.changed(function2) | composer.changedInstance(rg0Var);
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (zChanged4 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new ni(4, function2, rg0Var);
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue6, modifierOnPreviewKeyEvent, null, false, buttonScaleScale$default, null, null, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-1056260122, true, new f90(rg0Var, zAreEqual, j3, mutableState), composer, 54), composer, 0, 390, 2412);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                MutableState mutableState2 = (MutableState) obj9;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (composer2.changed(lazyGridItemScope) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if (composer2.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1942245546, i2, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
                    }
                    MediaItem mediaItem = (MediaItem) list.get(iIntValue3);
                    composer2.startReplaceGroup(-1332862089);
                    ImageTags imageTags = mediaItem.getImageTags();
                    if (imageTags == null || (primary = imageTags.getPrimary()) == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320)) == null) {
                        imageUrl = "";
                    }
                    String str2 = imageUrl;
                    Integer productionYear = mediaItem.getProductionYear();
                    if (productionYear == null || (strSubstring = String.valueOf(productionYear.intValue())) == null) {
                        String premiereDate = mediaItem.getPremiereDate();
                        if (premiereDate != null) {
                            if (premiereDate.length() < 4) {
                                premiereDate = null;
                            }
                            if (premiereDate != null) {
                                String strSubstring = premiereDate.substring(0, 4);
                                str = strSubstring;
                            }
                        }
                        str = null;
                    } else {
                        str = strSubstring;
                    }
                    String type = mediaItem.getType();
                    if (Intrinsics.areEqual(type, "Series")) {
                        UserData userData2 = mediaItem.getUserData();
                        if (userData2 == null || (childCount = userData2.getUnplayedItemCount()) == null) {
                            childCount = mediaItem.getChildCount();
                        }
                    } else {
                        if (Intrinsics.areEqual(type, "Season")) {
                            childCount = mediaItem.getChildCount();
                            if (childCount == null) {
                                UserData userData3 = mediaItem.getUserData();
                                if (userData3 != null) {
                                    childCount = userData3.getUnplayedItemCount();
                                } else {
                                    num = null;
                                }
                            }
                        } else {
                            childCount = mediaItem.getChildCount();
                            if (childCount == null) {
                                UserData userData4 = mediaItem.getUserData();
                                if (userData4 != null) {
                                    childCount = userData4.getUnplayedItemCount();
                                } else {
                                    num = null;
                                }
                            }
                        }
                        if (((Boolean) ((MutableState) obj8).getValue()).booleanValue() || !Intrinsics.areEqual(mediaItem.getId(), (String) mutableState2.getValue())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        Modifier modifierD = sv1.d(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), iIntValue3, ((List) ((MutableState) obj7).getValue()).size(), ((tv1) obj6).a);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierD);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
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
                        mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String name = mediaItem.getName();
                        Float communityRating = mediaItem.getCommunityRating();
                        if (Intrinsics.areEqual(mediaItem.getType(), "Movie") || (userData = mediaItem.getUserData()) == null || !userData.getPlayed()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            focusRequester = (FocusRequester) obj5;
                        } else {
                            focusRequester = null;
                        }
                        zChanged = composer2.changed(mutableState2) | composer2.changedInstance(mediaItem) | composer2.changed(function1);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new n90(mediaItem, function1, mutableState2, 1);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        a41.e(name, str2, (Function0) objRememberedValue, null, str, num, focusRequester, false, true, communityRating, z2, null, 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 520584);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    num = childCount;
                    if (((Boolean) ((MutableState) obj8).getValue()).booleanValue()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    Modifier modifierD2 = sv1.d(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), iIntValue3, ((List) ((MutableState) obj7).getValue()).size(), ((tv1) obj6).a);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierD2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    String name2 = mediaItem.getName();
                    Float communityRating2 = mediaItem.getCommunityRating();
                    if (Intrinsics.areEqual(mediaItem.getType(), "Movie")) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        focusRequester = (FocusRequester) obj5;
                    } else {
                        focusRequester = null;
                    }
                    zChanged = composer2.changed(mutableState2) | composer2.changedInstance(mediaItem) | composer2.changed(function1);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new n90(mediaItem, function1, mutableState2, 1);
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new n90(mediaItem, function1, mutableState2, 1);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    a41.e(name2, str2, (Function0) objRememberedValue, null, str, num, focusRequester, false, true, communityRating2, z2, null, 0.0f, 0L, 0L, null, null, null, composer2, 805306368, 0, 520584);
                    composer2.endNode();
                    composer2.endReplaceGroup();
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

    public g90(List list, String str, Map map, List list2, Function1 function1, Function0 function0, Function1 function2) {
        this.b = list;
        this.e = str;
        this.g = map;
        this.d = list2;
        this.c = function1;
        this.i = function0;
        this.h = function2;
    }
}
