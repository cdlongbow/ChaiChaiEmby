package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class l31 implements xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o31 b;

    public /* synthetic */ l31(o31 o31Var, int i) {
        this.a = i;
        this.b = o31Var;
    }

    @Override // defpackage.xl0
    public final Object apply(Object obj) {
        int i = this.a;
        o31 o31Var = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getKey();
                return ((xl0) ((ri) o31Var).b).apply(entry.getValue());
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                o31Var.getClass();
                entry2.getClass();
                return new m31(entry2, o31Var);
        }
    }
}
