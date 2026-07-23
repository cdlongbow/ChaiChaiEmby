package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f8 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ f8(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.b = composableLambdaImpl;
        this.d = obj;
        this.e = obj2;
        this.i = obj3;
        this.h = obj4;
        this.g = obj5;
        this.j = obj6;
        this.k = obj7;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.h;
        Object obj7 = this.i;
        Object obj8 = this.d;
        Object obj9 = this.e;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m8.e((String) obj10, (Function1) obj9, (Function0) obj6, (FocusRequester) obj3, (FocusRequester) obj5, (String) obj8, (Function1) obj7, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                final String str = (String) obj10;
                final Set set = (Set) obj7;
                final String str2 = (String) obj8;
                final ch chVar = (ch) obj5;
                final Function1 function1 = (Function1) obj9;
                final FocusRequester focusRequester = (FocusRequester) obj3;
                final Function0 function0 = (Function0) obj6;
                final Function0 function2 = (Function0) obj4;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1715180287, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteManualImportDialog.<anonymous> (BackupRouteManagerDialog.kt:1236)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM275backgroundbw27NRU$default);
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(560.0f)), 0.0f, Dp.m7813constructorimpl(520.0f), 1, null);
                    CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
                    final int i4 = this.c;
                    CardKt.Card(modifierM1052heightInVpY3zN4$default, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(1818327815, true, new Function3() { // from class: qh
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
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            char c;
                            Composer composer2 = (Composer) obj12;
                            int iIntValue2 = ((Integer) obj13).intValue();
                            ((ColumnScope) obj11).getClass();
                            if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1818327815, iIntValue2, -1, "com.dh.myembyapp.ui.components.BackupRouteManualImportDialog.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:1248)");
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion4.getStart(), composer2, 6);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                                mr.z(companion5, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i6 = MaterialTheme.$stable;
                                TextKt.m3048TextNvy7gAk("手动选择备选线路", null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i6).getTitleMedium(), composer2, 1572870, 0, 131006);
                                TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i6).getOnSurface(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i6).getBodyMedium(), composer2, 0, 0, 131066);
                                Set set2 = set;
                                String strK = c61.k("已选择 ", set2.size(), i4, " / ", " 条");
                                TextStyle bodySmall = materialTheme.getTypography(composer2, i6).getBodySmall();
                                if (ComposerKt.isTraceInProgress()) {
                                    c = 6;
                                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                                } else {
                                    c = 6;
                                }
                                u61 u61Var = (u61) composer2.consume(n72.b);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                TextKt.m3048TextNvy7gAk(strK, null, u61Var.P, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer2, 0, 0, 131066);
                                Composer composer3 = composer2;
                                String str3 = str2;
                                if (str3 == null || StringsKt.isBlank(str3)) {
                                    composer3.startReplaceGroup(673141841);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(672905714);
                                    TextKt.m3048TextNvy7gAk(str3, null, materialTheme.getColorScheme(composer3, i6).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i6).getBodySmall(), composer3, 0, 0, 131066);
                                    composer3 = composer3;
                                    composer3.endReplaceGroup();
                                }
                                Modifier modifierM1051heightInVpY3zN4 = SizeKt.m1051heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(180.0f), Dp.m7813constructorimpl(300.0f));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                                PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(6.0f), 1, null);
                                ch chVar2 = chVar;
                                boolean zChangedInstance = composer3.changedInstance(chVar2) | composer3.changedInstance(set2);
                                Function1 function3 = function1;
                                boolean zChanged = zChangedInstance | composer3.changed(function3);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    g9 g9Var = new g9(chVar2, set2, focusRequester, function3, 2);
                                    composer3.updateRememberedValue(g9Var);
                                    objRememberedValue = g9Var;
                                }
                                Composer composer4 = composer3;
                                LazyDslKt.LazyColumn(modifierM1051heightInVpY3zN4, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue, composer4, 24966, 490);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion4.getTop(), composer4, 6);
                                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer4);
                                mr.z(companion5, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i7), composerM4318constructorimpl3));
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion4.getTop(), composer4, 6);
                                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, companion3);
                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer4);
                                mr.z(companion5, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i8), composerM4318constructorimpl4));
                                pi.a(function0, SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(110.0f)), bh.b, vs.m, composer4, 3504);
                                pi.a(function2, SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(110.0f)), bh.c, vs.n, composer4, 3504);
                                if (i02.w(composer4)) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, 196614, 26);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                return ComposableLambdaImpl.invoke$lambda$6((ComposableLambdaImpl) obj10, this.d, this.e, this.i, this.h, this.g, this.j, this.k, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                ((Integer) obj2).getClass();
                qy.c((String) obj10, (String) obj8, (String) obj9, (String) obj7, (Integer) obj3, (Integer) obj5, (Function0) obj6, (Function4) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                return DateInputKt.DateInputContent$lambda$3((Long) obj10, (Function1) obj9, (CalendarModel) obj8, (IntRange) obj7, (DatePickerFormatter) obj6, (SelectableDates) obj5, (DatePickerColors) obj4, (FocusRequester) obj3, this.c, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ f8(Long l, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i) {
        this.b = l;
        this.e = function1;
        this.d = calendarModel;
        this.i = intRange;
        this.h = datePickerFormatter;
        this.j = selectableDates;
        this.k = datePickerColors;
        this.g = focusRequester;
        this.c = i;
    }

    public /* synthetic */ f8(String str, String str2, String str3, String str4, Integer num, Integer num2, Function0 function0, Function4 function4, int i) {
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.i = str4;
        this.g = num;
        this.j = num2;
        this.h = function0;
        this.k = function4;
        this.c = i;
    }

    public /* synthetic */ f8(String str, Set set, int i, String str2, ch chVar, Function1 function1, FocusRequester focusRequester, Function0 function0, Function0 function2) {
        this.b = str;
        this.i = set;
        this.c = i;
        this.d = str2;
        this.j = chVar;
        this.e = function1;
        this.g = focusRequester;
        this.h = function0;
        this.k = function2;
    }

    public /* synthetic */ f8(String str, Function1 function1, Function0 function0, FocusRequester focusRequester, FocusRequester focusRequester2, String str2, Function1 function2, Modifier modifier, int i) {
        this.b = str;
        this.e = function1;
        this.h = function0;
        this.g = focusRequester;
        this.j = focusRequester2;
        this.d = str2;
        this.i = function2;
        this.k = modifier;
        this.c = i;
    }
}
