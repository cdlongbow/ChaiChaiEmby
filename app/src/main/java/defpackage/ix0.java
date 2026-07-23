package defpackage;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ix0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ StaggeredGridCells b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ LazyStaggeredGridState d;
    public final /* synthetic */ PaddingValues e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ FlingBehavior i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ix0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, Function1 function1, int i, int i2) {
        this.b = staggeredGridCells;
        this.c = modifier;
        this.d = lazyStaggeredGridState;
        this.e = paddingValues;
        this.g = z;
        this.h = f;
        this.n = horizontal;
        this.i = flingBehavior;
        this.j = z2;
        this.k = function1;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LazyStaggeredGridDslKt.LazyHorizontalStaggeredGrid_cJHQLPU$lambda$0(this.b, this.c, this.d, this.e, this.g, (Arrangement.Vertical) this.n, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LazyStaggeredGridDslKt.LazyVerticalStaggeredGrid_zadm560$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, (Arrangement.Horizontal) this.n, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ ix0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, Function1 function1, int i, int i2) {
        this.b = staggeredGridCells;
        this.c = modifier;
        this.d = lazyStaggeredGridState;
        this.e = paddingValues;
        this.g = z;
        this.n = vertical;
        this.h = f;
        this.i = flingBehavior;
        this.j = z2;
        this.k = function1;
        this.l = i;
        this.m = i2;
    }
}
