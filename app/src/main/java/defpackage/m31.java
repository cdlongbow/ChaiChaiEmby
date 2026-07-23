package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m31 extends q0 {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ o31 b;

    public m31(Map.Entry entry, o31 o31Var) {
        this.a = entry;
        this.b = o31Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.d(entry.getKey(), entry.getValue());
    }
}
