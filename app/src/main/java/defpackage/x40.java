package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x40 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ MediaItem c;
    public final /* synthetic */ String d;

    public /* synthetic */ x40(Function2 function2, MediaItem mediaItem, String str, int i) {
        this.a = i;
        this.b = function2;
        this.c = mediaItem;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        String str = this.d;
        MediaItem mediaItem = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                function2.invoke(mediaItem.getId(), str);
                break;
            default:
                function2.invoke(mediaItem, str);
                break;
        }
        return Unit.INSTANCE;
    }
}
