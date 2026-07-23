package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ey1 implements Function4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ FocusRequester b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ hy1 e;
    public final /* synthetic */ State g;
    public final /* synthetic */ State h;
    public final /* synthetic */ State i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ State m;
    public final /* synthetic */ MutableState n;

    public ey1(List list, FocusRequester focusRequester, Function1 function1, Function1 function2, hy1 hy1Var, State state, State state2, State state3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state4, MutableState mutableState4) {
        this.a = list;
        this.b = focusRequester;
        this.c = function1;
        this.d = function2;
        this.e = hy1Var;
        this.g = state;
        this.h = state2;
        this.i = state3;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.m = state4;
        this.n = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (composer.changed(lazyGridItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= composer.changed(iIntValue) ? 32 : 16;
        }
        if (composer.shouldExecute((i & Input.Keys.NUMPAD_3) != 146, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
            }
            ServerConfig serverConfig = (ServerConfig) this.a.get(iIntValue);
            composer.startReplaceGroup(1892251140);
            ProxyConfig proxyConfig = (ProxyConfig) this.g.getValue();
            ServerPingState serverPingState = (ServerPingState) ((Map) this.h.getValue()).get(serverConfig.getId());
            String id = serverConfig.getId();
            State state = this.i;
            boolean zAreEqual = Intrinsics.areEqual(id, (String) state.getValue());
            String id2 = serverConfig.getId();
            MutableState mutableState = this.j;
            String str = (String) mutableState.getValue();
            if (str == null) {
                str = (String) state.getValue();
            }
            FocusRequester focusRequester = Intrinsics.areEqual(id2, str) ? this.b : null;
            Function1 function1 = this.c;
            boolean zChanged = composer.changed(function1) | composer.changedInstance(serverConfig);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ay1(function1, serverConfig, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            Function1 function2 = this.d;
            boolean zChanged2 = composer.changed(function2) | composer.changedInstance(serverConfig);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ay1(function2, serverConfig, 1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function3 = (Function0) objRememberedValue2;
            boolean zChangedInstance = composer.changedInstance(serverConfig);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new by1(serverConfig, this.k, 0);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function4 = (Function0) objRememberedValue3;
            boolean zChangedInstance2 = composer.changedInstance(serverConfig);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new by1(serverConfig, this.l, 1);
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function5 = (Function0) objRememberedValue4;
            boolean z = ((List) this.m.getValue()).size() > 1;
            boolean zChangedInstance3 = composer.changedInstance(serverConfig);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new n90(serverConfig, mutableState, this.n);
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function0 function6 = (Function0) objRememberedValue5;
            hy1 hy1Var = this.e;
            boolean zChangedInstance4 = composer.changedInstance(hy1Var) | composer.changedInstance(serverConfig);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new ni(10, hy1Var, serverConfig);
                composer.updateRememberedValue(objRememberedValue6);
            }
            gy1.d(serverConfig, proxyConfig, serverPingState, zAreEqual, focusRequester, function0, function3, function4, function5, z, function6, (Function0) objRememberedValue6, composer, 0, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
