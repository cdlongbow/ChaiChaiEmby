package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.SavedStateHandle;
import com.badlogic.gdx.graphics.GL20;
import com.dh.myembyapp.MainActivity;
import com.dh.myembyapp.data.api.IqiyiSuggestItem;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.ImageTags;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:132:0x0309 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x030b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0596  */
    /* JADX WARN: Code duplicated, block: B:236:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:246:0x0615  */
    /* JADX WARN: Code duplicated, block: B:80:0x0254  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jM5151copywmQWz5c$default;
        int i;
        int iCompare;
        String imageUrl;
        r40 r40VarM;
        Integer num;
        Integer num2;
        Unit unit;
        int i2 = this.a;
        Unit unit2 = null;
        i = 1;
        int i3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                w2 w2Var = (w2) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1858711016, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous> (AddServerScreen.kt:861)");
                    }
                    boolean zChangedInstance = composer.changedInstance(w2Var);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new m1(w2Var, mutableState, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    hc2.c("确定", (Function0) objRememberedValue, SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(120.0f)), false, null, 0L, 0.0f, 0.0f, composer, 390, 248);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                h3 h3Var = (h3) obj2;
                str.getClass();
                h3Var.getClass();
                ((p7) obj4).g.setValue(str);
                ((Function2) obj3).invoke(h3Var.a.getId(), h3Var.c);
                return Unit.INSTANCE;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                h3 h3Var2 = (h3) obj2;
                h3Var2.getClass();
                String id = h3Var2.b.getId();
                StringBuilder sbZ = kb0.z("favorite:", (String) obj4, ":", (String) obj3, ":");
                sbZ.append(id);
                sbZ.append(":");
                sbZ.append(iIntValue2);
                return sbZ.toString();
            case 3:
                IqiyiSuggestItem iqiyiSuggestItem = (IqiyiSuggestItem) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1404865791, iIntValue3, -1, "com.dh.myembyapp.ui.screens.search.AggregateSuggestTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AggregateSearchContent.kt:431)");
                    }
                    String name = iqiyiSuggestItem.getName();
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme.getTypography(composer2, i4).getBodyLarge();
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        jM5151copywmQWz5c$default = kb0.u(composer2, 2099706182, materialTheme, composer2, i4);
                    } else {
                        composer2.startReplaceGroup(2099803026);
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i4).getOnSurface(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null);
                        composer2.endReplaceGroup();
                    }
                    TextKt.m3048TextNvy7gAk(name, PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f)), jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, bodyLarge, composer2, 48, 24576, 114680);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                return AnchoredDraggableKt.animateTo$lambda$0$1((AnchoredDragScope) obj4, (Ref.FloatRef) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 5:
                ScrollState scrollState = (ScrollState) obj4;
                vc vcVar = (vc) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-638268628, iIntValue4, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:521)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(320.0f), 1, null), scrollState, false, null, false, 14, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String str2 = (String) vcVar.h.getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    TextKt.m3048TextNvy7gAk(str2, null, 0L, null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, TextUnitKt.getSp(20), 0, false, 0, 0, null, null, composer3, 24576, 48, 260078);
                    if (scrollState.getMaxValue() > 0) {
                        composer3.startReplaceGroup(1278889970);
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i7 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk("提示：按遥控器上下键可滚动查看", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer3, i7).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i7).getBodySmall(), composer3, 6, 0, 131066);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1279169466);
                        composer3.endReplaceGroup();
                    }
                    if (x2.m(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) obj4;
                Integer num3 = (Integer) obj3;
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                pair.getClass();
                pair2.getClass();
                boolean zHasDistinctFormatPriorities = AudioVersionPrioritySettings.INSTANCE.hasDistinctFormatPriorities(audioVersionPrioritySettings);
                Iterator<T> it = audioVersionPrioritySettings.getSortTypes().iterator();
                while (it.hasNext()) {
                    int i8 = sg.$EnumSwitchMapping$0[((AudioPrioritySortType) it.next()).ordinal()];
                    if (i8 == 1) {
                        AudioLanguagePreference preferredLanguage = audioVersionPrioritySettings.getPreferredLanguage();
                        AudioLanguagePreference audioLanguagePreference = AudioLanguagePreference.DEFAULT;
                        if (preferredLanguage == audioLanguagePreference) {
                            iCompare = 0;
                        } else {
                            rg rgVar = (rg) pair.getSecond();
                            AudioLanguagePreference preferredLanguage2 = audioVersionPrioritySettings.getPreferredLanguage();
                            int i9 = (preferredLanguage2 == audioLanguagePreference || rgVar.d == preferredLanguage2) ? 0 : 1;
                            rg rgVar2 = (rg) pair2.getSecond();
                            AudioLanguagePreference preferredLanguage3 = audioVersionPrioritySettings.getPreferredLanguage();
                            iCompare = Intrinsics.compare(i9, (preferredLanguage3 == audioLanguagePreference || rgVar2.d == preferredLanguage3) ? 0 : 1);
                        }
                    } else {
                        if (i8 != 2) {
                            qu.f();
                            return null;
                        }
                        if (zHasDistinctFormatPriorities) {
                            iCompare = Intrinsics.compare(tg.b(((rg) pair.getSecond()).e, audioVersionPrioritySettings), tg.b(((rg) pair2.getSecond()).e, audioVersionPrioritySettings));
                        } else {
                            iCompare = 0;
                        }
                    }
                    if (iCompare != 0) {
                        return Integer.valueOf(iCompare);
                    }
                }
                rg rgVar3 = (rg) pair.getSecond();
                if (num3 == null) {
                    i = 0;
                } else {
                    Integer num4 = rgVar3.c;
                    int iIntValue5 = num3.intValue();
                    if (num4 != null && num4.intValue() == iIntValue5) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                }
                rg rgVar4 = (rg) pair2.getSecond();
                if (num3 == null) {
                    i3 = 0;
                } else {
                    Integer num5 = rgVar4.c;
                    int iIntValue6 = num3.intValue();
                    if (num5 != null && num5.intValue() == iIntValue6) {
                        i3 = 0;
                    }
                }
                iCompare = Intrinsics.compare(i, i3);
                if (iCompare == 0) {
                    iCompare = Intrinsics.compare(((Number) pair.getFirst()).intValue(), ((Number) pair2.getFirst()).intValue());
                }
                return Integer.valueOf(iCompare);
            case 7:
                String str3 = (String) obj4;
                TextStyle textStyle = (TextStyle) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(3333687, iIntValue7, -1, "com.dh.myembyapp.ui.components.BackupRouteInputField.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:1586)");
                    }
                    TextKt.m3048TextNvy7gAk(str3, null, Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurface(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer4, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                return BasicTooltipKt.TooltipPopup$lambda$1((String) obj4, (Function2) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return BoxWithConstraintsKt.BoxWithConstraints$lambda$0$0((MeasurePolicy) obj4, (Function3) obj3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
            case 10:
                return CombinedContext.writeReplace$lambda$0((CoroutineContext[]) obj4, (Ref.IntRef) obj3, (Unit) obj, (CoroutineContext.Element) obj2);
            case 11:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$2((TextContextMenuDataProvider) obj4, (TextContextMenuSession) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                Function4 function4 = (Function4) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                Composer composer5 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1459263361, iIntValue8, -1, "com.dh.myembyapp.ui.screens.detail.DetailSupplementPanel.<anonymous> (DetailScreen.kt:7510)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor3);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Boolean bool = (Boolean) mutableState3.getValue();
                    bool.booleanValue();
                    function4.invoke(columnScopeInstance2, bool, composer5, 6);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                return GapComposerKt.deactivateCurrentGroup$lambda$0((RememberManager) obj4, (SlotWriter) obj3, ((Integer) obj).intValue(), obj2);
            case 14:
                return LazyGridDslKt.rememberColumnWidthSums$lambda$0$0((GridCells) obj4, (Arrangement.Horizontal) obj3, (Density) obj, (Constraints) obj2);
            case 15:
                return LazyGridDslKt.rememberRowHeightSums$lambda$0$0((GridCells) obj4, (Arrangement.Vertical) obj3, (Density) obj, (Constraints) obj2);
            case 16:
                return LazyLayoutKt.LazyLayout$lambda$1$3$0((LazyLayoutItemContentFactory) obj4, (LazyLayoutMeasurePolicy) obj3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
            case 17:
                State state = (State) obj4;
                MainActivity mainActivity = (MainActivity) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i11 = MainActivity.d;
                if (composer6.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-552121527, iIntValue9, -1, "com.dh.myembyapp.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:154)");
                    }
                    n72.a(((bc) state.getValue()).getPreset(), ((bc) state.getValue()).getLightBackgroundStyle(), ((bc) state.getValue()).getDarkThemeStyle(), ((bc) state.getValue()).getDarkThemeGlowPosition(), ((bc) state.getValue()).getAccentFollowsTheme(), ((bc) state.getValue()).getDetachedFocusBorderEnabled(), ComposableLambdaKt.rememberComposableLambda(157454831, true, new k21(mainActivity, true ? 1 : 0), composer6, 54), composer6, 1572864);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                va0 va0Var = (va0) obj4;
                NavHostController navHostController = (NavHostController) obj3;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str4.getClass();
                fa0 fa0Var = (fa0) va0Var.h.getValue();
                ea0 ea0Var = fa0Var instanceof ea0 ? (ea0) fa0Var : null;
                if (ea0Var == null) {
                    imageUrl = null;
                } else {
                    MediaItem mediaItem = ea0Var.a;
                    List<String> backdropImageTags = mediaItem.getBackdropImageTags();
                    String str6 = backdropImageTags != null ? (String) CollectionsKt.firstOrNull((List) backdropImageTags) : null;
                    if (str6 != null) {
                        imageUrl = RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Backdrop", str6, 1920);
                    } else {
                        ImageTags imageTags = mediaItem.getImageTags();
                        imageUrl = (imageTags != null ? imageTags.getPrimary() : null) != null ? RetrofitClient.INSTANCE.getImageUrl(mediaItem.getId(), "Primary", mediaItem.getImageTags().getPrimary(), Integer.valueOf(GL20.GL_INVALID_ENUM)) : null;
                    }
                    if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                        imageUrl = null;
                    }
                }
                if (va0Var.h(str4)) {
                    Object value = va0Var.Q.getValue();
                    if (!Intrinsics.areEqual(((r40) value).a, str4)) {
                        value = null;
                    }
                    r40 r40Var = (r40) value;
                    if (r40Var == null) {
                        r40Var = new r40(str4, 6);
                    }
                    r40VarM = va0Var.m(str4, r40Var.b, r40Var.c);
                } else {
                    r40VarM = null;
                }
                if (r40VarM == null) {
                    if (va0Var.i()) {
                        r40 r40Var2 = (r40) ((Map) va0Var.S.getValue()).get(str4);
                        if (r40Var2 == null) {
                            r40Var2 = new r40(str4, 6);
                        }
                        r40VarM = va0Var.l(str4, r40Var2.b, r40Var2.c);
                    } else {
                        r40VarM = null;
                    }
                }
                NavBackStackEntry currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
                if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
                    if (savedStateHandle != null) {
                    }
                } else if (savedStateHandle != null) {
                    savedStateHandle.set("playerPosterUrl", imageUrl);
                }
                if (r40VarM != null && (num2 = r40VarM.b) != null) {
                    int iIntValue10 = num2.intValue();
                    if (savedStateHandle != null) {
                        savedStateHandle.set("playerPreselectAudioStreamIndex", Integer.valueOf(iIntValue10));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        if (savedStateHandle != null) {
                        }
                    }
                } else if (savedStateHandle != null) {
                }
                if (r40VarM != null && (num = r40VarM.c) != null) {
                    int iIntValue11 = num.intValue();
                    if (savedStateHandle != null) {
                        savedStateHandle.set("playerPreselectSubtitleStreamIndex", Integer.valueOf(iIntValue11));
                        unit2 = Unit.INSTANCE;
                    }
                    if (unit2 == null) {
                        if (savedStateHandle != null) {
                        }
                    }
                } else if (savedStateHandle != null) {
                }
                Log.d("MainActivity", "路由: ".concat(ig2.I(str4, str5)));
                NavController.navigate$default((NavController) navHostController, ig2.I(str4, str5), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                return Unit.INSTANCE;
            case 19:
                Function1 function1 = (Function1) obj4;
                on1 on1Var = (on1) obj3;
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                if (((Boolean) obj2).booleanValue()) {
                    function1.invoke(f);
                } else {
                    on1Var.b.setFloatValue(fFloatValue);
                }
                return Unit.INSTANCE;
            case 20:
                lg1 lg1Var = (lg1) obj4;
                kg1 kg1Var = (kg1) obj3;
                Composer composer7 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2034364633, iIntValue12, -1, "com.dh.myembyapp.ui.screens.player.PlayerScreenContent.<anonymous>.<anonymous> (PlayerScreenContent.kt:2898)");
                    }
                    lh1.a(lg1Var, kg1Var, composer7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                MediaStream mediaStream = (MediaStream) obj;
                Uri uri = (Uri) obj2;
                mediaStream.getClass();
                uri.getClass();
                Log.d("SubtitleTrack", "进入转码前已缓存当前内封文本字幕: streamIndex=" + mediaStream.getIndex() + ", uri=" + uri);
                ((Function1) obj4).invoke(((ao1) obj3).a);
                return Unit.INSTANCE;
            case 22:
                u61 u61Var = (u61) obj4;
                w81 w81Var = (w81) obj3;
                Composer composer8 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1657829134, iIntValue13, -1, "com.dh.myembyapp.ui.components.NetworkTestResultDialog.<anonymous> (ProxyConfigDialog.kt:486)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer8, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor4);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer8);
                    mr.z(companion7, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i12), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(500.0f)), null, false, 3, null), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer8, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-123807738, true, new i2(w81Var, 13), composer8, 54), composer8, 196614, 26);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return SelectionContainerKt.SelectionContainer$lambda$9$0$0((Function2) obj4, (SelectionManager) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return SerializableSaverKt.serializableSaver$lambda$0((xv0) obj4, (SavedStateConfiguration) obj3, (SaverScope) obj, obj2);
            case 25:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0((TextFieldSelectionManager) obj4, (CoroutineScope) obj3, (TextContextMenuBuilderScope) obj, (Context) obj2);
            default:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0((TextFieldSelectionState) obj4, (CoroutineScope) obj3, (TextContextMenuBuilderScope) obj, (Context) obj2);
        }
    }
}
