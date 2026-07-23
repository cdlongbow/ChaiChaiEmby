package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y40 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ MediaItem c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ y40(MediaItem mediaItem, Function2 function2, boolean z) {
        this.c = mediaItem;
        this.b = function2;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.d;
        MediaItem mediaItem = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                if (mediaItem != null) {
                    function2.invoke(mediaItem.getId(), Boolean.valueOf(z));
                }
                break;
            default:
                function2.invoke(mediaItem.getId(), Boolean.valueOf(z));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y40(Function2 function2, MediaItem mediaItem, boolean z) {
        this.b = function2;
        this.c = mediaItem;
        this.d = z;
    }
}
