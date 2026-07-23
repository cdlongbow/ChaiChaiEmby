package defpackage;

import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c62 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function3 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ c62(int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function4, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = modifier;
        this.d = j;
        this.e = j2;
        this.g = function3;
        this.h = function2;
        this.i = function4;
        this.j = i2;
        this.k = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabRowKt.PrimaryTabRow_pAZo6Ak$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowKt.TabRow_pAZo6Ak$lambda$10(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TabRowKt.SecondaryTabRow_pAZo6Ak$lambda$1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue3);
        }
    }
}
