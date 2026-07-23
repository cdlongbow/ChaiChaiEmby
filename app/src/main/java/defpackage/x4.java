package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x4 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageVector b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String g;
    public final /* synthetic */ MutableState h;

    public /* synthetic */ x4(ImageVector imageVector, boolean z, boolean z2, boolean z3, String str, MutableState mutableState, int i) {
        this.a = i;
        this.b = imageVector;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.g = str;
        this.h = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long onSurface;
        long jU;
        long onSurface2;
        long jU2;
        int i = this.a;
        MutableState mutableState = this.h;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1879326011, iIntValue, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubNavButton.<anonymous> (AggregateHubScreen.kt:1456)");
                    }
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(16.0f));
                    if (((Boolean) mutableState.getValue()).booleanValue() && z3 && z2) {
                        composer.startReplaceGroup(1783420544);
                        composer.endReplaceGroup();
                        onSurface = ColorKt.Color(4279308561L);
                    } else {
                        composer.startReplaceGroup(1783483598);
                        onSurface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface();
                        composer.endReplaceGroup();
                    }
                    IconKt.m2496Iconww6aTOc(this.b, (String) null, modifierM1064size3ABfNKs, onSurface, composer, 432, 0);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(5.0f)), composer, 6);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextStyle titleSmall = materialTheme.getTypography(composer, i3).getTitleSmall();
                    FontWeight bold = z ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getMedium();
                    if (((Boolean) mutableState.getValue()).booleanValue() && z3 && z2) {
                        composer.startReplaceGroup(1783902656);
                        composer.endReplaceGroup();
                        jU = ColorKt.Color(4279308561L);
                    } else {
                        jU = kb0.u(composer, 1783965710, materialTheme, composer, i3);
                    }
                    TextKt.m3048TextNvy7gAk(this.g, null, jU, null, 0L, null, bold, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleSmall, composer, 0, 0, 131002);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2055275478, iIntValue2, -1, "com.dh.myembyapp.ui.screens.home.NavButton.<anonymous> (TopNavigation.kt:406)");
                    }
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composer2, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default2);
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(16.0f));
                    if (((Boolean) mutableState.getValue()).booleanValue() && z3 && z2) {
                        composer2.startReplaceGroup(-1240073405);
                        composer2.endReplaceGroup();
                        onSurface2 = ColorKt.Color(4279308561L);
                    } else {
                        composer2.startReplaceGroup(-1240010351);
                        onSurface2 = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface();
                        composer2.endReplaceGroup();
                    }
                    IconKt.m2496Iconww6aTOc(this.b, (String) null, modifierM1064size3ABfNKs2, onSurface2, composer2, 432, 0);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(5.0f)), composer2, 6);
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextStyle titleSmall2 = materialTheme2.getTypography(composer2, i5).getTitleSmall();
                    FontWeight bold2 = z ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getMedium();
                    if (((Boolean) mutableState.getValue()).booleanValue() && z3 && z2) {
                        composer2.startReplaceGroup(-1239591293);
                        composer2.endReplaceGroup();
                        jU2 = ColorKt.Color(4279308561L);
                    } else {
                        jU2 = kb0.u(composer2, -1239528239, materialTheme2, composer2, i5);
                    }
                    TextKt.m3048TextNvy7gAk(this.g, null, jU2, null, 0L, null, bold2, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleSmall2, composer2, 0, 0, 131002);
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
