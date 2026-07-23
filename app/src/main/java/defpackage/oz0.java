package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oz0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LifecycleOwner b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ oz0(LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.b = lifecycleOwner;
        this.c = function1;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$8(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$8(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
