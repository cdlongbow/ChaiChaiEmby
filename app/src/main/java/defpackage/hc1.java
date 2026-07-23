package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc1 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ TextStyle h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ VisualTransformation q;
    public final /* synthetic */ KeyboardOptions r;
    public final /* synthetic */ KeyboardActions s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ MutableInteractionSource w;
    public final /* synthetic */ Shape x;
    public final /* synthetic */ TextFieldColors y;
    public final /* synthetic */ int z;

    public /* synthetic */ hc1(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, int i7) {
        this.a = i7;
        this.b = str;
        this.c = function1;
        this.d = modifier;
        this.e = z;
        this.g = z2;
        this.h = textStyle;
        this.i = function2;
        this.j = function3;
        this.k = function4;
        this.l = function5;
        this.m = function6;
        this.n = function7;
        this.o = function8;
        this.p = z3;
        this.q = visualTransformation;
        this.r = keyboardOptions;
        this.s = keyboardActions;
        this.t = z4;
        this.u = i;
        this.v = i2;
        this.w = mutableInteractionSource;
        this.x = shape;
        this.y = textFieldColors;
        this.z = i3;
        this.A = i4;
        this.B = i5;
        this.C = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return OutlinedTextFieldKt.OutlinedTextField$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldKt.TextField$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (Composer) obj, iIntValue2);
        }
    }
}
