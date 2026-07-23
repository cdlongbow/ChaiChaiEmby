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
import androidx.compose.material.icons.filled.ArrowDownwardKt;
import androidx.compose.material.icons.filled.ArrowUpwardKt;
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
public final /* synthetic */ class z60 implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ z60(uy0 uy0Var, jc2 jc2Var, boolean z, boolean z2, MutableState mutableState) {
        this.e = uy0Var;
        this.g = jc2Var;
        this.b = z;
        this.c = z2;
        this.d = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        long jM5151copywmQWz5c$default;
        int i = this.a;
        MutableState mutableState = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                MediaSource mediaSource = (MediaSource) obj5;
                String str = (String) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1089052631, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeVersionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:9061)");
                    }
                    Modifier modifierM281basicMarquee1Mj1MLw$default = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM281basicMarquee1Mj1MLw$default, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                    Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(zs1.E(RowScopeInstance.INSTANCE, modifierM281basicMarquee1Mj1MLw$default, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, 11, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String displayName = mediaSource.getDisplayName();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifierM281basicMarquee1Mj1MLw$default, 0.0f, 1, null);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        modifierM281basicMarquee1Mj1MLw$default = BasicMarqueeKt.m281basicMarquee1Mj1MLw$default(modifierM281basicMarquee1Mj1MLw$default, Integer.MAX_VALUE, 0, 0, 0, null, u90.B, 30, null);
                    }
                    Modifier modifierThen = modifierFillMaxWidth$default2.then(modifierM281basicMarquee1Mj1MLw$default);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme.getTypography(composer, i4).getBodyMedium();
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        j = u90.c;
                    } else if (z2) {
                        j = u90.n;
                    } else {
                        j = z ? u90.m : u90.j;
                    }
                    long j2 = j;
                    TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
                    TextKt.m3048TextNvy7gAk(displayName, modifierThen, j2, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, composer, 0, 24960, 110584);
                    if (str.length() > 0) {
                        composer.startReplaceGroup(-1891008137);
                        TextStyle labelSmall = materialTheme.getTypography(composer, i4).getLabelSmall();
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(u90.c, 0.72f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM5151copywmQWz5c$default = z2 ? Color.m5151copywmQWz5c$default(u90.n, 0.72f, 0.0f, 0.0f, 0.0f, 14, null) : u90.l;
                        }
                        TextKt.m3048TextNvy7gAk(str, null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, labelSmall, composer, 0, 24960, 110586);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1890266989);
                        composer.endReplaceGroup();
                    }
                    if (x2.m(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                uy0 uy0Var = (uy0) obj5;
                jc2 jc2Var = (jc2) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1925366307, iIntValue2, -1, "com.dh.myembyapp.ui.screens.library.LibrarySortDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LibraryScreen.kt:724)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk(uy0Var.a, null, hc2.k(jc2Var, ((Boolean) mutableState.getValue()).booleanValue(), false, composer2, 0, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262138);
                    Composer composer3 = composer2;
                    if (z2) {
                        composer3.startReplaceGroup(-2081576878);
                        Icons.Filled filled = Icons.INSTANCE.getDefault();
                        IconKt.m2496Iconww6aTOc(z ? ArrowDownwardKt.getArrowDownward(filled) : ArrowUpwardKt.getArrowUpward(filled), (String) null, SizeKt.m1064size3ABfNKs(companion4, Dp.m7813constructorimpl(14.0f)), hc2.k(jc2Var, ((Boolean) mutableState.getValue()).booleanValue(), false, composer3, 0, 4), composer3, 432, 0);
                        composer3 = composer3;
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-2081001239);
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
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

    public /* synthetic */ z60(MutableState mutableState, MediaSource mediaSource, String str, boolean z, boolean z2) {
        this.e = mediaSource;
        this.b = z;
        this.c = z2;
        this.g = str;
        this.d = mutableState;
    }
}
