package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rd2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public rd2(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd2) && Intrinsics.areEqual(((rd2) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

}
