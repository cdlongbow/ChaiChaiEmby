package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oq extends pq {
    public final MediaItem a;
    public final List b;
    public final List c;

    public oq(MediaItem mediaItem, List list, List list2) {
        mediaItem.getClass();
        this.a = mediaItem;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        return Intrinsics.areEqual(this.a, oqVar.a) && Intrinsics.areEqual(this.b, oqVar.b) && Intrinsics.areEqual(this.c, oqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qi0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Success(collection=" + this.a + ", movies=" + this.b + ", series=" + this.c + ")";
    }
}
