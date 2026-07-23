package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.PsExtractor;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xx implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xx(List list, Object obj, Function1 function1, int i) {
        this.a = i;
        this.b = list;
        this.d = obj;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        Object obj5 = this.d;
        List list = this.b;
        Function1 function1 = this.c;
        int i4 = 0;
        switch (i3) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
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
                        ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    sw swVar = (sw) list.get(iIntValue);
                    composer.startReplaceGroup(1699972241);
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    boolean zAreEqual = Intrinsics.areEqual(swVar.a, (String) obj5);
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(38.0f));
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new vx(i4, mutableState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue2);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), zAreEqual ? 0.22f : 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    Color.Companion companion2 = Color.INSTANCE;
                    long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null);
                    long jColor = zAreEqual ? ColorKt.Color(4283417591L) : companion2.m5189getWhite0d7_KjU();
                    long jM5178getBlack0d7_KjU = companion2.m5178getBlack0d7_KjU();
                    int i5 = ButtonDefaults.$stable;
                    ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(jM5151copywmQWz5c$default, jColor, jM5151copywmQWz5c$default2, jM5178getBlack0d7_KjU, 0L, 0L, 0L, 0L, composer, (i5 << 24) | 3456, PsExtractor.VIDEO_STREAM_MASK);
                    PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(0.0f));
                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null);
                    ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, (i5 << 15) | 48, 29);
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(swVar);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new ni(2, function1, swVar);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue3, modifierOnFocusChanged, null, false, buttonScaleScale$default, null, null, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-1668052426, true, new wx(swVar, zAreEqual, mutableState), composer, 54), composer, 0, 390, 2412);
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
                    bi0 bi0Var = (bi0) list.get(iIntValue3);
                    composer2.startReplaceGroup(-2073586685);
                    Modifier modifierFocusRequester = iIntValue3 == 0 ? FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, (FocusRequester) obj5) : Modifier.INSTANCE;
                    boolean zChanged2 = composer2.changed(function1) | composer2.changedInstance(bi0Var);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new ni(5, function1, bi0Var);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    u90.Y(bi0Var, modifierFocusRequester, (Function0) objRememberedValue4, composer2, 0);
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
