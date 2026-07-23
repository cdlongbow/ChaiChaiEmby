package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lt91;", "", "", "enabled", "Z", "e", "()Z", "", "assrtApiToken", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lne;", "assrtApiProtocol", "Lne;", "b", "()Lne;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t91 {

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
