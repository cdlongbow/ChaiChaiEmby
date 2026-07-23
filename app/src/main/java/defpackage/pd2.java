package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pd2 implements xv0 {
    public static final pd2 b = new pd2();
    public final /* synthetic */ i91 a = new i91(Unit.INSTANCE);

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        this.a.deserialize(b20Var);
        return Unit.INSTANCE;
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        this.a.serialize(wf0Var, unit);
    }
}
