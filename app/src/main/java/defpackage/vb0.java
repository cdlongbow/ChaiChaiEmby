package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vb0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vb0(boolean z, FocusRequester focusRequester, String str, boolean z2) {
        this.a = 0;
        this.b = z;
        this.d = focusRequester;
        this.e = str;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jM5182getGray0d7_KjU;
        long jD;
        int i = this.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                FocusRequester focusRequester = (FocusRequester) obj5;
                String str = (String) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(639933581, iIntValue, -1, "com.dh.myembyapp.dlna.DlnaSwitch.<anonymous> (DlnaSettingsScreen.kt:284)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    boolean z = this.b || focusRequester != null;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme.getTypography(composer, i3).getBodyMedium();
                    if (z) {
                        jM5182getGray0d7_KjU = kb0.u(composer, -376399270, materialTheme, composer, i3);
                    } else {
                        composer.startReplaceGroup(-376398603);
                        composer.endReplaceGroup();
                        jM5182getGray0d7_KjU = Color.INSTANCE.m5182getGray0d7_KjU();
                    }
                    TextKt.m3048TextNvy7gAk(str, null, jM5182getGray0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer, 0, 0, 131066);
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), Dp.m7813constructorimpl(24.0f));
                    boolean z2 = this.c;
                    if (z2) {
                        composer.startReplaceGroup(1216807271);
                        jD = zc2.b(z, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1216918437);
                        jD = zc2.d(z, composer, 0);
                        composer.endReplaceGroup();
                    }
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, modifierM1050height3ABfNKs, jD), Dp.m7813constructorimpl(2.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(z2 ? companion2.getCenterEnd() : companion2.getCenterStart(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BoxKt.Box(kb0.v(10.0f, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), zc2.c(z)), composer, 0);
                    composer.endNode();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                return SelectableKt.selectable_XHw0xAI$lambda$1(this.b, this.c, (Role) obj5, (Function0) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return ToggleableKt.toggleable_XHw0xAI$lambda$1(this.b, this.c, (Role) obj5, (Function1) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ vb0(boolean z, boolean z2, Role role, Function function, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = role;
        this.e = function;
    }
}
