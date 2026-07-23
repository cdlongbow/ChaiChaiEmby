package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e10 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ e10(int i, FocusRequester focusRequester, MediaItem mediaItem, List list, Function1 function1) {
        this.c = list;
        this.d = mediaItem;
        this.b = i;
        this.e = focusRequester;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20((FiniteAnimationSpec) obj5, (FiniteAnimationSpec) obj4, (FiniteAnimationSpec) obj3, this.b, (FiniteAnimationSpec) obj2, (AnimatedContentTransitionScope) obj);
            case 1:
                final List list = (List) obj5;
                final MediaItem mediaItem = (MediaItem) obj4;
                final FocusRequester focusRequester = (FocusRequester) obj3;
                final Function1 function1 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                int size = list.size();
                final int i2 = this.b;
                d.b(lazyListScope, size, null, null, ComposableLambdaKt.composableLambdaInstance(-316470842, true, new Function4() { // from class: k60
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
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int iIntValue = ((Integer) obj7).intValue();
                        Composer composer = (Composer) obj8;
                        int iIntValue2 = ((Integer) obj9).intValue();
                        ((LazyItemScope) obj6).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        int i3 = 0;
                        if (composer.shouldExecute((iIntValue2 & Input.Keys.NUMPAD_1) != 144, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-316470842, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.SeasonSelectionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:3323)");
                            }
                            MediaItem mediaItem2 = (MediaItem) list.get(iIntValue);
                            String id = mediaItem2.getId();
                            MediaItem mediaItem3 = mediaItem;
                            boolean zAreEqual = Intrinsics.areEqual(id, mediaItem3 != null ? mediaItem3.getId() : null);
                            boolean zChanged = composer.changed(mediaItem2.getId());
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            MutableState mutableState = (MutableState) objRememberedValue;
                            Modifier modifierFocusRequester = Modifier.INSTANCE;
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(52.0f));
                            boolean zChanged2 = composer.changed(mutableState);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new u00(22, mutableState);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue2);
                            if (iIntValue == i2) {
                                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester);
                            }
                            Modifier modifierThen = modifierOnFocusChanged.then(modifierFocusRequester);
                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                            long j = zAreEqual ? u90.h : u90.g;
                            long j2 = u90.i;
                            int i4 = ButtonDefaults.$stable;
                            ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer, (i4 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                            ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.03f, 0.0f, 0.0f, 0.0f, 29, null);
                            ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, (i4 << 15) | 48, 29);
                            PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(0.0f));
                            Function1 function2 = function1;
                            boolean zChanged3 = composer.changed(function2) | composer.changedInstance(mediaItem2);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new q60(function2, mediaItem2, 0);
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue3, modifierThen, null, false, buttonScaleScale$default, null, null, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(-272728618, true, new r60(zAreEqual, mediaItem2, mutableState, i3), composer, 54), composer, 0, 390, 2412);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }), 6, null);
                return Unit.INSTANCE;
            default:
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$15$lambda$14((WindowBoundsCalculator) obj5, this.b, (MutableState) obj4, (MutableIntState) obj3, (MutableIntState) obj2, (LayoutCoordinates) obj);
        }
    }

    public /* synthetic */ e10(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i, FiniteAnimationSpec finiteAnimationSpec4) {
        this.c = finiteAnimationSpec;
        this.d = finiteAnimationSpec2;
        this.e = finiteAnimationSpec3;
        this.b = i;
        this.g = finiteAnimationSpec4;
    }

    public /* synthetic */ e10(WindowBoundsCalculator windowBoundsCalculator, int i, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.c = windowBoundsCalculator;
        this.b = i;
        this.d = mutableState;
        this.e = mutableIntState;
        this.g = mutableIntState2;
    }
}
