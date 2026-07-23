package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qw0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ GridCells b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ LazyGridState d;
    public final /* synthetic */ PaddingValues e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Arrangement.Horizontal h;
    public final /* synthetic */ Arrangement.Vertical i;
    public final /* synthetic */ FlingBehavior j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ OverscrollEffect l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ qw0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = gridCells;
        this.c = modifier;
        this.d = lazyGridState;
        this.e = paddingValues;
        this.g = z;
        this.h = horizontal;
        this.i = vertical;
        this.j = flingBehavior;
        this.k = z2;
        this.l = overscrollEffect;
        this.m = function1;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                GridCells gridCells = this.b;
                Modifier modifier = this.c;
                LazyGridState lazyGridState = this.d;
                PaddingValues paddingValues = this.e;
                boolean z = this.g;
                Arrangement.Horizontal horizontal = this.h;
                return LazyGridDslKt.LazyVerticalGrid$lambda$0(gridCells, modifier, lazyGridState, paddingValues, z, this.i, horizontal, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LazyGridDslKt.LazyHorizontalGrid$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ qw0(GridCells gridCells, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.b = gridCells;
        this.c = modifier;
        this.d = lazyGridState;
        this.e = paddingValues;
        this.g = z;
        this.i = vertical;
        this.h = horizontal;
        this.j = flingBehavior;
        this.k = z2;
        this.l = overscrollEffect;
        this.m = function1;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }
}
