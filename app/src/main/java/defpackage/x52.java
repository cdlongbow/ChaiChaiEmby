package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x52 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function3 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ ScrollState k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ x52(int i, Function3 function3, Modifier modifier, long j, long j2, float f, Function2 function2, Function2 function4, ScrollState scrollState, int i2, int i3) {
        this.a = 1;
        this.b = i;
        this.c = function3;
        this.d = modifier;
        this.e = j;
        this.g = j2;
        this.h = f;
        this.i = function2;
        this.j = function4;
        this.k = scrollState;
        this.l = i2;
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabRowKt.SecondaryScrollableTabRow_qhFBPw4$lambda$9(this.b, this.d, this.k, this.e, this.g, this.h, this.c, this.i, this.j, this.l, this.m, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                int i = this.b;
                Modifier modifier = this.d;
                ScrollState scrollState = this.k;
                long j = this.e;
                long j2 = this.g;
                float f = this.h;
                return TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$7(i, this.c, modifier, j, j2, f, this.i, this.j, scrollState, this.l, this.m, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TabRowKt.PrimaryScrollableTabRow_qhFBPw4$lambda$8(this.b, this.d, this.k, this.e, this.g, this.h, this.c, this.i, this.j, this.l, this.m, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ x52(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, Function2 function4, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.d = modifier;
        this.k = scrollState;
        this.e = j;
        this.g = j2;
        this.h = f;
        this.c = function3;
        this.i = function2;
        this.j = function4;
        this.l = i2;
        this.m = i3;
    }
}
