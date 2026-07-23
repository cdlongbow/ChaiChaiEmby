package defpackage;

import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class k90 implements Function3 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ u51 c;
    public final /* synthetic */ boolean d;

    public k90(boolean z, MutableState mutableState, u51 u51Var, boolean z2) {
        this.a = z;
        this.b = mutableState;
        this.c = u51Var;
        this.d = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        MutableState mutableState;
        long j;
        long jM5151copywmQWz5c$default;
        Composer composer;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(841966134, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.MoviePlaybackOptionsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:2737)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composer2, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z2 = this.a;
            MutableState mutableState2 = this.b;
            if (z2) {
                composer2.startReplaceGroup(2022135560);
                ImageVector check = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                Shadow shadow = u90.o;
                z = z2;
                mutableState = mutableState2;
                IconKt.m2496Iconww6aTOc(check, (String) null, PaddingKt.m1003paddingqDBjuR0$default(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, 11, null), ((Boolean) mutableState2.getValue()).booleanValue() ? u90.c : u90.m, composer2, 432, 0);
                composer2.endReplaceGroup();
            } else {
                z = z2;
                mutableState = mutableState2;
                composer2.startReplaceGroup(2022700008);
                composer2.endReplaceGroup();
            }
            Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, 11, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            u51 u51Var = this.c;
            String str = u51Var.b;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Shadow shadow2 = u90.o;
            Modifier modifierThen = modifierFillMaxWidth$default2.then(((Boolean) mutableState.getValue()).booleanValue() ? BasicMarqueeKt.m281basicMarquee1Mj1MLw$default(companion, Integer.MAX_VALUE, 0, 0, 0, null, u90.B, 30, null) : companion);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            TextStyle bodyMedium = materialTheme.getTypography(composer2, i3).getBodyMedium();
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean z3 = this.d;
            if (zBooleanValue) {
                j = u90.c;
            } else if (z3) {
                j = u90.n;
            } else {
                j = z ? u90.m : u90.j;
            }
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, modifierThen, j, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, composer2, 0, 24960, 110584);
            String str2 = u51Var.c;
            if (str2 == null) {
                composer2.startReplaceGroup(-207176156);
                composer2.endReplaceGroup();
                composer = composer2;
            } else {
                composer2.startReplaceGroup(-207176155);
                TextStyle labelSmall = materialTheme.getTypography(composer2, i3).getLabelSmall();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(u90.c, 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM5151copywmQWz5c$default = z3 ? Color.m5151copywmQWz5c$default(u90.n, 0.72f, 0.0f, 0.0f, 0.0f, 14, null) : u90.l;
                }
                composer = composer2;
                TextKt.m3048TextNvy7gAk(str2, null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7761getEllipsisgIe3tQ8(), false, 2, 0, null, labelSmall, composer, 0, 24960, 110586);
                composer.endReplaceGroup();
            }
            if (x2.m(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
