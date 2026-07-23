package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object[] b;
    public final /* synthetic */ LifecycleOwner c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;

    public /* synthetic */ pz0(Object[] objArr, LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.b = objArr;
        this.c = lifecycleOwner;
        this.d = function1;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$7(this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$7(this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue2);
        }
    }
}
