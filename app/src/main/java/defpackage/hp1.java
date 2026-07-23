package defpackage;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.ObjectMap;





/* JADX INFO: loaded from: classes4.dex */
public abstract class hp1 extends zf0 {
    private ep1 componentPools;
    private fp1 entityPool = new fp1(this);

    public hp1() {
        ep1 ep1Var = new ep1();
        ep1Var.a = new ObjectMap();
        ep1Var.b = 200;
        ep1Var.c = 1500;
        this.componentPools = ep1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void clearPools() {
        this.entityPool.clear();
        ObjectMap.Values it = this.componentPools.a.values().iterator();
        while (it.hasNext()) {
            ((Pool) it.next()).clear();
        }
    }

    @Override // defpackage.zf0
    public <T extends qr> T createComponent(Class<T> cls) {
        ep1 ep1Var = this.componentPools;
        ObjectMap objectMap = ep1Var.a;
        ReflectionPool reflectionPool = (ReflectionPool) objectMap.get(cls);
        if (reflectionPool == null) {
            reflectionPool = new ReflectionPool(cls, ep1Var.b, ep1Var.c);
            objectMap.put(cls, reflectionPool);
        }
        return (T) reflectionPool.obtain();
    }

    @Override // defpackage.zf0
    public jg0 createEntity() {
        return (jg0) this.entityPool.obtain();
    }

    @Override // defpackage.zf0
    public void removeEntityInternal(jg0 jg0Var) {
        super.removeEntityInternal(jg0Var);
        if (jg0Var instanceof gp1) {
            this.entityPool.free((gp1) jg0Var);
        }
    }
}
