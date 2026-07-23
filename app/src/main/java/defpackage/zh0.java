package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zh0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public zh0(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh0)) {
            return false;
        }
        zh0 zh0Var = (zh0) obj;
        return Intrinsics.areEqual(this.a, zh0Var.a) && Intrinsics.areEqual(this.b, zh0Var.b) && Intrinsics.areEqual(this.c, zh0Var.c) && Intrinsics.areEqual("video/*", "video/*") && Intrinsics.areEqual(this.d, zh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b)) * 31) + 452781974) * 31);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("ExternalPlaybackOptions(itemId=", this.a, ", title=", this.b, ", videoUrl=");
        sbZ.append(this.c);
        sbZ.append(", mimeType=video/*, apps=");
        sbZ.append(this.d);
        sbZ.append(")");
        return sbZ.toString();
    }
}
