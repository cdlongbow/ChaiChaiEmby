package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TextStyle g;
    public final /* synthetic */ KeyboardOptions h;
    public final /* synthetic */ KeyboardActions i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ VisualTransformation l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ MutableInteractionSource n;
    public final /* synthetic */ Brush o;
    public final /* synthetic */ Function3 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    public /* synthetic */ ak(Object obj, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function2, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, int i2, int i3, int i4, int i5) {
        this.a = i5;
        this.t = obj;
        this.b = function1;
        this.c = modifier;
        this.d = z;
        this.e = z2;
        this.g = textStyle;
        this.h = keyboardOptions;
        this.i = keyboardActions;
        this.j = z3;
        this.k = i;
        this.l = visualTransformation;
        this.m = function2;
        this.n = mutableInteractionSource;
        this.o = brush;
        this.p = function3;
        this.q = i2;
        this.r = i3;
        this.s = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTextFieldKt.BasicTextField$lambda$34((TextFieldValue) this.t, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTextFieldKt.BasicTextField$lambda$31((String) this.t, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, iIntValue2);
        }
    }
}
