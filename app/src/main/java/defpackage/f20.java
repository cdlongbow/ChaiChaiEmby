package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.DecoderSettings;
import com.dh.myembyapp.data.model.Library;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f20 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f20(List list, Set set, Function2 function2, FocusRequester focusRequester) {
        this.a = 2;
        this.c = list;
        this.b = set;
        this.d = function2;
        this.e = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj7;
                List list = (List) obj6;
                Function1 function1 = (Function1) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1343606281, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:254)");
                    }
                    boolean zAreEqual = Intrinsics.areEqual(str, DecoderSettings.AUDIO_DECODER_FORCE_FFMPEG);
                    int i2 = 3;
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list.get(3));
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new u00(2, mutableState);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue);
                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                    int i3 = ClickableSurfaceDefaults.$stable;
                    int i4 = i3 << 15;
                    ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer, i4, 30);
                    long jM5151copywmQWz5c$default = m20.b(mutableState) == 3 ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                    Color.Companion companion2 = Color.INSTANCE;
                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer, (i3 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion2.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer, i4 | 48, 29);
                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                    boolean zChanged = composer.changed(zAreEqual) | composer.changed(function1);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new jp(zAreEqual, function1);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue2, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(272097622, true, new g2(zAreEqual, i2), composer, 54), composer, 0, 48, 1564);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                return LazyLayoutKt.LazyLayout$lambda$1((LazyLayoutPrefetchState) obj7, (Modifier) obj6, (LazyLayoutMeasurePolicy) obj5, (State) obj4, (SaveableStateHolder) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                List list2 = (List) obj6;
                Set set = (Set) obj7;
                Function2 function2 = (Function2) obj5;
                FocusRequester focusRequester = (FocusRequester) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-340180510, iIntValue2, -1, "com.dh.myembyapp.ui.components.LibraryVisibilityDialog.<anonymous>.<anonymous>.<anonymous> (LibraryVisibilityDialog.kt:82)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("隐藏媒体库", null, materialTheme.getColorScheme(composer2, i6).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i6).getTitleMedium(), composer2, 6, 0, 131066);
                    Library library = (Library) CollectionsKt.firstOrNull(list2);
                    String id = library != null ? library.getId() : null;
                    Modifier modifierM1051heightInVpY3zN4 = SizeKt.m1051heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(200.0f), Dp.m7813constructorimpl(420.0f));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f));
                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(6.0f), 1, null);
                    boolean zChangedInstance = composer2.changedInstance(list2) | composer2.changedInstance(set) | composer2.changed(id) | composer2.changed(function2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        j1 j1Var = new j1(list2, set, id, focusRequester, function2, 8);
                        composer2.updateRememberedValue(j1Var);
                        objRememberedValue3 = j1Var;
                    }
                    LazyDslKt.LazyColumn(modifierM1051heightInVpY3zN4, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue3, composer2, 24966, 490);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                return TextFieldCursorKt.cursor$lambda$0((Brush) obj7, (LegacyTextFieldState) obj6, (TextFieldValue) obj5, (OffsetMapping) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ f20(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
