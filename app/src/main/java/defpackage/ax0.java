package defpackage;

import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ax0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PagerState b;

    public /* synthetic */ ax0(PagerState pagerState, int i) {
        this.a = i;
        this.b = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int pageCount;
        int i = this.a;
        PagerState pagerState = this.b;
        switch (i) {
            case 0:
                pageCount = pagerState.getPageCount();
                break;
            case 1:
                pageCount = pagerState.getPageCount();
                break;
            case 2:
                pageCount = PagerState.settledPage_delegate$lambda$0(pagerState);
                break;
            case 3:
                pageCount = PagerState.targetPage_delegate$lambda$0(pagerState);
                break;
            default:
                pageCount = pagerState.getPageCount();
                break;
        }
        return Integer.valueOf(pageCount);
    }
}
