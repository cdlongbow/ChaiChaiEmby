package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;

import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.UserData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a00 implements Function4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public a00(List list, u61 u61Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.b = list;
        this.g = u61Var;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.h = mutableState4;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0231  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0182  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        String imageUrl;
        String str;
        Integer childCount;
        Integer num;
        boolean z;
        Function0<ComposeUiNode> constructor;
        boolean z2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        UserData userData;
        String primary;
        int i3 = this.a;
        MutableState mutableState = this.e;
        Object obj5 = this.g;
        MutableState mutableState2 = this.d;
        MutableState mutableState3 = this.c;
        List list = this.b;
        Object obj6 = this.h;
        switch (i3) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                MutableState mutableState4 = (MutableState) obj6;
                u61 u61Var = (u61) obj5;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    String str2 = (String) list.get(iIntValue);
                    composer.startReplaceGroup(1353440104);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String str3 = (String) ((List) mutableState3.getValue()).get(iIntValue);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme.getTypography(composer, i5).getBodyLarge();
                    TextFieldColors textFieldColorsM = yc2.m(composer);
                    ImeAction.Companion companion3 = ImeAction.INSTANCE;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, companion3.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    int i6 = (i & Input.Keys.FORWARD_DEL) ^ 48;
                    boolean z3 = (i6 > 32 && composer.changed(iIntValue)) || (i & 48) == 32;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new uz(iIntValue, mutableState3);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    int i7 = i;
                    yc2.d(str3, (Function1) objRememberedValue3, modifierFillMaxWidth$default2, false, ComposableLambdaKt.rememberComposableLambda(1693881694, true, new vz(iIntValue, 0), composer, 54), ComposableLambdaKt.rememberComposableLambda(-1119062177, true, new wz(iIntValue), composer, 54), null, null, keyboardOptions, null, bodyLarge, false, textFieldColorsM, null, composer, 100884864, 6, 21192);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    TextStyle bodyLarge2 = materialTheme.getTypography(composer, i5).getBodyLarge();
                    boolean z4 = ((Boolean) mutableState2.getValue()).booleanValue() && iIntValue == 0 && str2.length() == 0;
                    TextFieldColors textFieldColorsM2 = yc2.m(composer);
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, companion3.m7456getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    boolean z5 = (i6 > 32 && composer.changed(iIntValue)) || (i7 & 48) == 32;
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new k8(iIntValue, mutableState, mutableState2);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    yc2.d(str2, (Function1) objRememberedValue4, modifierFillMaxWidth$default3, false, ComposableLambdaKt.rememberComposableLambda(-350529707, true, new vz(iIntValue, 1), composer, 54), zs.c, null, null, keyboardOptions2, null, bodyLarge2, z4, textFieldColorsM2, null, composer, 100884864, 6, 17096);
                    Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, 12, null);
                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                    long j = u61Var.C;
                    long j2 = u61Var.D;
                    int i8 = ClickableSurfaceDefaults.$stable;
                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer, i8 << 24, 250);
                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composer, i8 << 15, 29);
                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                    ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var);
                    boolean z6 = !StringsKt.isBlank(str2);
                    boolean zChanged3 = composer.changed(str2) | ((i6 > 32 && composer.changed(iIntValue)) || (i7 & 48) == 32);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new xz(iIntValue, mutableState4, str2);
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue5, modifierM1003paddingqDBjuR0$default, null, z6, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(1243473861, true, new yz(iIntValue, mutableState4, str2), composer, 54), composer, 48, 48, 1076);
                    if (iIntValue < ((List) mutableState.getValue()).size() - 1) {
                        composer.startReplaceGroup(787188753);
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), composer, 6);
                        Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(2.0f)), Dp.m7813constructorimpl(16.0f), 0.0f, 2, null);
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = zz.a;
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        CanvasKt.Canvas(modifierM1001paddingVpY3zN4$default, (Function1) objRememberedValue6, composer, 54);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(788339070);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
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
                Function1 function1 = (Function1) obj6;
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
                        ComposerKt.traceEventStart(-1117249557, i2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    MediaItem mediaItem = (MediaItem) list.get(iIntValue3);
                    composer2.startReplaceGroup(-505039088);
                    ImageTags imageTags = mediaItem.getImageTags();
                    if (imageTags == null || (primary = imageTags.getPrimary()) == null || (imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", primary, 320)) == null) {
                        imageUrl = "";
                    }
                    String str4 = imageUrl;
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
                        if (((Boolean) mutableState3.getValue()).booleanValue() || !Intrinsics.areEqual(mediaItem.getId(), (String) mutableState2.getValue())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default4);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
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
                        mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String name = mediaItem.getName();
                        Float communityRating = mediaItem.getCommunityRating();
                        if (Intrinsics.areEqual(mediaItem.getType(), "Movie") || (userData = mediaItem.getUserData()) == null || !userData.getPlayed()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        FocusRequester focusRequester = z ? (FocusRequester) obj5 : null;
                        zChanged = composer2.changed(function1) | composer2.changedInstance(mediaItem);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new jq(function1, mediaItem, 5);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        zChanged2 = composer2.changed(z);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new lj0(mutableState, z);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        a41.e(name, str4, function0, null, str, num, focusRequester, false, true, communityRating, z2, null, 0.0f, 0L, 0L, (Function1) objRememberedValue2, null, null, composer2, 805306368, 0, 455048);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    num = childCount;
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default5);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
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
                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    String name2 = mediaItem.getName();
                    Float communityRating2 = mediaItem.getCommunityRating();
                    if (Intrinsics.areEqual(mediaItem.getType(), "Movie")) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    FocusRequester focusRequester2 = z ? (FocusRequester) obj5 : null;
                    zChanged = composer2.changed(function1) | composer2.changedInstance(mediaItem);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new jq(function1, mediaItem, 5);
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new jq(function1, mediaItem, 5);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function2 = (Function0) objRememberedValue;
                    zChanged2 = composer2.changed(z);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new lj0(mutableState, z);
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new lj0(mutableState, z);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    a41.e(name2, str4, function2, null, str, num, focusRequester2, false, true, communityRating2, z2, null, 0.0f, 0L, 0L, (Function1) objRememberedValue2, null, null, composer2, 805306368, 0, 455048);
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

    public a00(List list, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester, Function1 function1, MutableState mutableState3) {
        this.b = list;
        this.c = mutableState;
        this.d = mutableState2;
        this.g = focusRequester;
        this.h = function1;
        this.e = mutableState3;
    }
}
