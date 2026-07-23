package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q42 implements Function3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ q42(ImageVector imageVector, boolean z, boolean z2, boolean z3, MutableState mutableState) {
        this.e = imageVector;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long onSurface;
        int i = this.a;
        FocusRequester focusRequester = null;
        Object obj4 = this.g;
        boolean z = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj5;
                FocusRequester focusRequester2 = (FocusRequester) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-690975720, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:467)");
                    }
                    if (!z2 && !z) {
                        focusRequester = focusRequester2;
                    }
                    c52.f(z3, function1, focusRequester, composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                ImageVector imageVector = (ImageVector) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-760534367, iIntValue2, -1, "com.dh.myembyapp.ui.screens.home.TopNavIconButton.<anonymous> (TopNavigation.kt:689)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierAlign = boxScopeInstance.align(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(22.0f)), companion2.getCenter());
                    if (((Boolean) mutableState.getValue()).booleanValue() && z3 && z2) {
                        composer2.startReplaceGroup(810617282);
                        composer2.endReplaceGroup();
                        onSurface = ColorKt.Color(4279308561L);
                    } else {
                        composer2.startReplaceGroup(810680336);
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface();
                        composer2.endReplaceGroup();
                    }
                    IconKt.m2496Iconww6aTOc(imageVector, "设置", modifierAlign, onSurface, composer2, 0, 0);
                    if (z) {
                        composer2.startReplaceGroup(810810815);
                        BoxKt.Box(BorderKt.m286borderxT4_qwU(BackgroundKt.m274backgroundbw27NRU(SizeKt.m1064size3ABfNKs(PaddingKt.m1003paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopEnd()), 0.0f, Dp.m7813constructorimpl(7.0f), Dp.m7813constructorimpl(7.0f), 0.0f, 9, null), Dp.m7813constructorimpl(8.0f)), ColorKt.Color(4294951175L), RoundedCornerShapeKt.getCircleShape()), Dp.m7813constructorimpl(1.0f), ColorKt.Color(3427415296L), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(811299003);
                        composer2.endReplaceGroup();
                    }
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

    public /* synthetic */ q42(boolean z, Function1 function1, boolean z2, boolean z3, FocusRequester focusRequester) {
        this.b = z;
        this.e = function1;
        this.c = z2;
        this.d = z3;
        this.g = focusRequester;
    }
}
