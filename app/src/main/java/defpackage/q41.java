package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q41 {
    public static final void a(Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Function0 function2;
        Composer composer2;
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1175718249);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1175718249, i3, -1, "com.dh.myembyapp.ui.components.MilkTeaSupportDialog (MilkTeaSupportDialog.kt:54)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                Key.Companion companion2 = Key.INSTANCE;
                objRememberedValue2 = CollectionsKt.listOf((Object[]) new Key[]{Key.m5917boximpl(companion2.m5999getDirectionUpEK5gGoQ()), Key.m5917boximpl(companion2.m5999getDirectionUpEK5gGoQ()), Key.m5917boximpl(companion2.m5994getDirectionDownEK5gGoQ()), Key.m5917boximpl(companion2.m5994getDirectionDownEK5gGoQ()), Key.m5917boximpl(companion2.m5997getDirectionLeftEK5gGoQ()), Key.m5917boximpl(companion2.m5998getDirectionRightEK5gGoQ()), Key.m5917boximpl(companion2.m5997getDirectionLeftEK5gGoQ()), Key.m5917boximpl(companion2.m5998getDirectionRightEK5gGoQ())});
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            List list = (List) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue3;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ji(focusRequester, null, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            function2 = function1;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-2047112576, true, new oh(u61Var, focusRequester, list, function1, mutableIntState), composerStartRestartGroup, 54), composer2, (i3 & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h4(function0, function2, i, 2));
        }
    }
}
