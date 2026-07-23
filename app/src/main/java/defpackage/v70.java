package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class v70 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MediaItem c;

    public /* synthetic */ v70(Function1 function1, MediaItem mediaItem, int i) {
        this.a = i;
        this.b = function1;
        this.c = mediaItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MediaItem mediaItem = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(mediaItem.getId());
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(mediaItem.getId());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
