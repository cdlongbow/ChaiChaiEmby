package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SecureTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv1 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TextStyle e;
    public final /* synthetic */ TextFieldLabelPosition g;
    public final /* synthetic */ Function3 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ InputTransformation p;
    public final /* synthetic */ int q;
    public final /* synthetic */ char r;
    public final /* synthetic */ KeyboardOptions s;
    public final /* synthetic */ KeyboardActionHandler t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ Shape v;
    public final /* synthetic */ TextFieldColors w;
    public final /* synthetic */ PaddingValues x;
    public final /* synthetic */ MutableInteractionSource y;
    public final /* synthetic */ int z;

    public /* synthetic */ vv1(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function9, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, int i5, int i6) {
        this.a = i6;
        this.b = textFieldState;
        this.c = modifier;
        this.d = z;
        this.e = textStyle;
        this.g = textFieldLabelPosition;
        this.h = function3;
        this.i = function2;
        this.j = function4;
        this.k = function5;
        this.l = function6;
        this.m = function7;
        this.n = function8;
        this.o = z2;
        this.p = inputTransformation;
        this.q = i;
        this.r = c;
        this.s = keyboardOptions;
        this.t = keyboardActionHandler;
        this.u = function9;
        this.v = shape;
        this.w = textFieldColors;
        this.x = paddingValues;
        this.y = mutableInteractionSource;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        this.C = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SecureTextFieldKt.OutlinedSecureTextField_XvU6IwQ$lambda$5(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SecureTextFieldKt.SecureTextField_XvU6IwQ$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (Composer) obj, iIntValue2);
        }
    }
}
