package defpackage;

import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sw0 implements Function4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function3 b;

    public /* synthetic */ sw0(Function3 function3, int i) {
        this.a = i;
        this.b = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        Function3 function3 = this.b;
        switch (i) {
            case 0:
                return LazyGridIntervalContent.item$lambda$3(function3, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return LazyListIntervalContent.item$lambda$2(function3, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (composer.shouldExecute((iIntValue & Input.Keys.F1) != 130, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-764088514, iIntValue, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
                    }
                    function3.invoke(lazyItemScope, composer, Integer.valueOf(iIntValue & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                return LazyStaggeredGridIntervalContent.item$lambda$3(function3, (LazyStaggeredGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return TransformableStateKt.TransformableState$lambda$0(function3, (Offset) obj, ((Float) obj2).floatValue(), (Offset) obj3, ((Float) obj4).floatValue());
            default:
                return TransformableStateKt.rememberTransformableState$lambda$0$0(function3, (Offset) obj, ((Float) obj2).floatValue(), (Offset) obj3, ((Float) obj4).floatValue());
        }
    }
}
