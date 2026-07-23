package defpackage;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ m4(int i, MutableState mutableState, MutableState mutableState2) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        MutableState mutableState = this.c;
        MutableState mutableState2 = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-957047835, iIntValue, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous> (AggregateHubScreen.kt:1035)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new d4(13, mutableState2, mutableState);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    hc2.c("确定", (Function0) objRememberedValue, null, false, null, 0L, 0.0f, 0.0f, composer, 54, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2080795661, iIntValue2, -1, "com.dh.myembyapp.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:1575)");
                    }
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ao0(0, mutableState2, mutableState);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ButtonKt.Button((Function0) objRememberedValue2, null, false, null, null, null, null, null, null, et.i, composer2, 805306374, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                mutableState2.setValue((String) obj);
                mutableState.setValue((String) obj2);
                break;
            case 3:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                mutableState2.setValue(num);
                mutableState.setValue(num2);
                break;
            case 4:
                Integer num3 = (Integer) obj;
                num3.intValue();
                Integer num4 = (Integer) obj2;
                num4.intValue();
                mutableState2.setValue(num3);
                mutableState.setValue(num4);
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1262607293, iIntValue3, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous> (ServerListScreen.kt:844)");
                    }
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ao0(4, mutableState2, mutableState);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    hc2.c("确定", (Function0) objRememberedValue3, null, false, null, 0L, 0.0f, 0.0f, composer3, 54, 252);
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
}
