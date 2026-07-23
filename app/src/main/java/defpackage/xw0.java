package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LazyLayoutCacheWindow b;

    public /* synthetic */ xw0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i) {
        this.a = i;
        this.b = lazyLayoutCacheWindow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        LazyLayoutCacheWindow lazyLayoutCacheWindow = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                return LazyGridState.Companion.saver$lambda$3(lazyLayoutCacheWindow, list);
            default:
                return LazyListState.Companion.saver$lambda$3(lazyLayoutCacheWindow, list);
        }
    }
}
