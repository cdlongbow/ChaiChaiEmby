package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ao0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ ao0(int i, MutableState mutableState, MutableState mutableState2) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                mutableState.setValue(CollectionsKt.emptyList());
                break;
            case 2:
                mutableState2.setValue(null);
                mutableState.setValue(null);
                break;
            case 3:
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    mutableState.setValue(null);
                }
                break;
            case 4:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit2 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 5:
                Boolean bool = Boolean.FALSE;
                mutableState2.setValue(bool);
                mutableState.setValue(bool);
                break;
            case 6:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 7:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(true);
                break;
            case 8:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 9:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(true);
                break;
            case 10:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 11:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 12:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 13:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 14:
                mutableState.setValue(Boolean.FALSE);
                gy1.B(mutableState2, true);
                break;
            case 15:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(true);
                break;
            case 16:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 17:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 18:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit3 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 19:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit4 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 20:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit5 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 21:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit6 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 22:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit7 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 23:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit8 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 24:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit9 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 25:
                mutableState.setValue(Boolean.FALSE);
                mutableState2.setValue(Boolean.TRUE);
                break;
            case 26:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit10 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 27:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit11 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 28:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit12 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                mutableState2.setValue(Boolean.FALSE);
                Unit unit13 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
