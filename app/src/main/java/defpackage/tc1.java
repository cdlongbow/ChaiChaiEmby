package defpackage;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PagerState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ PaddingValues d;
    public final /* synthetic */ PageSize e;
    public final /* synthetic */ int g;
    public final /* synthetic */ float h;
    public final /* synthetic */ TargetedFlingBehavior i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ NestedScrollConnection m;
    public final /* synthetic */ SnapPosition n;
    public final /* synthetic */ OverscrollEffect o;
    public final /* synthetic */ Function4 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    public /* synthetic */ tc1(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Object obj, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, Function4 function4, int i2, int i3, int i4, int i5) {
        this.a = i5;
        this.b = pagerState;
        this.c = modifier;
        this.d = paddingValues;
        this.e = pageSize;
        this.g = i;
        this.h = f;
        this.t = obj;
        this.i = targetedFlingBehavior;
        this.j = z;
        this.k = z2;
        this.l = function1;
        this.m = nestedScrollConnection;
        this.n = snapPosition;
        this.o = overscrollEffect;
        this.p = function4;
        this.q = i2;
        this.r = i3;
        this.s = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return PagerKt.VerticalPager__8jOkeI$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, (Alignment.Horizontal) this.t, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return PagerKt.HorizontalPager__8jOkeI$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, (Alignment.Vertical) this.t, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, iIntValue2);
        }
    }
}
