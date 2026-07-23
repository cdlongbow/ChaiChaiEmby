package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class mj implements rt1 {
    public final Job a;

    public /* synthetic */ mj(Job job) {
        this.a = job;
    }

    @Override // defpackage.rt1
    public final Object a(js1 js1Var) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.rt1
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.rt1
    public final /* synthetic */ void complete() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mj) {
            return Intrinsics.areEqual(this.a, ((mj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.rt1
    public final /* synthetic */ void start() {
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ")";
    }
}
