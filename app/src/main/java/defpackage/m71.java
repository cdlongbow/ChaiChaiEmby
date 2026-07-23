package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m71 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int j;

    public /* synthetic */ m71(Function2 function2, Function2 function3, Function2 function4, Function2 function5, boolean z, Function0 function0, Function0 function1, int i, int i2) {
        this.a = i2;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = function5;
        this.g = z;
        this.h = function0;
        this.i = function1;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NavigationBarKt.NavigationBarItemLayout$lambda$23(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationRailKt.NavigationRailItemLayout$lambda$18(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, (Composer) obj, iIntValue2);
        }
    }
}
