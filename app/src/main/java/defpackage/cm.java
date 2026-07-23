package defpackage;

import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cm implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ cm(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f, float f2, Shape shape, long j, int i, int i2) {
        this.j = bottomSheetDefaults;
        this.b = modifier;
        this.c = f;
        this.d = f2;
        this.g = shape;
        this.e = j;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BottomSheetDefaults.DragHandle_lgZ2HuY$lambda$2((BottomSheetDefaults) obj3, this.b, this.c, this.d, this.g, this.e, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowDefaults.PrimaryIndicator_10LGxhE$lambda$1((TabRowDefaults) obj3, this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ cm(TabRowDefaults tabRowDefaults, Modifier modifier, float f, float f2, long j, Shape shape, int i, int i2) {
        this.j = tabRowDefaults;
        this.b = modifier;
        this.c = f;
        this.d = f2;
        this.e = j;
        this.g = shape;
        this.h = i;
        this.i = i2;
    }
}
