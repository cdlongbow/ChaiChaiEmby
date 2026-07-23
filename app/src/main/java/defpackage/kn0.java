package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.model.ItemCounts;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kn0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u61 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ FocusRequester d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kn0(u61 u61Var, MutableState mutableState, FocusRequester focusRequester, String str, List list, Function0 function0, Function1 function1) {
        this.b = u61Var;
        this.c = function0;
        this.d = focusRequester;
        this.g = str;
        this.h = function1;
        this.i = list;
        this.e = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.i;
        Function function = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) function;
                ItemCounts itemCounts = (ItemCounts) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1501629855, iIntValue, -1, "com.dh.myembyapp.ui.components.HomeMediaMenuDialog.<anonymous> (HomeMediaMenuDialog.kt:110)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    MutableState mutableState = this.e;
                    boolean zChanged = composer.changed(mutableState);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new on0(mutableState);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default, (Function1) objRememberedValue), this.b.a, null, 2, null);
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
                    CardKt.Card(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(420.0f)), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1290611607, true, new n1(this.d, this.c, function0, function1, itemCounts, 3), composer, 54), composer, 196614, 26);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                String str = (String) obj4;
                Function1 function2 = (Function1) function;
                List list = (List) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-814845111, iIntValue2, -1, "com.dh.myembyapp.ui.components.SubtitleFontManagerDialog.<anonymous> (SubtitleFontManagerDialog.kt:81)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    u61 u61Var = this.b;
                    Modifier modifierM275backgroundbw27NRU$default2 = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default2, u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default2);
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(520.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1537119809, true, new dj0(u61Var, this.e, this.d, str, list, this.c, function2), composer2, 54), composer2, 196614, 26);
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

    public /* synthetic */ kn0(MutableState mutableState, u61 u61Var, FocusRequester focusRequester, Function0 function0, Function0 function1, Function0 function2, ItemCounts itemCounts) {
        this.e = mutableState;
        this.b = u61Var;
        this.d = focusRequester;
        this.c = function0;
        this.g = function1;
        this.h = function2;
        this.i = itemCounts;
    }
}
