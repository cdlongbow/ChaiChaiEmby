package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class jq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MediaItem c;

    public /* synthetic */ jq(Function1 function1, MediaItem mediaItem, int i) {
        this.a = i;
        this.b = function1;
        this.c = mediaItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MediaItem mediaItem = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(mediaItem.getId());
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(mediaItem.getId());
                }
                break;
            case 2:
                function1.invoke(mediaItem.getId());
                break;
            case 3:
                function1.invoke(mediaItem);
                break;
            case 4:
                if (function1 != null) {
                    function1.invoke(mediaItem.getId());
                }
                break;
            case 5:
                function1.invoke(mediaItem);
                break;
            default:
                function1.invoke(mediaItem);
                break;
        }
        return Unit.INSTANCE;
    }
}
