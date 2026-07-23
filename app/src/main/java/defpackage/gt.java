package defpackage;

import android.content.Context;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectedTextType;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gt implements Function4 {
    public final /* synthetic */ int a;

    public /* synthetic */ gt(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(207191084, iIntValue, -1, "com.dh.myembyapp.ComposableSingletons$MainActivityKt.lambda$207191084.<anonymous> (MainActivity.kt:692)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            default:
                return PlatformSelectionBehaviors_androidKt.PlatformSelectionBehaviorsFactory$lambda$0((CoroutineContext) obj, (Context) obj2, (SelectedTextType) obj3, (LocaleList) obj4);
        }
    }
}
