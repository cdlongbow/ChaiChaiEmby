package defpackage;

import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KType;
import okhttp3.Handshake;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uo implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ uo(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(CarouselPagerState.Saver$lambda$2$lambda$1(list));
            case 1:
                return Integer.valueOf(CarouselState.Saver$lambda$3$lambda$2(list));
            case 2:
                return Handshake.Companion.get$lambda$0(list);
            case 3:
                return Handshake.Companion.handshake$lambda$2(list);
            case 4:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(RangesKt.coerceAtMost(3, list.size())), null, 2, null);
            case 5:
                return ((KType) list.get(0)).getClassifier();
            default:
                return ((KType) list.get(0)).getClassifier();
        }
    }
}
