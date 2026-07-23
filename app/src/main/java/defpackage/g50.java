package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g50 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ MediaItem c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;

    public /* synthetic */ g50(String str, MediaItem mediaItem, Function2 function2, List list) {
        this.d = str;
        this.c = mediaItem;
        this.b = function2;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        String str = null;
        List list = this.e;
        String str2 = this.d;
        MediaItem mediaItem = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                if (str2 != null && (list == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((MediaSource) it.next()).getId(), str2)) {
                            str = str2;
                        }
                    }
                }
                s01.E("点击播放: itemId=", mediaItem.getId(), ", mediaSourceId=", str, "MovieActionButton");
                function2.invoke(mediaItem.getId(), str);
                break;
            default:
                String id = mediaItem.getId();
                if (str2 != null && (list == null || !list.isEmpty())) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((MediaSource) it2.next()).getId(), str2)) {
                            str = str2;
                        }
                    }
                }
                function2.invoke(id, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g50(Function2 function2, MediaItem mediaItem, String str, List list) {
        this.b = function2;
        this.c = mediaItem;
        this.d = str;
        this.e = list;
    }
}
