package defpackage;

import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y52 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;

    public /* synthetic */ y52(Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function4, int i, int i2) {
        this.a = i2;
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = function3;
        this.g = function2;
        this.h = function4;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$6(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowKt.TabRowImpl_DTcfvLk$lambda$4(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }
}
