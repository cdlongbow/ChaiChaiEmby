package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ o5(Function0 function0, MutableState mutableState, int i) {
        this.a = i;
        this.b = function0;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.c;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 1:
                mutableState.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 2:
                mutableState.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 3:
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
            case 4:
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    function0.invoke();
                }
                break;
            case 5:
                jg1.c(mutableState, false);
                function0.invoke();
                break;
            case 6:
                mutableState.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 7:
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.FALSE);
                } else {
                    function0.invoke();
                }
                break;
            default:
                function0.invoke();
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
