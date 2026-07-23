package defpackage;
import com.badlogic.gdx.utils.Bits;
import com.badlogic.gdx.utils.SnapshotArray;
import com.badlogic.gdx.utils.ObjectSet;
import com.badlogic.gdx.utils.ObjectMap;






import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zf0 {
    private static ri0 empty;
    private as componentOperationHandler;
    private mg0 entityManager;
    private ti0 familyManager;
    private r52 systemManager;
    private boolean updating;
    private final g01 componentAdded = new xf0(this);
    private final g01 componentRemoved = new xf0(this);

    static {
        rr0 rr0Var = ri0.g;
        rr0Var.getClass();
        Bits bits = ri0.h;
        rr0Var.b = bits;
        rr0Var.c = bits;
        rr0Var.d = bits;
        rr0Var.b = es.a(new Class[0]);
        empty = rr0Var.a();
    }

    public zf0() {
        yf0 yf0Var = new yf0(this);
        r52 r52Var = new r52();
        r52Var.a = new k00(16);
        Array array = new Array(true, 16);
        r52Var.b = array;
        r52Var.c = new qs0(array);
        r52Var.d = new ObjectMap();
        r52Var.e = yf0Var;
        this.systemManager = r52Var;
        yf0 yf0Var2 = new yf0(this);
        mg0 mg0Var = new mg0();
        Array array2 = new Array(false, 16);
        mg0Var.b = array2;
        mg0Var.c = new ObjectSet();
        mg0Var.d = new qs0(array2);
        mg0Var.e = new Array(false, 16);
        mg0Var.f = new zr(1);
        mg0Var.a = yf0Var2;
        this.entityManager = mg0Var;
        yf0 yf0Var3 = new yf0(this);
        as asVar = new as();
        asVar.b = new zr(0);
        asVar.c = new Array();
        asVar.a = yf0Var3;
        this.componentOperationHandler = asVar;
        qs0 qs0Var = this.entityManager.d;
        ti0 ti0Var = new ti0();
        ti0Var.b = new ObjectMap();
        ti0Var.c = new ObjectMap();
        ti0Var.d = new SnapshotArray(true, 16);
        ti0Var.e = new ObjectMap();
        ti0Var.f = new zr(2);
        ti0Var.g = false;
        ti0Var.a = qs0Var;
        this.familyManager = ti0Var;
    }

    public void addEntity(jg0 jg0Var) {
        boolean z = this.updating || this.familyManager.g;
        mg0 mg0Var = this.entityManager;
        if (!z) {
            mg0Var.a(jg0Var);
            return;
        }
        lg0 lg0Var = (lg0) mg0Var.f.obtain();
        lg0Var.b = jg0Var;
        lg0Var.a = 1;
        mg0Var.e.add(lg0Var);
    }

    public void addEntityInternal(jg0 jg0Var) {
        ri riVar = jg0Var.a;
        ((SnapshotArray) riVar.b).add(this.componentAdded);
        ri riVar2 = jg0Var.b;
        ((SnapshotArray) riVar2.b).add(this.componentRemoved);
        jg0Var.e = this.componentOperationHandler;
        this.familyManager.b(jg0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addEntityListener(ri0 ri0Var, int i, kg0 kg0Var) {
        ti0 ti0Var = this.familyManager;
        ObjectMap objectMap = ti0Var.e;
        SnapshotArray snapshotArray = ti0Var.d;
        ti0Var.a(ri0Var);
        int i2 = 0;
        while (i2 < snapshotArray.size && ((si0) snapshotArray.get(i2)).b <= i) {
            i2++;
        }
        ObjectMap.Values it = objectMap.values().iterator();
        while (it.hasNext()) {
            Bits bits = (Bits) it.next();
            for (int length = bits.length(); length > i2; length--) {
                if (bits.get(length - 1)) {
                    bits.set(length);
                } else {
                    bits.clear(length);
                }
            }
            bits.clear(i2);
        }
        ((Bits) objectMap.get(ri0Var)).set(i2);
        si0 si0Var = new si0();
        si0Var.a = kg0Var;
        si0Var.b = i;
        snapshotArray.insert(i2, si0Var);
    }

    public void addSystem(ng0 ng0Var) {
        r52 r52Var = this.systemManager;
        Array array = r52Var.b;
        yf0 yf0Var = r52Var.e;
        Class<?> cls = ng0Var.getClass();
        ObjectMap objectMap = r52Var.d;
        ng0 ng0Var2 = (ng0) objectMap.get(cls);
        if (ng0Var2 != null && r52Var.b.removeValue(ng0Var2, true)) {
            objectMap.remove(ng0Var2.getClass());
            ng0Var2.removedFromEngineInternal(yf0Var.a);
        }
        array.add(ng0Var);
        objectMap.put(cls, ng0Var);
        array.sort(r52Var.a);
        ng0Var.addedToEngineInternal(yf0Var.a);
    }

    public abstract qr createComponent(Class cls);

    public abstract jg0 createEntity();

    public qs0 getEntities() {
        return this.entityManager.d;
    }

    public qs0 getEntitiesFor(ri0 ri0Var) {
        return this.familyManager.a(ri0Var);
    }

    public <T extends ng0> T getSystem(Class<T> cls) {
        return (T) this.systemManager.d.get(cls);
    }

    public qs0 getSystems() {
        return this.systemManager.c;
    }

    public void removeAllEntities() {
        boolean z = this.updating || this.familyManager.g;
        mg0 mg0Var = this.entityManager;
        Array array = mg0Var.b;
        if (!z) {
            while (array.size > 0) {
                mg0Var.c((jg0) array.first());
            }
            return;
        }
        Iterator it = array.iterator();
        while (it.hasNext()) {
            ((jg0) it.next()).c = true;
        }
        lg0 lg0Var = (lg0) mg0Var.f.obtain();
        lg0Var.a = 3;
        mg0Var.e.add(lg0Var);
    }

    public void removeEntity(jg0 jg0Var) {
        boolean z = this.updating || this.familyManager.g;
        mg0 mg0Var = this.entityManager;
        if (!z) {
            mg0Var.c(jg0Var);
            return;
        }
        mg0Var.getClass();
        if (jg0Var.c) {
            return;
        }
        jg0Var.c = true;
        lg0 lg0Var = (lg0) mg0Var.f.obtain();
        lg0Var.b = jg0Var;
        lg0Var.a = 2;
        mg0Var.e.add(lg0Var);
    }

    public void removeEntityInternal(jg0 jg0Var) {
        this.familyManager.b(jg0Var);
        ri riVar = jg0Var.a;
        ((SnapshotArray) riVar.b).removeValue(this.componentAdded, true);
        ri riVar2 = jg0Var.b;
        ((SnapshotArray) riVar2.b).removeValue(this.componentRemoved, true);
        jg0Var.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeEntityListener(kg0 kg0Var) {
        ti0 ti0Var = this.familyManager;
        SnapshotArray snapshotArray = ti0Var.d;
        int i = 0;
        while (i < snapshotArray.size) {
            if (((si0) snapshotArray.get(i)).a == kg0Var) {
                ObjectMap.Values it = ti0Var.e.values().iterator();
                while (it.hasNext()) {
                    Bits bits = (Bits) it.next();
                    int length = bits.length();
                    int i2 = i;
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        if (bits.get(i3)) {
                            bits.set(i2);
                        } else {
                            bits.clear(i2);
                        }
                        i2 = i3;
                    }
                }
                snapshotArray.removeIndex(i);
                i--;
            }
            i++;
        }
    }

    public void removeSystem(ng0 ng0Var) {
        r52 r52Var = this.systemManager;
        if (r52Var.b.removeValue(ng0Var, true)) {
            r52Var.d.remove(ng0Var.getClass());
            ng0Var.removedFromEngineInternal(r52Var.e.a);
        }
    }

    public void update(float f) {
        Array array;
        if (this.updating) {
            rd1.o("Cannot call update() on an Engine that is already updating.");
            return;
        }
        this.updating = true;
        qs0 qs0Var = this.systemManager.c;
        int i = 0;
        while (true) {
            try {
                Array array2 = qs0Var.a;
                if (i >= array2.size) {
                    this.updating = false;
                    return;
                }
                ng0 ng0Var = (ng0) array2.get(i);
                if (ng0Var.checkProcessing()) {
                    ng0Var.update(f);
                }
                as asVar = this.componentOperationHandler;
                int i2 = 0;
                while (true) {
                    array = asVar.c;
                    if (i2 >= array.size) {
                        break;
                    }
                    yr yrVar = (yr) array.get(i2);
                    int iD = w11.D(yrVar.a);
                    if (iD == 0) {
                        jg0 jg0Var = yrVar.b;
                        jg0Var.a.k(jg0Var);
                    } else if (iD == 1) {
                        jg0 jg0Var2 = yrVar.b;
                        jg0Var2.b.k(jg0Var2);
                    }
                    asVar.b.free(yrVar);
                    i2++;
                }
                array.clear();
                this.entityManager.b();
                i++;
            } catch (Throwable th) {
                this.updating = false;
                throw th;
            }
        }
    }

    public void addEntityListener(int i, kg0 kg0Var) {
        addEntityListener(empty, i, kg0Var);
    }

    public void addEntityListener(ri0 ri0Var, kg0 kg0Var) {
        addEntityListener(ri0Var, 0, kg0Var);
    }

    public void addEntityListener(kg0 kg0Var) {
        addEntityListener(empty, 0, kg0Var);
    }
}
