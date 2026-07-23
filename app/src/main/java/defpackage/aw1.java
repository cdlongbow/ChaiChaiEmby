package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aw1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Function k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Function p;

    public /* synthetic */ aw1(RowScope rowScope, boolean z, Function function, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function3, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.o = rowScope;
        this.b = z;
        this.p = function;
        this.c = shape;
        this.d = modifier;
        this.e = z2;
        this.g = segmentedButtonColors;
        this.h = borderStroke;
        this.i = mutableInteractionSource;
        this.j = function2;
        this.k = function3;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SegmentedButton$lambda$7((SingleChoiceSegmentedButtonRowScope) this.o, this.b, (Function0) this.p, (Shape) this.c, this.d, this.e, (SegmentedButtonColors) this.g, (BorderStroke) this.h, (MutableInteractionSource) this.i, (Function2) this.j, (Function2) this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SegmentedButton$lambda$6((MultiChoiceSegmentedButtonRowScope) this.o, this.b, (Function1) this.p, (Shape) this.c, this.d, this.e, (SegmentedButtonColors) this.g, (BorderStroke) this.h, (MutableInteractionSource) this.i, (Function2) this.j, (Function2) this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.l | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.m);
                e92.b((String) this.o, (String) this.c, (Integer) this.g, (Function0) this.p, (Function0) this.h, (Function0) this.i, this.b, this.e, (FocusRequester) this.j, (Function1) this.k, this.d, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, this.n);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ aw1(String str, String str2, Integer num, Function0 function0, Function0 function1, Function0 function2, boolean z, boolean z2, FocusRequester focusRequester, Function1 function3, Modifier modifier, int i, int i2, int i3) {
        this.a = 2;
        this.o = str;
        this.c = str2;
        this.g = num;
        this.p = function0;
        this.h = function1;
        this.i = function2;
        this.b = z;
        this.e = z2;
        this.j = focusRequester;
        this.k = function3;
        this.d = modifier;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }
}
