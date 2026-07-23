package defpackage;

import androidx.compose.material3.NavigationItemKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Placeable i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Placeable l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ z71(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8, int i9) {
        this.a = i9;
        this.b = placeable;
        this.c = i;
        this.d = i2;
        this.e = placeable2;
        this.g = i3;
        this.h = i4;
        this.i = placeable3;
        this.j = i5;
        this.k = i6;
        this.l = placeable4;
        this.m = i7;
        this.n = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return NavigationItemKt.placeLabelAndTopIcon_qoqLrGI$lambda$37(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Placeable.PlacementScope) obj);
            default:
                return NavigationItemKt.placeLabelAndStartIcon_nru01g4$lambda$38(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Placeable.PlacementScope) obj);
        }
    }
}
