package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ListItemColors;
import androidx.compose.material3.ListItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b01 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ b01(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i, int i2) {
        this.i = searchBarState;
        this.b = function2;
        this.c = modifier;
        this.j = shape;
        this.k = searchBarColors;
        this.d = f;
        this.e = f2;
        this.l = windowInsets;
        this.m = searchBarScrollBehavior;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ListItemKt.ListItem_HXNGIdc$lambda$6(this.b, this.c, (Function2) this.i, (Function2) this.j, (Function2) this.k, (Function2) this.l, (ListItemColors) this.m, this.d, this.e, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SearchBarKt.TopSearchBar_qKj4JfE$lambda$5((SearchBarState) this.i, this.b, this.c, (Shape) this.j, (SearchBarColors) this.k, this.d, this.e, (WindowInsets) this.l, (SearchBarScrollBehavior) this.m, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ b01(Function2 function2, Modifier modifier, Function2 function3, Function2 function4, Function2 function5, Function2 function6, ListItemColors listItemColors, float f, float f2, int i, int i2) {
        this.b = function2;
        this.c = modifier;
        this.i = function3;
        this.j = function4;
        this.k = function5;
        this.l = function6;
        this.m = listItemColors;
        this.d = f;
        this.e = f2;
        this.g = i;
        this.h = i2;
    }
}
