package defpackage;

import com.dh.myembyapp.data.model.MediaStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zn1 {
    public final String a;
    public final String b;
    public final MediaStream c;

    public zn1(String str, String str2, MediaStream mediaStream) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = mediaStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        return Intrinsics.areEqual(this.a, zn1Var.a) && Intrinsics.areEqual(this.b, zn1Var.b) && Intrinsics.areEqual(this.c, zn1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("PlayerTranscodeSubtitleCacheRequest(itemId=", this.a, ", mediaSourceId=", this.b, ", stream=");
        sbZ.append(this.c);
        sbZ.append(")");
        return sbZ.toString();
    }
}
