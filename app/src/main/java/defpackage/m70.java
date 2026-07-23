package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m70 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ MediaItem c;

    public /* synthetic */ m70(MediaItem mediaItem, Function2 function2, int i) {
        this.a = i;
        this.c = mediaItem;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function2 function2 = this.b;
        MediaItem mediaItem = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function2.invoke(mediaItem.getId(), str);
                break;
            case 1:
                function2.invoke(mediaItem.getId(), (Integer) obj);
                break;
            case 2:
                function2.invoke(mediaItem.getId(), (Integer) obj);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                if (mediaItem != null) {
                    function2.invoke(mediaItem.getId(), str2);
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                if (mediaItem != null) {
                    function2.invoke(mediaItem.getId(), num);
                }
                break;
            default:
                Integer num2 = (Integer) obj;
                if (mediaItem != null) {
                    function2.invoke(mediaItem.getId(), num2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m70(Function2 function2, MediaItem mediaItem, int i) {
        this.a = i;
        this.b = function2;
        this.c = mediaItem;
    }
}
