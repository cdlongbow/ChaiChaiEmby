package defpackage;

import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class to0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ to0(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                return new op0(z, (zq0) obj2);
            default:
                return SliderKt.sliderSemantics$lambda$52(z, (SliderState) obj2, (SemanticsPropertyReceiver) obj);
        }
    }
}
