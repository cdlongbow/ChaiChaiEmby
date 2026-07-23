package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a62 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ ScrollState d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ a62(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, float f2, Function2 function4, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = modifier;
        this.d = scrollState;
        this.e = j;
        this.g = j2;
        this.h = f;
        this.i = function3;
        this.j = function2;
        this.k = f2;
        this.l = function4;
        this.m = i2;
        this.n = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabRowKt.PrimaryScrollableTabRow_cx2KkNY$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowKt.SecondaryScrollableTabRow_cx2KkNY$lambda$3(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
        }
    }
}
