package defpackage;
import com.badlogic.gdx.utils.Bits;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.SnapshotArray;





import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ti0 {
    public qs0 a;
    public ObjectMap b;
    public ObjectMap c;
    public SnapshotArray d;
    public ObjectMap e;
    public zr f;
    public boolean g;

    public final qs0 a(ri0 ri0Var) {
        ObjectMap objectMap = this.c;
        qs0 qs0Var = (qs0) objectMap.get(ri0Var);
        if (qs0Var != null) {
            return qs0Var;
        }
        Array array = new Array(false, 16);
        qs0 qs0Var2 = new qs0(array);
        this.b.put(ri0Var, array);
        objectMap.put(ri0Var, qs0Var2);
        this.e.put(ri0Var, new Bits());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b((jg0) it.next());
        }
        return qs0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(jg0 jg0Var) {
        SnapshotArray snapshotArray = this.d;
        zr zrVar = this.f;
        Bits bits = (Bits) zrVar.obtain();
        Bits bits2 = (Bits) zrVar.obtain();
        ObjectMap objectMap = this.e;
        ObjectMap.Keys it = objectMap.keys().iterator();
        while (it.hasNext()) {
            ri0 ri0Var = (ri0) it.next();
            int i = ri0Var.d;
            Bits bits3 = jg0Var.i;
            boolean z = bits3.get(i);
            Bits bits4 = ri0Var.c;
            Bits bits5 = ri0Var.b;
            Bits bits6 = jg0Var.h;
            boolean z2 = bits6.containsAll(ri0Var.a) && (bits5.isEmpty() || bits5.intersects(bits6)) && ((bits4.isEmpty() || !bits4.intersects(bits6)) && !jg0Var.d);
            if (z != z2) {
                Bits bits7 = (Bits) objectMap.get(ri0Var);
                Array array = (Array) this.b.get(ri0Var);
                if (z2) {
                    bits.or(bits7);
                    array.add(jg0Var);
                    bits3.set(i);
                } else {
                    bits2.or(bits7);
                    array.removeValue(jg0Var, true);
                    bits3.clear(i);
                }
            }
        }
        this.g = true;
        Object[] objArrBegin = snapshotArray.begin();
        boolean z3 = false;
        try {
            for (int iNextSetBit = bits2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bits2.nextSetBit(iNextSetBit + 1)) {
                try {
                    ((si0) objArrBegin[iNextSetBit]).a.entityRemoved(jg0Var);
                } catch (Throwable th) {
                    th = th;
                    z3 = false;
                    bits.clear();
                    bits2.clear();
                    zrVar.free(bits);
                    zrVar.free(bits2);
                    snapshotArray.end();
                    this.g = z3;
                    throw th;
                }
            }
            z3 = false;
            for (int iNextSetBit2 = bits.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bits.nextSetBit(iNextSetBit2 + 1)) {
                ((si0) objArrBegin[iNextSetBit2]).a.entityAdded(jg0Var);
            }
            bits.clear();
            bits2.clear();
            zrVar.free(bits);
            zrVar.free(bits2);
            snapshotArray.end();
            this.g = false;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
