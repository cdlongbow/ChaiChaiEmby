package defpackage;

import androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LazyListState b;

    public /* synthetic */ k10(LazyListState lazyListState, int i) {
        this.a = i;
        this.b = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int firstVisibleItemIndex;
        int i = this.a;
        LazyListState lazyListState = this.b;
        switch (i) {
            case 0:
                firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex();
                break;
            case 1:
                return new Triple(Boolean.valueOf(lazyListState.isScrollInProgress()), Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
            default:
                firstVisibleItemIndex = LazyLayoutSemanticStateKt.AnonymousClass1.totalItemsCount_delegate$lambda$0(lazyListState);
                break;
        }
        return Integer.valueOf(firstVisibleItemIndex);
    }
}
