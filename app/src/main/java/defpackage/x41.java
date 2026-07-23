package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x41 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ SheetState d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ ModalBottomSheetProperties m;
    public final /* synthetic */ Function3 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public /* synthetic */ x41(Function0 function0, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, Function2 function2, Object obj, ModalBottomSheetProperties modalBottomSheetProperties, Function3 function3, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = function0;
        this.c = modifier;
        this.d = sheetState;
        this.e = f;
        this.g = shape;
        this.h = j;
        this.i = j2;
        this.j = f2;
        this.k = j3;
        this.l = function2;
        this.r = obj;
        this.m = modalBottomSheetProperties;
        this.n = function3;
        this.o = i;
        this.p = i2;
        this.q = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ModalBottomSheetKt.ModalBottomSheet_dYc4hso$lambda$14(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, (Function2) this.r, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ModalBottomSheet_androidKt.ModalBottomSheet_dYc4hso$lambda$0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, (WindowInsets) this.r, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iIntValue2);
        }
    }
}
