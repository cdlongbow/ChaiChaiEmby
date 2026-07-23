package defpackage;

import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ zw0(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return LazyGridStateKt.rememberLazyGridState$lambda$0$0(this.b, this.c);
            case 1:
                return LazyListStateKt.rememberLazyListState$lambda$0$0(this.b, this.c);
            default:
                return LazyStaggeredGridStateKt.rememberLazyStaggeredGridState$lambda$0$0(this.b, this.c);
        }
    }
}
