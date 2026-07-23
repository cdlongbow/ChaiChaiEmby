package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dh b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ hh(dh dhVar, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = dhVar;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.c;
        dh dhVar = this.b;
        switch (i) {
            case 0:
                mutableState2.setValue(null);
                mutableState.setValue(dhVar.e);
                break;
            case 1:
                mutableState2.setValue(dhVar.a);
                mutableState.setValue(dhVar);
                break;
            default:
                mutableState2.setValue(dhVar.a);
                mutableState.setValue(dhVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
