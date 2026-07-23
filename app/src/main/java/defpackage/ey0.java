package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ey0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MediaItem b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 g;

    public ey0(boolean z, MediaItem mediaItem, Function1 function1, boolean z2, Function1 function2, Function1 function3) {
        this.a = z;
        this.b = mediaItem;
        this.c = function1;
        this.d = z2;
        this.e = function2;
        this.g = function3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function1 function1;
        String collectionType;
        boolean z = this.a;
        MediaItem mediaItem = this.b;
        if (z && (Intrinsics.areEqual(mediaItem.getType(), "Folder") || (Intrinsics.areEqual(mediaItem.getType(), "CollectionFolder") && mediaItem.isFolder() && (((collectionType = mediaItem.getCollectionType()) == null || StringsKt.isBlank(collectionType)) && StringsKt__StringsJVMKt.equals(mediaItem.getLocationType(), "Virtual", true))))) {
            this.c.invoke(mediaItem.getId());
        } else if (!this.d || (function1 = this.e) == null) {
            this.g.invoke(mediaItem.getId());
        } else {
            function1.invoke(mediaItem.getId());
        }
        return Unit.INSTANCE;
    }
}
