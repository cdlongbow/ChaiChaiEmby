package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ PaddingValues g;
    public final /* synthetic */ WindowInsets h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ sb(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Function3 function3, int i, int i2) {
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.g = paddingValues;
        this.h = windowInsets;
        this.l = bottomAppBarScrollBehavior;
        this.i = function3;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.BottomAppBar_Snr_uVM$lambda$12(this.i, this.b, (Function2) this.l, this.c, this.d, this.e, this.g, this.h, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.BottomAppBar_e_3WI5M$lambda$15(this.b, this.c, this.d, this.e, this.g, this.h, (BottomAppBarScrollBehavior) this.l, this.i, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ sb(Function3 function3, Modifier modifier, Function2 function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, int i, int i2) {
        this.i = function3;
        this.b = modifier;
        this.l = function2;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.g = paddingValues;
        this.h = windowInsets;
        this.j = i;
        this.k = i2;
    }
}
