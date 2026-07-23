package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsetsConnection_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bg2 implements Function3 {
    public final /* synthetic */ int a;

    public /* synthetic */ bg2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return WindowInsetsConnection_androidKt.imeNestedScroll$lambda$1((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1277445699, iIntValue, -1, "com.dh.myembyapp.ComposableSingletons$MainActivityKt.lambda$-1277445699.<anonymous> (MainActivity.kt:498)");
                    }
                    TextKt.m3048TextNvy7gAk("知道了", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
