package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 {
    public final ServerConfig a;
    public final MediaItem b;
    public final String c;
    public final String d;

    public h3(ServerConfig serverConfig, MediaItem mediaItem, String str, String str2) {
        serverConfig.getClass();
        str.getClass();
        this.a = serverConfig;
        this.b = mediaItem;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return Intrinsics.areEqual(this.a, h3Var.a) && Intrinsics.areEqual(this.b, h3Var.b) && Intrinsics.areEqual(this.c, h3Var.c) && Intrinsics.areEqual(this.d, h3Var.d);
    }

    public final int hashCode() {
        int i = i02.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AggregateHubMediaEntry(server=" + this.a + ", item=" + this.b + ", navigationItemId=" + this.c + ", navigationEpisodeId=" + this.d + ")";
    }
}
