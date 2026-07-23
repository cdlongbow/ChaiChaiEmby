package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ow0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ LazyListState c;
    public final /* synthetic */ PaddingValues d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ FlingBehavior g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ OverscrollEffect i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ow0(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z2, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.c = lazyListState;
        this.d = paddingValues;
        this.e = z;
        this.m = obj;
        this.n = obj2;
        this.g = flingBehavior;
        this.h = z2;
        this.i = overscrollEffect;
        this.j = function1;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LazyDslKt.LazyColumn$lambda$0(this.b, this.c, this.d, this.e, (Arrangement.Vertical) this.m, (Alignment.Horizontal) this.n, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LazyDslKt.LazyRow$lambda$0(this.b, this.c, this.d, this.e, (Arrangement.Horizontal) this.m, (Alignment.Vertical) this.n, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue2);
        }
    }
}
