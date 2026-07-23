package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xa implements db {
    public final ua a;
    public final ua b;

    public xa(ua uaVar, ua uaVar2) {
        this.a = uaVar;
        this.b = uaVar2;
    }

    @Override // defpackage.db
    public final ej a() {
        return new w22(this.a.a(), this.b.a());
    }

    @Override // defpackage.db
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.db
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
