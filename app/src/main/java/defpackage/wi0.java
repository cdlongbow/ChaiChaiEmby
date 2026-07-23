package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wi0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ wi0(List list, int i, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        List list = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                MediaItem mediaItem = (MediaItem) CollectionsKt.firstOrNull(list);
                function1.invoke(mediaItem != null ? mediaItem.getId() : null);
                break;
            default:
                MediaItem mediaItem2 = (MediaItem) CollectionsKt.firstOrNull(list);
                function1.invoke(mediaItem2 != null ? mediaItem2.getId() : null);
                break;
        }
        return Unit.INSTANCE;
    }
}
