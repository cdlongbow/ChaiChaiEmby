package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ Placeable j;
    public final /* synthetic */ int k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Placeable m;
    public final /* synthetic */ int n;
    public final /* synthetic */ float o;
    public final /* synthetic */ int p;
    public final /* synthetic */ MeasureScope q;

    public /* synthetic */ n71(Placeable placeable, boolean z, float f, Placeable placeable2, int i, float f2, float f3, Placeable placeable3, int i2, float f4, Placeable placeable4, int i3, float f5, int i4, MeasureScope measureScope, int i5) {
        this.a = i5;
        this.b = placeable;
        this.c = z;
        this.d = f;
        this.e = placeable2;
        this.g = i;
        this.h = f2;
        this.i = f3;
        this.j = placeable3;
        this.k = i2;
        this.l = f4;
        this.m = placeable4;
        this.n = i3;
        this.o = f5;
        this.p = i4;
        this.q = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return NavigationBarKt.placeLabelAndIcon_zUg2_y0$lambda$27(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Placeable.PlacementScope) obj);
            default:
                return NavigationRailKt.placeLabelAndIcon_zUg2_y0$lambda$22(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Placeable.PlacementScope) obj);
        }
    }
}
