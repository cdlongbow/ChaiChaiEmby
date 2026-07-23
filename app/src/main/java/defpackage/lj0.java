package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class lj0 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;

    public lj0(MutableState mutableState, boolean z) {
        this.a = z;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (this.a && zBooleanValue) {
            this.b.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
