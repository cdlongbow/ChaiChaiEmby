package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rz implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ FocusRequester c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ rz(c00 c00Var, u61 u61Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, Function0 function0) {
        this.d = u61Var;
        this.e = mutableState;
        this.g = mutableState2;
        this.p = c00Var;
        this.c = focusRequester;
        this.h = mutableState3;
        this.i = mutableState4;
        this.j = mutableState5;
        this.k = mutableState6;
        this.l = mutableState7;
        this.m = mutableState8;
        this.q = focusRequester2;
        this.b = function0;
        this.r = focusRequester3;
        this.n = mutableState9;
        this.o = mutableState10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        Object obj7 = this.n;
        Object obj8 = this.m;
        Object obj9 = this.l;
        Object obj10 = this.k;
        Object obj11 = this.j;
        Object obj12 = this.i;
        Object obj13 = this.h;
        Object obj14 = this.g;
        Object obj15 = this.e;
        Object obj16 = this.d;
        switch (i) {
            case 0:
                final u61 u61Var = (u61) obj16;
                final MutableState mutableState = (MutableState) obj15;
                final MutableState mutableState2 = (MutableState) obj14;
                final c00 c00Var = (c00) obj5;
                final MutableState mutableState3 = (MutableState) obj13;
                final MutableState mutableState4 = (MutableState) obj12;
                final MutableState mutableState5 = (MutableState) obj11;
                final MutableState mutableState6 = (MutableState) obj10;
                final MutableState mutableState7 = (MutableState) obj9;
                final MutableState mutableState8 = (MutableState) obj8;
                final FocusRequester focusRequester = (FocusRequester) obj4;
                final FocusRequester focusRequester2 = (FocusRequester) obj3;
                final MutableState mutableState9 = (MutableState) obj7;
                final MutableState mutableState10 = (MutableState) obj6;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485818827, iIntValue, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen.<anonymous> (DanmakuSettingsScreen.kt:545)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(1180.0f)), Dp.m7813constructorimpl(720.0f));
                    CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
                    final FocusRequester focusRequester3 = this.c;
                    final Function0 function0 = this.b;
                    CardKt.Card(modifierM1050height3ABfNKs, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(98323651, true, new Function3() { // from class: tz
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj17, Object obj18, Object obj19) {
                            Composer composer2 = (Composer) obj18;
                            int iIntValue2 = ((Integer) obj19).intValue();
                            ((ColumnScope) obj17).getClass();
                            if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(98323651, iIntValue2, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsScreen.kt:559)");
                                }
                                b00.b(mutableState, mutableState2, u61Var, c00Var, focusRequester3, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, focusRequester, function0, focusRequester2, mutableState9, mutableState10, PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(32.0f)), composer2);
                                if (ComposerKt.isTraceInProgress()) {
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
                break;
            default:
                final Function0 function1 = (Function0) obj16;
                final Function0 function2 = (Function0) obj15;
                final Function0 function3 = (Function0) obj14;
                final Function0 function4 = (Function0) obj13;
                final Function0 function5 = (Function0) obj12;
                final Function0 function6 = (Function0) obj11;
                final Function0 function7 = (Function0) obj10;
                final Function0 function8 = (Function0) obj9;
                final Function0 function9 = (Function0) obj8;
                final Function0 function10 = (Function0) obj7;
                final Function0 function11 = (Function0) obj6;
                final Function0 function12 = (Function0) obj5;
                final Function0 function13 = (Function0) obj4;
                final Function0 function14 = (Function0) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1088304054, iIntValue2, -1, "com.dh.myembyapp.ui.components.SettingsDialog.<anonymous> (SettingsDialog.kt:81)");
                    }
                    final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue == companion3.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                    }
                    final u61 u61Var2 = (u61) composer2.consume(n72.b);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion3.getEmpty()) {
                        objRememberedValue2 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue2;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        objRememberedValue3 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) objRememberedValue3;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    final BringIntoViewRequester bringIntoViewRequester3 = (BringIntoViewRequester) objRememberedValue4;
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    final BringIntoViewRequester bringIntoViewRequester4 = (BringIntoViewRequester) objRememberedValue5;
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (objRememberedValue6 == companion3.getEmpty()) {
                        objRememberedValue6 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    final BringIntoViewRequester bringIntoViewRequester5 = (BringIntoViewRequester) objRememberedValue6;
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion3.getEmpty()) {
                        objRememberedValue7 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    final BringIntoViewRequester bringIntoViewRequester6 = (BringIntoViewRequester) objRememberedValue7;
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (objRememberedValue8 == companion3.getEmpty()) {
                        objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    final BringIntoViewRequester bringIntoViewRequester7 = (BringIntoViewRequester) objRememberedValue8;
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (objRememberedValue9 == companion3.getEmpty()) {
                        objRememberedValue9 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    final BringIntoViewRequester bringIntoViewRequester8 = (BringIntoViewRequester) objRememberedValue9;
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (objRememberedValue10 == companion3.getEmpty()) {
                        objRememberedValue10 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    final BringIntoViewRequester bringIntoViewRequester9 = (BringIntoViewRequester) objRememberedValue10;
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (objRememberedValue11 == companion3.getEmpty()) {
                        objRememberedValue11 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    final BringIntoViewRequester bringIntoViewRequester10 = (BringIntoViewRequester) objRememberedValue11;
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (objRememberedValue12 == companion3.getEmpty()) {
                        objRememberedValue12 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    final BringIntoViewRequester bringIntoViewRequester11 = (BringIntoViewRequester) objRememberedValue12;
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (objRememberedValue13 == companion3.getEmpty()) {
                        objRememberedValue13 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue13);
                    }
                    final BringIntoViewRequester bringIntoViewRequester12 = (BringIntoViewRequester) objRememberedValue13;
                    Object objRememberedValue14 = composer2.rememberedValue();
                    if (objRememberedValue14 == companion3.getEmpty()) {
                        objRememberedValue14 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue14);
                    }
                    final BringIntoViewRequester bringIntoViewRequester13 = (BringIntoViewRequester) objRememberedValue14;
                    Object objRememberedValue15 = composer2.rememberedValue();
                    if (objRememberedValue15 == companion3.getEmpty()) {
                        objRememberedValue15 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue15);
                    }
                    final BringIntoViewRequester bringIntoViewRequester14 = (BringIntoViewRequester) objRememberedValue15;
                    Object objRememberedValue16 = composer2.rememberedValue();
                    if (objRememberedValue16 == companion3.getEmpty()) {
                        objRememberedValue16 = BringIntoViewRequesterKt.BringIntoViewRequester();
                        composer2.updateRememberedValue(objRememberedValue16);
                    }
                    final BringIntoViewRequester bringIntoViewRequester15 = (BringIntoViewRequester) objRememberedValue16;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default2 = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), u61Var2.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default2);
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
                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(380.0f)), 0.0f, Dp.m7813constructorimpl(460.0f), 1, null);
                    CardColors cardColorsM2119cardColorsro_MJ89 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14);
                    final Function0 function15 = this.b;
                    final FocusRequester focusRequester4 = this.c;
                    CardKt.Card(modifierM1052heightInVpY3zN4$default, null, cardColorsM2119cardColorsro_MJ89, null, null, ComposableLambdaKt.rememberComposableLambda(-391943506, true, new Function3() { // from class: gz1
                        /* JADX WARN: Type inference failed for: r9v12 */
                        /* JADX WARN: Type inference failed for: r9v13, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r9v15 */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj17, Object obj18, Object obj19) {
                            final Object r9;
                            int i4;
                            Object obj20;
                            Composer composer3 = (Composer) obj18;
                            int iIntValue3 = ((Integer) obj19).intValue();
                            ((ColumnScope) obj17).getClass();
                            if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-391943506, iIntValue3, -1, "com.dh.myembyapp.ui.components.SettingsDialog.<anonymous>.<anonymous>.<anonymous> (SettingsDialog.kt:120)");
                                }
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), Dp.m7813constructorimpl(20.0f));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f));
                                Alignment.Companion companion7 = Alignment.INSTANCE;
                                final int i5 = 6;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion7.getStart(), composer3, 6);
                                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs);
                                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i7 = MaterialTheme.$stable;
                                TextKt.m3048TextNvy7gAk("设置", null, materialTheme.getColorScheme(composer3, i7).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i7).getTitleMedium(), composer3, 6, 0, 131066);
                                id.i(4.0f, companion6, composer3, 6);
                                final BringIntoViewRequester bringIntoViewRequester16 = bringIntoViewRequester6;
                                Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester16);
                                final int i8 = 0;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester);
                                Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl4, Integer.valueOf(i9), composerM4318constructorimpl4));
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                final Function0 function16 = function1;
                                boolean zChanged = composer3.changed(function16);
                                Function0 function17 = function2;
                                boolean zChanged2 = zChanged | composer3.changed(function17);
                                Object objRememberedValue17 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue17 = new hh0(27, function16, function17);
                                    composer3.updateRememberedValue(objRememberedValue17);
                                }
                                Function0 function18 = (Function0) objRememberedValue17;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                boolean zChangedInstance = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester16);
                                Object objRememberedValue18 = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue18 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i5) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester16);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue18);
                                }
                                kz1.a("主题", function18, focusRequester4, (Function0) objRememberedValue18, composer3, 390, 0);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester17 = bringIntoViewRequester;
                                Modifier modifierBringIntoViewRequester2 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester17);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i10 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester2);
                                Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i10), composerM4318constructorimpl5));
                                boolean zChanged3 = composer3.changed(function16);
                                final Function0 function19 = function3;
                                boolean zChanged4 = zChanged3 | composer3.changed(function19);
                                Object objRememberedValue19 = composer3.rememberedValue();
                                final int i11 = 3;
                                if (zChanged4 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue19 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function19.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue19);
                                }
                                Function0 function20 = (Function0) objRememberedValue19;
                                boolean zChangedInstance2 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester17);
                                Object objRememberedValue20 = composer3.rememberedValue();
                                final int i12 = 8;
                                if (zChangedInstance2 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue20 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester17);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue20);
                                }
                                kz1.a("弹幕设置", function20, null, (Function0) objRememberedValue20, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester18 = bringIntoViewRequester2;
                                Modifier modifierBringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester18);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i13 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester3);
                                Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl6, currentCompositionLocalMap6);
                                Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl6, Integer.valueOf(i13), composerM4318constructorimpl6));
                                boolean zChanged5 = composer3.changed(function16);
                                final Function0 function21 = function4;
                                boolean zChanged6 = zChanged5 | composer3.changed(function21);
                                Object objRememberedValue21 = composer3.rememberedValue();
                                final int i14 = 4;
                                if (zChanged6 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue21 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function21.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue21);
                                }
                                Function0 function22 = (Function0) objRememberedValue21;
                                boolean zChangedInstance3 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester18);
                                Object objRememberedValue22 = composer3.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                    final int i15 = 10;
                                    objRememberedValue22 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester18);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue22);
                                }
                                kz1.a("代理配置", function22, null, (Function0) objRememberedValue22, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester19 = bringIntoViewRequester3;
                                Modifier modifierBringIntoViewRequester4 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester19);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i16 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester4);
                                Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM4318constructorimpl7, currentCompositionLocalMap7);
                                Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl7, Integer.valueOf(i16), composerM4318constructorimpl7));
                                boolean zChanged7 = composer3.changed(function16);
                                final Function0 function23 = function5;
                                boolean zChanged8 = zChanged7 | composer3.changed(function23);
                                Object objRememberedValue23 = composer3.rememberedValue();
                                if (zChanged8 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue23 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i8) {
                                                case 0:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function23.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue23);
                                }
                                Function0 function24 = (Function0) objRememberedValue23;
                                boolean zChangedInstance4 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester19);
                                Object objRememberedValue24 = composer3.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                    final int i17 = 9;
                                    objRememberedValue24 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i17) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester19);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue24);
                                }
                                kz1.a("DLNA 投屏", function24, null, (Function0) objRememberedValue24, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester20 = bringIntoViewRequester4;
                                Modifier modifierBringIntoViewRequester5 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester20);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i18 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester5);
                                Function0<ComposeUiNode> constructor8 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor8);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM4318constructorimpl8, currentCompositionLocalMap8);
                                Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl8, Integer.valueOf(i18), composerM4318constructorimpl8));
                                boolean zChanged9 = composer3.changed(function16);
                                final Function0 function25 = function6;
                                boolean zChanged10 = zChanged9 | composer3.changed(function25);
                                Object objRememberedValue25 = composer3.rememberedValue();
                                final int i19 = 5;
                                if (zChanged10 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue25 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function25.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue25);
                                }
                                Function0 function26 = (Function0) objRememberedValue25;
                                boolean zChangedInstance5 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester20);
                                Object objRememberedValue26 = composer3.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                    final int i20 = 11;
                                    objRememberedValue26 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i20) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester20);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue26);
                                }
                                kz1.a("缓冲设置", function26, null, (Function0) objRememberedValue26, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester21 = bringIntoViewRequester5;
                                Modifier modifierBringIntoViewRequester6 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester21);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i21 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester6);
                                Function0<ComposeUiNode> constructor9 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor9);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM4318constructorimpl9, currentCompositionLocalMap9);
                                Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl9, Integer.valueOf(i21), composerM4318constructorimpl9));
                                boolean zChanged11 = composer3.changed(function16);
                                final Function0 function27 = function7;
                                boolean zChanged12 = zChanged11 | composer3.changed(function27);
                                Object objRememberedValue27 = composer3.rememberedValue();
                                if (zChanged12 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue27 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i5) {
                                                case 0:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function27.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue27);
                                }
                                Function0 function28 = (Function0) objRememberedValue27;
                                boolean zChangedInstance6 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester21);
                                Object objRememberedValue28 = composer3.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                    final int i22 = 12;
                                    objRememberedValue28 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i22) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester21);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue28);
                                }
                                kz1.a("功能配置", function28, null, (Function0) objRememberedValue28, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester22 = bringIntoViewRequester7;
                                Modifier modifierBringIntoViewRequester7 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester22);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i23 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester7);
                                Function0<ComposeUiNode> constructor10 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor10);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM4318constructorimpl10, currentCompositionLocalMap10);
                                Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl10, Integer.valueOf(i23), composerM4318constructorimpl10));
                                boolean zChanged13 = composer3.changed(function16);
                                final Function0 function29 = function8;
                                boolean zChanged14 = zChanged13 | composer3.changed(function29);
                                Object objRememberedValue29 = composer3.rememberedValue();
                                final int i24 = 7;
                                if (zChanged14 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue29 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i24) {
                                                case 0:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function29.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue29);
                                }
                                Function0 function30 = (Function0) objRememberedValue29;
                                boolean zChangedInstance7 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester22);
                                Object objRememberedValue30 = composer3.rememberedValue();
                                if (zChangedInstance7 || objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                    final int i25 = 13;
                                    objRememberedValue30 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i25) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester22);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue30);
                                }
                                kz1.a("扫码网络", function30, null, (Function0) objRememberedValue30, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester23 = bringIntoViewRequester8;
                                Modifier modifierBringIntoViewRequester8 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester23);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i26 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester8);
                                Function0<ComposeUiNode> constructor11 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor11);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl11, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM4318constructorimpl11, currentCompositionLocalMap11);
                                Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl11, Integer.valueOf(i26), composerM4318constructorimpl11));
                                boolean zChanged15 = composer3.changed(function16);
                                final Function0 function31 = function9;
                                boolean zChanged16 = zChanged15 | composer3.changed(function31);
                                Object objRememberedValue31 = composer3.rememberedValue();
                                if (zChanged16 || objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue31 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function31.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue31);
                                }
                                Function0 function32 = (Function0) objRememberedValue31;
                                boolean zChangedInstance8 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester23);
                                Object objRememberedValue32 = composer3.rememberedValue();
                                if (zChangedInstance8 || objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue32 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i8) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester23);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue32);
                                }
                                kz1.a("管理字体", function32, null, (Function0) objRememberedValue32, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester24 = bringIntoViewRequester9;
                                Modifier modifierBringIntoViewRequester9 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester24);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode12 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i27 = (int) (currentCompositeKeyHashCode12 ^ (currentCompositeKeyHashCode12 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester9);
                                Function0<ComposeUiNode> constructor12 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor12);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl12 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl12, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM4318constructorimpl12, currentCompositionLocalMap12);
                                Updater.m4326setimpl(composerM4318constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl12, Integer.valueOf(i27), composerM4318constructorimpl12));
                                boolean zChanged17 = composer3.changed(function16);
                                Function0 function33 = function10;
                                boolean zChanged18 = zChanged17 | composer3.changed(function33);
                                Object objRememberedValue33 = composer3.rememberedValue();
                                if (zChanged18 || objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue33 = new hh0(25, function16, function33);
                                    composer3.updateRememberedValue(objRememberedValue33);
                                }
                                Function0 function34 = (Function0) objRememberedValue33;
                                boolean zChangedInstance9 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester24);
                                Object objRememberedValue34 = composer3.rememberedValue();
                                if (zChangedInstance9 || objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                    r9 = 1;
                                    final char c = 1 == true ? 1 : 0;
                                    objRememberedValue34 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (c) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester24);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue34);
                                } else {
                                    r9 = 1;
                                }
                                kz1.a("在线字幕配置", function34, null, (Function0) objRememberedValue34, composer3, 6, 4);
                                composer3.endNode();
                                final BringIntoViewRequester bringIntoViewRequester25 = bringIntoViewRequester10;
                                Modifier modifierBringIntoViewRequester10 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester25);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode13 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i28 = (int) (currentCompositeKeyHashCode13 ^ (currentCompositeKeyHashCode13 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester10);
                                Function0<ComposeUiNode> constructor13 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor13);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl13 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl13, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM4318constructorimpl13, currentCompositionLocalMap13);
                                Updater.m4326setimpl(composerM4318constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl13, Integer.valueOf(i28), composerM4318constructorimpl13));
                                boolean zChanged19 = composer3.changed(function16);
                                Function0 function35 = function11;
                                boolean zChanged20 = zChanged19 | composer3.changed(function35);
                                Object objRememberedValue35 = composer3.rememberedValue();
                                if (zChanged20 || objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue35 = new hh0(26, function16, function35);
                                    composer3.updateRememberedValue(objRememberedValue35);
                                }
                                Function0 function36 = (Function0) objRememberedValue35;
                                boolean zChangedInstance10 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester25);
                                Object objRememberedValue36 = composer3.rememberedValue();
                                final int i29 = 2;
                                if (zChangedInstance10 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue36 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i29) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester25);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue36);
                                }
                                kz1.a("WebDAV 同步", function36, null, (Function0) objRememberedValue36, composer3, 6, 4);
                                composer3.endNode();
                                Function0 function37 = function15;
                                if (function37 != null) {
                                    composer3.startReplaceGroup(-749055521);
                                    final BringIntoViewRequester bringIntoViewRequester26 = bringIntoViewRequester11;
                                    Modifier modifierBringIntoViewRequester11 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester26);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                    long currentCompositeKeyHashCode14 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i30 = (int) (currentCompositeKeyHashCode14 ^ (currentCompositeKeyHashCode14 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap14 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester11);
                                    Function0<ComposeUiNode> constructor14 = companion8.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor14);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM4318constructorimpl14 = Updater.m4318constructorimpl(composer3);
                                    mr.z(companion8, composerM4318constructorimpl14, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM4318constructorimpl14, currentCompositionLocalMap14);
                                    Updater.m4326setimpl(composerM4318constructorimpl14, modifierMaterializeModifier14, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl14, Integer.valueOf(i30), composerM4318constructorimpl14));
                                    boolean zChanged21 = composer3.changed(function16) | composer3.changed(function37);
                                    Object objRememberedValue37 = composer3.rememberedValue();
                                    if (zChanged21 || objRememberedValue37 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue37 = new hh0(28, function16, function37);
                                        composer3.updateRememberedValue(objRememberedValue37);
                                    }
                                    Function0 function38 = (Function0) objRememberedValue37;
                                    boolean zChangedInstance11 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester26);
                                    Object objRememberedValue38 = composer3.rememberedValue();
                                    if (zChangedInstance11 || objRememberedValue38 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue38 = new Function0() { // from class: hz1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i11) {
                                                    case 0:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 1:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 2:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 3:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 4:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 5:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 6:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 7:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 8:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 9:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 10:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 11:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    case 12:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                    default:
                                                        kz1.c(coroutineScope2, bringIntoViewRequester26);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue38);
                                    }
                                    kz1.a("Trakt 同步", function38, null, (Function0) objRememberedValue38, composer3, 6, 4);
                                    composer3.endNode();
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-748564450);
                                    composer3.endReplaceGroup();
                                }
                                final BringIntoViewRequester bringIntoViewRequester27 = bringIntoViewRequester12;
                                Modifier modifierBringIntoViewRequester12 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester27);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy14 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode15 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i31 = (int) (currentCompositeKeyHashCode15 ^ (currentCompositeKeyHashCode15 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap15 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester12);
                                Function0<ComposeUiNode> constructor15 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor15);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl15 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl15, measurePolicyMaybeCachedBoxMeasurePolicy14, composerM4318constructorimpl15, currentCompositionLocalMap15);
                                Updater.m4326setimpl(composerM4318constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl15, Integer.valueOf(i31), composerM4318constructorimpl15));
                                boolean zChanged22 = composer3.changed(function16);
                                Function0 function39 = function12;
                                boolean zChanged23 = zChanged22 | composer3.changed(function39);
                                Object objRememberedValue39 = composer3.rememberedValue();
                                if (zChanged23 || objRememberedValue39 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue39 = new hh0(29, function16, function39);
                                    composer3.updateRememberedValue(objRememberedValue39);
                                }
                                Function0 function40 = (Function0) objRememberedValue39;
                                boolean zChangedInstance12 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester27);
                                Object objRememberedValue40 = composer3.rememberedValue();
                                if (zChangedInstance12 || objRememberedValue40 == Composer.INSTANCE.getEmpty()) {
                                    final int i32 = 4;
                                    objRememberedValue40 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i32) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester27);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue40);
                                }
                                kz1.a("清除缓存", function40, null, (Function0) objRememberedValue40, composer3, 6, 4);
                                composer3.endNode();
                                composer3.startReplaceGroup(-748003691);
                                final BringIntoViewRequester bringIntoViewRequester28 = bringIntoViewRequester13;
                                Modifier modifierBringIntoViewRequester13 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester28);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy15 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode16 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i33 = (int) (currentCompositeKeyHashCode16 ^ (currentCompositeKeyHashCode16 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap16 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester13);
                                Function0<ComposeUiNode> constructor16 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor16);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl16 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl16, measurePolicyMaybeCachedBoxMeasurePolicy15, composerM4318constructorimpl16, currentCompositionLocalMap16);
                                Updater.m4326setimpl(composerM4318constructorimpl16, modifierMaterializeModifier16, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl16, Integer.valueOf(i33), composerM4318constructorimpl16));
                                boolean zChanged24 = composer3.changed(function16);
                                final Function0 function41 = function13;
                                boolean zChanged25 = zChanged24 | composer3.changed(function41);
                                Object objRememberedValue41 = composer3.rememberedValue();
                                if (zChanged25 || objRememberedValue41 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue41 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (r9) {
                                                case 0:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function41.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue41);
                                }
                                Function0 function42 = (Function0) objRememberedValue41;
                                boolean zChangedInstance13 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester28);
                                Object objRememberedValue42 = composer3.rememberedValue();
                                if (zChangedInstance13 || objRememberedValue42 == Composer.INSTANCE.getEmpty()) {
                                    final int i34 = 5;
                                    objRememberedValue42 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i34) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester28);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue42);
                                }
                                kz1.a("检查更新", function42, null, (Function0) objRememberedValue42, composer3, 6, 4);
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                final BringIntoViewRequester bringIntoViewRequester29 = bringIntoViewRequester14;
                                Modifier modifierBringIntoViewRequester14 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester29);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy16 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode17 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i35 = (int) (currentCompositeKeyHashCode17 ^ (currentCompositeKeyHashCode17 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap17 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester14);
                                Function0<ComposeUiNode> constructor17 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor17);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl17 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl17, measurePolicyMaybeCachedBoxMeasurePolicy16, composerM4318constructorimpl17, currentCompositionLocalMap17);
                                Updater.m4326setimpl(composerM4318constructorimpl17, modifierMaterializeModifier17, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl17, Integer.valueOf(i35), composerM4318constructorimpl17));
                                boolean zChanged26 = composer3.changed(function16);
                                final Function0 function43 = function14;
                                boolean zChanged27 = zChanged26 | composer3.changed(function43);
                                Object objRememberedValue43 = composer3.rememberedValue();
                                if (zChanged27 || objRememberedValue43 == Composer.INSTANCE.getEmpty()) {
                                    final int i36 = 2;
                                    objRememberedValue43 = new Function0() { // from class: iz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i36) {
                                                case 0:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                case 1:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                case 2:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                case 3:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                case 4:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                case 5:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                case 6:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                case 7:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                                default:
                                                    function16.invoke();
                                                    function43.invoke();
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue43);
                                }
                                Function0 function44 = (Function0) objRememberedValue43;
                                boolean zChangedInstance14 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester29);
                                Object objRememberedValue44 = composer3.rememberedValue();
                                if (zChangedInstance14 || objRememberedValue44 == Composer.INSTANCE.getEmpty()) {
                                    final int i37 = 7;
                                    objRememberedValue44 = new Function0() { // from class: hz1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i37) {
                                                case 0:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 1:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 2:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 3:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 4:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 5:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 6:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 7:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 8:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 9:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 10:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 11:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                case 12:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                                default:
                                                    kz1.c(coroutineScope2, bringIntoViewRequester29);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue44);
                                }
                                kz1.a("请作者喝奶茶", function44, null, (Function0) objRememberedValue44, composer3, 6, 4);
                                composer3.endNode();
                                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion6, Dp.m7813constructorimpl(4.0f)), composer3, 6);
                                BringIntoViewRequester bringIntoViewRequester30 = bringIntoViewRequester15;
                                Modifier modifierBringIntoViewRequester15 = BringIntoViewRequesterKt.bringIntoViewRequester(companion6, bringIntoViewRequester30);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy17 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                                long currentCompositeKeyHashCode18 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                int i38 = (int) (currentCompositeKeyHashCode18 ^ (currentCompositeKeyHashCode18 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap18 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer3, modifierBringIntoViewRequester15);
                                Function0<ComposeUiNode> constructor18 = companion8.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor18);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4318constructorimpl18 = Updater.m4318constructorimpl(composer3);
                                mr.z(companion8, composerM4318constructorimpl18, measurePolicyMaybeCachedBoxMeasurePolicy17, composerM4318constructorimpl18, currentCompositionLocalMap18);
                                Updater.m4326setimpl(composerM4318constructorimpl18, modifierMaterializeModifier18, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl18, Integer.valueOf(i38), composerM4318constructorimpl18));
                                Object objRememberedValue45 = composer3.rememberedValue();
                                Composer.Companion companion9 = Composer.INSTANCE;
                                if (objRememberedValue45 == companion9.getEmpty()) {
                                    i4 = 2;
                                    obj20 = null;
                                    objRememberedValue45 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composer3.updateRememberedValue(objRememberedValue45);
                                } else {
                                    i4 = 2;
                                    obj20 = null;
                                }
                                MutableState mutableState11 = (MutableState) objRememberedValue45;
                                ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer3, 6, i4);
                                ButtonScale buttonScaleL = hc2.l(1.05f);
                                ButtonGlow buttonGlowA = el0.a(u61Var2);
                                ButtonBorder buttonBorderH = hc2.h(composer3);
                                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, r9, obj20), Dp.m7813constructorimpl(44.0f));
                                boolean zChangedInstance15 = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(bringIntoViewRequester30);
                                Object objRememberedValue46 = composer3.rememberedValue();
                                if (zChangedInstance15 || objRememberedValue46 == companion9.getEmpty()) {
                                    objRememberedValue46 = new if1(bringIntoViewRequester30, mutableState11, coroutineScope2, 7);
                                    composer3.updateRememberedValue(objRememberedValue46);
                                }
                                ButtonKt.m8231ButtonTCVpFMg(function16, FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue46), null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(176377419, r9, new w91(17, mutableState11), composer3, 54), composer3, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                if (x2.m(composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 196614, 26);
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

    public /* synthetic */ rz(Function0 function0, Function0 function1, Function0 function2, FocusRequester focusRequester, Function0 function3, Function0 function4, Function0 function5, Function0 function6, Function0 function7, Function0 function8, Function0 function9, Function0 function10, Function0 function11, Function0 function12, Function0 function13, Function0 function14) {
        this.b = function0;
        this.d = function1;
        this.e = function2;
        this.c = focusRequester;
        this.g = function3;
        this.h = function4;
        this.i = function5;
        this.j = function6;
        this.k = function7;
        this.l = function8;
        this.m = function9;
        this.n = function10;
        this.o = function11;
        this.p = function12;
        this.q = function13;
        this.r = function14;
    }
}
