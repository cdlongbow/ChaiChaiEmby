package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic1 implements Function2 {
    public final /* synthetic */ MutableInteractionSource A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TextStyle g;
    public final /* synthetic */ TextFieldLabelPosition h;
    public final /* synthetic */ Function3 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ InputTransformation q;
    public final /* synthetic */ OutputTransformation r;
    public final /* synthetic */ KeyboardOptions s;
    public final /* synthetic */ KeyboardActionHandler t;
    public final /* synthetic */ TextFieldLineLimits u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ ScrollState w;
    public final /* synthetic */ Shape x;
    public final /* synthetic */ TextFieldColors y;
    public final /* synthetic */ PaddingValues z;

    public /* synthetic */ ic1(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function9, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4, int i5) {
        this.a = i5;
        this.b = textFieldState;
        this.c = modifier;
        this.d = z;
        this.e = z2;
        this.g = textStyle;
        this.h = textFieldLabelPosition;
        this.i = function3;
        this.j = function2;
        this.k = function4;
        this.l = function5;
        this.m = function6;
        this.n = function7;
        this.o = function8;
        this.p = z3;
        this.q = inputTransformation;
        this.r = outputTransformation;
        this.s = keyboardOptions;
        this.t = keyboardActionHandler;
        this.u = textFieldLineLimits;
        this.v = function9;
        this.w = scrollState;
        this.x = shape;
        this.y = textFieldColors;
        this.z = paddingValues;
        this.A = mutableInteractionSource;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return OutlinedTextFieldKt.OutlinedTextField$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldKt.TextField$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (Composer) obj, iIntValue2);
        }
    }
}
