package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MediaItem c;

    public /* synthetic */ q60(MediaItem mediaItem, Function1 function1) {
        this.a = 2;
        this.c = mediaItem;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MediaItem mediaItem = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(mediaItem);
                break;
            case 1:
                function1.invoke(mediaItem.getId());
                break;
            case 2:
                if (mediaItem != null) {
                    function1.invoke(mediaItem.getId());
                }
                break;
            case 3:
                function1.invoke(mediaItem.getId());
                break;
            case 4:
                function1.invoke(mediaItem.getId());
                break;
            default:
                function1.invoke(mediaItem.getId());
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q60(Function1 function1, MediaItem mediaItem, int i) {
        this.a = i;
        this.b = function1;
        this.c = mediaItem;
    }
}
