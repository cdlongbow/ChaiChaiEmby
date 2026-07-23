package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mw1 implements lw1, qn {
    public final lw1 a;
    public final String b;
    public final Set c;

    public mw1(lw1 lw1Var) {
        lw1Var.getClass();
        this.a = lw1Var;
        this.b = lw1Var.f() + '?';
        this.c = hg2.m(lw1Var);
    }

    @Override // defpackage.qn
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.lw1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.lw1
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.lw1
    public final String d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.lw1
    public final lw1 e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mw1) {
            return Intrinsics.areEqual(this.a, ((mw1) obj).a);
        }
        return false;
    }

    @Override // defpackage.lw1

    @Override // defpackage.lw1
    public final boolean g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.lw1
    public final ig2 getKind() {
        return this.a.getKind();
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.lw1
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
