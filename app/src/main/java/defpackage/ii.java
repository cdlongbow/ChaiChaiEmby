package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.ServerIconEntry;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ii implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ ii(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.c;
        MutableState mutableState3 = this.b;
        switch (i) {
            case 0:
                mutableState3.setValue(null);
                mutableState2.setValue(SetsKt.emptySet());
                mutableState.setValue(null);
                break;
            case 1:
                Boolean bool = Boolean.TRUE;
                mutableState3.setValue(bool);
                mutableState2.setValue(null);
                mutableState.setValue(bool);
                break;
            case 2:
                Boolean bool2 = Boolean.FALSE;
                mutableState3.setValue(bool2);
                mutableState2.setValue(bool2);
                mutableState.setValue(null);
                break;
            case 3:
                bq0.h(mutableState3, mutableState2, mutableState);
                break;
            case 4:
                if (((rn0) mutableState3.getValue()) == rn0.a) {
                    bq0.k(mutableState2, false);
                    bq0.i(mutableState, true);
                }
                break;
            case 5:
                if (((rn0) mutableState3.getValue()) == rn0.a) {
                    bq0.k(mutableState2, true);
                    bq0.i(mutableState, true);
                }
                break;
            case 6:
                bq0.h(mutableState3, mutableState2, mutableState);
                break;
            case 7:
                Boolean bool3 = Boolean.FALSE;
                mutableState3.setValue(bool3);
                mutableState2.setValue(bool3);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 8:
                Boolean bool4 = Boolean.FALSE;
                mutableState3.setValue(bool4);
                mutableState2.setValue(bool4);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 9:
                if (!((Boolean) mutableState3.getValue()).booleanValue() && ((ServerIconEntry) mutableState2.getValue()) == null && !((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 10:
                if (!((Boolean) mutableState3.getValue()).booleanValue() && ((ServerIconEntry) mutableState2.getValue()) == null && !((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            default:
                Boolean bool5 = Boolean.FALSE;
                mutableState3.setValue(bool5);
                mutableState2.setValue(bool5);
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
