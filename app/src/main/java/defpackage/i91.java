package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class i91 implements xv0 {
    public final Object a;
    public final List b;
    public final Lazy c;

    public i91(Unit unit) {
        unit.getClass();
        this.a = unit;
        this.b = CollectionsKt.emptyList();
        this.c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new c71(this, 2));
    }

    @Override // defpackage.l40
    public final Object deserialize(b20 b20Var) {
        int iDecodeElementIndex;
        b20Var.getClass();
        lw1 descriptor = getDescriptor();
        xt xtVarBeginStructure = b20Var.beginStructure(descriptor);
        if (!xtVarBeginStructure.decodeSequentially() && (iDecodeElementIndex = xtVarBeginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new uw1(i9.f(iDecodeElementIndex, "Unexpected index "));
        }
        Unit unit = Unit.INSTANCE;
        xtVarBeginStructure.endStructure(descriptor);
        return this.a;
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        return (lw1) this.c.getValue();
    }

    @Override // defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        obj.getClass();
        wf0Var.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }
}
