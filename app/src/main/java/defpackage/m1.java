package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ m1(w2 w2Var, MutableState mutableState, int i) {
        this.a = i;
        this.b = w2Var;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        r2 r2Var = r2.a;
        MutableState mutableState = this.c;
        w2 w2Var = this.b;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                w2Var.c.setValue(r2Var);
                break;
            default:
                mutableState.setValue(Boolean.FALSE);
                w2Var.c.setValue(r2Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
