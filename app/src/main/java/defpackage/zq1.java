package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zq1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ zq1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.valueOf(!gr1.d(mutableState)));
                return Unit.INSTANCE;
            case 1:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                mutableState.setValue(Boolean.valueOf(!gr1.e(mutableState)));
                return Unit.INSTANCE;
            case 3:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 4:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 5:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 7:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 9:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 10:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 16:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 17:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 18:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 19:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 20:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 21:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 22:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 23:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 24:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 25:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 26:
                return (yy1) mutableState.getValue();
            case 27:
                return (yy1) mutableState.getValue();
            case 28:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            default:
                mutableState.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
