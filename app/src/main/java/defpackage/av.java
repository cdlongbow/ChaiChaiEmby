package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class av implements lw1 {
    public final nw1 a;
    public final KClass b;
    public final String c;

    public av(nw1 nw1Var, KClass kClass) {
        kClass.getClass();
        this.a = nw1Var;
        this.b = kClass;
        this.c = nw1Var.a + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    @Override // defpackage.lw1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lw1
    public final int c() {
        return this.a.c;
    }

    @Override // defpackage.lw1
    public final String d(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.lw1
    public final lw1 e(int i) {
        return this.a.g[i];
    }

    public final boolean equals(Object obj) {
        av avVar = obj instanceof av ? (av) obj : null;
        return avVar != null && Intrinsics.areEqual(this.a, avVar.a) && Intrinsics.areEqual(avVar.b, this.b);
    }

    @Override // defpackage.lw1

    @Override // defpackage.lw1
    public final boolean g(int i) {
        return this.a.i[i];
    }

    @Override // defpackage.lw1
    public final ig2 getKind() {
        return this.a.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.lw1
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
