package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa1 b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ j4(sa1 sa1Var, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = sa1Var;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.c;
        sa1 sa1Var = this.b;
        t91 t91Var = (t91) obj;
        switch (i) {
            case 0:
                t91Var.getClass();
                sa1Var.a(t91Var);
                mutableState2.setValue(Boolean.FALSE);
                Unit unit = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 1:
                t91Var.getClass();
                sa1Var.a(t91Var);
                mutableState2.setValue(Boolean.FALSE);
                Unit unit2 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                t91Var.getClass();
                sa1Var.a(t91Var);
                mutableState2.setValue(Boolean.FALSE);
                Unit unit3 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
