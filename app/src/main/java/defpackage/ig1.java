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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.model.MediaSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class ig1 implements Function3 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MediaSource c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public ig1(MutableState mutableState, MediaSource mediaSource, String str, boolean z, boolean z2) {
        this.a = z;
        this.b = mutableState;
        this.c = mediaSource;
        this.d = z2;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        MutableState mutableState;
        long j;
        long jM5151copywmQWz5c$default;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1504800964, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.VersionSelectionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlayerControls.kt:2524)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composer, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z2 = this.a;
            MutableState mutableState2 = this.b;
            if (z2) {
                composer.startReplaceGroup(-800693465);
                ImageVector check = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                float f = jg1.k;
                z = z2;
                mutableState = mutableState2;
                IconKt.m2496Iconww6aTOc(check, (String) null, PaddingKt.m1003paddingqDBjuR0$default(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, 11, null), ((Boolean) mutableState2.getValue()).booleanValue() ? jg1.e : jg1.i, composer, 432, 0);
                composer.endReplaceGroup();
            } else {
                z = z2;
                mutableState = mutableState2;
                composer.startReplaceGroup(-800195574);
                composer.endReplaceGroup();
            }
            Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, 11, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default);
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
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String displayName = this.c.getDisplayName();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f2 = jg1.k;
            Modifier modifierThen = modifierFillMaxWidth$default2.then(((Boolean) mutableState.getValue()).booleanValue() ? BasicMarqueeKt.m281basicMarquee1Mj1MLw$default(companion, Integer.MAX_VALUE, 0, 0, 0, null, jg1.k, 30, null) : companion);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            TextStyle bodyMedium = materialTheme.getTypography(composer, i3).getBodyMedium();
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean z3 = this.d;
            if (zBooleanValue) {
                j = jg1.e;
            } else if (z3) {
                j = jg1.j;
            } else {
                j = z ? jg1.i : jg1.f;
            }
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            TextKt.m3048TextNvy7gAk(displayName, modifierThen, j, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, composer, 0, 24960, 110584);
            Composer composer2 = composer;
            String str = this.e;
            if (str.length() > 0) {
                composer2.startReplaceGroup(189799049);
                TextStyle labelSmall = materialTheme.getTypography(composer2, i3).getLabelSmall();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(jg1.e, 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM5151copywmQWz5c$default = z3 ? Color.m5151copywmQWz5c$default(jg1.j, 0.72f, 0.0f, 0.0f, 0.0f, 14, null) : jg1.h;
                }
                TextKt.m3048TextNvy7gAk(str, null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, labelSmall, composer2, 0, 24960, 110586);
                composer2 = composer2;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(190535392);
                composer2.endReplaceGroup();
            }
            if (x2.m(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
