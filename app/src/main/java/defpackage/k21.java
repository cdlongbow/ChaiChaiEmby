package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.dh.myembyapp.MainActivity;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k21 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ k21(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        UserPreferences userPreferences = null;
        MainActivity mainActivity = this.b;
        int i2 = 2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = MainActivity.d;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2067327351, iIntValue, -1, "com.dh.myembyapp.MainActivity.onCreate.<anonymous> (MainActivity.kt:145)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new q72(mainActivity);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    State stateCollectAsState = SnapshotStateKt.collectAsState(((q72) objRememberedValue).b, new bc(0), null, composer, 0, 2);
                    boolean zChanged = composer.changed(((bc) stateCollectAsState.getValue()).getCardSizeLevel());
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new io(((bc) stateCollectAsState.getValue()).getCardSizeLevel());
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) jo.a.provides((io) objRememberedValue2), ComposableLambdaKt.rememberComposableLambda(-552121527, true, new a2(17, stateCollectAsState, mainActivity), composer, 54), composer, ProvidedValue.$stable | 48);
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
                int i4 = MainActivity.d;
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(157454831, iIntValue2, -1, "com.dh.myembyapp.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:163)");
                    }
                    SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.INSTANCE.m5187getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1674689098, true, new k21(mainActivity, i2), composer2, 54), composer2, 12583302, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i5 = MainActivity.d;
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1674689098, iIntValue3, -1, "com.dh.myembyapp.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:168)");
                    }
                    UserPreferences userPreferences2 = mainActivity.a;
                    if (userPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userPreferences");
                    } else {
                        userPreferences = userPreferences2;
                    }
                    nb0 nb0Var = (nb0) mainActivity.c.getValue();
                    boolean zChangedInstance = composer3.changedInstance(mainActivity);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new c0(mainActivity, 26);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    e31.b(userPreferences, nb0Var, (Function0) objRememberedValue3, composer3, UserPreferences.$stable);
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
