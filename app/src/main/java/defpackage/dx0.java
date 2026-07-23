package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.lazy.LazyListCacheWindowScope;
import androidx.compose.foundation.lazy.LazyListPrefetchResultScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dx0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ dx0(int i, Function2 function2) {
        this.a = i;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                return LazyListCacheWindowScope.schedulePrefetch$lambda$0(function2, (LazyListPrefetchResultScope) obj);
            default:
                return SuspendAnimationKt.animateDecay$lambda$0(function2, (AnimationScope) obj);
        }
    }
}
