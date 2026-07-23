package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MovableContentKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fx0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function4 b;

    public /* synthetic */ fx0(Function4 function4, int i) {
        this.a = i;
        this.b = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Function4 function4 = this.b;
        switch (i) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1691919627, iIntValue, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
                    }
                    function4.invoke(lazyItemScope, 0, composer, Integer.valueOf((iIntValue & 14) | 48));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                return MovableContentKt.movableContentOf$lambda$2(function4, (Pair) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return MovableContentKt.movableContentWithReceiverOf$lambda$2(function4, (Pair) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
