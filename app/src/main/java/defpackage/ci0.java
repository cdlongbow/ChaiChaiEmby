package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ci0 {
    public final Intent a;
    public final di0 b;

    public ci0(Intent intent, di0 di0Var) {
        intent.getClass();
        this.a = intent;
        this.b = di0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci0)) {
            return false;
        }
        ci0 ci0Var = (ci0) obj;
        return Intrinsics.areEqual(this.a, ci0Var.a) && this.b == ci0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalPlayerIntentCandidate(intent=" + this.a + ", launchMode=" + this.b + ")";
    }
}
