package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a90 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ MediaItem c;

    public /* synthetic */ a90(Function2 function2, MediaItem mediaItem, int i) {
        this.a = i;
        this.b = function2;
        this.c = mediaItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MediaItem mediaItem = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                function2.invoke(mediaItem.getId(), (String) obj);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                function2.invoke(mediaItem.getId(), str);
                break;
            case 2:
                function2.invoke(mediaItem.getId(), (Integer) obj);
                break;
            default:
                function2.invoke(mediaItem.getId(), (Integer) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
