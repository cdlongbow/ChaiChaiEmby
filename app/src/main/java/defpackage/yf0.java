package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yf0 implements kg0 {
    public final /* synthetic */ zf0 a;

    public /* synthetic */ yf0(zf0 zf0Var) {
        this.a = zf0Var;
    }

    @Override // defpackage.kg0
    public void entityAdded(jg0 jg0Var) {
        this.a.addEntityInternal(jg0Var);
    }

    @Override // defpackage.kg0
    public void entityRemoved(jg0 jg0Var) {
        this.a.removeEntityInternal(jg0Var);
    }
}
