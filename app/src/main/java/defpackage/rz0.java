package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ LifecycleOwner e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ rz0(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = lifecycleOwner;
        this.g = function1;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }
}
