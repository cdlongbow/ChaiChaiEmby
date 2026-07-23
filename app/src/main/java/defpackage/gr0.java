package defpackage;

import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gr0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gr0(Http2Connection http2Connection, int i, int i2) {
        this.a = 0;
        this.d = http2Connection;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Http2Connection.ReaderRunnable.ping$lambda$1((Http2Connection) this.d, this.b, this.c);
            case 1:
                return LazyGridStateKt.rememberLazyGridState$lambda$2$0(this.b, this.c, (LazyGridPrefetchStrategy) this.d);
            default:
                return LazyListStateKt.rememberLazyListState$lambda$2$0(this.b, this.c, (LazyListPrefetchStrategy) this.d);
        }
    }

    public /* synthetic */ gr0(int i, int i2, int i3, Object obj) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }
}
