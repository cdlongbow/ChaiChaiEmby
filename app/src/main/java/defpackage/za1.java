package defpackage;

import com.dh.myembyapp.data.model.EpisodeLocator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class za1 {
    public final String a;
    public final String b;
    public final List c;
    public final EpisodeLocator d;
    public final ArrayList e;

    public za1(String str, String str2, List list, EpisodeLocator episodeLocator, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = episodeLocator;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za1)) {
            return false;
        }
        za1 za1Var = (za1) obj;
        return Intrinsics.areEqual(this.a, za1Var.a) && Intrinsics.areEqual(this.b, za1Var.b) && Intrinsics.areEqual(this.c, za1Var.c) && Intrinsics.areEqual(this.d, za1Var.d) && Intrinsics.areEqual(this.e, za1Var.e);
    }

    public final int hashCode() {
        int iF = qi0.f(this.c, i02.i(this.a.hashCode() * 31, 31, this.b), 31);
        EpisodeLocator episodeLocator = this.d;
        return this.e.hashCode() + ((iF + (episodeLocator == null ? 0 : episodeLocator.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("OtherServerResourceLoadKey(itemId=", this.a, ", mediaType=", this.b, ", providerQueries=");
        sbZ.append(this.c);
        sbZ.append(", episodeLocator=");
        sbZ.append(this.d);
        sbZ.append(", serverIds=");
        sbZ.append(this.e);
        sbZ.append(")");
        return sbZ.toString();
    }
}
