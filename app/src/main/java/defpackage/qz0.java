package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ LifecycleOwner d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ qz0(Object obj, Object obj2, LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = lifecycleOwner;
        this.e = function1;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$3(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$3(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }
}
