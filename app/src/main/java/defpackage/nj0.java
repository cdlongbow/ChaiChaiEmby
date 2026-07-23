package defpackage;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class nj0 implements DisposableEffectResult {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ nj0(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(Boolean.TRUE);
                break;
            default:
                function1.invoke(Boolean.FALSE);
                break;
        }
    }
}
