package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q71 implements Function1 {
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

    public /* synthetic */ q71(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6) {
        this.a = 1;
        this.b = placeable;
        this.c = i;
        this.d = i2;
        this.e = placeable2;
        this.g = i3;
        this.h = i4;
        this.i = placeable3;
        this.j = i5;
        this.k = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Placeable placeable = this.b;
                int i = this.c;
                int i2 = this.d;
                Placeable placeable2 = this.e;
                int i3 = this.g;
                int i4 = this.h;
                return NavigationBarKt.placeIcon_X9ElhV4$lambda$25(placeable, placeable2, i, i2, this.i, i3, i4, this.j, this.k, (Placeable.PlacementScope) obj);
            case 1:
                return NavigationItemKt.placeIcon_X9ElhV4$lambda$36(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, (Placeable.PlacementScope) obj);
            default:
                Placeable placeable3 = this.b;
                int i5 = this.c;
                int i6 = this.d;
                Placeable placeable4 = this.e;
                int i7 = this.g;
                int i8 = this.h;
                return NavigationRailKt.placeIcon_X9ElhV4$lambda$20(placeable3, placeable4, i5, i6, this.i, i7, i8, this.j, this.k, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ q71(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6, int i7) {
        this.a = i7;
        this.b = placeable;
        this.e = placeable2;
        this.c = i;
        this.d = i2;
        this.i = placeable3;
        this.g = i3;
        this.h = i4;
        this.j = i5;
        this.k = i6;
    }
}
