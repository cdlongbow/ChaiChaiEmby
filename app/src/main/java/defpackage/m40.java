package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m40 {
    public final MediaItem a;
    public final List b;

    public m40(MediaItem mediaItem, List list) {
        mediaItem.getClass();
        list.getClass();
        this.a = mediaItem;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return Intrinsics.areEqual(this.a, m40Var.a) && Intrinsics.areEqual(this.b, m40Var.b) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return qi0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DetailMediaReference(item=" + this.a + ", sources=" + this.b + ", referenceLabel=null)";
    }
}
