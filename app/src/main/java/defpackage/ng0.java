package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ng0 {
    private zf0 engine;
    public int priority = 0;
    private boolean processing = true;

    public final void addedToEngineInternal(zf0 zf0Var) {
        this.engine = zf0Var;
        addedToEngine(zf0Var);
    }

    public boolean checkProcessing() {
        return this.processing;
    }

    public zf0 getEngine() {
        return this.engine;
    }

    public abstract void removedFromEngine(zf0 zf0Var);

    public final void removedFromEngineInternal(zf0 zf0Var) {
        this.engine = null;
        removedFromEngine(zf0Var);
    }

    public void setProcessing(boolean z) {
        this.processing = z;
    }

    public void addedToEngine(zf0 zf0Var) {
    }

    public void update(float f) {
    }
}
