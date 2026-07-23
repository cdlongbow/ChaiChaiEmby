package defpackage;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.SnapshotArray;






/* JADX INFO: loaded from: classes4.dex */
public final class gp1 extends jg0 implements Pool.Poolable {
    public final /* synthetic */ hp1 j;

    public gp1(hp1 hp1Var) {
        this.j = hp1Var;
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public final void reset() {
        ReflectionPool reflectionPool;
        while (true) {
            Array array = this.g;
            int i = array.size;
            ri riVar = this.b;
            if (i <= 0) {
                ((SnapshotArray) this.a.b).clear();
                ((SnapshotArray) riVar.b).clear();
                this.c = false;
                this.d = false;
                return;
            }
            Class<?> cls = ((qr) array.get(0)).getClass();
            qr qrVar = (qr) ((Object[]) this.f.b)[es.b(cls).a];
            if (qrVar != null && c(cls)) {
                as asVar = this.e;
                if (asVar == null || !asVar.a.a.updating) {
                    riVar.k(this);
                } else {
                    yr yrVar = (yr) asVar.b.obtain();
                    yrVar.a = 2;
                    yrVar.b = this;
                    asVar.c.add(yrVar);
                }
            }
            if (qrVar != null && (reflectionPool = (ReflectionPool) this.j.componentPools.a.get(qrVar.getClass())) != null) {
                reflectionPool.free(qrVar);
            }
        }
    }
}
