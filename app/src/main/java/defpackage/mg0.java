package defpackage;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectSet;




/* JADX INFO: loaded from: classes4.dex */
public final class mg0 {
    public yf0 a;
    public Array b;
    public ObjectSet c;
    public qs0 d;
    public Array e;
    public zr f;

    public final void a(jg0 jg0Var) {
        ObjectSet objectSet = this.c;
        if (objectSet.contains(jg0Var)) {
            xc0.o("Entity is already registered ", jg0Var);
            return;
        }
        this.b.add(jg0Var);
        objectSet.add(jg0Var);
        this.a.entityAdded(jg0Var);
    }

    public final void b() {
        int i = 0;
        while (true) {
            Array array = this.e;
            if (i >= array.size) {
                array.clear();
                return;
            }
            lg0 lg0Var = (lg0) array.get(i);
            int iD = w11.D(lg0Var.a);
            if (iD == 0) {
                a(lg0Var.b);
            } else if (iD == 1) {
                c(lg0Var.b);
            } else if (iD != 2) {
                lm.d("Unexpected EntityOperation type");
                return;
            } else {
                while (true) {
                    Array array2 = this.b;
                    if (array2.size > 0) {
                        c((jg0) array2.first());
                    }
                }
            }
            this.f.free(lg0Var);
            i++;
        }
    }

    public final void c(jg0 jg0Var) {
        if (this.c.remove(jg0Var)) {
            jg0Var.c = false;
            jg0Var.d = true;
            this.b.removeValue(jg0Var, true);
            this.a.entityRemoved(jg0Var);
            jg0Var.d = false;
        }
    }
}
