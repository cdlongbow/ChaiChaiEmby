package defpackage;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wh1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih1 b;

    public /* synthetic */ wh1(ih1 ih1Var, int i) {
        this.a = i;
        this.b = ih1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ih1 ih1Var = this.b;
        switch (i) {
            case 0:
                ih1Var.a.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                MutableIntState mutableIntState = ih1Var.g;
                mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                return Unit.INSTANCE;
            case 2:
                ih1Var.d.setValue(null);
                return Unit.INSTANCE;
            case 3:
                ih1Var.f.setIntValue(0);
                return Unit.INSTANCE;
            case 4:
                ih1Var.g.setIntValue(0);
                return Unit.INSTANCE;
            case 5:
                return Boolean.valueOf(dn1.z0(ih1Var));
            default:
                Boolean bool = (Boolean) ih1Var.b.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
