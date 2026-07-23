package defpackage;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h50 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableIntState b;

    public /* synthetic */ h50(MutableIntState mutableIntState, int i) {
        this.a = i;
        this.b = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableIntState mutableIntState = this.b;
        switch (i) {
            case 0:
                mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                return Unit.INSTANCE;
            case 1:
                mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                return Unit.INSTANCE;
            case 2:
                mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                return Unit.INSTANCE;
            default:
                return Integer.valueOf(mutableIntState.getIntValue());
        }
    }
}
