package defpackage;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Bits;





/* JADX INFO: loaded from: classes4.dex */
public abstract class jg0 {
    public final ri a;
    public final ri b;
    public boolean c;
    public boolean d;
    public as e;
    public final ri f;
    public final Array g;
    public final Bits h;
    public final Bits i;

    public jg0() {
        ri riVar = new ri(0);
        riVar.b = new Object[64];
        this.f = riVar;
        this.g = new Array(false, 16);
        this.h = new Bits();
        this.i = new Bits();
        this.a = new ri(14);
        this.b = new ri(14);
    }

    public final void a(DanmakuBaseComponent danmakuBaseComponent) {
        Class<?> cls = danmakuBaseComponent.getClass();
        qr qrVarB = b(cls);
        if (danmakuBaseComponent == qrVarB) {
            return;
        }
        if (qrVarB != null) {
            c(cls);
        }
        int i = es.b(cls).a;
        ri riVar = this.f;
        Object[] objArr = (Object[]) riVar.b;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            riVar.b = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        ((Object[]) riVar.b)[i] = danmakuBaseComponent;
        this.g.add(danmakuBaseComponent);
        this.h.set(i);
        as asVar = this.e;
        ri riVar2 = this.a;
        if (asVar == null) {
            riVar2.k(this);
            return;
        }
        if (!asVar.a.a.updating) {
            riVar2.k(this);
            return;
        }
        yr yrVar = (yr) asVar.b.obtain();
        yrVar.a = 1;
        yrVar.b = this;
        asVar.c.add(yrVar);
    }

    public final qr b(Class cls) {
        int i = es.b(cls).a;
        Object[] objArr = (Object[]) this.f.b;
        if (i < objArr.length) {
            return (qr) objArr[i];
        }
        return null;
    }

    public final boolean c(Class cls) {
        int i = es.b(cls).a;
        ri riVar = this.f;
        Object[] objArr = (Object[]) riVar.b;
        qr qrVar = (qr) objArr[i];
        if (qrVar == null) {
            return false;
        }
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            riVar.b = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        ((Object[]) riVar.b)[i] = null;
        this.g.removeValue(qrVar, true);
        this.h.clear(i);
        return true;
    }
}
