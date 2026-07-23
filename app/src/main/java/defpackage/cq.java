package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import com.dh.myembyapp.data.SubtitlePreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cq implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cq(jc2 jc2Var, boolean z, String str, MutableState mutableState) {
        this.a = 4;
        this.d = jc2Var;
        this.b = z;
        this.c = str;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                return ClickableKt.clickable_XHw0xAI$lambda$1(this.b, (String) obj5, (Role) obj6, (Function0) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                SubtitlePreferences.SubtitleColor subtitleColor = (SubtitlePreferences.SubtitleColor) obj5;
                Function1 function1 = (Function1) obj6;
                FocusRequester focusRequester = (FocusRequester) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472916062, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:454)");
                    }
                    c52.b(subtitleColor, function1, this.b ? null : focusRequester, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                return TextFieldScrollKt.textFieldScrollable$lambda$1((TextFieldScrollerPosition) obj5, this.b, (OverscrollEffect) obj6, (MutableInteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return ToggleableKt.triStateToggleable_XHw0xAI$lambda$1((ToggleableState) obj5, this.b, (Role) obj6, (Function0) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                jc2 jc2Var = (jc2) obj6;
                String str = (String) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(595634666, iIntValue2, -1, "com.dh.myembyapp.ui.components.TraktActionButton.<anonymous> (TraktSyncDialog.kt:640)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str, null, hc2.k(jc2Var, ((Boolean) mutableState.getValue()).booleanValue(), this.b, composer2, 0, 0), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer2, i3).getBodyMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, materialTheme.getTypography(composer2, i3).getBodyMedium().m7306getFontSizeXSAIIZE(), null, new PlatformTextStyle(false), null, 0, 0, null, 16121855, null), composer2, 0, 0, 130042);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ cq(SubtitlePreferences.SubtitleColor subtitleColor, Function1 function1, boolean z, FocusRequester focusRequester) {
        this.a = 1;
        this.c = subtitleColor;
        this.d = function1;
        this.b = z;
        this.e = focusRequester;
    }

    public /* synthetic */ cq(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ cq(boolean z, String str, Role role, Function0 function0) {
        this.a = 0;
        this.b = z;
        this.c = str;
        this.d = role;
        this.e = function0;
    }
}
