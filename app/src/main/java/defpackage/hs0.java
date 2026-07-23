package defpackage;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hs0 {
    public static final ri a;
    public static final ri b;
    public static final ri c;
    public static final ri d;

    static {
        int i = 3;
        a = new ri(CollectionsKt.emptyList(), i);
        ig2.a(4096);
        ya0 ya0Var = new ya0(4096);
        ig2.a(4096);
        b = new ri(new n12(ya0Var, new ya0(4096)), i);
        c = new ri(Boolean.FALSE, i);
        d = new ri(Boolean.TRUE, i);
    }

    public static final void a(bs0 bs0Var, boolean z) {
        int i = z ? 200 : 0;
        ri riVar = is0.a;
        vb2 zvVar = i > 0 ? new zv(i) : vb2.a;
        bs0Var.b().a.put(is0.a, zvVar);
    }
}
