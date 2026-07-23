package defpackage;

import androidx.compose.foundation.ScrollState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScrollState b;

    public /* synthetic */ v6(ScrollState scrollState, int i) {
        this.a = i;
        this.b = scrollState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zIsScrollInProgress;
        int i = this.a;
        ScrollState scrollState = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(scrollState.getValue() < 100);
            case 1:
                zIsScrollInProgress = scrollState.isScrollInProgress();
                break;
            case 2:
                return Boolean.valueOf(scrollState.getValue() < 100);
            case 3:
                zIsScrollInProgress = scrollState.isScrollInProgress();
                break;
            case 4:
                zIsScrollInProgress = scrollState.isScrollInProgress();
                break;
            case 5:
                zIsScrollInProgress = ScrollState.canScrollForward_delegate$lambda$0(scrollState);
                break;
            default:
                zIsScrollInProgress = ScrollState.canScrollBackward_delegate$lambda$0(scrollState);
                break;
        }
        return Boolean.valueOf(zIsScrollInProgress);
    }
}
