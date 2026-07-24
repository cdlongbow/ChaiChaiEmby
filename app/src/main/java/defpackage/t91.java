package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final  class t91 {

    @SerializedName("assrtApiProtocol")
    private final ne assrtApiProtocol;

    @SerializedName("assrtApiToken")
    private final String assrtApiToken;

    @SerializedName("enabled")
    private final boolean enabled;

    public t91(boolean z, String str, ne neVar) {
        str.getClass();
        neVar.getClass();
        this.enabled = z;
        this.assrtApiToken = str;
        this.assrtApiProtocol = neVar;
    }

    public static t91 a(t91 t91Var, String str) {
        boolean z = t91Var.enabled;
        ne neVar = t91Var.assrtApiProtocol;
        t91Var.getClass();
        str.getClass();
        neVar.getClass();
        return new t91(z, str, neVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */

    /* JADX INFO: renamed from: c, reason: from getter */

    public final String d() {
        String str = this.assrtApiToken;
        return StringsKt.isBlank(str) ? "G1jDEk5mvd5s8eRlDnLLQbpWaHwmzoU9" : str;
    }

    /* JADX INFO: renamed from: e, reason: from getter */

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t91)) {
            return false;
        }
        t91 t91Var = (t91) obj;
        return this.enabled == t91Var.enabled && Intrinsics.areEqual(this.assrtApiToken, t91Var.assrtApiToken) && this.assrtApiProtocol == t91Var.assrtApiProtocol;
    }

    public final int hashCode() {
        return this.assrtApiProtocol.hashCode() + i02.i((this.enabled ? 1231 : 1237) * 31, 31, this.assrtApiToken);
    }

    public final String toString() {
        return "OnlineSubtitleConfig(enabled=" + this.enabled + ", assrtApiToken=" + this.assrtApiToken + ", assrtApiProtocol=" + this.assrtApiProtocol + ")";
    }

    public t91() {
        this(true, "", ne.HTTPS);
    }
}
