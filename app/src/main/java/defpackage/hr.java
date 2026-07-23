package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class hr implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ kr d;
    public final /* synthetic */ int e;
    public final /* synthetic */ kr g;

    public hr(kr krVar, int i) {
        this.e = i;
        this.g = krVar;
        this.d = krVar;
        this.a = krVar.e;
        this.b = krVar.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object jrVar;
        kr krVar = this.d;
        if (krVar.e != this.a) {
            ra.e();
            return null;
        }
        if (!hasNext()) {
            r02.p();
            return null;
        }
        int i = this.b;
        this.c = i;
        int i2 = this.e;
        kr krVar2 = this.g;
        switch (i2) {
            case 0:
                jrVar = krVar2.k()[i];
                break;
            case 1:
                jrVar = new jr(krVar2, i);
                break;
            default:
                jrVar = krVar2.l()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= krVar.g) {
            i3 = -1;
        }
        this.b = i3;
        return jrVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        kr krVar = this.d;
        if (krVar.e != this.a) {
            ra.e();
            return;
        }
        ig2.x(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        krVar.remove(krVar.k()[this.c]);
        this.b--;
        this.c = -1;
    }
}
