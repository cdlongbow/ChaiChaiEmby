package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wx1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ wx1(int i, MutableState mutableState, MutableState mutableState2) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.c;
        MutableState mutableState2 = this.b;
        switch (i) {
            case 0:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 1:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit2 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 2:
                mutableState2.setValue(Boolean.FALSE);
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit3 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
