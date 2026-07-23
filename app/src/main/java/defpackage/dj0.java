package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.PsExtractor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dj0 implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ FocusRequester b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ dj0(u61 u61Var, MutableState mutableState, FocusRequester focusRequester, String str, List list, Function0 function0, Function1 function1) {
        this.g = function0;
        this.b = focusRequester;
        this.h = u61Var;
        this.i = str;
        this.c = function1;
        this.d = list;
        this.e = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i = this.a;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                LazyListState lazyListState = (LazyListState) obj4;
                FocusRequester focusRequester = (FocusRequester) obj6;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(983711949, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.FavoriteSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FavoritePage.kt:536)");
                    }
                    Function1 function1 = this.c;
                    boolean zChanged = composer2.changed(function1);
                    List list = this.d;
                    boolean zChangedInstance = zChanged | composer2.changedInstance(list);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wi0(list, 0, function1);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean zChangedInstance2 = composer2.changedInstance(coroutineScope) | composer2.changed(lazyListState);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        xi0 xi0Var = new xi0(coroutineScope, this.e, lazyListState, focusRequester, 0);
                        composer2.updateRememberedValue(xi0Var);
                        objRememberedValue2 = xi0Var;
                    }
                    vj0.e(null, this.b, function0, (Function0) objRememberedValue2, composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Function0 function2 = (Function0) obj6;
                u61 u61Var = (u61) obj5;
                String str = (String) obj4;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1537119809, iIntValue2, -1, "com.dh.myembyapp.ui.components.SubtitleFontManagerDialog.<anonymous>.<anonymous>.<anonymous> (SubtitleFontManagerDialog.kt:95)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("字幕字体管理", null, materialTheme.getColorScheme(composer3, i3).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i3).getTitleMedium(), composer3, 6, 0, 131066);
                    if (function2 != null) {
                        composer3.startReplaceGroup(-180158970);
                        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(46.0f)), 0.0f, 1, null), this.b);
                        ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                        long j = u61Var.C;
                        long j2 = u61Var.D;
                        long onSurface = materialTheme.getColorScheme(composer3, i3).getOnSurface();
                        long onSurface2 = materialTheme.getColorScheme(composer3, i3).getOnSurface();
                        int i4 = ClickableSurfaceDefaults.$stable;
                        SurfaceKt.m8520Surface05tvjtU(function2, modifierFocusRequester, null, false, 0.0f, null, clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composer3, i4 << 24, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composer3, i4 << 15, 29), el0.c(u61Var), null, tt.a, composer3, 0, 48, 1084);
                        composer = composer3;
                        composer.endReplaceGroup();
                    } else {
                        composer = composer3;
                        composer.startReplaceGroup(-177948949);
                        composer.endReplaceGroup();
                    }
                    q32.a(composer, 0);
                    Modifier modifierM1051heightInVpY3zN4 = SizeKt.m1051heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(200.0f), Dp.m7813constructorimpl(420.0f));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(6.0f), 1, null);
                    boolean zChanged2 = composer.changed(str);
                    Function1 function3 = this.c;
                    boolean zChanged3 = zChanged2 | composer.changed(function3);
                    List list2 = this.d;
                    boolean zChangedInstance3 = zChanged3 | composer.changedInstance(list2);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        g9 g9Var = new g9(list2, str, function3, this.e, 19);
                        composer.updateRememberedValue(g9Var);
                        objRememberedValue3 = g9Var;
                    }
                    Composer composer4 = composer;
                    LazyDslKt.LazyColumn(modifierM1051heightInVpY3zN4, null, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue3, composer4, 24966, 490);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ dj0(FocusRequester focusRequester, Function1 function1, List list, CoroutineScope coroutineScope, LazyListState lazyListState, MutableState mutableState, FocusRequester focusRequester2) {
        this.b = focusRequester;
        this.c = function1;
        this.d = list;
        this.h = coroutineScope;
        this.i = lazyListState;
        this.e = mutableState;
        this.g = focusRequester2;
    }
}
