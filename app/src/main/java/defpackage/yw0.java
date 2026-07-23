package defpackage;

import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LazyLayoutCacheWindow b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ yw0(LazyLayoutCacheWindow lazyLayoutCacheWindow, int i, int i2, int i3) {
        this.a = i3;
        this.b = lazyLayoutCacheWindow;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return LazyGridStateKt.rememberLazyGridState$lambda$3$0(this.b, this.c, this.d);
            default:
                return LazyListStateKt.rememberLazyListState$lambda$3$0(this.b, this.c, this.d);
        }
    }
}
