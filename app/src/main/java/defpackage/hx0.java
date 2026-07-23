package defpackage;

import androidx.compose.foundation.OverscrollEffect;
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
public final /* synthetic */ class hx0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ StaggeredGridCells b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ LazyStaggeredGridState d;
    public final /* synthetic */ PaddingValues e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ FlingBehavior i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ OverscrollEffect k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ hx0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = staggeredGridCells;
        this.c = modifier;
        this.d = lazyStaggeredGridState;
        this.e = paddingValues;
        this.g = z;
        this.h = f;
        this.p = horizontal;
        this.i = flingBehavior;
        this.j = z2;
        this.k = overscrollEffect;
        this.l = function1;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LazyStaggeredGridDslKt.LazyVerticalStaggeredGrid_6qCrX9Q$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, (Arrangement.Horizontal) this.p, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LazyStaggeredGridDslKt.LazyHorizontalStaggeredGrid_121YqSk$lambda$0(this.b, this.c, this.d, this.e, this.g, (Arrangement.Vertical) this.p, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ hx0(StaggeredGridCells staggeredGridCells, Modifier modifier, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, float f, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = staggeredGridCells;
        this.c = modifier;
        this.d = lazyStaggeredGridState;
        this.e = paddingValues;
        this.g = z;
        this.p = vertical;
        this.h = f;
        this.i = flingBehavior;
        this.j = z2;
        this.k = overscrollEffect;
        this.l = function1;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }
}
