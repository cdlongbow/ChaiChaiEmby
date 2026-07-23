package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev implements Function3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ev(String str, List list, boolean z, String str2, Function1 function1, FocusRequester focusRequester) {
        this.c = str;
        this.d = list;
        this.b = z;
        this.e = str2;
        this.g = function1;
        this.h = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.h;
        Function function = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                return ContextMenuScope.item$lambda$0((Function2) obj7, (ContextMenuScope) obj6, (Modifier) obj5, this.b, (Function3) function, (Function0) obj4, (ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                String str = (String) obj7;
                List list = (List) obj6;
                String str2 = (String) obj5;
                Function1 function1 = (Function1) function;
                FocusRequester focusRequester = (FocusRequester) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1229439096, iIntValue, -1, "com.dh.myembyapp.ui.components.HomeRouteSwitchDialog.<anonymous>.<anonymous>.<anonymous> (HomeMediaMenuDialog.kt:282)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str, null, materialTheme.getColorScheme(composer, i3).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getTitleMedium(), composer, 0, 0, 131066);
                    Modifier modifierM1051heightInVpY3zN4 = SizeKt.m1051heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(180.0f), Dp.m7813constructorimpl(460.0f));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(6.0f), 1, null);
                    boolean zChangedInstance = composer.changedInstance(list);
                    boolean z = this.b;
                    boolean zChanged = composer.changed(z) | zChangedInstance | composer.changed(str2) | composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        mn0 mn0Var = new mn0(list, z, str2, focusRequester, function1);
                        composer.updateRememberedValue(mn0Var);
                        objRememberedValue = mn0Var;
                    }
                    LazyDslKt.LazyColumn(modifierM1051heightInVpY3zN4, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24966, 490);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ev(Function2 function2, ContextMenuScope contextMenuScope, Modifier modifier, boolean z, Function3 function3, Function0 function0) {
        this.c = function2;
        this.d = contextMenuScope;
        this.e = modifier;
        this.b = z;
        this.g = function3;
        this.h = function0;
    }
}
