package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cx implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ cx(List list, MutableState mutableState, List list2, Function1 function1) {
        this.a = 2;
        this.b = list;
        this.d = mutableState;
        this.c = list2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                final List list = this.b;
                int size = list.size();
                final int i = 0;
                final List list2 = this.c;
                final MutableState mutableState = this.d;
                final Function1 function1 = this.e;
                d.b(lazyListScope, size, null, null, ComposableLambdaKt.composableLambdaInstance(-349961531, true, new Function4() { // from class: ex
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i2 = i;
                        Function1 function2 = function1;
                        MutableState mutableState2 = mutableState;
                        List list3 = list2;
                        List list4 = list;
                        switch (i2) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                Composer composer = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((LazyItemScope) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                                }
                                int i3 = iIntValue2;
                                if (composer.shouldExecute((i3 & Input.Keys.NUMPAD_1) != 144, i3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-349961531, i3, -1, "com.dh.myembyapp.ui.screens.player.components.DanmakuMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuMenuOverlay.kt:163)");
                                    }
                                    bx bxVar = (bx) list4.get(iIntValue);
                                    boolean z = jx.b(mutableState2) == iIntValue;
                                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list3.get(iIntValue));
                                    boolean zChanged = ((i3 & Input.Keys.FORWARD_DEL) == 32) | composer.changed(mutableState2) | composer.changed(function2);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new fx(iIntValue, function2, mutableState2, 0);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
                                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                    int i4 = ClickableSurfaceDefaults.$stable;
                                    int i5 = i4 << 15;
                                    ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer, i5, 30);
                                    Color.Companion companion = Color.INSTANCE;
                                    long jM5151copywmQWz5c$default = z ? Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : companion.m5187getTransparent0d7_KjU();
                                    Color.Companion companion2 = Color.INSTANCE;
                                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer, (i4 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer, i5 | 48, 29);
                                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                    boolean zChanged2 = composer.changed(bxVar);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new c0(bxVar, 14);
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue2, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(1178598854, true, new i2(bxVar, 5), composer, 54), composer, 0, 48, 1564);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer.skipToGroupEnd();
                                }
                                break;
                            default:
                                int iIntValue3 = ((Integer) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                ((LazyItemScope) obj2).getClass();
                                if ((iIntValue4 & 48) == 0) {
                                    iIntValue4 |= composer2.changed(iIntValue3) ? 32 : 16;
                                }
                                int i6 = iIntValue4;
                                if (composer2.shouldExecute((i6 & Input.Keys.NUMPAD_1) != 144, i6 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1322420125, i6, -1, "com.dh.myembyapp.ui.components.MoreMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MoreMenuOverlay.kt:159)");
                                    }
                                    j51 j51Var = (j51) list4.get(iIntValue3);
                                    Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list3.get(iIntValue3));
                                    int i7 = i6 & Input.Keys.FORWARD_DEL;
                                    boolean zChanged3 = (i7 == 32) | composer2.changed(j51Var) | composer2.changed(mutableState2) | composer2.changed(function2);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new po0(iIntValue3, j51Var, function2, mutableState2);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue3);
                                    ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                    int i8 = ClickableSurfaceDefaults.$stable;
                                    int i9 = i8 << 15;
                                    ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(roundedCornerShapeM1312RoundedCornerShape0680j_5, null, null, null, null, composer2, i9, 30);
                                    long jM5151copywmQWz5c$default2 = iIntValue3 == m51.b(mutableState2) ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                    Color.Companion companion3 = Color.INSTANCE;
                                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(jM5151copywmQWz5c$default2, 0L, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer2, (i8 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                    ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer2, i9 | 48, 29);
                                    ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                    boolean zChanged4 = composer2.changed(j51Var) | (i7 == 32);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new vo(iIntValue3, j51Var, 3);
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue4, modifierOnFocusChanged2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, null, null, ComposableLambdaKt.rememberComposableLambda(-758589858, true, new i2(j51Var, 10), composer2, 54), composer2, 0, 48, 1564);
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
                }), 6, null);
                break;
            case 1:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                d.a(lazyListScope2, null, null, lt.a, 3, null);
                final List list3 = this.b;
                int size2 = list3.size();
                final int i2 = 1;
                final List list4 = this.c;
                final MutableState mutableState2 = this.d;
                final Function1 function2 = this.e;
                d.b(lazyListScope2, size2, null, null, ComposableLambdaKt.composableLambdaInstance(1322420125, true, new Function4() { // from class: ex
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i3 = i2;
                        Function1 function3 = function2;
                        MutableState mutableState3 = mutableState2;
                        List list5 = list4;
                        List list6 = list3;
                        switch (i3) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                Composer composer = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((LazyItemScope) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                                }
                                int i4 = iIntValue2;
                                if (composer.shouldExecute((i4 & Input.Keys.NUMPAD_1) != 144, i4 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-349961531, i4, -1, "com.dh.myembyapp.ui.screens.player.components.DanmakuMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuMenuOverlay.kt:163)");
                                    }
                                    bx bxVar = (bx) list6.get(iIntValue);
                                    boolean z = jx.b(mutableState3) == iIntValue;
                                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list5.get(iIntValue));
                                    boolean zChanged = ((i4 & Input.Keys.FORWARD_DEL) == 32) | composer.changed(mutableState3) | composer.changed(function3);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new fx(iIntValue, function3, mutableState3, 0);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
                                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                    int i5 = ClickableSurfaceDefaults.$stable;
                                    int i6 = i5 << 15;
                                    ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer, i6, 30);
                                    Color.Companion companion = Color.INSTANCE;
                                    long jM5151copywmQWz5c$default = z ? Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : companion.m5187getTransparent0d7_KjU();
                                    Color.Companion companion2 = Color.INSTANCE;
                                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer, (i5 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer, i6 | 48, 29);
                                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                    boolean zChanged2 = composer.changed(bxVar);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new c0(bxVar, 14);
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue2, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(1178598854, true, new i2(bxVar, 5), composer, 54), composer, 0, 48, 1564);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer.skipToGroupEnd();
                                }
                                break;
                            default:
                                int iIntValue3 = ((Integer) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue4 = ((Integer) obj5).intValue();
                                ((LazyItemScope) obj2).getClass();
                                if ((iIntValue4 & 48) == 0) {
                                    iIntValue4 |= composer2.changed(iIntValue3) ? 32 : 16;
                                }
                                int i7 = iIntValue4;
                                if (composer2.shouldExecute((i7 & Input.Keys.NUMPAD_1) != 144, i7 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1322420125, i7, -1, "com.dh.myembyapp.ui.components.MoreMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MoreMenuOverlay.kt:159)");
                                    }
                                    j51 j51Var = (j51) list6.get(iIntValue3);
                                    Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list5.get(iIntValue3));
                                    int i8 = i7 & Input.Keys.FORWARD_DEL;
                                    boolean zChanged3 = (i8 == 32) | composer2.changed(j51Var) | composer2.changed(mutableState3) | composer2.changed(function3);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new po0(iIntValue3, j51Var, function3, mutableState3);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue3);
                                    ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                    int i9 = ClickableSurfaceDefaults.$stable;
                                    int i10 = i9 << 15;
                                    ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(roundedCornerShapeM1312RoundedCornerShape0680j_5, null, null, null, null, composer2, i10, 30);
                                    long jM5151copywmQWz5c$default2 = iIntValue3 == m51.b(mutableState3) ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                    Color.Companion companion3 = Color.INSTANCE;
                                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(jM5151copywmQWz5c$default2, 0L, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer2, (i9 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                    ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer2, i10 | 48, 29);
                                    ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                    boolean zChanged4 = composer2.changed(j51Var) | (i8 == 32);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new vo(iIntValue3, j51Var, 3);
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue4, modifierOnFocusChanged2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, null, null, ComposableLambdaKt.rememberComposableLambda(-758589858, true, new i2(j51Var, 10), composer2, 54), composer2, 0, 48, 1564);
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
                }), 6, null);
                break;
            default:
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                final int i3 = 0;
                for (Object obj2 : this.b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final g42 g42Var = (g42) obj2;
                    final MutableState mutableState3 = this.d;
                    final boolean z = c52.d(mutableState3) == i3;
                    String str = g42Var.a;
                    final List list5 = this.c;
                    final Function1 function3 = this.e;
                    d.a(lazyListScope3, str, null, ComposableLambdaKt.composableLambdaInstance(-328632803, true, new Function3() { // from class: z42
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Composer composer = (Composer) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            ((LazyItemScope) obj3).getClass();
                            if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-328632803, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleMenuOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:214)");
                                }
                                g42 g42Var2 = g42Var;
                                Function0 function0 = g42Var2.c;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                List list6 = list5;
                                int i5 = i3;
                                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFillMaxWidth$default, (FocusRequester) list6.get(i5));
                                MutableState mutableState4 = mutableState3;
                                boolean zChanged = composer.changed(mutableState4) | composer.changed(i5);
                                Function1 function4 = function3;
                                boolean zChanged2 = zChanged | composer.changed(function4);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new fx(i5, function4, mutableState4, 1);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
                                ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                int i6 = ClickableSurfaceDefaults.$stable;
                                int i7 = i6 << 15;
                                ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer, i7, 30);
                                long jM5151copywmQWz5c$default = z ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                Color.Companion companion = Color.INSTANCE;
                                SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer, (i6 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer, i7 | 48, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-1723293026, true, new i2(g42Var2, 17), composer, 54), composer, 0, 48, 1564);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }), 2, null);
                    i3 = i4;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ cx(List list, List list2, MutableState mutableState, Function1 function1, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = mutableState;
        this.e = function1;
    }
}
