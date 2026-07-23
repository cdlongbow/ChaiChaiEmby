package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class jr extends q0 {
    public final Object a;
    public int b;
    public final /* synthetic */ kr c;

    public jr(kr krVar, int i) {
        this.c = krVar;
        Object obj = kr.k;
        this.a = krVar.k()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        kr krVar = this.c;
        if (i != -1 && i < krVar.size()) {
            if (tl0.n(obj, krVar.k()[this.b])) {
                return;
            }
        }
        Object obj2 = kr.k;
        this.b = krVar.e(obj);
    }

    @Override // java.util.Map.Entry

    @Override // java.util.Map.Entry
    public final Object getValue() {
        kr krVar = this.c;
        Map mapC = krVar.c();
        if (mapC != null) {
            return mapC.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return krVar.l()[i];
    }

    @Override // defpackage.q0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        kr krVar = this.c;
        Map mapC = krVar.c();
        Object obj2 = this.a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            krVar.put(obj2, obj);
            return null;
        }
        Object obj3 = krVar.l()[i];
        krVar.l()[this.b] = obj;
        return obj3;
    }
}
