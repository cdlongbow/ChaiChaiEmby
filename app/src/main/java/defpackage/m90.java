package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.MediaSource;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m90 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ Function h;

    public /* synthetic */ m90(List list, String str, String str2, int i, FocusRequester focusRequester, Function function, int i2) {
        this.a = i2;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.g = focusRequester;
        this.h = function;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        boolean z;
        int i3 = this.a;
        FocusRequester focusRequester = this.g;
        int i4 = this.e;
        String str = this.d;
        String str2 = this.c;
        List list = this.b;
        Function function = this.h;
        int i5 = 2;
        switch (i3) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) function;
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
                    u51 u51Var = (u51) list.get(iIntValue);
                    composer.startReplaceGroup(-803299897);
                    String str3 = u51Var.a;
                    boolean zAreEqual = Intrinsics.areEqual(str3, str2);
                    boolean zAreEqual2 = Intrinsics.areEqual(str3, str);
                    boolean zChanged = composer.changed(str3);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    Modifier modifierFocusRequester = Modifier.INSTANCE;
                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f), 0.0f, 2, null);
                    boolean zChanged2 = composer.changed(mutableState);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new vx(1, mutableState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1052heightInVpY3zN4$default, (Function1) objRememberedValue2);
                    if (iIntValue == i4) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester);
                    }
                    Modifier modifierThen = modifierOnFocusChanged.then(modifierFocusRequester);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    long j = zAreEqual ? u90.h : u90.g;
                    long j2 = u90.i;
                    int i6 = ButtonDefaults.$stable;
                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer, (i6 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null);
                    ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, (i6 << 15) | 48, 29);
                    ButtonShape buttonShapeShape$default = ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), null, null, null, null, 30, null);
                    PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(8.0f));
                    boolean zChanged3 = composer.changed(function1) | composer.changed(u51Var);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ni(6, function1, u51Var);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue3, modifierThen, null, false, buttonScaleScale$default, null, buttonShapeShape$default, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(841966134, true, new k90(zAreEqual, mutableState, u51Var, zAreEqual2), composer, 54), composer, 0, 390, 2348);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScope lazyItemScope2 = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                Function2 function2 = (Function2) function;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (composer2.changed(lazyItemScope2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if (composer2.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    MediaSource mediaSource = (MediaSource) list.get(iIntValue3);
                    composer2.startReplaceGroup(-929724499);
                    boolean zAreEqual3 = Intrinsics.areEqual(mediaSource.getId(), str2);
                    boolean zAreEqual4 = Intrinsics.areEqual(mediaSource.getId(), str);
                    String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(jg1.p(mediaSource), " · ", null, null, 0, null, null, 62, null);
                    boolean zChanged4 = composer2.changed(mediaSource.getId());
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    MutableState mutableState2 = (MutableState) objRememberedValue4;
                    Modifier modifierFocusRequester2 = Modifier.INSTANCE;
                    Modifier modifierM1052heightInVpY3zN4$default2 = SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierFocusRequester2, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f), 0.0f, 2, null);
                    boolean zChanged5 = composer2.changed(mutableState2);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new vx(i5, mutableState2);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1052heightInVpY3zN4$default2, (Function1) objRememberedValue5);
                    if (iIntValue3 == i4) {
                        modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(modifierFocusRequester2, focusRequester);
                    }
                    Modifier modifierThen2 = modifierOnFocusChanged2.then(modifierFocusRequester2);
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    long j3 = zAreEqual3 ? jg1.c : jg1.b;
                    long j4 = jg1.d;
                    int i7 = ButtonDefaults.$stable;
                    ButtonColors buttonColorsM8228colorsoq7We09 = buttonDefaults2.m8228colorsoq7We08(j3, 0L, j4, 0L, 0L, 0L, 0L, 0L, composer2, (i7 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                    ButtonScale buttonScaleScale$default2 = ButtonDefaults.scale$default(buttonDefaults2, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null);
                    ButtonBorder buttonBorderBorder2 = buttonDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer2, (i7 << 15) | 48, 29);
                    ButtonShape buttonShapeShape$default2 = ButtonDefaults.shape$default(buttonDefaults2, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), null, null, null, null, 30, null);
                    PaddingValues paddingValuesM993PaddingValuesYgX7TsA2 = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(8.0f));
                    boolean zChanged6 = composer2.changed(function2) | composer2.changedInstance(mediaSource) | composer2.changed(zAreEqual4);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        z = true;
                        objRememberedValue6 = new ez0(zAreEqual4, function2, 1, mediaSource);
                        composer2.updateRememberedValue(objRememberedValue6);
                    } else {
                        z = true;
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue6, modifierThen2, null, false, buttonScaleScale$default2, null, buttonShapeShape$default2, buttonColorsM8228colorsoq7We09, 0.0f, buttonBorderBorder2, paddingValuesM993PaddingValuesYgX7TsA2, null, ComposableLambdaKt.rememberComposableLambda(-1504800964, z, new ig1(mutableState2, mediaSource, strJoinToString$default, zAreEqual3, zAreEqual4), composer2, 54), composer2, 0, 390, 2348);
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
}
