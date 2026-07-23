package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b50 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ b50(Function1 function1, MutableState mutableState, int i) {
        this.a = i;
        this.b = function1;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke((jb2) this.c.getValue());
                break;
            default:
                this.b.invoke((String) this.c.getValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
