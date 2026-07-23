package defpackage;

import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.runtime.LinkComposer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gm0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(GapComposer.stackTraceForValue$lambda$0(obj2, obj));
            case 1:
                return LazyGridIntervalContent.item$lambda$0$0(obj2, ((Integer) obj).intValue());
            case 2:
                return LazyGridIntervalContent.item$lambda$2(obj2, ((Integer) obj).intValue());
            case 3:
                return LazyListIntervalContent.item$lambda$0(obj2, ((Integer) obj).intValue());
            case 4:
                return LazyListIntervalContent.item$lambda$1(obj2, ((Integer) obj).intValue());
            case 5:
                return LazyStaggeredGridIntervalContent.item$lambda$0$0(obj2, ((Integer) obj).intValue());
            case 6:
                return LazyStaggeredGridIntervalContent.item$lambda$1(obj2, ((Integer) obj).intValue());
            case 7:
                return Boolean.valueOf(LinkComposer.stackTraceForValue$lambda$0(obj2, obj));
            default:
                return NavGraphImpl.setStartDestination$lambda$14(obj2, (NavDestination) obj);
        }
    }
}
